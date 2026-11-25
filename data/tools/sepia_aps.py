#!/usr/bin/env python3
"""BENCH-294: an estimate of Sepia's 1v1 APS from the repo's own data (docs/sepia-design.md, "Estimated APS").

    python3 data/tools/sepia_aps.py [--out docs/bench/local/sepia-aps] [--rounds 200] [--draws 4000] [--jobs N]

Sepia does not exist yet, so this is a model, not a measurement. It is built so that every number that can come
from a battle already fought does:

  the census      data/bench/2026-10-18_hadur-pc-1018-stack-census-local_cold.tsv and the classes read from it
                  (docs/bench/local/2026-10-18_census-classes.tsv): Hadur 3.13, both builds, 8 battles of 35 rounds
                  against each of 1,212 robots. Per robot: the enemy's shots, power and hits on Hadur, Hadur's
                  shots, hit rate and damage, round length, rounds won and every part of both scores.
  the live table  data/rumble/parsed/..._botdetails_hadur117.Hadur_3.24.csv: Hadur 3.24's score against each robot.
  the shield list hadur-robot/src/main/java/hadur117/ShieldListData.java: the robots Hadur shields today.
  the lab         docs/bench/local/2026-10-16_lab-first-read.md: how often the six lab shooters hit silent Hadur.
  the gait runs   data/tools/ink_model/e6.json: how often the census's own offline guns find Sepia's modelled path,
                  and how many of those bullets its ink stops.

Method, per robot:

  1. A round model. Both robots start at 100. The enemy fires as often and as hard as it did against Hadur, hits
     with a given chance, and gets 3 x power back on a hit. We fire as Hadur did (shots, hit rate, damage a hit)
     for a share `f` of our gun time. The round ends when one side is out of energy; the scores are Robocode's
     (60 to the survivor, bullet damage, a fifth again on a kill). Rounds are drawn by Monte Carlo.
  2. The check. With Hadur's own numbers (f = 1, its measured hit rates) the model must give back Hadur's measured
     share, robot by robot. What it misses is kept as that robot's residual and added back to every projection.
  3. Sepia. On a robot Hadur shields today Sepia plays Hadur's shield, so it takes Hadur 3.24's live score less a
     parity allowance. On every other robot the model is run with the hit chance Sepia's gait would give that
     robot's gun (below), and `f` falls as gun time goes to ink. Four regimes are played (punch only, alternate,
     ink first, ink only) and the best is taken, as the value rule intends.
  4. The range. Every assumption is drawn from a stated range (--draws) and the APS read off for each draw: the
     10th, 50th and 90th percentiles are reported, with one-at-a-time sensitivities.

The enemy's hit chance on Sepia. A share `simple` of a robot's bullets is explained by a simple aim (head-on,
linear, circular): Sepia dodges those as Hadur does, at `m_simple` times Hadur's rate. For the rest:

    punching   on the body = max(k_punch * h, floor * spray)        and every bullet on the body hits
    inking     on the body = max(k_ink * h, 1.5 * floor * spray)    and a share `stop * keep` of those is stopped

  h      the robot's true hit rate on Hadur (damage over damage a hit over shots).
  k      how much more often the same gun finds Sepia's gait than Hadur's surf. The lab measured its GFHist and
         Knn shooters on Hadur; the gait runs give a guess-factor and a segmented gun on Sepia's two-way lottery
         and on its least-exposed pick. Four ratios punching (their mean is central, their spread the range), two
         inking.
  spray  what an even spread of bullets over the escape angle would hit: the moving body's 52 px over
         2 x asin(8 / bullet speed) x 450 px. A surfer is hit less than this by a gun it can read; a gait that
         commits one of three paths a wave is not. `floor` scales it (the weakest gun in the gait runs gives 0.98
         against the least-exposed pick and 1.34 against the lottery).
  stop   the share of on-body bullets the ink stops: what the gait runs give against aimed guns (high), scaled to
         the Q0 gate (central) and to the Q0 stop rule (low).

Writes OUT.tsv (one row per robot) and OUT.json (every number the doc quotes), and prints a summary.
Needs numpy. Nothing here plays a battle.
"""
import argparse
import csv
import json
import math
import os
import re
from multiprocessing import Pool

