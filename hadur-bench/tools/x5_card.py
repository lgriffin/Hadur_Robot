#!/usr/bin/env python3
"""Per-robot card helpers (first pc-tailor-field, BENCH-197; now pc-race-power, BENCH-206): the pilot gate and the
confirm build's lists.

  python3 tools/x5_card.py pilot ARMS.tsv --names PILOT.txt --check x5=panel-x5.txt@2 \
      [--ref c] --out PILOT.md --stop-file STOP
  python3 tools/x5_card.py lists PICK.tsv --list-prefix work/tf --env-out ENV.sh --abl-out ABL.txt --arms-out ARMS \
      --version 3.21

pilot: each --check ARM=MEMBERS@BAR takes the PILOT robots (name | note | jar) that MEMBERS also lists and their mean
of the arm's score share minus the reference arms' (--ref, comma separated, pooled). The card goes on when any check
reaches its bar; when none does, STOP is written and the screen skips. A checked robot with no finished battle of the
arm or a reference arm fails the step (exit 2): a partial pilot decides nothing.
lists: splits the pick TSV (mode_table.py --out-tsv: robot, then the arm that won it) by lever (LEVERS: screen arm ->
list ablation), writes one name list per lever that won a robot (PREFIX-ARM.list), a shell file exporting each list's
variable, the build-ablation.sh argument for those ablations, and the confirm arms file whose xr line names the jar
that build makes. Exits 1 when no robot picked any lever. Standard library only.
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
    lines = ["# pc-tailor-field pilot against %s" % " and ".join(refs), "",
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


# Screen arm -> (build-ablation.sh list ablation, the variable naming its file, the jar suffix it adds).
LEVERS = {
    "x5": ("x5list", "X5_POWER", "x5"),    # POW-16 hidden bullet speed (gun)
    "gs": ("gslist", "GUN_STACK", "gl"),   # GUN-11 gun stack (gun)
    "fp": ("fplist", "FULL_OFF", "fp"),    # POW-15 no full-power rules (gun)
    "sg": ("sgolist", "STOP_GO", "wl"),    # POISON-2 stop-and-go, WavePoison (movement)
    "sw": ("sgo2list", "STOP_GO2", "wm"),  # POISON-2 stop-and-go, WavePoisonShift (movement)
    "hj": ("hjlist", "HEAT_JIT", "hl"),    # MOVE-28 stop-and-start (movement)
    "dg": ("sdodgelist", "SHOT_DODGE", "dg"),  # DODGE-3 simple-aim dodge (movement)
    "fl": ("fllist", "FLAT_ON", "fq"),     # MOVE-32 flattener on (movement)
    "mm": ("mmlist", "MIMIC_ON", "mq"),    # MOVE-34 mimic aims in the surf (movement)
}


def lists(a):
    picked = {k: [] for k in LEVERS}
    for line in open(a.pick, encoding="utf-8"):
        if line.strip() and not line.startswith("#"):
            f = line.split("\t")
            if f[1].strip() in picked:
                picked[f[1].strip()].append(f[0].strip())
    used = [k for k in LEVERS if picked[k]]
    if not used:
        print("no robot picked any lever", file=sys.stderr)
        return 1
    env = []
    for k in used:
        path = "%s-%s.list" % (a.list_prefix, k)
        open(path, "w", encoding="utf-8").write("".join(n + "\n" for n in picked[k]))
        env.append("export %s=%s\n" % (LEVERS[k][1], path))
    open(a.env_out, "w", encoding="utf-8").write("".join(env))
    open(a.abl_out, "w", encoding="utf-8").write(",".join(LEVERS[k][0] for k in used) + "\n")
    v, suffix = a.version, "".join(LEVERS[k][2] for k in used)
    open(a.arms_out, "w", encoding="utf-8").write(
        "# pc-tailor-field confirm (BENCH-197): c master, aa its A/A copy, xr each picked robot on the lever it won.\n"
        "c | hadur117.Hadur %s | bisect/hadur117.Hadur_%s.jar\n"
        "aa | hadur117.Hadur %saa | bisect/hadur117.Hadur_%saa.jar\n"
        "xr | hadur117.Hadur %s%s | bisect/hadur117.Hadur_%s%s.jar\n" % (v, v, v, v, v, suffix, v, suffix))
    print(", ".join("%d %s" % (len(picked[k]), k) for k in used))
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
    q.add_argument("--list-prefix", required=True)
    q.add_argument("--env-out", required=True)
    q.add_argument("--abl-out", required=True)
    q.add_argument("--arms-out", required=True)
    q.add_argument("--version", required=True)
    a = ap.parse_args(argv)
    return pilot(a) if a.cmd == "pilot" else lists(a)


if __name__ == "__main__":
    sys.exit(main())
