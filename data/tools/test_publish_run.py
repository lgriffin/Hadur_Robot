"""Tests for publish_run.py: python test_publish_run.py"""

import contextlib
import io
import json
import os
import shutil
import subprocess
import tempfile
import unittest

import publish_run as pr

HERE = os.path.dirname(os.path.abspath(__file__))
REPO = os.path.abspath(os.path.join(HERE, "..", ".."))
FIXTURE = os.path.join(HERE, "fixtures", "analysis-ll-351v34.json")
SMALL_TSV = os.path.join(REPO, "data", "bench", "2026-10-06_hadur-leak38-step3-local_cold.tsv")


def fixture_source(**extra):
    with open(FIXTURE, encoding="utf-8") as f:
        analysis = json.load(f)
    src = dict(id="2026-10-07_ll-351v34", date="2026-10-07", label="ll-351v34", kind="solo", set="live-losers.txt",
               engine="1.11.1", analysis=analysis)
    src.update(extra)
    return src


def quiet(fn, *a, **k):
    with contextlib.redirect_stdout(io.StringIO()):
        return fn(*a, **k)


class RunPage(unittest.TestCase):
    def test_an_analysed_run_gets_the_a3_page_json_and_markdown(self):
        entry, files = pr.build_run(fixture_source(), None)
        self.assertEqual({"index.html", "a3.md", "analysis.json"}, set(files))
        self.assertIn("../../index.html", files["index.html"])
        self.assertEqual(entry["gate"], json.loads(files["analysis.json"])["gate"]["verdict"])
        self.assertIsInstance(entry["diff"], float)

    def test_a_melee_run_is_not_analysed_and_carries_no_number(self):
        src = dict(id="2026-10-07_melee", date="2026-10-07", label="melee", kind="melee", set="melee.txt",
                   candidate="3.8.5", baseline="3.7", why="melee has no paired analysis")
        entry, files = pr.build_run(src, None)
        self.assertEqual(pr.NOT_ANALYSED, entry["gate"])
        self.assertIsNone(entry.get("diff"))
        self.assertIn("NOT ANALYSED", files["index.html"])
        self.assertNotIn("analysis.json", files)

    def test_the_run_report_is_copied_beside_the_page(self):
        with tempfile.TemporaryDirectory() as tmp:
            report = os.path.join(tmp, "report.md")
            with open(report, "w", encoding="utf-8") as f:
                f.write("# report\n")
            _, files = pr.build_run(fixture_source(report=report), tmp)
        self.assertEqual("# report\n", files["report.md"])
        self.assertIn("report.md", files["index.html"])


class Site(unittest.TestCase):
    def setUp(self):
        self.tmp = tempfile.mkdtemp()
        self.addCleanup(shutil.rmtree, self.tmp, True)

    def publish(self, **extra):
        return pr.write_site(self.tmp, REPO, [pr.build_run(fixture_source(**extra), None)])

    def index(self):
        with open(os.path.join(self.tmp, "bench", "index.html"), encoding="utf-8") as f:
            return f.read()

    def test_an_empty_site_says_so_and_still_has_the_site_nav(self):
        pr.write_site(self.tmp, REPO, [])
        page = self.index()
        self.assertIn("No run has been published yet", page)
        self.assertIn('href="../style.css"', page)
        self.assertIn("Bench analysis", page)

    def test_the_index_lists_the_run_and_links_to_it(self):
        self.publish()
        self.assertIn('href="runs/2026-10-07_ll-351v34/"', self.index())
        self.assertTrue(os.path.isfile(os.path.join(self.tmp, "bench", "runs", "2026-10-07_ll-351v34", "index.html")))

    def test_publishing_the_same_run_twice_leaves_one_entry(self):
        self.publish()
        runs = self.publish()
        self.assertEqual(1, len(runs))

    def test_history_is_newest_first_and_latest_follows_the_newest(self):
        self.publish()
        self.publish(id="2026-10-09_later", date="2026-10-09", label="later")
        self.publish(id="2026-10-03_earlier", date="2026-10-03", label="earlier")
        ids = [r["id"] for r in pr.read_registry(self.tmp)]
        self.assertEqual(["2026-10-09_later", "2026-10-07_ll-351v34", "2026-10-03_earlier"], ids)
        self.assertIn('Latest</b>: <a href="runs/2026-10-09_later/"', self.index())

    def test_rebuilding_the_index_keeps_every_run(self):
        self.publish()
        pr.write_site(self.tmp, REPO, [])
        self.assertEqual(1, len(pr.read_registry(self.tmp)))

    def test_the_trend_chart_is_copied_when_the_repository_has_one(self):
        self.publish()
        self.assertEqual(os.path.isfile(os.path.join(REPO, "docs", "bench", "trend.svg")),
                         os.path.isfile(os.path.join(self.tmp, "bench", "trend.svg")))


