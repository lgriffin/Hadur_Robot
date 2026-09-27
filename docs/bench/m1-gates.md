# Melee gates: M1 (posture gate)

The M1 build (still versioned 2.2) through `melee-gates.txt`. The duel is unchanged by construction (DuelIdentityTest); the melee subsystems are 2.2's. The sentry field is where M1 differs: the gate hands it to the duel, which fights one opponent and keeps out of the border.

## Bench: hadur2.Hadur 2.2 (cold)

35 rounds x 5 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 4 cores. robocode.cpu.constant=3652172.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sample.SpinBot | sanity | 100.0% ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.1 | 175 / 175 | 41.0% ± 3.9 | 0.1% ± 0.3 | 3 | 0 | 0.59 / 10.0 |
| sample.Tracker | sanity | 99.9% ± 0.2 | 100.0% ± 0.0 | 99.8% ± 0.3 | 175 / 175 | 80.8% ± 1.4 | 1.2% ± 2.0 | 5 | 0 | 0.52 / 10.5 |
| sample.Crazy | sanity | 99.6% ± 0.3 | 100.0% ± 0.0 | 99.2% ± 0.6 | 175 / 175 | 30.2% ± 1.4 | 3.2% ± 2.3 | 7 | 0 | 0.57 / 11.8 |
| sample.Walls | sanity | 99.9% ± 0.1 | 100.0% ± 0.0 | 99.8% ± 0.2 | 175 / 175 | 53.7% ± 2.0 | 0.9% ± 1.2 | 7 | 0 | 0.52 / 12.9 |
| sample.RamFire | sanity | 97.8% ± 0.7 | 100.0% ± 0.0 | 96.9% ± 1.0 | 175 / 175 | 81.0% ± 0.6 | 12.6% ± 3.2 | 1 | 0 | 0.50 / 12.3 |
| abc.Shadow 3.83c | headline | 55.2% ± 1.7 | 69.1% ± 1.6 | 42.3% ± 3.1 | 121 / 175 | 9.4% ± 0.3 | 8.5% ± 0.3 | 3 | 0 | 1.14 / 16.2 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| sample.SpinBot | 714 | 7 | 714 | 714 (100.0%) | 0 (0.0%) | 0 (0.0%) | 181 | 23 | 6 |
| sample.Tracker | 109 | 1 | 109 | 109 (100.0%) | 0 (0.0%) | 0 (0.0%) | 1 | 4 | 6 |
| sample.Crazy | 771 | 5 | 776 | 771 (100.0%) | 0 (0.0%) | 5 (0.6%) | 943 | 25 | 6 |
| sample.Walls | 624 | 3 | 624 | 624 (100.0%) | 0 (0.0%) | 0 (0.0%) | 3 | 20 | 8 |
| sample.RamFire | 52 | 0 | 53 | 52 (100.0%) | 0 (0.0%) | 1 (1.9%) | 130 | 4 | 6 |
| abc.Shadow 3.83c | 9719 | 567 | 9688 | 9686 (99.7%) | 33 (0.3%) | 2 (0.0%) | 420 | 95 | 13 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| sample.SpinBot | 2775 | 20 (0.7%) | 0 |
| sample.Tracker | 2060 | 1 (0.0%) | 0 |
| sample.Crazy | 4560 | 38 (0.8%) | 0 |
| sample.Walls | 2231 | 44 (2.0%) | 0 |
| sample.RamFire | 2036 | 0 (0.0%) | 0 |
| abc.Shadow 3.83c | 10647 | 871 (8.2%) | 9808 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| sample.SpinBot | 650 | 423 | 400 | 261 | 86.3 / 0.0 | 1328 | 685 | 152 |
| sample.Tracker | 650 | 299 | 400 | 189 | 98.2 / 0.2 | 0 | 147 | 35 |
| sample.Crazy | 650 | 373 | 400 | 393 | 80.9 / 0.7 | 438 | 601 | 392 |
| sample.Walls | 650 | 400 | 400 | 214 | 93.0 / 0.2 | 1074 | 379 | 59 |
| sample.RamFire | 650 | 321 | 650 | 187 | 100.3 / 3.2 | 0 | 115 | 4 |
| abc.Shadow 3.83c | 650 | 458 | 650 | 793 | 27.8 / 37.9 | 0 | 1465 | 154 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| sample.SpinBot | 0.1% | 3 | 32 | 2 | 4.1 | 20 / 20 (100%) | 0 | 0 |
| sample.Tracker | 1.2% | 5 | 15 | 2 | 0.6 | 1 / 1 (100%) | 0 | 0 |
| sample.Crazy | 3.2% | 7 | 34 | 2 | 4.4 | 37 / 38 (97%) | 0 | 0 |
| sample.Walls | 0.9% | 7 | 28 | 3 | 3.6 | 44 / 44 (100%) | 0 | 0 |
| sample.RamFire | 12.6% | 1 | 16 | 1 | 0.1 | - | 0 | 0 |
| abc.Shadow 3.83c | 8.5% | 3 | 166 | 2 | 55.2 | 870 / 871 (100%) | 0 | 0 |

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
| sample.SpinBot | sample.SpinBot | 1 | 35 | 11511 | 1.5% | 0.6% ± 2.4 | 30.8% | 57.6% / 59.7% | 0.7% | 431 / 1 | T0/M? | 100% |
| sample.Tracker | sample.Tracker | 1 | 35 | 9665 | 0.0% | 0.0% ± 11.1 | 48.1% | 41.7% / 42.4% | 50.5% | 361 / 0 | T?/M? | 100% |
| sample.Crazy | sample.Crazy | 1 | 35 | 15949 | 2.2% | 0.5% ± 2.4 | 23.0% | 29.0% / 24.7% | 3.4% | 600 / 3 | T0/M? | 100% |
| sample.Walls | sample.Walls | 1 | 35 | 9345 | 1.6% | 0.6% ± 2.7 | 36.1% | 34.2% / 47.7% | 16.7% | 348 / 1 | T0/M? | 100% |
| sample.RamFire | sample.RamFire | 1 | 35 | 9795 | 54.5% | 1.6% ± 17.8 | 49.2% | 43.7% / 44.8% | 42.5% | 360 / 6 | T?/M? | 98% |
| abc.Shadow 3.83c | abc.Shadow | 1 | 35 | 20893 | 9.5% | 8.3% ± 1.3 | 8.9% | 20.3% / 18.8% | 8.5% | 600 / 193 | T3/M1 | 54% |

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

