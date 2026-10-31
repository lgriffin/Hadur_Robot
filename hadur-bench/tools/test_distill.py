"""Tests for tools/distill.py (BENCH-156): Hadur's decisions into nano string tables."""
import csv
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import distill  # noqa: E402
import table  # noqa: E402

SRC = '''public class Bot {
    static final String POWER = "\\1\\2";
    static final String MODES = "";
    static final int MASK = 1;
}
'''


def shots(path, rows):
    with open(path, "w", newline="", encoding="utf-8") as f:
        w = csv.writer(f)
        w.writerow(["round", "turn", "alive", "ownEnergy", "target", "targetEnergy", "distance", "power"])
        for i, (alive, own, enemy, distance, power) in enumerate(rows):
            w.writerow([0, i, alive, own, "a.Alpha 1.0", enemy, distance, power])


# @Tag("BENCH-156")
class PowerTest(unittest.TestCase):
    def setUp(self):
        self.dir = tempfile.mkdtemp()
        self.src = os.path.join(self.dir, "Bot.java")
        with open(self.src, "w", encoding="utf-8") as f:
            f.write(SRC)

    def test_band_power_reads_back_to_the_middle_band(self):
        # 321-640 px: step 1, as fired; 214-320: step 2, halved; beyond 640: step 0, dropped.
        self.assertEqual(3.0, distill.band_power(400, 3.0))
        self.assertEqual(1.5, distill.band_power(300, 3.0))
        self.assertEqual(1.0, distill.band_power(200, 3.0))
        self.assertIsNone(distill.band_power(700, 3.0))

    def test_mode_ties_go_to_the_higher_power(self):
        from collections import Counter
        self.assertEqual(80, distill.mode(Counter({40: 2, 80: 2, 60: 1})))

    def test_dense_cells_hold_hadurs_choice_and_the_rest_fall_back(self):
        path = os.path.join(self.dir, "shots.csv")
        # Own 80, enemy 10, 400 px: Hadur chose 2.0 three times and 3.0 once -> 80 fortieths.
        shots(path, [(5, 80, 10, 400, 2.0)] * 3 + [(5, 80, 10, 400, 3.0)]
              # Own 80, enemy 12 at 300 px: 3.0 at step 2 reads back as 1.5 (60), three times.
              + [(5, 80, 12, 300, 3.0)] * 3
              # Two shots only: too thin for --min 3.
              + [(5, 80, 60, 400, 0.5)] * 2)
        cells = distill.observed(distill.read_shots([path]))
        values, how = distill.distil(cells, minimum=3, reach=4)
        self.assertEqual(80, values[80 * 128 + 10])
        self.assertEqual(60, values[80 * 128 + 12])
        # Enemy 11 is one cell from both 10 and 12; the lower neighbour is tried first -> 80.
        self.assertEqual(80, values[80 * 128 + 11])
        # Enemy 14 is within reach 4 of 12 -> 60; enemy 17 is not -> the formula.
        self.assertEqual(60, values[80 * 128 + 14])
        self.assertEqual(table.cell(80 * 128 + 17), values[80 * 128 + 17])
        # The thin cell at enemy 60 is the formula, not 0.5.
        self.assertEqual(table.cell(80 * 128 + 60), values[80 * 128 + 60])
        self.assertEqual(2, how["data"])
        self.assertEqual(len(values), distill.CELLS)

    def test_alive_filter_keeps_the_endgame(self):
        path = os.path.join(self.dir, "shots.csv")
        shots(path, [(2, 80, 10, 400, 3.0)] * 3 + [(7, 80, 10, 400, 1.0)] * 5)
        crowd = distill.observed(distill.read_shots([path]))
        duel = distill.observed(distill.read_shots([path], alive=2))
        self.assertEqual(40, distill.mode(crowd[80 * 128 + 10]))
        self.assertEqual(120, distill.mode(duel[80 * 128 + 10]))

    def test_power_writes_the_constant(self):
        path = os.path.join(self.dir, "shots.csv")
        shots(path, [(5, 1, 1, 400, 0.5)] * 3)
        distill.main(["power", path, "--src", self.src])
        with open(self.src, encoding="utf-8") as f:
            text = f.read()
        self.assertIn('static final String POWER = "\\', text)
        self.assertIn('static final String MODES = "";', text)
        body = text.split('POWER = "')[1].split('";')[0]
        self.assertEqual(distill.CELLS, body.count("\\"))

    def test_literal_matches_table_py_when_nothing_is_observed(self):
        values, how = distill.distil({})
        self.assertEqual(table.literal(), distill.literal(values))
        self.assertEqual(distill.CELLS, how["formula"])


