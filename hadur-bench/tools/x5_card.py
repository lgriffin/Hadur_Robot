#!/usr/bin/env python3
"""pc-x5 card helpers (BENCH-197): the pilot gate and the confirm build's lists.

  python3 tools/x5_card.py pilot ARMS.tsv --arm xr --names PANEL.txt --bar 2 --out PILOT.md --stop-file STOP
  python3 tools/x5_card.py lists PICK.tsv --x5-panel panel-x5.txt --ram-panel panel-rammers.txt \
      --x5-out X5.txt --rd-out RD.txt --abl-out ABL.txt --arms-out ARMS --version 3.21

pilot: per robot of PANEL (name | note | jar) the arm's mean score share minus the pooled c and aa mean, then the
mean over those robots; at or above --bar the card goes on, below it STOP is written and the screen skips. A robot
with no finished battle of the arm, c or aa fails the step (exit 2): a partial pilot decides nothing.
lists: splits the pick TSV (mode_table.py --out-tsv: robot in the first column) into the POW-16 names (on the
x5 panel) and the RAM-6 names (on the rammer panel), one name a line; writes the build-ablation.sh argument
for the lists that hold a name (x5list, rdlist) and the confirm arms file whose xr line names the jar that
build makes. Exits 1 when no pick is on either panel. Standard library only.
"""
import argparse
import csv
import statistics as st
import sys
from collections import defaultdict


def panel_names(path):
    out = []
    for line in open(path, encoding="utf-8"):
        line = line.strip()
        if line and not line.startswith("#") and "|" in line:
            out.append(line.split("|")[0].strip())
    return out


def shares(path):
    s = defaultdict(lambda: defaultdict(list))
    with open(path, newline="", encoding="utf-8") as fh:
        for r in csv.DictReader(fh, delimiter="\t"):
            if r.get("ok") == "true":
                s[r["opponent"]][r["arm"]].append(100.0 * float(r["score_share"]))
    return s


def pilot(a):
    s = shares(a.arms)
    rows, missing = [], []
    for name in panel_names(a.names):
        if not all(s[name].get(k) for k in (a.arm, "c", "aa")):
            missing.append(name)
            continue
        arm, ref = s[name][a.arm], s[name]["c"] + s[name]["aa"]
        rows.append((name, st.mean(arm) - st.mean(ref), len(arm), len(ref)))
    if missing:
        # An incomplete pilot is neither a GO nor a STOP: the step fails and the card halts for a rerun.
        print("pilot incomplete, no finished %s, c and aa battles for: %s" % (a.arm, ", ".join(missing)), file=sys.stderr)
        return 2
    mean = st.mean(r[1] for r in rows) if rows else float("nan")
    go = bool(rows) and mean >= a.bar
    lines = ["# pc-x5 pilot: %s against pooled c and aa on the pilot names" % a.arm, "",
             "Mean gain %.2f points over %d robots; bar %.1f: **%s**." % (mean, len(rows), a.bar,
                                                                           "GO, the screen runs" if go else "STOP, the screen skips"),
             "", "| Robot | Gain | n arm | n ref |", "|---|---:|---:|---:|"]
    lines += ["| %s | %+.2f | %d | %d |" % r for r in sorted(rows, key=lambda r: -r[1])]
    open(a.out, "w", encoding="utf-8").write("\n".join(lines) + "\n")
    print(lines[2])
    if not go:
        open(a.stop_file, "w", encoding="utf-8").write("pilot below the bar\n")
    return 0


def lists(a):
    picks = []
    for line in open(a.pick, encoding="utf-8"):
        if line.strip() and not line.startswith("#"):
            picks.append(line.split("\t")[0].strip())
    x5set, ramset = set(panel_names(a.x5_panel)), set(panel_names(a.ram_panel))
    x5 = [p for p in picks if p in x5set]
    rd = [p for p in picks if p in ramset]
    open(a.x5_out, "w", encoding="utf-8").write("".join(n + "\n" for n in x5))
    open(a.rd_out, "w", encoding="utf-8").write("".join(n + "\n" for n in rd))
    abl = [k for k, v in (("x5list", x5), ("rdlist", rd)) if v]
    if not abl:
        print("no pick on either panel", file=sys.stderr)
        return 1
    suffix = "".join({"x5list": "x5", "rdlist": "rd"}[k] for k in abl)
    open(a.abl_out, "w", encoding="utf-8").write(",".join(abl) + "\n")
    v = a.version
    open(a.arms_out, "w", encoding="utf-8").write(
        "# pc-x5 confirm (BENCH-197): c master, aa its A/A copy, xr POW-16 and RAM-6 on the screen's picks only.\n"
        "c | hadur117.Hadur %s | bisect/hadur117.Hadur_%s.jar\n"
        "aa | hadur117.Hadur %saa | bisect/hadur117.Hadur_%saa.jar\n"
        "xr | hadur117.Hadur %s%s | bisect/hadur117.Hadur_%s%s.jar\n" % (v, v, v, v, v, suffix, v, suffix))
    print("%d POW-16 picks, %d RAM-6 picks: %s" % (len(x5), len(rd), ",".join(abl)))
    return 0


def main(argv=None):
    ap = argparse.ArgumentParser()
    sub = ap.add_subparsers(dest="cmd", required=True)
    p = sub.add_parser("pilot")
    p.add_argument("arms")
    p.add_argument("--arm", default="xr")
    p.add_argument("--names", required=True)
    p.add_argument("--bar", type=float, default=2.0)
    p.add_argument("--out", required=True)
    p.add_argument("--stop-file", required=True)
    q = sub.add_parser("lists")
    q.add_argument("pick")
    q.add_argument("--x5-panel", required=True)
    q.add_argument("--ram-panel", required=True)
    q.add_argument("--x5-out", required=True)
    q.add_argument("--rd-out", required=True)
    q.add_argument("--abl-out", required=True)
    q.add_argument("--arms-out", required=True)
    q.add_argument("--version", required=True)
    a = ap.parse_args(argv)
    return pilot(a) if a.cmd == "pilot" else lists(a)


if __name__ == "__main__":
    sys.exit(main())
