#!/usr/bin/env python3
"""BENCH-100: steps of the pc-shield-s2 queue: shield part 2 of the 1v1 mode table (docs/plan-shield-quality.md).

  shield_s2.py entries PICK LISTDATA --move-arm sasvsk --adds FILE --moves FILE
      from a mode_table.py pick TSV: the robots that join the shield list (locked with any shield arm
      and not on the list) and the robots the opening drive is for (locked with the move arm)
  shield_s2.py aims RUN_DIR PICK LISTDATA --rec-arm sask --move-arm sasvsk --out FILE [--min-exact 5]
      a shipped aim for every robot the candidate shields (on the list, or in the pick): from the last
      SP record of each of its battles in the arm it will play (the move arm for a move robot, the rec
      arm for the others), the predictor most battles end on with at least MIN_EXACT exact matches,
      kept when it is at least half of the robot's battles, with the median of those battles' offsets.
      Lines are "predictor offset name"
  shield_s2.py candidate ADDS MOVES AIMS --base 3.16 --out ARMS
      builds the candidate t2 (build-ablation.sh: slistadd, smovelist, saimlist, each only when its
      file names anything) and writes the verify arms file c, aa, t2
  shield_s2.py gate ARMS_TSV --arm t2 --out FILE [--panel SET] [--cover 0.95] [--field 1217] [--bar 0.15] [--low 0]
      the verify gate on the panel: the sum over the panel's robots of arm minus pooled c and aa,
      divided by the field's pairings, in APS. PASS needs the estimate at BAR or more, its lower 95%
      end above LOW, the A/A inside its band, and (with PANEL) at least COVER of the panel's robots
      read in all three arms. Writes a short verdict.

A robot matches the shield list with or without its version, as ShieldList does. Standard library
plus data/tools/multiarm.py and tools/table_v1.py.
"""
import argparse
import os
import re
import statistics as st
import subprocess
import sys

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, HERE)
sys.path.insert(0, os.path.join(HERE, "..", "..", "data", "tools"))
import multiarm  # noqa: E402
import table_v1  # noqa: E402

FIELD = 1217


def slug(name):
    """The bench's battle directory name for a robot (Opponent.slug)."""
    return re.sub(r"[^A-Za-z0-9.]+", "_", name)


def entries(pick, listdata, move_arm):
    names = table_v1.list_names(listdata)
    rows = table_v1.pick_rows(pick)
    adds = sorted({o for o, _ in rows if not table_v1.listed(o, names)})
    moves = sorted({o for o, a in rows if a == move_arm})
    return adds, moves


def last_sp(log):
    """The last SP record of a hadur.log: (bases, best, offset, exact), or None. The harvester
    prefixes each line with its round and turn: "round,turn,record"."""
    best = None
    try:
        with open(log, encoding="utf-8", errors="replace") as f:
            for line in f:
                parts = line.rstrip("\n").split(",", 2)
                if len(parts) < 3 or not parts[2].startswith("SP,"):
                    continue
                p = parts[2].strip().split(",")
                if len(p) >= 7:
                    best = (int(p[3]), int(p[4]), float(p[5]), int(p[6]))
    except OSError:
        return None
    return best


def battle_seeds(run_dir):
    """robot -> arm -> seeds, from the run's arms.tsv."""
    out = {}
    for r in multiarm.read_rows([os.path.join(run_dir, "arms.tsv")]):
        if r.get("ok") == "true":
            out.setdefault(r["opponent"], {}).setdefault(r["arm"], []).append(r["seed"])
    return out


def aim_for(sps, min_exact):
    """(predictor, offset) most of a robot's battles agree on, or None."""
    good = [s for s in sps if s is not None and s[3] >= min_exact]
    if not good or not sps:
        return None
    counts = {}
    for s in good:
        counts[s[1]] = counts.get(s[1], 0) + 1
    k = max(sorted(counts), key=lambda x: counts[x])
    if counts[k] < len(sps) / 2.0:
        return None
    return k, st.median(s[2] for s in good if s[1] == k)


def aims(run_dir, pick, listdata, rec_arm, move_arm, min_exact):
    names = table_v1.list_names(listdata)
    picked = dict(table_v1.pick_rows(pick))
    seeds = battle_seeds(run_dir)
    out = []
    for robot in sorted(seeds):
        if not (table_v1.listed(robot, names) or robot in picked):
            continue
        arm = move_arm if picked.get(robot) == move_arm else rec_arm
        logs = [os.path.join(run_dir, "battles", "%s-%s-%s" % (slug(robot), s, arm), "hadur.log")
                for s in seeds[robot].get(arm, [])]
        a = aim_for([last_sp(l) for l in logs], min_exact)
        if a is not None:
            out.append("%d %.9f %s" % (a[0], a[1], robot))
    return out


def candidate_spec(adds, moves, aims_):
    parts, suffix = [], ""
    if adds:
        parts.append("slistadd"); suffix += "mt"
    if moves:
        parts.append("smovelist"); suffix += "mv"
    if aims_:
        parts.append("saimlist"); suffix += "ak"
    return ",".join(parts), suffix


def candidate_arms(base, suffix):
    return ["# Shield part 2 verify (pc-shield-s2): c is %s, aa its A/A copy, t2 the candidate.\n" % base,
            "c | hadur2.Hadur %s | bisect/hadur2.Hadur_%s.jar\n" % (base, base),
            "aa | hadur2.Hadur %saa | bisect/hadur2.Hadur_%saa.jar\n" % (base, base),
            "t2 | hadur2.Hadur %s%s | bisect/hadur2.Hadur_%s%s.jar\n" % (base, suffix, base, suffix)]


