"""Stray fire in the melee crowd, from a melee run fought with --melee-trace true (BENCH-258).

melee_states.py (BENCH-232) reads the share of a robot's bullet damage that was aimed at another robot: 44% for
Hadur against 27% for ScalarR in the same crowds. This tool reads those stray hits one by one, to say whether the
melee surfer could draw them (docs/bench/melee-top3.md; the plan's read M0). For every hit, with three or more
robots alive at the fire:

- aimed or stray: as melee_states.py, the bullet's target is the living robot, not its owner, nearest its heading
  within 25 degrees on the firing turn; a hit on any other robot is a stray;
- geometry, from where the victim stood on the firing turn: `drove in` when it stood over LANE_PX off the bullet's
  line (it moved into the line while the bullet flew), else `behind` the target, `in front` of it or `beside` it
  (within BESIDE_PX of the target's distance along the line); `no target` when no robot was within 25 degrees;
- dropped: three or more living robots stood nearer the shooter than the victim, so Hadur's surfer (MMOVE-15)
  would give the shot no virtual bullet;
- predictable: head-on or linear aim at the true target, from the firing turn, passes within WIDTH_PX of the
  real bullet at the victim's range. This uses the trace's truth, not Hadur's own scans, so it is a ceiling;
- avoidable: predictable and in flight AVOID_TICKS turns or more, time to step out of a robot's width.

It also reads the lane exposure of each tracked robot (--ours and every --compare): on every SAMPLE-th turn with
three or more alive, the fire that should cross where it stands, summed over every shooter and every other robot
that shooter may be aiming at, by the field's target curve (melee_targets.py), a two-step aim spread round the
line and the robot's width over its distance from the shooter. The report says how much of the stray damage was
taken on turns in the top tenth of that robot's exposure, and each robot's mean exposure.

Usage: python3 tools/melee_strays.py RUN [RUN...] [--ours hadur117.Hadur] [--compare aaa.r.ScalarR] --out report.md
       python3 tools/melee_strays.py seat --suite melee-census-317.txt --fields 12 --robot "NAME VERSION | role | jar"
           --out-dir work/melee-stray-seat --out-suite work/melee-stray-seat.txt
"""
import argparse
import collections
import math
import os
import sys

import melee_states
from melee_states import base, damage, norm, records

LANE_PX = 60.0
BESIDE_PX = 36.0
WIDTH_PX = 36.0
AVOID_TICKS = 10
DROP_NEARER = 3
SAMPLE = 5
# The share of a shooter's shots that go to its nearest robot, its second nearest and so on (melee_targets.py,
# 63,408 shots on twelve traced census fields).
CURVE = (0.41, 0.17, 0.12, 0.09, 0.07, 0.04)
# The largest angle a target can reach against a power-1.9 bullet, and the aim spread round the line to a target
# in that unit: within NEAR of the line, and out to the full angle.
MEA = math.asin(8.0 / (20.0 - 3.0 * 1.9))
NEAR, NEAR_DENSITY, WIDE_DENSITY = 0.15, 3.0, 0.6
GEOMETRY = ("behind", "in front", "beside", "drove in", "no target")
FLIGHT = (0, 10, 20, 40, 1e9)
FLIGHT_LABELS = ("under 10", "10-20", "20-40", "40 or more")
GATE_SHARE = 0.30


def linear_heading(sx, sy, tx, ty, th, tv, speed):
    """The heading from (sx, sy) that meets a robot at (tx, ty) driving straight on at tv along th."""
    x, y = tx, ty
    for t in range(1, 200):
        x += tv * math.sin(th)
        y += tv * math.cos(th)
        if math.hypot(x - sx, y - sy) <= speed * t:
            break
    return math.atan2(x - sx, y - sy)


