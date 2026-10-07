#!/usr/bin/env python3
"""Say whether two bench runs were made under conditions that make their numbers comparable.

The conditions that move a result are the rounds per battle, the Robocode engine, the child JVM
heap, the CPU constant, the parallel width and the CPUs given to each child. A value that is
blank on either side is unknown and is never counted as a difference.

  python3 data/tools/compare_conditions.py RUN_A RUN_B

RUN is a bench work directory or a conditions.json (written by hadur-bench since BENCH-51).
Exit 1 when the runs are not comparable, 0 otherwise.

Standard library only.
"""

import json
import re
import sys
from pathlib import Path

KEYS = ["rounds", "engine", "child_heap", "cpu_constant", "parallel", "child_cpus"]
LABELS = {"rounds": "rounds per battle", "engine": "engine", "child_heap": "child heap (MB)",
          "cpu_constant": "CPU constant", "parallel": "parallel width", "child_cpus": "CPUs per child"}
UNCAPPED = "uncapped"


def heap_mb(text):
    """'2G', '2048m', '-Xmx2G' -> '2048'; 'uncapped' stays; anything else is unknown ('')."""
    t = str(text or "").strip().lower().removeprefix("-xmx")
    if t == UNCAPPED:
        return UNCAPPED
    m = re.fullmatch(r"(\d+)([kmg]?)", t)
    if not m:
        return ""
    n = int(m.group(1)) * {"": 1 / (1024 * 1024), "k": 1 / 1024, "m": 1, "g": 1024}[m.group(2)]
    return str(int(round(n)))


def digits(value):
    m = re.search(r"\d+", str(value if value is not None else ""))
    return m.group(0) if m else ""


def from_conditions(c):
    """The six condition values, as strings with '' for unknown, from a parsed conditions.json."""
    heap = ""
    if c.get("childHeap"):
        heap = heap_mb(c["childHeap"])
    elif "childFlags" in c:
        heap = next((heap_mb(f) for f in c["childFlags"] if str(f).lower().startswith("-xmx")), UNCAPPED)
    cpu = re.search(r"cpu\.constant=(\d+)", str(c.get("cpuConstant", "")))
    return {"rounds": digits(c.get("rounds")), "engine": str(c.get("engine") or ""),
            "child_heap": heap, "cpu_constant": cpu.group(1) if cpu else "",
            "parallel": digits(c.get("parallel")), "child_cpus": digits(c.get("childCpus"))}


def from_catalog_row(row):
    """The six values from a data/catalog.tsv row; old rows lack the columns and read as unknown."""
    out = {k: (row.get(k) or "").strip() for k in KEYS}
    out["child_heap"] = heap_mb(out["child_heap"])
    return out


def normalise(c):
    """Accept a conditions.json dict, a catalog-style dict, or a path to either; return the six values."""
    if isinstance(c, (str, Path)):
        return load(c)
    if "childFlags" in c or "cpuConstant" in c or "childCpus" in c:
        return from_conditions(c)
    return from_catalog_row(c)


def load(path):
    p = Path(path)
    if p.is_dir():
        p = p / "conditions.json"
    return from_conditions(json.loads(p.read_text(encoding="utf-8")))


def compare(conditions_a, conditions_b):
    """-> {"comparable": bool, "differences": [str]}; only values known on both sides can differ."""
    a, b = normalise(conditions_a), normalise(conditions_b)
    diffs = [f"{LABELS[k]}: {a[k]} vs {b[k]}" for k in KEYS if a[k] and b[k] and a[k] != b[k]]
    return {"comparable": not diffs, "differences": diffs}


def catalog_suffix(work):
    """Tab-joined values for the six trailing data/catalog.tsv columns, or None without conditions.json."""
    if not (Path(work) / "conditions.json").is_file():
        return None
    c = load(work)
    return "\t".join(c[k] for k in KEYS)


def catalog_note(work):
    """The line the exporters print so the catalog row can carry the run's conditions."""
    suffix = catalog_suffix(work)
    if suffix is None:
        return "no conditions.json in %s: leave the catalog's condition columns blank (unknown)" % work
    return "catalog condition columns (rounds, engine, child_heap MB, cpu_constant, parallel, child_cpus): " + suffix.replace(chr(9), ", ")


def main(argv=None):
    args = (sys.argv[1:] if argv is None else argv)
    if len(args) != 2:
        print(__doc__.split("\n\n")[0] + "\n\nusage: compare_conditions.py RUN_A RUN_B", file=sys.stderr)
        return 2
    result = compare(load(args[0]), load(args[1]))
    if result["comparable"]:
        print("comparable: no known condition differs")
    else:
        print("not comparable:")
        for d in result["differences"]:
            print("  " + d)
    return 0 if result["comparable"] else 1


if __name__ == "__main__":
    sys.exit(main())
