"""Tests for the constant-pool table tools: kitlab_prior_arm.py and kitlab_priors.py
(docs/bench/kitlab-priors.md)."""
import gzip
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import kitlab_prior_arm  # noqa: E402
import kitlab_priors  # noqa: E402


class JavaLiteralTest(unittest.TestCase):
    def test_every_char_reads_back(self):
        chars = list(range(0, 300)) + [0x0a, 0x0d, ord('"'), ord('\\'), 1, ord('2'), 0xffff]
        self.assertEqual(chars, kitlab_prior_arm.unjava(kitlab_prior_arm.java(chars)))

    def test_a_digit_after_an_escape_stays_its_own_char(self):
        # "\1" then "2" would read as "\12", one char: the escapes are always three digits.
        self.assertEqual('\\0012', kitlab_prior_arm.java([1, ord('2')]))

    def test_no_line_break_reaches_the_source(self):
        body = kitlab_prior_arm.java([10, 13, 0x2028])
        self.assertNotIn('\n', body)
        self.assertNotIn('\\u000a', body)


class HashTest(unittest.TestCase):
    def test_java_string_hash(self):
        # "abc".hashCode() is 96354 in Java; the table keys a char of it.
        h = 0
        for ch in 'abc':
            h = (31 * h + ord(ch)) & 0xFFFFFFFF
        self.assertEqual(96354, h)


class HarvestTest(unittest.TestCase):
    def test_a_shot_lands_in_its_guess_factor_bin(self):
        with tempfile.TemporaryDirectory() as d:
            path = os.path.join(d, 'truth.log.gz')
            # Us at (400, 300) still; the enemy at (400, 500) due north... fires straight at us
            # (heading pi, a hair over): guess factor zero, bin 23 (the index truncates, as JayLexi's does).
            with gzip.open(path, 'wt') as f:
                f.write('V,1\n')
                for t in (1, 2, 3):
                    bullets = 'E:400.00:480.00:3.1416:2.00' if t == 3 else ''
                    f.write(f'T,0,{t},400.00,300.00,0.00,0.00,100.00,400.00,500.00,0.00,0.00,98.00,{bullets}\n')
                f.write('F,0,3,E,2.00\n')
            shots, waves = kitlab_priors.battle(path)
            self.assertEqual([(1, 0, 23)], shots)


    def test_the_wave_takes_the_bearing_kept_from_two_scans_back(self):
        with tempfile.TemporaryDirectory() as d:
            path = os.path.join(d, 'truth.log.gz')
            # The enemy fires straight down from (400, 500) at turn 3. Two scans back (turn 1) we
            # were at (300, 300), so the wave's bearing is from (400, 500) to (300, 300) and the
            # straight-down bullet sits off guess factor zero; from turn 2 (us at (400, 300)) it
            # would be at zero.
            with gzip.open(path, 'wt') as f:
                f.write('V,1\n')
                rows = {1: '300.00,300.00', 2: '400.00,300.00', 3: '400.00,300.00'}
                for t in (1, 2, 3):
                    bullets = 'E:400.00:480.00:3.1416:2.00' if t == 3 else ''
                    f.write(f'T,0,{t},{rows[t]},0.00,0.00,100.00,400.00,500.00,0.00,0.00,98.00,{bullets}\n')
                f.write('F,0,3,E,2.00\n')
            shots, _ = kitlab_priors.battle(path)
            self.assertEqual(1, len(shots))
            self.assertNotEqual(23, shots[0][2])
            self.assertEqual(1, shots[0][0])  # distance 224 at turn 1: band 1


class EmptyHarvestTest(unittest.TestCase):
    def test_no_shots_stops_with_a_reason(self):
        with tempfile.TemporaryDirectory() as d:
            p = os.path.join(d, 'p.json')
            import json
            json.dump({'surf': [[[0] * 47] * 5] * 4, 'gun': [0], 'per_bot': {}}, open(p, 'w'))
            sys.argv = ['x', p, 'tmpl', os.path.join(d, 'out.java')]
            with self.assertRaises(SystemExit) as e:
                kitlab_prior_arm.main()
            self.assertIn('no enemy shots', str(e.exception.code))


if __name__ == '__main__':
    unittest.main()
