#!/usr/bin/env python3
"""Classify every opponent of a 1v1 census by how it moves, how it shoots, and how we fare.

    python3 data/tools/census_classify.py --work hadur-bench/work/<census run> \\
        --set hadur-bench/census-312.txt --out docs/bench/local/<date>_census-classes \\
        [--jobs 8] [--every 4] [--limit N]

WORKDIR/battles/ holds one directory per battle, named <slug>-<seed> for the candidate build
and <slug>-<seed>-baseline for the baseline (export_battles.py), each with result.csv,
truth.log.gz (one T line per tick: round, turn, then Hadur's x,y,heading,velocity,energy, the
enemy's, then the live bullets as owner:x:y:heading:power, and an F line when an enemy bullet
first appears) and hadur.log (HF lines: the class of each enemy bullet that hit us, MOVE-9).

Per opponent it measures, pooling all its battles of both builds:
  movement   speed, stopped share, lateral and advancing speed relative to Hadur, reversals per
             100 ticks and the run length between them (dwell), distance kept, time near a
             wall, turn rate; and how often five offline guns would have hit it, each aimed at
             a power-2 bullet every --every ticks: head-on, linear, circular, a guess-factor
             average learnt over the battle so far, and a segmented guess-factor gun (lateral
             speed, acceleration, distance, time since reversal) as the "learning" gun.
  its gun    shots per 100 ticks, mean power and its spread by range, hit rate on Hadur, bullet
             damage it dealt a round, and each shot's aim read from its heading at birth
             against head-on, linear and circular aims at Hadur's true state (any build); the
             HF classes of the bullets that hit us (candidate build only) as a cross-check.
  outcome    score share and survival share per build, the paired difference, damage dealt and
             taken a round, our hit rate.
Then it labels each opponent with a movement class and a gun class by fixed rules (below), and
checks the labels against a k-means clustering of the same standardised numbers.

Writes OUT.tsv (one row per opponent), OUT.md (the classes, the class-by-class table of share
and paired difference, the clustering cross-check, and how to read it).

Standard library only, so it runs wherever the bench runs.
"""

import argparse
import csv
import gzip
import math
import os
import random
import re
import statistics
import sys
from collections import Counter, defaultdict
from concurrent.futures import ProcessPoolExecutor

FIELD_W, FIELD_H = 800.0, 600.0
DIR_RE = re.compile(r"^(?P<slug>.+)-(?P<seed>\d+)(?P<baseline>-baseline)?$")
SLUG_RUN = re.compile(r"[^A-Za-z0-9.]+")
HF_CLASSES = ("headon", "linear", "learned", "nowave")
GUNS = ("headon", "linear", "circular", "gf", "seg")
BANDS = ((1, 10), (11, 50), (51, 200), (201, 400), (401, 700), (701, None))
AIM_POWER = 2.0
BULLET_SPEED = 20 - 3 * AIM_POWER
HALF_BOT = 18.0


def slug(name):
    return SLUG_RUN.sub("_", name)


def read_set(path):
    """{slug: (name, rank)} from 'name version | rankN-bandB | jar' lines."""
    out = {}
    with open(path, encoding="utf-8") as f:
        for line in f:
            if line.startswith("#") or "|" not in line:
                continue
            p = [x.strip() for x in line.split("|")]
            m = re.search(r"rank(\d+)", p[1]) if len(p) > 1 else None
            out[slug(p[0])] = (p[0], int(m.group(1)) if m else 10 ** 6)
    return out


def band_of(rank):
    for lo, hi in BANDS:
        if rank >= lo and (hi is None or rank <= hi):
            return "%d-%s" % (lo, hi if hi else "")
    return "?"


def read_result(path):
    try:
        with open(path, encoding="utf-8") as f:
            rows = list(csv.reader(f))
    except OSError:
        return None
    if len(rows) < 2:
        return None
    row = dict(zip(rows[0], rows[1]))
    if row.get("ok", "").lower() not in ("true", "1"):
        return None
    return row


