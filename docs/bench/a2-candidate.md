# Bench suite: arch-gates.txt

## Bench: hadur2.Hadur 3.5.1 (cold)

35 rounds x 5 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=4157213.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sample.SpinBot | sanity | 100.0% ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | 175 / 175 | 40.2% ± 2.9 | 0.0% ± 0.0 | 8 | 0 | 1.24 / 99.3 |
| sample.Tracker | sanity | 99.8% ± 0.3 | 100.0% ± 0.0 | 99.7% ± 0.5 | 175 / 175 | 79.2% ± 1.8 | 0.9% ± 1.6 | 25 | 0 | 1.23 / 217.9 |
| sample.Crazy | sanity | 98.3% ± 1.1 | 98.9% ± 1.9 | 97.6% ± 0.9 | 173 / 175 | 21.9% ± 1.0 | 9.1% ± 3.1 | 59 | 0 | 1.32 / 209.5 |
| sample.Walls | sanity | 98.5% ± 0.9 | 98.3% ± 1.9 | 98.5% ± 1.0 | 172 / 175 | 36.1% ± 2.7 | 5.0% ± 8.2 | 58 | 0 | 1.05 / 102.2 |
| sample.RamFire | sanity | 99.6% ± 0.7 | 100.0% ± 0.0 | 99.5% ± 1.0 | 175 / 175 | 69.5% ± 2.4 | 1.4% ± 2.5 | 14 | 0 | 1.15 / 132.6 |
| abc.Shadow 3.83c | headline | 52.8% ± 8.2 | 65.1% ± 11.6 | 41.5% ± 4.6 | 114 / 175 | 9.0% ± 0.9 | 8.6% ± 1.1 | 44 | 0 | 2.32 / 83.6 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| sample.SpinBot | 650 | 6 | 650 | 650 (100.0%) | 0 (0.0%) | 0 (0.0%) | 218 | 22 | 10 |
| sample.Tracker | 173 | 1 | 164 | 164 (94.8%) | 9 (5.2%) | 0 (0.0%) | 0 | 6 | 16 |
| sample.Crazy | 903 | 3 | 888 | 883 (97.8%) | 20 (2.2%) | 5 (0.6%) | 1139 | 19 | 22 |
| sample.Walls | 951 | 4 | 818 | 818 (86.0%) | 133 (14.0%) | 0 (0.0%) | 44 | 13 | 21 |
| sample.RamFire | 8 | 1 | 8 | 8 (100.0%) | 0 (0.0%) | 0 (0.0%) | 81 | 6 | 10 |
| abc.Shadow 3.83c | 9385 | 642 | 9286 | 9286 (98.9%) | 99 (1.1%) | 0 (0.0%) | 380 | 80 | 44 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| sample.SpinBot | 2471 | 8 (0.3%) | 0 |
| sample.Tracker | 1768 | 4 (0.2%) | 0 |
| sample.Crazy | 5132 | 48 (0.9%) | 0 |
| sample.Walls | 3260 | 58 (1.8%) | 0 |
| sample.RamFire | 1713 | 0 (0.0%) | 0 |
| abc.Shadow 3.83c | 10220 | 894 (8.7%) | 8260 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| sample.SpinBot | 650 | 404 | 400 | 241 | 87.0 / 0.0 | 1727 | 771 | 137 |
| sample.Tracker | 650 | 278 | 400 | 171 | 97.3 / 0.3 | 523 | 376 | 12 |
| sample.Crazy | 650 | 485 | 545 | 463 | 79.0 / 1.9 | 2955 | 637 | 764 |
| sample.Walls | 650 | 441 | 400 | 309 | 88.8 / 1.3 | 1953 | 685 | 109 |
| sample.RamFire | 650 | 370 | 650 | 173 | 99.8 / 0.5 | 1111 | 3 | 0 |
| abc.Shadow 3.83c | 650 | 463 | 650 | 770 | 26.9 / 38.1 | 17 | 1061 | 42 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| sample.SpinBot | 0.0% | 8 | 93 | 3 | 3.7 | 8 / 8 (100%) | 0 | 0 |
| sample.Tracker | 0.9% | 25 | 35 | 3 | 0.9 | 4 / 4 (100%) | 0 | 0 |
| sample.Crazy | 9.1% | 59 | 76 | 3 | 5.1 | 48 / 48 (100%) | 0 | 0 |
| sample.Walls | 5.0% | 58 | 95 | 3 | 4.7 | 52 / 58 (90%) | 0 | 0 |
| sample.RamFire | 1.4% | 14 | 52 | 3 | 0.0 | - | 0 | 0 |
| abc.Shadow 3.83c | 8.6% | 44 | 457 | 3 | 52.6 | 887 / 894 (99%) | 0 | 0 |

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
| sample.SpinBot | sample.SpinBot | 1 | 35 | 279 | 0.0% | 0.0% ± 2.2 | 30.2% | 58.1% / 63.4% | 2.4% | 0 / 0 | T0/M? | 100% |
| sample.Tracker | sample.Tracker | 1 | 35 | 279 | 0.0% | 0.0% ± 8.6 | 44.9% | 43.8% / 44.7% | 54.1% | 0 / 0 | T?/M? | 100% |
| sample.Crazy | sample.Crazy | 1 | 35 | 271 | 9.1% | 6.4% ± 3.9 | 17.1% | 32.3% / 28.4% | 3.1% | 0 / 0 | T?/M0 | 99% |
| sample.Walls | sample.Walls | 1 | 35 | 271 | 1.5% | 0.1% ± 1.5 | 25.2% | 38.5% / 60.5% | 14.7% | 0 / 0 | T0/M? | 99% |
| sample.RamFire | sample.RamFire | 1 | 35 | 279 | 100.0% | 3.1% ± 27.9 | 40.8% | 51.4% / 51.0% | 43.2% | 0 / 0 | T?/M? | 99% |
| abc.Shadow 3.83c | abc.Shadow | 1 | 35 | 275 | 8.5% | 7.3% ± 1.2 | 9.1% | 21.4% / 20.7% | 9.2% | 0 / 0 | T3/M1 | 55% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Bench: hadur2.Hadur 3.5.1 (cold)

