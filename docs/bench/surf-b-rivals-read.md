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

## Cloud smoke (2026-10-24)

20 robots from the 149 mid-field random movers with guess-factor guns (`flat-gf-mid.txt`, every
seventh), 35 rounds x 3 seeds, each candidate paired against an A/A copy of its base, 4-core cloud,
parallel 3. Score share is the mean paired difference over the 60 pairs, in points of share.

**Correction (2026-10-24 23:10 UTC).** The edit adding DrussGT's closeness term never landed
before smokes 2 and 3 (a review on PR #259 caught it), so smokes 1-3 all ran the same planner,
without the term:

| Smoke | Build | Score share (pp) | Damage a round, dealt / taken | Their hit rate | Fighting distance | Skipped turns a battle |
|---|---|---|---|---|---|---|
| 1 | planner, 3.15 base | +0.0 +/- 1.4 | 46.5 / 25.3 against 43.2 / 24.8 | 8.3% against 7.2% | 416 against 457 px | 9.7 against 6.4 |
| 2 | the same planner, 3.16 base | +1.4 +/- 1.3 | 41.5 / 22.2 against 39.3 / 22.5 | 6.9% against 6.5% | 422 against 451 px | 9.1 against 6.7 |
| 3 | the same + MOVE-26 simple-aim mix | -0.7 +/- 1.4 | 41.7 / 23.7 against 39.6 / 22.4 | 7.4% against 6.4% | 418 against 446 px | 9.3 against 6.0 |
| 4 | + closeness term, replans on shadow and visit changes | +0.5 +/- 1.8 (trusted pairs -0.3) | 40.6 / 23.4 against 40.1 / 23.5 | 7.0% against 7.0% | 415 against 444 px | 10.3 against 6.7 |

What smokes 1-4 say:

- **It plays.** No faults; the plan commitment makes it cheaper than the three-option surf on
  average (slow ticks fell from 15,500 to 800 in smoke 1) but its replans spike, so skipped turns
  rise by about 3 a battle.
- **The planner alone is level.** Two readings of the same build, +0.0 and +1.4, pool to about
  +0.7 +/- 1.0 points; damage taken is level or slightly worse. It fights about 30 px closer, where
  both guns hit more. Smoke 4 adds the closeness term and still fights 30 px closer, so the term is
  not the cause; the stop points themselves sit inside the preferred distance.
- **The simple-aim mix does not help** against learning guns (a spurious match leaks into the
  danger). It stays off.
- 20 robots at 3 seeds cannot price a field-wide change: the midrange lesson is that a +0.6 point
  class gain was +0.07 APS on the census. Only the census decides.

## Honest expectation and the PC proposal

**Smoke 4 read level (+0.5 +/- 1.8 pp, damage taken 23.4 against 23.5), so the card is not
proposed.** On smokes 1, 2 and 4 (the stop-point planner, without and then with the closeness term; smoke 3's
aim mix is a separate, rejected change) the planner reads level, which we take to mean about
**0 +/- 0.3 APS** on the field, a guess the census would have to confirm: a better
planner over the same danger information does not cut damage taken, which agrees with the AES
verdict that the gap is information, not choice. The PC census card
(`hadur-bench/plans/pc-surf-b.queue`, arms `plans/surf-b.arms`: census-312 x {3.16, 3.16aa,
3.16sb} x 2 seeds, about 7,300 battles, 3.5-4 h, keep at +0.3 APS with the lower end above 0) is
proposed only if smoke 4 reads clearly positive, and only on Leigh's go. Its value even when level
is that it is the first planner that can use a better enemy-gun model with many options without
overfitting, so the information stage has a planner to feed.

Next in the cloud, whatever the census says: the ensemble (stage 2 proper), as BeepBoop builds it:
each view and each simulated simple gun as its own histogram, weighted per enemy by its rolling
density at real bullets cubed, inside the stop-point planner; and find why the stop-point surf
fights closer before blaming the danger.

## MOVE-27, the enemy-gun ensemble (2026-10-25)

Hadur's main danger views learn only from bullets that hit us, but a learning gun learns from
where we drove on every wave. MOVE-27 (`move/GunMimics.java`, switch `MoveDesign.MIMICS`,
ablation `mimics`, jar suffix gm) puts six visit-count mimics of classic learning guns beside the
views. Each mimic has its own segmentation from the shooter's side (flight time, lateral and
advancing speed, acceleration, wall room, time since our last speed change) and its own rolling
depth, from 3 to 30. As BeepBoop does, every model, the views included, is scored at each real
bullet: its probability near the bullet's guess factor, relative to a uniform guess, folded into a
rolling mean. The stop-point surf rates waves on the blend, weighted by score cubed. The views
start well ahead (2 against 0.5), so early rounds play as before.

