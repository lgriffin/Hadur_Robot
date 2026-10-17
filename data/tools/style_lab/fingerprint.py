"""Style fingerprints: what a movement looks like as a pattern, with no gun in the loop.

Each tick's lateral and advancing velocity (in the shooter's frame) becomes one of 15 symbols:
lateral speed in five bands (fast and slow either way, or still) times advancing in three
(retreat, hold, close). Sampled on a 4-tick beat, the symbol string is the movement's
vocabulary. The fingerprint is a fixed vector of numbers about that string and the raw frame:

  vocabulary   entropy of the symbol mix, conditional entropy of the next beat given 1 and 2
               beats (how much a pattern matcher could still not know), zlib compression ratio
  dwell        ticks between lateral reversals: mean, coefficient of variation, entropy
  fire timing  where the reversals fall against the enemy's gun: share in the first half of
               its fire cycle (reacting to the shot; a turn takes 4-6 ticks to show), entropy
               of that phase, and share in the last quarter-cycle before a bullet arrives (surfing)
  speed        mean speed, share at full speed, share stopped, stops per 100 ticks
  geometry     mean and spread of distance, share near a wall, share in a corner,
               perpendicularity (lateral share of speed), mean advancing speed
  rhythm       autocorrelation of lateral velocity at 8, 16 and 32 ticks
"""
import math
import zlib
from collections import Counter

import numpy as np

from movetrace import frame

FEATURES = (
    "sym_entropy", "cond_entropy_1", "cond_entropy_2", "compress_ratio",
    "dwell_mean", "dwell_cv", "dwell_entropy",
    "rev_on_fire", "rev_phase_entropy", "rev_at_impact", "rev_per_wave",
    "speed_mean", "full_speed", "stopped", "stops_per_100",
    "dist_mean", "dist_sd", "near_wall", "corner", "perpendicular", "adv_mean",
    "ac8", "ac16", "ac32",
)
BEAT = 4
LAT_EDGES = (-5.0, -1.5, 1.5, 5.0)
ADV_EDGES = (-2.0, 2.0)


def symbols(lat, adv):
    """0..14: lateral band (0 fast one way .. 4 fast the other) * 3 + advancing band."""
    return np.digitize(lat, LAT_EDGES) * 3 + np.digitize(adv, ADV_EDGES)


def entropy(counts):
    c = np.asarray([v for v in counts if v > 0], dtype=float)
    if c.sum() == 0:
        return 0.0
    p = c / c.sum()
    return float(-(p * np.log2(p)).sum())


def cond_entropy(seqs, k):
    """H(next symbol | previous k symbols) in bits, pooled over sequences."""
    joint, ctx = Counter(), Counter()
    for s in seqs:
        for i in range(k, len(s)):
            c = tuple(s[i - k:i])
            joint[c + (s[i],)] += 1
            ctx[c] += 1
    n = sum(joint.values())
    if n == 0:
        return 0.0
    return entropy(joint.values()) - entropy(ctx.values())


def reversals(lat, hyst=1.0):
    """Indices where the lateral direction flips, ignoring motion under hyst px/tick."""
    out, last = [], 0
    for i, v in enumerate(lat):
        if abs(v) < hyst:
            continue
        s = 1 if v > 0 else -1
        if last and s != last:
            out.append(i)
        last = s
    return out


def autocorr(x, lag):
    if len(x) <= lag + 2:
        return float("nan")
    a, b = x[:-lag] - x.mean(), x[lag:] - x.mean()
    d = math.sqrt((a * a).sum() * (b * b).sum())
    return float((a * b).sum() / d) if d > 0 else 0.0


