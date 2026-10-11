# Bench: hadur2.Hadur 3.9 (cold)

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 9337 over 400 battles (23.3 per battle, most in one battle 55). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 23.6% ± 2.3 | 11.3% ± 3.0 | 40.8% ± 1.5 | 80 / 700 | 4.8% ± 0.2 | 8.9% ± 0.3 | 425 | 0 | 2.04 / 339.8 |
| jk.mega.DrussGT 3.1.16 | rumble-3 | 46.9% ± 2.1 | 47.3% ± 3.3 | 46.5% ± 1.0 | 333 / 700 | 7.4% ± 0.2 | 10.3% ± 0.2 | 712 | 0 | 1.60 / 661.0 |
| oog.mega.saguaro.Saguaro 1.0 | rumble-4 | 72.9% ± 2.7 | 83.9% ± 3.8 | 62.2% ± 2.0 | 587 / 700 | 18.6% ± 0.6 | 6.7% ± 0.4 | 222 | 0 | 2.15 / 895.6 |
| aaa.r.ScalarR 0.005h.053-noshield | rumble-5 | 34.4% ± 1.9 | 28.5% ± 3.3 | 41.6% ± 0.9 | 201 / 700 | 6.8% ± 0.2 | 10.4% ± 0.3 | 744 | 0 | 1.94 / 163.7 |
| voidious.Diamond 1.8.22 | rumble-6 | 49.0% ± 2.8 | 57.3% ± 4.2 | 40.2% ± 1.4 | 402 / 700 | 6.8% ± 0.2 | 8.7% ± 0.2 | 601 | 0 | 1.87 / 141.5 |
| cb.fire.Firestarter 2.0f | rumble-7 | 51.8% ± 2.5 | 50.9% ± 3.5 | 52.8% ± 1.5 | 358 / 700 | 8.4% ± 0.2 | 8.4% ± 0.2 | 635 | 0 | 1.80 / 222.8 |
| dsekercioglu.mega.Raven 3.56j8 | rumble-8 | 55.2% ± 2.3 | 69.0% ± 3.7 | 41.2% ± 1.3 | 483 / 700 | 9.8% ± 0.3 | 9.1% ± 0.2 | 276 | 0 | 1.24 / 161.9 |
| xander.cat.XanderCat 12.9 | rumble-9 | 57.3% ± 2.2 | 64.9% ± 3.4 | 50.3% ± 1.8 | 454 / 700 | 11.6% ± 0.2 | 8.3% ± 0.3 | 384 | 0 | 1.28 / 87.2 |
| lxx.Tomcat 3.68 | rumble-10 | 53.8% ± 2.4 | 64.9% ± 3.6 | 43.2% ± 1.4 | 455 / 700 | 9.5% ± 0.2 | 10.3% ± 0.2 | 601 | 0 | 2.19 / 102.7 |
| rsalesc.mega.Knight 0.6.28 | rumble-11 | 54.6% ± 2.6 | 56.9% ± 3.9 | 51.9% ± 1.3 | 398 / 700 | 9.4% ± 0.2 | 9.7% ± 0.2 | 654 | 0 | 2.15 / 81.0 |
| aw.Gilgalad 1.99.5c | rumble-12 | 47.7% ± 2.7 | 56.3% ± 3.7 | 39.8% ± 2.1 | 395 / 700 | 9.2% ± 0.7 | 10.3% ± 0.2 | 544 | 0 | 1.52 / 70.7 |
| pc.Wavelet 1.5 | rumble-13 | 48.8% ± 2.7 | 48.1% ± 5.0 | 50.5% ± 1.9 | 337 / 700 | 10.4% ± 0.3 | 8.8% ± 0.3 | 343 | 0 | 1.88 / 226.9 |
| gh.GresSuffurd 0.4.13 | rumble-14 | 60.6% ± 2.3 | 72.9% ± 3.2 | 48.3% ± 1.7 | 511 / 700 | 11.2% ± 0.2 | 8.7% ± 0.2 | 343 | 0 | 1.11 / 48.7 |
| kc.serpent.WaveSerpent 2.11 | rumble-15 | 58.9% ± 3.0 | 74.8% ± 4.3 | 41.1% ± 1.6 | 524 / 700 | 8.8% ± 0.3 | 7.5% ± 0.2 | 242 | 0 | 2.17 / 237.4 |
| dsekercioglu.mega.WhiteFang 2.8.1 | rumble-17 | 66.9% ± 1.7 | 81.4% ± 2.6 | 51.2% ± 1.5 | 570 / 700 | 11.0% ± 0.2 | 7.7% ± 0.2 | 312 | 0 | 1.22 / 113.5 |
| cs.Nene 1.0.5 | rumble-18 | 58.3% ± 2.3 | 75.0% ± 3.3 | 40.8% ± 1.5 | 525 / 700 | 9.6% ± 0.2 | 7.6% ± 0.2 | 256 | 0 | 1.28 / 180.0 |
| jk.melee.Neuromancer 7.12 | rumble-19 | 50.6% ± 2.0 | 54.5% ± 3.6 | 47.1% ± 1.4 | 382 / 700 | 10.0% ± 0.2 | 10.2% ± 0.4 | 872 | 0 | 1.85 / 215.9 |
| voidious.Dookious 1.573c | rumble-20 | 60.0% ± 1.6 | 75.4% ± 2.5 | 42.8% ± 1.2 | 528 / 700 | 9.5% ± 0.3 | 7.2% ± 0.2 | 257 | 0 | 1.29 / 246.9 |
| davidalves.Phoenix 1.02 | rumble-21 | 57.4% ± 2.1 | 74.6% ± 3.0 | 39.8% ± 1.3 | 522 / 700 | 9.7% ± 0.3 | 9.0% ± 1.8 | 263 | 0 | 1.30 / 48.7 |
| rsalesc.roborio.Roborio 1.2.4 | rumble-22 | 61.0% ± 2.2 | 57.9% ± 4.0 | 62.6% ± 1.4 | 406 / 700 | 11.8% ± 0.2 | 9.2% ± 0.2 | 651 | 0 | 1.81 / 41.3 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 20 | 20 | 0 | 0 | 0.61 | 0 | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 20 | 6 | 298 | 0 | 1.02 | 13 | 13 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 20 | 18 | 298 | 0 | 0.32 | 1 | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 20 | 16 | 1192 | 0 | 1.06 | 0 | 0 | 0 |
| voidious.Diamond 1.8.22 | 20 | 12 | 298 | 0 | 0.86 | 8 | 7 | 0 |
| cb.fire.Firestarter 2.0f | 20 | 17 | 894 | 0 | 0.91 | 0 | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 20 | 13 | 0 | 0 | 0.39 | 7 | 7 | 0 |
| xander.cat.XanderCat 12.9 | 20 | 16 | 298 | 0 | 0.55 | 4 | 4 | 20 |
| lxx.Tomcat 3.68 | 20 | 13 | 0 | 0 | 0.86 | 7 | 7 | 0 |
| rsalesc.mega.Knight 0.6.28 | 20 | 11 | 0 | 0 | 0.93 | 9 | 9 | 0 |
| aw.Gilgalad 1.99.5c | 20 | 14 | 0 | 0 | 0.78 | 6 | 6 | 0 |
| pc.Wavelet 1.5 | 20 | 13 | 0 | 0 | 0.49 | 7 | 6 | 0 |
| gh.GresSuffurd 0.4.13 | 20 | 14 | 298 | 0 | 0.49 | 5 | 5 | 0 |
| kc.serpent.WaveSerpent 2.11 | 20 | 17 | 0 | 0 | 0.35 | 3 | 3 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 20 | 15 | 596 | 0 | 0.45 | 3 | 3 | 0 |
| cs.Nene 1.0.5 | 20 | 19 | 298 | 0 | 0.37 | 0 | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 20 | 13 | 1798 | 0 | 1.25 | 0 | 0 | 0 |
| voidious.Dookious 1.573c | 20 | 17 | 894 | 0 | 0.37 | 1 | 1 | 0 |
| davidalves.Phoenix 1.02 | 20 | 17 | 496 | 0 | 0.38 | 2 | 2 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 20 | 10 | 1586 | 0 | 0.93 | 8 | 8 | 0 |