35 rounds x 1 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=4310507.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 16.8% | 0.0% | 39.6% | 0 / 35 | 5.4% | 9.4% | 20 | 0 | 4.78 / 124.3 |
| jk.mega.DrussGT 3.1.16 | rumble-3 | 33.7% | 20.0% | 49.1% | 7 / 35 | 7.9% | 10.3% | 33 | 0 | 3.69 / 134.8 |
| oog.mega.saguaro.Saguaro 1.0 | rumble-4 | 80.5% | 97.1% | 63.8% | 34 / 35 | 19.4% | 6.9% | 11 | 0 | 5.23 / 199.1 |
| aaa.r.ScalarR 0.005h.053-noshield | rumble-5 | 26.8% | 14.3% | 41.5% | 5 / 35 | 7.2% | 11.1% | 36 | 0 | 4.07 / 189.7 |
| voidious.Diamond 1.8.22 | rumble-6 | 27.3% | 17.6% | 39.5% | 7 / 35 | 6.8% | 8.4% | 32 | 0 | 3.93 / 163.6 |
| cb.fire.Firestarter 2.0f | rumble-7 | 34.7% | 20.0% | 50.0% | 7 / 35 | 9.1% | 8.8% | 26 | 0 | 3.81 / 127.5 |
| lxx.Tomcat 3.68 | rumble-8 | 49.9% | 54.3% | 46.5% | 19 / 35 | 9.3% | 13.4% | 29 | 0 | 4.14 / 213.8 |
| rsalesc.mega.Knight 0.6.28 | rumble-9 | 38.3% | 25.7% | 50.9% | 9 / 35 | 9.3% | 10.0% | 43 | 0 | 4.92 / 311.3 |
| dsekercioglu.mega.Raven 3.56j8 | rumble-10 | 53.7% | 68.6% | 39.4% | 24 / 35 | 9.8% | 8.6% | 51 | 0 | 2.80 / 124.9 |
| xander.cat.XanderCat 12.9 | rumble-11 | 55.8% | 57.1% | 53.1% | 20 / 35 | 11.6% | 10.2% | 25 | 0 | 2.75 / 36.7 |
| aw.Gilgalad 1.99.5c | rumble-12 | 33.4% | 29.4% | 38.1% | 11 / 35 | 7.7% | 10.5% | 23 | 0 | 3.53 / 62.6 |
| pc.Wavelet 1.5 | rumble-13 | 48.5% | 28.6% | 67.0% | 10 / 35 | 11.5% | 11.0% | 38 | 0 | 6.03 / 176.4 |
| kc.serpent.WaveSerpent 2.11 | rumble-14 | 51.5% | 65.7% | 36.9% | 23 / 35 | 6.6% | 8.7% | 13 | 0 | 4.43 / 61.0 |
| gh.GresSuffurd 0.4.13 | rumble-15 | 57.9% | 65.7% | 49.9% | 23 / 35 | 10.2% | 10.4% | 23 | 0 | 2.23 / 241.7 |
| dsekercioglu.mega.WhiteFang 2.8.1 | rumble-16 | 68.7% | 80.0% | 57.0% | 28 / 35 | 10.2% | 10.2% | 22 | 0 | 2.84 / 84.1 |
| cs.Nene 1.0.5 | rumble-17 | 60.7% | 77.1% | 44.0% | 27 / 35 | 8.9% | 7.3% | 13 | 0 | 3.07 / 174.0 |
| jk.melee.Neuromancer 7.12 | rumble-18 | 36.1% | 25.7% | 46.0% | 9 / 35 | 9.5% | 63.4% | 62 | 0 | 3.74 / 78.0 |
| voidious.Dookious 1.573c | rumble-19 | 55.4% | 65.7% | 45.6% | 23 / 35 | 9.3% | 7.1% | 11 | 0 | 2.55 / 88.8 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 7552 | 62 | 7602 | 7552 (100.0%) | 0 (0.0%) | 50 (0.7%) | 322 | 51 | 23 |
| jk.mega.DrussGT 3.1.16 | 8163 | 4 | 8123 | 8120 (99.5%) | 43 (0.5%) | 3 (0.0%) | 477 | 46 | 31 |
| oog.mega.saguaro.Saguaro 1.0 | 1107 | 2 | 1096 | 1094 (98.8%) | 13 (1.2%) | 2 (0.2%) | 63 | 22 | 5 |
| aaa.r.ScalarR 0.005h.053-noshield | 6802 | 2 | 6850 | 6745 (99.2%) | 57 (0.8%) | 105 (1.5%) | 403 | 72 | 32 |
| voidious.Diamond 1.8.22 | 7389 | 302 | 7674 | 7388 (100.0%) | 1 (0.0%) | 286 (3.7%) | 410 | 42 | 31 |
| cb.fire.Firestarter 2.0f | 6928 | 297 | 7630 | 6928 (100.0%) | 0 (0.0%) | 702 (9.2%) | 565 | 69 | 24 |
| lxx.Tomcat 3.68 | 4183 | 151 | 4028 | 4027 (96.3%) | 156 (3.7%) | 1 (0.0%) | 252 | 31 | 17 |
| rsalesc.mega.Knight 0.6.28 | 7918 | 125 | 7822 | 7821 (98.8%) | 97 (1.2%) | 1 (0.0%) | 559 | 43 | 29 |
| dsekercioglu.mega.Raven 3.56j8 | 2872 | 15 | 2869 | 2869 (99.9%) | 3 (0.1%) | 0 (0.0%) | 201 | 29 | 6 |
| xander.cat.XanderCat 12.9 | 3466 | 1 | 3549 | 3426 (98.8%) | 40 (1.2%) | 123 (3.5%) | 359 | 57 | 20 |
| aw.Gilgalad 1.99.5c | 5234 | 2 | 5288 | 5233 (100.0%) | 1 (0.0%) | 55 (1.0%) | 286 | 36 | 22 |
| pc.Wavelet 1.5 | 5029 | 2 | 4997 | 4892 (97.3%) | 137 (2.7%) | 105 (2.1%) | 457 | 57 | 19 |
| kc.serpent.WaveSerpent 2.11 | 1956 | 2 | 1936 | 1936 (99.0%) | 20 (1.0%) | 0 (0.0%) | 70 | 14 | 7 |
| gh.GresSuffurd 0.4.13 | 2400 | 4 | 2309 | 2309 (96.2%) | 91 (3.8%) | 0 (0.0%) | 145 | 26 | 15 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 2440 | 2 | 2341 | 2341 (95.9%) | 99 (4.1%) | 0 (0.0%) | 116 | 24 | 12 |
| cs.Nene 1.0.5 | 1797 | 13 | 1797 | 1797 (100.0%) | 0 (0.0%) | 0 (0.0%) | 63 | 14 | 10 |
| jk.melee.Neuromancer 7.12 | 5581 | 0 | 5361 | 5322 (95.4%) | 259 (4.6%) | 39 (0.7%) | 410 | 35 | 40 |
| voidious.Dookious 1.573c | 1752 | 4 | 1738 | 1738 (99.2%) | 14 (0.8%) | 0 (0.0%) | 79 | 10 | 8 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 7474 | 904 (12.1%) | 7329 |
| jk.mega.DrussGT 3.1.16 | 8027 | 1029 (12.8%) | 7947 |
| oog.mega.saguaro.Saguaro 1.0 | 1352 | 95 (7.0%) | 1327 |
| aaa.r.ScalarR 0.005h.053-noshield | 6897 | 740 (10.7%) | 6434 |
| voidious.Diamond 1.8.22 | 7406 | 816 (11.0%) | 7335 |
| cb.fire.Firestarter 2.0f | 7874 | 719 (9.1%) | 7774 |
| lxx.Tomcat 3.68 | 4155 | 481 (11.6%) | 3760 |
| rsalesc.mega.Knight 0.6.28 | 7765 | 926 (11.9%) | 7604 |
| dsekercioglu.mega.Raven 3.56j8 | 3062 | 308 (10.1%) | 3045 |
| xander.cat.XanderCat 12.9 | 4340 | 362 (8.3%) | 4185 |
| aw.Gilgalad 1.99.5c | 5239 | 604 (11.5%) | 5150 |
| pc.Wavelet 1.5 | 5662 | 577 (10.2%) | 5114 |
| kc.serpent.WaveSerpent 2.11 | 2415 | 188 (7.8%) | 2115 |
| gh.GresSuffurd 0.4.13 | 2500 | 223 (8.9%) | 2232 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 2656 | 231 (8.7%) | 2488 |
| cs.Nene 1.0.5 | 1943 | 176 (9.1%) | 1695 |
| jk.melee.Neuromancer 7.12 | 5706 | 585 (10.3%) | 5261 |
| voidious.Dookious 1.573c | 2085 | 166 (8.0%) | 1749 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 540 | 650 | 2487 | 19.2 / 29.3 | 0 | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 650 | 516 | 650 | 2690 | 27.9 / 28.9 | 0 | 34 | 20 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 480 | 500 | 536 | 43.0 / 24.4 | 53 | 523 | 229 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 489 | 650 | 2323 | 23.0 / 32.4 | 0 | 99 | 0 |
| voidious.Diamond 1.8.22 | 650 | 539 | 650 | 2497 | 20.5 / 31.3 | 0 | 0 | 2 |
| cb.fire.Firestarter 2.0f | 650 | 550 | 650 | 2646 | 30.9 / 30.9 | 0 | 38 | 20 |
| lxx.Tomcat 3.68 | 650 | 514 | 650 | 1502 | 30.6 / 35.3 | 0 | 66 | 1 |
| rsalesc.mega.Knight 0.6.28 | 650 | 510 | 650 | 2621 | 32.0 / 30.9 | 34 | 0 | 30 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 453 | 650 | 1117 | 24.8 / 38.2 | 10 | 76 | 327 |
| xander.cat.XanderCat 12.9 | 650 | 448 | 650 | 1546 | 36.5 / 32.2 | 31 | 528 | 38 |
| aw.Gilgalad 1.99.5c | 650 | 518 | 650 | 1804 | 24.7 / 40.3 | 0 | 30 | 1 |
| pc.Wavelet 1.5 | 650 | 441 | 400 | 2026 | 44.2 / 21.7 | 159 | 150 | 0 |
| kc.serpent.WaveSerpent 2.11 | 650 | 481 | 650 | 895 | 20.2 / 34.4 | 0 | 94 | 0 |
| gh.GresSuffurd 0.4.13 | 650 | 468 | 650 | 941 | 30.0 / 30.2 | 64 | 219 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 650 | 472 | 650 | 1009 | 36.7 / 27.7 | 4 | 317 | 71 |
| cs.Nene 1.0.5 | 650 | 471 | 650 | 735 | 26.3 / 33.5 | 0 | 140 | 170 |
| jk.melee.Neuromancer 7.12 | 650 | 513 | 650 | 1950 | 32.7 / 38.4 | 6 | 91 | 1 |
| voidious.Dookious 1.573c | 650 | 479 | 650 | 788 | 27.8 / 33.1 | 0 | 230 | 387 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 9.4% | 20 | 292 | 2 | 216.9 | 903 / 904 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 10.3% | 33 | 171 | 3 | 230.1 | 1026 / 1029 (100%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 6.9% | 11 | 28 | 3 | 31.3 | 92 / 95 (97%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 11.1% | 36 | 42 | 3 | 195.5 | 737 / 740 (100%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 8.4% | 32 | 53 | 3 | 216.8 | 816 / 816 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 8.8% | 26 | 264 | 3 | 216.1 | 713 / 719 (99%) | 0 | 0 |
| lxx.Tomcat 3.68 | 13.4% | 29 | 85 | 3 | 113.8 | 469 / 481 (98%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 10.0% | 43 | 217 | 3 | 220.8 | 922 / 926 (100%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 8.6% | 51 | 1598 | 2 | 81.4 | 306 / 308 (99%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 10.2% | 25 | 94 | 3 | 101.2 | 360 / 362 (99%) | 0 | 0 |
| aw.Gilgalad 1.99.5c | 10.5% | 23 | 3276 | 3 | 149.7 | 604 / 604 (100%) | 0 | 0 |
| pc.Wavelet 1.5 | 11.0% | 38 | 54 | 3 | 138.6 | 571 / 577 (99%) | 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 8.7% | 13 | 40 | 3 | 54.6 | 187 / 188 (99%) | 0 | 0 |
| gh.GresSuffurd 0.4.13 | 10.4% | 23 | 230 | 3 | 65.7 | 219 / 223 (98%) | 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 10.2% | 22 | 51 | 3 | 65.1 | 227 / 231 (98%) | 0 | 0 |
| cs.Nene 1.0.5 | 7.3% | 13 | 32 | 2 | 51.3 | 176 / 176 (100%) | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 63.4% | 62 | 60 | 3 | 152.1 | 577 / 585 (99%) | 0 | 0 |
| voidious.Dookious 1.573c | 7.1% | 11 | 24 | 3 | 49.0 | 166 / 166 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| voidious.Diamond 1.8.22 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| cb.fire.Firestarter 2.0f | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| lxx.Tomcat 3.68 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| xander.cat.XanderCat 12.9 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| aw.Gilgalad 1.99.5c | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| pc.Wavelet 1.5 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| gh.GresSuffurd 0.4.13 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| cs.Nene 1.0.5 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| jk.melee.Neuromancer 7.12 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| voidious.Dookious 1.573c | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | kc.mega.BeepBoop | 1 | 35 | 295 | 9.5% | 8.2% ± 1.1 | 5.3% | 20.7% / 21.0% | 0.1% | 0 / 0 | T3/M1 | 18% |
| jk.mega.DrussGT 3.1.16 | jk.mega.DrussGT | 1 | 35 | 297 | 10.1% | 8.2% ± 1.0 | 7.7% | 24.0% / 20.9% | 1.7% | 0 / 0 | T3/M1 | 34% |
| oog.mega.saguaro.Saguaro 1.0 | oog.mega.saguaro.Saguaro | 1 | 35 | 327 | 7.2% | 7.5% ± 1.7 | 13.7% | 26.5% / 25.8% | 13.6% | 0 / 0 | T3/M0 | 79% |
| aaa.r.ScalarR 0.005h.053-noshield | aaa.r.ScalarR | 1 | 35 | 315 | 11.0% | 8.5% ± 0.9 | 7.4% | 24.4% / 23.3% | 0.0% | 0 / 0 | T3/M1 | 27% |
| voidious.Diamond 1.8.22 | voidious.Diamond | 1 | 35 | 301 | 8.6% | 7.3% ± 1.0 | 6.9% | 22.5% / 21.9% | 8.7% | 0 / 0 | T3/M1 | 27% |
| cb.fire.Firestarter 2.0f | cb.fire.Firestarter | 1 | 35 | 309 | 8.4% | 7.4% ± 1.0 | 8.9% | 20.3% / 20.7% | 3.1% | 0 / 0 | T3/M1 | 35% |
| lxx.Tomcat 3.68 | lxx.Tomcat | 1 | 35 | 273 | 9.3% | 8.3% ± 0.9 | 9.2% | 23.4% / 21.8% | 8.6% | 0 / 0 | T3/M1 | 51% |
| rsalesc.mega.Knight 0.6.28 | rsalesc.mega.Knight | 1 | 35 | 313 | 9.6% | 7.7% ± 1.0 | 9.7% | 24.2% / 21.5% | 12.1% | 0 / 0 | T3/M1 | 38% |
| dsekercioglu.mega.Raven 3.56j8 | dsekercioglu.mega.Raven | 1 | 34 | 329 | 9.0% | 7.3% ± 1.0 | 9.7% | 20.9% / 20.8% | 11.1% | 0 / 0 | T3/M1 | 55% |
| xander.cat.XanderCat 12.9 | xander.cat.XanderCat | 1 | 35 | 313 | 10.6% | 7.9% ± 0.9 | 11.0% | 22.7% / 22.7% | 8.0% | 0 / 0 | T3/M1 | 55% |
| aw.Gilgalad 1.99.5c | aw.Gilgalad | 1 | 35 | 283 | 10.6% | 9.0% ± 1.1 | 7.8% | 21.7% / 21.7% | 3.9% | 0 / 0 | T3/M1 | 34% |
| pc.Wavelet 1.5 | pc.Wavelet | 1 | 34 | 271 | 10.3% | 7.0% ± 1.0 | 11.1% | 21.6% / 21.4% | 10.3% | 0 / 0 | T3/M1 | 50% |
| kc.serpent.WaveSerpent 2.11 | kc.serpent.WaveSerpent | 1 | 35 | 321 | 7.4% | 6.8% ± 1.2 | 6.4% | 22.0% / 24.9% | 11.9% | 0 / 0 | T2/M2 | 53% |
| gh.GresSuffurd 0.4.13 | gh.GresSuffurd | 1 | 35 | 293 | 8.3% | 6.9% ± 1.1 | 10.2% | 24.2% / 22.6% | 12.4% | 0 / 0 | T2/M1 | 59% |
| dsekercioglu.mega.WhiteFang 2.8.1 | dsekercioglu.mega.WhiteFang | 1 | 35 | 343 | 7.6% | 6.5% ± 1.1 | 9.7% | 22.5% / 22.0% | 14.3% | 0 / 0 | T2/M1 | 69% |
| cs.Nene 1.0.5 | cs.Nene | 1 | 35 | 263 | 7.8% | 7.6% ± 1.3 | 8.7% | 25.2% / 24.4% | 8.9% | 0 / 0 | T3/M0 | 61% |
| jk.melee.Neuromancer 7.12 | jk.melee.Neuromancer | 1 | 35 | 313 | 10.2% | 8.7% ± 1.1 | 9.7% | 23.4% / 22.6% | 0.0% | 0 / 0 | T3/M1 | 38% |
| voidious.Dookious 1.573c | voidious.Dookious | 1 | 35 | 305 | 7.8% | 7.3% ± 1.3 | 9.3% | 22.5% / 23.5% | 11.2% | 0 / 0 | T3/M1 | 56% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Bench: hadur2.Hadur 3.5.1 (cold)

35 rounds x 1 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=4632630.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | rammer | 95.2% | 100.0% | 91.7% | 35 / 35 | 77.8% | 15.6% | 2 | 0 | 1.29 / 17.0 |
| bbo.RamboT 0.3 | rammer | 96.4% | 100.0% | 94.6% | 35 / 35 | 76.0% | 20.6% | 9 | 0 | 2.17 / 113.8 |
| PSW.Relentless 0.1 | rammer | 97.1% | 100.0% | 95.1% | 35 / 35 | 72.7% | 8.1% | 2 | 0 | 1.23 / 58.7 |
| mahrgell.mahrram 1.3 | rammer | 78.3% | 97.1% | 69.5% | 34 / 35 | 70.9% | 57.9% | 8 | 0 | 1.48 / 24.2 |
| sample.RamFire | rammer | 99.4% | 100.0% | 99.1% | 35 / 35 | 71.7% | 2.9% | 8 | 0 | 1.23 / 59.9 |
| stelo.MirrorNano 1.4 | mirror | 54.4% | 82.9% | 25.7% | 29 / 35 | 13.9% | 6.6% | 24 | 0 | 1.02 / 82.4 |
| stelo.MirrorMicro 1.1 | mirror | 91.9% | 100.0% | 84.9% | 35 / 35 | 36.9% | 14.6% | 12 | 0 | 1.51 / 91.3 |
| zyx.nano.RedBull 1.0 | nano | 93.0% | 97.1% | 91.9% | 34 / 35 | 79.8% | 20.7% | 6 | 0 | 1.23 / 27.9 |
| bwbaugh.nano.Tirunculus 0.0.0a | nano | 85.2% | 100.0% | 77.8% | 35 / 35 | 83.7% | 69.8% | 3 | 0 | 1.18 / 21.8 |
| demetrix.nano.SledgeHammer 0.22 | nano | 68.3% | 94.3% | 58.5% | 33 / 35 | 70.9% | 53.7% | 4 | 0 | 1.34 / 93.4 |
| mz.NanoDeath 2.56 | nano | 69.9% | 97.1% | 59.6% | 34 / 35 | 74.2% | 51.8% | 3 | 0 | 1.27 / 77.2 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 97 | 1 | 97 | 97 (100.0%) | 0 (0.0%) | 0 (0.0%) | 4 | 5 | 1 |
| bbo.RamboT 0.3 | 298 | 1 | 268 | 268 (89.9%) | 30 (10.1%) | 0 (0.0%) | 47 | 28 | 4 |
| PSW.Relentless 0.1 | 65 | 1 | 65 | 65 (100.0%) | 0 (0.0%) | 0 (0.0%) | 21 | 8 | 1 |
| mahrgell.mahrram 1.3 | 324 | 0 | 311 | 311 (96.0%) | 13 (4.0%) | 0 (0.0%) | 81 | 22 | 3 |
| sample.RamFire | 2 | 0 | 1 | 1 (50.0%) | 1 (50.0%) | 0 (0.0%) | 22 | 1 | 6 |
| stelo.MirrorNano 1.4 | 1379 | 2 | 1349 | 1348 (97.8%) | 31 (2.2%) | 1 (0.1%) | 3 | 7 | 11 |
| stelo.MirrorMicro 1.1 | 499 | 0 | 412 | 412 (82.6%) | 87 (17.4%) | 0 (0.0%) | 4 | 11 | 13 |
| zyx.nano.RedBull 1.0 | 240 | 1 | 227 | 227 (94.6%) | 13 (5.4%) | 0 (0.0%) | 20 | 4 | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 167 | 3 | 167 | 167 (100.0%) | 0 (0.0%) | 0 (0.0%) | 57 | 8 | 2 |
| demetrix.nano.SledgeHammer 0.22 | 341 | 1 | 341 | 341 (100.0%) | 0 (0.0%) | 0 (0.0%) | 97 | 22 | 4 |
| mz.NanoDeath 2.56 | 313 | 1 | 313 | 313 (100.0%) | 0 (0.0%) | 0 (0.0%) | 106 | 15 | 3 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| vort.Chaser 0.0.3 | 263 | 0 (0.0%) | 0 |
| bbo.RamboT 0.3 | 266 | 7 (2.6%) | 0 |
| PSW.Relentless 0.1 | 289 | 0 (0.0%) | 0 |
| mahrgell.mahrram 1.3 | 308 | 23 (7.5%) | 0 |
| sample.RamFire | 360 | 0 (0.0%) | 0 |
| stelo.MirrorNano 1.4 | 334 | 15 (4.5%) | 208 |
| stelo.MirrorMicro 1.1 | 510 | 23 (4.5%) | 0 |
| zyx.nano.RedBull 1.0 | 232 | 7 (3.0%) | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 282 | 3 (1.1%) | 0 |
| demetrix.nano.SledgeHammer 0.22 | 341 | 16 (4.7%) | 0 |
| mz.NanoDeath 2.56 | 307 | 9 (2.9%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 650 | 210 | 400 | 137 | 96.7 / 8.8 | 221 | 200 | 26 |
| bbo.RamboT 0.3 | 650 | 245 | 400 | 142 | 91.2 / 5.2 | 212 | 320 | 9 |
| PSW.Relentless 0.1 | 650 | 261 | 450 | 150 | 96.3 / 4.9 | 232 | 136 | 65 |
| mahrgell.mahrram 1.3 | 650 | 193 | 650 | 157 | 101.5 / 44.5 | 253 | 286 | 18 |
| sample.RamFire | 650 | 364 | 650 | 178 | 99.7 / 0.9 | 203 | 14 | 0 |
| stelo.MirrorNano 1.4 | 650 | 512 | 400 | 652 | 15.1 / 43.7 | 53 | 1556 | 632 |
| stelo.MirrorMicro 1.1 | 650 | 498 | 400 | 241 | 72.6 / 12.9 | 311 | 310 | 0 |
| zyx.nano.RedBull 1.0 | 650 | 186 | 400 | 124 | 85.6 / 7.5 | 186 | 303 | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 650 | 202 | 650 | 145 | 109.1 / 31.1 | 235 | 289 | 20 |
| demetrix.nano.SledgeHammer 0.22 | 650 | 162 | 650 | 174 | 115.6 / 82.1 | 308 | 180 | 15 |
| mz.NanoDeath 2.56 | 650 | 157 | 650 | 162 | 112.7 / 76.5 | 285 | 424 | 13 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 15.6% | 2 | 27 | 2 | 2.6 | - | 0 | 0 |
| bbo.RamboT 0.3 | 20.6% | 9 | 3 | 3 | 7.7 | 4 / 7 (57%) | 0 | 0 |
| PSW.Relentless 0.1 | 8.1% | 2 | 35 | 2 | 1.8 | - | 0 | 0 |
| mahrgell.mahrram 1.3 | 57.9% | 8 | 35 | 3 | 8.7 | 23 / 23 (100%) | 0 | 0 |
| sample.RamFire | 2.9% | 8 | 20 | 3 | 0.0 | - | 0 | 0 |
| stelo.MirrorNano 1.4 | 6.6% | 24 | 19 | 3 | 9.9 | 12 / 15 (80%) | 0 | 0 |
| stelo.MirrorMicro 1.1 | 14.6% | 12 | 11 | 3 | 11.8 | 20 / 23 (87%) | 0 | 0 |
| zyx.nano.RedBull 1.0 | 20.7% | 6 | 3 | 3 | 6.5 | 7 / 7 (100%) | 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 69.8% | 3 | 22 | 2 | 4.5 | 3 / 3 (100%) | 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 53.7% | 4 | 24 | 2 | 9.6 | 16 / 16 (100%) | 0 | 0 |
| mz.NanoDeath 2.56 | 51.8% | 3 | 4 | 2 | 8.5 | 9 / 9 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| bbo.RamboT 0.3 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| PSW.Relentless 0.1 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| mahrgell.mahrram 1.3 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| sample.RamFire | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| stelo.MirrorNano 1.4 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| stelo.MirrorMicro 1.1 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| zyx.nano.RedBull 1.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| mz.NanoDeath 2.56 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | vort.Chaser | 1 | 35 | 279 | 33.0% | 4.6% ± 4.8 | 44.1% | 16.9% / 16.2% | 1.7% | 0 / 0 | T?/M? | 93% |
| bbo.RamboT 0.3 | bbo.RamboT | 1 | 35 | 271 | 15.3% | 4.1% ± 2.6 | 42.5% | 24.3% / 26.9% | 12.1% | 0 / 0 | T1/M? | 96% |
| PSW.Relentless 0.1 | PSW.Relentless | 1 | 35 | 287 | 27.7% | 3.4% ± 5.7 | 41.4% | 27.9% / 28.0% | 3.2% | 0 / 0 | T?/M? | 96% |
| mahrgell.mahrram 1.3 | mahrgell.mahrram | 1 | 35 | 295 | 42.1% | 9.4% ± 3.4 | 44.0% | 13.5% / 11.7% | 4.1% | 0 / 0 | T?/M? | 77% |
| sample.RamFire | sample.RamFire | 1 | 35 | 279 | 100.0% | 2.7% ± 43.0 | 41.1% | 54.6% / 53.7% | 43.1% | 0 / 0 | T?/M? | 100% |
| stelo.MirrorNano 1.4 | stelo.MirrorNano | 1 | 35 | 295 | 7.6% | 8.6% ± 1.5 | 16.0% | 25.5% / 23.8% | 2.9% | 0 / 0 | T3/M? | 54% |
| stelo.MirrorMicro 1.1 | stelo.MirrorMicro | 1 | 35 | 299 | 9.0% | 10.2% ± 3.1 | 26.1% | 30.9% / 27.9% | 1.4% | 0 / 0 | T?/M? | 90% |
| zyx.nano.RedBull 1.0 | zyx.nano.RedBull | 1 | 35 | 295 | 10.1% | 2.7% ± 2.4 | 42.3% | 14.2% / 14.5% | 2.5% | 0 / 0 | T1/M? | 93% |
| bwbaugh.nano.Tirunculus 0.0.0a | bwbaugh.nano.Tirunculus | 1 | 35 | 329 | 90.4% | 8.7% ± 4.5 | 47.8% | 17.2% / 16.7% | 8.8% | 0 / 0 | T?/M? | 82% |
| demetrix.nano.SledgeHammer 0.22 | demetrix.nano.SledgeHammer | 1 | 35 | 337 | 61.0% | 12.9% ± 3.7 | 47.6% | 11.3% / 11.2% | 5.3% | 0 / 0 | T?/M? | 65% |
| mz.NanoDeath 2.56 | mz.NanoDeath | 1 | 34 | 281 | 62.9% | 13.1% ± 3.8 | 49.4% | 11.4% / 11.0% | 6.6% | 0 / 0 | T?/M? | 66% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Melee bench: sentry

hadur2.Hadur 3.5.1 against 2 opponents at once, 3 rounds per battle, 3 battles, 1000x1000, sentry border 100.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 83.3 | 6 / 8 | 1.38 | 53.2% | 959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.5.1 | 1.0 | 53.2% | 6 |
| sample.Tracker | 2.3 | 22.9% | 1 |
| sample.SpinBot | 2.7 | 23.9% | 2 |
| samplesentry.BorderGuard | 4.0 | 0.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 100.0 | 2 / 2 | 313 |
| 2 | 1 | 72.3 | 83.3 | 2 / 3 | 326 |
| 3 | 1 | 65.8 | 66.7 | 2 / 3 | 320 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sample.SpinBot | 4 | 75% |
| sample.Tracker | 3 | 100% |

Skipped turns: 8.

Sentry safety: 1 sentry bullets hit Hadur, 12 of Hadur's bullets hit a sentry.

Posture (Hadur's M records, 8 rounds): 0 melee ticks, 3286 duel ticks, 2192 focused-duel ticks; 6 rounds vetoed; 0 melee faults; longest scan gap 0 ticks; 0 ticks aimed at a dead robot; 11 shots at a sentry.

Sensing (8 rounds): longest scan gap while four or more were alive 0 ticks (0 rounds over 8); rounds whose longest gap at any count was over 8: 0; robots dropped as dead without a death event: 0.

Targeting waves (8 rounds): 0 sent, 0 reached their opponent, 0 virtual hits (0.0% of those reached).

## Melee bench: reference

hadur2.Hadur 3.5.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 50.6 | 55.6 | 1 / 105 | 5.00 | 9.9% | 5684 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 13.3% | 25 |
| darkcanuck.B26354 1.06 | 3.7 | 11.1% | 18 |
| gh.Griezel 0.5.4 | 5.3 | 10.4% | 18 |
| kawigi.mini.Coriantumr 1.1 | 5.3 | 10.4% | 7 |
| simonton.micro.Sprout 1.1.3 | 5.3 | 10.2% | 7 |
| abc.Tron 2.02 | 5.7 | 10.3% | 14 |
| hadur2.Hadur 3.5.1 | 6.0 | 9.9% | 1 |
| kawigi.sbf.FloodHT 0.9.2 | 6.3 | 10.1% | 8 |
| rz.HawkOnFire 0.1 | 6.3 | 10.0% | 7 |
| cx.mini.Cigaret 1.31 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 50.1 | 54.6 | 0 / 35 | 1810 |
| 2 | 7 | 50.5 | 54.3 | 0 / 35 | 1943 |
| 3 | 5 | 51.3 | 57.8 | 1 / 35 | 1931 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 5 | 0% |
| darkcanuck.B26354 1.06 | 4 | 0% |
| abc.Tron 2.02 | 3 | 0% |
| kawigi.mini.Coriantumr 1.1 | 3 | 33% |
| simonton.micro.Sprout 1.1.3 | 2 | 0% |
| gh.Griezel 0.5.4 | 1 | 0% |

Skipped turns: 45.

Posture (Hadur's M records, 104 rounds): 57757 melee ticks, 4266 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (104 rounds): longest scan gap while four or more were alive 41 ticks (103 rounds over 8); rounds whose longest gap at any count was over 8: 103; robots dropped as dead without a death event: 0.

Targeting waves (104 rounds): 20577 sent, 18186 reached their opponent, 2631 virtual hits (14.5% of those reached).

## Melee bench: handoff

hadur2.Hadur 3.5.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 49.6 | 54.8 | 3 / 105 | 5.07 | 9.5% | 4866 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 14.6% | 32 |
| abc.Shadow 3.84i | 2.3 | 13.6% | 19 |
| positive.Portia 1.26e | 2.7 | 12.1% | 20 |
| kawigi.mini.Coriantumr 1.1 | 5.3 | 9.7% | 4 |
| hadur2.Hadur 3.5.1 | 5.7 | 9.5% | 3 |
| rz.HawkOnFire 0.1 | 6.0 | 9.2% | 4 |
| darkcanuck.B26354 1.06 | 6.3 | 9.3% | 10 |
| kawigi.sbf.FloodHT 0.9.2 | 6.7 | 8.9% | 7 |
| simonton.micro.Sprout 1.1.3 | 9.3 | 6.3% | 1 |
| gh.Griezel 0.5.4 | 9.7 | 6.8% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 49.3 | 52.1 | 2 / 35 | 1721 |
| 2 | 6 | 48.5 | 54.9 | 0 / 35 | 1467 |
| 3 | 5 | 51.0 | 57.5 | 1 / 35 | 1678 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 5 | 20% |
| darkcanuck.B26354 1.06 | 4 | 50% |
| abc.Shadow 3.84i | 2 | 0% |
| positive.Portia 1.26e | 1 | 0% |
| gh.Griezel 0.5.4 | 1 | 0% |

Skipped turns: 74.

Posture (Hadur's M records, 105 rounds): 61123 melee ticks, 2956 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 84 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 84 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 21505 sent, 19189 reached their opponent, 2718 virtual hits (14.2% of those reached).

## Bench: hadur2.Hadur 3.5.1 (cold)

35 rounds x 3 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=4731449.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| abc.Shadow 3.84i | headline | 52.2% ± 15.1 | 65.3% ± 20.6 | 40.8% ± 9.5 | 69 / 105 | 9.6% ± 0.8 | 9.1% ± 1.1 | 19 | 0 | 2.19 / 34.1 |
| voidious.Diamond 1.8.28 | headline | 29.0% ± 25.3 | 18.8% ± 34.1 | 40.8% ± 19.1 | 23 / 105 | 6.6% ± 0.2 | 9.2% ± 2.3 | 48 | 0 | 3.81 / 78.4 |
| positive.Portia 1.26e | headline | 66.6% ± 10.1 | 78.1% ± 14.8 | 54.7% ± 5.3 | 82 / 105 | 10.8% ± 0.5 | 9.0% ± 3.3 | 78 | 0 | 2.70 / 240.1 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| abc.Shadow 3.84i | 5824 | 345 | 5759 | 5759 (98.9%) | 65 (1.1%) | 0 (0.0%) | 290 | 62 | 17 |
| voidious.Diamond 1.8.28 | 21284 | 847 | 22091 | 21215 (99.7%) | 69 (0.3%) | 876 (4.0%) | 1095 | 136 | 46 |
| positive.Portia 1.26e | 6509 | 3 | 6363 | 6363 (97.8%) | 146 (2.2%) | 0 (0.0%) | 310 | 53 | 32 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| abc.Shadow 3.84i | 6271 | 530 (8.5%) | 6159 |
| voidious.Diamond 1.8.28 | 21018 | 2325 (11.1%) | 20726 |
| positive.Portia 1.26e | 6698 | 706 (10.5%) | 5804 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| abc.Shadow 3.84i | 650 | 463 | 650 | 795 | 27.8 / 40.5 | 12 | 716 | 32 |
| voidious.Diamond 1.8.28 | 650 | 535 | 650 | 2383 | 21.8 / 32.3 | 0 | 82 | 24 |
| positive.Portia 1.26e | 650 | 509 | 650 | 838 | 34.1 / 28.3 | 104 | 1020 | 0 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| abc.Shadow 3.84i | 9.1% | 19 | 6050 | 3 | 53.7 | 529 / 530 (100%) | 0 | 0 |
| voidious.Diamond 1.8.28 | 9.2% | 48 | 39138 | 3 | 206.2 | 2319 / 2325 (100%) | 0 | 0 |
| positive.Portia 1.26e | 9.0% | 78 | 187 | 3 | 60.6 | 698 / 706 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| abc.Shadow 3.84i | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| voidious.Diamond 1.8.28 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| positive.Portia 1.26e | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| abc.Shadow 3.84i | abc.Shadow | 1 | 34 | 275 | 9.4% | 8.2% ± 1.3 | 9.2% | 21.5% / 21.1% | 7.9% | 0 / 0 | T3/M1 | 57% |
| voidious.Diamond 1.8.28 | voidious.Diamond | 1 | 35 | 301 | 9.4% | 8.3% ± 0.9 | 7.0% | 22.8% / 21.5% | 9.0% | 0 / 0 | T3/M1 | 18% |
| positive.Portia 1.26e | positive.Portia | 1 | 35 | 295 | 8.4% | 8.3% ± 1.2 | 10.5% | 25.8% / 25.8% | 6.5% | 0 / 0 | T3/M0 | 62% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

