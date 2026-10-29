#!/usr/bin/env python3
"""K0 of the road to king: the enemy-gun oracle (docs/bench/gun-oracle.md, ORACLE-1).

    python3 data/tools/gun_oracle.py join WORKDIR [WORKDIR ...] --out DATA.npz [--jobs 4]
    python3 data/tools/gun_oracle.py score DATA.npz --out REPORT.md [--classes TSV] [--tsv PER_BOT.tsv]

A bench run of an `oracle` build (hadur-bench/build-ablation.sh; `aesrec,oracle` for the gate)
leaves, per battle directory WORKDIR/battles/<slug>-<seed>/, a hadur.log with one ORC record per
wave at the surf's first three-option rating of it (each danger view's neighbours on the wave)
and a truth.log.gz with every enemy bullet as it first appears. `join` matches each
record on a real wave to the bullet the enemy fired on it (as aes_rank.py does: one tick after
the wave's fire time, at the same power) and turns the bullet's true heading into the wave's
guess factor. The record carries each view's neighbours (guess factor and scan weight), so each
view's surface is rebuilt here with the surf's own kernel (MoveController.kernelMass: the mass of
2^-|u| over an interval, u in half-widths), over a robot's width (HitForensics.HALF_WIDTH) at
each guess factor. It also reads, from the truth log alone, where the simple guns would have aimed
(head-on, linear and circular from the shooter's position at Hadur's true state one tick earlier),
and, when the build also wrote AES records, the parity terms of the gate.

`score` rates every model of the enemy's gun on the same bullets. A model is a surface over the
wave's guess factors; each is normalised to a density over [-1, 1] and mixed with 5% uniform, so
no bullet scores minus infinity. Per bullet:
    bits = log2 of the density at the bullet's guess factor over the uniform's (0 = no better than
           guessing, higher is better);
    safe = 1 when the bullet came from the third of the wave the model rated least dangerous (the
           danger percentile, ties at mid-rank, below 1/3), else 0; a model that knows nothing
           scores 1/3 by luck, a perfect one 0, and the surf drives into that third.
Each opponent is weighted equally, as in the rumble. The models of K0 are the baselines: uniform,
each of the eleven views, the shipped blend (the views as MoveController.getDangerScore averages
them), and the three simple aims (one neighbour each, same kernel). K1 adds members to models().

The gate (K0 in the plan) checks the oracle is the surf, offline: on waves with both records, the
views' score rebuilt from the neighbours over each option's plan interval equals the AES record's
(on options no shadow touched), and with the rebuilt scores in place of the logged ones the
surf's rule picks the option it took. Standard library for parsing; numpy for saving and scoring.
"""

import argparse
import math
import os
import re
import sys
from collections import defaultdict
from multiprocessing import Pool

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import aes_rank as ar  # noqa: E402
import census_classify as cc  # noqa: E402

SAMPLES = 81       # guess factors a surface is rebuilt at, evenly over [-1, 1]
CHUNK = 20000      # waves rated at a time, so a census-sized data set fits in memory
HALF_WIDTH = 18.0  # HitForensics.HALF_WIDTH: a robot's half width, px
VIEWS = ar.VIEWS
EPS = 0.05         # the uniform mixed into every model
AIMS = ("headon", "linear", "circular")
SLUG_RUN = re.compile(r"[^A-Za-z0-9.]+")  # Opponent.slug, the battle directory's name: a dash becomes _


# ----------------------------------------------------------------------------- parsing (stdlib)

def parse_orc(line):
    """One ORC line (anything before 'ORC,' is the harvester's prefix) as a dict, or None.

    Per view: on, weight, and its neighbours as (guess factors, scan weights).
    """
    i = line.find("ORC,")
    if i < 0:
        return None
    p = line[i:].rstrip("\n").split(",")
    try:
        rec = {"round": int(p[1]), "tick": int(p[2]), "fire": int(p[3]), "power": float(p[4]),
               "firing": p[5] == "1", "sx": float(p[6]), "sy": float(p[7]), "bearing": float(p[8]),
               "dir": int(p[9]), "mea": float(p[10]), "dist": float(p[11]), "chosen": int(p[12]),
               "options": [(ar.num(p[13 + 2 * o]), ar.num(p[14 + 2 * o])) for o in range(3)]}
        n = int(p[19])
        at = 20
        on, weight, gfs, scans = [], [], [], []
        for _ in range(n):
            on.append(float(p[at]) == 1)
            weight.append(float(p[at + 1]))
            count = int(float(p[at + 2]))
            vals = [float(x) for x in p[at + 3:at + 3 + 2 * count]]
            if len(vals) != 2 * count:
                return None
            gfs.append(vals[0::2])
            scans.append(vals[1::2])
            at += 3 + 2 * count
        if at != len(p):
            return None
        rec.update(views=n, on=on, weight=weight, gfs=gfs, scans=scans)
        return rec
    except (IndexError, ValueError):
        return None


