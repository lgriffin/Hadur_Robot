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

  team_modes.py screens --counters plans/team-counters.tsv --census team-census46.txt \
      --opponents opponents --base MATEFIRE,HUNT --out-dir work

The per-opponent counters (TMODE-20 to TMODE-24, BENCH-123): `plans/team-counters.tsv` names, for
each team whose code was read, up to three counters (screens s1, s2, s3), each a mode set as
OWN,LINEAR. `screens` writes one table per screen (work/team-counters-s1.java) and the teams it
plays a counter against (work/team-counters-s1.txt). `pick --counters` then reads each
--report s1=... as that screen, and picks for each team the screen whose gain clears --min-mean
and, with --low-end, has its 95% low end above that.

A pick is kept by `lock` only where the table build, on fresh seeds, beat aa against that team
by at least --min-gain points: the 1v1 lesson that a short screen's +6.7 can be -8.9 on confirm.
"""

import argparse
import re
import sys
import zipfile
from pathlib import Path

MODES = ("SOFT", "GANG", "FINISH", "LEARN", "PACK", "SCREEN", "POOL", "DISABLED", "MATEFIRE", "REAR", "WAVES", "HUNT",
         "LINES", "LINESW", "LANEP", "LANEB", "GUNLINE", "OWN", "HEADON", "LINEAR", "FAR", "FARTHER", "PATH", "NEAR",
         "DODGE", "LEAD")

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


def pair_counts(report):
    """Team name to its paired seeds, from a report's `Paired seeds` table (failed battles drop out)."""
    out, inside = {}, False
    for line in Path(report).read_text(encoding="utf-8").splitlines():
        if line.startswith("| Opponent team | Candidate |") and "Paired seeds" in line:
            inside = True
            continue
        if inside:
            if not line.startswith("|"):
                break
            cells = [c.strip() for c in line.strip().strip("|").split("|")]
            if len(cells) >= 4 and cells[3].isdigit():
                out[cells[0]] = int(cells[3])
    return out


def emitted(lines, classes, kept):
    """The teams in `kept` with at least one member class entry among `lines`."""
    put = {l.split('"')[1] for l in lines}
    return {t for t in kept if any(c in put for c in classes.get(t, []))}


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


def java_lines(entries, classes, base=(), shipped=None):
    """`t.put(...)` lines for TeamModes.table(). A class two teams share is left out unless both
    picked the same modes: an unpicked team counts as picking none, since the entry would reach it too.
    Each entry also plays the `base` modes, or, for a class the shipped table already names
    (`shipped`, class to modes), that entry's modes: the line replaces it, so it keeps them."""
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
        modes |= set((shipped or {}).get(c, base))
        listed = ", ".join(f"Mode.{m}" for m in MODES if m in modes)
        lines.append(f'        t.put("{c}", of({listed}));')
    return lines, clashes


def base_modes(spec):
    modes = tuple(m for m in (spec or "").split(",") if m)
    for m in modes:
        if m not in MODES:
            raise SystemExit(f"unknown mode {m}")
    return modes


PUT = re.compile(r'^\s*t\.put\("(?P<cls>[^"]+)",\s*of\((?P<modes>[^)]*)\)\);')


def shipped_table(path):
    """Member class to modes from the `t.put` lines of TeamModes.table() in a Java source."""
    out = {}
    for line in Path(path).read_text(encoding="utf-8").splitlines():
        m = PUT.match(line)
        if m:
            out[m["cls"]] = set(base_modes(m["modes"].replace("Mode.", "").replace(" ", "")))
    return out


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


def counters(path):
    """(screen names, team to {screen: mode tuple}) from a counters TSV; '-' is no counter."""
    lines = [l for l in Path(path).read_text(encoding="utf-8").splitlines()
             if l.strip() and not l.lstrip().startswith("#")]
    head = lines[0].split("\t")
    if head[0] != "team":
        raise SystemExit(f"{path}: the first line must be the header team<TAB>s1...")
    names = head[1:]
    out = {}
    for line in lines[1:]:
        cells = [c.strip() for c in line.split("\t")]
        out[cells[0]] = {}
        for name, cell in zip(names, cells[1:]):
            if cell and cell != "-":
                out[cells[0]][name] = base_modes(cell)
    return names, out