def geometry(src, heading, victim, target):
    """Where the victim stood on the firing turn, against the bullet's line and its target: one of GEOMETRY."""
    def along_across(p):
        dx, dy = p[0] - src[0], p[1] - src[1]
        return dx * math.sin(heading) + dy * math.cos(heading), abs(dx * math.cos(heading) - dy * math.sin(heading))
    v_along, v_across = along_across(victim)
    if v_across > LANE_PX or v_along <= 0:
        return "drove in"
    if target is None:
        return "no target"
    t_along, _ = along_across(target)
    if v_along > t_along + BESIDE_PX:
        return "behind"
    if v_along < t_along - BESIDE_PX:
        return "in front"
    return "beside"


def predictable(src, heading, power, target, hit_range):
    """Whether head-on or linear aim at the target (x, y, heading, velocity) passes within WIDTH_PX at hit_range."""
    if target is None:
        return False
    tx, ty, th, tv = target
    head_on = math.atan2(tx - src[0], ty - src[1])
    linear = linear_heading(src[0], src[1], tx, ty, th, tv, 20.0 - 3.0 * power)
    off = min(abs(norm(heading - head_on)), abs(norm(heading - linear)))
    return off * hit_range <= WIDTH_PX


def exposure(name, alive):
    """The lane exposure of robot `name` among the living robots (name, x, y, heading, velocity, energy, alive)."""
    me = next((r for r in alive if r[0] == name), None)
    if me is None:
        return None
    total = 0.0
    for s in alive:
        if s[0] == name:
            continue
        others = sorted((r for r in alive if r[0] != s[0]), key=lambda r: math.hypot(r[1] - s[1], r[2] - s[2]))
        mine = math.atan2(me[1] - s[1], me[2] - s[2])
        reach = WIDTH_PX / max(math.hypot(me[1] - s[1], me[2] - s[2]), WIDTH_PX)
        for rank, t in enumerate(others):
            if t[0] == name:
                continue
            u = abs(norm(mine - math.atan2(t[1] - s[1], t[2] - s[2]))) / MEA
            density = NEAR_DENSITY if u <= NEAR else WIDE_DENSITY if u <= 1.0 else 0.0
            total += CURVE[min(rank, len(CURVE) - 1)] * density * reach
    return total


