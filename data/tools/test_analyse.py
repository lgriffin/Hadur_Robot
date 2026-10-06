"""Tests for analyse.py: python test_analyse.py"""

import math
import os
import tempfile
import unittest

import analyse as an

HEADER = "build\topponent\tseed\tok\tscore_share\tweight\n"


def write_tsv(path, rows):
    with open(path, "w", encoding="utf-8") as f:
        f.write(HEADER)
        for build, opp, seed, share, weight in rows:
            f.write("%s\t%s\t%s\ttrue\t%s\t%s\n" % (build, opp, seed, share, weight))


class TDistributionTest(unittest.TestCase):

    def test_known_quantiles(self):
        for df, expected in ((1, 12.706), (10, 2.228), (30, 2.042), (31, 2.040),
                             (60, 2.000), (120, 1.980), (1000, 1.962)):
            self.assertAlmostEqual(an.t_ppf(0.975, df), expected, delta=1e-3, msg="df %d" % df)

    def test_cdf_inverts_quantile_and_is_symmetric(self):
        for df in (1, 4, 25, 300):
            for p in (0.55, 0.9, 0.995):
                self.assertAlmostEqual(an.t_cdf(an.t_ppf(p, df), df), p, places=9)
        self.assertAlmostEqual(an.t_ppf(0.1, 7), -an.t_ppf(0.9, 7), places=9)


class MultiplicityTest(unittest.TestCase):

    def test_holm_and_bh_against_hand_worked_values(self):
        ps = [0.01, 0.04, 0.03, 0.005]
        for got, want in zip(an.holm(ps), [0.03, 0.06, 0.06, 0.02]):
            self.assertAlmostEqual(got, want)
        for got, want in zip(an.benjamini_hochberg(ps), [0.02, 0.04, 0.04, 0.02]):
            self.assertAlmostEqual(got, want)

    def test_nan_p_values_are_left_out_of_the_family(self):
        adjusted = an.holm([0.01, float("nan"), 0.02])
        self.assertTrue(math.isnan(adjusted[1]))
        self.assertAlmostEqual(adjusted[0], 0.02)
        self.assertAlmostEqual(adjusted[2], 0.02)


class EstimateTest(unittest.TestCase):

    def test_interval_uses_exact_t_beyond_df_30(self):
        xs = [0.4 if i % 2 else 0.6 for i in range(40)]
        e = an.estimate(xs)
        sd = math.sqrt(40 * 0.01 / 39)
        self.assertAlmostEqual(e["half"], 2.0227 * sd / math.sqrt(40), places=4)
        self.assertEqual(e["df"], 39)

    def test_equal_weights_match_unweighted(self):
        xs = [1.0, 2.0, 4.0, 7.0]
        plain, weighted = an.estimate(xs), an.estimate(xs, [2.0] * 4)
        self.assertAlmostEqual(plain["mean"], weighted["mean"])
        self.assertAlmostEqual(plain["half"], weighted["half"])

    def test_weights_shift_the_mean(self):
        e = an.estimate([0.0, 10.0], [3.0, 1.0])
        self.assertAlmostEqual(e["mean"], 2.5)

    def test_tost_flags_noninferior_but_not_equivalent_for_a_clear_gain(self):
        e = an.estimate([3.0 + 0.1 * (i % 3 - 1) for i in range(30)])
        t = an.tost(e, 1.0)
        self.assertTrue(t["noninferior"])
        self.assertFalse(t["equivalent"])
        flat = an.tost(an.estimate([0.05 * (i % 3 - 1) for i in range(30)]), 1.0)
        self.assertTrue(flat["equivalent"])


