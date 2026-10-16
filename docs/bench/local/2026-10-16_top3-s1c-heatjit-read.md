# Top 3 stage 1: the stop-and-start (MOVE-13) on fresh seeds

2026-10-16. 3.13 with MOVE-13 (`heatjit`, 3.13hj: the gun-heat wave taken afresh each tick) against
3.13, both built from the branch at d8027a51 (both carry WAVE-5), paired in the same run, on
`hadur-bench/screen-311.txt`. 4 fresh seeds 951-954, 35 rounds, cloud (parallel 3, CPU constant
4138771). Leigh's PC was unavailable, so this is the cloud stand-in for the PC queue `top3-s1` at
half its seeds. The set ran as 8 interleaved chunks of 50 bots so a container restart loses only
one chunk (`work/s1c/c0..7.txt`; run reports `2026-10-16_s1c-hj-c0..7.md`). Read with
`export_battles.py --baseline-build 3.13` per chunk, joined, then `screen_paired.py`.

| Band | Opponents | Mean difference (95%) | APS it adds (95%) |
|---|---|---|---|
| 1 | 3 | +0.48 (-6.02 to +6.98) | +0.004 (-0.045 to +0.052) |
| 2 | 13 | -0.49 (-2.06 to +1.09) | -0.016 (-0.067 to +0.035) |
| 3 | 49 | -0.07 (-1.07 to +0.92) | -0.009 (-0.131 to +0.113) |
| 4 | 66 | +0.43 (-0.10 to +0.97) | +0.071 (-0.017 to +0.159) |
| 5 | 99 | +0.32 (-0.11 to +0.74) | +0.078 (-0.028 to +0.184) |
| 6 | 170 | +0.27 (+0.08 to +0.46) | +0.115 (+0.036 to +0.195) |
| All | 400 | | **+0.24 (+0.03 to +0.46)** |

Damage taken a round 12.10 to 11.86; damage dealt level (53.13, 53.14); skipped turns level
(0.13 a round).

## What it says

- **It replicates.** The first screen (seeds 201-202, the build that dithered by accident) read
  +0.23 (-0.07 to +0.54). Fresh seeds, both robots built from the same commit and paired in the
  same run, give +0.24, now clear of zero. It is a movement gain: less damage taken, the same
  damage dealt, and most of it from the weakest band (ranks 801+).
- **It is spread thin, not concentrated.** By opponent, 201 bots gain, 172 lose and 27 are level.
  Bots where all 4 seeds agree: 30 always up, 20 always down, near what chance gives (about 25
  each). The largest single moves (Holden +11.5, Wrekt -8.2 score points) are within what 4 seeds
  of noise give one bot. A per-bot movement list would mostly be choosing on noise, and the gain
  per bot (a quarter of a point) is far too small for Hadur to detect inside one battle. So this
  stays a rule for the whole field.
- **The gate.** It is short of the plan's +0.3 APS gate (`docs/plan-top3.md`), though positive in
  both screens. It is the base the protean pick (`docs/top3-movement-study.md`) is screened
  against: at a mean dwell of 1 tick the protean pick reproduces it, so it either beats it or
  falls back to it.

Next: the escape-room screen (MOVE-12, chunks `s1c-we-*`, running), then the protean pick in the lab.
