# Top-3 screen: replicator view weights (MOVE-16) on the stop-and-start

2026-10-18. 3.13hjrp (`heatjit,repl`: MOVE-13's stop-and-start plus MOVE-16's replicator view
weights) against 3.13hj, paired, screen-311 in 8 chunks (`work/s1c-hjrp-c0..7-*`), seeds 951-954,
cloud. Read with `export_battles.py` per chunk and `data/tools/screen_paired.py`.

| Band | Opponents | Mean difference (95%) | APS (95%) |
|---|---|---|---|
| 1 | 3 | -3.28 (-11.62 to +5.06) | -0.025 |
| 2 | 13 | -0.07 (-1.99 to +1.84) | -0.002 |
| 3 | 49 | -1.17 (-2.22 to -0.13) | -0.144 |
| 4 | 66 | +0.87 (+0.10 to +1.65) | +0.144 |
| 5 | 99 | +0.17 (-0.30 to +0.65) | +0.043 |
| 6 | 170 | -0.00 (-0.17 to +0.16) | -0.000 |
| All | 400 | | **+0.02 (-0.23 to +0.26)** |

Damage taken a round 12.13 -> 11.94; dealt 53.21 -> 53.04.

Level overall. The weights trade: band 3 (the stronger, mostly learning guns) loses about as much
as band 4 gains. Band 3 clears the -0.05 floor the wrong way, so MOVE-16 stays off and is not banked
on the stack. The lab read (level, no hole) agreed. A likely reason: against adaptive guns the view
that predicted the last hit is the one the enemy is about to move away from, so chasing it lags.
