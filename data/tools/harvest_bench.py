#!/usr/bin/env python3
"""Harvest every bench report under docs/bench/ into two flat tables.

The bench writes one markdown report per run. Each report is readable on its own, but
comparing runs means opening dozens of files. This script pulls the per-opponent duel
tables, the melee summaries and the melee standings out of every report and writes:

  data/bench/duel-history.tsv   one row per (report, table, opponent)
  data/bench/melee-history.tsv  one row per (report, table) melee summary of Hadur
  data/bench/melee-field.tsv    one row per (report, table, robot) melee standings

Standard library only, and nothing in the Maven build reads its output. Rerun it after
adding a report:

  python3 data/tools/harvest_bench.py            # rewrite both files
  python3 data/tools/harvest_bench.py --check    # exit 1 if they are stale
"""

import argparse
import csv
import io
import os
import re
import sys

ROOT = os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))
REPORTS = os.path.join(ROOT, "docs", "bench")
OUT = os.path.join(ROOT, "data", "bench")

DUEL_COLUMNS = [
    "report", "robot", "version", "mode", "section", "table", "opponent", "role",
    "score_share", "score_ci", "survival_share", "survival_ci",
    "bullet_damage_share", "bullet_damage_ci", "rounds_won", "rounds",
    "our_hit_rate", "our_hit_ci", "their_hit_rate", "their_hit_ci",
    "skipped_turns", "faults", "turn_p95_ms", "turn_max_ms",
]

MELEE_COLUMNS = [
    "report", "robot", "version", "section", "table",
    "aps", "survival", "rounds_won", "rounds", "mean_place", "score_share", "bullet_damage",
]

FIELD_COLUMNS = [
    "report", "robot", "version", "section", "table",
    "entrant", "mean_place", "score_share", "firsts",
]

# Report header cell -> the output columns it fills.
PERCENT_CELLS = {
    "Score share": ("score_share", "score_ci"),
    "Survival share": ("survival_share", "survival_ci"),
    "Bullet-damage share": ("bullet_damage_share", "bullet_damage_ci"),
    "Our hit rate": ("our_hit_rate", "our_hit_ci"),
    "Their hit rate": ("their_hit_rate", "their_hit_ci"),
}

# "hadur2.Hadur 2.1 (cold)" in a title, heading or opening sentence names the robot under test.
IDENTITY = re.compile(r"\b([\w.]+\.Hadur)\s+(\d+(?:\.\d+)*)(?:[^|]*?\((cold|warm)\b)?")
PERCENT = re.compile(r"^(-?[\d.]+)%(?:\s*±\s*([\d.]+))?$")
FRACTION = re.compile(r"^(\d+)\s*/\s*(\d+)$")


def cells(line):
    return [c.strip() for c in line.strip().strip("|").split("|")]


def percent(text):
    m = PERCENT.match(text)
    return (m.group(1), m.group(2) or "") if m else ("", "")


def fraction(text):
    m = FRACTION.match(text)
    return (m.group(1), m.group(2)) if m else ("", "")


def tables(lines):
    """Yield (section, (robot, version, mode), header, rows) for each markdown table.

    The robot is the last one named outside a table before it, so a gate report that
    benches several builds attributes each table to the build its heading names.
    """
    section = ""
    identity = ("", "", "")
    i = 0
    while i < len(lines):
        line = lines[i]
        if line.startswith("#"):
            section = line.lstrip("#").strip()
        m = IDENTITY.search(line)
        if m and not line.startswith("|"):
            identity = (m.group(1), m.group(2), m.group(3) or "")
        if line.startswith("|") and i + 1 < len(lines) and re.match(r"^\|[\s:|-]+\|$", lines[i + 1].strip()):
            header = cells(line)
            rows = []
            i += 2
            while i < len(lines) and lines[i].startswith("|"):
                rows.append(cells(lines[i]))
                i += 1
            yield section, identity, header, rows
            continue
        i += 1


