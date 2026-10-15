#!/usr/bin/env python3
"""Movement maps: what a rival's movement looks like to the gun shooting at it.

Reads the bench's truth logs (hadur-bench work/<run>/battles/<opponent>-<seed>/truth.log.gz),
where the subject robot (the rival being mapped, passed with --robot-jar/--robot) is the first
robot of every T record and the shooter (the set's opponent) the second. For each
(rival, shooter) pair it draws one row of four panels:

  1. Field: where on the 800x600 field the rival spends its time, with three rounds' paths.
  2. Dance: from every tick, where the rival is one bullet flight later (power 2), seen from
     the shooter, rotated so the shooter->rival line points up and mirrored so the rival's
     lateral motion at that tick is to the right. This is the cloud a gun has to cover.
  3. Guess factors: the same endpoints as the angle a gun would have needed, divided by the
     maximum escape angle (GF -1..1, signed by lateral direction). Grey uses every tick; the
     coloured line uses only ticks where the shooter really fired, at the power it fired.
     A flat profile is a movement no statistical gun can learn.
  4. Range and orbit: distance to the shooter against lateral speed.

    python3 data/tools/move_map.py --work hadur-bench/work/movemap --out DIR

writes DIR/<rival>.png per rival, DIR/compare.png (guess-factor profiles of every rival per
shooter) and DIR/metrics.json.
"""
import argparse
import gzip
import json
import math
import os
import sys
from collections import defaultdict

import numpy as np
import matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt

FIELD_W, FIELD_H = 800.0, 600.0
GF_BINS = 31


def read_truth(path):
    """Per round: list of (tick, sx, sy, sh, sv, se, ox, oy, oh, ov, oe) and fire ticks {tick: power}."""
    rounds = defaultdict(list)
    fires = defaultdict(dict)
    with gzip.open(path, "rt") as f:
        for line in f:
            p = line.rstrip("\n").split(",")
            if p[0] == "T" and len(p) >= 13:
                r, t = int(p[1]), int(p[2])
                rounds[r].append((t, *map(float, p[3:13])))
            elif p[0] == "F" and len(p) >= 5:
                fires[int(p[1])][int(p[2])] = float(p[4])
    return rounds, fires


def norm_angle(a):
    return (a + math.pi) % (2 * math.pi) - math.pi


def analyse_round(rows, fire_ticks):
    """Dance endpoints, guess factors and per-tick features for one round."""
    arr = np.array(rows)
    t, sx, sy, sh, sv, se, ox, oy, oh, ov, oe = arr.T
    alive = (se > 0) & (oe > 0)
    n = len(arr)
    dance, gf_all, gf_fire, feats, fire_x = [], [], [], [], []
    last_dir, since_rev = 0.0, 0
    for i in range(n):
        if not alive[i] or t[i] < 10:
            continue
        dx, dy = sx[i] - ox[i], sy[i] - oy[i]
        dist = math.hypot(dx, dy)
        if dist < 40:
            continue
        bearing = math.atan2(dx, dy)  # Robocode: 0 north, clockwise
        lat_v = sv[i] * math.sin(sh[i] - bearing)
        adv_v = -sv[i] * math.cos(sh[i] - bearing)
        feats.append((dist, lat_v, adv_v, sv[i], sx[i], sy[i]))
        sign = 1.0 if lat_v >= 0 else -1.0
        if abs(lat_v) > 0.5:
            since_rev = 0 if sign != last_dir else since_rev + 1
            last_dir = sign
        else:
            since_rev += 1
        accel = sv[i] - sv[i - 1] if i > 0 else 0.0
        wall = min(sx[i], sy[i], FIELD_W - sx[i], FIELD_H - sy[i])
        for power, out in ((2.0, gf_all), (fire_ticks.get(int(t[i])), gf_fire)):
            if power is None:
                continue
            speed = 20 - 3 * power
            mea = math.asin(8.0 / speed)
            # The bullet leaves the next tick from where the shooter stands now.
            for j in range(i + 1, n):
                if not alive[j]:
                    break
                k = j - i
                ex, ey = sx[j] - ox[i], sy[j] - oy[i]
                if math.hypot(ex, ey) <= k * speed:
                    off = norm_angle(math.atan2(ex, ey) - bearing) * sign
                    out.append(max(-1.0, min(1.0, off / mea)))
                    if out is gf_fire:
                        # what a segmented gun would see when it fired
                        fire_x.append((dist / 800, abs(lat_v) / 8, adv_v / 8, wall / 300,
                                       min(since_rev, 60) / 60, np.sign(accel * sv[i]) / 2, out[-1]))
                    if out is gf_all:
                        # rotate into the frame: shooter->rival up, lateral motion to the right
                        lat = (ex * math.cos(bearing) - ey * math.sin(bearing)) * sign
                        rad = ex * math.sin(bearing) + ey * math.cos(bearing)
                        dance.append((lat, rad - dist))
                    break
    return dance, gf_all, gf_fire, feats, arr, fire_x