def num(row, key):
    try:
        v = float(row.get(key, "nan"))
    except ValueError:
        return float("nan")
    return v


def share(a, b):
    return a / (a + b) if a + b > 0 else float("nan")


# ----------------------------------------------------------------------------- truth parsing

def read_truth(path):
    """{round: [(turn, hx, hy, ex, ey, eh, ev, ee, he, nh, hh, hv)]} and {round: [(turn, power, x, y, heading)]}.

    The second map holds each enemy bullet as it first appeared: the F record names the turn
    and power, and the new bullet is the enemy bullet in that turn's T record nearest the enemy.
    """
    rounds, spawns = defaultdict(list), defaultdict(list)
    try:
        f = gzip.open(path, "rt", encoding="utf-8")
    except OSError:
        return rounds, spawns
    with f:
        last_eb, last_e, taken = [], None, set()
        try:
            for line in f:
                if line.startswith("T,"):
                    p = line.rstrip("\n").split(",")
                    if len(p) < 13:
                        continue
                    r, t = int(p[1]), int(p[2])
                    hx, hy, hh, hv, he = (float(p[3]), float(p[4]), float(p[5]),
                                          float(p[6]), float(p[7]))
                    ex, ey, eh, ev, ee = (float(p[8]), float(p[9]), float(p[10]),
                                          float(p[11]), float(p[12]))
                    nh, last_eb, taken = 0, [], set()
                    if len(p) > 13 and p[13]:
                        for b in p[13].split(" "):
                            if b.startswith("H:"):
                                nh += 1
                            elif b.startswith("E:"):
                                q = b.split(":")
                                if len(q) >= 4:
                                    last_eb.append((float(q[1]), float(q[2]), float(q[3])))
                    last_e = (ex, ey)
                    rounds[r].append((t, hx, hy, ex, ey, eh, ev, ee, he, nh, hh, hv))
                elif line.startswith("F,"):
                    p = line.rstrip("\n").split(",")
                    if len(p) < 5:
                        continue
                    r, t, power = int(p[1]), int(p[2]), float(p[4])
                    best, bd = None, 80.0
                    for k, (bx, by, bh) in enumerate(last_eb):
                        if k in taken or last_e is None:
                            continue
                        dd = math.hypot(bx - last_e[0], by - last_e[1])
                        if dd < bd:
                            best, bd = k, dd
                    if best is None:
                        spawns[r].append((t, power, None, None, None))
                    else:
                        taken.add(best)
                        spawns[r].append((t, power) + last_eb[best])
        except (EOFError, OSError, ValueError):
            pass  # a truncated log keeps the ticks read so far
    return rounds, spawns


def read_hf(path):
    out = Counter()
    try:
        with open(path, encoding="utf-8", errors="replace") as f:
            for line in f:
                i = line.find("HF,")
                if i < 0:
                    continue
                p = line[i:].split(",")
                if len(p) >= 4 and p[3] in HF_CLASSES:
                    out[p[3]] += 1
    except OSError:
        pass
    return out


# ----------------------------------------------------------------------------- geometry

def bearing(x0, y0, x1, y1):
    """Robocode bearing from (x0,y0) to (x1,y1): 0 north, clockwise, radians."""
    return math.atan2(x1 - x0, y1 - y0)


def norm(a):
    while a > math.pi:
        a -= 2 * math.pi
    while a < -math.pi:
        a += 2 * math.pi
    return a


def clamp_field(x, y):
    return min(max(x, HALF_BOT), FIELD_W - HALF_BOT), min(max(y, HALF_BOT), FIELD_H - HALF_BOT)


def max_escape(d):
    return math.asin(min(1.0, 8.0 / BULLET_SPEED))


def wall_dist(x, y):
    return min(x, y, FIELD_W - x, FIELD_H - y)


# ----------------------------------------------------------------------------- one battle

def arrival(ticks, i, x0, y0, speed):
    """First tick j > i at which a bullet fired from (x0,y0) at tick i has reached the enemy."""
    for j in range(i + 1, len(ticks)):
        if math.hypot(ticks[j][3] - x0, ticks[j][4] - y0) <= (j - i) * speed:
            return j
    return None


