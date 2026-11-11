"""The states in which melee robots are hit, from a melee run fought with --melee-trace true (BENCH-232).

The melee logs keep no positions, so the reads that found the team's guards (hit rate by distance, by the target's
sideways speed, head-on bullets) could not be made for melee. A trace has every robot and every live bullet each
turn. This tool follows each bullet from the turn it is first seen to the turn it is gone:

- aimed at: the living robot, not the owner, whose bearing from the bullet lies nearest its heading, if within
  AIMED_DEG degrees. The trace first shows a bullet one turn after it was fired, so the bullet is stepped back one
  turn and the robots are read from the turn before: the distance and the target's speed across the shooter's line
  are those of the firing turn;
- guess factor: the bullet's heading less that bearing, over the largest angle the target could reach
  (asin(8 / bullet speed)), signed by the way the target was moving across the line;
- hit: when the bullet is gone, a robot, not the owner, stands within HIT_PX of where it would have been, AND that
  robot's energy fell by at least the bullet's damage on that turn. A trace carries no hit event, so this is
  inferred; the energy test keeps a bullet that ends on a wall beside a robot, or meets another bullet there, from
  counting as a hit.
- not seen: the trace leaves out a bullet that hits on the very turn it is fired, so shots from touching distance
  are missing from both the shots and the hits. The under-150 px column is a floor for every robot alike.

Only bullets first seen with three or more robots alive are counted (the crowd; the last duel is the 1v1's).
Writes, for every robot aimed at --min-shots times or more (--ours first): its hit rate by distance, by sideways
speed and by guess-factor band, and the share of the bullet damage it took that was aimed at another robot.

Usage: python3 tools/melee_states.py RUN [RUN...] [--ours hadur117.Hadur] [--min-shots 2000] --out report.md
"""
import argparse
import collections
import gzip
import math
import os
import sys

AIMED_DEG = 25.0
HIT_PX = 40.0
DIST = (0, 150, 250, 350, 500, 700, 1e9)
LATERAL = (0, 1, 3, 5, 7, 8.01)
GF = (0, 0.2, 0.5, 0.8, 1e9)
LABELS = {"dist": ["under 150", "150-250", "250-350", "350-500", "500-700", "over 700"],
          "lat": ["0-1", "1-3", "3-5", "5-7", "7-8"],
          "gf": ["under 0.2", "0.2-0.5", "0.5-0.8", "over 0.8"]}


def damage(power):
    return 4 * power + max(0.0, 2 * (power - 1))


def band(edges, v):
    for i in range(len(edges) - 1):
        if edges[i] <= v < edges[i + 1]:
            return i
    return len(edges) - 2


def norm(a):
    return (a + math.pi) % (2 * math.pi) - math.pi


def base(name):
    """'cz.libors.Ogi 1.0' -> 'cz.libors.Ogi': rows pool a robot's versions and copies."""
    return name.split(" ")[0]


def records(path):
    """(round, turn, robots, bullets) per T record: robots as (name, x, y, heading, velocity, energy, alive),
    bullets as (owner, x, y, heading, power)."""
    with gzip.open(path, "rt", encoding="utf-8") as f:
        for line in f:
            if not line.startswith("T,"):
                continue
            parts = line.rstrip("\n").split(",")
            robots = []
            for p in parts[3:-1]:
                name, x, y, h, v, e, alive = p.rsplit(":", 6)
                robots.append((name, float(x), float(y), float(h), float(v), float(e), alive == "1"))
            bullets = []
            for b in parts[-1].split("|") if parts[-1] else []:
                owner, x, y, h, pw = b.rsplit(":", 4)
                bullets.append((owner, float(x), float(y), float(h), float(pw)))
            yield int(parts[1]), int(parts[2]), robots, bullets


def aim(bullet, robots):
    """(target name, distance, sideways speed, guess factor) of the robot the bullet was aimed at, or None."""
    owner, x, y, heading, power = bullet
    best = None
    for name, rx, ry, rh, rv, _, alive in robots:
        if not alive or name == owner:
            continue
        bearing = math.atan2(rx - x, ry - y)
        off = norm(heading - bearing)
        if best is None or abs(off) < abs(best[0]):
            best = (off, name, math.hypot(rx - x, ry - y), rv * math.sin(rh - bearing))
    if best is None or math.degrees(abs(best[0])) > AIMED_DEG:
        return None
    off, name, dist, lateral = best
    mea = math.asin(8.0 / (20.0 - 3.0 * power))
    gf = off / mea * (1 if lateral >= 0 else -1)
    return name, dist, abs(lateral), gf


