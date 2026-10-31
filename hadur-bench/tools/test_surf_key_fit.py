"""SKEY-3: the per-opponent surf-key fit (data/tools/surf_key_fit.py)."""

import os
import sys
import unittest

sys.path.insert(0, os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", "..", "data", "tools"))
import surf_key_fit as sk  # noqa: E402

try:
    import numpy as np
except ImportError:  # the fit needs numpy; CI without it skips it, as test_gun_oracle does
    np = None


def battle(seed, n=400, hit_every=3):
    """A battle whose bullets' guess factor follows the first key value alone; the other eight are noise."""
    rng = np.random.default_rng(seed)
    key = rng.random((n, sk.DIMS))
    gf = np.clip(2 * key[:, 0] - 1 + rng.normal(0, 0.03, n), -1, 1)
    fire = np.arange(n) * 20
    seen = (np.arange(n) % hit_every == 0).astype(int)
    z = {"fire": fire, "round": np.zeros(n, dtype=int), "gf": gf, "key": key, "dist": np.full(n, 400.0),
         "mea": np.full(n, 0.6), "seen": seen, "hit": np.where(seen == 1, fire + 15.0, np.nan)}
    return sk.Battle(z, np.arange(n))


# @Tag("SKEY-3")
class SurfKeyFitTest(unittest.TestCase):

    def test_parse_skn(self):
        line = "0,32,SKN,0,31,30,3.00000,1," + ",".join(str(i / 10) for i in range(13)) + "\n"
        (rnd, fire), key = sk.parse_skn(line)
        self.assertEqual((rnd, fire), (0, 30))
        self.assertEqual(len(key), sk.DIMS)
        self.assertAlmostEqual(key[1], 0.1)
        self.assertIsNone(sk.parse_skn("0,1,ORC,0,1"))

    @unittest.skipIf(np is None, "numpy")
    def test_only_known_hits_count(self):
        b = battle(1, n=30)
        # the first bullet knows no hit, so the model rates from the second hit's arrival on
        self.assertFalse(b.known[0].any())
        self.assertTrue(b.known[-1].any())

    @unittest.skipIf(np is None, "numpy")
    def test_fit_finds_the_informative_dimension(self):
        train, test = [battle(1)], [battle(2)]
        ones = np.ones(sk.DIMS)
        base = sk.score(test, ones, 1.0)
        mult, width, _ = sk.descend(train)
        self.assertEqual(int(np.argmax(mult)), 0, "the weight on the one dimension the gun reads goes up most")
        self.assertGreater(sk.score(test, mult, width) - base, 0.1, "and the held-out battle scores better")


if __name__ == "__main__":
    unittest.main()
