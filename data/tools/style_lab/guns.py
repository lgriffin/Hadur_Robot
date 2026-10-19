"""The gun panel: eight offline guns replayed over a trace. This is the style lab's judge.

Every gun fires a virtual bullet at each tick the real shooter fired, at the real power, from
where the shooter stood, using only what it could have seen up to that tick. The bullet hits
when its angle is within a robot's half-width (18 px) of where the subject really was when the
bullet's wave reached it. Learning guns learn, within a battle, from a wave every tick (power
1.9, Shadow's usual power), each available only once that wave has broken.

  head_on     the bearing
  linear      straight on at the current heading and speed, stopping at walls
  circular    the same, turning at the current turn rate
  avg_linear  lateral speed averaged over the last 16 ticks
  gf_flat     one guess-factor histogram for everything (the most visited angle)
  gf_seg      guess factors segmented by distance, lateral speed and acceleration
  knn         k-nearest-neighbour guess factors on seven features, as top guns do
  knn_rhythm  the same plus the length of the last finished dwell (ticks between the last
              two reversals): it sees a movement whose dwells come in runs of similar length
  pattern     a symbolic pattern matcher: finds the longest earlier match of the last
              (speed, turn) ticks and plays the movement after it forward

A movement nothing on the panel can learn scores near the random rate (`random` in the
result: a uniform guess-factor gun's expected hit rate for the same shots).
"""
import math

import numpy as np

from movetrace import FIELD_W, FIELD_H, HALF_BOT, bullet_speed, frame, norm_angle

GUNS = ("head_on", "linear", "circular", "avg_linear", "gf_flat", "gf_seg", "knn", "knn_rhythm", "pattern")
LEARN_POWER = 1.9
GF_BINS = 47
MAX_FLIGHT = 120


def arrivals(r, power):
    """Per tick index i: (index j where a bullet fired at i reaches the subject, or -1)."""
    n = r.n
    speed = bullet_speed(power)
    out = np.full(n, -1, dtype=int)
    alive = r.alive()
    for k in range(1, MAX_FLIGHT):
        if k >= n:
            break
        i = np.arange(n - k)
        d = np.hypot(r.x[i + k] - r.sx[i], r.y[i + k] - r.sy[i])
        hit = (out[i] < 0) & (d <= k * speed) & alive[i + k]
        out[i[hit]] = i[hit] + k
    return out


def wall_ahead(x, y, ang):
    """Distance from (x, y) along absolute angle ang to the field edge (with a robot margin)."""
    dx, dy = math.sin(ang), math.cos(ang)
    best = 1e9
    if dx > 1e-9:
        best = min(best, (FIELD_W - HALF_BOT - x) / dx)
    elif dx < -1e-9:
        best = min(best, (HALF_BOT - x) / dx)
    if dy > 1e-9:
        best = min(best, (FIELD_H - HALF_BOT - y) / dy)
    elif dy < -1e-9:
        best = min(best, (HALF_BOT - y) / dy)
    return max(0.0, best)


def project(x, y, h, v, dh, ox, oy, speed, steps=None):
    """Iterate a robot forward from (x, y) until a bullet from (ox, oy) at speed reaches it.
    steps: optional list of (v, dh) to play instead of constant v and dh."""
    for k in range(1, MAX_FLIGHT):
        if steps is not None:
            if k - 1 < len(steps):
                v, dh = steps[k - 1]
            else:
                v, dh = 0.0, 0.0
        h += dh
        x = min(FIELD_W - HALF_BOT, max(HALF_BOT, x + v * math.sin(h)))
        y = min(FIELD_H - HALF_BOT, max(HALF_BOT, y + v * math.cos(h)))
        if math.hypot(x - ox, y - oy) <= k * speed:
            break
    return math.atan2(x - ox, y - oy)


