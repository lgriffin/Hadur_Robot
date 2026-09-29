# Bench: hadur2.Hadur 3.1 (cold)

35 rounds x 2 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 4 cores. robocode.cpu.constant=4031985.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | weak | 99.9% ± 1.3 | 100.0% ± 0.0 | 99.8% ± 2.0 | 70 / 70 | 41.3% ± 10.2 | 0.2% ± 2.5 | 1 | 0 | 0.79 / 14.7 |
| abud.ThirdRobo 1.0 | weak | 97.7% ± 9.2 | 100.0% ± 0.0 | 96.0% ± 15.5 | 70 / 70 | 46.7% ± 11.4 | 6.3% ± 19.1 | 1 | 0 | 0.83 / 12.9 |
| bons.NanoStalker 1.2 | weak | 97.6% ± 18.8 | 100.0% ± 0.0 | 95.3% ± 36.3 | 70 / 70 | 43.5% ± 33.0 | 2.8% ± 15.2 | 2 | 0 | 0.88 / 11.8 |
| dittman.BlindSquirl Retired | weak | 97.6% ± 0.0 | 100.0% ± 0.0 | 95.5% ± 0.1 | 70 / 70 | 34.7% ± 14.6 | 5.2% ± 6.4 | 0 | 0 | 0.96 / 11.7 |
| hlavko.nano.Ringo 2.0 | weak | 98.6% ± 7.6 | 100.0% ± 0.0 | 97.5% ± 10.5 | 70 / 70 | 22.6% ± 1.3 | 0.7% ± 4.4 | 1 | 0 | 0.93 / 12.5 |
| jep.nano.Hawkwing 0.4.1 | weak | 95.4% ± 43.5 | 98.6% ± 18.2 | 93.3% ± 48.9 | 69 / 70 | 22.9% ± 21.6 | 1.9% ± 12.7 | 2 | 0 | 0.92 / 11.9 |
| kawigi.sbf.Barracuda 1.0 | weak | 98.2% ± 3.9 | 100.0% ± 0.0 | 95.3% ± 12.3 | 70 / 70 | 15.8% ± 8.3 | 1.0% ± 0.0 | 4 | 0 | 0.96 / 18.2 |
| nexus.Two 0.2 | weak | 98.3% ± 12.2 | 100.0% ± 0.0 | 95.9% ± 27.9 | 70 / 70 | 20.8% ± 0.0 | 1.3% ± 1.3 | 5 | 0 | 0.90 / 12.8 |
| pa.Improved 1.1 | weak | 99.1% ± 3.5 | 100.0% ± 0.0 | 98.2% ± 7.0 | 70 / 70 | 20.7% ± 17.8 | 0.7% ± 5.1 | 2 | 0 | 0.85 / 49.7 |
| quietus.NarrowRadar 0.1 | weak | 98.4% ± 5.4 | 100.0% ± 0.0 | 96.9% ± 10.1 | 70 / 70 | 63.1% ± 6.4 | 1.7% ± 5.7 | 6 | 0 | 0.93 / 9.9 |
| racso.Crono 1.0 | weak | 90.0% ± 43.8 | 98.6% ± 18.2 | 80.3% ± 64.9 | 69 / 70 | 16.0% ± 7.6 | 4.9% ± 22.9 | 6 | 0 | 1.12 / 41.2 |
| zzx.Gron 1.14 | weak | 97.5% ± 4.5 | 100.0% ± 0.0 | 93.4% ± 7.4 | 70 / 70 | 17.0% ± 26.0 | 1.4% ± 5.1 | 4 | 0 | 0.85 / 13.0 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 210 | 1 | 210 | 210 (100.0%) | 0 (0.0%) | 0 (0.0%) | 3 | 8 | 2 |
| abud.ThirdRobo 1.0 | 435 | 3 | 435 | 435 (100.0%) | 0 (0.0%) | 0 (0.0%) | 43 | 10 | 5 |
| bons.NanoStalker 1.2 | 666 | 7 | 667 | 666 (100.0%) | 0 (0.0%) | 1 (0.1%) | 16 | 22 | 3 |
| dittman.BlindSquirl Retired | 1162 | 4 | 1165 | 1162 (100.0%) | 0 (0.0%) | 3 (0.3%) | 224 | 21 | 0 |
| hlavko.nano.Ringo 2.0 | 1101 | 9 | 1221 | 1094 (99.4%) | 7 (0.6%) | 127 (10.4%) | 24 | 28 | 3 |
| jep.nano.Hawkwing 0.4.1 | 989 | 4 | 989 | 988 (99.9%) | 1 (0.1%) | 1 (0.1%) | 271 | 30 | 1 |
| kawigi.sbf.Barracuda 1.0 | 1622 | 16 | 1622 | 1622 (100.0%) | 0 (0.0%) | 0 (0.0%) | 4 | 19 | 5 |
| nexus.Two 0.2 | 944 | 3 | 948 | 943 (99.9%) | 1 (0.1%) | 5 (0.5%) | 604 | 37 | 4 |
| pa.Improved 1.1 | 1799 | 4 | 1800 | 1799 (100.0%) | 0 (0.0%) | 1 (0.1%) | 18 | 27 | 4 |
| quietus.NarrowRadar 0.1 | 511 | 4 | 511 | 511 (100.0%) | 0 (0.0%) | 0 (0.0%) | 0 | 18 | 5 |
| racso.Crono 1.0 | 1800 | 5 | 1803 | 1799 (99.9%) | 1 (0.1%) | 4 (0.2%) | 58 | 30 | 5 |
| zzx.Gron 1.14 | 1281 | 2 | 1283 | 1281 (100.0%) | 0 (0.0%) | 2 (0.2%) | 198 | 20 | 8 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 1083 | 7 (0.6%) | 0 |
| abud.ThirdRobo 1.0 | 901 | 23 (2.6%) | 0 |
| bons.NanoStalker 1.2 | 762 | 27 (3.5%) | 0 |
| dittman.BlindSquirl Retired | 1096 | 69 (6.3%) | 0 |
| hlavko.nano.Ringo 2.0 | 1130 | 63 (5.6%) | 0 |
| jep.nano.Hawkwing 0.4.1 | 1063 | 43 (4.0%) | 0 |
| kawigi.sbf.Barracuda 1.0 | 1792 | 74 (4.1%) | 0 |
| nexus.Two 0.2 | 1042 | 57 (5.5%) | 0 |
| pa.Improved 1.1 | 1823 | 120 (6.6%) | 321 |
| quietus.NarrowRadar 0.1 | 542 | 1 (0.2%) | 0 |
| racso.Crono 1.0 | 2008 | 101 (5.0%) | 175 |
| zzx.Gron 1.14 | 1444 | 55 (3.8%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 650 | 434 | 400 | 257 | 91.1 / 0.1 | 630 | 239 | 38 |
| abud.ThirdRobo 1.0 | 650 | 327 | 400 | 223 | 91.2 / 3.9 | 654 | 339 | 18 |
| bons.NanoStalker 1.2 | 650 | 304 | 400 | 190 | 73.9 / 3.7 | 551 | 912 | 0 |
| dittman.BlindSquirl Retired | 650 | 392 | 400 | 266 | 80.5 / 3.8 | 848 | 616 | 189 |
| hlavko.nano.Ringo 2.0 | 650 | 472 | 400 | 270 | 53.4 / 1.4 | 709 | 1067 | 63 |
| jep.nano.Hawkwing 0.4.1 | 650 | 418 | 400 | 258 | 48.0 / 3.5 | 674 | 1490 | 670 |
| kawigi.sbf.Barracuda 1.0 | 650 | 394 | 400 | 383 | 42.4 / 2.1 | 324 | 2279 | 69 |
| nexus.Two 0.2 | 650 | 500 | 400 | 244 | 38.8 / 1.7 | 497 | 1366 | 681 |
| pa.Improved 1.1 | 650 | 355 | 400 | 419 | 74.0 / 1.3 | 1116 | 1087 | 106 |
| quietus.NarrowRadar 0.1 | 650 | 375 | 400 | 141 | 79.7 / 2.5 | 392 | 434 | 259 |
| racso.Crono 1.0 | 650 | 434 | 400 | 427 | 48.1 / 12.0 | 363 | 1604 | 111 |
| zzx.Gron 1.14 | 650 | 417 | 400 | 321 | 38.9 / 2.8 | 302 | 1714 | 514 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 0.2% | 1 | 14 | 2 | 3.0 | 7 / 7 (100%) | 0 | 0 |
| abud.ThirdRobo 1.0 | 6.3% | 1 | 15 | 2 | 6.2 | 23 / 23 (100%) | 0 | 0 |
| bons.NanoStalker 1.2 | 2.8% | 2 | 15 | 2 | 9.5 | 27 / 27 (100%) | 0 | 0 |
| dittman.BlindSquirl Retired | 5.2% | 0 | 22 | 1 | 16.6 | 69 / 69 (100%) | 0 | 0 |
| hlavko.nano.Ringo 2.0 | 0.7% | 1 | 30 | 1 | 17.4 | 63 / 63 (100%) | 0 | 0 |
| jep.nano.Hawkwing 0.4.1 | 1.9% | 2 | 19 | 1 | 14.1 | 43 / 43 (100%) | 0 | 0 |
| kawigi.sbf.Barracuda 1.0 | 1.0% | 4 | 16 | 2 | 23.2 | 74 / 74 (100%) | 0 | 0 |
| nexus.Two 0.2 | 1.3% | 5 | 22 | 3 | 13.5 | 57 / 57 (100%) | 0 | 0 |
| pa.Improved 1.1 | 0.7% | 2 | 25 | 2 | 25.7 | 120 / 120 (100%) | 0 | 0 |
| quietus.NarrowRadar 0.1 | 1.7% | 6 | 10 | 2 | 7.3 | 1 / 1 (100%) | 0 | 0 |
| racso.Crono 1.0 | 4.9% | 6 | 45 | 2 | 25.8 | 101 / 101 (100%) | 0 | 0 |
| zzx.Gron 1.14 | 1.4% | 4 | 16 | 3 | 18.3 | 55 / 55 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| abud.ThirdRobo 1.0 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| bons.NanoStalker 1.2 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| dittman.BlindSquirl Retired | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| hlavko.nano.Ringo 2.0 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| jep.nano.Hawkwing 0.4.1 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| kawigi.sbf.Barracuda 1.0 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| nexus.Two 0.2 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| pa.Improved 1.1 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| quietus.NarrowRadar 0.1 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| racso.Crono 1.0 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| zzx.Gron 1.14 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | RobotMarco.MarcoV | 1 | 35 | 11973 | 1.9% | 0.8% ± 3.1 | 28.3% | 66.3% / 60.7% | 66.4% | 448 / 1 | T?/M? | 100% |
| abud.ThirdRobo 1.0 | abud.ThirdRobo | 1 | 35 | 11181 | 5.9% | 1.0% ± 2.0 | 31.2% | 37.2% / 30.9% | 4.6% | 407 / 12 | T0/M? | 98% |
| bons.NanoStalker 1.2 | bons.NanoStalker | 1 | 35 | 8147 | 1.6% | 0.6% ± 1.2 | 28.9% | 43.6% / 44.5% | 0.4% | 297 / 5 | T0/M? | 99% |
| dittman.BlindSquirl Retired | dittman.BlindSquirl | 1 | 35 | 13159 | 5.4% | 3.9% ± 1.7 | 23.5% | 52.1% / 48.2% | 7.1% | 462 / 32 | T1/M? | 97% |
| hlavko.nano.Ringo 2.0 | hlavko.nano.Ringo | 1 | 35 | 11817 | 0.7% | 0.1% ± 0.5 | 17.5% | 43.1% / 35.1% | 5.7% | 441 / 2 | T0/M? | 98% |
| jep.nano.Hawkwing 0.4.1 | jep.nano.Hawkwing | 1 | 35 | 11665 | 1.7% | 1.4% ± 1.2 | 18.1% | 36.8% / 29.2% | 5.1% | 429 / 8 | T0/M? | 98% |
| kawigi.sbf.Barracuda 1.0 | kawigi.sbf.Barracuda | 1 | 35 | 16171 | 2.0% | 0.9% ± 0.8 | 13.6% | 24.7% / 22.8% | 2.4% | 600 / 10 | T0/M? | 98% |
| nexus.Two 0.2 | nexus.Two | 1 | 35 | 11681 | 2.5% | 1.7% ± 1.3 | 15.9% | 43.9% / 37.7% | 30.3% | 427 / 12 | T0/M? | 96% |
| pa.Improved 1.1 | pa.Improved | 1 | 35 | 16083 | 0.9% | 0.2% ± 0.5 | 17.8% | 31.1% / 27.7% | 8.1% | 600 / 8 | T0/M? | 99% |
| quietus.NarrowRadar 0.1 | quietus.NarrowRadar | 1 | 35 | 5169 | 5.0% | 4.8% ± 2.8 | 40.0% | 97.9% / 97.5% | 100.0% | 174 / 13 | T2/M0 | 97% |
| racso.Crono 1.0 | racso.Crono | 1 | 35 | 16681 | 3.7% | 3.1% ± 1.2 | 13.9% | 30.6% / 27.4% | 6.3% | 600 / 31 | T1/M? | 93% |
| zzx.Gron 1.14 | zzx.Gron | 1 | 35 | 15475 | 1.7% | 0.9% ± 0.9 | 14.9% | 27.6% / 26.0% | 5.5% | 575 / 10 | T0/M? | 97% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
