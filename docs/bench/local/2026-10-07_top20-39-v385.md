# Bench: hadur2.Hadur 3.9 (cold)

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 4758 over 200 battles (23.8 per battle, most in one battle 56). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 26.2% ± 3.6 | 15.1% ± 4.2 | 41.2% ± 3.4 | 53 / 350 | 5.2% ± 0.2 | 9.0% ± 0.6 | 361 | 0 | 2.38 / 1400.1 |
| jk.mega.DrussGT 3.1.16 | rumble-3 | 47.5% ± 4.2 | 48.7% ± 7.0 | 46.2% ± 1.2 | 173 / 350 | 7.5% ± 0.3 | 10.3% ± 0.2 | 434 | 0 | 1.85 / 1392.9 |
| oog.mega.saguaro.Saguaro 1.0 | rumble-4 | 72.4% ± 2.6 | 83.4% ± 3.6 | 62.0% ± 2.9 | 292 / 350 | 18.5% ± 0.9 | 6.9% ± 0.5 | 101 | 0 | 2.11 / 1114.1 |
| aaa.r.ScalarR 0.005h.053-noshield | rumble-5 | 33.5% ± 3.1 | 27.4% ± 4.7 | 41.1% ± 1.7 | 96 / 350 | 6.9% ± 0.4 | 10.4% ± 0.4 | 345 | 0 | 1.90 / 85.2 |
| voidious.Diamond 1.8.22 | rumble-6 | 47.5% ± 4.4 | 54.9% ± 7.2 | 40.1% ± 1.9 | 192 / 350 | 6.8% ± 0.3 | 8.9% ± 0.2 | 325 | 0 | 1.80 / 244.6 |
| cb.fire.Firestarter 2.0f | rumble-7 | 51.0% ± 3.0 | 50.3% ± 4.4 | 51.9% ± 2.5 | 176 / 350 | 8.2% ± 0.4 | 8.4% ± 0.3 | 308 | 0 | 1.84 / 571.6 |
| dsekercioglu.mega.Raven 3.56j8 | rumble-8 | 55.1% ± 3.6 | 68.9% ± 5.5 | 40.5% ± 1.9 | 241 / 350 | 9.6% ± 0.2 | 8.8% ± 0.2 | 124 | 0 | 1.23 / 586.6 |
| xander.cat.XanderCat 12.9 | rumble-9 | 56.3% ± 4.8 | 62.6% ± 7.1 | 50.3% ± 2.9 | 219 / 350 | 11.6% ± 0.3 | 8.4% ± 0.5 | 200 | 0 | 1.27 / 859.0 |
| lxx.Tomcat 3.68 | rumble-10 | 54.2% ± 4.7 | 66.2% ± 8.1 | 42.3% ± 1.5 | 232 / 350 | 9.3% ± 0.5 | 10.3% ± 0.3 | 338 | 0 | 2.20 / 175.4 |
| rsalesc.mega.Knight 0.6.28 | rumble-11 | 53.4% ± 5.7 | 56.0% ± 9.5 | 50.5% ± 1.9 | 196 / 350 | 9.3% ± 0.4 | 9.8% ± 0.2 | 344 | 0 | 2.17 / 88.0 |
| aw.Gilgalad 1.99.5c | rumble-12 | 47.9% ± 3.8 | 57.1% ± 5.1 | 38.9% ± 2.7 | 200 / 350 | 9.0% ± 0.9 | 10.2% ± 0.4 | 289 | 0 | 1.53 / 20.7 |
| pc.Wavelet 1.5 | rumble-13 | 48.6% ± 3.5 | 47.1% ± 6.0 | 50.7% ± 2.1 | 165 / 350 | 9.9% ± 0.5 | 8.7% ± 0.5 | 145 | 0 | 1.94 / 220.5 |
| gh.GresSuffurd 0.4.13 | rumble-14 | 58.5% ± 3.3 | 69.9% ± 4.9 | 46.9% ± 2.0 | 245 / 350 | 11.0% ± 0.2 | 8.6% ± 0.4 | 189 | 0 | 1.09 / 103.5 |
| kc.serpent.WaveSerpent 2.11 | rumble-15 | 59.8% ± 3.5 | 75.1% ± 4.8 | 42.8% ± 1.6 | 263 / 350 | 9.1% ± 0.3 | 7.3% ± 0.5 | 127 | 0 | 2.21 / 59.4 |
| dsekercioglu.mega.WhiteFang 2.8.1 | rumble-17 | 68.9% ± 3.3 | 84.3% ± 4.2 | 51.5% ± 3.1 | 295 / 350 | 10.9% ± 0.2 | 7.6% ± 0.4 | 163 | 0 | 1.21 / 203.4 |
| cs.Nene 1.0.5 | rumble-18 | 57.4% ± 4.0 | 73.1% ± 5.4 | 41.0% ± 2.3 | 256 / 350 | 9.6% ± 0.3 | 7.8% ± 0.5 | 112 | 0 | 1.30 / 90.7 |
| jk.melee.Neuromancer 7.12 | rumble-19 | 50.3% ± 3.2 | 53.1% ± 6.3 | 48.0% ± 1.5 | 186 / 350 | 9.8% ± 0.4 | 9.7% ± 0.4 | 378 | 0 | 1.82 / 61.0 |
| voidious.Dookious 1.573c | rumble-20 | 61.2% ± 2.8 | 76.6% ± 4.2 | 43.9% ± 1.4 | 268 / 350 | 9.5% ± 0.3 | 7.0% ± 0.3 | 105 | 0 | 1.21 / 506.2 |
| davidalves.Phoenix 1.02 | rumble-21 | 58.0% ± 5.8 | 74.3% ± 8.1 | 41.8% ± 3.2 | 260 / 350 | 9.9% ± 0.5 | 8.2% ± 0.5 | 160 | 0 | 1.15 / 649.9 |
| rsalesc.roborio.Roborio 1.2.4 | rumble-22 | 62.8% ± 2.8 | 62.0% ± 4.4 | 62.5% ± 2.3 | 217 / 350 | 11.9% ± 0.3 | 8.8% ± 0.3 | 210 | 0 | 1.56 / 255.4 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 10 | 7 | 894 | 0 | 1.03 | 1 | 1 | 0 |
| jk.mega.DrussGT 3.1.16 | 10 | 1 | 2070 | 0 | 1.24 | 9 | 9 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 10 | 9 | 298 | 0 | 0.29 | 0 | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10 | 6 | 894 | 0 | 0.99 | 2 | 1 | 0 |
| voidious.Diamond 1.8.22 | 10 | 6 | 0 | 0 | 0.93 | 4 | 3 | 0 |
| cb.fire.Firestarter 2.0f | 10 | 9 | 45 | 0 | 0.88 | 0 | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 10 | 6 | 0 | 0 | 0.35 | 4 | 4 | 0 |
| xander.cat.XanderCat 12.9 | 10 | 9 | 298 | 0 | 0.57 | 0 | 0 | 10 |
| lxx.Tomcat 3.68 | 10 | 8 | 0 | 0 | 0.97 | 2 | 1 | 0 |
| rsalesc.mega.Knight 0.6.28 | 10 | 7 | 298 | 0 | 0.98 | 3 | 3 | 0 |
| aw.Gilgalad 1.99.5c | 10 | 8 | 74 | 0 | 0.83 | 2 | 2 | 0 |
| pc.Wavelet 1.5 | 10 | 4 | 0 | 0 | 0.41 | 6 | 6 | 0 |
| gh.GresSuffurd 0.4.13 | 10 | 8 | 0 | 0 | 0.54 | 2 | 2 | 0 |
| kc.serpent.WaveSerpent 2.11 | 10 | 10 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 10 | 9 | 298 | 0 | 0.47 | 0 | 0 | 0 |
| cs.Nene 1.0.5 | 10 | 10 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 10 | 6 | 776 | 0 | 1.08 | 1 | 1 | 0 |
| voidious.Dookious 1.573c | 10 | 8 | 0 | 0 | 0.30 | 2 | 2 | 0 |
| davidalves.Phoenix 1.02 | 10 | 8 | 298 | 1 | 0.46 | 1 | 1 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 10 | 6 | 0 | 0 | 0.60 | 4 | 4 | 0 |

