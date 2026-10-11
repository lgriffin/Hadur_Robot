#!/usr/bin/env python3
"""Energy-duel model: Hadur's bullet-power policy against DrussGT 3.1.16's power rule.

Aim and movement are reduced to measured per-shot hit rates by bullet power (all shots, so a
bullet lost to a collision counts as a miss). Everything else is Robocode's energy rules, plus
DrussGT's power rule and its enemy-power predictor as read from `DrussGunDC.java` and
`BulletPowerPredictor.java` in the 3.1.16 jar. Distance is fixed at 500 px.

The default rate tables are the ones measured in the ten-battle run of the released 3.5.1.
Hit rates shift between regimes (DrussGT's light bullets land 9.9% against the released
build, 10.2% under the lead-aware rule and 10.7% against all chaff), and the model matches a
bench run only when given that run's rates: see `model_runs.py`.

    duel.py <policy>[,<policy>...] [battles] [seed]        policies: see POLICIES

Standard library only. With numpy installed the predictor's nearest-neighbour search runs
several times faster and returns the same answers (`test_drussgt.py` checks that).
"""

import heapq
import math
import random
import statistics
import sys

try:
    import numpy as np
except ImportError:  # the model then runs on the pure-Python search
    np = None

DIST = 500.0
COOL = 0.1


def dmg(p):
    """Robocode's bullet damage."""
    return 4 * p + (2 * (p - 1) if p > 1 else 0)


def flight(p, dist=DIST):
    """Ticks a bullet of power p needs to cover `dist`."""
    return int(math.ceil(dist / (20 - 3 * p)))


def interp(table, p):
    """Hit rate at power p from a [(power, rate), ...] table, flat beyond its ends."""
    if p <= table[0][0]:
        return table[0][1]
    for (p0, q0), (p1, q1) in zip(table, table[1:]):
        if p <= p1:
            return q0 + (q1 - q0) * (p - p0) / (p1 - p0)
    return table[-1][1]


# Measured in the ten-battle run of the released build (per shot, bucket centres).
H_RATE = [(0.10, 0.0750), (0.35, 0.0786), (0.75, 0.0700), (1.35, 0.0735), (1.95, 0.0708)]
D_RATE = [(0.15, 0.0991), (0.35, 0.0978), (0.75, 0.0978), (1.35, 0.0882), (1.95, 0.0705)]

# The powers DrussGT snaps to (`DrussGunDC`), chosen to trip a rounding bug in wave detection.
BUGGY = [0.15, 0.25, 0.35, 0.45, 0.65, 0.85, 0.95, 1.15, 1.95, 2.95]


class Predictor:
    """DrussGT's BulletPowerPredictor: KNN on (its energy, our energy, distance).

    Distance is constant in this model, so the third axis is left out. The jar's tree returns
    squared Euclidean distances. Of the k nearest samples it answers with the power that the
    others agree with most, each weighted by its nearness.
    """

    def __init__(self, accelerate=True):
        self.x0 = []
        self.x1 = []
        self.y = []
        self.fast = np is not None and accelerate
        if self.fast:
            self.a0 = np.zeros(16384)
            self.a1 = np.zeros(16384)

    def train(self, ed, eh, power):
        n = len(self.y)
        self.x0.append(ed / 200.0)
        self.x1.append(eh / 200.0)
        self.y.append(power)
        if self.fast:
            if n >= len(self.a0):
                self.a0 = np.concatenate([self.a0, np.zeros_like(self.a0)])
                self.a1 = np.concatenate([self.a1, np.zeros_like(self.a1)])
            self.a0[n] = ed / 200.0
            self.a1[n] = eh / 200.0

    def nearest(self, a, b, k):
        """The k nearest samples as [(index, squared distance)], in index order. Among samples
        at the same distance the earlier one is taken, in both search paths."""
        n = len(self.y)
        if self.fast:
            dx = self.a0[:n] - a
            dy = self.a1[:n] - b
            d = dx * dx + dy * dy
            if k < n:
                kth = np.partition(d, k - 1)[k - 1]
                below = np.flatnonzero(d < kth)
                level = np.flatnonzero(d == kth)[:k - len(below)]
                idx = sorted(below.tolist() + level.tolist())
            else:
                idx = list(range(n))
            return [(i, float(d[i])) for i in idx]
        d = [(x - a) * (x - a) + (y - b) * (y - b) for x, y in zip(self.x0, self.x1)]
        idx = sorted(heapq.nsmallest(k, range(n), key=d.__getitem__)) if k < n else range(n)
        return [(i, d[i]) for i in idx]

    def predict(self, ed, eh):
        n = len(self.y)
        k = min(int(math.ceil(math.sqrt(n))), 20)
        if k == 0:
            return 2.0
        near = self.nearest(ed / 200.0, eh / 200.0, k)
        w = [1.0 / (d + 0.1) for _, d in near]
        pw = [self.y[i] for i, _ in near]
        best, best_score = 2.0, 0.0
        for i in range(len(pw)):
            s = 0.0
            for j in range(len(pw)):
                if j != i:
                    diff = pw[i] - pw[j]
                    s += w[j] / (diff * diff + 0.1)
            s *= w[i]
            if s > best_score:
                best, best_score = pw[i], s
        return best


