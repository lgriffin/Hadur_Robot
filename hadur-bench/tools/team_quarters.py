"""Close-quarters fire on HadurTeam, per opposing team, from a team bench run's bullets.log.

For pc-team-quarters (BENCH-225, TMODE-45). Every enemy bullet's F record lists our living
members with their positions at the fire; the bullet is aimed at the member whose bearing from
the muzzle is nearest its heading, if within AIMED_DEG degrees, and its distance is the distance
to that member then. Reads every battle directory under RUN/battles and writes a markdown table
per opposing team, the run's candidate battles beside its baseline (aa) battles:

- rounds;
- aimed enemy bullet damage a round, and the part fired from under NEAR px;
- the hit rate of the aimed shots fired from under NEAR px, and how many there were.

Usage: python3 tools/team_quarters.py [--ours PREFIX] [--near PX] RUN [RUN...] > report.md
"""
import argparse
import collections
import glob
import math
import os
import sys

OURS = ("hadur2.", "hadur117.Hadur")
AIMED_DEG = 25.0
NEAR = 150.0


def damage(power):
    """The engine's bullet damage."""
    return 4 * power + max(0.0, 2 * (power - 1))


def opponent(dirname):
    """'cz.libors.OgiTeam_v1-3-baseline' -> 'cz.libors.OgiTeam': the seed, then the version after
    the last underscore, so a class name with an underscore of its own stays whole."""
    name = dirname[:-len("-baseline")] if dirname.endswith("-baseline") else dirname
    return name.rsplit("-", 1)[0].rsplit("_", 1)[0]


def aimed(x, y, heading, members):
    """Distance to the member the bullet was aimed at, or None: `members` is the F record's
    `name:x:y:heading:velocity` list; headings are radians, 0 north, clockwise."""
    best = None
    for m in members.split(";"):
        parts = m.rsplit(":", 4)
        if len(parts) != 5:
            continue
        mx, my = float(parts[1]), float(parts[2])
        bearing = math.atan2(mx - x, my - y)
        off = abs((bearing - heading + math.pi) % (2 * math.pi) - math.pi)
        if best is None or off < best[0]:
            best = (off, math.hypot(mx - x, my - y))
    if best is None or math.degrees(best[0]) > AIMED_DEG:
        return None
    return best[1]


def battle(d, ours=OURS, near=NEAR):
    """One battle's counts: rounds, aimed damage, near damage, near shots, near hits."""
    c = collections.Counter()
    path = os.path.join(d, "rounds.csv")
    if os.path.exists(path):
        with open(path, encoding="utf-8") as fh:
            c["rounds"] = max(0, sum(1 for line in fh if line.strip()) - 1)
    shots = {}
    with open(os.path.join(d, "bullets.log"), encoding="utf-8") as fh:
        for line in fh:
            f = line.rstrip("\n").split(",")
            if len(f) < 7:
                continue
            rnd, kind, bid = f[0], f[2], f[3]
            if kind == "F" and len(f) >= 10 and not f[4].startswith(ours) and f[9] != "-":
                dist = aimed(float(f[6]), float(f[7]), float(f[8]), ",".join(f[9:]))
                if dist is None:
                    continue
                shots[(rnd, bid)] = dist
                if dist < near:
                    c["near_shots"] += 1
            elif kind == "H" and (rnd, bid) in shots and f[5].startswith(ours):
                dmg = damage(float(f[6]))
                c["aimed"] += dmg
                if shots[(rnd, bid)] < near:
                    c["near"] += dmg
                    c["near_hits"] += 1
    return c


def read(runs, ours=OURS, near=NEAR):
    """{opponent: {'candidate': Counter, 'baseline': Counter}} over every battle of `runs`."""
    out = collections.defaultdict(lambda: {"candidate": collections.Counter(), "baseline": collections.Counter()})
    for run in runs:
        for d in sorted(glob.glob(os.path.join(run, "battles", "*"))):
            if not os.path.exists(os.path.join(d, "bullets.log")):
                continue
            side = "baseline" if d.endswith("-baseline") else "candidate"
            out[opponent(os.path.basename(d))][side].update(battle(d, ours, near))
    return out


def cells(c):
    rounds = c["rounds"]
    if not rounds:
        return ["-"] * 4
    rate = f"{100 * c['near_hits'] / c['near_shots']:.1f}% of {c['near_shots']}" if c["near_shots"] else "-"
    return [str(rounds), f"{c['aimed'] / rounds:.1f}", f"{c['near'] / rounds:.1f}", rate]


def report(runs, ours=OURS, near=NEAR):
    table = read(runs, ours, near)
    if not table:
        sys.exit("team_quarters.py: no team battles under " + ", ".join(runs))
    md = ["# Close-quarters fire on HadurTeam", "",
          f"Aimed: an enemy bullet whose heading is within {AIMED_DEG:.0f} degrees of a living member at the fire. "
          f"Near: fired from under {near:.0f} px of that member. Damage is bullet damage on our members a round.", "",
          "| Team | Rounds | Aimed | Near | Near hit rate | aa rounds | aa aimed | aa near | aa near hit rate | Near change |",
          "|---|---|---|---|---|---|---|---|---|---|"]
    for team in sorted(table):
        c, b = table[team]["candidate"], table[team]["baseline"]
        change = "-"
        if c["rounds"] and b["rounds"] and b["near"]:
            change = f"{100 * (c['near'] / c['rounds'] - b['near'] / b['rounds']) / (b['near'] / b['rounds']):+.0f}%"
        md.append("| " + " | ".join([team] + cells(c) + cells(b) + [change]) + " |")
    return "\n".join(md) + "\n"


def main(argv=None):
    ap = argparse.ArgumentParser()
    ap.add_argument("--ours", action="append", help="our members' class prefix (default: Hadur's)")
    ap.add_argument("--near", type=float, default=NEAR)
    ap.add_argument("runs", nargs="+")
    a = ap.parse_args(argv)
    sys.stdout.write(report(a.runs, tuple(a.ours) if a.ours else OURS, a.near))


if __name__ == "__main__":
    main()
