#!/usr/bin/env python3
"""Tests for tools/melee_exposure.py (BENCH-116)."""

import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import melee_exposure as mx  # noqa: E402


def write(path, text):
    os.makedirs(os.path.dirname(path), exist_ok=True)
    with open(path, "w", encoding="utf-8") as f:
        f.write(text)


class ExposureTest(unittest.TestCase):
    # @Tag("BENCH-116")

    def test_groups_and_shares(self):
        with tempfile.TemporaryDirectory() as tmp:
            write(os.path.join(tmp, "census", "f.txt"),
                  "aaa.Top 1.0 | melee-3 | x.jar\nbbb.Low 1.0 | melee-150 | y.jar\n")
            suite = os.path.join(tmp, "census", "suite.txt")
            write(suite, "F01 | --set f.txt\n")
            write(os.path.join(tmp, "w", "F01", "battles", "melee-1", "exposure.csv"),
                  "round,robot,crowdTicks,nearestLoad,takenCrowd,takenNearest,takenSecond\n"
                  "0,hadur2.Hadur 3.17.1,200,300,40.00,30.00,4.00\n"
                  "0,aaa.Top 1.0,400,200,20.00,5.00,5.00\n"
                  "0,aaa.Top 1.0 (2),400,200,20.00,5.00,5.00\n"
                  "0,bbb.Low 1.0,100,100,30.00,0.00,0.00\n"
                  "0,zzz.Unknown 1.0,100,100,30.00,0.00,0.00\n")
            t = mx.tally([os.path.join(tmp, "w")], mx.ms.census_ranks(suite))
            self.assertEqual(set(t), {"Hadur", "1-10", "101+"}, "an unranked robot is left out")
            self.assertEqual(t["1-10"][5], 2, "copies pool by class")
            text = mx.render(t, "t")
            self.assertIn("| Hadur | 1 | 200 | 20.0 | 75% | 10% | 15% | 1.50 |", text)
            self.assertIn("| 1-10 | 2 | 400 | 5.0 | 25% | 25% | 50% | 0.50 |", text)


if __name__ == "__main__":
    unittest.main()