def druss_power(ed, eh, enemy_bp, undercut, eh_at_impact):
    """DrussGT's bullet power beyond 150 px: base 1.95, the energy cap, the kill cap, the
    undercut while its own hit rate is under 12.5%, the 0.15 floor and the snap."""
    base = 1.95
    energy_bp = max(0.0, ed - 20 + 0.5 * min(30.0, max(-10.0, ed - eh))) / 25.0
    if undercut:
        energy_bp = min(energy_bp, enemy_bp - 0.1)
    kill_bp = (eh_at_impact + 0.01) / 4.0
    p = max(0.15, min(kill_bp, energy_bp, base))
    round_up = (p == kill_bp and ed > 30)
    c = min(range(len(BUGGY)), key=lambda i: abs(p - BUGGY[i]))
    if round_up and BUGGY[c] < p and c + 1 < len(BUGGY):
        c += 1
    return max(0.1, BUGGY[c] - 1e-9)


# ---------------------------------------------------------------- Hadur policies
def end3(p, ed):
    """END-3: the least power that kills, never raising."""
    if ed <= 16.0:
        kill = ed / 4.0 if ed <= 4.0 else (ed + 2.0) / 6.0
        kill = max(0.1, min(3.0, kill))
        if kill < p:
            return kill
    return p


def hadur_base(eh, ed, st):
    """3.5.1's duel power beyond 325 px: 1.95 with the cubic power-down below 63 energy."""
    p = 1.95
    pdp = min(63.0, max(35.0, 63.0 + (ed - eh) * 4.0))
    if eh < pdp:
        p = min(p, (eh / pdp) ** 3 * 1.95)
    p = min(p, ed / 4.0)
    p = max(p, 0.1)
    p = min(p, eh)
    return end3(p, ed)


def make_lead(open_e=60.0, gap=-3.0, gamble=1.95, min_e=10.0, chaff=0.1, open_p=1.95,
              press_lead=1e9, press_e=0.0, press_p=1.95):
    """The lead-aware rule: `open_p` while both robots are above `open_e`; `gamble` when the
    lead is below `gap` and our energy above `min_e`; `press_p` when the lead is above
    `press_lead` and the enemy is under `press_e`; otherwise `chaff`."""
    def pol(eh, ed, st):
        lead = eh - ed
        if eh > open_e and ed > open_e:
            p = open_p
        elif lead < gap and eh > min_e:
            p = gamble
        elif lead > press_lead and ed < press_e:
            p = press_p
        else:
            p = chaff
        return end3(p, ed)
    return pol


def hadur_chaff(eh, ed, st):
    return end3(0.1, ed)


def hadur_mirror(eh, ed, st):
    """DrussGT's own energy cap, without the undercut."""
    e = max(0.0, eh - 20 + 0.5 * min(30.0, max(-10.0, eh - ed))) / 25.0
    return end3(max(0.1, min(1.95, e, ed / 4.0)), ed)


