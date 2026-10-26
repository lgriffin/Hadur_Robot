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

An entry replaces the default modes for that team, so --base (as MATEFIRE,HUNT, the shipped
default) is added to every entry. --min-mean picks the best mode whose mean alone reaches it, for
screens too short for the interval rule; the confirm and the census then judge the picks.
--control MODE=bb.md names the A/A arm of the card that screened MODE: the mode is then scored
against both of that card's baselines, aa and bb (its paired gain less half the A/A gain), so one
baseline's luck against a team does not make the pick.

  team_modes.py gate --report gate-mk.md --control gate-bb.md --teams 46 --out-md gate.md

`gate` prices a locked table on fresh seeds against the teams it names: each team's gain over
both baselines, summed and spread over all --teams pairings, as a projected team APS change.
The teams the table does not name play the default modes, so they add nothing but noise.

A pick is kept by `lock` only where the table build, on fresh seeds, beat aa against that team
by at least --min-gain points: the 1v1 lesson that a short screen's +6.7 can be -8.9 on confirm.
"""

import argparse
import re
import sys
import zipfile
from pathlib import Path

MODES = ("SOFT", "GANG", "FINISH", "LEARN", "PACK", "SCREEN", "POOL", "DISABLED", "MATEFIRE", "REAR", "WAVES", "HUNT",
         "LINES", "LINESW", "LANEP", "LANEB")

ROW = re.compile(r"^\|\s*(?P<team>[^|]+?)\s*\|\s*[^|]*\|\s*[^|]*\|\s*(?P<mean>[+-]?\d+(?:\.\d+)?)(?:\s*±\s*(?P<ci>\d+(?:\.\d+)?))?\s*\|\s*$")


def paired(report):
    """Team name to (mean, ci) from a report's `Paired A/B` table; ci is inf for a single pair."""
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
            ci = m.group("ci")
            out[m.group("team")] = (float(m.group("mean")), float(ci) if ci else float("inf"))
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


def java_lines(entries, classes, base=()):
    """`t.put(...)` lines for TeamModes.table(). A class two teams share is left out unless both
    picked the same modes: an unpicked team counts as picking none, since the entry would reach it too.
    Each entry also plays the `base` modes."""
    by_class = {}
    for team in classes:
        for c in classes[team]:
            by_class.setdefault(c, set()).add(tuple(sorted(entries.get(team, ()))))
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
        if not modes:
            continue
        modes |= set(base)
        listed = ", ".join(f"Mode.{m}" for m in MODES if m in modes)
        lines.append(f'        t.put("{c}", of({listed}));')
    return lines, clashes


