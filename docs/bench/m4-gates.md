# Melee gates: M4 (field gun, energy policy, targeting waves)

The M4 build (still versioned 2.2; it becomes 3.0 at M6) on the four fields of `melee-gates.txt`. M4 adds the melee gun: one aim per opponent from a shared kd-tree history (MGUN-1..3), an energy policy that sizes bullets to the field (MGUN-2), and targeting waves that score every cycle's aim without firing (MGUN-4). The duel sources are unchanged (DuelIdentityTest). The duel and sentry fields come from the first full M4 run (`work/m4`). The melee fields come from the final build after the review changes to the movement (`work/m4d`), run alone on the machine. Same engine, cores and seeds as M3; the reference field runs 5 seeds, not the plan's 20.

## Summary against the exit gate

The M4 exit gate is ≥ 100k on the sample set and reference APS ≥ 55. A field of ten robots holds about 90k energy over 100 rounds, so 100k of bullet damage cannot be reached by one robot. This report reads the gate as total score on the challenge field; Hadur's total is 60,383, so **that gate is not met** either way.

| Measure | M3 | M4 | Gate |
|---|---|---|---|
| Reference: APS | 50.6 | 55.0 | ≥ 55 (met, on the line) |
| Reference: survival, rounds won | 55.0, 12 / 175 | 64.5, 26 / 175 | |
| Reference: Hadur's mean place | 6.0 | 3.4 (second to Aleph) | |
| Challenge: total score | 58,120 | 60,383 | 100k (not met) |
| Challenge: bullet damage | 10,691 | 11,390 | |
| Challenge: firsts of 100 | 71 | 77 | 100 (M3 gate, still not met) |
| Challenge: APS, survival | 67.8, 87.9 | 68.7, 90.2 | |
| Duel: Shadow score share | 55.2 (M1) | 56.5 ± 4.5 | unchanged |
| Sentry: hits taken, APS | 1 (M1) | 1, 72.8 | |

**Reference APS reaches 55.0, which meets the gate with no margin.** Five seeds give a per-battle range of 53.0 to 56.6, so the true value may sit either side; the plan's 20 seeds would settle it. Hadur is now second on the reference field by mean place. It wins most duels against the weaker survivors and loses most to Aleph (38% of 13) and Tron (20% of 10). The M5 hand-off targets those.

Targeting waves score 19.0% virtual hits on the challenge field and 13.3% on the reference field. That is the gun's aim quality before bullet power and travel time.

### What the review changes cost, and why route sampling was reverted

Review of M3 (Qodo) led to four movement changes: a shot's timing window, neighbour drift for stale positions, a ring cap that ignores stale robots, and scoring virtual bullets at four points along the route rather than at the destination only. The first M4 run was taken before them (reference APS 54.7). With all four the reference APS fell to about 49. An ablation run with four benches in parallel, which inflates skipped turns for every variant alike, isolated the cause:

| Variant (reference field, 4 in parallel) | APS | Survival | Skipped turns |
|---|---|---|---|
| All four changes | 46.0 | 48.1 | 1516 |
| Without drift | 46.8 | 47.9 | 1584 |
| Without the window | 48.4 | 51.7 | 1282 |
| Without route sampling | 53.9 | 63.1 | 55 |

Route sampling was the cost, mostly in time: four risk evaluations per candidate made Hadur miss turns. The final build keeps the window, the drift (now only for data older than one radar sweep) and the stale-aware ring cap. It skips virtual bullets that cannot come near Hadur and scores bullets at the destination only. It runs with 2 skipped turns on each melee field.

### Radar

The worst scan gap while four or more were alive is 33 ticks on the challenge field and 67 on the reference field. Most rounds sit at 11 to 12 ticks. The tail is the M3 finding and is still untraced. The 8-tick gate from M2 and the tail are M6 radar work.

Per-round longest gap while four or more were alive, rounds at each value:

| Field | 10 | 11 | 12 | 13-20 | 21-30 | over 30 |
|---|---|---|---|---|---|---|
| challenge | 10 | 34 | 19 | 26 | 7 | 4 |
| reference | 3 | 35 | 45 | 76 | 11 | 5 |

## Bench: hadur2.Hadur 2.2 (cold)

35 rounds x 5 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 4 cores. robocode.cpu.constant=3632009.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sample.SpinBot | sanity | 99.9% ± 0.0 | 100.0% ± 0.0 | 99.9% ± 0.1 | 175 / 175 | 40.9% ± 3.2 | 0.5% ± 0.4 | 10 | 0 | 0.63 / 22.5 |
| sample.Tracker | sanity | 99.9% ± 0.1 | 100.0% ± 0.0 | 99.9% ± 0.3 | 175 / 175 | 79.8% ± 1.5 | 0.6% ± 1.6 | 5 | 0 | 0.55 / 11.5 |
| sample.Crazy | sanity | 99.8% ± 0.2 | 100.0% ± 0.0 | 99.7% ± 0.4 | 175 / 175 | 29.5% ± 2.1 | 1.6% ± 2.2 | 9 | 0 | 0.57 / 16.1 |
| sample.Walls | sanity | 99.9% ± 0.1 | 100.0% ± 0.0 | 99.9% ± 0.2 | 175 / 175 | 52.8% ± 1.6 | 0.5% ± 0.8 | 5 | 0 | 0.58 / 13.1 |
| sample.RamFire | sanity | 97.5% ± 1.2 | 100.0% ± 0.0 | 96.5% ± 1.6 | 175 / 175 | 80.7% ± 1.1 | 11.7% ± 4.0 | 4 | 0 | 0.50 / 13.0 |
| abc.Shadow 3.83c | headline | 56.5% ± 4.5 | 72.0% ± 6.3 | 41.9% ± 4.0 | 126 / 175 | 9.1% ± 0.7 | 8.4% ± 0.8 | 15 | 0 | 1.19 / 52.4 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| sample.SpinBot | 718 | 6 | 718 | 718 (100.0%) | 0 (0.0%) | 0 (0.0%) | 183 | 14 | 11 |
| sample.Tracker | 97 | 1 | 97 | 97 (100.0%) | 0 (0.0%) | 0 (0.0%) | 1 | 7 | 8 |
| sample.Crazy | 745 | 3 | 748 | 744 (99.9%) | 1 (0.1%) | 4 (0.5%) | 993 | 22 | 13 |
| sample.Walls | 599 | 1 | 599 | 599 (100.0%) | 0 (0.0%) | 0 (0.0%) | 2 | 21 | 13 |
| sample.RamFire | 57 | 0 | 58 | 57 (100.0%) | 0 (0.0%) | 1 (1.7%) | 137 | 5 | 12 |
| abc.Shadow 3.83c | 9705 | 528 | 9685 | 9685 (99.8%) | 20 (0.2%) | 0 (0.0%) | 398 | 99 | 17 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| sample.SpinBot | 2834 | 19 (0.7%) | 0 |
| sample.Tracker | 2091 | 0 (0.0%) | 0 |
| sample.Crazy | 4560 | 37 (0.8%) | 0 |
| sample.Walls | 2248 | 37 (1.6%) | 0 |
| sample.RamFire | 2049 | 0 (0.0%) | 0 |
| abc.Shadow 3.83c | 10683 | 881 (8.2%) | 8566 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| sample.SpinBot | 650 | 422 | 400 | 264 | 86.3 / 0.1 | 1240 | 674 | 280 |
| sample.Tracker | 650 | 306 | 400 | 191 | 98.4 / 0.1 | 0 | 144 | 29 |
| sample.Crazy | 650 | 380 | 400 | 395 | 79.9 / 0.3 | 647 | 551 | 625 |
| sample.Walls | 650 | 409 | 400 | 216 | 93.2 / 0.1 | 1117 | 314 | 174 |
| sample.RamFire | 650 | 325 | 650 | 188 | 100.4 / 3.7 | 0 | 128 | 3 |
| abc.Shadow 3.83c | 650 | 467 | 650 | 792 | 27.3 / 37.7 | 0 | 1181 | 41 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| sample.SpinBot | 0.5% | 10 | 37 | 3 | 4.1 | 19 / 19 (100%) | 0 | 0 |
| sample.Tracker | 0.6% | 5 | 18 | 2 | 0.6 | - | 0 | 0 |
| sample.Crazy | 1.6% | 9 | 40 | 2 | 4.3 | 37 / 37 (100%) | 0 | 0 |
| sample.Walls | 0.5% | 5 | 25 | 2 | 3.4 | 37 / 37 (100%) | 0 | 0 |
| sample.RamFire | 11.7% | 4 | 24 | 2 | 0.1 | - | 0 | 0 |
| abc.Shadow 3.83c | 8.4% | 15 | 175 | 2 | 55.3 | 881 / 881 (100%) | 0 | 0 |

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
| sample.SpinBot | sample.SpinBot | 1 | 35 | 12473 | 1.4% | 0.8% ± 2.4 | 30.4% | 60.3% / 61.8% | 2.7% | 467 / 2 | T0/M? | 100% |
| sample.Tracker | sample.Tracker | 1 | 35 | 10029 | 11.1% | 2.9% ± 13.3 | 49.2% | 45.5% / 45.8% | 50.3% | 373 / 2 | T?/M? | 99% |
| sample.Crazy | sample.Crazy | 1 | 35 | 15949 | 2.2% | 0.5% ± 2.4 | 23.0% | 29.0% / 24.7% | 3.4% | 600 / 3 | T0/M? | 100% |
| sample.Walls | sample.Walls | 1 | 35 | 9501 | 0.0% | 0.0% ± 2.3 | 35.5% | 36.8% / 51.4% | 16.6% | 355 / 0 | T0/M? | 100% |
| sample.RamFire | sample.RamFire | 1 | 35 | 9795 | 54.5% | 1.6% ± 17.8 | 49.2% | 43.7% / 44.8% | 42.5% | 360 / 6 | T?/M? | 98% |
| abc.Shadow 3.83c | abc.Shadow | 1 | 35 | 20113 | 8.4% | 7.4% ± 1.2 | 8.7% | 21.1% / 20.0% | 9.0% | 600 / 163 | T3/M1 | 58% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Melee bench: sentry