def gf_of(rec, angle):
    """The wave's guess factor of absolute angle `angle` (Wave.firingAngle inverted)."""
    return cc.norm(angle - rec["bearing"]) / (rec["dir"] * rec["mea"]) if rec["mea"] > 0 else 0.0


def simple_aims(ticks, k, speed):
    """{aim: absolute angle} from the shooter at tick k-1 at Hadur's true state at k-2, or None."""
    if k < 3:
        return None
    ox, oy = ticks[k - 1][3], ticks[k - 1][4]
    q, before = ticks[k - 2], ticks[k - 3]
    hx, hy, hh, hv = q[1], q[2], q[10], q[11]
    dh = cc.norm(hh - before[10])
    if abs(dh) > 0.18:
        dh = 0.0  # a reversal flips the heading by pi; it is not a turn
    return {"headon": cc.bearing(ox, oy, hx, hy),
            "linear": cc.predict(hx, hy, hh, hv, 0.0, ox, oy, speed),
            "circular": cc.predict(hx, hy, hh, hv, dh, ox, oy, speed)}


def kernel_mass(angles, low, high):
    """MoveController.kernelMass over one open segment [low, high]: each neighbour's mass, by angle.

    `angles` (neighbours) against `low`/`high` (intervals) broadcast; the bandwidth is the half width.
    """
    import numpy as np
    b = (high - low) / 2.0
    centre = (high + low) / 2.0
    a = centre + np.mod(angles - centre + math.pi, 2 * math.pi) - math.pi  # DiaUtils.normalizeAngle
    def cdf(x):
        d = (x - a) / b
        m = 1.0 - np.power(2.0, -np.abs(d))
        return np.where(d >= 0, m, -m)
    return cdf(high) - cdf(low)


def view_values(rec, angles_at):
    """Per view: on, weight, summed scan weight, and its density at each absolute angle in `angles_at`
    (the kernel's mass over a robot's width there, scan-weighted, over the scan weight)."""
    import numpy as np
    half = math.atan(HALF_WIDTH / max(rec["dist"], HALF_WIDTH))
    lo, hi = angles_at - half, angles_at + half
    n = rec["views"]
    dens = np.full((n, len(angles_at)), np.nan)
    scan_sum = np.zeros(n)
    for v in range(n):
        if not rec["on"][v] or not rec["gfs"][v]:
            continue
        gf = np.array(rec["gfs"][v])
        sc = np.array(rec["scans"][v])
        ang = rec["bearing"] + gf * rec["dir"] * rec["mea"]
        mass = kernel_mass(ang[None, :], lo[:, None], hi[:, None])
        scan_sum[v] = sc.sum()
        if scan_sum[v] > 0:
            dens[v] = (mass * sc[None, :]).sum(axis=1) / scan_sum[v]
    return dens, scan_sum


def view_score(rec, low, high):
    """The views' score over [low, high], as getDangerScore computes it with no shadow; NaN with no view."""
    import numpy as np
    num = den = 0.0
    for v in range(rec["views"]):
        if not rec["on"][v] or not rec["gfs"][v]:
            continue
        ang = rec["bearing"] + np.array(rec["gfs"][v]) * rec["dir"] * rec["mea"]
        sc = np.array(rec["scans"][v])
        num += rec["weight"][v] * float((kernel_mass(ang, low, high) * sc).sum())
        den += rec["weight"][v] * float(sc.sum())
    return num / den if den > 0 else float("nan")


def surf_choice(totals):
    """SurfMover.surf's rule on three totals (inf for no plan): the stop on a tie, then clockwise below ccw."""
    ccw, stop, cw = totals
    if stop <= ccw and stop <= cw:
        return 1
    return 2 if cw < ccw else 0


