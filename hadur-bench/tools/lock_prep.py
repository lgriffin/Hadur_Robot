#!/usr/bin/env python3
"""BENCH-244: turn a screen's per-robot picks into a fresh-seed lock run, per lever arm.

  python3 tools/lock_prep.py PICK.tsv PANEL.txt BASE.arms OUTDIR

PICK.tsv is mode_table.py's --out-tsv (robot, arm, gain, ...); PANEL.txt the screen's panel (name | note | jar);
BASE.arms the screen's arms file. Writes into OUTDIR:
  picks-panel.txt   the picked robots' panel lines (empty when nothing is picked)
  <arm>.list        the robots picked for each arm, one per line
  lock.arms         c, aa and every arm with at least one pick, from BASE.arms
  build.sh          the build-ablation.sh calls that rebuild each picked arm with only its own robots
Always exits 0, so a card with no pick carries on to its results PR; the lock and gate steps test
picks-panel.txt for content.

  python3 tools/lock_prep.py --restrict ARMS.tsv OUTDIR PICKED.tsv

keeps the lock's c and aa rows and, for each lever arm, only the rows of the robots picked for it
(OUTDIR/<arm>.list), so the gate judges each robot on its own pick and never on an arm that carries
no line for it.
"""
import os
import sys

# Lever arm suffix -> (build-ablation flavours, the list variables they read).
LEVERS = {
    "mtzl": ("slistadd,szlist", ("SHIELD_ADD", "SHIELD_STILL")),
    "mt": ("slistadd", ("SHIELD_ADD",)),
    "fq": ("fllist", ("FLAT_ON",)),
    "gl": ("gslist", ("GUN_STACK",)),
    "mq": ("mmlist", ("MIMIC_ON",)),
    "x5": ("x5list", ("X5_POWER",)),
    "wl": ("sgolist", ("STOP_GO",)),
    "hl": ("hjlist", ("HEAT_JIT",)),
    "hf": ("hflist", ("HARD_FIRE",)),
    "fp": ("fplist", ("FULL_OFF",)),
    "rp": ("rplist", ("RACE_POWER",)),
    "dg": ("sdodgelist", ("SHOT_DODGE",)),
    "pb": ("pblist", ("POWER_BAND",)),
    "x0": ("sx0list", ("SHIELD_EXIT0",)),
    "mtx0": ("slistadd,sx0list", ("SHIELD_ADD", "SHIELD_EXIT0")),
    "mv": ("smovelist", ("SHIELD_MOVE",)),
    "vj": ("vjlist", ("VEL_JITTER",)),
    "sb": ("sblist", ("SPEED_BAND",)),
    "dp": ("dplist", ("DIST_PIN",)),
    "kl": ("sklist", ("SURF_KEY",)),
    "rh": ("rhlist", ("RAM_HEAVY",)),
    "rwl": ("rwlist", ("RAM_WAIT",)),
    "sp2": ("sdplanlist", ("SHOT_DODGE_PLAN",)),
}

# POW-20: a power-band pick carries its fitted line ("m20 m40 m60 m80 name") from this file, so pb.list
# holds whole lines rather than names.
PB_LINES = os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", "plans", "power-band-lines.txt")


def _pb_name(line):
    p = line.strip().split(" ", 4)
    return p[4] if len(p) == 5 else line.strip()


def _pb_lines(names):
    lines = {_pb_name(l): l.strip() for l in open(PB_LINES) if l.strip() and not l.startswith("#")}
    missing = [n for n in names if n not in lines]
    if missing:
        raise SystemExit("lock_prep: no power-band line for %s in %s" % (", ".join(missing), PB_LINES))
    return [lines[n] for n in names]


# DIST-4: a distance-pin pick carries its pinned distance ("px name") from this file, so dp.list holds whole lines.
DP_LINES = os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", "plans", "dist-pin-lines.txt")


def _dp_name(line):
    p = line.strip().split(" ", 1)
    return p[1] if len(p) == 2 else line.strip()


