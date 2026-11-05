"""BENCH-194: the per-name ledger (name_ledger.py), the duel mirror read (mirror_read.py) and the pc-mirror card."""

import os
import sys
import tempfile
import unittest

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, HERE)
import mirror_read as mr  # noqa: E402
import name_ledger as nl  # noqa: E402

BENCH = os.path.join(HERE, "..")


def page(rows):
    cells = "".join(f"<tr><td>1</td><td>x</td><td>{n}</td><td>compare</td><td>{s}</td><td></td><td></td><td></td>"
                    f"<td></td><td>{b}</td></tr>" for n, s, b in rows)
    return f"<table>{cells}</table>"


ARMS_HEAD = ("arm\trobot\topponent\trole\tseed\tworker\tposition\tok\trounds\tscore\ttheirScore\tscore_share\t"
             "survival_share\tbullet_share\tfirsts\tsurvival\ttheirSurvival\tbulletDamage\ttheirBulletDamage\n")


# @Tag("BENCH-194")
class MirrorTest(unittest.TestCase):

    def test_ledger_best_rival_and_gap(self):
        with tempfile.TemporaryDirectory() as d:
            files = {}
            for lab, rows in {"h": [("a.A 1", 50, 3), ("b.B 2", 90, 3)], "bb": [("a.A 1", 80, 9), ("b.B 2", 91, 9)],
                              "ns": [("a.A 1.1", 70, 9), ("b.B 2", 95, 9)]}.items():
                files[lab] = os.path.join(d, lab + ".html")
                open(files[lab], "w").write(page(rows))
            rows = nl.ledger(nl.load(files["h"]), {"bb": nl.load(files["bb"]), "ns": nl.load(files["ns"])}, 1000)
            self.assertEqual(rows[0]["name"], "a.A 1", "matched without the version, largest gap first")
            self.assertEqual(rows[0]["best_rival"], "bb")
            self.assertAlmostEqual(rows[0]["gap"], 30)
            self.assertAlmostEqual(rows[0]["second_gap"], 20)
            self.assertAlmostEqual(rows[0]["aps"], 0.03)

    def test_read_splits_the_lead(self):
        lines = [("c", "a.A 1", 0.40, 0.4, 40, 80), ("aa", "a.A 1", 0.41, 0.4, 40, 79),
                 ("bb", "a.A 1", 0.80, 0.9, 45, 20), ("sg", "a.A 1", 0.60, 0.6, 80, 70)]
        with tempfile.TemporaryDirectory() as d:
            p = os.path.join(d, "arms.tsv")
            with open(p, "w") as f:
                f.write(ARMS_HEAD)
                for arm, o, sh, sv, dealt, taken in lines:
                    f.write(f"{arm}\tr\t{o}\tx\t1\t1\t1\ttrue\t10\t0\t0\t{sh}\t{sv}\t0\t0\t0\t0\t{dealt * 10}\t{taken * 10}\n")
            rs = mr.rows(mr.read(p), ["bb", "sg"])
        self.assertEqual(rs[0]["best"], "bb")
        self.assertAlmostEqual(rs[0]["gap"], 40)
        self.assertEqual(rs[0]["edge"], "movement", "bb takes 60 less a round and deals only 5 more")

    def test_card(self):
        q = open(os.path.join(BENCH, "plans", "pc-mirror.queue")).read()
        self.assertIn("Why it should win", q)
        self.assertIn("--threshold 8 --excess 10", q, "the pilot")
        self.assertIn("if [ -f work/mirror.stop ]", q, "a failed pilot skips the night")
        for rule in ("stop: fails 30", "stop: stall 30m", "stop: skips 60 over 200 arms c aa"):
            self.assertIn(rule, q)
        panel = [l for l in open(os.path.join(BENCH, "panel-mirror.txt")) if "|" in l]
        names = {l.split("|")[0].strip() for l in panel}
        self.assertEqual(len(panel), 91)
        self.assertIn("bvh.mini.Mjolnir 0.3", names)
        for rival in ("kc.mega.BeepBoop 2.0", "oog.mega.saguaro.Saguaro 1.0", "jd.Nullstride 2.3.3"):
            self.assertNotIn(rival, names, "a rival arm cannot fight its own copy")


if __name__ == "__main__":
    unittest.main()
