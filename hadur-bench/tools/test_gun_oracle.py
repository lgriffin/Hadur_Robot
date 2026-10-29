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

    def battle(self, name, waves):
        """Per wave (round, fire, power, true gf): an ORC and an AES record, and the bullet in the truth log."""
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


if __name__ == "__main__":
    unittest.main()
