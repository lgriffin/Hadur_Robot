# Bench: hadur2.Hadur 2.2 against the RoboRumble top 10 (cold)

The same ten opponents, jars and settings as [roborumble-top10.md](roborumble-top10.md) (Hadur 2.0 after S2) and [roborumble-top10-2.1.md](roborumble-top10-2.1.md) (2.1 after S4). Hadur 2.2 is master at 60b18fe: S5 aggression, S6 unhittable and S7. 35 rounds x 5 seeds (data wiped) per opponent on 800x600, Robocode 1.9.5.6 with the security manager on, Java 21.0.10. Run on 2026-09-27 as two benches of five opponents in parallel on the 4-core box, like the earlier runs; the two halves measured `robocode.cpu.constant` 3,097,089 and 3,371,394.

Reproduce with `cd hadur-bench && mvn exec:java -Dexec.args="--set roborumble-top10.txt"` after `mvn install -DskipTests` at the root and putting the ten jars in `opponents/`.

## Comparison across versions

Score share is Hadur's fraction of the two robots' total score, mean over five 35-round battles. The 95% intervals are in each report; single opponents move by 3 to 14 points between runs, so read the per-bot changes under about 8 points as noise.

| Opponent | 2.0 (S2) | 2.1 (S4) | 2.2 (S7) | Rounds won 2.0 / 2.1 / 2.2 |
|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 14.6% | 15.1% | 18.9% | 0 / 0 / 4 |
| jk.mega.DrussGT 3.1.16 | 25.5% | 34.6% | 39.1% | 18 / 38 / 50 |
| oog.mega.saguaro.Saguaro 1.0 | 1.7% | 77.0% | 73.2% | 0 / 161 / 150 |
| aaa.r.ScalarR 0.005h.053-noshield | 21.0% | 22.3% | 25.6% | 15 / 15 / 22 |
| voidious.Diamond 1.8.22 | 22.2% | 28.7% | 31.8% | 22 / 39 / 50 |
| cb.fire.Firestarter 2.0f | 35.2% | 34.8% | 46.4% | 30 / 26 / 56 |
| dsekercioglu.mega.Raven 3.56j8 | 52.9% | 49.8% | 58.0% | 116 / 108 / 127 |
| xander.cat.XanderCat 12.9 | 44.3% | 49.5% | 55.2% | 85 / 101 / 107 |
| lxx.Tomcat 3.68 | 44.2% | 43.8% | 56.6% | 88 / 88 / 119 |
| rsalesc.mega.Knight 0.6.28 | 37.6% | 40.1% | 46.5% | 45 / 52 / 67 |
| **Mean** | **29.9%** | **39.6%** | **45.1%** | **419 / 628 / 752** |
| Mean without Saguaro | 33.0% | 35.4% | 42.0% | |

- **2.2 beats every 2.0 score.** It is ahead of 2.1 on nine of ten (Saguaro is 3.8 points lower, inside the noise) and now wins more than half its rounds against Raven, XanderCat and Tomcat.
- **2.0 to 2.1 is mostly Saguaro.** The shield counter took it from 1.7% to 77.0%; without Saguaro the mean moved only 2.4 points (DrussGT +9.1 and Diamond +6.5 are the other gains). Cold runs start with no memory, so S3/S4's warm learning does not show here.
- **2.1 to 2.2 is broad.** S5 and S6 add 6.6 points without Saguaro, and the gain is largest against the mid-table: Tomcat +12.8, Firestarter +11.6, Raven +8.2, Knight +6.4, XanderCat +5.7. Their hit rate against Hadur fell from 9.2 to 11.7% (2.1) to 8.3 to 9.9% (2.2), while our hit rate barely moved, so the gain looks like movement (S6) and aggression (S5) rather than the gun; that split is inferred from the hit rates, not measured stage by stage.
- **The top four still dominate.** BeepBoop (18.9%), ScalarR (25.6%), Diamond (31.8%) and DrussGT (39.1%) remain the weakest; our hit rate against them is still 5.7 to 7.8%. The gun against strong surfers is the next thing to work on.
- **No faults** in any run. Skipped turns: 587 (2.0), 1,090 (2.1) and 513 (2.2) over 1,750 rounds. The 2.1 figure was on a busier host (237 against Firestarter), so it is not read as a regression.
- **Wave fidelity** holds at 99.9 to 100% matched in every matchup. Against Saguaro, false waves fell from 34.3% (2.0) to 0.1%, since Saguaro no longer spends its energy shooting down our bullets.

