# Stray fire in the melee crowd (BENCH-258)

46 traces. Bullets fired with three or more robots alive. A bullet's target is the living robot nearest its heading (within 25 degrees) on the firing turn; a hit on any other robot is a stray. Predictable and avoidable use the trace's truth, not Hadur's scans, so they are ceilings.

## Whose bullets hit each robot

| Robot | Damage | Aimed at it | Stray | Stray share | Stray a round |
|---|---:|---:|---:|---:|---:|
| hadur117.Hadur | 51817 | 29799 | 22018 | 42% | 23.9 |
| aaa.r.ScalarR | 678 | 500 | 179 | 26% | 8.9 |
| jk.melee.Neuromancer | 988 | 708 | 280 | 28% | 14.0 |
| cz.libors.Ogi | 844 | 403 | 441 | 52% | 22.0 |

## Where the robot stood when the stray was fired (share of stray damage)

| Robot | behind | in front | beside | drove in | no target |
|---|---:|---:|---:|---:|---:|
| hadur117.Hadur | 4% | 11% | 0% | 83% | 2% |
| aaa.r.ScalarR | 8% | 12% | 0% | 75% | 5% |
| jk.melee.Neuromancer | 1% | 25% | 0% | 74% | 0% |
| cz.libors.Ogi | 2% | 9% | 0% | 88% | 0% |

## How long the stray flew, in turns (share of stray damage)

| Robot | under 10 | 10-20 | 20-40 | 40 or more |
|---|---:|---:|---:|---:|
| hadur117.Hadur | 3% | 16% | 31% | 50% |
| aaa.r.ScalarR | 0% | 44% | 15% | 41% |
| jk.melee.Neuromancer | 0% | 28% | 37% | 35% |
| cz.libors.Ogi | 4% | 9% | 43% | 44% |

## Could the surfer draw it (share of stray damage)

| Robot | Dropped today (3 or more robots nearer the shooter) | Predictable | Avoidable |
|---|---:|---:|---:|
| hadur117.Hadur | 34% | 50% | 48% |
| aaa.r.ScalarR | 45% | 39% | 39% |
| jk.melee.Neuromancer | 29% | 52% | 52% |
| cz.libors.Ogi | 37% | 48% | 45% |

## Lane exposure

| Robot | Mean exposure | Against hadur117.Hadur | Stray damage taken in its top tenth of turns |
|---|---:|---:|---:|
| hadur117.Hadur | 0.054 | 100% | 27% |
| aaa.r.ScalarR | 0.043 | 80% | 61% |
| jk.melee.Neuromancer | 0.047 | 87% | 37% |
| cz.libors.Ogi | 0.047 | 88% | 32% |

## Verdict

Third-party bullets (M1): BUILD. Avoidable strays are 48% of hadur117.Hadur's stray damage; the gate is 30%.

Lane risk (M2): DO NOT BUILD. The top tenth of turns holds 27% of the stray damage (gate 30%); the lowest compared robot stands at 80% of hadur117.Hadur's exposure (gate 70% or less).
