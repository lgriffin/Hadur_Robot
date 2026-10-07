"""Tests for analyse.py: python test_analyse.py"""

import json
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


def trow(build, opp, seed, share, ok="true", **extra):
    row = dict(build=build, opponent=opp, seed=str(seed), ok=ok, score_share=repr(share),
               rounds="35", roundRecords="35", skippedTurns="10", duressTicks="0",
               rShortfall="0", finalRMissing="0")
    row.update({k: str(v) for k, v in extra.items()})
    return row


def run_rows(gains, seeds=6, **extra_cand):
    """Rows for opponents named o0.. with the given candidate gains in share (0.05 is 5 points);
    each opponent has a little seed noise so every interval has a width."""
    rows = []
    for i, gain in enumerate(gains):
        for seed in range(1, seeds + 1):
            noise = 0.01 * (seed % 3 - 1)
            rows.append(trow("new", "o%d" % i, seed, 0.5 + gain + noise, **extra_cand))
            rows.append(trow("old", "o%d" % i, seed, 0.5 - noise))
    return rows


def run_analysis(rows, **kw):
    cand, base = "new", "old"
    ok_rows = [r for r in rows if r["ok"] != "false"]
    per_opp = an.pair(ok_rows, "score_share", cand, base, 100.0)
    result = an.analyse(per_opp, 1.0)
    return per_opp, result, an.build_json(per_opp, result, rows, ok_rows, cand, base, 1.0,
                                          kw.get("cond"), dict(label="t"), kw.get("selected_on"))


class ClusteredHeadlineTest(unittest.TestCase):

    def test_clustered_interval_decides_the_verdict_when_opponents_differ(self):
        # +5 on average per battle, but the opponents range from -10 to +20
        per_opp, result, doc = run_analysis(run_rows([0.20, 0.15, -0.10, 0.00, 0.12, -0.05]))
        self.assertGreater(result["battle"]["lo"], 0)
        self.assertLess(result["cluster"]["lo"], 0)
        self.assertEqual(doc["pooled"]["verdict"], "not-resolved")
        self.assertGreater(doc["pooled"]["clusteredCi95"][1] - doc["pooled"]["clusteredCi95"][0],
                           doc["pooled"]["ci95"][1] - doc["pooled"]["ci95"][0])

    def test_verdicts_up_down_and_level(self):
        self.assertEqual(run_analysis(run_rows([0.05] * 6))[2]["pooled"]["verdict"], "up")
        self.assertEqual(run_analysis(run_rows([-0.05] * 6))[2]["pooled"]["verdict"], "down")
        self.assertEqual(run_analysis(run_rows([0.001] * 6))[2]["pooled"]["verdict"], "level")

    def test_text_leads_with_the_clustered_interval(self):
        per_opp, result, doc = run_analysis(run_rows([0.20, 0.15, -0.10, 0.00, 0.12, -0.05]))
        text = an.render(result, "new", "old", "score_share", "points", 1.0,
                         dict(gate=doc["gate"], excluded=doc["excluded"],
                              without_duress=doc["trust"]["withoutDuress"]))
        lines = text.splitlines()
        self.assertTrue(lines[2].startswith("HEADLINE"))
        self.assertIn("opponent-clustered", lines[2])
        self.assertIn("NOT-RESOLVED", lines[2])
        self.assertTrue(lines[3].startswith("per battle"))
        self.assertIn("more opponents", text)


class ExcludedAndFailedTest(unittest.TestCase):

    def test_opponent_that_fails_every_battle_is_excluded_and_named(self):
        rows = run_rows([0.05] * 3)
        for seed in range(1, 5):
            rows.append(trow("new", "zen.Ronin", seed, 0.0, ok="false"))
            rows.append(trow("old", "zen.Ronin", seed, 0.0, ok="false"))
        per_opp, result, doc = run_analysis(rows)
        self.assertEqual(doc["pooled"]["nOpponents"], 3)
        self.assertEqual(doc["excluded"], [dict(name="zen.Ronin", reason="failed every battle (8 of 8)",
                                                failed=8, total=8)])
        self.assertNotIn("zen.Ronin", [o["name"] for o in doc["opponents"]])

    def test_partly_failed_opponent_stays_with_its_failed_count(self):
        rows = run_rows([0.05] * 3)
        rows.append(trow("new", "o0", 99, 0.0, ok="false"))
        doc = run_analysis(rows)[2]
        self.assertEqual({o["name"]: o["failed"] for o in doc["opponents"]}["o0"], 1)
        self.assertEqual(doc["excluded"], [])