import numpy as np

HERE = os.path.dirname(os.path.abspath(__file__))
ROOT = os.path.normpath(os.path.join(HERE, "..", ".."))
CENSUS_BATTLES = "data/bench/2026-10-18_hadur-pc-1018-stack-census-local_cold.tsv"
CENSUS_CLASSES = "docs/bench/local/2026-10-18_census-classes.tsv"
LIVE = "data/rumble/parsed/2026-11-22T2022Z_roborumble_botdetails_hadur117.Hadur_3.24.csv"
RANKINGS = "data/rumble/parsed/2026-11-22T2022Z_roborumble_rankings.tsv"
LEDGER = "hadur-bench/field-ledger.tsv"
SHIELD = "hadur-robot/src/main/java/hadur117/ShieldListData.java"
LAB = "docs/bench/local/2026-10-16_lab-first-read.md"
GAIT = "data/tools/ink_model/e6.json"

SUMS = ("rounds", "firsts", "turns", "enemyShots", "shotsFired", "bulletDamage", "theirBulletDamage",
        "bulletDamageBonus", "theirBulletDamageBonus", "ramDamage", "theirRamDamage", "ramDamageBonus",
        "theirRamDamageBonus", "score", "theirScore")
# The regimes: (name, share of gun time on punches, share of the all-ink cover that is kept). From the cloud
# model's stream duel (e5.json): all ink 48.3% cover; one ink per enemy shot 41.4% at 22% of the attack rate;
# alternate 25.0% at 56%.
REGIMES = (("punch", 1.00, 0.00), ("alternate", 0.56, 0.52), ("ink-first", 0.22, 0.86), ("ink", 0.00, 1.00))
HITS = (0.0, 0.01, 0.02, 0.035, 0.05, 0.07, 0.095, 0.125, 0.16, 0.21, 0.30, 0.45)   # the grid of enemy hit chances
GUNS = (0.90, 1.02)
BODY, RANGE = 52.0, 450.0    # the moving body's hit set and the range of the gait runs, px
INK_FLOOR = 1.5              # the weakest gun on the inking lottery over the weakest on the punching pick (e6.json)
# Cover against an even spread of bullets: what the cloud model gives, the Q0 gate and the Q0 stop rule.
COVER_MODEL, COVER_GATE, COVER_STOP = 0.483, 0.35, 0.25
# Assumptions that are not read from the lab and the gait runs: (low, central, high).
FIXED = {
    "floor": (0.70, 1.00, 1.34),    # the least any gun gets on the gait, as a multiple of an even spray
    "m_simple": (1.0, 1.15, 1.5),   # hits taken from bullets a simple aim explains, against Hadur's
    "m_ram": (1.0, 1.5, 2.2),       # what a rammer does to us: Sepia has no ram escape in its first release
    "gun": (0.90, 0.97, 1.02),      # Sepia's damage rate against Hadur 3.13's on the same robot
    "shield": (-2.0, -0.7, 0.0),    # points a robot against Hadur 3.24, on Hadur's shield list
}
HARMFUL = ("k_punch", "k_ink", "floor", "m_simple", "m_ram")   # more of these lowers the score


def fnum(row, key, default=0.0):
    try:
        x = float(row.get(key, ""))
    except (TypeError, ValueError):
        return default
    return default if x != x else x


def table(path, delimiter=","):
    with open(path, encoding="utf-8", newline="") as f:
        return list(csv.DictReader(f, delimiter=delimiter))


def text(path):
    with open(path, encoding="utf-8") as f:
        return f.read()


def damage(power):
    return 4.0 * power + 2.0 * np.maximum(0.0, power - 1.0)


def power_of(dmg):
    return np.where(dmg <= 4.0, dmg / 4.0, (dmg + 2.0) / 6.0)