291 of 400 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 96295 | 1294 | 100639 | 96262 (100.0%) | 33 (0.0%) | 4377 (4.3%) | 4012 | 630 | 381 |
| jk.mega.DrussGT 3.1.16 | 179930 | 24 | 179914 | 179887 (100.0%) | 43 (0.0%) | 27 (0.0%) | 11260 | 1297 | 791 |
| oog.mega.saguaro.Saguaro 1.0 | 23390 | 35 | 23375 | 23358 (99.9%) | 32 (0.1%) | 17 (0.1%) | 1555 | 344 | 79 |
| aaa.r.ScalarR 0.005h.053-noshield | 149813 | 53 | 153791 | 149704 (99.9%) | 109 (0.1%) | 4087 (2.7%) | 9118 | 1584 | 737 |
| voidious.Diamond 1.8.22 | 156615 | 3027 | 162573 | 156510 (99.9%) | 105 (0.1%) | 6063 (3.7%) | 9842 | 927 | 550 |
| cb.fire.Firestarter 2.0f | 167165 | 3646 | 194157 | 166979 (99.9%) | 186 (0.1%) | 27178 (14.0%) | 14767 | 1307 | 591 |
| dsekercioglu.mega.Raven 3.56j8 | 60181 | 321 | 60178 | 60174 (100.0%) | 7 (0.0%) | 4 (0.0%) | 4485 | 685 | 191 |
| xander.cat.XanderCat 12.9 | 57493 | 25 | 60159 | 57470 (100.0%) | 23 (0.0%) | 2689 (4.5%) | 5992 | 769 | 280 |
| lxx.Tomcat 3.68 | 119692 | 2274 | 120436 | 119589 (99.9%) | 103 (0.1%) | 847 (0.7%) | 9848 | 988 | 529 |
| rsalesc.mega.Knight 0.6.28 | 178879 | 1747 | 178844 | 178782 (99.9%) | 97 (0.1%) | 62 (0.0%) | 14390 | 1381 | 611 |
| aw.Gilgalad 1.99.5c | 93901 | 39 | 94659 | 93886 (100.0%) | 15 (0.0%) | 773 (0.8%) | 7227 | 919 | 525 |
| pc.Wavelet 1.5 | 65848 | 15 | 66786 | 65833 (100.0%) | 15 (0.0%) | 953 (1.4%) | 5835 | 619 | 352 |
| gh.GresSuffurd 0.4.13 | 50860 | 36 | 50840 | 50834 (99.9%) | 26 (0.1%) | 6 (0.0%) | 3639 | 499 | 249 |
| kc.serpent.WaveSerpent 2.11 | 39386 | 11 | 39396 | 39385 (100.0%) | 1 (0.0%) | 11 (0.0%) | 2891 | 296 | 116 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 55488 | 46 | 55444 | 55440 (99.9%) | 48 (0.1%) | 4 (0.0%) | 4570 | 474 | 196 |
| cs.Nene 1.0.5 | 38307 | 286 | 38282 | 38278 (99.9%) | 29 (0.1%) | 4 (0.0%) | 2309 | 282 | 160 |
| jk.melee.Neuromancer 7.12 | 106264 | 36 | 107305 | 106077 (99.8%) | 187 (0.2%) | 1228 (1.1%) | 9182 | 950 | 1145 |
| voidious.Dookious 1.573c | 37376 | 63 | 37316 | 37315 (99.8%) | 61 (0.2%) | 1 (0.0%) | 2633 | 265 | 129 |
| davidalves.Phoenix 1.02 | 37832 | 22 | 37801 | 37795 (99.9%) | 37 (0.1%) | 6 (0.0%) | 2766 | 395 | 105 |
| rsalesc.roborio.Roborio 1.2.4 | 139283 | 40 | 139312 | 139153 (99.9%) | 130 (0.1%) | 159 (0.1%) | 14069 | 1118 | 566 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 95793 | 10373 (10.8%) | 91324 |
| jk.mega.DrussGT 3.1.16 | 178368 | 22554 (12.6%) | 176747 |
| oog.mega.saguaro.Saguaro 1.0 | 26538 | 1969 (7.4%) | 26390 |
| aaa.r.ScalarR 0.005h.053-noshield | 152619 | 17993 (11.8%) | 149717 |
| voidious.Diamond 1.8.22 | 159421 | 17171 (10.8%) | 154483 |
| cb.fire.Firestarter 2.0f | 192457 | 17619 (9.2%) | 187351 |
| dsekercioglu.mega.Raven 3.56j8 | 64287 | 6459 (10.0%) | 60648 |
| xander.cat.XanderCat 12.9 | 73288 | 6025 (8.2%) | 67121 |
| lxx.Tomcat 3.68 | 121724 | 14027 (11.5%) | 118964 |
| rsalesc.mega.Knight 0.6.28 | 178874 | 21076 (11.8%) | 176128 |
| aw.Gilgalad 1.99.5c | 96388 | 10008 (10.4%) | 92810 |
| pc.Wavelet 1.5 | 78036 | 7267 (9.3%) | 74462 |
| gh.GresSuffurd 0.4.13 | 53769 | 5407 (10.1%) | 46965 |
| kc.serpent.WaveSerpent 2.11 | 51549 | 3773 (7.3%) | 44552 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 63340 | 5903 (9.3%) | 60549 |
| cs.Nene 1.0.5 | 42674 | 4053 (9.5%) | 37422 |
| jk.melee.Neuromancer 7.12 | 113768 | 11717 (10.3%) | 109885 |
| voidious.Dookious 1.573c | 45788 | 3512 (7.7%) | 30646 |
| davidalves.Phoenix 1.02 | 47286 | 3582 (7.6%) | 35383 |
| rsalesc.roborio.Roborio 1.2.4 | 156179 | 14781 (9.5%) | 155853 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 536 | 650 | 1662 | 19.0 / 27.6 | 1 | 2027 | 286 |
| jk.mega.DrussGT 3.1.16 | 650 | 514 | 650 | 3001 | 27.0 / 31.1 | 52 | 24149 | 1821 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 448 | 468 | 531 | 43.4 / 26.4 | 3399 | 9135 | 1658 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 485 | 650 | 2548 | 23.8 / 33.5 | 37 | 5910 | 7 |
| voidious.Diamond 1.8.22 | 650 | 537 | 650 | 2661 | 21.4 / 31.7 | 389 | 43886 | 708 |
| cb.fire.Firestarter 2.0f | 650 | 546 | 645 | 3162 | 29.7 / 26.4 | 415 | 23739 | 920 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 453 | 650 | 1138 | 24.8 / 35.3 | 600 | 56046 | 5963 |
| xander.cat.XanderCat 12.9 | 650 | 454 | 650 | 1304 | 33.1 / 32.8 | 1182 | 9373 | 251 |
| lxx.Tomcat 3.68 | 650 | 511 | 650 | 2058 | 27.2 / 35.8 | 538 | 86323 | 53 |
| rsalesc.mega.Knight 0.6.28 | 650 | 510 | 650 | 2995 | 31.7 / 29.4 | 1220 | 34807 | 107 |
| aw.Gilgalad 1.99.5c | 650 | 478 | 650 | 1652 | 24.8 / 37.2 | 1045 | 70252 | 146 |
| pc.Wavelet 1.5 | 650 | 441 | 626 | 1385 | 30.4 / 29.7 | 905 | 14368 | 51 |
| gh.GresSuffurd 0.4.13 | 650 | 458 | 644 | 984 | 30.5 / 32.5 | 1513 | 22719 | 497 |
| kc.serpent.WaveSerpent 2.11 | 650 | 481 | 650 | 926 | 22.7 / 32.5 | 419 | 32019 | 7 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 650 | 464 | 636 | 1128 | 30.6 / 29.0 | 1195 | 47416 | 738 |
| cs.Nene 1.0.5 | 650 | 472 | 650 | 780 | 23.9 / 34.5 | 398 | 26871 | 5971 |
| jk.melee.Neuromancer 7.12 | 650 | 529 | 650 | 1917 | 30.7 / 34.5 | 711 | 42178 | 79 |
| voidious.Dookious 1.573c | 650 | 483 | 638 | 836 | 24.0 / 32.0 | 602 | 21377 | 11337 |
| davidalves.Phoenix 1.02 | 650 | 460 | 650 | 853 | 24.0 / 36.3 | 430 | 28669 | 390 |
| rsalesc.roborio.Roborio 1.2.4 | 650 | 504 | 650 | 2643 | 41.3 / 24.6 | 3065 | 25391 | 204 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 8.9% | 425 | 629 | 3 | 142.7 | 10349 / 10373 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 10.3% | 712 | 45101 | 3 | 253.0 | 22537 / 22554 (100%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 6.7% | 222 | 144 | 3 | 33.3 | 1947 / 1969 (99%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10.4% | 744 | 1143 | 3 | 219.4 | 17951 / 17993 (100%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 8.7% | 601 | 11212 | 3 | 230.8 | 17138 / 17171 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 8.4% | 635 | 28523 | 3 | 276.6 | 17521 / 17619 (99%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 9.1% | 276 | 2219 | 3 | 85.1 | 6437 / 6459 (100%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 8.3% | 384 | 3024 | 3 | 85.1 | 6017 / 6025 (100%) | 0 | 0 |
| lxx.Tomcat 3.68 | 10.3% | 601 | 3893 | 3 | 171.3 | 14009 / 14027 (100%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 9.7% | 654 | 51514 | 3 | 251.9 | 21058 / 21076 (100%) | 0 | 0 |
| aw.Gilgalad 1.99.5c | 10.3% | 544 | 19327 | 3 | 134.3 | 9990 / 10008 (100%) | 0 | 0 |
| pc.Wavelet 1.5 | 8.8% | 343 | 14479 | 3 | 94.5 | 7257 / 7267 (100%) | 0 | 0 |
| gh.GresSuffurd 0.4.13 | 8.7% | 343 | 3946 | 3 | 71.7 | 5399 / 5407 (100%) | 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 7.5% | 242 | 1934 | 3 | 55.7 | 3772 / 3773 (100%) | 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 7.7% | 312 | 364 | 3 | 78.7 | 5869 / 5903 (99%) | 0 | 0 |
| cs.Nene 1.0.5 | 7.6% | 256 | 1673 | 3 | 54.6 | 4025 / 4053 (99%) | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 10.2% | 872 | 32144 | 3 | 152.7 | 11679 / 11717 (100%) | 0 | 0 |
| voidious.Dookious 1.573c | 7.2% | 257 | 12006 | 3 | 53.2 | 3503 / 3512 (100%) | 0 | 0 |
| davidalves.Phoenix 1.02 | 9.0% | 263 | 10082 | 3 | 53.7 | 3581 / 3582 (100%) | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 9.2% | 651 | 926 | 3 | 195.8 | 14715 / 14781 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| voidious.Diamond 1.8.22 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cb.fire.Firestarter 2.0f | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| xander.cat.XanderCat 12.9 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lxx.Tomcat 3.68 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| aw.Gilgalad 1.99.5c | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pc.Wavelet 1.5 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| gh.GresSuffurd 0.4.13 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cs.Nene 1.0.5 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jk.melee.Neuromancer 7.12 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| voidious.Dookious 1.573c | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.Phoenix 1.02 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | kc.mega.BeepBoop | 1 | 35 | 296 | 9.7% | 7.8% ± 1.0 | 5.7% | 20.8% / 20.4% | 0.2% | 0 / 0 | T3/M1 | 28% |
| jk.mega.DrussGT 3.1.16 | jk.mega.DrussGT | 1 | 35 | 298 | 10.9% | 9.0% ± 0.9 | 7.9% | 23.9% / 21.2% | 1.7% | 0 / 0 | T3/M1 | 44% |
| oog.mega.saguaro.Saguaro 1.0 | oog.mega.saguaro.Saguaro | 1 | 35 | 328 | 8.5% | 7.5% ± 1.6 | 12.8% | 25.8% / 26.3% | 10.3% | 0 / 0 | T3/M0 | 67% |
| aaa.r.ScalarR 0.005h.053-noshield | aaa.r.ScalarR | 1 | 35 | 316 | 10.9% | 8.6% ± 1.1 | 7.8% | 24.2% / 21.7% | 0.0% | 0 / 0 | T3/M1 | 35% |
| voidious.Diamond 1.8.22 | voidious.Diamond | 1 | 35 | 302 | 9.3% | 7.6% ± 1.2 | 6.9% | 22.7% / 21.9% | 8.7% | 0 / 0 | T3/M1 | 47% |
| cb.fire.Firestarter 2.0f | cb.fire.Firestarter | 1 | 35 | 310 | 8.8% | 7.0% ± 0.8 | 9.2% | 20.5% / 21.7% | 3.2% | 0 / 0 | T3/M1 | 51% |
| dsekercioglu.mega.Raven 3.56j8 | dsekercioglu.mega.Raven | 1 | 35 | 330 | 9.0% | 7.2% ± 1.0 | 10.4% | 22.0% / 21.0% | 11.6% | 0 / 0 | T3/M1 | 61% |
| xander.cat.XanderCat 12.9 | xander.cat.XanderCat | 1 | 35 | 314 | 10.6% | 7.6% ± 0.9 | 11.3% | 23.2% / 22.2% | 8.4% | 0 / 0 | T3/M1 | 56% |
| lxx.Tomcat 3.68 | lxx.Tomcat | 1 | 35 | 274 | 10.4% | 8.8% ± 0.9 | 10.5% | 23.6% / 21.6% | 9.1% | 0 / 0 | T3/M1 | 56% |
| rsalesc.mega.Knight 0.6.28 | rsalesc.mega.Knight | 1 | 35 | 314 | 10.4% | 8.3% ± 1.2 | 9.4% | 24.3% / 21.3% | 12.1% | 0 / 0 | T3/M1 | 55% |
| aw.Gilgalad 1.99.5c | aw.Gilgalad | 1 | 35 | 284 | 9.9% | 7.8% ± 1.0 | 8.9% | 21.1% / 21.8% | 3.6% | 0 / 0 | T3/M1 | 49% |
| pc.Wavelet 1.5 | pc.Wavelet | 1 | 35 | 272 | 10.2% | 7.1% ± 0.8 | 11.0% | 21.1% / 20.7% | 9.8% | 0 / 0 | T3/M1 | 46% |
| gh.GresSuffurd 0.4.13 | gh.GresSuffurd | 1 | 35 | 294 | 8.7% | 6.9% ± 1.1 | 11.0% | 23.0% / 22.5% | 11.0% | 0 / 0 | T2/M1 | 62% |
| kc.serpent.WaveSerpent 2.11 | kc.serpent.WaveSerpent | 1 | 35 | 322 | 7.7% | 7.0% ± 1.2 | 9.1% | 22.4% / 22.6% | 11.2% | 0 / 0 | T3/M1 | 63% |
| dsekercioglu.mega.WhiteFang 2.8.1 | dsekercioglu.mega.WhiteFang | 1 | 35 | 344 | 8.1% | 6.1% ± 0.9 | 10.9% | 21.4% / 20.8% | 13.5% | 0 / 0 | T2/M1 | 64% |
| cs.Nene 1.0.5 | cs.Nene | 1 | 35 | 264 | 8.3% | 7.4% ± 1.2 | 9.6% | 24.4% / 22.8% | 8.1% | 0 / 0 | T3/M1 | 60% |
| jk.melee.Neuromancer 7.12 | jk.melee.Neuromancer | 1 | 35 | 314 | 9.9% | 8.3% ± 1.0 | 10.2% | 23.3% / 22.2% | 0.0% | 0 / 0 | T3/M1 | 55% |
| voidious.Dookious 1.573c | voidious.Dookious | 1 | 35 | 306 | 7.5% | 6.7% ± 1.2 | 10.3% | 22.0% / 22.3% | 10.9% | 0 / 0 | T2/M1 | 60% |
| davidalves.Phoenix 1.02 | davidalves.Phoenix | 1 | 35 | 306 | 9.2% | 8.0% ± 1.3 | 8.9% | 20.1% / 21.8% | 5.7% | 0 / 0 | T3/M1 | 55% |
| rsalesc.roborio.Roborio 1.2.4 | rsalesc.roborio.Roborio | 1 | 35 | 328 | 9.5% | 7.7% ± 1.2 | 11.6% | 23.4% / 21.0% | 13.8% | 0 / 0 | T3/M1 | 61% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.9 vs hadur2.Hadur 3.8.5

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 23.6% ± 2.3 | 24.5% ± 2.0 | -0.9 ± 3.0 |
| jk.mega.DrussGT 3.1.16 | 46.9% ± 2.1 | 49.0% ± 2.6 | -2.1 ± 3.5 |
| oog.mega.saguaro.Saguaro 1.0 | 72.9% ± 2.7 | 73.6% ± 2.8 | -0.8 ± 3.9 |
| aaa.r.ScalarR 0.005h.053-noshield | 34.4% ± 1.9 | 31.5% ± 1.4 | +3.0 ± 2.5 |
| voidious.Diamond 1.8.22 | 49.0% ± 2.8 | 48.2% ± 3.3 | +0.8 ± 4.4 |
| cb.fire.Firestarter 2.0f | 51.8% ± 2.5 | 50.0% ± 2.6 | +1.8 ± 3.5 |
| dsekercioglu.mega.Raven 3.56j8 | 55.2% ± 2.3 | 54.5% ± 2.1 | +0.7 ± 2.9 |
| xander.cat.XanderCat 12.9 | 57.3% ± 2.2 | 56.8% ± 2.7 | +0.5 ± 4.4 |
| lxx.Tomcat 3.68 | 53.8% ± 2.4 | 52.8% ± 2.7 | +1.0 ± 3.3 |
| rsalesc.mega.Knight 0.6.28 | 54.6% ± 2.6 | 55.4% ± 2.3 | -0.9 ± 3.0 |
| aw.Gilgalad 1.99.5c | 47.7% ± 2.7 | 47.2% ± 2.8 | +0.5 ± 4.2 |
| pc.Wavelet 1.5 | 48.8% ± 2.7 | 47.5% ± 3.0 | +1.4 ± 3.9 |
| gh.GresSuffurd 0.4.13 | 60.6% ± 2.3 | 62.0% ± 2.1 | -1.4 ± 3.5 |
| kc.serpent.WaveSerpent 2.11 | 58.9% ± 3.0 | 59.8% ± 2.3 | -0.9 ± 3.6 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 66.9% ± 1.7 | 67.2% ± 1.8 | -0.4 ± 2.8 |
| cs.Nene 1.0.5 | 58.3% ± 2.3 | 56.7% ± 1.7 | +1.6 ± 2.8 |
| jk.melee.Neuromancer 7.12 | 50.6% ± 2.0 | 49.6% ± 2.1 | +1.0 ± 2.5 |
| voidious.Dookious 1.573c | 60.0% ± 1.6 | 59.0% ± 2.3 | +0.9 ± 3.0 |
| davidalves.Phoenix 1.02 | 57.4% ± 2.1 | 57.5% ± 1.8 | -0.2 ± 2.7 |
| rsalesc.roborio.Roborio 1.2.4 | 61.0% ± 2.2 | 62.3% ± 2.2 | -1.4 ± 2.9 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | -0.9 ± 3.0 | -0.3 ± 4.1 | -0.1 ± 4.1 | -1.5 ± 1.9 |
| jk.mega.DrussGT 3.1.16 | -2.1 ± 3.5 | -3.7 ± 5.6 | -3.7 ± 5.6 | -0.4 ± 1.8 |
| oog.mega.saguaro.Saguaro 1.0 | -0.8 ± 3.9 | -0.3 ± 5.5 | -0.3 ± 5.5 | -1.2 ± 2.9 |
| aaa.r.ScalarR 0.005h.053-noshield | +3.0 ± 2.5 | +4.5 ± 4.6 | +4.7 ± 4.6 | +0.9 ± 1.0 |
| voidious.Diamond 1.8.22 | +0.8 ± 4.4 | +1.1 ± 6.5 | +1.1 ± 6.5 | +0.6 ± 2.0 |
| cb.fire.Firestarter 2.0f | +1.8 ± 3.5 | +3.0 ± 5.0 | +3.0 ± 5.0 | +0.6 ± 2.1 |
| dsekercioglu.mega.Raven 3.56j8 | +0.7 ± 2.9 | +1.1 ± 4.5 | +1.1 ± 4.5 | +0.6 ± 1.9 |
| xander.cat.XanderCat 12.9 | +0.5 ± 4.4 | +2.8 ± 6.4 | +2.7 ± 6.3 | -1.2 ± 2.9 |
| lxx.Tomcat 3.68 | +1.0 ± 3.3 | +1.0 ± 5.4 | +1.1 ± 5.4 | +0.7 ± 1.5 |
| rsalesc.mega.Knight 0.6.28 | -0.9 ± 3.0 | -1.1 ± 4.3 | -1.1 ± 4.3 | -0.3 ± 1.9 |
| aw.Gilgalad 1.99.5c | +0.5 ± 4.2 | +0.6 ± 6.0 | +0.6 ± 6.1 | +0.5 ± 2.6 |
| pc.Wavelet 1.5 | +1.4 ± 3.9 | +2.7 ± 7.3 | +2.7 ± 7.3 | +0.1 ± 1.7 |
| gh.GresSuffurd 0.4.13 | -1.4 ± 3.5 | -1.3 ± 4.7 | -1.3 ± 4.7 | -0.9 ± 2.4 |
| kc.serpent.WaveSerpent 2.11 | -0.9 ± 3.6 | -0.6 ± 5.5 | -0.6 ± 5.5 | -1.6 ± 1.7 |
| dsekercioglu.mega.WhiteFang 2.8.1 | -0.4 ± 2.8 | -1.0 ± 3.8 | -1.0 ± 3.8 | +0.8 ± 2.3 |
| cs.Nene 1.0.5 | +1.6 ± 2.8 | +1.1 ± 3.8 | +1.1 ± 3.8 | +1.9 ± 2.2 |
| jk.melee.Neuromancer 7.12 | +1.0 ± 2.5 | +1.7 ± 4.1 | +1.7 ± 4.1 | +0.3 ± 1.8 |
| voidious.Dookious 1.573c | +0.9 ± 3.0 | +0.7 ± 4.2 | +0.7 ± 4.2 | +1.4 ± 2.2 |
| davidalves.Phoenix 1.02 | -0.2 ± 2.7 | -0.1 ± 3.4 | -0.1 ± 3.4 | -0.2 ± 2.3 |
| rsalesc.roborio.Roborio 1.2.4 | -1.4 ± 2.9 | -3.2 ± 4.8 | -3.1 ± 4.9 | +0.4 ± 2.1 |
| All pairs | +0.2 ± 0.7 | +0.4 ± 1.1 | +0.5 ± 1.1 | +0.1 ± 0.4 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 20 | 16 | -0.9 ± 3.0 | -1.1 ± 3.7 |
| jk.mega.DrussGT 3.1.16 | 20 | 4 | -2.1 ± 3.5 | -5.3 ± 2.6 |
| oog.mega.saguaro.Saguaro 1.0 | 20 | 15 | -0.8 ± 3.9 | -2.7 ± 4.5 |
| aaa.r.ScalarR 0.005h.053-noshield | 20 | 12 | +3.0 ± 2.5 | +1.5 ± 2.9 |
| voidious.Diamond 1.8.22 | 20 | 8 | +0.8 ± 4.4 | +2.3 ± 5.3 |
| cb.fire.Firestarter 2.0f | 20 | 16 | +1.8 ± 3.5 | +3.0 ± 3.9 |
| dsekercioglu.mega.Raven 3.56j8 | 20 | 11 | +0.7 ± 2.9 | +0.0 ± 2.9 |
| xander.cat.XanderCat 12.9 | 20 | 11 | +0.5 ± 4.4 | +1.0 ± 7.1 |
| lxx.Tomcat 3.68 | 20 | 9 | +1.0 ± 3.3 | +1.6 ± 6.2 |
| rsalesc.mega.Knight 0.6.28 | 20 | 5 | -0.9 ± 3.0 | -0.5 ± 8.5 |
| aw.Gilgalad 1.99.5c | 20 | 7 | +0.5 ± 4.2 | +1.0 ± 7.2 |
| pc.Wavelet 1.5 | 20 | 5 | +1.4 ± 3.9 | +3.6 ± 7.5 |
| gh.GresSuffurd 0.4.13 | 20 | 8 | -1.4 ± 3.5 | +0.4 ± 6.9 |
| kc.serpent.WaveSerpent 2.11 | 20 | 14 | -0.9 ± 3.6 | +0.6 ± 4.3 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 20 | 13 | -0.4 ± 2.8 | -0.3 ± 3.4 |
| cs.Nene 1.0.5 | 20 | 17 | +1.6 ± 2.8 | +1.6 ± 3.3 |
| jk.melee.Neuromancer 7.12 | 20 | 8 | +1.0 ± 2.5 | +0.1 ± 3.2 |
| voidious.Dookious 1.573c | 20 | 16 | +0.9 ± 3.0 | +1.3 ± 3.7 |
| davidalves.Phoenix 1.02 | 20 | 14 | -0.2 ± 2.7 | -1.7 ± 3.5 |
| rsalesc.roborio.Roborio 1.2.4 | 20 | 4 | -1.4 ± 2.9 | -3.5 ± 7.2 |
| All pairs | 400 | 213 | +0.2 ± 0.7 | +0.3 ± 0.9 |

# Bench: hadur2.Hadur 3.9 baseline (hadur2.Hadur 3.8.5) (cold)

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 9399 over 400 battles (23.5 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 24.5% ± 2.0 | 11.6% ± 2.6 | 42.3% ± 1.3 | 81 / 700 | 5.0% ± 0.2 | 8.8% ± 0.2 | 420 | 0 | 2.05 / 455.6 |
| jk.mega.DrussGT 3.1.16 | rumble-3 | 49.0% ± 2.6 | 51.1% ± 4.2 | 46.8% ± 1.4 | 359 / 700 | 7.5% ± 0.2 | 10.2% ± 0.2 | 802 | 0 | 1.65 / 598.3 |
| oog.mega.saguaro.Saguaro 1.0 | rumble-4 | 73.6% ± 2.8 | 84.1% ± 3.8 | 63.3% ± 2.1 | 589 / 700 | 19.0% ± 0.6 | 6.6% ± 0.3 | 209 | 0 | 2.09 / 942.4 |
| aaa.r.ScalarR 0.005h.053-noshield | rumble-5 | 31.5% ± 1.4 | 24.0% ± 2.4 | 40.7% ± 1.1 | 168 / 700 | 6.7% ± 0.2 | 10.3% ± 0.2 | 699 | 0 | 1.92 / 167.6 |
| voidious.Diamond 1.8.22 | rumble-6 | 48.2% ± 3.3 | 56.1% ± 5.0 | 39.7% ± 1.3 | 394 / 700 | 6.6% ± 0.2 | 8.7% ± 0.3 | 619 | 0 | 1.89 / 104.1 |
| cb.fire.Firestarter 2.0f | rumble-7 | 50.0% ± 2.6 | 47.9% ± 4.1 | 52.2% ± 1.2 | 337 / 700 | 8.2% ± 0.2 | 8.4% ± 0.2 | 629 | 0 | 1.80 / 162.6 |
| dsekercioglu.mega.Raven 3.56j8 | rumble-8 | 54.5% ± 2.1 | 67.9% ± 3.2 | 40.7% ± 1.2 | 475 / 700 | 9.6% ± 0.3 | 9.0% ± 0.3 | 280 | 0 | 1.25 / 219.5 |
| xander.cat.XanderCat 12.9 | rumble-9 | 56.8% ± 2.7 | 62.0% ± 3.8 | 51.5% ± 1.9 | 435 / 700 | 11.7% ± 0.4 | 8.4% ± 0.3 | 406 | 0 | 1.27 / 159.9 |
| lxx.Tomcat 3.68 | rumble-10 | 52.8% ± 2.7 | 63.8% ± 4.0 | 42.5% ± 1.5 | 447 / 700 | 9.4% ± 0.2 | 10.4% ± 0.2 | 619 | 0 | 2.11 / 207.8 |
| rsalesc.mega.Knight 0.6.28 | rumble-11 | 55.4% ± 2.3 | 58.0% ± 3.6 | 52.2% ± 1.3 | 406 / 700 | 9.5% ± 0.3 | 9.8% ± 0.2 | 660 | 0 | 2.19 / 112.4 |
| aw.Gilgalad 1.99.5c | rumble-12 | 47.2% ± 2.8 | 55.7% ± 4.5 | 39.3% ± 1.8 | 391 / 700 | 9.0% ± 0.7 | 10.5% ± 0.3 | 564 | 0 | 1.53 / 249.9 |
| pc.Wavelet 1.5 | rumble-13 | 47.5% ± 3.0 | 45.4% ± 4.9 | 50.4% ± 1.2 | 318 / 700 | 10.2% ± 0.3 | 8.6% ± 0.2 | 319 | 0 | 1.86 / 77.1 |
| gh.GresSuffurd 0.4.13 | rumble-14 | 62.0% ± 2.1 | 74.2% ± 3.1 | 49.2% ± 1.5 | 520 / 700 | 11.0% ± 0.1 | 8.2% ± 0.2 | 337 | 0 | 1.10 / 78.4 |
| kc.serpent.WaveSerpent 2.11 | rumble-15 | 59.8% ± 2.3 | 75.4% ± 3.6 | 42.6% ± 1.0 | 528 / 700 | 9.0% ± 0.3 | 7.6% ± 0.3 | 200 | 0 | 2.19 / 356.2 |
| dsekercioglu.mega.WhiteFang 2.8.1 | rumble-17 | 67.2% ± 1.8 | 82.3% ± 2.4 | 50.4% ± 1.5 | 577 / 700 | 10.8% ± 0.2 | 7.7% ± 0.2 | 297 | 0 | 1.20 / 147.4 |
| cs.Nene 1.0.5 | rumble-18 | 56.7% ± 1.7 | 73.9% ± 2.4 | 38.9% ± 1.3 | 517 / 700 | 9.4% ± 0.3 | 8.0% ± 0.2 | 238 | 0 | 1.29 / 35.7 |
| jk.melee.Neuromancer 7.12 | rumble-19 | 49.6% ± 2.1 | 52.8% ± 3.2 | 46.8% ± 1.3 | 370 / 700 | 9.9% ± 0.3 | 10.2% ± 0.2 | 879 | 0 | 1.86 / 131.2 |
| voidious.Dookious 1.573c | rumble-20 | 59.0% ± 2.3 | 74.7% ± 3.3 | 41.5% ± 1.5 | 523 / 700 | 9.2% ± 0.2 | 7.2% ± 0.3 | 244 | 0 | 1.31 / 16.3 |
| davidalves.Phoenix 1.02 | rumble-21 | 57.5% ± 1.8 | 74.7% ± 2.4 | 40.0% ± 1.4 | 523 / 700 | 9.8% ± 0.3 | 8.0% ± 0.2 | 286 | 0 | 1.26 / 21.3 |
| rsalesc.roborio.Roborio 1.2.4 | rumble-22 | 62.3% ± 2.2 | 61.1% ± 3.8 | 62.2% ± 1.6 | 428 / 700 | 12.0% ± 0.3 | 9.3% ± 0.3 | 692 | 0 | 1.83 / 38.5 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 20 | 16 | 298 | 0 | 0.60 | 3 | 1 | 0 |
| jk.mega.DrussGT 3.1.16 | 20 | 7 | 1609 | 1 | 1.15 | 10 | 9 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 20 | 17 | 307 | 0 | 0.30 | 1 | 1 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 20 | 16 | 596 | 0 | 1.00 | 2 | 2 | 0 |
| voidious.Diamond 1.8.22 | 20 | 12 | 298 | 0 | 0.88 | 8 | 8 | 0 |
| cb.fire.Firestarter 2.0f | 20 | 19 | 298 | 0 | 0.90 | 0 | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 20 | 14 | 0 | 0 | 0.40 | 6 | 6 | 0 |
| xander.cat.XanderCat 12.9 | 20 | 13 | 1490 | 0 | 0.58 | 4 | 4 | 20 |
| lxx.Tomcat 3.68 | 20 | 16 | 0 | 0 | 0.88 | 4 | 3 | 0 |
| rsalesc.mega.Knight 0.6.28 | 20 | 11 | 0 | 0 | 0.94 | 9 | 9 | 0 |
| aw.Gilgalad 1.99.5c | 20 | 11 | 0 | 0 | 0.81 | 9 | 9 | 0 |
| pc.Wavelet 1.5 | 20 | 9 | 230 | 0 | 0.46 | 10 | 10 | 0 |
| gh.GresSuffurd 0.4.13 | 20 | 14 | 0 | 0 | 0.48 | 6 | 6 | 0 |
| kc.serpent.WaveSerpent 2.11 | 20 | 15 | 0 | 0 | 0.29 | 5 | 5 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 20 | 17 | 0 | 0 | 0.42 | 3 | 3 | 0 |
| cs.Nene 1.0.5 | 20 | 18 | 511 | 0 | 0.34 | 0 | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 20 | 13 | 1960 | 0 | 1.26 | 0 | 0 | 0 |
| voidious.Dookious 1.573c | 20 | 19 | 75 | 0 | 0.35 | 0 | 0 | 0 |
| davidalves.Phoenix 1.02 | 20 | 17 | 298 | 0 | 0.41 | 2 | 2 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 20 | 6 | 3304 | 0 | 0.99 | 5 | 5 | 0 |

280 of 400 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 95227 | 1284 | 99378 | 95161 (99.9%) | 66 (0.1%) | 4217 (4.2%) | 3934 | 595 | 404 |
| jk.mega.DrussGT 3.1.16 | 186386 | 25 | 186266 | 186245 (99.9%) | 141 (0.1%) | 21 (0.0%) | 11740 | 1270 | 689 |
| oog.mega.saguaro.Saguaro 1.0 | 22993 | 39 | 22980 | 22959 (99.9%) | 34 (0.1%) | 21 (0.1%) | 1456 | 351 | 71 |
| aaa.r.ScalarR 0.005h.053-noshield | 148210 | 57 | 152188 | 148153 (100.0%) | 57 (0.0%) | 4035 (2.7%) | 8960 | 1640 | 711 |
| voidious.Diamond 1.8.22 | 159068 | 3110 | 164965 | 159030 (100.0%) | 38 (0.0%) | 5935 (3.6%) | 9851 | 959 | 533 |
| cb.fire.Firestarter 2.0f | 168185 | 3863 | 195510 | 168073 (99.9%) | 112 (0.1%) | 27437 (14.0%) | 14743 | 1346 | 626 |
| dsekercioglu.mega.Raven 3.56j8 | 60715 | 327 | 60711 | 60708 (100.0%) | 7 (0.0%) | 3 (0.0%) | 4474 | 689 | 181 |
| xander.cat.XanderCat 12.9 | 63820 | 19 | 65813 | 63677 (99.8%) | 143 (0.2%) | 2136 (3.2%) | 6946 | 855 | 612 |
| lxx.Tomcat 3.68 | 117069 | 2320 | 117428 | 116926 (99.9%) | 143 (0.1%) | 502 (0.4%) | 9439 | 965 | 567 |
| rsalesc.mega.Knight 0.6.28 | 179627 | 1492 | 179609 | 179561 (100.0%) | 66 (0.0%) | 48 (0.0%) | 14756 | 1475 | 633 |
| aw.Gilgalad 1.99.5c | 98051 | 27 | 98716 | 98044 (100.0%) | 7 (0.0%) | 672 (0.7%) | 7391 | 926 | 494 |
| pc.Wavelet 1.5 | 66392 | 16 | 67144 | 66362 (100.0%) | 30 (0.0%) | 782 (1.2%) | 5605 | 638 | 303 |
| gh.GresSuffurd 0.4.13 | 51180 | 40 | 51189 | 51174 (100.0%) | 6 (0.0%) | 15 (0.0%) | 3696 | 479 | 242 |
| kc.serpent.WaveSerpent 2.11 | 38945 | 18 | 38947 | 38940 (100.0%) | 5 (0.0%) | 7 (0.0%) | 2793 | 306 | 117 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 57944 | 32 | 57947 | 57942 (100.0%) | 2 (0.0%) | 5 (0.0%) | 4912 | 467 | 175 |
| cs.Nene 1.0.5 | 38536 | 321 | 38484 | 38481 (99.9%) | 55 (0.1%) | 3 (0.0%) | 2353 | 299 | 329 |
| jk.melee.Neuromancer 7.12 | 107432 | 31 | 108692 | 107263 (99.8%) | 169 (0.2%) | 1429 (1.3%) | 9276 | 925 | 800 |
| voidious.Dookious 1.573c | 37602 | 55 | 37597 | 37595 (100.0%) | 7 (0.0%) | 2 (0.0%) | 2573 | 280 | 128 |
| davidalves.Phoenix 1.02 | 37586 | 27 | 37581 | 37563 (99.9%) | 23 (0.1%) | 18 (0.0%) | 2762 | 404 | 108 |
| rsalesc.roborio.Roborio 1.2.4 | 138963 | 34 | 138801 | 138693 (99.8%) | 270 (0.2%) | 108 (0.1%) | 13925 | 1120 | 565 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 94436 | 10582 (11.2%) | 92030 |
| jk.mega.DrussGT 3.1.16 | 185856 | 23690 (12.7%) | 183177 |
| oog.mega.saguaro.Saguaro 1.0 | 25806 | 1955 (7.6%) | 25654 |
| aaa.r.ScalarR 0.005h.053-noshield | 150246 | 17542 (11.7%) | 146603 |
| voidious.Diamond 1.8.22 | 160909 | 17472 (10.9%) | 156988 |
| cb.fire.Firestarter 2.0f | 193657 | 18037 (9.3%) | 188267 |
| dsekercioglu.mega.Raven 3.56j8 | 64996 | 6546 (10.1%) | 60157 |
| xander.cat.XanderCat 12.9 | 79906 | 6767 (8.5%) | 73979 |
| lxx.Tomcat 3.68 | 119509 | 13804 (11.6%) | 116976 |
| rsalesc.mega.Knight 0.6.28 | 180198 | 21368 (11.9%) | 176794 |
| aw.Gilgalad 1.99.5c | 99926 | 10419 (10.4%) | 95156 |
| pc.Wavelet 1.5 | 77167 | 7293 (9.5%) | 73755 |
| gh.GresSuffurd 0.4.13 | 54184 | 5468 (10.1%) | 49156 |
| kc.serpent.WaveSerpent 2.11 | 50704 | 3668 (7.2%) | 34078 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 66122 | 6281 (9.5%) | 60783 |
| cs.Nene 1.0.5 | 43157 | 4092 (9.5%) | 38065 |
| jk.melee.Neuromancer 7.12 | 114944 | 11648 (10.1%) | 110296 |
| voidious.Dookious 1.573c | 46311 | 3604 (7.8%) | 34319 |
| davidalves.Phoenix 1.02 | 47046 | 3697 (7.9%) | 40598 |
| rsalesc.roborio.Roborio 1.2.4 | 155446 | 14898 (9.6%) | 153332 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 537 | 650 | 1646 | 20.0 / 27.3 | 0 | 1595 | 400 |
| jk.mega.DrussGT 3.1.16 | 650 | 516 | 650 | 3107 | 27.4 / 31.0 | 36 | 24663 | 1847 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 436 | 456 | 521 | 44.1 / 25.5 | 3236 | 9577 | 2011 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 484 | 650 | 2523 | 23.1 / 33.7 | 1 | 4823 | 7 |
| voidious.Diamond 1.8.22 | 650 | 537 | 650 | 2687 | 21.0 / 31.8 | 361 | 40940 | 1015 |
| cb.fire.Firestarter 2.0f | 650 | 547 | 650 | 3183 | 29.2 / 26.8 | 252 | 22355 | 611 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 453 | 650 | 1148 | 24.0 / 35.0 | 582 | 54509 | 6835 |
| xander.cat.XanderCat 12.9 | 650 | 452 | 650 | 1418 | 34.2 / 32.1 | 1156 | 6350 | 174 |
| lxx.Tomcat 3.68 | 650 | 511 | 650 | 2014 | 26.8 / 36.3 | 576 | 81638 | 35 |
| rsalesc.mega.Knight 0.6.28 | 650 | 509 | 650 | 3015 | 32.3 / 29.6 | 1395 | 37965 | 235 |
| aw.Gilgalad 1.99.5c | 650 | 482 | 640 | 1716 | 23.9 / 36.6 | 929 | 67118 | 167 |
| pc.Wavelet 1.5 | 650 | 441 | 648 | 1376 | 30.7 / 30.2 | 904 | 12529 | 42 |
| gh.GresSuffurd 0.4.13 | 650 | 460 | 650 | 994 | 29.7 / 30.6 | 1780 | 22529 | 356 |
| kc.serpent.WaveSerpent 2.11 | 650 | 477 | 650 | 919 | 24.2 / 32.5 | 380 | 30508 | 10 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 650 | 463 | 631 | 1167 | 29.3 / 28.7 | 1136 | 60871 | 674 |
| cs.Nene 1.0.5 | 650 | 472 | 650 | 785 | 22.9 / 35.9 | 428 | 27501 | 6576 |
| jk.melee.Neuromancer 7.12 | 650 | 530 | 650 | 1938 | 30.2 / 34.3 | 609 | 41372 | 79 |
| voidious.Dookious 1.573c | 650 | 486 | 650 | 842 | 22.8 / 32.2 | 357 | 23790 | 11758 |
| davidalves.Phoenix 1.02 | 650 | 461 | 650 | 851 | 24.0 / 35.9 | 483 | 26322 | 398 |
| rsalesc.roborio.Roborio 1.2.4 | 650 | 502 | 636 | 2620 | 42.2 / 25.6 | 3126 | 24797 | 378 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 8.8% | 420 | 3836 | 3 | 140.6 | 10559 / 10582 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 10.2% | 802 | 12471 | 3 | 263.2 | 23553 / 23690 (99%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 6.6% | 209 | 174 | 3 | 32.7 | 1930 / 1955 (99%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10.3% | 699 | 3957 | 3 | 216.7 | 17521 / 17542 (100%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 8.7% | 619 | 7427 | 3 | 233.2 | 17441 / 17472 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 8.4% | 629 | 22868 | 3 | 278.4 | 17940 / 18037 (99%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 9.0% | 280 | 1739 | 3 | 85.9 | 6527 / 6546 (100%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 8.4% | 406 | 2972 | 3 | 92.9 | 6651 / 6767 (98%) | 0 | 0 |
| lxx.Tomcat 3.68 | 10.4% | 619 | 3584 | 3 | 167.4 | 13784 / 13804 (100%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 9.8% | 660 | 6848 | 3 | 253.7 | 21353 / 21368 (100%) | 0 | 0 |
| aw.Gilgalad 1.99.5c | 10.5% | 564 | 5085 | 3 | 139.5 | 10403 / 10419 (100%) | 0 | 0 |
| pc.Wavelet 1.5 | 8.6% | 319 | 462 | 3 | 94.8 | 7284 / 7293 (100%) | 0 | 0 |
| gh.GresSuffurd 0.4.13 | 8.2% | 337 | 2997 | 3 | 72.2 | 5464 / 5468 (100%) | 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 7.6% | 200 | 3285 | 3 | 54.9 | 3667 / 3668 (100%) | 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 7.7% | 297 | 2480 | 3 | 82.1 | 6275 / 6281 (100%) | 0 | 0 |
| cs.Nene 1.0.5 | 8.0% | 238 | 12684 | 3 | 54.9 | 4064 / 4092 (99%) | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 10.2% | 879 | 18819 | 3 | 154.5 | 11615 / 11648 (100%) | 0 | 0 |
| voidious.Dookious 1.573c | 7.2% | 244 | 2372 | 3 | 53.6 | 3599 / 3604 (100%) | 0 | 0 |
| davidalves.Phoenix 1.02 | 8.0% | 286 | 1539 | 3 | 53.6 | 3690 / 3697 (100%) | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 9.3% | 692 | 8705 | 3 | 195.8 | 14764 / 14898 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| voidious.Diamond 1.8.22 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cb.fire.Firestarter 2.0f | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| xander.cat.XanderCat 12.9 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lxx.Tomcat 3.68 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| aw.Gilgalad 1.99.5c | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pc.Wavelet 1.5 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| gh.GresSuffurd 0.4.13 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cs.Nene 1.0.5 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jk.melee.Neuromancer 7.12 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| voidious.Dookious 1.573c | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.Phoenix 1.02 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## First rounds against last rounds

Per battle, the first 5 rounds against the last 10, then the paired difference (last minus first) over battles with its 95% interval. Win rate is rounds won over rounds with an R record; damage share is bullet damage dealt over dealt plus taken. Positive means the robot does better late in the battle.

| Opponent | Build | Battles | Win rate, first 5 | Win rate, last 10 | Late minus early (pp) | Damage share, first 5 | Damage share, last 10 | Late minus early (pp) |
|---|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | hadur2.Hadur 3.9 | 20 | 24.0% ± 8.9 | 30.5% ± 6.9 | +6.5 ± 11.1 | 46.2% ± 3.2 | 40.2% ± 2.1 | -6.0 ± 3.6 |
| aaa.r.ScalarR 0.005h.053-noshield | hadur2.Hadur 3.8.5 | 20 | 18.0% ± 6.7 | 23.1% ± 6.8 | +5.1 ± 9.2 | 42.7% ± 3.5 | 38.9% ± 1.9 | -3.8 ± 4.1 |
| aw.Gilgalad 1.99.5c | hadur2.Hadur 3.9 | 20 | 53.0% ± 12.6 | 57.3% ± 5.5 | +4.3 ± 14.5 | 41.6% ± 5.1 | 41.4% ± 2.7 | -0.2 ± 5.1 |
| aw.Gilgalad 1.99.5c | hadur2.Hadur 3.8.5 | 20 | 50.0% ± 9.4 | 55.3% ± 7.7 | +5.3 ± 10.9 | 39.9% ± 3.7 | 38.6% ± 2.7 | -1.3 ± 5.3 |
| cb.fire.Firestarter 2.0f | hadur2.Hadur 3.9 | 20 | 40.0% ± 9.1 | 56.5% ± 5.5 | +16.5 ± 10.0 | 54.9% ± 4.0 | 52.7% ± 2.1 | -2.2 ± 4.2 |
| cb.fire.Firestarter 2.0f | hadur2.Hadur 3.8.5 | 20 | 35.0% ± 10.5 | 47.5% ± 7.3 | +12.5 ± 13.8 | 53.3% ± 4.1 | 51.1% ± 2.4 | -2.2 ± 5.0 |
| cs.Nene 1.0.5 | hadur2.Hadur 3.9 | 20 | 82.0% ± 10.0 | 72.5% ± 7.4 | -9.5 ± 13.1 | 45.9% ± 3.7 | 39.1% ± 2.9 | -6.7 ± 4.7 |
| cs.Nene 1.0.5 | hadur2.Hadur 3.8.5 | 20 | 71.0% ± 8.3 | 66.5% ± 7.8 | -4.5 ± 13.3 | 39.3% ± 3.8 | 37.0% ± 2.2 | -2.4 ± 4.2 |
| davidalves.Phoenix 1.02 | hadur2.Hadur 3.9 | 20 | 64.0% ± 9.9 | 77.4% ± 6.9 | +13.4 ± 11.1 | 37.9% ± 3.6 | 38.5% ± 2.9 | +0.6 ± 3.9 |
| davidalves.Phoenix 1.02 | hadur2.Hadur 3.8.5 | 20 | 63.0% ± 11.1 | 72.9% ± 5.9 | +9.9 ± 12.7 | 39.1% ± 4.2 | 38.6% ± 2.3 | -0.5 ± 5.4 |
| dsekercioglu.mega.Raven 3.56j8 | hadur2.Hadur 3.9 | 20 | 69.0% ± 9.3 | 66.9% ± 7.0 | -2.1 ± 11.6 | 45.5% ± 3.9 | 37.2% ± 1.9 | -8.2 ± 4.6 |
| dsekercioglu.mega.Raven 3.56j8 | hadur2.Hadur 3.8.5 | 20 | 76.0% ± 7.2 | 67.7% ± 6.7 | -8.3 ± 9.8 | 47.6% ± 4.3 | 37.4% ± 2.4 | -10.2 ± 5.5 |
| dsekercioglu.mega.WhiteFang 2.8.1 | hadur2.Hadur 3.9 | 20 | 88.0% ± 8.3 | 79.1% ± 6.2 | -8.9 ± 12.2 | 54.4% ± 2.3 | 50.0% ± 4.3 | -4.4 ± 5.4 |
| dsekercioglu.mega.WhiteFang 2.8.1 | hadur2.Hadur 3.8.5 | 20 | 83.0% ± 7.6 | 80.2% ± 5.8 | -2.8 ± 11.3 | 54.3% ± 4.0 | 46.9% ± 2.7 | -7.4 ± 5.2 |
| gh.GresSuffurd 0.4.13 | hadur2.Hadur 3.9 | 20 | 67.0% ± 6.3 | 74.5% ± 6.8 | +7.5 ± 8.5 | 48.0% ± 3.3 | 46.2% ± 3.0 | -1.8 ± 4.9 |
| gh.GresSuffurd 0.4.13 | hadur2.Hadur 3.8.5 | 20 | 70.0% ± 9.4 | 80.7% ± 7.8 | +10.7 ± 13.8 | 48.9% ± 4.7 | 49.3% ± 3.5 | +0.4 ± 7.3 |
| jk.mega.DrussGT 3.1.16 | hadur2.Hadur 3.9 | 20 | 53.0% ± 7.0 | 42.2% ± 7.2 | -10.8 ± 10.6 | 55.6% ± 2.9 | 44.1% ± 2.0 | -11.4 ± 3.9 |
| jk.mega.DrussGT 3.1.16 | hadur2.Hadur 3.8.5 | 20 | 53.3% ± 7.4 | 51.3% ± 7.9 | -2.0 ± 8.2 | 57.3% ± 2.5 | 44.5% ± 2.5 | -12.8 ± 3.0 |
| jk.melee.Neuromancer 7.12 | hadur2.Hadur 3.9 | 20 | 49.0% ± 11.1 | 62.0% ± 5.6 | +13.0 ± 11.9 | 54.5% ± 3.4 | 46.6% ± 1.9 | -7.9 ± 3.1 |
| jk.melee.Neuromancer 7.12 | hadur2.Hadur 3.8.5 | 20 | 36.0% ± 10.3 | 57.0% ± 7.6 | +21.0 ± 12.3 | 49.7% ± 4.7 | 45.2% ± 2.3 | -4.5 ± 4.8 |
| kc.mega.BeepBoop 2.0 | hadur2.Hadur 3.9 | 20 | 6.0% ± 4.4 | 17.5% ± 5.7 | +11.5 ± 6.7 | 38.5% ± 3.6 | 41.9% ± 2.4 | +3.4 ± 4.9 |
| kc.mega.BeepBoop 2.0 | hadur2.Hadur 3.8.5 | 20 | 6.0% ± 5.3 | 14.7% ± 4.9 | +8.7 ± 7.1 | 42.9% ± 3.7 | 41.3% ± 2.9 | -1.7 ± 4.6 |
| kc.serpent.WaveSerpent 2.11 | hadur2.Hadur 3.9 | 20 | 78.0% ± 6.0 | 80.6% ± 6.4 | +2.6 ± 7.9 | 44.3% ± 3.0 | 41.7% ± 2.3 | -2.6 ± 3.6 |
| kc.serpent.WaveSerpent 2.11 | hadur2.Hadur 3.8.5 | 20 | 83.0% ± 8.2 | 78.1% ± 5.0 | -4.9 ± 8.5 | 48.2% ± 4.0 | 41.2% ± 1.7 | -7.0 ± 4.1 |
| lxx.Tomcat 3.68 | hadur2.Hadur 3.9 | 20 | 69.0% ± 11.1 | 67.3% ± 7.7 | -1.7 ± 13.2 | 46.3% ± 5.7 | 43.4% ± 2.2 | -2.9 ± 6.4 |
| lxx.Tomcat 3.68 | hadur2.Hadur 3.8.5 | 20 | 68.8% ± 10.2 | 69.6% ± 7.0 | +0.9 ± 12.6 | 45.6% ± 5.4 | 43.2% ± 2.0 | -2.4 ± 6.3 |
| oog.mega.saguaro.Saguaro 1.0 | hadur2.Hadur 3.9 | 20 | 84.8% ± 4.3 | 84.0% ± 6.5 | -0.8 ± 5.7 | 89.7% ± 1.2 | 51.7% ± 4.2 | -38.0 ± 4.2 |
| oog.mega.saguaro.Saguaro 1.0 | hadur2.Hadur 3.8.5 | 20 | 86.0% ± 4.4 | 80.9% ± 6.0 | -5.1 ± 6.7 | 90.7% ± 1.3 | 51.5% ± 4.9 | -39.3 ± 5.2 |
| pc.Wavelet 1.5 | hadur2.Hadur 3.9 | 20 | 31.0% ± 12.3 | 56.7% ± 8.6 | +25.7 ± 11.2 | 54.2% ± 3.5 | 48.1% ± 3.7 | -6.1 ± 3.6 |
| pc.Wavelet 1.5 | hadur2.Hadur 3.8.5 | 20 | 42.0% ± 13.2 | 47.7% ± 7.4 | +5.7 ± 14.2 | 56.3% ± 3.3 | 47.1% ± 2.2 | -9.2 ± 4.0 |
| rsalesc.mega.Knight 0.6.28 | hadur2.Hadur 3.9 | 20 | 45.0% ± 9.0 | 60.8% ± 8.5 | +15.8 ± 13.1 | 58.1% ± 2.5 | 51.1% ± 2.6 | -7.0 ± 3.4 |
| rsalesc.mega.Knight 0.6.28 | hadur2.Hadur 3.8.5 | 20 | 40.0% ± 10.1 | 60.8% ± 8.4 | +20.8 ± 15.4 | 56.9% ± 3.1 | 50.7% ± 2.1 | -6.2 ± 3.5 |
| rsalesc.roborio.Roborio 1.2.4 | hadur2.Hadur 3.9 | 20 | 55.0% ± 9.5 | 62.1% ± 9.1 | +7.1 ± 12.9 | 69.5% ± 3.4 | 59.9% ± 2.6 | -9.6 ± 4.2 |
| rsalesc.roborio.Roborio 1.2.4 | hadur2.Hadur 3.8.5 | 20 | 54.0% ± 9.2 | 63.9% ± 9.1 | +9.9 ± 11.9 | 68.6% ± 2.6 | 60.2% ± 2.6 | -8.3 ± 3.9 |
| voidious.Diamond 1.8.22 | hadur2.Hadur 3.9 | 20 | 52.0% ± 8.3 | 53.9% ± 8.1 | +1.9 ± 13.6 | 44.7% ± 3.9 | 38.0% ± 2.1 | -6.8 ± 4.4 |
| voidious.Diamond 1.8.22 | hadur2.Hadur 3.8.5 | 20 | 46.0% ± 6.9 | 59.7% ± 7.8 | +13.7 ± 10.6 | 41.8% ± 3.1 | 39.3% ± 1.8 | -2.5 ± 3.5 |
| voidious.Dookious 1.573c | hadur2.Hadur 3.9 | 20 | 71.0% ± 9.8 | 71.3% ± 4.6 | +0.3 ± 11.8 | 43.0% ± 2.9 | 40.4% ± 1.3 | -2.7 ± 2.6 |
| voidious.Dookious 1.573c | hadur2.Hadur 3.8.5 | 20 | 64.0% ± 7.8 | 74.0% ± 7.2 | +10.0 ± 10.7 | 41.9% ± 3.0 | 38.3% ± 2.5 | -3.5 ± 3.4 |
| xander.cat.XanderCat 12.9 | hadur2.Hadur 3.9 | 20 | 73.0% ± 9.7 | 61.1% ± 9.4 | -11.9 ± 9.9 | 52.1% ± 4.0 | 49.6% ± 3.4 | -2.5 ± 5.1 |
| xander.cat.XanderCat 12.9 | hadur2.Hadur 3.8.5 | 20 | 64.0% ± 9.4 | 61.6% ± 6.3 | -2.4 ± 13.1 | 52.8% ± 3.3 | 53.1% ± 2.7 | +0.3 ± 3.9 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | +6.0 ± 8.6 | +7.4 ± 11.1 | +3.5 ± 3.4 | +1.4 ± 3.0 |
| aw.Gilgalad 1.99.5c | +3.0 ± 14.3 | +1.9 ± 8.8 | +1.7 ± 5.7 | +2.8 ± 3.8 |
| cb.fire.Firestarter 2.0f | +5.0 ± 15.1 | +9.0 ± 9.9 | +1.6 ± 5.3 | +1.5 ± 3.4 |
| cs.Nene 1.0.5 | +11.0 ± 11.6 | +6.0 ± 8.9 | +6.5 ± 4.6 | +2.2 ± 3.9 |
| davidalves.Phoenix 1.02 | +1.0 ± 13.1 | +4.4 ± 6.0 | -1.2 ± 5.2 | -0.1 ± 3.4 |
| dsekercioglu.mega.Raven 3.56j8 | -7.0 ± 9.7 | -0.7 ± 9.6 | -2.1 ± 5.7 | -0.2 ± 3.0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | +5.0 ± 9.0 | -1.1 ± 8.8 | +0.1 ± 4.2 | +3.1 ± 5.1 |
| gh.GresSuffurd 0.4.13 | -3.0 ± 13.3 | -6.2 ± 7.6 | -0.9 ± 5.4 | -3.2 ± 4.5 |
| jk.mega.DrussGT 3.1.16 | -0.2 ± 10.7 | -9.1 ± 10.2 | -1.7 ± 3.8 | -0.4 ± 3.5 |
| jk.melee.Neuromancer 7.12 | +13.0 ± 13.3 | +5.0 ± 9.9 | +4.7 ± 5.7 | +1.3 ± 2.7 |
| kc.mega.BeepBoop 2.0 | +0.0 ± 6.8 | +2.8 ± 7.0 | -4.4 ± 4.4 | +0.6 ± 3.9 |
| kc.serpent.WaveSerpent 2.11 | -5.0 ± 12.1 | +2.4 ± 8.1 | -3.9 ± 5.2 | +0.5 ± 2.6 |
| lxx.Tomcat 3.68 | +0.3 ± 17.0 | -2.3 ± 9.9 | +0.8 ± 7.1 | +0.3 ± 2.6 |
| oog.mega.saguaro.Saguaro 1.0 | -1.3 ± 4.8 | +3.1 ± 9.0 | -1.1 ± 2.0 | +0.2 ± 6.9 |
| pc.Wavelet 1.5 | -11.0 ± 19.1 | +9.1 ± 10.8 | -2.1 ± 5.6 | +1.0 ± 3.5 |
| rsalesc.mega.Knight 0.6.28 | +5.0 ± 12.8 | -0.0 ± 12.1 | +1.2 ± 4.0 | +0.4 ± 2.8 |
| rsalesc.roborio.Roborio 1.2.4 | +1.0 ± 13.4 | -1.8 ± 13.6 | +0.9 ± 4.5 | -0.3 ± 4.1 |
| voidious.Diamond 1.8.22 | +6.0 ± 8.6 | -5.8 ± 11.3 | +2.9 ± 4.6 | -1.3 ± 3.2 |
| voidious.Dookious 1.573c | +7.0 ± 13.3 | -2.7 ± 8.2 | +1.2 ± 3.0 | +2.1 ± 2.7 |
| xander.cat.XanderCat 12.9 | +9.0 ± 12.3 | -0.4 ± 13.2 | -0.7 ± 4.7 | -3.5 ± 4.6 |
