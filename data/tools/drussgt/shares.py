#!/usr/bin/env python3
"""Per-battle score share for each run, with a t-interval, from the bench's result.csv files.

Also the rounds won outright (survival score / 50), DrussGT's, the rounds in which neither
scored survival, the engine's first-place count, bullet damage per round and skipped turns.
With two or more runs it adds the paired difference of each later run against the first, on
the seeds they share.

    shares.py <run> [<run> ...]       a run is `label=dir[,dir...]` or one `battles` directory
"""
import math
import sys

import runs

# Two-sided 95% points of Student's t by sample size (n - 1 degrees of freedom).
T = {2: 12.706, 3: 4.303, 4: 3.182, 5: 2.776, 6: 2.571, 7: 2.447, 8: 2.365, 9: 2.306, 10: 2.262, 15: 2.145, 20: 2.093}


def interval(values):
    """(mean, 95% half-width, standard deviation) of a list of per-battle values."""
    n = len(values)
    m = sum(values) / n
    sd = math.sqrt(sum((a - m) ** 2 for a in values) / (n - 1)) if n > 1 else 0
    return m, (T.get(n, 1.96) * sd / math.sqrt(n) if n > 1 else 0), sd


def shares(dirs):
    """{seed: Hadur's share of the battle's total score, in percent} and the result rows."""
    rows = [(runs.seed_of(d), runs.result_row(d)) for d in runs.battles(dirs)]
    return {s: 100 * float(r['score']) / (float(r['score']) + float(r['theirScore'])) for s, r in rows}, rows


def run(label, dirs):
    by_seed, rows = shares(dirs)
    if not rows:
        return by_seed
    sh = [by_seed[s] for s, _ in rows]
    n = len(sh)
    m, ci, sd = interval(sh)
    surv = sum(float(r['survival']) for _, r in rows) / 50
    tsurv = sum(float(r['theirSurvival']) for _, r in rows) / 50
    rounds = sum(int(r['rounds']) for _, r in rows)
    sk = sum(int(r['skippedTurns']) for _, r in rows)
    turns = sum(int(r['turns']) for _, r in rows)
    bd = sum(float(r['bulletDamage']) for _, r in rows) / rounds
    tbd = sum(float(r['theirBulletDamage']) for _, r in rows) / rounds
    pooled = 100 * sum(float(r['score']) for _, r in rows) / sum(float(r['score']) + float(r['theirScore']) for _, r in rows)
    print('%-6s n=%2d mean %.2f ±%.2f (sd %.2f) pooled %.2f | outright %d/%d (%.1f%%) Druss %d (%.1f%%) double %d | firsts %d | dmg %.1f/%.1f | skipped %d in %d turns (%.1f per 100k) | ticks/round %.0f' % (
        label, n, m, ci, sd, pooled, surv, rounds, 100 * surv / rounds, tsurv, 100 * tsurv / rounds, rounds - surv - tsurv,
        sum(int(r['firsts']) for _, r in rows), bd, tbd, sk, turns, 1e5 * sk / max(1, turns), turns / rounds))
    print('       battles:', ', '.join('%d:%.1f' % (s, a) for (s, _), a in zip(rows, sh)))
    return by_seed


if __name__ == '__main__':
    if len(sys.argv) < 2:
        sys.exit(__doc__)
    first = None
    for spec in sys.argv[1:]:
        label, dirs = runs.parse(spec)
        by_seed = run(label, dirs)
        if first is None:
            first = (label, by_seed)
        else:
            common = sorted(set(first[1]) & set(by_seed))
            if len(common) > 1:
                m, ci, sd = interval([by_seed[s] - first[1][s] for s in common])
                print('       paired with %s on %d seeds: %+.2f ±%.2f (sd %.2f)' % (first[0], len(common), m, ci, sd))