def gate(arms_tsv, arm, field, bar, low, panel=None, cover=0.95):
    """The verify gate. With PANEL (a bench set file), at least COVER of its robots must be read in
    all three arms, so a partial run cannot pass on a lucky subset."""
    run = multiarm.Run(multiarm.read_rows([arms_tsv]))
    d = run.diffs(arm, ["c", "aa"], run.opps(arm, "c", "aa"))
    m, ci, n = multiarm.mean_ci(list(d.values()))
    aa = multiarm.aa_check(run, "c", "aa")
    expected = len(table_v1.set_rows(panel)) if panel else n
    if m is None or ci is None or ci != ci:
        return False, None, None, n, aa, expected
    total, half = m * n / field, ci * n / field
    ok = (total >= bar and total - half > low and aa is not None and aa["ok"]
          and n >= cover * expected)
    return ok, total, half, n, aa, expected


def read_lines(path):
    with open(path, encoding="utf-8") as f:
        return [l.strip() for l in f if l.strip() and not l.startswith("#")]


def write(path, lines):
    with open(path, "w", encoding="utf-8") as f:
        f.writelines(lines)


def main(argv=None):
    ap = argparse.ArgumentParser()
    sub = ap.add_subparsers(dest="cmd", required=True)
    p = sub.add_parser("entries"); p.add_argument("pick"); p.add_argument("listdata")
    p.add_argument("--move-arm", default="sasvsk"); p.add_argument("--adds", required=True)
    p.add_argument("--moves", required=True)
    p = sub.add_parser("aims"); p.add_argument("run"); p.add_argument("pick"); p.add_argument("listdata")
    p.add_argument("--rec-arm", default="sask"); p.add_argument("--move-arm", default="sasvsk")
    p.add_argument("--min-exact", type=int, default=5); p.add_argument("--out", required=True)
    p = sub.add_parser("candidate"); p.add_argument("adds"); p.add_argument("moves"); p.add_argument("aims")
    p.add_argument("--base", required=True); p.add_argument("--out", required=True)
    p = sub.add_parser("gate"); p.add_argument("arms"); p.add_argument("--arm", default="t2")
    p.add_argument("--out", required=True); p.add_argument("--field", type=int, default=FIELD)
    p.add_argument("--bar", type=float, default=0.15); p.add_argument("--low", type=float, default=0.0)
    p.add_argument("--panel"); p.add_argument("--cover", type=float, default=0.95)
    a = ap.parse_args(argv)

    if a.cmd == "entries":
        adds, moves = entries(a.pick, a.listdata, a.move_arm)
        write(a.adds, [n + "\n" for n in adds])
        write(a.moves, [n + "\n" for n in moves])
        print("%d robots join the shield list, %d get the opening drive" % (len(adds), len(moves)))
    elif a.cmd == "aims":
        lines = aims(a.run, a.pick, a.listdata, a.rec_arm, a.move_arm, a.min_exact)
        write(a.out, [l + "\n" for l in lines])
        print(len(lines), "shipped aims")
        if not lines:
            sys.stderr.write("warning: no shipped aims (no SP records read in %s)\n" % a.run)
    elif a.cmd == "candidate":
        adds, moves, aims_ = read_lines(a.adds), read_lines(a.moves), read_lines(a.aims)
        spec, suffix = candidate_spec(adds, moves, aims_)
        print("%d list adds, %d opening drives, %d aims; build: %s"
              % (len(adds), len(moves), len(aims_), spec or "(none)"))
        if not spec:
            print("nothing to build: t2 is the base")
            write(a.out, candidate_arms(a.base, "aa")[:3]
                  + ["t2 | hadur2.Hadur %saa | bisect/hadur2.Hadur_%saa.jar\n" % (a.base, a.base)])
            return 0
        bench = os.path.dirname(HERE)
        rel = lambda f: os.path.relpath(os.path.abspath(f), bench).replace(os.sep, "/")
        env = dict(os.environ, SHIELD_ADD=rel(a.adds), SHIELD_MOVE=rel(a.moves), SHIELD_AIM=rel(a.aims))
        code = subprocess.call(["bash", "./build-ablation.sh", spec], cwd=bench, env=env)
        if code:
            return code
        write(a.out, candidate_arms(a.base, suffix))
    elif a.cmd == "gate":
        ok, m, ci, n, aa, expected = gate(a.arms, a.arm, a.field, a.bar, a.low, a.panel, a.cover)
        est = "no battles" if m is None else "%+.2f +/- %.2f APS" % (m, ci)
        text = ["# Shield part 2: verify gate\n\n",
                "%s: %s - pooled c and aa, summed over %d panel robots (of %d) / %d pairings = %s. "
                "Bar: %+.2f with the lower end above %+.2f, and %.0f%% of the panel read.\n\n"
                % ("PASS" if ok else "FAIL", a.arm, n, expected, a.field, est, a.bar, a.low, 100 * a.cover),
                "A/A: aa - c = %+.2f +/- %.2f, band +/- %.2f: %s.\n"
                % (aa["diff"], aa["ci"], aa["band"], "inside" if aa["ok"] else "OUTSIDE, run not read")
                if aa else "A/A: no aa arm.\n"]
        write(a.out, text)
        print("".join(text))
    return 0


if __name__ == "__main__":
    sys.exit(main())