def knn_gun(fire_x, k=25):
    """Hit share of a k-nearest-neighbour guess-factor gun replayed over the real shots, in
    order: each shot aims at the densest window among its k most similar earlier shots
    (distance, lateral and advancing speed, wall distance, time since reversal,
    acceleration). This is a stand-in for a learning gun, so higher means the movement is
    easier to learn. Uses every shot after the first 200."""
    if len(fire_x) < 400:
        return float("nan")
    a = np.asarray(fire_x)
    X, g = a[:, :6], a[:, 6]
    hits = tested = 0
    for i in range(200, len(a)):
        d = ((X[:i] - X[i]) ** 2).sum(axis=1)
        nb = g[np.argpartition(d, k)[:k]]
        nb.sort()
        j = np.searchsorted(nb, nb + WINDOW, side="right")
        best = int(np.argmax(j - np.arange(len(nb))))
        lo = nb[best]
        hits += lo <= g[i] <= lo + WINDOW
        tested += 1
    return hits / tested


def flatness(gf):
    """Normalised entropy of the guess-factor histogram: 1 is perfectly flat."""
    if len(gf) < 20:
        return float("nan")
    h, _ = np.histogram(gf, bins=GF_BINS, range=(-1, 1))
    p = h / h.sum()
    p = p[p > 0]
    return float(-(p * np.log(p)).sum() / math.log(GF_BINS))


WINDOW = 0.15  # about a robot's width in guess factors at 400 px for a power-2 bullet


def peak(gf):
    """Share of samples inside the best fixed aim window of WINDOW guess factors: what a gun
    that always fired at the single best offset would hit. A flat profile gives WINDOW / 2."""
    if len(gf) < 20:
        return float("nan")
    g = np.sort(np.asarray(gf))
    j = np.searchsorted(g, g + WINDOW, side="right")
    return float((j - np.arange(len(g))).max() / len(g))


def collect(work):
    """{rival: {shooter: data}} from every run directory under work."""
    out = {}
    for run in sorted(os.listdir(work)):
        bdir = os.path.join(work, run, "battles")
        if not os.path.isdir(bdir):
            continue
        # A run directory is the rival's slug, optionally with a "-<label>" suffix for a later
        # run against more shooters; all of a rival's runs merge into one map.
        rival = run.split("-")[0]
        per = out.setdefault(rival, defaultdict(lambda: {"dance": [], "gf_all": [], "gf_fire": [], "feats": [],
                                                         "paths": [], "gf_early": [], "gf_late": [],
                                                         "fire_x": [], "taken": 0.0, "shots": 0, "rounds": 0}))
        for b in sorted(os.listdir(bdir)):
            tp = os.path.join(bdir, b, "truth.log.gz")
            if not os.path.exists(tp):
                continue
            shooter = b.rsplit("-", 1)[0]
            try:
                rounds, fires = read_truth(tp)
            except (OSError, EOFError, ValueError) as e:
                print(f"skip {tp}: {e}", file=sys.stderr)
                continue
            d = per[shooter]
            rp = os.path.join(bdir, b, "result.csv")
            if os.path.exists(rp):
                with open(rp) as f:
                    rows_ = [l.rstrip("\n").split(",") for l in f if l.strip()]
                if len(rows_) >= 2:
                    rec = dict(zip(rows_[0], rows_[1]))
                    try:
                        d["taken"] += float(rec["theirBulletDamage"])
                        d["shots"] += int(float(rec["enemyShots"]))
                        d["rounds"] += int(float(rec["rounds"]))
                    except (KeyError, ValueError):
                        pass
            for r, rows in sorted(rounds.items()):
                if len(rows) < 30:
                    continue
                dance, ga, gfi, feats, arr, fx = analyse_round(rows, fires.get(r, {}))
                d["dance"] += dance
                d["gf_all"] += ga
                d["gf_fire"] += gfi
                if r < 12:
                    d["gf_early"] += gfi
                elif r >= 23:
                    d["gf_late"] += gfi
                d["feats"] += feats
                d["fire_x"] += fx
                if len(d["paths"]) < 3 and r >= 2:
                    d["paths"].append(arr[:, [1, 2, 6, 7]])
    return {r: dict(per) for r, per in out.items() if per}


SHOOTER_ORDER = ["sample.SittingDuck", "sample.TrackFire", "dz.GalbaMini_0.121", "abc.Shadow_3.83c", "hadur2.Hadur_3.13"]
# The shooter every rival (Hadur included) faces, for the side-by-side dance row.
COMMON_SHOOTER = "abc.Shadow_3.83c"


