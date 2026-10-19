# Stage 2: Hadur's surf against Diamond 1.8.22, side by side

docs/plan-midrange.md stage 2, 2026-10-19. Two read-only audits of `hadur-core` (master 3dfc6381,
switches checked on the 1v1 branch `claude/project-thread-du09qh` 37e3f10b) against the source
in `voidious.Diamond_1.8.22.jar`: the danger model (views, normalisation, kernel, bookkeeping) and
the movement (waves surfed, options, option danger, distancing, timing). Line references: **D** =
`voidious/` in the jar, **H** = `hadur-core/src/main/java/hadur2/core/`.

## What is the same

The eleven danger views (names, weights, k, divisors, caps, decay, what they learn from), the three
formulas and their attribute weights, the per-hit normalisation (0.1 / angular width x escape range
/ 0.98), the enabled test and its margin, the three options and how each is generated (orbit
destinations by precise escape angle with the 100 px stick, the frozen stop point), the predictor
chain and wall smoothing (160 / 100 / 120), the precise intersection, the damage and
time-to-impact weights, the second wave (full recursion, min over options, full weight), the
no-data fallback (GF 0 weight 3, 0.85 weight 1), the attack-angle curve
`limit(-0.45pi, 0.6 (d - 650) / 650, 0.45pi)`, the orbit-direction rules, re-deciding every tick.
The port is faithful in its structure; the differences are below.

## Differences that can cost damage against a random mover with a GF gun

| # | Aspect | Diamond | Hadur | Status |
|---|---|---|---|---|
| 1 | Gun-heat ("imaginary") wave | surfed before the shot is seen (D move/MoveEnemy.java:447-502) | none on master; on du09qh `MoveDesign.HEAT_WAVE` (held, level) and `HEAT_HOLD` (stop-and-start, in the stack as `hj`) | tested |
| 2 | Flattener threshold | padded 5.9% (D move/MoveEnemy.java:60) | 4.5% (H move/MoveController.java:62) | tested: `flt59` level on the screen, `flt8` +0.5 on the class |
| 3 | Desired distance | 650 fixed (D move/SurfMover.java:55) | DIST-1 walks in 25 px per wave to 400 while our rolling hit rate leads theirs by 5% with certainty; END-1 150 px (H policy/DistancePolicy.java:44-52, 91-103; policy/Endgame.java:17-19) | **not tested against 650 on the current stack**; on the 149 Hadur leads 15% to 7%, so it walks in and fights at 454 px (pc-midrange reports), where our box is 1.4x wider and the bullet arrives 30% sooner |
| 4 | Distancing factor | to the enemy's current position (D move/SurfMover.java:325-326, 402-411) | to the wave's source (H move/SurfMover.java:514, 849-855) | fidelity gap: a random mover is 100-300 px from where it fired by the time the wave arrives |
| 5 | Bullet-hit-bullet | the intercepted enemy bullet's angle is logged to every hit view (D move/MoveDataManager.java:211-220 via MoveEnemy.processBullet) | the wave is only flagged, nothing logged (H duel/DuelController.java:929-964) | fidelity gap: a free sample of the gun's aim per intercept, thrown away |
| 6 | Danger cache | cleared on every hit and intercept (D move/MoveDataManager.java:206-208, 227-230) | cleared only when the surfed wave changes (H move/SurfMover.java:281-282) | fidelity gap: a hit logged while the next wave is surfed is invisible to the k=1 recent views for that wave's flight |
| 7 | Danger kernel | point value 2^-|u| at the intersection centre (D move/SurfMover.java:447-449) | MOVE-4: the kernel integrated over the intersection, 0.75 at the bot's edge against Diamond's 0.5, tails 1.5x (H move/MoveController.java:815, 872-886) | Hadur's own; blurs the danger surface by a bandwidth, so neighbouring positions differ less |
| 8 | Under tick pressure | nothing changes | TickBudget: a slow tick drops the second wave for a tick, a skipped turn for the rest of the round; level 2 halves every view's k (H policy/TickBudget.java:100-116, 134-144) | Hadur's own; the class skips 0.7-0.9 turns a battle round on the PC and skip rounds take 4.4 more (census read) |
| 9 | Predictor at a wall | velocity kept (D utils/MovementPredictor.java:69-71) | velocity zeroed, PHYS-1 (H physics/MovementPredictor.java:99-103) | Hadur's is the engine's physics; wall-side options score slower legs |
| 10 | Wave frame | source enemy@t-1, target us@t-2 (D move/MoveEnemy.java:521-525) | both @t-1 (H duel/DuelController.java:627-640) | self-consistent, a constant blur of under half a bot width |
| 11 | Profile prior, seeds, flattenerFirst | none | views gated by the profile's rate while its margin is narrower, seeded hits weighted in, flatteners forced on (H move/MoveController.java:194-311) | not measurable on a cold bench; the rumble runs warm |

