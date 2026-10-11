#!/usr/bin/env python3
"""Recompute a probe bench's headline figures from its committed tables.

    summary.py [STEM]

STEM is what `export_tables.py --out` was given; the default is the session of 4 and 5 October
2026, `data/bench/2026-10-05_hadur-3.5.1_drussgt-probes_cold`. Nothing here reads a truth log,
so anyone can check the report's figures (docs/bench/d0-drussgt-probes.md) against the tables.
Standard library only.
"""

import collections
import csv
import math
import os
import sys

ROOT = os.path.dirname(os.path.dirname(os.path.dirname(os.path.dirname(os.path.abspath(__file__)))))
DEFAULT = os.path.join(ROOT, "data", "bench", "2026-10-05_hadur-3.5.1_drussgt-probes_cold")

# Two-sided 95% points of Student's t by sample size (n - 1 degrees of freedom).
T = {2: 12.706, 3: 4.303, 4: 3.182, 5: 2.776, 6: 2.571, 7: 2.447, 8: 2.365, 9: 2.306, 10: 2.262,
     15: 2.145, 20: 2.093}
LIGHT = ("0.10-0.20",)
HEAVY = ("1.70-2.20",)
TICKS = (200, 400, 600, 800, 1000)


def read(path):
    with open(path, encoding="utf-8", newline="") as f:
        return list(csv.DictReader(f, delimiter="\t"))


def interval(values):
    """(mean, 95% half-width by Student's t, standard deviation)."""
    n = len(values)
    m = sum(values) / n
    sd = math.sqrt(sum((a - m) ** 2 for a in values) / (n - 1)) if n > 1 else 0.0
    return m, (T.get(n, 1.96) * sd / math.sqrt(n) if n > 1 else 0.0), sd


def rate(hits, shots):
    """(hit rate in percent, 95% half-width by the normal approximation)."""
    if not shots:
        return float("nan"), float("nan")
    p = hits / shots
    return 100 * p, 100 * 1.96 * math.sqrt(max(p * (1 - p), 1e-9) / shots)


class Bench:
    """The four tables of one probe bench."""

    def __init__(self, stem=DEFAULT):
        self.battles = read(stem + ".tsv")
        self.rounds = read(stem + "_rounds.tsv")
        self.bullets = read(stem + "_bullets.tsv")
        self.energy = read(stem + "_energy.tsv")
        self.builds = list(collections.OrderedDict.fromkeys(r["build"] for r in self.battles))

    # ---- battles
    def shares(self, build):
        """{seed: Hadur's score share of that battle, in percent}."""
        return {int(r["seed"]): 100 * float(r["score"]) / (float(r["score"]) + float(r["theirScore"]))
                for r in self.battles if r["build"] == build}

    def share(self, build):
        return interval(list(self.shares(build).values()))

    def paired(self, build, against):
        """(mean, half-width, seeds) of build minus `against` on the seeds they share."""
        a, b = self.shares(build), self.shares(against)
        common = sorted(set(a) & set(b))
        m, ci, _ = interval([a[s] - b[s] for s in common])
        return m, ci, len(common)

    def result_sum(self, build, column):
        return sum(float(r[column]) for r in self.battles if r["build"] == build)

    # ---- rounds
    def rounds_of(self, build):
        return [r for r in self.rounds if r["build"] == build]

    def outcomes(self, build):
        """(rounds, won outright, double kills, lost)."""
        c = collections.Counter(r["outcome"] for r in self.rounds_of(build))
        return sum(c.values()), c["win"], c["double"], c["loss"]

    def lead_split(self, build, tick):
        """(mean lead, rounds ahead, share of them won, rounds not ahead, share of them won)."""
        rows = self.rounds_of(build)
        key = "lead_%d" % tick
        ahead = [r for r in rows if float(r[key]) > 0]
        behind = [r for r in rows if float(r[key]) <= 0]

        def won(group):
            return 100.0 * sum(r["outcome"] == "win" for r in group) / len(group) if group else float("nan")
        return (sum(float(r[key]) for r in rows) / len(rows), len(ahead), won(ahead), len(behind), won(behind))

    # ---- bullets
    def bullet_sum(self, build, shooter, column="bullets", fates=("hit", "miss", "destroyed"),
                   classes=None, windows=None, bands=None):
        total = 0.0
        for r in self.bullets:
            if (r["build"] == build and r["shooter"] == shooter and r["fate"] in fates
                    and (classes is None or r["power_class"] in classes)
                    and (windows is None or r["tick_window"] in windows)
                    and (bands is None or r["distance_band"] in bands)):
                total += float(r[column])
        return total

    def hit_rate(self, build, shooter, **where):
        return rate(self.bullet_sum(build, shooter, fates=("hit",), **where),
                    self.bullet_sum(build, shooter, **where))

    def destroyed(self, build, shooter):
        return 100.0 * self.bullet_sum(build, shooter, fates=("destroyed",)) / self.bullet_sum(build, shooter)

    def economics(self, build, shooter):
        """Per round: (shots, energy spent, refunded by hits, damage dealt, effect on own lead)."""
        n = len(self.rounds_of(build))
        shots = self.bullet_sum(build, shooter) / n
        spent = self.bullet_sum(build, shooter, "power_sum") / n
        refund = 3 * self.bullet_sum(build, shooter, "power_sum", fates=("hit",)) / n
        dealt = self.bullet_sum(build, shooter, "damage_sum", fates=("hit",)) / n
        return shots, spent, refund, dealt, dealt + refund - spent


