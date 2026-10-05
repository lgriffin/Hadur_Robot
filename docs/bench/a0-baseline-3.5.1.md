# Bench suite: arch-gates.txt

## Bench: hadur2.Hadur 3.5.1 (cold)

35 rounds x 5 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=4246848.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sample.SpinBot | sanity | 99.7% ± 0.6 | 100.0% ± 0.0 | 99.4% ± 1.2 | 175 / 175 | 40.7% ± 1.3 | 1.9% ± 4.9 | 20 | 0 | 1.09 / 68.7 |
| sample.Tracker | sanity | 100.0% ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.1 | 175 / 175 | 79.3% ± 1.5 | 0.2% ± 0.6 | 3 | 0 | 0.93 / 49.4 |
| sample.Crazy | sanity | 99.0% ± 0.5 | 100.0% ± 0.0 | 98.2% ± 0.9 | 175 / 175 | 23.1% ± 1.7 | 8.1% ± 5.2 | 51 | 0 | 1.45 / 129.6 |
| sample.Walls | sanity | 98.1% ± 2.0 | 97.7% ± 3.0 | 98.2% ± 1.5 | 171 / 175 | 36.1% ± 1.7 | 4.8% ± 6.2 | 33 | 0 | 1.23 / 195.3 |
| sample.RamFire | sanity | 99.5% ± 0.7 | 100.0% ± 0.0 | 99.4% ± 0.9 | 175 / 175 | 69.4% ± 1.5 | 2.0% ± 2.4 | 11 | 0 | 1.27 / 73.2 |
| abc.Shadow 3.83c | headline | 53.8% ± 4.4 | 66.9% ± 6.9 | 41.7% ± 3.5 | 117 / 175 | 9.2% ± 0.6 | 8.3% ± 0.6 | 34 | 0 | 2.30 / 95.0 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| sample.SpinBot | 681 | 6 | 640 | 640 (94.0%) | 41 (6.0%) | 0 (0.0%) | 135 | 21 | 15 |
| sample.Tracker | 142 | 3 | 142 | 142 (100.0%) | 0 (0.0%) | 0 (0.0%) | 1 | 5 | 9 |
| sample.Crazy | 858 | 5 | 800 | 797 (92.9%) | 61 (7.1%) | 3 (0.4%) | 981 | 19 | 22 |
| sample.Walls | 885 | 4 | 770 | 770 (87.0%) | 115 (13.0%) | 0 (0.0%) | 30 | 11 | 20 |
| sample.RamFire | 10 | 1 | 9 | 9 (90.0%) | 1 (10.0%) | 0 (0.0%) | 98 | 7 | 13 |
| abc.Shadow 3.83c | 9563 | 622 | 9486 | 9485 (99.2%) | 78 (0.8%) | 1 (0.0%) | 435 | 95 | 26 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| sample.SpinBot | 2593 | 18 (0.7%) | 0 |
| sample.Tracker | 1668 | 3 (0.2%) | 0 |
| sample.Crazy | 5010 | 55 (1.1%) | 0 |
| sample.Walls | 3197 | 60 (1.9%) | 0 |
| sample.RamFire | 1752 | 0 (0.0%) | 0 |
| abc.Shadow 3.83c | 10528 | 881 (8.4%) | 7937 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| sample.SpinBot | 650 | 408 | 400 | 249 | 87.4 / 0.5 | 1655 | 748 | 173 |
| sample.Tracker | 650 | 280 | 400 | 165 | 97.6 / 0.0 | 643 | 338 | 23 |
| sample.Crazy | 650 | 457 | 485 | 450 | 80.0 / 1.5 | 2669 | 499 | 424 |
| sample.Walls | 650 | 441 | 400 | 306 | 90.3 / 1.6 | 2034 | 580 | 99 |
| sample.RamFire | 650 | 377 | 650 | 176 | 99.7 / 0.6 | 1110 | 17 | 0 |
| abc.Shadow 3.83c | 650 | 467 | 650 | 786 | 27.1 / 37.8 | 18 | 1297 | 122 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| sample.SpinBot | 1.9% | 20 | 74 | 3 | 3.7 | 15 / 18 (83%) | 0 | 0 |
| sample.Tracker | 0.2% | 3 | 62 | 2 | 0.8 | 3 / 3 (100%) | 0 | 0 |
| sample.Crazy | 8.1% | 51 | 100 | 3 | 4.6 | 47 / 55 (85%) | 0 | 0 |
| sample.Walls | 4.8% | 33 | 115 | 3 | 4.4 | 52 / 60 (87%) | 0 | 0 |
| sample.RamFire | 2.0% | 11 | 104 | 3 | 0.1 | - | 0 | 0 |
| abc.Shadow 3.83c | 8.3% | 34 | 231 | 3 | 54.0 | 877 / 881 (100%) | 0 | 0 |

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
| sample.SpinBot | sample.SpinBot | 1 | 35 | 279 | 0.8% | 0.5% ± 2.5 | 28.6% | 64.1% / 70.5% | 2.3% | 0 / 0 | T0/M? | 100% |
| sample.Tracker | sample.Tracker | 1 | 35 | 279 | 3.8% | 0.0% ± 9.2 | 44.7% | 43.6% / 44.5% | 53.3% | 0 / 0 | T?/M? | 100% |
| sample.Crazy | sample.Crazy | 1 | 35 | 271 | 9.6% | 6.3% ± 3.7 | 17.5% | 33.5% / 29.7% | 2.3% | 0 / 0 | T?/M0 | 98% |
| sample.Walls | sample.Walls | 1 | 35 | 271 | 2.3% | 0.5% ± 2.0 | 26.6% | 36.8% / 56.8% | 15.5% | 0 / 0 | T0/M? | 97% |
| sample.RamFire | sample.RamFire | 1 | 35 | 279 | 100.0% | 3.1% ± 27.9 | 40.8% | 53.7% / 53.3% | 40.7% | 0 / 0 | T?/M? | 99% |
| abc.Shadow 3.83c | abc.Shadow | 1 | 35 | 275 | 9.0% | 8.0% ± 1.3 | 8.7% | 20.3% / 20.0% | 8.0% | 0 / 0 | T3/M1 | 49% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Bench: hadur2.Hadur 3.5.1 (cold)