class Backfill(unittest.TestCase):
    def test_paired_tsvs_are_published_and_others_are_skipped_with_a_reason(self):
        with tempfile.TemporaryDirectory() as repo:
            bench = os.path.join(repo, "data", "bench")
            os.makedirs(bench)
            shutil.copy(SMALL_TSV, bench)
            with open(os.path.join(bench, "2026-10-06_hadur-x_cold.tsv"), "w", encoding="utf-8") as f:
                f.write("build\topponent\tseed\tscore\n")
            with open(os.path.join(bench, "history.tsv"), "w", encoding="utf-8") as f:
                f.write("a\tb\n")

            class Args:
                pass
            args = Args()
            args.repo, args.bench_dir, args.only = repo, os.path.join("data", "bench"), None
            with tempfile.TemporaryDirectory() as tmp:
                sources, skipped = pr.sources_from_backfill(args, tmp)
        self.assertEqual(["2026-10-06_leak38-step3"], [s["id"] for s in sources])
        self.assertEqual(1, len(skipped))
        self.assertIn("no score_share", skipped[0])

    def test_dry_run_writes_nothing_to_the_repository(self):
        before = set(os.listdir(REPO))
        quiet(pr.main, ["backfill", "--only", "leak38-step3", "--dry-run"])
        self.assertEqual(before, set(os.listdir(REPO)))


class Branch(unittest.TestCase):
    def setUp(self):
        self.tmp = tempfile.mkdtemp()
        self.addCleanup(shutil.rmtree, self.tmp, True)
        self.origin = os.path.join(self.tmp, "origin.git")
        self.repo = os.path.join(self.tmp, "repo")
        self.git(self.tmp, "init", "-q", "--bare", self.origin)
        self.git(self.tmp, "clone", "-q", self.origin, self.repo)
        self.git(self.repo, "checkout", "-q", "-b", "gh-pages")
        with open(os.path.join(self.repo, "index.html"), "w") as f:
            f.write("site")
        self.git(self.repo, "add", "-A")
        self.git(self.repo, "commit", "-q", "-m", "site")
        self.git(self.repo, "push", "-q", "origin", "gh-pages")

    def git(self, cwd, *a):
        subprocess.run(["git", "-C", cwd, "-c", "user.name=t", "-c", "user.email=t@example.com"] + list(a), check=True,
                       capture_output=True)

    def rev(self):
        return subprocess.run(["git", "-C", self.origin, "rev-parse", "gh-pages"], capture_output=True, text=True).stdout

    def files_on_origin(self):
        out = subprocess.run(["git", "-C", self.origin, "ls-tree", "-r", "--name-only", "gh-pages"], capture_output=True,
                             text=True, check=True).stdout
        return set(out.split())

    def build(self, site):
        pr.write_site(site, REPO, [pr.build_run(fixture_source(), None)])

    def test_a_publish_adds_bench_and_leaves_the_rest_of_the_branch(self):
        quiet(pr.publish_branch, self.repo, self.build, "Bench analysis: test", True)
        files = self.files_on_origin()
        self.assertIn("index.html", files)
        self.assertIn("bench/runs/2026-10-07_ll-351v34/index.html", files)

    def test_no_push_leaves_the_branch_alone(self):
        quiet(pr.publish_branch, self.repo, self.build, "Bench analysis: test", False)
        self.assertEqual({"index.html"}, self.files_on_origin())

    def test_publishing_again_changes_nothing(self):
        quiet(pr.publish_branch, self.repo, self.build, "Bench analysis: test", True)
        head = self.rev()
        quiet(pr.publish_branch, self.repo, self.build, "Bench analysis: test", True)
        self.assertEqual(head, self.rev())

    def test_a_missing_branch_is_an_error_not_a_crash(self):
        self.git(self.repo, "push", "-q", "origin", "--delete", "gh-pages")
        with self.assertRaises(RuntimeError):
            pr.publish_branch(self.repo, self.build, "m", True)


if __name__ == "__main__":
    unittest.main()