class Battle:
    """Learning state for one battle."""

    def __init__(self):
        cap = 60000
        self.X = np.zeros((cap, 8))
        self.G = np.zeros(cap)
        self.seg = np.zeros(cap, dtype=int)
        self.m = 0
        self.flat = np.zeros(GF_BINS)
        self.segh = np.zeros((27, GF_BINS))
        self.hist = []          # pattern symbols across the battle
        self.hist_steps = []    # (v, dh) per symbol

    def add(self, x, g, seg):
        if self.m >= len(self.G):
            return
        self.X[self.m], self.G[self.m], self.seg[self.m] = x, g, seg
        self.m += 1
        b = gf_bin(g)
        self.flat[b] += 1
        self.segh[seg, b] += 1


def gf_bin(g):
    return int(round((g + 1) / 2 * (GF_BINS - 1)))


def best_gf(hist):
    """Most visited guess factor of a histogram, smoothed over neighbours."""
    s = np.convolve(hist, [0.25, 0.5, 1.0, 0.5, 0.25], mode="same")
    return np.argmax(s) / (GF_BINS - 1) * 2 - 1


def densest(gfs, bw):
    """Guess factor of greatest kernel density among gfs."""
    best, bg = -1.0, 0.0
    for g in gfs:
        s = np.exp(-0.5 * ((gfs - g) / bw) ** 2).sum()
        if s > best:
            best, bg = s, g
    return bg


def symbol(v, dh):
    vi = int(round(max(-8, min(8, v))))
    di = int(round(max(-10, min(10, math.degrees(dh)))))
    return chr(0x100 + (vi + 8) * 21 + (di + 10))


def run(trace, guns=GUNS):
    """{gun: [hits, shots]} plus 'random': [expected hits, shots] over one battle (Trace)."""
    res = {g: [0, 0] for g in guns}
    res["random"] = [0.0, 0]
    st = Battle()
    for r in trace.rounds:
        if r.n < 30:
            continue
        f = frame(r)
        alive = r.alive()
        dirn = np.sign(f["lat"])
        last = 1.0
        for i in range(r.n):
            if dirn[i] == 0 or abs(f["lat"][i]) < 0.5:
                dirn[i] = last
            last = dirn[i]
        dh = np.zeros(r.n)
        dh[1:] = [norm_angle(a) for a in np.diff(r.h)]
        acc = np.zeros(r.n)
        acc[1:] = np.diff(np.abs(r.v))
        since_rev = np.zeros(r.n)
        since_dec = np.zeros(r.n)
        last_dwell = np.full(r.n, 40.0)
        for i in range(1, r.n):
            since_rev[i] = 0 if dirn[i] != dirn[i - 1] else since_rev[i - 1] + 1
            since_dec[i] = 0 if acc[i] < 0 else since_dec[i - 1] + 1
            last_dwell[i] = since_rev[i - 1] + 1 if since_rev[i] == 0 else last_dwell[i - 1]
        feats = np.stack([
            f["dist"] / 800, np.abs(f["lat"]) / 8, (f["adv"] + 8) / 16, np.sign(acc) / 2 + 0.5,
            np.minimum(since_rev, 80) / 80, np.minimum(since_dec, 80) / 80,
            [min(wall_ahead(r.x[i], r.y[i], f["bearing"][i] + dirn[i] * math.pi / 2), 400) / 400 for i in range(r.n)],
            np.minimum(last_dwell, 80) / 80,
        ], axis=1)
        segs = (np.digitize(f["dist"], (300, 500)) * 9 + np.digitize(np.abs(f["lat"]), (2, 6)) * 3
                + (np.sign(acc).astype(int) + 1))
        mea_l = math.asin(8 / bullet_speed(LEARN_POWER))
        arr_l = arrivals(r, LEARN_POWER)
        pending = []  # (j, i) tick waves waiting to break
        for i in range(r.n):
            if arr_l[i] > 0 and r.t[i] >= 5:
                pending.append((arr_l[i], i))
        pending.sort()
        pi = 0
        # pattern history for this round starts after a separator
        st.hist.append("\n")
        st.hist_steps.append((0.0, 0.0))
        fire_idx = {int(tk - r.t[0]): p for tk, p in r.fires.items()}
        for i in range(r.n):
            st.hist.append(symbol(r.v[i], dh[i]))
            st.hist_steps.append((r.v[i], dh[i]))
            while pi < len(pending) and pending[pi][0] <= i:
                j, w = pending[pi]
                pi += 1
                off = norm_angle(math.atan2(r.x[j] - r.sx[w], r.y[j] - r.sy[w]) - f["bearing"][w]) * dirn[w]
                st.add(feats[w], max(-1.0, min(1.0, off / mea_l)), segs[w])
            p = fire_idx.get(i)
            if p is None or r.t[i] < 10 or not alive[i] or f["dist"][i] < 40:
                continue
            speed = bullet_speed(p)
            j = arrival_one(r, i, speed)
            if j is None:
                continue
            true = math.atan2(r.x[j] - r.sx[i], r.y[j] - r.sy[i])
            tol = math.atan(HALF_BOT / max(40.0, math.hypot(r.x[j] - r.sx[i], r.y[j] - r.sy[i])))
            mea = math.asin(8 / speed)
            b, d = f["bearing"][i], dirn[i]
            res["random"][0] += min(1.0, tol / mea)
            res["random"][1] += 1
            for g in guns:
                a = aim(g, st, r, f, i, b, d, dh, feats, segs, speed, mea)
                res[g][1] += 1
                if abs(norm_angle(a - true)) <= tol:
                    res[g][0] += 1
    return res