def cmd_screens(a):
    names, table = counters(a.counters)
    rows = census(a.census)
    known = {t for t, _, _ in rows}
    unknown = sorted(set(table) - known)
    if unknown:
        raise SystemExit("counters for teams not in the census: " + ", ".join(unknown))
    classes = classes_for(rows, a.opponents)
    for name in names:
        entries = {t: set(c[name]) for t, c in table.items() if name in c}
        lines, clashes = java_lines(entries, classes, base_modes(a.base))
        if clashes:
            raise SystemExit(f"screen {name}: classes two teams share: " + ", ".join(clashes))
        played = emitted(lines, classes, entries)
        missing = sorted(set(entries) - played)
        if missing:
            raise SystemExit(f"screen {name}: no member classes (jar missing): " + ", ".join(missing))
        write(str(Path(a.out_dir) / f"team-counters-{name}.java"), "\n".join(lines) + "\n")
        set_lines = [f"# Teams screen {name} plays a counter against (team_modes.py screens)"] + [l for t, l, _ in rows if t in played]
        write(str(Path(a.out_dir) / f"team-counters-{name}.txt"), "\n".join(set_lines) + "\n")
        print(f"screen {name}: {len(played)} teams", file=sys.stderr)
    every = [l for t, l, _ in rows if table.get(t)]
    write(str(Path(a.out_dir) / "team-counters-all.txt"),
          "\n".join(["# Teams any screen plays a counter against (team_modes.py screens)"] + every) + "\n")


def cmd_pick(a):
    screens = {}
    names, table = counters(a.counters) if a.counters else ((), {})
    for spec in a.report:
        mode, path = spec.split("=", 1)
        if mode not in MODES and mode not in names:
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
            if a.low_end is not None:
                clears = clears and mean - ci > a.low_end
            if names and mode not in table.get(team, {}):
                clears = False
            if clears and (best is None or mean > best[1]):
                best = (mode, mean, ci)
        if aa:
            cells.append(f"{aa[team][0]:+.1f} ± {aa[team][1]:.1f}" if team in aa else "-")
        if best:
            modes = set(table[team][best[0]]) if names else {best[0]}
            picks[team] = modes
            listed = ",".join(m for m in MODES if m in modes)
            tsv.append(f"{team}\t{listed}\t{best[1]:.2f}\t{best[2]:.2f}")
        label = (f"{best[0]} ({','.join(m for m in MODES if m in picks[team])})" if names else best[0]) if best else ""
        md.append(f"| {team} | " + " | ".join(cells) + f" | {label} |")
    lines, clashes = java_lines(picks, classes, base_modes(a.base), shipped_table(a.shipped) if a.shipped else None)
    missing = [t for t in picks if not classes.get(t)]
    md += ["", f"{len(picks)} of {len(rows)} teams picked a mode."]
    if missing:
        md.append("No member classes (jar missing): " + ", ".join(missing))
    if clashes:
        md.append("Classes two teams share with different picks, left out: " + ", ".join(clashes))
    write(a.out_md, "\n".join(md) + "\n")
    write(a.out_tsv, "\n".join(tsv) + "\n")
    write(a.out_java, "\n".join(lines) + ("\n" if lines else ""))
    played = emitted(lines, classes, picks)
    set_lines = ["# Teams the screen's table plays a mode against (team_modes.py pick)"] + [l for t, l, _ in rows if t in played]
    write(a.out_set, "\n".join(set_lines) + "\n")
    print(f"picked {len(picks)} of {len(rows)} teams", file=sys.stderr)


def cmd_lock(a):
    confirm = paired(a.confirm)
    control = paired(a.control) if a.control else None
    picks = {}
    for line in Path(a.pick_tsv).read_text(encoding="utf-8").splitlines()[1:]:
        if line.strip():
            team, modes = line.split("\t")[:2]
            picks[team] = set(modes.split(","))
    rows = census(a.census)
    classes = classes_for(rows, a.opponents)
    kept = {}
    md = ["# Team mode table: confirmed entries", "",
          f"Kept: the table build's gain on fresh seeds is at least {a.min_gain:+.1f} points"
          + (" against both baselines (its gain over aa less half of bb's)." if control is not None else " over aa."), "",
          "| Team | Mode | Confirm | Kept |", "|---|---|---|---|"]
    for team in picks:
        mean, ci = confirm.get(team, (float("nan"), float("nan")))
        if control is not None:
            cm, cc = control.get(team, (float("nan"), float("nan")))
            mean, ci = mean - cm / 2, (ci * ci + (cc / 2) ** 2) ** 0.5
        keep = mean >= a.min_gain
        if keep:
            kept[team] = picks[team]
        md.append(f"| {team} | {','.join(sorted(picks[team]))} | {mean:+.1f} ± {ci:.1f} | {'yes' if keep else 'no'} |")
    lines, clashes = java_lines(kept, classes, base_modes(a.base))
    played = emitted(lines, classes, kept)
    md += ["", f"{len(kept)} of {len(picks)} picks kept."]
    if clashes:
        md.append("Classes two teams share with different picks, left out: " + ", ".join(clashes))
    if set(kept) - played:
        md.append("Kept but with no table entry (jar missing or class clash), so left out of the gate: "
                  + ", ".join(sorted(set(kept) - played)))
    write(a.out_md, "\n".join(md) + "\n")
    write(a.out_java, "\n".join(lines) + ("\n" if lines else ""))
    set_lines = ["# Teams the locked table plays a mode against (team_modes.py lock)"] + [l for t, l, _ in rows if t in played]
    write(a.out_set, "\n".join(set_lines) + "\n")
    print(f"kept {len(kept)} of {len(picks)} picks", file=sys.stderr)


