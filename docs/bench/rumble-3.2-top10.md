# Bench: hadur2.Hadur 3.2 (cold)

35 rounds x 5 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 4 cores. robocode.cpu.constant=4056540.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 17.5% ± 2.2 | 1.7% ± 2.0 | 37.7% ± 4.7 | 4 / 175 | 5.4% ± 0.3 | 9.6% ± 0.5 | 116 | 0 | 3.71 / 174.6 |
| jk.mega.DrussGT 3.1.16 | rumble-2 | 29.5% ± 5.3 | 14.4% ± 4.9 | 46.1% ± 5.1 | 27 / 175 | 7.4% ± 0.3 | 10.0% ± 0.3 | 74 | 0 | 2.78 / 61.8 |
| oog.mega.saguaro.Saguaro 1.0 | rumble-3 | 68.8% ± 8.3 | 80.0% ± 10.3 | 58.1% ± 5.8 | 140 / 175 | 18.5% ± 1.0 | 6.8% ± 1.2 | 15 | 0 | 3.28 / 72.1 |
| aaa.r.ScalarR 0.005h.053-noshield | rumble-4 | 25.0% ± 4.5 | 12.0% ± 6.3 | 40.2% ± 2.6 | 21 / 175 | 7.1% ± 0.5 | 10.0% ± 0.3 | 64 | 0 | 3.02 / 139.0 |
| voidious.Diamond 1.8.22 | rumble-5 | 30.4% ± 7.9 | 21.6% ± 12.1 | 40.9% ± 4.5 | 40 / 175 | 6.8% ± 0.6 | 8.6% ± 0.8 | 65 | 0 | 2.90 / 86.4 |
| cb.fire.Firestarter 2.0f | rumble-6 | 37.4% ± 10.2 | 20.6% ± 14.7 | 55.2% ± 5.1 | 36 / 175 | 9.0% ± 0.4 | 8.1% ± 0.5 | 51 | 0 | 2.76 / 170.7 |
| dsekercioglu.mega.Raven 3.56j8 | rumble-7 | 60.0% ± 5.0 | 73.1% ± 6.4 | 47.0% ± 3.6 | 128 / 175 | 9.7% ± 0.9 | 8.8% ± 0.5 | 23 | 0 | 1.97 / 53.5 |
| xander.cat.XanderCat 12.9 | rumble-8 | 58.0% ± 7.7 | 64.6% ± 11.9 | 51.1% ± 4.0 | 113 / 175 | 11.1% ± 0.8 | 7.9% ± 1.1 | 41 | 0 | 2.18 / 63.3 |
| lxx.Tomcat 3.68 | rumble-9 | 56.5% ± 5.0 | 66.8% ± 5.8 | 47.2% ± 5.4 | 118 / 175 | 9.3% ± 0.4 | 9.7% ± 0.6 | 108 | 0 | 3.72 / 127.7 |
| rsalesc.mega.Knight 0.6.28 | rumble-10 | 48.2% ± 6.0 | 38.9% ± 8.9 | 56.9% ± 3.8 | 68 / 175 | 9.8% ± 0.3 | 9.3% ± 0.6 | 71 | 0 | 3.90 / 98.4 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 37080 | 315 | 37402 | 37079 (100.0%) | 1 (0.0%) | 323 (0.9%) | 1559 | 218 | 69 |
| jk.mega.DrussGT 3.1.16 | 42404 | 8 | 42405 | 42402 (100.0%) | 2 (0.0%) | 3 (0.0%) | 2377 | 297 | 93 |
| oog.mega.saguaro.Saguaro 1.0 | 6179 | 9 | 6181 | 6177 (100.0%) | 2 (0.0%) | 4 (0.1%) | 437 | 83 | 8 |
| aaa.r.ScalarR 0.005h.053-noshield | 36299 | 19 | 37434 | 36299 (100.0%) | 0 (0.0%) | 1135 (3.0%) | 2069 | 358 | 63 |
| voidious.Diamond 1.8.22 | 36411 | 1409 | 37782 | 36409 (100.0%) | 2 (0.0%) | 1373 (3.6%) | 1937 | 193 | 68 |
| cb.fire.Firestarter 2.0f | 36502 | 1476 | 41113 | 36456 (99.9%) | 46 (0.1%) | 4657 (11.3%) | 2957 | 264 | 59 |
| dsekercioglu.mega.Raven 3.56j8 | 13522 | 75 | 13521 | 13520 (100.0%) | 2 (0.0%) | 1 (0.0%) | 715 | 172 | 21 |
| xander.cat.XanderCat 12.9 | 16848 | 2 | 17366 | 16848 (100.0%) | 0 (0.0%) | 518 (3.0%) | 1724 | 232 | 36 |
| lxx.Tomcat 3.68 | 23264 | 506 | 23284 | 23245 (99.9%) | 19 (0.1%) | 39 (0.2%) | 1467 | 168 | 71 |
| rsalesc.mega.Knight 0.6.28 | 38034 | 555 | 38052 | 38034 (100.0%) | 0 (0.0%) | 18 (0.0%) | 2758 | 313 | 68 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 36474 | 4171 (11.4%) | 35402 |
| jk.mega.DrussGT 3.1.16 | 41624 | 5043 (12.1%) | 41158 |
| oog.mega.saguaro.Saguaro 1.0 | 7222 | 527 (7.3%) | 7184 |
| aaa.r.ScalarR 0.005h.053-noshield | 36718 | 4218 (11.5%) | 36071 |
| voidious.Diamond 1.8.22 | 36385 | 3840 (10.6%) | 34966 |
| cb.fire.Firestarter 2.0f | 41406 | 3776 (9.1%) | 41013 |
| dsekercioglu.mega.Raven 3.56j8 | 14269 | 1401 (9.8%) | 13236 |
| xander.cat.XanderCat 12.9 | 21141 | 1857 (8.8%) | 20095 |
| lxx.Tomcat 3.68 | 23774 | 2658 (11.2%) | 23039 |
| rsalesc.mega.Knight 0.6.28 | 37593 | 4329 (11.5%) | 37047 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 540 | 650 | 2454 | 19.4 / 31.9 | 0 | 0 | 1 |
| jk.mega.DrussGT 3.1.16 | 650 | 521 | 650 | 2791 | 26.6 / 31.0 | 0 | 407 | 65 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 438 | 460 | 568 | 39.0 / 28.2 | 541 | 2240 | 446 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 489 | 650 | 2479 | 22.9 / 34.1 | 0 | 645 | 0 |
| voidious.Diamond 1.8.22 | 650 | 535 | 650 | 2449 | 22.3 / 32.4 | 0 | 180 | 7 |
| cb.fire.Firestarter 2.0f | 650 | 552 | 650 | 2766 | 32.2 / 26.1 | 3 | 260 | 20 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 457 | 650 | 1031 | 29.8 / 33.5 | 116 | 1478 | 1377 |
| xander.cat.XanderCat 12.9 | 650 | 454 | 650 | 1485 | 31.8 / 30.5 | 126 | 1011 | 52 |
| lxx.Tomcat 3.68 | 650 | 519 | 650 | 1646 | 30.8 / 34.4 | 17 | 536 | 10 |
| rsalesc.mega.Knight 0.6.28 | 650 | 510 | 650 | 2544 | 35.8 / 27.1 | 36 | 679 | 22 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 9.6% | 116 | 429 | 3 | 211.7 | 4169 / 4171 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 10.0% | 74 | 23493 | 3 | 239.2 | 5042 / 5043 (100%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 6.8% | 15 | 129 | 3 | 35.3 | 525 / 527 (100%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10.0% | 64 | 526 | 3 | 213.3 | 4217 / 4218 (100%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 8.6% | 65 | 24241 | 3 | 213.8 | 3834 / 3840 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 8.1% | 51 | 29183 | 3 | 233.3 | 3751 / 3776 (99%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 8.8% | 23 | 1362 | 3 | 76.9 | 1396 / 1401 (100%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 7.9% | 41 | 1948 | 3 | 98.9 | 1855 / 1857 (100%) | 0 | 0 |
| lxx.Tomcat 3.68 | 9.7% | 108 | 633 | 3 | 132.6 | 2657 / 2658 (100%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 9.3% | 71 | 814 | 3 | 215.4 | 4326 / 4329 (100%) | 0 | 0 |

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
| kc.mega.BeepBoop 2.0 | kc.mega.BeepBoop | 1 | 35 | 23695 | 9.5% | 8.1% ± 1.0 | 5.6% | 20.7% / 20.8% | 0.0% | 600 / 300 | T3/M1 | 19% |
| jk.mega.DrussGT 3.1.16 | jk.mega.DrussGT | 1 | 35 | 23697 | 10.4% | 8.7% ± 1.1 | 7.2% | 23.6% / 22.8% | 1.7% | 600 / 300 | T3/M1 | 36% |
| oog.mega.saguaro.Saguaro 1.0 | oog.mega.saguaro.Saguaro | 1 | 35 | 18085 | 7.1% | 6.5% ± 1.5 | 12.7% | 25.1% / 24.3% | 11.6% | 600 / 83 | T2/M0 | 73% |
| aaa.r.ScalarR 0.005h.053-noshield | aaa.r.ScalarR | 1 | 35 | 23715 | 10.2% | 8.0% ± 1.0 | 7.1% | 24.0% / 22.7% | 0.0% | 600 / 300 | T3/M1 | 26% |
| voidious.Diamond 1.8.22 | voidious.Diamond | 1 | 35 | 23701 | 8.6% | 7.5% ± 1.1 | 6.7% | 22.3% / 21.7% | 9.0% | 600 / 300 | T3/M1 | 35% |
| cb.fire.Firestarter 2.0f | cb.fire.Firestarter | 1 | 35 | 23709 | 8.0% | 7.1% ± 1.0 | 8.6% | 21.0% / 21.8% | 3.2% | 600 / 300 | T3/M1 | 45% |
| dsekercioglu.mega.Raven 3.56j8 | dsekercioglu.mega.Raven | 1 | 35 | 22689 | 9.2% | 7.2% ± 1.0 | 10.4% | 21.7% / 20.1% | 11.6% | 600 / 260 | T3/M1 | 65% |
| xander.cat.XanderCat 12.9 | xander.cat.XanderCat | 1 | 35 | 23505 | 9.8% | 7.3% ± 1.0 | 11.0% | 23.6% / 22.0% | 8.6% | 600 / 292 | T3/M1 | 57% |
| lxx.Tomcat 3.68 | lxx.Tomcat | 1 | 35 | 23673 | 10.0% | 8.7% ± 0.9 | 8.9% | 23.0% / 21.9% | 9.5% | 600 / 300 | T3/M1 | 58% |
| rsalesc.mega.Knight 0.6.28 | rsalesc.mega.Knight | 1 | 35 | 23713 | 10.3% | 8.1% ± 1.0 | 9.7% | 24.0% / 21.3% | 12.1% | 600 / 300 | T3/M1 | 41% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
