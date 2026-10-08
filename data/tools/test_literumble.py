"""Tests for literumble.py and analyse.py --live (issue #151): python test_literumble.py

BENCH-73 (A5 projection), BENCH-74 (A6 coverage), BENCH-75 (A9 LiteRumble-style metrics).
LiveToolsTest.java runs each class from the Maven build, which is where the IDs are traced.
"""

import contextlib
import io
import json
import math
import os
import tempfile
import unittest

import analyse as an
import literumble as lr

HERE = os.path.dirname(os.path.abspath(__file__))
PAGE_39 = os.path.join(HERE, "..", "rumble", "parsed",
                       "2026-10-07T2028Z_roborumble_botdetails_hadur2.Hadur_3.9.csv")
HEADER = ("rank,flag,name,compare,aps,aps_ci,npp,survival,knnpbi,battles,latest_battle_utc,"
          "opponent_aps,opponent_survival\n")


def write_page(path, rows):
    """rows: (name, aps, ci, survival, battles, opponent_aps)."""
    with open(path, "w", encoding="utf-8") as f:
        f.write(HEADER)
        for i, (name, aps, ci, surv, n, opp) in enumerate(rows, 1):
            f.write("%d,,%s,compare,%.2f,±%.2f,%.2f,%.2f,0,%d,2026-10-07 20:00:00,%.2f,50\n"
                    % (i, name, aps, ci, aps, surv, n, opp))


def field(n):
    """n live pairings, opponent APS falling with the index, so rank i+1 is bot i."""
    return [("b.Bot%d 1.0" % i, 80.0, 7.84, 90.0, 1, 100.0 - i * 0.05) for i in range(n)]


class SummaryTest(unittest.TestCase):
    """BENCH-75: LiteRumble's header, reproduced from the pairing rows alone."""

    def test_reproduces_the_3_9_page_header(self):
        s = lr.summary(lr.read_page(PAGE_39))
        # The page's own header: APS 87.15, APS CI +/-0.19, PWIN 99.34, Survival 95.04,
        # Pairings 1215, Battles 1885.
        self.assertEqual(round(s["aps"], 2), 87.15)
        self.assertEqual(round(s["ci"], 2), 0.19)
        self.assertEqual(round(s["pwin"], 2), 99.34)
        self.assertEqual(round(s["survival"], 2), 95.04)
        self.assertEqual(s["pairings"], 1215)
        self.assertEqual(s["battles"], 1885)

    def test_one_battle_pairing_has_the_prior_variance(self):
        self.assertEqual(lr.shrunk_var([73.0]), 16.0)
        self.assertAlmostEqual(lr.Z95 * math.sqrt(lr.shrunk_var([73.0]) / 1), 7.84)
        # Two battles 2 apart: SS 2, (2 + 48) / 4.
        self.assertAlmostEqual(lr.shrunk_var([70.0, 72.0]), 12.5)

    def test_pwin_counts_a_tie_as_half(self):
        self.assertEqual(lr.pwin([60, 50, 40, 70]), 62.5)
        self.assertTrue(math.isnan(lr.pwin([])))

    def test_bench_summary_is_the_unweighted_mean_of_opponent_means(self):
        per = {"a": dict(shares=[90.0, 90.0, 90.0, 90.0], survival=[100.0] * 4),
               "b": dict(shares=[40.0], survival=[0.0])}
        s = lr.bench_summary(per)
        self.assertAlmostEqual(s["aps"], 65.0)      # not (360 + 40) / 5
        self.assertEqual(s["pwin"], 50.0)
        self.assertEqual(s["survival"], 50.0)
        self.assertEqual(s["battles"], 5)
        want = lr.Z95 * math.sqrt(8.0 / 4 + 16.0 / 1) / 2   # a: 48 / (4 + 2) = 8
        self.assertAlmostEqual(s["ci"], want)

    def test_bench_survival_is_rounds_won_not_the_survival_score(self):
        rows = [dict(build="x", opponent="a", ok="true", score="2205", theirScore="167",
                     firsts="34", rounds="35", survival="1700")]
        per = lr.bench_per_opponent(rows, "x")
        self.assertAlmostEqual(per["a"]["survival"][0], 100.0 * 34 / 35)
        self.assertAlmostEqual(per["a"]["shares"][0], 100.0 * 2205 / 2372)

    def test_failed_and_other_builds_are_left_out(self):
        rows = [dict(build="x", opponent="a", ok="false", score_share="0.9"),
                dict(build="y", opponent="a", ok="true", score_share="0.9")]
        self.assertEqual(lr.bench_per_opponent(rows, "x"), {})


