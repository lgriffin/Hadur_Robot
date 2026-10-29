"""ORACLE-2: the enemy-gun oracle's join, kernel, gate and scores (data/tools/gun_oracle.py)."""

import gzip
import math
import os
import shutil
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", "..", "data", "tools"))
import gun_oracle as go  # noqa: E402

try:
    import numpy as np
except ImportError:  # the join and scores need numpy; CI without it skips them, as test_aes_rank does
    np = None

BEARING, DIR, MEA, DIST = 1.0, 1, 0.5, 500.0


def num(v):
    return "nan" if isinstance(v, float) and math.isnan(v) else repr(float(v))


def orc_line(rnd, fire, power, views, options=((0.9, 1.0), (1.0, 1.1), (1.1, 1.2)), firing=1):
    """An ORC line as the harvester writes it; `views` is [(on, weight, [(gf, scan)])]."""
    head = [fire, num(power), firing, num(400), num(100), num(BEARING), DIR, num(MEA), num(DIST), 1]
    for lo, hi in options:
        head += [num(lo), num(hi)]
    body = [len(views)]
    for on, weight, pairs in views:
        body += [num(1.0 if on else 0.0), num(weight), num(float(len(pairs)))]
        for gf, sc in pairs:
            body += [num(gf), num(sc)]
    return "%d,%d,ORC,%d,%d,%s\n" % (rnd, fire + 3, rnd, fire + 3, ",".join(str(x) for x in head + body))


def aes_line(rnd, fire, power, views, rec, chosen):
    """An AES line whose terms agree with `rec`'s neighbours: no shadow, no hit-rate term, equal factors."""
    n = len(views)
    parts = []
    for lo, hi in [(0.9, 1.0), (1.0, 1.1), (1.1, 1.2)]:
        vs = go.view_score(rec, lo, hi)
        first = vs
        terms = [lo, hi, first, 0.0, 0.0, vs, 7.6, 0, 1.0, 1.0, 1.0] + [0.0] * n + [1.0] * n + [float("nan")]
        parts.append("1," + num(first) + "," + ",".join(num(t) for t in terms))
    return "%d,%d,AES,%d,%d,%d,%s,1,400,100,%d,%d,%s\n" % (
        rnd, fire + 3, rnd, fire + 3, fire, num(power), chosen, n, ",".join(parts))


@unittest.skipIf(np is None, "numpy is not installed")
class ParseAndKernelTest(unittest.TestCase):

    # @Tag("ORACLE-2")
    def test_record_round_trip(self):
        views = [(True, 1.0, [(0.2, 0.5), (0.4, 1.5)]), (False, 2.0, [])]
        rec = go.parse_orc(orc_line(3, 40, 1.9, views))
        self.assertEqual((rec["round"], rec["fire"], rec["views"], rec["dir"]), (3, 40, 2, 1))
        self.assertEqual(rec["gfs"][0], [0.2, 0.4])
        self.assertEqual(rec["scans"][0], [0.5, 1.5])
        self.assertEqual(rec["on"], [True, False])
        self.assertEqual(rec["options"][1], (1.0, 1.1))
        self.assertIsNone(go.parse_orc(orc_line(3, 40, 1.9, views).rstrip("\n")[:-4]), "truncated")

    # @Tag("ORACLE-2")
    def test_kernel_mass_is_the_surfs(self):
        # MoveController.kernelMass: a neighbour at the centre of [c - b, c + b] weighs 1, and the
        # mass halves with each half-width away; angles wrap to the interval's side.
        self.assertAlmostEqual(float(go.kernel_mass(np.array(1.0), 0.9, 1.1)), 1.0)
        far = float(go.kernel_mass(np.array(1.2), 0.9, 1.1))
        self.assertAlmostEqual(far, 2 ** -1 - 2 ** -3)
        self.assertAlmostEqual(float(go.kernel_mass(np.array(1.0 + 2 * math.pi), 0.9, 1.1)), 1.0)

    # @Tag("ORACLE-2")
    def test_gf_inverts_the_firing_angle(self):
        rec = {"bearing": BEARING, "dir": -1, "mea": MEA}
        self.assertAlmostEqual(go.gf_of(rec, BEARING - 0.5 * MEA), 0.5)
        self.assertAlmostEqual(go.gf_of(rec, BEARING + 2 * math.pi), 0.0)


