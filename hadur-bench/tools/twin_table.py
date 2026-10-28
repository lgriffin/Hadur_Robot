#!/usr/bin/env python3
"""Writes TwinSaor's mode table (TWIN-13, docs/twinsaor.md sections 9 and 11) from a picks file.

The robot keys the table by `name.hashCode() & 127` and ORs the entries at its enemies' slots. A
slot two teams share holds the AND of their modes, so the OR over a team's slots is its own mode
as long as each team's modes survive that; the writer checks every team and fails if one does not.

    python3 tools/twin_table.py --picks ../docs/bench/local/twin-w4-picks.tsv [--key slot0]

Prints the Java string literal for SaorTwin.MODES.
"""
import argparse
import sys
from collections import defaultdict

# The arm a pick names -> its bits in the mode (SaorTwin.MODES).
BITS = {"W1": 0, "W1NF": 1, "W1N2": 2}


def names(path):
    """[(team, name, slot0, slot5)] from twin-arms/names.tsv."""
    out = []
    with open(path, encoding="utf-8") as f:
        for line in f:
            if line.startswith("#") or line.startswith("team\t") or not line.strip():
                continue
            team, name, slot0, slot5, _ = line.rstrip("\n").split("\t")
            out.append((team, name, int(slot0), int(slot5)))
    return out


def picks(path):
    """{team: mode} from a twin_pick.py picks file; an arm with no bits here is an error."""
    out = {}
    with open(path, encoding="utf-8") as f:
        for line in f:
            if line.strip():
                team, arm = line.rstrip("\n").split("\t")
                if arm not in BITS:
                    raise ValueError("arm %s has no bits in the robot (%s)" % (arm, ", ".join(BITS)))
                out[team] = BITS[arm]
    return out


def table(rows, modes, column=2):
    """The 128 slot entries, and the teams whose OR over their slots is not their mode."""
    slot = defaultdict(lambda: None)
    for r in rows:
        m = modes.get(r[0], 0)
        s = r[column]
        slot[s] = m if slot[s] is None else slot[s] & m
    entries = [slot[i] or 0 for i in range(128)]
    wrong = []
    for team in sorted(set(r[0] for r in rows)):
        got = 0
        for r in rows:
            if r[0] == team:
                got |= entries[r[column]]
        if got != modes.get(team, 0):
            wrong.append(team)
    return entries, wrong


def literal(entries):
    return '"' + "".join("\\%o" % e for e in entries) + '"'


def main(argv=None):
    p = argparse.ArgumentParser(description=__doc__)
    p.add_argument("--picks", required=True)
    p.add_argument("--names", default="twin-arms/names.tsv")
    p.add_argument("--key", choices=("slot0", "slot5"), default="slot0")
    p.add_argument("--drop", default="", help="arms to leave out of the table (comma-separated)")
    a = p.parse_args(argv)
    drop = set(x for x in a.drop.split(",") if x)
    for arm in drop:
        BITS[arm] = 0
    entries, wrong = table(names(a.names), picks(a.picks), 2 if a.key == "slot0" else 3)
    if wrong:
        print("teams the table cannot tell apart under %s: %s" % (a.key, ", ".join(wrong)), file=sys.stderr)
        return 1
    print(literal(entries))
    return 0


if __name__ == "__main__":
    sys.exit(main())
