"""Tests for hostprofile.py (BENCH-105). No battles; detection is fed fixed inputs.

    python3 -m unittest discover -s hadur-bench -p "test_hostprofile.py"
"""
import sys
import tempfile
import unittest
from pathlib import Path

sys.path.insert(0, str(Path(__file__).resolve().parent))
import hostprofile  # noqa: E402

PC = {"host": "pc", "os": "Windows 11", "cpu": "AMD Ryzen Threadripper PRO 9965WX 24-Cores", "logical": 48,
      "physical": 24, "physical_source": "GetLogicalProcessorInformationEx", "ram_total_gb": 128.0,
      "ram_free_gb": 30.0, "robocode_cpu_constant": 1488498, "robocode_properties": r"C:\robocode\config\robocode.properties",
      "on_battery": False}
LAPTOP = dict(PC, host="laptop", cpu="Intel Core i7", logical=16, physical=8, ram_total_gb=16.0, ram_free_gb=11.0,
              robocode_cpu_constant=None, robocode_properties=None)


def resolve(detected, env=None, local=None, **kw):
    with tempfile.TemporaryDirectory() as home:
        return hostprofile.resolve(detected, env=env or {}, local=local or {}, home=Path(home), **kw)


class RuleTest(unittest.TestCase):
    def test_the_pc_runs_twelve_of_every_kind_with_its_rumble_constant(self):
        # PR #232: 12 unpinned workers on the 24-core PC; "Main PC should always go max" (Leigh 2026-10-25),
        # so its free memory never narrows it.
        p = resolve(PC)
        self.assertEqual(p["workers"], {"duel": 12, "team": 12, "melee": 12})
        self.assertTrue(all(s.startswith("auto") for s in p["workers_source"].values()))
        self.assertEqual(p["cpu_constant"], 1488498)
        self.assertEqual(hostprofile.plan_variables(p)["CPU"], "--cpu-constant 1488498")
        self.assertEqual(p["min_free_gb"], 8.0)

    def test_a_laptop_holds_cores_back_and_fits_its_memory(self):
        p = resolve(LAPTOP)
        self.assertEqual(p["workers"], {"duel": 3, "team": 3, "melee": 3})
        self.assertIsNone(p["cpu_constant"])
        self.assertEqual(hostprofile.plan_variables(p)["CPU"], "")
        self.assertEqual(p["min_free_gb"], 3.2)
        tight = resolve(dict(LAPTOP, ram_free_gb=5.0))
        self.assertEqual(tight["workers"]["duel"], 1)
        self.assertIn("capped to 1 by 5.0 GB free memory", tight["workers_source"]["duel"])

    def test_melee_holds_back_more_than_duel_on_a_small_host(self):
        p = resolve(dict(LAPTOP, physical=9, ram_free_gb=60.0))
        self.assertEqual((p["workers"]["duel"], p["workers"]["melee"]), (4, 3))

    def test_never_below_one(self):
        p = resolve(dict(LAPTOP, physical=1, logical=1, ram_free_gb=0.5))
        self.assertEqual(p["workers"], {"duel": 1, "team": 1, "melee": 1})


