# Melee gates: M6 (weight tuning, and release 3.0)

The 3.0 build on the melee gates suite (`melee-gates.txt`, with the reference field at 10 seeds instead of 5), plus the M6 weight sweep that chose it. Same engine and 4 cores as M5; everything is cold.

## Summary against the exit gate

The plan's M6 is "surf-danger W(p) term, perpendicularity, weight tuning by seeded sweeps; first MeleeRumble entry", gated on **reference set APS ≥ 60** and **the rumble entry stabilised at 2,000+ battles**.

| Gate | Result |
|---|---|
| Reference APS ≥ 60 | **Not met.** 52.7 in this run; four 10-seed runs of the M6 builds range 52.7 to 54.6. No weight in the sweep moved it by more than the noise. |
| Rumble entry at 2,000+ battles | **Not yet measurable.** 3.0 has to be entered on the MeleeRumble participants page first (see [docs/rumble-submission.md](../rumble-submission.md)); the rating settles over the following days. |

The surf-danger term and perpendicularity were already in the M3 movement: every recorded shot gets a head-on and a linear virtual bullet scored at each candidate point (`BULLET_K`, MMOVE-3), and a lateral weight rewards points perpendicular to the nearest opponent (`LATERAL`, MMOVE-4). M6 swept both.

## The sweep

Each row is one build on the reference field, 35 rounds x 10 seeds, run alone on the machine. The same jar gave 51.3 and 53.7 on 5 seeds earlier, so nothing was compared at fewer than 10.

| Build | Change from M5 | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| m6base | none (M5 plus doclint) | 54.0 | 63.3 | 43 | 17,271 |
| m6base, again | none | 53.6 | 62.9 | 37 | 17,087 |
| lat1 | lateral weight 0.5 to 1.0 | 54.0 | 63.2 | 38 | 17,624 |
| wall6 | wall weight 0.3 to 0.6 | 54.0 | 63.9 | 32 | 17,408 |
| bul05 | virtual-bullet weight 1.0 to 0.5 | 53.6 | 63.5 | 35 | 16,750 |
| bul2 | virtual-bullet weight 1.0 to 2.0 | 51.8 | 58.5 | 33 | 17,076 |
| bul0 | no virtual bullets | 50.9 | 56.6 | 22 | 16,504 |
| cen1, cen5 | centre pull 0.25 to 0.1, 0.5 | 53.3, 53.3 | 61.9, 61.5 | 38, 34 | |
| cl15, cl3 | closest-robot factor 2.0 to 1.5, 3.0 | 53.1, 52.9 | 61.4, 61.5 | 34, 34 | |
| ring200, ring400 | outer ring 300 to 200, 400 px | 53.1, 53.2 | 61.5, 61.7 | 33, 34 | |
| gage | fire on scans up to 12 ticks old (was 5; field gun 8) | 53.8 | 63.0 | 35 | 18,470 |
| **gpost** | **the posture never cuts power or holds fire** | **54.6** | 63.4 | 32 | **20,758** |
| gboth | gage and gpost | 53.7 | 61.2 | 28 | 20,456 |
| phi | gpost, and 1.5 beyond 500 px, 2.0 at 300-500 px (was 1.0, 1.5) | 54.2 | 61.5 | 32 | 21,730 |
| plo | gpost, and 0.7 beyond 500 px, 1.1 at 300-500 px | 53.7 | 62.1 | 32 | 18,418 |
| 3.0 (gpost), again | this report's reference run | 52.7 | 59.5 | 32 | 19,017 |

- **The movement weights sit at a local optimum.** No movement change beat the baseline; halving or doubling a weight either did nothing or cost up to 2 APS. The virtual bullets (the surf-danger term) matter most: without them APS falls 3 points and survival 7.
- **The gun was the lever to try.** On the reference field Hadur's survival score is second only to Aleph's, but its bullet damage was the lowest of the strong bots. Most of that was the posture: it halved the power and held fire beyond 400 px while two others fought, and cut power by 30% and held beyond 600 px while Hadur led the field. Taking that out (gpost) raised bullet damage by about 15% (19,900 against 17,200, averaged over two runs each).
- **APS did not move.** Two runs each give 53.8 for the baseline and 53.7 for gpost; the extra damage is paid for with about 1.6 points of survival. 3.0 keeps gpost because it is simpler (the fire holds are gone) and neutral on score, and records it as MGUN-5, retiring MELEE-8's "halve fire power" (MMOVE-5 keeps its "keep clear of their fight").
- **Neither power table helped** on top of gpost, and firing on staler scans (gage) did not either.

## The other gates, as a non-regression check