# @Tag("BENCH-156")
class HashTest(unittest.TestCase):
    def setUp(self):
        self.dir = tempfile.mkdtemp()
        self.src = os.path.join(self.dir, "Bot.java")
        with open(self.src, "w", encoding="utf-8") as f:
            f.write(SRC)
        self.parts = os.path.join(self.dir, "participants.txt")
        with open(self.parts, "w", encoding="utf-8") as f:
            f.write("# nano melee\n")
            f.write("d414.nano.Quantum 1.0.0,http://x/q.jar\n")
            f.write("sheldor.melee.nano.NaturalScience 1.2.1,http://x/ns.jar\n")
            f.write("hadur117.nano.Sanaro 0.2\n")

    def test_java_hash_matches_the_jvm(self):
        # "hello".hashCode() == 99162322; "Hadur".hashCode() is negative.
        self.assertEqual(99162322, distill.java_hash("hello"))
        self.assertEqual(0, distill.java_hash(""))
        self.assertEqual(69609650, distill.java_hash("Hello"))
        h = distill.java_hash("a very long robot name 9.9.9")
        self.assertTrue(-(1 << 31) <= h < (1 << 31))
        # A supplementary character is two UTF-16 units in Java: "\U0001F600".hashCode() == 1772 * 31 + 56832.
        self.assertEqual(0xD83D * 31 + 0xDE00, distill.java_hash("\U0001F600"))

    def test_mask_and_string(self):
        names = distill.read_names(self.parts)
        self.assertEqual(3, len(names))
        mask = distill.find_mask(names, min_bits=4, max_bits=14)
        self.assertIsNotNone(mask)
        cells = {distill.java_hash(n) & mask for n in names}
        self.assertEqual(3, len(cells))
        s = distill.modes_string(names, {names[0]: "q"}, mask, "0")
        self.assertEqual(mask + 1, len(s))
        self.assertEqual("q", s[distill.java_hash(names[0]) & mask])
        self.assertEqual(1, s.count("q"))

    def test_protect_lets_the_rest_collide(self):
        names = ["a", "b", "c", "d"] + ["x%d" % i for i in range(200)]
        protect = {"a", "b"}
        mask = distill.find_mask(names, protect, min_bits=2, max_bits=3)
        self.assertIn(mask, (3, 7))
        self.assertIsNone(distill.find_mask(names, None, min_bits=2, max_bits=3))

    def test_hash_writes_the_constant(self):
        modes = os.path.join(self.dir, "modes.tsv")
        with open(modes, "w", encoding="utf-8") as f:
            f.write("d414.nano.Quantum 1.0.0\t2\n")
        distill.main(["hash", self.parts, "--modes", modes, "--src", self.src])
        with open(self.src, encoding="utf-8") as f:
            text = f.read()
        body = text.split('MODES = "')[1].split('";')[0]
        self.assertEqual(1, body.count("2"))
        self.assertTrue(len(body) >= 16 and (len(body) & (len(body) - 1)) == 0, "a power of two")
        self.assertIn("static final int MASK = %d;" % (len(body) - 1), text)


if __name__ == "__main__":
    unittest.main()
