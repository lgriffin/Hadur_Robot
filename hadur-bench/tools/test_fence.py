"""Tests for fence.py and the pc-fence-qualify card (BENCH-145 to BENCH-147). No battles, no clients.

    python3 -m unittest discover -s hadur-bench/tools -p "test_fence.py"
"""
import os
import sys
import tempfile
import unittest
from pathlib import Path

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import fence  # noqa: E402

# The PC as Windows numbers it: 24 cores, a core's two threads side by side, four L3 groups of 6 cores.
PC = {"l3": [list(range(12 * g, 12 * g + 12)) for g in range(4)],
      "cores": [[2 * c, 2 * c + 1] for c in range(24)], "logical": 48, "source": "test"}
# One L3 for everything (the laptop, the cloud box).
ONE_L3 = {"l3": [list(range(16))], "cores": [[2 * c, 2 * c + 1] for c in range(8)], "logical": 16, "source": "test"}


# @Tag("BENCH-145")
class SplitTest(unittest.TestCase):
    """BENCH-145: the bench and the clients get disjoint whole cores, cut along the L3 groups."""

    def test_the_pc_gives_the_last_chiplet_to_the_clients(self):
        s = fence.split(PC, env={}, local={})
        self.assertEqual(fence.format_cpus(s["bench"]), "0-35")
        self.assertEqual(fence.format_cpus(s["clients"]), "36-47")
        self.assertIn("L3", s["why"])

    def test_one_l3_group_gives_the_clients_a_quarter_of_the_cores_whole(self):
        s = fence.split(ONE_L3, env={}, local={})
        self.assertEqual(fence.format_cpus(s["clients"]), "12-15")
        self.assertEqual(fence.format_cpus(s["bench"]), "0-11")

    def test_host_local_wins_and_one_side_alone_means_the_other_is_the_rest(self):
        s = fence.split(PC, env={}, local={"FENCE_CLIENT_CPUS": "40-47"})
        self.assertEqual(fence.format_cpus(s["bench"]), "0-39")
        s = fence.split(PC, env={"HADUR_BENCH_FENCE_BENCH_CPUS": "0-23"}, local={"FENCE_CLIENT_CPUS": "40-47"})
        self.assertEqual((fence.format_cpus(s["bench"]), fence.format_cpus(s["clients"])), ("0-23", "40-47"))

    def test_overlapping_or_empty_sides_are_refused(self):
        with self.assertRaises(fence.FenceError):
            fence.split(PC, env={}, local={"FENCE_BENCH_CPUS": "0-40", "FENCE_CLIENT_CPUS": "36-47"})
        with self.assertRaises(fence.FenceError):
            fence.split(PC, env={}, local={"FENCE_BENCH_CPUS": "0-47"})
        with self.assertRaises(fence.FenceError):
            fence.split({"l3": [], "cores": [], "logical": 2, "source": "test"}, env={}, local={})

    def test_a_host_with_several_processor_groups_is_refused(self):
        with self.assertRaises(fence.FenceError):
            fence.split(dict(PC, groups=2), env={}, local={})

    def test_linux_topology_keeps_only_the_cpus_this_process_may_use(self):
        with tempfile.TemporaryDirectory() as d:
            for cpu in range(4):
                base = Path(d, f"cpu{cpu}")
                (base / "cache" / "index3").mkdir(parents=True)
                (base / "cache" / "index3" / "level").write_text("3\n")
                (base / "cache" / "index3" / "shared_cpu_list").write_text("0-1\n" if cpu < 2 else "2-3\n")
                (base / "topology").mkdir()
                (base / "topology" / "thread_siblings_list").write_text(f"{cpu}\n")
            topo = fence.topology_linux(d, allowed={0, 1, 2})
            self.assertEqual(topo["l3"], [[0, 1], [2]])
            self.assertEqual(topo["cores"], [[0], [1], [2]])

    def test_cpu_lists_and_masks_round_trip(self):
        self.assertEqual(fence.parse_cpus("0-3,8, 10-11"), [0, 1, 2, 3, 8, 10, 11])
        self.assertEqual(fence.format_cpus([11, 10, 8, 3, 2, 1, 0]), "0-3,8,10-11")
        self.assertEqual(fence.mask_of(range(36, 48)), 0xFFF000000000)
        self.assertEqual(fence.cpus_of_mask(0xFFF000000000), list(range(36, 48)))
        with self.assertRaises(fence.FenceError):
            fence.parse_cpus("5-2")
        with self.assertRaises(fence.FenceError):
            fence.mask_of([64])

    def test_the_queue_fences_only_when_asked(self):
        self.assertFalse(fence.fence_on(env={}, local={}))
        self.assertTrue(fence.fence_on(env={}, local={"FENCE": "on"}))
        self.assertTrue(fence.fence_on(env={"HADUR_BENCH_FENCE": "yes"}, local={}))

    def test_linux_topology_reads_sysfs(self):
        with tempfile.TemporaryDirectory() as d:
            for cpu in range(4):
                base = Path(d, f"cpu{cpu}")
                (base / "cache" / "index3").mkdir(parents=True)
                (base / "cache" / "index3" / "level").write_text("3\n")
                (base / "cache" / "index3" / "shared_cpu_list").write_text("0-1\n" if cpu < 2 else "2-3\n")
                (base / "topology").mkdir()
                (base / "topology" / "thread_siblings_list").write_text(f"{cpu}\n")
            topo = fence.topology_linux(d)
            self.assertEqual(topo["l3"], [[0, 1], [2, 3]])
            self.assertEqual(len(topo["cores"]), 4)
            topo["logical"] = 4
            self.assertEqual(fence.split(topo, env={}, local={})["clients"], [2, 3])

    @unittest.skipUnless(hasattr(os, "sched_setaffinity"), "Linux only")
    def test_a_fenced_process_starts_children_inside_the_fence(self):
        import subprocess
        mine = sorted(os.sched_getaffinity(0))
        if len(mine) < 2:
            self.skipTest("one processor: nothing to fence")
        # The split is given, so the test does not depend on the host's topology (a 2-thread CI runner).
        env = dict(os.environ, HADUR_BENCH_FENCE_CLIENT_CPUS=str(mine[-1]))
        r = subprocess.run([sys.executable, fence.__file__, "run", "clients", "--", sys.executable, "-c",
                            "import os; print(sorted(os.sched_getaffinity(0)))"], capture_output=True, text=True, env=env)
        self.assertEqual(r.returncode, 0, r.stderr)
        self.assertEqual(eval(r.stdout.strip().splitlines()[-1]), [mine[-1]])