def keep_last(pol, floor=0.15, margin=0.3):
    """The last-shot rule: once the enemy cannot fire, do not shoot down to within `margin`
    of its energy."""
    def wrapped(eh, ed, st):
        p = pol(eh, ed, st)
        if ed < floor and eh - p < ed + margin:
            return 1e9      # more than we have: the model then holds fire
        return p
    return wrapped


POLICIES = {
    'base': hadur_base,
    'l0': make_lead(),
    'chaff': hadur_chaff,
    'mirror': hadur_mirror,
}


def play_round(policy, pred, stats, rng, h_rate=H_RATE, d_rate=D_RATE, trace=None, max_ticks=40000):
    eh = ed = 100.0
    gh_h = gh_d = 3.0
    bullets = []  # (arrive_tick, owner, power, hit)
    dealt_h = dealt_d = 0.0
    last_hit_by = None
    stalemate = False
    t = 0
    st = {}
    spent_h = spent_d = 0.0
    shots_h = shots_d = 0
    while t < max_ticks:
        t += 1
        # bullets land
        if bullets:
            keep = []
            for b in bullets:
                if b[0] <= t:
                    _, owner, p, hit = b
                    if owner == 'H':
                        if hit and ed > 0:
                            dealt_h += min(dmg(p), max(ed, 0))
                            ed -= dmg(p)
                            eh += 3 * p
                            if ed <= 0:
                                last_hit_by = 'H'
                    else:
                        stats['d_passed'] += 1
                        if hit and eh > 0:
                            dealt_d += min(dmg(p), max(eh, 0))
                            eh -= dmg(p)
                            ed += 3 * p
                            stats['d_hits'] += 1
                            if eh <= 0:
                                last_hit_by = 'D'
                else:
                    keep.append(b)
            bullets = keep
        if trace is not None and t in trace:
            trace[t].append((eh, ed))
        if ed <= 0 or eh <= 0:
            break
        gh_h = max(0.0, gh_h - COOL)
        gh_d = max(0.0, gh_d - COOL)
        # both decide on the same tick from the same energies
        fire_h = fire_d = None
        if gh_h <= 0:
            p = policy(eh, ed, st)
            if eh > p:
                fire_h = p
        if gh_d <= 0:
            enemy_bp = pred.predict(ed, eh) if pred is not None else policy(eh, ed, st)
            undercut = stats['d_hits'] * 8 < stats['d_passed']
            # their energy when the bullet lands, as DrussGT projects it (our shots in between)
            p0 = druss_power(ed, eh, enemy_bp, undercut, eh)
            if eh / 4.0 < p0 * 1.6:
                e_e = eh
                g = gh_h
                for _ in range(flight(p0)):
                    g -= 0.1
                    if g < 0.1:
                        bp = pred.predict(ed, e_e) if pred is not None else policy(e_e, ed, st)
                        e_e -= bp
                        g = 1 + bp * 0.2
                p1 = druss_power(ed, eh, enemy_bp, undercut, e_e)
                p0 = min(p0, p1)
            if ed > p0:
                fire_d = p0
        if fire_h is not None:
            if pred is not None:
                pred.train(ed, eh, fire_h)
            eh -= fire_h
            spent_h += fire_h
            shots_h += 1
            gh_h = 1 + fire_h / 5.0
            bullets.append((t + flight(fire_h), 'H', fire_h, rng.random() < interp(h_rate, fire_h)))
        if fire_d is not None:
            ed -= fire_d
            spent_d += fire_d
            shots_d += 1
            gh_d = 1 + fire_d / 5.0
            bullets.append((t + flight(fire_d), 'D', fire_d, rng.random() < interp(d_rate, fire_d)))
        if fire_h is None and fire_d is None and not bullets and gh_h <= 0 and gh_d <= 0:
            # Neither can fire and nothing is in the air: on the bench these rounds ended with
            # both robots dead on the same turn (the inactivity penalty) and no survival score.
            stalemate = True
            break
    if stalemate:
        # The penalty takes 0.1 a turn from both; a robot under 0.1 is disabled and dies on the
        # next turn. Whoever still has 0.1 left after the first turn outlives the other.
        win = eh >= 0.2 and ed < 0.2
        lose = ed >= 0.2 and eh < 0.2
        last_hit_by = None
    elif ed > 0 and eh > 0:
        win = lose = False
    else:
        win = ed <= 0 and (eh > 0 or last_hit_by == 'H')
        lose = not win
    sc_h = dealt_h + ((60 + (0.2 * dealt_h if last_hit_by == 'H' else 0)) if win else 0)
    sc_d = dealt_d + ((60 + (0.2 * dealt_d if last_hit_by == 'D' else 0)) if lose else 0)
    return dict(win=win, lose=lose, ticks=t, sc_h=sc_h, sc_d=sc_d, dealt_h=dealt_h, dealt_d=dealt_d,
                spent_h=spent_h, spent_d=spent_d, shots_h=shots_h, shots_d=shots_d)


