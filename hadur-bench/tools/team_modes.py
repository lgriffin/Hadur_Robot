#!/usr/bin/env python3
"""The team mode table (T7, TMODE-1): pick each opposing team's modes from per-mode screens.

Each screen is a paired team bench report (`## Paired A/B` table) of one mode forced on against
every team, paired with the aa build. For each team the pick is the mode whose paired gain has
its 95% low end above --margin; ties go to the larger mean. A team's entry is keyed by its
members' classes, read from the `.team` file in its jar.

  team_modes.py pick --report SOFT=a.md --report GANG=b.md ... --census team-census46.txt \
      --opponents opponents --out-md pick.md --out-java work/team-modes-screen.java \
      --out-set work/team-modes-confirm.txt --out-tsv pick.tsv
  team_modes.py lock --confirm confirm.md --pick-tsv pick.tsv --census team-census46.txt \
      --opponents opponents --min-gain 1.0 --out-md lock.md --out-java work/team-modes-locked.java

A pick is kept by `lock` only where the table build, on fresh seeds, beat aa against that team
by at least --min-gain points: the 1v1 lesson that a short screen's +6.7 can be -8.9 on confirm.
"""

import argparse
import re
import sys
import zipfile
from pathlib import Path

MODES = ("SOFT", "GANG", "FINISH", "LEARN")

ROW = re.compile(r"^\|\s*(?P<team>[^|]+?)\s*\|\s*[^|]*\|\s*[^|]*\|\s*(?P<mean>[+-]?\d+(?:\.\d+)?)\s*±\s*(?P<ci>\d+(?:\.\d+)?)\s*\|\s*$")


def paired(report):
    """Team name to (mean, ci) from a report's `Paired A/B` table."""
    out = {}
    inside = False
    for line in Path(report).read_text(encoding="utf-8").splitlines():
        if line.startswith("## Paired A/B"):
            inside = True
            continue
        if inside and line.startswith("## "):
            break
        if not inside:
            continue
        if line.startswith("| Opponent team | Candidate |") and "Paired seeds" in line:
            break
        m = ROW.match(line)
        if m and not m.group("team").startswith("**"):
            out[m.group("team")] = (float(m.group("mean")), float(m.group("ci")))
    if not out:
        raise SystemExit(f"{report}: no paired rows")
    return out


def census(path):
    """(team name, census line, jar) for each team in a census file."""
    rows = []
    for line in Path(path).read_text(encoding="utf-8").splitlines():
        if not line.strip() or line.lstrip().startswith("#"):
            continue
        parts = [p.strip() for p in line.split("|")]
        rows.append((parts[0], line, parts[2] if len(parts) > 2 else ""))
    return rows


def member_classes(jar):
    """The member classes a team jar's .team file lists, without versions."""
    with zipfile.ZipFile(jar) as z:
        for n in z.namelist():
            if n.endswith(".team"):
                for line in z.read(n).decode("utf-8", "replace").splitlines():
                    if line.startswith("team.members="):
                        members = line.split("=", 1)[1].split(",")
                        return sorted({m.strip().split(" ")[0] for m in members if m.strip()})
    return []


def java_lines(entries, classes):
    """`t.put(...)` lines for TeamModes.table(); a class two teams share with different modes is left out."""
    by_class = {}
    for team, modes in entries.items():
        for c in classes.get(team, []):
            by_class.setdefault(c, set()).add(tuple(sorted(modes)))
    lines, clashes = [], []
    for c in sorted(by_class):
        picks = by_class[c]
        if len(picks) > 1:
            clashes.append(c)
            continue
        modes = set(next(iter(picks)))
        flags = ", ".join("true" if m in modes else "false" for m in MODES)
        lines.append(f'        t.put("{c}", forced({flags}));')
    return lines, clashes


def write(path, text):
    if path:
        Path(path).parent.mkdir(parents=True, exist_ok=True)
        Path(path).write_text(text, encoding="utf-8")


def classes_for(rows, opponents):
    out = {}
    for team, _, jar in rows:
        p = Path(opponents) / jar
        out[team] = member_classes(p) if jar and p.exists() else []
    return out


