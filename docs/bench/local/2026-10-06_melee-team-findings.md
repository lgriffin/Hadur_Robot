# Melee and team top 20: Hadur 3.8 against 3.7, local bench

Run on 2026-10-06 on the owner's PC (Threadripper PRO 9965WX, 48 logical cores, Windows 11), Robocode 1.9.5.6,
CPU constant 1488498 pinned, `-XX:ActiveProcessorCount=2` per battle JVM. The RoboRumble clients were stopped, so no
other Robocode JVMs ran beyond the bench's own. Nothing in `hadur-core` or `hadur-robot` was changed. The robot under
test is the released 3.8 jar and the baseline is the released 3.7 jar, paired on the same seeds.

Reports: `2026-10-06_melee-top20-3.8-vs-3.7_{A..E}.md`, `..._melee-top20-3.8-vs-3.7_per-opponent.md`,
`2026-10-06_team-top20-3.8-vs-3.7.md` and their per-opponent folders. Raw rows:
`data/bench/2026-10-06_hadur-melee-top20-local_cold.tsv` (final standings of every battle) and
`data/bench/2026-10-06_hadur-team-top20-local_cold.tsv`.

## Melee: 3.8 is about 1.3 points behind 3.7

Five fields of Hadur plus nine opponents, 10 seeds a field, 35 rounds, 1000x1000, one candidate battle and one baseline battle per seed.

| Field | 3.8 APS | 3.7 APS | Paired diff (pp) | 3.8 survival minus 3.7 (pp) |
|---|---|---|---|---|
| A | 50.8 | 52.3 | -1.5 ± 2.8 | -3.1 ± 6.4 |
| B | 50.5 | 51.0 | -0.5 ± 0.9 | -0.8 ± 2.5 |
| C | 47.6 | 51.4 | -3.9 ± 1.9 | -7.1 ± 3.6 |
| D | 52.1 | 52.3 | -0.1 ± 2.1 | -0.9 ± 4.3 |
| E | 48.8 | 49.4 | -0.6 ± 2.4 | -1.4 ± 5.5 |
| Pooled over fields | | | about -1.3 ± 1.0 | about -2.7 ± 2.1 |

The pooled row is the mean of the five field differences, with the intervals combined as if the fields were independent
(they are separate battles, but each opponent is in two or three fields). It is a rough figure, not an analyser output.

- Every field has a negative point estimate, and only C resolves on its own (-3.9 ± 1.9). The pooled difference
  excludes zero, narrowly. It is small.
- Opponent level, 3.8 minus 3.7 (pooled over each robot's fields, from the per-opponent files): ScalarR -0.6 ± 1.8,
  Neuromancer -1.5 ± 1.6, and the clearest single losses are in field C: Shadow -5.4, Mallais -5.9, Lambda -5.8,
  Numbat -5.3, Wallaby -5.2 (each with an interval of 4 to 8 points, so none resolves alone). Larger samples would
  be needed to name the robots that cost the points.
- Hadur 3.8 out-scored ScalarR and Neuromancer in none of 30 battles each, Firestarter in 2 of 20 and Diamond in 3 of 20,
  and out-scored the bottom six (Medina, Figment, Lambda, Wallaby, PastFuture, Spread) in most battles. The shape is the
  same as 3.7's field standings: the loss is spread rather than concentrated against one robot.
- The pooled 3.8 results per opponent, mean place and the field standings are in the per-opponent file. Hadur's
  mean place in a ten-robot field is 4.5 to 6.4, in the middle of the pack as in the 3.7 baseline.

### Trust: 3.8 spent more of its time in duress than 3.7

| | Skipped turns per battle | Duress ticks per battle |
|---|---|---|
| 3.8 | 68.4 | 126.6 |
| 3.7 | 76.2 | 70.5 |

Skipped turns are level (3.8 is lower), so the engine was not skipping 3.8 more. Duress ticks are 1.8 times higher for 3.8,
and field A is the extreme (211.6 against 17.0). Duress is the state Hadur enters when its own turn times look slow, and it
sheds work there. The earlier ladder, with the rumble clients running, saw the same ratio (209.8 against 113.3 on field A).
Two readings fit and the bench cannot separate them: 3.8 does more per turn in a ten-robot field and so trips its own
timer more, or 3.8 happens to run on hotter cores here. The first is a robot-side finding for the owner. If true, part of the
-1.3 is 3.8 shedding work under its own load, and a melee run on a quieter host (or with fewer parallel battles) would show
whether the gap closes. This is recorded, not tested.

### Caveats

- The candidate and baseline battle for a seed do not replay each other: runs of the same jar, opponent and seed under different
  load differ by several points in the repo's earlier files, and the pairing gives little variance reduction here
  (see `docs/bench/local/2026-10-06_harness-review.md`, G1). The intervals are valid but wide, so read a single field
  with care.
- In fields C and E some battles have fewer than 35 round records (down to 22). The final standings are still complete,
  but the per-round tables use fewer rounds. The cause is not established (harness review G14).
- Ten seeds a field gives 20 to 30 battles per robot. Differences under about 3 points per robot cannot be resolved.

## Team: 3.8 is 25.5 points ahead of 3.7

19 team opponents with 10 seeds and one with 9 (one 3.8 battle against Xmen failed, so that opponent has 9 candidate battles),
10 rounds a battle, 1200x1200.

| Measure | 3.8 | 3.7 | Paired diff (pp) |
|---|---|---|---|
| Score share, all teams | 43.5% ± 2.4 | 18.0% ± 1.1 | +25.5 ± 2.2 |
| Rounds won (3.8) | 901 of 1990 (45.3%) | | |

- 3.8 is ahead of 3.7 against 18 of 20 teams. The two it lost ground on are Nightmare (-3.9 ± 2.7) and Polylunar (-8.9 ± 4.1).
- 3.8 wins 48% to 83% of rounds against the 13 teams ranked 8th to 20th and is outscored by the top five (Combat, Firestarter, Shadow, Aleph, Nightmare), where it wins 2 to 8% of rounds, and Polylunar (4%).
  The gain over 3.7 is large against most teams, but the top teams are still out of reach.
- Xmen (rank 6) is the break: 46.7% of rounds at 37.4% share, the best of the top seven.
- Trust: skipped turns 6.4 per battle for 3.8 and 2.1 for 3.7, duress ticks 51.4 and 35.6. Both builds are lightly loaded
  and the gap is large enough that the load difference does not explain +25 points. Team 3.7's share of 18% is itself low,
  the baseline that T1 (`docs/bench/t1-team.md`) improved on.
- Team coordination counters (all 3.8 members): 311 in-lane shots out of 457,988, 0 count-below-truth records out of 33,260,
  0 LINK rejects, 0 stray shelf files, and the engine counted 4,409 of our bullets hitting our own members against 3,754
  teammate hits the members recorded.

## What the data does not say

- Neither run says why 3.8 loses in melee, only that it does by a small margin and runs in duress more.
- No claim is made about the live rumble. The leak plan's A1 (1v1 on Robocode 1.11.1) is a separate run.