def shooter_key(s):
    return (SHOOTER_ORDER.index(s) if s in SHOOTER_ORDER else 99, s)


def pretty(slug):
    return slug.replace("_", " ")


def metrics(d):
    f = np.array(d["feats"]) if d["feats"] else np.zeros((0, 6))
    if len(f) == 0:
        return {}
    dist, lat, adv, v, x, y = f.T
    wall = np.minimum.reduce([x, y, FIELD_W - x, FIELD_H - y])
    return {
        "ticks": int(len(f)),
        "median_distance": float(np.median(dist)),
        "mean_abs_lateral_speed": float(np.mean(np.abs(lat))),
        "mean_advancing_speed": float(np.mean(adv)),
        "stopped_share": float(np.mean(np.abs(v) < 0.5)),
        "reversals_per_100": float(100 * np.sum(np.diff(np.sign(lat[np.abs(lat) > 0.5])) != 0) / len(f)),
        "near_wall_share": float(np.mean(wall < 60)),
        "gf_flatness_all": flatness(d["gf_all"]),
        "gf_flatness_fire": flatness(d["gf_fire"]),
        "gf_peak_all": peak(d["gf_all"]),
        "shots_seen": len(d["gf_fire"]),
        "gf_peak_fire": peak(d["gf_fire"]),
        "knn_gun_hits": knn_gun(d["fire_x"][:6000]),
        # what the shooter really did: bullet damage it dealt to the rival, per shot and per round
        "damage_per_shot": d["taken"] / d["shots"] if d["shots"] else float("nan"),
        "damage_per_round": d["taken"] / d["rounds"] if d["rounds"] else float("nan"),
        "damage_per_100_ticks": 100 * d["taken"] / len(f),
        "gf_peak_fire_rounds_0_11": peak(d["gf_early"]),
        "gf_peak_fire_rounds_23_34": peak(d["gf_late"]),
    }


def draw_rival(rival, per, path):
    shooters = sorted(per, key=shooter_key)
    fig, axes = plt.subplots(len(shooters), 4, figsize=(18, 3.9 * len(shooters)), squeeze=False)
    fig.suptitle(f"{pretty(rival)}: movement against a ladder of shooters", fontsize=16, y=0.995)
    for row, sh in enumerate(shooters):
        d = per[sh]
        m = metrics(d)
        a0, a1, a2, a3 = axes[row]
        f = np.array(d["feats"])
        # 1. field occupancy
        if len(f):
            a0.hist2d(f[:, 4], f[:, 5], bins=[40, 30], range=[[0, FIELD_W], [0, FIELD_H]],
                      cmap="magma", cmin=1)
        for p in d["paths"]:
            a0.plot(p[:, 0], p[:, 1], lw=0.6, alpha=0.8, color="#7fd4ff")
        a0.set_xlim(0, FIELD_W); a0.set_ylim(0, FIELD_H); a0.set_aspect("equal")
        a0.set_facecolor("#111"); a0.set_xticks([]); a0.set_yticks([])
        a0.set_ylabel(f"vs {pretty(sh)}", fontsize=12)
        if row == 0:
            a0.set_title("Field: where it lives (3 paths)")
        # 2. dance
        dn = np.array(d["dance"]) if d["dance"] else np.zeros((0, 2))
        if len(dn):
            a1.hist2d(dn[:, 0], dn[:, 1], bins=60, range=[[-260, 260], [-260, 260]], cmap="viridis", cmin=1)
        a1.axhline(0, color="w", lw=0.4); a1.axvline(0, color="w", lw=0.4)
        a1.annotate("", xy=(0, 60), xytext=(0, 0), arrowprops=dict(arrowstyle="->", color="w"))
        a1.set_xlim(-260, 260); a1.set_ylim(-260, 260); a1.set_aspect("equal"); a1.set_facecolor("#111")
        a1.tick_params(labelsize=8)
        if row == 0:
            a1.set_title("Dance: displacement over one flight\n(right = its lateral direction, up = away)")
        # 3. guess factors
        bins = np.linspace(-1, 1, GF_BINS + 1)
        if d["gf_all"]:
            a2.hist(d["gf_all"], bins=bins, density=True, color="#bbb", label="every tick")
        if len(d["gf_fire"]) >= 20:
            h, _ = np.histogram(d["gf_fire"], bins=bins, density=True)
            a2.step(bins[:-1], h, where="post", color="#e4572e", lw=2, label=f"shots fired ({len(d['gf_fire'])})")
        a2.axhline(0.5, color="k", ls=":", lw=0.8)
        a2.set_xlim(-1, 1); a2.set_xlabel("guess factor"); a2.legend(fontsize=8, loc="upper left")
        a2.text(0.98, 0.95, f"best fixed aim hits {100*m.get('gf_peak_all', float('nan')):.1f}%\n(flat {100*WINDOW/2:.1f}%)"
                + (f"\nlearning gun hits {100*m['knn_gun_hits']:.1f}%" if m.get('knn_gun_hits', float('nan')) == m.get('knn_gun_hits', float('nan')) else ""),
                transform=a2.transAxes, ha="right", va="top", fontsize=9)
        if row == 0:
            a2.set_title("Guess factors: the firing solution (flat = unlearnable)")
        # 4. range and orbit
        if len(f):
            a3.hist2d(f[:, 0], f[:, 1], bins=[40, 33], range=[[0, 900], [-8.25, 8.25]], cmap="cividis", cmin=1)
        a3.set_xlabel("distance to shooter"); a3.set_ylabel("lateral speed")
        a3.text(0.98, 0.95,
                f"median range {m.get('median_distance', 0):.0f}\n|lat| {m.get('mean_abs_lateral_speed', 0):.1f}  adv {m.get('mean_advancing_speed', 0):+.2f}\n"
                f"stopped {100*m.get('stopped_share', 0):.0f}%  walls {100*m.get('near_wall_share', 0):.0f}%\nreversals/100t {m.get('reversals_per_100', 0):.1f}\n"
                f"damage taken {m.get('damage_per_100_ticks', float('nan')):.2f} per 100 ticks",
                transform=a3.transAxes, ha="right", va="top", fontsize=8, color="w",
                bbox=dict(facecolor="black", alpha=0.5, lw=0))
        a3.set_facecolor("#111")
        if row == 0:
            a3.set_title("Range and orbit")
    fig.tight_layout()
    fig.savefig(path, dpi=80)
    plt.close(fig)


