# Bench: hadur2.Hadur 3.1 (cold)

35 rounds x 5 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 4 cores. robocode.cpu.constant=3913179.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 19.0% ± 4.3 | 2.3% ± 4.6 | 40.4% ± 4.4 | 4 / 175 | 5.5% ± 0.3 | 9.4% ± 0.1 | 79 | 0 | 2.96 / 187.6 |
| jk.mega.DrussGT 3.1.16 | rumble-2 | 35.5% ± 5.0 | 24.0% ± 7.4 | 48.1% ± 2.6 | 42 / 175 | 7.8% ± 0.2 | 9.7% ± 0.3 | 97 | 0 | 2.53 / 194.2 |
| oog.mega.saguaro.Saguaro 1.0 | rumble-3 | 73.7% ± 7.3 | 85.1% ± 7.7 | 62.4% ± 7.1 | 149 / 175 | 20.0% ± 2.2 | 6.6% ± 1.3 | 27 | 0 | 3.04 / 67.2 |
| aaa.r.ScalarR 0.005h.053-noshield | rumble-4 | 27.3% ± 2.6 | 13.7% ± 3.9 | 42.8% ± 3.3 | 24 / 175 | 7.0% ± 0.4 | 10.2% ± 1.0 | 98 | 0 | 2.68 / 88.1 |
| voidious.Diamond 1.8.22 | rumble-5 | 33.4% ± 2.9 | 24.0% ± 2.9 | 44.1% ± 4.7 | 45 / 175 | 7.0% ± 0.3 | 8.5% ± 0.4 | 153 | 0 | 2.63 / 120.6 |
| cb.fire.Firestarter 2.0f | rumble-6 | 40.1% ± 4.0 | 23.0% ± 5.2 | 58.2% ± 4.0 | 41 / 175 | 9.1% ± 0.7 | 8.4% ± 0.5 | 77 | 0 | 2.35 / 46.5 |
| dsekercioglu.mega.Raven 3.56j8 | rumble-7 | 57.5% ± 5.2 | 72.0% ± 5.8 | 43.5% ± 4.3 | 126 / 175 | 9.0% ± 0.8 | 9.1% ± 1.1 | 37 | 0 | 1.66 / 33.0 |
| xander.cat.XanderCat 12.9 | rumble-8 | 57.8% ± 2.1 | 64.6% ± 3.2 | 51.3% ± 2.1 | 113 / 175 | 11.8% ± 0.4 | 8.5% ± 0.5 | 42 | 0 | 1.71 / 81.1 |
| lxx.Tomcat 3.68 | rumble-9 | 55.5% ± 9.4 | 65.4% ± 12.9 | 46.4% ± 6.1 | 115 / 175 | 9.0% ± 0.6 | 9.7% ± 0.4 | 76 | 0 | 2.66 / 53.5 |
| rsalesc.mega.Knight 0.6.28 | rumble-10 | 46.8% ± 6.2 | 38.9% ± 9.6 | 54.5% ± 3.3 | 68 / 175 | 9.9% ± 0.5 | 9.4% ± 0.3 | 130 | 0 | 3.42 / 178.5 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 38724 | 342 | 39252 | 38719 (100.0%) | 5 (0.0%) | 533 (1.4%) | 1676 | 225 | 69 |
| jk.mega.DrussGT 3.1.16 | 42406 | 11 | 42408 | 42406 (100.0%) | 0 (0.0%) | 2 (0.0%) | 2532 | 296 | 92 |
| oog.mega.saguaro.Saguaro 1.0 | 5799 | 9 | 5801 | 5793 (99.9%) | 6 (0.1%) | 8 (0.1%) | 417 | 90 | 16 |
| aaa.r.ScalarR 0.005h.053-noshield | 34242 | 12 | 35335 | 34240 (100.0%) | 2 (0.0%) | 1095 (3.1%) | 1828 | 363 | 92 |
| voidious.Diamond 1.8.22 | 37800 | 1364 | 39207 | 37781 (99.9%) | 19 (0.1%) | 1426 (3.6%) | 2056 | 236 | 70 |
| cb.fire.Firestarter 2.0f | 37146 | 1478 | 40698 | 37134 (100.0%) | 12 (0.0%) | 3564 (8.8%) | 3002 | 280 | 74 |
| dsekercioglu.mega.Raven 3.56j8 | 14034 | 58 | 14034 | 14032 (100.0%) | 2 (0.0%) | 2 (0.0%) | 708 | 185 | 32 |
| xander.cat.XanderCat 12.9 | 17457 | 3 | 17845 | 17457 (100.0%) | 0 (0.0%) | 388 (2.2%) | 1923 | 237 | 31 |
| lxx.Tomcat 3.68 | 22292 | 546 | 22299 | 22272 (99.9%) | 20 (0.1%) | 27 (0.1%) | 1366 | 184 | 64 |
| rsalesc.mega.Knight 0.6.28 | 39350 | 593 | 39339 | 39333 (100.0%) | 17 (0.0%) | 6 (0.0%) | 2998 | 286 | 91 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 38167 | 4455 (11.7%) | 37627 |
| jk.mega.DrussGT 3.1.16 | 41951 | 5414 (12.9%) | 41806 |
| oog.mega.saguaro.Saguaro 1.0 | 6656 | 496 (7.5%) | 6621 |
| aaa.r.ScalarR 0.005h.053-noshield | 34516 | 3855 (11.2%) | 33942 |
| voidious.Diamond 1.8.22 | 37523 | 4048 (10.8%) | 36876 |
| cb.fire.Firestarter 2.0f | 41896 | 3822 (9.1%) | 40923 |
| dsekercioglu.mega.Raven 3.56j8 | 14787 | 1446 (9.8%) | 14175 |
| xander.cat.XanderCat 12.9 | 21380 | 1851 (8.7%) | 19435 |
| lxx.Tomcat 3.68 | 22788 | 2681 (11.8%) | 22082 |
| rsalesc.mega.Knight 0.6.28 | 39003 | 4566 (11.7%) | 38489 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 541 | 650 | 2551 | 20.7 / 30.5 | 0 | 35 | 0 |
| jk.mega.DrussGT 3.1.16 | 650 | 520 | 650 | 2793 | 27.9 / 30.1 | 6 | 228 | 2 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 449 | 475 | 536 | 43.6 / 26.1 | 973 | 2216 | 546 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 487 | 650 | 2334 | 24.6 / 32.9 | 0 | 576 | 0 |
| voidious.Diamond 1.8.22 | 650 | 540 | 650 | 2537 | 24.4 / 30.9 | 0 | 358 | 193 |
| cb.fire.Firestarter 2.0f | 650 | 551 | 650 | 2801 | 33.4 / 24.1 | 35 | 356 | 25 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 457 | 650 | 1066 | 27.4 / 35.7 | 19 | 760 | 1297 |
| xander.cat.XanderCat 12.9 | 650 | 451 | 650 | 1498 | 34.0 / 32.3 | 234 | 1156 | 110 |
| lxx.Tomcat 3.68 | 650 | 517 | 650 | 1579 | 30.1 / 34.6 | 41 | 593 | 8 |
| rsalesc.mega.Knight 0.6.28 | 650 | 511 | 650 | 2618 | 34.8 / 28.9 | 80 | 490 | 79 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 9.4% | 79 | 471 | 3 | 222.9 | 4451 / 4455 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 9.7% | 97 | 679 | 3 | 240.6 | 5413 / 5414 (100%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 6.6% | 27 | 2936 | 2 | 33.0 | 496 / 496 (100%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10.2% | 98 | 356 | 3 | 201.5 | 3848 / 3855 (100%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 8.5% | 153 | 12115 | 3 | 220.7 | 4044 / 4048 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 8.4% | 77 | 710 | 3 | 231.1 | 3808 / 3822 (100%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 9.1% | 37 | 688 | 3 | 79.8 | 1442 / 1446 (100%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 8.5% | 42 | 533 | 3 | 101.6 | 1851 / 1851 (100%) | 0 | 0 |
| lxx.Tomcat 3.68 | 9.7% | 76 | 343 | 3 | 127.1 | 2678 / 2681 (100%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 9.4% | 130 | 527 | 3 | 222.8 | 4565 / 4566 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| voidious.Diamond 1.8.22 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| cb.fire.Firestarter 2.0f | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| xander.cat.XanderCat 12.9 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| lxx.Tomcat 3.68 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 0 / 5 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | kc.mega.BeepBoop | 1 | 35 | 23695 | 9.8% | 8.2% ± 1.0 | 5.7% | 21.0% / 20.3% | 0.0% | 600 / 300 | T3/M1 | 19% |
| jk.mega.DrussGT 3.1.16 | jk.mega.DrussGT | 1 | 35 | 23697 | 11.0% | 9.2% ± 1.0 | 7.7% | 24.0% / 21.4% | 1.6% | 600 / 300 | T3/M1 | 29% |
| oog.mega.saguaro.Saguaro 1.0 | oog.mega.saguaro.Saguaro | 1 | 35 | 18943 | 8.6% | 8.3% ± 1.6 | 12.8% | 24.8% / 25.8% | 11.6% | 600 / 116 | T3/M1 | 63% |
| aaa.r.ScalarR 0.005h.053-noshield | aaa.r.ScalarR | 1 | 35 | 23715 | 10.6% | 8.5% ± 0.9 | 6.6% | 23.7% / 22.3% | 0.0% | 600 / 300 | T3/M1 | 29% |
| voidious.Diamond 1.8.22 | voidious.Diamond | 1 | 34 | 23701 | 8.7% | 7.5% ± 0.8 | 7.0% | 23.0% / 22.5% | 9.2% | 600 / 300 | T3/M1 | 32% |
| cb.fire.Firestarter 2.0f | cb.fire.Firestarter | 1 | 35 | 23709 | 9.2% | 8.0% ± 1.1 | 9.1% | 20.4% / 21.8% | 3.1% | 600 / 300 | T3/M2 | 42% |
| dsekercioglu.mega.Raven 3.56j8 | dsekercioglu.mega.Raven | 1 | 35 | 22871 | 9.2% | 7.6% ± 1.0 | 8.9% | 21.0% / 21.5% | 11.1% | 600 / 267 | T3/M1 | 54% |
| xander.cat.XanderCat 12.9 | xander.cat.XanderCat | 1 | 35 | 23713 | 10.2% | 7.5% ± 0.9 | 11.3% | 23.3% / 21.7% | 8.4% | 600 / 300 | T3/M1 | 59% |
| lxx.Tomcat 3.68 | lxx.Tomcat | 1 | 35 | 23673 | 9.7% | 8.8% ± 0.9 | 8.8% | 23.5% / 22.1% | 8.8% | 600 / 300 | T3/M1 | 53% |
| rsalesc.mega.Knight 0.6.28 | rsalesc.mega.Knight | 1 | 35 | 23713 | 9.7% | 7.8% ± 1.0 | 9.7% | 24.3% / 21.3% | 12.0% | 600 / 300 | T3/M1 | 47% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
