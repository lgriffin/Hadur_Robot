"""Tests for export_battles.py: python test_export_battles.py"""

import os
import tempfile
import unittest

import export_battles as eb

HEADER = "ok,rounds,score,theirScore,survival,theirSurvival,errors"

SET_FILE = """\
# comment line, and a blank line follow

abc.Alpha 1.0 | rumble-5 | abc.Alpha_1.0.jar
xyz.Beta 2.0 | sanity | xyz.Beta_2.0.jar
"""


def _write(path, text):
    os.makedirs(os.path.dirname(path), exist_ok=True)
    with open(path, "w", encoding="utf-8") as f:
        f.write(text)


def build_work(root):
    """A fake bench work dir: two opponents, two seeds, a baseline, a short/failed
    result.csv and one battle directory for a robot outside the set."""
    battles = os.path.join(root, "battles")
    _write(os.path.join(battles, "abc.Alpha_1.0-1", "result.csv"),
           HEADER + "\n" + "true,35,100,50,10,5,\n")
    _write(os.path.join(battles, "abc.Alpha_1.0-1-baseline", "result.csv"),
           HEADER + "\n" + "true,35,80,60,8,4,\n")
    # The bench may still be writing this one: header only, no data row yet.
    _write(os.path.join(battles, "abc.Alpha_1.0-2", "result.csv"), HEADER + "\n")
    _write(os.path.join(battles, "xyz.Beta_2.0-1", "result.csv"),
           HEADER + "\n" + "true,35,30,30,20,20,\n")
    _write(os.path.join(battles, "unknown.Bot_9.0-1", "result.csv"),
           HEADER + "\n" + "true,35,10,10,10,10,\n")
    return root


class LoadSetTest(unittest.TestCase):

    def test_slugs_role_and_rank(self):
        with tempfile.TemporaryDirectory() as tmp:
            set_path = os.path.join(tmp, "set.txt")
            _write(set_path, SET_FILE)
            opponents = eb.load_set(set_path)
        self.assertEqual(opponents["abc.Alpha_1.0"], ("abc.Alpha 1.0", "rumble-5", "5"))
        self.assertEqual(opponents["xyz.Beta_2.0"], ("xyz.Beta 2.0", "sanity", ""))
        self.assertEqual(len(opponents), 2)


class DirRegexTest(unittest.TestCase):

    def test_splits_slug_with_dots_and_digits_from_seed_and_baseline(self):
        m = eb.DIR_RE.match("abc.Alpha_1.0-2")
        self.assertEqual((m.group("slug"), m.group("seed"), m.group("baseline")),
                          ("abc.Alpha_1.0", "2", None))
        m = eb.DIR_RE.match("abc.Alpha_1.0-2-baseline")
        self.assertEqual((m.group("slug"), m.group("seed"), m.group("baseline")),
                          ("abc.Alpha_1.0", "2", "-baseline"))


class CollectTest(unittest.TestCase):

    def setUp(self):
        self.tmp = tempfile.TemporaryDirectory()
        self.addCleanup(self.tmp.cleanup)
        self.work = build_work(os.path.join(self.tmp.name, "work"))
        self.set_file = os.path.join(self.tmp.name, "set.txt")
        _write(self.set_file, SET_FILE)

    def collect(self, baseline_build="", share=False):
        return eb.collect(self.work, self.set_file, "3.8", baseline_build, share)

    def test_row_count_and_unmatched_directory(self):
        columns, rows, candidates, baselines, unmatched = self.collect()
        self.assertEqual(len(rows), 3, "the baseline is skipped without --baseline-build")
        self.assertEqual((candidates, baselines), (3, 0))
        self.assertEqual(unmatched, ["unknown.Bot_9.0-1"])

    def test_column_header(self):
        columns, _, _, _, _ = self.collect()
        self.assertEqual(columns, ["build", "opponent", "role", "rank", "seed"] + HEADER.split(","))

    def test_slug_maps_back_to_opponent_name_and_role(self):
        _, rows, _, _, _ = self.collect()
        alpha_seed1 = rows[0]
        self.assertEqual(alpha_seed1["opponent"], "abc.Alpha 1.0")
        self.assertEqual(alpha_seed1["role"], "rumble-5")

    def test_rank_extracted_from_rumble_role_and_blank_otherwise(self):
        _, rows, _, _, _ = self.collect()
        by_opponent_seed = {(r["opponent"], r["seed"]): r["rank"] for r in rows}
        self.assertEqual(by_opponent_seed[("abc.Alpha 1.0", "1")], "5")
        self.assertEqual(by_opponent_seed[("xyz.Beta 2.0", "1")], "")

    def test_failed_short_result_csv_becomes_ok_false_with_blank_fields(self):
        _, rows, _, _, _ = self.collect()
        failed = [r for r in rows if r["opponent"] == "abc.Alpha 1.0" and r["seed"] == "2"][0]
        self.assertEqual(failed["ok"], "false")
        self.assertEqual((failed["rounds"], failed["score"], failed["errors"]), ("", "", ""))

    def test_ordering_is_build_then_rank_unranked_last_then_seed(self):
        _, rows, _, _, _ = self.collect(baseline_build="3.7")
        got = [(r["build"], r["opponent"], r["seed"]) for r in rows]
        self.assertEqual(got, [
            ("3.8", "abc.Alpha 1.0", "1"),
            ("3.8", "abc.Alpha 1.0", "2"),
            ("3.8", "xyz.Beta 2.0", "1"),
            ("3.7", "abc.Alpha 1.0", "1"),
        ])

    def test_baseline_build_included_when_given(self):
        _, rows, candidates, baselines, _ = self.collect(baseline_build="3.7")
        self.assertEqual((candidates, baselines), (3, 1))
        baseline_row = [r for r in rows if r["build"] == "3.7"][0]
        self.assertEqual((baseline_row["score"], baseline_row["theirScore"]), ("80", "60"))

    def test_share_columns(self):
        columns, rows, _, _, _ = self.collect(share=True)
        self.assertEqual(columns[-2:], ["score_share", "survival_share"])
        alpha_seed1 = [r for r in rows if r["opponent"] == "abc.Alpha 1.0" and r["seed"] == "1"][0]
        self.assertEqual(alpha_seed1["score_share"], "0.6667")
        self.assertEqual(alpha_seed1["survival_share"], "0.6667")
        beta_seed1 = [r for r in rows if r["opponent"] == "xyz.Beta 2.0"][0]
        self.assertEqual(beta_seed1["score_share"], "0.5000")
        failed = [r for r in rows if r["opponent"] == "abc.Alpha 1.0" and r["seed"] == "2"][0]
        self.assertEqual((failed["score_share"], failed["survival_share"]), ("", ""))


