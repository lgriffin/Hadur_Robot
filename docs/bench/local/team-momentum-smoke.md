# Team momentum (TMODE-49): OgiTeam movement read and cloud smoke, 2026-11-15

## What OgiTeam does that we do not (decompiled jar `cz.libors.OgiTeam_v1`, read only, no code taken)

The 13 Nov dodge study (PR #796) found the gap inside 300 px: a member that turned back while an enemy bullet
flew was hit 17.8% of the time (OgiTeam 6.9%), one that slowed under 2 px a tick 20.2% (11.0%); members that kept
driving were hit alike (10.4% vs 9.3%). The earlier deep dive (docs/bench/ogi-deep-dive.md) covered OgiTeam's
whole design, and its parts (dodge re-rank, team brain, path check, gang watch) already ship in our own code.
This read looked at how a member actually drives:

| | OgiTeam | HadurTeam (master) |
|---|---|---|
| Speed through a turn | `setAhead` to the spot, always full speed, back-as-front turns | caps at 4 px a tick on any turn over 45 degrees (`MeleeSeam.goTo`), unless QUARTERS has a chaser |
| Wave check drive | 30 ticks of the engine's physics from the robot's real heading and velocity (`EnemyWaves.meleeDanger`, `RobotMotion.move`) | from a standstill, already pointed at the spot, 1 px a tick up to 8 (`waveDamage`, `TeamRisk.pathDamage`) |
| Spots | 40 at 80-220 px, capped at 0.6 x nearest enemy | 160 at 100-300 px, capped at 0.8 x nearest robot |

So our check prices a turn back as cheap as going on, and the drive then brakes through it: the two moves the
study found us hit twice as often in.

## MOMENTUM (our build)

`Momentum.drive` simulates the drive with the engine's published rules (turn rate 10 - 0.75 x speed degrees,
accelerate 1, brake 2, back-as-front, the drive's own speed cap); under MOMENTUM the DODGE re-rank and the PATH
check use it, and the drive keeps full speed through turns. Team-only, off in the shipped build (FORCE_MOMENTUM);
ablations tmmomentum (mo), tmmomentums (mos, speed alone), tmmomentumd (mod, drive alone).

## Cloud smoke (4-core box, 8 gap teams x 2 seeds from 21800, 10 rounds)

Runs: mo paired with aa; mos paired with bb (same seeds), so bb - aa is the A/A. Reports: team-momentum-smoke-mo.md,
team-momentum-smoke-mos.md.

| Arm vs aa | Share points, 16 pairs |
|---|---|
| bb (A/A) | -0.7 ± 3.3 |
| mo | -0.9 ± 2.8 |
| mos (speed alone) | -1.1 ± 2.7 |

The score cannot separate any arm from the A/A at this size. Mechanism reads (tools/team_phases.py, mo vs aa, mean of 8 teams):

| Measure | mo | aa |
|---|---|---|
| Enemy hit rate on our members | 16.6% | 16.8% |
| ... fired from under 200 px | 25.4% | 28.1% |
| Our members' deaths a round | 2.17 | 2.12 |
| Our bullets hitting our own members a battle (bench) | 37.3 | 50.9 (-13.6 ± 5.7) |

Speed alone raised own-member hits (+5.1 ± 6.5). So the PC card carries mo and the drive alone (mod), each behind a
46-team pilot that stops below 0 APS.

## PC result (pc-team-momentum, BENCH-247, PR #826, 2026-11-15)

46 teams, 12 fresh seeds from 22000, gated at +0.15 APS with the 95% low end above zero against both baselines:
mod (simulated drive alone) **+0.44 ± 0.43 APS, PASS**; mo (drive plus full speed through turns) +0.34 ± 0.46, FAIL.
The drive ships on every team (TMODE-49); the full-speed part is removed. Note: an earlier drive-from-motion
switch (TMODE-39, PR #584/#599, 3 Nov) failed on the master of that day; this one also drives the teammates'-bullet
path check from real motion and stops at walls along the heading.
