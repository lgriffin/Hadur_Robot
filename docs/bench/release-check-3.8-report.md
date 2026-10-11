# Bench suite: release-check-38.txt

## Bench: hadur2.Hadur 3.8 (cold)

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=3837774.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | rumble-2 | 45.5% ± 2.8 | 43.9% ± 4.8 | 47.4% ± 1.5 | 155 / 350 | 7.4% ± 0.3 | 10.1% ± 0.3 | 447 | 0 | 2.78 / 259.2 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 86998 | 19 | 86167 | 86159 (99.0%) | 839 (1.0%) | 8 (0.0%) | 5372 | 566 | 353 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 86710 | 11054 (12.7%) | 85694 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 650 | 515 | 650 | 2885 | 27.6 / 30.6 | 18 | 11338 | 663 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 10.1% | 447 | 1007 | 3 | 244.7 | 10992 / 11054 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.8 vs hadur2.Hadur 3.7

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 45.5% ± 2.8 | 35.1% ± 2.5 | +10.5 ± 3.1 |

# Bench: hadur2.Hadur 3.8 baseline (hadur2.Hadur 3.7) (cold)

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=3837774.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | rumble-2 | 35.1% ± 2.5 | 21.6% ± 3.5 | 49.8% ± 1.6 | 81 / 350 | 7.7% ± 0.3 | 11.8% ± 3.0 | 314 | 0 | 2.70 / 158.4 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 80407 | 32 | 79987 | 79974 (99.5%) | 433 (0.5%) | 13 (0.0%) | 4595 | 543 | 357 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 79318 | 9876 (12.5%) | 78286 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 650 | 518 | 650 | 2661 | 28.3 / 28.5 | 0 | 524 | 186 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 11.8% | 314 | 39737 | 3 | 226.8 | 9841 / 9876 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Bench: hadur2.Hadur 3.8 (cold)

