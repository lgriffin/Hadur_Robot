#!/usr/bin/env python3
"""BENCH-292: which mover drove us when each bullet hit us, over a whole-field trace.

  python3 driver_census.py WORK_DIR --ledger field-ledger.tsv --table ShieldTableData.java --arm c
                           --out census.md --out-tsv census.tsv --ram-out ram-wait.tsv

Reads WORK_DIR/battles/*-<arm>/hadur.log (truth logs on). Every HF record (a bullet that hit us) is put in the
first class that fits it:
  surf          the surf published a plan on the hitting wave (HF planOffset not NaN)
  after_ram     our endgame state was ram (we were ramming a disabled enemy)
  finish        our endgame state was finish (the finishing approach)
  rammer        a rammer-policy round (a ram-trial or ram-escape record that round)
  shield        a shield round (an SH on record that round)
  mirror        a mirror round (a P mirror record that round)
  stop_go       the opponent carries a stop-and-go table line (stopGos or stopGoShifts), which drives without a plan
  other         none of these
The endgame state is the one in force at the hit's tick. Bands are by our score share against the robot in the trace
itself (WORK_DIR/arms.tsv, the --arm rows), so they match the traced release; --ledger (hadur column) fills robots the
trace has no score for. Bands: under 70, 70-90, 90-95, 95 and over.

--ram-out writes the ram-wait candidates: robots whose share of hits taken after the ram is --min-share percent
or more on --min-hits HF records or more, less those already on the ramWaits list.
"""
import argparse
import collections
import glob
import os
import re

CLASSES = ["surf", "after_ram", "finish", "rammer", "shield", "mirror", "stop_go", "other"]
BANDS = ["<70", "70-90", "90-95", "95+", "unknown"]


def slug(name):
    return re.sub(r"[^A-Za-z0-9.]+", "_", name.strip())


def table_list(src, method):
    m = re.search(r"static String\[\] %s\(\) \{(.*?)\n    \}" % method, src, re.S)
    return {slug(n) for n in re.findall(r'"([^"]+)"', m.group(1))} if m else set()


def band(score):
    if score is None:
        return "unknown"
    return "<70" if score < 70 else "70-90" if score < 90 else "90-95" if score < 95 else "95+"


def trace_scores(work, arm):
    """Our mean score share (percent) against each opponent in the trace's own arms.tsv, or {} without one."""
    path = os.path.join(work, "arms.tsv")
    if not os.path.exists(path):
        return {}
    tot = collections.defaultdict(list)
    with open(path) as f:
        head = f.readline().rstrip("\n").split("\t")
        ai, oi, si = head.index("arm"), head.index("opponent"), head.index("score_share")
        for line in f:
            p = line.rstrip("\n").split("\t")
            try:
                if p[ai] == arm:
                    tot[slug(p[oi])].append(100.0 * float(p[si]))
            except (ValueError, IndexError):
                pass
    return {k: sum(v) / len(v) for k, v in tot.items() if v}


def ledger_scores(path):
    scores = {}
    if not path or not os.path.exists(path):
        return scores
    with open(path) as f:
        head = f.readline().rstrip("\n").split("\t")
        ni, si = head.index("name"), head.index("hadur")
        for line in f:
            p = line.rstrip("\n").split("\t")
            try:
                scores[slug(p[ni])] = float(p[si])
            except (ValueError, IndexError):
                pass
    return scores


def read_log(path, stop_go):
    """Counter of HF classes, plus (hits, hits after the ram) for the ram-wait list."""
    rows = []
    with open(path, errors="replace") as f:
        for line in f:
            p = line.rstrip("\n").split(",")
            if len(p) < 3:
                continue
            try:
                rows.append((int(p[0]), int(p[1]), p))
            except ValueError:
                pass
    shield, rammer, mirror = set(), set(), set()
    for rd, _, p in rows:
        if p[2] == "SH" and len(p) > 5 and p[5] == "on":
            shield.add(rd)
        elif p[2] == "P" and len(p) > 5 and p[5] in ("ram-trial", "ram-escape"):
            rammer.add(rd)
        elif p[2] == "P" and len(p) > 5 and p[5] == "mirror":
            mirror.add(rd)
    rows.sort(key=lambda r: (r[0], r[1], r[2][2] == "HF"))
    state, ram_start = {}, {}
    out = collections.Counter()
    hits = after = 0
    for rd, t, p in rows:
        if p[2] == "P" and len(p) > 8 and p[5] == "endgame":
            state[rd] = p[8]
            if p[8] == "ram" and rd not in ram_start:
                ram_start[rd] = t
            continue
        if p[2] != "HF" or len(p) < 13:
            continue
        hits += 1
        if rd in ram_start and t > ram_start[rd]:
            after += 1
        if p[12] not in ("NaN", "nan", ""):
            c = "surf"
        elif state.get(rd) == "ram":
            c = "after_ram"
        elif state.get(rd) == "finish":
            c = "finish"
        elif rd in rammer:
            c = "rammer"
        elif rd in shield:
            c = "shield"
        elif rd in mirror:
            c = "mirror"
        elif stop_go:
            c = "stop_go"
        else:
            c = "other"
        out[c] += 1
    return out, hits, after