Items 1 and 2 are done (the stack carries the stop-and-start; the flattener threshold is worth
+0.5 at 8%). Items 9 and 10 are judged small. Item 11 is a rumble-only question for later.

## Proposed switches, each duel-only and off by default, screened on the 149

| Code | Item | Change |
|---|---|---|
| `hold650` | 3 | no DIST-1 walk-in in a duel: the target stays at the opening distance (650 for a stranger); END-1's finish unchanged |
| `dfac` | 4 | the distancing factor measured to the enemy's last scanned position, as Diamond does |
| `bhb` | 5 | log the intercepted bullet's guess factor to the hit views on bullet-hit-bullet, as Diamond does |
| `hitclr` | 6 | clear the surfed waves' danger caches on every hit and intercept, as Diamond does |
| `pkern` | 7 | the point kernel at the intersection centre instead of the integrated one |
| `keep2` | 8 | a skipped turn does not drop the second wave (the k halving and go-to shedding stay) |

`dfac`, `bhb` and `hitclr` are fidelity fixes and should be neutral or better everywhere; `hold650`
is the one with a mechanism sized to the class (the 1.4x angular width at 454 px against 650) and
the one most likely to cost elsewhere (a finish takes longer from 650). Screen: the 149 at 4
seeds in the cloud, paired against 3.13hjsw, each alone; the survivors stacked; the class gate
+2.0 points, then the top-50 guard and the census as the plan says.

## Hit forensics on the class

3.13hjsw against the 149 in the cloud, 35 rounds x 1 seed (seed 301), parallel 2, CPU constant
4138771, 4.0 skipped turns a battle; report `2026-10-19_mid-hf.md`, read with
`hit_forensics.py --set hadur-bench/flat-gf-mid.txt --all` (the tool is on the 1v1 branch).
Bullet damage taken a round while the Duel drove, by the bullet's class, by how the danger views
rated the angle it came from, by whether the surf's plan put us there, and by whether another of
the three options' plans would have missed it:

| Ranks | Opponents | Taken | headon | linear | learned | nowave | views: safe | mid | known | plan: on | off | none | options: dodge | trapped |
|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|
| 51-200 | 81 | 27.1 | 3.0 | 2.2 | 21.9 | 0.0 | 4.1 | 16.3 | 6.7 | 24.7 | 2.0 | 0.4 | 15.8 | 0.3 |
| 201-400 | 68 | 22.7 | 2.9 | 1.7 | 18.0 | 0.1 | 3.4 | 13.9 | 5.4 | 20.0 | 2.0 | 0.6 | 12.5 | 0.3 |
| all | 149 | 25.1 | 2.9 | 2.0 | 20.1 | 0.1 | 3.8 | 15.2 | 6.1 | 22.6 | 2.0 | 0.5 | 14.3 | 0.3 |

What it says about the class:

- **Information is not the problem.** No-wave hits are 0.1 a round (the ledger sees every shot),
  and only 3.8 of the 25.1 (15%) came from angles the views rated safe. 85% of the damage came
  from angles the views rated mid or known.
- **The choice is.** 22.6 of 25.1 (90%) landed where the surf's own plan put us, and for 14.3
  (57%) another first-tick option's plan would have missed the bullet; only 0.3 was trapped (no
  option escaped). On the top-3 stage 0 set the same reading was 48% (6.1 of 12.8), so the class
  is where the option ranking is weakest, by a margin.
- **The simple guns matter too.** Head-on and linear bullets are 4.9 a round (20%) from guns
  classed as learning; a guess-factor gun's peak at GF 0 fires head-on at a random mover, and
  the `simple` view carries weight 3 of the 1,000-odd in the average.

So the surf loses on the class by ranking the three options wrongly on angles it has already
rated, which is what the switches above change: `pk` (how sharply the kernel separates the
options), `df` (which distance the option keeps), `hc` and `bh` (how current the ratings are),
`w2` (whether the second wave is in the ranking after a skip), and `d6` (how wide the three
options look to the gun). The list stands as proposed; the PC queue `pc-midrange-3` screens it.