def fingerprint(traces):
    """Fingerprint vector (dict over FEATURES) pooled over a list of Trace."""
    seqs, dwell, phase, impact = [], [], [], []
    acs = {8: [], 16: [], 32: []}
    pooled = {k: [] for k in ("lat", "adv", "v", "dist", "wall", "corner")}
    waves = revs = stops = ticks = 0
    for tr in traces:
        for r in tr.rounds:
            f = frame(r)
            ok = r.alive() & (r.t >= 10) & (f["dist"] > 40)
            if ok.sum() < 30:
                continue
            idx = np.nonzero(ok)[0]
            lat, adv = f["lat"][idx], f["adv"][idx]
            seqs.append(list(symbols(lat[::BEAT], adv[::BEAT])))
            rv = reversals(lat)
            dwell += list(np.diff(rv))
            for i in rv:
                if f["since_fire"][idx[i]] < 999:
                    phase.append(min(f["since_fire"][idx[i]] / f["cycle"], 0.999))
                if f["to_impact"][idx[i]] < 999:
                    impact.append(min(f["to_impact"][idx[i]] / f["cycle"], 0.999))
            revs += len(rv)
            waves += sum(1 for tk in r.fires if r.t[0] <= tk <= r.t[-1])
            v = np.abs(r.v[idx])
            stops += int(((v[1:] < 0.5) & (v[:-1] >= 0.5)).sum())
            ticks += len(idx)
            for k in acs:
                acs[k].append((autocorr(lat, k), len(lat)))
            x, y = r.x[idx], r.y[idx]
            near = np.stack([x, y, 800 - x, 600 - y]) < 100
            pooled["corner"].append(near.sum(axis=0) >= 2)
            for k, a in (("lat", lat), ("adv", adv), ("v", v), ("dist", f["dist"][idx]), ("wall", f["wall"][idx])):
                pooled[k].append(a)
    if ticks == 0:
        return None
    P = {k: np.concatenate(v) for k, v in pooled.items()}
    sym = Counter(s for q in seqs for s in q)
    raw = bytes(s for q in seqs for s in q)
    dwell = np.asarray(dwell, dtype=float)
    ph = np.asarray(phase, dtype=float)
    imp = np.asarray(impact, dtype=float)
    moving = P["v"] > 1
    fp = {
        "sym_entropy": entropy(sym.values()),
        "cond_entropy_1": cond_entropy(seqs, 1),
        "cond_entropy_2": cond_entropy(seqs, 2),
        "compress_ratio": len(zlib.compress(raw, 9)) / max(1, len(raw)),
        "dwell_mean": float(dwell.mean()) if len(dwell) else 200.0,
        "dwell_cv": float(dwell.std() / dwell.mean()) if len(dwell) > 1 else 0.0,
        "dwell_entropy": entropy(np.histogram(np.minimum(dwell, 119), bins=24, range=(0, 120))[0]) if len(dwell) else 0.0,
        "rev_on_fire": float(np.mean(ph < 0.5)) if len(ph) else 0.0,
        "rev_phase_entropy": entropy(np.histogram(ph, bins=10, range=(0, 1))[0]) if len(ph) else 0.0,
        "rev_at_impact": float(np.mean(imp < 0.25)) if len(imp) else 0.0,
        "rev_per_wave": revs / max(1, waves),
        "speed_mean": float(P["v"].mean()),
        "full_speed": float(np.mean(P["v"] > 7.5)),
        "stopped": float(np.mean(P["v"] < 0.5)),
        "stops_per_100": 100.0 * stops / ticks,
        "dist_mean": float(P["dist"].mean()),
        "dist_sd": float(P["dist"].std()),
        "near_wall": float(np.mean(P["wall"] < 60)),
        "corner": float(np.mean(P["corner"])),
        "perpendicular": float(np.mean(np.abs(P["lat"][moving]) / P["v"][moving])) if moving.any() else 0.0,
        "adv_mean": float(P["adv"].mean()),
    }
    for k in acs:
        vals = [(a, n) for a, n in acs[k] if np.isfinite(a)]
        fp[f"ac{k}"] = float(sum(a * n for a, n in vals) / sum(n for _, n in vals)) if vals else 0.0
    fp["ticks"] = ticks
    fp["reversal_dwells"] = dwell.tolist()[:4000]
    fp["reversal_phases"] = ph.tolist()[:4000]
    fp["reversal_impacts"] = imp.tolist()[:4000]
    fp["symbol_counts"] = {int(k): int(v) for k, v in sym.items()}
    fp["transitions"] = transitions(seqs)
    return fp


def transitions(seqs):
    """15x15 beat-to-beat symbol transition counts."""
    m = np.zeros((15, 15), dtype=int)
    for s in seqs:
        for a, b in zip(s[:-1], s[1:]):
            m[a, b] += 1
    return m.tolist()


def vector(fp):
    return np.array([fp[k] for k in FEATURES], dtype=float)