def _dp_lines(names):
    lines = {_dp_name(l): l.strip() for l in open(DP_LINES) if l.strip() and not l.startswith("#")}
    missing = [n for n in names if n not in lines]
    if missing:
        raise SystemExit("lock_prep: no distance-pin line for %s in %s" % (", ".join(missing), DP_LINES))
    return [lines[n] for n in names]


# SKEY-2: a surf-key pick carries its fitted key ("m1 ... m9 bw name") from this file, so kl.list holds whole lines.
KL_LINES = os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", "plans", "surf-key-lines.txt")


def _kl_name(line):
    p = line.strip().split(" ", 10)
    return p[10] if len(p) == 11 else line.strip()


def _kl_lines(names):
    lines = {_kl_name(l): l.strip() for l in open(KL_LINES) if l.strip() and not l.startswith("#")}
    missing = [n for n in names if n not in lines]
    if missing:
        raise SystemExit("lock_prep: no surf-key line for %s in %s" % (", ".join(missing), KL_LINES))
    return [lines[n] for n in names]


def _list_lines(arm, names):
    return _pb_lines(names) if arm == "pb" else _dp_lines(names) if arm == "dp" else _kl_lines(names) if arm == "kl" else names


def _list_name(arm, line):
    return (_pb_name(line) if arm == "pb" else _dp_name(line) if arm == "dp" else _kl_name(line) if arm == "kl"
            else line.strip())


def main(pick, panel, base_arms, outdir):
    os.makedirs(outdir, exist_ok=True)
    picks = {}
    for line in (open(pick) if os.path.exists(pick) else []):
        p = line.rstrip("\n").split("\t")
        if len(p) >= 2 and p[0].strip() and not line.startswith("#") and p[1] in LEVERS:
            picks.setdefault(p[1], []).append(p[0].strip())
    picked = {n for ns in picks.values() for n in ns}
    rows = [l for l in open(panel) if not l.startswith("#") and l.split("|")[0].strip() in picked]
    with open(os.path.join(outdir, "picks-panel.txt"), "w") as f:
        f.writelines(rows)
    arms = [l for l in open(base_arms) if l.strip() and not l.startswith("#")]
    keep = [l for l in arms if l.split("|")[0].strip() in ("c", "aa") or l.split("|")[0].strip() in picks]
    with open(os.path.join(outdir, "lock.arms"), "w") as f:
        f.write("# Lock arms: c, aa and the arms with picks in %s.\n" % pick)
        f.writelines(keep)
    with open(os.path.join(outdir, "build.sh"), "w") as f:
        f.write("set -e\n")
        for arm in sorted(picks):
            path = os.path.join(outdir, arm + ".list")
            with open(path, "w") as g:
                g.write("".join(n + "\n" for n in _list_lines(arm, picks[arm])))
            flavours, envs = LEVERS[arm]
            f.write("%s bash ./build-ablation.sh %s\n" % (" ".join("%s=%s" % (e, path.replace(os.sep, "/")) for e in envs), flavours))
    print("lock_prep: %d robots, arms %s" % (len(rows), ",".join(sorted(picks)) or "none"))
    return 0


def restrict(arms_tsv, outdir, out):
    lists = {}
    for arm in LEVERS:
        path = os.path.join(outdir, arm + ".list")
        if os.path.exists(path):
            lists[arm] = {_list_name(arm, l) for l in open(path) if l.strip()}
    kept = 0
    with open(arms_tsv) as f, open(out, "w") as g:
        head = f.readline()
        g.write(head)
        cols = head.rstrip("\n").split("\t")
        ai, oi = cols.index("arm"), cols.index("opponent")
        for line in f:
            p = line.rstrip("\n").split("\t")
            if p[ai] in ("c", "aa") or p[oi] in lists.get(p[ai], ()):
                g.write(line)
                kept += 1
    print("lock_prep: kept %d rows" % kept)
    return 0


if __name__ == "__main__":
    if sys.argv[1:2] == ["--restrict"]:
        sys.exit(restrict(*sys.argv[2:5]))
    sys.exit(main(*sys.argv[1:5]))