Cloud smokes on the same 20 mid-field robots, 3 seeds each, paired against the stop-point surf
alone (3.16sb):

| Smoke | Build | Score share (pp) | Damage a round, dealt / taken | Their hit rate | Our shots a battle |
|---|---|---|---|---|---|
| 5 | ensemble, seeds 1-3 | +0.4 +/- 1.5 | 38.4 / 21.1 against 41.6 / 22.1 | 6.6% against 6.8% | 1,253 against 1,319 |
| 6 | the same, fresh seeds 3101-3103 | +1.0 +/- 1.9 | 38.3 / 22.0 against 41.2 / 23.1 | 6.8% against 7.1% | 1,244 against 1,366 |
| 7 | a mimic's visit no longer ends the plan, seeds 3101-3103 | +0.4 +/- 1.8 | 38.6 / 21.5 against 41.3 / 23.0 | 6.8% against 7.2% | 1,272 against 1,376 |
| 8 | smoke 7 plus GH telemetry, against a rebuilt 3.16sb, seeds 3101-3103 | +0.9 +/- 1.7 | 38.5 / 20.9 against 39.6 / 21.6 | 6.7% against 7.0% | 1,205 against 1,259 |

What they say:

- **The ensemble does cut the damage we take.** It falls by 1.0 to 1.5 a round in all three
  smokes, with their hit rate down 0.2 to 0.4 points. No earlier movement change has moved damage
  taken against learning guns in the cloud.
- **The lost shots are mostly noise between runs.** Smokes 5-7 showed our gun firing about 7%
  fewer shots, so we dealt about 3 less a round. Smoke 8 rebuilt the 3.16sb baseline from the
  same code (the ensemble off plays bit for bit) and reran the same seeds. The baseline itself
  then fired 1,259 shots where it had fired 1,376, under heavier contention on the box (864
  skipped turns against 694). Against it the gap is 4% of shots and 1.1 dealt a round. The GH
  telemetry shows the gun off its aim on 13.1% of its cool ticks with the ensemble and 13.4%
  without, so the movement is not holding shots. The cloud box's timing noise is as large as the
  effect.
- **The models barely predict mid-field learning guns.** The GM telemetry shows every model
  scoring 1.1 to 1.6 times a uniform guess at real bullets (views 1.2 to 1.7, mimics 1.0 to 1.4).
  Only weak or simple guns go higher (Bakko 7.8, Chord 4.9, HedgehogP 4.2). With the cube, the
  mimics take most of the blend against learning guns, so in practice they act as a visit
  flattener: they steer us away from where we have been. That is BeepBoop's lesson too: against a
  good learning gun you cannot predict the bullet, but you can stop being predictable.

Estimate: all four smokes read positive (+0.4, +1.0, +0.4, +0.9 pp; pooled about +0.7 +/- 0.9).
Damage taken fell in every one. This is the first movement change since the rebuild began to move
damage taken against learning guns. On the field I estimate +0.1 to +0.5 APS, with zero inside
the range; 20 robots on a 4-core box cannot settle it. `plans/pc-surf-b.queue` now runs this
build (arm gm) against 3.16 and its A/A copy on census-312 x 2 seeds, about 3.5-4 h, gated at +0.3
APS. It is a proposal: it runs only on Leigh's go.
