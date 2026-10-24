# How BeepBoop and DrussGT surf, against Hadur's surf (2026-10-24)

Leigh asked (2026-10-24) why the core surf was never properly investigated, after the tracker's
gap read put two-thirds of BeepBoop's 5.4-point lead over 3.16 on mid-field defence: Hadur takes
12.8 bullet damage a round against the robots on neither shield list, Diamond 9.5, ScalarR 8.2,
Nullstride 6.8 (`docs/top3-movement-study.md`). This note reads the two strongest surfs from the
source their rumble jars ship (BeepBoop 2.0, DrussGT 3.1.16), compares them with Hadur's, and
says what the second surf built for it (MOVE-25, `move/StopPointSurf.java`) takes from each.
In the style of `docs/bench/rivals-source-read.md`. Line references: **B** = `kc/mega/` in
BeepBoop's jar, **D** = `jk/mega/dMove/` in DrussGT's, **H** = `hadur-core/src/main/java/hadur2/core/`.

## The three surfs side by side

| | Hadur 3.16 (Diamond's port) | DrussGT 3.1.16 | BeepBoop 2.0 |
|---|---|---|---|
| What is planned | an orbit direction or a stop, re-picked every tick (H move/SurfMover.java:395) | a stop point: drive there and wait (D DrussMoveGT.java:1165, goTo 1632) | a path: one of forward/halt/back per tick, kept between ticks (B move/PathSurfer.java:57) |
| Options for the first wave | 3 | every tick along both orbits up to 90 ticks, thinned to 7 px apart: 30-80 points (D 957-1044) | 6: last tick's plan, forward, back, halt, and two paths to the lowest-danger point found along forward and back, looked up in a table of 50-tick paths by end speed (B PathSurfer.java:300-325, Paths.java) |
| Second wave | full 3-option recursion, min | for each first-wave point (cheapest first, A*-style lower bound), all its stop points (D 1210-1290) | full search on the same 6 options, A* pruning (B PathSurfer.java:255) |
| Third wave | no | safest point only (D 1300-1340) | approximate, at 0.75 (B PathSurfer.java:229) |
| When it replans | every tick | when a wave or the stats change (D 1180-1190) | every tick, but last tick's plan is always an option and searched first |
| Danger at a place | weighted average of narrow kernels (one bot width) at each neighbour's firing angle, plus the enemy's hit rate (H move/MoveController.java:1113) | average of a height-normalised histogram over the precise intersection, times its width (D 1384-1425) | probability mass of a normalised histogram over the visited guess-factor range (B move/DangerEstimator.java:178) |
| Smoothing | none beyond the bot-width kernel (~0.05 of a guess factor) | Cauchy kernel, half height at 10 of 171 bins (0.12 of a guess factor) (D 1144-1162) | exponential kernel, lambda 13 (0.08 of a guess factor) (B DangerEstimator.java:262) |
| Time weight | 1 / t | (100 - t)^2 | 1 / sqrt(4 + t) |
| Ratio, a wave 10 ticks off to one 30 off | 3.0 | 1.6 | 1.6 |
| Bullet weight | damage | damage | 0.2 + power |
| Distance | DIST-1 target 400-650, attack angle; 2.5^(d0/d1)/2.5 | danger / (distance - 34); orbit backs off under 650 | exp(d0/d1); orbit backs off under 650; our escape room over his, squared (B PathSurfer.java:236) |
| Enemy gun model | 11 kNN views on 2 feature sets (simple, normal, recent1-6, light flattener, 2 flatteners), fixed weights | ~135 visit-count buffers of different segmentations and rolling depths, summed; a flattener blend once on (0.5 / 0.35 / 0.075) | 22 models: 7 simulated simple guns (head-on, linear, linear with walls, circular, average linear, nano linear, current GF), 9 kNN mimics of named guns (Druss, Diamond, Thorn, Komarious, WaveShark...) with offline-fit feature weights, 5 flatteners, an APM flattener |
| Weighting of the models | fixed | sum | each model weighted by (rolling 0.98 mean of its density at the real bullet)^3, on only inside a hit-rate band (B DangerEstimator.java:395-445) |
| Gun-heat wave | off (tested: 0.00) | yes | yes |

## What explains 12.8 against 7 to 9.5

Hadur's surf is Diamond's, faithfully (the 2026-10-19 audit), so Hadur against Diamond (12.8
against 9.5) is mostly the settings around it (distance, flattener off, shields) and those were
screened one at a time, each worth 0.1-0.5 points on the class. Against DrussGT and BeepBoop the
differences are structural. Ranked by how much of the gap each can carry:

1. **The enemy gun model.** BeepBoop's ensemble reads a simple gun from its first bullets (7
   simulated aims) and a learning gun through kNN mimics fitted offline to the guns that matter
   most, and it reweights them every bullet by how well each predicted it. Hadur has one learned
   family, no simple-aim model, and fixed weights. On the 149 mid-field bots, head-on and linear
   bullets are 4.9 of the 25.1 damage a round Hadur takes (`2026-10-19_surf-audit-diamond.md`),
   and the AES refit found the blend's terms carry no more information to re-weight
   (`docs/plan-aes.md`). This is where most of the gap should be, and it is not a planner change.
2. **A sharp danger surface under a wide choice.** Hadur's danger is a sum of bot-width kernels
   at a few dozen neighbours. With three options that is harmless; with many it is a winner's
   curse, and it is why go-to surfing lost -0.36 APS (2026-10-15): the cheapest of 40 stop
   points is mostly a gap between neighbours, a low estimate by chance. Both rivals that plan
   over many points first turn the neighbours into a normalised histogram and smooth it with a
   kernel two to three bot widths wide. Hadur never tried go-to on a smoothed surface.
3. **The second wave is nearly weightless.** At 1 / t a wave 30 ticks away counts a third of one
   10 ticks away; both rivals count it at about 60%. So Hadur dodges the first wave into places
   the second can reach, while the rivals give up a little on the first wave to stay free for the
   second. The counterfactual record's 0.3 "trapped" a round is measured on the first wave only,
   so it does not rule this out.
4. **Reach between the extremes.** Re-picking orbit or stop every tick does reach in-between
   places, but by dithering; each rival plans a path to a point and drives it. The go-to screen
   halved off-plan damage (1.0 to 0.5 a round), so a committed plan is executed better.

Settings the rivals agree on that Hadur already tested: gun-heat waves (0.00), flattener
threshold (+0.5 on the class at 8%), never closing under 650 (+0.1).

## MOVE-25, the stop-point surf

A second duel surf behind `MoveDesign.STOP_POINT_SURF` (off by default; ablation `surfb`, suffix
`sb`). It keeps Hadur's views and shadows, so it tests items 2-4 only:

- stop points every tick along both orbits until the wave passes, 7 px apart, plus standing
  still (DrussGT's options);
- danger = probability mass of the views' neighbours as a 151-bin guess-factor histogram,
  smoothed with a Cauchy kernel 0.1 of a guess factor wide (between the rivals'), over the
  precise intersection of driving there, counting only what our shadows let through; times
  damage, over sqrt(4 + t) (BeepBoop's), times Hadur's distancing factor;
- the ten cheapest first-wave points get the second wave's cheapest stop point added, pruned
  once a first-wave danger alone is not below the best total;
- the plan is kept until the waves change, a bullet is logged, or we drift 2 px off it;
- under tick pressure (level 1 and up) the three-option surf takes the tick, as go-to does.

Item 1 is the next stage: the same planner with simple-aim experts (the census thread's
`physics/SimpleAims`, on master) and accuracy-weighted views feeding the histogram.

## Smoke

See the section appended after the cloud run.
