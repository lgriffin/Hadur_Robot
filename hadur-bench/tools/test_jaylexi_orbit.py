"""Tests for tools/jaylexi_orbit.py (pc-jaylexi-orb, BENCH-187)."""
import os
import subprocess
import sys
import tempfile
import unittest

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, HERE)
import jaylexi_orbit as jo  # noqa: E402
from jaylexi_power2 import java_hash, table  # noqa: E402
from kitlab_prior_arm import unjava  # noqa: E402

SRC = os.path.join(HERE, "..", "..", "jaylexi", "src", "main", "java", "hadur117", "mini", "JayLexi.java")


def orb(path):
    return list(unjava(table(open(path).read(), "ORB").group(1)))


class Orbit(unittest.TestCase):
    def run_tool(self, *args):
        d = tempfile.mkdtemp()
        out = os.path.join(d, "o.java")
        subprocess.run([sys.executable, os.path.join(HERE, "jaylexi_orbit.py"), SRC, out] + list(args),
                       check=True, capture_output=True)
        return out, d

    def test_base_reads_one_char_a_robot_plus_the_fields_all_at_115(self):
        out, _ = self.run_tool()
        src = open(out).read()
        n = len(unjava(table(src, "NAMES").group(1)))
        self.assertEqual([115] * (n + 1), orb(out))
        self.assertNotIn("ORBIT", src)
        self.assertEqual(2, src.count("orbit *") + src.count("* orbit"))

    def test_all_sets_every_char(self):
        out, _ = self.run_tool("--all", "95")
        self.assertEqual({95}, set(orb(out)))

    def test_pick_writes_only_the_picked_robots_char(self):
        names = unjava(table(jo.orbit_src(open(SRC).read()), "NAMES").group(1))
        d = tempfile.mkdtemp()
        # A made-up name whose hash lands on NAMES entry 5 alone.
        target = names[5]
        name = next("x%d" % i for i in range(10 ** 6) if java_hash("x%d" % i) & 0xFFFF == target)
        pick = os.path.join(d, "pick.tsv")
        open(pick, "w").write("%s\tnear\n" % name)
        out, _ = self.run_tool("--pick", pick, "--arm-orbit", "near=135", "--arm-orbit", "far=95")
        chars = orb(out)
        self.assertEqual(135, chars[6])
        self.assertEqual(len(chars) - 1, chars.count(115))


if __name__ == "__main__":
    unittest.main()
