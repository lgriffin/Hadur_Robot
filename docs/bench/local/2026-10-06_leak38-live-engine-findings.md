# 3.8's live leak on the live engine, Robocode 1.11.1 (issue #113)

Issue #113 asks whether 3.8's live loss to bots ranked 21st and below (-1.55 ± 0.15 points per
pairing) shows up when the bench runs the engine the rumble clients run, Robocode 1.11.1, instead
of 1.9.5.6. This file covers track A1. Track A2 (the 300-opponent session) is not in this file yet.

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

## What this does and does not say

- The engine version is not what separates the bench from the live loss. A1 answers the first
  question and the second ("engine or long session") narrows to the session.
- The bench here still fights 35 rounds against one opponent in a fresh engine. The live client
  runs many opponents through one engine process under a 512M heap with robot data kept. That is
  A2.
- Pairing note: the harness review (`2026-10-06_harness-review.md`) found seed pairing buys
  little variance reduction, so these intervals are valid but wide for the sample sizes.

## Files

- Reports: `2026-10-06_leak38-step1-e1111.md` and `2026-10-06_top20-e1111.md`, with per-opponent
  folders beside them.
- Raw rows: `data/bench/2026-10-06_hadur-leak38-step1-e1111-local_cold.tsv` (1024 rows) and
  `data/bench/2026-10-06_hadur-top20-e1111-local_cold.tsv` (200 rows), both in `data/catalog.tsv`.
- Run: `hadur-bench/bench-top20.sh --set leak-38.txt --seeds 16 --rounds 35 --label leak38-step1-e1111`
  then `--set top20.txt --seeds 5 --rounds 35 --label top20-e1111`, both with
  `--engine 1.11.1 --cpu-constant 1488498 --robot-jar bisect/hadur2.Hadur_3.8.jar --baseline bisect/hadur2.Hadur_3.7.jar`.
