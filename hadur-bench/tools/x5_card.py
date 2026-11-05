#!/usr/bin/env python3
"""pc-x5-field card helpers (BENCH-197): the pilot gate and the confirm build's lists.

  python3 tools/x5_card.py pilot ARMS.tsv --names PILOT.txt --check x5=panel-x5.txt@2 --check rd=panel-rammers.txt@1 \
      [--ref c] --out PILOT.md --stop-file STOP
  python3 tools/x5_card.py lists PICK.tsv [--x5-arm x5] [--rd-arm rd] --x5-out X5.txt --rd-out RD.txt \
      --abl-out ABL.txt --arms-out ARMS --version 3.21

pilot: each --check ARM=MEMBERS@BAR takes the PILOT robots (name | note | jar) that MEMBERS also lists and their mean
of the arm's score share minus the reference arms' (--ref, comma separated, pooled). The card goes on when any check
reaches its bar; when none does, STOP is written and the screen skips. A checked robot with no finished battle of the
arm or a reference arm fails the step (exit 2): a partial pilot decides nothing.
lists: splits the pick TSV (mode_table.py --out-tsv: robot, then the arm that won it) into the POW-16 names (picked
by the x5 arm) and the RAM-6 names (picked by the rd arm), one name a line; writes the build-ablation.sh argument for
the lists that hold a name (x5list, rdlist) and the confirm arms file whose xr line names the jar that build makes.
Exits 1 when no robot picked either arm. Standard library only.
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
    """One check per ARM=MEMBERS@BAR: the arm's mean gain over the reference arms on the pilot robots that MEMBERS
    lists. GO when any check reaches its bar; STOP when none does; exit 2 when a checked robot lacks battles."""
    s = shares(a.arms)
    pilot_names = panel_names(a.names)
    refs = a.ref.split(",")
    sections, missing, go = [], [], False
    for chk in a.check:
        arm, rest = chk.split("=", 1)
        members, bar = rest.rsplit("@", 1)
        bar = float(bar)
        inside = set(panel_names(members))
        rows = []
        for name in (n for n in pilot_names if n in inside):
            if not all(s[name].get(k) for k in [arm] + refs):
                missing.append("%s (%s)" % (name, arm))
                continue
            got, ref = s[name][arm], [x for k in refs for x in s[name][k]]
            rows.append((name, st.mean(got) - st.mean(ref), len(got), len(ref)))
        mean = st.mean(r[1] for r in rows) if rows else float("nan")
        ok = bool(rows) and mean >= bar
        go = go or ok
        sections.append((arm, members, bar, mean, ok, rows))
    if missing:
        # An incomplete pilot is neither a GO nor a STOP: the step fails and the card halts for a rerun.
        print("pilot incomplete, no finished battles for: %s" % ", ".join(missing), file=sys.stderr)
        return 2
    lines = ["# pc-x5-field pilot against %s" % " and ".join(refs), "",
             "**%s**" % ("GO, the screen runs" if go else "STOP, the screen skips"), ""]
    for arm, members, bar, mean, ok, rows in sections:
        lines += ["## %s on the pilot robots in %s" % (arm, members), "",
                  "Mean gain %.2f points over %d robots; bar %.1f: %s." % (mean, len(rows), bar, "pass" if ok else "below"),
                  "", "| Robot | Gain | n arm | n ref |", "|---|---:|---:|---:|"]
        lines += ["| %s | %+.2f | %d | %d |" % r for r in sorted(rows, key=lambda r: -r[1])]
        lines.append("")
        print("%s: %+.2f over %d robots, bar %.1f, %s" % (arm, mean, len(rows), bar, "pass" if ok else "below"))
    open(a.out, "w", encoding="utf-8").write("\n".join(lines))
    if not go:
        open(a.stop_file, "w", encoding="utf-8").write("pilot below the bar\n")
    return 0


def lists(a):
    x5, rd = [], []
    for line in open(a.pick, encoding="utf-8"):
        if line.strip() and not line.startswith("#"):
            f = line.split("\t")
            {a.x5_arm: x5, a.rd_arm: rd}.get(f[1].strip(), []).append(f[0].strip())
    open(a.x5_out, "w", encoding="utf-8").write("".join(n + "\n" for n in x5))
    open(a.rd_out, "w", encoding="utf-8").write("".join(n + "\n" for n in rd))
    abl = [k for k, v in (("x5list", x5), ("rdlist", rd)) if v]
    if not abl:
        print("no robot picked either arm", file=sys.stderr)
        return 1
    suffix = "".join({"x5list": "x5", "rdlist": "rd"}[k] for k in abl)
    open(a.abl_out, "w", encoding="utf-8").write(",".join(abl) + "\n")
    v = a.version
    open(a.arms_out, "w", encoding="utf-8").write(
        "# pc-x5-field confirm (BENCH-197): c master, aa its A/A copy, xr POW-16 and RAM-6 on the screen's picks only.\n"
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
    p.add_argument("--names", required=True)
    p.add_argument("--check", action="append", required=True, help="ARM=MEMBERS.txt@BAR, repeatable")
    p.add_argument("--ref", default="c")
    p.add_argument("--out", required=True)
    p.add_argument("--stop-file", required=True)
    q = sub.add_parser("lists")
    q.add_argument("pick")
    q.add_argument("--x5-arm", default="x5")
    q.add_argument("--rd-arm", default="rd")
    q.add_argument("--x5-out", required=True)
    q.add_argument("--rd-out", required=True)
    q.add_argument("--abl-out", required=True)
    q.add_argument("--arms-out", required=True)
    q.add_argument("--version", required=True)
    a = ap.parse_args(argv)
    return pilot(a) if a.cmd == "pilot" else lists(a)


if __name__ == "__main__":
    sys.exit(main())
