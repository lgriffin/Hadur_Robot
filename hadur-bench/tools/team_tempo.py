#!/usr/bin/env python3
"""Where a team's ticks go: the tempo read (BENCH-259), from a team bench's bullets.log and deaths.log.

The Ogi mirror (BENCH-166) found OgiTeam and HadurTeam deal the same damage a round, HadurTeam in 42% more ticks,
and the same against SittingDroidTeam, which does no damage to either (296 ticks against 419). This tool reads two
subjects fought against the same teams and seeds and splits each one's damage a tick into four factors:

    damage a fight tick = guns alive x shots a gun-tick x hit rate x damage a hit

- round length: the turn of the round's last bullet or death; kill 1..5: the mean turn of each enemy death;
- fight ticks: the round's turns from GUN_COOL (the guns start hot), the one clock all four factors share;
- guns alive: the subject's living members, averaged over the fight ticks. The roster is every member that fired,
  died, or was alive at an enemy's fire, so a member is missed only if it did none of those in the whole battle;
- shots a gun-tick, and duty: the share of those gun-ticks a gun spent cooling a shot it had fired
  (10 x (1 + power / 5) turns a shot, cut at its owner's death and the round's end), so 100% is a gun that fires
  the turn it cools;
- hit rate and damage a hit: on enemies only;
- overkill: the subject's shots that hit nobody and whose target (the living enemy nearest the bullet's heading
  within AIMED_DEG at the fire) died while the bullet was in flight;
- own hits: the subject's bullets that hit one of its own members, and their damage;
- first shot: the mean turn of the subject's first shot, and the mean range of its shots in the first OPENING turns.

    python3 tools/team_tempo.py --a "OgiTeam=cz.libors=work/tempo-ogi" --b "HadurTeam=hadur117=work/tempo-hadur" > report.md

Each subject is LABEL=PREFIX=RUN: PREFIX picks its members from the logs' robot names, RUN is walked for battle
directories that hold bullets.log, deaths.log and the bench's team-done.txt, which it writes only beside a battle
that read back as a good result. Only (team, seed) battles both subjects finished are read.
Standard library only.
"""
import argparse
import collections
import math
import os
import re
import sys

AIMED_DEG = 25.0
GUN_COOL = 30
OPENING = 100
KILLS = 5
DONE = "team-done.txt"


def damage(p):
    return 4 * p + (2 * (p - 1) if p > 1 else 0)


def cooling(p):
    return math.ceil(10 * (1 + p / 5.0))


def norm(a):
    return (a + math.pi) % (2 * math.pi) - math.pi


def team_seed(d):
    """('mn.CombatTeam_3.25.0', '7300') from a battle directory name '<team>-<seed>[-baseline]'."""
    m = re.match(r"(.*)-(\d+)(-baseline)?$", os.path.basename(d.rstrip("/")))
    return (m.group(1), m.group(2)) if m else (os.path.basename(d.rstrip("/")), "")


def battles(run):
    out = {}
    for root, _dirs, files in os.walk(run):
        if "bullets.log" in files and "deaths.log" in files and DONE in files:
            out[team_seed(root)] = root
    return out


def target(x, y, heading, speed, enemies):
    """(name, range) of the living enemy nearest the bullet's heading at the fire, or None beyond AIMED_DEG."""
    sx, sy = x - speed * math.sin(heading), y - speed * math.cos(heading)
    best = None
    for e in enemies.split(";"):
        try:
            name, ex, ey, _h, _v = e.rsplit(":", 4)
            ex, ey = float(ex), float(ey)
        except ValueError:
            continue
        off = abs(norm(heading - math.atan2(ex - sx, ey - sy)))
        if best is None or off < best[0]:
            best = (off, name, math.hypot(ex - sx, ey - sy))
    if best is None or math.degrees(best[0]) > AIMED_DEG:
        return None
    return best[1], best[2]