def play_battle(policy, rng, rounds=35, h_rate=H_RATE, d_rate=D_RATE, trace=None, fast=False):
    """One battle. `fast` gives DrussGT our exact power in place of its predictor."""
    pred = None if fast else Predictor()
    stats = {'d_hits': 0, 'd_passed': 0}
    out = []
    for r in range(rounds):
        out.append(play_round(policy, pred, stats, rng, h_rate, d_rate, trace))
    return out


def evaluate(policy, battles=40, seed=1, h_rate=H_RATE, d_rate=D_RATE,
             trace_ticks=(200, 400, 600, 800, 1000), fast=False):
    rng = random.Random(seed)
    trace = {t: [] for t in trace_ticks} if trace_ticks else None
    shares = []
    rows = []
    for b in range(battles):
        rs = play_battle(policy, rng, h_rate=h_rate, d_rate=d_rate, trace=trace, fast=fast)
        rows += rs
        sh = sum(r['sc_h'] for r in rs)
        sd = sum(r['sc_d'] for r in rs)
        shares.append(100.0 * sh / (sh + sd))
    n = len(rows)
    res = dict(
        share=statistics.mean(shares),
        share_ci=1.96 * statistics.stdev(shares) / math.sqrt(len(shares)) if len(shares) > 1 else 0,
        share_sd=statistics.stdev(shares) if len(shares) > 1 else 0,
        wins=100.0 * sum(r['win'] for r in rows) / n,
        double=100.0 * sum(1 for r in rows if not r['win'] and not r['lose']) / n,
        ticks=statistics.mean(r['ticks'] for r in rows),
        dealt_h=statistics.mean(r['dealt_h'] for r in rows), dealt_d=statistics.mean(r['dealt_d'] for r in rows),
        spent_h=statistics.mean(r['spent_h'] for r in rows), spent_d=statistics.mean(r['spent_d'] for r in rows),
        shots_h=statistics.mean(r['shots_h'] for r in rows), shots_d=statistics.mean(r['shots_d'] for r in rows))
    if trace:
        res['lead'] = {t: statistics.mean(a - b for a, b in v) for t, v in trace.items() if v}
    return res


def show(name, res):
    lead = ' '.join('%d:%+.1f' % (t, v) for t, v in sorted(res.get('lead', {}).items()))
    print('%-22s share %5.1f%% ±%.1f (sd %.1f)  rounds won %5.1f%% (double kill %.1f%%)  ticks %5.0f  dmg %.1f/%.1f  spent %.1f/%.1f  shots %.0f/%.0f  lead %s' % (
        name, res['share'], res['share_ci'], res['share_sd'], res['wins'], res['double'], res['ticks'], res['dealt_h'], res['dealt_d'],
        res['spent_h'], res['spent_d'], res['shots_h'], res['shots_d'], lead))


if __name__ == '__main__':
    names = sys.argv[1].split(',') if len(sys.argv) > 1 else ['base', 'l0']
    battles = int(sys.argv[2]) if len(sys.argv) > 2 else 40
    seed = int(sys.argv[3]) if len(sys.argv) > 3 else 1
    for nm in names:
        show(nm, evaluate(POLICIES[nm], battles, seed))