def battle(path, stats, tracked, samples, hit_exposure):
    """Adds one trace to stats ({robot: Counter}), samples ({robot: [exposure]}) and hit_exposure ({robot: [(exposure, damage)]})."""
    live, rnd_now, prev = {}, None, None
    for rnd, turn, robots, bullets in records(path):
        if rnd != rnd_now:
            live, rnd_now, prev = {}, rnd, None
            for r in robots:
                if base(r[0]) in tracked:
                    stats[base(r[0])]["rounds"] += 1
        then = prev if prev is not None else robots
        energy_then = {r[0]: r[5] for r in then}
        alive = [r for r in then if r[6]]
        if len(alive) >= 3 and turn % SAMPLE == 0:
            for r in alive:
                if base(r[0]) in tracked:
                    samples[base(r[0])].append(exposure(r[0], alive))
        seen = collections.defaultdict(list)
        for b in bullets:
            key = (b[0], round(b[3], 3), b[4])
            speed = 20.0 - 3.0 * b[4]
            match = None
            for shot in live.get(key, []):
                if any(shot is s for s in seen[key]):
                    continue
                ex, ey = shot["at"][0] + speed * math.sin(b[3]), shot["at"][1] + speed * math.cos(b[3])
                d = math.hypot(b[1] - ex, b[2] - ey)
                if d <= speed and (match is None or d < match[0]):
                    match = (d, shot)
            if match:
                match[1]["at"] = (b[1], b[2])
                seen[key].append(match[1])
                continue
            step = speed if prev is not None else 0.0
            src = (b[1] - step * math.sin(b[3]), b[2] - step * math.cos(b[3]))
            crowd = len(alive) >= 3
            target = melee_states.aim((b[0], src[0], src[1], b[3], b[4]), then) if crowd else None
            shot = {"at": (b[1], b[2]), "src": src, "turn": turn - 1, "crowd": crowd,
                    "target": target[0] if target else None, "then": alive}
            live.setdefault(key, []).append(shot)
            seen[key].append(shot)
        alive_then = {r[0] for r in alive}
        for key in list(live):
            gone = [shot for shot in live[key] if not any(shot is s for s in seen[key])]
            live[key] = [shot for shot in live[key] if any(shot is s for s in seen[key])]
            if not live[key]:
                del live[key]
            for shot in gone:
                if not shot["crowd"]:
                    continue
                owner, heading, power = key
                speed = 20.0 - 3.0 * power
                nx, ny = shot["at"][0] + speed * math.sin(heading), shot["at"][1] + speed * math.cos(heading)
                victim = None
                for name, rx, ry, _, _, e, _alive in robots:
                    if name == owner or name not in alive_then:
                        continue
                    d = math.hypot(rx - nx, ry - ny)
                    fell = energy_then.get(name, e) - e
                    if d <= melee_states.HIT_PX and fell >= damage(power) - 0.05 and (victim is None or d < victim[0]):
                        victim = (d, name, rx, ry)
                if victim is None:
                    continue
                dmg = damage(power)
                v = stats[base(victim[1])]
                v["damage"] += dmg
                if shot["target"] == victim[1]:
                    v["aimed"] += dmg
                    continue
                v["stray"] += dmg
                v["stray hits"] += 1
                at_fire = {r[0]: r for r in shot["then"]}
                vf = at_fire.get(victim[1])
                tf = at_fire.get(shot["target"]) if shot["target"] else None
                src = shot["src"]
                where = geometry(src, heading, (vf[1], vf[2]) if vf else (victim[2], victim[3]),
                                 (tf[1], tf[2]) if tf else None)
                v["geo " + where] += dmg
                flight = turn - shot["turn"]
                v["flight %d" % melee_states.band(FLIGHT, flight)] += dmg
                shooter = at_fire.get(owner)
                if shooter and vf:
                    mine = math.hypot(vf[1] - shooter[1], vf[2] - shooter[2])
                    nearer = sum(1 for r in shot["then"] if r[0] not in (owner, victim[1])
                                 and math.hypot(r[1] - shooter[1], r[2] - shooter[2]) < mine)
                    if nearer >= DROP_NEARER:
                        v["dropped"] += dmg
                hit_range = math.hypot(victim[2] - src[0], victim[3] - src[1])
                if predictable(src, heading, power, (tf[1], tf[2], tf[3], tf[4]) if tf else None, hit_range):
                    v["predictable"] += dmg
                    if flight >= AVOID_TICKS:
                        v["avoidable"] += dmg
                if base(victim[1]) in tracked and vf:
                    e = exposure(victim[1], shot["then"])
                    if e is not None:
                        hit_exposure[base(victim[1])].append((e, dmg))
        prev = robots


def read(runs, tracked):
    stats = collections.defaultdict(collections.Counter)
    samples, hit_exposure = collections.defaultdict(list), collections.defaultdict(list)
    traces = 0
    for run in runs:
        for root, _dirs, files in os.walk(run):
            if "trace.log.gz" in files:
                battle(os.path.join(root, "trace.log.gz"), stats, tracked, samples, hit_exposure)
                traces += 1
    return stats, samples, hit_exposure, traces


def pct(part, whole):
    return "%.0f%%" % (100.0 * part / whole) if whole else "-"


def top_tenth(samples, hits):
    """(the 90th percentile of the sampled exposures, the share of the stray damage taken at or above it)."""
    if not samples or not hits:
        return None, None
    cut = sorted(samples)[min(len(samples) - 1, int(0.9 * len(samples)))]
    return cut, sum(d for e, d in hits if e >= cut) / sum(d for _, d in hits)


def gate(s):
    """Whether the read says to build the third-party bullets: avoidable strays at GATE_SHARE of stray damage."""
    return s["stray"] > 0 and s["avoidable"] >= GATE_SHARE * s["stray"]