def predict(x, y, h, v, dh, x0, y0, speed):
    """Bearing from (x0,y0) that meets a robot at (x,y) holding heading turn dh and speed v."""
    for k in range(1, 200):
        h += dh
        x, y = clamp_field(x + v * math.sin(h), y + v * math.cos(h))
        if math.hypot(x - x0, y - y0) <= k * speed:
            break
    return bearing(x0, y0, x, y)


ENEMY_GUNS = ("headon", "linear", "circular")


def enemy_gun(ticks, spawns, s):
    """Reads each enemy shot's gun from its heading at birth (works on any Hadur build).

    The aim is compared with what a head-on, linear and circular gun would have aimed from the
    shooter's position at Hadur's true state one to three ticks earlier (the scan it fired on).
    A shot matches a gun within max(0.015 rad, half Hadur's width as an angle); a shot that
    matches none is 'other' (a learning gun, or a random spread); one that head-on and linear
    both explain because Hadur was barely moving sideways is 'still' and reads nothing.
    """
    at = {tk[0]: k for k, tk in enumerate(ticks)}
    for t, power, bx, by, bh in spawns:
        s["eshots"] += 1
        s["epower"] += power
        s["epower2"] += power * power
        k = at.get(t)
        if bh is None or k is None or k < 4:
            continue
        ox, oy = ticks[k - 1][3], ticks[k - 1][4]
        d = math.hypot(ticks[k][1] - ox, ticks[k][2] - oy)
        if d < 40:
            continue
        s["epower_close" if d < 300 else "epower_far" if d > 500 else "epower_mid"] += power
        s["eshots_close" if d < 300 else "eshots_far" if d > 500 else "eshots_mid"] += 1
        speed = 20 - 3 * power
        tol = max(0.015, math.atan2(HALF_BOT, d) * 0.5)
        best = {}
        for lag in (1, 2, 3):
            q = ticks[k - lag]
            hx, hy, hh, hv = q[1], q[2], q[10], q[11]
            dh = norm(hh - ticks[k - lag - 1][10])
            if abs(dh) > 0.18:
                dh = 0.0  # a reversal flips the heading by pi; it is not a turn
            aims = {"headon": bearing(ox, oy, hx, hy),
                    "linear": predict(hx, hy, hh, hv, 0.0, ox, oy, speed),
                    "circular": predict(hx, hy, hh, hv, dh, ox, oy, speed)}
            for g, a in aims.items():
                e = abs(norm(bh - a))
                if e < best.get(g, (9.0,))[0]:
                    best[g] = (e, a)
        s["eread"] += 1
        hits = [g for g in ENEMY_GUNS if best[g][0] <= tol]
        if not hits:
            s["egun_other"] += 1
        elif "headon" in hits and "linear" in hits and abs(norm(best["headon"][1] - best["linear"][1])) <= tol:
            s["egun_still"] += 1
        else:
            s["egun_" + min(hits, key=lambda g: best[g][0])] += 1



