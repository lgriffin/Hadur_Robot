"""Tests for the cloud model of Sepia's ink (data/tools/ink_model/) and the Q0 lab card's specification."""
import json
import math
import os
import sys
import unittest

import numpy as np

HERE = os.path.dirname(os.path.abspath(__file__))
MODEL = os.path.join(HERE, "ink_model")
sys.path.insert(0, MODEL)

import shadowsim as ss  # noqa: E402
import e1  # noqa: E402
import e2  # noqa: E402
import e6  # noqa: E402


def saved(name):
    with open(os.path.join(MODEL, name), encoding="utf-8") as f:
        return json.load(f)


# @Tag("BENCH-293"): the cloud model's geometry and its saved runs.
class ShadowGeometryTest(unittest.TestCase):

    def test_bullet_speed_is_the_engines(self):
        self.assertAlmostEqual(ss.bullet_speed(0.1), 19.7)
        self.assertAlmostEqual(ss.bullet_speed(2.0), 14.0)
        self.assertAlmostEqual(ss.bullet_speed(3.0), 11.0)

    def test_a_still_body_square_on_is_37_px_of_bearing(self):
        source, body = np.array([0.0, 0.0]), np.array([450.0, 0.0])
        _, width = ss.body_samples(source, body)
        self.assertAlmostEqual(width * 450.0, 37.5, delta=0.3)   # its near face, 18 px closer, subtends more than 36

    def test_a_bullet_fired_after_the_wave_has_passed_shades_nothing(self):
        source, body = np.array([0.0, 0.0]), np.array([450.0, 0.0])
        th, _ = ss.body_samples(source, body, n=61)
        kh = ss.hit_turn(source, body, th, 14.0, 0)
        late = int(kh.max()) + 5
        aims = np.linspace(0.0, 2.0 * math.pi, 181)
        cert, poss = ss.cover(source, 0, 14.0, np.array([450.0, 150.0]), aims, 19.7, late, th, kh)
        self.assertFalse(cert.any())
        self.assertFalse(poss.any())

    def test_shade_counts_a_certain_meeting_whole_and_a_possible_one_half(self):
        cert = np.array([[True, False, False, False]])
        poss = np.array([[True, True, False, False]])
        self.assertAlmostEqual(float(ss.score(cert, poss)[0]), 0.25 + 0.5 * 0.25)

    def test_head_on_ink_shades_little_and_a_sidestep_shades_much(self):
        head_on, _ = e1.best_single(450, 14.0, 0, 2)
        aside, _ = e1.best_single(450, 14.0, 20, 2)
        self.assertLess(head_on[0], 0.12)
        self.assertGreater(aside[0], 0.55)
        self.assertGreater(aside[0], 4 * head_on[0])

    def test_leaving_late_beats_leaving_early(self):
        late = e2.union_cover(450, 14.0, 120, "late")[0]
        early = e2.union_cover(450, 14.0, 120, "early")[0]
        self.assertEqual(late, [0.489, 0.912, 0.948])       # the doc's "two shots and three" row
        self.assertGreater(late[2], early[2] + 0.1)

    def test_a_dash_stays_within_the_engines_speed_limits(self):
        for mode in ("late", "early", "run"):
            for d in (0, 0.5, 7, 12, 20, 33.5, 40, 60, 80, 100, 120, 160, 200, 240):
                steps = e2.dash_speeds(d, mode)
                if steps is None:                           # at top speed a body cannot stop in under 12 px
                    self.assertTrue(mode == "run" and 0 < d < 12, (mode, d))
                    continue
                self.assertAlmostEqual(sum(steps), d, msg=(mode, d))
                speed = 8.0 if mode == "run" and d > 0 else 0.0
                for step in steps:
                    self.assertLessEqual(step - speed, e2.ACCEL + 1e-9, (mode, d, steps))
                    self.assertLessEqual(speed - step, e2.BRAKE + 1e-9, (mode, d, steps))
                    self.assertTrue(0.0 <= step <= e2.VMAX, (mode, d, steps))
                    speed = step
                self.assertEqual(speed, 0.0, (mode, d, steps))

    def test_what_is_left_over_of_a_dash_is_taken_on_the_way_down(self):
        # 100 px: 36 px speeding up, six whole ticks at 8, 4 px left over, 12 px braking. The 4 px tick once sat
        # between the cruise and the braking, a drop from 8 to 4 and a rise back to 6 that the engine allows neither.
        self.assertEqual(e2.dash_speeds(100, "late"), [1, 2, 3, 4, 5, 6, 7, 8] + [8] * 6 + [6, 4, 4, 2, 0])
        self.assertEqual(e2.dash_speeds(40, "run"), [8, 8, 8, 6, 4, 4, 2, 0])
        togo = e2.dash_profile(100, 40, "late")
        self.assertEqual((float(togo[0]), float(togo[-1]), len(togo)), (100.0, 0.0, 40))
        self.assertTrue((np.diff(togo) <= 0).all())
        self.assertIsNone(e2.dash_profile(100, 12, "late"))  # no time for it