def spray(power):
    """The share of an even spread of bullets over the escape angle that finds a moving body at the gait's range."""
    return BODY / (2.0 * np.arcsin(np.minimum(1.0, 8.0 / (20.0 - 3.0 * power))) * RANGE)


def read_lab(root):
    """{shooter: true hit % on silent Hadur 3.13} from the movement lab's first read (the `si hit %` column)."""
    out = {}
    for line in text(os.path.join(root, LAB)).splitlines():
        m = re.match(r"^\|\s*(HeadOn|Linear|Circular|GFHist|Knn|PatternMatch)\s*\|\s*([0-9.]+)\s*\|", line)
        if m and m.group(1) not in out:
            out[m.group(1)] = float(m.group(2))
    return out


def read_inputs(root):
    """(arrays by column, a dict per robot, the live scores with no census row).

    A row per robot that is both in the census and in Hadur 3.24's live table.
    """
    path = lambda p: os.path.join(root, p)
    classes = {r["opponent"]: r for r in table(path(CENSUS_CLASSES), "\t")}
    sums = {}
    for r in table(path(CENSUS_BATTLES), "\t"):
        if r.get("ok") != "true":
            continue
        a = sums.setdefault(r["opponent"], dict.fromkeys(SUMS + ("ourHits",), 0.0))
        for k in SUMS:
            a[k] += fnum(r, k)
        a["ourHits"] += fnum(r, "ourHitRate") * fnum(r, "shotsFired")
    live = {r["name"]: r for r in table(path(LIVE))}
    ledger = {r["name"]: r for r in table(path(LEDGER), "\t")}
    shield_src = text(path(SHIELD)).split("static String[] lines()", 1)
    shield = set(re.findall(r'"([^"]+)"', shield_src[1])) if len(shield_src) > 1 else set()
    names = sorted(n for n in live if n in sums and n in classes)
    d, meta = rows_of(names, sums, classes, live, ledger, shield)
    return d, meta, [fnum(live[n], "aps") for n in live if n not in sums or n not in classes]


def rows_of(names, sums, classes, live, ledger, shield):
    keys = ("w", "ticks", "ne", "nu", "h", "hu", "dt", "du", "pe", "dmg_u", "pu", "other", "kill_u", "ram_u", "ram_t",
            "share313", "live324", "simple", "rammer", "shielded")
    col = {k: [] for k in keys}
    meta = []
    for n in names:
        a, c = sums[n], classes[n]
        R = max(a["rounds"], 1.0)
        ne, nu = a["enemyShots"] / R, a["shotsFired"] / R
        hu = a["ourHits"] / a["shotsFired"] if a["shotsFired"] else 0.0
        dt, du = a["theirBulletDamage"] / R, a["bulletDamage"] / R
        pe = fnum(c, "power", 1.9) or 1.9
        # its true hit rate on Hadur: damage a round over the damage of one hit at its mean power, over its shots
        h = min(0.95, dt / (float(damage(pe)) * ne)) if ne > 0 else 0.0
        dmg_u = min(max(du / (nu * hu) if nu * hu > 0.05 else 9.7, 0.4), 16.0)
        w = a["firsts"] / R
        # Energy the enemy lost to something other than its own shots and our bullets (walls, rams). It keeps the
        # round as long in the model as it was on the bench. In a round the enemy won, what is left over is energy
        # it still held, not a loss, so only the won share counts.
        other = min(max(100.0 - ne * pe + 3.0 * pe * ne * h - du, 0.0), 80.0) * w
        still = fnum(c, "aim_still")
        simple_aim = (fnum(c, "aim_headon") + fnum(c, "aim_linear") + fnum(c, "aim_circular")) / max(1e-9, 1.0 - still)
        simple_hit = fnum(c, "hit_headon") + fnum(c, "hit_linear")
        # the share of its bullets a simple aim explains: of those that hit us when 20 did, else of those it fired
        simple = simple_hit if fnum(c, "hf_hits") >= 20 else simple_aim
        row = dict(w=w, ticks=a["turns"] / R, ne=ne, nu=nu, h=h, hu=hu, dt=dt, du=du, pe=pe, dmg_u=dmg_u,
                   pu=float(power_of(np.array(dmg_u))), other=other,
                   kill_u=min(1.0, min(1.0, a["bulletDamageBonus"] / max(0.2 * a["bulletDamage"], 1e-9)) / max(w, 0.02)),
                   ram_u=(a["ramDamage"] + a["ramDamageBonus"]) / R, ram_t=(a["theirRamDamage"] + a["theirRamDamageBonus"]) / R,
                   share313=100.0 * a["score"] / max(a["score"] + a["theirScore"], 1e-9), live324=fnum(live[n], "aps"),
                   simple=min(1.0, max(0.0, simple)), rammer=1.0 if c.get("move_class") == "rammer" else 0.0,
                   shielded=1.0 if n in shield else 0.0)
        for k in keys:
            col[k].append(row[k])
        led = ledger.get(n, {})
        meta.append(dict(name=n, gun_class=c.get("gun_class", ""), move_class=c.get("move_class", ""),
                         rank=fnum(c, "rank", 9999.0), cls=led.get("cls", ""), status=led.get("status", "")))
    return {k: np.array(v, float) for k, v in col.items()}, meta


