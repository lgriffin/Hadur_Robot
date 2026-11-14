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
"""
import os
import sys

# Lever arm suffix -> (build-ablation flavours, the list variables they read).
LEVERS = {
    "mtzl": ("slistadd,szlist", ("SHIELD_ADD", "SHIELD_STILL")),
    "fq": ("fllist", ("FLAT_ON",)),
    "gl": ("gslist", ("GUN_STACK",)),
    "mq": ("mmlist", ("MIMIC_ON",)),
    "x5": ("x5list", ("X5_POWER",)),
    "wl": ("sgolist", ("STOP_GO",)),
    "hl": ("hjlist", ("HEAT_JIT",)),
    "rp": ("rplist", ("RACE_POWER",)),
}


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
                g.write("".join(n + "\n" for n in picks[arm]))
            flavours, envs = LEVERS[arm]
            f.write("%s bash ./build-ablation.sh %s\n" % (" ".join("%s=%s" % (e, path) for e in envs), flavours))
    print("lock_prep: %d robots, arms %s" % (len(rows), ",".join(sorted(picks)) or "none"))
    return 0


if __name__ == "__main__":
    sys.exit(main(*sys.argv[1:5]))
