"""BENCH-101: tools/modes_v2.py splits the poison pick, picks the dodge robots and builds the verify panel."""
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import modes_v2  # noqa: E402

HEADER = "arm\trobot\topponent\trole\tseed\tok\tscore_share\n"


class ModesV2Test(unittest.TestCase):
    def setUp(self):
        self.dir = tempfile.mkdtemp()

    def file(self, name, text):
        path = os.path.join(self.dir, name)
        os.makedirs(os.path.dirname(path), exist_ok=True)
        with open(path, "w", encoding="utf-8") as f:
            f.write(text)
        return path

    def test_split(self):
        pick = self.file("pick.tsv", "a.One 1\twp\t9\t2\t3\t6\nb.Two 2\tws\t12\t4\t3\t6\nc.Three 3\twp\t6\t1\t3\t6\n")
        self.assertEqual((["a.One 1", "c.Three 3"], ["b.Two 2"]), modes_v2.split(pick))

    def sd(self, robot, seed, arm, active):
        self.file("run/battles/%s-%s-%s/hadur.log" % (robot.replace(" ", "_"), seed, arm),
                  "0,400,SD,0,400,4,2,3,0\n34,380,SD,34,380,4,30,32,%d\n" % active)

    def test_dodge(self):
        rows = [HEADER]
        for robot, c, sg, active in (("a.Read 1", 90, 93, (1, 1)), ("b.Unread 1", 90, 95, (0, 0)),
                                     ("c.Worse 1", 90, 88, (1, 1)), ("d.Half 1", 90, 91, (1, 0))):
            for seed in (1, 2):
                rows.append("c\th\t%s\tr\t%d\ttrue\t%.2f\n" % (robot, seed, c / 100.0))
                rows.append("aa\th\t%s\tr\t%d\ttrue\t%.2f\n" % (robot, seed, c / 100.0))
                rows.append("sg\th\t%s\tr\t%d\ttrue\t%.2f\n" % (robot, seed, sg / 100.0))
                self.sd(robot, seed, "sg", active[seed - 1])
        self.file("run/arms.tsv", "".join(rows))
        got = modes_v2.dodge(os.path.join(self.dir, "run"), "sg", 0.5, 0.0)
        self.assertEqual(["a.Read 1", "d.Half 1"], got, "read in half the battles and not worse")
        self.assertEqual(["a.Read 1"], modes_v2.dodge(os.path.join(self.dir, "run"), "sg", 1.0, 2.0))

    def test_candidate_spec(self):
        self.assertEqual(("sgolist,sdodgelist", "wldg"), modes_v2.candidate_spec(["a"], [], ["b"]))
        self.assertEqual(("", ""), modes_v2.candidate_spec([], [], []))
        arms = "".join(modes_v2.candidate_arms("3.16", "wlwm"))
        self.assertIn("t3 | hadur117.Hadur 3.16wlwm | bisect/hadur117.Hadur_3.16wlwm.jar", arms)

    def test_panel(self):
        s1 = self.file("p1.txt", "# x\na.One 1 | rank5-band1 | a.One_1.jar\nb.Two 2 | rank9-band1 | b.Two_2.jar\n")
        s2 = self.file("p2.txt", "c.Three 3 | rank60-band3 | c.Three_3.jar\na.One 1 | rank5-band1 | a.One_1.jar\n")
        rows = modes_v2.panel([s1, s2], ["a.One 1", "c.Three 3"])
        self.assertEqual(["a.One 1 | rank5-band1 | a.One_1.jar\n", "c.Three 3 | rank60-band3 | c.Three_3.jar\n"], rows)

    def test_panels_are_saguaro_rows(self):
        bench = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
        import table_v1
        census = {n for n, _ in table_v1.set_rows(os.path.join(bench, "census-312.txt"))}
        poison = table_v1.set_rows(os.path.join(bench, "panel-saguaro-poison.txt"))
        dodge = table_v1.set_rows(os.path.join(bench, "panel-saguaro-dodge.txt"))
        low = table_v1.set_rows(os.path.join(bench, "panel-low-normal.txt"))
        self.assertEqual(148, len(poison))
        self.assertEqual(428, len(dodge))
        self.assertEqual(148, len(low))
        names = [{n for n, _ in p} for p in (poison, dodge, low)]
        self.assertFalse(names[0] & names[1] or names[0] & names[2] or names[1] & names[2], "one panel a robot")
        self.assertTrue(all(n in census for n, _ in poison + dodge + low))


if __name__ == "__main__":
    unittest.main()
