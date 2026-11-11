"""Tests for field_ledger.py: the 1v1 field ledger joined from the name ledger, a trace read and the shipped tables."""

import csv
import os
import tempfile
import unittest

import field_ledger

HEAD = "name\tbattles\thadur\tbb\tds\tsg\tsr\tns\tdm\tjh\tog\tbest\tbest_rival\tgap\tsecond_gap\taps\n"


def names_row(name, hadur, bb, others=90.0):
    return "%s\t3\t%.1f\t%.1f\t%s\t%.1f\tbb\t0\t0\t0\n" % (name, hadur, bb, "\t".join(["%.1f" % others] * 7), max(bb, others))


class FieldLedgerTest(unittest.TestCase):
    def setUp(self):
        self.d = tempfile.mkdtemp()

    def write(self, name, text):
        p = os.path.join(self.d, name)
        with open(p, "w", encoding="utf-8") as f:
            f.write(text)
        return p

    def test_routes_statuses_and_classes(self):
        names = self.write("names.tsv", HEAD + names_row("a.Ram 1.0", 70.0, 85.0) + names_row("b.Mid x 2", 88.0, 92.0)
                           + names_row("c.Low 1", 95.0, 97.0) + names_row("d.Level 1", 99.0, 99.2)
                           + names_row("e.Ahead 1", 99.0, 95.0) + names_row("f.NoTrace 1", 90.0, 93.0))
        trace = self.write("trace.md", "# read\n\n## Per opponent, bb minus c (seeds both fought)\n\n"
                           "| opponent | band | seeds | hit rate c | hit rate bb | diff | aimed/round c | bb | dmg/round c | bb |\n"
                           "|---|---|---|---|---|---|---|---|---|---|\n"
                           "| a.Ram_1.0 | 5 | 1 | 0.300 | 0.100 | -0.2 | 30 | 30 | 40.0 | 12.0 |\n"
                           "| b.Mid_x_2 | 3 | 1 | 0.070 | 0.040 | -0.03 | 30 | 30 | 16.0 | 10.0 |\n"
                           "| c.Low_1 | 6 | 1 | 0.020 | 0.020 | 0 | 30 | 30 | 3.0 | 3.0 |\n"
                           "| d.Level_1 | 6 | 1 | 0.200 | 0.200 | 0 | 30 | 30 | 3.0 | 3.0 |\n"
                           "| e.Ahead_1 | 6 | 1 | 0.060 | 0.090 | 0 | 30 | 30 | 3.0 | 3.0 |\n\n## By rank band\n\n| 1 | 2 |\n")
        tables = self.write("T.java", 'class T {\n    static String[] stopGos() {\n        return new String[] {\n'
                            '            "a.Ram 1.0",\n        };\n    }\n    static String[] surfKeys() {\n        return new String[] {\n'
                            '            "1.2 0.5 1 b.Mid x 2",\n            "1 1 1 a.Ram 1.0",\n        };\n    }\n}\n')
        shield = self.write("S.java", 'class S {\n    static String[] lines() {\n        return new String[] {\n            "c.Low 1",\n        };\n    }\n}\n')
        rows = {r["name"]: r for r in field_ledger.build(names, trace, tables, shield)}
        self.assertEqual(("R1 rebuild", "lever", "stopGos,surfKeys", "close"),
                         tuple(rows["a.Ram 1.0"][k] for k in ("route", "status", "levers", "cls")), "a gap of 15 is a rebuild")
        self.assertEqual(("R3 keys", "surfkey", "mid", 3), tuple(rows["b.Mid x 2"][k] for k in ("route", "status", "cls", "band")),
                         "a name with a space finds its slug and its key line")
        self.assertEqual(("R4 portfolio", "shield", "low"), tuple(rows["c.Low 1"][k] for k in ("route", "status", "cls")))
        self.assertEqual("R5 hold", rows["d.Level 1"]["route"], "a gap under 0.5 is held whatever the class")
        self.assertEqual(("R5 hold", -4.0), (rows["e.Ahead 1"]["route"], rows["e.Ahead 1"]["gap_bb"]))
        self.assertEqual(("R4 portfolio", "-", "untouched", ""), tuple(rows["f.NoTrace 1"][k] for k in ("route", "cls", "status", "hit_us")))
        self.assertAlmostEqual(15.0 / 6, rows["a.Ram 1.0"]["aps_bb"], places=3)
        # A trace that is not a per-opponent read of this field writes no ledger.
        empty = self.write("empty.md", "# read\n\nnothing here\n")
        with self.assertRaises(SystemExit) as cm:
            field_ledger.build(names, empty, tables, shield)
        self.assertIn("0 of 6 robots", str(cm.exception.code))
        out = os.path.join(self.d, "out.tsv")
        field_ledger.main(["--names", names, "--trace", trace, "--tables", tables, "--shield", shield, "--out", out])
        with open(out, encoding="utf-8") as f:
            written = list(csv.DictReader(f, delimiter="\t"))
        self.assertEqual(field_ledger.COLUMNS, list(written[0].keys()))
        self.assertEqual(["a.Ram 1.0", "b.Mid x 2", "f.NoTrace 1", "c.Low 1", "d.Level 1", "e.Ahead 1"], [r["name"] for r in written],
                         "largest gap to BeepBoop first")


if __name__ == "__main__":
    unittest.main()
