# Bench: hadur2.Hadur 2.1 (after S4) against the RoboRumble top 10 (cold)

The same ten opponents, jars and settings as [roborumble-top10.md](roborumble-top10.md) (Hadur 2.0 after S2). Hadur 2.1 is master at 6ecfcd4: S3 opponent memory, S4 recognise and adapt, and the SHIELD-1/2 counter. Run on 2026-09-27 as two benches of five opponents in parallel on the 4-core box, like the 2.0 run; the two halves measured `robocode.cpu.constant` 3,345,360 and 2,879,388. The comparison with 2.0 and 2.2 is in [roborumble-top10-2.2.md](roborumble-top10-2.2.md).

Mean score share over the ten: **39.6%** (2.0: 29.9%). Hadur won 628 of 1,750 rounds.

35 rounds x 5 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 4 cores. robocode.cpu.constant=3345360.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 15.1% ± 1.1 | 0.0% ± 0.0 | 33.8% ± 2.1 | 0 / 175 | 5.8% ± 0.2 | 10.8% ± 0.3 | 75 | 0 | 3.11 / 162.6 |
| jk.mega.DrussGT 3.1.16 | rumble-2 | 34.6% ± 6.2 | 20.3% ± 7.8 | 49.1% ± 4.2 | 38 / 175 | 8.2% ± 0.5 | 10.7% ± 0.5 | 107 | 0 | 2.41 / 648.8 |
| oog.mega.saguaro.Saguaro 1.0 | rumble-3 | 77.0% ± 5.2 | 92.0% ± 4.6 | 62.8% ± 7.0 | 161 / 175 | 20.0% ± 1.8 | 6.6% ± 1.1 | 21 | 0 | 3.19 / 38.3 |
| aaa.r.ScalarR 0.005h.053-noshield | rumble-4 | 22.3% ± 5.7 | 8.1% ± 5.5 | 37.7% ± 5.4 | 15 / 175 | 7.2% ± 0.3 | 11.7% ± 0.4 | 100 | 0 | 2.67 / 135.0 |
| voidious.Diamond 1.8.22 | rumble-5 | 28.7% ± 7.5 | 20.2% ± 10.1 | 38.3% ± 4.9 | 39 / 175 | 7.1% ± 0.3 | 9.6% ± 0.4 | 54 | 0 | 2.53 / 62.2 |
| cb.fire.Firestarter 2.0f | rumble-6 | 34.8% ± 5.4 | 14.9% ± 6.8 | 55.7% ± 5.3 | 26 / 175 | 9.1% ± 0.5 | 9.2% ± 0.5 | 237 | 0 | 2.35 / 55.8 |
| dsekercioglu.mega.Raven 3.56j8 | rumble-7 | 49.8% ± 3.1 | 61.7% ± 5.4 | 39.4% ± 2.0 | 108 / 175 | 9.4% ± 1.1 | 9.6% ± 0.4 | 93 | 0 | 1.57 / 68.4 |
| xander.cat.XanderCat 12.9 | rumble-8 | 49.5% ± 7.0 | 57.7% ± 11.0 | 43.1% ± 4.0 | 101 / 175 | 11.5% ± 0.4 | 10.4% ± 0.7 | 70 | 0 | 1.59 / 49.9 |
| lxx.Tomcat 3.68 | rumble-9 | 43.8% ± 7.3 | 49.4% ± 9.4 | 39.7% ± 5.8 | 88 / 175 | 9.1% ± 0.6 | 10.8% ± 0.7 | 153 | 0 | 2.87 / 158.2 |
| rsalesc.mega.Knight 0.6.28 | rumble-10 | 40.1% ± 7.1 | 29.7% ± 9.2 | 50.2% ± 4.9 | 52 / 175 | 9.9% ± 0.6 | 10.9% ± 0.5 | 180 | 0 | 3.13 / 141.0 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 36082 | 340 | 36322 | 36079 (100.0%) | 3 (0.0%) | 243 (0.7%) | 1674 | 239 | 103 |
| jk.mega.DrussGT 3.1.16 | 39085 | 14 | 39088 | 39084 (100.0%) | 1 (0.0%) | 4 (0.0%) | 2207 | 284 | 95 |
| oog.mega.saguaro.Saguaro 1.0 | 7069 | 9 | 7072 | 7061 (99.9%) | 8 (0.1%) | 11 (0.2%) | 459 | 112 | 17 |
| aaa.r.ScalarR 0.005h.053-noshield | 34600 | 11 | 35146 | 34598 (100.0%) | 2 (0.0%) | 548 (1.6%) | 2029 | 344 | 108 |
| voidious.Diamond 1.8.22 | 35096 | 1449 | 36031 | 35083 (100.0%) | 13 (0.0%) | 948 (2.6%) | 2030 | 190 | 47 |
| cb.fire.Firestarter 2.0f | 40189 | 1635 | 43997 | 40184 (100.0%) | 5 (0.0%) | 3813 (8.7%) | 3410 | 297 | 242 |
| dsekercioglu.mega.Raven 3.56j8 | 13394 | 62 | 13392 | 13392 (100.0%) | 2 (0.0%) | 0 (0.0%) | 803 | 163 | 80 |
| xander.cat.XanderCat 12.9 | 12554 | 11 | 13032 | 12551 (100.0%) | 3 (0.0%) | 481 (3.7%) | 1162 | 208 | 51 |
| lxx.Tomcat 3.68 | 20900 | 793 | 20924 | 20888 (99.9%) | 12 (0.1%) | 36 (0.2%) | 1334 | 160 | 135 |
| rsalesc.mega.Knight 0.6.28 | 39400 | 591 | 39397 | 39386 (100.0%) | 14 (0.0%) | 11 (0.0%) | 3010 | 321 | 195 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 35776 | 3789 (10.6%) | 35231 |
| jk.mega.DrussGT 3.1.16 | 36805 | 4028 (10.9%) | 36688 |
| oog.mega.saguaro.Saguaro 1.0 | 7928 | 591 (7.5%) | 7895 |
| aaa.r.ScalarR 0.005h.053-noshield | 34979 | 3791 (10.8%) | 34282 |
| voidious.Diamond 1.8.22 | 35327 | 3386 (9.6%) | 34456 |
| cb.fire.Firestarter 2.0f | 45146 | 3859 (8.5%) | 44119 |
| dsekercioglu.mega.Raven 3.56j8 | 14177 | 1205 (8.5%) | 12516 |
| xander.cat.XanderCat 12.9 | 15733 | 1206 (7.7%) | 14320 |
| lxx.Tomcat 3.68 | 21348 | 2226 (10.4%) | 20349 |
| rsalesc.mega.Knight 0.6.28 | 38702 | 3879 (10.0%) | 36311 |

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
| kc.mega.BeepBoop 2.0 | kc.mega.BeepBoop | 1 | 35 | 23695 | 11.1% | 9.6% ± 1.2 | 6.0% | 21.6% / 20.5% | 0.0% | 600 / 300 | T3/M1 | 16% |
| jk.mega.DrussGT 3.1.16 | jk.mega.DrussGT | 1 | 33 | 23697 | 11.5% | 9.4% ± 1.0 | 7.6% | 23.0% / 22.8% | 1.7% | 600 / 300 | T3/M1 | 29% |
| oog.mega.saguaro.Saguaro 1.0 | oog.mega.saguaro.Saguaro | 1 | 35 | 18761 | 8.7% | 9.1% ± 1.7 | 13.3% | 27.4% / 27.3% | 12.2% | 600 / 109 | T3/M0 | 75% |
| aaa.r.ScalarR 0.005h.053-noshield | aaa.r.ScalarR | 1 | 35 | 23715 | 11.8% | 9.3% ± 1.3 | 7.5% | 23.5% / 21.9% | 0.0% | 600 / 300 | T3/M1 | 23% |
| voidious.Diamond 1.8.22 | voidious.Diamond | 1 | 35 | 23701 | 10.5% | 9.2% ± 1.0 | 7.1% | 22.8% / 22.3% | 9.4% | 600 / 300 | T3/M1 | 27% |
| cb.fire.Firestarter 2.0f | cb.fire.Firestarter | 1 | 35 | 23709 | 9.8% | 8.6% ± 0.9 | 9.2% | 20.7% / 20.6% | 3.0% | 600 / 300 | T3/M1 | 36% |
| dsekercioglu.mega.Raven 3.56j8 | dsekercioglu.mega.Raven | 1 | 35 | 23001 | 10.5% | 8.3% ± 1.1 | 9.9% | 21.7% / 20.7% | 12.4% | 600 / 272 | T3/M1 | 46% |
| xander.cat.XanderCat 12.9 | xander.cat.XanderCat | 1 | 35 | 22231 | 11.9% | 9.6% ± 1.4 | 10.8% | 23.4% / 22.6% | 8.7% | 600 / 243 | T3/M1 | 50% |
| lxx.Tomcat 3.68 | lxx.Tomcat | 1 | 35 | 23673 | 10.7% | 9.8% ± 0.9 | 9.5% | 23.4% / 22.1% | 9.1% | 600 / 300 | T3/M1 | 46% |
| rsalesc.mega.Knight 0.6.28 | rsalesc.mega.Knight | 1 | 34 | 23713 | 10.9% | 8.8% ± 1.0 | 10.0% | 24.3% / 20.2% | 12.9% | 600 / 300 | T3/M1 | 38% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