hadur2.Hadur 2.2 against 2 opponents at once, 3 rounds per battle, 3 battles, 1000x1000, sentry border 100.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 72.2 | 5 / 9 | 1.56 | 55.3% | 1163 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 2.2 | 1.0 | 55.3% | 5 |
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

Skipped turns: 0.

Sentry safety: 1 sentry bullets hit Hadur, 6 of Hadur's bullets hit a sentry.

Posture (Hadur's M records, 9 rounds): 0 melee ticks, 2134 duel ticks, 2363 focused-duel ticks; 8 rounds vetoed; 0 melee faults; longest scan gap 0 ticks; 0 ticks aimed at a dead robot; 4 shots at a sentry.

Sensing (9 rounds): longest scan gap while four or more were alive 0 ticks (0 rounds over 8); rounds whose longest gap at any count was over 8: 0; robots dropped as dead without a death event: 0.

Targeting waves (9 rounds): 0 sent, 0 reached their opponent, 0 virtual hits (0.0% of those reached).


## Melee bench: challenge

hadur2.Hadur 2.2 against 9 opponents at once, 100 rounds per battle, 1 battles, 1000x1000.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 90.2 | 77 / 100 | 1.88 | 19.1% | 11390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 2.2 | 1.0 | 19.1% | 77 |
| rz.HawkOnFire 0.1 | 2.0 | 14.7% | 7 |
| kawigi.micro.Shiz 1.1 | 3.0 | 14.3% | 12 |
| supersample.SuperSpinBot 1.0 | 4.0 | 9.6% | 1 |
| sample.Crazy | 5.0 | 7.5% | 1 |
| sample.Walls | 6.0 | 7.3% | 1 |
| sample.SpinBot | 7.0 | 7.0% | 0 |
| supersample.SuperTracker 1.0 | 8.0 | 6.9% | 0 |
| supersample.SuperWalls 1.0 | 9.0 | 6.8% | 0 |
| SuperSample.SuperCrazy 1.0 | 10.0 | 6.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 90.2 | 77 / 100 | 11390 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 33 | 94% |
| rz.HawkOnFire 0.1 | 24 | 96% |
| sample.Walls | 6 | 100% |
| supersample.SuperWalls 1.0 | 6 | 100% |
| supersample.SuperSpinBot 1.0 | 5 | 100% |
| sample.Crazy | 3 | 100% |
| supersample.SuperTracker 1.0 | 2 | 100% |
| sample.SpinBot | 1 | 100% |

Skipped turns: 2.

Posture (Hadur's M records, 100 rounds): 69036 melee ticks, 19267 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (100 rounds): longest scan gap while four or more were alive 33 ticks (100 rounds over 8); rounds whose longest gap at any count was over 8: 100; robots dropped as dead without a death event: 0.

Targeting waves (100 rounds): 23700 sent, 21603 reached their opponent, 4096 virtual hits (19.0% of those reached).

## Melee bench: reference

hadur2.Hadur 2.2 against 9 opponents at once, 35 rounds per battle, 5 battles, 1000x1000.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.0 | 64.5 | 26 / 175 | 4.19 | 11.6% | 9436 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 13.3% | 38 |
| hadur2.Hadur 2.2 | 3.4 | 11.6% | 26 |
| abc.Tron 2.02 | 3.8 | 11.2% | 24 |
| kawigi.mini.Coriantumr 1.1 | 5.4 | 10.3% | 8 |
| darkcanuck.B26354 1.06 | 5.4 | 10.6% | 25 |
| rz.HawkOnFire 0.1 | 5.6 | 9.8% | 8 |
| simonton.micro.Sprout 1.1.3 | 6.2 | 10.2% | 11 |
| gh.Griezel 0.5.4 | 6.8 | 9.6% | 21 |
| kawigi.sbf.FloodHT 0.9.2 | 7.4 | 9.7% | 15 |
| cx.mini.Cigaret 1.31 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.0 | 59.7 | 4 / 35 | 1875 |
| 2 | 2 | 56.3 | 69.5 | 7 / 35 | 1763 |
| 3 | 3 | 56.6 | 67.9 | 6 / 35 | 1914 |
| 4 | 3 | 55.4 | 64.4 | 6 / 35 | 1908 |
| 5 | 4 | 53.8 | 61.0 | 3 / 35 | 1976 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 13 | 38% |
| abc.Tron 2.02 | 10 | 20% |
| rz.HawkOnFire 0.1 | 7 | 57% |
| gh.Griezel 0.5.4 | 6 | 67% |
| kawigi.sbf.FloodHT 0.9.2 | 6 | 33% |
| simonton.micro.Sprout 1.1.3 | 5 | 100% |
| kawigi.mini.Coriantumr 1.1 | 4 | 50% |
| darkcanuck.B26354 1.06 | 4 | 50% |

Skipped turns: 2.

Posture (Hadur's M records, 175 rounds): 104368 melee ticks, 19909 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 67 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (175 rounds): longest scan gap while four or more were alive 67 ticks (175 rounds over 8); rounds whose longest gap at any count was over 8: 175; robots dropped as dead without a death event: 0.

Targeting waves (175 rounds): 37457 sent, 33325 reached their opponent, 4437 virtual hits (13.3% of those reached).

