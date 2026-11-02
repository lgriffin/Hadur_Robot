"""Tests for tools/sanaro_scale.py (pc-sanaro-n09)."""
import contextlib
import io
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import sanaro_scale  # noqa: E402


class ScaleTest(unittest.TestCase):
    def test_cells_scale_round_and_stay_in_range(self):
        self.assertEqual([1, 32, 96, 2], sanaro_scale.scaled([1, 40, 120, 2], 0.8))
        self.assertEqual([120], sanaro_scale.scaled([110], 1.5))

    def test_rewrites_the_source(self):
        d = tempfile.mkdtemp()
        src = os.path.join(d, "Bot.java")
        with open(src, "w", encoding="utf-8") as f:
            f.write('class Bot {\n    static final String POWER = "\\50\\170";\n}\n')
        with contextlib.redirect_stdout(io.StringIO()):
            sanaro_scale.main(["--scale", "0.5", "--src", src])
        with open(src, encoding="utf-8") as f:
            self.assertIn('POWER = "\\24\\74";', f.read())

    def test_refuses_a_literal_it_cannot_read(self):
        with self.assertRaises(SystemExit):
            sanaro_scale.cells("ab")


if __name__ == "__main__":
    unittest.main()
