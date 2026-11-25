# The cloud model (BENCH-293)

The model behind every "in the model" figure of [docs/sepia-design.md](../../../docs/sepia-design.md): how much of
an enemy wave a 0.1 "ink" bullet can shade, and what that does to a robot that moves for it. It plays no battle.

It needs Python 3 and numpy. Each script writes its `.json` and `.log` beside itself; the `.json` files here are
the runs the doc quotes, and a script run again reproduces its file exactly (the seeds are fixed).

    python3 e1.py
    python3 e2.py
    python3 e5.py
    python3 e6.py 12000 2     # ticks a run, worker processes

Each takes one to five minutes on a laptop.

## Files

| File | What it computes | Where the doc uses it |
|---|---|---|
| `shadowsim.py` | Shadow geometry in the engine's order of play, as `hadur117.core.move.BulletShadows` states it: a certain shadow counts 1, a possible one a half, and a meeting only counts before the wave can meet the body | Everything below |
| `e1.py` | The best cover one ink shot gives a still body, by sidestep angle between firing spot and landing spot | The sidestep chart: 7%, 35%, 63%, 91% at 0, 10, 20, 30 degrees |
| `e2.py` | Union cover from up to three shots (ticks 2, 13, 24) along a dash to the landing spot, leaving late or early | The "two shots and three" table |
| `e4.py` | `hit_set`: the bearings that hit a moving body, and their hit turns. Imported by `e5.py` and `e6.py` | Hit-set widths |
| `e5.py` | The stream duel: 3 seeds of 2,400 ticks, five ways of firing, and the sensitivity runs. Enemy bullets are spread evenly over the hit set | The budget chart, the model table, cover by landing distance, cover by inks |
| `e6.py` | The same duel with guns that aim: the census's own offline guns (`data/tools/census_classify.py`) learn the path and fire at it. Reports how often each gun's bullet is on the body and how often it gets through the ink | The "Estimated APS" section, through `data/tools/sepia_aps.py` |

## Reading the results

`e1.json`: key `aspect_range_enemyBulletSpeed_fireTick` (for example `0_450_14_2`); each row is sidestep in
degrees, cover, aim offset in degrees, ink power, certain share.

`e2.json`: key `aspect_range_enemyBulletSpeed_mode_dashLength` (for example `0_450_14_late_120`); the value is
cover after one, two and three shots.

`e5.json`: one entry per run.

| Key | Run |
|---|---|
| `main_ink`, `main_ink1`, `main_alt`, `main_gun7`, `main_attack` | All ink; one ink per enemy shot, then attack; alternate; attack shots bent for shadow; attack only |
| `rev0.1_ink`, `rev0.2_ink`, `rev0.5_ink` | Turning back on 10%, 20%, 50% of waves (`main_ink` is 30%) |
| `pe1_*`, `pe3_*` | Enemy bullet power 1 and 3 (`main_*` is 2) |
| `D350_*` | Range 350 px (`main_*` is 450) |
| `tuned_ink` | Ink power chosen from 0.1, 0.2, 0.3 |
| `settle_*` | Braking to a stop for each wave |
| `still_*` | Standing still |

Fields: `waves`; `cover` (share of the hit set stopped first); `width` (hit set, px); `uncovered` (px left
exposed); `full` and `half` (share of waves at least 95% and 50% covered); `ink_per_wave`; `att_per_100` (attack
shots per 100 ticks); `by_side` (cover and wave count for landings 0-40, 40-80, 80-120, 120-160 and over 160 px
from where the body stood when the shot was fired); `by_inks` (cover and wave count by the number of inks that
added shade). `att_hit` is not used in the doc.

`e6.json`: one entry per gait and way of firing, 3 seeds of 12,000 ticks (about 2,550 enemy waves).

| Key | Gait (the choice made once per enemy shot) |
|---|---|
| `run_*` | Carry on, or turn back on 30% of shots: the design's two-way lottery (`run_rev0.5_*`: 50%) |
| `three_*`, `three_even_*` | Carry on, turn back or hold, at 50/25/25 and at even odds |
| `wide_*` | Those three, or either way at half speed, at even odds |
| `belief_gf_*`, `belief_seg_*`, `belief_linear_*`, `belief_headon_*` | The least exposed of carry on, turn back and hold, by where that gun's revealed bullets have gone |
| `still_*` | Standing still |

`*_ink` fires only ink, `*_attack` only attack shots. Fields: `gf`, `seg`, `linear`, `headon`, each with `on` (the
share of that gun's real shots that were on the body) and `net` (the share that got through the ink too);
`cover` (against an even spread, as in `e5.json`); `virtual` (the guns' virtual-shot hit rates as they learn);
`census` (the census's own definition on the same path: a shot every 4 ticks at a 36 px target, comparable with
the `off_*` columns of `docs/bench/local/2026-10-18_census-classes.tsv`, plus speed, stopped share, reversals per
100 ticks and dwell); `picks` (how often each option was taken).

## What the model assumes

- Our robot runs along a straight track, 450 px from an enemy that wanders in a small box and fires on its gun heat.
- Each enemy shot commits our path until its wave has passed.
- A wave is known one tick after it is fired and can be aimed at from the second.
- When the gun is cool the ink planner takes the aim that newly stops the most hit-set width over all waves in
  flight. It is greedy and looks one shot ahead.
- Our bullet stops casting when it meets the enemy's body or leaves an 800 x 600 field.
- In `e5.py` enemy bullets are spread evenly over the hit set, so cover is a share of bearings. In `e6.py` each
  gun fires one bullet a wave where it has learnt to.

## Two things to know

- **The ends of the track.** `e5.py` slows and dithers at an end of the track until its committed path runs out;
  `e6.py` turns round cleanly and mirrors the rest of the committed path. The clean turn is worth about 4 points
  of cover (53% against 48% for the same gait), so the doc's 48% is the lower of the two.
- **The guns are the census's.** They are simple by design: one guess-factor histogram, and one cut by lateral
  speed, acceleration, distance and time since reversal. A top robot's gun is better than either.

## What it leaves out

- The engine itself: this is geometry in numpy, not a battle.
- Ledger errors (a hidden or misread shot) and drift from the committed path.
- Walls, apart from the ends of the track.
- A gun that learns which landings are shaded. `e6.py`'s guns learn where the body goes, not where the ink is.

Stage Q0 in the doc measures the same numbers from truth logs in the real engine.
