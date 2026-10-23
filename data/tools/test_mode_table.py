"""Tests for mode_table.py (MODE-1): which opponents get a table entry, and which mode."""
import os
import random
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(__file__))
import mode_table as mt  # noqa: E402


def write_run(path, gains, seeds=8, sd=3.0, seed=1):
    rnd = random.Random(seed)
    with open(path, "w") as f:
        f.write("arm\topponent\tok\tscore_share\n")
        for opp, per_arm in gains.items():
            for arm, g in per_arm.items():
                for _ in range(seeds):
                    f.write(f"{arm}\t{opp}\ttrue\t{(70 + g + rnd.gauss(0, sd)) / 100}\n")
            f.write(f"c\t{opp}\tfalse\t0.0\n")  # an unfinished battle never counts


class ModeTableTest(unittest.TestCase):
    def setUp(self):
        self.dir = tempfile.mkdtemp()
        self.run = os.path.join(self.dir, "arms.tsv")

    def pick(self, gains, **kw):
        write_run(self.run, gains, **kw)
        return mt.pick(mt.load([self.run]))[0]

    def test_large_gain_is_locked_to_the_best_mode(self):
        t = self.pick({"big 1.0": {"c": 0, "aa": 0, "sa": 15, "sy": 8}})
        self.assertEqual("sa", t["big 1.0"][0])

    def test_no_gain_and_small_gain_get_no_entry(self):
        t = self.pick({"none 1.0": {"c": 0, "aa": 0, "sa": 0},
                       "small 1.0": {"c": 0, "aa": 0, "sa": 3}})
        self.assertEqual({}, t)

    def test_a_loss_is_never_locked(self):
        t = self.pick({"loss 1.0": {"c": 0, "aa": 0, "sa": -20}})
        self.assertEqual({}, t)

    def test_a_noisy_gain_over_the_margin_needs_its_interval_above_zero(self):
        t = self.pick({"noisy 1.0": {"c": 0, "aa": 0, "sa": 6}}, seeds=2, sd=15.0)
        self.assertEqual({}, t)

    def test_unfinished_battles_do_not_count(self):
        write_run(self.run, {"x 1.0": {"c": 0, "aa": 0}})
        share = mt.load([self.run])
        self.assertEqual(8, len(share["c"]["x 1.0"]))


if __name__ == "__main__":
    unittest.main()
