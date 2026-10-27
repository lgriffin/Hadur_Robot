"""BENCH-102: tools/shield_s3.py builds the warm-start shield screen, the candidate t4 and its verify panel."""
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import shield_s2  # noqa: E402
import shield_s3  # noqa: E402

LISTDATA = '''final class ShieldListData {
    static String[] lines() {
        return new String[] {
            "a.Listed 1.0",
            "b.Bare",
        };
    }
}
'''
HEADER = "arm\trobot\topponent\trole\tseed\tok\tscore_share\n"


class ShieldS3Test(unittest.TestCase):
    def setUp(self):
        self.dir = tempfile.mkdtemp()

    def file(self, name, text):
        path = os.path.join(self.dir, name)
        os.makedirs(os.path.dirname(path), exist_ok=True)
        with open(path, "w", encoding="utf-8") as f:
            f.write(text)
        return path

    def test_rest(self):
        s1 = self.file("s1.txt", "# x\na.Listed 1.0 | r | a.jar\nb.Bare 3 | r | b.jar\nc.Free 1 | r | c.jar\n")
        s2 = self.file("s2.txt", "c.Free 1 | r | c.jar\nd.Done 2 | r | d.jar\n")
        done = self.file("done.txt", "d.Done 2\n")
        listdata = self.file("ShieldListData.java", LISTDATA)
        self.assertEqual(["c.Free 1 | r | c.jar\n"], shield_s3.rest([s1, s2], [done], listdata),
                         "listed (with or without version), excluded and repeated rows drop")
        self.assertEqual(4, len(shield_s3.rest([s1, s2], [])))

    def sp_log(self, run, robot, seed, arm, best, offset, exact):
        self.file(os.path.join(run, "battles", "%s-%s-%s" % (shield_s2.slug(robot), seed, arm), "hadur.log"),
                  "0,900,SP,0,900,5,%d,%.9f,%d,40,0\n" % (best, offset, exact))

    def test_warm(self):
        run = os.path.join(self.dir, "old")
        rows = ["%s\tx\t%s\tr\t%d\ttrue\t0.5\n" % (arm, robot, seed)
                for robot in ("c.Free 1", "e.Cold 1") for arm in ("sask", "sasvsk") for seed in (1, 2)]
        self.file(os.path.join(run, "arms.tsv"), HEADER + "".join(rows))
        for seed in (1, 2):
            self.sp_log(run, "c.Free 1", seed, "sask", 4, 0.02, 9)
            self.sp_log(run, "c.Free 1", seed, "sasvsk", 6, -0.01, 8)
            self.sp_log(run, "e.Cold 1", seed, "sask", 4, 0.0, 1)
        self.assertEqual(["4 0.020000000 c.Free 1"], shield_s3.warm_aims(run, ["c.Free 1", "e.Cold 1"], "sask"))
        panel = self.file("warm-panel.txt", "c.Free 1 | r | c.jar\ne.Cold 1 | r | e.jar\n")
        out = os.path.join(self.dir, "w")
        code, arms = shield_s3.warm(run, panel, "3.16", out, "sask", "sasvsk", run_build=False)
        self.assertEqual(0, code)
        self.assertEqual(["c | hadur117.Hadur 3.16 | bisect/hadur117.Hadur_3.16.jar\n",
                          "aa | hadur117.Hadur 3.16aa | bisect/hadur117.Hadur_3.16aa.jar\n",
                          "w | hadur117.Hadur 3.16mtak | bisect/hadur117.Hadur_3.16mtak.jar\n",
                          "wv | hadur117.Hadur 3.16mtmvak | bisect/hadur117.Hadur_3.16mtmvak.jar\n"], arms[1:])
        self.assertEqual(["6 -0.010000000 c.Free 1"], shield_s2.read_lines(os.path.join(out, "warm-aims-move.txt")))
        self.assertEqual((2, None), shield_s3.warm(os.path.join(self.dir, "gone"), panel, "3.16", out, "sask",
                                                   "sasvsk", run_build=False), "without part 2's records it stops")

    def test_candidate(self):
        out = os.path.join(self.dir, "w")
        self.file("w/warm-aims.txt", "4 0.020000000 c.Free 1\n")
        self.file("w/warm-aims-move.txt", "6 -0.010000000 f.Mover 1\n")
        shield = self.file("shield.tsv", "c.Free 1\tw\t7\t2\t4\t8\nf.Mover 1\twv\t9\t3\t4\t8\n")
        poison = self.file("poison.tsv", "p.One 1\twp\t6\t1\t6\t12\np.Two 1\tws\t5\t1\t6\t12\nq.Old 1\twp\t9\t2\t3\t6\n")
        only = self.file("p2.txt", "p.One 1 | r | p.jar\np.Two 1 | r | p.jar\n")
        arms = os.path.join(self.dir, "verify.arms")
        self.assertEqual(0, shield_s3.candidate(shield, poison, only, out, "3.16", arms, run_build=False))
        read = lambda n: shield_s2.read_lines(os.path.join(out, n))
        self.assertEqual(["c.Free 1", "f.Mover 1"], read("s3-adds.txt"))
        self.assertEqual(["f.Mover 1"], read("s3-moves.txt"))
        self.assertEqual(["4 0.020000000 c.Free 1", "6 -0.010000000 f.Mover 1"], read("s3-aims.txt"),
                         "each robot's aim from the arm it locked with")
        self.assertEqual((["p.One 1"], ["p.Two 1"]), (read("s3-stopgo.txt"), read("s3-stopgo2.txt")),
                         "a robot table v2 already has stays off")
        self.assertIn("t4 | hadur117.Hadur 3.16mtmvakwlwm | bisect/hadur117.Hadur_3.16mtmvakwlwm.jar\n",
                      open(arms).read())
        empty = self.file("empty.tsv", "")
        self.assertEqual(0, shield_s3.candidate(empty, empty, only, out, "3.16", arms, run_build=False))
        self.assertIn("t4 | hadur117.Hadur 3.16aa |", open(arms).read(), "nothing locked: t4 is the A/A copy")

    def test_panel(self):
        s1 = self.file("s1.txt", "".join("r.Bot%d 1 | r | r.jar\n" % i for i in range(30)))
        self.assertEqual(["r.Bot3 1 | r | r.jar\n"], shield_s3.panel([s1], ["r.Bot3 1"]))
        self.assertEqual(shield_s3.FALLBACK, len(shield_s3.panel([s1], [])), "an empty table still verifies")

    def test_card(self):
        bench = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
        queue = open(os.path.join(bench, "plans", "pc-shield-s3.queue"), encoding="utf-8").read()
        for seed in ("3100", "3200", "3300"):
            self.assertEqual(1, queue.count("--seed-base " + seed), "each run on its own seeds")
        self.assertIn("--margin 3", queue)
        self.assertIn("--bar 0.05", queue)
        self.assertIn("open_results_pr.sh claude/pc-shield-s3-results", queue)
        self.assertIn("-size +0c", queue)


if __name__ == "__main__":
    unittest.main()