def harvest_report(name, text):
    duel, melee, field = [], [], []
    for index, (section, (robot, version, mode), header, rows) in enumerate(
            tables(text.splitlines()), start=1):
        if header[:3] == ["Opponent", "Role", "Score share"]:
            for row in rows:
                if len(row) != len(header):
                    continue
                cell = dict(zip(header, row))
                out = dict.fromkeys(DUEL_COLUMNS, "")
                out.update(report=name, robot=robot, version=version, mode=mode,
                           section=section, table=str(index), opponent=cell["Opponent"],
                           role=cell["Role"])
                for head, (value, ci) in PERCENT_CELLS.items():
                    if head in cell:
                        out[value], out[ci] = percent(cell[head])
                out["rounds_won"], out["rounds"] = fraction(cell.get("Rounds won", ""))
                out["skipped_turns"] = cell.get("Skipped turns", "")
                out["faults"] = cell.get("Faults", "")
                turn = cell.get("Turn p95 / max (ms)", "").split("/")
                if len(turn) == 2:
                    out["turn_p95_ms"], out["turn_max_ms"] = turn[0].strip(), turn[1].strip()
                duel.append(out)
        elif header[:4] == ["APS", "Survival", "Rounds won", "Mean round place"]:
            for row in rows:
                if len(row) != len(header):
                    continue
                cell = dict(zip(header, row))
                out = dict.fromkeys(MELEE_COLUMNS, "")
                out.update(report=name, robot=robot, version=version,
                           section=section, table=str(index), aps=cell["APS"],
                           survival=cell["Survival"], mean_place=cell["Mean round place"],
                           score_share=percent(cell["Score share"])[0],
                           bullet_damage=cell["Bullet damage"].replace(",", ""))
                out["rounds_won"], out["rounds"] = fraction(cell["Rounds won"])
                melee.append(out)
        elif header == ["Robot", "Mean place", "Mean score share", "Firsts"]:
            for row in rows:
                if len(row) != len(header):
                    continue
                field.append(dict(report=name, robot=robot, version=version, section=section,
                                  table=str(index), entrant=row[0], mean_place=row[1],
                                  score_share=percent(row[2])[0], firsts=row[3]))
    return duel, melee, field


def render(columns, rows):
    buf = io.StringIO()
    writer = csv.DictWriter(buf, columns, delimiter="\t", lineterminator="\n")
    writer.writeheader()
    writer.writerows(rows)
    return buf.getvalue()


def harvest(reports_dir=REPORTS):
    duel, melee, field = [], [], []
    for name in sorted(os.listdir(reports_dir)):
        if not name.endswith(".md"):
            continue
        path = os.path.join(reports_dir, name)
        with open(path, encoding="utf-8") as f:
            d, m, fl = harvest_report(name, f.read())
        duel += d
        melee += m
        field += fl
    return (render(DUEL_COLUMNS, duel), render(MELEE_COLUMNS, melee),
            render(FIELD_COLUMNS, field))


def main():
    parser = argparse.ArgumentParser(description=__doc__.splitlines()[0])
    parser.add_argument("--check", action="store_true", help="fail if the outputs are stale")
    args = parser.parse_args()
    outputs = dict(zip(("duel-history.tsv", "melee-history.tsv", "melee-field.tsv"), harvest()))
    stale = []
    for name, content in outputs.items():
        path = os.path.join(OUT, name)
        current = open(path, encoding="utf-8").read() if os.path.exists(path) else None
        if current == content:
            continue
        if args.check:
            stale.append(name)
        else:
            with open(path, "w", encoding="utf-8") as f:
                f.write(content)
            print(f"wrote {os.path.relpath(path, ROOT)} ({content.count(chr(10)) - 1} rows)")
    if stale:
        print("stale: " + ", ".join(stale) + " (run data/tools/harvest_bench.py)", file=sys.stderr)
        return 1
    return 0


if __name__ == "__main__":
    sys.exit(main())