def arrival_one(r, i, speed):
    ox, oy = r.sx[i], r.sy[i]
    for j in range(i + 1, min(r.n, i + MAX_FLIGHT)):
        if r.e[j] <= 0 or r.se[j] <= 0:
            return None
        if math.hypot(r.x[j] - ox, r.y[j] - oy) <= (j - i) * speed:
            return j
    return None


def aim(g, st, r, f, i, b, d, dh, feats, segs, speed, mea):
    if g == "head_on":
        return b
    if g == "linear":
        return project(r.x[i], r.y[i], r.h[i], r.v[i], 0.0, r.sx[i], r.sy[i], speed)
    if g == "circular":
        return project(r.x[i], r.y[i], r.h[i], r.v[i], dh[i], r.sx[i], r.sy[i], speed)
    if g == "avg_linear":
        lat = f["lat"][max(0, i - 15):i + 1].mean()
        return b + math.asin(max(-1.0, min(1.0, lat / speed)))
    if g == "gf_flat":
        return b + best_gf(st.flat) * mea * d if st.m else b
    if g == "gf_seg":
        h = st.segh[segs[i]]
        h = h if h.sum() >= 10 else st.flat
        return b + best_gf(h) * mea * d if st.m else b
    if g in ("knn", "knn_rhythm"):
        if st.m < 30:
            return b
        k = min(25, max(5, int(math.sqrt(st.m))))
        cols = 8 if g == "knn_rhythm" else 7
        dist = ((st.X[:st.m, :cols] - feats[i, :cols]) ** 2).sum(axis=1)
        nb = st.G[:st.m][np.argpartition(dist, k)[:k]]
        bw = max(0.02, math.atan(HALF_BOT / f["dist"][i]) / mea)
        return b + densest(nb, bw) * mea * d
    if g == "pattern":
        return pattern_aim(st, r, i, speed)
    raise ValueError(g)


def pattern_aim(st, r, i, speed):
    joined = "".join(st.hist)
    end = len(joined)
    for L in (32, 16, 8):
        if end < L + 10:
            continue
        key = joined[end - L:end]
        m = joined.rfind(key, 0, end - 1)
        if m < 0:
            continue
        start = m + L
        steps = []
        for q in range(start, min(end, start + MAX_FLIGHT)):
            if joined[q] == "\n":
                break
            steps.append(st.hist_steps[q])
        if len(steps) < 5:
            continue
        return project(r.x[i], r.y[i], r.h[i], r.v[i], 0.0, r.sx[i], r.sy[i], speed, steps)
    return project(r.x[i], r.y[i], r.h[i], r.v[i], 0.0, r.sx[i], r.sy[i], speed)
