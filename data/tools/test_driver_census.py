#!/usr/bin/env python3
"""driver_census: each hit on us lands in the first mover class that fits it."""
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import driver_census as D  # noqa: E402


def hf(rd, t, plan="NaN"):
    return "%d,%d,HF,%d,%d,learned,0.1,0.0,0.5,300.0,2.00,1,%s,NaN,-1,---,-1" % (rd, t, rd, t, plan)


LOG = "\n".join([
    hf(0, 50, "0.40"),                          # surf: a plan on the wave
    "1,10,P,1,10,endgame,-,-,ram", hf(1, 20),   # after the ram
    "2,10,P,2,10,endgame,-,-,finish", hf(2, 20),
    "3,5,P,3,5,ram-trial,-,-,escape", hf(3, 20),
    "4,5,SH,4,5,on", hf(4, 20),
    "5,5,P,5,5,mirror,-,-,mir_1", hf(5, 20),
    hf(6, 20),                                  # no mover named: stop_go when the robot has the line
]) + "\n"


class DriverCensusTest(unittest.TestCase):

    def read(self, stop_go):
        with tempfile.NamedTemporaryFile("w", suffix=".log", delete=False) as f:
            f.write(LOG)
        try:
            return D.read_log(f.name, stop_go)
        finally:
            os.unlink(f.name)

    def test_classes(self):
        c, hits, after = self.read(False)
        self.assertEqual(7, hits)
        self.assertEqual(1, after)
        for k in ("surf", "after_ram", "finish", "rammer", "shield", "mirror", "other"):
            self.assertEqual(1, c[k], k)

    def test_stop_go_line(self):
        c, _, _ = self.read(True)
        self.assertEqual(1, c["stop_go"])
        self.assertEqual(0, c["other"])

    def test_bands(self):
        self.assertEqual("<70", D.band(60.0))
        self.assertEqual("90-95", D.band(92.0))
        self.assertEqual("95+", D.band(95.0))
        self.assertEqual("unknown", D.band(None))

    def test_trace_scores(self):
        d = tempfile.mkdtemp()
        with open(os.path.join(d, "arms.tsv"), "w") as f:
            f.write("arm\topponent\tscore_share\n")
            f.write("c\ta.B 1.0\t0.90\nc\ta.B 1.0\t0.96\naa\ta.B 1.0\t0.10\n")
        self.assertAlmostEqual(93.0, D.trace_scores(d, "c")["a.B_1.0"])
        self.assertEqual({}, D.trace_scores(tempfile.mkdtemp(), "c"))

    def test_table_lists(self):
        src = 'static String[] stopGos() {\n        return new String[] {\n            "a.B 1.0",\n        };\n    }\n'
        self.assertEqual({"a.B_1.0"}, D.table_list(src, "stopGos"))


if __name__ == "__main__":
    unittest.main()
