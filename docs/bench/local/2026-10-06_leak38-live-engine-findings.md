# 3.8's live leak on the live engine, Robocode 1.11.1 (issue #113)

Issue #113 asks whether 3.8's live loss to bots ranked 21st and below (-1.55 ± 0.15 points per
pairing) shows up when the bench runs the engine the rumble clients run, Robocode 1.11.1, instead
of 1.9.5.6. This file covers tracks A1 (fresh battles on the live engine) and A2 (a 300-opponent session in one engine process).

Conditions: Threadripper PC (48 logical cores), CPU constant pinned to 1488498, `--parallel 12`
with 2 CPUs per battle JVM, 35 rounds, paired by seed, 3.8 against 3.7, `-Engine 1.11.1`
(report headers read "Engine Robocode 1.11.1"). Differences are score share in points, positive
when 3.8 is better, as a mean over battle pairs with a 95% interval.

## Answer for A1

**The leak does not reproduce on engine 1.11.1.**

| Set | Seeds | Battle pairs | Score share, 3.8 minus 3.7 | Survival share, 3.8 minus 3.7 | Same set on 1.9.5.6 (PR #111) |
|---|---|---|---|---|---|
| Leak set (`leak-38.txt`, 32 bots) | 16 | 512 | **+0.19 ± 0.36** | +0.25 ± 0.37 | -0.14 ± 0.37 score, -0.01 ± 0.39 survival |
| 1v1 top 20 | 5 | 100 | +3.05 ± 1.84 | +8.99 ± 3.06 | not run on 1.9.5.6 at this size |

The test was "about -1 or worse with the interval below zero". The leak-set interval spans zero
and sits well above -1. The engine moved the result by about 0.3 points, which is inside the
noise.

- **Per opponent, leak set:** every paired interval spans zero. The most negative is Needle at
  -2.1 ± 2.6. The rest sit within about +/-2.4.
- **Per opponent, top 20:** DrussGT +15.2 ± 6.1 and Diamond +16.4 ± 5.7 are clearly better for
  3.8. No opponent is clearly worse. WhiteFang (-5.0 ± 5.4) is the closest.
- **Nene and Wavelet:** -0.6 ± 4.3 and -4.0 ± 7.4. PR #107 had -6.9 and -10.4. Neither loses
  more here, and neither interval excludes zero. Five seeds is a thin sample for either.
- **Skipped turns:** leak set 11.7 per battle for 3.8 and 11.1 for 3.7; top 20 21.1 and 21.0.
  The two builds are under the same load, so the comparison is trustworthy. The leak set's
  figures are lower than the 14 per battle seen on 1.9.5.6.

## A2: the 300-opponent session, engine 1.11.1

Run: `hadur-bench/session-38.txt`, 300 opponents drawn with a fixed seed from the rumble
(`session-300-opponents.txt`), fought once each in list order, 35 rounds, through one engine
JVM with a 512M heap and the robot data directory kept. 3.8 ran first, then 3.7 as the control
on the same list. Report: `2026-10-06_session-38.md`, which has the per-25-battle blocks. Each
robot's session took about 27 minutes. Figures below are means over the twelve 25-battle blocks.

| | 3.8 | 3.7 (control) |
|---|---|---|
| Survival against bots under 50 APS (weighted by battles) | 98.4% | 98.9% |
| First 50 battles / last 100 battles, weak survival | 98.9% / 98.2% | 99.1% / 98.8% |
| Survival, all opponents | 95.5% | 95.3% |
| Score share, all opponents | 87.7% | 87.4% |
| Skipped turns per battle | 10.6 | 10.5 |
| Engine disables | 0 | 0 |
| Duress ticks, whole session | 3795 | 2586 |
| Heap after GC, largest block | 8 MB | 14 MB |

- **No slide in either robot.** Weak-opponent survival does not fall block by block for 3.8, and
  the control does the same. The sessions track each other block to block.
- **Score share and all-opponent survival are level** (+0.3 and +0.2 points for 3.8). Nothing
  here resembles a 1.5-point live loss.
- **Weak-opponent survival is 0.5 points lower for 3.8** (98.4% against 98.9%), in about 150
  weak battles. One session per robot gives no interval, so this is not resolved. It is the one
  direction that matches the live loss, and it is small.
- **No engine disables** and no failed battles in either session. The heap stays tiny after GC.
- **Duress:** 3.8 logged 3795 duress ticks against 2586 for 3.7, concentrated in a few blocks.
  This is small next to the totals but it repeats the melee finding that 3.8 sheds work a little
  more often than 3.7 under load.

**Answer to #113:** neither the live engine (A1) nor a long session on that engine (A2)
reproduces a loss of about 1 point for 3.8. The remaining candidates are things the bench does
not imitate: the live client's opponent mix and pairing (it fights a rotating set, with
priority pairings), a different CPU constant and load on the client machines, and the clock the
live engine uses. Those are not in the bench's reach as it stands. A sample of live battle
results per opponent, set against local runs on the same opponents, would test the opponent mix.

## What this does and does not say

- The engine version is not what separates the bench from the live loss (A1), and a long session
  on that engine does not either (A2).
- A2 is one session per robot, so it has no interval. It would show a large slide, which it does not.
- Pairing note: the harness review (`2026-10-06_harness-review.md`) found seed pairing buys
  little variance reduction, so these intervals are valid but wide for the sample sizes.

## Files

- Reports: `2026-10-06_leak38-step1-e1111.md`, `2026-10-06_top20-e1111.md` and `2026-10-06_session-38.md`, with per-opponent
  folders beside them.
- Raw rows: `data/bench/2026-10-06_hadur-leak38-step1-e1111-local_cold.tsv` (1024 rows) and
  `data/bench/2026-10-06_hadur-top20-e1111-local_cold.tsv` (200 rows), both in `data/catalog.tsv`.
- A2 run: `mvn -q -Drobocode.version=1.11.1 compile exec:java "-Dexec.args=--session session-38.txt --robot-jar bisect/hadur2.Hadur_3.8.jar --robot 'hadur2.Hadur 3.8' --report ../docs/bench/local/2026-10-06_session-38.md"`
  from `hadur-bench/`.
- A1 run: `hadur-bench/bench-top20.sh --set leak-38.txt --seeds 16 --rounds 35 --label leak38-step1-e1111`
  then `--set top20.txt --seeds 5 --rounds 35 --label top20-e1111`, both with
  `--engine 1.11.1 --cpu-constant 1488498 --robot-jar bisect/hadur2.Hadur_3.8.jar --baseline bisect/hadur2.Hadur_3.7.jar`.