def read(d, subj, acc):
    """Adds one battle directory to acc (a Counter)."""
    deaths = collections.defaultdict(list)
    for line in open(os.path.join(d, "deaths.log"), encoding="utf-8"):
        f = line.strip().split(",", 5)
        if len(f) == 6:
            deaths[int(f[0])].append((int(f[1]), f[3] == "1", f[5]))
    rows = [l.rstrip("\n").split(",") for l in open(os.path.join(d, "bullets.log"), encoding="utf-8")]
    ends, members = collections.Counter(), set()
    for f in rows:
        if len(f) < 5:
            continue
        ends[int(f[0])] = max(ends[int(f[0])], int(f[1]))
        if f[4].startswith(subj):
            members.add(f[4])
        elif f[2] == "F" and len(f) > 9:
            # An enemy's fire lists the subject's living members: one that never fires or dies is still a gun.
            for m in ",".join(f[9:]).split(";"):
                name = m.rsplit(":", 4)[0]
                if name.startswith(subj):
                    members.add(name)
    for r, ev in deaths.items():
        for t, mine, name in ev:
            ends[r] = max(ends[r], t)
            if mine:
                members.add(name)
    size = max(len(members), 1)
    shots, hit = {}, set()
    first = {}
    for f in rows:
        if len(f) < 7:
            continue
        r, t, kind, bid, owner = int(f[0]), int(f[1]), f[2], f[3], f[4]
        if not owner.startswith(subj):
            continue
        if kind == "F":
            p, x, y, h = float(f[5]), float(f[6]), float(f[7]), float(f[8])
            enemies = ",".join(f[10:]) if len(f) > 10 else ""
            tg = target(x, y, h, 20 - 3 * p, enemies) if enemies else None
            shots[(r, bid)] = (t, p, tg)
            acc["shots"] += 1
            acc["power"] += p
            gone = min([dt for dt, mine, name in deaths[r] if mine and name == owner] + [ends[r]])
            acc["cooling"] += max(0, min(t + cooling(p), gone) - max(t, GUN_COOL))
            first.setdefault(r, t)
            if t <= OPENING and tg:
                acc["opening shots"] += 1
                acc["opening range"] += tg[1]
        elif kind == "H":
            victim, p = f[5], float(f[6])
            hit.add((r, bid))
            if victim.startswith(subj):
                acc["own hits"] += 1
                acc["own damage"] += damage(p)
            else:
                acc["hits"] += 1
                acc["dealt"] += damage(p)
    for (r, bid), (t, p, tg) in shots.items():
        if (r, bid) in hit or not tg:
            continue
        flight = tg[1] / (20 - 3 * p) + 2
        if any(not mine and name == tg[0] and t < dt <= t + flight for dt, mine, name in deaths[r]):
            acc["overkill"] += 1
            acc["overkill energy"] += p
    for r, end in ends.items():
        acc["rounds"] += 1
        acc["ticks"] += end
        if r in first:
            acc["first shot"] += first[r]
            acc["first shot rounds"] += 1
        mine = sorted(t for t, m, _ in deaths[r] if m)
        gun_ticks = 0
        for i in range(size):
            until = mine[i] if i < len(mine) else end
            gun_ticks += max(0, until - GUN_COOL)
        acc["gun ticks"] += gun_ticks
        acc["fight ticks"] += max(0, end - GUN_COOL)
        for k, t in enumerate(sorted(t for t, m, _ in deaths[r] if not m)[:KILLS]):
            acc["kill %d" % (k + 1)] += t
            acc["kills %d" % (k + 1)] += 1


def factors(a):
    """(damage a fight tick, guns alive, shots a gun-tick, hit rate, damage a hit, duty) of an accumulator.

    The first is the product of the next four: each is over the same fight ticks."""
    if not a["fight ticks"] or not a["gun ticks"] or not a["shots"] or not a["hits"]:
        return None
    return (a["dealt"] / a["fight ticks"], a["gun ticks"] / a["fight ticks"], a["shots"] / a["gun ticks"],
            a["hits"] / a["shots"], a["dealt"] / a["hits"], a["cooling"] / a["gun ticks"])


