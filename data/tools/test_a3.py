"""Tests for a3.py: python test_a3.py"""

import contextlib
import io
import json
import os
import random
import tempfile
import unittest

import a3

HERE = os.path.dirname(os.path.abspath(__file__))
FIXTURE = os.path.join(HERE, "fixtures", "analysis-ll-351v34.json")

KAIZEN = """# Why is the candidate behind

Owner: Ada
Due: 2026-11-01
Chain ends at: the run has no unselected set.

## 5 Whys

1. The pooled difference is down.
2. It is down on the leak set.
3. The set was selected on a lucky baseline.

## Countermeasure

Kind: bench-run
Run both builds on an unselected set.
"""


def write(path, body):
    with open(path, "w", encoding="utf-8", newline="\n") as f:
        f.write(body)


def opp(name, diff, holm=None):
    return dict(name=name, diff=diff, ci95=[diff - 1, diff + 1], holm=holm, bh=None,
                skips=dict(cand=None, base=None), n=8, failed=0)


class KaizenTest(unittest.TestCase):

    def parse(self, body):
        with tempfile.TemporaryDirectory() as d:
            p = os.path.join(d, "k.md")
            write(p, body)
            return a3.parse_kaizen(p)

    def test_parses_title_fields_and_whys(self):
        k = self.parse(KAIZEN)
        self.assertEqual(k["title"], "Why is the candidate behind")
        self.assertEqual(k["fields"]["kind"], "bench-run")
        self.assertEqual(k["fields"]["owner"], "Ada")
        self.assertEqual(len(k["whys"]), 3)
        self.assertEqual(a3.kaizen_problems(k), [])

    def test_reports_each_missing_part(self):
        k = self.parse("# Bare\n\n## 5 Whys\n\n## Countermeasure\n")
        problems = " | ".join(a3.kaizen_problems(k))
        for want in ("Chain ends at", "Kind", "5 Whys"):
            self.assertIn(want, problems)

    def test_rejects_an_unknown_kind_and_a_second_kind(self):
        bad = self.parse(KAIZEN.replace("Kind: bench-run", "Kind: pray"))
        self.assertTrue(any("pray" in p for p in a3.kaizen_problems(bad)))
        two = self.parse(KAIZEN + "Kind: doc\n")
        self.assertTrue(any("more than one" in p for p in a3.kaizen_problems(two)))


class ParetoTest(unittest.TestCase):

    def test_sorted_largest_first_and_wins_are_not_netted_off(self):
        par = a3.pareto([opp("a", -1), opp("b", -5), opp("c", 9), opp("d", -4)])
        self.assertEqual([b["label"] for b in par["bars"]], ["b", "d", "a"])
        self.assertAlmostEqual(par["total"], 10.0)
        self.assertEqual(par["losers"], 3)

    def test_vital_few_cut_at_eighty_percent(self):
        par = a3.pareto([opp("a", -8), opp("b", -1), opp("c", -1)])
        self.assertEqual(par["vital"], 1)
        self.assertAlmostEqual(par["vital_share"], 0.8)

    def test_vital_few_is_counted_before_the_tail_is_merged(self):
        opps = [opp("o%02d" % i, -(30 - i)) for i in range(30)]
        par = a3.pareto(opps)
        self.assertEqual(len(par["bars"]), a3.PARETO_BARS)
        self.assertTrue(par["bars"][-1]["other"])
        self.assertLess(par["vital_share"], 0.9)
        self.assertGreaterEqual(par["vital_share"], a3.VITAL_SHARE)
        self.assertEqual(par["losers"], 30)

    def test_no_losers_gives_an_empty_chart(self):
        par = a3.pareto([opp("a", 2), opp("b", 0)])
        self.assertEqual(par["bars"], [])
        self.assertEqual(par["losers"], 0)


class RenderTest(unittest.TestCase):

    def load(self):
        with open(FIXTURE, encoding="utf-8") as f:
            return json.load(f)

    def test_fixture_renders_the_gate_and_the_headline(self):
        a = self.load()
        for page in (a3.render_html(a, None), a3.render_md(a, None)):
            self.assertIn(a["gate"]["verdict"], page)
            self.assertIn(a3.headline(a), page)

    def test_a_kaizen_file_is_shown_and_never_invented(self):
        a = self.load()
        with tempfile.TemporaryDirectory() as d:
            p = os.path.join(d, "k.md")
            write(p, KAIZEN)
            k = a3.parse_kaizen(p)
        self.assertIn("The set was selected on a lucky baseline.", a3.render_html(a, k))
        self.assertNotIn("selected on a lucky baseline", a3.render_html(a, None))
        self.assertNotIn("selected on a lucky baseline", a3.render_md(a, None))

    def test_near_empty_input_says_not_measured_and_does_not_crash(self):
        a = dict(schema=1)
        for page in (a3.render_html(a), a3.render_md(a)):
            self.assertIn(a3.NOT_MEASURED, page)
        self.assertEqual(a3.headline(a), a3.NOT_MEASURED)

    def test_not_trusted_withholds_the_verdict(self):
        a = dict(schema=1, gate=dict(verdict="NOT_TRUSTED", reasons=["skips"]), pooled=dict(verdict="down"))
        self.assertIn("NO VERDICT", a3.headline(a))

    def test_html_escapes_opponent_names(self):
        a = dict(schema=1, opponents=[opp("<script>x</script>", -3)])
        self.assertNotIn("<script>x", a3.render_html(a))

    def test_make_writes_html_and_markdown_with_the_given_stem(self):
        with tempfile.TemporaryDirectory() as d:
            with contextlib.redirect_stdout(io.StringIO()):
                self.assertEqual(a3.main(["make", FIXTURE, "--out-dir", d, "--stem", "x"]), 0)
            self.assertEqual(sorted(os.listdir(d)), ["x.html", "x.md"])

    def test_make_refuses_another_schema(self):
        with tempfile.TemporaryDirectory() as d:
            p = os.path.join(d, "a.json")
            write(p, json.dumps(dict(schema=2)))
            with self.assertRaises(SystemExit):
                a3.main(["make", p, "--out-dir", d])