| Suite | M4 or M5 | 3.0 |
|---|---|---|
| Duel: Shadow 3.83c, score share | 57.4% ± 5.0 (2.2, S6 bench) | 54.5% ± 4.5 |
| Duel: Shadow 3.83c, rounds won | 125 / 175 | 119 / 175 |
| Duel: five sample bots, rounds won | 875 / 875 | 875 / 875 |
| Sentry: shots at a sentry, sentry bullets that hit Hadur | 4, 1 (M1) | 4, 1 |
| Challenge: firsts of 100 | 82 (M4) | 72 |
| Challenge: APS, survival | 68.9, 90.8 (M4) | 69.5, 88.9 |

The duel is unchanged in code (`DuelIdentityTest` pins its sources), and the Shadow figure sits inside both intervals. The challenge is a single 100-round battle on one seed, so 72 against 82 firsts is within what one battle varies by; its APS is the highest yet. The plan's "100 firsts" challenge gate (M3) remains unmet.

## A correction to the M5 report

The M5 report put the rise in skipped turns down to the long duels M5 reaches more often. That is wrong. They fall on the turns just after Hadur wins a round (all 416 in this report's challenge run, from the engine's messages in Hadur's log): the round-end checkpoint of the melee profile file (`.hm`, MMEM-1), written on the robot's thread while the engine is still running the round-end turns. They cost no score (the round is decided), and the challenge field, where Hadur wins most rounds, has the most (416 over 100 rounds). A round whose last turns are skipped can lose its M record, which is why a few reports count 173 or 174 rounds of 175.

## Not done in M6

- **A warm hand-off bench.** M5 listed a warm run (1v1 battles first, then melee in the same robot directory) so the hand-off's profile half could show; the bench still gives every battle a fresh directory.
- **The radar levers** noted at M2 and M3 (turning the radar with the gun and body, an arc sweep). The scan gap with four or more alive is still 10 to 11 ticks typical, 65 worst.

## Raw report

## Bench: hadur2.Hadur 3.0 (cold)

35 rounds x 5 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 4 cores. robocode.cpu.constant=4655391.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sample.SpinBot | sanity | 100.0% ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.1 | 175 / 175 | 40.0% ± 2.5 | 0.1% ± 0.3 | 7 | 0 | 0.83 / 11.3 |
| sample.Tracker | sanity | 99.9% ± 0.2 | 100.0% ± 0.0 | 99.8% ± 0.3 | 175 / 175 | 81.0% ± 1.6 | 1.2% ± 2.0 | 1 | 0 | 0.50 / 10.4 |
| sample.Crazy | sanity | 99.8% ± 0.1 | 100.0% ± 0.0 | 99.5% ± 0.2 | 175 / 175 | 31.4% ± 2.3 | 2.1% ± 1.2 | 0 | 0 | 0.53 / 13.0 |
| sample.Walls | sanity | 99.9% ± 0.1 | 100.0% ± 0.0 | 99.9% ± 0.2 | 175 / 175 | 54.5% ± 1.2 | 0.4% ± 0.7 | 2 | 0 | 0.54 / 11.1 |
| sample.RamFire | sanity | 97.5% ± 1.4 | 100.0% ± 0.0 | 96.6% ± 1.9 | 175 / 175 | 80.9% ± 0.7 | 14.0% ± 5.9 | 1 | 0 | 0.52 / 16.1 |
| abc.Shadow 3.83c | headline | 54.5% ± 4.5 | 68.0% ± 6.3 | 41.9% ± 2.4 | 119 / 175 | 9.3% ± 0.5 | 8.4% ± 1.0 | 3 | 0 | 1.12 / 15.0 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| sample.SpinBot | 722 | 3 | 722 | 722 (100.0%) | 0 (0.0%) | 0 (0.0%) | 169 | 26 | 5 |
| sample.Tracker | 117 | 1 | 117 | 117 (100.0%) | 0 (0.0%) | 0 (0.0%) | 2 | 5 | 3 |
| sample.Crazy | 736 | 8 | 739 | 736 (100.0%) | 0 (0.0%) | 3 (0.4%) | 960 | 29 | 3 |
| sample.Walls | 589 | 2 | 589 | 589 (100.0%) | 0 (0.0%) | 0 (0.0%) | 3 | 20 | 5 |
| sample.RamFire | 59 | 0 | 60 | 59 (100.0%) | 0 (0.0%) | 1 (1.7%) | 137 | 3 | 7 |
| abc.Shadow 3.83c | 9800 | 574 | 9768 | 9768 (99.7%) | 32 (0.3%) | 0 (0.0%) | 440 | 97 | 6 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| sample.SpinBot | 2800 | 24 (0.9%) | 0 |
| sample.Tracker | 2043 | 2 (0.1%) | 0 |
| sample.Crazy | 4434 | 35 (0.8%) | 0 |
| sample.Walls | 2146 | 42 (2.0%) | 0 |
| sample.RamFire | 2038 | 0 (0.0%) | 0 |
| abc.Shadow 3.83c | 10795 | 860 (8.0%) | 8788 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| sample.SpinBot | 650 | 421 | 400 | 263 | 86.3 / 0.0 | 1364 | 687 | 163 |
| sample.Tracker | 650 | 291 | 400 | 188 | 98.1 / 0.2 | 0 | 167 | 43 |
| sample.Crazy | 650 | 371 | 400 | 384 | 80.5 / 0.4 | 538 | 579 | 407 |
| sample.Walls | 650 | 400 | 400 | 208 | 93.3 / 0.1 | 1137 | 365 | 41 |
| sample.RamFire | 650 | 316 | 650 | 188 | 100.4 / 3.6 | 0 | 120 | 5 |
| abc.Shadow 3.83c | 650 | 464 | 650 | 804 | 27.6 / 38.3 | 0 | 1228 | 172 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| sample.SpinBot | 0.1% | 7 | 35 | 2 | 4.1 | 24 / 24 (100%) | 0 | 0 |
| sample.Tracker | 1.2% | 1 | 16 | 1 | 0.7 | 2 / 2 (100%) | 0 | 0 |
| sample.Crazy | 2.1% | 0 | 30 | 1 | 4.2 | 35 / 35 (100%) | 0 | 0 |
| sample.Walls | 0.4% | 2 | 26 | 2 | 3.4 | 42 / 42 (100%) | 0 | 0 |
| sample.RamFire | 14.0% | 1 | 19 | 1 | 0.1 | - | 0 | 0 |
| abc.Shadow 3.83c | 8.4% | 3 | 179 | 2 | 55.6 | 860 / 860 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| sample.SpinBot | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| sample.Tracker | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| sample.Crazy | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| sample.Walls | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| sample.RamFire | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| abc.Shadow 3.83c | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| sample.SpinBot | sample.SpinBot | 1 | 35 | 12577 | 0.7% | 0.5% ± 2.3 | 30.4% | 55.8% / 60.0% | 1.7% | 472 / 1 | T0/M? | 100% |
| sample.Tracker | sample.Tracker | 1 | 35 | 9665 | 0.0% | 0.0% ± 11.1 | 48.1% | 41.7% / 42.4% | 50.5% | 361 / 0 | T?/M? | 100% |
| sample.Crazy | sample.Crazy | 1 | 35 | 16053 | 4.3% | 1.6% ± 2.6 | 24.1% | 28.6% / 25.5% | 3.2% | 600 / 7 | T0/M? | 100% |
| sample.Walls | sample.Walls | 1 | 35 | 9293 | 0.9% | 0.0% ± 2.4 | 36.2% | 36.2% / 48.4% | 16.2% | 347 / 0 | T0/M? | 100% |
| sample.RamFire | sample.RamFire | 1 | 35 | 9795 | 54.5% | 1.6% ± 17.8 | 49.2% | 43.7% / 44.8% | 42.5% | 360 / 6 | T?/M? | 98% |
| abc.Shadow 3.83c | abc.Shadow | 1 | 35 | 20529 | 9.3% | 8.1% ± 1.3 | 9.0% | 21.1% / 19.6% | 8.5% | 600 / 179 | T3/M1 | 57% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Melee bench: sentry

hadur2.Hadur 3.0 against 2 opponents at once, 3 rounds per battle, 3 battles, 1000x1000, sentry border 100.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 72.2 | 5 / 9 | 1.56 | 55.3% | 1163 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.0 | 1.0 | 55.3% | 5 |
| sample.Tracker | 2.3 | 26.9% | 3 |
| sample.SpinBot | 2.7 | 17.8% | 1 |
| samplesentry.BorderGuard | 4.0 | 0.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 66.7 | 2 / 3 | 366 |
| 2 | 1 | 76.9 | 83.3 | 2 / 3 | 437 |
| 3 | 1 | 70.8 | 66.7 | 1 / 3 | 360 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sample.SpinBot | 5 | 80% |
| sample.Tracker | 3 | 33% |

Skipped turns: 3.

Sentry safety: 1 sentry bullets hit Hadur, 6 of Hadur's bullets hit a sentry.

Posture (Hadur's M records, 9 rounds): 0 melee ticks, 2134 duel ticks, 2363 focused-duel ticks; 8 rounds vetoed; 0 melee faults; longest scan gap 0 ticks; 0 ticks aimed at a dead robot; 4 shots at a sentry.

Sensing (9 rounds): longest scan gap while four or more were alive 0 ticks (0 rounds over 8); rounds whose longest gap at any count was over 8: 0; robots dropped as dead without a death event: 0.

Targeting waves (9 rounds): 0 sent, 0 reached their opponent, 0 virtual hits (0.0% of those reached).

## Melee bench: challenge

hadur2.Hadur 3.0 against 9 opponents at once, 100 rounds per battle, 1 battles, 1000x1000.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.9 | 72 / 100 | 2.00 | 19.7% | 13925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.0 | 1.0 | 19.7% | 72 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.6% | 15 |
| rz.HawkOnFire 0.1 | 3.0 | 13.5% | 4 |
| supersample.SuperSpinBot 1.0 | 4.0 | 8.8% | 2 |
| supersample.SuperTracker 1.0 | 5.0 | 8.0% | 1 |
| sample.Crazy | 6.0 | 7.6% | 3 |
| supersample.SuperWalls 1.0 | 7.0 | 7.5% | 1 |
| SuperSample.SuperCrazy 1.0 | 8.0 | 7.1% | 1 |
| sample.Walls | 9.0 | 7.0% | 1 |
| sample.SpinBot | 10.0 | 6.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 88.9 | 72 / 100 | 13925 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 30 | 90% |
| rz.HawkOnFire 0.1 | 21 | 95% |
| sample.Crazy | 9 | 89% |
| sample.Walls | 7 | 100% |
| supersample.SuperSpinBot 1.0 | 6 | 83% |
| sample.SpinBot | 3 | 100% |
| supersample.SuperWalls 1.0 | 1 | 100% |
| SuperSample.SuperCrazy 1.0 | 1 | 100% |

Skipped turns: 416.

Posture (Hadur's M records, 100 rounds): 68661 melee ticks, 15298 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (100 rounds): longest scan gap while four or more were alive 42 ticks (100 rounds over 8); rounds whose longest gap at any count was over 8: 100; robots dropped as dead without a death event: 0.

Targeting waves (100 rounds): 23672 sent, 21536 reached their opponent, 5079 virtual hits (23.6% of those reached).

## Melee bench: reference

hadur2.Hadur 3.0 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 52.7 | 59.5 | 32 / 350 | 4.65 | 10.7% | 19017 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.1 | 13.2% | 76 |
| darkcanuck.B26354 1.06 | 3.2 | 11.3% | 57 |
| hadur2.Hadur 3.0 | 4.7 | 10.7% | 32 |
| abc.Tron 2.02 | 5.1 | 10.6% | 43 |
| kawigi.sbf.FloodHT 0.9.2 | 5.4 | 10.3% | 30 |
| rz.HawkOnFire 0.1 | 5.5 | 10.4% | 17 |
| kawigi.mini.Coriantumr 1.1 | 5.6 | 10.5% | 32 |
| simonton.micro.Sprout 1.1.3 | 6.9 | 9.5% | 11 |
| gh.Griezel 0.5.4 | 7.5 | 9.5% | 53 |
| cx.mini.Cigaret 1.31 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 54.8 | 65.4 | 4 / 35 | 1779 |
| 2 | 7 | 49.8 | 53.3 | 2 / 35 | 1808 |
| 3 | 5 | 52.9 | 56.8 | 6 / 35 | 1970 |
| 4 | 6 | 51.8 | 57.5 | 2 / 35 | 1806 |
| 5 | 3 | 53.2 | 59.7 | 6 / 35 | 1893 |
| 6 | 4 | 53.6 | 62.2 | 2 / 35 | 1963 |
| 7 | 7 | 51.4 | 58.4 | 1 / 35 | 1825 |
| 8 | 6 | 51.5 | 57.5 | 1 / 35 | 1881 |
| 9 | 5 | 52.1 | 58.4 | 5 / 35 | 1806 |
| 10 | 2 | 55.5 | 65.4 | 3 / 35 | 2286 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Tron 2.02 | 14 | 43% |
| rz.Aleph 0.34 | 13 | 38% |
| rz.HawkOnFire 0.1 | 11 | 45% |
| kawigi.mini.Coriantumr 1.1 | 11 | 27% |
| darkcanuck.B26354 1.06 | 10 | 20% |
| kawigi.sbf.FloodHT 0.9.2 | 9 | 33% |
| simonton.micro.Sprout 1.1.3 | 8 | 75% |
| gh.Griezel 0.5.4 | 7 | 29% |

Skipped turns: 197.

Posture (Hadur's M records, 349 rounds): 203358 melee ticks, 24775 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (349 rounds): longest scan gap while four or more were alive 65 ticks (349 rounds over 8); rounds whose longest gap at any count was over 8: 349; robots dropped as dead without a death event: 0.

Targeting waves (349 rounds): 70939 sent, 63305 reached their opponent, 8952 virtual hits (14.1% of those reached).

