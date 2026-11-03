import os
import tempfile
import unittest

import melee_pilot


def write_battle(d, share, crowd_rounds, rounds=10):
    os.makedirs(d)
    with open(os.path.join(d, 'melee.csv'), 'w') as f:
        f.write('rank,robot,score,firsts,survival,bulletDamage\n')
        f.write(f'1,hadur117.Hadur 3.21x,{share},0,0,0\n2,other.Bot 1.0,{100 - share},0,0,0\n')
    with open(os.path.join(d, 'rounds.csv'), 'w') as f:
        f.write('round,place,duelOpponent\n')
        for i in range(rounds):
            f.write(f'{i},3,-\n' if i < crowd_rounds else f'{i},1,other.Bot 1.0\n')


def write_battle_rows(d, share, places):
    os.makedirs(d)
    with open(os.path.join(d, 'melee.csv'), 'w') as f:
        f.write('rank,robot,score,firsts,survival,bulletDamage\n')
        f.write(f'1,hadur117.Hadur 3.21x,{share},0,0,0\n2,other.Bot 1.0,{100 - share},0,0,0\n')
    with open(os.path.join(d, 'rounds.csv'), 'w') as f:
        f.write('round,place,duelOpponent\n')
        for i, p in enumerate(places):
            f.write(f'{i},{p},-\n')


class MeleePilotTest(unittest.TestCase):
    """BENCH-178: the pilot passes only on a share gain with fewer crowd deaths."""

    def run_case(self, arm, base, extra=()):
        with tempfile.TemporaryDirectory() as t:
            for i, (a, b) in enumerate(zip(arm, base)):
                write_battle(os.path.join(t, f'F{i:02d}', 'battles', 'melee-1'), *a)
                write_battle(os.path.join(t, f'F{i:02d}', 'battles', 'melee-1-baseline'), *b)
            out = os.path.join(t, 'pilot.md')
            code = melee_pilot.main([t, '--out', out, *extra])
            with open(out) as f:
                return code, f.read()

    def test_gain_passes(self):
        code, md = self.run_case([(21, 2), (22, 1)], [(20, 3), (20, 3)])
        self.assertEqual(0, code)
        self.assertIn('PASS', md)

    def test_no_gain_stops(self):
        code, md = self.run_case([(19, 3), (20, 3)], [(20, 2), (20, 3)])
        self.assertEqual(1, code)
        self.assertIn('NO GAIN', md)

    def test_share_up_but_more_crowd_deaths_stops(self):
        self.assertEqual(1, self.run_case([(22, 4)], [(20, 3)])[0])

    def test_second_place_is_not_a_crowd_death(self):
        with tempfile.TemporaryDirectory() as t:
            d = os.path.join(t, 'b')
            write_battle_rows(d, 20, [2, 2, 3, 1])
            self.assertEqual(25.0, melee_pilot.battle(d)[1])

    def test_too_few_pairs_is_no_data(self):
        code, md = self.run_case([(21, 2)], [(20, 3)], extra=('--expect', '4'))
        self.assertEqual(2, code)
        self.assertIn('no data', md)

    def test_short_battles_are_left_out(self):
        code, _ = self.run_case([(21, 2), (22, 1)], [(20, 3), (20, 3)], extra=('--expect', '2', '--rounds', '35'))
        self.assertEqual(2, code)

    def test_no_data(self):
        with tempfile.TemporaryDirectory() as t:
            self.assertEqual(2, melee_pilot.main([t, '--out', os.path.join(t, 'p.md')]))


if __name__ == '__main__':
    unittest.main()