@unittest.skipIf(np is None, "numpy is not installed")
class JoinTest(unittest.TestCase):

    def setUp(self):
        self.dir = tempfile.mkdtemp()

    def tearDown(self):
        shutil.rmtree(self.dir)

    def battle(self, name, waves, hits=()):
        """Per wave (round, fire, power, true gf): an ORC and an AES record, and the bullet in the truth log;
        `hits` are (round, tick, gf, power) HF records."""
        d = os.path.join(self.dir, "battles", name)
        os.makedirs(d)
        views = [(True, 1.0, [(0.3, 1.0), (0.35, 0.5)]), (True, 2.0, [(-0.2, 1.0)]), (False, 1.0, [])]
        with open(os.path.join(d, "hadur.log"), "w") as f:
            for rnd, fire, power, gf in waves:
                line = orc_line(rnd, fire, power, views)
                rec = go.parse_orc(line)
                totals = [go.view_score(rec, lo, hi) for lo, hi in [(0.9, 1.0), (1.0, 1.1), (1.1, 1.2)]]
                f.write(line)
                f.write(aes_line(rnd, fire, power, views, rec, go.surf_choice(totals)))
            f.write(orc_line(0, 900, 1.0, views, firing=0))
            for rnd, tick, gf, power in hits:
                f.write("%d,%d,HF,%d,%d,learned,%.3f,0.000,0.500,480.0,%.2f,1,NaN,NaN,-1,---,-1\n"
                        % (rnd, tick, rnd, tick, gf, power))
        with gzip.open(os.path.join(d, "truth.log.gz"), "wt") as f:
            f.write("V,1\n")
            for rnd, fire, power, gf in waves:
                for t in range(fire - 3, fire + 2):
                    bullets = ""
                    if t == fire + 1:
                        bullets = "E:400.0:100.0:%.4f:%.2f" % (BEARING + gf * DIR * MEA, power)
                    f.write("T,%d,%d,400,450,0,8,100,400,100,0,0,100,%s\n" % (rnd, t, bullets))
                f.write("F,%d,%d,E,%.2f\n" % (rnd, fire + 1, power))
        return d

    # @Tag("ORACLE-2")
    def test_join_gate_and_scores(self):
        self.battle("x.Bot_1.0-1", [(0, 30, 1.9, 0.3), (0, 60, 2.5, 0.31), (1, 30, 1.9, -0.6)])
        out = os.path.join(self.dir, "d.npz")
        go.join([self.dir], out, 1)
        z = dict(np.load(out))
        self.assertEqual(len(z["gf"]), 3, "the virtual wave is not joined")
        self.assertAlmostEqual(float(z["gf"][0]), 0.3, places=3)
        self.assertTrue(np.all(np.isnan(z["surface"][:, 2, :].astype(float))), "a view off has no surface")
        waves, opts, same, checked, chosen = go.gate(z)
        self.assertEqual((waves, opts, checked), (3, 9, 3))
        self.assertEqual((same, chosen), (1.0, 1.0), "the rebuilt scores are the logged ones and pick the same")
        ms = go.models(z)
        bits, safe = go.rate(*ms["uniform"])
        self.assertTrue(np.allclose(bits, 0.0) and np.allclose(safe, 1 / 3))
        bits, safe = go.rate(*ms["view:simple"])
        self.assertGreater(bits[0], 2.0, "a view whose neighbours sit on the bullet predicts it")
        self.assertEqual(safe[0], 0.0)
        self.assertLess(bits[2], 0.0, "and pays where the bullet comes from elsewhere")
        report = os.path.join(self.dir, "r.md")
        go.score(out, report, None, os.path.join(self.dir, "r.tsv"))
        with open(report) as f:
            text = f.read()
        self.assertIn("| blend (shipped) |", text)
        self.assertIn("100.00%", text)

    # @Tag("ORACLE-3")
    def test_join_keeps_order_and_marks_hits(self):
        # 500 px at power 1.9 is 35 ticks: the hit at 66 is the wave fired at 30, not the one at 60
        # (wrong power) nor round 1's (wrong round); a hit far off every wave's guess factor matches none.
        self.battle("x.Bot_1.0-1", [(0, 30, 1.9, 0.3), (0, 60, 2.5, 0.31), (1, 30, 1.9, -0.6)],
                    hits=[(0, 66, 0.3, 1.9), (1, 66, 0.4, 1.9), (1, 64, float("nan"), 1.9)])
        self.battle("y.Bot_1.0-1", [(0, 30, 1.9, 0.1)])
        out = os.path.join(self.dir, "d.npz")
        go.join([self.dir], out, 1)
        z = dict(np.load(out))
        self.assertEqual(sorted(set(z["battle"].tolist())), [0, 1])
        x = z["bot"] == list(z["bots"]).index("x.Bot_1.0")
        self.assertEqual(z["fire"][x].tolist(), [30, 60, 30])
        self.assertEqual(z["seen"][x].tolist(), [1, 0, 0], "a hit with no wave (NaN gf) teaches nothing")
        self.assertEqual(z["hit"][x][0], 66.0)
        self.assertEqual(int(z["seen"].sum()), 1)
        report = os.path.join(self.dir, "r.md")
        go.score(out, report, None, None)
        with open(report) as f:
            text = f.read()
        self.assertIn("| blend (rolling, K1) |", text)
        self.assertIn("| hindsight: best fixed mix per opponent |", text)

    # @Tag("ORACLE-3")
    def test_a_hit_goes_to_the_wave_due_nearest_it(self):
        # Two waves at the same power and guess factor 4 ticks apart: the hit belongs to the one due then.
        rows = [{"round": 0, "fire": f, "power": 2.0, "dist": 140.0, "gf": 0.3, "seen": 0, "hit": float("nan")}
                for f in (20, 24)]
        self.assertEqual(go.mark_seen(rows, [(0, 34, 0.3, 2.0)]), 1)
        self.assertEqual([r["seen"] for r in rows], [0, 1])

    # @Tag("ORACLE-2")
    def test_classes_key_by_the_battle_slug(self):
        # Opponent.slug turns a dash into _, so the census name must be keyed the same way.
        path = os.path.join(self.dir, "classes.tsv")
        with open(path, "w") as f:
            f.write("opponent\trank\tmove_class\tgun_class\n")
            f.write("aaa.r.ScalarR 0.005h.053-noshield\t5\tflat\tlearning\n")
        self.assertEqual(go.read_classes(path), {"aaa.r.ScalarR_0.005h.053_noshield": "learning-flat"})

    # @Tag("ORACLE-2")
    def test_surf_choice_rule(self):
        self.assertEqual(go.surf_choice([1.0, 1.0, 2.0]), 1, "the stop wins ties")
        self.assertEqual(go.surf_choice([2.0, 3.0, 1.0]), 2)
        self.assertEqual(go.surf_choice([1.0, 3.0, 1.0]), 0, "counter-clockwise over clockwise on a tie")
        self.assertEqual(go.surf_choice([1.0, float("inf"), 2.0]), 0)


