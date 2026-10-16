# Team stage T5 (MGUN-8, shared gun learning): cloud screen (2026-10-16)

MGUN-8 adds teammates' sightings to each member's field-gun movement histories. This screen
asks whether that wins score on its own and on top of T3's deeper gun.

**Setup.** As in `2026-10-16_team-t3-t4-screen.md` (team-top20, seeds 1-3, 10 rounds,
1200x1200, `--cpu-constant 4863992`, two battles at once), but on a different cloud host (Xeon
at 2.30 GHz), so all four jars were run again here. 3.13 is the released team jar. `k12` is the
T3 ablation of 3.13. `t5` is PR #206's head built as 3.13t5 (MGUN-8 on, K = 3). `t5k12` is the
same build with the team K at 12. Pairs match the same team and seed. Intervals are ±1.96 SE
over the 20 team means.

| Candidate | Paired against | Share | Base share | Paired (pp) | Skipped/battle |
|---|---|---|---|---|---|
| k12 | 3.13 | 54.6% | 50.3% | **+4.32 ± 2.11** | 2.3 |
| t5 | 3.13 | 51.9% | 50.3% | +1.53 ± 1.78 | 2.0 |
| t5k12 | 3.13 | 54.2% | 50.3% | +3.85 ± 2.18 | 1.9 |
| t5k12 | k12 | 54.2% | 54.6% | **−0.47 ± 1.72** | |

(3.13 itself: 2.4 skipped turns a battle.)

**Read.**
- **T3 replicates.** On a second host, 12 situations again gain about four points
  (+4.3 here, +3.5 on the first host).
- **T5 does not add to it.** On its own MGUN-8 is +1.5, inside its interval. On top of k12 it
  is −0.5 ± 1.7, level. So more data in each history does not help once the gun draws 12
  situations. A likely reason is that a member already scans the enemies it fires at often
  enough, and teammates' sightings mostly add enemies far from its own fight.
- It costs nothing in skipped turns (1.9 to 2.0 a battle against 2.3 to 2.4).

The MGUN-8 code works and is tested, but it does not earn its place on this evidence.