def cmd_gate(a):
    table = paired(a.report)
    control = paired(a.control) if a.control else {}
    counts = [pair_counts(a.report)] + ([pair_counts(a.control)] if a.control else [])
    teams = [t for t, _, _ in census(a.set)] if a.set else list(table)
    md = ["# Team mode table: gate", "",
          "Each team's gain is the table build's paired gain over aa less half of bb's (A/A), so it is "
          f"scored against both baselines; the projection spreads the sum over {a.teams} teams.", "",
          "| Team | Table vs aa | bb vs aa | Gain |", "|---|---|---|---|"]
    total, var, short = 0.0, 0.0, []
    for team in teams:
        whole = all(c.get(team, 0) >= a.seeds for c in counts) if a.seeds else True
        if team not in table or (a.control and team not in control) or not whole:
            short.append(team)
            md.append(f"| {team} | missing or short of {a.seeds} paired seeds | | |")
            continue
        m, c = table[team]
        cm, cc = control.get(team, (0.0, 0.0))
        g, gc = m - cm / 2, (c * c + (cc / 2) ** 2) ** 0.5
        total += g
        var += gc ** 2
        md.append(f"| {team} | {m:+.1f} ± {c:.1f} | {cm:+.1f} ± {cc:.1f} | {g:+.1f} ± {gc:.1f} |")
    aps, ci = total / a.teams, var ** 0.5 / a.teams
    if short:
        verdict = "INCOMPLETE"
    else:
        verdict = "PASS" if aps >= a.min_aps and aps - ci > 0 else "FAIL"
    md += ["", f"Projected team APS change: **{aps:+.2f} ± {ci:.2f}** ({len(teams) - len(short)} teams, sum {total:+.1f} points over {a.teams}).",
           "The interval treats the two paired gains as independent; both pair with the same aa battles, which makes it wider than the true one.",
           f"Gate: at least {a.min_aps:+.2f} with the 95% low end above zero: **{verdict}**."]
    if short:
        md.append("Not judged: " + ", ".join(short) + " lack a full pairing; rerun the gate steps.")
    write(a.out_md, "\n".join(md) + "\n")
    print(f"projected {aps:+.2f} +/- {ci:.2f}: {verdict}", file=sys.stderr)
    if short:
        raise SystemExit(f"gate incomplete: {', '.join(short)}")


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
    pk.add_argument("--low-end", type=float, help="also require the 95%% low end above this many points")
    pk.add_argument("--counters", help="the per-opponent counters TSV: --report names its screens")
    pk.add_argument("--base", default="", help="modes every entry also plays, as MATEFIRE,HUNT")
    pk.add_argument("--shipped", help="TeamModes.java: a picked team the table already names keeps that entry's modes")
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
    lk.add_argument("--control", help="bb against aa on the confirm's teams and seeds")
    lk.add_argument("--base", default="", help="modes every entry also plays, as MATEFIRE,HUNT")
    lk.add_argument("--out-md")
    lk.add_argument("--out-java")
    lk.add_argument("--out-set")
    sc = sub.add_parser("screens")
    sc.add_argument("--counters", required=True)
    sc.add_argument("--census", required=True)
    sc.add_argument("--opponents", default="opponents")
    sc.add_argument("--base", default="", help="modes every entry also plays, as MATEFIRE,HUNT")
    sc.add_argument("--out-dir", required=True)
    gt = sub.add_parser("gate")
    gt.add_argument("--report", required=True, help="the locked table build against aa")
    gt.add_argument("--control", help="bb against aa on the same teams and seeds")
    gt.add_argument("--teams", type=int, default=46)
    gt.add_argument("--set", help="the gate's team set: every team in it must have a full pairing")
    gt.add_argument("--seeds", type=int, help="paired seeds each team must have in both reports")
    gt.add_argument("--min-aps", type=float, default=0.3)
    gt.add_argument("--out-md")
    a = p.parse_args(argv)
    {"pick": cmd_pick, "lock": cmd_lock, "gate": cmd_gate, "screens": cmd_screens}[a.cmd](a)


if __name__ == "__main__":
    main()