class ProjectionTest(unittest.TestCase):
    """BENCH-73: per-opponent bench differences onto the live APS."""

    def test_direct_is_the_sum_over_all_pairings(self):
        pairings = [dict(name=n, aps=a, ci=c, survival=s, battles=b, opponent_aps=o)
                    for n, a, c, s, b, o in field(1000)]
        diffs = {"b.Bot0 1.0": (5.0, 1.0), "b.Bot999 1.0": (-1.0, 2.0), "x.Gone 1.0": (9.0, 1.0)}
        pr = lr.project(diffs, pairings)
        self.assertAlmostEqual(pr["direct"], 4.0 / 1000)
        self.assertAlmostEqual(pr["direct_se"], math.sqrt(5.0) / 1000)
        self.assertEqual(pr["covered"], 2)
        self.assertEqual(pr["missing"], ["x.Gone 1.0"])

    def test_bands_need_three_covered_opponents(self):
        pairings = [dict(name=n, aps=a, ci=c, survival=s, battles=b, opponent_aps=o)
                    for n, a, c, s, b, o in field(1000)]
        # ranks 1-3 (band 1-50, 50 pairings) +2 each; one bot in 701+ only.
        diffs = OrderedDictish([("b.Bot0 1.0", (2.0, 0.5)), ("b.Bot1 1.0", (2.0, 0.5)),
                                ("b.Bot2 1.0", (2.0, 0.5)), ("b.Bot900 1.0", (10.0, 0.5))])
        pr = lr.project(diffs, pairings)
        top = pr["bands"][0]
        self.assertTrue(top["used"])
        self.assertAlmostEqual(top["contribution"], 2.0 * 50 / 1000)
        self.assertAlmostEqual(pr["extrapolated"], 0.1)
        self.assertIn("701+", pr["bands_left_out"])

    def test_ranks_leave_the_bots_own_ladder_place(self):
        # The saved 3.9 page: Hadur is 13th at 87.15 and dft.Cardigan 1.09 51st on the ladder.
        r = lr.ranks(lr.read_page(PAGE_39))
        self.assertEqual(r["dft.Cardigan 1.09"], 51)
        self.assertEqual(lr.band_label(lr.band_of(r["dft.Cardigan 1.09"])), "51-200")
        self.assertEqual(max(r.values()), 1216)
        self.assertNotIn(13, r.values())

    def test_ranks_follow_the_opponents_own_aps(self):
        pairings = [dict(name="lo 1", opponent_aps=10.0), dict(name="hi 1", opponent_aps=90.0)]
        self.assertEqual(lr.ranks(pairings), {"hi 1": 1, "lo 1": 2})
        self.assertEqual(lr.band_label(lr.band_of(701)), "701+")
        self.assertEqual(lr.band_label(lr.band_of(51)), "51-200")


def OrderedDictish(items):
    from collections import OrderedDict
    return OrderedDict(items)


class CoverageTest(unittest.TestCase):
    """BENCH-74: a set's coverage of the live field, version drift and unrunnable bots."""

    def test_statuses_and_bands(self):
        pairings = [dict(name=n, aps=a, ci=c, survival=s, battles=b, opponent_aps=o)
                    for n, a, c, s, b, o in field(60)]
        names = ["b.Bot0 1.0", "b.Bot55 0.9", "z.None 1.0", "e32.Omni 0.06"]
        cov = lr.coverage(names, pairings, unrunnable=["e32.Omni 0.06"])
        status = {e[0]: (e[1], e[2], e[3]) for e in cov["entries"]}
        self.assertEqual(status["b.Bot0 1.0"], ("live", "b.Bot0 1.0", 1))
        self.assertEqual(status["b.Bot55 0.9"], ("drift", "b.Bot55 1.0", 56))
        self.assertEqual(status["z.None 1.0"][0], "absent")
        self.assertEqual(status["e32.Omni 0.06"][0], "unrunnable")
        self.assertEqual(cov["bands"][0], ("1-50", 50, 1))
        self.assertEqual(cov["bands"][1], ("51-200", 10, 0))

    def test_an_opponent_without_a_usable_pair_is_not_covered(self):
        pairings = [dict(name=n, aps=a, ci=c, survival=s, battles=b, opponent_aps=o)
                    for n, a, c, s, b, o in field(60)]
        cov = lr.coverage(["b.Bot0 1.0", "b.Bot1 1.0"], pairings, measured={"b.Bot0 1.0"})
        status = {e[0]: e[1] for e in cov["entries"]}
        self.assertEqual(status, {"b.Bot0 1.0": "live", "b.Bot1 1.0": "unmeasured"})
        self.assertEqual(cov["bands"][0][2], 1)

    def test_split_name_and_set_reading(self):
        self.assertEqual(lr.split_name("pkg.Bot 1.2b"), ("pkg.Bot", "1.2b"))
        self.assertEqual(lr.split_name("pkg.Bot"), ("pkg.Bot", ""))
        with tempfile.TemporaryDirectory() as d:
            p = os.path.join(d, "set.txt")
            with open(p, "w") as f:
                f.write("# comment\nopponents=x.txt\n\na.B 1.0 | role | a.B_1.0.jar\nc.D 2\n")
            self.assertEqual(lr.read_set(p), ["a.B 1.0", "c.D 2"])

    def test_the_repo_unrunnable_list_names_omni(self):
        self.assertIn("e32.Omni 0.06",
                      lr.read_set(os.path.join(HERE, "..", "..", "hadur-bench", "unrunnable.txt")))