# @Tag("BENCH-293"): the numbers the design doc quotes are the ones in the saved runs.
class SavedRunsTest(unittest.TestCase):

    def test_the_sidestep_law(self):
        rows = {r[0]: r[1] for r in saved("e1.json")["0_450_14_2"]}
        self.assertEqual([round(100 * rows[k]) for k in (0, 10, 20, 30)], [7, 35, 63, 91])

    def test_the_stream_duel(self):
        runs = saved("e5.json")
        self.assertEqual(runs["main_ink"]["cover"], 0.483)
        self.assertEqual(runs["main_attack"]["cover"], 0.015)
        self.assertEqual(runs["main_gun7"]["cover"], 0.026)
        self.assertEqual(runs["main_ink"]["waves"], 503)
        self.assertLess(runs["still_ink"]["cover"], 0.2)

    def test_aimed_guns_find_the_body_and_ink_stops_most_of_them(self):
        runs = saved("e6.json")
        for gun in ("gf", "seg"):
            on, net = runs["run_ink"][gun]["on"], runs["run_ink"][gun]["net"]
            self.assertGreater(on, 0.10)
            self.assertLess(net, 0.5 * on)                  # the ink stops over half of the bullets on the body
            self.assertAlmostEqual(runs["run_attack"][gun]["on"], runs["run_attack"][gun]["net"], delta=0.01)
        self.assertGreater(runs["still_attack"]["seg"]["on"], 0.95)   # a still body is found every time
        self.assertGreater(runs["still_ink"]["seg"]["net"], 0.95)     # and cloud ink cannot hide it

    def test_every_forecast_in_the_saved_runs_matched_the_path_as_run(self):
        runs = saved("e6.json")
        picked = [k for k in runs if k.startswith(("belief_", "exact_"))]
        self.assertEqual(len(picked), 12)
        for name in picked:
            fore = runs[name]["foresight"]
            self.assertGreater(fore["checked"], 2000, name)
            self.assertLess(fore["off"], 1e-9, name)
            self.assertGreater(fore["committed"], 0, name)  # waves that landed on the stretch already committed
        for name in runs:
            if name not in picked:
                self.assertEqual(runs[name]["foresight"]["checked"], 0, name)

    def test_a_known_simple_aim_is_dodged(self):
        runs = saved("e6.json")
        head, lead = runs["exact_headon_attack"]["headon"]["on"], runs["exact_linear_attack"]["linear"]["on"]
        self.assertLess(head, 0.02)
        self.assertLess(lead, 0.05)
        self.assertLess(head, 0.25 * runs["run_attack"]["headon"]["on"])     # far under the lottery's
        self.assertLess(lead, 0.25 * runs["run_attack"]["linear"]["on"])
        self.assertGreater(runs["exact_linear_attack"]["picks"]["reverse"], 0.8)    # it turns back on a gun that leads
        self.assertGreater(runs["exact_headon_attack"]["picks"]["continue"], 0.9)   # and keeps running from head-on


