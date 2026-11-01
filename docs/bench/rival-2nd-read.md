# The new 2nd-place 1v1 rival: what it does and what Hadur can take from it

Read on 2026-10-31 (22:10 GMT) on Leigh's ask. Leigh asked that the robot not be named here, so it is "the rival"
throughout. No rumble client was run and nothing was uploaded.

## Where it stands

- LiteRumble 1v1 at 22:10 GMT: **2nd, 93.88 ± 0.13**, 1,221 pairings, 5,490 battles, survival 98.25.
  BeepBoop 94.97 is 1st; DrussGT 92.52 3rd; **Hadur 3.20 is now 4th at 91.81**; Saguaro 91.71 5th.
- It was a temporary entry. It joined the participants list at 18:52 GMT and left it at 21:44 GMT, so it gets no more
  battles. Hadur goes back to 3rd once LiteRumble drops it.
- Head to head: the rival scores 54.62 against Hadur 3.20 (2 battles). It has no table row for us, so it runs a shield
  trial against Hadur first.
- Its jar ships its source under permissive licences (zlib and BSD-2). The jar, its README and its design notes are in the
  project files. They are not in the repo.

## What it is

Its architecture is very close to Hadur's 1v1: per-opponent modes on top of a strong general surfer and gun.

| Part | The rival | Hadur today |
|---|---|---|
| Gun | replay k-NN: neighbours replayed against the next tick's bullet, main and anti-surfer views picked by a sign test on real waves, max-overlap aim | k-NN GF gun stack |
| Power | 1.95/2.95 shaved with `Math.nextDown` so surfers that round the detected power get the bullet speed wrong; expected-score power search only while our score share is under 80% | 1.95/2.95 base + POW policies |
| Surf | true surfing 2 waves deep, stop forks on wave 1 and 3 options on wave 2, plus the next gun-heat wave; danger mixes k-NN hits with simulated head-on/linear/circular/partial-lead guns weighted by accuracy; flattener vs strong guns; two-tier bullet shadows | surf + MOVE-29/30/31 aim members |
| Anti-mirror | candidates whose path steers a mirror bot into our bullets get a bonus | none |
| Shield | stand still, exact heading from 4 bases (aim tick, aim tick + body turn, fire position, projected) plus a learned constant offset; the cheapest power whose segment overlaps the enemy bullet, crossing at the overlap centre with the widest angular tolerance; one-tick 0.1 px step only when needed | the same family (SHIELD-5..21) |
| Stop-and-go | WavePoison: crawl at 0.5, reverse for one tick at `cool == flip` (flip 1 or 2 per opponent), 25%-hit fail-safe | POISON-1/2, prefire 1 or 2 |
| Tables | modes: one hashed String constant, **1,216 exact names** (the whole 10-08 list): 342 shield, 78 stop-and-go (with flip), 39 shield predictor classes. Params: surf k-NN key weights, k and kernel width **per opponent (247 names)** | shield list 282, stop-go 76, still 17, shipped aims |

Its own ablations add up to about **+1.3 APS from per-opponent tables alone**:

- stop-and-go on 77 names: +0.43 on the full field;
- 61 names added to the shield list: +0.39 on its bed;
- per-opponent k-NN params: +0.20;
- shield repair: +0.30.

That is the same lesson as Hadur's: only per-opponent picks pay.

Two shield rules differ from ours:

- **Exits.** It shields a listed opponent for the whole battle unless it takes 800 damage. It has no per-round exit
  after unpredicted hits (Hadur leaves the round after 2) and no 85% hold-share budget. A name it has never met gets a
  trial instead. The trial ends on any of four checks: a 99% damage budget, aim support after 4 bullets, the hit share
  after 12, or being rammed.
- **Power.** It fires the cheapest power that still crosses the enemy's bullet, preferring at most
  `enemyPower × ourEnergy / enemyEnergy`, so it wins the energy race. We lose that race against Princess.

## Per-opponent comparison (the rival vs Hadur 3.20, live, 1,220 shared bots)