## Results (2.2)

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 18.9% ± 2.6 | 2.3% ± 3.0 | 40.6% ± 3.8 | 4 / 175 | 5.7% ± 0.4 | 9.3% ± 0.2 | 59 | 0 | 3.14 / 86.3 |
| jk.mega.DrussGT 3.1.16 | rumble-2 | 39.1% ± 8.1 | 27.5% ± 9.1 | 51.5% ± 5.7 | 50 / 175 | 7.8% ± 0.5 | 9.4% ± 0.3 | 68 | 0 | 2.22 / 55.3 |
| oog.mega.saguaro.Saguaro 1.0 | rumble-3 | 73.2% ± 3.6 | 85.7% ± 3.5 | 61.4% ± 3.1 | 150 / 175 | 20.4% ± 1.5 | 6.8% ± 0.6 | 12 | 0 | 2.75 / 31.3 |
| aaa.r.ScalarR 0.005h.053-noshield | rumble-4 | 25.6% ± 5.4 | 12.1% ± 7.6 | 40.9% ± 3.5 | 22 / 175 | 7.0% ± 0.5 | 9.9% ± 0.5 | 89 | 0 | 2.91 / 83.6 |
| voidious.Diamond 1.8.22 | rumble-5 | 31.8% ± 6.9 | 24.9% ± 8.1 | 39.7% ± 5.7 | 50 / 175 | 7.0% ± 0.5 | 8.8% ± 0.3 | 40 | 0 | 2.61 / 59.2 |
| cb.fire.Firestarter 2.0f | rumble-6 | 46.4% ± 13.9 | 32.0% ± 17.3 | 60.2% ± 9.9 | 56 / 175 | 9.8% ± 0.4 | 8.3% ± 0.5 | 59 | 0 | 2.19 / 77.9 |
| dsekercioglu.mega.Raven 3.56j8 | rumble-7 | 58.0% ± 7.0 | 72.6% ± 8.5 | 44.2% ± 4.8 | 127 / 175 | 9.6% ± 0.4 | 9.1% ± 0.9 | 33 | 0 | 1.51 / 47.5 |
| xander.cat.XanderCat 12.9 | rumble-8 | 55.2% ± 3.4 | 61.1% ± 6.4 | 50.0% ± 1.1 | 107 / 175 | 11.4% ± 0.1 | 8.6% ± 0.6 | 34 | 0 | 1.65 / 74.5 |
| lxx.Tomcat 3.68 | rumble-9 | 56.6% ± 7.4 | 67.0% ± 10.7 | 47.3% ± 4.8 | 119 / 175 | 9.1% ± 0.4 | 9.6% ± 0.6 | 51 | 0 | 2.81 / 45.1 |
| rsalesc.mega.Knight 0.6.28 | rumble-10 | 46.5% ± 5.4 | 38.3% ± 8.2 | 54.5% ± 2.4 | 67 / 175 | 9.5% ± 0.2 | 9.2% ± 0.3 | 68 | 0 | 3.20 / 46.3 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 39343 | 302 | 39574 | 39338 (100.0%) | 5 (0.0%) | 236 (0.6%) | 1781 | 218 | 94 |
| jk.mega.DrussGT 3.1.16 | 40392 | 9 | 40393 | 40390 (100.0%) | 2 (0.0%) | 3 (0.0%) | 2327 | 239 | 72 |
| oog.mega.saguaro.Saguaro 1.0 | 5713 | 18 | 5716 | 5711 (100.0%) | 2 (0.0%) | 5 (0.1%) | 374 | 102 | 12 |
| aaa.r.ScalarR 0.005h.053-noshield | 37362 | 16 | 38554 | 37360 (100.0%) | 2 (0.0%) | 1194 (3.1%) | 2118 | 350 | 62 |
| voidious.Diamond 1.8.22 | 36130 | 1342 | 37504 | 36115 (100.0%) | 15 (0.0%) | 1389 (3.7%) | 2074 | 221 | 34 |
| cb.fire.Firestarter 2.0f | 37289 | 1297 | 40787 | 37289 (100.0%) | 0 (0.0%) | 3498 (8.6%) | 3247 | 259 | 51 |
| dsekercioglu.mega.Raven 3.56j8 | 14016 | 68 | 14017 | 14015 (100.0%) | 1 (0.0%) | 2 (0.0%) | 797 | 189 | 29 |
| xander.cat.XanderCat 12.9 | 18146 | 6 | 18590 | 18144 (100.0%) | 2 (0.0%) | 446 (2.4%) | 1729 | 275 | 40 |
| lxx.Tomcat 3.68 | 23448 | 513 | 23478 | 23438 (100.0%) | 10 (0.0%) | 40 (0.2%) | 1481 | 166 | 41 |
| rsalesc.mega.Knight 0.6.28 | 41606 | 596 | 41604 | 41589 (100.0%) | 17 (0.0%) | 15 (0.0%) | 3100 | 303 | 110 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 38767 | 4410 (11.4%) | 37920 |
| jk.mega.DrussGT 3.1.16 | 39889 | 4798 (12.0%) | 39622 |
| oog.mega.saguaro.Saguaro 1.0 | 6663 | 505 (7.6%) | 6629 |
| aaa.r.ScalarR 0.005h.053-noshield | 37804 | 4557 (12.1%) | 36634 |
| voidious.Diamond 1.8.22 | 36248 | 3809 (10.5%) | 35317 |
| cb.fire.Firestarter 2.0f | 41961 | 3853 (9.2%) | 40449 |
| dsekercioglu.mega.Raven 3.56j8 | 14875 | 1500 (10.1%) | 13765 |
| xander.cat.XanderCat 12.9 | 21403 | 1973 (9.2%) | 18767 |
| lxx.Tomcat 3.68 | 23974 | 2860 (11.9%) | 23274 |
| rsalesc.mega.Knight 0.6.28 | 41300 | 4862 (11.8%) | 40914 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 543 | 650 | 2589 | 20.4 / 29.8 | 0 | 14 | 0 |
| jk.mega.DrussGT 3.1.16 | 650 | 521 | 650 | 2676 | 30.3 / 28.4 | 0 | 467 | 67 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 441 | 425 | 530 | 43.8 / 27.5 | 16 | 2806 | 417 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 487 | 650 | 2545 | 23.7 / 34.1 | 0 | 415 | 1 |
| voidious.Diamond 1.8.22 | 650 | 541 | 650 | 2443 | 22.4 / 34.1 | 0 | 282 | 61 |
| cb.fire.Firestarter 2.0f | 650 | 557 | 650 | 2809 | 36.9 / 24.5 | 0 | 543 | 65 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 456 | 650 | 1066 | 28.8 / 36.4 | 0 | 880 | 1391 |
| xander.cat.XanderCat 12.9 | 650 | 450 | 650 | 1488 | 34.0 / 33.9 | 0 | 1208 | 210 |
| lxx.Tomcat 3.68 | 650 | 520 | 650 | 1662 | 30.5 / 34.1 | 0 | 506 | 18 |
| rsalesc.mega.Knight 0.6.28 | 650 | 511 | 650 | 2768 | 34.4 / 28.7 | 0 | 478 | 49 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 9.3% | 59 | 1145 | 3 | 225.0 | 4409 / 4410 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 9.4% | 68 | 1195 | 3 | 228.8 | 4798 / 4798 (100%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 6.8% | 12 | 175 | 3 | 32.6 | 504 / 505 (100%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 9.9% | 89 | 1597 | 3 | 219.7 | 4554 / 4557 (100%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 8.8% | 40 | 1080 | 3 | 212.4 | 3797 / 3809 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 8.3% | 59 | 1113 | 3 | 231.6 | 3847 / 3853 (100%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 9.1% | 33 | 399 | 3 | 79.9 | 1493 / 1500 (100%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 8.6% | 34 | 479 | 3 | 105.8 | 1971 / 1973 (100%) | 0 | 0 |
| lxx.Tomcat 3.68 | 9.6% | 51 | 751 | 3 | 133.7 | 2859 / 2860 (100%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 9.2% | 68 | 1365 | 3 | 236.0 | 4861 / 4862 (100%) | 0 | 0 |

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
| kc.mega.BeepBoop 2.0 | kc.mega.BeepBoop | 1 | 35 | 23695 | 9.6% | 8.4% ± 1.0 | 5.8% | 21.0% / 21.3% | 0.1% | 600 / 300 | T3/M1 | 18% |
| jk.mega.DrussGT 3.1.16 | jk.mega.DrussGT | 1 | 35 | 23697 | 10.0% | 8.2% ± 0.9 | 7.2% | 23.9% / 22.9% | 1.7% | 600 / 300 | T3/M1 | 30% |
| oog.mega.saguaro.Saguaro 1.0 | oog.mega.saguaro.Saguaro | 1 | 35 | 18085 | 8.0% | 7.8% ± 1.7 | 15.1% | 27.3% / 27.6% | 11.9% | 600 / 83 | T3/M0 | 73% |
| aaa.r.ScalarR 0.005h.053-noshield | aaa.r.ScalarR | 1 | 35 | 23715 | 10.0% | 8.0% ± 1.1 | 7.1% | 23.8% / 20.8% | 0.1% | 600 / 300 | T3/M1 | 23% |
| voidious.Diamond 1.8.22 | voidious.Diamond | 1 | 35 | 23701 | 8.3% | 7.3% ± 1.1 | 7.6% | 23.6% / 20.4% | 9.5% | 600 / 300 | T3/M1 | 34% |
| cb.fire.Firestarter 2.0f | cb.fire.Firestarter | 1 | 35 | 23709 | 9.1% | 8.1% ± 1.1 | 10.2% | 21.1% / 21.2% | 3.2% | 600 / 300 | T3/M1 | 56% |
| dsekercioglu.mega.Raven 3.56j8 | dsekercioglu.mega.Raven | 1 | 35 | 22871 | 9.0% | 7.5% ± 1.0 | 9.3% | 22.2% / 19.8% | 12.0% | 600 / 267 | T3/M1 | 56% |
| xander.cat.XanderCat 12.9 | xander.cat.XanderCat | 1 | 35 | 23713 | 10.9% | 7.9% ± 0.9 | 11.5% | 23.3% / 22.2% | 8.6% | 600 / 300 | T3/M1 | 52% |
| lxx.Tomcat 3.68 | lxx.Tomcat | 1 | 35 | 23673 | 9.8% | 8.9% ± 1.2 | 9.0% | 23.7% / 22.4% | 9.1% | 600 / 300 | T3/M1 | 59% |
| rsalesc.mega.Knight 0.6.28 | rsalesc.mega.Knight | 1 | 35 | 23713 | 9.0% | 7.2% ± 0.9 | 9.8% | 24.0% / 20.9% | 12.2% | 600 / 300 | T3/M1 | 42% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