def gait_priors(root):
    """(low, central, high) for k_punch, k_ink and stop, from the lab's hit rates on Hadur and the gait runs."""
    g = json.loads(text(os.path.join(root, GAIT)))
    lab = read_lab(root)
    on = lambda run, gun: 100.0 * g[run][gun]["on"]
    punch = [on("run_attack", "gf") / lab["GFHist"], on("belief_gf_attack", "gf") / lab["GFHist"],
             on("run_attack", "seg") / lab["Knn"], on("belief_seg_attack", "seg") / lab["Knn"]]
    ink = [on("run_ink", "gf") / lab["GFHist"], on("run_ink", "seg") / lab["Knn"]]
    stopped = float(np.mean([1.0 - g["run_ink"][k]["net"] / g["run_ink"][k]["on"] for k in ("gf", "seg")]))
    k_ink = float(np.mean(ink))
    pri = {
        "k_punch": (min(punch), float(np.mean(punch)), max(punch)),
        "k_ink": (0.85 * k_ink, k_ink, 1.15 * k_ink),
        "stop": (stopped * COVER_STOP / COVER_MODEL, stopped * COVER_GATE / COVER_MODEL, stopped),
    }
    weakest = lambda runs: min(on(r, gun) for r, gun in runs)
    refs = dict(lab_hit_on_hadur=lab, punch_ratios=punch, ink_ratios=ink, ink_stops_aimed_model=stopped,
                spray_at_power_2=float(spray(2.0)),
                weakest_gun_on_pick=weakest((("belief_gf_attack", "gf"), ("belief_seg_attack", "seg"),
                                             ("belief_linear_attack", "linear"), ("belief_headon_attack", "headon"))),
                weakest_gun_on_lottery=weakest((("run_attack", "gf"), ("run_attack", "seg"), ("run_attack", "linear"),
                                                ("run_attack", "headon"))),
                weakest_gun_on_inking_lottery=weakest((("run_ink", "gf"), ("run_ink", "seg"), ("run_ink", "linear"),
                                                       ("run_ink", "headon"))),
                on_body={k: {x: g[k][x]["on"] for x in ("gf", "seg")} for k in
                         ("run_attack", "belief_gf_attack", "belief_seg_attack", "run_ink")},
                through_ink={x: g["run_ink"][x]["net"] for x in ("gf", "seg")}, cover_even_spread=g["run_ink"]["cover"])
    return pri, refs


