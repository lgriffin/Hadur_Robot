"""Tests for ink_read.py (Sepia's cover from truth logs, docs/sepia.md): python test_ink_read.py"""

import gzip
import math
import os
import shutil
import tempfile
import unittest

import ink_read as ir


def bullet(owner, x, y, h, p):
    return f"{owner}:{x:.2f}:{y:.2f}:{h:.2f}:{p:.2f}"


def write_truth(path, rows):
    """rows: (turn, (mx, my), [bullet tokens]) for round 0."""
    with gzip.open(path, "wt") as f:
        f.write("V,1\n")
        for t, (mx, my), bs in rows:
            f.write(f"T,0,{t},{mx:.2f},{my:.2f},0.00,0.00,100.00,400.00,500.00,0.00,0.00,100.00,"
                    + " ".join(bs) + "\n")


def flight(owner, x, y, h, p, turns):
    """The positions of one bullet over {turns} turns from (x, y)."""
    v = ir.speed(p)
    return [bullet(owner, x + k * v * math.sin(h), y + k * v * math.cos(h), h, p) for k in range(turns)]


class InkReadTest(unittest.TestCase):

    def setUp(self):
        self.tmp = tempfile.mkdtemp()
        self.addCleanup(shutil.rmtree, self.tmp)

    def battle(self, name, rows, ink_lines=()):
        d = os.path.join(self.tmp, "battles", name)
        os.makedirs(d)
        write_truth(os.path.join(d, "truth.log.gz"), rows)
        with open(os.path.join(d, "hadur.log"), "w") as f:
            for line in ink_lines:
                f.write(line + "\n")

    def test_geometry(self):
        self.assertTrue(ir.seg_box(0, 0, 10, 0, 20, 0, 18))
        self.assertFalse(ir.seg_box(0, 50, 10, 50, 20, 0, 18))
        self.assertTrue(ir.seg_seg((0, -5, 0, 5), (-5, 0, 5, 0)))
        self.assertFalse(ir.seg_seg((0, -5, 0, 5), (2, 0, 9, 0)))

    def test_met_against_the_line_from_the_turn_before(self):
        # Ours flies west across x = 100 a turn before theirs (flying north) gets there: theirs is
        # moved first on the next turn and crosses our previous line.
        e = {"x": 100, "y": 90, "h": 0.0, "power": 2.0}
        o = {"x": 85, "y": 100, "h": -math.pi / 2, "power": 0.1}
        self.assertFalse(ir.seg_seg(ir.next_seg(e), ir.next_seg(o)))
        self.assertTrue(ir.met(e, o))

    def test_hit_met_and_cover(self):
        # The subject stands at (100, 300). Bullet A (north from (100, 100)) flies into it: a hit.
        # Bullet B (north from (116, 100)) would hit its right edge but meets our ink on the way.
        v = ir.speed(2.0)
        a = flight("E", 100, 100, 0.0, 2.0, 30)
        b = flight("E", 116, 100, 0.0, 2.0, 30)  # x = 116, inside the body's right edge at 118
        rows = []
        a_end = next(k for k in range(30) if 100 + (k + 1) * v >= 300 - 18)
        b_end = 6  # B is met on the next turn, between y 184 and 198
        # Our ink flies west along y = 191 and is last seen at x = 126 on B's last turn, so its next
        # segment crosses B's at (116, 191).
        ink = flight("H", 126 + 5 * ir.speed(0.1), 191, -math.pi / 2, 0.1, 6)
        for k in range(30):
            bs = []
            if k <= a_end:
                bs.append(a[k])
            if k <= b_end:
                bs.append(b[k])
            if 0 <= k - (b_end - 5) <= 5:
                bs.append(ink[k - (b_end - 5)])
            rows.append((k + 1, (100, 300), bs))
        self.battle("lab.Knn_1.0-1-sp", rows,
                    ["INK round=0 fired=1 power=2.00 option=carry width=40.0 shaded=0.400 inks=1 met=1 hit=0"])
        data = ir.collect([self.tmp], set())
        c = data[("sp", "lab.Knn_1.0")]["c"]
        self.assertEqual(2, c["fired"])
        self.assertEqual(1, c["hit"])
        self.assertEqual(1, c["met"])
        self.assertEqual(1, c["met_ink"])
        self.assertEqual(1, c["met_would_hit"])
        self.assertAlmostEqual(0.5, ir.cover(c))
        self.assertAlmostEqual(0.4, data[("sp", "lab.Knn_1.0")]["ink"]["shaded"])
        table = ir.render(data)
        self.assertIn("| sp | lab.Knn_1.0 | 2 | 50.0% | 100.0% | 50.0%", table)

    def test_meeting_before_the_body_is_not_a_hit(self):
        # Theirs would cross the body on its next segment, and our ink meets it on that turn.
        rows = [(1, (100, 300), [bullet("E", 100, 262, 0.0, 2.0), bullet("H", 108, 271, -math.pi / 2, 0.1)]),
                (2, (100, 300), [])]
        c = ir.read_round([(t, me, ir.parse_bullets(" ".join(bs))) for t, me, bs in rows])
        self.assertEqual(0, c["hit"])
        self.assertEqual(1, c["met"])


    def test_dir_names_and_t(self):
        self.assertEqual(("lab.Knn_1.0", "3", "sp"), ir.DIR_RE.match("lab.Knn_1.0-3-sp").groups())
        self.assertEqual(("lab.Knn_1.0", "3", "baseline-warm"),
                         ir.DIR_RE.match("lab.Knn_1.0-3-baseline-warm").groups())
        self.assertEqual(("lab.Knn_1.0", "3", None), ir.DIR_RE.match("lab.Knn_1.0-3").groups())
        self.assertAlmostEqual(2.120, ir.t95(16), places=2)
        self.assertAlmostEqual(2.042, ir.t95(30), places=2)


if __name__ == "__main__":
    unittest.main()