def cmd_pick(a):
    screens = {}
    for spec in a.report:
        mode, path = spec.split("=", 1)
        if mode not in MODES:
            raise SystemExit(f"unknown mode {mode}")
        screens[mode] = paired(path)
    aa = paired(a.aa) if a.aa else {}
    rows = census(a.census)
    classes = classes_for(rows, a.opponents)
    picks = {}
    md = ["# Team mode table: screen picks", "",
          f"Pick: the mode whose paired gain over aa has its 95% low end above {a.margin:+.1f} points; ties to the larger mean.", "",
          "| Team | " + " | ".join(screens) + (" | A/A |" if aa else " |") + " Pick |",
          "|---|" + "---|" * len(screens) + ("---|" if aa else "") + "---|"]
    tsv = ["team\tmodes\tmean\tci"]
    for team, _, _ in rows:
        cells, best = [], None
        for mode, r in screens.items():
            if team not in r:
                cells.append("-")
                continue
            mean, ci = r[team]
            cells.append(f"{mean:+.1f} ± {ci:.1f}")
            if mean - ci > a.margin and (best is None or mean > best[1]):
                best = (mode, mean, ci)
        if aa:
            cells.append(f"{aa[team][0]:+.1f} ± {aa[team][1]:.1f}" if team in aa else "-")
        if best:
            picks[team] = {best[0]}
            tsv.append(f"{team}\t{best[0]}\t{best[1]:.2f}\t{best[2]:.2f}")
        md.append(f"| {team} | " + " | ".join(cells) + f" | {best[0] if best else ''} |")
    lines, clashes = java_lines(picks, classes)
    missing = [t for t in picks if not classes.get(t)]
    md += ["", f"{len(picks)} of {len(rows)} teams picked a mode."]
    if missing:
        md.append("No member classes (jar missing): " + ", ".join(missing))
    if clashes:
        md.append("Classes two teams share with different picks, left out: " + ", ".join(clashes))
    write(a.out_md, "\n".join(md) + "\n")
    write(a.out_tsv, "\n".join(tsv) + "\n")
    write(a.out_java, "\n".join(lines) + ("\n" if lines else ""))
    set_lines = ["# Teams whose screen picked a mode (team_modes.py pick)"] + [l for t, l, _ in rows if t in picks]
    write(a.out_set, "\n".join(set_lines) + "\n")
    print(f"picked {len(picks)} of {len(rows)} teams", file=sys.stderr)


def cmd_lock(a):
    confirm = paired(a.confirm)
    picks = {}
    for line in Path(a.pick_tsv).read_text(encoding="utf-8").splitlines()[1:]:
        if line.strip():
            team, modes = line.split("\t")[:2]
            picks[team] = set(modes.split(","))
    rows = census(a.census)
    classes = classes_for(rows, a.opponents)
    kept = {}
    md = ["# Team mode table: confirmed entries", "",
          f"Kept: the table build beat aa by at least {a.min_gain:+.1f} points on fresh seeds.", "",
          "| Team | Mode | Confirm | Kept |", "|---|---|---|---|"]
    for team in picks:
        mean, ci = confirm.get(team, (float("nan"), float("nan")))
        keep = mean >= a.min_gain
        if keep:
            kept[team] = picks[team]
        md.append(f"| {team} | {','.join(sorted(picks[team]))} | {mean:+.1f} ± {ci:.1f} | {'yes' if keep else 'no'} |")
    lines, clashes = java_lines(kept, classes)
    md += ["", f"{len(kept)} of {len(picks)} picks kept."]
    if clashes:
        md.append("Classes two teams share with different picks, left out: " + ", ".join(clashes))
    write(a.out_md, "\n".join(md) + "\n")
    write(a.out_java, "\n".join(lines) + ("\n" if lines else ""))
    print(f"kept {len(kept)} of {len(picks)} picks", file=sys.stderr)


def main(argv=None):
    p = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    sub = p.add_subparsers(dest="cmd", required=True)
    pk = sub.add_parser("pick")
    pk.add_argument("--report", action="append", required=True, help="MODE=report.md, one per screen")
    pk.add_argument("--aa", help="the A/A report, shown beside the screens")
    pk.add_argument("--census", required=True)
    pk.add_argument("--opponents", default="opponents")
    pk.add_argument("--margin", type=float, default=0.0)
    pk.add_argument("--out-md")
    pk.add_argument("--out-tsv")
    pk.add_argument("--out-java")
    pk.add_argument("--out-set")
    lk = sub.add_parser("lock")
    lk.add_argument("--confirm", required=True)
    lk.add_argument("--pick-tsv", required=True)
    lk.add_argument("--census", required=True)
    lk.add_argument("--opponents", default="opponents")
    lk.add_argument("--min-gain", type=float, default=1.0)
    lk.add_argument("--out-md")
    lk.add_argument("--out-java")
    a = p.parse_args(argv)
    {"pick": cmd_pick, "lock": cmd_lock}[a.cmd](a)


if __name__ == "__main__":
    main()