def draw_compare(data, path):
    shooters = sorted({s for per in data.values() for s in per}, key=shooter_key)
    shooters = [s for s in shooters if s != "sample.SittingDuck"]
    rivals = sorted(data)
    fig, axes = plt.subplots(2, max(len(shooters), len(rivals)), figsize=(5 * max(len(shooters), len(rivals)), 9.5), squeeze=False)
    for ax in axes[0][len(shooters):]:
        ax.axis("off")
    for ax in axes[1][len(rivals):]:
        ax.axis("off")
    # Bottom row: every rival's dance against the strongest shooter, same scale, side by side.
    top = COMMON_SHOOTER if COMMON_SHOOTER in shooters else (shooters[-1] if shooters else None)
    for ax, rival in zip(axes[1], rivals):
        dn = np.array(data[rival].get(top, {}).get("dance", [])) if top else np.zeros((0, 2))
        if len(dn):
            ax.hist2d(dn[:, 0], dn[:, 1], bins=60, range=[[-260, 260], [-260, 260]], cmap="viridis", cmin=1)
        ax.axhline(0, color="w", lw=0.4); ax.axvline(0, color="w", lw=0.4)
        ax.set_xlim(-260, 260); ax.set_ylim(-260, 260); ax.set_aspect("equal"); ax.set_facecolor("#111")
        ax.set_title(f"{pretty(rival)}: dance vs {pretty(top)}", fontsize=10)
    bins = np.linspace(-1, 1, GF_BINS + 1)
    centers = (bins[:-1] + bins[1:]) / 2
    for ax, sh in zip(axes[0], shooters):
        for rival, per in sorted(data.items()):
            if sh not in per or len(per[sh]["gf_all"]) < 20:
                continue
            h, _ = np.histogram(per[sh]["gf_all"], bins=bins, density=True)
            lw = 3 if rival.startswith("hadur2") else 1.6
            ax.plot(centers, h, lw=lw, label=f"{pretty(rival)} ({100*peak(per[sh]['gf_all']):.1f}%)")
        ax.axhline(0.5, color="k", ls=":", lw=0.8)
        ax.set_title(f"vs {pretty(sh)}"); ax.set_xlabel("guess factor"); ax.set_xlim(-1, 1)
        ax.legend(fontsize=8)
    fig.suptitle("Top: guess-factor profiles per shooter (legend: best fixed aim hit share, flat = {:.1f}%)".format(100 * WINDOW / 2), fontsize=14)
    fig.tight_layout()
    fig.savefig(path, dpi=80)
    plt.close(fig)


def main():
    ap = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    ap.add_argument("--work", required=True)
    ap.add_argument("--out", required=True)
    a = ap.parse_args()
    os.makedirs(a.out, exist_ok=True)
    data = collect(a.work)
    allm = {}
    for rival, per in data.items():
        draw_rival(rival, per, os.path.join(a.out, f"{rival}.png"))
        allm[rival] = {sh: metrics(d) for sh, d in per.items()}
        print("wrote", rival)
    draw_compare(data, os.path.join(a.out, "compare.png"))
    with open(os.path.join(a.out, "metrics.json"), "w") as f:
        json.dump(allm, f, indent=1)


if __name__ == "__main__":
    main()