# @Tag("BENCH-146")
class ClientLauncherTest(unittest.TestCase):
    """BENCH-146: the everyday launcher never starts an uploading client without --live."""

    def client(self, root, name, upload):
        os.makedirs(os.path.join(root, name, "roborumble"))
        with open(os.path.join(root, name, "roborumble", "roborumble.txt"), "w") as f:
            f.write("USER=lgriffin\n" + (f"UPLOAD={upload}\n" if upload is not None else ""))

    def test_uploading_clients_are_found(self):
        with tempfile.TemporaryDirectory() as d:
            self.client(d, "rr01", "NOT")
            self.client(d, "rr02", "YES")
            self.client(d, "rr03", None)
            bad = fence.uploading_clients(["rr01:roborumble.bat", "rr02:roborumble.bat", "rr03:roborumble.bat",
                                           "rr04:roborumble.bat"], d)
            self.assertEqual([b[0].split(":")[0] for b in bad], ["rr02", "rr03", "rr04"],
                             "UPLOAD=YES, no UPLOAD line and no config all count as uploading")

    def test_the_launcher_refuses_them_before_fencing_or_starting_anything(self):
        with tempfile.TemporaryDirectory() as d:
            self.client(d, "rr01", "YES")
            code = fence.main(["clients", "rr01:roborumble.bat", "--root", d, "--out", os.path.join(d, "w")])
            self.assertEqual(code, 2)
            self.assertFalse(os.path.exists(os.path.join(d, "w")), "nothing was started")