class WriteTsvTest(unittest.TestCase):

    def test_writes_tab_separated_rows_with_lf_endings(self):
        with tempfile.TemporaryDirectory() as tmp:
            work = build_work(os.path.join(tmp, "work"))
            set_file = os.path.join(tmp, "set.txt")
            _write(set_file, SET_FILE)
            columns, rows, _, _, _ = eb.collect(work, set_file, "3.8", "", False)
            out = os.path.join(tmp, "out.tsv")
            eb.write_tsv(out, columns, rows)
            with open(out, "rb") as f:
                content = f.read()
        self.assertNotIn(b"\r\n", content)
        first_line = content.decode("utf-8").splitlines()[0]
        self.assertEqual(first_line.split("\t"), columns)


class FallbackHeaderTest(unittest.TestCase):

    def test_trust_columns_follow_errors_at_the_end(self):
        header = eb.FALLBACK_HEADER
        self.assertEqual(header[50], "errors")
        self.assertEqual(header[51:], ["duressTicks", "engineDisables", "securityErrors",
                                       "rShortfall", "finalRMissing"])
        self.assertEqual(len(header), 56)


ROUNDS_HEADER = "build\topponent\tseed\tround\twon\tsurvived\tticks\tdamageDealt\tdamageTaken\thitRate\tduressTicks\tskips"


def _rounds_text(*rows):
    return ROUNDS_HEADER + "\n" + "".join(r + "\n" for r in rows)


class CollectRoundsTest(unittest.TestCase):

    def setUp(self):
        self.tmp = tempfile.TemporaryDirectory()
        self.addCleanup(self.tmp.cleanup)
        self.work = build_work(os.path.join(self.tmp.name, "work"))
        self.set_file = os.path.join(self.tmp.name, "set.txt")
        _write(self.set_file, SET_FILE)
        battles = os.path.join(self.work, "battles")
        _write(os.path.join(battles, "abc.Alpha_1.0-1", "rounds.tsv"), _rounds_text(
            "x\tx\t1\t2\t0\t0\t900\t10.0\t30.0\t0.1000\t0\t0",
            "x\tx\t1\t1\t1\t1\t800\t40.0\t5.0\t0.2000\t0\t1"))
        _write(os.path.join(battles, "abc.Alpha_1.0-1-baseline", "rounds.tsv"), _rounds_text(
            "x\tx\t1\t1\t0\t0\t700\t1.0\t2.0\t\t0\t0"))
        _write(os.path.join(battles, "unknown.Bot_9.0-1", "rounds.tsv"), _rounds_text(
            "x\tx\t1\t1\t1\t1\t700\t1.0\t2.0\t\t0\t0"))

    def test_labels_come_from_directory_and_set_file(self):
        columns, rows = eb.collect_rounds(self.work, self.set_file, "3.8", "")
        self.assertEqual(columns[:6], ["build", "opponent", "role", "rank", "seed", "round"])
        self.assertEqual(len(rows), 2, "baseline skipped without a label, unknown opponent skipped")
        self.assertEqual((rows[0]["build"], rows[0]["opponent"], rows[0]["role"], rows[0]["rank"]),
                         ("3.8", "abc.Alpha 1.0", "rumble-5", "5"))

    def test_rows_sorted_by_round_within_battle(self):
        _, rows = eb.collect_rounds(self.work, self.set_file, "3.8", "")
        self.assertEqual([r["round"] for r in rows], ["1", "2"])
        self.assertEqual(rows[0]["damageDealt"], "40.0")

    def test_baseline_rows_follow_the_candidate_when_labelled(self):
        _, rows = eb.collect_rounds(self.work, self.set_file, "3.8", "3.7")
        self.assertEqual([r["build"] for r in rows], ["3.8", "3.8", "3.7"])

    def test_no_rounds_files_gives_no_rows(self):
        with tempfile.TemporaryDirectory() as tmp:
            work = build_work(os.path.join(tmp, "work"))
            columns, rows = eb.collect_rounds(work, self.set_file, "3.8", "")
        self.assertEqual(rows, [])
        self.assertEqual(columns, ["build", "opponent", "role", "rank", "seed"])


if __name__ == "__main__":
    unittest.main()
