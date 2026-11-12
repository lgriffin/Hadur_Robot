# The states melee robots are hit in (BENCH-232)

46 traces. A bullet is aimed at the living robot nearest its heading (within 25 degrees) when first seen; a hit is inferred when it is gone within 40 px of a robot whose energy fell by its damage that turn. Bullets that hit on the turn they are fired are not in a trace, so point-blank fire is undercounted for every robot. Only bullets fired with three or more alive. Robots aimed at 2000 times or more, hadur117.Hadur first, then by hit rate. A cell under 50 shots is left blank.

## Hit rate by the distance at the fire (px)

| Robot | Aimed shots | All | under 150 | 150-250 | 250-350 | 350-500 | 500-700 | over 700 |
|---|---:|---:|---:|---:|---:|---:|---:|---:|
| hadur117.Hadur | 34468 | 10.1% | 30.8% | 17.6% | 14.5% | 11.8% | 8.9% | 6.3% |

## Hit rate by the target's speed across the shooter's line (px a tick)

| Robot | Aimed shots | All | 0-1 | 1-3 | 3-5 | 5-7 | 7-8 |
|---|---:|---:|---:|---:|---:|---:|---:|
| hadur117.Hadur | 34468 | 10.1% | 11.3% | 11.0% | 10.7% | 9.9% | 8.1% |

## Hit rate by the size of the fired guess factor

| Robot | Aimed shots | All | under 0.2 | 0.2-0.5 | 0.5-0.8 | over 0.8 |
|---|---:|---:|---:|---:|---:|---:|
| hadur117.Hadur | 34468 | 10.1% | 9.2% | 10.0% | 14.6% | 18.7% |

## Where the shots find each robot, and whose they were

| Robot | Shots under 3 px a tick sideways | Shots within 0.2 of head-on | Damage aimed at another robot |
|---|---:|---:|---:|
| hadur117.Hadur | 36% | 61% | 43% |