class AnalyseLiveTest(unittest.TestCase):
    """BENCH-73 to 75 through analyse.py --live, text and analysis.json."""

    def test_live_block_in_text_and_json(self):
        with tempfile.TemporaryDirectory() as d:
            page = os.path.join(d, "page.csv")
            write_page(page, field(100))
            tsv = os.path.join(d, "run.tsv")
            with open(tsv, "w") as f:
                f.write("build\topponent\tseed\tok\tscore_share\n")
                for seed in (1, 2, 3):
                    for opp, new, old in (("b.Bot0 1.0", 0.80, 0.70), ("b.Bot1 1.0", 0.60, 0.50),
                                          ("q.NotLive 1.0", 0.48, 0.48)):
                        f.write("new\t%s\t%d\ttrue\t%s\n" % (opp, seed, new + 0.01 * seed))
                        f.write("old\t%s\t%d\ttrue\t%s\n" % (opp, seed, old + 0.01 * seed))
            out = os.path.join(d, "a.json")
            buf = io.StringIO()
            with contextlib.redirect_stdout(buf):
                an.main([tsv, "--candidate", "new", "--baseline", "old", "--json", out,
                         "--live", page])
            text = buf.getvalue()
            self.assertIn("LITERUMBLE-STYLE", text)
            self.assertIn("LIVE PROJECTION over 100 live pairings", text)
            self.assertIn("q.NotLive 1.0", text)
            with open(out) as f:
                doc = json.load(f)
            live = doc["live"]
            self.assertAlmostEqual(live["projection"]["direct"], 20.0 / 100)
            self.assertEqual(live["projection"]["covered"], 2)
            self.assertEqual(live["builds"]["new"]["pairings"], 3)
            self.assertEqual(live["builds"]["new"]["pwin"], 100.0 * 2.5 / 3)
            self.assertEqual(live["coverage"]["flagged"][0]["status"], "absent")

    def test_projection_is_in_aps_points_whatever_the_metric(self):
        with tempfile.TemporaryDirectory() as d:
            page = os.path.join(d, "page.csv")
            write_page(page, field(100))
            tsv = os.path.join(d, "run.tsv")
            with open(tsv, "w") as f:
                f.write("build\topponent\tseed\tok\tscore\ttheirScore\tfirsts\trounds\n")
                for seed in (1, 2):
                    f.write("new\tb.Bot0 1.0\t%d\ttrue\t80\t20\t30\t35\n" % seed)
                    f.write("old\tb.Bot0 1.0\t%d\ttrue\t70\t30\t%d\t35\n" % (seed, 20 + seed))
                    # a failed battle: no pair, so b.Bot1 is not covered
                    f.write("new\tb.Bot1 1.0\t%d\tfalse\t\t\t\t35\n" % seed)
                    f.write("old\tb.Bot1 1.0\t%d\ttrue\t50\t50\t10\t35\n" % seed)
            for extra in (["--metric", "firsts"], ["--scale", "1"]):
                out = os.path.join(d, "a.json")
                with contextlib.redirect_stdout(io.StringIO()):
                    an.main([tsv, "--candidate", "new", "--baseline", "old", "--json", out,
                             "--live", page] + extra)
                with open(out) as f:
                    live = json.load(f)["live"]
                self.assertAlmostEqual(live["projection"]["direct"], 10.0 / 100, msg=extra)
                self.assertEqual(live["projection"]["covered"], 1)
                self.assertEqual(live["coverage"]["flagged"][0]["status"], "unmeasured")

    def test_engine_line_when_known(self):
        res = an.analyse({"a": dict(diffs=[1.0, 2.0], weight=1.0)}, 1.0)
        text = an.render(res, "new", "old", "score_share", "points", extra=dict(engine="1.11.1"))
        self.assertIn("engine: Robocode 1.11.1", text.splitlines()[1])


if __name__ == "__main__":
    unittest.main()
