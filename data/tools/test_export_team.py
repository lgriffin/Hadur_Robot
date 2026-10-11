"""Tests for export_team.py: python test_export_team.py"""

import os
import tempfile
import unittest

import export_team as et

SET_FILE = """\
# comment line, and a blank line follow

abc.Alpha 1.0 | team-3 | abc.Alpha_1.0.jar
xyz.Beta 2.0 | team-7 | xyz.Beta_2.0.jar
"""

TEAM_HEADER = "rank,team,score,firsts,survival,bulletDamage"
ROUNDS_HEADER = "round,membersAlive,enemiesAlive,won,shots,shotsWithMateInLane,countBelowTruth,countReports,bulletsOnMates"


def _write(path, text):
    os.makedirs(os.path.dirname(path), exist_ok=True)
    with open(path, "w", encoding="utf-8") as f:
        f.write(text)


def r_record(duress):
    return ",".join(["R"] + ["0"] * 32 + [str(duress)])


def battle(root, name, ours, theirs, rounds, logs=(), team="hadur2.HadurTeam 3.8"):
    """One battle directory. ours and theirs are (score, firsts, survival, bulletDamage);
    rounds are the rounds.csv data rows; logs are the lines of member-0.log."""
    d = os.path.join(root, "battles", name)
    _write(os.path.join(d, "team.csv"), "\n".join([
        TEAM_HEADER,
        "1,%s (1),%d,%d,%d,%d" % ((team,) + ours),
        "2,abc.Alpha 1.0 (2),%d,%d,%d,%d" % theirs, ""]))
    _write(os.path.join(d, "rounds.csv"), "\n".join([ROUNDS_HEADER] + list(rounds)) + "\n")
    _write(os.path.join(d, "member-0.log"), "\n".join(logs) + "\n")
    return d


def build_work(root):
    """Two opponents, a candidate and a baseline battle, one battle that never wrote its standings,
    and a directory for a team outside the set."""
    battle(root, "abc.Alpha_1.0-1", (3000, 2, 1000, 400), (1000, 0, 500, 200), [
        "0,2,1,1,100,10,1,20,3,0.5000",
        "1,0,2,0,60,5,0,10,1,-",
    ], logs=[
        "0,5,SYSTEM: Hadur 3.8 (1) skipped turn 4",
        "0,6,SYSTEM: Hadur 3.8 (1) skipped turn 5",
        "0,9,SYSTEM: Bonus for killing abc.Alpha 1.0 (2): 10",
        "1,7," + r_record(12),
        "1,8," + r_record(30),
        "1,9,R,0,0,loss",
        "1,9,FAULT,x",
        "1,9,LINK,y",
    ])
    battle(root, "abc.Alpha_1.0-1-baseline", (1000, 0, 200, 100), (3000, 2, 900, 300), [
        "0,0,2,0,40,4,0,8",
    ], team="hadur2.HadurTeam 3.7")
    _write(os.path.join(root, "battles", "abc.Alpha_1.0-2", "engine.log"), "crashed\n")
    battle(root, "xyz.Beta_2.0-1", (500, 1, 100, 50), (500, 1, 100, 50), ["0,1,1,1,10,0,0,1,0,0.2500"])
    battle(root, "unknown.Bot_9.0-1", (1, 0, 0, 0), (1, 0, 0, 0), ["0,1,1,1,1,0,0,0,0"])
    return root


class LoadSetTest(unittest.TestCase):

    def test_slugs_role_and_rank(self):
        with tempfile.TemporaryDirectory() as tmp:
            path = os.path.join(tmp, "set.txt")
            _write(path, SET_FILE)
            opponents = et.load_set(path)
        self.assertEqual(opponents["abc.Alpha_1.0"], ("abc.Alpha 1.0", "team-3", "3"))
        self.assertEqual(len(opponents), 2)


