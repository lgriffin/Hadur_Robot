"""Tests for tools/twin_table.py, TwinSaor's mode table writer (TWIN-13)."""
import os
import sys
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import twin_table  # noqa: E402

HERE = os.path.dirname(os.path.abspath(__file__))


class TwinTableTest(unittest.TestCase):
    def test_a_shared_slot_holds_the_and_and_each_team_reads_its_mode(self):
        rows = [("t1", "a", 5, 0), ("t1", "b", 6, 0), ("t2", "c", 6, 0), ("t2", "d", 7, 0)]
        entries, wrong = twin_table.table(rows, {"t1": 1, "t2": 2})
        self.assertEqual(entries[5], 1)
        self.assertEqual(entries[6], 0)  # 1 & 2
        self.assertEqual(entries[7], 2)
        self.assertEqual(wrong, [])

    def test_a_team_with_every_slot_shared_is_caught(self):
        rows = [("t1", "a", 5, 0), ("t2", "c", 5, 0)]
        _, wrong = twin_table.table(rows, {"t1": 1})
        self.assertEqual(wrong, ["t1"])

    def test_the_literal_is_octal_escapes(self):
        self.assertEqual(twin_table.literal([0, 1, 2]), '"\\0\\1\\2"')

    def test_the_shipped_table_matches_the_robot(self):
        rows = twin_table.names(os.path.join(HERE, "..", "twin-arms", "names.tsv"))
        modes = twin_table.picks(os.path.join(HERE, "..", "twin-arms", "picks-0.2.tsv"))
        entries, wrong = twin_table.table(rows, modes)
        self.assertEqual(wrong, [])
        src = os.path.join(HERE, "..", "..", "twinsaor", "src", "main", "java", "hadur117", "twin", "SaorTwin.java")
        with open(src, encoding="utf-8") as f:
            self.assertIn("MODES = " + twin_table.literal(entries) + ";", f.read())


if __name__ == "__main__":
    unittest.main()
