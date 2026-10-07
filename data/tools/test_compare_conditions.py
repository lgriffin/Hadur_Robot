"""Tests for compare_conditions.py: python3 -m unittest discover -s data/tools"""

import json
import tempfile
import unittest
from pathlib import Path

import compare_conditions as cc

RUN = {"engine": "1.11.1", "parallel": 12, "childCpus": "2", "childFlags": ["-XX:ActiveProcessorCount=2", "-Xmx2G"],
       "cpuConstant": "robocode.cpu.constant=1488498 (pinned with --cpu-constant)", "rounds": 35}


class CompareTest(unittest.TestCase):

    def test_json_values_are_read_as_strings(self):
        self.assertEqual({"rounds": "35", "engine": "1.11.1", "child_heap": "2048", "cpu_constant": "1488498",
                          "parallel": "12", "child_cpus": "2"}, cc.from_conditions(RUN))

    def test_same_conditions_are_comparable(self):
        self.assertEqual({"comparable": True, "differences": []}, cc.compare(RUN, dict(RUN)))

    def test_heap_spelled_differently_is_the_same_heap(self):
        other = dict(RUN, childFlags=["-Xmx2048m"])
        self.assertTrue(cc.compare(RUN, other)["comparable"])

    def test_no_xmx_flag_means_uncapped_and_differs_from_a_cap(self):
        other = dict(RUN, childFlags=["-XX:ActiveProcessorCount=2"])
        r = cc.compare(RUN, other)
        self.assertFalse(r["comparable"])
        self.assertEqual(["child heap (MB): 2048 vs uncapped"], r["differences"])

    def test_child_heap_key_wins_over_the_flags(self):
        self.assertEqual("1024", cc.from_conditions(dict(RUN, childHeap="1G"))["child_heap"])

    def test_every_differing_condition_is_listed(self):
        other = dict(RUN, engine="1.9.5.6", rounds=10, parallel=16)
        r = cc.compare(RUN, other)
        self.assertFalse(r["comparable"])
        self.assertEqual(["rounds per battle: 35 vs 10", "engine: 1.11.1 vs 1.9.5.6", "parallel width: 12 vs 16"],
                         r["differences"])

    def test_a_blank_catalog_value_is_unknown_not_a_difference(self):
        old_row = {"engine": "1.11.1", "parallel": "12"}
        self.assertTrue(cc.compare(RUN, old_row)["comparable"])
        self.assertEqual(["parallel width: 12 vs 16"], cc.compare(RUN, {"parallel": "16"})["differences"])

    def test_result_has_only_the_two_documented_keys(self):
        self.assertEqual({"comparable", "differences"}, set(cc.compare(RUN, RUN)))

    def test_load_takes_a_work_directory_or_the_file(self):
        with tempfile.TemporaryDirectory() as d:
            (Path(d) / "conditions.json").write_text(json.dumps(RUN), encoding="utf-8")
            self.assertEqual(cc.from_conditions(RUN), cc.load(d))
            self.assertEqual(cc.from_conditions(RUN), cc.load(Path(d) / "conditions.json"))
            self.assertEqual("35\t1.11.1\t2048\t1488498\t12\t2", cc.catalog_suffix(d))
            self.assertIsNone(cc.catalog_suffix(Path(d) / "nowhere"))


if __name__ == "__main__":
    unittest.main()
