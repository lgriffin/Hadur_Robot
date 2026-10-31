"""Tests for tools/kitlab_selfmodes.py (pc-eveimear-st)."""
import os
import sys
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import kitlab_selfmodes  # noqa: E402


class PickTest(unittest.TestCase):
    def test_a_clear_win_takes_the_mode(self):
        self.assertEqual('0', kitlab_selfmodes.pick({'1': 50, '9': 52, '0': 60}, 3))

    def test_a_narrow_win_keeps_the_detection(self):
        self.assertEqual('1', kitlab_selfmodes.pick({'1': 50, '9': 52.9, '0': 40}, 3))

    def test_the_better_of_two_winners(self):
        self.assertEqual('9', kitlab_selfmodes.pick({'1': 50, '9': 55, '0': 54}, 3))

    def test_no_data_is_the_detection(self):
        self.assertEqual('1', kitlab_selfmodes.pick({}, 3))
        self.assertEqual('1', kitlab_selfmodes.pick({'0': 90}, 3))


if __name__ == '__main__':
    unittest.main()
