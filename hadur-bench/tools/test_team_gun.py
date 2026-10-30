"""BENCH-147: team_gun.py reads our bullets and the enemy's the same way."""
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import team_gun  # noqa: E402


class TeamGunTest(unittest.TestCase):

    def battle(self, lines):
        root = tempfile.mkdtemp()
        d = os.path.join(root, 'battles', 'x.FooTeam_1.0-1')
        os.makedirs(d)
        with open(os.path.join(d, 'bullets.log'), 'w') as f:
            f.write('\n'.join(lines) + '\n')
        return root

    def test_both_sides_are_read_with_their_targets(self):
        enemy = 'x.Foo 1.0 (1):500.0:800.0:1.5708:0.00'
        member = 'hadur117.Hadur 3.20 (1):500.0:500.0:0.0000:8.00'
        root = self.battle([
            # Our bullet straight up at the enemy (heading 0 is north): a hit.
            '0,10,F,1,hadur117.Hadur 3.20 (1),3.00,500.0,510.0,0.0000,-,' + enemy,
            '0,30,H,1,hadur117.Hadur 3.20 (1),x.Foo 1.0 (1),3.00',
            # Our bullet fired far off the line: no target.
            '0,12,F,2,hadur117.Hadur 3.20 (1),1.00,500.0,510.0,3.1416,-,' + enemy,
            # Their bullet straight down at our member: a miss with a target.
            '0,11,F,3,x.Foo 1.0 (1),2.00,500.0,790.0,3.1416,' + member,
        ])
        out = team_gun.report([root])
        self.assertIn('| x.FooTeam | ours | 2 | 50.0 | 2.00 |', out)
        self.assertIn('| x.FooTeam | theirs | 1 | 0.0 | 2.00 | 0.00 | 0% |', out)
        self.assertIn('| x.FooTeam | ours | 2 | 50.0 | 2.00 | 4.00 | 50% | 100% within ±0.2 |', out)

    def test_an_old_log_without_the_enemy_field_reads_only_their_side(self):
        root = self.battle(['0,10,F,1,hadur117.Hadur 3.20 (1),3.00,500.0,510.0,0.0000,-'])
        with self.assertRaises(SystemExit):
            team_gun.report([root])


if __name__ == '__main__':
    unittest.main()
