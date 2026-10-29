# The simple-gun gap to Saguaro

On the 3.19 live pages (2026-10-29), Saguaro leads Hadur by +0.45 APS on the census's simple-gun robots
(head-on, linear, linear+learning, head-on+learning and mixed guns; 434 robots, `hadur-bench/simple-guns.txt`).
That is the larger of the two groups between 3.19 (4th) and Saguaro (3rd). This page is the diagnosis.

## Live pages

Hadur survives these robots as often as Saguaro does or more (survival +0.2 to +0.7 points by gun class),
yet scores 0.4 to 1.3 points of APS less: head-on -0.41, linear -0.90, linear+learning -1.25, mixed -0.92.
Rounds are won either way, so the loss is the points the enemy scores before it dies: its bullets on us.

## Cloud bench: Hadur and Saguaro on the same robots (2026-10-29)

`hadur-bench/sg-gap-cloud.txt`: the 25 simple-gun robots with the largest live Saguaro lead plus 15 drawn
at random, 2 seeds from 4500, 35 rounds, Saguaro 1.0's jar as an arm. Report
`docs/bench/local/2026-10-29_sggap.md`, damage read from the truth logs `2026-10-29_sggap-damage.txt`.

| | Hadur 3.19 | Saguaro 1.0 |
|---|---:|---:|
| Score share | 91.9% | 94.7% |
| Rounds survived | 98.4% | 98.6% |
| Ticks a round | 483 | 499 |
| Enemy shots a round | 19.3 | 20.8 |
| Damage taken a round | 11.6 | 7.0 |
| **Damage taken an enemy shot** | **0.60** | **0.34** |

The bench reproduces the live lead (+2.75 ± 0.81 pp; +3.9 on the 25, +0.9 on the random 15). Round length,
shots and survival are level. **The gap is dodging**: Hadur is hit two to three times as often per tick at
every distance (under 150 px 103 vs 75 damage a 1,000 ticks, 150-300 px 19.5 vs 7.2, 300-450 px 9.5 vs 4.4,
beyond 9.4 vs 2.8). It holds from the first five rounds to the last, so it is not slow learning. Against some
robots Saguaro is all but untouched where Hadur is not: Flower 0.84 vs 0.00 damage a shot, Electron 0.99
vs 0.05, X1 0.61 vs 0.05, Jammy 0.88 vs 0.10, Predator 0.61 vs 0.07.

(This corrects the gun oracle's simple-gun read, docs/bench/gun-oracle.md, which took Hadur's low hit
share as a sign that dodging was not the gap.)

## Hadur's switches on the same battles (paired with 3.19)

| Arm | Score share | Damage taken a battle |
|---|---:|---:|
| Saguaro 1.0 | +2.75 ± 0.81 | -164 |
| aim members (MOVE-29, km) | **+1.05 ± 0.64** | -55 |
| aim members, standing weight 0.3 (p3) | +0.84 ± 0.67 | -50 |
| aim members, standing weight 1.0 (p1) | +1.02 ± 0.63 | -61 |
| shot-dodge planner (DODGE-6, sp) | -0.92 ± 1.13 | -26 |
| stop-and-go (POISON-1, wp) | -8.32 ± 4.02 | +320 |

The aim members close about a third of the damage gap; their standing weight does not matter (the rolling
score decides). The shot-dodge planner, built from Saguaro's ShotDodger ideas, does not help here, and
stop-and-go is for learning guns only.

## Next

- **pc-sg-aim** (BENCH-140): c, aa and km on all 434 simple-gun robots, 1 fresh seed, about 1 h on the PC,
  gate km at +0.05 APS. With pc-k1-aim's +0.07 ± 0.15 on the learning guns, a pass turns MOVE-29 on for
  every duel opponent.
- The other two thirds: Saguaro dodges these guns at every range. The next read is where Hadur's surf puts
  it when a simple-gun bullet lands (which option, which stop point, the aim's distance from it), from the
  ORC and HF records on these battles.
