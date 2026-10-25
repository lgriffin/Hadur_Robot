"""Tests for tools/saor_live.py, Saor's live-shaped census (docs/plan-saor-first.md, stage 0)."""
import os
import sys
import tempfile
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import saor_live  # noqa: E402


def write(path, lines):
    os.makedirs(os.path.dirname(path), exist_ok=True)
    with open(path, "w", encoding="utf-8") as f:
        f.write("# header\n")
        for l in lines:
            f.write(l + "\n")


class SaorLiveTest(unittest.TestCase):
    def setUp(self):
        self.root = tempfile.mkdtemp()
        write(os.path.join(self.root, "c", "f01.txt"), ["mega.A 1 | melee-1 | mega.A_1.jar", "kc.micro.Figment 1.0 | melee-40 | kc.micro.Figment_1.0.jar"])
        write(os.path.join(self.root, "c", "f02.txt"), ["mega.B 1 | melee-2 | mega.B_1.jar", "mega.C 1 | melee-3 | mega.C_1.jar"])
        write(os.path.join(self.root, "c", "f03.txt"), ["micro.D 1 | melee-90 | micro.D_1.jar", "mega.E 1 | melee-4 | mega.E_1.jar"])
        self.suite = os.path.join(self.root, "suite.txt")
        write(self.suite, ["F%02d | --set c/f%02d.txt --melee true --field 1000x1000" % (i, i) for i in (1, 2, 3)])
        self.micro = os.path.join(self.root, "micro.txt")
        write(self.micro, ["kc.micro.Figment 1.0 | micromelee-1 | kc.micro.Figment_1.0.jar", "micro.D 1 | micromelee-90 | micro.D_1.jar"])
        self.out = os.path.join(self.root, "out")

    # @Tag("SAOR-16")
    def test_fields_without_a_micro_robot_are_left_out(self):
        done = saor_live.build(self.suite, self.micro, ["saor"], self.out)
        self.assertEqual(done["saor"][1], 2)
        with open(done["saor"][0], encoding="utf-8") as f:
            labels = [l.split("|")[0].strip() for l in f if "|" in l]
        self.assertEqual(labels, ["F01", "F03"])

    # @Tag("SAOR-16")
    def test_a_seated_robot_is_replaced_by_saor_in_its_own_field(self):
        saor_live.build(self.suite, self.micro, ["kc.micro.Figment 1.0", "saor"], self.out)
        with open(os.path.join(self.out, "kc.micro.Figment_1.0", "f01.txt"), encoding="utf-8") as f:
            names = [l.split("|")[0].strip() for l in f if "|" in l]
        self.assertEqual(names, ["mega.A 1", saor_live.SAOR])
        with open(os.path.join(self.out, "saor", "f01.txt"), encoding="utf-8") as f:
            self.assertIn("kc.micro.Figment 1.0", f.read())

    # @Tag("SAOR-16")
    def test_the_read_counts_the_micro_field_and_saor(self):
        saor_live.build(self.suite, self.micro, ["saor"], self.out)
        with open(os.path.join(self.out, "micro.txt"), encoding="utf-8") as f:
            names = [l.strip() for l in f if l.strip() and not l.startswith("#")]
        self.assertEqual(names, ["kc.micro.Figment 1.0", "micro.D 1", saor_live.SAOR])


if __name__ == "__main__":
    unittest.main()