# @Tag("BENCH-146")
class ClientKindsTest(unittest.TestCase):
    """BENCH-146: --oneone/--melee/--team pick the PC's client folders, within the client side's cores."""

    def test_kinds_map_to_the_pc_folders(self):
        self.assertEqual(fence.launches_for(2, 1, 1),
                         ["rr01:roborumble.bat", "rr02:roborumble.bat", "C:/robocode:meleerumble.bat",
                          "C:/robocode:teamrumble.bat"])
        self.assertEqual(fence.launches_for(0, 0, 1, main="D:/rc"), ["D:/rc:teamrumble.bat"])
        with self.assertRaises(fence.FenceError):
            fence.launches_for(0, 2, 0)

    def test_the_load_is_held_to_the_client_cores(self):
        self.assertEqual(fence.client_load(2, 1, 0), 4.5)
        self.assertTrue(fence.budget_line(fence.client_load(2, 1, 0), 6, False)[0])
        self.assertTrue(fence.budget_line(fence.client_load(4, 0, 0), 6, False)[0], "four 1v1 fit")
        self.assertFalse(fence.budget_line(fence.client_load(2, 1, 1), 6, False)[0], "6.5 cores do not")
        self.assertTrue(fence.budget_line(fence.client_load(2, 1, 1), 6, True)[0], "unless forced")


# @Tag("BENCH-147")
class CardTest(unittest.TestCase):
    """BENCH-147: the pc-fence-qualify card keeps uploads off and runs both sides at once."""

    def setUp(self):
        self.text = (Path(__file__).resolve().parent.parent / "plans" / "pc-fence-qualify.queue").read_text()

    def step(self, name):
        lines = self.text.splitlines()
        at = next(i for i, l in enumerate(lines) if l.startswith(name + " |"))
        block = [lines[at]]
        for l in lines[at + 1:]:
            if not l.startswith("  "):
                break
            block.append(l)
        return "\n".join(block)

    def test_uploads_go_off_first_and_come_back_only_after_the_clients_stop(self):
        self.assertIn("qualify_pc.py upload off", self.step("off"))
        for s in ("clients", "prio", "duel"):
            self.assertIn("after: off", self.step(s), s)
        self.assertIn("after: solo", self.step("off"), "the solo block runs before any client")
        self.assertIn("qualify_pc.py upload on", self.step("on"))
        self.assertIn("after: clients", self.step("on"))
        commands = [l for l in self.text.splitlines() if " | " in l and not l.startswith("#")]
        self.assertTrue(commands)
        self.assertFalse(any("--live" in l or "fence.py clients" in l for l in commands), "the card never uploads")

    def test_each_side_runs_inside_its_fence_and_side_by_side(self):
        self.assertIn("fence.py run clients", self.step("clients"))
        for s in ("solo", "duel", "duel10"):
            self.assertIn("fence.py run bench", self.step(s), s)
        self.assertIn("--parallel 10", self.step("duel10"))
        self.assertIn("set CONCURRENCY = 3", self.text)
        self.assertIn("touch ${W}/STOP", self.step("stopclients"))
        self.assertIn("after: duel10", self.step("stopclients"))
        self.assertIn("--until ${W}/STOP", self.step("prio"))

    def test_the_bench_blocks_match_the_host_check_references(self):
        for s in ("solo", "duel", "duel10"):
            self.assertIn("--set top5-s0-panel.txt --seeds 1 --seed-base 2500", self.step(s))
            self.assertIn("bisect/hadur2.Hadur_3.15.jar", self.step(s))
        self.assertIn("host_check.py solo=${B}-solo duel=${B}-duel duel10=${B}-duel10", self.step("check"))

    def test_stops_are_declared(self):
        self.assertIn("# stop:", self.text)
        for s in ("clients", "prio", "solo", "duel", "duel10"):
            self.assertIn("timeout:", self.step(s), s)


if __name__ == "__main__":
    unittest.main()
