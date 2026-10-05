"""Where a bench run's battles are, and how a run is named on the command line.

A run is one build of Hadur against one opponent. `hadur-bench --out DIR` writes its battles
under `DIR/battles/<opponent>-<seed>/`. Ten seeds were often run as two jobs of five, so a run
is a label and one or more `battles` directories:

    base=work/base/battles
    lead=work/l0/battles,work/l0b/battles

A bare directory is its own label.
"""

import csv
import os

# The six builds of the 4 and 5 October 2026 session, in report order: label, the directories'
# names in that session, and what the build changes.
SESSION = [
    ("released", ["base"], "3.5.1 as released"),
    ("lead-aware", ["l0", "l0b"], "lead-aware power"),
    ("lead-aware-sampled", ["l2", "l2b"], "lead-aware power, sampled aim"),
    ("random-gun", ["g1"], "random gun"),
    ("all-chaff", ["c0"], "all chaff"),
    ("hold-fire", ["p0"], "hold fire"),
]


def parse(spec):
    """`label=dir[,dir...]` or `dir` -> (label, [dirs])."""
    if "=" in spec:
        label, dirs = spec.split("=", 1)
        return label, [d for d in dirs.split(",") if d]
    return os.path.basename(os.path.normpath(spec)), [spec]


def session(work):
    """The session's six runs as specs, given the directory its `--out` directories sit in."""
    return ["%s=%s" % (label, ",".join(os.path.join(work, d, "battles") for d in dirs))
            for label, dirs, _ in SESSION]


def seed_of(battle_dir):
    return int(os.path.basename(os.path.normpath(battle_dir)).rsplit("-", 1)[1])


def result_row(battle_dir):
    """The battle's result.csv row, or None when the battle did not finish."""
    path = os.path.join(battle_dir, "result.csv")
    if not os.path.exists(path):
        return None
    with open(path, encoding="utf-8", newline="") as f:
        rows = list(csv.DictReader(f))
    return rows[0] if rows else None


def battles(dirs):
    """Every finished battle directory under the run's `battles` directories, by seed."""
    found = []
    for d in dirs:
        for name in os.listdir(d):
            b = os.path.join(d, name)
            if os.path.isdir(b) and result_row(b) is not None:
                found.append(b)
    return sorted(found, key=seed_of)