def play(d, f, hit, gun=1.0, ram=1.0, rounds=200, seed=11, step=5.0, chunks=8):
    """Monte Carlo of `rounds` rounds a robot. Returns (share %, our score, their score, rounds won) per robot.

    f     share of our gun time spent on punches (the rest is ink at 0.1 a shot)
    hit   the chance one enemy bullet hits us (array or number)
    Robots are played in batches of like round length, so the short rounds do not wait for the long ones.
    """
    n = d["w"].size
    hit = np.broadcast_to(np.asarray(hit, float), (n,))
    order = np.argsort(d["ticks"])
    our_s, their_s, won_s = np.zeros(n), np.zeros(n), np.zeros(n)
    for c, idx in enumerate(np.array_split(order, max(1, min(chunks, n)))):
        sub = {k: v[idx] for k, v in d.items()}
        our_s[idx], their_s[idx], won_s[idx] = _play(sub, f, hit[idx], gun, ram, rounds, seed + 1000 * c, step)
    return 100.0 * our_s / np.maximum(our_s + their_s, 1e-9), our_s, their_s, won_s


def _play(d, f, hit, gun, ram, rounds, seed, step):
    rng = np.random.default_rng(seed)
    n = d["w"].size
    column = lambda x: np.asarray(x, float).reshape(-1, 1)
    ticks = np.maximum(column(d["ticks"]), 50.0)
    p_fire = np.minimum(1.0, column(d["ne"]) * step / ticks)       # enemy shots a step
    pe = column(d["pe"])
    h_e = np.minimum(0.95, column(hit))
    ours = f * column(d["nu"]) * step / ticks                      # our punches a step
    lam_u = ours * column(d["hu"]) * gun                           # ... that hit
    dmg_u, pu = column(d["dmg_u"]), column(d["pu"])
    other = column(d["other"]) * step / ticks
    wave_gap = ticks / np.maximum(column(d["ne"]), 1e-6)           # ticks between enemy shots
    ink = (1.0 - f) * 0.1 * np.minimum(step / 10.2, 3.0 * step / np.maximum(wave_gap, 1.0))
    shape = (n, rounds)
    es, ee = np.full(shape, 100.0), np.full(shape, 100.0)
    du, dt = np.zeros(shape), np.zeros(shape)
    live, won, lost = np.ones(shape, bool), np.zeros(shape, bool), np.zeros(shape, bool)
    for _ in range(int(8000 / step)):
        if not live.any():
            break
        can = live & (ee > 0.2)
        q = np.where(can, np.minimum(pe, np.maximum(ee - 0.1, 0.0)), 0.0)
        fire = can & (rng.random(shape) < p_fire)
        ee = ee - q * fire
        struck = fire & (rng.random(shape) < h_e)
        blow = damage(q) * struck
        dt = dt + np.minimum(blow, np.maximum(es, 0.0))
        es = es - blow
        ee = ee + 3.0 * q * struck
        dead = live & (es <= 0.0)
        lost |= dead
        live &= ~dead
        punching = live & (es > 3.0)
        hits = rng.poisson(lam_u * np.ones(shape)) * punching
        dealt = np.minimum(hits * dmg_u, np.maximum(ee, 0.0))
        du = du + dealt
        ee = ee - dealt - other * live
        es = es + (3.0 * pu * hits - ours * pu * punching - ink) * live
        done = live & (ee <= 0.2)      # killed, or spent: it cannot fire and the next punch finishes it
        won |= done
        live &= ~done
    won |= live & (es >= ee)           # neither fell in 8,000 ticks: the inactivity drain takes the weaker
    lost |= live & (es < ee)
    our = 60.0 * won + du + 0.2 * du * won * column(d["kill_u"])
    their = 60.0 * lost + dt + 0.2 * dt * lost
    return our.mean(axis=1) + d["ram_u"], their.mean(axis=1) + d["ram_t"] * ram, won.mean(axis=1)


_POOL = {}


def _cell(job):
    i, j, k, rounds = job
    return i, j, k, play(_POOL["d"], REGIMES[i][1], HITS[k], gun=GUNS[j], rounds=rounds, seed=101 + 7 * k + 13 * j)[0]


def tables(d, rounds, jobs=1):
    """Share by robot on a grid of (regime, gun, enemy hit chance); every scenario then reads off it."""
    grid = np.zeros((len(REGIMES), len(GUNS), len(HITS), d["w"].size))
    work = [(i, j, k, rounds) for i in range(len(REGIMES)) for j in range(len(GUNS)) for k in range(len(HITS))]
    _POOL["d"] = d
    if jobs > 1:
        with Pool(jobs) as pool:
            cells = pool.map(_cell, work, chunksize=1)
    else:
        cells = [_cell(w) for w in work]
    for i, j, k, share in cells:
        grid[i, j, k] = share
    return grid