35 rounds x 2 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=4318525.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 25.9% ± 22.6 | 15.7% ± 54.5 | 39.7% ± 16.4 | 11 / 70 | 5.1% ± 0.6 | 9.6% ± 2.5 | 28 | 0 | 3.42 / 107.7 |
| jk.mega.DrussGT 3.1.16 | rumble-2 | 53.4% ± 95.5 | 56.9% ± 162.5 | 49.8% ± 22.2 | 41 / 70 | 7.6% ± 0.6 | 9.9% ± 0.6 | 41 | 0 | 2.86 / 87.7 |
| oog.mega.saguaro.Saguaro 1.0 | rumble-3 | 68.6% ± 43.1 | 78.6% ± 54.5 | 59.0% ± 28.8 | 55 / 70 | 18.6% ± 2.5 | 6.8% ± 7.0 | 8 | 0 | 3.63 / 30.0 |
| aaa.r.ScalarR 0.005h.053-noshield | rumble-4 | 42.9% ± 18.0 | 41.4% ± 18.2 | 44.8% ± 15.9 | 29 / 70 | 7.1% ± 6.4 | 9.6% ± 5.1 | 33 | 0 | 3.36 / 58.7 |
| voidious.Diamond 1.8.22 | rumble-5 | 49.8% ± 6.5 | 58.6% ± 18.2 | 40.4% ± 9.3 | 41 / 70 | 6.6% ± 3.8 | 9.2% ± 5.1 | 42 | 0 | 3.39 / 62.5 |
| cb.fire.Firestarter 2.0f | rumble-6 | 51.1% ± 35.6 | 48.6% ± 72.6 | 53.8% ± 2.9 | 34 / 70 | 8.6% ± 0.0 | 8.6% ± 3.2 | 64 | 0 | 2.98 / 218.6 |
| dsekercioglu.mega.Raven 3.56j8 | rumble-7 | 56.8% ± 37.2 | 72.9% ± 54.5 | 39.7% ± 15.5 | 51 / 70 | 9.4% ± 7.6 | 9.2% ± 1.9 | 8 | 0 | 2.09 / 41.1 |
| xander.cat.XanderCat 12.9 | rumble-8 | 46.6% ± 15.3 | 47.1% ± 18.2 | 46.3% ± 33.2 | 33 / 70 | 11.7% ± 6.4 | 9.0% ± 1.3 | 18 | 0 | 2.11 / 23.8 |
| lxx.Tomcat 3.68 | rumble-9 | 45.6% ± 6.0 | 51.4% ± 36.3 | 40.4% ± 21.6 | 36 / 70 | 9.0% ± 0.6 | 10.1% ± 1.3 | 24 | 0 | 3.18 / 118.7 |
| rsalesc.mega.Knight 0.6.28 | rumble-10 | 55.3% ± 17.7 | 58.6% ± 18.2 | 51.4% ± 16.1 | 41 / 70 | 9.5% ± 0.6 | 10.1% ± 2.5 | 32 | 0 | 3.41 / 59.4 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 10356 | 105 | 11070 | 10341 (99.9%) | 15 (0.1%) | 729 (6.6%) | 449 | 68 | 21 |
| jk.mega.DrussGT 3.1.16 | 19247 | 6 | 19226 | 19220 (99.9%) | 27 (0.1%) | 6 (0.0%) | 1238 | 112 | 36 |
| oog.mega.saguaro.Saguaro 1.0 | 2362 | 5 | 2354 | 2350 (99.5%) | 12 (0.5%) | 4 (0.2%) | 166 | 32 | 5 |
| aaa.r.ScalarR 0.005h.053-noshield | 14215 | 6 | 14729 | 14144 (99.5%) | 71 (0.5%) | 585 (4.0%) | 901 | 143 | 29 |
| voidious.Diamond 1.8.22 | 14586 | 299 | 15180 | 14514 (99.5%) | 72 (0.5%) | 666 (4.4%) | 859 | 93 | 38 |
| cb.fire.Firestarter 2.0f | 17181 | 397 | 19725 | 17047 (99.2%) | 134 (0.8%) | 2678 (13.6%) | 1475 | 134 | 47 |
| dsekercioglu.mega.Raven 3.56j8 | 6252 | 28 | 6251 | 6251 (100.0%) | 1 (0.0%) | 0 (0.0%) | 474 | 75 | 7 |
| xander.cat.XanderCat 12.9 | 8677 | 2 | 8939 | 8656 (99.8%) | 21 (0.2%) | 283 (3.2%) | 982 | 106 | 17 |
| lxx.Tomcat 3.68 | 10384 | 296 | 10370 | 10357 (99.7%) | 27 (0.3%) | 13 (0.1%) | 808 | 84 | 23 |
| rsalesc.mega.Knight 0.6.28 | 18389 | 144 | 18324 | 18319 (99.6%) | 70 (0.4%) | 5 (0.0%) | 1511 | 150 | 26 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 10328 | 1133 (11.0%) | 10063 |
| jk.mega.DrussGT 3.1.16 | 19293 | 2488 (12.9%) | 19074 |
| oog.mega.saguaro.Saguaro 1.0 | 2669 | 193 (7.2%) | 2640 |
| aaa.r.ScalarR 0.005h.053-noshield | 14487 | 1726 (11.9%) | 13932 |
| voidious.Diamond 1.8.22 | 14828 | 1601 (10.8%) | 14228 |
| cb.fire.Firestarter 2.0f | 19715 | 1753 (8.9%) | 18925 |
| dsekercioglu.mega.Raven 3.56j8 | 6736 | 665 (9.9%) | 5930 |
| xander.cat.XanderCat 12.9 | 10306 | 964 (9.4%) | 9672 |
| lxx.Tomcat 3.68 | 10624 | 1280 (12.0%) | 10138 |
| rsalesc.mega.Knight 0.6.28 | 18538 | 2099 (11.3%) | 18340 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 536 | 650 | 1771 | 19.4 / 29.4 | 1 | 412 | 1 |
| jk.mega.DrussGT 3.1.16 | 650 | 514 | 650 | 3191 | 29.5 / 29.8 | 10 | 4217 | 216 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 439 | 413 | 529 | 40.9 / 28.4 | 291 | 784 | 253 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 485 | 650 | 2434 | 24.4 / 30.0 | 0 | 774 | 0 |
| voidious.Diamond 1.8.22 | 650 | 536 | 650 | 2464 | 21.2 / 31.3 | 25 | 4629 | 21 |
| cb.fire.Firestarter 2.0f | 650 | 548 | 650 | 3245 | 32.0 / 27.5 | 3 | 1569 | 10 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 451 | 650 | 1173 | 23.4 / 35.6 | 47 | 6993 | 513 |
| xander.cat.XanderCat 12.9 | 650 | 449 | 650 | 1784 | 30.8 / 35.7 | 94 | 574 | 12 |
| lxx.Tomcat 3.68 | 650 | 509 | 650 | 1803 | 24.6 / 36.2 | 75 | 6566 | 5 |
| rsalesc.mega.Knight 0.6.28 | 650 | 503 | 650 | 3055 | 31.4 / 29.7 | 167 | 4468 | 1 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 9.6% | 28 | 296 | 3 | 157.4 | 1131 / 1133 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 9.9% | 41 | 433 | 3 | 272.9 | 2485 / 2488 (100%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 6.8% | 8 | 76 | 3 | 33.6 | 193 / 193 (100%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 9.6% | 33 | 93 | 3 | 210.1 | 1717 / 1726 (99%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 9.2% | 42 | 348 | 3 | 215.8 | 1598 / 1601 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 8.6% | 64 | 315 | 3 | 281.0 | 1745 / 1753 (100%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 9.2% | 8 | 155 | 3 | 89.0 | 661 / 665 (99%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 9.0% | 18 | 219 | 3 | 127.0 | 962 / 964 (100%) | 0 | 0 |
| lxx.Tomcat 3.68 | 10.1% | 24 | 250 | 3 | 148.0 | 1279 / 1280 (100%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 10.1% | 32 | 429 | 3 | 261.3 | 2097 / 2099 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| voidious.Diamond 1.8.22 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| cb.fire.Firestarter 2.0f | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| xander.cat.XanderCat 12.9 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| lxx.Tomcat 3.68 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.8 vs hadur2.Hadur 3.7

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 25.9% ± 22.6 | 18.5% ± 5.1 | +7.5 ± 27.7 |
| jk.mega.DrussGT 3.1.16 | 53.4% ± 95.5 | 29.0% ± 2.9 | +24.3 ± 98.4 |
| oog.mega.saguaro.Saguaro 1.0 | 68.6% ± 43.1 | 73.6% ± 51.2 | -5.0 ± 8.1 |
| aaa.r.ScalarR 0.005h.053-noshield | 42.9% ± 18.0 | 20.7% ± 3.5 | +22.3 ± 21.5 |
| voidious.Diamond 1.8.22 | 49.8% ± 6.5 | 25.6% ± 55.0 | +24.2 ± 48.5 |
| cb.fire.Firestarter 2.0f | 51.1% ± 35.6 | 40.8% ± 87.1 | +10.4 ± 51.5 |
| dsekercioglu.mega.Raven 3.56j8 | 56.8% ± 37.2 | 57.6% ± 25.4 | -0.9 ± 62.6 |
| xander.cat.XanderCat 12.9 | 46.6% ± 15.3 | 53.8% ± 124.5 | -7.2 ± 109.2 |
| lxx.Tomcat 3.68 | 45.6% ± 6.0 | 54.2% ± 55.7 | -8.6 ± 49.7 |
| rsalesc.mega.Knight 0.6.28 | 55.3% ± 17.7 | 50.3% ± 19.9 | +5.0 ± 37.7 |

# Bench: hadur2.Hadur 3.8 baseline (hadur2.Hadur 3.7) (cold)

35 rounds x 2 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=4318525.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 18.5% ± 5.1 | 2.9% ± 0.0 | 38.9% ± 11.8 | 2 / 70 | 5.7% ± 0.6 | 11.2% ± 23.5 | 38 | 0 | 3.40 / 100.5 |
| jk.mega.DrussGT 3.1.16 | rumble-2 | 29.0% ± 2.9 | 11.8% ± 0.0 | 47.3% ± 6.4 | 10 / 70 | 7.7% ± 6.4 | 10.4% ± 1.3 | 63 | 0 | 2.73 / 112.8 |
| oog.mega.saguaro.Saguaro 1.0 | rumble-3 | 73.6% ± 51.2 | 85.7% ± 36.3 | 61.9% ± 60.3 | 60 / 70 | 19.3% ± 1.9 | 6.7% ± 10.2 | 0 | 0 | 3.29 / 96.2 |
| aaa.r.ScalarR 0.005h.053-noshield | rumble-4 | 20.7% ± 3.5 | 5.7% ± 0.0 | 38.0% ± 6.1 | 4 / 70 | 7.2% ± 3.2 | 10.7% ± 1.3 | 54 | 0 | 3.16 / 210.7 |
| voidious.Diamond 1.8.22 | rumble-5 | 25.6% ± 55.0 | 16.2% ± 56.1 | 36.9% ± 42.6 | 13 / 70 | 7.0% ± 8.3 | 8.9% ± 6.4 | 31 | 0 | 3.07 / 88.1 |
| cb.fire.Firestarter 2.0f | rumble-6 | 40.8% ± 87.1 | 24.3% ± 127.1 | 58.1% ± 30.3 | 17 / 70 | 9.0% ± 5.7 | 14.2% ± 85.8 | 78 | 0 | 2.84 / 126.8 |
| dsekercioglu.mega.Raven 3.56j8 | rumble-7 | 57.6% ± 25.4 | 71.4% ± 36.3 | 44.4% ± 14.2 | 50 / 70 | 9.8% ± 0.0 | 8.6% ± 3.2 | 13 | 0 | 2.11 / 48.6 |
| xander.cat.XanderCat 12.9 | rumble-8 | 53.8% ± 124.5 | 58.6% ± 163.4 | 49.4% ± 82.4 | 41 / 70 | 11.3% ± 0.6 | 8.8% ± 14.6 | 14 | 0 | 2.04 / 68.4 |
| lxx.Tomcat 3.68 | rumble-9 | 54.2% ± 55.7 | 60.3% ± 56.1 | 48.6% ± 52.5 | 43 / 70 | 8.5% ± 2.5 | 8.7% ± 3.8 | 22 | 0 | 3.06 / 58.8 |
| rsalesc.mega.Knight 0.6.28 | rumble-10 | 50.3% ± 19.9 | 42.9% ± 36.3 | 57.3% ± 5.0 | 30 / 70 | 9.5% ± 0.6 | 9.4% ± 9.5 | 22 | 0 | 3.20 / 61.6 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 14627 | 144 | 14698 | 14549 (99.5%) | 78 (0.5%) | 149 (1.0%) | 631 | 99 | 34 |
| jk.mega.DrussGT 3.1.16 | 17097 | 5 | 17010 | 17009 (99.5%) | 88 (0.5%) | 1 (0.0%) | 1004 | 111 | 50 |
| oog.mega.saguaro.Saguaro 1.0 | 2222 | 3 | 2223 | 2220 (99.9%) | 2 (0.1%) | 3 (0.1%) | 161 | 28 | 1 |
| aaa.r.ScalarR 0.005h.053-noshield | 15262 | 10 | 15422 | 15164 (99.4%) | 98 (0.6%) | 258 (1.7%) | 903 | 131 | 44 |
| voidious.Diamond 1.8.22 | 13890 | 578 | 14425 | 13856 (99.8%) | 34 (0.2%) | 569 (3.9%) | 758 | 90 | 33 |
| cb.fire.Firestarter 2.0f | 14280 | 570 | 15856 | 14212 (99.5%) | 68 (0.5%) | 1644 (10.4%) | 1118 | 97 | 44 |
| dsekercioglu.mega.Raven 3.56j8 | 5506 | 28 | 5503 | 5502 (99.9%) | 4 (0.1%) | 1 (0.0%) | 315 | 65 | 24 |
| xander.cat.XanderCat 12.9 | 7325 | 1 | 7589 | 7325 (100.0%) | 0 (0.0%) | 264 (3.5%) | 667 | 101 | 14 |
| lxx.Tomcat 3.68 | 9861 | 224 | 9894 | 9837 (99.8%) | 24 (0.2%) | 57 (0.6%) | 581 | 82 | 22 |
| rsalesc.mega.Knight 0.6.28 | 15523 | 238 | 15489 | 15483 (99.7%) | 40 (0.3%) | 6 (0.0%) | 1087 | 152 | 21 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 14437 | 1679 (11.6%) | 13822 |
| jk.mega.DrussGT 3.1.16 | 16801 | 2151 (12.8%) | 16533 |
| oog.mega.saguaro.Saguaro 1.0 | 2562 | 181 (7.1%) | 2548 |
| aaa.r.ScalarR 0.005h.053-noshield | 15179 | 1807 (11.9%) | 14732 |
| voidious.Diamond 1.8.22 | 13872 | 1417 (10.2%) | 13486 |
| cb.fire.Firestarter 2.0f | 16077 | 1460 (9.1%) | 15716 |
| dsekercioglu.mega.Raven 3.56j8 | 5831 | 623 (10.7%) | 5262 |
| xander.cat.XanderCat 12.9 | 8587 | 786 (9.2%) | 7802 |
| lxx.Tomcat 3.68 | 9959 | 1189 (11.9%) | 9712 |
| rsalesc.mega.Knight 0.6.28 | 15343 | 1748 (11.4%) | 15166 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 538 | 650 | 2408 | 19.6 / 30.8 | 0 | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 650 | 518 | 650 | 2813 | 28.0 / 31.2 | 16 | 72 | 33 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 429 | 425 | 517 | 43.2 / 26.7 | 261 | 1196 | 282 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 485 | 650 | 2587 | 21.7 / 35.5 | 4 | 121 | 0 |
| voidious.Diamond 1.8.22 | 650 | 535 | 650 | 2348 | 20.5 / 35.0 | 0 | 114 | 32 |
| cb.fire.Firestarter 2.0f | 650 | 549 | 650 | 2735 | 33.2 / 23.9 | 15 | 160 | 1 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 454 | 650 | 1051 | 28.6 / 35.8 | 7 | 679 | 614 |
| xander.cat.XanderCat 12.9 | 650 | 453 | 650 | 1494 | 32.5 / 33.4 | 70 | 641 | 36 |
| lxx.Tomcat 3.68 | 650 | 514 | 650 | 1729 | 29.7 / 31.5 | 0 | 236 | 8 |
| rsalesc.mega.Knight 0.6.28 | 650 | 512 | 650 | 2596 | 35.7 / 26.6 | 0 | 168 | 30 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 11.2% | 38 | 190 | 3 | 209.5 | 1674 / 1679 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 10.4% | 63 | 313 | 3 | 240.5 | 2149 / 2151 (100%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 6.7% | 0 | 139 | 1 | 31.7 | 181 / 181 (100%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10.7% | 54 | 113 | 3 | 216.4 | 1800 / 1807 (100%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 8.9% | 31 | 25827 | 3 | 203.3 | 1415 / 1417 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 14.2% | 78 | 318 | 3 | 224.6 | 1448 / 1460 (99%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 8.6% | 13 | 139 | 3 | 78.1 | 623 / 623 (100%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 8.8% | 14 | 142 | 3 | 107.5 | 784 / 786 (100%) | 0 | 0 |
| lxx.Tomcat 3.68 | 8.7% | 22 | 167 | 3 | 140.7 | 1189 / 1189 (100%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 9.4% | 22 | 326 | 3 | 219.4 | 1746 / 1748 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| voidious.Diamond 1.8.22 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| cb.fire.Firestarter 2.0f | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| xander.cat.XanderCat 12.9 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| lxx.Tomcat 3.68 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

