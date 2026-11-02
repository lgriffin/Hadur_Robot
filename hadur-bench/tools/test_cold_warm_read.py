"""BENCH-174: cold_warm_read.py reads both builds' cold and warm shares per robot."""
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import cold_warm_read as cw  # noqa: E402

HEAD = "build\topponent\tseed\tcoldOk\twarmOk\tcoldScoreShare\twarmScoreShare\tdelta\n"


class ColdWarmReadTest(unittest.TestCase):
    def run_on(self, rows):
        d = tempfile.mkdtemp()
        tsv, md, out = (os.path.join(d, n) for n in ("cw.tsv", "r.md", "r.tsv"))
        with open(tsv, "w") as f:
            f.write(HEAD + "".join("\t".join(map(str, r)) + "\n" for r in rows))
        code = cw.main([tsv, "--robot", "R", "--baseline", "B", "--out", md, "--out-tsv", out])
        return code, open(md).read() if code == 0 else "", open(out).read() if code == 0 else ""

    def test_means_per_build(self):
        rows = [("B", "x 1", 1, "true", "true", 0.50, 0.60, 0.10), ("B", "x 1", 2, "true", "true", 0.50, 0.40, -0.10),
                ("R", "x 1", 1, "true", "true", 0.50, 0.30, -0.20), ("R", "x 1", 2, "true", "true", 0.50, 0.30, -0.20),
                ("B", "y 1", 1, "true", "true", 0.80, 0.90, 0.10), ("R", "y 1", 1, "true", "true", 0.80, 0.70, -0.10),
                ("R", "z 1", 1, "false", "true", 0.10, 0.90, 0.80)]
        code, md, tsv = self.run_on(rows)
        self.assertEqual(0, code)
        self.assertIn("2 robots with both builds' pairs", md)
        self.assertIn("| B: warm minus cold | +5.00 ± 9.80 |", md)
        self.assertIn("| R: warm minus cold | -15.00 ± 9.80 |", md)
        self.assertIn("x 1\t50.00\t50.00\t50.00\t30.00", tsv)
        self.assertNotIn("z 1", tsv)

    def test_missing_build_fails(self):
        code, _, _ = self.run_on([("B", "x 1", 1, "true", "true", 0.5, 0.6, 0.1)])
        self.assertEqual(1, code)


if __name__ == "__main__":
    unittest.main()