def lookup(grid, regime, gun, hit):
    """Share at (regime, gun, per-robot enemy hit chance) by linear interpolation in gun and in the hit chance."""
    guns, xs = np.array(GUNS), np.array(HITS)
    g = float(np.clip(gun, guns[0], guns[-1]))
    tg = (g - guns[0]) / (guns[-1] - guns[0])
    h = np.clip(hit, xs[0], xs[-1])
    k = np.clip(np.searchsorted(xs, h, side="right") - 1, 0, len(xs) - 2)
    th = (h - xs[k]) / (xs[k + 1] - xs[k])
    idx = np.arange(h.size)
    at = lambda j: grid[regime, j, k, idx] * (1 - th) + grid[regime, j, k + 1, idx] * th
    return at(0) * (1 - tg) + at(1) * tg


def sepia_hit(d, a, keep):
    """The chance one enemy bullet hits Sepia, by robot, in a regime that keeps `keep` of the all-ink cover."""
    floor = a["floor"] * spray(d["pe"])
    if keep == 0.0:
        learnt = np.maximum(a["k_punch"] * d["h"], floor)
    else:
        learnt = np.maximum(a["k_ink"] * d["h"], INK_FLOOR * floor) * (1.0 - a["stop"] * keep)
    ram = 1.0 + (a["m_ram"] - 1.0) * d["rammer"]
    return np.minimum(0.95, (d["simple"] * a["m_simple"] * d["h"] + (1.0 - d["simple"]) * learnt) * ram)


def project(d, grid, resid, a, regimes=None):
    """Sepia's share by robot under the assumptions `a`, and the regime taken (index into REGIMES).

    `d`, `grid` and `resid` cover the robots Hadur does not shield; the caller adds the shielded ones.
    """
    best = pick = None
    for i, (_, _, keep) in enumerate(REGIMES):
        if regimes is not None and i not in regimes:
            continue
        share = lookup(grid, i, a["gun"], sepia_hit(d, a, keep))
        if best is None:
            best, pick = share, np.full(share.size, i)
        else:
            better = share > best
            best, pick = np.where(better, share, best), np.where(better, i, pick)
    return np.clip(best + resid, 0.0, 100.0), pick