def main():
    ap = argparse.ArgumentParser(description=__doc__.split("\n")[0])
    ap.add_argument("work")
    ap.add_argument("--arm", default="c")
    ap.add_argument("--ledger")
    ap.add_argument("--table", required=True)
    ap.add_argument("--out", required=True)
    ap.add_argument("--out-tsv")
    ap.add_argument("--ram-out")
    ap.add_argument("--min-share", type=float, default=20.0)
    ap.add_argument("--min-hits", type=int, default=20)
    a = ap.parse_args()
    battles = os.path.join(a.work, "battles")
    if not os.path.isdir(battles):
        raise SystemExit("driver_census: no battles under %s (the trace's work directory is gone)" % a.work)
    src = open(a.table).read()
    stop_go = table_list(src, "stopGos") | table_list(src, "stopGoShifts")
    ram_waits = table_list(src, "ramWaits")
    # Bands come from the trace's own scores, so they match the release it traced; the ledger only fills robots the
    # trace has no score for.
    scores = ledger_scores(a.ledger)
    scores.update(trace_scores(a.work, a.arm))
    per = collections.defaultdict(collections.Counter)
    ram = collections.defaultdict(lambda: [0, 0])
    logs = 0
    for d in sorted(glob.glob(os.path.join(battles, "*-" + a.arm))):
        p = os.path.join(d, "hadur.log")
        if not os.path.exists(p):
            continue
        robot = os.path.basename(d).rsplit("-", 2)[0]
        c, hits, after = read_log(p, robot in stop_go)
        per[robot].update(c)
        ram[robot][0] += hits
        ram[robot][1] += after
        logs += 1
    if not logs:
        raise SystemExit("driver_census: no hadur.log in %s/*-%s (truth logs off?)" % (battles, a.arm))
    by_band = collections.defaultdict(collections.Counter)
    robots = collections.Counter()
    for r, c in per.items():
        b = band(scores.get(r))
        by_band[b].update(c)
        by_band["all"].update(c)
        robots[b] += 1
        robots["all"] += 1
    with open(a.out, "w") as f:
        f.write("# Driver census: which mover drove us when we were hit\n\n")
        f.write("Trace `%s`, arm `%s`, %d battle logs, %d robots. Percent of the hits on us in each band "
                "(band by our score in this trace).\n\n" % (a.work, a.arm, logs, len(per)))
        f.write("| Band | Robots | Hits | " + " | ".join(CLASSES) + " |\n|---|---:|---:|" + "---:|" * len(CLASSES) + "\n")
        for b in BANDS + ["all"]:
            c = by_band[b]
            n = sum(c.values())
            if n:
                f.write("| %s | %d | %d | %s |\n" % (b, robots[b], n,
                                                     " | ".join("%.1f" % (100.0 * c[k] / n) for k in CLASSES)))
        f.write("\nClasses: surf (a plan on the hitting wave), after_ram (our endgame ram), finish (the finishing "
                "approach), rammer (rammer-policy round), shield (shield round), mirror (mirror round), stop_go "
                "(a stop-and-go table line), other.\n")
    if a.out_tsv:
        with open(a.out_tsv, "w") as f:
            f.write("robot\tband\thits\t" + "\t".join(CLASSES) + "\n")
            for r in sorted(per, key=lambda r: -sum(per[r].values())):
                f.write("%s\t%s\t%d\t%s\n" % (r, band(scores.get(r)), sum(per[r].values()),
                                              "\t".join(str(per[r][k]) for k in CLASSES)))
    if a.ram_out:
        with open(a.ram_out, "w") as f:
            f.write("robot\tband\thits\tafter_ram\tshare\n")
            rows = [(r, h, x) for r, (h, x) in ram.items()
                    if h >= a.min_hits and 100.0 * x / h >= a.min_share and r not in ram_waits]
            for r, h, x in sorted(rows, key=lambda t: -t[2] / t[1]):
                f.write("%s\t%s\t%d\t%d\t%.1f\n" % (r, band(scores.get(r)), h, x, 100.0 * x / h))
    print("driver_census: %d logs, %d robots" % (logs, len(per)))


if __name__ == "__main__":
    main()
