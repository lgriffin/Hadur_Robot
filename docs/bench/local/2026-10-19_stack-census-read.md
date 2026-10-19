# Census of the stack: stop-and-start + SHIELD-14 against 3.13

2026-10-19. Leigh's PC, queue `pc-1018-stack`: 3.13hjsw (MOVE-13 stop-and-start plus SHIELD-14)
against the 3.13 release on census-312.txt, all 1,212 robots, 4 seeds 991-994, 35 rounds, 0 pairs
dropped. Report `2026-10-18_pc-1018-stack-census.md`, classes `2026-10-18_census-classes.{tsv,md}`.

**+0.198 APS (+0.058 to +0.337).** Real, but under the +0.3 gate. 618 robots better, 518 worse.

| Band | Paired (points) | APS |
|---|---|---|
| 1 (1-10) | +0.47 | +0.004 |
| 2 (11-50) | -0.44 | -0.014 |
| 3 (51-200) | -0.46 (-0.99 to +0.07) | **-0.057** (floor -0.05) |
| 4 (201-400) | +0.38 | +0.062 |
| 5 (401-700) | +0.47 (+0.20 to +0.75) | +0.117 |
| 6 (701+) | +0.20 (+0.09 to +0.31) | +0.085 |

The screens predicted about +0.36 (+0.24 and +0.12); the census gives a little over half, the usual
shrink from a 4-seed screen.

## Where it loses: learning guns

Split by the share of each opponent's hits on us that the HF record classes as `learned` (20+ hits;
`hit_learned`, `hf_hits`):

| Learned share of hits | Robots | Paired (points) | APS |
|---|---|---|---|
| under 0.2 | 155 | +0.80 ± 0.45 | +0.101 |
| 0.2-0.6 | 227 | +0.08 | +0.015 |
| 0.6-0.8 | 451 | -0.01 ± 0.20 | -0.002 |
| 0.8 and over | 188 | -0.23 ± 0.41 | -0.036 |
| fewer than 20 hits | 191 | +0.75 ± 0.33 | +0.118 |

By band, the 60%+ learned group is level or slightly down everywhere except band 3, where it holds
the whole band-3 loss: **99 robots at -0.99 ± 0.62 points (-0.081 APS)**; the other 50 band-3
robots are +0.58. The stop-and-start's gain lives against guns that are not learning ones.

## Next: MOVE-17, the stop-and-start gated by the enemy's gun

The in-battle `GunClassifier` (MOVE-15: 6 hits, 60% learned) closes the gun-heat wave against
learning guns, so the surf plays as 3.13 there and keeps the stop-and-start elsewhere. Expected:
band 3 back to about level (+0.08) and +0.04 on the whole field, which puts the stack near +0.24 on
the census, still short of +0.3 alone. Screen: `hadur-bench/gate-learned-313.txt` (the 221 robots
ranked 51-400 with 60%+ learned hits), 3.13hjswgg against 3.13hjsw.
