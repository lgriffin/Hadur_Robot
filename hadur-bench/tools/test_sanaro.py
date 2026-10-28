"""Tests for Sanaro's bench tools: tools/sanaro_fields.py and tools/sanaro_read.py (docs/sanaro.md)."""
import csv
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import deise_fields  # noqa: E402
import sanaro_fields  # noqa: E402
import sanaro_read  # noqa: E402

sys.path.insert(0, os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", "..", "sanaro"))
import table  # noqa: E402

Q = "d414.nano.Quantum 1.0.0"
NS = "sheldor.melee.nano.NaturalScience 1.2.1"


def battle(path, rows):
    os.makedirs(path, exist_ok=True)
    with open(os.path.join(path, "melee.csv"), "w", newline="", encoding="utf-8") as f:
        w = csv.writer(f)
        w.writerow(["rank", "robot", "score", "firsts", "survival", "bulletDamage"])
        for i, (name, score, firsts, survival) in enumerate(rows, 1):
            w.writerow([i, name, score, firsts, survival, 0])


class SanaroFieldsTest(unittest.TestCase):
    def setUp(self):
        self.root = tempfile.mkdtemp()
        self.field = os.path.join(self.root, "nanomelee-field.txt")
        with open(self.field, "w", encoding="utf-8") as f:
            f.write("# header\n")
            for i in range(1, 18):
                f.write("nano.R%d 1 | nanomelee-%d | nano.R%d_1.jar\n" % (i, i, i))

    def test_every_field_holds_both_leaders_and_seven_others(self):
        n = sanaro_fields.write(self.field, 1, 117, self.root)
        self.assertEqual(n, 3)  # 15 others: two full deals and one topped up
        seen = set()
        for i in range(1, n + 1):
            lines = sanaro_fields.set_lines(os.path.join(self.root, "nanomelee-census", "f%02d.txt" % i))
            names = [l.split("|")[0].strip() for l in lines]
            self.assertEqual(names[:2], ["nano.R1 1", "nano.R2 1"])
            self.assertEqual(len(set(names)), 9)
            seen |= set(names[2:])
        self.assertEqual(len(seen), 15, "every robot below the leaders plays")

    def test_the_duel_suite_has_one_field_per_leader(self):
        sanaro_fields.write(self.field, 1, 117, self.root)
        with open(os.path.join(self.root, "nanomelee-duel.txt"), encoding="utf-8") as f:
            suite = [l for l in f if not l.startswith("#")]
        self.assertEqual(len(suite), 2)
        self.assertIn("--set nanomelee-census/duel-1.txt --melee true --field 1000x1000", suite[0])

    def test_deise_fields_keeps_minimelee_by_default_and_names_nanomelee(self):
        robots = [{"rank": 1, "name": "a.B 1"}]
        self.assertIn("a.B 1 | minimelee-1 | a.B_1.jar", deise_fields.lines(robots, "x.tsv"))
        self.assertIn("a.B 1 | nanomelee-1 | a.B_1.jar", deise_fields.lines(robots, "x.tsv", "nanomelee"))


class SanaroReadTest(unittest.TestCase):
    def setUp(self):
        self.root = tempfile.mkdtemp()
        for arm, mine in (("S10", 300), ("S0", 200)):
            for f, seed in (("F01", 1), ("F01", 2), ("F02", 1)):
                battle(os.path.join(self.root, "census-" + arm, f, "battles", "melee-%d" % seed),
                       [("hadur117.nano.Sanaro%s 0.1" % arm, mine, 10, 900), (Q, 200, 15, 1000),
                        (NS, 100, 5, 500), ("nano.X 1", 100, 5, 400)])
        battle(os.path.join(self.root, "duel-S10", "D1", "battles", "melee-1"),
               [("hadur117.nano.SanaroS10 0.1", 300, 21, 0), (Q, 200, 14, 0)])
        self.only = {Q, NS, "nano.X 1"}

    def test_aps_against_the_control_and_the_leaders_in_the_same_battles(self):
        rows = {r["arm"]: r for r in sanaro_read.read(self.root, ["S10", "S0"], "S0", self.only)}
        s10 = rows["S10"]
        # 300 against 200, 100 and 100: (60 + 75 + 75) / 3
        self.assertAlmostEqual(s10["aps"], 70.0)
        # saor_gates rounds each opponent's mean to 0.01: 50, 66.67, 66.67
        self.assertAlmostEqual(rows["S0"]["aps"], (50 + 66.67 + 66.67) / 3)
        self.assertAlmostEqual(s10["diff"], 70.0 - 550 / 9, places=6)
        q = s10["leaders"][Q]
        self.assertAlmostEqual(q["aps"], (40 + 200 / 3 + 200 / 3) / 3)
        self.assertAlmostEqual(q["margin"], 70.0 - q["aps"])
        self.assertEqual(q["outsurvived"], 0.0)
        self.assertEqual(s10["leaders"][NS]["outsurvived"], 100.0)
        self.assertAlmostEqual(s10["duel"][Q], 60.0)
        self.assertNotIn("duel", rows["S0"])

    def test_render_names_every_arm(self):
        text = sanaro_read.render(sanaro_read.read(self.root, ["S10", "S0"], "S0", self.only), "S0", "census")
        self.assertIn("| S10 | 3 | 3 | 70.00", text)
        self.assertIn("| S0 |", text)


class SanaroTableArmsTest(unittest.TestCase):
    def test_the_defaults_are_the_shipped_curve(self):
        self.assertEqual(table.base(0), 0.1)
        self.assertEqual(table.base(32), 2.1)
        self.assertEqual(table.base(119), 2.5)
        self.assertEqual(table.base(120), 3.0)

    def test_a_power_arm_rewrites_only_the_named_source(self):
        src = os.path.join(tempfile.mkdtemp(), "SanaroQ7.java")
        with open(src, "w", encoding="utf-8") as f:
            f.write('class SanaroQ7 {\n    static final String POWER = "";\n}\n')
        table.main(["--floor", "0", "--div", "7", "--src", src])
        with open(src, encoding="utf-8") as f:
            text = f.read()
        cells = text.split('"')[1].split("\\")[1:]
        self.assertEqual(len(cells), 400 * 128 + 401)
        # own energy 14, enemy 100: 14 / 7 = 2.0, 80 fortieths
        self.assertEqual(int(cells[14 * 128 + 100], 8), 80)
        self.assertEqual(text.count("class SanaroQ7"), 1)


if __name__ == "__main__":
    unittest.main()