@unittest.skipIf(np is None, "numpy is not installed")
class RollingBlendTest(unittest.TestCase):

    @staticmethod
    def data(rows):
        """rows: (battle, round, fire, seen); every bullet 140 px away at power 2 (10 ticks of flight)."""
        n = len(rows)
        z = {k: np.array([r[i] for r in rows]) for i, k in enumerate(("battle", "round", "fire", "seen"))}
        z.update(bot=np.zeros(n, dtype=int), dist=np.full(n, 140.0), power=np.full(n, 2.0))
        return z

    # @Tag("ORACLE-3")
    def test_weights_learn_only_from_landed_hits(self):
        # View 0 put 4x the uniform's density on every bullet, view 1 a quarter: log2 +2 and -2.
        like = np.tile([4.0, 0.25], (6, 1))
        z = self.data([(0, 0, 0, 1), (0, 0, 5, 1), (0, 0, 20, 0), (0, 0, 40, 1), (1, 0, 50, 1), (0, 1, 0, 1)])
        w = go.rolling_weights(z, like, decay=0.5, power=1.0)
        self.assertEqual(w[0].tolist(), [1.0, 1.0], "nothing learnt before the first bullet lands")
        self.assertEqual(w[1].tolist(), [1.0, 1.0], "the bullet fired at 0 is still in flight at 5")
        # By 20 both hits have landed: score 0 -> 1 -> 1.5 for view 0, its mirror for view 1.
        self.assertAlmostEqual(w[2][0], 2 ** 1.5)
        self.assertAlmostEqual(w[2][1], 2 ** -1.5)
        self.assertAlmostEqual(w[3][0], 2 ** 1.5, msg="a bullet that missed teaches nothing")
        self.assertEqual(w[4].tolist(), [1.0, 1.0], "a new battle starts from nothing")
        self.assertAlmostEqual(w[5][0], 2 ** 1.75, msg="a new round keeps the battle's learning, and its flights end")

    # @Tag("ORACLE-3")
    def test_a_silent_view_keeps_its_score_and_the_ceiling_finds_the_good_view(self):
        like = np.array([[4.0, np.nan], [4.0, np.nan], [4.0, 0.25]])
        z = self.data([(0, 0, 0, 1), (0, 0, 20, 1), (0, 0, 40, 1)])
        w = go.rolling_weights(z, like, decay=0.5, power=1.0)
        self.assertAlmostEqual(w[2][1], 1.0)
        mix = go.hindsight_mix(z, np.tile([4.0, 0.25], (3, 1)))
        self.assertGreater(mix[0][0], 0.99)

    # @Tag("ORACLE-3")
    def test_the_hindsight_mix_ignores_waves_its_weights_cannot_change(self):
        # Waves where only view 1 speaks score the same whatever the weights, so they must not pull the
        # fit towards view 1 (the scored mix renormalises over the views present).
        both = np.tile([4.0, 0.25], (3, 1))
        alone = np.tile([np.nan, 8.0], (30, 1))
        z = self.data([(0, 0, t, 1) for t in range(33)])
        mix = go.hindsight_mix(z, np.vstack([both, alone]))
        self.assertGreater(mix[0][0], 0.95)

    # @Tag("ORACLE-3")
    def test_learning_waits_for_the_hit_tick(self):
        like = np.tile([4.0, 0.25], (2, 1))
        z = self.data([(0, 0, 0, 1), (0, 0, 15, 1)])
        z["hit"] = np.array([18.0, np.nan])  # due at 10 by flight time, but it hit at 18
        w = go.rolling_weights(z, like, decay=0.5, power=1.0)
        self.assertEqual(w[1].tolist(), [1.0, 1.0])


if __name__ == "__main__":
    unittest.main()
