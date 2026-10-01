#!/usr/bin/env python3
"""BENCH-6: draw the session bench's opponents from the rumble's participant list.

Reads the archive-mirror jar URLs of a saved participants page and the latest rankings
table, draws N distinct robots with a fixed seed, and writes them in the bench's set format
(`name | aps | jar`), the role column carrying the robot's rumble APS (`?` when unranked).
Hadur's own releases are left out.

    python3 data/tools/sample_session.py [--n 300] [--seed 20261001]
"""
import argparse
import random
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]
PARTICIPANTS = ROOT / "data/rumble/parsed/2026-09-28T1929Z_robowiki_participants_jars.txt"
RANKINGS = ROOT / "data/rumble/parsed/2026-09-30T1145Z_roborumble_rankings.tsv"
OUT = ROOT / "hadur-bench/session-300-opponents.txt"


def robot_name(jar):
    """`pkg.Class_1.2.jar` is the robot `pkg.Class 1.2`: the version follows the last underscore."""
    stem = jar[:-4] if jar.endswith(".jar") else jar
    head, sep, version = stem.rpartition("_")
    return f"{head} {version}" if sep else stem


def load_aps(path):
    aps = {}
    for line in path.read_text().splitlines()[1:]:
        cols = line.split("\t")
        if len(cols) >= 3:
            aps[cols[1]] = cols[2]
    return aps


def sample(jars, aps, n, seed):
    jars = sorted(j for j in jars if not j.startswith("hadur2."))
    chosen = random.Random(seed).sample(jars, min(n, len(jars)))
    return [(robot_name(j), aps.get(robot_name(j), "?"), j) for j in chosen]


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--n", type=int, default=300)
    ap.add_argument("--seed", type=int, default=20261001)
    args = ap.parse_args()
    jars = [u.rsplit("/", 1)[1] for u in PARTICIPANTS.read_text().split() if u.endswith(".jar")]
    rows = sample(jars, load_aps(RANKINGS), args.n, args.seed)
    header = (f"# BENCH-6 session sample: {len(rows)} of {len(jars)} rumble participants, seed {args.seed},\n"
              "# drawn by data/tools/sample_session.py. name | rumble APS (? = unranked) | jar in opponents/\n")
    OUT.write_text(header + "".join(f"{n} | {a} | {j}\n" for n, a, j in rows))
    print(f"wrote {OUT} ({len(rows)} robots)")


if __name__ == "__main__":
    main()
