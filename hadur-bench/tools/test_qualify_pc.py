import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import qualify_pc as q  # noqa: E402


# @Tag("BENCH-125")
class QualifyPcTest(unittest.TestCase):
    """BENCH-125: the PC uploads again only when its no-upload battles match clean pairings."""

    def test_upload_off_then_on_restores_the_config(self):
        with tempfile.TemporaryDirectory() as d:
            os.makedirs(os.path.join(d, "roborumble"))
            path = q.config(d)
            with open(path, "w") as f:
                f.write("USER=lgriffin\nUPLOAD=YES\nOUTPUT=./roborumble/temp/battleresults.txt\n")
            os.makedirs(os.path.join(d, "roborumble", "temp"))
            res = os.path.join(d, "roborumble", "temp", "battleresults.txt")
            q.upload("off", [d])
            with open(res, "w") as f:
                f.write("a test battle\n")
            self.assertIn("UPLOAD=NOT\n", open(path).read())
            self.assertNotIn("UPLOAD=YES", open(path).read())
            q.upload("on", [d])
            self.assertEqual("USER=lgriffin\nUPLOAD=YES\nOUTPUT=./roborumble/temp/battleresults.txt\n", open(path).read())
            self.assertFalse(os.path.exists(res), "the test battles are never uploaded")
            self.assertTrue(os.path.exists(res + ".qualify-1"))

    def test_verdict(self):
        self.assertEqual("QUALIFIED", q.verdict([0.3, -0.1] * 30)[2])
        self.assertEqual("NOT QUALIFIED", q.verdict([-3.0, -2.5] * 30)[2])
        self.assertTrue(q.verdict([0.0] * 5)[2].startswith("TOO FEW"))

    def test_score_reads_only_the_named_robot_against_clean_pairings(self):
        with tempfile.TemporaryDirectory() as d:
            clean = os.path.join(d, "clean.csv")
            with open(clean, "w") as f:
                f.write("rank,name,aps\n1,a.A 1,90\n2,b.B 1,80\n")
            head = "utc\tgame\tclient\thadur\topponent\tshare\n"
            rows = ["t\troborumble\trr01\thadur2.Hadur 9\ta.A 1\t89\n",
                    "t\troborumble\trr02\thadur2.Hadur 9\tb.B 1\t81\n",
                    "t\troborumble\trr02\thadur2.Hadur 8\tb.B 1\t10\n"] * 20
            with open(os.path.join(d, "battles.tsv"), "w") as f:
                f.write(head + "".join(rows))
            self.assertEqual("QUALIFIED", q.score(d, clean, "hadur2.Hadur 9"))
            self.assertIn("| rr01 | 20 | -1.00 |", open(os.path.join(d, "qualify.md")).read())


if __name__ == "__main__":
    unittest.main()
