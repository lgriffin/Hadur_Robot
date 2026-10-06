# 3.8's live leak, bisected locally (issue #109)

Live, 3.8 fell 1.55 ± 0.15 points per pairing against bots ranked 21st and below
([live-3.8.md](../live-3.8.md)). Issue #109 asked which stage caused it. The local bench cannot
reproduce the leak, so it does not name a stage.

All runs: the 32 opponents in `leak-38.txt`, 35 rounds, 800x600, paired by seed, CPU constant
pinned to 1488498, Robocode 1.9.5.6, on the Threadripper PC (48 logical cores). Raw rows are in
`data/bench/2026-10-06_hadur-leak38-*`. Differences below are score share in points, positive
when the first robot is better, as a mean over battle pairs with a 95% interval. Survival share
is given beside it because the live loss was mostly survival.

## Results

| Step | Pair | Seeds (battles per side) | Score share | Survival share | Skipped turns per battle, first / second |
|---|---|---|---|---|---|
| 1 | 3.8 vs 3.7 | 4 (128) | -0.43 ± 0.67 | -0.47 ± 0.79 | 12.3 / 11.3 |
| 1, loaded | 3.8 vs 3.7 | 4 (128) | +0.34 ± 0.91 | +1.15 ± 1.04 | 43.5 / 37.4 |
| 1 | 3.8 vs 3.7 | 16 (512) | **-0.14 ± 0.37** | -0.01 ± 0.39 | 14.1 / 13.8 |
| 2 | 3.8.1 (D1 only) vs 3.7 | 4 (128) | +0.06 ± 0.75 | -0.02 ± 0.87 | 10.8 / 10.1 |
| 2 | 3.8.1 (D1 only) vs 3.7 | 16 (512) | -0.36 ± 0.38 | -0.30 ± 0.42 | 13.7 / 14.3 |
| 3 | 3.8 vs 3.8.1 | 4 (128) | -0.21 ± 0.67 | -0.65 ± 0.76 | 11.4 / 11.4 |

By role in the 16-seed step 1 (score share): mid-ranked -0.03 ± 1.42 (4 opponents), lower
-0.37 ± 0.89 (10), weak -0.04 ± 0.30 (18).

Step 4, the CPU test (one seed, 35 rounds, not paired, `leak-38-cpu.txt`):

| Condition | 3.8 survival | 3.7 survival | 3.8 skipped per battle | 3.7 skipped per battle |
|---|---|---|---|---|
| own (data shared, the engine's calibrated constant: 1681861 for 3.8, 1729465 for 3.7) | 97.0% | 96.1% | 8.4 | 17.6 |
| slow (data shared, constant 1000000) | 96.8% | 95.2% | 15.1 | 11.8 |

## Reading

- **No stage leaks here.** Step 1's 16-seed interval (-0.51 to +0.23) holds no loss near the live
  1.55. D1 alone (step 2) and D2 to D5 on top of it (step 3) are each level at their sample
  sizes. Survival is level in step 1, where the live loss was concentrated.
- **The slow client is not the cause.** At the slow constant, 3.8 survives as often as 3.7, and
  skipped turns point both ways (3.8 lower in the first condition, higher in the second), so
  with one seed per cell this step shows no cost of slow clients and does not prove there is none.
- **This draw fell 0.66 live**, so the bench is also above the live figure for the same 32 robots
  (the bench's lower edge, -0.51, is just above -0.66). At most a small part of the live loss shows
  in the bench.
- **Single-opponent flags are noise.** Each 4-seed run flagged one to three opponents whose
  interval missed zero (Rapture, JGAP7247_2, Viper, MosquitoPM, GBotMarkIV) and none repeated.
  The 16-seed runs flag Leopard (-1.8 ± 0.9) in step 1 and Fenrir (-3.6 ± 2.4) in step 2, again
  different robots. 32 opponents at 95% give one to two such flags by chance.
- **Trust.** The first step 1 ran with 43.5 and 37.4 skipped turns per battle, three times the
  other runs, equally for both builds. It is kept as `step1-loaded` and its result agrees with the
  clean rerun (both level). Every other run has 10 to 14 per battle for both builds.

## How these runs differ from the issue's recipe

- The 3.8.1 and 3.8.4 jars from the project thread were not available to this session. 3.8.1 was
  built from the merge of PR #98 (D1 only), with `robot.version` and `robot.release` set to
  3.8.1 in a scratch worktree. Nothing in the repo changed.
- 3.8.4 (D1 to D4 without D5 or T1) could not be built: D2 to D4 sit on D5's shield code, and
  reverting PR #99 conflicts in `DuelController`. Step 3 is therefore 3.8 against 3.8.1. On this
  set that equals D2 to D4 against D1, because the set leaves out the shield list and T1 is
  team-only.
- Seeds were 4 as the issue's comment suggested, then step 1 and step 2 were repeated at 16.
  Step 3 was not repeated at 16.
- Step 1's "loaded" run is the first run, kept for the record.

## What would still explain the live loss

The bench differs from the live client in three ways this does not cover: the engine (the live
clients run Robocode 1.11.1, the bench 1.9.5.6; BENCH-4 can take an engine under
`hadur-bench/engines/`), opponents outside these 32 (the live figure covers ranks 21 and below,
about 1,150 robots), and profile data carried across many battles in one client. The 32 are a
draw whose live loss was 0.66, so a larger draw or the full tail would give the bench more of the
live loss to see. Choosing among these is the owner's call.