def base_modes(spec):
    modes = tuple(m for m in (spec or "").split(",") if m)
    for m in modes:
        if m not in MODES:
            raise SystemExit(f"unknown mode {m}")
    return modes


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
    for spec in a.control or ():
        mode, path = spec.split("=", 1)
        if mode not in screens:
            raise SystemExit(f"--control {mode}: no --report for it")
        control = paired(path)
        screens[mode] = {t: (m - control[t][0] / 2, (c * c + (control[t][1] / 2) ** 2) ** 0.5)
                         for t, (m, c) in screens[mode].items() if t in control}
    aa = paired(a.aa) if a.aa else {}
    rows = census(a.census)
    classes = classes_for(rows, a.opponents)
    picks = {}
    md = ["# Team mode table: screen picks", "",
          (f"Pick: the mode with the largest paired gain over aa, at least {a.min_mean:+.1f} points." if a.min_mean is not None
           else f"Pick: the mode whose paired gain over aa has its 95% low end above {a.margin:+.1f} points; ties to the larger mean."), "",
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
            clears = mean >= a.min_mean if a.min_mean is not None else mean - ci > a.margin
            if clears and (best is None or mean > best[1]):
                best = (mode, mean, ci)
        if aa:
            cells.append(f"{aa[team][0]:+.1f} ± {aa[team][1]:.1f}" if team in aa else "-")
        if best:
            picks[team] = {best[0]}
            tsv.append(f"{team}\t{best[0]}\t{best[1]:.2f}\t{best[2]:.2f}")
        md.append(f"| {team} | " + " | ".join(cells) + f" | {best[0] if best else ''} |")
    lines, clashes = java_lines(picks, classes, base_modes(a.base))
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
    lines, clashes = java_lines(kept, classes, base_modes(a.base))
    md += ["", f"{len(kept)} of {len(picks)} picks kept."]
    if clashes:
        md.append("Classes two teams share with different picks, left out: " + ", ".join(clashes))
    write(a.out_md, "\n".join(md) + "\n")
    write(a.out_java, "\n".join(lines) + ("\n" if lines else ""))
    set_lines = ["# Teams whose pick the confirm kept (team_modes.py lock)"] + [l for t, l, _ in rows if t in kept]
    write(a.out_set, "\n".join(set_lines) + "\n")
    print(f"kept {len(kept)} of {len(picks)} picks", file=sys.stderr)


def cmd_gate(a):
    table = paired(a.report)
    control = paired(a.control) if a.control else {}
    md = ["# Team mode table: gate", "",
          "Each team's gain is the table build's paired gain over aa less half of bb's (A/A), so it is "
          f"scored against both baselines; the projection spreads the sum over {a.teams} teams.", "",
          "| Team | Table vs aa | bb vs aa | Gain |", "|---|---|---|---|"]
    total, var = 0.0, 0.0
    for team, (m, c) in table.items():
        cm, cc = control.get(team, (0.0, 0.0))
        g, gc = m - cm / 2, (c * c + (cc / 2) ** 2) ** 0.5
        total += g
        var += (gc if gc != float("inf") else 0.0) ** 2
        md.append(f"| {team} | {m:+.1f} ± {c:.1f} | {cm:+.1f} ± {cc:.1f} | {g:+.1f} ± {gc:.1f} |")
    aps, ci = total / a.teams, var ** 0.5 / a.teams
    passed = aps >= a.min_aps and aps - ci > 0
    md += ["", f"Projected team APS change: **{aps:+.2f} ± {ci:.2f}** ({len(table)} teams, sum {total:+.1f} points over {a.teams}).",
           f"Gate: at least {a.min_aps:+.2f} with the 95% low end above zero: **{'PASS' if passed else 'FAIL'}**."]
    write(a.out_md, "\n".join(md) + "\n")
    print(f"projected {aps:+.2f} +/- {ci:.2f}: {'PASS' if passed else 'FAIL'}", file=sys.stderr)


def main(argv=None):
    p = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    sub = p.add_subparsers(dest="cmd", required=True)
    pk = sub.add_parser("pick")
    pk.add_argument("--report", action="append", required=True, help="MODE=report.md, one per screen")
    pk.add_argument("--aa", help="the A/A report, shown beside the screens")
    pk.add_argument("--census", required=True)
    pk.add_argument("--opponents", default="opponents")
    pk.add_argument("--margin", type=float, default=0.0)
    pk.add_argument("--control", action="append", help="MODE=bb.md, the A/A arm of the card that screened MODE")
    pk.add_argument("--min-mean", type=float, help="pick on the mean alone, at least this many points")
    pk.add_argument("--base", default="", help="modes every entry also plays, as MATEFIRE,HUNT")
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
    lk.add_argument("--base", default="", help="modes every entry also plays, as MATEFIRE,HUNT")
    lk.add_argument("--out-md")
    lk.add_argument("--out-java")
    lk.add_argument("--out-set")
    gt = sub.add_parser("gate")
    gt.add_argument("--report", required=True, help="the locked table build against aa")
    gt.add_argument("--control", help="bb against aa on the same teams and seeds")
    gt.add_argument("--teams", type=int, default=46)
    gt.add_argument("--min-aps", type=float, default=0.3)
    gt.add_argument("--out-md")
    a = p.parse_args(argv)
    {"pick": cmd_pick, "lock": cmd_lock, "gate": cmd_gate}[a.cmd](a)


if __name__ == "__main__":
    main()