def row(label, a):
    f = factors(a)
    n = max(a["rounds"], 1)
    kills = " | ".join("%.0f" % (a["kill %d" % k] / a["kills %d" % k]) if a["kills %d" % k] else "-"
                       for k in range(1, KILLS + 1))
    return "| %s | %d | %.0f | %s | %s | %s | %s | %.2f | %s | %s | %.1f | %.0f | %s | %s |" % (
        label, a["rounds"], a["ticks"] / n, kills,
        "%.2f" % f[1] if f else "-", "%.0f%%" % (100 * f[5]) if f else "-", "%.1f%%" % (100 * f[3]) if f else "-",
        a["power"] / max(a["shots"], 1), "%.1f" % f[4] if f else "-",
        "%.1f%%" % (100.0 * a["overkill"] / a["shots"]) if a["shots"] else "-",
        a["own hits"] / n, a["own damage"] / n,
        "%.0f" % (a["first shot"] / a["first shot rounds"]) if a["first shot rounds"] else "-",
        "%.0f" % (a["opening range"] / a["opening shots"]) if a["opening shots"] else "-")


HEAD = ("| %s | Rounds | Round length | Kill 1 | Kill 2 | Kill 3 | Kill 4 | Kill 5 | Guns alive | Duty | Hit rate | "
        "Power | Damage a hit | Overkill shots | Own hits a round | Own damage a round | First shot | Opening range |")


def report(a_label, b_label, per_team, total):
    md = ["# Where the ticks go: %s beside %s (BENCH-259)" % (a_label, b_label), "",
          "Battles both subjects finished: %d. Duty is the share of a living gun's turns, after turn %d, spent cooling "
          "a shot it fired. Overkill is the share of shots that hit nobody and whose target died while they flew."
          % (total["n"], GUN_COOL), "", "## All teams", "", HEAD % "Subject", "|---|" + "---:|" * 17,
          row(a_label, total["a"]), row(b_label, total["b"]), ""]
    fa, fb = factors(total["a"]), factors(total["b"])
    if fa and fb:
        md += ["## The four factors of damage a fight tick", "",
               "| | %s | %s | Ratio |" % (a_label, b_label), "|---|---:|---:|---:|"]
        for name, i, fmt in (("Damage a fight tick", 0, "%.3f"), ("Guns alive", 1, "%.2f"), ("Shots a gun-tick", 2, "%.4f"),
                             ("Hit rate", 3, "%.3f"), ("Damage a hit", 4, "%.2f")):
            md.append("| %s | %s | %s | %.2f |" % (name, fmt % fa[i], fmt % fb[i], fa[i] / fb[i] if fb[i] else 0))
        md += ["", "A fight tick is a turn of the round from turn %d, when the guns have cooled. The last four ratios "
               "multiply to the first: the largest is where %s's extra ticks go." % (GUN_COOL, b_label), ""]
    md += ["## Per opposing team", "", HEAD % "Team, subject", "|---|" + "---:|" * 17]
    for team in sorted(per_team):
        md.append(row("%s, %s" % (team, a_label), per_team[team]["a"]))
        md.append(row("%s, %s" % (team, b_label), per_team[team]["b"]))
    return "\n".join(md) + "\n"


def subject(s):
    parts = s.split("=", 2)
    if len(parts) != 3:
        raise argparse.ArgumentTypeError("LABEL=PREFIX=RUN")
    return parts


def main(argv=None):
    ap = argparse.ArgumentParser()
    ap.add_argument("--a", type=subject, required=True, help="LABEL=PREFIX=RUN of the first subject")
    ap.add_argument("--b", type=subject, required=True, help="LABEL=PREFIX=RUN of the second subject")
    ap.add_argument("--out")
    args = ap.parse_args(argv)
    ba, bb = battles(args.a[2]), battles(args.b[2])
    both = sorted(set(ba) & set(bb))
    if not both:
        sys.exit("team_tempo.py: no battle finished by both subjects under %s and %s" % (args.a[2], args.b[2]))
    per_team = collections.defaultdict(lambda: {"a": collections.Counter(), "b": collections.Counter()})
    total = {"a": collections.Counter(), "b": collections.Counter(), "n": len(both)}
    for key in both:
        for side, run, subj in (("a", ba, args.a[1]), ("b", bb, args.b[1])):
            one = collections.Counter()
            read(run[key], subj, one)
            per_team[key[0]][side].update(one)
            total[side].update(one)
    text = report(args.a[0], args.b[0], per_team, total)
    if args.out:
        with open(args.out, "w", encoding="utf-8") as f:
            f.write(text)
    else:
        sys.stdout.write(text)


if __name__ == "__main__":
    main()
