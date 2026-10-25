#!/usr/bin/env python3
"""BENCH-102: steps of the pc-shield-s3 queue: the last 1v1 table entries before top 5.

  shield_s3.py rest SET [SET ...] --exclude FILE [FILE ...] --out SET [--listdata LISTDATA]
      the rows of the screen sets whose robot no exclude file names (one name a line, or a pick TSV),
      and, with LISTDATA, that the shield list does not name either
  shield_s3.py warm OLD_RUN SET --out-dir DIR --base 3.16 [--rec-arm sask] [--move-arm sasvsk]
      the warm-start shield screen: for each robot of SET, a shipped aim from its part 2 screen
      battles (OLD_RUN, shield_s2.py's rule) from the still arm and from the moving arm; builds
      w = base + slistadd + saimlist and wv = w + smovelist (each aim file only when it names
      anything) and writes DIR/shield-s3-screen.arms with c, aa, w and wv
  shield_s3.py candidate SHIELD_PICK POISON_PICK --only SET --warm-dir DIR --base 3.16 --out ARMS
      from the two screen picks (mode_table.py TSVs): the robots that join the shield list (locked
      with w or wv), the opening drive (wv), their aims (from the arm they locked with), and the new
      stop-and-go entries (wp / ws, kept only for robots of SET, the second-pass panel); builds the
      candidate t4 and writes the verify arms c, aa, t4, and DIR's entry files

  shield_s3.py panel SET [SET ...] --names FILE [FILE ...] --out SET
      the verify panel: modes_v2.py's (the rows whose robot a name file names), or, when the names
      match nothing, the first FALLBACK rows of the first set, so the verify and its gate still run
      (t4 is then the A/A copy and the gate reads FAIL)

The gate is shield_s2.py gate with --arm t4. Standard library plus tools/shield_s2.py, tools/table_v1.py and tools/modes_v2.py.
"""
import argparse
import os
import subprocess
import sys

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, HERE)
import modes_v2  # noqa: E402
import shield_s2  # noqa: E402
import table_v1  # noqa: E402

BENCH = os.path.dirname(HERE)


def names_of(path):
    """Names in a one-name-a-line file, a pick TSV (its first column) or a bench set file."""
    if not os.path.exists(path):
        return set()
    with open(path, encoding="utf-8") as f:
        return {l.split("\t")[0].split("|")[0].strip() for l in f if l.strip() and not l.startswith("#")}


def rest(sets, excludes, listdata=None):
    drop = set().union(*(names_of(f) for f in excludes)) if excludes else set()
    listed = table_v1.list_names(listdata) if listdata else set()
    rows, seen = [], set()
    for path in sets:
        for name, line in table_v1.set_rows(path):
            if name in seen or name in drop or table_v1.listed(name, listed):
                continue
            seen.add(name)
            rows.append(line)
    return rows


def warm_aims(old_run, robots, arm, min_exact=5):
    """shield_s2.py's shipped aim per robot, from the robot's battles in ARM of OLD_RUN."""
    seeds = shield_s2.battle_seeds(old_run) if os.path.exists(os.path.join(old_run, "arms.tsv")) else {}
    out = []
    for robot in sorted(robots):
        logs = [os.path.join(old_run, "battles", "%s-%s-%s" % (shield_s2.slug(robot), s, arm), "hadur.log")
                for s in seeds.get(robot, {}).get(arm, [])]
        a = shield_s2.aim_for([shield_s2.last_sp(l) for l in logs], min_exact)
        if a is not None:
            out.append("%d %.9f %s" % (a[0], a[1], robot))
    return out


def spec(adds, moves, aims, stopgo=(), stopgo2=()):
    parts, suffix = [], ""
    for on, part, suf in ((adds, "slistadd", "mt"), (moves, "smovelist", "mv"), (aims, "saimlist", "ak"),
                          (stopgo, "sgolist", "wl"), (stopgo2, "sgo2list", "wm")):
        if on:
            parts.append(part)
            suffix += suf
    return ",".join(parts), suffix


def build(parts, env_files):
    rel = lambda f: os.path.relpath(os.path.abspath(f), BENCH).replace(os.sep, "/")
    env = dict(os.environ, **{k: rel(v) for k, v in env_files.items()})
    return subprocess.call(["bash", "./build-ablation.sh", parts], cwd=BENCH, env=env)


def arm_line(label, base, suffix):
    return "%s | hadur2.Hadur %s%s | bisect/hadur2.Hadur_%s%s.jar\n" % (label, base, suffix, base, suffix)