145 of 200 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 46513 | 600 | 47937 | 46419 (99.8%) | 94 (0.2%) | 1518 (3.2%) | 2182 | 319 | 360 |
| jk.mega.DrussGT 3.1.16 | 93426 | 15 | 93267 | 93254 (99.8%) | 172 (0.2%) | 13 (0.0%) | 5856 | 669 | 478 |
| oog.mega.saguaro.Saguaro 1.0 | 12062 | 31 | 12042 | 12032 (99.8%) | 30 (0.2%) | 10 (0.1%) | 770 | 201 | 37 |
| aaa.r.ScalarR 0.005h.053-noshield | 76823 | 23 | 78739 | 76749 (99.9%) | 74 (0.1%) | 1990 (2.5%) | 4594 | 822 | 369 |
| voidious.Diamond 1.8.22 | 79335 | 1617 | 81824 | 79323 (100.0%) | 12 (0.0%) | 2501 (3.1%) | 5002 | 479 | 320 |
| cb.fire.Firestarter 2.0f | 82165 | 1840 | 95149 | 82119 (99.9%) | 46 (0.1%) | 13030 (13.7%) | 7274 | 639 | 307 |
| dsekercioglu.mega.Raven 3.56j8 | 30537 | 167 | 30534 | 30534 (100.0%) | 3 (0.0%) | 0 (0.0%) | 2271 | 360 | 80 |
| xander.cat.XanderCat 12.9 | 30503 | 10 | 31593 | 30477 (99.9%) | 26 (0.1%) | 1116 (3.5%) | 3354 | 398 | 148 |
| lxx.Tomcat 3.68 | 59693 | 1097 | 60068 | 59671 (100.0%) | 22 (0.0%) | 397 (0.7%) | 4984 | 518 | 280 |
| rsalesc.mega.Knight 0.6.28 | 90388 | 775 | 90362 | 90349 (100.0%) | 39 (0.0%) | 13 (0.0%) | 7279 | 725 | 290 |
| aw.Gilgalad 1.99.5c | 48660 | 19 | 49046 | 48651 (100.0%) | 9 (0.0%) | 395 (0.8%) | 3846 | 423 | 227 |
| pc.Wavelet 1.5 | 33701 | 13 | 34216 | 33698 (100.0%) | 3 (0.0%) | 518 (1.5%) | 2792 | 326 | 114 |
| gh.GresSuffurd 0.4.13 | 25833 | 21 | 25839 | 25833 (100.0%) | 0 (0.0%) | 6 (0.0%) | 1872 | 245 | 138 |
| kc.serpent.WaveSerpent 2.11 | 19292 | 12 | 19296 | 19292 (100.0%) | 0 (0.0%) | 4 (0.0%) | 1450 | 152 | 48 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 29084 | 17 | 29028 | 29024 (99.8%) | 60 (0.2%) | 4 (0.0%) | 2482 | 253 | 563 |
| cs.Nene 1.0.5 | 18687 | 142 | 18686 | 18685 (100.0%) | 2 (0.0%) | 1 (0.0%) | 1099 | 143 | 60 |
| jk.melee.Neuromancer 7.12 | 50767 | 17 | 51249 | 50715 (99.9%) | 52 (0.1%) | 534 (1.0%) | 4317 | 424 | 433 |
| voidious.Dookious 1.573c | 18551 | 18 | 18552 | 18551 (100.0%) | 0 (0.0%) | 1 (0.0%) | 1265 | 144 | 53 |
| davidalves.Phoenix 1.02 | 18518 | 10 | 18501 | 18496 (99.9%) | 22 (0.1%) | 5 (0.0%) | 1292 | 196 | 44 |
| rsalesc.roborio.Roborio 1.2.4 | 69900 | 19 | 69994 | 69898 (100.0%) | 2 (0.0%) | 96 (0.1%) | 7173 | 552 | 174 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 46775 | 5094 (10.9%) | 45763 |
| jk.mega.DrussGT 3.1.16 | 92254 | 11746 (12.7%) | 91314 |
| oog.mega.saguaro.Saguaro 1.0 | 13483 | 1094 (8.1%) | 13382 |
| aaa.r.ScalarR 0.005h.053-noshield | 77662 | 9227 (11.9%) | 75787 |
| voidious.Diamond 1.8.22 | 80640 | 8766 (10.9%) | 78918 |
| cb.fire.Firestarter 2.0f | 94635 | 8743 (9.2%) | 93124 |
| dsekercioglu.mega.Raven 3.56j8 | 32630 | 3231 (9.9%) | 29566 |
| xander.cat.XanderCat 12.9 | 39274 | 3222 (8.2%) | 37400 |
| lxx.Tomcat 3.68 | 61009 | 7006 (11.5%) | 59724 |
| rsalesc.mega.Knight 0.6.28 | 90956 | 10988 (12.1%) | 90146 |
| aw.Gilgalad 1.99.5c | 49891 | 5267 (10.6%) | 47432 |
| pc.Wavelet 1.5 | 39269 | 3736 (9.5%) | 37235 |
| gh.GresSuffurd 0.4.13 | 27209 | 2833 (10.4%) | 24879 |
| kc.serpent.WaveSerpent 2.11 | 25401 | 1841 (7.2%) | 20381 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 33558 | 3197 (9.5%) | 30555 |
| cs.Nene 1.0.5 | 20805 | 1969 (9.5%) | 17197 |
| jk.melee.Neuromancer 7.12 | 54142 | 5480 (10.1%) | 52205 |
| voidious.Dookious 1.573c | 22549 | 1776 (7.9%) | 19194 |
| davidalves.Phoenix 1.02 | 22817 | 1728 (7.6%) | 16445 |
| rsalesc.roborio.Roborio 1.2.4 | 78929 | 7292 (9.2%) | 78857 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 533 | 650 | 1623 | 19.8 / 28.4 | 0 | 1744 | 489 |
| jk.mega.DrussGT 3.1.16 | 650 | 515 | 650 | 3122 | 26.7 / 31.1 | 10 | 9189 | 892 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 451 | 515 | 540 | 44.1 / 26.8 | 1735 | 4323 | 897 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 484 | 650 | 2608 | 23.7 / 34.0 | 4 | 2461 | 2 |
| voidious.Diamond 1.8.22 | 650 | 537 | 650 | 2692 | 21.7 / 32.4 | 187 | 27035 | 332 |
| cb.fire.Firestarter 2.0f | 650 | 548 | 650 | 3115 | 29.0 / 26.8 | 260 | 10722 | 320 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 454 | 650 | 1156 | 23.5 / 34.6 | 301 | 24624 | 3265 |
| xander.cat.XanderCat 12.9 | 650 | 451 | 650 | 1393 | 33.2 / 32.8 | 478 | 3496 | 148 |
| lxx.Tomcat 3.68 | 650 | 511 | 650 | 2055 | 25.9 / 35.3 | 438 | 38636 | 83 |
| rsalesc.mega.Knight 0.6.28 | 650 | 509 | 645 | 3029 | 30.3 / 29.6 | 609 | 16163 | 81 |
| aw.Gilgalad 1.99.5c | 650 | 480 | 650 | 1697 | 23.2 / 36.2 | 558 | 38929 | 24 |
| pc.Wavelet 1.5 | 650 | 442 | 650 | 1401 | 31.3 / 30.4 | 419 | 6255 | 43 |
| gh.GresSuffurd 0.4.13 | 650 | 457 | 650 | 995 | 29.0 / 32.8 | 863 | 10933 | 247 |
| kc.serpent.WaveSerpent 2.11 | 650 | 481 | 648 | 909 | 23.6 / 31.7 | 300 | 17510 | 35 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 650 | 464 | 640 | 1178 | 29.2 / 27.5 | 480 | 33395 | 348 |
| cs.Nene 1.0.5 | 650 | 474 | 650 | 763 | 23.8 / 34.4 | 182 | 12817 | 3050 |
| jk.melee.Neuromancer 7.12 | 650 | 530 | 650 | 1838 | 30.8 / 33.4 | 403 | 21096 | 40 |
| voidious.Dookious 1.573c | 650 | 485 | 650 | 831 | 24.5 / 31.2 | 243 | 10015 | 5832 |
| davidalves.Phoenix 1.02 | 650 | 463 | 650 | 833 | 25.7 / 35.9 | 157 | 12238 | 163 |
| rsalesc.roborio.Roborio 1.2.4 | 650 | 504 | 650 | 2673 | 40.9 / 24.6 | 1547 | 13930 | 262 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 9.0% | 361 | 7779 | 3 | 135.9 | 5077 / 5094 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 10.3% | 434 | 355 | 3 | 260.8 | 11617 / 11746 (99%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 6.9% | 101 | 3704 | 3 | 34.3 | 1071 / 1094 (98%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10.4% | 345 | 9698 | 3 | 223.2 | 9200 / 9227 (100%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 9.0% | 325 | 1807 | 3 | 231.9 | 8752 / 8766 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 8.4% | 308 | 6097 | 3 | 270.8 | 8700 / 8743 (100%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 8.8% | 124 | 3733 | 3 | 86.4 | 3218 / 3231 (100%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 8.4% | 200 | 19169 | 3 | 90.0 | 3196 / 3222 (99%) | 0 | 0 |
| lxx.Tomcat 3.68 | 10.3% | 338 | 483 | 3 | 170.8 | 6995 / 7006 (100%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 9.8% | 344 | 9356 | 3 | 256.1 | 10982 / 10988 (100%) | 0 | 0 |
| aw.Gilgalad 1.99.5c | 10.2% | 289 | 5877 | 3 | 139.3 | 5261 / 5267 (100%) | 0 | 0 |
| pc.Wavelet 1.5 | 8.7% | 145 | 1999 | 3 | 95.8 | 3733 / 3736 (100%) | 0 | 0 |
| gh.GresSuffurd 0.4.13 | 8.6% | 189 | 2253 | 3 | 73.0 | 2831 / 2833 (100%) | 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 7.3% | 127 | 1534 | 3 | 55.0 | 1840 / 1841 (100%) | 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 7.6% | 163 | 192 | 3 | 82.5 | 3195 / 3197 (100%) | 0 | 0 |
| cs.Nene 1.0.5 | 7.8% | 112 | 2045 | 3 | 53.3 | 1960 / 1969 (100%) | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 9.7% | 378 | 20473 | 3 | 145.6 | 5459 / 5480 (100%) | 0 | 0 |
| voidious.Dookious 1.573c | 7.0% | 105 | 1702 | 3 | 52.5 | 1774 / 1776 (100%) | 0 | 0 |
| davidalves.Phoenix 1.02 | 8.2% | 160 | 2150 | 3 | 52.6 | 1727 / 1728 (100%) | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 8.8% | 210 | 41135 | 3 | 196.9 | 7289 / 7292 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| voidious.Diamond 1.8.22 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cb.fire.Firestarter 2.0f | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| xander.cat.XanderCat 12.9 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lxx.Tomcat 3.68 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| aw.Gilgalad 1.99.5c | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pc.Wavelet 1.5 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| gh.GresSuffurd 0.4.13 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cs.Nene 1.0.5 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jk.melee.Neuromancer 7.12 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| voidious.Dookious 1.573c | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.Phoenix 1.02 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | kc.mega.BeepBoop | 1 | 35 | 296 | 9.6% | 8.0% ± 1.1 | 5.7% | 20.8% / 20.7% | 0.4% | 0 / 0 | T3/M1 | 24% |
| jk.mega.DrussGT 3.1.16 | jk.mega.DrussGT | 1 | 35 | 298 | 10.7% | 8.6% ± 1.2 | 7.7% | 23.5% / 22.8% | 1.8% | 0 / 0 | T3/M1 | 48% |
| oog.mega.saguaro.Saguaro 1.0 | oog.mega.saguaro.Saguaro | 1 | 35 | 328 | 8.5% | 8.0% ± 1.5 | 12.4% | 25.4% / 26.0% | 10.1% | 0 / 0 | T3/M0 | 74% |
| aaa.r.ScalarR 0.005h.053-noshield | aaa.r.ScalarR | 1 | 35 | 316 | 10.6% | 8.0% ± 1.2 | 6.9% | 24.4% / 22.6% | 0.0% | 0 / 0 | T3/M1 | 28% |
| voidious.Diamond 1.8.22 | voidious.Diamond | 1 | 35 | 302 | 9.6% | 8.2% ± 0.9 | 7.4% | 22.8% / 21.2% | 9.4% | 0 / 0 | T3/M1 | 48% |
| cb.fire.Firestarter 2.0f | cb.fire.Firestarter | 1 | 35 | 310 | 7.8% | 6.4% ± 1.0 | 9.4% | 20.3% / 20.4% | 3.3% | 0 / 0 | T2/M1 | 54% |
| dsekercioglu.mega.Raven 3.56j8 | dsekercioglu.mega.Raven | 1 | 35 | 330 | 9.2% | 7.3% ± 1.0 | 10.2% | 21.6% / 21.2% | 11.4% | 0 / 0 | T3/M1 | 58% |
| xander.cat.XanderCat 12.9 | xander.cat.XanderCat | 1 | 35 | 314 | 9.6% | 7.4% ± 1.0 | 11.2% | 23.0% / 22.5% | 8.3% | 0 / 0 | T3/M1 | 56% |
| lxx.Tomcat 3.68 | lxx.Tomcat | 1 | 35 | 274 | 11.0% | 9.0% ± 1.0 | 10.7% | 23.8% / 21.5% | 8.7% | 0 / 0 | T3/M1 | 45% |
| rsalesc.mega.Knight 0.6.28 | rsalesc.mega.Knight | 1 | 35 | 314 | 10.2% | 8.0% ± 1.2 | 10.0% | 23.7% / 20.6% | 12.2% | 0 / 0 | T3/M1 | 58% |
| aw.Gilgalad 1.99.5c | aw.Gilgalad | 1 | 35 | 284 | 11.1% | 7.9% ± 0.8 | 11.7% | 22.4% / 21.8% | 4.9% | 0 / 0 | T3/M1 | 53% |
| pc.Wavelet 1.5 | pc.Wavelet | 1 | 35 | 272 | 10.3% | 7.5% ± 0.9 | 9.9% | 21.7% / 21.8% | 10.6% | 0 / 0 | T3/M1 | 45% |
| gh.GresSuffurd 0.4.13 | gh.GresSuffurd | 1 | 35 | 294 | 9.0% | 7.6% ± 1.1 | 10.9% | 24.1% / 22.4% | 12.9% | 0 / 0 | T3/M1 | 64% |
| kc.serpent.WaveSerpent 2.11 | kc.serpent.WaveSerpent | 1 | 35 | 322 | 6.9% | 6.2% ± 1.1 | 9.8% | 21.7% / 22.0% | 11.0% | 0 / 0 | T2/M1 | 70% |
| dsekercioglu.mega.WhiteFang 2.8.1 | dsekercioglu.mega.WhiteFang | 1 | 35 | 344 | 8.1% | 6.3% ± 0.9 | 11.0% | 22.1% / 20.7% | 13.2% | 0 / 0 | T2/M1 | 65% |
| cs.Nene 1.0.5 | cs.Nene | 1 | 35 | 264 | 8.4% | 7.6% ± 1.3 | 9.6% | 24.5% / 23.6% | 8.8% | 0 / 0 | T3/M1 | 60% |
| jk.melee.Neuromancer 7.12 | jk.melee.Neuromancer | 1 | 35 | 314 | 11.5% | 9.7% ± 1.2 | 10.3% | 23.6% / 22.2% | 0.0% | 0 / 0 | T3/M1 | 53% |
| voidious.Dookious 1.573c | voidious.Dookious | 1 | 35 | 306 | 7.3% | 6.7% ± 1.2 | 9.7% | 23.4% / 22.3% | 12.4% | 0 / 0 | T2/M1 | 61% |
| davidalves.Phoenix 1.02 | davidalves.Phoenix | 1 | 35 | 306 | 8.7% | 7.9% ± 1.4 | 10.4% | 21.1% / 22.7% | 5.8% | 0 / 0 | T3/M1 | 66% |
| rsalesc.roborio.Roborio 1.2.4 | rsalesc.roborio.Roborio | 1 | 35 | 328 | 9.4% | 7.3% ± 0.9 | 11.0% | 23.4% / 20.2% | 12.4% | 0 / 0 | T3/M1 | 59% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.9 vs hadur2.Hadur 3.8.5

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 26.2% ± 3.6 | 26.5% ± 3.3 | -0.4 ± 4.6 |
| jk.mega.DrussGT 3.1.16 | 47.5% ± 4.2 | 47.0% ± 3.5 | +0.5 ± 5.0 |
| oog.mega.saguaro.Saguaro 1.0 | 72.4% ± 2.6 | 70.6% ± 4.6 | +1.8 ± 4.3 |
| aaa.r.ScalarR 0.005h.053-noshield | 33.5% ± 3.1 | 31.6% ± 4.0 | +1.9 ± 6.1 |
| voidious.Diamond 1.8.22 | 47.5% ± 4.4 | 48.3% ± 4.0 | -0.7 ± 5.2 |
| cb.fire.Firestarter 2.0f | 51.0% ± 3.0 | 47.7% ± 3.1 | +3.3 ± 5.1 |
| dsekercioglu.mega.Raven 3.56j8 | 55.1% ± 3.6 | 54.1% ± 3.7 | +1.0 ± 5.5 |
| xander.cat.XanderCat 12.9 | 56.3% ± 4.8 | 56.1% ± 4.5 | +0.3 ± 5.3 |
| lxx.Tomcat 3.68 | 54.2% ± 4.7 | 53.6% ± 4.9 | +0.6 ± 6.5 |
| rsalesc.mega.Knight 0.6.28 | 53.4% ± 5.7 | 56.3% ± 4.1 | -2.9 ± 7.4 |
| aw.Gilgalad 1.99.5c | 47.9% ± 3.8 | 49.3% ± 5.1 | -1.3 ± 5.2 |
| pc.Wavelet 1.5 | 48.6% ± 3.5 | 46.9% ± 4.6 | +1.7 ± 6.4 |
| gh.GresSuffurd 0.4.13 | 58.5% ± 3.3 | 64.7% ± 3.4 | -6.2 ± 5.5 |
| kc.serpent.WaveSerpent 2.11 | 59.8% ± 3.5 | 57.3% ± 4.1 | +2.5 ± 6.7 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 68.9% ± 3.3 | 68.4% ± 3.5 | +0.6 ± 3.4 |
| cs.Nene 1.0.5 | 57.4% ± 4.0 | 63.2% ± 2.9 | -5.8 ± 3.6 |
| jk.melee.Neuromancer 7.12 | 50.3% ± 3.2 | 51.8% ± 1.3 | -1.5 ± 3.5 |
| voidious.Dookious 1.573c | 61.2% ± 2.8 | 61.2% ± 3.3 | -0.0 ± 4.6 |
| davidalves.Phoenix 1.02 | 58.0% ± 5.8 | 55.8% ± 3.2 | +2.2 ± 6.1 |
| rsalesc.roborio.Roborio 1.2.4 | 62.8% ± 2.8 | 60.2% ± 2.7 | +2.6 ± 4.4 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | -0.4 ± 4.6 | -0.3 ± 5.0 | -0.3 ± 5.0 | -0.7 ± 4.5 |
| jk.mega.DrussGT 3.1.16 | +0.5 ± 5.0 | +1.4 ± 9.1 | +1.4 ± 9.0 | -0.3 ± 1.3 |
| oog.mega.saguaro.Saguaro 1.0 | +1.8 ± 4.3 | +2.3 ± 5.3 | +2.3 ± 5.3 | +1.4 ± 4.9 |
| aaa.r.ScalarR 0.005h.053-noshield | +1.9 ± 6.1 | +2.8 ± 9.7 | +2.6 ± 9.5 | +1.0 ± 2.9 |
| voidious.Diamond 1.8.22 | -0.7 ± 5.2 | -1.1 ± 7.7 | -1.4 ± 7.4 | -0.0 ± 3.2 |
| cb.fire.Firestarter 2.0f | +3.3 ± 5.1 | +5.4 ± 8.4 | +5.4 ± 8.4 | +1.0 ± 2.5 |
| dsekercioglu.mega.Raven 3.56j8 | +1.0 ± 5.5 | +1.1 ± 8.0 | +1.1 ± 8.0 | +0.7 ± 3.1 |
| xander.cat.XanderCat 12.9 | +0.3 ± 5.3 | +0.1 ± 8.5 | -0.0 ± 8.5 | +0.3 ± 3.1 |
| lxx.Tomcat 3.68 | +0.6 ± 6.5 | +1.6 ± 10.8 | +1.4 ± 10.7 | -0.3 ± 2.7 |
| rsalesc.mega.Knight 0.6.28 | -2.9 ± 7.4 | -3.7 ± 11.7 | -3.7 ± 11.7 | -1.7 ± 3.2 |
| aw.Gilgalad 1.99.5c | -1.3 ± 5.2 | +0.6 ± 5.8 | +0.3 ± 6.0 | -3.6 ± 5.6 |
| pc.Wavelet 1.5 | +1.7 ± 6.4 | +2.9 ± 11.8 | +2.9 ± 11.8 | +0.2 ± 2.4 |
| gh.GresSuffurd 0.4.13 | -6.2 ± 5.5 | -7.9 ± 7.5 | -8.0 ± 7.5 | -4.0 ± 3.4 |
| kc.serpent.WaveSerpent 2.11 | +2.5 ± 6.7 | +2.9 ± 9.3 | +2.9 ± 9.3 | +1.6 ± 3.5 |
| dsekercioglu.mega.WhiteFang 2.8.1 | +0.6 ± 3.4 | +0.9 ± 4.3 | +0.9 ± 4.3 | -0.2 ± 3.3 |
| cs.Nene 1.0.5 | -5.8 ± 3.6 | -9.7 ± 4.4 | -9.7 ± 4.4 | -0.7 ± 3.4 |
| jk.melee.Neuromancer 7.12 | -1.5 ± 3.5 | -2.6 ± 7.8 | -2.9 ± 7.6 | -0.5 ± 1.7 |
| voidious.Dookious 1.573c | -0.0 ± 4.6 | +0.0 ± 6.9 | +0.0 ± 6.9 | +0.0 ± 2.0 |
| davidalves.Phoenix 1.02 | +2.2 ± 6.1 | +2.6 ± 9.4 | +2.6 ± 9.4 | +1.6 ± 2.9 |
| rsalesc.roborio.Roborio 1.2.4 | +2.6 ± 4.4 | +4.3 ± 6.5 | +4.3 ± 6.5 | +1.1 ± 3.6 |
| All pairs | +0.0 ± 1.0 | +0.2 ± 1.6 | +0.1 ± 1.6 | -0.2 ± 0.6 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 10 | 3 | -0.4 ± 4.6 | +1.2 ± 22.3 |
| jk.mega.DrussGT 3.1.16 | 10 | 1 | +0.5 ± 5.0 | +5.2 |
| oog.mega.saguaro.Saguaro 1.0 | 10 | 8 | +1.8 ± 4.3 | +1.7 ± 5.0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10 | 1 | +1.9 ± 6.1 | +3.3 |
| voidious.Diamond 1.8.22 | 10 | 4 | -0.7 ± 5.2 | -1.9 ± 4.0 |
| cb.fire.Firestarter 2.0f | 10 | 9 | +3.3 ± 5.1 | +3.2 ± 5.8 |
| dsekercioglu.mega.Raven 3.56j8 | 10 | 4 | +1.0 ± 5.5 | +1.7 ± 15.5 |
| xander.cat.XanderCat 12.9 | 10 | 6 | +0.3 ± 5.3 | -2.8 ± 8.4 |
| lxx.Tomcat 3.68 | 10 | 4 | +0.6 ± 6.5 | -3.0 ± 17.3 |
| rsalesc.mega.Knight 0.6.28 | 10 | 2 | -2.9 ± 7.4 | -7.9 ± 93.0 |
| aw.Gilgalad 1.99.5c | 10 | 4 | -1.3 ± 5.2 | -5.8 ± 6.8 |
| pc.Wavelet 1.5 | 10 | 3 | +1.7 ± 6.4 | -5.2 ± 20.6 |
| gh.GresSuffurd 0.4.13 | 10 | 6 | -6.2 ± 5.5 | -7.2 ± 9.2 |
| kc.serpent.WaveSerpent 2.11 | 10 | 7 | +2.5 ± 6.7 | +3.2 ± 8.8 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 10 | 7 | +0.6 ± 3.4 | +0.1 ± 5.3 |
| cs.Nene 1.0.5 | 10 | 10 | -5.8 ± 3.6 | -5.8 ± 3.6 |
| jk.melee.Neuromancer 7.12 | 10 | 5 | -1.5 ± 3.5 | +0.1 ± 8.4 |
| voidious.Dookious 1.573c | 10 | 8 | -0.0 ± 4.6 | -0.3 ± 6.1 |
| davidalves.Phoenix 1.02 | 10 | 5 | +2.2 ± 6.1 | +2.8 ± 12.3 |
| rsalesc.roborio.Roborio 1.2.4 | 10 | 3 | +2.6 ± 4.4 | +4.9 ± 8.3 |
| All pairs | 200 | 100 | +0.0 ± 1.0 | -0.8 ± 1.5 |

# Bench: hadur2.Hadur 3.9 baseline (hadur2.Hadur 3.8.5) (cold)

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 4585 over 200 battles (22.9 per battle, most in one battle 60). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 26.5% ± 3.3 | 15.4% ± 4.1 | 41.8% ± 2.4 | 54 / 350 | 5.2% ± 0.4 | 9.3% ± 0.5 | 375 | 0 | 2.36 / 1412.4 |
| jk.mega.DrussGT 3.1.16 | rumble-3 | 47.0% ± 3.5 | 47.4% ± 5.8 | 46.6% ± 1.4 | 168 / 350 | 7.4% ± 0.4 | 10.2% ± 0.5 | 409 | 0 | 1.83 / 1165.8 |
| oog.mega.saguaro.Saguaro 1.0 | rumble-4 | 70.6% ± 4.6 | 81.1% ± 6.0 | 60.6% ± 3.8 | 284 / 350 | 18.5% ± 1.4 | 7.0% ± 0.7 | 107 | 0 | 2.29 / 616.5 |
| aaa.r.ScalarR 0.005h.053-noshield | rumble-5 | 31.6% ± 4.0 | 24.6% ± 6.4 | 40.1% ± 2.0 | 87 / 350 | 6.7% ± 0.3 | 10.7% ± 0.5 | 337 | 0 | 1.88 / 57.0 |
| voidious.Diamond 1.8.22 | rumble-6 | 48.3% ± 4.0 | 56.0% ± 5.9 | 40.1% ± 2.3 | 197 / 350 | 6.7% ± 0.3 | 8.7% ± 0.2 | 318 | 0 | 1.78 / 42.7 |
| cb.fire.Firestarter 2.0f | rumble-7 | 47.7% ± 3.1 | 44.9% ± 5.5 | 51.0% ± 1.2 | 157 / 350 | 8.1% ± 0.2 | 8.7% ± 0.4 | 309 | 0 | 1.77 / 700.4 |
| dsekercioglu.mega.Raven 3.56j8 | rumble-8 | 54.1% ± 3.7 | 67.7% ± 5.9 | 39.8% ± 2.0 | 237 / 350 | 9.5% ± 0.4 | 9.0% ± 0.3 | 139 | 0 | 1.22 / 231.8 |
| xander.cat.XanderCat 12.9 | rumble-9 | 56.1% ± 4.5 | 62.5% ± 6.2 | 50.0% ± 3.3 | 219 / 350 | 11.5% ± 0.5 | 8.6% ± 0.5 | 166 | 0 | 1.26 / 894.6 |
| lxx.Tomcat 3.68 | rumble-10 | 53.6% ± 4.9 | 64.7% ± 8.0 | 42.7% ± 1.9 | 227 / 350 | 9.5% ± 0.3 | 10.3% ± 0.2 | 314 | 0 | 2.23 / 510.4 |
| rsalesc.mega.Knight 0.6.28 | rumble-11 | 56.3% ± 4.1 | 59.7% ± 5.7 | 52.2% ± 2.3 | 209 / 350 | 9.7% ± 0.4 | 9.8% ± 0.3 | 331 | 0 | 2.15 / 130.5 |
| aw.Gilgalad 1.99.5c | rumble-12 | 49.3% ± 5.1 | 56.6% ± 5.5 | 42.5% ± 5.7 | 199 / 350 | 9.7% ± 1.3 | 10.3% ± 0.6 | 210 | 0 | 1.52 / 45.8 |
| pc.Wavelet 1.5 | rumble-13 | 46.9% ± 4.6 | 44.3% ± 9.4 | 50.5% ± 2.3 | 155 / 350 | 9.8% ± 0.7 | 9.0% ± 0.5 | 174 | 0 | 1.84 / 50.5 |
| gh.GresSuffurd 0.4.13 | rumble-14 | 64.7% ± 3.4 | 77.9% ± 4.7 | 50.9% ± 2.2 | 273 / 350 | 11.2% ± 0.4 | 8.2% ± 0.3 | 168 | 0 | 1.09 / 20.4 |
| kc.serpent.WaveSerpent 2.11 | rumble-15 | 57.3% ± 4.1 | 72.3% ± 5.6 | 41.2% ± 2.6 | 253 / 350 | 9.1% ± 0.4 | 7.6% ± 0.3 | 87 | 0 | 2.22 / 54.8 |
| dsekercioglu.mega.WhiteFang 2.8.1 | rumble-17 | 68.4% ± 3.5 | 83.4% ± 4.2 | 51.7% ± 3.3 | 292 / 350 | 10.8% ± 0.2 | 7.6% ± 0.5 | 170 | 0 | 1.21 / 190.0 |
| cs.Nene 1.0.5 | rumble-18 | 63.2% ± 2.9 | 82.9% ± 4.4 | 41.7% ± 2.6 | 290 / 350 | 9.7% ± 0.4 | 7.4% ± 0.5 | 124 | 0 | 1.28 / 23.6 |
| jk.melee.Neuromancer 7.12 | rumble-19 | 51.8% ± 1.3 | 55.7% ± 2.5 | 48.5% ± 1.0 | 196 / 350 | 10.1% ± 0.2 | 10.2% ± 0.4 | 393 | 0 | 1.80 / 187.0 |
| voidious.Dookious 1.573c | rumble-20 | 61.2% ± 3.3 | 76.6% ± 4.6 | 43.9% ± 1.8 | 268 / 350 | 9.7% ± 0.4 | 7.0% ± 0.4 | 123 | 0 | 1.23 / 283.5 |
| davidalves.Phoenix 1.02 | rumble-21 | 55.8% ± 3.2 | 71.7% ± 5.3 | 40.1% ± 1.7 | 251 / 350 | 9.9% ± 0.4 | 8.1% ± 0.4 | 90 | 0 | 1.12 / 616.2 |
| rsalesc.roborio.Roborio 1.2.4 | rumble-22 | 60.2% ± 2.7 | 57.7% ± 3.8 | 61.4% ± 2.7 | 202 / 350 | 11.9% ± 0.5 | 9.2% ± 0.3 | 241 | 0 | 1.58 / 21.1 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 10 | 3 | 2198 | 0 | 1.07 | 0 | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 10 | 2 | 1629 | 0 | 1.17 | 7 | 7 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 10 | 9 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10 | 3 | 1788 | 0 | 0.96 | 2 | 2 | 0 |
| voidious.Diamond 1.8.22 | 10 | 6 | 298 | 0 | 0.91 | 3 | 3 | 0 |
| cb.fire.Firestarter 2.0f | 10 | 10 | 0 | 0 | 0.88 | 0 | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 10 | 8 | 0 | 0 | 0.40 | 2 | 1 | 0 |
| xander.cat.XanderCat 12.9 | 10 | 7 | 298 | 0 | 0.47 | 2 | 2 | 10 |
| lxx.Tomcat 3.68 | 10 | 6 | 0 | 0 | 0.90 | 4 | 4 | 0 |
| rsalesc.mega.Knight 0.6.28 | 10 | 4 | 0 | 0 | 0.95 | 6 | 6 | 0 |
| aw.Gilgalad 1.99.5c | 10 | 5 | 0 | 0 | 0.60 | 5 | 5 | 0 |
| pc.Wavelet 1.5 | 10 | 8 | 0 | 0 | 0.50 | 2 | 2 | 0 |
| gh.GresSuffurd 0.4.13 | 10 | 7 | 0 | 0 | 0.48 | 3 | 3 | 0 |
| kc.serpent.WaveSerpent 2.11 | 10 | 7 | 0 | 0 | 0.25 | 3 | 3 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 10 | 8 | 429 | 0 | 0.49 | 0 | 0 | 0 |
| cs.Nene 1.0.5 | 10 | 10 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 10 | 8 | 38 | 0 | 1.12 | 1 | 1 | 0 |
| voidious.Dookious 1.573c | 10 | 10 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| davidalves.Phoenix 1.02 | 10 | 7 | 0 | 0 | 0.26 | 3 | 3 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 10 | 5 | 298 | 0 | 0.69 | 4 | 4 | 0 |

133 of 200 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 46292 | 592 | 48065 | 46084 (99.6%) | 208 (0.4%) | 1981 (4.1%) | 2159 | 321 | 345 |
| jk.mega.DrussGT 3.1.16 | 88611 | 21 | 88493 | 88482 (99.9%) | 129 (0.1%) | 11 (0.0%) | 5546 | 621 | 402 |
| oog.mega.saguaro.Saguaro 1.0 | 11924 | 26 | 11913 | 11893 (99.7%) | 31 (0.3%) | 20 (0.2%) | 761 | 167 | 36 |
| aaa.r.ScalarR 0.005h.053-noshield | 67555 | 21 | 69417 | 67411 (99.8%) | 144 (0.2%) | 2006 (2.9%) | 3825 | 751 | 357 |
| voidious.Diamond 1.8.22 | 77673 | 1583 | 80583 | 77619 (99.9%) | 54 (0.1%) | 2964 (3.7%) | 4730 | 470 | 257 |
| cb.fire.Firestarter 2.0f | 80704 | 2043 | 92834 | 80528 (99.8%) | 176 (0.2%) | 12306 (13.3%) | 7110 | 638 | 1800 |
| dsekercioglu.mega.Raven 3.56j8 | 29769 | 148 | 29768 | 29765 (100.0%) | 4 (0.0%) | 3 (0.0%) | 2216 | 346 | 78 |
| xander.cat.XanderCat 12.9 | 29472 | 17 | 30616 | 29446 (99.9%) | 26 (0.1%) | 1170 (3.8%) | 3171 | 408 | 124 |
| lxx.Tomcat 3.68 | 59408 | 1140 | 59668 | 59345 (99.9%) | 63 (0.1%) | 323 (0.5%) | 4870 | 468 | 333 |
| rsalesc.mega.Knight 0.6.28 | 87423 | 752 | 87420 | 87399 (100.0%) | 24 (0.0%) | 21 (0.0%) | 7138 | 694 | 291 |
| aw.Gilgalad 1.99.5c | 42839 | 26 | 43201 | 42766 (99.8%) | 73 (0.2%) | 435 (1.0%) | 3127 | 450 | 944 |
| pc.Wavelet 1.5 | 33392 | 6 | 34020 | 33389 (100.0%) | 3 (0.0%) | 631 (1.9%) | 2758 | 321 | 96 |
| gh.GresSuffurd 0.4.13 | 25203 | 24 | 25205 | 25201 (100.0%) | 2 (0.0%) | 4 (0.0%) | 1780 | 262 | 102 |
| kc.serpent.WaveSerpent 2.11 | 19451 | 4 | 19455 | 19451 (100.0%) | 0 (0.0%) | 4 (0.0%) | 1456 | 169 | 42 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 28337 | 15 | 28303 | 28301 (99.9%) | 36 (0.1%) | 2 (0.0%) | 2308 | 203 | 96 |
| cs.Nene 1.0.5 | 19488 | 191 | 19489 | 19486 (100.0%) | 2 (0.0%) | 3 (0.0%) | 1216 | 155 | 51 |
| jk.melee.Neuromancer 7.12 | 52886 | 11 | 53497 | 52879 (100.0%) | 7 (0.0%) | 618 (1.2%) | 4461 | 488 | 354 |
| voidious.Dookious 1.573c | 18637 | 31 | 18636 | 18635 (100.0%) | 2 (0.0%) | 1 (0.0%) | 1305 | 121 | 51 |
| davidalves.Phoenix 1.02 | 18673 | 12 | 18674 | 18673 (100.0%) | 0 (0.0%) | 1 (0.0%) | 1382 | 181 | 40 |
| rsalesc.roborio.Roborio 1.2.4 | 68501 | 16 | 68543 | 68477 (100.0%) | 24 (0.0%) | 66 (0.1%) | 6864 | 527 | 210 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 46487 | 5090 (10.9%) | 44890 |
| jk.mega.DrussGT 3.1.16 | 87770 | 10924 (12.4%) | 87192 |
| oog.mega.saguaro.Saguaro 1.0 | 13588 | 1051 (7.7%) | 13492 |
| aaa.r.ScalarR 0.005h.053-noshield | 68614 | 8024 (11.7%) | 67508 |
| voidious.Diamond 1.8.22 | 78780 | 8439 (10.7%) | 77756 |
| cb.fire.Firestarter 2.0f | 93010 | 8491 (9.1%) | 89955 |
| dsekercioglu.mega.Raven 3.56j8 | 31839 | 3199 (10.0%) | 29637 |
| xander.cat.XanderCat 12.9 | 37843 | 3167 (8.4%) | 36319 |
| lxx.Tomcat 3.68 | 60620 | 7135 (11.8%) | 59023 |
| rsalesc.mega.Knight 0.6.28 | 87399 | 10442 (11.9%) | 85410 |
| aw.Gilgalad 1.99.5c | 43239 | 4368 (10.1%) | 41084 |
| pc.Wavelet 1.5 | 39246 | 3754 (9.6%) | 37123 |
| gh.GresSuffurd 0.4.13 | 26799 | 2760 (10.3%) | 25869 |
| kc.serpent.WaveSerpent 2.11 | 25375 | 1835 (7.2%) | 20470 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 32548 | 3076 (9.5%) | 30845 |
| cs.Nene 1.0.5 | 21941 | 2096 (9.6%) | 19585 |
| jk.melee.Neuromancer 7.12 | 56683 | 5724 (10.1%) | 54204 |
| voidious.Dookious 1.573c | 22824 | 1740 (7.6%) | 18054 |
| davidalves.Phoenix 1.02 | 22922 | 1792 (7.8%) | 16917 |
| rsalesc.roborio.Roborio 1.2.4 | 75945 | 7264 (9.6%) | 75526 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 533 | 650 | 1612 | 20.0 / 27.7 | 0 | 1352 | 523 |
| jk.mega.DrussGT 3.1.16 | 650 | 517 | 650 | 2957 | 26.7 / 30.7 | 93 | 11006 | 946 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 443 | 500 | 542 | 43.3 / 28.1 | 1609 | 4616 | 805 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 484 | 650 | 2326 | 22.6 / 33.7 | 0 | 2634 | 5 |
| voidious.Diamond 1.8.22 | 650 | 534 | 650 | 2627 | 21.3 / 31.8 | 183 | 23169 | 674 |
| cb.fire.Firestarter 2.0f | 650 | 546 | 650 | 3060 | 28.9 / 27.8 | 262 | 8426 | 388 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 452 | 650 | 1125 | 23.2 / 34.9 | 267 | 26768 | 3031 |
| xander.cat.XanderCat 12.9 | 650 | 452 | 650 | 1353 | 33.9 / 33.9 | 563 | 3220 | 147 |
| lxx.Tomcat 3.68 | 650 | 511 | 650 | 2050 | 26.4 / 35.4 | 344 | 41613 | 22 |
| rsalesc.mega.Knight 0.6.28 | 650 | 511 | 650 | 2944 | 32.0 / 29.3 | 719 | 15679 | 90 |
| aw.Gilgalad 1.99.5c | 650 | 470 | 650 | 1513 | 27.6 / 36.3 | 389 | 22435 | 102 |
| pc.Wavelet 1.5 | 650 | 441 | 625 | 1392 | 30.5 / 29.8 | 341 | 5218 | 19 |
| gh.GresSuffurd 0.4.13 | 650 | 459 | 650 | 984 | 31.0 / 29.9 | 903 | 12395 | 426 |
| kc.serpent.WaveSerpent 2.11 | 650 | 479 | 650 | 916 | 23.5 / 33.6 | 182 | 13653 | 3 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 650 | 467 | 650 | 1148 | 30.0 / 28.1 | 757 | 22778 | 425 |
| cs.Nene 1.0.5 | 650 | 471 | 650 | 796 | 23.9 / 33.4 | 156 | 14634 | 3841 |
| jk.melee.Neuromancer 7.12 | 650 | 529 | 650 | 1919 | 32.4 / 34.4 | 398 | 21961 | 35 |
| voidious.Dookious 1.573c | 650 | 485 | 638 | 834 | 24.1 / 30.8 | 198 | 11767 | 6279 |
| davidalves.Phoenix 1.02 | 650 | 460 | 650 | 837 | 24.8 / 37.0 | 194 | 12272 | 175 |
| rsalesc.roborio.Roborio 1.2.4 | 650 | 502 | 650 | 2574 | 40.6 / 25.5 | 1540 | 13389 | 127 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 9.3% | 375 | 1176 | 3 | 136.5 | 5065 / 5090 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 10.2% | 409 | 6948 | 3 | 248.4 | 10813 / 10924 (99%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 7.0% | 107 | 96 | 3 | 34.0 | 1028 / 1051 (98%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10.7% | 337 | 9169 | 3 | 197.7 | 7994 / 8024 (100%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 8.7% | 318 | 41756 | 3 | 228.8 | 8426 / 8439 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 8.7% | 309 | 33748 | 3 | 264.5 | 8448 / 8491 (99%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 9.0% | 139 | 211 | 2 | 84.3 | 3187 / 3199 (100%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 8.6% | 166 | 1392 | 3 | 86.4 | 3139 / 3167 (99%) | 0 | 0 |
| lxx.Tomcat 3.68 | 10.2% | 314 | 429 | 3 | 169.7 | 7129 / 7135 (100%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 9.8% | 331 | 17270 | 3 | 246.8 | 10436 / 10442 (100%) | 0 | 0 |
| aw.Gilgalad 1.99.5c | 10.3% | 210 | 36534 | 3 | 121.5 | 4361 / 4368 (100%) | 0 | 0 |
| pc.Wavelet 1.5 | 9.0% | 174 | 28599 | 3 | 96.5 | 3747 / 3754 (100%) | 0 | 0 |
| gh.GresSuffurd 0.4.13 | 8.2% | 168 | 1044 | 3 | 71.4 | 2757 / 2760 (100%) | 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 7.6% | 87 | 3229 | 3 | 54.9 | 1835 / 1835 (100%) | 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 7.6% | 170 | 187 | 3 | 80.7 | 3052 / 3076 (99%) | 0 | 0 |
| cs.Nene 1.0.5 | 7.4% | 124 | 141 | 3 | 55.6 | 2086 / 2096 (100%) | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 10.2% | 393 | 8235 | 3 | 151.9 | 5713 / 5724 (100%) | 0 | 0 |
| voidious.Dookious 1.573c | 7.1% | 123 | 428 | 3 | 53.0 | 1739 / 1740 (100%) | 0 | 0 |
| davidalves.Phoenix 1.02 | 8.1% | 90 | 1241 | 3 | 52.8 | 1792 / 1792 (100%) | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 9.2% | 241 | 381 | 3 | 193.3 | 7237 / 7264 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| voidious.Diamond 1.8.22 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cb.fire.Firestarter 2.0f | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| xander.cat.XanderCat 12.9 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lxx.Tomcat 3.68 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| aw.Gilgalad 1.99.5c | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pc.Wavelet 1.5 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| gh.GresSuffurd 0.4.13 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cs.Nene 1.0.5 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jk.melee.Neuromancer 7.12 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| voidious.Dookious 1.573c | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.Phoenix 1.02 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## First rounds against last rounds

Per battle, the first 5 rounds against the last 10, then the paired difference (last minus first) over battles with its 95% interval. Win rate is rounds won over rounds with an R record; damage share is bullet damage dealt over dealt plus taken. Positive means the robot does better late in the battle.

| Opponent | Build | Battles | Win rate, first 5 | Win rate, last 10 | Late minus early (pp) | Damage share, first 5 | Damage share, last 10 | Late minus early (pp) |
|---|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | hadur2.Hadur 3.9 | 10 | 14.0% ± 11.8 | 23.3% ± 9.1 | +9.3 ± 16.4 | 43.7% ± 6.1 | 38.0% ± 2.7 | -5.8 ± 6.3 |
| aaa.r.ScalarR 0.005h.053-noshield | hadur2.Hadur 3.8.5 | 10 | 24.0% ± 16.2 | 31.3% ± 11.2 | +7.3 ± 24.4 | 45.1% ± 10.3 | 39.5% ± 4.6 | -5.6 ± 12.2 |
| aw.Gilgalad 1.99.5c | hadur2.Hadur 3.9 | 10 | 50.0% ± 15.5 | 59.2% ± 8.8 | +9.2 ± 14.6 | 38.2% ± 5.4 | 39.8% ± 4.4 | +1.6 ± 2.9 |
| aw.Gilgalad 1.99.5c | hadur2.Hadur 3.8.5 | 10 | 52.0% ± 13.8 | 58.9% ± 5.6 | +6.9 ± 15.3 | 43.1% ± 7.0 | 42.8% ± 6.6 | -0.2 ± 6.8 |
| cb.fire.Firestarter 2.0f | hadur2.Hadur 3.9 | 10 | 36.0% ± 14.8 | 53.0% ± 8.3 | +17.0 ± 15.8 | 54.1% ± 4.2 | 50.2% ± 2.7 | -4.0 ± 4.0 |
| cb.fire.Firestarter 2.0f | hadur2.Hadur 3.8.5 | 10 | 28.0% ± 13.8 | 46.0% ± 9.7 | +18.0 ± 21.3 | 50.2% ± 6.0 | 48.3% ± 3.1 | -1.9 ± 6.1 |
| cs.Nene 1.0.5 | hadur2.Hadur 3.9 | 10 | 72.0% ± 16.8 | 66.0% ± 13.6 | -6.0 ± 23.9 | 42.3% ± 5.6 | 36.4% ± 2.5 | -5.9 ± 6.1 |
| cs.Nene 1.0.5 | hadur2.Hadur 3.8.5 | 10 | 84.0% ± 13.1 | 84.0% ± 7.7 | +0.0 ± 13.5 | 45.5% ± 3.8 | 40.3% ± 3.7 | -5.1 ± 5.0 |
| davidalves.Phoenix 1.02 | hadur2.Hadur 3.9 | 10 | 68.0% ± 18.1 | 74.4% ± 15.0 | +6.4 ± 25.3 | 43.2% ± 9.0 | 41.2% ± 4.2 | -2.0 ± 8.5 |
| davidalves.Phoenix 1.02 | hadur2.Hadur 3.8.5 | 10 | 64.0% ± 16.2 | 67.0% ± 11.4 | +3.0 ± 22.2 | 42.0% ± 2.9 | 38.0% ± 3.8 | -4.0 ± 5.5 |
| dsekercioglu.mega.Raven 3.56j8 | hadur2.Hadur 3.9 | 10 | 68.0% ± 13.8 | 70.7% ± 9.5 | +2.7 ± 17.5 | 42.6% ± 6.5 | 38.6% ± 2.5 | -4.0 ± 7.6 |
| dsekercioglu.mega.Raven 3.56j8 | hadur2.Hadur 3.8.5 | 10 | 73.5% ± 9.5 | 70.6% ± 11.7 | -2.9 ± 19.0 | 44.2% ± 4.0 | 39.2% ± 3.4 | -5.0 ± 5.4 |
| dsekercioglu.mega.WhiteFang 2.8.1 | hadur2.Hadur 3.9 | 10 | 82.0% ± 10.6 | 89.0% ± 5.3 | +7.0 ± 10.7 | 52.9% ± 5.2 | 49.1% ± 4.0 | -3.7 ± 6.3 |
| dsekercioglu.mega.WhiteFang 2.8.1 | hadur2.Hadur 3.8.5 | 10 | 88.0% ± 7.4 | 82.0% ± 6.6 | -6.0 ± 10.8 | 55.8% ± 5.2 | 49.9% ± 5.2 | -5.9 ± 7.6 |
| gh.GresSuffurd 0.4.13 | hadur2.Hadur 3.9 | 10 | 66.0% ± 9.7 | 74.6% ± 9.6 | +8.6 ± 16.9 | 47.0% ± 6.8 | 46.6% ± 3.1 | -0.4 ± 5.7 |
| gh.GresSuffurd 0.4.13 | hadur2.Hadur 3.8.5 | 10 | 78.0% ± 10.6 | 78.9% ± 11.0 | +0.9 ± 13.1 | 51.9% ± 5.3 | 48.5% ± 7.1 | -3.3 ± 7.5 |
| jk.mega.DrussGT 3.1.16 | hadur2.Hadur 3.9 | 10 | 46.0% ± 23.4 | 42.7% ± 17.7 | -3.3 ± 23.2 | 56.1% ± 7.2 | 42.4% ± 3.1 | -13.7 ± 6.4 |
| jk.mega.DrussGT 3.1.16 | hadur2.Hadur 3.8.5 | 10 | 46.0% ± 15.2 | 45.7% ± 11.3 | -0.3 ± 18.5 | 56.4% ± 5.1 | 44.1% ± 2.2 | -12.3 ± 5.8 |
| jk.melee.Neuromancer 7.12 | hadur2.Hadur 3.9 | 10 | 50.0% ± 23.6 | 60.4% ± 13.6 | +10.4 ± 28.6 | 55.0% ± 9.2 | 48.9% ± 3.5 | -6.1 ± 11.4 |
| jk.melee.Neuromancer 7.12 | hadur2.Hadur 3.8.5 | 10 | 48.0% ± 15.4 | 54.6% ± 8.3 | +6.6 ± 21.5 | 53.4% ± 4.1 | 45.1% ± 2.8 | -8.4 ± 6.2 |
| kc.mega.BeepBoop 2.0 | hadur2.Hadur 3.9 | 10 | 10.0% ± 10.1 | 23.3% ± 9.7 | +13.3 ± 15.8 | 38.7% ± 7.8 | 43.4% ± 3.5 | +4.7 ± 8.5 |
| kc.mega.BeepBoop 2.0 | hadur2.Hadur 3.8.5 | 10 | 6.0% ± 6.9 | 31.0% ± 8.6 | +25.0 ± 9.1 | 41.8% ± 4.3 | 43.7% ± 3.5 | +1.9 ± 6.7 |
| kc.serpent.WaveSerpent 2.11 | hadur2.Hadur 3.9 | 10 | 84.0% ± 6.0 | 79.0% ± 9.8 | -5.0 ± 14.0 | 48.6% ± 3.8 | 44.0% ± 5.6 | -4.5 ± 7.4 |
| kc.serpent.WaveSerpent 2.11 | hadur2.Hadur 3.8.5 | 10 | 78.0% ± 10.6 | 73.1% ± 8.9 | -4.9 ± 12.9 | 47.2% ± 4.1 | 41.1% ± 3.5 | -6.1 ± 6.0 |
| lxx.Tomcat 3.68 | hadur2.Hadur 3.9 | 10 | 56.5% ± 15.6 | 66.7% ± 13.5 | +10.2 ± 21.3 | 42.8% ± 7.0 | 43.6% ± 3.7 | +0.8 ± 8.4 |
| lxx.Tomcat 3.68 | hadur2.Hadur 3.8.5 | 10 | 60.0% ± 13.5 | 66.1% ± 18.3 | +6.1 ± 21.2 | 43.8% ± 6.2 | 44.2% ± 3.8 | +0.5 ± 6.2 |
| oog.mega.saguaro.Saguaro 1.0 | hadur2.Hadur 3.9 | 10 | 88.0% ± 7.4 | 79.0% ± 7.9 | -9.0 ± 9.2 | 91.4% ± 3.0 | 51.8% ± 7.0 | -39.6 ± 6.4 |
| oog.mega.saguaro.Saguaro 1.0 | hadur2.Hadur 3.8.5 | 10 | 88.0% ± 7.4 | 77.0% ± 10.7 | -11.0 ± 12.8 | 92.7% ± 3.1 | 48.5% ± 6.4 | -44.3 ± 4.3 |
| pc.Wavelet 1.5 | hadur2.Hadur 3.9 | 10 | 40.0% ± 15.1 | 56.7% ± 11.1 | +16.7 ± 13.2 | 51.6% ± 4.9 | 48.8% ± 4.2 | -2.7 ± 7.0 |
| pc.Wavelet 1.5 | hadur2.Hadur 3.8.5 | 10 | 50.0% ± 12.2 | 39.8% ± 12.1 | -10.2 ± 7.1 | 54.9% ± 4.9 | 48.6% ± 5.1 | -6.3 ± 9.0 |
| rsalesc.mega.Knight 0.6.28 | hadur2.Hadur 3.9 | 10 | 40.0% ± 22.4 | 58.7% ± 9.2 | +18.7 ± 23.4 | 55.2% ± 4.5 | 48.1% ± 2.5 | -7.1 ± 4.0 |
| rsalesc.mega.Knight 0.6.28 | hadur2.Hadur 3.8.5 | 10 | 50.0% ± 18.2 | 62.3% ± 14.5 | +12.3 ± 24.4 | 59.6% ± 6.2 | 51.5% ± 3.8 | -8.0 ± 6.8 |
| rsalesc.roborio.Roborio 1.2.4 | hadur2.Hadur 3.9 | 10 | 56.0% ± 18.8 | 69.0% ± 7.5 | +13.0 ± 24.2 | 70.1% ± 5.4 | 59.0% ± 3.1 | -11.1 ± 6.4 |
| rsalesc.roborio.Roborio 1.2.4 | hadur2.Hadur 3.8.5 | 10 | 46.0% ± 13.6 | 64.6% ± 10.1 | +18.6 ± 14.9 | 68.2% ± 4.8 | 62.3% ± 6.6 | -5.9 ± 8.2 |
| voidious.Diamond 1.8.22 | hadur2.Hadur 3.9 | 10 | 52.0% ± 20.5 | 58.1% ± 14.3 | +6.1 ± 22.0 | 44.4% ± 6.8 | 40.5% ± 3.0 | -3.9 ± 8.3 |
| voidious.Diamond 1.8.22 | hadur2.Hadur 3.8.5 | 10 | 50.0% ± 13.9 | 60.3% ± 11.9 | +10.3 ± 16.7 | 48.3% ± 4.8 | 40.1% ± 3.2 | -8.2 ± 3.8 |
| voidious.Dookious 1.573c | hadur2.Hadur 3.9 | 10 | 78.0% ± 14.2 | 76.8% ± 8.8 | -1.2 ± 14.8 | 44.6% ± 4.3 | 41.4% ± 3.1 | -3.2 ± 4.2 |
| voidious.Dookious 1.573c | hadur2.Hadur 3.8.5 | 10 | 62.0% ± 12.5 | 79.0% ± 9.2 | +17.0 ± 12.2 | 44.7% ± 3.2 | 42.2% ± 3.9 | -2.4 ± 4.6 |
| xander.cat.XanderCat 12.9 | hadur2.Hadur 3.9 | 10 | 66.0% ± 9.7 | 61.0% ± 9.8 | -5.0 ± 15.5 | 53.9% ± 4.9 | 50.7% ± 4.7 | -3.2 ± 5.6 |
| xander.cat.XanderCat 12.9 | hadur2.Hadur 3.8.5 | 10 | 60.0% ± 16.5 | 52.0% ± 10.7 | -8.0 ± 20.5 | 47.4% ± 7.4 | 49.9% ± 4.9 | +2.5 ± 8.4 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | -10.0 ± 21.6 | -8.0 ± 13.7 | -1.3 ± 9.8 | -1.5 ± 5.6 |
| aw.Gilgalad 1.99.5c | -2.0 ± 17.1 | +0.3 ± 12.3 | -4.9 ± 5.9 | -3.0 ± 7.1 |
| cb.fire.Firestarter 2.0f | +8.0 ± 19.3 | +7.0 ± 6.8 | +3.9 ± 6.6 | +1.8 ± 3.9 |
| cs.Nene 1.0.5 | -12.0 ± 18.1 | -18.0 ± 13.8 | -3.2 ± 3.9 | -4.0 ± 3.2 |
| davidalves.Phoenix 1.02 | +4.0 ± 13.1 | +7.4 ± 21.3 | +1.2 ± 8.3 | +3.2 ± 6.3 |
| dsekercioglu.mega.Raven 3.56j8 | -5.5 ± 19.3 | +0.1 ± 9.7 | -1.6 ± 6.9 | -0.6 ± 3.0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | -6.0 ± 13.6 | +7.0 ± 8.3 | -3.0 ± 4.7 | -0.8 ± 5.7 |
| gh.GresSuffurd 0.4.13 | -12.0 ± 13.8 | -4.3 ± 14.1 | -4.8 ± 6.7 | -1.9 ± 6.3 |
| jk.mega.DrussGT 3.1.16 | -0.0 ± 32.3 | -3.0 ± 22.8 | -0.3 ± 3.9 | -1.7 ± 3.4 |
| jk.melee.Neuromancer 7.12 | +2.0 ± 21.8 | +5.9 ± 16.0 | +1.6 ± 7.8 | +3.8 ± 4.6 |
| kc.mega.BeepBoop 2.0 | +4.0 ± 11.3 | -7.7 ± 9.4 | -3.1 ± 7.2 | -0.3 ± 4.0 |
| kc.serpent.WaveSerpent 2.11 | +6.0 ± 9.7 | +5.9 ± 14.6 | +1.4 ± 3.6 | +2.9 ± 5.6 |
| lxx.Tomcat 3.68 | -3.5 ± 19.5 | +0.6 ± 19.4 | -0.9 ± 11.2 | -0.6 ± 2.2 |
| oog.mega.saguaro.Saguaro 1.0 | +0.0 ± 9.5 | +2.0 ± 12.1 | -1.3 ± 5.5 | +3.4 ± 9.2 |
| pc.Wavelet 1.5 | -10.0 ± 23.6 | +16.9 ± 20.6 | -3.3 ± 8.1 | +0.2 ± 5.6 |
| rsalesc.mega.Knight 0.6.28 | -10.0 ± 28.0 | -3.7 ± 20.8 | -4.4 ± 9.1 | -3.4 ± 5.1 |
| rsalesc.roborio.Roborio 1.2.4 | +10.0 ± 20.5 | +4.4 ± 13.2 | +1.9 ± 8.6 | -3.3 ± 6.5 |
| voidious.Diamond 1.8.22 | +2.0 ± 26.5 | -2.2 ± 19.1 | -3.8 ± 9.8 | +0.5 ± 5.4 |
| voidious.Dookious 1.573c | +16.0 ± 24.1 | -2.2 ± 15.7 | -0.0 ± 5.4 | -0.8 ± 5.1 |
| xander.cat.XanderCat 12.9 | +6.0 ± 20.3 | +9.0 ± 17.8 | +6.5 ± 9.8 | +0.7 ± 6.4 |
