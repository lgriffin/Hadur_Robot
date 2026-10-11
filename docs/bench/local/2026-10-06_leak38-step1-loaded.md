# Bench: hadur2.Hadur 3.8 (cold)

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 5569 over 128 battles (43.5 per battle, most in one battle 184). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | mid | 64.3% ± 5.4 | 72.9% ± 7.9 | 56.6% ± 3.0 | 102 / 140 | 13.0% ± 1.5 | 13.2% ± 4.3 | 225 | 0 | 1.63 / 53.3 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | mid | 60.1% ± 16.9 | 72.1% ± 22.7 | 48.0% ± 10.5 | 101 / 140 | 10.5% ± 0.8 | 10.4% ± 3.8 | 234 | 0 | 1.29 / 61.1 |
| cw.megas.Silhouette 1.1 | mid | 71.8% ± 3.9 | 86.4% ± 7.8 | 59.1% ± 2.8 | 121 / 140 | 15.7% ± 1.3 | 11.5% ± 2.7 | 168 | 0 | 1.40 / 61.9 |
| kc.micro.Needle 0.101 | mid | 73.7% ± 5.5 | 85.7% ± 6.4 | 61.7% ± 4.5 | 120 / 140 | 13.9% ± 0.9 | 8.6% ± 1.9 | 231 | 0 | 1.78 / 54.8 |
| nat.Hikari dev0001 | lower | 74.5% ± 9.1 | 87.1% ± 15.5 | 62.4% ± 4.9 | 122 / 140 | 15.2% ± 0.6 | 9.2% ± 4.8 | 131 | 0 | 1.19 / 47.1 |
| bvh.fnr.Fenrir 0.36l | lower | 68.8% ± 6.0 | 82.1% ± 7.8 | 56.9% ± 5.2 | 115 / 140 | 13.9% ± 1.5 | 10.9% ± 3.7 | 155 | 0 | 1.23 / 22.4 |
| pa3k.Viper 5.03 | lower | 81.8% ± 6.2 | 90.7% ± 10.1 | 73.1% ± 3.3 | 127 / 140 | 16.8% ± 0.6 | 7.1% ± 1.6 | 164 | 0 | 1.23 / 47.9 |
| apv.NanoLauLectrik 1.0 | lower | 79.7% ± 3.4 | 95.7% ± 4.5 | 62.8% ± 3.8 | 134 / 140 | 15.8% ± 1.6 | 8.5% ± 5.5 | 140 | 0 | 1.57 / 36.6 |
| kinsen.nano.Quarrelet 1.0 | lower | 74.3% ± 8.9 | 90.0% ± 10.8 | 58.0% ± 6.4 | 126 / 140 | 14.5% ± 1.4 | 13.0% ± 12.7 | 155 | 0 | 1.41 / 28.6 |
| exauge.GateKeeper 1.1.121g | lower | 76.7% ± 3.0 | 91.4% ± 0.0 | 61.5% ± 6.3 | 128 / 140 | 15.7% ± 0.8 | 9.7% ± 1.8 | 242 | 0 | 1.47 / 56.2 |
| robar.nano.MosquitoPM 1.0 | lower | 75.2% ± 3.3 | 87.9% ± 6.8 | 63.4% ± 3.5 | 123 / 140 | 18.2% ± 0.6 | 14.4% ± 5.9 | 245 | 0 | 1.26 / 59.6 |
| nz.jdc.nano.AralR 1.1 | lower | 87.0% ± 4.6 | 97.9% ± 6.8 | 77.8% ± 3.2 | 137 / 140 | 20.5% ± 1.2 | 14.8% ± 2.3 | 207 | 0 | 1.77 / 55.7 |
| eat.HumblePieLite 1.0 | lower | 89.3% ± 7.0 | 96.4% ± 8.6 | 82.9% ± 6.1 | 135 / 140 | 33.1% ± 4.0 | 13.0% ± 11.5 | 266 | 0 | 1.78 / 244.7 |
| ne.Chimera 1.2 | lower | 96.1% ± 4.2 | 99.3% ± 2.3 | 41.7% ± 40.6 | 139 / 140 | 0.8% ± 0.5 | 3.8% ± 8.2 | 111 | 0 | 2.47 / 52.2 |
| robar.nano.Scytodes 0.3 | weak | 92.1% ± 4.5 | 98.6% ± 2.6 | 86.8% ± 5.6 | 138 / 140 | 48.5% ± 5.1 | 9.4% ± 6.1 | 173 | 0 | 1.62 / 119.6 |
| gh.nano.Grofvuil 0.2 | weak | 95.9% ± 4.0 | 99.3% ± 2.3 | 92.9% ± 5.8 | 139 / 140 | 39.1% ± 5.0 | 6.0% ± 5.8 | 233 | 0 | 1.45 / 211.1 |
| sadoner.killer 0.2 | weak | 81.8% ± 6.8 | 95.0% ± 4.4 | 70.5% ± 7.7 | 133 / 140 | 21.2% ± 2.1 | 14.0% ± 5.9 | 234 | 0 | 1.47 / 301.6 |
| exauge.Leopard 1.1.019 | weak | 80.7% ± 5.1 | 97.1% ± 5.2 | 72.5% ± 3.4 | 136 / 140 | 79.5% ± 2.6 | 48.2% ± 18.8 | 109 | 0 | 1.14 / 26.1 |
| rapture.Rapture 2.13 | weak | 89.6% ± 9.4 | 93.6% ± 10.1 | 85.8% ± 10.3 | 131 / 140 | 19.4% ± 0.3 | 14.0% ± 9.4 | 244 | 0 | 1.61 / 247.0 |
| pez.nano.Icarus 0.3 | weak | 95.1% ± 2.1 | 99.3% ± 2.3 | 89.8% ± 3.3 | 139 / 140 | 17.5% ± 3.2 | 2.5% ± 1.8 | 133 | 0 | 0.98 / 30.4 |
| repositorio.NanoStep 1.0 | weak | 93.7% ± 2.0 | 99.3% ± 2.3 | 88.7% ± 4.1 | 139 / 140 | 28.0% ± 2.9 | 6.6% ± 3.8 | 220 | 0 | 1.38 / 292.6 |
| dggp.haiku.gpBot_0 1.1 | weak | 92.0% ± 1.9 | 99.3% ± 2.3 | 84.6% ± 5.3 | 139 / 140 | 26.2% ± 1.1 | 10.2% ± 12.1 | 150 | 0 | 1.37 / 59.3 |
| jeremyreeder.Bully 1 | weak | 94.6% ± 2.3 | 98.6% ± 2.6 | 93.0% ± 2.4 | 138 / 140 | 80.9% ± 1.9 | 10.0% ± 10.7 | 100 | 0 | 1.25 / 25.4 |
| fowl3628800.SitAndGo 1.0.0 | weak | 98.0% ± 1.9 | 100.0% ± 0.0 | 96.1% ± 3.6 | 140 / 140 | 32.4% ± 1.4 | 5.4% ± 3.6 | 174 | 0 | 1.57 / 49.6 |
| ntw.Sighup 1.5 | weak | 88.1% ± 5.5 | 97.9% ± 2.3 | 78.7% ± 8.0 | 137 / 140 | 27.1% ± 3.0 | 18.1% ± 17.8 | 462 | 0 | 1.58 / 104.7 |
| yk.JahMicro 1.0 | weak | 91.2% ± 2.6 | 95.0% ± 2.3 | 87.5% ± 3.5 | 133 / 140 | 20.9% ± 1.8 | 10.2% ± 3.7 | 354 | 0 | 1.50 / 135.1 |
| ola.Puffin 1.0 | weak | 96.2% ± 1.9 | 99.3% ± 2.3 | 93.7% ± 2.8 | 139 / 140 | 50.5% ± 7.0 | 10.5% ± 5.7 | 89 | 0 | 1.10 / 30.9 |
| gwah.GBotMarkIV 1.0 | weak | 99.5% ± 0.5 | 100.0% ± 0.0 | 99.0% ± 0.9 | 140 / 140 | 76.2% ± 1.6 | 3.0% ± 6.3 | 50 | 0 | 0.87 / 13.0 |
| jgap.JGAP7247_2 1.0 | weak | 95.1% ± 1.2 | 100.0% ± 0.0 | 90.4% ± 2.2 | 140 / 140 | 39.4% ± 1.3 | 5.1% ± 2.8 | 45 | 0 | 0.73 / 10.3 |
| RobotMarco.MarcoV 0.1 | weak | 99.9% ± 0.2 | 100.0% ± 0.0 | 99.9% ± 0.4 | 140 / 140 | 40.8% ± 1.9 | 0.4% ± 1.1 | 50 | 0 | 0.57 / 13.9 |
| japs.Serenity 1.0 | weak | 99.4% ± 1.5 | 100.0% ± 0.0 | 100.0% ± 0.0 | 140 / 140 | 31.3% ± 3.8 | 0.0% ± 0.0 | 42 | 0 | 0.59 / 14.0 |
| sample.Target 1.0 | weak | 100.0% ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | 140 / 140 | 49.2% ± 2.9 | 0.0% ± 0.0 | 33 | 0 | 0.46 / 10.0 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 7475 | 22 | 6749 | 6747 (90.3%) | 728 (9.7%) | 2 (0.0%) | 339 | 90 | 194 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 6483 | 38 | 5957 | 5957 (91.9%) | 526 (8.1%) | 0 (0.0%) | 252 | 73 | 119 |
| cw.megas.Silhouette 1.1 | 4465 | 12 | 4142 | 4141 (92.7%) | 324 (7.3%) | 1 (0.0%) | 162 | 69 | 98 |
| kc.micro.Needle 0.101 | 5608 | 5 | 5077 | 5077 (90.5%) | 531 (9.5%) | 0 (0.0%) | 237 | 65 | 327 |
| nat.Hikari dev0001 | 4972 | 8 | 4817 | 4814 (96.8%) | 158 (3.2%) | 3 (0.1%) | 176 | 85 | 85 |
| bvh.fnr.Fenrir 0.36l | 5006 | 38 | 4732 | 4730 (94.5%) | 276 (5.5%) | 2 (0.0%) | 212 | 57 | 113 |
| pa3k.Viper 5.03 | 4295 | 16 | 4114 | 4112 (95.7%) | 183 (4.3%) | 2 (0.0%) | 251 | 49 | 79 |
| apv.NanoLauLectrik 1.0 | 3178 | 12 | 3011 | 3003 (94.5%) | 175 (5.5%) | 8 (0.3%) | 298 | 59 | 84 |
| kinsen.nano.Quarrelet 1.0 | 3315 | 12 | 3115 | 3079 (92.9%) | 236 (7.1%) | 36 (1.2%) | 399 | 56 | 88 |
| exauge.GateKeeper 1.1.121g | 3732 | 5 | 3391 | 3353 (89.8%) | 379 (10.2%) | 38 (1.1%) | 468 | 70 | 111 |
| robar.nano.MosquitoPM 1.0 | 3398 | 23 | 2982 | 2968 (87.3%) | 430 (12.7%) | 14 (0.5%) | 371 | 55 | 119 |
| nz.jdc.nano.AralR 1.1 | 3912 | 19 | 3456 | 3424 (87.5%) | 488 (12.5%) | 32 (0.9%) | 238 | 68 | 91 |
| eat.HumblePieLite 1.0 | 1852 | 17 | 1481 | 1481 (80.0%) | 371 (20.0%) | 0 (0.0%) | 7 | 50 | 81 |
| ne.Chimera 1.2 | 148 | 0 | 77 | 77 (52.0%) | 71 (48.0%) | 0 (0.0%) | 4 | 2 | 9 |
| robar.nano.Scytodes 0.3 | 1382 | 13 | 1256 | 1248 (90.3%) | 134 (9.7%) | 8 (0.6%) | 42 | 36 | 66 |
| gh.nano.Grofvuil 0.2 | 2094 | 13 | 1766 | 1764 (84.2%) | 330 (15.8%) | 2 (0.1%) | 51 | 46 | 62 |
| sadoner.killer 0.2 | 3190 | 8 | 2808 | 2806 (88.0%) | 384 (12.0%) | 2 (0.1%) | 41 | 49 | 104 |
| exauge.Leopard 1.1.019 | 1118 | 9 | 1064 | 1064 (95.2%) | 54 (4.8%) | 0 (0.0%) | 137 | 100 | 39 |
| rapture.Rapture 2.13 | 5585 | 16 | 4760 | 4760 (85.2%) | 825 (14.8%) | 0 (0.0%) | 190 | 61 | 111 |
| pez.nano.Icarus 0.3 | 3663 | 16 | 3501 | 3489 (95.2%) | 174 (4.8%) | 12 (0.3%) | 296 | 50 | 73 |
| repositorio.NanoStep 1.0 | 2955 | 16 | 2665 | 2663 (90.1%) | 292 (9.9%) | 2 (0.1%) | 106 | 55 | 63 |
| dggp.haiku.gpBot_0 1.1 | 2022 | 11 | 1803 | 1802 (89.1%) | 220 (10.9%) | 1 (0.1%) | 218 | 41 | 80 |
| jeremyreeder.Bully 1 | 851 | 8 | 830 | 830 (97.5%) | 21 (2.5%) | 0 (0.0%) | 113 | 47 | 23 |
| fowl3628800.SitAndGo 1.0.0 | 2720 | 8 | 2513 | 2467 (90.7%) | 253 (9.3%) | 46 (1.8%) | 523 | 60 | 57 |
| ntw.Sighup 1.5 | 2387 | 28 | 2046 | 2038 (85.4%) | 349 (14.6%) | 8 (0.4%) | 456 | 55 | 84 |
| yk.JahMicro 1.0 | 3272 | 5 | 2956 | 2956 (90.3%) | 316 (9.7%) | 0 (0.0%) | 163 | 57 | 86 |
| ola.Puffin 1.0 | 1840 | 21 | 1783 | 1782 (96.8%) | 58 (3.2%) | 1 (0.1%) | 8 | 87 | 36 |
| gwah.GBotMarkIV 1.0 | 947 | 4 | 932 | 931 (98.3%) | 16 (1.7%) | 1 (0.1%) | 27 | 19 | 14 |
| jgap.JGAP7247_2 1.0 | 1221 | 8 | 1253 | 1188 (97.3%) | 33 (2.7%) | 65 (5.2%) | 699 | 71 | 17 |
| RobotMarco.MarcoV 0.1 | 438 | 1 | 429 | 429 (97.9%) | 9 (2.1%) | 0 (0.0%) | 0 | 8 | 13 |
| japs.Serenity 1.0 | 0 | 0 | 16 | - | - | 16 (100.0%) | 262 | 0 | 8 |
| sample.Target 1.0 | 0 | 0 | 0 | - | - | - | 64 | 0 | 10 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ags.Midboss 1q.fast | 7574 | 694 (9.2%) | 5949 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 6871 | 523 (7.6%) | 4492 |
| cw.megas.Silhouette 1.1 | 4806 | 409 (8.5%) | 3349 |
| kc.micro.Needle 0.101 | 6341 | 494 (7.8%) | 4910 |
| nat.Hikari dev0001 | 5083 | 528 (10.4%) | 3946 |
| bvh.fnr.Fenrir 0.36l | 5931 | 432 (7.3%) | 3525 |
| pa3k.Viper 5.03 | 5225 | 377 (7.2%) | 1908 |
| apv.NanoLauLectrik 1.0 | 3736 | 230 (6.2%) | 2 |
| kinsen.nano.Quarrelet 1.0 | 3843 | 223 (5.8%) | 486 |
| exauge.GateKeeper 1.1.121g | 4672 | 225 (4.8%) | 557 |
| robar.nano.MosquitoPM 1.0 | 3658 | 226 (6.2%) | 4 |
| nz.jdc.nano.AralR 1.1 | 3547 | 264 (7.4%) | 1157 |
| eat.HumblePieLite 1.0 | 2071 | 112 (5.4%) | 0 |
| ne.Chimera 1.2 | 157 | 12 (7.6%) | 1 |
| robar.nano.Scytodes 0.3 | 1499 | 92 (6.1%) | 0 |
| gh.nano.Grofvuil 0.2 | 2000 | 153 (7.7%) | 667 |
| sadoner.killer 0.2 | 3202 | 222 (6.9%) | 1239 |
| exauge.Leopard 1.1.019 | 1084 | 17 (1.6%) | 0 |
| rapture.Rapture 2.13 | 5056 | 375 (7.4%) | 1531 |
| pez.nano.Icarus 0.3 | 3673 | 325 (8.8%) | 2367 |
| repositorio.NanoStep 1.0 | 2654 | 159 (6.0%) | 420 |
| dggp.haiku.gpBot_0 1.1 | 2334 | 131 (5.6%) | 0 |
| jeremyreeder.Bully 1 | 894 | 3 (0.3%) | 0 |
| fowl3628800.SitAndGo 1.0.0 | 2418 | 151 (6.2%) | 380 |
| ntw.Sighup 1.5 | 2599 | 98 (3.8%) | 486 |
| yk.JahMicro 1.0 | 4748 | 253 (5.3%) | 636 |
| ola.Puffin 1.0 | 1751 | 144 (8.2%) | 82 |
| gwah.GBotMarkIV 1.0 | 962 | 20 (2.1%) | 0 |
| jgap.JGAP7247_2 1.0 | 1656 | 77 (4.6%) | 0 |
| RobotMarco.MarcoV 0.1 | 2254 | 28 (1.2%) | 0 |
| japs.Serenity 1.0 | 4329 | 0 (0.0%) | 0 |
| sample.Target 1.0 | 2852 | 0 (0.0%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 650 | 409 | 650 | 741 | 41.2 / 31.6 | 395 | 2200 | 333 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 650 | 456 | 650 | 681 | 29.5 / 31.9 | 211 | 2538 | 508 |
| cw.megas.Silhouette 1.1 | 650 | 401 | 625 | 509 | 44.8 / 31.1 | 1043 | 1566 | 1174 |
| kc.micro.Needle 0.101 | 650 | 418 | 513 | 625 | 41.4 / 25.8 | 358 | 1512 | 0 |
| nat.Hikari dev0001 | 650 | 415 | 650 | 527 | 46.0 / 27.8 | 1195 | 1628 | 1290 |
| bvh.fnr.Fenrir 0.36l | 650 | 478 | 631 | 589 | 41.5 / 31.4 | 619 | 1266 | 1 |
| pa3k.Viper 5.03 | 650 | 422 | 400 | 543 | 52.6 / 19.3 | 1492 | 2135 | 0 |
| apv.NanoLauLectrik 1.0 | 650 | 468 | 531 | 399 | 39.6 / 23.5 | 717 | 2455 | 1568 |
| kinsen.nano.Quarrelet 1.0 | 650 | 497 | 650 | 411 | 36.1 / 26.1 | 516 | 2731 | 1866 |
| exauge.GateKeeper 1.1.121g | 650 | 504 | 481 | 479 | 39.3 / 24.5 | 506 | 1778 | 644 |
| robar.nano.MosquitoPM 1.0 | 650 | 456 | 463 | 399 | 44.6 / 25.9 | 1159 | 2060 | 1211 |
| nz.jdc.nano.AralR 1.1 | 650 | 337 | 463 | 409 | 66.4 / 19.0 | 2044 | 1766 | 558 |
| eat.HumblePieLite 1.0 | 650 | 487 | 400 | 255 | 69.2 / 14.3 | 1327 | 1061 | 17 |
| ne.Chimera 1.2 | 650 | 333 | 650 | 18 | 1.6 / 2.0 | 0 | 100 | 0 |
| robar.nano.Scytodes 0.3 | 650 | 396 | 400 | 185 | 75.7 / 11.6 | 912 | 1839 | 286 |
| gh.nano.Grofvuil 0.2 | 650 | 350 | 400 | 238 | 75.0 / 5.9 | 1130 | 1310 | 0 |
| sadoner.killer 0.2 | 650 | 292 | 400 | 368 | 58.3 / 24.6 | 1494 | 2259 | 12 |
| exauge.Leopard 1.1.019 | 650 | 210 | 469 | 142 | 100.3 / 38.2 | 903 | 1139 | 1 |
| rapture.Rapture 2.13 | 650 | 435 | 406 | 544 | 73.1 / 12.5 | 2383 | 1821 | 491 |
| pez.nano.Icarus 0.3 | 650 | 353 | 400 | 402 | 47.0 / 5.4 | 896 | 2926 | 940 |
| repositorio.NanoStep 1.0 | 650 | 464 | 400 | 312 | 72.0 / 9.2 | 1772 | 1478 | 199 |
| dggp.haiku.gpBot_0 1.1 | 650 | 407 | 400 | 275 | 57.5 / 10.6 | 1442 | 1922 | 1003 |
| jeremyreeder.Bully 1 | 650 | 222 | 400 | 120 | 83.5 / 6.3 | 737 | 1471 | 47 |
| fowl3628800.SitAndGo 1.0.0 | 650 | 451 | 400 | 289 | 76.9 / 3.2 | 1691 | 1139 | 121 |
| ntw.Sighup 1.5 | 650 | 381 | 400 | 306 | 57.3 / 15.8 | 1471 | 1835 | 386 |
| yk.JahMicro 1.0 | 650 | 443 | 400 | 523 | 76.7 / 11.1 | 2604 | 796 | 64 |
| ola.Puffin 1.0 | 650 | 350 | 400 | 217 | 90.9 / 6.1 | 1275 | 1110 | 61 |
| gwah.GBotMarkIV 1.0 | 650 | 212 | 400 | 130 | 82.2 / 0.8 | 739 | 1155 | 88 |
| jgap.JGAP7247_2 1.0 | 650 | 432 | 400 | 203 | 67.2 / 7.2 | 1102 | 1321 | 849 |
| RobotMarco.MarcoV 0.1 | 650 | 411 | 400 | 267 | 90.7 / 0.1 | 1361 | 326 | 29 |
| japs.Serenity 1.0 | 650 | 516 | 650 | 466 | 96.5 / 0.0 | 857 | 9 | 64 |
| sample.Target 1.0 | 650 | 518 | 650 | 306 | 98.9 / 0.0 | 0 | 0 | 40 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 13.2% | 225 | 198 | 3 | 47.7 | 652 / 694 (94%) | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 10.4% | 234 | 323 | 3 | 41.8 | 495 / 523 (95%) | 0 | 0 |
| cw.megas.Silhouette 1.1 | 11.5% | 168 | 67 | 3 | 29.5 | 391 / 409 (96%) | 0 | 0 |
| kc.micro.Needle 0.101 | 8.6% | 231 | 2014 | 3 | 36.2 | 451 / 494 (91%) | 0 | 0 |
| nat.Hikari dev0001 | 9.2% | 131 | 53 | 3 | 34.4 | 510 / 528 (97%) | 0 | 0 |
| bvh.fnr.Fenrir 0.36l | 10.9% | 155 | 3242 | 3 | 33.7 | 420 / 432 (97%) | 0 | 0 |
| pa3k.Viper 5.03 | 7.1% | 164 | 47 | 3 | 29.4 | 366 / 377 (97%) | 0 | 0 |
| apv.NanoLauLectrik 1.0 | 8.5% | 140 | 51 | 3 | 21.4 | 220 / 230 (96%) | 0 | 0 |
| kinsen.nano.Quarrelet 1.0 | 13.0% | 155 | 60 | 3 | 21.6 | 211 / 223 (95%) | 0 | 0 |
| exauge.GateKeeper 1.1.121g | 9.7% | 242 | 77 | 3 | 24.2 | 196 / 225 (87%) | 0 | 0 |
| robar.nano.MosquitoPM 1.0 | 14.4% | 245 | 2060 | 3 | 21.2 | 199 / 226 (88%) | 0 | 0 |
| nz.jdc.nano.AralR 1.1 | 14.8% | 207 | 96 | 3 | 24.6 | 226 / 264 (86%) | 0 | 0 |
| eat.HumblePieLite 1.0 | 13.0% | 266 | 62 | 3 | 10.5 | 88 / 112 (79%) | 0 | 0 |
| ne.Chimera 1.2 | 3.8% | 111 | 11 | 3 | 0.6 | 11 / 12 (92%) | 0 | 0 |
| robar.nano.Scytodes 0.3 | 9.4% | 173 | 46 | 3 | 9.0 | 86 / 92 (93%) | 0 | 0 |
| gh.nano.Grofvuil 0.2 | 6.0% | 233 | 60 | 3 | 12.6 | 139 / 153 (91%) | 0 | 0 |
| sadoner.killer 0.2 | 14.0% | 234 | 76 | 3 | 19.7 | 199 / 222 (90%) | 0 | 0 |
| exauge.Leopard 1.1.019 | 48.2% | 109 | 25 | 3 | 7.6 | 17 / 17 (100%) | 0 | 0 |
| rapture.Rapture 2.13 | 14.0% | 244 | 477 | 3 | 34.0 | 313 / 375 (83%) | 0 | 0 |
| pez.nano.Icarus 0.3 | 2.5% | 133 | 316 | 3 | 25.0 | 315 / 325 (97%) | 0 | 0 |
| repositorio.NanoStep 1.0 | 6.6% | 220 | 59 | 3 | 19.0 | 145 / 159 (91%) | 0 | 0 |
| dggp.haiku.gpBot_0 1.1 | 10.2% | 150 | 51 | 3 | 12.9 | 122 / 131 (93%) | 0 | 0 |
| jeremyreeder.Bully 1 | 10.0% | 100 | 20 | 3 | 5.9 | 3 / 3 (100%) | 0 | 0 |
| fowl3628800.SitAndGo 1.0.0 | 5.4% | 174 | 46 | 3 | 18.0 | 142 / 151 (94%) | 0 | 0 |
| ntw.Sighup 1.5 | 18.1% | 462 | 61 | 3 | 14.6 | 85 / 98 (87%) | 0 | 0 |
| yk.JahMicro 1.0 | 10.2% | 354 | 69 | 3 | 21.1 | 237 / 253 (94%) | 0 | 0 |
| ola.Puffin 1.0 | 10.5% | 89 | 26 | 3 | 12.7 | 141 / 144 (98%) | 0 | 0 |
| gwah.GBotMarkIV 1.0 | 3.0% | 50 | 23 | 3 | 6.7 | 18 / 20 (90%) | 0 | 0 |
| jgap.JGAP7247_2 1.0 | 5.1% | 45 | 16 | 3 | 9.0 | 77 / 77 (100%) | 0 | 0 |
| RobotMarco.MarcoV 0.1 | 0.4% | 50 | 15 | 3 | 3.1 | 28 / 28 (100%) | 0 | 0 |
| japs.Serenity 1.0 | 0.0% | 42 | 18 | 3 | 0.1 | - | 0 | 0 |
| sample.Target 1.0 | 0.0% | 33 | 12 | 3 | 0.0 | - | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| cw.megas.Silhouette 1.1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| kc.micro.Needle 0.101 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| nat.Hikari dev0001 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| bvh.fnr.Fenrir 0.36l | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| pa3k.Viper 5.03 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| apv.NanoLauLectrik 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| kinsen.nano.Quarrelet 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| exauge.GateKeeper 1.1.121g | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| robar.nano.MosquitoPM 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| nz.jdc.nano.AralR 1.1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| eat.HumblePieLite 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| ne.Chimera 1.2 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| robar.nano.Scytodes 0.3 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| gh.nano.Grofvuil 0.2 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| sadoner.killer 0.2 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| exauge.Leopard 1.1.019 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| rapture.Rapture 2.13 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| pez.nano.Icarus 0.3 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| repositorio.NanoStep 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| dggp.haiku.gpBot_0 1.1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| jeremyreeder.Bully 1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| fowl3628800.SitAndGo 1.0.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| ntw.Sighup 1.5 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| yk.JahMicro 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| ola.Puffin 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| gwah.GBotMarkIV 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| jgap.JGAP7247_2 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| RobotMarco.MarcoV 0.1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| japs.Serenity 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| sample.Target 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | ags.Midboss | 1 | 35 | 284 | 9.7% | 6.9% ± 1.3 | 12.3% | 25.5% / 24.4% | 7.3% | 0 / 0 | T2/M0 | 68% |
| wcsv.PowerHouse.PowerHouse 1.7e3 | wcsv.PowerHouse.PowerHouse | 1 | 35 | 340 | 8.1% | 6.8% ± 1.3 | 10.4% | 21.4% / 22.1% | 11.5% | 0 / 0 | T2/M1 | 62% |
| cw.megas.Silhouette 1.1 | cw.megas.Silhouette | 1 | 35 | 308 | 8.6% | 7.4% ± 1.7 | 13.7% | 26.5% / 24.7% | 9.2% | 0 / 0 | T3/M0 | 72% |
| kc.micro.Needle 0.101 | kc.micro.Needle | 1 | 35 | 296 | 8.2% | 6.7% ± 1.4 | 12.1% | 25.4% / 23.0% | 4.9% | 0 / 0 | T2/M0 | 71% |
| nat.Hikari dev0001 | nat.Hikari | 1 | 35 | 280 | 8.3% | 7.3% ± 1.5 | 14.3% | 30.8% / 31.6% | 24.9% | 0 / 0 | T3/M0 | 77% |
| bvh.fnr.Fenrir 0.36l | bvh.fnr.Fenrir | 1 | 35 | 292 | 8.2% | 8.1% ± 1.7 | 12.4% | 26.9% / 24.3% | 2.9% | 0 / 0 | T3/M0 | 71% |
| pa3k.Viper 5.03 | pa3k.Viper | 1 | 35 | 274 | 7.6% | 6.5% ± 1.6 | 15.6% | 33.8% / 31.1% | 24.8% | 0 / 0 | T2/M0 | 78% |
| apv.NanoLauLectrik 1.0 | apv.NanoLauLectrik | 1 | 35 | 304 | 8.3% | 10.3% ± 2.4 | 15.8% | 33.5% / 29.4% | 13.2% | 0 / 0 | T3/M? | 77% |
| kinsen.nano.Quarrelet 1.0 | kinsen.nano.Quarrelet | 1 | 35 | 316 | 6.9% | 8.4% ± 2.1 | 13.7% | 32.3% / 28.3% | 6.6% | 0 / 0 | T3/M? | 74% |
| exauge.GateKeeper 1.1.121g | exauge.GateKeeper | 1 | 35 | 310 | 6.5% | 7.8% ± 1.9 | 12.2% | 29.7% / 25.7% | 25.4% | 0 / 0 | T3/M0 | 78% |
| robar.nano.MosquitoPM 1.0 | robar.nano.MosquitoPM | 1 | 35 | 316 | 8.4% | 9.0% ± 2.1 | 15.7% | 35.3% / 35.3% | 17.3% | 0 / 0 | T3/M? | 77% |
| nz.jdc.nano.AralR 1.1 | nz.jdc.nano.AralR | 1 | 35 | 300 | 8.8% | 5.0% ± 1.5 | 17.8% | 24.7% / 29.4% | 4.4% | 0 / 0 | T2/M? | 89% |
| eat.HumblePieLite 1.0 | eat.HumblePieLite | 1 | 34 | 300 | 7.3% | 8.8% ± 3.2 | 22.8% | 31.2% / 27.5% | 0.6% | 0 / 0 | T?/M? | 88% |
| ne.Chimera 1.2 | ne.Chimera | 1 | 35 | 272 | 8.6% | 5.2% ± 10.8 | 23.4% | 34.8% / 23.0% | 0.0% | 0 / 0 | T?/M? | 99% |
| robar.nano.Scytodes 0.3 | robar.nano.Scytodes | 1 | 35 | 308 | 7.7% | 9.4% ± 3.6 | 33.2% | 83.1% / 78.7% | 44.2% | 0 / 0 | T?/M? | 92% |
| gh.nano.Grofvuil 0.2 | gh.nano.Grofvuil | 1 | 35 | 296 | 2.3% | 1.4% ± 1.3 | 26.5% | 52.8% / 56.5% | 6.6% | 0 / 0 | T0/M? | 99% |
| sadoner.killer 0.2 | sadoner.killer | 1 | 35 | 288 | 8.9% | 5.6% ± 1.8 | 16.8% | 23.2% / 21.5% | 4.9% | 0 / 0 | T2/M? | 83% |
| exauge.Leopard 1.1.019 | exauge.Leopard | 1 | 35 | 296 | 40.7% | 11.1% ± 3.8 | 44.9% | 20.0% / 18.7% | 3.8% | 0 / 0 | T?/M? | 81% |
| rapture.Rapture 2.13 | rapture.Rapture | 1 | 35 | 294 | 7.1% | 5.7% ± 1.4 | 17.0% | 35.6% / 32.1% | 9.9% | 0 / 0 | T2/M? | 96% |
| pez.nano.Icarus 0.3 | pez.nano.Icarus | 1 | 35 | 292 | 2.3% | 1.6% ± 1.0 | 16.2% | 24.5% / 21.5% | 6.1% | 0 / 0 | T0/M? | 96% |
| repositorio.NanoStep 1.0 | repositorio.NanoStep | 1 | 35 | 312 | 8.9% | 7.6% ± 2.2 | 23.0% | 55.9% / 54.4% | 1.9% | 0 / 0 | T3/M? | 93% |
| dggp.haiku.gpBot_0 1.1 | dggp.haiku.gpBot_0 | 1 | 35 | 304 | 4.6% | 3.4% ± 1.9 | 20.3% | 36.4% / 31.7% | 14.6% | 0 / 0 | T1/M? | 93% |
| jeremyreeder.Bully 1 | jeremyreeder.Bully | 1 | 35 | 300 | 9.6% | 3.1% ± 2.7 | 42.2% | 17.3% / 16.9% | 10.4% | 0 / 0 | T1/M? | 93% |
| fowl3628800.SitAndGo 1.0.0 | fowl3628800.SitAndGo | 1 | 35 | 316 | 2.4% | 1.9% ± 1.2 | 22.7% | 48.7% / 46.9% | 16.9% | 0 / 0 | T0/M? | 99% |
| ntw.Sighup 1.5 | ntw.Sighup | 1 | 35 | 272 | 7.2% | 6.2% ± 2.2 | 17.4% | 32.0% / 29.7% | 17.7% | 0 / 0 | T2/M? | 90% |
| yk.JahMicro 1.0 | yk.JahMicro | 1 | 35 | 276 | 8.2% | 6.9% ± 1.8 | 17.8% | 36.2% / 32.2% | 3.0% | 0 / 0 | T2/M0 | 91% |
| ola.Puffin 1.0 | ola.Puffin | 1 | 35 | 272 | 12.1% | 8.5% ± 2.9 | 34.4% | 47.3% / 47.7% | 0.1% | 0 / 0 | T3/M? | 96% |
| gwah.GBotMarkIV 1.0 | gwah.GBotMarkIV | 1 | 35 | 292 | 1.3% | 0.4% ± 1.4 | 39.8% | 22.2% / 21.7% | 1.8% | 0 / 0 | T0/M? | 99% |
| jgap.JGAP7247_2 1.0 | jgap.JGAP7247_2 | 1 | 35 | 292 | 5.2% | 6.5% ± 3.0 | 25.3% | 71.3% / 71.2% | 22.8% | 0 / 0 | T2/M? | 95% |
| RobotMarco.MarcoV 0.1 | RobotMarco.MarcoV | 1 | 35 | 300 | 0.0% | 0.0% ± 2.5 | 27.1% | 61.2% / 59.7% | 65.6% | 0 / 0 | T0/M? | 100% |
| japs.Serenity 1.0 | japs.Serenity | 1 | 35 | 284 | 0.0% | 0.0% ± 30.0 | 23.8% | 48.1% / 39.3% | 0.7% | 0 / 0 | T?/M? | 100% |
| sample.Target 1.0 | sample.Target | 1 | 35 | 284 | - | - | 36.6% | 72.3% / 63.6% | 78.6% | 0 / 0 | T?/M? | 100% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.8 vs hadur2.Hadur 3.7

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| ags.Midboss 1q.fast | 64.3% ± 5.4 | 56.7% ± 10.7 | +7.6 ± 14.9 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 60.1% ± 16.9 | 55.9% ± 4.1 | +4.1 ± 18.9 |
| cw.megas.Silhouette 1.1 | 71.8% ± 3.9 | 65.1% ± 10.9 | +6.7 ± 12.4 |
| kc.micro.Needle 0.101 | 73.7% ± 5.5 | 70.8% ± 9.1 | +2.9 ± 7.6 |
| nat.Hikari dev0001 | 74.5% ± 9.1 | 73.4% ± 5.7 | +1.0 ± 8.4 |
| bvh.fnr.Fenrir 0.36l | 68.8% ± 6.0 | 70.8% ± 7.5 | -2.0 ± 11.0 |
| pa3k.Viper 5.03 | 81.8% ± 6.2 | 73.3% ± 6.1 | +8.6 ± 7.8 |
| apv.NanoLauLectrik 1.0 | 79.7% ± 3.4 | 80.8% ± 6.8 | -1.1 ± 8.5 |
| kinsen.nano.Quarrelet 1.0 | 74.3% ± 8.9 | 75.3% ± 9.7 | -1.0 ± 14.2 |
| exauge.GateKeeper 1.1.121g | 76.7% ± 3.0 | 71.5% ± 7.8 | +5.2 ± 8.0 |
| robar.nano.MosquitoPM 1.0 | 75.2% ± 3.3 | 78.2% ± 4.6 | -3.0 ± 4.0 |
| nz.jdc.nano.AralR 1.1 | 87.0% ± 4.6 | 87.1% ± 4.9 | -0.0 ± 7.5 |
| eat.HumblePieLite 1.0 | 89.3% ± 7.0 | 92.0% ± 2.8 | -2.7 ± 8.2 |
| ne.Chimera 1.2 | 96.1% ± 4.2 | 97.1% ± 0.8 | -1.1 ± 4.2 |
| robar.nano.Scytodes 0.3 | 92.1% ± 4.5 | 93.0% ± 4.3 | -1.0 ± 8.5 |
| gh.nano.Grofvuil 0.2 | 95.9% ± 4.0 | 94.8% ± 4.6 | +1.2 ± 7.7 |
| sadoner.killer 0.2 | 81.8% ± 6.8 | 83.6% ± 6.2 | -1.8 ± 11.2 |
| exauge.Leopard 1.1.019 | 80.7% ± 5.1 | 80.6% ± 5.3 | +0.1 ± 1.7 |
| rapture.Rapture 2.13 | 89.6% ± 9.4 | 93.6% ± 6.6 | -4.0 ± 3.5 |
| pez.nano.Icarus 0.3 | 95.1% ± 2.1 | 95.7% ± 3.6 | -0.6 ± 3.6 |
| repositorio.NanoStep 1.0 | 93.7% ± 2.0 | 93.8% ± 4.6 | -0.1 ± 5.1 |
| dggp.haiku.gpBot_0 1.1 | 92.0% ± 1.9 | 93.7% ± 4.5 | -1.7 ± 3.1 |
| jeremyreeder.Bully 1 | 94.6% ± 2.3 | 95.4% ± 5.0 | -0.8 ± 4.6 |
| fowl3628800.SitAndGo 1.0.0 | 98.0% ± 1.9 | 97.6% ± 2.8 | +0.3 ± 4.4 |
| ntw.Sighup 1.5 | 88.1% ± 5.5 | 90.1% ± 6.3 | -2.0 ± 6.0 |
| yk.JahMicro 1.0 | 91.2% ± 2.6 | 92.7% ± 2.7 | -1.5 ± 4.9 |
| ola.Puffin 1.0 | 96.2% ± 1.9 | 96.9% ± 3.6 | -0.7 ± 5.2 |
| gwah.GBotMarkIV 1.0 | 99.5% ± 0.5 | 99.6% ± 0.5 | -0.1 ± 0.3 |
| jgap.JGAP7247_2 1.0 | 95.1% ± 1.2 | 96.4% ± 1.5 | -1.2 ± 1.1 |
| RobotMarco.MarcoV 0.1 | 99.9% ± 0.2 | 100.0% ± 0.0 | -0.1 ± 0.2 |
| japs.Serenity 1.0 | 99.4% ± 1.5 | 99.7% ± 0.5 | -0.4 ± 1.6 |
| sample.Target 1.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 |

# Bench: hadur2.Hadur 3.8 baseline (hadur2.Hadur 3.7) (cold)

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 4790 over 128 battles (37.4 per battle, most in one battle 173). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | mid | 56.7% ± 10.7 | 62.6% ± 12.5 | 51.8% ± 9.0 | 88 / 140 | 12.5% ± 1.6 | 36.2% ± 48.6 | 228 | 0 | 1.71 / 72.8 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | mid | 55.9% ± 4.1 | 67.1% ± 5.9 | 45.5% ± 3.1 | 94 / 140 | 10.0% ± 0.3 | 20.0% ± 18.5 | 196 | 0 | 1.39 / 52.0 |
| cw.megas.Silhouette 1.1 | mid | 65.1% ± 10.9 | 75.7% ± 14.1 | 56.0% ± 8.2 | 106 / 140 | 15.2% ± 2.8 | 18.2% ± 17.1 | 135 | 0 | 1.32 / 47.4 |
| kc.micro.Needle 0.101 | mid | 70.8% ± 9.1 | 83.6% ± 13.6 | 58.8% ± 6.9 | 117 / 140 | 14.3% ± 2.2 | 21.7% ± 27.5 | 169 | 0 | 1.74 / 58.7 |
| nat.Hikari dev0001 | lower | 73.4% ± 5.7 | 84.3% ± 7.9 | 63.3% ± 3.8 | 118 / 140 | 15.2% ± 1.6 | 10.9% ± 1.7 | 163 | 0 | 1.14 / 26.1 |
| bvh.fnr.Fenrir 0.36l | lower | 70.8% ± 7.5 | 83.5% ± 11.2 | 59.3% ± 5.2 | 117 / 140 | 13.9% ± 1.8 | 17.4% ± 13.9 | 191 | 0 | 1.23 / 43.6 |
| pa3k.Viper 5.03 | lower | 73.3% ± 6.1 | 83.6% ± 11.4 | 64.0% ± 2.4 | 117 / 140 | 16.8% ± 2.0 | 20.8% ± 15.4 | 160 | 0 | 1.56 / 33.7 |
| apv.NanoLauLectrik 1.0 | lower | 80.8% ± 6.8 | 95.7% ± 5.9 | 65.4% ± 6.7 | 134 / 140 | 16.5% ± 2.1 | 8.5% ± 3.6 | 126 | 0 | 1.50 / 56.6 |
| kinsen.nano.Quarrelet 1.0 | lower | 75.3% ± 9.7 | 90.7% ± 7.8 | 59.4% ± 9.7 | 127 / 140 | 15.8% ± 1.1 | 11.6% ± 2.4 | 218 | 0 | 1.38 / 51.4 |
| exauge.GateKeeper 1.1.121g | lower | 71.5% ± 7.8 | 87.1% ± 10.8 | 56.6% ± 5.3 | 122 / 140 | 14.8% ± 1.0 | 12.2% ± 5.9 | 165 | 0 | 1.66 / 41.5 |
| robar.nano.MosquitoPM 1.0 | lower | 78.2% ± 4.6 | 92.1% ± 5.7 | 65.1% ± 4.2 | 129 / 140 | 18.3% ± 2.8 | 15.3% ± 16.2 | 185 | 0 | 1.44 / 50.3 |
| nz.jdc.nano.AralR 1.1 | lower | 87.1% ± 4.9 | 95.7% ± 4.5 | 79.4% ± 5.4 | 134 / 140 | 21.2% ± 1.6 | 14.7% ± 10.6 | 182 | 0 | 1.02 / 87.5 |
| eat.HumblePieLite 1.0 | lower | 92.0% ± 2.8 | 100.0% ± 0.0 | 85.1% ± 4.2 | 140 / 140 | 35.1% ± 5.1 | 10.9% ± 5.3 | 209 | 0 | 1.39 / 205.0 |
| ne.Chimera 1.2 | lower | 97.1% ± 0.8 | 100.0% ± 0.0 | 55.5% ± 12.2 | 140 / 140 | 0.9% ± 0.8 | 0.6% ± 0.3 | 51 | 0 | 1.10 / 22.3 |
| robar.nano.Scytodes 0.3 | weak | 93.0% ± 4.3 | 99.3% ± 2.3 | 87.7% ± 5.5 | 139 / 140 | 47.9% ± 3.9 | 9.1% ± 8.6 | 294 | 0 | 1.49 / 146.6 |
| gh.nano.Grofvuil 0.2 | weak | 94.8% ± 4.6 | 96.4% ± 4.4 | 93.0% ± 5.5 | 135 / 140 | 38.5% ± 3.2 | 15.0% ± 13.3 | 274 | 0 | 1.21 / 128.2 |
| sadoner.killer 0.2 | weak | 83.6% ± 6.2 | 93.6% ± 6.8 | 74.9% ± 5.6 | 131 / 140 | 22.4% ± 2.0 | 12.0% ± 7.5 | 129 | 0 | 1.06 / 149.2 |
| exauge.Leopard 1.1.019 | weak | 80.6% ± 5.3 | 95.0% ± 7.8 | 73.7% ± 2.7 | 133 / 140 | 80.2% ± 1.1 | 52.1% ± 22.8 | 313 | 0 | 1.06 / 56.1 |
| rapture.Rapture 2.13 | weak | 93.6% ± 6.6 | 97.9% ± 4.4 | 89.8% ± 8.5 | 137 / 140 | 20.3% ± 1.9 | 17.6% ± 39.5 | 209 | 0 | 0.91 / 281.3 |
| pez.nano.Icarus 0.3 | weak | 95.7% ± 3.6 | 99.3% ± 2.3 | 90.7% ± 5.8 | 139 / 140 | 16.3% ± 2.5 | 4.3% ± 7.3 | 121 | 0 | 1.06 / 263.5 |
| repositorio.NanoStep 1.0 | weak | 93.8% ± 4.6 | 97.9% ± 4.4 | 90.2% ± 5.4 | 137 / 140 | 26.9% ± 2.2 | 8.4% ± 11.4 | 185 | 0 | 1.18 / 242.8 |
| dggp.haiku.gpBot_0 1.1 | weak | 93.7% ± 4.5 | 100.0% ± 0.0 | 86.9% ± 9.2 | 140 / 140 | 25.5% ± 3.6 | 5.0% ± 1.2 | 175 | 0 | 1.72 / 44.7 |
| jeremyreeder.Bully 1 | weak | 95.4% ± 5.0 | 99.3% ± 2.3 | 93.6% ± 5.2 | 139 / 140 | 82.3% ± 2.1 | 11.5% ± 22.0 | 133 | 0 | 1.52 / 46.8 |
| fowl3628800.SitAndGo 1.0.0 | weak | 97.6% ± 2.8 | 99.3% ± 2.3 | 96.1% ± 3.3 | 139 / 140 | 33.5% ± 5.5 | 7.7% ± 8.6 | 155 | 0 | 1.45 / 47.4 |
| ntw.Sighup 1.5 | weak | 90.1% ± 6.3 | 96.4% ± 5.7 | 83.6% ± 7.4 | 135 / 140 | 26.7% ± 0.4 | 13.5% ± 9.4 | 131 | 0 | 1.20 / 65.1 |
| yk.JahMicro 1.0 | weak | 92.7% ± 2.7 | 95.7% ± 4.5 | 89.4% ± 2.4 | 134 / 140 | 19.7% ± 2.0 | 9.0% ± 4.3 | 51 | 0 | 0.77 / 16.4 |
| ola.Puffin 1.0 | weak | 96.9% ± 3.6 | 99.3% ± 2.3 | 95.2% ± 4.3 | 139 / 140 | 52.8% ± 6.1 | 17.3% ± 34.9 | 54 | 0 | 0.87 / 13.6 |
| gwah.GBotMarkIV 1.0 | weak | 99.6% ± 0.5 | 100.0% ± 0.0 | 99.2% ± 1.0 | 140 / 140 | 75.7% ± 2.0 | 0.7% ± 1.0 | 42 | 0 | 0.64 / 10.7 |
| jgap.JGAP7247_2 1.0 | weak | 96.4% ± 1.5 | 100.0% ± 0.0 | 92.8% ± 2.9 | 140 / 140 | 39.0% ± 2.8 | 2.9% ± 1.5 | 40 | 0 | 0.64 / 9.2 |
| RobotMarco.MarcoV 0.1 | weak | 100.0% ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | 140 / 140 | 38.8% ± 3.8 | 0.0% ± 0.0 | 38 | 0 | 0.51 / 12.7 |
| japs.Serenity 1.0 | weak | 99.7% ± 0.5 | 100.0% ± 0.0 | 100.0% ± 0.0 | 140 / 140 | 31.3% ± 2.4 | 0.0% ± 0.0 | 36 | 0 | 0.52 / 11.6 |
| sample.Target 1.0 | weak | 100.0% ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | 140 / 140 | 49.8% ± 4.0 | 0.0% ± 0.0 | 32 | 0 | 0.39 / 10.2 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 7036 | 23 | 6161 | 6160 (87.5%) | 876 (12.5%) | 1 (0.0%) | 306 | 96 | 138 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 6720 | 39 | 6121 | 6120 (91.1%) | 600 (8.9%) | 1 (0.0%) | 245 | 61 | 139 |
| cw.megas.Silhouette 1.1 | 4493 | 9 | 4147 | 4147 (92.3%) | 346 (7.7%) | 0 (0.0%) | 129 | 51 | 73 |
| kc.micro.Needle 0.101 | 5498 | 12 | 5053 | 5046 (91.8%) | 452 (8.2%) | 7 (0.1%) | 259 | 60 | 168 |
| nat.Hikari dev0001 | 4865 | 12 | 4483 | 4480 (92.1%) | 385 (7.9%) | 3 (0.1%) | 145 | 79 | 97 |
| bvh.fnr.Fenrir 0.36l | 4932 | 54 | 4383 | 4383 (88.9%) | 549 (11.1%) | 0 (0.0%) | 152 | 76 | 115 |
| pa3k.Viper 5.03 | 5002 | 9 | 4447 | 4445 (88.9%) | 557 (11.1%) | 2 (0.0%) | 389 | 68 | 108 |
| apv.NanoLauLectrik 1.0 | 3042 | 10 | 2931 | 2926 (96.2%) | 116 (3.8%) | 5 (0.2%) | 290 | 60 | 69 |
| kinsen.nano.Quarrelet 1.0 | 3180 | 25 | 2846 | 2815 (88.5%) | 365 (11.5%) | 31 (1.1%) | 385 | 59 | 134 |
| exauge.GateKeeper 1.1.121g | 3935 | 3 | 3536 | 3511 (89.2%) | 424 (10.8%) | 25 (0.7%) | 431 | 64 | 117 |
| robar.nano.MosquitoPM 1.0 | 3321 | 18 | 2990 | 2980 (89.7%) | 341 (10.3%) | 10 (0.3%) | 346 | 70 | 198 |
| nz.jdc.nano.AralR 1.1 | 3722 | 13 | 3399 | 3376 (90.7%) | 346 (9.3%) | 23 (0.7%) | 232 | 68 | 87 |
| eat.HumblePieLite 1.0 | 1735 | 7 | 1446 | 1446 (83.3%) | 289 (16.7%) | 0 (0.0%) | 4 | 45 | 50 |
| ne.Chimera 1.2 | 134 | 1 | 134 | 134 (100.0%) | 0 (0.0%) | 0 (0.0%) | 3 | 4 | 7 |
| robar.nano.Scytodes 0.3 | 1388 | 18 | 1263 | 1252 (90.2%) | 136 (9.8%) | 11 (0.9%) | 30 | 36 | 55 |
| gh.nano.Grofvuil 0.2 | 2321 | 11 | 1732 | 1729 (74.5%) | 592 (25.5%) | 3 (0.2%) | 62 | 51 | 51 |
| sadoner.killer 0.2 | 2901 | 8 | 2751 | 2751 (94.8%) | 150 (5.2%) | 0 (0.0%) | 65 | 52 | 65 |
| exauge.Leopard 1.1.019 | 1093 | 7 | 1020 | 1019 (93.2%) | 74 (6.8%) | 1 (0.1%) | 149 | 109 | 50 |
| rapture.Rapture 2.13 | 4375 | 16 | 3758 | 3757 (85.9%) | 618 (14.1%) | 1 (0.0%) | 30 | 64 | 60 |
| pez.nano.Icarus 0.3 | 3747 | 7 | 3567 | 3554 (94.8%) | 193 (5.2%) | 13 (0.4%) | 315 | 60 | 55 |
| repositorio.NanoStep 1.0 | 3082 | 10 | 2500 | 2500 (81.1%) | 582 (18.9%) | 0 (0.0%) | 72 | 46 | 67 |
| dggp.haiku.gpBot_0 1.1 | 2034 | 21 | 1848 | 1847 (90.8%) | 187 (9.2%) | 1 (0.1%) | 232 | 47 | 64 |
| jeremyreeder.Bully 1 | 840 | 4 | 817 | 817 (97.3%) | 23 (2.7%) | 0 (0.0%) | 62 | 34 | 37 |
| fowl3628800.SitAndGo 1.0.0 | 2694 | 19 | 2425 | 2375 (88.2%) | 319 (11.8%) | 50 (2.1%) | 548 | 58 | 49 |
| ntw.Sighup 1.5 | 2251 | 38 | 2129 | 2114 (93.9%) | 137 (6.1%) | 15 (0.7%) | 522 | 76 | 50 |
| yk.JahMicro 1.0 | 3370 | 3 | 3372 | 3274 (97.2%) | 96 (2.8%) | 98 (2.9%) | 197 | 43 | 12 |
| ola.Puffin 1.0 | 1707 | 24 | 1616 | 1616 (94.7%) | 91 (5.3%) | 0 (0.0%) | 5 | 69 | 191 |
| gwah.GBotMarkIV 1.0 | 940 | 2 | 941 | 940 (100.0%) | 0 (0.0%) | 1 (0.1%) | 23 | 28 | 4 |
| jgap.JGAP7247_2 1.0 | 1210 | 6 | 1267 | 1208 (99.8%) | 2 (0.2%) | 59 (4.7%) | 612 | 52 | 11 |
| RobotMarco.MarcoV 0.1 | 451 | 0 | 451 | 451 (100.0%) | 0 (0.0%) | 0 (0.0%) | 1 | 9 | 11 |
| japs.Serenity 1.0 | 0 | 0 | 41 | - | - | 41 (100.0%) | 312 | 0 | 8 |
| sample.Target 1.0 | 0 | 0 | 0 | - | - | - | 61 | 0 | 5 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ags.Midboss 1q.fast | 7051 | 618 (8.8%) | 4957 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 7197 | 637 (8.9%) | 5184 |
| cw.megas.Silhouette 1.1 | 4851 | 420 (8.7%) | 2625 |
| kc.micro.Needle 0.101 | 6420 | 503 (7.8%) | 5015 |
| nat.Hikari dev0001 | 4939 | 508 (10.3%) | 3840 |
| bvh.fnr.Fenrir 0.36l | 5792 | 418 (7.2%) | 2867 |
| pa3k.Viper 5.03 | 6285 | 394 (6.3%) | 1428 |
| apv.NanoLauLectrik 1.0 | 3522 | 229 (6.5%) | 466 |
| kinsen.nano.Quarrelet 1.0 | 3789 | 204 (5.4%) | 916 |
| exauge.GateKeeper 1.1.121g | 4860 | 267 (5.5%) | 889 |
| robar.nano.MosquitoPM 1.0 | 3597 | 234 (6.5%) | 807 |
| nz.jdc.nano.AralR 1.1 | 3360 | 244 (7.3%) | 1848 |
| eat.HumblePieLite 1.0 | 1977 | 85 (4.3%) | 0 |
| ne.Chimera 1.2 | 147 | 12 (8.2%) | 14 |
| robar.nano.Scytodes 0.3 | 1515 | 101 (6.7%) | 0 |
| gh.nano.Grofvuil 0.2 | 2206 | 169 (7.7%) | 631 |
| sadoner.killer 0.2 | 2873 | 205 (7.1%) | 1651 |
| exauge.Leopard 1.1.019 | 1072 | 21 (2.0%) | 0 |
| rapture.Rapture 2.13 | 3991 | 225 (5.6%) | 613 |
| pez.nano.Icarus 0.3 | 3749 | 241 (6.4%) | 1644 |
| repositorio.NanoStep 1.0 | 2731 | 167 (6.1%) | 247 |
| dggp.haiku.gpBot_0 1.1 | 2358 | 132 (5.6%) | 0 |
| jeremyreeder.Bully 1 | 895 | 1 (0.1%) | 0 |
| fowl3628800.SitAndGo 1.0.0 | 2384 | 125 (5.2%) | 852 |
| ntw.Sighup 1.5 | 2466 | 93 (3.8%) | 0 |
| yk.JahMicro 1.0 | 4964 | 297 (6.0%) | 2242 |
| ola.Puffin 1.0 | 1689 | 124 (7.3%) | 350 |
| gwah.GBotMarkIV 1.0 | 948 | 31 (3.3%) | 0 |
| jgap.JGAP7247_2 1.0 | 1651 | 78 (4.7%) | 0 |
| RobotMarco.MarcoV 0.1 | 2219 | 20 (0.9%) | 0 |
| japs.Serenity 1.0 | 4558 | 0 (0.0%) | 0 |
| sample.Target 1.0 | 2819 | 0 (0.0%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 650 | 412 | 650 | 702 | 38.6 / 35.9 | 452 | 1884 | 205 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 650 | 461 | 650 | 701 | 29.1 / 34.8 | 88 | 1289 | 577 |
| cw.megas.Silhouette 1.1 | 650 | 403 | 625 | 517 | 42.8 / 33.6 | 826 | 1649 | 1419 |
| kc.micro.Needle 0.101 | 650 | 425 | 531 | 635 | 42.1 / 29.4 | 470 | 1645 | 1 |
| nat.Hikari dev0001 | 650 | 412 | 563 | 515 | 46.6 / 27.0 | 1087 | 1399 | 1008 |
| bvh.fnr.Fenrir 0.36l | 650 | 485 | 650 | 583 | 43.3 / 29.6 | 470 | 1957 | 37 |
| pa3k.Viper 5.03 | 650 | 444 | 550 | 634 | 49.2 / 27.7 | 1178 | 1330 | 30 |
| apv.NanoLauLectrik 1.0 | 650 | 463 | 469 | 380 | 42.9 / 22.8 | 1087 | 2468 | 1234 |
| kinsen.nano.Quarrelet 1.0 | 650 | 475 | 519 | 399 | 37.2 / 25.9 | 690 | 2161 | 1432 |
| exauge.GateKeeper 1.1.121g | 650 | 507 | 606 | 502 | 39.0 / 29.9 | 462 | 1429 | 638 |
| robar.nano.MosquitoPM 1.0 | 650 | 444 | 463 | 392 | 46.7 / 25.1 | 1280 | 2324 | 1113 |
| nz.jdc.nano.AralR 1.1 | 650 | 333 | 400 | 390 | 66.3 / 17.2 | 2044 | 1737 | 554 |
| eat.HumblePieLite 1.0 | 650 | 485 | 400 | 246 | 72.3 / 12.9 | 1288 | 914 | 0 |
| ne.Chimera 1.2 | 650 | 341 | 650 | 16 | 2.5 / 1.9 | 4 | 80 | 0 |
| robar.nano.Scytodes 0.3 | 650 | 405 | 400 | 186 | 75.6 / 10.8 | 920 | 1738 | 375 |
| gh.nano.Grofvuil 0.2 | 650 | 353 | 400 | 260 | 73.6 / 5.6 | 1114 | 1259 | 0 |
| sadoner.killer 0.2 | 650 | 289 | 419 | 335 | 60.5 / 20.3 | 1592 | 2523 | 0 |
| exauge.Leopard 1.1.019 | 650 | 214 | 463 | 141 | 98.2 / 35.2 | 859 | 1192 | 1 |
| rapture.Rapture 2.13 | 650 | 407 | 400 | 449 | 71.9 / 8.4 | 2176 | 1695 | 428 |
| pez.nano.Icarus 0.3 | 650 | 365 | 400 | 410 | 46.2 / 4.7 | 899 | 2421 | 1061 |
| repositorio.NanoStep 1.0 | 650 | 454 | 400 | 320 | 71.5 / 7.9 | 1642 | 1646 | 32 |
| dggp.haiku.gpBot_0 1.1 | 650 | 422 | 400 | 277 | 55.8 / 8.5 | 1431 | 1899 | 1022 |
| jeremyreeder.Bully 1 | 650 | 214 | 400 | 120 | 83.7 / 5.8 | 714 | 1499 | 40 |
| fowl3628800.SitAndGo 1.0.0 | 650 | 460 | 400 | 285 | 76.7 / 3.1 | 1667 | 817 | 167 |
| ntw.Sighup 1.5 | 650 | 375 | 400 | 288 | 57.5 / 11.4 | 1551 | 1865 | 513 |
| yk.JahMicro 1.0 | 650 | 456 | 463 | 548 | 76.9 / 9.1 | 2767 | 593 | 17 |
| ola.Puffin 1.0 | 650 | 324 | 400 | 209 | 90.9 / 4.7 | 1166 | 918 | 118 |
| gwah.GBotMarkIV 1.0 | 650 | 210 | 400 | 129 | 82.2 / 0.6 | 751 | 1258 | 90 |
| jgap.JGAP7247_2 1.0 | 650 | 437 | 400 | 203 | 68.2 / 5.3 | 1144 | 1277 | 976 |
| RobotMarco.MarcoV 0.1 | 650 | 427 | 400 | 265 | 90.4 / 0.0 | 1403 | 286 | 62 |
| japs.Serenity 1.0 | 650 | 513 | 588 | 484 | 97.0 / 0.0 | 1009 | 0 | 172 |
| sample.Target 1.0 | 650 | 509 | 650 | 303 | 98.9 / 0.0 | 0 | 0 | 0 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 36.2% | 228 | 5968 | 3 | 43.0 | 568 / 618 (92%) | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 20.0% | 196 | 98 | 3 | 43.2 | 597 / 637 (94%) | 0 | 0 |
| cw.megas.Silhouette 1.1 | 18.2% | 135 | 60 | 3 | 29.1 | 391 / 420 (93%) | 0 | 0 |
| kc.micro.Needle 0.101 | 21.7% | 169 | 94 | 3 | 35.9 | 482 / 503 (96%) | 0 | 0 |
| nat.Hikari dev0001 | 10.9% | 163 | 39 | 3 | 32.0 | 479 / 508 (94%) | 0 | 0 |
| bvh.fnr.Fenrir 0.36l | 17.4% | 191 | 77 | 3 | 31.3 | 381 / 418 (91%) | 0 | 0 |
| pa3k.Viper 5.03 | 20.8% | 160 | 93 | 3 | 31.5 | 366 / 394 (93%) | 0 | 0 |
| apv.NanoLauLectrik 1.0 | 8.5% | 126 | 76 | 3 | 20.9 | 218 / 229 (95%) | 0 | 0 |
| kinsen.nano.Quarrelet 1.0 | 11.6% | 218 | 139 | 3 | 20.3 | 177 / 204 (87%) | 0 | 0 |
| exauge.GateKeeper 1.1.121g | 12.2% | 165 | 103 | 3 | 24.9 | 233 / 267 (87%) | 0 | 0 |
| robar.nano.MosquitoPM 1.0 | 15.3% | 185 | 105 | 3 | 21.4 | 204 / 234 (87%) | 0 | 0 |
| nz.jdc.nano.AralR 1.1 | 14.7% | 182 | 1259 | 3 | 24.3 | 227 / 244 (93%) | 0 | 0 |
| eat.HumblePieLite 1.0 | 10.9% | 209 | 69 | 3 | 10.3 | 71 / 85 (84%) | 0 | 0 |
| ne.Chimera 1.2 | 0.6% | 51 | 7 | 2 | 1.0 | 12 / 12 (100%) | 0 | 0 |
| robar.nano.Scytodes 0.3 | 9.1% | 294 | 89 | 3 | 9.0 | 90 / 101 (89%) | 0 | 0 |
| gh.nano.Grofvuil 0.2 | 15.0% | 274 | 17 | 3 | 12.4 | 131 / 169 (78%) | 0 | 0 |
| sadoner.killer 0.2 | 12.0% | 129 | 91 | 3 | 19.5 | 202 / 205 (99%) | 0 | 0 |
| exauge.Leopard 1.1.019 | 52.1% | 313 | 42 | 3 | 7.3 | 20 / 21 (95%) | 0 | 0 |
| rapture.Rapture 2.13 | 17.6% | 209 | 45 | 3 | 26.8 | 186 / 225 (83%) | 0 | 0 |
| pez.nano.Icarus 0.3 | 4.3% | 121 | 46 | 3 | 25.4 | 225 / 241 (93%) | 0 | 0 |
| repositorio.NanoStep 1.0 | 8.4% | 185 | 32 | 3 | 17.9 | 138 / 167 (83%) | 0 | 0 |
| dggp.haiku.gpBot_0 1.1 | 5.0% | 175 | 437 | 3 | 13.2 | 121 / 132 (92%) | 0 | 0 |
| jeremyreeder.Bully 1 | 11.5% | 133 | 29 | 3 | 5.8 | 1 / 1 (100%) | 0 | 0 |
| fowl3628800.SitAndGo 1.0.0 | 7.7% | 155 | 231 | 3 | 17.3 | 121 / 125 (97%) | 0 | 0 |
| ntw.Sighup 1.5 | 13.5% | 131 | 62 | 3 | 15.2 | 91 / 93 (98%) | 0 | 0 |
| yk.JahMicro 1.0 | 9.0% | 51 | 20 | 3 | 24.1 | 293 / 297 (99%) | 0 | 0 |
| ola.Puffin 1.0 | 17.3% | 54 | 11 | 3 | 11.5 | 123 / 124 (99%) | 0 | 0 |
| gwah.GBotMarkIV 1.0 | 0.7% | 42 | 15 | 3 | 6.7 | 31 / 31 (100%) | 0 | 0 |
| jgap.JGAP7247_2 1.0 | 2.9% | 40 | 13 | 3 | 9.0 | 78 / 78 (100%) | 0 | 0 |
| RobotMarco.MarcoV 0.1 | 0.0% | 38 | 19 | 3 | 3.2 | 20 / 20 (100%) | 0 | 0 |
| japs.Serenity 1.0 | 0.0% | 36 | 14 | 2 | 0.3 | - | 0 | 0 |
| sample.Target 1.0 | 0.0% | 32 | 10 | 2 | 0.0 | - | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| cw.megas.Silhouette 1.1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| kc.micro.Needle 0.101 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| nat.Hikari dev0001 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| bvh.fnr.Fenrir 0.36l | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| pa3k.Viper 5.03 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| apv.NanoLauLectrik 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| kinsen.nano.Quarrelet 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| exauge.GateKeeper 1.1.121g | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| robar.nano.MosquitoPM 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| nz.jdc.nano.AralR 1.1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| eat.HumblePieLite 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| ne.Chimera 1.2 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| robar.nano.Scytodes 0.3 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| gh.nano.Grofvuil 0.2 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| sadoner.killer 0.2 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| exauge.Leopard 1.1.019 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| rapture.Rapture 2.13 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| pez.nano.Icarus 0.3 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| repositorio.NanoStep 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| dggp.haiku.gpBot_0 1.1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| jeremyreeder.Bully 1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| fowl3628800.SitAndGo 1.0.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| ntw.Sighup 1.5 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| yk.JahMicro 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| ola.Puffin 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| gwah.GBotMarkIV 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| jgap.JGAP7247_2 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| RobotMarco.MarcoV 0.1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| japs.Serenity 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| sample.Target 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