def warm(old_run, set_path, base, out_dir, rec_arm, move_arm, run_build=True):
    robots = [n for n, _ in table_v1.set_rows(set_path)]
    os.makedirs(out_dir, exist_ok=True)
    f = lambda n: os.path.join(out_dir, n)
    shield_s2.write(f("warm-names.txt"), [n + "\n" for n in robots])
    rec, mov = warm_aims(old_run, robots, rec_arm), warm_aims(old_run, robots, move_arm)
    shield_s2.write(f("warm-aims.txt"), [l + "\n" for l in rec])
    shield_s2.write(f("warm-aims-move.txt"), [l + "\n" for l in mov])
    arms = ["# Shield part 3 screen (pc-shield-s3): c is %s, aa its A/A copy, w the warm-start shield (list add\n"
            "# and shipped aim from part 2's records), wv the same with the opening drive.\n" % base,
            arm_line("c", base, ""), arm_line("aa", base, "aa")]
    for label, moves, aims, aim_file in (("w", [], rec, f("warm-aims.txt")),
                                         ("wv", robots, mov, f("warm-aims-move.txt"))):
        parts, suffix = spec(robots, moves, aims)
        if run_build:
            code = build(parts, {"SHIELD_ADD": f("warm-names.txt"), "SHIELD_MOVE": f("warm-names.txt"),
                                 "SHIELD_AIM": aim_file})
            if code:
                return code, None
        arms.append(arm_line(label, base, suffix))
    shield_s2.write(f("shield-s3-screen.arms"), arms)
    print("%d robots; %d still-shield aims, %d moving-shield aims" % (len(robots), len(rec), len(mov)))
    return 0, arms


def candidate(shield_pick, poison_pick, only, warm_dir, base, out, run_build=True):
    f = lambda n: os.path.join(warm_dir, n)
    rows = table_v1.pick_rows(shield_pick) if os.path.exists(shield_pick) else []
    adds = sorted({o for o, _ in rows})
    moves = sorted({o for o, a in rows if a == "wv"})
    aim_of = {}
    for path, arm in ((f("warm-aims.txt"), "w"), (f("warm-aims-move.txt"), "wv")):
        if os.path.exists(path):
            for line in shield_s2.read_lines(path):
                aim_of[(line.split(" ", 2)[2], arm)] = line
    aims = sorted(aim_of[(o, a)] for o, a in rows if (o, a) in aim_of)
    keep = names_of(only)
    wp, ws = modes_v2.split(poison_pick) if os.path.exists(poison_pick) else ([], [])
    wp, ws = [n for n in wp if n in keep], [n for n in ws if n in keep]
    files = {"SHIELD_ADD": ("s3-adds.txt", adds), "SHIELD_MOVE": ("s3-moves.txt", moves),
             "SHIELD_AIM": ("s3-aims.txt", aims), "STOP_GO": ("s3-stopgo.txt", wp),
             "STOP_GO2": ("s3-stopgo2.txt", ws)}
    for name, lines in files.values():
        shield_s2.write(f(name), [l + "\n" for l in lines])
    parts, suffix = spec(adds, moves, aims, wp, ws)
    print("%d list adds, %d opening drives, %d aims, %d WavePoison, %d WavePoisonShift; build: %s"
          % (len(adds), len(moves), len(aims), len(wp), len(ws), parts or "(none)"))
    head = ["# Shield part 3 verify (pc-shield-s3): c is %s, aa its A/A copy, t4 the candidate.\n" % base,
            arm_line("c", base, ""), arm_line("aa", base, "aa")]
    if not parts:
        print("nothing to build: t4 is the base")
        shield_s2.write(out, head + [arm_line("t4", base, "aa")])
        return 0
    if run_build:
        code = build(parts, {k: f(v[0]) for k, v in files.items()})
        if code:
            return code
    shield_s2.write(out, head + [arm_line("t4", base, suffix)])
    return 0


FALLBACK = 20


def panel(sets, names):
    rows = modes_v2.panel(sets, names)
    return rows if rows else [line for _, line in table_v1.set_rows(sets[0])[:FALLBACK]]


def main(argv=None):
    ap = argparse.ArgumentParser()
    sub = ap.add_subparsers(dest="cmd", required=True)
    p = sub.add_parser("rest"); p.add_argument("sets", nargs="+")
    p.add_argument("--exclude", nargs="*", default=[]); p.add_argument("--out", required=True)
    p.add_argument("--listdata")
    p = sub.add_parser("warm"); p.add_argument("run"); p.add_argument("set")
    p.add_argument("--out-dir", required=True); p.add_argument("--base", required=True)
    p.add_argument("--rec-arm", default="sask"); p.add_argument("--move-arm", default="sasvsk")
    p = sub.add_parser("candidate"); p.add_argument("shield_pick"); p.add_argument("poison_pick")
    p.add_argument("--only", required=True); p.add_argument("--warm-dir", required=True)
    p.add_argument("--base", required=True); p.add_argument("--out", required=True)
    p = sub.add_parser("panel"); p.add_argument("sets", nargs="+")
    p.add_argument("--names", nargs="+", required=True); p.add_argument("--out", required=True)
    a = ap.parse_args(argv)

    if a.cmd == "rest":
        rows = rest(a.sets, a.exclude, a.listdata)
        shield_s2.write(a.out, ["# pc-shield-s3 panel: screen rows with no table entry yet.\n"] + rows)
        print(len(rows), "robots")
    elif a.cmd == "warm":
        code, _ = warm(a.run, a.set, a.base, a.out_dir, a.rec_arm, a.move_arm)
        return code
    elif a.cmd == "panel":
        rows = panel(a.sets, [n for f in a.names for n in sorted(names_of(f))])
        shield_s2.write(a.out, ["# pc-shield-s3 verify panel: the robots t4 has a new entry for.\n"] + rows)
        print(len(rows), "robots in the verify panel")
    elif a.cmd == "candidate":
        return candidate(a.shield_pick, a.poison_pick, a.only, a.warm_dir, a.base, a.out)
    return 0


if __name__ == "__main__":
    sys.exit(main())
