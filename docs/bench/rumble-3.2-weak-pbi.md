# Bench: hadur2.Hadur 3.2 (cold)

35 rounds x 2 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 4 cores. robocode.cpu.constant=4250744.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | weak | 99.8% ± 0.5 | 100.0% ± 0.0 | 99.6% ± 1.2 | 70 / 70 | 38.4% ± 21.0 | 0.5% ± 1.9 | 5 | 0 | 1.07 / 55.8 |
| abud.ThirdRobo 1.0 | weak | 96.8% ± 11.7 | 100.0% ± 0.0 | 94.4% ± 19.7 | 70 / 70 | 44.3% ± 7.6 | 7.2% ± 33.7 | 3 | 0 | 0.95 / 27.9 |
| bons.NanoStalker 1.2 | weak | 98.2% ± 4.1 | 100.0% ± 0.0 | 96.4% ± 8.0 | 70 / 70 | 43.8% ± 15.2 | 1.9% ± 0.0 | 4 | 0 | 1.18 / 13.8 |
| dittman.BlindSquirl Retired | weak | 97.7% ± 0.7 | 100.0% ± 0.0 | 95.6% ± 1.3 | 70 / 70 | 33.0% ± 21.6 | 4.1% ± 4.4 | 3 | 0 | 1.02 / 22.0 |
| hlavko.nano.Ringo 2.0 | weak | 96.5% ± 28.4 | 98.6% ± 18.2 | 95.0% ± 29.7 | 69 / 70 | 24.8% ± 5.7 | 1.3% ± 7.0 | 4 | 0 | 0.94 / 21.9 |
| jep.nano.Hawkwing 0.4.1 | weak | 96.9% ± 18.4 | 100.0% ± 0.0 | 93.7% ± 27.7 | 70 / 70 | 24.5% ± 1.3 | 2.3% ± 9.5 | 3 | 0 | 1.04 / 20.0 |
| kawigi.sbf.Barracuda 1.0 | weak | 98.6% ± 10.9 | 100.0% ± 0.0 | 96.4% ± 27.3 | 70 / 70 | 13.8% ± 8.3 | 0.5% ± 4.4 | 7 | 0 | 1.24 / 23.7 |
| nexus.Two 0.2 | weak | 96.6% ± 4.9 | 100.0% ± 0.0 | 91.0% ± 10.4 | 70 / 70 | 19.5% ± 4.4 | 1.8% ± 3.8 | 27 | 0 | 1.38 / 237.2 |
| pa.Improved 1.1 | weak | 99.0% ± 8.7 | 100.0% ± 0.0 | 98.5% ± 12.9 | 70 / 70 | 20.9% ± 7.6 | 0.7% ± 0.6 | 29 | 0 | 1.32 / 69.1 |
| quietus.NarrowRadar 0.1 | weak | 98.7% ± 5.4 | 100.0% ± 0.0 | 97.5% ± 10.3 | 70 / 70 | 61.9% ± 4.4 | 1.3% ± 6.4 | 24 | 0 | 1.00 / 61.5 |
| racso.Crono 1.0 | weak | 89.0% ± 36.9 | 98.6% ± 18.2 | 78.7% ± 46.4 | 69 / 70 | 16.4% ± 1.9 | 5.3% ± 14.0 | 41 | 0 | 1.27 / 117.6 |
| zzx.Gron 1.14 | weak | 95.4% ± 5.3 | 100.0% ± 0.0 | 89.6% ± 15.4 | 70 / 70 | 19.1% ± 24.1 | 2.9% ± 2.5 | 6 | 0 | 1.09 / 111.3 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 229 | 2 | 229 | 229 (100.0%) | 0 (0.0%) | 0 (0.0%) | 3 | 10 | 2 |
| abud.ThirdRobo 1.0 | 448 | 3 | 448 | 448 (100.0%) | 0 (0.0%) | 0 (0.0%) | 46 | 23 | 4 |
| bons.NanoStalker 1.2 | 652 | 5 | 653 | 652 (100.0%) | 0 (0.0%) | 1 (0.2%) | 16 | 15 | 3 |
| dittman.BlindSquirl Retired | 1201 | 7 | 1204 | 1200 (99.9%) | 1 (0.1%) | 4 (0.3%) | 259 | 28 | 2 |
| hlavko.nano.Ringo 2.0 | 1157 | 3 | 1292 | 1146 (99.0%) | 11 (1.0%) | 146 (11.3%) | 44 | 20 | 6 |
| jep.nano.Hawkwing 0.4.1 | 951 | 7 | 953 | 951 (100.0%) | 0 (0.0%) | 2 (0.2%) | 304 | 28 | 2 |
| kawigi.sbf.Barracuda 1.0 | 1685 | 13 | 1685 | 1685 (100.0%) | 0 (0.0%) | 0 (0.0%) | 2 | 12 | 3 |
| nexus.Two 0.2 | 993 | 5 | 1001 | 992 (99.9%) | 1 (0.1%) | 9 (0.9%) | 602 | 40 | 9 |
| pa.Improved 1.1 | 1787 | 2 | 1787 | 1785 (99.9%) | 2 (0.1%) | 2 (0.1%) | 30 | 15 | 3 |
| quietus.NarrowRadar 0.1 | 515 | 5 | 515 | 515 (100.0%) | 0 (0.0%) | 0 (0.0%) | 0 | 19 | 8 |
| racso.Crono 1.0 | 1853 | 3 | 1854 | 1852 (99.9%) | 1 (0.1%) | 2 (0.1%) | 76 | 27 | 18 |
| zzx.Gron 1.14 | 1246 | 2 | 1248 | 1246 (100.0%) | 0 (0.0%) | 2 (0.2%) | 211 | 23 | 4 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 1153 | 10 (0.9%) | 0 |
| abud.ThirdRobo 1.0 | 932 | 26 (2.8%) | 0 |
| bons.NanoStalker 1.2 | 740 | 31 (4.2%) | 0 |
| dittman.BlindSquirl Retired | 1132 | 76 (6.7%) | 143 |
| hlavko.nano.Ringo 2.0 | 1179 | 71 (6.0%) | 830 |
| jep.nano.Hawkwing 0.4.1 | 1043 | 45 (4.3%) | 0 |
| kawigi.sbf.Barracuda 1.0 | 1885 | 85 (4.5%) | 0 |
| nexus.Two 0.2 | 1134 | 49 (4.3%) | 0 |
| pa.Improved 1.1 | 1788 | 117 (6.5%) | 814 |
| quietus.NarrowRadar 0.1 | 551 | 3 (0.5%) | 0 |
| racso.Crono 1.0 | 2081 | 99 (4.8%) | 86 |
| zzx.Gron 1.14 | 1388 | 68 (4.9%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 650 | 434 | 400 | 273 | 90.4 / 0.4 | 681 | 149 | 66 |
| abud.ThirdRobo 1.0 | 650 | 323 | 400 | 230 | 91.7 / 5.5 | 697 | 258 | 80 |
| bons.NanoStalker 1.2 | 650 | 309 | 400 | 186 | 73.5 / 2.7 | 543 | 738 | 0 |
| dittman.BlindSquirl Retired | 650 | 394 | 400 | 275 | 79.3 / 3.6 | 847 | 777 | 191 |
| hlavko.nano.Ringo 2.0 | 650 | 455 | 400 | 277 | 53.7 / 2.9 | 656 | 1353 | 95 |
| jep.nano.Hawkwing 0.4.1 | 650 | 406 | 400 | 248 | 49.3 / 3.4 | 657 | 1619 | 709 |
| kawigi.sbf.Barracuda 1.0 | 650 | 404 | 400 | 399 | 38.0 / 1.5 | 121 | 2473 | 11 |
| nexus.Two 0.2 | 650 | 503 | 400 | 259 | 37.3 / 3.7 | 384 | 1393 | 814 |
| pa.Improved 1.1 | 650 | 355 | 400 | 414 | 74.3 / 1.2 | 1157 | 930 | 101 |
| quietus.NarrowRadar 0.1 | 650 | 383 | 400 | 142 | 79.2 / 2.1 | 393 | 408 | 302 |
| racso.Crono 1.0 | 650 | 459 | 463 | 441 | 49.9 / 13.7 | 461 | 1223 | 63 |
| zzx.Gron 1.14 | 650 | 393 | 400 | 311 | 42.0 / 4.9 | 437 | 1596 | 609 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 0.5% | 5 | 245 | 1 | 3.3 | 10 / 10 (100%) | 0 | 0 |
| abud.ThirdRobo 1.0 | 7.2% | 3 | 23 | 2 | 6.3 | 26 / 26 (100%) | 0 | 0 |
| bons.NanoStalker 1.2 | 1.9% | 4 | 202 | 2 | 9.3 | 31 / 31 (100%) | 0 | 0 |
| dittman.BlindSquirl Retired | 4.1% | 3 | 123 | 2 | 17.2 | 76 / 76 (100%) | 0 | 0 |
| hlavko.nano.Ringo 2.0 | 1.3% | 4 | 23 | 2 | 18.4 | 71 / 71 (100%) | 0 | 0 |
| jep.nano.Hawkwing 0.4.1 | 2.3% | 3 | 401 | 1 | 13.6 | 45 / 45 (100%) | 0 | 0 |
| kawigi.sbf.Barracuda 1.0 | 0.5% | 7 | 75 | 2 | 24.1 | 85 / 85 (100%) | 0 | 0 |
| nexus.Two 0.2 | 1.8% | 27 | 34 | 3 | 14.3 | 48 / 49 (98%) | 0 | 0 |
| pa.Improved 1.1 | 0.7% | 29 | 966 | 3 | 25.5 | 117 / 117 (100%) | 0 | 0 |
| quietus.NarrowRadar 0.1 | 1.3% | 24 | 15 | 3 | 7.4 | 3 / 3 (100%) | 0 | 0 |
| racso.Crono 1.0 | 5.3% | 41 | 44 | 3 | 26.5 | 97 / 99 (98%) | 0 | 0 |
| zzx.Gron 1.14 | 2.9% | 6 | 21 | 3 | 17.8 | 68 / 68 (100%) | 0 | 0 |

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
| RobotMarco.MarcoV 0.1 | RobotMarco.MarcoV | 1 | 35 | 12727 | 1.8% | 0.8% ± 3.0 | 27.2% | 64.1% / 58.9% | 64.8% | 477 / 1 | T0/M? | 100% |
| abud.ThirdRobo 1.0 | abud.ThirdRobo | 1 | 35 | 11415 | 6.9% | 0.7% ± 2.0 | 30.7% | 35.5% / 31.4% | 4.7% | 415 / 13 | T0/M? | 98% |
| bons.NanoStalker 1.2 | bons.NanoStalker | 1 | 35 | 8173 | 2.5% | 1.1% ± 1.5 | 28.9% | 43.7% / 45.7% | 0.3% | 295 / 8 | T0/M? | 98% |
| dittman.BlindSquirl Retired | dittman.BlindSquirl | 1 | 35 | 13133 | 4.9% | 2.9% ± 1.4 | 23.1% | 50.1% / 44.6% | 5.5% | 465 / 28 | T1/M? | 97% |
| hlavko.nano.Ringo 2.0 | hlavko.nano.Ringo | 1 | 35 | 13819 | 0.7% | 0.2% ± 0.6 | 16.8% | 38.7% / 34.0% | 7.0% | 516 / 4 | T0/M? | 99% |
| jep.nano.Hawkwing 0.4.1 | jep.nano.Hawkwing | 1 | 35 | 11041 | 3.5% | 1.2% ± 1.2 | 18.4% | 36.7% / 31.0% | 5.5% | 397 / 16 | T0/M? | 95% |
| kawigi.sbf.Barracuda 1.0 | kawigi.sbf.Barracuda | 1 | 35 | 15989 | 0.5% | 0.1% ± 0.4 | 11.4% | 24.1% / 22.4% | 2.0% | 600 / 3 | T0/M1 | 99% |
| nexus.Two 0.2 | nexus.Two | 1 | 35 | 12643 | 2.8% | 2.3% ± 1.4 | 15.6% | 46.3% / 36.9% | 32.5% | 463 / 13 | T1/M? | 95% |
| pa.Improved 1.1 | pa.Improved | 1 | 35 | 16083 | 1.0% | 0.2% ± 0.4 | 17.3% | 30.4% / 27.3% | 8.1% | 600 / 8 | T0/M? | 98% |
| quietus.NarrowRadar 0.1 | quietus.NarrowRadar | 1 | 35 | 5065 | 3.5% | 3.8% ± 2.5 | 39.7% | 100.8% / 100.5% | 100.0% | 174 / 9 | T1/M0 | 97% |
| racso.Crono 1.0 | racso.Crono | 1 | 35 | 17071 | 5.1% | 3.9% ± 1.3 | 13.6% | 31.0% / 27.7% | 5.8% | 600 / 46 | T1/M? | 90% |
| zzx.Gron 1.14 | zzx.Gron | 1 | 35 | 15449 | 3.2% | 1.5% ± 1.1 | 16.4% | 27.0% / 23.6% | 6.1% | 566 / 18 | T0/M? | 93% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