def battle(path, stats):
    """Adds one trace's bullets to stats: {robot: Counter}."""
    live, rnd_now, prev = {}, None, None
    for rnd, _turn, robots, bullets in records(path):
        if rnd != rnd_now:
            live, rnd_now, prev = {}, rnd, None
        # The firing turn's robots: the record before this one (the first record of a round has none).
        then = prev if prev is not None else robots
        energy_then = {r[0]: r[5] for r in then}
        alive = [r for r in then if r[6]]
        seen = set()
        for b in bullets:
            key = (b[0], round(b[3], 4), b[4])
            seen.add(key)
            if key in live:
                live[key]["at"] = (b[1], b[2])
                continue
            step = (20.0 - 3.0 * b[4]) if prev is not None else 0.0
            fired = (b[0], b[1] - step * math.sin(b[3]), b[2] - step * math.cos(b[3]), b[3], b[4])
            shot = {"at": (b[1], b[2]), "aim": aim(fired, then) if len(alive) >= 3 else None, "crowd": len(alive) >= 3}
            live[key] = shot
            if shot["aim"]:
                name, dist, lat, gf = shot["aim"]
                s = stats[base(name)]
                s["shots"] += 1
                s["dist%d" % band(DIST, dist)] += 1
                s["lat%d" % band(LATERAL, lat)] += 1
                s["gf%d" % band(GF, abs(gf))] += 1
        for key in [k for k in live if k not in seen]:
            shot = live.pop(key)
            if not shot["crowd"]:
                continue
            owner, heading, power = key
            speed = 20.0 - 3.0 * power
            nx, ny = shot["at"][0] + speed * math.sin(heading), shot["at"][1] + speed * math.cos(heading)
            victim = None
            for name, rx, ry, _, _, e, _alive in robots:
                if name == owner:
                    continue
                d = math.hypot(rx - nx, ry - ny)
                # A hit takes the bullet's damage off the victim this turn; a wall or a bullet beside it takes none.
                fell = energy_then.get(name, e) - e
                if d <= HIT_PX and fell >= damage(power) - 0.05 and (victim is None or d < victim[0]):
                    victim = (d, name)
            if victim is None:
                continue
            v = stats[base(victim[1])]
            v["damage"] += damage(power)
            if shot["aim"] and shot["aim"][0] == victim[1]:
                _, dist, lat, gf = shot["aim"]
                v["hits"] += 1
                v["hdist%d" % band(DIST, dist)] += 1
                v["hlat%d" % band(LATERAL, lat)] += 1
                v["hgf%d" % band(GF, abs(gf))] += 1
            else:
                v["cross"] += damage(power)
        prev = robots


def read(runs):
    stats = collections.defaultdict(collections.Counter)
    traces = 0
    for run in runs:
        for root, _dirs, files in os.walk(run):
            if "trace.log.gz" in files:
                battle(os.path.join(root, "trace.log.gz"), stats)
                traces += 1
    return stats, traces


def rate(s, kind, i):
    n = s["%s%d" % (kind, i)]
    return "%.1f%%" % (100.0 * s["h%s%d" % (kind, i)] / n) if n >= 50 else "-"


def report(stats, traces, ours, min_shots):
    names = [n for n, s in stats.items() if s["shots"] >= min_shots]
    names.sort(key=lambda n: (not n.startswith(ours), stats[n]["hits"] / stats[n]["shots"]))
    md = ["# The states melee robots are hit in (BENCH-232)", "",
          "%d traces. A bullet is aimed at the living robot nearest its heading (within %.0f degrees) when first seen; "
          "a hit is inferred when it is gone within %.0f px of a robot whose energy fell by its damage that turn. Bullets "
          "that hit on the turn they are fired are not in a trace, so point-blank fire is undercounted for every robot. "
          "Only bullets fired with three or more alive. "
          "Robots aimed at %d times or more, %s first, then by hit rate. A cell under 50 shots is left blank."
          % (traces, AIMED_DEG, HIT_PX, min_shots, ours), ""]
    for kind, title in (("dist", "Hit rate by the distance at the fire (px)"),
                        ("lat", "Hit rate by the target's speed across the shooter's line (px a tick)"),
                        ("gf", "Hit rate by the size of the fired guess factor")):
        labels = LABELS[kind]
        md += ["## " + title, "", "| Robot | Aimed shots | All | " + " | ".join(labels) + " |",
               "|---|---:|---:|" + "---:|" * len(labels)]
        for n in names:
            s = stats[n]
            md.append("| %s | %d | %.1f%% | " % (n, s["shots"], 100.0 * s["hits"] / s["shots"])
                      + " | ".join(rate(s, kind, i) for i in range(len(labels))) + " |")
        md.append("")
    md += ["## Where the shots find each robot, and whose they were", "",
           "| Robot | Shots under 3 px a tick sideways | Shots within 0.2 of head-on | Damage aimed at another robot |",
           "|---|---:|---:|---:|"]
    for n in names:
        s = stats[n]
        md.append("| %s | %.0f%% | %.0f%% | %s |" % (
            n, 100.0 * (s["lat0"] + s["lat1"]) / s["shots"], 100.0 * s["gf0"] / s["shots"],
            "%.0f%%" % (100.0 * s["cross"] / s["damage"]) if s["damage"] else "-"))
    return "\n".join(md) + "\n"


def main(argv=None):
    ap = argparse.ArgumentParser()
    ap.add_argument("runs", nargs="+")
    ap.add_argument("--ours", default="hadur117.Hadur")
    ap.add_argument("--min-shots", type=int, default=2000)
    ap.add_argument("--out", required=True)
    a = ap.parse_args(argv)
    stats, traces = read(a.runs)
    if not traces:
        sys.exit("melee_states.py: no trace.log.gz under " + ", ".join(a.runs) + " (run the bench with --melee-trace true)")
    with open(a.out, "w", encoding="utf-8") as f:
        f.write(report(stats, traces, a.ours, a.min_shots))
    print("%d traces, %d robots reported" % (traces, sum(1 for s in stats.values() if s["shots"] >= a.min_shots)))


if __name__ == "__main__":
    main()