def battle_features(dirpath, every):
    """Movement, its-gun and offline-gun tallies of one battle (sums, so battles pool)."""
    rounds, spawns = read_truth(os.path.join(dirpath, "truth.log.gz"))
    s = Counter()
    lat_all = []
    seg_hist = {}  # segmented guess-factor histograms learnt over the battle, as a stat gun would
    gf_hist = [0] * 47
    for r in sorted(rounds):
        ticks = rounds[r]
        n = len(ticks)
        if n < 20:
            continue
        last_sign, run = 0, 0
        prev_lat, prev_h = 0.0, None
        since_rev = 0
        for i, (t, hx, hy, ex, ey, eh, ev, ee, he, nh, _hh, _hv) in enumerate(ticks):
            if ee <= 0 or he <= 0:
                continue
            d = math.hypot(ex - hx, ey - hy)
            b = bearing(hx, hy, ex, ey)
            lat = ev * math.sin(eh - b)
            adv = -ev * math.cos(eh - b)
            s["ticks"] += 1
            s["speed"] += abs(ev)
            s["stopped"] += abs(ev) < 0.5
            s["lat"] += abs(lat)
            s["adv"] += adv
            s["dist"] += d
            s["dist2"] += d * d
            s["close"] += d < 150
            s["wall"] += wall_dist(ex, ey) < 60
            if prev_h is not None:
                s["turn"] += abs(norm(eh - prev_h))
            prev_h = eh
            sign = 1 if lat > 0.5 else -1 if lat < -0.5 else 0
            since_rev += 1
            if sign and last_sign and sign != last_sign:
                s["rev"] += 1
                s["runs"] += 1
                s["runlen"] += run
                run, since_rev = 0, 0
            if sign:
                last_sign = sign
            run += 1
            lat_all.append(lat)
            # Offline guns, fired from Hadur at a power-2 bullet every `every` ticks.
            if i % every or d < 40:
                continue
            ft = d / BULLET_SPEED
            j = arrival(ticks, i, hx, hy, BULLET_SPEED)
            if j is None or ticks[j][7] <= 0:
                continue
            ax, ay = ticks[j][3], ticks[j][4]
            actual = bearing(hx, hy, ax, ay)
            tol = math.atan2(HALF_BOT, max(d, 1.0))
            esc = max_escape(d)
            gf = max(-1.0, min(1.0, norm(actual - b) / esc * (1 if lat >= 0 else -1)))
            aims = {}
            aims["headon"] = b
            px, py = ex, ey
            for _ in range(int(round(ft))):
                px, py = clamp_field(px + ev * math.sin(eh), py + ev * math.cos(eh))
            aims["linear"] = bearing(hx, hy, px, py)
            dh = norm(eh - ticks[i - 1][5]) if i > 0 else 0.0
            px, py, hh = ex, ey, eh
            for _ in range(int(round(ft))):
                hh += dh
                px, py = clamp_field(px + ev * math.sin(hh), py + ev * math.cos(hh))
            aims["circular"] = bearing(hx, hy, px, py)
            dirn = 1 if lat >= 0 else -1
            if sum(gf_hist):
                k = max(range(47), key=lambda q: gf_hist[q])
                aims["gf"] = b + dirn * esc * (k / 23.0 - 1)
            accel = abs(lat) - abs(prev_lat)
            cell = (min(4, int(abs(lat) / 2)), 0 if accel < -0.5 else 2 if accel > 0.5 else 1,
                    min(4, int(d / 200)), min(3, since_rev // 15))
            hist = seg_hist.get(cell)
            if hist is not None and sum(hist) >= 3:
                k = max(range(47), key=lambda q: hist[max(0, q - 1)] + 2 * hist[q] + hist[min(46, q + 1)])
                aims["seg"] = b + dirn * esc * (k / 23.0 - 1)
            for gun in GUNS:
                if gun in aims:
                    s["try_" + gun] += 1
                    s["hit_" + gun] += abs(norm(aims[gun] - actual)) <= tol
            gf_hist[int(round((gf + 1) * 23))] += 1
            seg_hist.setdefault(cell, [0] * 47)[int(round((gf + 1) * 23))] += 1
            prev_lat = lat
        s["rounds"] += 1
    for r in spawns:
        enemy_gun(rounds.get(r, []), spawns[r], s)
    # lateral speed distribution for the oscillation/randomness reading
    if lat_all:
        s["latsign_flips"] = sum(1 for a, c in zip(lat_all, lat_all[1:]) if a * c < 0)
    return s


def battle_job(args):
    dirpath, every = args
    try:
        return dirpath, battle_features(dirpath, every)
    except Exception as e:  # one unreadable battle must not stop 9,000
        return dirpath, Counter({"error": 1})


# ----------------------------------------------------------------------------- per opponent

def summarise(name, rank, battles, feats):
    """One row: battles = [(seed, is_baseline, result_row, hf Counter)], feats = pooled Counter."""
    row = {"opponent": name, "rank": rank, "band": band_of(rank)}
    f = feats
    T = max(f["ticks"], 1)
    row["ticks"] = f["ticks"]
    row["speed"] = f["speed"] / T
    row["stopped"] = f["stopped"] / T
    row["lat_speed"] = f["lat"] / T
    row["adv_speed"] = f["adv"] / T
    row["dist"] = f["dist"] / T
    row["dist_sd"] = math.sqrt(max(0.0, f["dist2"] / T - row["dist"] ** 2))
    row["close"] = f["close"] / T
    row["near_wall"] = f["wall"] / T
    row["turn_rate"] = f["turn"] / T
    row["rev_100"] = 100.0 * f["rev"] / T
    row["dwell"] = f["runlen"] / f["runs"] if f["runs"] else float("nan")
    for g in GUNS:
        row["off_" + g] = f["hit_" + g] / f["try_" + g] if f["try_" + g] else float("nan")
    row["shots_100"] = 100.0 * f["eshots"] / T
    row["power"] = f["epower"] / f["eshots"] if f["eshots"] else float("nan")
    row["power_sd"] = (math.sqrt(max(0.0, f["epower2"] / f["eshots"] - row["power"] ** 2))
                       if f["eshots"] else float("nan"))
    for band in ("close", "mid", "far"):
        n = f["eshots_" + band]
        row["power_" + band] = f["epower_" + band] / n if n else float("nan")
    row["shots_read"] = f["eread"]
    for g in ENEMY_GUNS + ("other", "still"):
        row["aim_" + g] = f["egun_" + g] / f["eread"] if f["eread"] else float("nan")
    hf = Counter()
    by = {"cand": [], "base": []}
    for seed, is_base, res, h in battles:
        by["base" if is_base else "cand"].append(res)
        if not is_base:
            hf.update(h)
    nh = sum(hf.values())
    for c in HF_CLASSES:
        row["hit_" + c] = hf[c] / nh if nh else float("nan")
    row["hf_hits"] = nh
    for k, rows in by.items():
        ok = [r for r in rows if r]
        row[k + "_battles"] = len(ok)
        row[k + "_share"] = mean([share(num(r, "score"), num(r, "theirScore")) for r in ok])
        row[k + "_survival"] = mean([share(num(r, "survival"), num(r, "theirSurvival")) for r in ok])
        rr = [max(num(r, "rounds"), 1) for r in ok]
        row[k + "_dealt"] = mean([num(r, "bulletDamage") / n for r, n in zip(ok, rr)])
        row[k + "_taken"] = mean([num(r, "theirBulletDamage") / n for r, n in zip(ok, rr)])
        row[k + "_our_hit"] = mean([num(r, "ourHitRate") for r in ok])
        row[k + "_their_hit"] = mean([num(r, "theirHitRate") for r in ok])
        row[k + "_ram_ticks"] = mean([num(r, "ramTicks") for r in ok])
        row[k + "_unseen"] = mean([share(num(r, "unseenShots"), num(r, "enemyShots") - num(r, "unseenShots")) for r in ok])
    pairs = {}
    for seed, is_base, res, h in battles:
        if res:
            pairs.setdefault(seed, {})["b" if is_base else "c"] = share(num(res, "score"), num(res, "theirScore"))
    diffs = [p["c"] - p["b"] for p in pairs.values() if "c" in p and "b" in p]
    row["paired_diff"] = mean(diffs)
    row["paired_n"] = len(diffs)
    row["their_hit"] = mean([row["cand_their_hit"], row["base_their_hit"]])
    row["move_class"], row["move_tags"] = move_class(row)
    row["gun_class"] = gun_class(row)
    return row


def mean(xs):
    xs = [x for x in xs if x == x]
    return sum(xs) / len(xs) if xs else float("nan")


def nz(x, default=0.0):
    return default if x != x else x


def move_class(r):
    """(class, tags). Order matters: the first rule that fits names the class.

    sitting      mean speed under 1 px/tick
    rammer       closes in: under 150 px a third of the time, or advancing at 2+ px/tick
    wall-runner  within 60 px of a wall over 60% of the time, reversing under 1.5 times per 100 ticks
    head-on-prone  a head-on gun hits it 30%+ (it barely moves sideways)
    linear-prone / circular-prone  that gun hits it 30%+
    oscillator   reverses 4+ times per 100 ticks with a short regular run (dwell under 15 ticks)
    stat-prone   a guess-factor average or segmented gun hits it 22%+ (a learnable pattern)
    flat         none of the offline guns hits it 22%: a surfer or a well-randomised mover
    mixed        anything else
    """
    tags = []
    if nz(r["near_wall"]) > 0.4:
        tags.append("walls")
    if nz(r["stopped"]) > 0.15:
        tags.append("stop-go")
    if nz(r["dist"]) > 500:
        tags.append("far")
    elif nz(r["dist"]) < 300:
        tags.append("close")
    if nz(r["rev_100"]) > 6:
        tags.append("jittery")
    off = {g: nz(r["off_" + g]) for g in GUNS}
    if nz(r["speed"]) < 1.0:
        return "sitting", tags
    if nz(r["close"]) > 0.33 or nz(r["adv_speed"]) > 2.0:
        return "rammer", tags
    if nz(r["near_wall"]) > 0.6 and nz(r["rev_100"]) < 1.5:
        return "wall-runner", tags
    if off["headon"] >= 0.30:
        return "head-on-prone", tags
    if max(off["linear"], off["circular"]) >= 0.30:
        return "linear-prone" if off["linear"] >= off["circular"] else "circular-prone", tags
    if nz(r["rev_100"]) >= 4 and nz(r["dwell"], 99) < 15:
        return "oscillator", tags
    if max(off["gf"], off["seg"]) >= 0.22:
        return "stat-prone", tags
    if max(off.values()) < 0.22:
        return "flat", tags
    return "mixed", tags


def gun_class(r):
    """Its gun, from shots per 100 ticks and each shot's heading at birth (the aim_ shares).

    silent        under 0.5 shots per 100 ticks
    head-on / linear / circular   that aim explains 60%+ of the shots that read (still shots
                  excluded); 40%+ with the rest 'other' gives e.g. 'head-on+learning'
    learning      60%+ of reading shots match no simple aim (guess-factor, k-NN, pattern, or random spread)
    mixed         anything else; under 20 reading shots it is 'unread'
    The HF classes of the bullets that hit us (candidate builds only) are kept as a cross-check.
    """
    if nz(r["shots_100"]) < 0.5:
        return "silent"
    n = r["shots_read"] * (1 - nz(r["aim_still"]))
    if n < 20:
        return "unread"
    still = nz(r["aim_still"])
    share_of = {g: nz(r["aim_" + g]) / max(1e-9, 1 - still) for g in ENEMY_GUNS + ("other",)}
    names = {"headon": "head-on", "linear": "linear", "circular": "circular", "other": "learning"}
    top = max(share_of, key=share_of.get)
    if share_of[top] >= 0.60:
        return names[top]
    simple = max(ENEMY_GUNS, key=share_of.get)
    if share_of[simple] >= 0.40 and share_of["other"] >= 0.25:
        return names[simple] + "+learning"
    return "mixed"


# ----------------------------------------------------------------------------- clustering

CLUSTER_KEYS = ("speed", "stopped", "lat_speed", "adv_speed", "dist", "near_wall", "rev_100",
                "turn_rate", "off_headon", "off_linear", "off_circular", "off_gf", "off_seg",
                "shots_100", "power", "power_sd", "aim_headon", "aim_linear", "aim_other", "their_hit")


def kmeans(rows, k, seed=17, iters=60):
    keys = CLUSTER_KEYS
    cols = {c: [nz(r[c]) for r in rows] for c in keys}
    mu = {c: statistics.mean(v) for c, v in cols.items()}
    sd = {c: (statistics.pstdev(v) or 1.0) for c, v in cols.items()}
    pts = [[(nz(r[c]) - mu[c]) / sd[c] for c in keys] for r in rows]
    rnd = random.Random(seed)
    cent = [list(p) for p in rnd.sample(pts, k)]
    lab = [0] * len(pts)
    for _ in range(iters):
        changed = False
        for i, p in enumerate(pts):
            j = min(range(k), key=lambda q: sum((a - b) ** 2 for a, b in zip(p, cent[q])))
            if j != lab[i]:
                lab[i], changed = j, True
        for q in range(k):
            mem = [pts[i] for i in range(len(pts)) if lab[i] == q]
            if mem:
                cent[q] = [sum(col) / len(mem) for col in zip(*mem)]
        if not changed:
            break
    # describe each centroid by its two most distinctive features
    desc = []
    for q in range(k):
        top = sorted(range(len(keys)), key=lambda i: -abs(cent[q][i]))[:3]
        desc.append(", ".join("%s %s" % (keys[i], "high" if cent[q][i] > 0 else "low") for i in top))
    return lab, desc


# ----------------------------------------------------------------------------- report

def fmt(x, nd=3):
    if isinstance(x, float):
        return "" if x != x else ("%." + str(nd) + "f") % x
    return str(x)


def write_report(rows, out, k, work):
    cols = list(rows[0].keys())
    with open(out + ".tsv", "w", encoding="utf-8", newline="") as f:
        w = csv.writer(f, delimiter="\t", lineterminator="\n")
        w.writerow(cols)
        for r in rows:
            w.writerow([fmt(r[c]) if c != "move_tags" else ",".join(r[c]) for c in cols])
    n = len(rows)
    lab, desc = kmeans(rows, k) if n > k else ([0] * n, ["all"])
    for r, l in zip(rows, lab):
        r["cluster"] = l
    L = []
    L.append("# Census classification")
    L.append("")
    L.append("%d opponents from `%s`. One row each in `%s.tsv`. Share = Hadur's score share; "
             "paired = candidate minus baseline share at the same seeds, in points; APS weight = "
             "that class's paired sum over the field, the APS it moves." % (n, work, os.path.basename(out)))
    L.append("")

    def table(title, key):
        L.append("## " + title)
        L.append("")
        L.append("| Class | Bots | Base share | Paired (pts) | APS weight | Their hit | Dmg taken/rd | Our hit | Shots/100 | Power |")
        L.append("|---|---|---|---|---|---|---|---|---|---|")
        groups = defaultdict(list)
        for r in rows:
            groups[r[key]].append(r)
        for c, g in sorted(groups.items(), key=lambda kv: -len(kv[1])):
            d = [nz(r["paired_diff"], float("nan")) for r in g]
            L.append("| %s | %d | %s | %s | %s | %s | %s | %s | %s | %s |" % (
                c, len(g), fmt(100 * mean([r["base_share"] for r in g]), 1),
                fmt(100 * mean(d), 2), fmt(100 * sum(x for x in d if x == x) / n, 3),
                fmt(mean([r["their_hit"] for r in g]), 3),
                fmt(mean([r["base_taken"] for r in g]), 1), fmt(mean([r["base_our_hit"] for r in g]), 3),
                fmt(mean([r["shots_100"] for r in g]), 2), fmt(mean([r["power"] for r in g]), 2)))
        L.append("")

    table("Movement classes", "move_class")
    table("Gun classes", "gun_class")
    L.append("## Movement by gun (bots, base share)")
    L.append("")
    guns = sorted({r["gun_class"] for r in rows})
    moves = sorted({r["move_class"] for r in rows})
    L.append("| Movement \\ gun | " + " | ".join(guns) + " |")
    L.append("|---|" + "---|" * len(guns))
    for m in moves:
        cells = []
        for g in guns:
            c = [r for r in rows if r["move_class"] == m and r["gun_class"] == g]
            cells.append("%d, %s" % (len(c), fmt(100 * mean([r["base_share"] for r in c]), 0)) if c else "")
        L.append("| %s | %s |" % (m, " | ".join(cells)))
    L.append("")
    L.append("## Clustering cross-check (k-means, k=%d, standardised)" % k)
    L.append("")
    L.append("| Cluster | Bots | Most distinctive | Largest movement class | Largest gun class | Base share |")
    L.append("|---|---|---|---|---|---|")
    for q in range(len(desc)):
        g = [r for r in rows if r["cluster"] == q]
        if not g:
            continue
        mc = Counter(r["move_class"] for r in g).most_common(1)[0]
        gc = Counter(r["gun_class"] for r in g).most_common(1)[0]
        L.append("| %d | %d | %s | %s (%d) | %s (%d) | %s |" % (
            q, len(g), desc[q], mc[0], mc[1], gc[0], gc[1], fmt(100 * mean([r["base_share"] for r in g]), 1)))
    L.append("")
    L.append("## Rules")
    L.append("")
    L.append("Movement (first that fits):")
    L.append("")
    L.append("```")
    L.append(move_class.__doc__.split("\n\n", 1)[1].rstrip())
    L.append("```")
    L.append("")
    L.append("Gun:")
    L.append("")
    L.append("```")
    L.append(gun_class.__doc__.split("\n\n", 1)[1].rstrip())
    L.append("```")
    L.append("")
    L.append("Offline guns aim a power-2 bullet from Hadur's true position every few ticks and count a hit "
             "when the enemy's true position at arrival lies within 18 px of the aim; the gf and segmented guns "
             "learn only from earlier ticks of the same battle. They rate the movement, not Hadur's gun.")
    with open(out + ".md", "w", encoding="utf-8") as f:
        f.write("\n".join(L) + "\n")
    return rows


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__.split("\n\n")[0])
    ap.add_argument("--work", required=True, help="bench work directory holding battles/")
    ap.add_argument("--set", required=True, help="the census set file (names and ranks)")
    ap.add_argument("--out", required=True, help="output path without extension (.tsv and .md)")
    ap.add_argument("--jobs", type=int, default=os.cpu_count() or 2)
    ap.add_argument("--every", type=int, default=4, help="offline guns fire every N ticks")
    ap.add_argument("--k", type=int, default=8, help="k-means clusters")
    ap.add_argument("--limit", type=int, default=0, help="first N opponents only (a dry check)")
    a = ap.parse_args(argv)
    opponents = read_set(a.set)
    bdir = os.path.join(a.work, "battles")
    groups = defaultdict(list)
    for name in sorted(os.listdir(bdir)):
        m = DIR_RE.match(name)
        if not m or m.group("slug") not in opponents:
            continue
        groups[m.group("slug")].append((name, int(m.group("seed")), m.group("baseline") is not None))
    slugs = sorted(groups, key=lambda s: opponents[s][1])
    if a.limit:
        slugs = slugs[:a.limit]
    jobs = [(os.path.join(bdir, n), a.every) for s in slugs for n, _, _ in groups[s]]
    print("census_classify: %d opponents, %d battles, %d jobs" % (len(slugs), len(jobs), a.jobs), file=sys.stderr)
    feats = {}
    with ProcessPoolExecutor(max_workers=a.jobs) as ex:
        for i, (path, s) in enumerate(ex.map(battle_job, jobs, chunksize=4)):
            feats[path] = s
            if (i + 1) % 200 == 0:
                print("  %d/%d battles" % (i + 1, len(jobs)), file=sys.stderr)
    rows = []
    for s in slugs:
        name, rank = opponents[s]
        pooled = Counter()
        battles = []
        for n, seed, is_base in groups[s]:
            p = os.path.join(bdir, n)
            pooled.update(feats.get(p, Counter()))
            battles.append((seed, is_base, read_result(os.path.join(p, "result.csv")),
                            read_hf(os.path.join(p, "hadur.log"))))
        rows.append(summarise(name, rank, battles, pooled))
    if not rows:
        print("no battles matched the set", file=sys.stderr)
        return 1
    os.makedirs(os.path.dirname(os.path.abspath(a.out)), exist_ok=True)
    write_report(rows, a.out, a.k, a.work)
    print("wrote %s.tsv and %s.md" % (a.out, a.out), file=sys.stderr)
    return 0


if __name__ == "__main__":
    sys.exit(main())