class PairingTest(unittest.TestCase):

    def rows(self):
        out = []
        for opp, gain in (("a.A 1", 0.10), ("b.B 1", 0.00)):
            for seed in range(1, 7):
                noise = 0.02 * (seed % 3 - 1)
                out.append(("new", opp, seed, 0.50 + gain + noise, 3.0 if opp == "a.A 1" else 1.0))
                out.append(("old", opp, seed, 0.50 - noise, 3.0 if opp == "a.A 1" else 1.0))
        return out

    def test_pools_pairs_by_opponent_and_seed_in_points(self):
        with tempfile.TemporaryDirectory() as tmp:
            path = os.path.join(tmp, "x.tsv")
            write_tsv(path, self.rows())
            rows = an.load([path], "score_share")
        cand, base = an.pick_builds(rows, None, None)
        self.assertEqual((cand, base), ("new", "old"))
        per_opp = an.pair(rows, "score_share", cand, base, 100.0)
        result = an.analyse(per_opp, 1.0)
        self.assertEqual(result["pairs"], 12)
        by_name = {r["opponent"]: r for r in result["rows"]}
        self.assertAlmostEqual(by_name["a.A 1"]["mean"], 10.0, places=6)
        self.assertAlmostEqual(result["battle"]["mean"], 5.0, places=6)
        self.assertLess(by_name["a.A 1"]["p_holm"], 0.05)
        self.assertGreater(by_name["a.A 1"]["p_holm"], by_name["a.A 1"]["p"] - 1e-12)

    def test_weights_column_pulls_the_pooled_mean_toward_the_heavy_opponent(self):
        with tempfile.TemporaryDirectory() as tmp:
            path = os.path.join(tmp, "x.tsv")
            write_tsv(path, self.rows())
            rows = an.load([path], "score_share")
        per_opp = an.pair(rows, "score_share", "new", "old", 100.0, "weight")
        self.assertAlmostEqual(an.analyse(per_opp, 1.0)["cluster"]["mean"], 7.5, places=6)

    def test_unpaired_seed_is_dropped(self):
        rows = [dict(build="new", opponent="o", seed="1", score_share="0.6"),
                dict(build="old", opponent="o", seed="1", score_share="0.5"),
                dict(build="new", opponent="o", seed="2", score_share="0.9")]
        per_opp = an.pair(rows, "score_share", "new", "old", 100.0)
        self.assertEqual(len(per_opp["o"]["diffs"]), 1)

    def test_failed_battles_are_dropped_on_load(self):
        with tempfile.TemporaryDirectory() as tmp:
            path = os.path.join(tmp, "x.tsv")
            with open(path, "w", encoding="utf-8") as f:
                f.write("build\topponent\tseed\tok\tscore_share\n")
                f.write("new\to\t1\tfalse\t0.0\nnew\to\t2\ttrue\t0.5\n")
            self.assertEqual(len(an.load([path], "score_share")), 1)


class PlanTest(unittest.TestCase):

    def test_seeds_needed_scales_with_variance_and_target(self):
        a = an.seeds_needed(5.0, 2.0)
        self.assertGreater(an.seeds_needed(10.0, 2.0), 3 * a)
        self.assertLess(an.seeds_needed(5.0, 4.0), a)
        achieved = an.t_ppf(0.975, 2 * a - 2) * 5.0 * math.sqrt(2.0 / a)
        self.assertLessEqual(achieved, 2.0)
        self.assertGreater(an.t_ppf(0.975, 2 * a - 4) * 5.0 * math.sqrt(2.0 / (a - 1)), 2.0)

    def test_plan_uses_unpaired_sd_so_pairing_does_not_shrink_it(self):
        per_opp = {"o": dict(cand=[50, 60, 40, 55, 45], base=[52, 41, 58, 49, 60],
                             diffs=[-2, 19, -18, 6, -15], weight=1.0)}
        row = an.plan(per_opp, 2.0)[0]
        sd_c = an.mean_sd(per_opp["o"]["cand"])[1]
        sd_b = an.mean_sd(per_opp["o"]["base"])[1]
        self.assertAlmostEqual(row["need"], an.seeds_needed(math.sqrt((sd_c ** 2 + sd_b ** 2) / 2), 2.0))
        self.assertGreater(row["need"], 5)


if __name__ == "__main__":
    unittest.main()