class TrustAndGateTest(unittest.TestCase):

    def test_final_round_record_missing_is_not_held_against_a_row(self):
        row = trow("new", "o", 1, 0.5, roundRecords=34, rShortfall=1, finalRMissing=1)
        self.assertEqual(an.untrusted_reasons(row), [])
        lost = trow("new", "o", 1, 0.5, roundRecords=33, rShortfall=2, finalRMissing=1)
        self.assertEqual(an.untrusted_reasons(lost), ["R records"])

    def test_reasons_for_duress_and_skips(self):
        self.assertEqual(an.untrusted_reasons(trow("new", "o", 1, 0.5, duressTicks=3)), ["duress"])
        self.assertEqual(an.untrusted_reasons(trow("new", "o", 1, 0.5, skippedTurns=71)), ["skips"])
        self.assertEqual(an.untrusted_reasons(trow("new", "o", 1, 0.5, skippedTurns=70)), [])

    def test_clean_run_is_trusted(self):
        doc = run_analysis(run_rows([0.02] * 4))[2]
        self.assertEqual(doc["gate"], dict(verdict="TRUSTED", reasons=[]))
        self.assertFalse(doc["floorWarning"])

    def test_a_few_duress_pairs_make_it_a_caution_and_are_reported_without(self):
        rows = run_rows([0.02] * 4)
        rows[0]["duressTicks"] = "5"
        per_opp, result, doc = run_analysis(rows)
        self.assertEqual(doc["gate"]["verdict"], "CAUTION")
        self.assertEqual(doc["trust"]["untrustedPairs"], 1)
        wd = doc["trust"]["withoutDuress"]
        self.assertEqual((wd["removed"], wd["n"]), (1, 23))

    def test_most_pairs_untrusted_is_not_trusted(self):
        doc = run_analysis(run_rows([0.02] * 4, duressTicks=4))[2]
        self.assertEqual(doc["gate"]["verdict"], "NOT_TRUSTED")

    def test_builds_under_different_load_are_not_trusted(self):
        rows = run_rows([0.02] * 4)
        for r in rows:
            r["skippedTurns"] = "40" if r["build"] == "new" else "10"
        doc = run_analysis(rows)[2]
        self.assertEqual(doc["gate"]["verdict"], "NOT_TRUSTED")
        self.assertIn("different load", " ".join(doc["gate"]["reasons"]))

    def test_floor_effect_on_heavy_skipping_cautions_and_names_the_floor(self):
        rows = run_rows([0.01] * 4)
        for r in rows:
            r["skippedTurns"] = "120"
        doc = run_analysis(rows)[2]
        self.assertTrue(doc["floorWarning"])
        self.assertIn("floor effect", " ".join(doc["gate"]["reasons"]))

    def test_low_shares_alone_are_not_a_floor_when_skipping_is_normal(self):
        rows = []
        for seed in range(1, 6):
            rows.append(trow("new", "o", seed, 0.20))
            rows.append(trow("old", "o", seed, 0.22))
        self.assertFalse(run_analysis(rows)[2]["floorWarning"])

    def test_mixed_rounds_caution(self):
        rows = run_rows([0.02] * 3)
        rows[0]["rounds"] = rows[0]["roundRecords"] = "10"
        self.assertIn("mixed rounds", " ".join(run_analysis(rows)[2]["gate"]["reasons"]))

    def test_selected_on_baseline_warns(self):
        doc = run_analysis(run_rows([0.02] * 4), selected_on="baseline")[2]
        self.assertEqual(doc["gate"]["verdict"], "CAUTION")
        self.assertIn("fresh opponents", " ".join(doc["gate"]["reasons"]))
        self.assertEqual(doc["run"]["selectedOn"], "baseline")

    def test_busy_host_and_other_jvms_caution(self):
        cond = dict(hostSample=dict(cpuMin=0.1, cpuMean=0.9, cpuMax=1.0, otherJvmsMax=2))
        doc = run_analysis(run_rows([0.02] * 4), cond=cond)[2]
        reasons = " ".join(doc["gate"]["reasons"])
        self.assertIn("host CPU averaged 90%", reasons)
        self.assertIn("2 other Robocode JVMs", reasons)


