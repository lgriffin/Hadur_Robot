"""Tests for the kitlab bench tools: tools/kitlab_fields.py and tools/kitlab_read.py (docs/kitlab.md)."""
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import kitlab_fields  # noqa: E402
import kitlab_read  # noqa: E402


def battle(run, stem, seed, score, theirs):
    d = os.path.join(run, "battles", "%s-%d" % (stem, seed))
    os.makedirs(d, exist_ok=True)
    with open(os.path.join(d, "result.csv"), "w") as f:
        f.write("ok,score,theirScore\ntrue,%s,%s\n" % (score, theirs))


class FieldsTest(unittest.TestCase):
    def test_top_by_name_then_one_per_band(self):
        names = ["b%03d" % i for i in range(100)]
        field, size = kitlab_fields.draw(names, 10, 9, 1)
        self.assertEqual(100, size)
        self.assertEqual(names[:10], [n for n, w in field[:10]])
        self.assertTrue(all(w == 1.0 for _, w in field[:10]))
        picked = [n for n, _ in field[10:]]
        self.assertEqual(9, len(picked))
        for b, n in enumerate(picked):
            self.assertTrue(10 + b * 10 <= int(n[1:]) < 10 + (b + 1) * 10, n)
        self.assertAlmostEqual(10.0, field[10][1])

    def test_skip_leaves_our_own_bots_out(self):
        field, size = kitlab_fields.draw(["a", "hadur117.mini.JayLexi 0.1", "c"], 5, 1, 1, ("hadur117.",))
        self.assertEqual(2, size)
        self.assertEqual(["a", "c"], [n for n, _ in field])

    def test_participants_and_jar_names(self):
        with tempfile.NamedTemporaryFile("w", suffix=".raw", delete=False) as f:
            f.write("<pre>\nab.Bot 1.0,http://x/ab.Bot_1.0.jar\n#c.D 1,http://y\n")
        self.assertEqual({"ab.Bot 1.0": "http://x/ab.Bot_1.0.jar"}, kitlab_fields.participants(f.name))
        self.assertEqual("ab.Bot_1.0.jar", kitlab_fields.jar_name("ab.Bot 1.0"))


class ReadTest(unittest.TestCase):
    def setUp(self):
        self.root = tempfile.mkdtemp()
        self.set = os.path.join(self.root, "set.txt")
        with open(self.set, "w") as f:
            f.write("# header\na.A 1 | top:1 | a.A_1.jar\nb.B 1 | band:3 | b.B_1.jar\n")

    def test_weighted_share(self):
        run = os.path.join(self.root, "ours")
        battle(run, "a.A_1", 1, 50, 50)
        battle(run, "a.A_1", 2, 70, 30)
        battle(run, "b.B_1", 1, 90, 10)
        rows = kitlab_read.load_set(self.set)
        ours = kitlab_read.shares(run)
        m, _ = kitlab_read.weighted(rows, lambda s: kitlab_read.mean_se(ours[s]))
        self.assertAlmostEqual((60 * 1 + 90 * 3) / 4, m)

    def test_failed_battles_are_left_out(self):
        run = os.path.join(self.root, "ours")
        battle(run, "a.A_1", 1, 50, 50)
        d = os.path.join(run, "battles", "a.A_1-2")
        os.makedirs(d)
        with open(os.path.join(d, "result.csv"), "w") as f:
            f.write("ok,score,theirScore\nfalse,0,0\n")
        self.assertEqual({"a.A_1": [50.0]}, kitlab_read.shares(run))


if __name__ == "__main__":
    unittest.main()