def gate_terms(rec, a):
    """(AES views' scores, rebuilt scores, shadowed flags, choice check) of one wave with both records.

    The choice check is 1 when, with every option's views' score rebuilt (and its first-wave danger
    rescaled to match), the surf's rule picks the option the AES record says it took; 0 when not; -1
    when some option cannot be rebuilt exactly (a shadow, or the no-data fallback).
    """
    logged, rebuilt, shadowed = [float("nan")] * 3, [float("nan")] * 3, [0] * 3
    totals, exact = [float("inf")] * 3, True
    n = rec["views"]
    for o, opt in enumerate(a["options"]):
        if opt is None:
            continue
        total, t = opt
        logged[o] = t[ar.VIEW_SCORE]
        shadowed[o] = int(t[ar.SHADOWED] > 0 or not math.isnan(t[ar.FIXED + 2 * n]))
        rebuilt[o] = view_score(rec, t[ar.LOW], t[ar.HIGH])
        if shadowed[o] or math.isnan(rebuilt[o]):
            exact = False
            continue
        base = t[ar.HIT_RATE] * (1 - t[ar.SHADOWED])
        old = base + t[ar.VIEW_SCORE]
        first = t[ar.FIRST] * (base + rebuilt[o]) / old if old > 0 else t[ar.FIRST]
        totals[o] = total - t[ar.FIRST] + first
    check = surf_choice(totals) == a["chosen"] if exact else -1
    return logged, rebuilt, shadowed, int(check)


def join_battle(dirpath):
    """Rows of every ORC record on a real wave matched to its bullet, and counts."""
    import numpy as np
    ticks_by_round, spawns = cc.read_truth(os.path.join(dirpath, "truth.log.gz"))
    at = {r: {tk[0]: k for k, tk in enumerate(t)} for r, t in ticks_by_round.items()}
    stats = {"records": 0, "real": 0, "matched": 0,
             "bullets": sum(len(v) for v in spawns.values())}
    out = []
    log = os.path.join(dirpath, "hadur.log")
    if not os.path.exists(log):
        return out, stats
    aes, orcs = {}, []
    with open(log, encoding="utf-8", errors="replace") as f:
        for line in f:
            if "ORC," in line:
                rec = parse_orc(line)
                if rec is not None:
                    orcs.append(rec)
            elif "AES," in line:
                a = ar.parse_record(line)
                if a is not None:
                    aes[(a["round"], a["tick"], a["fire"])] = a
    grid_gf = np.linspace(-1.0, 1.0, SAMPLES)
    used = set()
    for rec in orcs:
        stats["records"] += 1
        if not rec["firing"]:
            continue
        stats["real"] += 1
        best = None
        for k, sp in enumerate(spawns.get(rec["round"], ())):
            t, power, heading = sp[0], sp[1], sp[4]
            if heading is None or (rec["round"], k) in used or abs(power - rec["power"]) > 0.05:
                continue
            dt = abs(t - rec["fire"] - 1)
            if dt <= 1 and (best is None or dt < best[0]):
                best = (dt, k, t, power, heading)
        if best is None:
            continue
        used.add((rec["round"], best[1]))
        stats["matched"] += 1
        _, _, t, power, heading = best
        gf = gf_of(rec, heading)
        angles = rec["bearing"] + np.append(grid_gf, gf) * rec["dir"] * rec["mea"]
        dens, scan_sum = view_values(rec, angles)
        aims = [float("nan")] * len(AIMS)
        k = at.get(rec["round"], {}).get(t)
        if k is not None:
            a = simple_aims(ticks_by_round[rec["round"]], k, 20 - 3 * power)
            if a is not None:
                aims = [gf_of(rec, a[name]) for name in AIMS]
        a = aes.get((rec["round"], rec["tick"], rec["fire"]))
        out.append({"gf": gf, "power": power, "dist": rec["dist"], "mea": rec["mea"], "round": rec["round"],
                    "on": rec["on"], "weight": rec["weight"], "scan": scan_sum, "dens": dens, "aims": aims,
                    "gate": gate_terms(rec, a) if a is not None else None})
    return out, stats


