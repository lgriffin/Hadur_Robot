# Top 3 stage 1: the gun-heat wave re-screened, and where its gain came from

2026-10-16. 3.13 with MOVE-11 switched on after the hold fix (79431ece) and WAVE-5
(`bisect/hadur2.Hadur_3.13hw.jar`, label `top3-s1-heat2`) on `hadur-bench/screen-311.txt`, seeds
201-202, cloud (parallel 3, CPU constant 4138771). It pairs with `top3-s0-hf2` (3.13 plus HF) and
with the first gun-heat build (`top3-s1-heat`, `2026-10-15_top3-s1-heat-read.md`). Run report:
`2026-10-16_top3-s1-heat2.md`. Read with `export_battles.py` on each work dir, then
`screen_paired.py`.

| Band | Opponents | Held wave − 3.13 (95%) | APS | Held wave − first build (95%) | APS |
|---|---|---|---|---|---|
| 1 | 3 | +2.69 (-0.17 to +5.55) | +0.020 | +5.37 (-4.10 to +14.84) | +0.040 |
| 2 | 13 | -1.21 (-3.51 to +1.08) | -0.039 | -0.49 (-3.42 to +2.44) | -0.016 |
| 3 | 49 | -1.21 (-2.70 to +0.29) | -0.148 | -1.19 (-2.69 to +0.31) | -0.146 |
| 4 | 66 | +0.46 (-0.57 to +1.49) | +0.076 | +0.36 (-0.59 to +1.31) | +0.059 |
| 5 | 99 | +0.24 (-0.38 to +0.86) | +0.059 | -0.33 (-0.85 to +0.19) | -0.083 |
| 6 | 170 | +0.07 (-0.21 to +0.35) | +0.030 | -0.16 (-0.41 to +0.10) | -0.066 |
| All | 400 | | **-0.00 (-0.33 to +0.32)** | | **-0.21 (-0.53 to +0.11)** |

Damage taken a round: 3.13 12.25, first build 11.87, held wave 12.17. Skipped turns a round:
0.17, 0.14, 0.25.

## Verdict

- **The gun-heat wave on its own adds nothing.** Held as the masters hold it, it reads 0.00 APS.
- **The first build's +0.23 APS came from its stop and start.** That build took a fresh imaginary
  wave every tick, so while the enemy's gun was ready the surf re-ranked its options each tick
  and reversed on most ticks (`2026-10-16_lab-first-read.md`: 3 to 15 times the reversals of
  3.13). It took 0.38 less damage a round than 3.13 and beat the held build in bands 5 and 6,
  the weak tail, where simple guns aim at where we are heading.
- In the lab (before the hold, with WAVE-5, `work/lab12f-sihw-*`) the stop-and-start build took
  less damage from HeadOn (3.2 against 4.8 a round) and PatternMatch (78.2 against 81.9), and
  starved the lab's Linear gun, which only fires on a steady aim.

So the stop and start is kept as its own switch, MOVE-13 (`HEAT_HOLD = false`, ablation
`heatjit`, suffix hj), and the PC queue `top3-s1` now runs it (with MOVE-12's escape room) at 8
seeds against 3.13. If it holds there, it is a cheap, unseen kind of movement: an erratic
stop and start set off by the enemy's gun heat, the chaotic ingredient the study looked for
(`docs/top3-movement-study.md`). The confound to keep in mind: the held build carries WAVE-5 and
the first did not; WAVE-5 only acts after 450 turns without damage, which is rare when both
robots fire.
