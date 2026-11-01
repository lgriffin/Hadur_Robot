#!/usr/bin/env python3
"""Ship a mode-table pick onto master's 1v1 tables (BENCH-162).

A pick TSV (mode_table.py --out-tsv: name, arm, ...) names one arm per robot. Each arm code is
the build-ablation suffixes of the list ablations it was built from, and this applies the same
edits to the real sources that build-ablation.sh applies to a candidate build:

  mt  slistadd  the robot joins ShieldListData
  md  slistdrop the robot leaves ShieldListData (stop-and-go picks only, when it is listed)
  zl  szlist    ShieldTableData.stills()
  x0  sx0list   ShieldTableData.exitOffs()
  wl  sgolist   ShieldTableData.stopGos()
  wm  sgo2list  ShieldTableData.stopGoShifts()

Usage: ship_picks.py PICK.tsv [--only NAMES.txt] [--label "comment"] [--root REPO]
"""

import argparse
import json
import os
import sys

TABLE = {"zl": "stills", "x0": "exitOffs", "wl": "stopGos", "wm": "stopGoShifts"}
CODES = ("mt", "md", "zl", "x0", "wl", "wm")


def parts(arm):
    """Split an arm code such as mtzl or mdwl into its suffixes."""
    out, i = [], 0
    while i < len(arm):
        c = arm[i:i + 2]
        if c not in CODES:
            raise ValueError("arm %s: unknown suffix at %s" % (arm, arm[i:]))
        out.append(c)
        i += 2
    return out


def read_picks(path, only=None):
    picks = []
    for line in open(path):
        if not line.strip() or line.startswith("#"):
            continue
        p = line.rstrip("\n").split("\t")
        if only is not None and p[0] not in only:
            continue
        picks.append((p[0], p[1]))
    return picks


def entry(name):
    return "            %s,\n" % json.dumps(name)


def body(ts, method):
    head = ts.index("static String[] %s()" % method)
    return ts[head:ts.index("        };", head)]


def apply(picks, listdata, tabledata, label):
    ls, ts = open(listdata).read(), open(tabledata).read()
    added = {k: [] for k in CODES}
    for name, arm in picks:
        codes = parts(arm)
        listed = ls.count(entry(name)) == 1
        if "mt" in codes:
            if listed:
                raise SystemExit("%s is already on the shield list" % name)
            added["mt"].append(name)
        if "md" in codes:
            if listed:
                added["md"].append(name)
                ls = ls.replace(entry(name), "")
        for c in codes:
            if c in TABLE and entry(name) not in body(ts, TABLE[c]):
                added[c].append(name)
    if added["mt"]:
        k = ls.rindex("        };")
        ls = ls[:k] + "            // %s\n" % label + "".join(entry(n) for n in added["mt"]) + ls[k:]
    for c, method in TABLE.items():
        if not added[c]:
            continue
        head = ts.index("static String[] %s()" % method)
        k = ts.index("        };", head)
        ts = ts[:k] + "            // %s\n" % label + "".join(entry(n) for n in added[c]) + ts[k:]
    open(listdata, "w").write(ls)
    open(tabledata, "w").write(ts)
    return added


def main(argv=None):
    ap = argparse.ArgumentParser()
    ap.add_argument("picks")
    ap.add_argument("--only", help="a file of names (first column) to keep from the pick")
    ap.add_argument("--label", default="shipped pick")
    ap.add_argument("--root", default=os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", ".."))
    a = ap.parse_args(argv)
    only = None
    if a.only:
        only = {l.split("\t")[0].strip() for l in open(a.only) if l.strip() and not l.startswith("#")}
    src = os.path.join(a.root, "hadur-robot", "src", "main", "java", "hadur117")
    added = apply(read_picks(a.picks, only), os.path.join(src, "ShieldListData.java"),
                  os.path.join(src, "ShieldTableData.java"), a.label)
    for c in CODES:
        if added[c]:
            print("%s %d: %s" % (c, len(added[c]), ", ".join(added[c])))


if __name__ == "__main__":
    sys.exit(main())