class OverrideTest(unittest.TestCase):
    def test_precedence_is_flag_then_environment_then_host_local_then_auto(self):
        local = {"WORKERS": "5", "WORKERS_MELEE": "2"}
        self.assertEqual(resolve(LAPTOP, local=local)["workers"], {"duel": 5, "team": 5, "melee": 2})
        env = {"HADUR_BENCH_WORKERS": "4", "HADUR_BENCH_WORKERS_TEAM": "6"}
        self.assertEqual(resolve(LAPTOP, env=env, local=local)["workers"], {"duel": 4, "team": 6, "melee": 4})
        self.assertEqual(resolve(LAPTOP, env=env, local=local, workers=7)["workers"], {"duel": 7, "team": 7, "melee": 7})

    def test_bad_override_is_refused(self):
        with self.assertRaises(ValueError):
            resolve(LAPTOP, env={"HADUR_BENCH_WORKERS": "0"})
        with self.assertRaises(ValueError):
            resolve(LAPTOP, local={"WORKERS": "many"})

    def test_cpu_constant_and_work_dir_overrides(self):
        p = resolve(PC, env={"HADUR_BENCH_CPU_CONSTANT": "2000000"})
        self.assertEqual(p["cpu_constant"], 2000000)
        p = resolve(LAPTOP, local={"CPU_CONSTANT": "3100000", "WORK_DIR": "/data/bench"})
        self.assertEqual((p["cpu_constant"], p["work_dir_source"]), (3100000, "host.local WORK_DIR"))
        self.assertEqual(Path(p["work_dir"]), Path("/data/bench"))
        p = resolve(LAPTOP, env={"HADUR_BENCH_WORK": "/a"}, work_dir="/b")
        self.assertEqual(Path(p["work_dir"]), Path("/b"))

    def test_step_environment_carries_the_resolved_values(self):
        env = hostprofile.step_environment(resolve(PC), "/w/queue-x.host.json")
        self.assertEqual(env["HADUR_BENCH_WORKERS_DUEL"], "12")
        self.assertEqual(env["HADUR_BENCH_WORKERS_MELEE"], "12")
        self.assertEqual(env["HADUR_BENCH_CPU_CONSTANT"], "1488498")
        self.assertIn("24 cores / 48 threads", env["HADUR_BENCH_HOST"])
        # Feeding the environment back resolves to the same widths (the steps see one answer).
        again = resolve(LAPTOP, env=hostprofile.step_environment(resolve(PC)))
        self.assertEqual(again["workers"], {"duel": 12, "team": 12, "melee": 12})


class DetectTest(unittest.TestCase):
    CPUINFO = "".join(f"processor\t: {i}\nphysical id\t: 0\ncore id\t\t: {i % 4}\n\n" for i in range(8))

    def test_cpuinfo_counts_cores_not_threads(self):
        self.assertEqual(hostprofile.physical_cores_linux(self.CPUINFO), 4)
        two = self.CPUINFO + "".join(f"processor\t: {i}\nphysical id\t: 1\ncore id\t\t: {i % 4}\n\n" for i in range(8, 16))
        self.assertEqual(hostprofile.physical_cores_linux(two), 8)

    def test_sysfs_fallback(self):
        with tempfile.TemporaryDirectory() as d:
            for cpu, sib in enumerate(["0,4", "1,5", "2,6", "3,7", "0,4", "1,5", "2,6", "3,7"]):
                t = Path(d) / f"cpu{cpu}" / "topology"
                t.mkdir(parents=True)
                (t / "core_cpus_list").write_text(sib + "\n")
            self.assertEqual(hostprofile.physical_cores_linux("", d), 4)

    def test_robocode_properties_supply_the_constant(self):
        with tempfile.TemporaryDirectory() as d:
            (Path(d) / "config").mkdir()
            (Path(d) / "config" / "robocode.properties").write_text("robocode.options.x=1\nrobocode.cpu.constant=1488498\n")
            self.assertEqual(hostprofile.robocode_cpu_constant({"ROBOCODE_HOME": d})[0], 1488498)

    def test_host_local_parsing(self):
        with tempfile.TemporaryDirectory() as d:
            (Path(d) / "host.local").write_text("\ufeff# my laptop\nworkers = 3\nWORK_DIR = D:\\bench\n\nnonsense\n", encoding="utf-8")
            self.assertEqual(hostprofile.read_local(d), {"WORKERS": "3", "WORK_DIR": "D:\\bench"})

    def test_detect_runs_here(self):
        d = hostprofile.detect()
        self.assertGreaterEqual(d["logical"], 1)
        self.assertGreaterEqual(d["physical"], 1)
        p = hostprofile.resolve(d, env={}, local={})
        self.assertIn("workers duel", hostprofile.summary(p))


if __name__ == "__main__":
    unittest.main()
