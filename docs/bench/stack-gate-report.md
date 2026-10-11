# Bench suite: druss-stack-gates.txt

## Bench: hadur2.Hadur 3.8.4 (cold)

35 rounds x 3 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=3803804.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 24.3% ± 4.2 | 10.5% ± 4.1 | 43.0% ± 9.4 | 11 / 105 | 5.1% ± 0.5 | 8.6% ± 0.6 | 63 | 0 | 3.42 / 99.2 |
| jk.mega.DrussGT 3.1.16 | rumble-2 | 46.9% ± 14.6 | 46.7% ± 26.9 | 47.2% ± 6.1 | 49 / 105 | 7.5% ± 1.8 | 10.7% ± 0.7 | 118 | 0 | 2.68 / 66.7 |
| oog.mega.saguaro.Saguaro 1.0 | rumble-3 | 73.5% ± 7.6 | 82.9% ± 7.1 | 63.7% ± 7.9 | 87 / 105 | 18.8% ± 4.1 | 6.9% ± 3.5 | 13 | 0 | 3.48 / 54.5 |
| aaa.r.ScalarR 0.005h.053-noshield | rumble-4 | 35.0% ± 14.4 | 28.6% ± 28.4 | 42.7% ± 5.1 | 30 / 105 | 6.9% ± 0.9 | 10.3% ± 2.0 | 122 | 0 | 2.95 / 85.4 |
| voidious.Diamond 1.8.22 | rumble-5 | 49.9% ± 10.5 | 58.1% ± 14.8 | 41.8% ± 7.0 | 61 / 105 | 7.1% ± 0.8 | 8.7% ± 0.3 | 82 | 0 | 2.98 / 198.7 |
| cb.fire.Firestarter 2.0f | rumble-6 | 47.5% ± 22.3 | 45.3% ± 31.2 | 50.3% ± 12.0 | 48 / 105 | 8.0% ± 1.4 | 9.0% ± 2.4 | 92 | 0 | 2.60 / 173.0 |
| dsekercioglu.mega.Raven 3.56j8 | rumble-7 | 54.4% ± 11.8 | 69.5% ± 16.4 | 38.6% ± 6.5 | 73 / 105 | 9.5% ± 0.9 | 9.1% ± 1.6 | 23 | 0 | 1.97 / 44.0 |
| xander.cat.XanderCat 12.9 | rumble-8 | 67.2% ± 47.1 | 73.3% ± 49.9 | 61.4% ± 47.1 | 77 / 105 | 22.3% ± 43.8 | 9.2% ± 2.7 | 27 | 0 | 1.92 / 31.5 |
| lxx.Tomcat 3.68 | rumble-9 | 53.5% ± 3.3 | 64.8% ± 8.2 | 42.4% ± 4.3 | 68 / 105 | 8.7% ± 0.8 | 10.0% ± 1.9 | 86 | 0 | 3.26 / 77.1 |
| rsalesc.mega.Knight 0.6.28 | rumble-10 | 53.3% ± 3.9 | 55.2% ± 8.2 | 50.6% ± 3.5 | 58 / 105 | 9.5% ± 1.8 | 10.2% ± 1.5 | 120 | 0 | 3.50 / 164.2 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 13322 | 181 | 13761 | 13259 (99.5%) | 63 (0.5%) | 502 (3.6%) | 509 | 93 | 59 |
| jk.mega.DrussGT 3.1.16 | 26168 | 6 | 25890 | 25886 (98.9%) | 282 (1.1%) | 4 (0.0%) | 1611 | 184 | 101 |
| oog.mega.saguaro.Saguaro 1.0 | 3488 | 6 | 3488 | 3484 (99.9%) | 4 (0.1%) | 4 (0.1%) | 226 | 44 | 14 |
| aaa.r.ScalarR 0.005h.053-noshield | 23489 | 8 | 24204 | 23250 (99.0%) | 239 (1.0%) | 954 (3.9%) | 1408 | 288 | 105 |
| voidious.Diamond 1.8.22 | 23501 | 468 | 24288 | 23408 (99.6%) | 93 (0.4%) | 880 (3.6%) | 1454 | 137 | 73 |
| cb.fire.Firestarter 2.0f | 24435 | 616 | 28609 | 24272 (99.3%) | 163 (0.7%) | 4337 (15.2%) | 2111 | 191 | 85 |
| dsekercioglu.mega.Raven 3.56j8 | 9340 | 46 | 9339 | 9339 (100.0%) | 1 (0.0%) | 0 (0.0%) | 708 | 103 | 25 |
| xander.cat.XanderCat 12.9 | 6210 | 5 | 6623 | 6188 (99.6%) | 22 (0.4%) | 435 (6.6%) | 725 | 94 | 27 |
| lxx.Tomcat 3.68 | 17062 | 364 | 17056 | 16947 (99.3%) | 115 (0.7%) | 109 (0.6%) | 1318 | 124 | 70 |
| rsalesc.mega.Knight 0.6.28 | 26832 | 269 | 26564 | 26558 (99.0%) | 274 (1.0%) | 6 (0.0%) | 2202 | 232 | 108 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 13199 | 1462 (11.1%) | 12791 |
| jk.mega.DrussGT 3.1.16 | 26164 | 3307 (12.6%) | 25895 |
| oog.mega.saguaro.Saguaro 1.0 | 3891 | 297 (7.6%) | 3878 |
| aaa.r.ScalarR 0.005h.053-noshield | 23859 | 2785 (11.7%) | 23426 |
| voidious.Diamond 1.8.22 | 23860 | 2545 (10.7%) | 23243 |
| cb.fire.Firestarter 2.0f | 28152 | 2559 (9.1%) | 27225 |
| dsekercioglu.mega.Raven 3.56j8 | 10048 | 1029 (10.2%) | 9475 |
| xander.cat.XanderCat 12.9 | 8239 | 647 (7.9%) | 7387 |
| lxx.Tomcat 3.68 | 17483 | 2055 (11.8%) | 17098 |
| rsalesc.mega.Knight 0.6.28 | 26978 | 3245 (12.0%) | 26473 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 538 | 650 | 1540 | 20.6 / 27.3 | 3 | 447 | 0 |
| jk.mega.DrussGT 3.1.16 | 650 | 514 | 650 | 2888 | 28.1 / 31.3 | 20 | 3069 | 283 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 434 | 400 | 525 | 43.7 / 24.8 | 600 | 1193 | 304 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 484 | 650 | 2660 | 24.3 / 32.5 | 0 | 705 | 1 |
| voidious.Diamond 1.8.22 | 650 | 541 | 650 | 2636 | 22.7 / 31.5 | 49 | 8810 | 101 |
| cb.fire.Firestarter 2.0f | 650 | 551 | 650 | 3095 | 27.0 / 26.8 | 0 | 1937 | 30 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 450 | 650 | 1169 | 22.6 / 35.8 | 87 | 8399 | 778 |
| xander.cat.XanderCat 12.9 | 650 | 431 | 483 | 1012 | 48.4 / 27.3 | 546 | 1174 | 17 |
| lxx.Tomcat 3.68 | 650 | 514 | 650 | 1960 | 26.3 / 35.8 | 82 | 9898 | 5 |
| rsalesc.mega.Knight 0.6.28 | 650 | 511 | 650 | 2977 | 31.5 / 30.6 | 194 | 4366 | 26 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 8.6% | 63 | 6619 | 3 | 130.2 | 1454 / 1462 (99%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 10.7% | 118 | 504 | 3 | 245.4 | 3285 / 3307 (99%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 6.9% | 13 | 112 | 3 | 33.1 | 295 / 297 (99%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10.3% | 122 | 304 | 3 | 230.2 | 2758 / 2785 (99%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 8.7% | 82 | 339 | 3 | 230.2 | 2535 / 2545 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 9.0% | 92 | 399 | 3 | 271.6 | 2537 / 2559 (99%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 9.1% | 23 | 32151 | 3 | 88.7 | 1026 / 1029 (100%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 9.2% | 27 | 177 | 3 | 62.9 | 646 / 647 (100%) | 0 | 0 |
| lxx.Tomcat 3.68 | 10.0% | 86 | 283 | 3 | 162.2 | 2042 / 2055 (99%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 10.2% | 120 | 507 | 3 | 252.0 | 3230 / 3245 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| voidious.Diamond 1.8.22 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| cb.fire.Firestarter 2.0f | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| xander.cat.XanderCat 12.9 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| lxx.Tomcat 3.68 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | kc.mega.BeepBoop | 1 | 35 | 296 | 8.7% | 7.0% ± 0.9 | 4.7% | 20.1% / 20.4% | 0.1% | 0 / 0 | T3/M1 | 13% |
| jk.mega.DrussGT 3.1.16 | jk.mega.DrussGT | 1 | 35 | 298 | 10.6% | 8.7% ± 1.0 | 7.5% | 23.1% / 22.2% | 2.0% | 0 / 0 | T3/M1 | 40% |
| oog.mega.saguaro.Saguaro 1.0 | oog.mega.saguaro.Saguaro | 1 | 35 | 328 | 8.0% | 7.3% ± 1.5 | 13.3% | 25.7% / 25.6% | 10.9% | 0 / 0 | T3/M0 | 71% |
| aaa.r.ScalarR 0.005h.053-noshield | aaa.r.ScalarR | 1 | 35 | 316 | 10.8% | 8.4% ± 0.9 | 7.0% | 23.8% / 22.3% | 0.0% | 0 / 0 | T3/M1 | 31% |
| voidious.Diamond 1.8.22 | voidious.Diamond | 1 | 35 | 302 | 8.1% | 6.9% ± 1.0 | 7.0% | 22.7% / 22.0% | 9.3% | 0 / 0 | T2/M1 | 44% |
| cb.fire.Firestarter 2.0f | cb.fire.Firestarter | 1 | 35 | 310 | 8.1% | 6.8% ± 1.1 | 9.3% | 20.2% / 21.4% | 3.1% | 0 / 0 | T2/M1 | 45% |
| dsekercioglu.mega.Raven 3.56j8 | dsekercioglu.mega.Raven | 1 | 35 | 330 | 9.5% | 7.1% ± 1.0 | 9.7% | 20.7% / 20.7% | 11.3% | 0 / 0 | T3/M1 | 53% |
| xander.cat.XanderCat 12.9 | xander.cat.XanderCat | 1 | 35 | 314 | 10.8% | 8.0% ± 1.1 | 11.8% | 22.4% / 21.9% | 8.4% | 0 / 0 | T3/M1 | 58% |
| lxx.Tomcat 3.68 | lxx.Tomcat | 1 | 35 | 274 | 9.9% | 8.4% ± 0.9 | 9.1% | 23.2% / 22.1% | 8.8% | 0 / 0 | T3/M1 | 57% |
| rsalesc.mega.Knight 0.6.28 | rsalesc.mega.Knight | 1 | 35 | 314 | 9.9% | 8.0% ± 0.9 | 9.6% | 24.2% / 21.2% | 12.4% | 0 / 0 | T3/M1 | 56% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.8.4 vs hadur2.Hadur 3.8.1

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 24.3% ± 4.2 | 17.4% ± 10.7 | +6.9 ± 8.1 |
| jk.mega.DrussGT 3.1.16 | 46.9% ± 14.6 | 40.3% ± 25.0 | +6.6 ± 36.3 |
| oog.mega.saguaro.Saguaro 1.0 | 73.5% ± 7.6 | 72.3% ± 4.8 | +1.2 ± 7.7 |
| aaa.r.ScalarR 0.005h.053-noshield | 35.0% ± 14.4 | 28.2% ± 10.9 | +6.8 ± 5.9 |
| voidious.Diamond 1.8.22 | 49.9% ± 10.5 | 49.4% ± 12.4 | +0.5 ± 2.7 |
| cb.fire.Firestarter 2.0f | 47.5% ± 22.3 | 44.4% ± 16.6 | +3.2 ± 36.6 |
| dsekercioglu.mega.Raven 3.56j8 | 54.4% ± 11.8 | 55.6% ± 6.3 | -1.2 ± 18.0 |
| xander.cat.XanderCat 12.9 | 67.2% ± 47.1 | 57.8% ± 3.0 | +9.5 ± 45.4 |
| lxx.Tomcat 3.68 | 53.5% ± 3.3 | 53.2% ± 10.4 | +0.3 ± 7.8 |
| rsalesc.mega.Knight 0.6.28 | 53.3% ± 3.9 | 51.8% ± 9.9 | +1.5 ± 11.3 |

# Bench: hadur2.Hadur 3.8.4 baseline (hadur2.Hadur 3.8.1) (cold)

35 rounds x 3 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=3803804.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 17.4% ± 10.7 | 2.9% ± 7.1 | 38.4% ± 9.0 | 3 / 105 | 4.5% ± 0.9 | 8.8% ± 2.2 | 51 | 0 | 3.38 / 92.7 |
| jk.mega.DrussGT 3.1.16 | rumble-2 | 40.3% ± 25.0 | 35.6% ± 39.0 | 46.0% ± 6.7 | 38 / 105 | 7.4% ± 0.9 | 10.0% ± 1.8 | 112 | 0 | 2.67 / 88.1 |
| oog.mega.saguaro.Saguaro 1.0 | rumble-3 | 72.3% ± 4.8 | 84.8% ± 14.8 | 60.3% ± 5.1 | 89 / 105 | 18.5% ± 2.0 | 6.3% ± 3.0 | 30 | 0 | 3.44 / 62.2 |
| aaa.r.ScalarR 0.005h.053-noshield | rumble-4 | 28.2% ± 10.9 | 19.0% ± 16.4 | 39.3% ± 3.3 | 20 / 105 | 6.3% ± 0.1 | 10.7% ± 1.7 | 84 | 0 | 2.70 / 132.1 |
| voidious.Diamond 1.8.22 | rumble-5 | 49.4% ± 12.4 | 56.2% ± 16.4 | 41.5% ± 8.7 | 59 / 105 | 6.3% ± 1.7 | 8.4% ± 0.9 | 106 | 0 | 2.91 / 156.7 |
| cb.fire.Firestarter 2.0f | rumble-6 | 44.4% ± 16.6 | 39.5% ± 26.6 | 50.0% ± 5.2 | 42 / 105 | 8.2% ± 0.5 | 8.9% ± 0.9 | 103 | 0 | 2.60 / 136.0 |
| dsekercioglu.mega.Raven 3.56j8 | rumble-7 | 55.6% ± 6.3 | 69.5% ± 8.2 | 40.9% ± 5.8 | 73 / 105 | 9.4% ± 1.9 | 9.0% ± 0.1 | 38 | 0 | 1.93 / 35.8 |
| xander.cat.XanderCat 12.9 | rumble-8 | 57.8% ± 3.0 | 63.8% ± 8.2 | 52.2% ± 1.5 | 67 / 105 | 11.6% ± 1.1 | 8.5% ± 1.2 | 34 | 0 | 2.03 / 48.1 |
| lxx.Tomcat 3.68 | rumble-9 | 53.2% ± 10.4 | 64.8% ± 10.8 | 41.9% ± 8.2 | 68 / 105 | 9.1% ± 1.0 | 10.1% ± 1.7 | 71 | 0 | 3.24 / 92.8 |
| rsalesc.mega.Knight 0.6.28 | rumble-10 | 51.8% ± 9.9 | 54.3% ± 14.2 | 49.1% ± 5.5 | 57 / 105 | 9.0% ± 0.4 | 10.8% ± 2.0 | 108 | 0 | 3.43 / 112.7 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 14344 | 216 | 14897 | 14278 (99.5%) | 66 (0.5%) | 619 (4.2%) | 522 | 91 | 50 |
| jk.mega.DrussGT 3.1.16 | 25247 | 8 | 25059 | 25058 (99.3%) | 189 (0.7%) | 1 (0.0%) | 1552 | 172 | 100 |
| oog.mega.saguaro.Saguaro 1.0 | 3496 | 2 | 3482 | 3480 (99.5%) | 16 (0.5%) | 2 (0.1%) | 182 | 43 | 16 |
| aaa.r.ScalarR 0.005h.053-noshield | 18788 | 9 | 19073 | 18701 (99.5%) | 87 (0.5%) | 372 (2.0%) | 1040 | 211 | 85 |
| voidious.Diamond 1.8.22 | 22700 | 482 | 23531 | 22541 (99.3%) | 159 (0.7%) | 990 (4.2%) | 1339 | 137 | 90 |
| cb.fire.Firestarter 2.0f | 23810 | 684 | 27823 | 23645 (99.3%) | 165 (0.7%) | 4178 (15.0%) | 2083 | 175 | 107 |
| dsekercioglu.mega.Raven 3.56j8 | 9327 | 49 | 9326 | 9326 (100.0%) | 1 (0.0%) | 0 (0.0%) | 671 | 110 | 37 |
| xander.cat.XanderCat 12.9 | 8433 | 5 | 8699 | 8431 (100.0%) | 2 (0.0%) | 268 (3.1%) | 848 | 104 | 31 |
| lxx.Tomcat 3.68 | 17621 | 337 | 17653 | 17509 (99.4%) | 112 (0.6%) | 144 (0.8%) | 1324 | 115 | 74 |
| rsalesc.mega.Knight 0.6.28 | 27068 | 237 | 26805 | 26794 (99.0%) | 274 (1.0%) | 11 (0.0%) | 2082 | 228 | 116 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 14168 | 1517 (10.7%) | 13544 |
| jk.mega.DrussGT 3.1.16 | 25106 | 3010 (12.0%) | 24892 |
| oog.mega.saguaro.Saguaro 1.0 | 4154 | 296 (7.1%) | 4117 |
| aaa.r.ScalarR 0.005h.053-noshield | 18994 | 2118 (11.2%) | 18687 |
| voidious.Diamond 1.8.22 | 23164 | 2486 (10.7%) | 22955 |
| cb.fire.Firestarter 2.0f | 27452 | 2526 (9.2%) | 26316 |
| dsekercioglu.mega.Raven 3.56j8 | 10033 | 1016 (10.1%) | 8997 |
| xander.cat.XanderCat 12.9 | 10455 | 915 (8.8%) | 9700 |
| lxx.Tomcat 3.68 | 17941 | 2077 (11.6%) | 17296 |
| rsalesc.mega.Knight 0.6.28 | 27209 | 3250 (11.9%) | 26741 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 535 | 650 | 1639 | 17.7 / 28.1 | 0 | 136 | 0 |
| jk.mega.DrussGT 3.1.16 | 650 | 516 | 650 | 2788 | 25.2 / 29.5 | 9 | 1757 | 280 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 434 | 400 | 549 | 41.5 / 27.5 | 263 | 1161 | 234 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 484 | 650 | 2156 | 22.8 / 35.2 | 0 | 738 | 0 |
| voidious.Diamond 1.8.22 | 650 | 536 | 650 | 2559 | 20.3 / 28.5 | 13 | 8725 | 91 |
| cb.fire.Firestarter 2.0f | 650 | 548 | 650 | 3028 | 28.2 / 28.2 | 95 | 2099 | 96 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 451 | 575 | 1168 | 24.1 / 34.8 | 79 | 10643 | 1026 |
| xander.cat.XanderCat 12.9 | 650 | 452 | 650 | 1246 | 35.8 / 32.8 | 159 | 1449 | 36 |
| lxx.Tomcat 3.68 | 650 | 513 | 650 | 2011 | 26.2 / 36.4 | 41 | 7813 | 4 |
| rsalesc.mega.Knight 0.6.28 | 650 | 513 | 650 | 2998 | 31.5 / 32.6 | 69 | 5032 | 11 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 8.8% | 51 | 247 | 3 | 141.2 | 1509 / 1517 (99%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 10.0% | 112 | 367 | 3 | 237.2 | 3000 / 3010 (100%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 6.3% | 30 | 76 | 3 | 33.2 | 295 / 296 (100%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10.7% | 84 | 146 | 3 | 181.2 | 2110 / 2118 (100%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 8.4% | 106 | 300 | 3 | 223.0 | 2468 / 2486 (99%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 8.9% | 103 | 53922 | 3 | 263.8 | 2500 / 2526 (99%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 9.0% | 38 | 182 | 3 | 88.5 | 1009 / 1016 (99%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 8.5% | 34 | 148 | 3 | 82.7 | 915 / 915 (100%) | 0 | 0 |
| lxx.Tomcat 3.68 | 10.1% | 71 | 270 | 3 | 167.7 | 2069 / 2077 (100%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 10.8% | 108 | 268 | 3 | 253.7 | 3237 / 3250 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| voidious.Diamond 1.8.22 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| cb.fire.Firestarter 2.0f | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| xander.cat.XanderCat 12.9 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| lxx.Tomcat 3.68 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Bench: hadur2.Hadur 3.8.4 (cold)

35 rounds x 2 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=3936813.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | rammer | 94.9% ± 16.4 | 100.0% ± 0.0 | 91.2% ± 27.1 | 70 / 70 | 79.6% ± 12.7 | 14.2% ± 12.7 | 2 | 0 | 1.03 / 10.9 |
| bbo.RamboT 0.3 | rammer | 97.8% ± 6.0 | 100.0% ± 0.0 | 96.2% ± 8.7 | 70 / 70 | 75.3% ± 26.7 | 9.6% ± 36.2 | 4 | 0 | 1.07 / 12.8 |
| PSW.Relentless 0.1 | rammer | 98.3% ± 8.2 | 100.0% ± 0.0 | 97.1% ± 13.3 | 70 / 70 | 71.8% ± 3.2 | 9.1% ± 19.1 | 0 | 0 | 1.00 / 44.8 |
| mahrgell.mahrram 1.3 | rammer | 79.4% ± 20.7 | 98.6% ± 18.2 | 70.7% ± 18.6 | 69 / 70 | 71.4% ± 7.0 | 37.1% ± 29.2 | 2 | 0 | 1.05 / 10.9 |
| sample.RamFire | rammer | 99.7% ± 3.7 | 100.0% ± 0.0 | 99.5% ± 5.8 | 70 / 70 | 69.7% ± 42.6 | 2.9% ± 36.2 | 2 | 0 | 0.96 / 12.9 |
| stelo.MirrorNano 1.4 | mirror | 93.2% ± 13.2 | 100.0% ± 0.0 | 87.0% ± 22.6 | 70 / 70 | 35.2% ± 9.5 | 5.2% ± 11.4 | 8 | 0 | 1.19 / 15.0 |
| stelo.MirrorMicro 1.1 | mirror | 93.4% ± 1.0 | 100.0% ± 0.0 | 87.4% ± 1.7 | 70 / 70 | 35.4% ± 3.2 | 5.9% ± 1.9 | 9 | 0 | 1.16 / 13.1 |
| zyx.nano.RedBull 1.0 | nano | 93.9% ± 12.0 | 100.0% ± 0.0 | 91.1% ± 18.6 | 70 / 70 | 80.6% ± 20.3 | 9.7% ± 17.8 | 6 | 0 | 0.98 / 10.7 |
| bwbaugh.nano.Tirunculus 0.0.0a | nano | 86.0% ± 3.9 | 100.0% ± 0.0 | 78.4% ± 1.3 | 70 / 70 | 80.5% ± 22.9 | 73.2% ± 21.0 | 4 | 0 | 1.05 / 13.7 |
| demetrix.nano.SledgeHammer 0.22 | nano | 67.3% ± 11.9 | 91.4% ± 0.0 | 58.2% ± 13.9 | 64 / 70 | 72.0% ± 6.4 | 54.2% ± 39.4 | 1 | 0 | 0.95 / 12.8 |
| mz.NanoDeath 2.56 | nano | 68.7% ± 8.3 | 95.7% ± 18.2 | 58.6% ± 0.5 | 67 / 70 | 74.2% ± 2.5 | 54.4% ± 5.1 | 8 | 0 | 0.98 / 13.0 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 171 | 3 | 171 | 171 (100.0%) | 0 (0.0%) | 0 (0.0%) | 10 | 7 | 1 |
| bbo.RamboT 0.3 | 557 | 4 | 557 | 557 (100.0%) | 0 (0.0%) | 0 (0.0%) | 51 | 32 | 4 |
| PSW.Relentless 0.1 | 106 | 2 | 106 | 106 (100.0%) | 0 (0.0%) | 0 (0.0%) | 47 | 10 | 0 |
| mahrgell.mahrram 1.3 | 640 | 5 | 639 | 639 (99.8%) | 1 (0.2%) | 0 (0.0%) | 200 | 51 | 2 |
| sample.RamFire | 2 | 0 | 2 | 2 (100.0%) | 0 (0.0%) | 0 (0.0%) | 32 | 2 | 2 |
| stelo.MirrorNano 1.4 | 832 | 6 | 831 | 831 (99.9%) | 1 (0.1%) | 0 (0.0%) | 6 | 19 | 8 |
| stelo.MirrorMicro 1.1 | 883 | 9 | 884 | 883 (100.0%) | 0 (0.0%) | 1 (0.1%) | 2 | 19 | 9 |
| zyx.nano.RedBull 1.0 | 454 | 3 | 453 | 453 (99.8%) | 1 (0.2%) | 0 (0.0%) | 120 | 32 | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 348 | 7 | 348 | 348 (100.0%) | 0 (0.0%) | 0 (0.0%) | 66 | 27 | 4 |
| demetrix.nano.SledgeHammer 0.22 | 684 | 0 | 684 | 684 (100.0%) | 0 (0.0%) | 0 (0.0%) | 150 | 37 | 3 |
| mz.NanoDeath 2.56 | 646 | 1 | 643 | 643 (99.5%) | 3 (0.5%) | 0 (0.0%) | 197 | 42 | 6 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| vort.Chaser 0.0.3 | 520 | 0 (0.0%) | 0 |
| bbo.RamboT 0.3 | 499 | 15 (3.0%) | 0 |
| PSW.Relentless 0.1 | 600 | 0 (0.0%) | 0 |
| mahrgell.mahrram 1.3 | 607 | 45 (7.4%) | 0 |
| sample.RamFire | 669 | 0 (0.0%) | 0 |
| stelo.MirrorNano 1.4 | 869 | 41 (4.7%) | 0 |
| stelo.MirrorMicro 1.1 | 891 | 49 (5.5%) | 0 |
| zyx.nano.RedBull 1.0 | 444 | 11 (2.5%) | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 586 | 15 (2.6%) | 0 |
| demetrix.nano.SledgeHammer 0.22 | 683 | 30 (4.4%) | 0 |
| mz.NanoDeath 2.56 | 652 | 31 (4.8%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 650 | 199 | 575 | 136 | 97.7 / 9.6 | 428 | 364 | 49 |
| bbo.RamboT 0.3 | 650 | 240 | 400 | 135 | 92.0 / 3.7 | 433 | 580 | 33 |
| PSW.Relentless 0.1 | 650 | 282 | 475 | 153 | 95.8 / 2.8 | 467 | 245 | 79 |
| mahrgell.mahrram 1.3 | 650 | 175 | 650 | 156 | 101.8 / 42.2 | 534 | 617 | 21 |
| sample.RamFire | 650 | 367 | 650 | 170 | 99.8 / 0.5 | 454 | 5 | 0 |
| stelo.MirrorNano 1.4 | 650 | 491 | 400 | 216 | 70.0 / 10.5 | 669 | 847 | 201 |
| stelo.MirrorMicro 1.1 | 650 | 513 | 400 | 220 | 71.3 / 10.3 | 697 | 491 | 0 |
| zyx.nano.RedBull 1.0 | 650 | 180 | 400 | 120 | 87.0 / 8.6 | 386 | 517 | 21 |
| bwbaugh.nano.Tirunculus 0.0.0a | 650 | 202 | 650 | 150 | 109.4 / 30.1 | 489 | 534 | 29 |
| demetrix.nano.SledgeHammer 0.22 | 650 | 152 | 650 | 174 | 116.6 / 83.8 | 620 | 494 | 17 |
| mz.NanoDeath 2.56 | 650 | 148 | 650 | 166 | 114.5 / 80.8 | 590 | 728 | 28 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 14.2% | 2 | 13 | 1 | 2.3 | - | 0 | 0 |
| bbo.RamboT 0.3 | 9.6% | 4 | 16 | 2 | 7.9 | 15 / 15 (100%) | 0 | 0 |
| PSW.Relentless 0.1 | 9.1% | 0 | 19 | 1 | 1.4 | - | 0 | 0 |
| mahrgell.mahrram 1.3 | 37.1% | 2 | 19 | 2 | 8.9 | 45 / 45 (100%) | 0 | 0 |
| sample.RamFire | 2.9% | 2 | 11 | 1 | 0.0 | - | 0 | 0 |
| stelo.MirrorNano 1.4 | 5.2% | 8 | 19 | 3 | 11.9 | 41 / 41 (100%) | 0 | 0 |
| stelo.MirrorMicro 1.1 | 5.9% | 9 | 23 | 3 | 12.6 | 49 / 49 (100%) | 0 | 0 |
| zyx.nano.RedBull 1.0 | 9.7% | 6 | 13 | 2 | 6.5 | 11 / 11 (100%) | 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 73.2% | 4 | 14 | 2 | 4.7 | 15 / 15 (100%) | 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 54.2% | 1 | 18 | 2 | 9.6 | 30 / 30 (100%) | 0 | 0 |
| mz.NanoDeath 2.56 | 54.4% | 8 | 17 | 3 | 9.1 | 31 / 31 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| bbo.RamboT 0.3 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| PSW.Relentless 0.1 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| mahrgell.mahrram 1.3 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| sample.RamFire | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| stelo.MirrorNano 1.4 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| stelo.MirrorMicro 1.1 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| zyx.nano.RedBull 1.0 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| mz.NanoDeath 2.56 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | vort.Chaser | 1 | 35 | 280 | 36.6% | 5.3% ± 5.2 | 45.8% | 13.6% / 13.4% | 1.6% | 0 / 0 | T?/M? | 92% |
| bbo.RamboT 0.3 | bbo.RamboT | 1 | 35 | 272 | 13.9% | 2.7% ± 2.2 | 42.3% | 24.9% / 27.1% | 11.0% | 0 / 0 | T1/M? | 97% |
| PSW.Relentless 0.1 | PSW.Relentless | 1 | 35 | 288 | 20.7% | 2.0% ± 5.5 | 39.6% | 28.7% / 28.8% | 2.4% | 0 / 0 | T?/M? | 98% |
| mahrgell.mahrram 1.3 | mahrgell.mahrram | 1 | 35 | 296 | 43.9% | 7.7% ± 3.1 | 43.2% | 13.9% / 12.7% | 4.3% | 0 / 0 | T?/M? | 76% |
| sample.RamFire | sample.RamFire | 1 | 35 | 280 | - | - | 41.6% | 54.4% / 55.1% | 42.8% | 0 / 0 | T?/M? | 100% |
| stelo.MirrorNano 1.4 | stelo.MirrorNano | 1 | 35 | 296 | 7.6% | 9.5% ± 3.0 | 26.8% | 30.2% / 25.3% | 3.2% | 0 / 0 | T?/M? | 91% |
| stelo.MirrorMicro 1.1 | stelo.MirrorMicro | 1 | 35 | 300 | 6.9% | 8.1% ± 2.7 | 24.9% | 31.2% / 25.2% | 1.2% | 0 / 0 | T3/M? | 92% |
| zyx.nano.RedBull 1.0 | zyx.nano.RedBull | 1 | 35 | 296 | 12.9% | 3.3% ± 2.6 | 40.9% | 16.2% / 16.1% | 4.4% | 0 / 0 | T1/M? | 93% |
| bwbaugh.nano.Tirunculus 0.0.0a | bwbaugh.nano.Tirunculus | 1 | 35 | 330 | 89.6% | 8.7% ± 4.3 | 48.8% | 14.8% / 14.9% | 7.0% | 0 / 0 | T?/M? | 82% |
| demetrix.nano.SledgeHammer 0.22 | demetrix.nano.SledgeHammer | 1 | 35 | 338 | 65.9% | 13.3% ± 3.7 | 49.6% | 9.8% / 8.6% | 4.7% | 0 / 0 | T?/M? | 63% |
| mz.NanoDeath 2.56 | mz.NanoDeath | 1 | 35 | 282 | 66.2% | 14.6% ± 3.9 | 49.3% | 10.2% / 9.8% | 4.6% | 0 / 0 | T?/M? | 64% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.8.4 vs hadur2.Hadur 3.8.1

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| vort.Chaser 0.0.3 | 94.9% ± 16.4 | 94.4% ± 9.8 | +0.5 ± 6.5 |
| bbo.RamboT 0.3 | 97.8% ± 6.0 | 97.4% ± 1.1 | +0.4 ± 7.1 |
| PSW.Relentless 0.1 | 98.3% ± 8.2 | 98.2% ± 7.8 | +0.1 ± 0.4 |
| mahrgell.mahrram 1.3 | 79.4% ± 20.7 | 79.1% ± 9.0 | +0.3 ± 29.7 |
| sample.RamFire | 99.7% ± 3.7 | 99.8% ± 2.1 | -0.1 ± 1.6 |
| stelo.MirrorNano 1.4 | 93.2% ± 13.2 | 93.1% ± 2.0 | +0.1 ± 11.2 |
| stelo.MirrorMicro 1.1 | 93.4% ± 1.0 | 94.0% ± 12.9 | -0.6 ± 13.9 |
| zyx.nano.RedBull 1.0 | 93.9% ± 12.0 | 95.0% ± 5.0 | -1.1 ± 17.0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 86.0% ± 3.9 | 84.7% ± 1.5 | +1.3 ± 5.4 |
| demetrix.nano.SledgeHammer 0.22 | 67.3% ± 11.9 | 68.3% ± 14.5 | -1.0 ± 26.3 |
| mz.NanoDeath 2.56 | 68.7% ± 8.3 | 69.9% ± 31.0 | -1.2 ± 22.8 |

# Bench: hadur2.Hadur 3.8.4 baseline (hadur2.Hadur 3.8.1) (cold)

35 rounds x 2 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=3936813.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | rammer | 94.4% ± 9.8 | 100.0% ± 0.0 | 90.3% ± 15.9 | 70 / 70 | 79.4% ± 15.9 | 14.5% ± 8.9 | 0 | 0 | 0.98 / 9.2 |
| bbo.RamboT 0.3 | rammer | 97.4% ± 1.1 | 100.0% ± 0.0 | 95.7% ± 2.6 | 70 / 70 | 75.2% ± 23.5 | 11.6% ± 3.2 | 8 | 0 | 1.03 / 12.9 |
| PSW.Relentless 0.1 | rammer | 98.2% ± 7.8 | 100.0% ± 0.0 | 97.1% ± 12.6 | 70 / 70 | 68.5% ± 22.2 | 8.2% ± 5.7 | 3 | 0 | 1.00 / 12.2 |
| mahrgell.mahrram 1.3 | rammer | 79.1% ± 9.0 | 100.0% ± 0.0 | 69.7% ± 9.7 | 70 / 70 | 70.6% ± 37.5 | 38.3% ± 15.2 | 1 | 0 | 1.10 / 15.9 |
| sample.RamFire | rammer | 99.8% ± 2.1 | 100.0% ± 0.0 | 99.8% ± 2.9 | 70 / 70 | 68.3% ± 3.8 | 1.5% ± 18.4 | 3 | 0 | 0.96 / 11.6 |
| stelo.MirrorNano 1.4 | mirror | 93.1% ± 2.0 | 100.0% ± 0.0 | 86.9% ± 3.9 | 70 / 70 | 37.1% ± 10.8 | 5.5% ± 1.9 | 7 | 0 | 1.05 / 11.8 |
| stelo.MirrorMicro 1.1 | mirror | 94.0% ± 12.9 | 100.0% ± 0.0 | 88.4% ± 22.9 | 70 / 70 | 35.1% ± 5.1 | 5.5% ± 12.7 | 3 | 0 | 1.07 / 12.1 |
| zyx.nano.RedBull 1.0 | nano | 95.0% ± 5.0 | 100.0% ± 0.0 | 92.7% ± 0.0 | 70 / 70 | 80.7% ± 1.9 | 7.9% ± 12.7 | 2 | 0 | 0.93 / 12.2 |
| bwbaugh.nano.Tirunculus 0.0.0a | nano | 84.7% ± 1.5 | 100.0% ± 0.0 | 76.7% ± 5.3 | 70 / 70 | 82.6% ± 6.4 | 77.3% ± 21.6 | 0 | 0 | 0.93 / 9.8 |
| demetrix.nano.SledgeHammer 0.22 | nano | 68.3% ± 14.5 | 94.3% ± 0.0 | 58.5% ± 15.6 | 66 / 70 | 73.6% ± 7.6 | 55.4% ± 33.7 | 4 | 0 | 1.01 / 23.4 |
| mz.NanoDeath 2.56 | nano | 69.9% ± 31.0 | 95.7% ± 18.2 | 59.8% ± 25.8 | 67 / 70 | 72.7% ± 20.3 | 51.2% ± 65.4 | 2 | 0 | 0.99 / 14.5 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 188 | 6 | 188 | 188 (100.0%) | 0 (0.0%) | 0 (0.0%) | 9 | 13 | 2 |
| bbo.RamboT 0.3 | 558 | 5 | 552 | 552 (98.9%) | 6 (1.1%) | 0 (0.0%) | 71 | 38 | 4 |
| PSW.Relentless 0.1 | 126 | 3 | 126 | 126 (100.0%) | 0 (0.0%) | 0 (0.0%) | 39 | 9 | 3 |
| mahrgell.mahrram 1.3 | 660 | 4 | 660 | 660 (100.0%) | 0 (0.0%) | 0 (0.0%) | 205 | 53 | 2 |
| sample.RamFire | 1 | 0 | 1 | 1 (100.0%) | 0 (0.0%) | 0 (0.0%) | 22 | 1 | 1 |
| stelo.MirrorNano 1.4 | 798 | 9 | 798 | 798 (100.0%) | 0 (0.0%) | 0 (0.0%) | 5 | 20 | 9 |
| stelo.MirrorMicro 1.1 | 883 | 6 | 883 | 883 (100.0%) | 0 (0.0%) | 0 (0.0%) | 5 | 17 | 3 |
| zyx.nano.RedBull 1.0 | 453 | 2 | 453 | 453 (100.0%) | 0 (0.0%) | 0 (0.0%) | 101 | 30 | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 360 | 7 | 360 | 360 (100.0%) | 0 (0.0%) | 0 (0.0%) | 71 | 18 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 675 | 1 | 675 | 675 (100.0%) | 0 (0.0%) | 0 (0.0%) | 139 | 41 | 4 |
| mz.NanoDeath 2.56 | 642 | 1 | 642 | 642 (100.0%) | 0 (0.0%) | 0 (0.0%) | 184 | 34 | 2 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| vort.Chaser 0.0.3 | 517 | 1 (0.2%) | 0 |
| bbo.RamboT 0.3 | 497 | 10 (2.0%) | 0 |
| PSW.Relentless 0.1 | 610 | 0 (0.0%) | 0 |
| mahrgell.mahrram 1.3 | 616 | 35 (5.7%) | 0 |
| sample.RamFire | 687 | 0 (0.0%) | 0 |
| stelo.MirrorNano 1.4 | 833 | 43 (5.2%) | 0 |
| stelo.MirrorMicro 1.1 | 887 | 59 (6.7%) | 0 |
| zyx.nano.RedBull 1.0 | 446 | 15 (3.4%) | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 575 | 9 (1.6%) | 0 |
| demetrix.nano.SledgeHammer 0.22 | 676 | 24 (3.6%) | 0 |
| mz.NanoDeath 2.56 | 649 | 25 (3.9%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 650 | 189 | 475 | 135 | 97.4 / 10.5 | 431 | 435 | 37 |
| bbo.RamboT 0.3 | 650 | 244 | 400 | 135 | 92.0 / 4.2 | 452 | 500 | 17 |
| PSW.Relentless 0.1 | 650 | 268 | 400 | 157 | 95.2 / 2.9 | 496 | 252 | 117 |
| mahrgell.mahrram 1.3 | 650 | 191 | 600 | 158 | 103.7 / 45.1 | 550 | 606 | 3 |
| sample.RamFire | 650 | 370 | 650 | 174 | 99.8 / 0.2 | 460 | 14 | 0 |
| stelo.MirrorNano 1.4 | 650 | 487 | 400 | 208 | 71.2 / 10.7 | 656 | 700 | 168 |
| stelo.MirrorMicro 1.1 | 650 | 504 | 400 | 220 | 71.3 / 9.4 | 674 | 575 | 0 |
| zyx.nano.RedBull 1.0 | 650 | 183 | 400 | 120 | 86.3 / 6.8 | 379 | 562 | 24 |
| bwbaugh.nano.Tirunculus 0.0.0a | 650 | 198 | 650 | 148 | 111.0 / 33.6 | 482 | 602 | 58 |
| demetrix.nano.SledgeHammer 0.22 | 650 | 154 | 650 | 171 | 117.8 / 83.9 | 605 | 427 | 24 |
| mz.NanoDeath 2.56 | 650 | 163 | 650 | 166 | 112.2 / 75.9 | 588 | 787 | 35 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 14.5% | 0 | 10 | 1 | 2.6 | 1 / 1 (100%) | 0 | 0 |
| bbo.RamboT 0.3 | 11.6% | 8 | 17 | 3 | 7.8 | 10 / 10 (100%) | 0 | 0 |
| PSW.Relentless 0.1 | 8.2% | 3 | 15 | 2 | 1.7 | - | 0 | 0 |
| mahrgell.mahrram 1.3 | 38.3% | 1 | 404 | 2 | 9.2 | 35 / 35 (100%) | 0 | 0 |
| sample.RamFire | 1.5% | 3 | 10 | 1 | 0.0 | - | 0 | 0 |
| stelo.MirrorNano 1.4 | 5.5% | 7 | 14 | 2 | 11.4 | 43 / 43 (100%) | 0 | 0 |
| stelo.MirrorMicro 1.1 | 5.5% | 3 | 193 | 2 | 12.6 | 59 / 59 (100%) | 0 | 0 |
| zyx.nano.RedBull 1.0 | 7.9% | 2 | 19 | 2 | 6.5 | 15 / 15 (100%) | 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 77.3% | 0 | 14 | 1 | 4.9 | 9 / 9 (100%) | 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 55.4% | 4 | 16 | 2 | 9.5 | 24 / 24 (100%) | 0 | 0 |
| mz.NanoDeath 2.56 | 51.2% | 2 | 17 | 2 | 9.1 | 25 / 25 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| bbo.RamboT 0.3 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| PSW.Relentless 0.1 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| mahrgell.mahrram 1.3 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| sample.RamFire | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| stelo.MirrorNano 1.4 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| stelo.MirrorMicro 1.1 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| zyx.nano.RedBull 1.0 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| mz.NanoDeath 2.56 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