def report(stats, samples, hit_exposure, traces, ours, compare):
    names = [ours] + [c for c in compare if c in stats and c != ours]
    md = ["# Stray fire in the melee crowd (BENCH-258)", "",
          "%d traces. Bullets fired with three or more robots alive. A bullet's target is the living robot nearest "
          "its heading (within %.0f degrees) on the firing turn; a hit on any other robot is a stray. Predictable and "
          "avoidable use the trace's truth, not Hadur's scans, so they are ceilings."
          % (traces, melee_states.AIMED_DEG), "",
          "## Whose bullets hit each robot", "",
          "| Robot | Damage | Aimed at it | Stray | Stray share | Stray a round |", "|---|---:|---:|---:|---:|---:|"]
    for n in names:
        s = stats[n]
        md.append("| %s | %.0f | %.0f | %.0f | %s | %s |" % (
            n, s["damage"], s["aimed"], s["stray"], pct(s["stray"], s["damage"]),
            "%.1f" % (s["stray"] / s["rounds"]) if s["rounds"] else "-"))
    md += ["", "## Where the robot stood when the stray was fired (share of stray damage)", "",
           "| Robot | " + " | ".join(GEOMETRY) + " |", "|---|" + "---:|" * len(GEOMETRY)]
    for n in names:
        md.append("| %s | " % n + " | ".join(pct(stats[n]["geo " + g], stats[n]["stray"]) for g in GEOMETRY) + " |")
    md += ["", "## How long the stray flew, in turns (share of stray damage)", "",
           "| Robot | " + " | ".join(FLIGHT_LABELS) + " |", "|---|" + "---:|" * len(FLIGHT_LABELS)]
    for n in names:
        md.append("| %s | " % n + " | ".join(pct(stats[n]["flight %d" % i], stats[n]["stray"])
                                            for i in range(len(FLIGHT_LABELS))) + " |")
    md += ["", "## Could the surfer draw it (share of stray damage)", "",
           "| Robot | Dropped today (%d or more robots nearer the shooter) | Predictable | Avoidable |" % DROP_NEARER,
           "|---|---:|---:|---:|"]
    for n in names:
        s = stats[n]
        md.append("| %s | %s | %s | %s |" % (n, pct(s["dropped"], s["stray"]), pct(s["predictable"], s["stray"]),
                                             pct(s["avoidable"], s["stray"])))
    md += ["", "## Lane exposure", "",
           "| Robot | Mean exposure | Against %s | Stray damage taken in its top tenth of turns |" % ours,
           "|---|---:|---:|---:|"]
    mine = sum(samples[ours]) / len(samples[ours]) if samples[ours] else None
    for n in names:
        mean = sum(samples[n]) / len(samples[n]) if samples[n] else None
        _, share = top_tenth(samples[n], hit_exposure[n])
        md.append("| %s | %s | %s | %s |" % (
            n, "%.3f" % mean if mean is not None else "-",
            "%.0f%%" % (100.0 * mean / mine) if mean is not None and mine else "-",
            "%.0f%%" % (100.0 * share) if share is not None else "-"))
    s = stats[ours]
    md += ["", "## Verdict", "",
           "Third-party bullets (M1): %s. Avoidable strays are %s of %s's stray damage; the gate is %.0f%%."
           % ("BUILD" if gate(s) else "DO NOT BUILD", pct(s["avoidable"], s["stray"]), ours, 100 * GATE_SHARE)]
    _, share = top_tenth(samples[ours], hit_exposure[ours])
    others = [sum(samples[c]) / len(samples[c]) for c in names[1:] if samples[c]]
    if share is not None:
        lane = share >= 0.30 and bool(others) and mine and min(others) <= 0.7 * mine
        md.append("")
        md.append("Lane risk (M2): %s. The top tenth of turns holds %.0f%% of the stray damage (gate 30%%)%s."
                  % ("BUILD after M1" if lane else "DO NOT BUILD", 100 * share,
                     "; the lowest compared robot stands at %.0f%% of %s's exposure (gate 70%% or less)"
                     % (100 * min(others) / mine, ours) if others and mine else "; no compared robot was traced"))
    return "\n".join(md) + "\n"


