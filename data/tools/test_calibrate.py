"""Tests for calibrate.py: python test_calibrate.py"""

import math
import unittest

import calibrate as c


class OlsTest(unittest.TestCase):

    def test_exact_line_has_no_residual(self):
        fit = c.ols([1.0, 2.0, 3.0, 4.0], [3.0, 5.0, 7.0, 9.0])
        self.assertAlmostEqual(2.0, fit["slope"])
        self.assertAlmostEqual(1.0, fit["intercept"])
        self.assertAlmostEqual(0.0, fit["resid_sd"])
        self.assertAlmostEqual(1.0, fit["r"])

    def test_residual_sd_uses_n_minus_two(self):
        fit = c.ols([0.0, 1.0, 2.0, 3.0], [0.0, 2.0, 0.0, 2.0])
        sse = sum((y - fit["intercept"] - fit["slope"] * x) ** 2 for x, y in zip([0, 1, 2, 3], [0, 2, 0, 2]))
        self.assertAlmostEqual(math.sqrt(sse / 2), fit["resid_sd"])


class JoinTest(unittest.TestCase):

    def test_join_keeps_only_opponents_on_both_sides(self):
        bench = {"A 1": [60.0, 70.0], "B 1": [50.0, 52.0], "C 1": [10.0]}
        live = {"A 1": (62.0, 2.0), "C 1": (12.0, 4.0), "D 1": (90.0, 4.0)}
        rows = c.join(bench, live)
        self.assertEqual(["A 1", "C 1"], [r[0] for r in rows])
        self.assertAlmostEqual(65.0, rows[0][1])
        self.assertTrue(math.isnan(rows[1][2]))

    def test_thin_join_is_reported_not_fitted(self):
        rows = [("A", 60.0, 1.0, 62.0, 2.0), ("B", 50.0, 1.0, 51.0, 2.0)]
        text = "\n".join(c.report("3.8", rows, c.Path("page.csv")))
        self.assertIn("too thin", text)
        self.assertNotIn("slope", text)

    def test_build_without_live_page_says_so(self):
        text = "\n".join(c.report("3.7", [], None))
        self.assertIn("nothing to calibrate", text)


class ReportTest(unittest.TestCase):

    def test_offset_and_fit_lines(self):
        rows = [("o%d" % i, 2.0 + 0.9 * x, 1.0, x, 2.0) for i, x in enumerate(range(20, 100, 10))]
        text = "\n".join(c.report("3.8", rows, c.Path("page.csv")))
        self.assertIn("joined opponents: 8", text)
        self.assertIn("bench = 2.00 + 0.900 * live", text)
        self.assertIn("residual SD: 0.00", text)

    def test_committed_tables_join_enough_opponents(self):
        by_build = c.bench_by_build([c.ROOT / p for p in c.DEFAULT_BENCH])
        page = c.live_page("3.8")
        self.assertIsNotNone(page)
        self.assertGreaterEqual(len(c.join(by_build["3.8"], c.read_live(page))), c.MIN_JOINED)
        self.assertIsNone(c.live_page("3.7"))


if __name__ == "__main__":
    unittest.main()