def _join_job(args):
    dirpath, name = args
    rows, stats = join_battle(dirpath)
    return name, rows, stats


def join(workdirs, out, jobs):
    import numpy as np
    tasks = []
    for w in workdirs:
        base = os.path.join(w, "battles")
        for name in sorted(os.listdir(base)):
            bid = ar.battle_id(name)
            if bid is None or bid[2]:
                continue
            tasks.append((os.path.join(base, name), name))
    bots, cols, totals = {}, defaultdict(list), defaultdict(int)
    views = None
    nan3 = [float("nan")] * 3
    with Pool(max(1, jobs)) as pool:
        for name, rows, stats in pool.imap_unordered(_join_job, tasks, chunksize=1):
            for k, v in stats.items():
                totals[k] += v
            bi = bots.setdefault(ar.battle_id(name)[0], len(bots))
            for r in rows:
                views = views or len(r["on"])
                if len(r["on"]) != views:
                    continue
                cols["bot"].append(bi)
                for key in ("gf", "power", "dist", "mea", "round", "on", "weight", "scan", "aims"):
                    cols[key].append(r[key])
                # Half precision: the surfaces are most of the data set, and a density needs 3 digits.
                cols["surface"].append(r["dens"][:, :SAMPLES].astype(np.float16))
                cols["at"].append(r["dens"][:, SAMPLES])
                g = r["gate"] or (nan3, nan3, [1, 1, 1], -2)
                cols["g_logged"].append(g[0])
                cols["g_rebuilt"].append(g[1])
                cols["g_shadowed"].append(g[2])
                cols["g_choice"].append(g[3])
    if not cols["bot"]:
        sys.exit("no matched records: is this a run of an oracle build with the truth log on?")
    names = sorted(bots, key=bots.get)
    f32 = ("at", "scan", "weight", "dist", "mea", "aims", "gf")
    arrays = {k: np.array(v, dtype=np.float16 if k == "surface" else np.float32 if k in f32 else None)
              for k, v in cols.items()}
    np.savez_compressed(out, bots=np.array(names), **arrays)
    print("battles %d, records %d, on real waves %d, matched to a bullet %d of %d bullets; %d opponents -> %s"
          % (len(tasks), totals["records"], totals["real"], totals["matched"], totals["bullets"], len(names), out))


# ----------------------------------------------------------------------------- the models (numpy)

def aim_values(z, i):
    """A simple aim as a one-neighbour view: (surface on the grid, value at the bullet's gf)."""
    import numpy as np
    gf = z["gf"].astype(np.float64)
    aim = z["aims"][:, i].astype(np.float64)
    mea = z["mea"].astype(np.float64)
    half = np.arctan(HALF_WIDTH / np.maximum(z["dist"].astype(np.float64), HALF_WIDTH))
    pts = np.concatenate([np.tile(np.linspace(-1.0, 1.0, SAMPLES), (len(gf), 1)), gf[:, None]], axis=1)
    centre = pts * mea[:, None]
    m = kernel_mass(aim[:, None] * mea[:, None], centre - half[:, None], centre + half[:, None])
    m[~np.isfinite(aim)] = np.nan
    return m[:, :SAMPLES], m[:, SAMPLES]


def models(z):
    """{name: (surface waves x SAMPLES, value at the bullet's gf)}; NaN rows where the model is silent."""
    import numpy as np
    on = z["on"].astype(bool)
    surf = z["surface"].astype(np.float64)
    at = z["at"].astype(np.float64)
    w = z["weight"].astype(np.float64)
    scan = z["scan"].astype(np.float64)
    n = surf.shape[1]
    out = {"uniform": (np.ones((surf.shape[0], surf.shape[2])), np.ones(surf.shape[0]))}
    for v in range(n):
        out["view:" + (VIEWS[v] if v < len(VIEWS) else str(v))] = (surf[:, v, :], at[:, v])
    ws = np.where(on & (scan > 0), w * scan, 0.0)
    den = ws.sum(axis=1)
    den = np.where(den > 0, den, np.nan)
    out["blend (shipped)"] = (np.einsum("wv,wvg->wg", ws, np.nan_to_num(surf)) / den[:, None],
                              np.einsum("wv,wv->w", ws, np.nan_to_num(at)) / den)
    for i, a in enumerate(AIMS):
        out["aim:" + a] = aim_values(z, i)
    return out


