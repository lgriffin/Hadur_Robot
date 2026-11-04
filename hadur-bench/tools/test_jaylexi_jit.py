"""Tests for tools/jaylexi_jit.py (JAYLEXI-19, BENCH-190)."""
import os
import subprocess
import sys
import tempfile
import unittest

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, HERE)
from jaylexi_power2 import java_hash, table  # noqa: E402
from kitlab_prior_arm import unjava  # noqa: E402

SRC = os.path.join(HERE, "..", "..", "jaylexi", "src", "main", "java", "hadur117", "mini", "JayLexi.java")


def orb(path):
    return list(unjava(table(open(path).read(), "ORB").group(1)))


class Jit(unittest.TestCase):
    def run_tool(self, *args):
        out = os.path.join(tempfile.mkdtemp(), "o.java")
        subprocess.run([sys.executable, os.path.join(HERE, "jaylexi_jit.py"), SRC, out] + list(args),
                       check=True, capture_output=True)
        return out

    def test_base_keeps_every_orbit_and_reads_the_jitter_from_it(self):
        out = self.run_tool()
        self.assertEqual(orb(SRC), orb(out))
        self.assertIn("(Math.random() - 0.5) * ((int) orbit >> 2) / 4", open(out).read())
        # 0.6 ships the jitter against BulletCatcher alone (JAYLEXI-19).
        self.assertEqual(1, sum(c >= 400 for c in orb(out)))

    def test_all_adds_two_pi_to_every_char(self):
        self.assertEqual([c if c >= 400 else c + 628 for c in orb(SRC)], orb(self.run_tool("--all")))

    def test_pick_turns_on_only_the_picked_robot(self):
        names = unjava(table(open(SRC).read(), "NAMES").group(1))
        name = next("x%d" % i for i in range(10 ** 6) if java_hash("x%d" % i) & 0xFFFF == names[7])
        pick = os.path.join(tempfile.mkdtemp(), "pick.tsv")
        open(pick, "w").write("%s\tjt\n" % name)
        before, after = orb(SRC), orb(self.run_tool("--pick", pick))
        self.assertEqual(before[8] + 628, after[8])
        self.assertEqual(before[:8] + before[9:], after[:8] + after[9:])


if __name__ == "__main__":
    unittest.main()
