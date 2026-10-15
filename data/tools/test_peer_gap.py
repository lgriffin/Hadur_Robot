"""Tests for peer_gap.py (docs/plan-top3.md): python test_peer_gap.py"""

import os
import tempfile
import unittest

import peer_gap as pg


class LiveGapTest(unittest.TestCase):

    def test_cells_sum_to_the_peer_lead_over_hadurs_pairings(self):
        hadur = {"a": 90.0, "b": 80.0, "c": 70.0, "d": 60.0}
        peer = {"a": 95.0, "b": 80.0, "c": 76.0}          # d missing: not counted
        ranks = {"a": 10, "b": 300, "c": 900, "d": 5}
        cells = pg.live_gap(hadur, peer, ranks, listed={"b"}, other={"c"})
        self.assertEqual(cells[("neither", (1, 50))], (5.0 / 4, 1))
        self.assertEqual(cells[("listed", (201, 400))], (0.0, 1))
        self.assertEqual(cells[("other list", (801, None))], (6.0 / 4, 1))
        self.assertAlmostEqual(sum(v[0] for v in cells.values()), 11.0 / 4)

    def test_names_match_without_versions(self):
        self.assertEqual(pg.base("kc.mega.BeepBoop 2.0"), "kc.mega.BeepBoop")
        self.assertEqual(pg.band_of(400), (201, 400))
        self.assertEqual(pg.band_of(801), (801, None))


class BenchTableTest(unittest.TestCase):

    def census(self, rows):
        f = tempfile.NamedTemporaryFile("w", suffix=".tsv", delete=False)
        f.write("build\topponent\trole\tok\trounds\tscore\ttheirScore\tbulletDamage\ttheirBulletDamage\n")
        for r in rows:
            f.write("\t".join(str(x) for x in r) + "\n")
        f.close()
        self.addCleanup(os.unlink, f.name)
        return f.name

    def test_per_round_damage_and_share_on_unlisted_opponents(self):
        h = self.census([("H", "x 1", "rank500-band5", "true", 35, 900, 100, 350, 70),
                         ("H", "y 1", "rank500-band5", "true", 35, 800, 200, 350, 140),
                         ("H", "z 1", "rank20-band1", "false", 35, 1, 1, 1, 1)])
        p = self.census([("P", "x 2", "rank500-band5", "true", 35, 950, 50, 350, 35),
                         ("P", "y 2", "rank500-band5", "true", 35, 950, 50, 350, 35)])
        subjects = {"H": pg.read_census(h), "P": pg.read_census(p)}
        self.assertNotIn("z", subjects["H"])            # not ok: dropped
        rows = pg.bench_table(subjects, listed={"y"})
        self.assertEqual([r[0] for r in rows], ["401-800", "all"])
        label, n, stats = rows[0]
        self.assertEqual(n, 1)
        self.assertEqual(stats["H"], (90.0, 10.0, 2.0))
        self.assertEqual(stats["P"], (95.0, 10.0, 1.0))


if __name__ == "__main__":
    unittest.main()
