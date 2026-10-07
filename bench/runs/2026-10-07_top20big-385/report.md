# Bench: hadur2.Hadur 3.8.5 (cold)

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 45564 over 2000 battles (22.8 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 25.3% ± 0.8 | 12.9% ± 1.0 | 42.5% ± 0.6 | 456 / 3500 | 5.0% ± 0.1 | 8.7% ± 0.1 | 2233 | 0 | 2.06 / 732.5 |
| jk.mega.DrussGT 3.1.16 | rumble-3 | 46.6% ± 1.0 | 46.9% ± 1.7 | 46.3% ± 0.4 | 1646 / 3500 | 7.4% ± 0.1 | 10.1% ± 0.1 | 3493 | 0 | 1.60 / 711.6 |
| oog.mega.saguaro.Saguaro 1.0 | rumble-4 | 72.7% ± 1.0 | 84.3% ± 1.4 | 61.5% ± 0.8 | 2949 / 3500 | 18.4% ± 0.2 | 6.8% ± 0.1 | 1502 | 0 | 2.22 / 773.5 |
| aaa.r.ScalarR 0.005h.053-noshield | rumble-5 | 32.0% ± 0.9 | 25.2% ± 1.5 | 40.4% ± 0.5 | 884 / 3500 | 6.7% ± 0.1 | 10.6% ± 0.1 | 3593 | 0 | 1.95 / 899.3 |
| voidious.Diamond 1.8.22 | rumble-6 | 48.0% ± 1.2 | 55.4% ± 1.7 | 40.2% ± 0.6 | 1945 / 3500 | 6.7% ± 0.1 | 8.7% ± 0.1 | 2974 | 0 | 1.87 / 538.7 |
| cb.fire.Firestarter 2.0f | rumble-7 | 50.3% ± 1.1 | 49.1% ± 1.7 | 51.8% ± 0.6 | 1719 / 3500 | 8.2% ± 0.1 | 8.4% ± 0.1 | 3096 | 0 | 1.84 / 173.8 |
| dsekercioglu.mega.Raven 3.56j8 | rumble-8 | 55.9% ± 1.1 | 70.6% ± 1.6 | 40.6% ± 0.7 | 2470 / 3500 | 9.7% ± 0.1 | 9.0% ± 0.1 | 1412 | 0 | 1.25 / 295.8 |
| xander.cat.XanderCat 12.9 | rumble-9 | 56.8% ± 1.1 | 63.4% ± 1.7 | 50.3% ± 0.8 | 2220 / 3500 | 11.5% ± 0.1 | 8.4% ± 0.1 | 2087 | 0 | 1.33 / 851.6 |
| lxx.Tomcat 3.68 | rumble-10 | 54.6% ± 1.0 | 66.3% ± 1.5 | 43.2% ± 0.5 | 2326 / 3500 | 9.4% ± 0.1 | 10.3% ± 0.1 | 2977 | 0 | 2.21 / 138.4 |
| rsalesc.mega.Knight 0.6.28 | rumble-11 | 54.0% ± 1.1 | 56.4% ± 1.8 | 51.1% ± 0.5 | 1977 / 3500 | 9.3% ± 0.1 | 9.9% ± 0.1 | 3328 | 0 | 2.21 / 373.7 |
| aw.Gilgalad 1.99.5c | rumble-12 | 49.2% ± 1.2 | 58.1% ± 1.6 | 40.7% ± 1.0 | 2036 / 3500 | 9.3% ± 0.3 | 10.2% ± 0.1 | 2746 | 0 | 1.57 / 680.8 |
| pc.Wavelet 1.5 | rumble-13 | 48.2% ± 1.1 | 46.7% ± 1.8 | 50.6% ± 0.6 | 1633 / 3500 | 10.1% ± 0.1 | 8.8% ± 0.1 | 1515 | 0 | 1.99 / 588.3 |
| gh.GresSuffurd 0.4.13 | rumble-14 | 62.4% ± 1.0 | 74.8% ± 1.4 | 49.5% ± 0.7 | 2620 / 3500 | 11.2% ± 0.1 | 8.3% ± 0.1 | 1804 | 0 | 1.11 / 755.2 |
| kc.serpent.WaveSerpent 2.11 | rumble-15 | 58.2% ± 1.1 | 73.9% ± 1.6 | 41.1% ± 0.5 | 2589 / 3500 | 9.0% ± 0.1 | 7.7% ± 0.1 | 1074 | 0 | 2.23 / 544.6 |
| dsekercioglu.mega.WhiteFang 2.8.1 | rumble-17 | 68.1% ± 0.9 | 83.4% ± 1.2 | 51.4% ± 0.8 | 2919 / 3500 | 10.9% ± 0.1 | 7.8% ± 0.1 | 1724 | 0 | 1.24 / 761.2 |
| cs.Nene 1.0.5 | rumble-18 | 58.2% ± 1.1 | 75.3% ± 1.5 | 40.4% ± 0.8 | 2634 / 3500 | 9.6% ± 0.1 | 7.8% ± 0.1 | 1255 | 0 | 1.30 / 1019.7 |
| jk.melee.Neuromancer 7.12 | rumble-19 | 50.3% ± 1.1 | 53.2% ± 2.0 | 48.0% ± 0.5 | 1867 / 3500 | 9.9% ± 0.1 | 10.1% ± 0.1 | 3962 | 0 | 1.83 / 533.5 |
| voidious.Dookious 1.573c | rumble-20 | 59.6% ± 1.0 | 74.8% ± 1.4 | 42.6% ± 0.6 | 2617 / 3500 | 9.4% ± 0.1 | 7.2% ± 0.1 | 1144 | 0 | 1.27 / 1451.7 |
| davidalves.Phoenix 1.02 | rumble-21 | 57.2% ± 0.9 | 74.0% ± 1.2 | 40.2% ± 0.7 | 2591 / 3500 | 9.8% ± 0.1 | 8.1% ± 0.1 | 1154 | 0 in 1 round(s) | 1.17 / 1105.3 |
| rsalesc.roborio.Roborio 1.2.4 | rumble-22 | 61.0% ± 0.9 | 58.3% ± 1.6 | 62.3% ± 0.6 | 2041 / 3500 | 11.9% ± 0.1 | 9.0% ± 0.1 | 2491 | 0 | 1.71 / 1207.1 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 100 | 93 | 595 | 0 | 0.64 | 5 | 3 | 0 |
| jk.mega.DrussGT 3.1.16 | 100 | 37 | 2384 | 0 | 1.00 | 60 | 59 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 100 | 81 | 5066 | 2 | 0.43 | 1 | 1 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 100 | 57 | 8399 | 1 | 1.03 | 16 | 16 | 0 |
| voidious.Diamond 1.8.22 | 100 | 42 | 1349 | 1 | 0.85 | 56 | 54 | 0 |
| cb.fire.Firestarter 2.0f | 100 | 89 | 2786 | 0 | 0.88 | 2 | 1 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 100 | 54 | 1115 | 0 | 0.40 | 42 | 41 | 0 |
| xander.cat.XanderCat 12.9 | 100 | 77 | 3364 | 1 | 0.60 | 14 | 14 | 100 |
| lxx.Tomcat 3.68 | 100 | 73 | 65 | 0 | 0.85 | 26 | 25 | 0 |
| rsalesc.mega.Knight 0.6.28 | 100 | 46 | 894 | 0 | 0.95 | 56 | 52 | 0 |
| aw.Gilgalad 1.99.5c | 100 | 62 | 557 | 0 | 0.78 | 37 | 36 | 0 |
| pc.Wavelet 1.5 | 100 | 56 | 577 | 0 | 0.43 | 43 | 40 | 0 |
| gh.GresSuffurd 0.4.13 | 100 | 69 | 2086 | 1 | 0.52 | 28 | 27 | 0 |
| kc.serpent.WaveSerpent 2.11 | 100 | 76 | 596 | 0 | 0.31 | 22 | 22 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 100 | 59 | 6171 | 1 | 0.49 | 21 | 21 | 0 |
| cs.Nene 1.0.5 | 100 | 93 | 1271 | 1 | 0.36 | 1 | 1 | 0 |
| jk.melee.Neuromancer 7.12 | 100 | 74 | 4647 | 0 | 1.13 | 4 | 3 | 0 |
| voidious.Dookious 1.573c | 100 | 86 | 894 | 0 | 0.33 | 11 | 10 | 0 |
| davidalves.Phoenix 1.02 | 100 | 72 | 1485 | 1 | 0.33 | 23 | 19 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 100 | 63 | 1192 | 0 | 0.71 | 33 | 33 | 0 |

1359 of 2000 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 476143 | 6027 | 497299 | 475872 (99.9%) | 271 (0.1%) | 21427 (4.3%) | 20038 | 3108 | 2211 |
| jk.mega.DrussGT 3.1.16 | 907678 | 177 | 907545 | 907432 (100.0%) | 246 (0.0%) | 113 (0.0%) | 56637 | 6347 | 3346 |
| oog.mega.saguaro.Saguaro 1.0 | 117672 | 222 | 117358 | 117224 (99.6%) | 448 (0.4%) | 134 (0.1%) | 7629 | 1743 | 443 |
| aaa.r.ScalarR 0.005h.053-noshield | 724217 | 243 | 743813 | 723495 (99.9%) | 722 (0.1%) | 20318 (2.7%) | 42957 | 8080 | 3618 |
| voidious.Diamond 1.8.22 | 770102 | 15808 | 797307 | 769666 (99.9%) | 436 (0.1%) | 27641 (3.5%) | 47335 | 4709 | 3340 |
| cb.fire.Firestarter 2.0f | 824898 | 19015 | 960219 | 824222 (99.9%) | 676 (0.1%) | 135997 (14.2%) | 72149 | 6292 | 3009 |
| dsekercioglu.mega.Raven 3.56j8 | 307020 | 1635 | 306901 | 306881 (100.0%) | 139 (0.0%) | 20 (0.0%) | 22981 | 3541 | 1251 |
| xander.cat.XanderCat 12.9 | 292880 | 125 | 305293 | 292596 (99.9%) | 284 (0.1%) | 12697 (4.2%) | 31575 | 3878 | 1718 |
| lxx.Tomcat 3.68 | 595570 | 10827 | 597876 | 594951 (99.9%) | 619 (0.1%) | 2925 (0.5%) | 48659 | 4841 | 2739 |
| rsalesc.mega.Knight 0.6.28 | 895685 | 7767 | 895611 | 895355 (100.0%) | 330 (0.0%) | 256 (0.0%) | 72149 | 7382 | 2955 |
| aw.Gilgalad 1.99.5c | 480527 | 212 | 484312 | 480431 (100.0%) | 96 (0.0%) | 3881 (0.8%) | 36211 | 4534 | 2560 |
| pc.Wavelet 1.5 | 328549 | 113 | 331840 | 328483 (100.0%) | 66 (0.0%) | 3357 (1.0%) | 27944 | 3240 | 1041 |
| gh.GresSuffurd 0.4.13 | 254848 | 200 | 254711 | 254662 (99.9%) | 186 (0.1%) | 49 (0.0%) | 18308 | 2320 | 1476 |
| kc.serpent.WaveSerpent 2.11 | 195331 | 115 | 195331 | 195275 (100.0%) | 56 (0.0%) | 56 (0.0%) | 14797 | 1479 | 687 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 285337 | 199 | 284862 | 284840 (99.8%) | 497 (0.2%) | 22 (0.0%) | 23603 | 2425 | 1010 |
| cs.Nene 1.0.5 | 189806 | 1609 | 189693 | 189688 (99.9%) | 118 (0.1%) | 5 (0.0%) | 11248 | 1398 | 608 |
| jk.melee.Neuromancer 7.12 | 525600 | 128 | 531588 | 525163 (99.9%) | 437 (0.1%) | 6425 (1.2%) | 44659 | 4719 | 3970 |
| voidious.Dookious 1.573c | 185899 | 266 | 185829 | 185820 (100.0%) | 79 (0.0%) | 9 (0.0%) | 12670 | 1338 | 693 |
| davidalves.Phoenix 1.02 | 187102 | 145 | 187076 | 186988 (99.9%) | 114 (0.1%) | 88 (0.0%) | 13874 | 1830 | 492 |
| rsalesc.roborio.Roborio 1.2.4 | 695351 | 193 | 695890 | 695219 (100.0%) | 132 (0.0%) | 671 (0.1%) | 70644 | 5560 | 2253 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 473718 | 51706 (10.9%) | 459030 |
| jk.mega.DrussGT 3.1.16 | 899224 | 114605 (12.7%) | 894624 |
| oog.mega.saguaro.Saguaro 1.0 | 134643 | 10266 (7.6%) | 133426 |
| aaa.r.ScalarR 0.005h.053-noshield | 734117 | 86059 (11.7%) | 716287 |
| voidious.Diamond 1.8.22 | 777227 | 83114 (10.7%) | 758925 |
| cb.fire.Firestarter 2.0f | 950162 | 87607 (9.2%) | 924715 |
| dsekercioglu.mega.Raven 3.56j8 | 327472 | 32997 (10.1%) | 307137 |
| xander.cat.XanderCat 12.9 | 375475 | 30859 (8.2%) | 351139 |
| lxx.Tomcat 3.68 | 607115 | 69475 (11.4%) | 592385 |
| rsalesc.mega.Knight 0.6.28 | 895162 | 105786 (11.8%) | 874749 |
| aw.Gilgalad 1.99.5c | 491074 | 51409 (10.5%) | 473679 |
| pc.Wavelet 1.5 | 385491 | 35955 (9.3%) | 367011 |
| gh.GresSuffurd 0.4.13 | 269322 | 27087 (10.1%) | 245920 |
| kc.serpent.WaveSerpent 2.11 | 257211 | 18705 (7.3%) | 219710 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 325774 | 30850 (9.5%) | 302827 |
| cs.Nene 1.0.5 | 211337 | 19607 (9.3%) | 186839 |
| jk.melee.Neuromancer 7.12 | 561455 | 57537 (10.2%) | 542768 |
| voidious.Dookious 1.573c | 226571 | 17336 (7.7%) | 172162 |
| davidalves.Phoenix 1.02 | 232798 | 17985 (7.7%) | 178782 |
| rsalesc.roborio.Roborio 1.2.4 | 776470 | 73784 (9.5%) | 774381 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 536 | 650 | 1651 | 19.8 / 26.8 | 0 | 11876 | 2306 |
| jk.mega.DrussGT 3.1.16 | 650 | 516 | 650 | 3021 | 26.5 / 30.7 | 537 | 112489 | 8249 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 445 | 464 | 537 | 43.1 / 26.9 | 15967 | 45645 | 9745 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 484 | 650 | 2473 | 23.0 / 33.9 | 86 | 25496 | 50 |
| voidious.Diamond 1.8.22 | 650 | 536 | 650 | 2613 | 21.3 / 31.6 | 1792 | 240562 | 3969 |
| cb.fire.Firestarter 2.0f | 650 | 547 | 650 | 3127 | 29.1 / 27.1 | 1401 | 92940 | 3413 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 453 | 650 | 1160 | 24.0 / 35.0 | 3035 | 278478 | 32710 |
| xander.cat.XanderCat 12.9 | 650 | 452 | 650 | 1341 | 32.9 / 32.4 | 6037 | 39069 | 1530 |
| lxx.Tomcat 3.68 | 650 | 511 | 650 | 2049 | 27.0 / 35.5 | 3231 | 411136 | 212 |
| rsalesc.mega.Knight 0.6.28 | 650 | 510 | 650 | 3009 | 31.5 / 30.2 | 7042 | 163017 | 949 |
| aw.Gilgalad 1.99.5c | 650 | 480 | 650 | 1684 | 25.3 / 36.2 | 3896 | 331417 | 817 |
| pc.Wavelet 1.5 | 650 | 442 | 648 | 1373 | 30.8 / 30.0 | 4489 | 65239 | 202 |
| gh.GresSuffurd 0.4.13 | 650 | 459 | 648 | 987 | 30.4 / 30.9 | 8633 | 122429 | 2119 |
| kc.serpent.WaveSerpent 2.11 | 650 | 480 | 646 | 926 | 23.2 / 33.3 | 2285 | 161979 | 154 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 650 | 465 | 647 | 1155 | 30.1 / 28.4 | 5950 | 265753 | 3930 |
| cs.Nene 1.0.5 | 650 | 472 | 648 | 775 | 23.8 / 35.0 | 2398 | 124022 | 32722 |
| jk.melee.Neuromancer 7.12 | 650 | 529 | 650 | 1900 | 31.3 / 33.9 | 3622 | 208073 | 426 |
| voidious.Dookious 1.573c | 650 | 485 | 642 | 832 | 23.6 / 31.8 | 2397 | 102461 | 57383 |
| davidalves.Phoenix 1.02 | 650 | 461 | 649 | 846 | 24.4 / 36.1 | 2390 | 138014 | 2561 |
| rsalesc.roborio.Roborio 1.2.4 | 650 | 504 | 647 | 2620 | 41.0 / 24.7 | 15747 | 146095 | 1981 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 8.7% | 2233 | 21345 | 3 | 140.8 | 51584 / 51706 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 10.1% | 3493 | 20148 | 3 | 255.0 | 114395 / 114605 (100%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 6.8% | 1502 | 2436 | 3 | 33.5 | 9892 / 10266 (96%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10.6% | 3593 | 52965 | 3 | 211.7 | 85881 / 86059 (100%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 8.7% | 2974 | 28885 | 3 | 225.0 | 82917 / 83114 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 8.4% | 3096 | 111165 | 3 | 273.3 | 87174 / 87607 (100%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 9.0% | 1412 | 11611 | 3 | 86.6 | 32871 / 32997 (100%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 8.4% | 2087 | 8500 | 3 | 86.5 | 30631 / 30859 (99%) | 0 | 0 |
| lxx.Tomcat 3.68 | 10.3% | 2977 | 48240 | 3 | 170.1 | 69409 / 69475 (100%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 9.9% | 3328 | 45338 | 3 | 252.1 | 105704 / 105786 (100%) | 0 | 0 |
| aw.Gilgalad 1.99.5c | 10.2% | 2746 | 107991 | 3 | 137.1 | 51322 / 51409 (100%) | 0 | 0 |
| pc.Wavelet 1.5 | 8.8% | 1515 | 14688 | 3 | 93.6 | 35925 / 35955 (100%) | 0 | 0 |
| gh.GresSuffurd 0.4.13 | 8.3% | 1804 | 9456 | 3 | 71.9 | 27056 / 27087 (100%) | 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 7.7% | 1074 | 19395 | 3 | 55.3 | 18703 / 18705 (100%) | 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 7.8% | 1724 | 4703 | 3 | 80.8 | 30467 / 30850 (99%) | 0 | 0 |
| cs.Nene 1.0.5 | 7.8% | 1255 | 13579 | 3 | 54.0 | 19502 / 19607 (99%) | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 10.1% | 3962 | 51059 | 3 | 151.0 | 57379 / 57537 (100%) | 0 | 0 |
| voidious.Dookious 1.573c | 7.2% | 1144 | 5550 | 3 | 52.7 | 17313 / 17336 (100%) | 0 | 0 |
| davidalves.Phoenix 1.02 | 8.1% | 1154 | 4881 | 3 | 53.1 | 17973 / 17985 (100%) | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 9.0% | 2491 | 74146 | 3 | 196.3 | 73625 / 73784 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| voidious.Diamond 1.8.22 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cb.fire.Firestarter 2.0f | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| xander.cat.XanderCat 12.9 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lxx.Tomcat 3.68 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| aw.Gilgalad 1.99.5c | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pc.Wavelet 1.5 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| gh.GresSuffurd 0.4.13 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cs.Nene 1.0.5 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jk.melee.Neuromancer 7.12 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| voidious.Dookious 1.573c | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.Phoenix 1.02 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | kc.mega.BeepBoop | 1 | 35 | 296 | 9.5% | 7.6% ± 0.9 | 5.8% | 20.1% / 20.7% | 0.3% | 0 / 0 | T3/M1 | 28% |
| jk.mega.DrussGT 3.1.16 | jk.mega.DrussGT | 1 | 35 | 298 | 10.2% | 8.5% ± 1.1 | 7.5% | 24.0% / 21.1% | 1.8% | 0 / 0 | T3/M1 | 39% |
| oog.mega.saguaro.Saguaro 1.0 | oog.mega.saguaro.Saguaro | 1 | 35 | 328 | 9.2% | 7.9% ± 1.7 | 14.6% | 25.3% / 25.5% | 9.2% | 0 / 0 | T3/M0 | 72% |
| aaa.r.ScalarR 0.005h.053-noshield | aaa.r.ScalarR | 1 | 35 | 316 | 11.1% | 8.7% ± 1.1 | 7.9% | 24.1% / 21.1% | 0.0% | 0 / 0 | T3/M1 | 36% |
| voidious.Diamond 1.8.22 | voidious.Diamond | 1 | 35 | 302 | 8.7% | 7.4% ± 0.9 | 7.2% | 23.0% / 21.5% | 9.3% | 0 / 0 | T3/M1 | 48% |
| cb.fire.Firestarter 2.0f | cb.fire.Firestarter | 1 | 34 | 310 | 8.3% | 6.7% ± 1.1 | 9.9% | 20.3% / 21.3% | 3.1% | 0 / 0 | T2/M1 | 50% |
| dsekercioglu.mega.Raven 3.56j8 | dsekercioglu.mega.Raven | 1 | 35 | 330 | 8.8% | 6.9% ± 1.0 | 9.8% | 21.6% / 20.6% | 11.1% | 0 / 0 | T2/M1 | 62% |
| xander.cat.XanderCat 12.9 | xander.cat.XanderCat | 1 | 35 | 314 | 9.9% | 7.7% ± 1.0 | 11.5% | 23.6% / 22.4% | 7.8% | 0 / 0 | T3/M1 | 58% |
| lxx.Tomcat 3.68 | lxx.Tomcat | 1 | 35 | 274 | 10.6% | 8.7% ± 0.9 | 10.4% | 23.0% / 22.2% | 8.6% | 0 / 0 | T3/M1 | 56% |
| rsalesc.mega.Knight 0.6.28 | rsalesc.mega.Knight | 1 | 35 | 314 | 10.3% | 8.3% ± 0.9 | 10.2% | 24.4% / 20.9% | 12.0% | 0 / 0 | T3/M1 | 48% |
| aw.Gilgalad 1.99.5c | aw.Gilgalad | 1 | 35 | 284 | 11.2% | 8.5% ± 1.1 | 10.1% | 21.9% / 22.1% | 4.5% | 0 / 0 | T3/M1 | 45% |
| pc.Wavelet 1.5 | pc.Wavelet | 1 | 35 | 272 | 9.8% | 7.2% ± 0.9 | 10.4% | 21.9% / 22.4% | 9.8% | 0 / 0 | T3/M1 | 42% |
| gh.GresSuffurd 0.4.13 | gh.GresSuffurd | 1 | 35 | 294 | 8.6% | 6.9% ± 1.1 | 10.7% | 23.4% / 22.3% | 11.6% | 0 / 0 | T2/M1 | 61% |
| kc.serpent.WaveSerpent 2.11 | kc.serpent.WaveSerpent | 1 | 35 | 322 | 7.3% | 6.8% ± 1.2 | 9.5% | 22.7% / 22.7% | 11.9% | 0 / 0 | T2/M1 | 61% |
| dsekercioglu.mega.WhiteFang 2.8.1 | dsekercioglu.mega.WhiteFang | 1 | 35 | 344 | 7.5% | 6.1% ± 1.0 | 10.7% | 22.5% / 22.3% | 14.8% | 0 / 0 | T2/M1 | 68% |
| cs.Nene 1.0.5 | cs.Nene | 1 | 35 | 264 | 9.2% | 8.3% ± 1.3 | 10.0% | 24.5% / 24.4% | 8.6% | 0 / 0 | T3/M1 | 59% |
| jk.melee.Neuromancer 7.12 | jk.melee.Neuromancer | 1 | 35 | 314 | 11.4% | 9.6% ± 1.0 | 10.8% | 23.6% / 22.1% | 0.0% | 0 / 0 | T3/M1 | 59% |
| voidious.Dookious 1.573c | voidious.Dookious | 1 | 35 | 306 | 7.7% | 7.3% ± 1.3 | 10.0% | 23.0% / 22.0% | 11.7% | 0 / 0 | T3/M1 | 63% |
| davidalves.Phoenix 1.02 | davidalves.Phoenix | 1 | 35 | 306 | 9.2% | 7.8% ± 1.3 | 9.1% | 19.4% / 21.0% | 4.5% | 0 / 0 | T3/M1 | 51% |
| rsalesc.roborio.Roborio 1.2.4 | rsalesc.roborio.Roborio | 1 | 35 | 328 | 9.7% | 7.5% ± 1.1 | 11.0% | 23.1% / 20.8% | 12.6% | 0 / 0 | T3/M1 | 60% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.8.5 vs hadur2.Hadur 3.8

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 25.3% ± 0.8 | 25.7% ± 0.9 | -0.3 ± 1.2 |
| jk.mega.DrussGT 3.1.16 | 46.6% ± 1.0 | 48.3% ± 1.0 | -1.7 ± 1.4 |
| oog.mega.saguaro.Saguaro 1.0 | 72.7% ± 1.0 | 73.6% ± 1.0 | -0.9 ± 1.4 |
| aaa.r.ScalarR 0.005h.053-noshield | 32.0% ± 0.9 | 33.5% ± 0.8 | -1.5 ± 1.3 |
| voidious.Diamond 1.8.22 | 48.0% ± 1.2 | 48.2% ± 1.0 | -0.2 ± 1.5 |
| cb.fire.Firestarter 2.0f | 50.3% ± 1.1 | 49.6% ± 1.0 | +0.8 ± 1.4 |
| dsekercioglu.mega.Raven 3.56j8 | 55.9% ± 1.1 | 55.8% ± 1.1 | +0.1 ± 1.6 |
| xander.cat.XanderCat 12.9 | 56.8% ± 1.1 | 56.6% ± 1.0 | +0.2 ± 1.5 |
| lxx.Tomcat 3.68 | 54.6% ± 1.0 | 54.1% ± 1.0 | +0.5 ± 1.4 |
| rsalesc.mega.Knight 0.6.28 | 54.0% ± 1.1 | 55.0% ± 1.0 | -0.9 ± 1.4 |
| aw.Gilgalad 1.99.5c | 49.2% ± 1.2 | 49.2% ± 1.1 | -0.0 ± 1.5 |
| pc.Wavelet 1.5 | 48.2% ± 1.1 | 46.7% ± 1.0 | +1.6 ± 1.5 |
| gh.GresSuffurd 0.4.13 | 62.4% ± 1.0 | 62.4% ± 1.1 | -0.0 ± 1.3 |
| kc.serpent.WaveSerpent 2.11 | 58.2% ± 1.1 | 58.0% ± 0.9 | +0.2 ± 1.4 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 68.1% ± 0.9 | 68.5% ± 0.8 | -0.4 ± 1.2 |
| cs.Nene 1.0.5 | 58.2% ± 1.1 | 58.9% ± 0.9 | -0.6 ± 1.2 |
| jk.melee.Neuromancer 7.12 | 50.3% ± 1.1 | 51.2% ± 1.1 | -0.9 ± 1.6 |
| voidious.Dookious 1.573c | 59.6% ± 1.0 | 61.1% ± 0.9 | -1.5 ± 1.2 |
| davidalves.Phoenix 1.02 | 57.2% ± 0.9 | 58.4% ± 1.0 | -1.1 ± 1.3 |
| rsalesc.roborio.Roborio 1.2.4 | 61.0% ± 0.9 | 60.6% ± 1.1 | +0.4 ± 1.5 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | -0.3 ± 1.2 | -0.8 ± 1.7 | -0.7 ± 1.7 | +0.2 ± 0.8 |
| jk.mega.DrussGT 3.1.16 | -1.7 ± 1.4 | -2.6 ± 2.4 | -2.7 ± 2.4 | -0.7 ± 0.6 |
| oog.mega.saguaro.Saguaro 1.0 | -0.9 ± 1.4 | -0.9 ± 2.0 | -0.9 ± 2.0 | -0.9 ± 1.1 |
| aaa.r.ScalarR 0.005h.053-noshield | -1.5 ± 1.3 | -1.9 ± 2.1 | -1.9 ± 2.1 | -0.9 ± 0.7 |
| voidious.Diamond 1.8.22 | -0.2 ± 1.5 | -0.4 ± 2.3 | -0.5 ± 2.3 | +0.0 ± 0.7 |
| cb.fire.Firestarter 2.0f | +0.8 ± 1.4 | +1.5 ± 2.1 | +1.3 ± 2.2 | +0.0 ± 0.7 |
| dsekercioglu.mega.Raven 3.56j8 | +0.1 ± 1.6 | +0.1 ± 2.3 | +0.1 ± 2.3 | -0.1 ± 0.9 |
| xander.cat.XanderCat 12.9 | +0.2 ± 1.5 | -0.2 ± 2.1 | -0.1 ± 2.1 | +0.3 ± 1.1 |
| lxx.Tomcat 3.68 | +0.5 ± 1.4 | +1.5 ± 2.2 | +1.5 ± 2.2 | -0.5 ± 0.7 |
| rsalesc.mega.Knight 0.6.28 | -0.9 ± 1.4 | -1.2 ± 2.3 | -1.2 ± 2.3 | -0.5 ± 0.6 |
| aw.Gilgalad 1.99.5c | -0.0 ± 1.5 | +0.1 ± 2.1 | +0.1 ± 2.1 | -0.0 ± 1.3 |
| pc.Wavelet 1.5 | +1.6 ± 1.5 | +2.5 ± 2.6 | +2.5 ± 2.6 | +0.5 ± 0.8 |
| gh.GresSuffurd 0.4.13 | -0.0 ± 1.3 | +0.1 ± 1.9 | +0.1 ± 1.9 | -0.3 ± 0.9 |
| kc.serpent.WaveSerpent 2.11 | +0.2 ± 1.4 | +0.8 ± 2.0 | +0.8 ± 2.0 | -0.3 ± 0.8 |
| dsekercioglu.mega.WhiteFang 2.8.1 | -0.4 ± 1.2 | +0.2 ± 1.7 | +0.2 ± 1.7 | -0.8 ± 1.0 |
| cs.Nene 1.0.5 | -0.6 ± 1.2 | -0.5 ± 1.8 | -0.5 ± 1.8 | -0.6 ± 0.9 |
| jk.melee.Neuromancer 7.12 | -0.9 ± 1.6 | -1.7 ± 2.6 | -1.6 ± 2.6 | -0.2 ± 0.7 |
| voidious.Dookious 1.573c | -1.5 ± 1.2 | -1.7 ± 1.9 | -1.7 ± 1.9 | -1.0 ± 0.8 |
| davidalves.Phoenix 1.02 | -1.1 ± 1.3 | -1.5 ± 1.9 | -1.5 ± 1.9 | -0.8 ± 0.9 |
| rsalesc.roborio.Roborio 1.2.4 | +0.4 ± 1.5 | +0.4 ± 2.5 | +0.4 ± 2.5 | +0.4 ± 1.0 |
| All pairs | -0.3 ± 0.3 | -0.3 ± 0.5 | -0.3 ± 0.5 | -0.3 ± 0.2 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 100 | 85 | -0.3 ± 1.2 | -0.4 ± 1.2 |
| jk.mega.DrussGT 3.1.16 | 100 | 15 | -1.7 ± 1.4 | -0.9 ± 4.0 |
| oog.mega.saguaro.Saguaro 1.0 | 100 | 69 | -0.9 ± 1.4 | -1.2 ± 1.8 |
| aaa.r.ScalarR 0.005h.053-noshield | 100 | 34 | -1.5 ± 1.3 | -0.8 ± 2.1 |
| voidious.Diamond 1.8.22 | 100 | 24 | -0.2 ± 1.5 | -1.2 ± 3.7 |
| cb.fire.Firestarter 2.0f | 100 | 78 | +0.8 ± 1.4 | +0.2 ± 1.7 |
| dsekercioglu.mega.Raven 3.56j8 | 100 | 37 | +0.1 ± 1.6 | -1.3 ± 2.7 |
| xander.cat.XanderCat 12.9 | 100 | 54 | +0.2 ± 1.5 | +0.3 ± 2.2 |
| lxx.Tomcat 3.68 | 100 | 46 | +0.5 ± 1.4 | +0.2 ± 2.3 |
| rsalesc.mega.Knight 0.6.28 | 100 | 22 | -0.9 ± 1.4 | -1.1 ± 2.5 |
| aw.Gilgalad 1.99.5c | 100 | 34 | -0.0 ± 1.5 | -0.7 ± 2.7 |
| pc.Wavelet 1.5 | 100 | 35 | +1.6 ± 1.5 | +3.2 ± 2.5 |
| gh.GresSuffurd 0.4.13 | 100 | 47 | -0.0 ± 1.3 | +0.4 ± 1.4 |
| kc.serpent.WaveSerpent 2.11 | 100 | 52 | +0.2 ± 1.4 | -0.6 ± 1.9 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 100 | 37 | -0.4 ± 1.2 | +0.3 ± 2.2 |
| cs.Nene 1.0.5 | 100 | 81 | -0.6 ± 1.2 | -0.7 ± 1.4 |
| jk.melee.Neuromancer 7.12 | 100 | 54 | -0.9 ± 1.6 | -0.7 ± 1.8 |
| voidious.Dookious 1.573c | 100 | 77 | -1.5 ± 1.2 | -1.6 ± 1.4 |
| davidalves.Phoenix 1.02 | 100 | 55 | -1.1 ± 1.3 | -0.5 ± 1.6 |
| rsalesc.roborio.Roborio 1.2.4 | 100 | 32 | +0.4 ± 1.5 | +0.8 ± 3.0 |
| All pairs | 2000 | 968 | -0.3 ± 0.3 | -0.4 ± 0.4 |

# Bench: hadur2.Hadur 3.8.5 baseline (hadur2.Hadur 3.8) (cold)

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 45888 over 2000 battles (22.9 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 25.7% ± 0.9 | 13.7% ± 1.2 | 42.3% ± 0.6 | 480 / 3500 | 5.0% ± 0.1 | 8.7% ± 0.1 | 2200 | 0 | 2.04 / 592.7 |
| jk.mega.DrussGT 3.1.16 | rumble-3 | 48.3% ± 1.0 | 49.4% ± 1.7 | 47.0% ± 0.4 | 1740 / 3500 | 7.5% ± 0.1 | 10.1% ± 0.1 | 3530 | 0 | 1.64 / 693.6 |
| oog.mega.saguaro.Saguaro 1.0 | rumble-4 | 73.6% ± 1.0 | 85.1% ± 1.3 | 62.4% ± 0.8 | 2980 / 3500 | 18.7% ± 0.3 | 6.7% ± 0.1 | 1367 | 0 in 1 round(s) | 2.29 / 756.8 |
| aaa.r.ScalarR 0.005h.053-noshield | rumble-5 | 33.5% ± 0.8 | 27.0% ± 1.4 | 41.3% ± 0.5 | 949 / 3500 | 6.7% ± 0.1 | 10.4% ± 0.1 | 3703 | 0 | 1.94 / 830.4 |
| voidious.Diamond 1.8.22 | rumble-6 | 48.2% ± 1.0 | 55.9% ± 1.6 | 40.2% ± 0.5 | 1963 / 3500 | 6.7% ± 0.1 | 8.7% ± 0.1 | 3011 | 0 | 1.81 / 680.4 |
| cb.fire.Firestarter 2.0f | rumble-7 | 49.6% ± 1.0 | 47.6% ± 1.4 | 51.8% ± 0.5 | 1675 / 3500 | 8.3% ± 0.1 | 8.5% ± 0.1 | 3148 | 0 | 1.84 / 286.0 |
| dsekercioglu.mega.Raven 3.56j8 | rumble-8 | 55.8% ± 1.1 | 70.4% ± 1.6 | 40.7% ± 0.7 | 2466 / 3500 | 9.7% ± 0.1 | 9.0% ± 0.1 | 1414 | 0 | 1.26 / 520.3 |
| xander.cat.XanderCat 12.9 | rumble-9 | 56.6% ± 1.0 | 63.5% ± 1.5 | 50.0% ± 0.8 | 2224 / 3500 | 11.6% ± 0.1 | 8.4% ± 0.1 | 2204 | 0 | 1.36 / 847.2 |
| lxx.Tomcat 3.68 | rumble-10 | 54.1% ± 1.0 | 64.8% ± 1.5 | 43.7% ± 0.5 | 2273 / 3500 | 9.6% ± 0.1 | 10.2% ± 0.1 | 2904 | 0 | 2.21 / 257.6 |
| rsalesc.mega.Knight 0.6.28 | rumble-11 | 55.0% ± 1.0 | 57.7% ± 1.6 | 51.6% ± 0.5 | 2020 / 3500 | 9.5% ± 0.1 | 9.9% ± 0.1 | 3345 | 0 | 2.20 / 212.7 |
| aw.Gilgalad 1.99.5c | rumble-12 | 49.2% ± 1.1 | 58.0% ± 1.6 | 40.8% ± 0.9 | 2032 / 3500 | 9.3% ± 0.3 | 10.3% ± 0.1 | 2824 | 0 | 1.55 / 653.7 |
| pc.Wavelet 1.5 | rumble-13 | 46.7% ± 1.0 | 44.1% ± 1.8 | 50.1% ± 0.5 | 1544 / 3500 | 10.1% ± 0.1 | 8.9% ± 0.1 | 1508 | 0 | 1.95 / 534.3 |
| gh.GresSuffurd 0.4.13 | rumble-14 | 62.4% ± 1.1 | 74.7% ± 1.5 | 49.8% ± 0.7 | 2615 / 3500 | 11.2% ± 0.1 | 8.5% ± 0.4 | 1807 | 0 | 1.12 / 821.5 |
| kc.serpent.WaveSerpent 2.11 | rumble-15 | 58.0% ± 0.9 | 73.2% ± 1.3 | 41.4% ± 0.6 | 2562 / 3500 | 9.0% ± 0.1 | 7.8% ± 0.3 | 1022 | 0 | 2.24 / 581.7 |
| dsekercioglu.mega.WhiteFang 2.8.1 | rumble-17 | 68.5% ± 0.8 | 83.2% ± 1.1 | 52.2% ± 0.7 | 2913 / 3500 | 11.1% ± 0.1 | 7.8% ± 0.1 | 1588 | 0 | 1.23 / 705.0 |
| cs.Nene 1.0.5 | rumble-18 | 58.9% ± 0.9 | 75.7% ± 1.2 | 41.0% ± 0.7 | 2650 / 3500 | 9.6% ± 0.1 | 7.8% ± 0.3 | 1346 | 0 | 1.30 / 783.9 |
| jk.melee.Neuromancer 7.12 | rumble-19 | 51.2% ± 1.1 | 54.8% ± 1.7 | 48.2% ± 0.6 | 1924 / 3500 | 9.9% ± 0.1 | 10.1% ± 0.1 | 4062 | 0 | 1.83 / 547.7 |
| voidious.Dookious 1.573c | rumble-20 | 61.1% ± 0.9 | 76.5% ± 1.3 | 43.6% ± 0.6 | 2678 / 3500 | 9.6% ± 0.1 | 7.0% ± 0.1 | 1170 | 0 | 1.23 / 1505.9 |
| davidalves.Phoenix 1.02 | rumble-21 | 58.4% ± 1.0 | 75.5% ± 1.5 | 41.0% ± 0.7 | 2644 / 3500 | 10.0% ± 0.1 | 8.1% ± 0.1 | 1141 | 0 | 1.19 / 1052.9 |
| rsalesc.roborio.Roborio 1.2.4 | rumble-22 | 60.6% ± 1.1 | 57.9% ± 1.7 | 61.9% ± 0.7 | 2026 / 3500 | 12.0% ± 0.1 | 9.0% ± 0.1 | 2594 | 0 | 1.71 / 808.1 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 100 | 92 | 1192 | 0 | 0.63 | 4 | 2 | 0 |
| jk.mega.DrussGT 3.1.16 | 100 | 44 | 2198 | 0 | 1.01 | 52 | 51 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 100 | 84 | 3278 | 1 | 0.39 | 6 | 5 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 100 | 65 | 6856 | 2 | 1.06 | 13 | 10 | 0 |
| voidious.Diamond 1.8.22 | 100 | 57 | 596 | 0 | 0.86 | 43 | 42 | 0 |
| cb.fire.Firestarter 2.0f | 100 | 87 | 2281 | 0 | 0.90 | 2 | 2 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 100 | 70 | 298 | 0 | 0.40 | 30 | 30 | 0 |
| xander.cat.XanderCat 12.9 | 100 | 70 | 4768 | 0 | 0.63 | 15 | 15 | 100 |
| lxx.Tomcat 3.68 | 100 | 69 | 0 | 0 | 0.83 | 32 | 30 | 0 |
| rsalesc.mega.Knight 0.6.28 | 100 | 56 | 596 | 0 | 0.96 | 43 | 41 | 0 |
| aw.Gilgalad 1.99.5c | 100 | 54 | 1011 | 0 | 0.81 | 44 | 43 | 0 |
| pc.Wavelet 1.5 | 100 | 57 | 211 | 0 | 0.43 | 42 | 39 | 0 |
| gh.GresSuffurd 0.4.13 | 100 | 71 | 374 | 0 | 0.52 | 28 | 26 | 0 |
| kc.serpent.WaveSerpent 2.11 | 100 | 72 | 826 | 0 | 0.29 | 26 | 26 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 100 | 65 | 3341 | 0 | 0.45 | 25 | 25 | 0 |
| cs.Nene 1.0.5 | 100 | 86 | 2904 | 1 | 0.38 | 2 | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 100 | 74 | 5066 | 1 | 1.16 | 1 | 1 | 0 |
| voidious.Dookious 1.573c | 100 | 89 | 596 | 0 | 0.33 | 9 | 9 | 0 |
| davidalves.Phoenix 1.02 | 100 | 76 | 0 | 0 | 0.33 | 24 | 23 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 100 | 50 | 0 | 0 | 0.74 | 50 | 49 | 0 |

1388 of 2000 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 474980 | 6088 | 497664 | 474633 (99.9%) | 347 (0.1%) | 23031 (4.6%) | 19954 | 2991 | 2556 |
| jk.mega.DrussGT 3.1.16 | 926928 | 176 | 926801 | 926691 (100.0%) | 237 (0.0%) | 110 (0.0%) | 58348 | 6609 | 3428 |
| oog.mega.saguaro.Saguaro 1.0 | 115940 | 253 | 115737 | 115622 (99.7%) | 318 (0.3%) | 115 (0.1%) | 7386 | 1702 | 506 |
| aaa.r.ScalarR 0.005h.053-noshield | 725581 | 251 | 745854 | 724947 (99.9%) | 634 (0.1%) | 20907 (2.8%) | 42199 | 8036 | 3899 |
| voidious.Diamond 1.8.22 | 777224 | 15642 | 805862 | 776806 (99.9%) | 418 (0.1%) | 29056 (3.6%) | 47704 | 4703 | 2707 |
| cb.fire.Firestarter 2.0f | 829190 | 19523 | 961408 | 828550 (99.9%) | 640 (0.1%) | 132858 (13.8%) | 72665 | 6340 | 3242 |
| dsekercioglu.mega.Raven 3.56j8 | 306212 | 1603 | 306166 | 306134 (100.0%) | 78 (0.0%) | 32 (0.0%) | 22957 | 3436 | 1307 |
| xander.cat.XanderCat 12.9 | 302419 | 145 | 314881 | 302035 (99.9%) | 384 (0.1%) | 12846 (4.1%) | 32985 | 4072 | 1760 |
| lxx.Tomcat 3.68 | 586846 | 11291 | 589635 | 586198 (99.9%) | 648 (0.1%) | 3437 (0.6%) | 48211 | 4826 | 2706 |
| rsalesc.mega.Knight 0.6.28 | 900518 | 8042 | 900442 | 900251 (100.0%) | 267 (0.0%) | 191 (0.0%) | 73730 | 7277 | 3195 |
| aw.Gilgalad 1.99.5c | 479490 | 177 | 483069 | 479331 (100.0%) | 159 (0.0%) | 3738 (0.8%) | 36275 | 4406 | 2764 |
| pc.Wavelet 1.5 | 332568 | 110 | 335938 | 332530 (100.0%) | 38 (0.0%) | 3408 (1.0%) | 27949 | 3200 | 1065 |
| gh.GresSuffurd 0.4.13 | 250691 | 204 | 250690 | 250633 (100.0%) | 58 (0.0%) | 57 (0.0%) | 17614 | 2273 | 1548 |
| kc.serpent.WaveSerpent 2.11 | 193802 | 100 | 193768 | 193734 (100.0%) | 68 (0.0%) | 34 (0.0%) | 14477 | 1440 | 624 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 278713 | 190 | 278472 | 278450 (99.9%) | 263 (0.1%) | 22 (0.0%) | 22853 | 2491 | 1258 |
| cs.Nene 1.0.5 | 188841 | 1606 | 188615 | 188603 (99.9%) | 238 (0.1%) | 12 (0.0%) | 11214 | 1397 | 777 |
| jk.melee.Neuromancer 7.12 | 515885 | 154 | 522397 | 515374 (99.9%) | 511 (0.1%) | 7023 (1.3%) | 43782 | 4621 | 4435 |
| voidious.Dookious 1.573c | 186378 | 291 | 186329 | 186307 (100.0%) | 71 (0.0%) | 22 (0.0%) | 12944 | 1312 | 809 |
| davidalves.Phoenix 1.02 | 187411 | 108 | 187471 | 187403 (100.0%) | 8 (0.0%) | 68 (0.0%) | 13777 | 1865 | 552 |
| rsalesc.roborio.Roborio 1.2.4 | 692638 | 191 | 693289 | 692594 (100.0%) | 44 (0.0%) | 695 (0.1%) | 70537 | 5420 | 2303 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 473715 | 51951 (11.0%) | 458986 |
| jk.mega.DrussGT 3.1.16 | 919231 | 117410 (12.8%) | 913753 |
| oog.mega.saguaro.Saguaro 1.0 | 131635 | 9833 (7.5%) | 130605 |
| aaa.r.ScalarR 0.005h.053-noshield | 735554 | 85903 (11.7%) | 718396 |
| voidious.Diamond 1.8.22 | 788187 | 84486 (10.7%) | 768968 |
| cb.fire.Firestarter 2.0f | 954534 | 88548 (9.3%) | 930627 |
| dsekercioglu.mega.Raven 3.56j8 | 327895 | 32810 (10.0%) | 308472 |
| xander.cat.XanderCat 12.9 | 385303 | 32203 (8.4%) | 357677 |
| lxx.Tomcat 3.68 | 597705 | 69115 (11.6%) | 582468 |
| rsalesc.mega.Knight 0.6.28 | 902869 | 105933 (11.7%) | 886471 |
| aw.Gilgalad 1.99.5c | 489448 | 51031 (10.4%) | 471025 |
| pc.Wavelet 1.5 | 386100 | 36201 (9.4%) | 370113 |
| gh.GresSuffurd 0.4.13 | 264134 | 26637 (10.1%) | 238161 |
| kc.serpent.WaveSerpent 2.11 | 253379 | 18557 (7.3%) | 207585 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 316214 | 29705 (9.4%) | 291330 |
| cs.Nene 1.0.5 | 210441 | 19670 (9.3%) | 187256 |
| jk.melee.Neuromancer 7.12 | 553019 | 56123 (10.1%) | 535643 |
| voidious.Dookious 1.573c | 228132 | 17735 (7.8%) | 179740 |
| davidalves.Phoenix 1.02 | 232870 | 17782 (7.6%) | 182153 |
| rsalesc.roborio.Roborio 1.2.4 | 772465 | 73360 (9.5%) | 771753 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 536 | 650 | 1647 | 19.8 / 26.9 | 23 | 12859 | 2090 |
| jk.mega.DrussGT 3.1.16 | 650 | 516 | 650 | 3080 | 27.2 / 30.6 | 657 | 116871 | 9927 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 441 | 450 | 529 | 43.9 / 26.4 | 17491 | 46946 | 9636 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 484 | 650 | 2476 | 23.4 / 33.2 | 97 | 30112 | 42 |
| voidious.Diamond 1.8.22 | 650 | 536 | 650 | 2638 | 21.2 / 31.5 | 1756 | 230442 | 4206 |
| cb.fire.Firestarter 2.0f | 650 | 546 | 650 | 3143 | 29.3 / 27.2 | 1550 | 86103 | 3009 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 453 | 650 | 1156 | 24.1 / 35.1 | 3491 | 287565 | 32731 |
| xander.cat.XanderCat 12.9 | 650 | 453 | 645 | 1369 | 32.8 / 32.8 | 6207 | 39036 | 1514 |
| lxx.Tomcat 3.68 | 650 | 511 | 650 | 2024 | 27.4 / 35.3 | 3778 | 397814 | 295 |
| rsalesc.mega.Knight 0.6.28 | 650 | 509 | 649 | 3022 | 31.8 / 29.8 | 7052 | 172749 | 953 |
| aw.Gilgalad 1.99.5c | 650 | 479 | 650 | 1683 | 25.2 / 36.1 | 4298 | 343858 | 846 |
| pc.Wavelet 1.5 | 650 | 442 | 647 | 1376 | 30.4 / 30.2 | 4398 | 59822 | 197 |
| gh.GresSuffurd 0.4.13 | 650 | 459 | 647 | 971 | 30.8 / 31.0 | 8747 | 102615 | 2067 |
| kc.serpent.WaveSerpent 2.11 | 650 | 479 | 650 | 915 | 23.3 / 32.9 | 2199 | 160497 | 95 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 650 | 464 | 643 | 1128 | 30.6 / 27.9 | 6567 | 249819 | 3816 |
| cs.Nene 1.0.5 | 650 | 470 | 643 | 771 | 23.9 / 34.3 | 1908 | 131858 | 32360 |
| jk.melee.Neuromancer 7.12 | 650 | 528 | 650 | 1871 | 31.3 / 33.7 | 3775 | 204730 | 414 |
| voidious.Dookious 1.573c | 650 | 484 | 637 | 834 | 23.9 / 31.0 | 2177 | 117579 | 58149 |
| davidalves.Phoenix 1.02 | 650 | 462 | 646 | 847 | 25.0 / 36.0 | 2114 | 132508 | 2762 |
| rsalesc.roborio.Roborio 1.2.4 | 650 | 504 | 645 | 2624 | 40.9 / 25.1 | 16653 | 143704 | 1746 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 8.7% | 2200 | 54189 | 3 | 141.0 | 51811 / 51951 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 10.1% | 3530 | 34178 | 3 | 260.8 | 117236 / 117410 (100%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 6.7% | 1367 | 16725 | 3 | 32.9 | 9576 / 9833 (97%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10.4% | 3703 | 91509 | 3 | 212.1 | 85719 / 85903 (100%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 8.7% | 3011 | 14876 | 3 | 228.3 | 84314 / 84486 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 8.5% | 3148 | 99083 | 3 | 273.6 | 88088 / 88548 (99%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 9.0% | 1414 | 9265 | 3 | 86.7 | 32680 / 32810 (100%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 8.4% | 2204 | 27707 | 3 | 89.1 | 31886 / 32203 (99%) | 0 | 0 |
| lxx.Tomcat 3.68 | 10.2% | 2904 | 66282 | 3 | 167.7 | 69034 / 69115 (100%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 9.9% | 3345 | 76006 | 3 | 254.2 | 105841 / 105933 (100%) | 0 | 0 |
| aw.Gilgalad 1.99.5c | 10.3% | 2824 | 26640 | 3 | 136.5 | 50942 / 51031 (100%) | 0 | 0 |
| pc.Wavelet 1.5 | 8.9% | 1508 | 24115 | 3 | 94.8 | 36164 / 36201 (100%) | 0 | 0 |
| gh.GresSuffurd 0.4.13 | 8.5% | 1807 | 16042 | 3 | 70.8 | 26600 / 26637 (100%) | 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 7.8% | 1022 | 9289 | 3 | 54.8 | 18550 / 18557 (100%) | 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 7.8% | 1588 | 19240 | 3 | 78.9 | 29543 / 29705 (99%) | 0 | 0 |
| cs.Nene 1.0.5 | 7.8% | 1346 | 11713 | 3 | 53.7 | 19548 / 19670 (99%) | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 10.1% | 4062 | 75361 | 3 | 148.6 | 55976 / 56123 (100%) | 0 | 0 |
| voidious.Dookious 1.573c | 7.0% | 1170 | 16268 | 3 | 53.0 | 17706 / 17735 (100%) | 0 | 0 |
| davidalves.Phoenix 1.02 | 8.1% | 1141 | 6731 | 3 | 53.2 | 17772 / 17782 (100%) | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 9.0% | 2594 | 39954 | 3 | 194.7 | 73300 / 73360 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| voidious.Diamond 1.8.22 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cb.fire.Firestarter 2.0f | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| xander.cat.XanderCat 12.9 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lxx.Tomcat 3.68 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| aw.Gilgalad 1.99.5c | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pc.Wavelet 1.5 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| gh.GresSuffurd 0.4.13 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cs.Nene 1.0.5 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jk.melee.Neuromancer 7.12 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| voidious.Dookious 1.573c | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.Phoenix 1.02 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## First rounds against last rounds

Per battle, the first 5 rounds against the last 10, then the paired difference (last minus first) over battles with its 95% interval. Win rate is rounds won over rounds with an R record; damage share is bullet damage dealt over dealt plus taken. Positive means the robot does better late in the battle.

| Opponent | Build | Battles | Win rate, first 5 | Win rate, last 10 | Late minus early (pp) | Damage share, first 5 | Damage share, last 10 | Late minus early (pp) |
|---|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | hadur2.Hadur 3.8.5 | 100 | 24.4% ± 3.7 | 23.6% ± 2.6 | -0.8 ± 4.6 | 45.5% ± 1.7 | 38.7% ± 1.0 | -6.7 ± 2.1 |
| aaa.r.ScalarR 0.005h.053-noshield | hadur2.Hadur 3.8 | 100 | 21.6% ± 3.4 | 28.4% ± 3.0 | +6.8 ± 4.7 | 45.2% ± 1.7 | 40.4% ± 0.9 | -4.8 ± 2.0 |
| aw.Gilgalad 1.99.5c | hadur2.Hadur 3.8.5 | 100 | 55.8% ± 4.3 | 58.0% ± 3.1 | +2.2 ± 4.9 | 44.2% ± 2.0 | 40.4% ± 1.4 | -3.9 ± 2.3 |
| aw.Gilgalad 1.99.5c | hadur2.Hadur 3.8 | 100 | 59.6% ± 4.0 | 57.6% ± 3.0 | -2.0 ± 5.0 | 44.8% ± 1.6 | 40.0% ± 1.3 | -4.8 ± 1.9 |
| cb.fire.Firestarter 2.0f | hadur2.Hadur 3.8.5 | 100 | 36.6% ± 3.7 | 50.7% ± 3.6 | +14.1 ± 5.4 | 53.6% ± 1.5 | 50.7% ± 1.2 | -2.9 ± 2.0 |
| cb.fire.Firestarter 2.0f | hadur2.Hadur 3.8 | 100 | 34.2% ± 3.7 | 48.1% ± 3.0 | +13.9 ± 4.8 | 53.2% ± 1.6 | 50.9% ± 1.0 | -2.3 ± 1.9 |
| cs.Nene 1.0.5 | hadur2.Hadur 3.8.5 | 100 | 79.6% ± 3.4 | 71.0% ± 2.7 | -8.6 ± 4.4 | 43.2% ± 1.6 | 37.6% ± 1.0 | -5.6 ± 1.8 |
| cs.Nene 1.0.5 | hadur2.Hadur 3.8 | 100 | 82.7% ± 3.3 | 72.4% ± 2.7 | -10.3 ± 4.3 | 44.5% ± 1.6 | 38.0% ± 0.9 | -6.5 ± 1.8 |
| davidalves.Phoenix 1.02 | hadur2.Hadur 3.8.5 | 100 | 67.8% ± 3.8 | 77.2% ± 2.3 | +9.4 ± 4.7 | 39.6% ± 1.7 | 39.8% ± 1.0 | +0.2 ± 2.0 |
| davidalves.Phoenix 1.02 | hadur2.Hadur 3.8 | 100 | 69.6% ± 3.7 | 76.5% ± 3.0 | +6.9 ± 4.9 | 40.6% ± 1.7 | 39.5% ± 1.1 | -1.1 ± 2.1 |
| dsekercioglu.mega.Raven 3.56j8 | hadur2.Hadur 3.8.5 | 100 | 72.8% ± 4.0 | 70.9% ± 2.9 | -1.9 ± 4.5 | 42.7% ± 1.8 | 38.9% ± 1.0 | -3.8 ± 1.9 |
| dsekercioglu.mega.Raven 3.56j8 | hadur2.Hadur 3.8 | 100 | 70.6% ± 3.8 | 70.3% ± 3.2 | -0.3 ± 5.2 | 43.5% ± 1.8 | 38.3% ± 1.0 | -5.2 ± 2.1 |
| dsekercioglu.mega.WhiteFang 2.8.1 | hadur2.Hadur 3.8.5 | 100 | 86.6% ± 2.8 | 83.0% ± 2.3 | -3.6 ± 3.9 | 54.6% ± 1.5 | 49.2% ± 1.4 | -5.4 ± 2.0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | hadur2.Hadur 3.8 | 100 | 83.6% ± 3.1 | 84.2% ± 2.4 | +0.6 ± 3.8 | 54.7% ± 1.4 | 50.8% ± 1.2 | -3.9 ± 1.9 |
| gh.GresSuffurd 0.4.13 | hadur2.Hadur 3.8.5 | 100 | 69.0% ± 3.8 | 76.2% ± 2.7 | +7.3 ± 4.9 | 47.3% ± 1.9 | 50.0% ± 1.5 | +2.7 ± 2.4 |
| gh.GresSuffurd 0.4.13 | hadur2.Hadur 3.8 | 100 | 71.3% ± 3.9 | 77.2% ± 2.6 | +5.9 ± 4.8 | 48.6% ± 1.8 | 50.8% ± 1.4 | +2.2 ± 2.4 |
| jk.mega.DrussGT 3.1.16 | hadur2.Hadur 3.8.5 | 100 | 51.2% ± 4.0 | 46.2% ± 2.9 | -5.0 ± 5.1 | 56.5% ± 1.5 | 44.0% ± 0.7 | -12.5 ± 1.7 |
| jk.mega.DrussGT 3.1.16 | hadur2.Hadur 3.8 | 100 | 48.6% ± 4.2 | 49.3% ± 3.3 | +0.7 ± 5.1 | 56.2% ± 1.3 | 44.7% ± 0.8 | -11.5 ± 1.5 |
| jk.melee.Neuromancer 7.12 | hadur2.Hadur 3.8.5 | 100 | 47.2% ± 4.9 | 56.8% ± 3.5 | +9.6 ± 6.5 | 54.5% ± 1.7 | 46.6% ± 0.9 | -7.9 ± 2.1 |
| jk.melee.Neuromancer 7.12 | hadur2.Hadur 3.8 | 100 | 50.0% ± 4.5 | 57.4% ± 3.1 | +7.4 ± 5.2 | 54.5% ± 1.6 | 46.6% ± 0.9 | -7.9 ± 1.7 |
| kc.mega.BeepBoop 2.0 | hadur2.Hadur 3.8.5 | 100 | 7.2% ± 2.1 | 16.6% ± 2.4 | +9.4 ± 3.1 | 44.5% ± 1.5 | 41.4% ± 1.0 | -3.1 ± 1.7 |
| kc.mega.BeepBoop 2.0 | hadur2.Hadur 3.8 | 100 | 8.6% ± 2.7 | 17.2% ± 2.5 | +8.6 ± 3.7 | 42.5% ± 1.6 | 41.3% ± 1.0 | -1.2 ± 1.9 |
| kc.serpent.WaveSerpent 2.11 | hadur2.Hadur 3.8.5 | 100 | 75.8% ± 3.8 | 77.3% ± 2.7 | +1.5 ± 4.3 | 44.0% ± 1.6 | 41.4% ± 0.8 | -2.6 ± 1.7 |
| kc.serpent.WaveSerpent 2.11 | hadur2.Hadur 3.8 | 100 | 78.6% ± 3.3 | 73.0% ± 3.0 | -5.6 ± 4.6 | 45.4% ± 1.5 | 40.6% ± 0.9 | -4.9 ± 1.6 |
| lxx.Tomcat 3.68 | hadur2.Hadur 3.8.5 | 100 | 69.2% ± 3.6 | 67.1% ± 3.0 | -2.1 ± 4.2 | 46.1% ± 2.0 | 43.2% ± 0.9 | -2.9 ± 2.1 |
| lxx.Tomcat 3.68 | hadur2.Hadur 3.8 | 100 | 65.2% ± 4.1 | 68.9% ± 2.7 | +3.7 ± 4.5 | 46.2% ± 1.9 | 44.2% ± 0.9 | -2.0 ± 2.1 |
| oog.mega.saguaro.Saguaro 1.0 | hadur2.Hadur 3.8.5 | 100 | 87.4% ± 1.9 | 84.1% ± 2.5 | -3.3 ± 3.2 | 90.5% ± 0.6 | 50.6% ± 1.6 | -39.8 ± 1.6 |
| oog.mega.saguaro.Saguaro 1.0 | hadur2.Hadur 3.8 | 100 | 88.8% ± 2.0 | 82.9% ± 2.5 | -5.9 ± 3.4 | 90.8% ± 0.6 | 51.1% ± 1.7 | -39.8 ± 1.7 |
| pc.Wavelet 1.5 | hadur2.Hadur 3.8.5 | 100 | 37.6% ± 4.2 | 52.8% ± 3.0 | +15.2 ± 5.1 | 55.6% ± 1.3 | 47.1% ± 1.3 | -8.5 ± 1.8 |
| pc.Wavelet 1.5 | hadur2.Hadur 3.8 | 100 | 38.8% ± 5.0 | 50.1% ± 3.2 | +11.3 ± 5.6 | 55.0% ± 1.4 | 47.1% ± 0.9 | -8.0 ± 1.6 |
| rsalesc.mega.Knight 0.6.28 | hadur2.Hadur 3.8.5 | 100 | 43.6% ± 4.0 | 60.5% ± 3.2 | +16.9 ± 4.6 | 54.9% ± 1.3 | 50.5% ± 0.8 | -4.4 ± 1.6 |
| rsalesc.mega.Knight 0.6.28 | hadur2.Hadur 3.8 | 100 | 44.7% ± 4.4 | 63.1% ± 3.2 | +18.4 ± 5.0 | 55.5% ± 1.5 | 51.0% ± 0.9 | -4.5 ± 1.6 |
| rsalesc.roborio.Roborio 1.2.4 | hadur2.Hadur 3.8.5 | 100 | 54.2% ± 3.8 | 63.4% ± 2.5 | +9.2 ± 4.5 | 69.4% ± 1.3 | 60.1% ± 1.2 | -9.3 ± 1.9 |
| rsalesc.roborio.Roborio 1.2.4 | hadur2.Hadur 3.8 | 100 | 51.0% ± 4.0 | 59.7% ± 3.0 | +8.7 ± 4.9 | 68.1% ± 1.5 | 59.7% ± 1.2 | -8.4 ± 2.0 |
| voidious.Diamond 1.8.22 | hadur2.Hadur 3.8.5 | 100 | 56.4% ± 3.9 | 55.6% ± 3.4 | -0.8 ± 5.1 | 45.3% ± 1.4 | 39.3% ± 0.9 | -6.0 ± 1.6 |
| voidious.Diamond 1.8.22 | hadur2.Hadur 3.8 | 100 | 48.6% ± 4.3 | 60.9% ± 2.9 | +12.3 ± 5.6 | 44.4% ± 1.6 | 39.4% ± 0.8 | -5.0 ± 1.8 |
| voidious.Dookious 1.573c | hadur2.Hadur 3.8.5 | 100 | 72.7% ± 3.7 | 73.7% ± 2.7 | +1.0 ± 4.7 | 43.6% ± 1.6 | 39.6% ± 1.0 | -4.0 ± 2.0 |
| voidious.Dookious 1.573c | hadur2.Hadur 3.8 | 100 | 71.0% ± 3.7 | 76.6% ± 2.7 | +5.6 ± 4.5 | 44.1% ± 1.7 | 41.6% ± 0.9 | -2.5 ± 1.9 |
| xander.cat.XanderCat 12.9 | hadur2.Hadur 3.8.5 | 100 | 68.8% ± 3.6 | 59.7% ± 3.3 | -9.1 ± 4.8 | 52.1% ± 1.5 | 50.6% ± 1.4 | -1.5 ± 2.0 |
| xander.cat.XanderCat 12.9 | hadur2.Hadur 3.8 | 100 | 67.8% ± 3.5 | 61.7% ± 2.9 | -6.1 ± 4.7 | 51.3% ± 1.5 | 51.0% ± 1.3 | -0.3 ± 1.9 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | +2.8 ± 4.8 | -4.8 ± 4.1 | +0.3 ± 2.3 | -1.6 ± 1.4 |
| aw.Gilgalad 1.99.5c | -3.8 ± 5.8 | +0.5 ± 4.4 | -0.6 ± 2.4 | +0.3 ± 1.7 |
| cb.fire.Firestarter 2.0f | +2.4 ± 4.8 | +2.6 ± 4.3 | +0.4 ± 2.1 | -0.2 ± 1.4 |
| cs.Nene 1.0.5 | -3.1 ± 3.4 | -1.4 ± 3.6 | -1.4 ± 1.7 | -0.4 ± 1.3 |
| davidalves.Phoenix 1.02 | -1.8 ± 4.6 | +0.8 ± 3.7 | -1.0 ± 2.2 | +0.3 ± 1.4 |
| dsekercioglu.mega.Raven 3.56j8 | +2.2 ± 5.5 | +0.6 ± 4.4 | -0.8 ± 2.3 | +0.6 ± 1.4 |
| dsekercioglu.mega.WhiteFang 2.8.1 | +3.0 ± 4.0 | -1.2 ± 3.3 | -0.0 ± 2.0 | -1.6 ± 1.8 |
| gh.GresSuffurd 0.4.13 | -2.4 ± 5.2 | -0.9 ± 4.0 | -1.2 ± 2.4 | -0.8 ± 2.0 |
| jk.mega.DrussGT 3.1.16 | +2.6 ± 6.0 | -3.1 ± 4.1 | +0.3 ± 1.7 | -0.8 ± 1.1 |
| jk.melee.Neuromancer 7.12 | -2.8 ± 6.2 | -0.6 ± 4.7 | +0.0 ± 2.2 | +0.0 ± 1.4 |
| kc.mega.BeepBoop 2.0 | -1.4 ± 3.3 | -0.6 ± 3.4 | +2.1 ± 2.3 | +0.1 ± 1.3 |
| kc.serpent.WaveSerpent 2.11 | -2.8 ± 4.5 | +4.3 ± 4.0 | -1.4 ± 2.0 | +0.8 ± 1.2 |
| lxx.Tomcat 3.68 | +4.0 ± 5.8 | -1.8 ± 3.9 | -0.1 ± 2.7 | -1.0 ± 1.2 |
| oog.mega.saguaro.Saguaro 1.0 | -1.4 ± 2.9 | +1.2 ± 3.6 | -0.4 ± 0.9 | -0.4 ± 2.4 |
| pc.Wavelet 1.5 | -1.2 ± 6.5 | +2.7 ± 4.4 | +0.6 ± 2.0 | +0.1 ± 1.6 |
| rsalesc.mega.Knight 0.6.28 | -1.0 ± 5.1 | -2.6 ± 4.4 | -0.6 ± 1.8 | -0.5 ± 1.2 |
| rsalesc.roborio.Roborio 1.2.4 | +3.2 ± 5.0 | +3.7 ± 3.9 | +1.3 ± 2.0 | +0.4 ± 1.7 |
| voidious.Diamond 1.8.22 | +7.8 ± 5.4 | -5.3 ± 4.5 | +0.9 ± 2.1 | -0.1 ± 1.3 |
| voidious.Dookious 1.573c | +1.8 ± 4.9 | -2.9 ± 4.0 | -0.5 ± 2.2 | -2.0 ± 1.3 |
| xander.cat.XanderCat 12.9 | +1.0 ± 5.0 | -2.0 ± 4.7 | +0.8 ± 2.0 | -0.4 ± 1.9 |
