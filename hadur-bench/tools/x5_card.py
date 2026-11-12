#!/usr/bin/env python3
"""Per-robot card helpers (pc-tailor-field BENCH-197, pc-race-power BENCH-206, pc-tailor-near BENCH-207, pc-hj-field
BENCH-208, pc-tailor-stack BENCH-214): the pilot gate, the leaning robots of an earlier screen, the levers the table
already carries and the per-robot build's lists.

  python3 tools/x5_card.py pilot ARMS.tsv --names PILOT.txt --check x5=panel-x5.txt@2 \
      [--ref c] --out PILOT.md --stop-file STOP
  python3 tools/x5_card.py lists PICK.tsv --list-prefix work/tf --env-out ENV.sh --abl-out ABL.txt --arms-out ARMS \
      --version 3.21 [--arm xr] [--no-aa]
  python3 tools/x5_card.py lean SCREEN.tsv --census census-312.txt --exclude PICK.tsv --levers x5,gs,... [--min 1] \
      [--carry CARRIED.tsv [--only-carried]] [--shielded PANEL.txt] [--req BENCH-207] \
      --pick-out LEAN.tsv --set-out SET.txt --pilot-out PILOT.txt [--pilot-every 5]
  python3 tools/x5_card.py carried ../hadur-robot/src/main/java/hadur117/ShieldTableData.java --out CARRIED.tsv
  python3 tools/x5_card.py portfolio --lean LEAN.tsv --run work/tnr/arms.tsv@ln [--run RUN@ARM ...] --census census-312.txt \
      [--carry CARRIED.tsv] [--shielded PANEL.txt] [--min 0] [--field 1217] \
      --pick-out PICK.tsv --set-out SET.txt --pilot-out PILOT.txt --out REPORT.md

pilot: each --check ARM=MEMBERS@BAR takes the PILOT robots (name | note | jar) that MEMBERS also lists and their mean
of the arm's score share minus the reference arms' (--ref, comma separated, pooled). The card goes on when any check
reaches its bar; when none does, STOP is written and the screen skips. A checked robot with no finished battle of the
arm or a reference arm fails the step (exit 2): a partial pilot decides nothing.
lists: splits the pick TSV (mode_table.py --out-tsv: robot, then the arm that won it) by lever (LEVERS: screen arm ->
list ablation), writes one name list per lever that won a robot (PREFIX-ARM.list), a shell file exporting each list's
variable, the build-ablation.sh argument for those ablations, and the confirm arms file whose xr line names the jar
that build makes. Exits 1 when no robot picked any lever.
lean (pc-tailor-near, BENCH-207; pc-tailor-stack, BENCH-214): see lean().
portfolio (pc-portfolio, BENCH-230): see portfolio().
carried (pc-tailor-stack, BENCH-214): see carried(). Standard library only.
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
    "rp": ("rplist", "RACE_POWER", "rp"),  # POW-17 energy-race power pick (gun)
    "pk": ("pcaplist", "POWER_CAP", "pk"), # POW-18 0.2 power cap (gun)
}

# BENCH-214: the levers that work the same part of the robot. A robot stacks a second lever only from another
# family: one bullet-power rule (x5, fp, rp and pk each replace or cap the power choice), one stop-and-go variant (sw is sg's
# shifted form); gs, hj, fl and mm each stand alone.
FAMILY = {"x5": "power", "fp": "power", "rp": "power", "pk": "power", "sg": "stopgo", "sw": "stopgo",
          "gs": "gs", "hj": "hj", "fl": "fl", "mm": "mm"}
# GUN-11's TripHammer aims and MOVE-32's flattener never apply to a shield-mode robot (DuelController).
SHIELD_FREE = {"gs", "fl"}

# ShieldTableData method -> lever, for carried().
METHODS = {"x5Powers": "x5", "gunStacks": "gs", "fullOffs": "fp", "stopGos": "sg", "stopGoShifts": "sw",
           "heatJits": "hj", "flatOns": "fl", "mimicOns": "mm", "racePowers": "rp",
           "powerCaps": "pk"}


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


def carried(a):
    """BENCH-214: the per-robot levers the shipped table carries, read from ShieldTableData.java: every name in the
    methods METHODS lists (robot, lever; a robot on two levers has two rows). Exits 1 when it finds none."""
    import re
    rows, method, lever = [], None, None
    for line in open(a.source, encoding="utf-8"):
        m = re.match(r"\s*static String\[\] (\w+)\(\)", line)
        if m:
            method = m.group(1)
            lever = METHODS.get(method)
            continue
        t = line.strip()
        if t.startswith("}"):
            lever = None
        elif lever and t.startswith('"'):
            name = re.match(r'"([^"]*)"', t).group(1)
            if name:
                rows.append("%s\t%s\n" % (name, lever))
    if not rows:
        print("no per-robot lever in %s" % a.source, file=sys.stderr)
        return 1
    open(a.out, "w", encoding="utf-8").write("".join(rows))
    print("%d carried lever lines" % len(rows))
    return 0


def read_pick(path):
    """(robot, lever) rows of a pick TSV (robot first, lever second; comments skipped)."""
    out = []
    for line in open(path, encoding="utf-8"):
        if line.strip() and not line.startswith("#"):
            f = line.split("\t")
            out.append((f[0].strip(), f[1].strip() if len(f) > 1 else ""))
    return out


def lean(a):
    """BENCH-207: each robot the earlier screen fought and no pick holds, on the lever it leaned to there. A robot leans
    when its best allowed lever's mean score share beat c's by --min points; ties go to the larger gain. Writes the
    leaning robots as a pick TSV (robot, lever, gain, 0, n lever, n c) that `lists` turns into one build, their census
    lines as a set, and every --pilot-every'th of those lines as the pilot set. Exits 1 when no robot leans.
    BENCH-214: with --carry (robot, lever rows the table already carries), a carried robot may lean only to a lever
    of another FAMILY than the ones it carries; --only-carried keeps the other robots out; --shielded names the
    robots (a census panel) that may not lean to gs or fl."""
    s = shares(a.screen)
    levers = [k for k in a.levers.split(",") if k]
    unknown = [k for k in levers if k not in LEVERS]
    if unknown:
        print("unknown lever: %s" % ", ".join(unknown), file=sys.stderr)
        return 2
    skip = set()
    for path in a.exclude or []:
        skip.update(n for n, _ in read_pick(path))
    carry = defaultdict(set)
    for path in a.carry or []:
        for name, lever in read_pick(path):
            if lever in FAMILY:
                carry[name].add(FAMILY[lever])
    shielded = set(panel_names(a.shielded)) if a.shielded else set()
    census = []
    for line in open(a.census, encoding="utf-8"):
        if line.strip() and not line.startswith("#") and "|" in line:
            census.append((line.split("|")[0].strip(), line if line.endswith("\n") else line + "\n"))
    rows, lines = [], []
    count = {k: 0 for k in levers}
    for name, line in census:
        arms = s.get(name)
        if name in skip or not arms or not arms.get("c") or (a.only_carried and name not in carry):
            continue
        ref = arms["c"]
        best = None
        for k in levers:
            if FAMILY[k] in carry[name] or (name in shielded and k in SHIELD_FREE):
                continue
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
    head = "# %s: robots of %s that lean to a lever on %s (best lever +%.1f points or more over c).\n"
    open(a.set_out, "w", encoding="utf-8").write(head % (a.req, a.census, a.screen, a.min) + "".join(lines))
    open(a.pilot_out, "w", encoding="utf-8").write(
        "# %s pilot: every %dth robot of %s.\n" % (a.req, a.pilot_every, a.set_out) + "".join(lines[::a.pilot_every]))
    print("%d robots lean (%s); pilot %d" % (len(rows), ", ".join("%s %d" % (k, n) for k, n in count.items() if n),
                                             len(lines[::a.pilot_every])))
    return 0


def portfolio(a):
    """BENCH-230: the whole leaning field as one portfolio, banked together instead of robot by robot.

    --lean names each robot's lever (robot, lever: the lean an EARLIER screen chose). Each --run RUN@ARM is a later
    run in which ARM is one build with every such robot on its own lever, beside c; the robot's gain there is the
    mean of ARM's score share less c's over that run's battles, pooled over the runs by battle count. Because the
    lever was chosen on other seeds, that gain is unbiased, but at a few seeds it is mostly noise: a 2-point lock
    keeps a robot in fifteen and throws the rest of a real pooled gain away.

    Here no robot has to lock. Per lever (empirical Bayes): the noise variance of a robot's gain is the pooled
    within-arm variance of its battles over its battle counts; the spread tau^2 between robots is the variance of the
    gains less the mean noise variance, floored at 0; each robot's gain is shrunk toward its lever's mean by
    tau^2 / (tau^2 + its noise variance). A robot joins the portfolio when its shrunk gain is above --min. A lever
    with no spread keeps all its robots when its mean is above --min and none otherwise.

    Left out: a robot the table already carries a lever for (--carry: one lever a robot, pc-tailor-stack), a
    shield-mode robot on gs or fl (--shielded), a robot with under two battles of either arm. Writes the pick TSV
    (robot, lever, shrunk gain, raw gain, n lever, n c) that `lists` turns into one build, the robots' census lines,
    every --pilot-every'th of them as the pilot set, and a report with each lever's robots, mean, spread and the
    APS the kept robots project over --field pairings. Exits 1 when no robot is kept."""
    lever_of = dict(read_pick(a.lean))
    carried_names = set()
    for path in a.carry or []:
        carried_names.update(n for n, _ in read_pick(path))
    shielded = set(panel_names(a.shielded)) if a.shielded else set()
    obs = defaultdict(lambda: {"x": [], "c": []})
    for spec in a.run:
        path, _, arm = spec.rpartition("@")
        if not path:
            print("--run wants RUN@ARM, got %s" % spec, file=sys.stderr)
            return 2
        for name, arms in shares(path).items():
            if name in lever_of and arms.get(arm) and arms.get("c"):
                obs[name]["x"] += arms[arm]
                obs[name]["c"] += arms["c"]
    rows = defaultdict(list)   # lever -> [(name, gain, noise variance, n lever, n c)]
    skipped = {"carried": 0, "shielded": 0, "short": 0}
    for name, o in obs.items():
        k = lever_of[name]
        if k not in LEVERS:
            continue
        if name in carried_names:
            skipped["carried"] += 1
        elif name in shielded and k in SHIELD_FREE:
            skipped["shielded"] += 1
        elif len(o["x"]) < 2 or len(o["c"]) < 2:
            skipped["short"] += 1
        else:
            rows[k].append([name, st.mean(o["x"]) - st.mean(o["c"]), o["x"], o["c"]])
    kept, md = {}, ["# The leaning field as one portfolio (BENCH-230)", "",
                    "Each robot's gain is its lever's score share less master's over the runs given, shrunk toward its "
                    "lever's mean by how much of the gains' variance is spread between robots and not noise. A robot is "
                    "kept when its shrunk gain is above %+.1f points." % a.min, "",
                    "| Lever | Robots | Mean gain | Noise sd a robot | Spread between robots | Kept | Kept robots' shrunk gain, sum |",
                    "|---|---:|---:|---:|---:|---:|---:|"]
    for k in LEVERS:
        rs = rows.get(k)
        if not rs:
            continue
        # One within-arm variance for the lever, pooled over its robots and both arms.
        ss = sum(sum((v - st.mean(xs)) ** 2 for v in xs) for r in rs for xs in (r[2], r[3]))
        df = sum(len(xs) - 1 for r in rs for xs in (r[2], r[3]))
        var = ss / df if df else 0.0
        noise = [var * (1.0 / len(r[2]) + 1.0 / len(r[3])) for r in rs]
        gains = [r[1] for r in rs]
        mu = st.mean(gains)
        tau2 = max(0.0, (st.pvariance(gains) if len(gains) > 1 else 0.0) - st.mean(noise))
        n_kept, total = 0, 0.0
        for r, nv in zip(rs, noise):
            b = tau2 / (tau2 + nv) if tau2 + nv > 0 else 0.0
            shrunk = mu + b * (r[1] - mu)
            if shrunk > a.min:
                kept[r[0]] = (k, shrunk, r[1], len(r[2]), len(r[3]))
                n_kept += 1
                total += shrunk
        md.append("| %s | %d | %+.2f | %.2f | %.2f | %d | %+.1f |" % (
            k, len(rs), mu, st.mean(noise) ** 0.5, tau2 ** 0.5, n_kept, total))
    aps = sum(v[1] for v in kept.values()) / a.field
    md += ["", "Kept: **%d robots**, projected **%+.3f APS** over %d pairings (the sum of the shrunk gains; the "
               "confirm on fresh seeds is the measurement)." % (len(kept), aps, a.field),
           "Left out: %d the table already carries a lever for, %d shield-mode robots on gs or fl, %d with under two "
           "battles of an arm." % (skipped["carried"], skipped["shielded"], skipped["short"])]
    open(a.out, "w", encoding="utf-8").write("\n".join(md) + "\n")
    if not kept:
        print("no robot kept", file=sys.stderr)
        return 1
    picks, lines = [], []
    for line in open(a.census, encoding="utf-8"):
        if line.strip() and not line.startswith("#") and "|" in line:
            name = line.split("|")[0].strip()
            if name in kept:
                k, shrunk, raw, nx, nc = kept[name]
                picks.append("%s\t%s\t%.2f\t%.2f\t%d\t%d\n" % (name, k, shrunk, raw, nx, nc))
                lines.append(line if line.endswith("\n") else line + "\n")
    open(a.pick_out, "w", encoding="utf-8").write("".join(picks))
    head = "# %s: the portfolio, %d robots each on the lever it leaned to (x5_card.py portfolio).\n"
    open(a.set_out, "w", encoding="utf-8").write(head % (a.req, len(lines)) + "".join(lines))
    open(a.pilot_out, "w", encoding="utf-8").write(
        "# %s pilot: every %dth robot of %s.\n" % (a.req, a.pilot_every, a.set_out) + "".join(lines[::a.pilot_every]))
    print("%d robots kept, projected %+.3f APS; pilot %d" % (len(lines), aps, len(lines[::a.pilot_every])))
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
    r.add_argument("--carry", action="append", help="a robot, lever TSV the table carries: no lever of the same family")
    r.add_argument("--only-carried", action="store_true", help="only the robots a --carry file names")
    r.add_argument("--shielded", help="a census panel of the shield-mode robots, which lean to neither gs nor fl")
    r.add_argument("--req", default="BENCH-207", help="the requirement named in the set files' headers")
    c = sub.add_parser("carried")
    c.add_argument("source", help="ShieldTableData.java")
    c.add_argument("--out", required=True)
    f = sub.add_parser("portfolio")
    f.add_argument("--lean", required=True, help="robot, lever TSV: the lever an earlier screen chose for each robot")
    f.add_argument("--run", action="append", required=True, help="RUN/arms.tsv@ARM: a run with each robot on its lever as ARM, beside c")
    f.add_argument("--census", required=True)
    f.add_argument("--carry", action="append", help="a robot, lever TSV the table carries: those robots are left out")
    f.add_argument("--shielded", help="a census panel of the shield-mode robots, which take neither gs nor fl")
    f.add_argument("--min", type=float, default=0.0, help="keep a robot whose shrunk gain is above this many points")
    f.add_argument("--field", type=int, default=1217)
    f.add_argument("--pick-out", required=True)
    f.add_argument("--set-out", required=True)
    f.add_argument("--pilot-out", required=True)
    f.add_argument("--pilot-every", type=int, default=5)
    f.add_argument("--out", required=True)
    f.add_argument("--req", default="BENCH-230")
    a = ap.parse_args(argv)
    return {"pilot": pilot, "lists": lists, "lean": lean, "carried": carried, "portfolio": portfolio}[a.cmd](a)


if __name__ == "__main__":
    sys.exit(main())