def rate(surface, value):
    """(bits, safe) per wave for one model; NaN where the model has no surface.

    The surface is normalised over the grid, mixed with EPS uniform; `value` is read on the same scale.
    Safe is the expected share of the bullet in the model's safest third, ties broken at random.
    """
    import numpy as np
    s = np.clip(surface, 0.0, None)
    dx = 2.0 / (SAMPLES - 1)
    mass = (s.sum(axis=1) - 0.5 * (s[:, 0] + s[:, -1])) * dx
    ok = np.isfinite(mass) & (mass > 0) & np.isfinite(value)
    safe_mass = np.where(ok, mass, 1.0)
    p = (1 - EPS) * s / safe_mass[:, None] + EPS * 0.5
    at = (1 - EPS) * np.clip(np.nan_to_num(value), 0.0, None) / safe_mass + EPS * 0.5
    bits = np.log2(at / 0.5)
    tol = 1e-9 * np.maximum(at, 1e-12)
    below = (p < at[:, None] - tol[:, None]).sum(axis=1)
    ties = np.maximum((np.abs(p - at[:, None]) <= tol[:, None]).sum(axis=1), 1)
    cut = SAMPLES / 3.0
    safe = np.clip((cut - below) / ties, 0.0, 1.0)
    bits[~ok] = np.nan
    safe[~ok] = np.nan
    return bits, safe


def per_bot(values, bot, n_bots):
    """Mean per opponent over the waves where the value is defined; NaN for none."""
    import numpy as np
    out = np.full(n_bots, np.nan)
    for b in range(n_bots):
        v = values[(bot == b) & np.isfinite(values)]
        if len(v):
            out[b] = v.mean()
    return out


def read_classes(path):
    """{slug: 'gun-move'} from the census classes TSV."""
    out = {}
    if not path or not os.path.exists(path):
        return out
    with open(path, encoding="utf-8") as f:
        head = f.readline().rstrip("\n").split("\t")
        gi, mi = head.index("gun_class"), head.index("move_class")
        for line in f:
            p = line.rstrip("\n").split("\t")
            if len(p) > max(gi, mi):
                out[SLUG_RUN.sub("_", p[0])] = p[gi] + "-" + p[mi]
    return out


def gate(z):
    """(waves with both records, options rebuilt, share within 1e-3, choices checked, share matching)."""
    import numpy as np
    choice = z["g_choice"].astype(int)
    both = choice > -2
    if not both.any():
        return None
    logged, rebuilt = z["g_logged"][both].astype(np.float64), z["g_rebuilt"][both].astype(np.float64)
    clear = (z["g_shadowed"][both] == 0) & np.isfinite(logged) & np.isfinite(rebuilt)
    rel = np.abs(logged - rebuilt) / np.maximum(np.abs(logged), 1e-6)
    checked = choice[both] >= 0
    return (int(both.sum()), int(clear.sum()), float(np.mean(rel[clear] < 1e-3)) if clear.any() else float("nan"),
            int(checked.sum()), float(np.mean(choice[both][checked] == 1)) if checked.any() else float("nan"))


