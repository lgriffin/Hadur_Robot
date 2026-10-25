"""Tests for tools/saor_fields.py, which makes Saor's bench sets (docs/saor.md)."""
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import saor_fields  # noqa: E402


class SaorFieldsTest(unittest.TestCase):
    def setUp(self):
        self.dir = tempfile.mkdtemp()
        self.tsv = os.path.join(self.dir, "r.tsv")
        with open(self.tsv, "w", encoding="utf-8") as f:
            f.write("rank\tname\taps\tsurvival\tpairings\n")
            for i in range(1, 157):
                f.write("%d\tp%d.Bot %d.0\t%.2f\t10\t155\n" % (i, i, i, 70 - i * 0.3))

    # @Tag("SAOR-12")
    def test_census_meets_every_robot_in_fields_of_nine(self):
        robots, fs, _ = saor_fields.build(self.tsv, self.dir, 117)
        self.assertEqual(len(fs), 18)
        self.assertTrue(all(len(f) == 9 for f in fs))
        met = {r["name"] for f in fs for r in f}
        self.assertEqual(met, {r["name"] for r in robots})
        for f in fs:
            self.assertEqual(len({r["name"] for r in f}), 9, "no robot twice in a field")
        suite = open(os.path.join(self.dir, "micromelee-census.txt"), encoding="utf-8").read()
        self.assertIn("F18 | --set micromelee-census/f18.txt --melee true --field 1000x1000", suite)

    # @Tag("SAOR-13")
    def test_gate_field_holds_the_top_three(self):
        _, _, gate = saor_fields.build(self.tsv, self.dir, 117)
        self.assertEqual([r["rank"] for r in gate[:3]], [1, 2, 3])
        self.assertEqual(len(gate), 9)

    def test_field_file_lines_parse_as_bench_sets(self):
        saor_fields.build(self.tsv, self.dir, 117)
        lines = [l for l in open(os.path.join(self.dir, "micromelee-field.txt"), encoding="utf-8") if not l.startswith("#")]
        self.assertEqual(len(lines), 156)
        self.assertEqual(lines[0].strip(), "p1.Bot 1.0 | micromelee-1 | p1.Bot_1.0.jar")

    def test_the_same_seed_gives_the_same_fields(self):
        _, a, _ = saor_fields.build(self.tsv, self.dir, 5)
        _, b, _ = saor_fields.build(self.tsv, self.dir, 5)
        self.assertEqual(a, b)


if __name__ == "__main__":
    unittest.main()
