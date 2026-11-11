#!/usr/bin/env python3
"""The 1v1 field ledger: one row per robot, joining what three sources say about it.

- the name ledger (tools/name_ledger.py: Hadur's live score and eight rivals' against every shared robot);
- a whole-field trace read against BeepBoop (data/tools/learn_trace.py's per-opponent table: the hit rate and
  damage a round on Hadur and on BeepBoop, and the rank band);
- what master ships for the robot (ShieldListData.java: the shield list; ShieldTableData.java: every per-robot table).

Each robot gets a class from the trace (close: its bullets hit Hadur 10% of the time or more; mid: 5 to 10%; low:
under 5%), a status (shield, lever, surfkey, untouched) and one route by its gap to BeepBoop and its class:

  R1 rebuild    BeepBoop leads by 10 points or more: worked one robot at a time
  R5 hold       the gap is under 0.5 or Hadur leads: the guard set, no route may lose here
  R2 chaser     close class            R3 keys   mid class            R4 portfolio   low class or no trace row

Rows are sorted by the gap to BeepBoop, largest first. aps_bb is the gap over the robots in the ledger.
Refresh it after each release, once name-ledger.tsv is rebuilt from the new live pages:

  python3 tools/field_ledger.py --names name-ledger.tsv \\
      --trace ../docs/bench/local/2026-11-10_learn-trace-field-read.md \\
      --tables ../hadur-robot/src/main/java/hadur117/ShieldTableData.java \\
      --shield ../hadur-robot/src/main/java/hadur117/ShieldListData.java --out field-ledger.tsv

Standard library only.
"""
import argparse
import csv
import re
import sys
from collections import Counter, defaultdict

RIVALS = ("bb", "ds", "sg", "sr", "ns", "dm", "jh", "og")
COLUMNS = ["name", "route", "status", "levers", "cls", "band", "battles", "hadur", "bb", "best", "best_rival", "median8",
           "gap_bb", "gap_best", "gap_median", "aps_bb", "hit_us", "hit_bb", "dmg_us", "dmg_bb"]


def tables(tables_java, shield_java):
    """{table name: [the quoted strings of its method]}; the shield list as table 'shield'."""
    out = {}
    src = open(tables_java, encoding="utf-8").read()
    for m in re.finditer(r"static String\[\] (\w+)\(\) \{(.*?)\n    \}", src, re.S):
        out[m.group(1)] = re.findall(r'"([^"]+)"', m.group(2))
    shield = open(shield_java, encoding="utf-8").read().split("static String[] lines()", 1)
    out["shield"] = re.findall(r'"([^"]+)"', shield[1]) if len(shield) > 1 else []
    return out


def robot_in(line, names):
    """The ledger robot a table line names: a line is 'name version', with values before it (surf keys) or after."""
    t = line.split()
    for k in (2, 3, 1):
        for cand in (" ".join(t[-k:]), " ".join(t[:k])):
            if cand in names:
                return cand
    return None


def trace(path):
    """{opponent slug: band, hit rate and damage a round on Hadur (c) and on BeepBoop (bb)} from the per-opponent table."""
    out, inside = {}, False
    for line in open(path, encoding="utf-8"):
        if line.startswith("## Per opponent"):
            inside = True
            continue
        if inside and line.startswith("## "):
            break
        if inside and line.startswith("| ") and not line.startswith("| opponent"):
            f = [x.strip() for x in line.strip().strip("|").split("|")]
            try:
                out[f[0]] = {"band": int(f[1]), "hit_us": float(f[3]), "hit_bb": float(f[4]),
                             "dmg_us": float(f[8]), "dmg_bb": float(f[9])}
            except (ValueError, IndexError):
                pass
    return out


def slug(name):
    """'a.B c 1.0' -> 'a.B_c_1.0', as the bench names a robot's folder."""
    return re.sub(r"[^A-Za-z0-9.]+", "_", name)


def status(shield, levers):
    if shield:
        return "shield"
    if any(x != "surfKeys" for x in levers):
        return "lever"
    return "surfkey" if levers else "untouched"


def route(gap, cls):
    if gap >= 10:
        return "R1 rebuild"
    if gap < 0.5:
        return "R5 hold"
    return {"close": "R2 chaser", "mid": "R3 keys"}.get(cls, "R4 portfolio")


def build(names_tsv, trace_md, tables_java, shield_java):
    led = list(csv.DictReader(open(names_tsv, encoding="utf-8"), delimiter="\t"))
    names = {r["name"] for r in led}
    carried = defaultdict(list)
    for table, lines in tables(tables_java, shield_java).items():
        for line in lines:
            n = robot_in(line, names)
            if n:
                carried[n].append(table)
    tr = trace(trace_md)
    rows = []
    for r in led:
        name = r["name"]
        t = tr.get(slug(name))
        hadur, bb, best = float(r["hadur"]), float(r["bb"]), float(r["best"])
        ranked = sorted((float(r[k]) for k in RIVALS), reverse=True)
        median = (ranked[3] + ranked[4]) / 2
        has = carried.get(name, [])
        cls = "-"
        if t:
            cls = "close" if t["hit_us"] >= 0.10 else "mid" if t["hit_us"] >= 0.05 else "low"
        gap = round(bb - hadur, 1)
        rows.append({
            "name": name, "route": route(gap, cls), "status": status("shield" in has, [x for x in has if x != "shield"]),
            "levers": ",".join(x for x in has if x != "shield"), "cls": cls, "band": t["band"] if t else "",
            "battles": int(r["battles"]), "hadur": hadur, "bb": bb, "best": best, "best_rival": r["best_rival"],
            "median8": round(median, 1), "gap_bb": gap, "gap_best": round(best - hadur, 1),
            "gap_median": round(median - hadur, 1), "aps_bb": round(gap / len(led), 4),
            "hit_us": t["hit_us"] if t else "", "hit_bb": t["hit_bb"] if t else "",
            "dmg_us": t["dmg_us"] if t else "", "dmg_bb": t["dmg_bb"] if t else ""})
    rows.sort(key=lambda r: -r["gap_bb"])
    return rows


def main(argv=None):
    ap = argparse.ArgumentParser()
    ap.add_argument("--names", required=True, help="name-ledger.tsv")
    ap.add_argument("--trace", required=True, help="the whole-field trace read (learn_trace.py), markdown")
    ap.add_argument("--tables", required=True, help="ShieldTableData.java")
    ap.add_argument("--shield", required=True, help="ShieldListData.java")
    ap.add_argument("--out", required=True)
    a = ap.parse_args(argv)
    rows = build(a.names, a.trace, a.tables, a.shield)
    with open(a.out, "w", newline="", encoding="utf-8") as f:
        w = csv.DictWriter(f, fieldnames=COLUMNS, delimiter="\t", lineterminator="\n")
        w.writeheader()
        w.writerows(rows)
    n = len(rows)
    by = Counter(r["route"] for r in rows)
    print("%d robots; BeepBoop leads by %+.2f APS; %s" % (
        n, sum(r["gap_bb"] for r in rows) / n,
        ", ".join("%s %d (%+.2f)" % (k, by[k], sum(r["gap_bb"] for r in rows if r["route"] == k) / n) for k in sorted(by))),
        file=sys.stderr)


if __name__ == "__main__":
    main()