def rank_of(score, ladder):
    return 1 + sum(1 for x in ladder if x > score)


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__.split("\n\n")[0])
    ap.add_argument("--root", default=ROOT)
    ap.add_argument("--out", default=os.path.join("docs", "bench", "local", "sepia-aps"))
    ap.add_argument("--rounds", type=int, default=200)
    ap.add_argument("--draws", type=int, default=4000)
    ap.add_argument("--jobs", type=int, default=os.cpu_count() or 1)
    args = ap.parse_args(argv)
    log = lambda *x: print(*x, flush=True)
    d, meta, unmatched = read_inputs(args.root)
    n = d["w"].size
    priors, refs = gait_priors(args.root)
    priors.update(FIXED)
    log("robots: %d in the census and the live table, %d live only; %d of them on the shield list"
        % (n, len(unmatched), int(d["shielded"].sum())))

    # 2. the check: Hadur's own numbers must give back Hadur's measured share
    fit, _, _, fit_w = play(d, 1.0, d["h"], rounds=args.rounds, seed=5)
    resid = d["share313"] - fit
    weak = d["share313"] < 70
    check = dict(robots=n, measured=float(d["share313"].mean()), model=float(fit.mean()),
                 mean_abs_error=float(np.abs(resid).mean()), within_2=float((np.abs(resid) <= 2).mean()),
                 within_5=float((np.abs(resid) <= 5).mean()), corr=float(np.corrcoef(fit, d["share313"])[0, 1]),
                 rounds_won_measured=float(d["w"].mean()), rounds_won_model=float(fit_w.mean()),
                 under_70_robots=int(weak.sum()), under_70_mean_abs_error=float(np.abs(resid[weak]).mean()))
    log("check: measured %.2f, model %.2f, mean abs error %.2f, within 2 pts %.0f%%, r %.3f"
        % (check["measured"], check["model"], check["mean_abs_error"], 100 * check["within_2"], check["corr"]))

    open_ = d["shielded"] == 0
    sub = {k: v[open_] for k, v in d.items()}
    grid = tables(sub, args.rounds, jobs=args.jobs)
    central = {k: v[1] for k, v in priors.items()}

    def run(a, regimes=None):
        share, pick = np.zeros(n), np.full(n, -1)
        share[open_], pick[open_] = project(sub, grid, resid[open_], a, regimes)
        share[~open_] = np.clip(d["live324"][~open_] + a["shield"], 0.0, 100.0)
        # a robot with no census row: the mean of the robots Sepia does not shield
        return float((share.sum() + len(unmatched) * share[open_].mean()) / (n + len(unmatched))), share, pick

    base, share, pick = run(central)
    total = n + len(unmatched)
    hadur324 = float((d["live324"].sum() + sum(unmatched)) / total)
    ladder = sorted((fnum(r, "aps") for r in table(os.path.join(args.root, RANKINGS), "\t")), reverse=True)
    out = dict(check=check, robots=n, live_only=len(unmatched), shielded=int((~open_).sum()), priors=priors, gait=refs,
               hadur_3_24_live=hadur324, hadur_3_13_census=float(d["share313"].mean()), central=central,
               aps_central=base, rank_central=rank_of(base, ladder), field=len(ladder))
    h_punch = sepia_hit(sub, central, 0.0)
    out["hit_rates"] = dict(on_hadur=float(sub["h"].mean()), on_sepia_punching=float(h_punch.mean()),
                            on_sepia_inking=float(sepia_hit(sub, central, 1.0).mean()),
                            at_the_floor=float((h_punch > 1.001 * (sub["simple"] * central["m_simple"] * sub["h"]
                                                + (1 - sub["simple"]) * central["k_punch"] * sub["h"])
                                                * (1.0 + (central["m_ram"] - 1.0) * sub["rammer"])).mean()))

    # 4. the range
    rng = np.random.default_rng(2026)
    draws = {k: rng.triangular(*v, args.draws) for k, v in priors.items()}
    sample = np.array([run({k: draws[k][i] for k in priors})[0] for i in range(args.draws)])
    for p in (10, 25, 50, 75, 90):
        out["aps_p%d" % p] = float(np.percentile(sample, p))
    out["aps_mean"] = float(sample.mean())
    out["chance_at_least"] = {"%g" % bar: float((sample >= bar).mean()) for bar in (75.0, 80.0, 85.0, 87.64, 88.0, 90.06)}
    out["rank_p10"], out["rank_p50"], out["rank_p90"] = (rank_of(out[k], ladder) for k in ("aps_p10", "aps_p50", "aps_p90"))
    out["sensitivity"] = {k: [run(dict(central, **{k: v[0]}))[0], run(dict(central, **{k: v[2]}))[0]]
                          for k, v in priors.items()}
    out["corner_low"] = run({k: (v[2] if k in HARMFUL else v[0]) for k, v in priors.items()})[0]
    out["corner_high"] = run({k: (v[0] if k in HARMFUL else v[2]) for k, v in priors.items()})[0]

    surf = dict(central, k_punch=1.0, floor=0.0)     # hit as Hadur is: no more often, and no spray floor
    ref313 = np.where(open_, d["share313"], d["live324"])
    out["variants"] = {
        "punch_only": run(central, regimes={0})[0],
        "ink_stops_as_modelled": run(dict(central, stop=priors["stop"][2]))[0],
        "no_spray_floor": run(dict(central, floor=0.0))[0],
        "gait_hit_like_hadurs_surf": run(surf)[0],
        "gait_hit_like_surf_and_ink_as_modelled": run(dict(surf, stop=priors["stop"][2]))[0],
        "hadur_3_13_with_todays_shield_list": float((ref313.sum() + len(unmatched) * d["share313"][open_].mean()) / total),
    }

    def groups(key, values):
        rows = []
        for v in values:
            m = np.array([x[key] == v for x in meta])
            if m.any():
                rows.append(dict(group=v, robots=int(m.sum()), hadur_3_24=float(d["live324"][m].mean()),
                                 hadur_3_13=float(d["share313"][m].mean()), sepia=float(share[m].mean())))
        return rows
    out["by_gun"] = groups("gun_class", ("learning", "mixed", "head-on", "linear+learning", "linear",
                                         "head-on+learning", "silent", "unread"))
    out["by_class"] = groups("cls", ("low", "mid", "close"))
    part = lambda name, m: dict(group=name, robots=int(m.sum()), hadur_3_24=float(d["live324"][m].mean()),
                                hadur_3_13=float(d["share313"][m].mean()), sepia=float(share[m].mean()))
    top30 = np.array([x["rank"] <= 30 for x in meta])
    out["by_defence"] = [part("on Hadur's shield list", ~open_), part("all other robots", open_),
                         part("the 30 best-ranked robots", top30 & open_)]
    out["regimes"] = {REGIMES[i][0]: int((pick == i).sum()) for i in range(len(REGIMES))}
    out["regime_robots"] = {REGIMES[i][0]: [meta[j]["name"] for j in np.where(pick == i)[0]][:40]
                            for i in range(1, len(REGIMES))}
    out["ladder"] = {str(k): ladder[k - 1] for k in (1, 2, 10, 20, 30, 50, 100, 200)}

    target = os.path.join(args.root, args.out)
    os.makedirs(os.path.dirname(target), exist_ok=True)
    with open(target + ".tsv", "w", encoding="utf-8", newline="") as fh:
        wr = csv.writer(fh, delimiter="\t", lineterminator="\n")
        wr.writerow(["name", "gun_class", "move_class", "cls", "status", "shielded", "hadur_3_24_live", "hadur_3_13_census",
                     "model_fit_3_13", "hit_on_hadur", "hit_on_sepia", "sepia", "regime", "sepia_minus_hadur_3_24"])
        hit_s = np.zeros(n)
        hit_s[open_] = np.choose(np.maximum(pick[open_], 0), [sepia_hit(sub, central, r[2]) for r in REGIMES])
        for i in np.argsort(share - d["live324"]):
            x = meta[i]
            wr.writerow([x["name"], x["gun_class"], x["move_class"], x["cls"], x["status"], int(d["shielded"][i]),
                         "%.2f" % d["live324"][i], "%.2f" % d["share313"][i], "%.2f" % fit[i], "%.4f" % d["h"][i],
                         "" if pick[i] < 0 else "%.4f" % hit_s[i], "%.2f" % share[i],
                         "shield" if pick[i] < 0 else REGIMES[pick[i]][0], "%.2f" % (share[i] - d["live324"][i])])
    with open(target + ".json", "w", encoding="utf-8") as fh:
        json.dump(out, fh, indent=1, sort_keys=True)
        fh.write("\n")
    log("Sepia: central %.2f (rank %d of %d); p10 %.2f, p50 %.2f, p90 %.2f; Hadur 3.24 live %.2f"
        % (base, out["rank_central"], len(ladder), out["aps_p10"], out["aps_p50"], out["aps_p90"], hadur324))
    log("priors: " + ", ".join("%s %.2f/%.2f/%.2f" % ((k,) + tuple(v)) for k, v in priors.items()))
    log("regimes taken: %s; hit rates %s" % (out["regimes"], {k: round(v, 4) for k, v in out["hit_rates"].items()}))
    for k, v in out["variants"].items():
        log("  %-42s %.2f" % (k, v))
    for k, v in out["sensitivity"].items():
        log("  %-10s low %.2f  high %.2f" % (k, v[0], v[1]))
    return out


if __name__ == "__main__":
    main()