Skipped turns: 1.

Sentry safety: 1 sentry bullets hit Hadur, 6 of Hadur's bullets hit a sentry.

Posture (Hadur's M records, 9 rounds): 0 melee ticks, 2133 duel ticks, 2363 focused-duel ticks; 8 rounds vetoed; 0 melee faults; longest scan gap 0 ticks; 0 ticks aimed at a dead robot; 4 shots at a sentry.

Rerun after the review fixes (the fence now allows for braking; the harvester ranks a round cut short as unfinished). The one sentry bullet that hit Hadur hit it at (410, 845), 155 px from the nearest wall and outside the border: a sentry shot at a robot in the border that missed and flew on. The 6 of Hadur's bullets that hit the sentry were aimed at the duel's opponent.

## Melee bench: challenge

hadur2.Hadur 2.2 against 9 opponents at once, 100 rounds per battle, 1 battles, 1000x1000.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 74.6 | 42 / 100 | 3.29 | 15.2% | 9521 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 2.2 | 1.0 | 15.2% | 42 |
| rz.HawkOnFire 0.1 | 2.0 | 14.9% | 17 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.5% | 16 |
| supersample.SuperSpinBot 1.0 | 4.0 | 10.0% | 3 |
| sample.Walls | 5.0 | 10.0% | 9 |
| sample.SpinBot | 6.0 | 7.6% | 3 |
| SuperSample.SuperCrazy 1.0 | 7.0 | 7.4% | 1 |
| supersample.SuperTracker 1.0 | 8.0 | 7.4% | 2 |
| supersample.SuperWalls 1.0 | 9.0 | 7.2% | 3 |
| sample.Crazy | 10.0 | 7.0% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 74.6 | 42 / 100 | 9521 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 16 | 88% |
| kawigi.micro.Shiz 1.1 | 11 | 100% |
| sample.Walls | 9 | 89% |
| sample.Crazy | 3 | 67% |
| SuperSample.SuperCrazy 1.0 | 3 | 67% |
| sample.SpinBot | 2 | 100% |
| supersample.SuperTracker 1.0 | 2 | 100% |
| supersample.SuperWalls 1.0 | 1 | 100% |

Skipped turns: 1.

Posture (Hadur's M records, 100 rounds): 63679 melee ticks, 10912 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 526 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

## Melee bench: reference

hadur2.Hadur 2.2 against 9 opponents at once, 35 rounds per battle, 5 battles, 1000x1000.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 37.0 | 32.1 | 2 / 175 | 7.11 | 5.9% | 6506 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 14.3% | 36 |
| kawigi.mini.Coriantumr 1.1 | 3.8 | 11.0% | 16 |
| abc.Tron 2.02 | 3.8 | 11.5% | 24 |
| darkcanuck.B26354 1.06 | 4.8 | 11.0% | 28 |
| rz.HawkOnFire 0.1 | 5.0 | 10.7% | 10 |
| kawigi.sbf.FloodHT 0.9.2 | 5.6 | 10.5% | 20 |
| simonton.micro.Sprout 1.1.3 | 5.8 | 10.4% | 12 |
| gh.Griezel 0.5.4 | 6.2 | 10.0% | 27 |
| hadur2.Hadur 2.2 | 9.0 | 5.9% | 2 |
| cx.mini.Cigaret 1.31 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 9 | 32.5 | 26.0 | 1 / 35 | 1050 |
| 2 | 9 | 37.6 | 32.7 | 0 / 35 | 1381 |
| 3 | 9 | 35.7 | 29.2 | 0 / 35 | 1326 |
| 4 | 9 | 37.3 | 32.4 | 0 / 35 | 1323 |
| 5 | 9 | 41.9 | 40.3 | 1 / 35 | 1426 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 3 | 33% |
| darkcanuck.B26354 1.06 | 2 | 50% |
| rz.Aleph 0.34 | 1 | 0% |
| simonton.micro.Sprout 1.1.3 | 1 | 0% |

Skipped turns: 0.

Posture (Hadur's M records, 175 rounds): 62098 melee ticks, 1846 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 327 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