The rival leads Hadur by **+2.07 APS**. Over the same bots it also leads DrussGT by +1.36 and Saguaro by +2.14, and
trails BeepBoop by 1.03. The lead is broad: the top 100 pairings give 1.19 of it, and the rival is behind on 356 bots
(-0.48). By opponent strength (opponent APS):

| Opponent APS | Rival lead (APS) |
|---|---|
| 70+ | +0.44 |
| 50-70 | +1.18 |
| 30-50 | +0.40 |
| under 30 | +0.05 |

The table below splits the bots by **the rival's mode × Hadur master's mode**. Master is 3.20 plus the 17 SHIELD-21
still lines and the 7 BeepBoop shield names from PR #517. The scores are 3.20's.

| The rival | Hadur master | Bots | Rival − Hadur (APS) | Per bot |
|---|---|---|---|---|
| shield | shield | 240 | **+0.49** | +2.51 |
| shield | surf / stop-go | 74 | **+0.46** | +7.6 |
| stop-go | surf | 21 | +0.10 | +6.05 |
| stop-go | shield | 16 | +0.06 | +4.44 |
| stop-go | stop-go | 40 | +0.03 | +1.07 |
| normal | surf | 775 | **+0.91** | +1.44 |
| normal | stop-go | 22 | +0.03 | +1.39 |
| normal | shield | 23 | -0.06 | -3.01 (keep ours) |
| untested (trial) | surf | 9 | +0.04 | +5.6 |

The lists by name, with DrussGT, Saguaro and BeepBoop scores, are in `docs/bench/rival-mode-lists.tsv` (sections A to E).
Each live pairing is 1 to 3 battles, so a single bot's lead is noisy. The lists are candidates for a bench.

## Levers Hadur could copy as per-opponent picks

They are ranked by live pool. Levers 1 to 3 are screened by the card `pc-rival-picks` (BENCH-159, below).

1. **Shield list additions (list A, 74 bots, pool +0.46).** The rival shields them and Hadur surfs. Many are
   1b "rivals shield, we surf" bots: cx.Princess, cx.mini.BlackSwans, tobe.Saturn, oog.micro.Maui, cjm.Che,
   rz.GlowBlow, stelo.MatchupMini/AGF, zeze2.OperatorZeze, apv.AspidReloaded. Some may have failed our probe under the
   older shield. Re-probe them with and without SHIELD-20 still, because the w0 fix changed what our shield is worth.
2. **Shield execution on the shared list (list E, 240 bots, pool +0.49; the 50 bots it leads by over 5 = +0.46).**
   The rival scores 94 to 100 where we score 64 to 85: cx.micro.Smoke, stelo.MatchupWS, mnt.AHEB, LightningStorm,
   Delitioner, Firebird, C22H30N2O2S, Meroka, RainbowBot, SuperMercutio. Two per-opponent switches fit as they are:
   - SHIELD-21 still lines (on master only Lucid, Pytko, Numbat, Spark, UnfoolableNano and Bandit2002 have one);
   - SHIELD-19 `exitOffs`, close to the rival's "whole battle" rule (the master list is **empty**).

   An energy-ratio cap on shield power would be a new switch, built after the screen.
3. **Stop-and-go additions (lists B+C, 36 bots once Flick is left out, pool +0.16).** The rival's flip hints at our
   variant: flip 1 = stopGo, flip 2 = stopGoShift. The screen runs both. The biggest leads are BaronTrozo +35,
   Intra +25, Hydrogen +20, Geomancy +17, Crisis +11, NaN +11, VertiLeach +10 and Mikey +7. wiki.nano.Flick stays out
   (we lead by 10.6).
4. **Per-opponent surf k-NN parameters (a new kind of table).** The rival fits key weights, k and kernel width for
   each opponent to explain that opponent's recorded bullets (247 names, +0.20 field). Our truth logs hold every enemy
   bullet, so the fit can run offline with no live time. It is the only per-opponent lever aimed at the 775 normal-play
   bots (pool +0.91). It needs a build first: a per-opponent surf-parameter table in the core, and a fit tool that
   reads the truth logs.
5. **Keep list D.** On these 23 bots we shield and the rival plays normal; we lead by 3 per bot.