class CollectTest(unittest.TestCase):

    def setUp(self):
        self.tmp = tempfile.TemporaryDirectory()
        self.addCleanup(self.tmp.cleanup)
        self.work = build_work(os.path.join(self.tmp.name, "work"))
        self.set_file = os.path.join(self.tmp.name, "set.txt")
        _write(self.set_file, SET_FILE)

    def collect(self, baseline_build=""):
        return et.collect(self.work, self.set_file, "3.8", baseline_build, "hadur2.HadurTeam")

    def row(self, rows, build, opponent, seed):
        return [r for r in rows if (r["build"], r["opponent"], r["seed"]) == (build, opponent, seed)][0]

    def test_row_count_and_unmatched_directory(self):
        rows, unmatched = self.collect()
        self.assertEqual(len(rows), 3, "the baseline is skipped without --baseline-build")
        self.assertEqual(unmatched, ["unknown.Bot_9.0-1"])
        self.assertEqual(len(self.collect("3.7")[0]), 4)

    def test_a_finished_battle(self):
        rows, _ = self.collect("3.7")
        r = self.row(rows, "3.8", "abc.Alpha 1.0", "1")
        self.assertEqual((r["ok"], r["rounds"], r["role"], r["rank"]), ("true", "2", "team-3", "3"))
        self.assertEqual((r["score"], r["theirScore"], r["score_share"]), ("3000", "1000", "0.7500"))
        self.assertEqual((r["firsts"], r["theirFirsts"], r["survival"], r["theirSurvival"]), ("2", "0", "1000", "500"))
        self.assertEqual((r["bulletDamage"], r["theirBulletDamage"]), ("400", "200"))
        self.assertEqual((r["roundsWon"], r["roundsSurvived"]), ("1", "1"))
        self.assertEqual((r["shots"], r["shotsWithMateInLane"], r["bulletsOnMates"]), ("160", "15", "4"))
        self.assertEqual((r["countBelowTruth"], r["countReports"]), ("1", "30"))
        self.assertEqual(r["focusFireRatio"], "0.5000", "a dash round carries no ratio")

    def test_member_logs_give_skipped_turns_duress_faults_and_link_rejects(self):
        rows, _ = self.collect("3.7")
        r = self.row(rows, "3.8", "abc.Alpha 1.0", "1")
        self.assertEqual((r["skippedTurns"], r["duressTicks"], r["faults"], r["linkRejects"]), ("2", "42", "1", "1"))

    def test_baseline_row_is_ours_and_old_rounds_file_has_no_focus(self):
        rows, _ = self.collect("3.7")
        r = self.row(rows, "3.7", "abc.Alpha 1.0", "1")
        self.assertEqual((r["score"], r["theirScore"], r["score_share"]), ("1000", "3000", "0.2500"))
        self.assertEqual((r["bulletsOnMates"], r["focusFireRatio"]), ("0", ""))

    def test_battle_without_standings_is_ok_false_and_blank(self):
        rows, _ = self.collect("3.7")
        r = self.row(rows, "3.8", "abc.Alpha 1.0", "2")
        self.assertEqual((r["ok"], r["rounds"], r["score"], r["score_share"]), ("false", "", "", ""))

    def test_ordering_is_build_then_rank_then_seed(self):
        rows, _ = self.collect("3.7")
        self.assertEqual([(r["build"], r["opponent"], r["seed"]) for r in rows], [
            ("3.8", "abc.Alpha 1.0", "1"), ("3.8", "abc.Alpha 1.0", "2"), ("3.8", "xyz.Beta 2.0", "1"),
            ("3.7", "abc.Alpha 1.0", "1")])

    def test_our_row_is_found_by_team_name_not_by_position(self):
        battle(self.work, "xyz.Beta_2.0-3", (10, 0, 0, 0), (30, 0, 0, 0), ["0,1,1,1,1,0,0,0,0"])
        d = os.path.join(self.work, "battles", "xyz.Beta_2.0-3", "team.csv")
        _write(d, "\n".join([TEAM_HEADER, "1,xyz.Beta 2.0 (2),30,0,0,0", "2,hadur2.HadurTeam 3.8 (1),10,0,0,0", ""]))
        r = self.row(self.collect()[0], "3.8", "xyz.Beta 2.0", "3")
        self.assertEqual((r["score"], r["theirScore"]), ("10", "30"))

    def test_columns_are_written_as_a_tsv_with_lf_endings(self):
        rows, _ = self.collect("3.7")
        out = os.path.join(self.tmp.name, "out.tsv")
        import csv
        with open(out, "w", encoding="utf-8", newline="") as f:
            w = csv.DictWriter(f, et.COLUMNS, delimiter="\t", lineterminator="\n")
            w.writeheader()
            w.writerows(rows)
        with open(out, "rb") as f:
            content = f.read()
        self.assertNotIn(b"\r\n", content)
        self.assertEqual(content.decode("utf-8").splitlines()[0].split("\t"), et.COLUMNS)


if __name__ == "__main__":
    unittest.main()
