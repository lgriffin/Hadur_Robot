# POW-17 energy-race power: cloud screen (BENCH-205)

Card `plans/cloud-race-power.queue`, 2026-11-07, cloud box (4 cores, 3 workers, truth log off).

## Why

Saguaro 1.1 (released 2026-11-06, public source) rebuilt its ScoreMax mode around valuing each choice by the whole
rest of the round. POW-17 is our own version of one piece of that idea: bullet power picked by an energy race
between the two guns (`EnergyRace`), fed by this battle's resolved shots. It is a per-opponent mode-table switch
(`race-power:`), empty on master.

## Screen

`race-guard.txt` (census top 50 less Nullstride 2.3.3, which no archive serves, with Saguaro 1.1 for 1.0; 40 robots
load on 1.11.2) x 3 seeds from 52000 x 35 rounds; arms c (master), aa (its copy), rp (POW-17 on every robot).

| Arm | Score share | vs c (points) | Skips a battle |
|---|---:|---:|---:|
| c | 66.90% | ref | 16.9 |
| aa | 67.47% | +0.57 +- 1.19 | 16.1 |
| rp | 68.03% | +0.85 +- 1.93 | 23.9 |

Field-wide: level (inside the A/A band). Per robot, at a 5-point margin with the interval above 0, rp locks 4:
Diamond 1.8.22 +14.8 (low +10.8), Combat 3.25.0 +13.1 (+8.1), Shadow 3.83c +8.1 (+1.6), Domogled 1.2 +5.8 (+0.4):
+0.03 APS over the field in sample. Reads: `local/2026-11-07_race-power-screen.md`, `local/2026-11-07_race-power-pick.md`.

## Confirm

The 4 picks at 6 fresh seeds from 52100 (`panel-race-confirm.txt`), 72 battles: rp +7.26 +- 4.84 points over c
on them, A/A +0.77 +- 5.47 (`local/2026-11-07_race-power-confirm.md`).

| Robot | c | aa | rp | rp - mean(c, aa) |
|---|---:|---:|---:|---:|
| voidious.Diamond 1.8.22 | 52.2 | 45.7 | 61.0 | +12.0 |
| mn.Combat 3.25.0 | 58.2 | 58.9 | 69.5 | +10.9 |
| cb.Domogled 1.2 | 62.5 | 69.5 | 69.8 | +3.8 |
| abc.Shadow 3.83c | 54.0 | 55.9 | 57.3 | +2.3 |

Diamond and Combat hold at about the screen's size; Shadow and Domogled shrink to within noise. The two that hold
are worth about +0.02 APS. Next: a whole-field PC card (1,212 robots, picks at a 5-point margin, confirm seeds),
since the screen covered only the strongest 40 and Saguaro 1.1's lead over Hadur sits below 75 APS.

## Cost

rp skips about 7 more turns a battle. A whole solve per re-fit cost 63 skipped turns in the first smoke against
DrussGT (master 9); the solve is spread at three grid rows a call.