Some ideas are global, not per-opponent, so they sit behind the rule: `nextDown` x.x5 powers, the expected-score
power search when losing, and the anti-mirror bonus.

## Card pc-rival-picks (BENCH-159)

`hadur-bench/plans/pc-rival-picks.queue`, about 45 minutes (2,070 battles, 3 seeds from 5600). Leigh starts it.

| Screen | Panel | Arms (beside c and aa) | Battles |
|---|---|---|---|
| add | 74 robots of list A | mt (shield list), mtzl (shield list + still) | 888 |
| exec | 50 robots of list E leading by over 5 | zl (still), x0 (exit off), zlx0 (both) | 750 |
| stopgo | 36 robots of lists B+C | mdwl (stop-and-go), mdwm (shift); both drop the 16 of list C off the shield list | 432 |

Each screen writes a multi-arm read, a 5-point per-robot pick and every robot's difference with losses. Each declares
these stop rules: fails 30, dead 8, skips 40 over 200, stall 30m. A halt keeps every battle and a rerun resumes; a halt
in one screen leaves the later screens unrun. No screen ships anything: the picks go to a confirm card on fresh seeds,
then to the census.

## pc-rival-picks results (PR #532, 2026-11-01) and card pc-rival-confirm (BENCH-161)

As global switches, the lists lose: shield adds -2.57 points (mt) and -2.06 (mtzl) on 74 robots, and stop-and-go
-19.6 (mdwl) and -9.5 (mdwm) on 36. Shield execution is the exception: still + exit off (zlx0) +1.64 ± 1.39 on 50.
All three A/As sit inside their bands.

At a 5-point margin, 18 robots lock, worth +0.14 APS in sample:

- shield adds: fm.claire, projectx.TestNano, rz.GlowBlowMelee and tobe.Saturn with still lines; zeze2.OperatorZeze
  without them;
- execution: deo.FlowerBot, stelo.MatchupWS and SuperMercutio with still lines; cx.micro.Smoke, dft.Cyprus,
  myl.micro.Avipes, rz.GlowBlowAPM and voidious.mini.Komarious with still lines and exit off;
- stop-and-go: Squirrel, DuelistMicroMkII and Vanessa03 (flip 1, each off the shield list); VertiLeach and Geomancy
  (flip 2).

In-sample picks shrink. `hadur-bench/plans/pc-rival-confirm.queue` builds all 18 lines into one jar (each acts only on
its own robot) and runs it beside master and an A/A on 8 fresh seeds from 6300. That is 432 battles, about 10 minutes.
The gate is +0.05 APS with the 95% low end above 0, plus a 3-point per-robot pick. The lines that hold go to master
for the next census.

### pc-rival-confirm results (PR #537): 13 picks ship

The 18 picks in one jar, 8 fresh seeds from 6300, 432 battles: **rp +5.67 ± 1.94 points** over master on the 18,
which is **+0.08 ± 0.03 APS** pooled over both controls. 16 of the 18 are up. The A/A (aa - c) came out at
-1.25 ± 1.03 against a ±0.97 band, just outside, so the gate script marks the run unread. Against either control
alone the gain is over 4 times the A/A gap. The aa copy scored lower, so against it rp gains more.

At a 3-point margin, 13 robots hold (+0.08 APS in sample). They are on master:

- shield list + still lines: fm.claire, projectx.TestNano, rz.GlowBlowMelee;
- still lines: SuperMercutio; still lines + exit off: cx.micro.Smoke, dft.Cyprus, myl.micro.Avipes, rz.GlowBlowAPM,
  voidious.mini.Komarious;
- off the shield list, so their existing stop-and-go lines drive: DuelistMicroMkII, Vanessa03;
- stop-and-go shift: pez.mini.VertiLeach, synapse.Geomancy.

These 5 stay off: tobe.Saturn +4.1 (narrow interval), zeze2.OperatorZeze +1.1, stelo.MatchupWS 0.0,
bayen.nut.Squirrel -0.1 and deo.FlowerBot -2.7. The lines go to the next census with everything else.