35 rounds x 1 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=4130572.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 14.6% | 0.0% | 34.4% | 0 / 35 | 5.8% | 11.8% | 30 | 0 | 4.73 / 128.9 |
| jk.mega.DrussGT 3.1.16 | rumble-3 | 36.5% | 22.9% | 51.9% | 8 / 35 | 7.8% | 9.3% | 25 | 0 | 3.79 / 134.6 |
| oog.mega.saguaro.Saguaro 1.0 | rumble-4 | 74.2% | 85.7% | 62.9% | 30 / 35 | 20.1% | 6.2% | 6 | 0 | 3.78 / 118.1 |
| aaa.r.ScalarR 0.005h.053-noshield | rumble-5 | 21.7% | 5.7% | 40.3% | 2 / 35 | 6.6% | 17.0% | 38 | 0 | 4.02 / 217.1 |
| voidious.Diamond 1.8.22 | rumble-6 | 34.8% | 29.4% | 41.5% | 11 / 35 | 6.8% | 10.7% | 30 | 0 | 3.96 / 187.9 |
| cb.fire.Firestarter 2.0f | rumble-7 | 37.6% | 20.0% | 57.1% | 7 / 35 | 8.2% | 8.2% | 38 | 0 | 3.77 / 105.0 |
| lxx.Tomcat 3.68 | rumble-8 | 51.7% | 61.8% | 43.1% | 22 / 35 | 9.8% | 12.4% | 54 | 0 | 4.31 / 216.1 |
| rsalesc.mega.Knight 0.6.28 | rumble-9 | 42.3% | 31.4% | 53.1% | 11 / 35 | 10.0% | 9.8% | 41 | 0 | 5.04 / 317.3 |
| dsekercioglu.mega.Raven 3.56j8 | rumble-10 | 66.9% | 85.7% | 47.8% | 30 / 35 | 9.8% | 8.6% | 9 | 0 | 2.80 / 106.9 |
| xander.cat.XanderCat 12.9 | rumble-11 | 49.5% | 57.1% | 43.3% | 20 / 35 | 11.5% | 9.2% | 8 | 0 | 2.99 / 77.1 |
| aw.Gilgalad 1.99.5c | rumble-12 | 39.8% | 41.2% | 39.0% | 15 / 35 | 8.1% | 9.8% | 11 | 0 | 3.51 / 58.5 |
| pc.Wavelet 1.5 | rumble-13 | 51.3% | 34.3% | 66.4% | 12 / 35 | 10.8% | 18.9% | 29 | 0 | 5.79 / 77.7 |
| kc.serpent.WaveSerpent 2.11 | rumble-14 | 65.7% | 82.4% | 48.1% | 29 / 35 | 9.2% | 6.6% | 6 | 0 | 4.58 / 91.2 |
| gh.GresSuffurd 0.4.13 | rumble-15 | 58.1% | 68.6% | 48.2% | 24 / 35 | 11.1% | 13.0% | 40 | 0 | 2.33 / 211.9 |
| dsekercioglu.mega.WhiteFang 2.8.1 | rumble-16 | 65.9% | 77.1% | 54.8% | 27 / 35 | 10.4% | 15.3% | 34 | 0 | 2.82 / 313.7 |
| cs.Nene 1.0.5 | rumble-17 | 63.1% | 80.0% | 45.6% | 28 / 35 | 8.9% | 6.9% | 10 | 0 | 3.38 / 108.8 |
| jk.melee.Neuromancer 7.12 | rumble-18 | 47.7% | 37.1% | 57.3% | 13 / 35 | 10.2% | 10.9% | 60 | 0 | 3.70 / 95.2 |
| voidious.Dookious 1.573c | rumble-19 | 74.2% | 91.4% | 54.3% | 32 / 35 | 9.0% | 6.2% | 8 | 0 | 2.94 / 95.2 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 7539 | 65 | 7581 | 7498 (99.5%) | 41 (0.5%) | 83 (1.1%) | 351 | 38 | 29 |
| jk.mega.DrussGT 3.1.16 | 8248 | 2 | 8243 | 8243 (99.9%) | 5 (0.1%) | 0 (0.0%) | 478 | 50 | 33 |
| oog.mega.saguaro.Saguaro 1.0 | 1157 | 3 | 1157 | 1157 (100.0%) | 0 (0.0%) | 0 (0.0%) | 73 | 23 | 2 |
| aaa.r.ScalarR 0.005h.053-noshield | 7261 | 4 | 7348 | 7180 (98.9%) | 81 (1.1%) | 168 (2.3%) | 376 | 88 | 33 |
| voidious.Diamond 1.8.22 | 8023 | 250 | 8306 | 7961 (99.2%) | 62 (0.8%) | 345 (4.2%) | 449 | 41 | 28 |
| cb.fire.Firestarter 2.0f | 7009 | 310 | 7809 | 6990 (99.7%) | 19 (0.3%) | 819 (10.5%) | 514 | 49 | 31 |
| lxx.Tomcat 3.68 | 4589 | 120 | 4528 | 4525 (98.6%) | 64 (1.4%) | 3 (0.1%) | 311 | 45 | 76 |
| rsalesc.mega.Knight 0.6.28 | 8401 | 136 | 8373 | 8373 (99.7%) | 28 (0.3%) | 0 (0.0%) | 633 | 64 | 36 |
| dsekercioglu.mega.Raven 3.56j8 | 2846 | 19 | 2846 | 2845 (100.0%) | 1 (0.0%) | 1 (0.0%) | 141 | 51 | 18 |
| xander.cat.XanderCat 12.9 | 3614 | 1 | 3735 | 3614 (100.0%) | 0 (0.0%) | 121 (3.2%) | 380 | 44 | 10 |
| aw.Gilgalad 1.99.5c | 4554 | 1 | 4639 | 4554 (100.0%) | 0 (0.0%) | 85 (1.8%) | 259 | 25 | 11 |
| pc.Wavelet 1.5 | 4879 | 0 | 4962 | 4810 (98.6%) | 69 (1.4%) | 152 (3.1%) | 403 | 38 | 20 |
| kc.serpent.WaveSerpent 2.11 | 1891 | 0 | 1891 | 1891 (100.0%) | 0 (0.0%) | 0 (0.0%) | 76 | 18 | 6 |
| gh.GresSuffurd 0.4.13 | 2509 | 3 | 2401 | 2401 (95.7%) | 108 (4.3%) | 0 (0.0%) | 133 | 34 | 14 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 2322 | 3 | 2217 | 2217 (95.5%) | 105 (4.5%) | 0 (0.0%) | 107 | 20 | 26 |
| cs.Nene 1.0.5 | 1783 | 11 | 1783 | 1783 (100.0%) | 0 (0.0%) | 0 (0.0%) | 68 | 18 | 11 |
| jk.melee.Neuromancer 7.12 | 5769 | 4 | 5697 | 5651 (98.0%) | 118 (2.0%) | 46 (0.8%) | 378 | 37 | 43 |
| voidious.Dookious 1.573c | 1737 | 2 | 1737 | 1737 (100.0%) | 0 (0.0%) | 0 (0.0%) | 55 | 16 | 9 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 7478 | 830 (11.1%) | 7228 |
| jk.mega.DrussGT 3.1.16 | 8113 | 959 (11.8%) | 8067 |
| oog.mega.saguaro.Saguaro 1.0 | 1288 | 108 (8.4%) | 1281 |
| aaa.r.ScalarR 0.005h.053-noshield | 7299 | 786 (10.8%) | 6842 |
| voidious.Diamond 1.8.22 | 8031 | 835 (10.4%) | 7864 |
| cb.fire.Firestarter 2.0f | 7953 | 752 (9.5%) | 7886 |
| lxx.Tomcat 3.68 | 4711 | 548 (11.6%) | 4638 |
| rsalesc.mega.Knight 0.6.28 | 8299 | 960 (11.6%) | 8222 |
| dsekercioglu.mega.Raven 3.56j8 | 2995 | 315 (10.5%) | 2882 |
| xander.cat.XanderCat 12.9 | 4327 | 369 (8.5%) | 3836 |
| aw.Gilgalad 1.99.5c | 4616 | 515 (11.2%) | 4527 |
| pc.Wavelet 1.5 | 5501 | 529 (9.6%) | 5220 |
| kc.serpent.WaveSerpent 2.11 | 2252 | 160 (7.1%) | 2208 |
| gh.GresSuffurd 0.4.13 | 2434 | 249 (10.2%) | 1890 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 2579 | 216 (8.4%) | 2441 |
| cs.Nene 1.0.5 | 1948 | 200 (10.3%) | 1931 |
| jk.melee.Neuromancer 7.12 | 5801 | 651 (11.2%) | 5662 |
| voidious.Dookious 1.573c | 2034 | 149 (7.3%) | 1672 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 541 | 650 | 2486 | 16.8 / 32.0 | 0 | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 650 | 524 | 650 | 2709 | 28.3 / 26.2 | 0 | 166 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 445 | 400 | 528 | 44.0 / 26.0 | 168 | 296 | 67 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 488 | 650 | 2474 | 23.3 / 34.6 | 0 | 0 | 0 |
| voidious.Diamond 1.8.22 | 650 | 543 | 650 | 2686 | 22.4 / 31.5 | 0 | 0 | 137 |
| cb.fire.Firestarter 2.0f | 650 | 539 | 650 | 2666 | 30.9 / 23.2 | 1 | 84 | 21 |
| lxx.Tomcat 3.68 | 650 | 520 | 650 | 1627 | 29.6 / 39.1 | 0 | 6 | 1 |
| rsalesc.mega.Knight 0.6.28 | 650 | 512 | 650 | 2774 | 33.1 / 29.2 | 45 | 55 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 453 | 650 | 1079 | 30.5 / 33.3 | 3 | 334 | 257 |
| xander.cat.XanderCat 12.9 | 650 | 455 | 650 | 1494 | 29.8 / 39.1 | 36 | 283 | 8 |
| aw.Gilgalad 1.99.5c | 650 | 511 | 650 | 1600 | 23.4 / 36.6 | 0 | 44 | 2 |
| pc.Wavelet 1.5 | 650 | 443 | 600 | 1953 | 45.6 / 23.1 | 72 | 38 | 1 |
| kc.serpent.WaveSerpent 2.11 | 650 | 477 | 650 | 852 | 27.4 / 29.6 | 0 | 390 | 1 |
| gh.GresSuffurd 0.4.13 | 650 | 467 | 650 | 961 | 32.1 / 34.5 | 29 | 253 | 48 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 650 | 472 | 650 | 955 | 34.7 / 28.6 | 14 | 237 | 29 |
| cs.Nene 1.0.5 | 650 | 482 | 650 | 732 | 26.7 / 31.9 | 0 | 293 | 246 |
| jk.melee.Neuromancer 7.12 | 650 | 535 | 650 | 1984 | 36.7 / 27.4 | 8 | 378 | 0 |
| voidious.Dookious 1.573c | 650 | 492 | 650 | 777 | 30.2 / 25.4 | 2 | 323 | 730 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 11.8% | 30 | 269 | 3 | 216.1 | 829 / 830 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 9.3% | 25 | 120 | 3 | 234.0 | 957 / 959 (100%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 6.2% | 6 | 31 | 2 | 32.0 | 107 / 108 (99%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 17.0% | 38 | 42 | 3 | 209.5 | 779 / 786 (99%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 10.7% | 30 | 62 | 3 | 235.7 | 831 / 835 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 8.2% | 38 | 105 | 3 | 221.6 | 747 / 752 (99%) | 0 | 0 |
| lxx.Tomcat 3.68 | 12.4% | 54 | 88 | 3 | 129.3 | 544 / 548 (99%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 9.8% | 41 | 47 | 3 | 237.0 | 958 / 960 (100%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 8.6% | 9 | 4390 | 3 | 80.7 | 315 / 315 (100%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 9.2% | 8 | 126 | 2 | 106.1 | 369 / 369 (100%) | 0 | 0 |
| aw.Gilgalad 1.99.5c | 9.8% | 11 | 340 | 2 | 131.8 | 515 / 515 (100%) | 0 | 0 |
| pc.Wavelet 1.5 | 18.9% | 29 | 101 | 3 | 135.5 | 524 / 529 (99%) | 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 6.6% | 6 | 29 | 3 | 53.1 | 160 / 160 (100%) | 0 | 0 |
| gh.GresSuffurd 0.4.13 | 13.0% | 40 | 549 | 3 | 64.5 | 244 / 249 (98%) | 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 15.3% | 34 | 47 | 3 | 63.3 | 214 / 216 (99%) | 0 | 0 |
| cs.Nene 1.0.5 | 6.9% | 10 | 158 | 2 | 50.9 | 200 / 200 (100%) | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 10.9% | 60 | 89 | 3 | 161.2 | 641 / 651 (98%) | 0 | 0 |
| voidious.Dookious 1.573c | 6.2% | 8 | 14 | 2 | 49.6 | 149 / 149 (100%) | 0 | 0 |

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
| kc.mega.BeepBoop 2.0 | kc.mega.BeepBoop | 1 | 35 | 295 | 9.6% | 8.1% ± 1.0 | 5.8% | 20.1% / 20.8% | 0.1% | 0 / 0 | T3/M1 | 15% |
| jk.mega.DrussGT 3.1.16 | jk.mega.DrussGT | 1 | 35 | 297 | 9.8% | 8.1% ± 1.0 | 7.4% | 23.3% / 22.4% | 1.7% | 0 / 0 | T3/M1 | 37% |
| oog.mega.saguaro.Saguaro 1.0 | oog.mega.saguaro.Saguaro | 1 | 34 | 327 | 7.9% | 7.5% ± 1.6 | 14.1% | 28.0% / 26.3% | 11.7% | 0 / 0 | T3/M0 | 75% |
| aaa.r.ScalarR 0.005h.053-noshield | aaa.r.ScalarR | 1 | 35 | 315 | 10.8% | 8.3% ± 1.1 | 6.7% | 23.3% / 22.1% | 0.1% | 0 / 0 | T3/M1 | 22% |
| voidious.Diamond 1.8.22 | voidious.Diamond | 1 | 35 | 301 | 8.3% | 7.3% ± 0.9 | 7.1% | 22.8% / 22.0% | 9.4% | 0 / 0 | T3/M1 | 33% |
| cb.fire.Firestarter 2.0f | cb.fire.Firestarter | 1 | 35 | 309 | 8.5% | 7.1% ± 1.0 | 8.6% | 19.6% / 21.7% | 3.2% | 0 / 0 | T3/M2 | 38% |
| lxx.Tomcat 3.68 | lxx.Tomcat | 1 | 35 | 273 | 10.3% | 9.0% ± 0.9 | 9.4% | 22.9% / 22.1% | 9.0% | 0 / 0 | T3/M1 | 51% |
| rsalesc.mega.Knight 0.6.28 | rsalesc.mega.Knight | 1 | 35 | 313 | 9.8% | 7.9% ± 0.9 | 9.4% | 24.0% / 21.0% | 12.4% | 0 / 0 | T3/M1 | 42% |
| dsekercioglu.mega.Raven 3.56j8 | dsekercioglu.mega.Raven | 1 | 35 | 329 | 8.9% | 7.4% ± 1.0 | 9.2% | 21.4% / 20.3% | 11.9% | 0 / 0 | T3/M1 | 66% |
| xander.cat.XanderCat 12.9 | xander.cat.XanderCat | 1 | 35 | 313 | 10.9% | 7.9% ± 0.9 | 11.2% | 23.0% / 22.1% | 9.1% | 0 / 0 | T3/M1 | 50% |
| aw.Gilgalad 1.99.5c | aw.Gilgalad | 1 | 35 | 283 | 9.7% | 8.2% ± 1.2 | 7.9% | 21.3% / 22.0% | 4.0% | 0 / 0 | T3/M1 | 38% |
| pc.Wavelet 1.5 | pc.Wavelet | 1 | 35 | 271 | 10.7% | 7.6% ± 1.1 | 10.4% | 21.9% / 22.3% | 9.9% | 0 / 0 | T3/M1 | 52% |
| kc.serpent.WaveSerpent 2.11 | kc.serpent.WaveSerpent | 1 | 35 | 321 | 7.6% | 6.8% ± 1.2 | 8.3% | 22.4% / 24.5% | 12.6% | 0 / 0 | T2/M2 | 65% |
| gh.GresSuffurd 0.4.13 | gh.GresSuffurd | 1 | 33 | 293 | 10.0% | 8.1% ± 1.2 | 11.1% | 23.4% / 21.8% | 12.0% | 0 / 0 | T3/M1 | 61% |
| dsekercioglu.mega.WhiteFang 2.8.1 | dsekercioglu.mega.WhiteFang | 1 | 35 | 343 | 7.8% | 6.6% ± 1.1 | 9.7% | 22.6% / 22.7% | 13.9% | 0 / 0 | T2/M1 | 67% |
| cs.Nene 1.0.5 | cs.Nene | 1 | 35 | 263 | 8.0% | 7.7% ± 1.3 | 8.8% | 25.5% / 24.9% | 8.5% | 0 / 0 | T3/M0 | 63% |
| jk.melee.Neuromancer 7.12 | jk.melee.Neuromancer | 1 | 35 | 313 | 9.7% | 8.3% ± 1.0 | 9.2% | 23.3% / 22.5% | 0.0% | 0 / 0 | T3/M1 | 48% |
| voidious.Dookious 1.573c | voidious.Dookious | 1 | 35 | 305 | 6.7% | 6.5% ± 1.2 | 9.1% | 23.1% / 23.7% | 13.0% | 0 / 0 | T2/M1 | 74% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Bench: hadur2.Hadur 3.5.1 (cold)

35 rounds x 1 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=4402238.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | rammer | 95.2% | 100.0% | 91.5% | 35 / 35 | 78.1% | 13.8% | 0 | 0 | 1.23 / 26.4 |
| bbo.RamboT 0.3 | rammer | 98.1% | 100.0% | 97.3% | 35 / 35 | 70.9% | 6.2% | 24 | 0 | 1.42 / 107.1 |
| PSW.Relentless 0.1 | rammer | 98.6% | 100.0% | 97.7% | 35 / 35 | 70.8% | 2.5% | 2 | 0 | 1.46 / 85.8 |
| mahrgell.mahrram 1.3 | rammer | 78.9% | 100.0% | 69.3% | 35 / 35 | 69.5% | 38.8% | 7 | 0 | 1.23 / 103.6 |
| sample.RamFire | rammer | 99.7% | 100.0% | 99.5% | 35 / 35 | 68.6% | 2.9% | 0 | 0 | 0.98 / 51.2 |
| stelo.MirrorNano 1.4 | mirror | 93.9% | 100.0% | 88.1% | 35 / 35 | 35.1% | 4.6% | 15 | 0 | 1.29 / 49.7 |
| stelo.MirrorMicro 1.1 | mirror | 92.8% | 100.0% | 86.4% | 35 / 35 | 36.8% | 12.7% | 9 | 0 | 1.59 / 261.9 |
| zyx.nano.RedBull 1.0 | nano | 90.7% | 97.1% | 87.7% | 34 / 35 | 82.0% | 26.5% | 34 | 0 | 1.35 / 39.6 |
| bwbaugh.nano.Tirunculus 0.0.0a | nano | 86.0% | 100.0% | 78.5% | 35 / 35 | 82.0% | 75.8% | 2 | 0 | 1.17 / 65.8 |
| demetrix.nano.SledgeHammer 0.22 | nano | 68.4% | 97.1% | 57.7% | 34 / 35 | 72.4% | 56.0% | 6 | 0 | 1.31 / 63.1 |
| mz.NanoDeath 2.56 | nano | 69.1% | 97.1% | 58.6% | 34 / 35 | 75.0% | 55.3% | 4 | 0 | 1.54 / 30.0 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 95 | 4 | 95 | 95 (100.0%) | 0 (0.0%) | 0 (0.0%) | 5 | 9 | 1 |
| bbo.RamboT 0.3 | 293 | 3 | 290 | 290 (99.0%) | 3 (1.0%) | 0 (0.0%) | 31 | 14 | 4 |
| PSW.Relentless 0.1 | 59 | 2 | 59 | 59 (100.0%) | 0 (0.0%) | 0 (0.0%) | 12 | 4 | 2 |
| mahrgell.mahrram 1.3 | 335 | 1 | 334 | 334 (99.7%) | 1 (0.3%) | 0 (0.0%) | 81 | 25 | 1 |
| sample.RamFire | 1 | 0 | 1 | 1 (100.0%) | 0 (0.0%) | 0 (0.0%) | 22 | 1 | 1 |
| stelo.MirrorNano 1.4 | 435 | 1 | 410 | 410 (94.3%) | 25 (5.7%) | 0 (0.0%) | 4 | 8 | 7 |
| stelo.MirrorMicro 1.1 | 488 | 2 | 417 | 416 (85.2%) | 72 (14.8%) | 1 (0.2%) | 2 | 10 | 6 |
| zyx.nano.RedBull 1.0 | 230 | 1 | 216 | 216 (93.9%) | 14 (6.1%) | 0 (0.0%) | 29 | 10 | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 171 | 1 | 171 | 171 (100.0%) | 0 (0.0%) | 0 (0.0%) | 38 | 12 | 2 |
| demetrix.nano.SledgeHammer 0.22 | 343 | 1 | 343 | 343 (100.0%) | 0 (0.0%) | 0 (0.0%) | 96 | 25 | 5 |
| mz.NanoDeath 2.56 | 314 | 1 | 314 | 314 (100.0%) | 0 (0.0%) | 0 (0.0%) | 102 | 14 | 3 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| vort.Chaser 0.0.3 | 259 | 1 (0.4%) | 0 |
| bbo.RamboT 0.3 | 259 | 13 (5.0%) | 0 |
| PSW.Relentless 0.1 | 290 | 0 (0.0%) | 0 |
| mahrgell.mahrram 1.3 | 314 | 22 (7.0%) | 52 |
| sample.RamFire | 349 | 0 (0.0%) | 0 |
| stelo.MirrorNano 1.4 | 463 | 30 (6.5%) | 0 |
| stelo.MirrorMicro 1.1 | 488 | 21 (4.3%) | 0 |
| zyx.nano.RedBull 1.0 | 230 | 5 (2.2%) | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 287 | 5 (1.7%) | 0 |
| demetrix.nano.SledgeHammer 0.22 | 345 | 20 (5.8%) | 0 |
| mz.NanoDeath 2.56 | 315 | 5 (1.6%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 650 | 196 | 400 | 135 | 96.3 / 8.9 | 217 | 274 | 18 |
| bbo.RamboT 0.3 | 650 | 259 | 400 | 140 | 90.3 / 2.5 | 235 | 219 | 0 |
| PSW.Relentless 0.1 | 650 | 251 | 400 | 150 | 95.3 / 2.3 | 240 | 125 | 17 |
| mahrgell.mahrram 1.3 | 650 | 176 | 650 | 161 | 104.4 / 46.3 | 279 | 289 | 3 |
| sample.RamFire | 650 | 373 | 650 | 176 | 99.7 / 0.5 | 230 | 14 | 0 |
| stelo.MirrorNano 1.4 | 650 | 486 | 400 | 226 | 67.5 / 9.1 | 324 | 387 | 140 |
| stelo.MirrorMicro 1.1 | 650 | 498 | 400 | 234 | 72.3 / 11.3 | 306 | 297 | 0 |
| zyx.nano.RedBull 1.0 | 650 | 179 | 400 | 124 | 87.5 / 12.3 | 182 | 288 | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 650 | 209 | 650 | 146 | 109.5 / 30.0 | 237 | 298 | 8 |
| demetrix.nano.SledgeHammer 0.22 | 650 | 147 | 650 | 175 | 117.5 / 86.3 | 311 | 223 | 1 |
| mz.NanoDeath 2.56 | 650 | 148 | 650 | 162 | 115.9 / 81.8 | 292 | 284 | 22 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 13.8% | 0 | 13 | 1 | 2.7 | 1 / 1 (100%) | 0 | 0 |
| bbo.RamboT 0.3 | 6.2% | 24 | 21 | 3 | 8.3 | 13 / 13 (100%) | 0 | 0 |
| PSW.Relentless 0.1 | 2.5% | 2 | 28 | 2 | 1.7 | - | 0 | 0 |
| mahrgell.mahrram 1.3 | 38.8% | 7 | 23 | 3 | 9.3 | 22 / 22 (100%) | 0 | 0 |
| sample.RamFire | 2.9% | 0 | 16 | 1 | 0.0 | - | 0 | 0 |
| stelo.MirrorNano 1.4 | 4.6% | 15 | 9 | 3 | 11.7 | 27 / 30 (90%) | 0 | 0 |
| stelo.MirrorMicro 1.1 | 12.7% | 9 | 41 | 3 | 11.9 | 18 / 21 (86%) | 0 | 0 |
| zyx.nano.RedBull 1.0 | 26.5% | 34 | 4 | 3 | 6.2 | 5 / 5 (100%) | 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 75.8% | 2 | 6 | 2 | 4.7 | 5 / 5 (100%) | 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 56.0% | 6 | 15 | 2 | 9.8 | 20 / 20 (100%) | 0 | 0 |
| mz.NanoDeath 2.56 | 55.3% | 4 | 67 | 2 | 8.9 | 5 / 5 (100%) | 0 | 0 |

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
| vort.Chaser 0.0.3 | vort.Chaser | 1 | 35 | 279 | 31.6% | 4.0% ± 4.7 | 45.2% | 15.6% / 15.9% | 2.0% | 0 / 0 | T?/M? | 93% |
| bbo.RamboT 0.3 | bbo.RamboT | 1 | 35 | 271 | 8.3% | 1.8% ± 1.8 | 40.9% | 27.4% / 30.1% | 9.4% | 0 / 0 | T0/M? | 98% |
| PSW.Relentless 0.1 | PSW.Relentless | 1 | 35 | 287 | 13.6% | 2.1% ± 5.6 | 40.7% | 26.9% / 26.8% | 2.0% | 0 / 0 | T?/M? | 98% |
| mahrgell.mahrram 1.3 | mahrgell.mahrram | 1 | 35 | 295 | 45.2% | 10.9% ± 3.5 | 42.9% | 13.8% / 14.0% | 3.9% | 0 / 0 | T?/M? | 76% |
| sample.RamFire | sample.RamFire | 1 | 35 | 279 | 100.0% | 2.7% ± 43.0 | 40.8% | 52.4% / 52.5% | 38.2% | 0 / 0 | T?/M? | 100% |
| stelo.MirrorNano 1.4 | stelo.MirrorNano | 1 | 35 | 295 | 5.9% | 8.0% ± 2.8 | 25.6% | 31.8% / 24.9% | 3.1% | 0 / 0 | T3/M? | 92% |
| stelo.MirrorMicro 1.1 | stelo.MirrorMicro | 1 | 35 | 299 | 8.2% | 9.4% ± 2.9 | 25.9% | 30.7% / 25.3% | 1.9% | 0 / 0 | T3/M? | 91% |
| zyx.nano.RedBull 1.0 | zyx.nano.RedBull | 1 | 35 | 295 | 14.4% | 2.7% ± 2.5 | 44.9% | 12.3% / 12.7% | 3.2% | 0 / 0 | T1/M? | 91% |
| bwbaugh.nano.Tirunculus 0.0.0a | bwbaugh.nano.Tirunculus | 1 | 35 | 329 | 90.1% | 8.8% ± 4.5 | 47.2% | 17.4% / 17.5% | 8.5% | 0 / 0 | T?/M? | 83% |
| demetrix.nano.SledgeHammer 0.22 | demetrix.nano.SledgeHammer | 1 | 35 | 337 | 63.8% | 13.7% ± 3.8 | 49.2% | 9.4% / 8.3% | 5.6% | 0 / 0 | T?/M? | 64% |
| mz.NanoDeath 2.56 | mz.NanoDeath | 1 | 35 | 281 | 66.2% | 12.3% ± 3.7 | 52.1% | 9.5% / 8.3% | 3.9% | 0 / 0 | T?/M? | 65% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Melee bench: sentry

hadur2.Hadur 3.5.1 against 2 opponents at once, 3 rounds per battle, 3 battles, 1000x1000, sentry border 100.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 66.7 | 5 / 9 | 1.67 | 47.4% | 975 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.5.1 | 1.3 | 47.4% | 5 |
| sample.Tracker | 2.0 | 29.0% | 3 |
| sample.SpinBot | 2.7 | 23.7% | 1 |
| samplesentry.BorderGuard | 4.0 | 0.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 56.5 | 50.0 | 1 / 3 | 251 |
| 2 | 1 | 72.5 | 83.3 | 2 / 3 | 404 |
| 3 | 1 | 65.8 | 66.7 | 2 / 3 | 320 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sample.SpinBot | 6 | 83% |
| sample.Tracker | 1 | 0% |

Skipped turns: 6.

Sentry safety: 1 sentry bullets hit Hadur, 10 of Hadur's bullets hit a sentry.

Posture (Hadur's M records, 9 rounds): 0 melee ticks, 3735 duel ticks, 2468 focused-duel ticks; 6 rounds vetoed; 0 melee faults; longest scan gap 0 ticks; 0 ticks aimed at a dead robot; 9 shots at a sentry.

Sensing (9 rounds): longest scan gap while four or more were alive 0 ticks (0 rounds over 8); rounds whose longest gap at any count was over 8: 0; robots dropped as dead without a death event: 0.

Targeting waves (9 rounds): 0 sent, 0 reached their opponent, 0 virtual hits (0.0% of those reached).

## Melee bench: reference

hadur2.Hadur 3.5.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.3 | 60.4 | 10 / 105 | 4.56 | 10.8% | 5807 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 13.0% | 18 |
| darkcanuck.B26354 1.06 | 3.0 | 11.9% | 24 |
| abc.Tron 2.02 | 4.0 | 11.0% | 14 |
| simonton.micro.Sprout 1.1.3 | 4.3 | 10.8% | 5 |
| hadur2.Hadur 3.5.1 | 5.0 | 10.8% | 10 |
| kawigi.mini.Coriantumr 1.1 | 6.3 | 10.1% | 5 |
| gh.Griezel 0.5.4 | 6.7 | 10.2% | 17 |
| rz.HawkOnFire 0.1 | 7.0 | 9.2% | 3 |
| kawigi.sbf.FloodHT 0.9.2 | 7.3 | 9.2% | 10 |
| cx.mini.Cigaret 1.31 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 52.1 | 57.8 | 2 / 35 | 2021 |
| 2 | 6 | 53.2 | 61.6 | 3 / 35 | 1734 |
| 3 | 3 | 54.7 | 61.9 | 5 / 35 | 2052 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 5 | 20% |
| gh.Griezel 0.5.4 | 5 | 40% |
| rz.Aleph 0.34 | 4 | 0% |
| simonton.micro.Sprout 1.1.3 | 4 | 100% |
| abc.Tron 2.02 | 4 | 25% |
| rz.HawkOnFire 0.1 | 3 | 67% |
| kawigi.sbf.FloodHT 0.9.2 | 2 | 0% |

Skipped turns: 35.

Posture (Hadur's M records, 105 rounds): 60633 melee ticks, 7623 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 56 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 21385 sent, 19034 reached their opponent, 2727 virtual hits (14.3% of those reached).

## Melee bench: handoff

hadur2.Hadur 3.5.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 51.5 | 57.6 | 6 / 105 | 4.82 | 10.2% | 5647 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.7 | 14.6% | 34 |
| abc.Shadow 3.84i | 2.0 | 13.1% | 18 |
| positive.Portia 1.26e | 2.3 | 12.9% | 24 |
| hadur2.Hadur 3.5.1 | 5.0 | 10.2% | 6 |
| darkcanuck.B26354 1.06 | 5.0 | 9.5% | 8 |
| kawigi.mini.Coriantumr 1.1 | 6.0 | 9.4% | 6 |
| rz.HawkOnFire 0.1 | 7.0 | 8.3% | 2 |
| kawigi.sbf.FloodHT 0.9.2 | 7.3 | 8.4% | 1 |
| simonton.micro.Sprout 1.1.3 | 8.7 | 7.2% | 3 |
| gh.Griezel 0.5.4 | 10.0 | 6.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 52.0 | 56.8 | 3 / 35 | 1969 |
| 2 | 4 | 53.8 | 63.2 | 3 / 35 | 1858 |
| 3 | 7 | 48.8 | 52.7 | 0 / 35 | 1820 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 10 | 10% |
| voidious.Diamond 1.8.28 | 4 | 50% |
| abc.Shadow 3.84i | 4 | 50% |
| gh.Griezel 0.5.4 | 2 | 50% |
| darkcanuck.B26354 1.06 | 1 | 0% |
| kawigi.sbf.FloodHT 0.9.2 | 1 | 0% |
| kawigi.mini.Coriantumr 1.1 | 1 | 0% |

Skipped turns: 42.

Posture (Hadur's M records, 105 rounds): 61562 melee ticks, 6679 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 45 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 45 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 21815 sent, 19458 reached their opponent, 2806 virtual hits (14.4% of those reached).

## Bench: hadur2.Hadur 3.5.1 (cold)

35 rounds x 3 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=4374713.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| abc.Shadow 3.84i | headline | 57.0% ± 12.5 | 72.2% ± 15.5 | 43.0% ± 9.2 | 76 / 105 | 9.2% ± 0.9 | 8.3% ± 2.3 | 20 | 0 | 2.18 / 66.0 |
| voidious.Diamond 1.8.28 | headline | 32.4% ± 10.7 | 23.1% ± 15.3 | 43.3% ± 8.9 | 25 / 105 | 7.0% ± 1.4 | 8.5% ± 0.7 | 60 | 0 | 3.99 / 209.2 |
| positive.Portia 1.26e | headline | 71.2% ± 5.1 | 85.7% ± 12.3 | 55.9% ± 5.6 | 90 / 105 | 10.5% ± 1.1 | 7.9% ± 2.1 | 27 | 0 | 2.29 / 56.9 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| abc.Shadow 3.84i | 5895 | 306 | 5884 | 5883 (99.8%) | 12 (0.2%) | 1 (0.0%) | 264 | 60 | 23 |
| voidious.Diamond 1.8.28 | 22318 | 830 | 22921 | 22234 (99.6%) | 84 (0.4%) | 687 (3.0%) | 1200 | 128 | 58 |
| positive.Portia 1.26e | 6275 | 6 | 6240 | 6240 (99.4%) | 35 (0.6%) | 0 (0.0%) | 253 | 57 | 24 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| abc.Shadow 3.84i | 6431 | 550 (8.6%) | 6104 |
| voidious.Diamond 1.8.28 | 22220 | 2389 (10.8%) | 21743 |
| positive.Portia 1.26e | 6514 | 656 (10.1%) | 5597 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| abc.Shadow 3.84i | 650 | 463 | 650 | 814 | 27.9 / 37.0 | 42 | 479 | 63 |
| voidious.Diamond 1.8.28 | 650 | 539 | 650 | 2495 | 23.3 / 30.5 | 0 | 201 | 74 |
| positive.Portia 1.26e | 650 | 506 | 650 | 820 | 34.6 / 27.3 | 27 | 1310 | 0 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| abc.Shadow 3.84i | 8.3% | 20 | 144 | 3 | 54.9 | 550 / 550 (100%) | 0 | 0 |
| voidious.Diamond 1.8.28 | 8.5% | 60 | 4339 | 3 | 215.8 | 2386 / 2389 (100%) | 0 | 0 |
| positive.Portia 1.26e | 7.9% | 27 | 102 | 3 | 59.3 | 655 / 656 (100%) | 0 | 0 |

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
| abc.Shadow 3.84i | abc.Shadow | 1 | 34 | 275 | 9.6% | 8.0% ± 1.3 | 8.7% | 20.5% / 21.2% | 8.2% | 0 / 0 | T3/M1 | 62% |
| voidious.Diamond 1.8.28 | voidious.Diamond | 1 | 35 | 301 | 8.5% | 7.4% ± 0.8 | 6.9% | 23.0% / 21.6% | 8.7% | 0 / 0 | T3/M1 | 31% |
| positive.Portia 1.26e | positive.Portia | 1 | 35 | 295 | 7.6% | 7.3% ± 1.2 | 10.1% | 24.3% / 24.6% | 6.5% | 0 / 0 | T3/M1 | 70% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

