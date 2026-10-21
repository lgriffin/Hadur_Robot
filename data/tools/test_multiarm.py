"""Tests for multiarm.py (BENCH-94, docs/plan-top5.md section 6): python3 test_multiarm.py"""
import os
import random
import tempfile
import unittest

import multiarm as ma

HEADER = ("arm\trobot\topponent\trole\tseed\tworker\tposition\tok\trounds\tscore\ttheirScore\tscore_share\t"
          "survival_share\tbullet_share\tfirsts\tsurvival\ttheirSurvival\tbulletDamage\ttheirBulletDamage\t"
          "skippedTurns\tturnMaxMs\tengineDisables\tduressTicks\thostCpuMean\terrors")


def row(arm, opp, band, seed, share, skips=35, dis=0, ok="true"):
    return "\t".join([arm, "hadur2.Hadur 3.14" + arm, opp, f"rank1-band{band}", str(seed), "1", "1", ok, "35",
                      f"{share * 1000:.1f}", f"{(1 - share) * 1000:.1f}", f"{share:.4f}", "0.5", "0.5", "10",
                      "1", "1", "1", "1", str(skips), "5", str(dis), "0", "0.5", ""])


class MultiArmTest(unittest.TestCase):
    def setUp(self):
        self.dir = tempfile.mkdtemp()

    def write(self, name, lines):
        p = os.path.join(self.dir, name)
        with open(p, "w") as f:
            f.write(HEADER + "\n" + "\n".join(lines) + "\n")
        return p

    def panel(self, effects, seeds=2, noise=0.01, opps=60, rng=None):
        """Opponents in bands 1 and 6; each arm's share = opponent level + effect + noise."""
        rng = rng or random.Random(5)
        lines = []
        for i in range(opps):
            band = 1 if i < opps // 2 else 6
            level = 0.6 if band == 1 else 0.9
            for s in range(seeds):
                for arm, eff in effects.items():
                    e = eff[band - 1] if isinstance(eff, tuple) else eff
                    lines.append(row(arm, f"o.B{i} 1", band, s, level + e + rng.gauss(0, noise)))
        return lines

    def test_paired_difference_against_the_pooled_control(self):
        p = self.write("arms.tsv", self.panel({"c": 0.0, "aa": 0.0, "x": 0.02}))
        run = ma.Run(ma.read_rows([p]))
        m, ci, n = ma.mean_ci(list(run.diffs("x", ["c", "aa"]).values()))
        self.assertEqual(n, 60)
        self.assertAlmostEqual(m, 2.0, delta=0.3)
        self.assertLess(ci, 0.5)
        chk = ma.aa_check(run, "c", "aa")
        self.assertTrue(chk["ok"])
        self.assertAlmostEqual(chk["band"], 2.58 * 3.2 * (1 / 2 + 1 / 2) ** 0.5 / 60 ** 0.5, places=6)

    def test_aa_outside_its_band_voids_the_run(self):
        p = self.write("arms.tsv", self.panel({"c": 0.0, "aa": 0.03}))
        chk = ma.aa_check(ma.Run(ma.read_rows([p])), "c", "aa")
        self.assertFalse(chk["ok"])
        out = os.path.join(self.dir, "r.md")
        ma.main([p, "--out", out])
        self.assertIn("OUTSIDE", open(out).read())

    def test_bands_and_census_weighting(self):
        # +4 points in band 1, 0 in band 6; a census of 1 band-1 bot to 3 band-6 bots weights it 1/4.
        p = self.write("arms.tsv", self.panel({"c": 0.0, "aa": 0.0, "x": (0.04, 0, 0, 0, 0, 0.0)}, noise=0.001))
        census = os.path.join(self.dir, "census.txt")
        with open(census, "w") as f:
            f.write("# c\na 1 | rank1-band1 | a.jar\nb 1 | rank900-band6 | b.jar\nc 1 | rank901-band6 | c.jar\nd 1 | rank902-band6 | d.jar\n")
        run = ma.Run(ma.read_rows([p]))
        d = run.diffs("x", ["c", "aa"])
        bands = ma.by_group(d, lambda o: ma.band_of(run.role[o]))
        self.assertAlmostEqual(bands[1][0], 4.0, delta=0.1)
        self.assertAlmostEqual(bands[6][0], 0.0, delta=0.1)
        m, _ = ma.field_estimate(bands, ma.census_weights(census))
        self.assertAlmostEqual(m, 1.0, delta=0.05)

    def test_factorial_main_effects(self):
        # Two factors, a and b, in a 2^2 design (plus an A/A arm at the all-low corner):
        # a adds 2 points, b nothing.
        design = os.path.join(self.dir, "design.txt")
        with open(design, "w") as f:
            f.write("arm a b\nc - -\naa - -\nA + -\nB - +\nAB + +\n")
        p = self.write("arms.tsv", self.panel({"c": 0, "aa": 0, "A": 0.02, "B": 0, "AB": 0.02}, noise=0.002))
        factors, dz = ma.read_design(design)
        eff, opps = ma.main_effects(ma.Run(ma.read_rows([p])), factors, dz)
        self.assertEqual(len(opps), 60)
        self.assertAlmostEqual(ma.mean_ci(list(eff["a"][0].values()))[0], 2.0, delta=0.1)
        self.assertAlmostEqual(ma.mean_ci(list(eff["b"][0].values()))[0], 0.0, delta=0.1)
        self.assertEqual(eff["a"][1:], (2, 2), "c and aa pool into one design point")
        with self.assertRaises(ValueError):
            bad = os.path.join(self.dir, "bad.txt")
            with open(bad, "w") as f:
                f.write("arm a\nc x\n")
            ma.read_design(bad)

    def test_load_counts_skips_trust_and_disables_and_ignores_unfinished(self):
        lines = [row("c", "o.A 1", 1, 0, 0.5, skips=35), row("c", "o.A 1", 1, 1, 0.5, skips=140, dis=1),
                 row("c", "o.A 1", 1, 2, 0.1, ok="false"), row("aa", "o.A 1", 1, 0, 0.5)]
        run = ma.Run(ma.read_rows([self.write("arms.tsv", lines)]))
        ld = run.load("c")
        self.assertEqual((ld["battles"], ld["attempted"]), (2, 3))
        self.assertAlmostEqual(ld["skips_round"], 175 / 70)
        self.assertEqual(ld["trusted"], 50.0)
        self.assertEqual(ld["disables"], 50.0)
        self.assertAlmostEqual(run.level("c")[0], 50.0)

    def test_blocks_and_startup_tables(self):
        p1 = self.write("b1.tsv", self.panel({"c": 0, "aa": 0, "x": 0.01}))
        p2 = self.write("b2.tsv", self.panel({"c": 0, "aa": 0, "x": 0.01}, rng=random.Random(9)))
        su = os.path.join(self.dir, "r0.tsv")
        with open(su, "w") as f:
            f.write("build\tstartup_disable\tsetup_ms\nc\t1\t900\nc\t0\t300\nnowarm\t0\t100\n")
        with open(os.path.join(self.dir, "conditions.json"), "w") as f:
            f.write('{"started": "2026-10-22T08:00:00Z", "finished": "2026-10-22T10:00:00Z"}')
        hours, rate = ma.throughput(p1, 600)
        self.assertEqual((hours, rate), (2.0, 300.0))
        out = os.path.join(self.dir, "r.md")
        ma.main([p1, p2, "--blocks", "--startup", su, "--out", out])
        text = open(out).read()
        self.assertIn("## Blocks side by side", text)
        self.assertIn("| c | 2 | 1 | 50.00% | 600 | 900 | 900 |", text)
        self.assertIn("| nowarm | 1 | 0 | 0.00% | 100 | 100 | 100 |", text)
        beside = os.path.join(self.dir, "round0.tsv")
        os.rename(su, beside)
        ma.main([p1, "--out", out])
        self.assertIn("| c | 2 | 1 | 50.00% | 600 | 900 | 900 |", open(out).read(), "found beside the arms.tsv")


if __name__ == "__main__":
    unittest.main()