def report(bench, out=sys.stdout):
    def p(text=""):
        print(text, file=out)

    for build in bench.builds:
        m, ci, sd = bench.share(build)
        n = len(bench.shares(build))
        rounds, won, double, lost = bench.outcomes(build)
        turns = bench.result_sum(build, "turns")
        p("%s: %d battles, score share %.2f%% ±%.2f (sd %.2f)" % (build, n, m, ci, sd))
        p("  rounds %d: won outright %d (%.1f%%), double kill %d, lost %d (%.1f%%); engine first places %d; "
          "%.0f ticks a round" % (rounds, won, 100.0 * won / rounds, double, lost, 100.0 * lost / rounds,
                                  bench.result_sum(build, "firsts"), turns / rounds))
        p("  bullet damage a round %.1f against %.1f; skipped turns %d (%.1f per 100,000)" % (
            bench.result_sum(build, "bulletDamage") / rounds, bench.result_sum(build, "theirBulletDamage") / rounds,
            bench.result_sum(build, "skippedTurns"), 1e5 * bench.result_sum(build, "skippedTurns") / turns))
        for shooter in ("hadur", "drussgt"):
            shots, spent, refund, dealt, net = bench.economics(build, shooter)
            p("  %-7s %.1f shots a round, spent %.1f, refunded %.1f, damage %.1f, effect on own lead %+.1f"
              % (shooter, shots, spent, refund, dealt, net))
            p("          hit rate %.2f%% ±%.2f | light %.2f%% ±%.2f (%.0f%% of shots) | power 1.7 to 2.2 %.2f%% ±%.2f | "
              "destroyed by a bullet %.1f%%" % (
                  bench.hit_rate(build, shooter) + bench.hit_rate(build, shooter, classes=LIGHT)
                  + (100.0 * bench.bullet_sum(build, shooter, classes=LIGHT) / max(1.0, bench.bullet_sum(build, shooter)),)
                  + bench.hit_rate(build, shooter, classes=HEAVY) + (bench.destroyed(build, shooter),)))
        for tick in TICKS:
            lead, a, wa, b, wb = bench.lead_split(build, tick)
            p("  tick %4d: mean lead %+5.1f | ahead in %3d rounds, won %4.1f%% | not ahead in %3d, won %4.1f%%"
              % (tick, lead, a, wa, b, wb))
        p()
    first = bench.builds[0]
    for build in bench.builds[1:]:
        m, ci, n = bench.paired(build, first)
        p("%s minus %s, paired on %d seeds: %+.2f ±%.2f" % (build, first, n, m, ci))
    for a in bench.builds[1:]:
        for b in bench.builds[1:]:
            if a != b and a.startswith(b):      # a variant of another probe, e.g. lead-aware-sampled
                m, ci, n = bench.paired(a, b)
                p("%s minus %s, paired on %d seeds: %+.2f ±%.2f" % (a, b, n, m, ci))


if __name__ == "__main__":
    report(Bench(sys.argv[1] if len(sys.argv) > 1 else DEFAULT))
