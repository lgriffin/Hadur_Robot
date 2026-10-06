#!/usr/bin/env python3
"""Export a melee bench run's per-battle standings to one flat TSV.

bench-melee-top20 leaves, per field, battles/melee-<seed>[-baseline]/melee.csv holding the
final standings of that battle. One row per (field, seed, build, entrant) is written.

  python3 data/tools/export_melee.py --work hadur-bench/work/melee-top20-... \
      --build 3.8 --baseline-build 3.7 --out data/bench/<date>_hadur-melee-top20_local_cold.tsv

Standard library only. Values are copied verbatim.
"""

import argparse
import csv
import os
import re
import sys

BATTLE = re.compile(r"^melee-(\d+)(-baseline)?$")


def rows(work, build, baseline_build):
    for field in sorted(os.listdir(work)):
        battles = os.path.join(work, field, "battles")
        if not os.path.isdir(battles):
            continue
        for name in sorted(os.listdir(battles), key=lambda n: (int(BATTLE.match(n).group(1)) if BATTLE.match(n) else 0, n)):
            m = BATTLE.match(name)
            path = os.path.join(battles, name, "melee.csv")
            if not m or not os.path.isfile(path):
                continue
            label = baseline_build if m.group(2) else build
            if not label:
                continue
            with open(path, newline="", encoding="utf-8") as fh:
                for r in csv.DictReader(fh):
                    yield [field, m.group(1), label] + [r[k] for k in ("rank", "robot", "score", "firsts", "survival", "bulletDamage")]


def main():
    p = argparse.ArgumentParser(description=__doc__.splitlines()[0])
    p.add_argument("--work", required=True)
    p.add_argument("--build", required=True)
    p.add_argument("--baseline-build", default="")
    p.add_argument("--out", required=True)
    a = p.parse_args()
    n = 0
    with open(a.out, "w", newline="", encoding="utf-8") as fh:
        w = csv.writer(fh, delimiter="\t", lineterminator="\n")
        w.writerow(["field", "seed", "build", "rank", "robot", "score", "firsts", "survival", "bulletDamage"])
        for row in rows(a.work, a.build, a.baseline_build):
            w.writerow(row)
            n += 1
    print(f"wrote {n} rows to {a.out}")
    return 0 if n else 1


if __name__ == "__main__":
    sys.exit(main())