# @Tag("BENCH-293"): the aimed-gun model runs and reads a path as the census does.
class AimedGunsTest(unittest.TestCase):

    def test_a_still_target_is_hit_by_every_census_gun(self):
        n = 400
        enemy = np.tile(np.array([400.0, 510.0]), (n, 1))
        rates = e6.census_rates([400.0] * n, [0.0] * n, enemy, 60.0, (120.0, 680.0))
        self.assertGreater(rates["off_headon"], 0.99)
        self.assertGreater(rates["off_linear"], 0.99)
        self.assertEqual(rates["rev_100"], 0.0)

    def test_a_short_run_reports_every_gun(self):
        out = e6.run(seed=31, ticks=700, policy="run", fire="attack")
        self.assertGreater(out["waves"], 30)
        for gun in ("headon", "linear", "gf", "seg"):
            self.assertTrue(0.0 <= out[gun]["net"] <= out[gun]["on"] <= 1.0)
        self.assertEqual(set(out["picks"]), {"continue", "reverse"})

    def test_the_track_end_turns_the_run_round(self):
        out = e6.run(seed=31, ticks=700, policy="run", fire="attack", p_rev=0.0)
        self.assertGreater(out["census"]["speed"], 6.0)     # it keeps running: no dithering at the ends
        self.assertLess(out["census"]["stopped"], 0.05)

    def test_a_wave_is_found_on_the_path_where_it_reaches_the_body(self):
        path, y = [400.0] * 40, 60.0
        self.assertEqual(e6.arrival(path, (400.0, 200.0), 5, 14.0, y), 15)       # 140 px at 14 px a tick
        self.assertIsNone(e6.arrival(path[:12], (400.0, 200.0), 5, 14.0, y))     # the path ends before it lands
        moving = [400.0 + 8.0 * k for k in range(60)]                            # running away from it
        self.assertGreater(e6.arrival(moving, (400.0, 200.0), 5, 14.0, y), 15)

    def test_an_option_is_forecast_from_the_path_already_committed(self):
        # Waves overlap: about two are in the air when a third is fired, and the path is committed through the
        # arrival of each. A choice moves only what follows. Its forecast once started at the end of the committed
        # path even when its own wave landed before that, and so looked at a place the body reached later.
        out = e6.run(seed=31, ticks=3000, policy="belief", fire="attack", enemy="gf")
        fore = out["foresight"]
        self.assertGreater(fore["checked"], 200)
        self.assertGreaterEqual(fore["committed"], 3)       # the case is in this run
        self.assertEqual(fore["off"], 0.0)                  # every forecast is where the wave found the body
        self.assertEqual(set(out["picks"]), {"continue", "reverse", "hold"})

    def test_the_exact_pick_takes_the_first_option_the_bullet_misses(self):
        # The bullet is held against the option's whole hit set. Held against the body's centre alone, a head-on
        # bullet fired just before a turn at the end of the track found the body on its way back: 8 of this run's
        # 103 waves, where 2 are left.
        out = e6.run(seed=31, ticks=1500, policy="exact", fire="attack", enemy="headon")
        self.assertEqual(out["foresight"]["off"], 0.0)
        self.assertLess(out["headon"]["on"], 0.03)
        self.assertGreater(out["picks"].get("continue", 0), 0.9 * sum(out["picks"].values()))
        lead = e6.run(seed=31, ticks=1500, policy="exact", fire="attack", enemy="linear")
        self.assertLess(lead["linear"]["on"], 0.05)
        self.assertGreater(lead["picks"].get("reverse", 0), 0.8 * sum(lead["picks"].values()))
        self.assertEqual(e6.EXACT["linear"][0], "reverse")
        self.assertEqual(e6.CLEAR, 8.0)


# @Tag("BENCH-295"): the Q0 lab card says what it runs, what passes and what stops the project.
class LabCardTest(unittest.TestCase):

    def test_the_card_states_its_arms_gates_and_stop_rule(self):
        path = os.path.join(HERE, "..", "..", "hadur-bench", "plans", "cloud-ink-lab.md")
        with open(path, encoding="utf-8") as f:
            card = f.read()
        self.assertIn("BENCH-295", card)
        for arm in ("silent Sepia", "jet only", "silent Hadur"):
            self.assertIn(arm, card)
        for shooter in ("HeadOn", "Linear", "Circular", "GFHist", "Knn", "PatternMatch"):
            self.assertIn(shooter, card)
        self.assertIn("35%", card)          # the cover gate
        self.assertIn("under 25%", card)    # the stop rule
        self.assertIn("1.5 times", card)    # the jet-only gate the APS estimate turns on
        self.assertIn("Stage or check: Q0", card)


if __name__ == "__main__":
    unittest.main()
