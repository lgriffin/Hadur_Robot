"""Tests for live_passes.py (issue #151): python test_live_passes.py

BENCH-80 (drift), BENCH-81 (collapses), BENCH-82 (classify). LiveToolsTest.java runs each class
from the Maven build, which is where the IDs are traced.
"""

import os
import tempfile
import unittest

import analyse as an
import live_passes as lp

HERE = os.path.dirname(os.path.abspath(__file__))
PARSED = os.path.join(HERE, "..", "rumble", "parsed")
PAGE_39 = os.path.join(PARSED, "2026-10-07T2028Z_roborumble_botdetails_hadur2.Hadur_3.9.csv")
PAGE_310 = os.path.join(PARSED, "2026-10-08T1238Z_roborumble_botdetails_hadur2.Hadur_3.10.csv")
SHIELD_JAVA = os.path.join(HERE, "..", "..", "hadur-robot", "src", "main", "java", "hadur2", "ShieldListData.java")


def page(rows):
    """rows: (name, aps, survival, battles, opponent_aps[, time]) -> the dict read_page returns."""
    return {r[0]: dict(aps=r[1], survival=r[2], battles=r[3], opponent_aps=r[4],
                       time=r[5] if len(r) > 5 else "2026-10-08 10:00:00") for r in rows}


class DriftTest(unittest.TestCase):
    """BENCH-80: two passes compared off the opponents the change touched."""

    def test_splits_changed_from_unchanged(self):
        old = page([("a 1", 80, 90, 1, 50), ("b 1", 70, 80, 1, 40), ("c 1", 60, 70, 1, 30)])
        new = page([("a 1", 78, 88, 1, 50), ("b 1", 66, 78, 1, 40), ("c 1", 75, 85, 1, 30)])
        d = lp.drift(new, old, changed=["c 1"])
        self.assertEqual(d["unchanged"]["pairings"], 2)
        self.assertAlmostEqual(d["unchanged"]["mean"], -3.0)
        self.assertAlmostEqual(d["changed"]["mean"], 15.0)
        # APS contribution is the sum over the new page's pairings.
        self.assertAlmostEqual(d["unchanged"]["aps"], -6.0 / 3)
        self.assertEqual(d["unchanged"]["down5"], 0)

    def test_3_10_against_3_9_on_the_saved_pages(self):
        # 3.10 is 3.9 plus shield-list entries, so off the list the robot is the same, yet the
        # live pass reads 1.35 a pairing lower (docs/bench/live-3.10.md).
        d = lp.drift(lp.read_page(PAGE_310), lp.read_page(PAGE_39), lp.shield_entries(SHIELD_JAVA))
        self.assertEqual(d["unchanged"]["pairings"] + d["changed"]["pairings"], 1215)
        self.assertEqual(d["changed"]["pairings"], 97)
        self.assertAlmostEqual(d["unchanged"]["mean"], -1.35, places=2)
        self.assertAlmostEqual(d["changed"]["aps"], 0.51, places=2)

    def test_shield_entries_skip_the_class_doc(self):
        entries = lp.shield_entries(SHIELD_JAVA)
        self.assertEqual(len(entries), 97)
        self.assertNotIn("package.Class 1.2", entries)
        self.assertIn("apv.test.Virus 0.6.1", entries)


class CollapsesTest(unittest.TestCase):
    """BENCH-81: single-battle pairings far under the other passes' median."""

    def test_counts_only_single_battles_under_the_others(self):
        pages = {
            "1": page([("a 1", 90, 99, 1, 50), ("b 1", 90, 99, 1, 50)]),
            "2": page([("a 1", 91, 99, 1, 50), ("b 1", 70, 80, 2, 50)]),
            "3": page([("a 1", 60, 70, 1, 50), ("b 1", 60, 70, 2, 50)]),
        }
        c = lp.collapses(pages, below=12)
        self.assertEqual([n for _, n, _ in c["3"]["collapses"]], ["a 1"])  # b is two battles
        self.assertEqual(c["1"]["collapses"], [])
        self.assertEqual(c["3"]["singles"], 1)

    def test_one_page_is_an_error_not_a_crash(self):
        with self.assertRaises(ValueError):
            lp.collapses({"1": page([("a 1", 90, 99, 1, 50)])})
        with self.assertRaises(SystemExit):
            lp.main(["collapses", PAGE_310])


class LabelTest(unittest.TestCase):
    """Pages and peers keep their identity: two pages of one version, two versions of one peer."""

    def test_two_pages_of_one_version_both_survive(self):
        a = "2026-09-30T1146Z_roborumble_botdetails_hadur2.Hadur_3.1.csv"
        b = "2026-09-30T1443Z_roborumble_botdetails_hadur2.Hadur_3.1.csv"
        c = "2026-10-08T1238Z_roborumble_botdetails_hadur2.Hadur_3.10.csv"
        labels = lp.page_labels([a, b, c])
        self.assertEqual([labels[x] for x in (a, b, c)], ["3.1@2026-09-30T1146Z", "3.1@2026-09-30T1443Z", "3.10"])
        self.assertEqual(labels[c], "3.10")

    def test_peer_keeps_its_version(self):
        self.assertEqual(lp.peer_of("2026-10-07T2046Z_roborumble_botcompare_Knight_0.6.28_vs_hadur2.Hadur_3.9.csv"),
                         "Knight_0.6.28")


