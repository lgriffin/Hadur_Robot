"""Tests for repeatability.py: python test_repeatability.py"""

import math
import os
import random
import tempfile
import unittest

import repeatability as rp


def write_tsv(path, rows, run=None):
    with open(path, "w", encoding="utf-8") as f:
        f.write("build\topponent\tseed\tok\tscore_share" + ("\trun" if run is not None else "") + "\n")
        for build, opp, seed, share, label in rows:
            f.write("%s\t%s\t%s\ttrue\t%s%s\n" % (
                build, opp, seed, share, "\t" + label if run is not None else ""))


def synthetic(noise, seed, opponents=6, seeds=12):
    rng = random.Random(seed)
    rows = []
    for o in range(opponents):
        level = 0.2 + 0.1 * o
        for s in range(1, seeds + 1):
            for build in ("new", "old"):
                rows.append((build, "opp%d" % o, s, level + noise * rng.gauss(0, 1), ""))
    return rows


class StatsTest(unittest.TestCase):

    def test_identical_runs_have_zero_sd_and_all_pairs_identical(self):
        runs = [{("o", "1"): 50.0, ("o", "2"): 60.0}, {("o", "1"): 50.0, ("o", "2"): 60.0}]
        st = rp.repeat_stats(runs)
        self.assertEqual(st["sd"], 0.0)
        self.assertEqual((st["identical_cells"], st["identical_pairs"], st["pairs"]), (2, 2, 2))

    def test_sd_is_the_pooled_within_cell_sd(self):
        runs = [{("o", "1"): 50.0, ("o", "2"): 60.0}, {("o", "1"): 54.0, ("o", "2"): 56.0}]
        st = rp.repeat_stats(runs)
        self.assertAlmostEqual(st["sd"], math.sqrt((8.0 + 8.0) / 2))
        self.assertEqual(st["identical_pairs"], 0)

    def test_icc_is_high_when_cells_differ_and_runs_agree(self):
        runs = [{("o", str(i)): 10.0 * i for i in range(8)},
                {("o", str(i)): 10.0 * i + (i % 2) for i in range(8)}]
        self.assertGreater(rp.repeat_stats(runs)["icc"], 0.99)

    def test_icc_within_opponent_is_near_zero_for_pure_noise(self):
        a, b = {}, {}
        rng = random.Random(1)
        for o in range(10):
            for s in range(16):
                a[("o%d" % o, str(s))] = 10.0 * o + rng.gauss(0, 3)
                b[("o%d" % o, str(s))] = 10.0 * o + rng.gauss(0, 3)
        st = rp.repeat_stats([a, b])
        self.assertGreater(st["icc"], 0.9)
        self.assertLess(abs(st["icc_within"]), 0.2)

    def test_only_cells_present_in_every_run_count(self):
        st = rp.repeat_stats([{("o", "1"): 1.0, ("o", "2"): 2.0, ("o", "3"): 3.0},
                              {("o", "1"): 1.0, ("o", "2"): 2.5}])
        self.assertEqual(st["cells"], 2)
        self.assertIsNone(rp.repeat_stats([{("o", "1"): 1.0}, {("o", "1"): 1.0}]))


class PairingTest(unittest.TestCase):

    def test_correlation_detects_a_shared_seed_effect(self):
        rows = []
        for s in range(10):
            shared = 0.05 * (s % 5)
            rows.append(dict(build="new", opponent="o", seed=str(s), score_share=str(0.5 + shared)))
            rows.append(dict(build="old", opponent="o", seed=str(s), score_share=str(0.4 + shared)))
        out = rp.pairing(rows, "new", "old", "score_share", 100.0)["o"]
        self.assertAlmostEqual(out["r"], 1.0)
        self.assertAlmostEqual(out["ratio"], 0.0, places=9)

    def test_independent_builds_give_ratio_near_one(self):
        rows = []
        rng = random.Random(3)
        for o in range(8):
            for s in range(40):
                for build in ("new", "old"):
                    rows.append(dict(build=build, opponent="o%d" % o, seed=str(s),
                                     score_share=str(0.5 + 0.05 * rng.gauss(0, 1))))
        out = rp.pairing(rows, "new", "old", "score_share", 100.0)
        ratio = sum(v["ratio"] for v in out.values()) / len(out)
        self.assertAlmostEqual(ratio, 1.0, delta=0.25)


class CommandLineTest(unittest.TestCase):

    def test_two_files_and_one_file_with_a_run_column_agree(self):
        with tempfile.TemporaryDirectory() as tmp:
            a, b, both = (os.path.join(tmp, n) for n in ("a.tsv", "b.tsv", "both.tsv"))
            ra, rb = synthetic(0.03, 1), synthetic(0.03, 2)
            write_tsv(a, ra)
            write_tsv(b, rb)
            write_tsv(both, [r[:4] + ("A",) for r in ra] + [r[:4] + ("B",) for r in rb], run=True)
            runs_two = rp.load_runs([a, b], None, "score_share")
            runs_one = rp.load_runs([both], "run", "score_share")
        self.assertEqual(list(runs_one), ["A", "B"])
        sd = []
        for runs in (runs_two, runs_one):
            sd.append(rp.repeat_stats([rp.cells(r, "new", "score_share", 100.0) for r in runs.values()])["sd"])
        self.assertAlmostEqual(sd[0], sd[1])
        self.assertAlmostEqual(sd[0], 3.0 * math.sqrt(1.0), delta=0.6)


if __name__ == "__main__":
    unittest.main()
