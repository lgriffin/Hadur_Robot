# Stage 2 factorial: per-opponent switch picks (L1)

Files: `work/top5-s2-half1/arms.tsv`, `work/top5-s2-half2/arms.tsv`. 1212 robots with every design point (0 left out as incomplete); picks at |effect| >= 5.0 points; held-out gain over 1217 pairings, counting only picks away from the shipped level (on in this release: sw,F; the rest off).

| Factor | Ships | Field effect (pts a robot) | Picked | of them on | Held-out gain (APS) |
|---|---|---:|---:|---:|---:|
| hj | off | +0.10 | 25 | 11 | +0.035 |
| sw | on | +0.19 | 22 | 19 | -0.012 |
| S | off | +0.06 | 17 | 13 | +0.026 |
| G | off | -0.04 | 31 | 18 | +0.068 |
| R | off | -0.08 | 39 | 12 | +0.019 |
| F | on | +0.12 | 24 | 13 | +0.041 |
| N | off | +0.05 | 10 | 6 | -0.016 |
| T | off | -0.02 | 22 | 12 | +0.015 |

Sum of the positive held-out gains: **+0.203 APS** (factors can overlap on a robot, so this is an upper end). A factor is worth a table entry at +0.03 APS or more.
