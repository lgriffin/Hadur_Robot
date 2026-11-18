# Stray fire in the melee crowd (BENCH-258)

12 traces. Bullets fired with three or more robots alive. A bullet's target is the living robot nearest its heading (within 25 degrees) on the firing turn; a hit on any other robot is a stray. Predictable and avoidable use the trace's truth, not Hadur's scans, so they are ceilings.

## Whose bullets hit each robot

| Robot | Damage | Aimed at it | Stray | Stray share | Stray a round |
|---|---:|---:|---:|---:|---:|
| hadur117.Hadur | 13991 | 7717 | 6274 | 45% | 26.1 |
| aaa.r.ScalarR | 10727 | 7684 | 3043 | 28% | 12.7 |

## Where the robot stood when the stray was fired (share of stray damage)

| Robot | behind | in front | beside | drove in | no target |
|---|---:|---:|---:|---:|---:|
| hadur117.Hadur | 2% | 11% | 1% | 86% | 0% |
| aaa.r.ScalarR | 8% | 16% | 0% | 75% | 2% |

## How long the stray flew, in turns (share of stray damage)

| Robot | under 10 | 10-20 | 20-40 | 40 or more |
|---|---:|---:|---:|---:|
| hadur117.Hadur | 1% | 18% | 27% | 54% |
| aaa.r.ScalarR | 6% | 10% | 29% | 55% |

## Could the surfer draw it (share of stray damage)

| Robot | Dropped today (3 or more robots nearer the shooter) | Predictable | Avoidable |
|---|---:|---:|---:|
| hadur117.Hadur | 35% | 57% | 57% |
| aaa.r.ScalarR | 41% | 55% | 51% |

## Lane exposure

| Robot | Mean exposure | Against hadur117.Hadur | Stray damage taken in its top tenth of turns |
|---|---:|---:|---:|
| hadur117.Hadur | 0.053 | 100% | 29% |
| aaa.r.ScalarR | 0.042 | 80% | 37% |

## Verdict

Third-party bullets (M1): BUILD. Avoidable strays are 57% of hadur117.Hadur's stray damage; the gate is 30%.

Lane risk (M2): DO NOT BUILD. The top tenth of turns holds 29% of the stray damage (gate 30%); the lowest compared robot stands at 80% of hadur117.Hadur's exposure (gate 70% or less).