class AnalysisJsonTest(unittest.TestCase):

    def test_document_has_the_contract_fields_and_is_json_safe(self):
        cond = {"started": "2026-10-06T22:04:15Z", "set": "x.txt", "seeds": 6, "rounds": 35,
                "engine": "1.11.1", "host": "box", "parallel": 12, "childCpus": "2",
                "cpuConstant": "robocode.cpu.constant=400000 (pinned with --cpu-constant)",
                "options": {"child-heap": "2G"},
                "hostSample": {"cpuMin": 0.0, "cpuMean": 0.4, "cpuMax": 1.0, "otherJvmsMax": 0}}
        doc = run_analysis(run_rows([0.02] * 4), cond=cond)[2]
        parsed = json.loads(json.dumps(doc, allow_nan=False))
        self.assertEqual(parsed["schema"], 1)
        self.assertEqual(set(parsed), {"schema", "run", "gate", "pooled", "opponents", "excluded",
                                       "floorWarning", "trust"})
        run = parsed["run"]
        self.assertEqual((run["candidate"], run["baseline"], run["set"], run["seeds"], run["rounds"],
                          run["engine"], run["date"]), ("new", "old", None, 6, 35, None, None))
        c = run["conditions"]
        self.assertEqual((c["host"], c["cpuConstant"], c["parallel"], c["childHeap"], c["childCpus"]),
                         ("box", 400000, 12, "2G", 2))
        self.assertEqual(c["hostLoad"], dict(min=0.0, mean=0.4, max=1.0))
        self.assertEqual(set(parsed["pooled"]), {"diff", "ci95", "clusteredCi95", "n", "nOpponents",
                                                 "tost", "verdict"})
        self.assertEqual(set(parsed["opponents"][0]), {"name", "diff", "ci95", "holm", "bh", "skips",
                                                       "n", "failed"})
        self.assertEqual(set(parsed["trust"]), {"skippedPerBattle", "duressPerBattle",
                                                "untrustedPairs", "pairs", "withoutDuress"})

    def test_without_conditions_file_the_block_is_null(self):
        c = run_analysis(run_rows([0.02] * 4))[2]["run"]["conditions"]
        self.assertEqual((c["host"], c["cpuConstant"], c["parallel"], c["childHeap"], c["childCpus"]),
                         (None, None, None, None, None))

    def test_one_opponent_gives_null_intervals_not_nan(self):
        doc = run_analysis(run_rows([0.02]))[2]
        json.dumps(doc, allow_nan=False)
        self.assertEqual(doc["pooled"]["verdict"], "not-resolved")

    def test_command_line_writes_the_file_and_prints_the_gate(self):
        with tempfile.TemporaryDirectory() as tmp:
            tsv = os.path.join(tmp, "x.tsv")
            cols = ["build", "opponent", "seed", "ok", "score_share", "rounds", "roundRecords",
                    "skippedTurns", "duressTicks", "rShortfall", "finalRMissing"]
            with open(tsv, "w", encoding="utf-8") as f:
                f.write("\t".join(cols) + "\n")
                for r in run_rows([0.03] * 3):
                    f.write("\t".join(r[c] for c in cols) + "\n")
            out = os.path.join(tmp, "analysis.json")
            import contextlib
            import io
            buf = io.StringIO()
            with contextlib.redirect_stdout(buf):
                an.main([tsv, "--candidate", "new", "--baseline", "old", "--json", out,
                         "--selected-on", "baseline", "--label", "lbl", "--set-name", "s.txt"])
            self.assertIn("GATE CAUTION", buf.getvalue())
            with open(out, encoding="utf-8") as f:
                doc = json.load(f)
            self.assertEqual((doc["run"]["label"], doc["run"]["set"]), ("lbl", "s.txt"))


class PooledPlanTest(unittest.TestCase):

    def per_opp(self, spread):
        out = {}
        for i, d in enumerate(spread):
            diffs = [d + 0.5 * (j % 3 - 1) for j in range(8)]
            out["o%d" % i] = dict(diffs=diffs, cand=[50 + x for x in diffs], base=[50.0] * 8, weight=1.0)
        return out

    def test_between_opponent_spread_makes_seeds_pointless_and_names_the_opponents_needed(self):
        pooled = an.plan_pooled(self.per_opp([-10, 12, -8, 15, 0, 9]), 2.0)
        self.assertTrue(pooled["seeds_limited"])
        self.assertGreater(pooled["k_need"], pooled["k"])
        text = an.render_plan(an.plan(self.per_opp([-10, 12, -8, 15, 0, 9]), 2.0), 2.0, "points", pooled)
        self.assertIn("MORE OPPONENTS, NOT MORE SEEDS", text)

    def test_similar_opponents_leave_seeds_useful(self):
        pooled = an.plan_pooled(self.per_opp([1.0, 1.1, 0.9, 1.0, 1.05, 0.95]), 2.0)
        self.assertFalse(pooled["seeds_limited"])


if __name__ == "__main__":
    unittest.main()