class ClassifyTest(unittest.TestCase):
    """BENCH-82: one row per opponent with tier, tags and the room at the peers' median."""

    def test_tiers_tags_and_room(self):
        pages = {
            "3.8": page([("rammer.R 1", 70, 99, 1, 40), ("pm.P 1", 95, 100, 1, 30), ("top.T 1", 30, 30, 1, 90)]),
            "3.9": page([("rammer.R 1", 72, 98, 1, 40), ("pm.P 1", 96, 100, 1, 30), ("top.T 1", 32, 30, 1, 90)]),
            "3.10": page([("rammer.R 1", 74, 97, 1, 40), ("pm.P 1", 60, 70, 1, 30), ("top.T 1", 34, 30, 1, 90)]),
        }
        peers = {"Knight": {"rammer.R 1": 85.0, "pm.P 1": 97.0, "top.T 1": 30.0}}
        bench = {"rammer.R 1": dict(share=[73.0, 75.0], survival=[100.0], ram=[200.0, 180.0], skipped=[3, 5])}
        rows = {r["name"]: r for r in lp.classify(pages, peers, bench, {"leak": {"rammer.R 1"}}, [])}
        r = rows["rammer.R 1"]
        self.assertEqual(r["tier"], "mid")
        self.assertEqual(r["kind"], "rammer")
        self.assertIn("LEAK", r["tags"])
        self.assertIn("PEERGAP", r["tags"])       # 85 against a typical 72
        self.assertIn("BENCHSEES", r["tags"])     # the bench is 11 under the peers too
        self.assertEqual(r["sets"], ["leak"])
        self.assertAlmostEqual(r["aps"], 73.0)     # pooled over the newest two passes
        p = rows["pm.P 1"]
        self.assertIn("VOLATILE", p["tags"])       # one bad pass: spread 36 and a collapse
        self.assertNotIn("PEERGAP", p["tags"])     # typical 95 is within 5 of the peers
        self.assertEqual(rows["top.T 1"]["tier"], "loss")
        s = lp.summarise(list(rows.values()))
        self.assertAlmostEqual(s["total_room"], ((85 - 73) + (97 - 78) + (30 - 33)) / 3)

    def test_a_listed_bot_counts_only_the_newest_pass(self):
        pages = {"3.9": page([("x.X 1", 70, 90, 1, 50)]), "3.10": page([("x.X 1", 90, 99, 1, 50)])}
        r = lp.classify(pages, {}, {}, {}, ["x.X 1"])[0]
        self.assertEqual(r["aps"], 90)
        self.assertTrue(r["shield"])

    def test_writes_the_table(self):
        pages = {"3.9": page([("x.X 1", 70, 90, 1, 50)]), "3.10": page([("x.X 1", 72, 91, 1, 50)])}
        rows = lp.classify(pages, {"Knight": {"x.X 1": 80.0}}, {}, {}, [])
        with tempfile.TemporaryDirectory() as d:
            out = os.path.join(d, "t.tsv")
            lp.write_tsv(rows, ["3.9", "3.10"], ["Knight"], out)
            with open(out, encoding="utf-8") as f:
                lines = f.read().splitlines()
        self.assertEqual(len(lines), 2)
        self.assertTrue(lines[0].startswith("rank\tname\topponent_aps\ttier"))
        self.assertIn("\t+9.00\t", lines[1])


class HostDenialTest(unittest.TestCase):
    """BENCH-84 on the Python side: a JDK resource denied to a robot makes the row untrusted."""

    def test_denial_is_untrusted(self):
        denial = ('Preventing pez.frankie.Frankie 0.9.6.1 from access: ("java.io.FilePermission" '
                  '"D:\\code\\Hadur_Robot\\hadur-bench\\target\\classes\\META-INF\\services\\'
                  'java.time.zone.ZoneRulesProvider" "read").')
        row = dict(rounds="35", roundRecords="35", skippedTurns="10", duressTicks="0", errors=denial)
        self.assertEqual(an.untrusted_reasons(row), ["JDK resource denied"])
        row["errors"] = 'Preventing x.Y 1 from access: ("java.io.FilePermission" "C:\\x.txt" "write").'
        self.assertEqual(an.untrusted_reasons(row), [])

    def test_bench_rows_skip_untrusted_rows(self):
        head = "build\topponent\tok\tscore_share\tsurvival_share\ttheirRamDamage\tskippedTurns\trounds\troundRecords\tduressTicks\terrors"
        good = "hadur2.Hadur 3.10\tx.X 1\ttrue\t0.8\t0.9\t0\t3\t35\t35\t0\t"
        denied = ("hadur2.Hadur 3.10\tx.X 1\ttrue\t0.99\t1.0\t0\t3\t35\t35\t0\t"
                  'Preventing x.X 1 from access: ("java.io.FilePermission" "C:\\b\\META-INF\\services\\z" "read").')
        duress = "hadur2.Hadur 3.10\tx.X 1\ttrue\t0.5\t0.5\t0\t3\t35\t35\t4\t"
        with tempfile.TemporaryDirectory() as d:
            path = os.path.join(d, "b.tsv")
            with open(path, "w", encoding="utf-8") as f:
                f.write("\n".join([head, good, denied, duress]) + "\n")
            rows = lp.bench_rows([path], {"hadur2.Hadur 3.10"})
        self.assertEqual(rows["x.X 1"]["share"], [80.0])


if __name__ == "__main__":
    unittest.main()