def seat(argv):
    """Writes --fields census fields with --robot seated in place of each field's lowest-ranked robot, and a suite."""
    ap = argparse.ArgumentParser(prog="melee_strays.py seat")
    ap.add_argument("--suite", required=True)
    ap.add_argument("--fields", type=int, default=12)
    ap.add_argument("--robot", required=True, help="the set line of the robot to seat: NAME VERSION | role | jar")
    ap.add_argument("--out-dir", required=True)
    ap.add_argument("--out-suite", required=True)
    a = ap.parse_args(argv)
    seated = a.robot.split("|")[0].strip()
    os.makedirs(a.out_dir, exist_ok=True)
    here = os.path.dirname(os.path.abspath(a.suite))
    suite, done = [], 0
    for line in open(a.suite, encoding="utf-8"):
        if done >= a.fields or line.startswith("#") or "|" not in line:
            continue
        label, options = [p.strip() for p in line.split("|", 1)]
        words = options.split()
        field = words[words.index("--set") + 1]
        rows = [r.rstrip("\n") for r in open(os.path.join(here, field), encoding="utf-8")]
        robots = [r for r in rows if r and not r.startswith("#")]
        if any(r.split("|")[0].strip() == seated for r in robots):
            continue

        def rank(r):
            role = r.split("|")[1].strip()
            return int(role.rsplit("-", 1)[1]) if "-" in role and role.rsplit("-", 1)[1].isdigit() else -1
        out = robots[:]
        out[out.index(max(robots, key=rank))] = a.robot
        path = os.path.join(a.out_dir, os.path.basename(field))
        with open(path, "w", encoding="utf-8") as f:
            f.write("# %s with %s seated in place of its lowest-ranked robot (melee_strays.py seat)\n" % (field, seated))
            f.write("\n".join(out) + "\n")
        words[words.index("--set") + 1] = path.replace(os.sep, "/")
        suite.append("%s | %s" % (label, " ".join(words)))
        done += 1
    with open(a.out_suite, "w", encoding="utf-8") as f:
        f.write("# %d census fields with %s seated (melee_strays.py seat)\n" % (done, seated))
        f.write("\n".join(suite) + "\n")
    print("%d fields seated with %s" % (done, seated))
    if done < a.fields:
        sys.exit("melee_strays.py seat: only %d of %d fields could be seated" % (done, a.fields))


def main(argv=None):
    argv = sys.argv[1:] if argv is None else argv
    if argv and argv[0] == "seat":
        return seat(argv[1:])
    ap = argparse.ArgumentParser()
    ap.add_argument("runs", nargs="+")
    ap.add_argument("--ours", default="hadur117.Hadur")
    ap.add_argument("--compare", action="append", default=[])
    ap.add_argument("--out", required=True)
    a = ap.parse_args(argv)
    tracked = {a.ours} | set(a.compare)
    stats, samples, hit_exposure, traces = read(a.runs, tracked)
    if not traces:
        sys.exit("melee_strays.py: no trace.log.gz under " + ", ".join(a.runs) + " (run the bench with --melee-trace true)")
    with open(a.out, "w", encoding="utf-8") as f:
        f.write(report(stats, samples, hit_exposure, traces, a.ours, a.compare))
    s = stats[a.ours]
    print("%d traces; %s stray share %s, avoidable %s of strays: %s"
          % (traces, a.ours, pct(s["stray"], s["damage"]), pct(s["avoidable"], s["stray"]),
             "BUILD" if gate(s) else "DO NOT BUILD"))


if __name__ == "__main__":
    main()
