#!/usr/bin/env python3
"""Per-robot card helpers (pc-tailor-field BENCH-197, pc-race-power BENCH-206, pc-tailor-near BENCH-207, pc-hj-field
BENCH-208): the pilot gate, the leaning robots of an earlier screen and the per-robot build's lists.

  python3 tools/x5_card.py pilot ARMS.tsv --names PILOT.txt --check x5=panel-x5.txt@2 \
      [--ref c] --out PILOT.md --stop-file STOP
  python3 tools/x5_card.py lists PICK.tsv --list-prefix work/tf --env-out ENV.sh --abl-out ABL.txt --arms-out ARMS \
      --version 3.21 [--arm xr] [--no-aa]
  python3 tools/x5_card.py lean SCREEN.tsv --census census-312.txt --exclude PICK.tsv --levers x5,gs,... [--min 1] \
      --pick-out LEAN.tsv --set-out SET.txt --pilot-out PILOT.txt [--pilot-every 5]

pilot: each --check ARM=MEMBERS@BAR takes the PILOT robots (name | note | jar) that MEMBERS also lists and their mean
of the arm's score share minus the reference arms' (--ref, comma separated, pooled). The card goes on when any check
reaches its bar; when none does, STOP is written and the screen skips. A checked robot with no finished battle of the
arm or a reference arm fails the step (exit 2): a partial pilot decides nothing.
lists: splits the pick TSV (mode_table.py --out-tsv: robot, then the arm that won it) by lever (LEVERS: screen arm ->
list ablation), writes one name list per lever that won a robot (PREFIX-ARM.list), a shell file exporting each list's
variable, the build-ablation.sh argument for those ablations, and the confirm arms file whose xr line names the jar
that build makes. Exits 1 when no robot picked any lever.
lean (pc-tailor-near, BENCH-207): see lean(). Standard library only.
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
    lines = ["# Pilot against %s" % " and ".join(refs), "",
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
    arms = ["# Per-robot card arms (x5_card.py lists): c master%s, %s each listed robot on its lever.\n"
            % ("" if a.no_aa else ", aa its A/A copy", a.arm),
            "c | hadur117.Hadur %s | bisect/hadur117.Hadur_%s.jar\n" % (v, v)]
    if not a.no_aa:
        arms.append("aa | hadur117.Hadur %saa | bisect/hadur117.Hadur_%saa.jar\n" % (v, v))
    arms.append("%s | hadur117.Hadur %s%s | bisect/hadur117.Hadur_%s%s.jar\n" % (a.arm, v, suffix, v, suffix))
    open(a.arms_out, "w", encoding="utf-8").write("".join(arms))
    print(", ".join("%d %s" % (len(picked[k]), k) for k in used))
    return 0


def lean(a):
    """BENCH-207: each robot the earlier screen fought and no pick holds, on the lever it leaned to there. A robot leans
    when its best allowed lever's mean score share beat c's by --min points; ties go to the larger gain. Writes the
    leaning robots as a pick TSV (robot, lever, gain, 0, n lever, n c) that `lists` turns into one build, their census
    lines as a set, and every --pilot-every'th of those lines as the pilot set. Exits 1 when no robot leans."""
    s = shares(a.screen)
    levers = [k for k in a.levers.split(",") if k]
    unknown = [k for k in levers if k not in LEVERS]
    if unknown:
        print("unknown lever: %s" % ", ".join(unknown), file=sys.stderr)
        return 2
    skip = set()
    for path in a.exclude or []:
        for line in open(path, encoding="utf-8"):
            if line.strip() and not line.startswith("#"):
                skip.add(line.split("\t")[0].strip())
    census = []
    for line in open(a.census, encoding="utf-8"):
        if line.strip() and not line.startswith("#") and "|" in line:
            census.append((line.split("|")[0].strip(), line if line.endswith("\n") else line + "\n"))
    rows, lines = [], []
    count = {k: 0 for k in levers}
    for name, line in census:
        arms = s.get(name)
        if name in skip or not arms or not arms.get("c"):
            continue
        ref = arms["c"]
        best = None
        for k in levers:
            xs = arms.get(k)
            if xs:
                d = st.mean(xs) - st.mean(ref)
                if best is None or d > best[1]:
                    best = (k, d, len(xs))
        if best and best[1] >= a.min:
            rows.append("%s\t%s\t%.2f\t0\t%d\t%d\n" % (name, best[0], best[1], best[2], len(ref)))
            lines.append(line)
            count[best[0]] += 1
    if not rows:
        print("no robot leans to any lever", file=sys.stderr)
        return 1
    open(a.pick_out, "w", encoding="utf-8").write("".join(rows))
    head = "# BENCH-207: robots of %s that lean to a lever on %s (best lever +%.1f points or more over c).\n"
    open(a.set_out, "w", encoding="utf-8").write(head % (a.census, a.screen, a.min) + "".join(lines))
    open(a.pilot_out, "w", encoding="utf-8").write(
        "# BENCH-207 pilot: every %dth robot of %s.\n" % (a.pilot_every, a.set_out) + "".join(lines[::a.pilot_every]))
    print("%d robots lean (%s); pilot %d" % (len(rows), ", ".join("%s %d" % (k, n) for k, n in count.items() if n),
                                             len(lines[::a.pilot_every])))
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
    q.add_argument("--arm", default="xr", help="the label of the build's arm")
    q.add_argument("--no-aa", action="store_true", help="leave the A/A copy out of the arms file")
    r = sub.add_parser("lean")
    r.add_argument("screen")
    r.add_argument("--census", required=True)
    r.add_argument("--exclude", action="append", help="a pick TSV whose robots are left out, repeatable")
    r.add_argument("--levers", required=True, help="comma separated screen arms a robot may lean to")
    r.add_argument("--min", type=float, default=1.0)
    r.add_argument("--pick-out", required=True)
    r.add_argument("--set-out", required=True)
    r.add_argument("--pilot-out", required=True)
    r.add_argument("--pilot-every", type=int, default=5)
    a = ap.parse_args(argv)
    return {"pilot": pilot, "lists": lists, "lean": lean}[a.cmd](a)


if __name__ == "__main__":
    sys.exit(main())
