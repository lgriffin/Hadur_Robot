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
| aim members, standing weight 0.3 (ablation aimp3, then built as kmp3) | +0.84 ± 0.67 | -50 |
| aim members, standing weight 1.0 (aimp1, built as kmp1) | +1.02 ± 0.63 | -61 |
| shot-dodge planner (DODGE-6, sp) | -0.92 ± 1.13 | -26 |
| stop-and-go (POISON-1, wp) | -8.32 ± 4.02 | +320 |

The aim members close about a third of the damage gap; their standing weight does not matter (the rolling
score decides). Those cloud jars carried the suffixes p3 and p1; the ablations now build q3 and q1, as
p3 was already pdw3's. The shot-dodge planner, built from Saguaro's ShotDodger ideas, does not help here, and
stop-and-go is for learning guns only.

## Verdict: pc-sg-aim PASS (2026-10-29, PR #439)

km minus pooled c and aa = **+0.13 ± 0.07 APS** over the 434 simple-gun robots (A/A +0.04 ± 0.18 pts,
1,302 battles, 0 failed; 286 robots up, 133 down). With pc-k1-aim's +0.07 ± 0.15 on the 432 learning
guns the field projection is about +0.2 APS. **MOVE-29 ships on from 3.20** (`MoveDesign.AIM_MEMBERS`;
ablation `noaim`, suffix kx, turns it off). Turning it on also exposed a crash on a scan at tick 0 (the
simple-aim ring read slot -1), which only the warm-up hit; fixed in the same change.

## Next (as planned before the card)

- **pc-sg-aim** (BENCH-140): c, aa and km on all 434 simple-gun robots, 1 fresh seed, about 1 h on the PC,
  gate km at +0.05 APS. With pc-k1-aim's +0.07 ± 0.15 on the learning guns, a pass turns MOVE-29 on for
  every duel opponent.
- The other two thirds: Saguaro dodges these guns at every range. The next read is where Hadur's surf puts
  it when a simple-gun bullet lands (which option, which stop point, the aim's distance from it), from the
  ORC and HF records on these battles.

## Part 2: after 3.20 (2026-10-30)

3.20 went live 3rd, 0.06 over Saguaro, with MOVE-29 on: +0.14 APS live on these robots. Saguaro still
leads by +0.31 APS on them (docs/bench/live-3.20.md). Same 40 robots, 2 seeds from 4500, 35 rounds, 3.20
and Saguaro 1.0 each on the same battles (`docs/bench/local/2026-10-30_sggap320.md`,
`2026-10-30_sggapsag.md`). Bullet damage a round from the truth logs (each rise in the enemy's energy, plus what it spent firing that tick,
is one of its bullets hitting us; `2026-10-30_sg-range.py`, table `2026-10-30_sg-range.tsv`):

| Distance | 3.20 ticks a round | 3.20 damage | Saguaro ticks | Saguaro damage | 3.20 per 1,000 ticks | Saguaro per 1,000 |
|---|---:|---:|---:|---:|---:|---:|
| under 100 px | 36.9 | 4.24 | 25.5 | 3.42 | 115 | 134 |
| 100-150 | 14.5 | 0.79 | 24.4 | 0.58 | 54 | 24 |
| 150-200 | 37.5 | 0.63 | 56.7 | 0.39 | 17 | 6.8 |
| 200-300 | 68.0 | 1.05 | 102.0 | 0.58 | 15 | 5.6 |
| 300-450 | 205.2 | 1.83 | 157.9 | 0.59 | 8.9 | 3.7 |
| 450 and beyond | 122.8 | 0.96 | 130.5 | 0.32 | 7.8 | 2.4 |
| all | | 9.49 | | 5.87 | | |

- **Two thirds of the gap is at 200 px and beyond** (+2.35 of +3.6 a round). There Hadur takes 2.5 to 3 times
  Saguaro's hits a tick. Close in, the rate a tick is level: Hadur just spends more time there.
- **What drove when we were hit** (HF records, MOVE-9): 46% of 3.20's damage came while the rammer escape
  (RAM-2/RAM-5) drove, against the close-range nanos (nanoPri, SledgeHammer, Sanguijuela, WaveRammer).
  Saguaro also takes most of its damage from those. Against Jammy the mirror path (MIR-1) drove: 15 of its
  21 damage a round, against Saguaro's 1. Of the surfed hits, 9.2 of 11.8 a round came on angles the
  views rated dangerous, and the chosen option was often the only one planned into the hit.
- **The aim members learn only from bullets that hit us.** Intercepts teach them nothing, and they read
  only three aims one tick back. Two switches, both off: **MOVE-30** (ablation aimbhb, suffix ki) scores the
  members on intercepted bullets too, and **MOVE-31** (aimwide, kw) reads all six simple angles at all three
  lags, 18 aims, with the same 0.3 total standing weight.

Cloud screen, same battles, paired with 3.20 (`2026-10-30_sgarms.md`):

| Arm | Score share vs 3.20 (pp) | Damage taken a round vs 3.20 |
|---|---:|---:|
| ki (MOVE-30) | -0.07 ± 0.57 | +0.33 ± 0.82 |
| kw (MOVE-31) | +0.34 ± 0.58 | -0.23 ± 0.76 |
| kikw (both) | +0.51 ± 0.57 | -0.36 ± 0.89 |

On this screen MOVE-29 read +1.05 ± 0.64 and then passed on the PC at +0.13 APS. kikw at half that
projects about +0.06 APS, at the gate's edge. Two battles a robot cannot settle it, so it goes to the PC:
**pc-sg-wide** (BENCH-148): c, aa, kw and kikw on all 434 simple guns, seed 5000, about 1.4 h, gate +0.05
APS for each of kw and kikw.