def score(path, out, classes_path, tsv):
    import numpy as np
    z = dict(np.load(path))
    bots = [str(b) for b in z["bots"]]
    bot = z["bot"].astype(int)
    gf = z["gf"].astype(np.float64)
    classes = read_classes(classes_path)
    per, rows = {}, []
    rated = defaultdict(lambda: (np.full(len(gf), np.nan), np.full(len(gf), np.nan)))
    for lo in range(0, len(gf), CHUNK):
        part = {k: (v[lo:lo + CHUNK] if getattr(v, "shape", ()) and v.shape[0] == len(gf) else v) for k, v in z.items()}
        for name, (surface, value) in models(part).items():
            b, s = rate(surface, value)
            rated[name][0][lo:lo + CHUNK] = b
            rated[name][1][lo:lo + CHUNK] = s
    for name, (bits, safe) in rated.items():
        pb, ps = per_bot(bits, bot, len(bots)), per_bot(safe, bot, len(bots))
        per[name] = (pb, ps)
        cover = float(np.mean(np.isfinite(bits)))
        rows.append((name, np.nanmean(pb) if np.isfinite(pb).any() else float("nan"),
                     np.nanmean(ps) if np.isfinite(ps).any() else float("nan"), cover))
    lines = ["# Gun oracle (K0): every model scored on the same bullets", "",
             "Data: `%s`, %d enemy bullets matched to the wave the surf rated, %d opponents. Means per "
             "opponent, each opponent weighted equally. **bits**: log2 of the model's density at the bullet's "
             "guess factor over the uniform's, after a 5%% uniform mix (higher is better). **safe**: the share "
             "of bullets from the third of the wave the model rated least dangerous, the third the surf drives "
             "into (lower is better; 0.333 knows nothing). **coverage**: the share of bullets on which the model "
             "had a surface (a view off or empty has none)." % (os.path.basename(path), len(gf), len(bots)), "",
             "| Model | bits | safe | coverage |", "|---|---|---|---|"]
    for name, b, s, c in rows:
        lines.append("| %s | %s | %s | %.0f%% |" % (name, "-" if np.isnan(b) else "%+.3f" % b,
                                                    "-" if np.isnan(s) else "%.3f" % s, 100 * c))
    lines += ["", "Bullets outside the classic escape angle (|gf| > 1, scored where they were fired, normalised "
              "over [-1, 1]): %.1f%%." % (100 * float(np.mean(np.abs(gf) > 1.0)))]
    g = gate(z)
    lines += ["", "## Gate: the oracle is the surf, offline", ""]
    if g is None:
        lines.append("No wave carried an AES record too: build `aesrec,oracle` to run the gate.")
    else:
        waves, opts, same, checked, chosen = g
        lines += ["| Check | On | Result |", "|---|---|---|",
                  "| Views' score rebuilt from the neighbours over each option's plan interval equals the AES "
                  "record's (within 0.1%%), options no shadow touched | %d options | %.2f%% |" % (opts, 100 * same),
                  "| With the rebuilt scores, the surf's rule picks the option it took (waves with every option "
                  "rebuilt) | %d of %d waves | %.2f%% |" % (checked, waves, 100 * chosen)]
    if classes:
        lines += ["", "## By census class", "",
                  "| Class | Bots | blend bits | blend safe | best simple aim bits |", "|---|---|---|---|---|"]
        cls = np.array([classes.get(b, "unclassed") for b in bots])
        aim_best = np.nanmax(np.stack([per["aim:" + a][0] for a in AIMS]), axis=0)
        for c in sorted(set(cls)):
            m = cls == c
            bb, bs = per["blend (shipped)"]
            lines.append("| %s | %d | %+.3f | %.3f | %+.3f |" % (
                c, int(m.sum()), np.nanmean(bb[m]), np.nanmean(bs[m]), np.nanmean(aim_best[m])))
    with open(out, "w", encoding="utf-8") as f:
        f.write("\n".join(lines) + "\n")
    if tsv:
        names = list(per)
        with open(tsv, "w", encoding="utf-8") as f:
            f.write("opponent\tclass\tbullets\t" + "\t".join("%s bits\t%s safe" % (n, n) for n in names) + "\n")
            for b, name in enumerate(bots):
                vals = []
                for n in names:
                    vals += ["%.4f" % per[n][0][b], "%.4f" % per[n][1][b]]
                f.write("%s\t%s\t%d\t%s\n" % (name, classes.get(name, ""), int((bot == b).sum()), "\t".join(vals)))
    print("\n".join(lines))


def main():
    p = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    sub = p.add_subparsers(dest="cmd", required=True)
    j = sub.add_parser("join")
    j.add_argument("workdirs", nargs="+")
    j.add_argument("--out", required=True)
    j.add_argument("--jobs", type=int, default=os.cpu_count() or 1)
    s = sub.add_parser("score")
    s.add_argument("data")
    s.add_argument("--out", required=True)
    s.add_argument("--classes", default=os.path.join(os.path.dirname(__file__), "..", "..", "docs", "bench",
                                                       "local", "2026-10-18_census-classes.tsv"))
    s.add_argument("--tsv")
    a = p.parse_args()
    if a.cmd == "join":
        join(a.workdirs, a.out, a.jobs)
    else:
        score(a.data, a.out, a.classes, a.tsv)


if __name__ == "__main__":
    main()
