#!/usr/bin/env python3
"""BENCH-162: write the confirm panel of a pick TSV (mode_table.py --out-tsv).

  python3 tools/pick_panel.py PICK.tsv PANEL.txt OUT.txt

Keeps PANEL's lines (name | note | jar) whose robot the pick TSV's first column names, in PANEL's order.
Exits 1 when no robot is picked, so a card stops before building a confirm arm with nothing in it.
"""
import sys


def main(pick, panel, out):
    picked = {l.split("\t")[0].strip() for l in open(pick) if l.strip() and not l.startswith("#")}
    rows = [l for l in open(panel) if not l.startswith("#") and l.split("|")[0].strip() in picked]
    if not rows:
        print("pick_panel: no robot picked in %s" % pick, file=sys.stderr)
        return 1
    with open(out, "w") as f:
        f.write("# Confirm panel: the robots %s picks, from %s.\n" % (pick, panel))
        f.writelines(rows)
    print("pick_panel: %d robots -> %s" % (len(rows), out))
    return 0


if __name__ == "__main__":
    if len(sys.argv) != 4:
        sys.exit(__doc__)
    sys.exit(main(*sys.argv[1:]))
