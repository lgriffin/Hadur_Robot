# MOVE-17 screen: the stop-and-start gated off against learning guns

2026-10-19. 3.13hjswgg (`heatjit,swall,gungate`, commit c11a30c6) against 3.13hjsw, paired, the 221
robots ranked 51-400 whose hits on us were 60%+ `learned` in the stack's census
(`hadur-bench/gate-learned-313.txt`), 4 chunks (`work/gg-hjswgg-c0..3-*`), seeds 1001-1002, 35 rounds,
cloud.

| Group | Robots | Paired (points, 95%) | APS |
|---|---|---|---|
| All | 221 | +0.10 (-0.47 to +0.67) | +0.019 |
| Band 3 (51-200) | 99 | -0.16 (-1.21 to +0.89) | -0.013 |
| Band 4 (201-400) | 122 | +0.31 (-0.28 to +0.91) | +0.031 |

Damage taken a round 23.41 -> 23.61; dealt 44.41 -> 44.54.

**Level.** The gate does engage (Regicide: 176 of 221 hits `learned`, so it closes in round 1), but
surfing these robots without the stop-and-start does not get back the census's -0.99 points in band 3.
That group was picked after the fact from the census itself, and its interval there already reached
+0.07, so the band-3 dip reads as noise around zero, not a cost of the stop-and-start. MOVE-17 stays
off; the stack stays at 3.13hjsw.