class FromTsvTest(unittest.TestCase):

    def tsv(self, d, skips=0, share_c=0.6, share_b=0.5, dead=False):
        rng = random.Random(7)
        lines = ["build\topponent\tseed\tok\tscore_share\tweight\trounds\tskippedTurns\tduressTicks"]
        for opp_name in ("alpha", "beta", "gamma"):
            for seed in range(1, 7):
                for build, share in (("cand", share_c), ("base", share_b)):
                    s = share + rng.uniform(-0.03, 0.03)
                    lines.append("%s\t%s\t%d\ttrue\t%.4f\t1\t35\t%d\t0" % (build, opp_name, seed, s, skips))
        if dead:
            lines.append("cand\tdead\t1\tfalse\t\t1\t35\t0\t0")
        p = os.path.join(d, "r.tsv")
        write(p, "\n".join(lines) + "\n")
        return p

    def run_from_tsv(self, p):
        out = io.StringIO()
        with contextlib.redirect_stdout(out):
            a3.main(["from-tsv", p, "--candidate", "cand", "--baseline", "base", "--label", "t", "--date", "2026-10-07"])
        return json.loads(out.getvalue())

    def test_builds_a_schema_one_analysis_that_renders(self):
        with tempfile.TemporaryDirectory() as d:
            a = self.run_from_tsv(self.tsv(d))
        self.assertEqual(a["schema"], 1)
        self.assertEqual(a["pooled"]["verdict"], "up")
        self.assertEqual(a["gate"]["verdict"], "TRUSTED")
        self.assertEqual(len(a["opponents"]), 3)
        self.assertEqual(a["excluded"], [])
        self.assertIn("TRUSTED", a3.render_html(a))

    def test_an_opponent_with_no_result_is_excluded_and_cautions(self):
        with tempfile.TemporaryDirectory() as d:
            a = self.run_from_tsv(self.tsv(d, dead=True))
        self.assertEqual([e["name"] for e in a["excluded"]], ["dead"])
        self.assertEqual(a["gate"]["verdict"], "CAUTION")
        self.assertEqual(len(a["opponents"]), 3)

    def test_skips_above_two_per_round_are_not_trusted(self):
        with tempfile.TemporaryDirectory() as d:
            a = self.run_from_tsv(self.tsv(d, skips=100))
        self.assertEqual(a["gate"]["verdict"], "NOT_TRUSTED")

    def test_a_floor_effect_is_a_caution(self):
        with tempfile.TemporaryDirectory() as d:
            a = self.run_from_tsv(self.tsv(d, share_c=0.28, share_b=0.30))
        self.assertEqual(a["gate"]["verdict"], "CAUTION")
        self.assertTrue(a["floorWarning"])


class RegisterTest(unittest.TestCase):

    def test_table_lists_files_and_flags_problems(self):
        with tempfile.TemporaryDirectory() as d:
            write(os.path.join(d, "good.md"), KAIZEN)
            write(os.path.join(d, "bad.md"), "# Bad\n")
            write(os.path.join(d, "README.md"), "ignored")
            table, problems = a3.register_table(d)
        self.assertIn("Why is the candidate behind", table)
        self.assertIn("bench-run", table)
        self.assertTrue(problems)
        self.assertTrue(all(p.startswith("bad.md") for p in problems))

    def test_write_replaces_only_the_marked_block(self):
        with tempfile.TemporaryDirectory() as d:
            write(os.path.join(d, "good.md"), KAIZEN)
            readme = os.path.join(d, "README.md")
            write(readme, "top\n%s\nold\n%s\nbottom\n" % (a3.START, a3.END))
            with contextlib.redirect_stderr(io.StringIO()):
                self.assertEqual(a3.main(["register", "--dir", d, "--write"]), 0)
            with open(readme, encoding="utf-8") as f:
                body = f.read()
        self.assertTrue(body.startswith("top\n"))
        self.assertTrue(body.endswith("bottom\n"))
        self.assertNotIn("old", body)
        self.assertIn("Why is the candidate behind", body)

    def test_the_committed_register_has_no_problems(self):
        root = os.path.abspath(os.path.join(HERE, "..", "..", "kaizen"))
        _, problems = a3.register_table(root)
        self.assertEqual(problems, [])


if __name__ == "__main__":
    unittest.main()
