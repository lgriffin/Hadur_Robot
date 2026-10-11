# Bench: hadur2.Hadur 3.9 (cold)

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 6578 over 512 battles (12.8 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | mid | 72.3% ± 2.7 | 85.2% ± 3.7 | 60.1% ± 2.1 | 477 / 560 | 13.4% ± 0.5 | 9.3% ± 1.0 | 376 | 0 | 1.36 / 46.7 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | mid | 62.9% ± 1.3 | 78.9% ± 1.9 | 46.6% ± 1.7 | 442 / 560 | 10.8% ± 0.2 | 7.5% ± 0.3 | 168 | 0 | 1.04 / 15.8 |
| cw.megas.Silhouette 1.1 | mid | 72.1% ± 3.1 | 85.3% ± 4.4 | 60.0% ± 2.1 | 478 / 560 | 15.3% ± 0.6 | 7.9% ± 0.4 | 148 | 0 | 1.04 / 17.3 |
| kc.micro.Needle 0.101 | mid | 76.4% ± 3.2 | 90.9% ± 3.9 | 61.5% ± 2.4 | 509 / 560 | 13.7% ± 0.4 | 6.6% ± 0.4 | 159 | 0 | 1.18 / 17.7 |
| nat.Hikari dev0001 | lower | 83.0% ± 1.5 | 96.6% ± 1.7 | 69.4% ± 1.9 | 541 / 560 | 15.5% ± 0.3 | 6.4% ± 0.4 | 177 | 0 | 0.94 / 16.1 |
| bvh.fnr.Fenrir 0.36l | lower | 76.3% ± 1.4 | 89.8% ± 1.6 | 63.4% ± 1.7 | 503 / 560 | 15.2% ± 0.6 | 7.6% ± 0.6 | 259 | 0 | 1.03 / 16.9 |
| pa3k.Viper 5.03 | lower | 80.7% ± 2.1 | 91.3% ± 2.7 | 70.5% ± 1.8 | 511 / 560 | 16.2% ± 0.5 | 7.2% ± 0.6 | 161 | 0 | 1.02 / 16.0 |
| apv.NanoLauLectrik 1.0 | lower | 79.6% ± 1.6 | 95.2% ± 1.5 | 63.5% ± 2.0 | 533 / 560 | 16.0% ± 0.6 | 6.1% ± 0.4 | 177 | 0 | 1.01 / 181.0 |
| kinsen.nano.Quarrelet 1.0 | lower | 76.4% ± 2.8 | 91.3% ± 2.6 | 60.8% ± 3.0 | 511 / 560 | 15.6% ± 0.7 | 6.1% ± 0.6 | 195 | 0 | 0.92 / 18.0 |
| exauge.GateKeeper 1.1.121g | lower | 78.1% ± 2.1 | 93.4% ± 2.3 | 62.3% ± 2.3 | 523 / 560 | 14.8% ± 0.7 | 6.8% ± 0.3 | 170 | 0 | 0.93 / 17.1 |
| robar.nano.MosquitoPM 1.0 | lower | 84.3% ± 1.4 | 96.8% ± 1.6 | 71.6% ± 1.5 | 542 / 560 | 19.1% ± 0.4 | 6.6% ± 1.1 | 188 | 0 | 0.93 / 17.7 |
| nz.jdc.nano.AralR 1.1 | lower | 90.6% ± 0.9 | 99.5% ± 0.6 | 82.9% ± 1.3 | 557 / 560 | 22.3% ± 0.8 | 8.6% ± 0.8 | 171 | 0 | 0.79 / 240.9 |
| eat.HumblePieLite 1.0 | lower | 91.2% ± 1.6 | 99.5% ± 1.1 | 84.2% ± 2.0 | 557 / 560 | 36.2% ± 1.3 | 7.2% ± 0.7 | 181 | 0 | 0.73 / 10.4 |
| ne.Chimera 1.2 | lower | 97.8% ± 1.0 | 99.6% ± 0.5 | 63.8% ± 8.3 | 558 / 560 | 0.7% ± 0.2 | 1.3% ± 1.9 | 98 | 0 | 0.72 / 17.7 |
| robar.nano.Scytodes 0.3 | weak | 94.5% ± 1.0 | 99.8% ± 0.4 | 89.9% ± 1.6 | 559 / 560 | 49.7% ± 1.1 | 6.2% ± 2.0 | 187 | 0 | 0.74 / 58.7 |
| gh.nano.Grofvuil 0.2 | weak | 98.2% ± 0.3 | 100.0% ± 0.0 | 96.4% ± 0.5 | 560 / 560 | 41.5% ± 1.1 | 1.9% ± 0.3 | 185 | 0 | 0.66 / 14.1 |
| sadoner.killer 0.2 | weak | 84.0% ± 2.1 | 94.5% ± 2.2 | 74.7% ± 2.3 | 529 / 560 | 21.3% ± 0.9 | 8.6% ± 0.9 | 193 | 0 | 0.86 / 17.7 |
| exauge.Leopard 1.1.019 | weak | 83.1% ± 1.0 | 99.3% ± 0.7 | 74.6% ± 1.3 | 556 / 560 | 79.8% ± 0.7 | 38.1% ± 3.4 | 175 | 0 | 0.59 / 12.3 |
| rapture.Rapture 2.13 | weak | 97.1% ± 1.0 | 99.5% ± 0.6 | 94.8% ± 1.4 | 557 / 560 | 21.1% ± 0.7 | 3.1% ± 0.9 | 178 | 0 | 0.80 / 19.1 |
| pez.nano.Icarus 0.3 | weak | 97.6% ± 0.4 | 100.0% ± 0.0 | 94.3% ± 1.0 | 560 / 560 | 17.2% ± 0.6 | 1.3% ± 0.2 | 176 | 0 | 0.65 / 75.9 |
| repositorio.NanoStep 1.0 | weak | 97.1% ± 1.1 | 99.1% ± 0.7 | 95.4% ± 1.5 | 555 / 560 | 27.6% ± 0.9 | 1.9% ± 0.6 | 189 | 0 | 0.79 / 15.6 |
| dggp.haiku.gpBot_0 1.1 | weak | 92.6% ± 1.6 | 98.6% ± 1.1 | 86.7% ± 2.3 | 552 / 560 | 27.7% ± 0.9 | 6.6% ± 2.7 | 312 | 0 | 1.11 / 388.8 |
| jeremyreeder.Bully 1 | weak | 94.1% ± 1.5 | 98.9% ± 0.9 | 92.4% ± 1.4 | 554 / 560 | 81.3% ± 0.7 | 11.6% ± 4.3 | 246 | 0 | 0.75 / 12.3 |
| fowl3628800.SitAndGo 1.0.0 | weak | 99.0% ± 0.2 | 100.0% ± 0.0 | 98.0% ± 0.4 | 560 / 560 | 31.7% ± 1.1 | 1.9% ± 0.3 | 245 | 0 | 0.98 / 542.7 |
| ntw.Sighup 1.5 | weak | 89.8% ± 1.2 | 99.3% ± 0.9 | 81.2% ± 1.9 | 556 / 560 | 29.8% ± 1.5 | 10.2% ± 2.6 | 229 | 0 | 0.93 / 64.2 |
| yk.JahMicro 1.0 | weak | 93.7% ± 1.0 | 98.4% ± 1.5 | 89.6% ± 1.2 | 551 / 560 | 23.8% ± 1.2 | 6.8% ± 0.9 | 255 | 0 | 0.92 / 1426.4 |
| ola.Puffin 1.0 | weak | 97.8% ± 0.8 | 100.0% ± 0.0 | 96.4% ± 1.1 | 560 / 560 | 53.6% ± 1.6 | 6.5% ± 2.0 | 219 | 0 | 0.92 / 12.6 |
| gwah.GBotMarkIV 1.0 | weak | 99.3% ± 0.3 | 100.0% ± 0.0 | 98.6% ± 0.5 | 560 / 560 | 74.9% ± 1.1 | 3.5% ± 2.1 | 233 | 0 | 0.74 / 40.3 |
| jgap.JGAP7247_2 1.0 | weak | 95.4% ± 0.6 | 100.0% ± 0.0 | 90.9% ± 1.1 | 560 / 560 | 38.6% ± 0.9 | 4.2% ± 1.1 | 225 | 0 | 0.94 / 15.7 |
| RobotMarco.MarcoV 0.1 | weak | 100.0% ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.1 | 560 / 560 | 40.2% ± 1.8 | 0.3% ± 0.4 | 240 | 0 | 0.81 / 1401.7 |
| japs.Serenity 1.0 | weak | 98.9% ± 0.3 | 100.0% ± 0.0 | 100.0% ± 0.0 | 560 / 560 | 33.2% ± 1.7 | 0.0% ± 0.0 | 267 | 0 | 0.85 / 1164.7 |
| sample.Target 1.0 | weak | 100.0% ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | 560 / 560 | 50.9% ± 1.0 | 0.0% ± 0.0 | 196 | 0 | 0.64 / 12.1 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 16 | 11 | 894 | 0 | 0.67 | 3 | 3 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 16 | 10 | 298 | 0 | 0.30 | 5 | 5 | 0 |
| cw.megas.Silhouette 1.1 | 16 | 11 | 0 | 0 | 0.26 | 5 | 5 | 0 |
| kc.micro.Needle 0.101 | 16 | 16 | 0 | 0 | 0.28 | 0 | 0 | 0 |
| nat.Hikari dev0001 | 16 | 16 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| bvh.fnr.Fenrir 0.36l | 16 | 14 | 596 | 0 | 0.46 | 0 | 0 | 0 |
| pa3k.Viper 5.03 | 16 | 12 | 596 | 0 | 0.29 | 3 | 3 | 0 |
| apv.NanoLauLectrik 1.0 | 16 | 16 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| kinsen.nano.Quarrelet 1.0 | 16 | 13 | 894 | 0 | 0.35 | 0 | 0 | 0 |
| exauge.GateKeeper 1.1.121g | 16 | 14 | 298 | 0 | 0.30 | 1 | 1 | 0 |
| robar.nano.MosquitoPM 1.0 | 16 | 14 | 574 | 0 | 0.34 | 0 | 0 | 0 |
| nz.jdc.nano.AralR 1.1 | 16 | 15 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| eat.HumblePieLite 1.0 | 16 | 13 | 894 | 0 | 0.32 | 0 | 0 | 0 |
| ne.Chimera 1.2 | 16 | 12 | 1353 | 0 | 0.18 | 0 | 0 | 16 |
| robar.nano.Scytodes 0.3 | 16 | 14 | 867 | 0 | 0.33 | 0 | 0 | 0 |
| gh.nano.Grofvuil 0.2 | 16 | 14 | 596 | 0 | 0.33 | 0 | 0 | 0 |
| sadoner.killer 0.2 | 16 | 14 | 596 | 0 | 0.34 | 0 | 0 | 0 |
| exauge.Leopard 1.1.019 | 16 | 14 | 434 | 0 | 0.31 | 0 | 0 | 0 |
| rapture.Rapture 2.13 | 16 | 14 | 596 | 0 | 0.32 | 0 | 0 | 0 |
| pez.nano.Icarus 0.3 | 16 | 16 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| repositorio.NanoStep 1.0 | 16 | 13 | 687 | 0 | 0.34 | 0 | 0 | 0 |
| dggp.haiku.gpBot_0 1.1 | 16 | 4 | 4253 | 0 | 0.56 | 0 | 0 | 0 |
| jeremyreeder.Bully 1 | 16 | 5 | 2286 | 0 | 0.44 | 0 | 0 | 0 |
| fowl3628800.SitAndGo 1.0.0 | 16 | 9 | 2086 | 0 | 0.44 | 0 | 0 | 0 |
| ntw.Sighup 1.5 | 16 | 8 | 2502 | 0 | 0.41 | 1 | 1 | 0 |
| yk.JahMicro 1.0 | 16 | 9 | 2980 | 0 | 0.46 | 0 | 0 | 0 |
| ola.Puffin 1.0 | 16 | 13 | 894 | 0 | 0.39 | 0 | 0 | 0 |
| gwah.GBotMarkIV 1.0 | 16 | 8 | 2145 | 0 | 0.42 | 0 | 0 | 0 |
| jgap.JGAP7247_2 1.0 | 16 | 8 | 2208 | 0 | 0.40 | 0 | 0 | 0 |
| RobotMarco.MarcoV 0.1 | 16 | 9 | 2638 | 0 | 0.43 | 0 | 0 | 0 |
| japs.Serenity 1.0 | 16 | 9 | 2635 | 0 | 0.48 | 1 | 1 | 0 |
| sample.Target 1.0 | 16 | 13 | 894 | 0 | 0.35 | 0 | 0 | 0 |

381 of 512 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 32614 | 104 | 32538 | 32534 (99.8%) | 80 (0.2%) | 4 (0.0%) | 1757 | 488 | 303 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 28946 | 176 | 28924 | 28923 (99.9%) | 23 (0.1%) | 1 (0.0%) | 1594 | 285 | 113 |
| cw.megas.Silhouette 1.1 | 17851 | 37 | 17851 | 17850 (100.0%) | 1 (0.0%) | 1 (0.0%) | 614 | 258 | 76 |
| kc.micro.Needle 0.101 | 22939 | 28 | 22974 | 22939 (100.0%) | 0 (0.0%) | 35 (0.2%) | 1212 | 339 | 43 |
| nat.Hikari dev0001 | 19063 | 44 | 19068 | 19062 (100.0%) | 1 (0.0%) | 6 (0.0%) | 493 | 290 | 68 |
| bvh.fnr.Fenrir 0.36l | 18824 | 155 | 18785 | 18783 (99.8%) | 41 (0.2%) | 2 (0.0%) | 787 | 282 | 120 |
| pa3k.Viper 5.03 | 18636 | 34 | 18606 | 18598 (99.8%) | 38 (0.2%) | 8 (0.0%) | 1199 | 285 | 59 |
| apv.NanoLauLectrik 1.0 | 12617 | 33 | 12650 | 12612 (100.0%) | 5 (0.0%) | 38 (0.3%) | 1123 | 230 | 57 |
| kinsen.nano.Quarrelet 1.0 | 12838 | 35 | 12909 | 12757 (99.4%) | 81 (0.6%) | 152 (1.2%) | 1590 | 269 | 63 |
| exauge.GateKeeper 1.1.121g | 14958 | 11 | 15017 | 14905 (99.6%) | 53 (0.4%) | 112 (0.7%) | 2052 | 321 | 59 |
| robar.nano.MosquitoPM 1.0 | 12403 | 41 | 12408 | 12351 (99.6%) | 52 (0.4%) | 57 (0.5%) | 1527 | 283 | 59 |
| nz.jdc.nano.AralR 1.1 | 14204 | 42 | 14267 | 14153 (99.6%) | 51 (0.4%) | 114 (0.8%) | 928 | 299 | 53 |
| eat.HumblePieLite 1.0 | 6462 | 38 | 6413 | 6412 (99.2%) | 50 (0.8%) | 1 (0.0%) | 29 | 172 | 48 |
| ne.Chimera 1.2 | 526 | 0 | 430 | 430 (81.7%) | 96 (18.3%) | 0 (0.0%) | 10 | 7 | 210 |
| robar.nano.Scytodes 0.3 | 5157 | 34 | 5153 | 5102 (98.9%) | 55 (1.1%) | 51 (1.0%) | 158 | 183 | 45 |
| gh.nano.Grofvuil 0.2 | 7273 | 50 | 7252 | 7237 (99.5%) | 36 (0.5%) | 15 (0.2%) | 261 | 191 | 43 |
| sadoner.killer 0.2 | 11788 | 40 | 11750 | 11748 (99.7%) | 40 (0.3%) | 2 (0.0%) | 167 | 200 | 63 |
| exauge.Leopard 1.1.019 | 4299 | 36 | 4273 | 4271 (99.3%) | 28 (0.7%) | 2 (0.0%) | 983 | 433 | 45 |
| rapture.Rapture 2.13 | 16498 | 40 | 16458 | 16453 (99.7%) | 45 (0.3%) | 5 (0.0%) | 205 | 240 | 39 |
| pez.nano.Icarus 0.3 | 14410 | 38 | 14420 | 14371 (99.7%) | 39 (0.3%) | 49 (0.3%) | 1268 | 244 | 41 |
| repositorio.NanoStep 1.0 | 10630 | 64 | 10565 | 10561 (99.4%) | 69 (0.6%) | 4 (0.0%) | 400 | 207 | 474 |
| dggp.haiku.gpBot_0 1.1 | 7427 | 41 | 7187 | 7180 (96.7%) | 247 (3.3%) | 7 (0.1%) | 928 | 190 | 102 |
| jeremyreeder.Bully 1 | 3388 | 25 | 3288 | 3288 (97.0%) | 100 (3.0%) | 0 (0.0%) | 647 | 154 | 56 |
| fowl3628800.SitAndGo 1.0.0 | 10620 | 43 | 10472 | 10306 (97.0%) | 314 (3.0%) | 166 (1.6%) | 2444 | 255 | 61 |
| ntw.Sighup 1.5 | 8687 | 61 | 8544 | 8508 (97.9%) | 179 (2.1%) | 36 (0.4%) | 2747 | 327 | 58 |
| yk.JahMicro 1.0 | 10859 | 17 | 10794 | 10714 (98.7%) | 145 (1.3%) | 80 (0.7%) | 571 | 198 | 60 |
| ola.Puffin 1.0 | 6412 | 35 | 6352 | 6343 (98.9%) | 69 (1.1%) | 9 (0.1%) | 216 | 237 | 212 |
| gwah.GBotMarkIV 1.0 | 3889 | 16 | 3766 | 3762 (96.7%) | 127 (3.3%) | 4 (0.1%) | 120 | 99 | 49 |
| jgap.JGAP7247_2 1.0 | 4976 | 29 | 5086 | 4845 (97.4%) | 131 (2.6%) | 241 (4.7%) | 2613 | 282 | 54 |
| RobotMarco.MarcoV 0.1 | 1801 | 7 | 1784 | 1783 (99.0%) | 18 (1.0%) | 1 (0.1%) | 6 | 46 | 86 |
| japs.Serenity 1.0 | 0 | 0 | 53 | - | - | 53 (100.0%) | 1383 | 1 | 61 |
| sample.Target 1.0 | 0 | 0 | 0 | - | - | - | 228 | 0 | 45 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ags.Midboss 1q.fast | 33016 | 3093 (9.4%) | 28474 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 31575 | 2844 (9.0%) | 28139 |
| cw.megas.Silhouette 1.1 | 19175 | 1609 (8.4%) | 14283 |
| kc.micro.Needle 0.101 | 26888 | 2034 (7.6%) | 18966 |
| nat.Hikari dev0001 | 19431 | 1960 (10.1%) | 16842 |
| bvh.fnr.Fenrir 0.36l | 21926 | 1496 (6.8%) | 11029 |
| pa3k.Viper 5.03 | 22722 | 1652 (7.3%) | 11231 |
| apv.NanoLauLectrik 1.0 | 14785 | 1032 (7.0%) | 4991 |
| kinsen.nano.Quarrelet 1.0 | 15306 | 892 (5.8%) | 2231 |
| exauge.GateKeeper 1.1.121g | 19213 | 926 (4.8%) | 3296 |
| robar.nano.MosquitoPM 1.0 | 13285 | 855 (6.4%) | 4647 |
| nz.jdc.nano.AralR 1.1 | 12627 | 962 (7.6%) | 5748 |
| eat.HumblePieLite 1.0 | 7194 | 350 (4.9%) | 43 |
| ne.Chimera 1.2 | 593 | 40 (6.7%) | 11 |
| robar.nano.Scytodes 0.3 | 5542 | 379 (6.8%) | 1102 |
| gh.nano.Grofvuil 0.2 | 6843 | 530 (7.7%) | 298 |
| sadoner.killer 0.2 | 11728 | 887 (7.6%) | 4469 |
| exauge.Leopard 1.1.019 | 4234 | 89 (2.1%) | 0 |
| rapture.Rapture 2.13 | 14811 | 984 (6.6%) | 6260 |
| pez.nano.Icarus 0.3 | 14335 | 1028 (7.2%) | 4787 |
| repositorio.NanoStep 1.0 | 9403 | 589 (6.3%) | 1587 |
| dggp.haiku.gpBot_0 1.1 | 8410 | 418 (5.0%) | 0 |
| jeremyreeder.Bully 1 | 3601 | 15 (0.4%) | 0 |
| fowl3628800.SitAndGo 1.0.0 | 9304 | 545 (5.9%) | 2257 |
| ntw.Sighup 1.5 | 9400 | 436 (4.6%) | 841 |
| yk.JahMicro 1.0 | 15345 | 790 (5.1%) | 1439 |
| ola.Puffin 1.0 | 6273 | 488 (7.8%) | 943 |
| gwah.GBotMarkIV 1.0 | 3988 | 143 (3.6%) | 64 |
| jgap.JGAP7247_2 1.0 | 6712 | 270 (4.0%) | 0 |
| RobotMarco.MarcoV 0.1 | 8906 | 84 (0.9%) | 0 |
| japs.Serenity 1.0 | 16706 | 0 (0.0%) | 0 |
| sample.Target 1.0 | 11040 | 0 (0.0%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 650 | 409 | 631 | 789 | 42.7 / 28.5 | 1972 | 9726 | 1839 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 650 | 466 | 650 | 747 | 28.9 / 33.1 | 568 | 13678 | 3364 |
| cw.megas.Silhouette 1.1 | 650 | 402 | 606 | 506 | 44.1 / 29.5 | 3602 | 7846 | 4472 |
| kc.micro.Needle 0.101 | 650 | 430 | 522 | 656 | 40.2 / 25.3 | 1422 | 5125 | 6 |
| nat.Hikari dev0001 | 650 | 413 | 567 | 507 | 47.7 / 21.2 | 4361 | 8397 | 5366 |
| bvh.fnr.Fenrir 0.36l | 650 | 469 | 591 | 553 | 45.9 / 26.5 | 3072 | 8198 | 163 |
| pa3k.Viper 5.03 | 650 | 442 | 520 | 582 | 52.2 / 21.9 | 5137 | 8668 | 139 |
| apv.NanoLauLectrik 1.0 | 650 | 459 | 514 | 395 | 40.9 / 23.6 | 3199 | 10813 | 6710 |
| kinsen.nano.Quarrelet 1.0 | 650 | 483 | 561 | 401 | 37.8 / 24.5 | 2645 | 10904 | 7548 |
| exauge.GateKeeper 1.1.121g | 650 | 512 | 603 | 489 | 40.9 / 24.7 | 2115 | 6985 | 3140 |
| robar.nano.MosquitoPM 1.0 | 650 | 446 | 423 | 367 | 49.0 / 19.5 | 5454 | 9320 | 5006 |
| nz.jdc.nano.AralR 1.1 | 650 | 328 | 405 | 372 | 69.5 / 14.5 | 8343 | 8670 | 2283 |
| eat.HumblePieLite 1.0 | 650 | 493 | 400 | 231 | 74.0 / 13.9 | 5424 | 4783 | 132 |
| ne.Chimera 1.2 | 650 | 362 | 634 | 16 | 1.8 / 1.2 | 21 | 165 | 0 |
| robar.nano.Scytodes 0.3 | 650 | 402 | 400 | 174 | 76.6 / 8.7 | 3773 | 7676 | 2184 |
| gh.nano.Grofvuil 0.2 | 650 | 353 | 400 | 212 | 75.5 / 2.8 | 4684 | 5419 | 0 |
| sadoner.killer 0.2 | 650 | 290 | 488 | 340 | 60.0 / 20.5 | 6536 | 10626 | 10 |
| exauge.Leopard 1.1.019 | 650 | 209 | 484 | 139 | 100.1 / 34.3 | 3565 | 5161 | 25 |
| rapture.Rapture 2.13 | 650 | 398 | 400 | 419 | 72.6 / 4.1 | 8697 | 8905 | 2606 |
| pez.nano.Icarus 0.3 | 650 | 359 | 400 | 394 | 47.2 / 2.9 | 3574 | 10527 | 3603 |
| repositorio.NanoStep 1.0 | 650 | 423 | 400 | 285 | 70.3 / 3.4 | 6745 | 7201 | 448 |
| dggp.haiku.gpBot_0 1.1 | 650 | 400 | 400 | 253 | 60.1 / 9.4 | 5807 | 7309 | 3302 |
| jeremyreeder.Bully 1 | 650 | 219 | 400 | 121 | 83.3 / 7.0 | 2885 | 5921 | 179 |
| fowl3628800.SitAndGo 1.0.0 | 650 | 463 | 400 | 281 | 76.4 / 1.5 | 7093 | 3687 | 670 |
| ntw.Sighup 1.5 | 650 | 354 | 400 | 277 | 60.5 / 14.2 | 5974 | 7513 | 1813 |
| yk.JahMicro 1.0 | 650 | 385 | 400 | 436 | 78.1 / 9.1 | 9436 | 3911 | 94 |
| ola.Puffin 1.0 | 650 | 316 | 400 | 197 | 90.6 / 3.4 | 4620 | 3413 | 220 |
| gwah.GBotMarkIV 1.0 | 650 | 214 | 400 | 133 | 82.0 / 1.2 | 3028 | 4731 | 446 |
| jgap.JGAP7247_2 1.0 | 650 | 435 | 400 | 206 | 66.7 / 6.7 | 4590 | 5287 | 2804 |
| RobotMarco.MarcoV 0.1 | 650 | 416 | 400 | 265 | 90.4 / 0.0 | 5390 | 1392 | 194 |
| japs.Serenity 1.0 | 650 | 496 | 650 | 446 | 96.1 / 0.0 | 2145 | 8 | 581 |
| sample.Target 1.0 | 650 | 499 | 650 | 298 | 98.9 / 0.0 | 0 | 0 | 178 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 9.3% | 376 | 22378 | 3 | 57.6 | 3086 / 3093 (100%) | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 7.5% | 168 | 8707 | 3 | 51.1 | 2834 / 2844 (100%) | 0 | 0 |
| cw.megas.Silhouette 1.1 | 7.9% | 148 | 215 | 3 | 31.4 | 1609 / 1609 (100%) | 0 | 0 |
| kc.micro.Needle 0.101 | 6.6% | 159 | 6936 | 3 | 40.9 | 2034 / 2034 (100%) | 0 | 0 |
| nat.Hikari dev0001 | 6.4% | 177 | 117 | 3 | 34.0 | 1958 / 1960 (100%) | 0 | 0 |
| bvh.fnr.Fenrir 0.36l | 7.6% | 259 | 3594 | 3 | 33.5 | 1492 / 1496 (100%) | 0 | 0 |
| pa3k.Viper 5.03 | 7.2% | 161 | 176 | 3 | 33.1 | 1651 / 1652 (100%) | 0 | 0 |
| apv.NanoLauLectrik 1.0 | 6.1% | 177 | 289 | 3 | 22.6 | 1031 / 1032 (100%) | 0 | 0 |
| kinsen.nano.Quarrelet 1.0 | 6.1% | 195 | 172 | 3 | 23.1 | 885 / 892 (99%) | 0 | 0 |
| exauge.GateKeeper 1.1.121g | 6.8% | 170 | 222 | 3 | 26.7 | 921 / 926 (99%) | 0 | 0 |
| robar.nano.MosquitoPM 1.0 | 6.6% | 188 | 2189 | 3 | 22.2 | 852 / 855 (100%) | 0 | 0 |
| nz.jdc.nano.AralR 1.1 | 8.6% | 171 | 204 | 3 | 25.5 | 959 / 962 (100%) | 0 | 0 |
| eat.HumblePieLite 1.0 | 7.2% | 181 | 67 | 3 | 10.9 | 347 / 350 (99%) | 0 | 0 |
| ne.Chimera 1.2 | 1.3% | 98 | 25 | 3 | 0.8 | 35 / 40 (88%) | 0 | 0 |
| robar.nano.Scytodes 0.3 | 6.2% | 187 | 181 | 3 | 9.2 | 376 / 379 (99%) | 0 | 0 |
| gh.nano.Grofvuil 0.2 | 1.9% | 185 | 439 | 3 | 12.9 | 528 / 530 (100%) | 0 | 0 |
| sadoner.killer 0.2 | 8.6% | 193 | 90 | 3 | 20.9 | 887 / 887 (100%) | 0 | 0 |
| exauge.Leopard 1.1.019 | 38.1% | 175 | 42 | 3 | 7.6 | 89 / 89 (100%) | 0 | 0 |
| rapture.Rapture 2.13 | 3.1% | 178 | 84 | 3 | 29.4 | 983 / 984 (100%) | 0 | 0 |
| pez.nano.Icarus 0.3 | 1.3% | 176 | 83 | 3 | 25.7 | 1028 / 1028 (100%) | 0 | 0 |
| repositorio.NanoStep 1.0 | 1.9% | 189 | 74 | 3 | 18.7 | 587 / 589 (100%) | 0 | 0 |
| dggp.haiku.gpBot_0 1.1 | 6.6% | 312 | 77 | 3 | 12.8 | 404 / 418 (97%) | 0 | 0 |
| jeremyreeder.Bully 1 | 11.6% | 246 | 40 | 3 | 5.8 | 15 / 15 (100%) | 0 | 0 |
| fowl3628800.SitAndGo 1.0.0 | 1.9% | 245 | 549 | 3 | 18.7 | 531 / 545 (97%) | 0 | 0 |
| ntw.Sighup 1.5 | 10.2% | 229 | 75 | 3 | 15.1 | 432 / 436 (99%) | 0 | 0 |
| yk.JahMicro 1.0 | 6.8% | 255 | 101 | 3 | 19.2 | 781 / 790 (99%) | 0 | 0 |
| ola.Puffin 1.0 | 6.5% | 219 | 53 | 3 | 11.3 | 486 / 488 (100%) | 0 | 0 |
| gwah.GBotMarkIV 1.0 | 3.5% | 233 | 232 | 3 | 6.7 | 132 / 143 (92%) | 0 | 0 |
| jgap.JGAP7247_2 1.0 | 4.2% | 225 | 573 | 3 | 9.1 | 260 / 270 (96%) | 0 | 0 |
| RobotMarco.MarcoV 0.1 | 0.3% | 240 | 53 | 3 | 3.2 | 84 / 84 (100%) | 0 | 0 |
| japs.Serenity 1.0 | 0.0% | 267 | 59 | 3 | 0.1 | - | 0 | 0 |
| sample.Target 1.0 | 0.0% | 196 | 184 | 3 | 0.0 | - | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cw.megas.Silhouette 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kc.micro.Needle 0.101 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.Hikari dev0001 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bvh.fnr.Fenrir 0.36l | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pa3k.Viper 5.03 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apv.NanoLauLectrik 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kinsen.nano.Quarrelet 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| exauge.GateKeeper 1.1.121g | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| robar.nano.MosquitoPM 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nz.jdc.nano.AralR 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| eat.HumblePieLite 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ne.Chimera 1.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| robar.nano.Scytodes 0.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| gh.nano.Grofvuil 0.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sadoner.killer 0.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| exauge.Leopard 1.1.019 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rapture.Rapture 2.13 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pez.nano.Icarus 0.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| repositorio.NanoStep 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dggp.haiku.gpBot_0 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jeremyreeder.Bully 1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| fowl3628800.SitAndGo 1.0.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ntw.Sighup 1.5 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| yk.JahMicro 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ola.Puffin 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| gwah.GBotMarkIV 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jgap.JGAP7247_2 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| RobotMarco.MarcoV 0.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| japs.Serenity 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sample.Target 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | ags.Midboss | 1 | 35 | 284 | 10.2% | 7.6% ± 1.3 | 11.9% | 23.9% / 23.3% | 8.2% | 0 / 0 | T3/M1 | 70% |
| wcsv.PowerHouse.PowerHouse 1.7e3 | wcsv.PowerHouse.PowerHouse | 1 | 35 | 340 | 8.6% | 8.0% ± 1.4 | 10.5% | 21.9% / 22.5% | 13.2% | 0 / 0 | T3/M1 | 62% |
| cw.megas.Silhouette 1.1 | cw.megas.Silhouette | 1 | 35 | 308 | 9.1% | 7.3% ± 1.7 | 15.1% | 24.7% / 25.5% | 10.0% | 0 / 0 | T3/M1 | 71% |
| kc.micro.Needle 0.101 | kc.micro.Needle | 1 | 35 | 296 | 5.8% | 5.4% ± 1.3 | 11.7% | 24.9% / 22.5% | 4.7% | 0 / 0 | T2/M1 | 82% |
| nat.Hikari dev0001 | nat.Hikari | 1 | 35 | 280 | 8.2% | 7.1% ± 1.5 | 14.4% | 32.7% / 31.6% | 26.3% | 0 / 0 | T3/M0 | 78% |
| bvh.fnr.Fenrir 0.36l | bvh.fnr.Fenrir | 1 | 35 | 292 | 7.8% | 7.2% ± 1.6 | 14.4% | 27.1% / 23.7% | 2.9% | 0 / 0 | T3/M0 | 76% |
| pa3k.Viper 5.03 | pa3k.Viper | 1 | 35 | 274 | 8.3% | 6.6% ± 1.6 | 16.8% | 33.3% / 30.3% | 22.7% | 0 / 0 | T2/M0 | 78% |
| apv.NanoLauLectrik 1.0 | apv.NanoLauLectrik | 1 | 35 | 304 | 7.1% | 8.8% ± 2.1 | 15.1% | 33.7% / 31.7% | 10.9% | 0 / 0 | T3/M? | 80% |
| kinsen.nano.Quarrelet 1.0 | kinsen.nano.Quarrelet | 1 | 35 | 316 | 8.0% | 8.8% ± 2.0 | 13.5% | 30.1% / 28.3% | 6.4% | 0 / 0 | T3/M0 | 71% |
| exauge.GateKeeper 1.1.121g | exauge.GateKeeper | 1 | 35 | 310 | 7.2% | 8.1% ± 1.8 | 12.2% | 30.8% / 27.1% | 28.7% | 0 / 0 | T3/M0 | 77% |
| robar.nano.MosquitoPM 1.0 | robar.nano.MosquitoPM | 1 | 35 | 316 | 8.1% | 7.9% ± 2.0 | 16.4% | 37.3% / 37.4% | 15.2% | 0 / 0 | T3/M? | 80% |
| nz.jdc.nano.AralR 1.1 | nz.jdc.nano.AralR | 1 | 35 | 300 | 10.9% | 6.4% ± 1.7 | 19.2% | 25.4% / 29.6% | 4.3% | 0 / 0 | T2/M? | 88% |
| eat.HumblePieLite 1.0 | eat.HumblePieLite | 1 | 35 | 300 | 13.4% | 16.2% ± 3.8 | 27.3% | 35.6% / 31.6% | 0.5% | 0 / 0 | T?/M? | 86% |
| ne.Chimera 1.2 | ne.Chimera | 1 | 35 | 272 | 29.4% | 0.0% ± 16.2 | 12.9% | 27.7% / 29.4% | 0.0% | 0 / 0 | T?/M? | 94% |
| robar.nano.Scytodes 0.3 | robar.nano.Scytodes | 1 | 35 | 308 | 10.7% | 11.8% ± 3.7 | 31.8% | 75.9% / 68.7% | 48.3% | 0 / 0 | T?/M? | 90% |
| gh.nano.Grofvuil 0.2 | gh.nano.Grofvuil | 1 | 35 | 296 | 3.4% | 2.6% ± 1.7 | 29.1% | 48.6% / 49.3% | 7.9% | 0 / 0 | T1/M? | 97% |
| sadoner.killer 0.2 | sadoner.killer | 1 | 35 | 288 | 12.5% | 8.2% ± 2.0 | 17.7% | 23.0% / 21.4% | 4.8% | 0 / 0 | T3/M? | 77% |
| exauge.Leopard 1.1.019 | exauge.Leopard | 1 | 35 | 296 | 40.2% | 10.2% ± 3.8 | 43.7% | 20.7% / 20.3% | 4.5% | 0 / 0 | T?/M? | 80% |
| rapture.Rapture 2.13 | rapture.Rapture | 1 | 35 | 294 | 2.6% | 1.6% ± 0.8 | 17.1% | 33.2% / 30.0% | 11.3% | 0 / 0 | T0/M? | 97% |
| pez.nano.Icarus 0.3 | pez.nano.Icarus | 1 | 35 | 292 | 1.6% | 0.9% ± 0.7 | 13.7% | 24.2% / 23.2% | 7.0% | 0 / 0 | T0/M1 | 96% |
| repositorio.NanoStep 1.0 | repositorio.NanoStep | 1 | 35 | 312 | 2.4% | 0.9% ± 0.9 | 20.2% | 43.3% / 40.7% | 0.6% | 0 / 0 | T0/M? | 96% |
| dggp.haiku.gpBot_0 1.1 | dggp.haiku.gpBot_0 | 1 | 35 | 304 | 7.8% | 7.9% ± 2.5 | 20.0% | 42.6% / 38.7% | 12.3% | 0 / 0 | T3/M? | 85% |
| jeremyreeder.Bully 1 | jeremyreeder.Bully | 1 | 35 | 300 | 6.2% | 1.6% ± 2.1 | 41.9% | 21.1% / 21.8% | 10.7% | 0 / 0 | T0/M? | 97% |
| fowl3628800.SitAndGo 1.0.0 | fowl3628800.SitAndGo | 1 | 35 | 316 | 2.1% | 1.6% ± 1.1 | 22.5% | 45.7% / 46.1% | 18.5% | 0 / 0 | T0/M? | 99% |
| ntw.Sighup 1.5 | ntw.Sighup | 1 | 35 | 272 | 9.3% | 6.5% ± 2.1 | 17.8% | 32.3% / 28.4% | 16.7% | 0 / 0 | T2/M? | 86% |
| yk.JahMicro 1.0 | yk.JahMicro | 1 | 35 | 276 | 5.9% | 3.9% ± 1.6 | 17.4% | 30.7% / 29.3% | 3.1% | 0 / 0 | T1/M? | 94% |
| ola.Puffin 1.0 | ola.Puffin | 1 | 35 | 272 | 10.5% | 4.6% ± 2.3 | 36.9% | 46.0% / 44.2% | 0.2% | 0 / 0 | T2/M? | 97% |
| gwah.GBotMarkIV 1.0 | gwah.GBotMarkIV | 1 | 35 | 292 | 2.1% | 0.4% ± 1.5 | 37.3% | 22.6% / 23.9% | 3.8% | 0 / 0 | T0/M? | 99% |
| jgap.JGAP7247_2 1.0 | jgap.JGAP7247_2 | 1 | 35 | 292 | 6.2% | 7.6% ± 3.1 | 24.5% | 68.8% / 73.2% | 23.3% | 0 / 0 | T?/M? | 94% |
| RobotMarco.MarcoV 0.1 | RobotMarco.MarcoV | 1 | 35 | 300 | 1.0% | 0.0% ± 2.6 | 28.2% | 62.8% / 60.0% | 65.9% | 0 / 0 | T0/M? | 100% |
| japs.Serenity 1.0 | japs.Serenity | 1 | 35 | 284 | 0.0% | 0.0% ± 37.7 | 24.9% | 48.7% / 41.0% | 1.5% | 0 / 0 | T?/M? | 100% |
| sample.Target 1.0 | sample.Target | 1 | 35 | 284 | - | - | 36.2% | 74.6% / 67.1% | 78.6% | 0 / 0 | T?/M? | 100% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.9 vs hadur2.Hadur 3.8.5

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| ags.Midboss 1q.fast | 72.3% ± 2.7 | 70.9% ± 2.5 | +1.4 ± 3.9 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 62.9% ± 1.3 | 62.3% ± 2.6 | +0.5 ± 2.9 |
| cw.megas.Silhouette 1.1 | 72.1% ± 3.1 | 72.9% ± 2.6 | -0.8 ± 2.9 |
| kc.micro.Needle 0.101 | 76.4% ± 3.2 | 77.0% ± 2.5 | -0.6 ± 4.0 |
| nat.Hikari dev0001 | 83.0% ± 1.5 | 82.8% ± 2.0 | +0.2 ± 2.3 |
| bvh.fnr.Fenrir 0.36l | 76.3% ± 1.4 | 77.1% ± 2.5 | -0.9 ± 2.6 |
| pa3k.Viper 5.03 | 80.7% ± 2.1 | 80.3% ± 3.2 | +0.3 ± 4.0 |
| apv.NanoLauLectrik 1.0 | 79.6% ± 1.6 | 81.4% ± 1.6 | -1.7 ± 2.2 |
| kinsen.nano.Quarrelet 1.0 | 76.4% ± 2.8 | 77.9% ± 1.8 | -1.5 ± 2.7 |
| exauge.GateKeeper 1.1.121g | 78.1% ± 2.1 | 76.7% ± 1.9 | +1.4 ± 3.1 |
| robar.nano.MosquitoPM 1.0 | 84.3% ± 1.4 | 82.9% ± 1.1 | +1.4 ± 1.7 |
| nz.jdc.nano.AralR 1.1 | 90.6% ± 0.9 | 90.0% ± 0.8 | +0.7 ± 1.4 |
| eat.HumblePieLite 1.0 | 91.2% ± 1.6 | 90.4% ± 4.2 | +0.8 ± 4.7 |
| ne.Chimera 1.2 | 97.8% ± 1.0 | 98.2% ± 1.0 | -0.5 ± 1.6 |
| robar.nano.Scytodes 0.3 | 94.5% ± 1.0 | 94.6% ± 0.5 | -0.1 ± 1.0 |
| gh.nano.Grofvuil 0.2 | 98.2% ± 0.3 | 98.3% ± 0.3 | -0.1 ± 0.4 |
| sadoner.killer 0.2 | 84.0% ± 2.1 | 83.2% ± 2.1 | +0.8 ± 2.4 |
| exauge.Leopard 1.1.019 | 83.1% ± 1.0 | 83.3% ± 0.7 | -0.2 ± 0.9 |
| rapture.Rapture 2.13 | 97.1% ± 1.0 | 97.1% ± 0.8 | +0.0 ± 1.4 |
| pez.nano.Icarus 0.3 | 97.6% ± 0.4 | 97.4% ± 0.7 | +0.2 ± 0.7 |
| repositorio.NanoStep 1.0 | 97.1% ± 1.1 | 96.8% ± 1.5 | +0.4 ± 1.7 |
| dggp.haiku.gpBot_0 1.1 | 92.6% ± 1.6 | 91.6% ± 1.8 | +1.0 ± 2.7 |
| jeremyreeder.Bully 1 | 94.1% ± 1.5 | 94.3% ± 1.2 | -0.2 ± 1.2 |
| fowl3628800.SitAndGo 1.0.0 | 99.0% ± 0.2 | 99.1% ± 0.2 | -0.1 ± 0.2 |
| ntw.Sighup 1.5 | 89.8% ± 1.2 | 91.5% ± 0.9 | -1.7 ± 1.5 |
| yk.JahMicro 1.0 | 93.7% ± 1.0 | 91.8% ± 0.8 | +1.9 ± 1.4 |
| ola.Puffin 1.0 | 97.8% ± 0.8 | 96.5% ± 0.6 | +1.3 ± 0.9 |
| gwah.GBotMarkIV 1.0 | 99.3% ± 0.3 | 99.1% ± 0.4 | +0.1 ± 0.4 |
| jgap.JGAP7247_2 1.0 | 95.4% ± 0.6 | 96.2% ± 0.5 | -0.8 ± 0.8 |
| RobotMarco.MarcoV 0.1 | 100.0% ± 0.0 | 99.8% ± 0.2 | +0.2 ± 0.2 |
| japs.Serenity 1.0 | 98.9% ± 0.3 | 99.7% ± 0.2 | -0.7 ± 0.4 |
| sample.Target 1.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| ags.Midboss 1q.fast | +1.4 ± 3.9 | +1.8 ± 5.3 | +1.8 ± 5.3 | +0.7 ± 2.7 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | +0.5 ± 2.9 | +1.3 ± 4.5 | +1.3 ± 4.5 | -0.4 ± 2.3 |
| cw.megas.Silhouette 1.1 | -0.8 ± 2.9 | -0.4 ± 4.1 | -0.4 ± 4.1 | -0.8 ± 2.2 |
| kc.micro.Needle 0.101 | -0.6 ± 4.0 | +0.4 ± 5.1 | +0.4 ± 5.1 | -1.5 ± 2.9 |
| nat.Hikari dev0001 | +0.2 ± 2.3 | +0.9 ± 3.0 | +0.9 ± 3.0 | -0.5 ± 2.2 |
| bvh.fnr.Fenrir 0.36l | -0.9 ± 2.6 | -0.4 ± 3.2 | -0.4 ± 3.2 | -1.0 ± 2.4 |
| pa3k.Viper 5.03 | +0.3 ± 4.0 | +1.6 ± 5.0 | +1.6 ± 5.0 | -0.9 ± 3.1 |
| apv.NanoLauLectrik 1.0 | -1.7 ± 2.2 | -0.7 ± 2.0 | -0.7 ± 2.0 | -1.8 ± 2.3 |
| kinsen.nano.Quarrelet 1.0 | -1.5 ± 2.7 | -2.0 ± 2.6 | -2.0 ± 2.6 | -0.3 ± 2.8 |
| exauge.GateKeeper 1.1.121g | +1.4 ± 3.1 | +0.9 ± 3.1 | +0.9 ± 3.1 | +1.7 ± 3.7 |
| robar.nano.MosquitoPM 1.0 | +1.4 ± 1.7 | +1.1 ± 2.4 | +1.1 ± 2.4 | +1.6 ± 2.1 |
| nz.jdc.nano.AralR 1.1 | +0.7 ± 1.4 | +0.7 ± 1.2 | +0.7 ± 1.2 | +0.7 ± 1.9 |
| eat.HumblePieLite 1.0 | +0.8 ± 4.7 | +0.9 ± 3.0 | +0.9 ± 3.0 | +0.7 ± 6.1 |
| ne.Chimera 1.2 | -0.5 ± 1.6 | -0.2 ± 0.7 | -0.2 ± 0.7 | -4.6 ± 11.1 |
| robar.nano.Scytodes 0.3 | -0.1 ± 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.1 ± 1.8 |
| gh.nano.Grofvuil 0.2 | -0.1 ± 0.4 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.2 ± 0.8 |
| sadoner.killer 0.2 | +0.8 ± 2.4 | +0.4 ± 2.8 | +0.4 ± 2.8 | +1.2 ± 2.6 |
| exauge.Leopard 1.1.019 | -0.2 ± 0.9 | -0.2 ± 0.7 | -0.2 ± 0.7 | +0.1 ± 1.2 |
| rapture.Rapture 2.13 | +0.0 ± 1.4 | +0.2 ± 1.2 | +0.2 ± 1.2 | -0.1 ± 1.7 |
| pez.nano.Icarus 0.3 | +0.2 ± 0.7 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.4 ± 1.5 |
| repositorio.NanoStep 1.0 | +0.4 ± 1.7 | -0.7 ± 0.7 | -0.7 ± 0.7 | +1.4 ± 3.0 |
| dggp.haiku.gpBot_0 1.1 | +1.0 ± 2.7 | -0.5 ± 1.6 | -0.5 ± 1.6 | +2.7 ± 4.2 |
| jeremyreeder.Bully 1 | -0.2 ± 1.2 | +0.4 ± 0.8 | +0.4 ± 0.8 | -0.4 ± 1.6 |
| fowl3628800.SitAndGo 1.0.0 | -0.1 ± 0.2 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.1 ± 0.5 |
| ntw.Sighup 1.5 | -1.7 ± 1.5 | -0.2 ± 0.9 | -0.2 ± 0.9 | -2.5 ± 2.3 |
| yk.JahMicro 1.0 | +1.9 ± 1.4 | +3.9 ± 1.9 | +3.9 ± 1.9 | +0.8 ± 1.5 |
| ola.Puffin 1.0 | +1.3 ± 0.9 | +0.2 ± 0.4 | +0.2 ± 0.4 | +2.3 ± 1.2 |
| gwah.GBotMarkIV 1.0 | +0.1 ± 0.4 | +0.2 ± 0.4 | +0.2 ± 0.4 | +0.1 ± 0.5 |
| jgap.JGAP7247_2 1.0 | -0.8 ± 0.8 | +0.0 ± 0.0 | +0.0 ± 0.0 | -1.5 ± 1.4 |
| RobotMarco.MarcoV 0.1 | +0.2 ± 0.2 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.3 ± 0.3 |
| japs.Serenity 1.0 | -0.7 ± 0.4 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 |
| sample.Target 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 |
| All pairs | +0.1 ± 0.4 | +0.3 ± 0.4 | +0.3 ± 0.4 | -0.1 ± 0.5 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| ags.Midboss 1q.fast | 16 | 7 | +1.4 ± 3.9 | +3.7 ± 5.7 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 16 | 9 | +0.5 ± 2.9 | -1.4 ± 4.0 |
| cw.megas.Silhouette 1.1 | 16 | 11 | -0.8 ± 2.9 | -1.9 ± 3.5 |
| kc.micro.Needle 0.101 | 16 | 11 | -0.6 ± 4.0 | +0.7 ± 4.9 |
| nat.Hikari dev0001 | 16 | 15 | +0.2 ± 2.3 | +0.2 ± 2.5 |
| bvh.fnr.Fenrir 0.36l | 16 | 13 | -0.9 ± 2.6 | -0.3 ± 3.2 |
| pa3k.Viper 5.03 | 16 | 8 | +0.3 ± 4.0 | -2.4 ± 6.1 |
| apv.NanoLauLectrik 1.0 | 16 | 14 | -1.7 ± 2.2 | -1.2 ± 2.3 |
| kinsen.nano.Quarrelet 1.0 | 16 | 10 | -1.5 ± 2.7 | -0.4 ± 3.1 |
| exauge.GateKeeper 1.1.121g | 16 | 13 | +1.4 ± 3.1 | +0.3 ± 2.8 |
| robar.nano.MosquitoPM 1.0 | 16 | 12 | +1.4 ± 1.7 | +1.9 ± 1.9 |
| nz.jdc.nano.AralR 1.1 | 16 | 15 | +0.7 ± 1.4 | +0.7 ± 1.5 |
| eat.HumblePieLite 1.0 | 16 | 9 | +0.8 ± 4.7 | -0.4 ± 1.3 |
| ne.Chimera 1.2 | 16 | 10 | -0.5 ± 1.6 | -1.3 ± 1.8 |
| robar.nano.Scytodes 0.3 | 16 | 11 | -0.1 ± 1.0 | +0.3 ± 0.5 |
| gh.nano.Grofvuil 0.2 | 16 | 11 | -0.1 ± 0.4 | -0.0 ± 0.4 |
| sadoner.killer 0.2 | 16 | 12 | +0.8 ± 2.4 | +1.1 ± 3.1 |
| exauge.Leopard 1.1.019 | 16 | 12 | -0.2 ± 0.9 | -0.3 ± 1.2 |
| rapture.Rapture 2.13 | 16 | 14 | +0.0 ± 1.4 | +0.4 ± 1.5 |
| pez.nano.Icarus 0.3 | 16 | 15 | +0.2 ± 0.7 | -0.0 ± 0.5 |
| repositorio.NanoStep 1.0 | 16 | 12 | +0.4 ± 1.7 | +0.7 ± 1.7 |
| dggp.haiku.gpBot_0 1.1 | 16 | 2 | +1.0 ± 2.7 | +3.5 ± 10.0 |
| jeremyreeder.Bully 1 | 16 | 5 | -0.2 ± 1.2 | +0.6 ± 2.0 |
| fowl3628800.SitAndGo 1.0.0 | 16 | 7 | -0.1 ± 0.2 | +0.1 ± 0.4 |
| ntw.Sighup 1.5 | 16 | 6 | -1.7 ± 1.5 | -0.4 ± 3.8 |
| yk.JahMicro 1.0 | 16 | 6 | +1.9 ± 1.4 | +1.1 ± 2.1 |
| ola.Puffin 1.0 | 16 | 10 | +1.3 ± 0.9 | +1.2 ± 1.1 |
| gwah.GBotMarkIV 1.0 | 16 | 8 | +0.1 ± 0.4 | -0.0 ± 0.2 |
| jgap.JGAP7247_2 1.0 | 16 | 4 | -0.8 ± 0.8 | -0.7 ± 2.5 |
| RobotMarco.MarcoV 0.1 | 16 | 3 | +0.2 ± 0.2 | +0.0 ± 0.0 |
| japs.Serenity 1.0 | 16 | 7 | -0.7 ± 0.4 | -0.2 ± 0.7 |
| sample.Target 1.0 | 16 | 11 | +0.0 ± 0.0 | +0.0 ± 0.0 |
| All pairs | 512 | 313 | +0.1 ± 0.4 | +0.1 ± 0.4 |

# Bench: hadur2.Hadur 3.9 baseline (hadur2.Hadur 3.8.5) (cold)

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 6600 over 512 battles (12.9 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | mid | 70.9% ± 2.5 | 83.4% ± 3.2 | 59.4% ± 2.0 | 467 / 560 | 13.8% ± 0.4 | 9.0% ± 0.3 | 387 | 0 | 1.36 / 64.8 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | mid | 62.3% ± 2.6 | 77.7% ± 4.2 | 47.0% ± 1.5 | 435 / 560 | 10.6% ± 0.2 | 7.6% ± 0.3 | 206 | 0 | 1.04 / 15.0 |
| cw.megas.Silhouette 1.1 | mid | 72.9% ± 2.6 | 85.7% ± 3.6 | 60.8% ± 2.0 | 480 / 560 | 15.0% ± 0.5 | 7.5% ± 0.5 | 154 | 0 | 0.97 / 20.0 |
| kc.micro.Needle 0.101 | mid | 77.0% ± 2.5 | 90.5% ± 3.4 | 62.9% ± 1.6 | 507 / 560 | 14.0% ± 0.6 | 6.5% ± 0.4 | 145 | 0 | 1.16 / 18.1 |
| nat.Hikari dev0001 | lower | 82.8% ± 2.0 | 95.7% ± 2.2 | 69.9% ± 1.9 | 536 / 560 | 15.5% ± 0.4 | 6.5% ± 0.5 | 169 | 0 | 0.93 / 139.6 |
| bvh.fnr.Fenrir 0.36l | lower | 77.1% ± 2.5 | 90.2% ± 3.2 | 64.4% ± 2.1 | 505 / 560 | 14.9% ± 0.8 | 7.4% ± 0.8 | 238 | 0 | 1.05 / 18.5 |
| pa3k.Viper 5.03 | lower | 80.3% ± 3.2 | 89.6% ± 4.3 | 71.4% ± 2.3 | 502 / 560 | 16.5% ± 0.5 | 7.0% ± 0.6 | 165 | 0 | 1.05 / 19.3 |
| apv.NanoLauLectrik 1.0 | lower | 81.4% ± 1.6 | 95.9% ± 1.6 | 65.3% ± 1.6 | 537 / 560 | 15.7% ± 0.5 | 5.3% ± 0.4 | 190 | 0 | 0.98 / 65.2 |
| kinsen.nano.Quarrelet 1.0 | lower | 77.9% ± 1.8 | 93.2% ± 2.4 | 61.1% ± 1.8 | 522 / 560 | 15.3% ± 0.7 | 5.7% ± 0.4 | 178 | 0 | 0.92 / 18.6 |
| exauge.GateKeeper 1.1.121g | lower | 76.7% ± 1.9 | 92.5% ± 2.0 | 60.6% ± 2.3 | 518 / 560 | 14.2% ± 0.6 | 6.9% ± 0.4 | 180 | 0 | 0.96 / 17.7 |
| robar.nano.MosquitoPM 1.0 | lower | 82.9% ± 1.1 | 95.7% ± 1.8 | 70.0% ± 1.1 | 536 / 560 | 18.8% ± 0.7 | 6.6% ± 0.4 | 189 | 0 | 0.91 / 85.4 |
| nz.jdc.nano.AralR 1.1 | lower | 90.0% ± 0.8 | 98.8% ± 1.0 | 82.2% ± 1.0 | 553 / 560 | 21.6% ± 0.6 | 8.8% ± 0.5 | 179 | 0 | 0.81 / 215.4 |
| eat.HumblePieLite 1.0 | lower | 90.4% ± 4.2 | 98.6% ± 2.7 | 83.5% ± 5.6 | 552 / 560 | 35.7% ± 2.5 | 6.7% ± 0.6 | 191 | 0 | 0.71 / 12.6 |
| ne.Chimera 1.2 | lower | 98.2% ± 1.0 | 99.8% ± 0.4 | 68.4% ± 8.3 | 559 / 560 | 0.7% ± 0.2 | 0.6% ± 0.4 | 104 | 0 | 0.79 / 18.3 |
| robar.nano.Scytodes 0.3 | weak | 94.6% ± 0.5 | 99.8% ± 0.4 | 90.0% ± 0.8 | 559 / 560 | 49.9% ± 0.9 | 5.4% ± 0.5 | 195 | 0 | 0.78 / 14.8 |
| gh.nano.Grofvuil 0.2 | weak | 98.3% ± 0.3 | 100.0% ± 0.0 | 96.6% ± 0.6 | 560 / 560 | 41.7% ± 1.1 | 1.8% ± 0.4 | 188 | 0 | 0.66 / 13.6 |
| sadoner.killer 0.2 | weak | 83.2% ± 2.1 | 94.1% ± 2.9 | 73.5% ± 1.7 | 527 / 560 | 20.3% ± 0.7 | 8.6% ± 0.7 | 170 | 0 | 0.83 / 18.0 |
| exauge.Leopard 1.1.019 | weak | 83.3% ± 0.7 | 99.5% ± 0.6 | 74.5% ± 0.8 | 557 / 560 | 79.9% ± 0.7 | 40.6% ± 3.4 | 178 | 0 | 0.57 / 11.3 |
| rapture.Rapture 2.13 | weak | 97.1% ± 0.8 | 99.3% ± 0.9 | 94.8% ± 1.0 | 556 / 560 | 21.6% ± 0.7 | 3.2% ± 0.8 | 179 | 0 | 0.79 / 64.0 |
| pez.nano.Icarus 0.3 | weak | 97.4% ± 0.7 | 100.0% ± 0.0 | 93.8% ± 1.4 | 560 / 560 | 17.1% ± 0.5 | 1.5% ± 0.6 | 172 | 0 | 0.64 / 104.3 |
| repositorio.NanoStep 1.0 | weak | 96.8% ± 1.5 | 99.8% ± 0.4 | 94.0% ± 2.6 | 559 / 560 | 27.9% ± 1.2 | 2.9% ± 1.3 | 192 | 0 | 0.74 / 13.1 |
| dggp.haiku.gpBot_0 1.1 | weak | 91.6% ± 1.8 | 99.1% ± 0.9 | 84.0% ± 2.9 | 555 / 560 | 24.6% ± 1.1 | 6.3% ± 2.3 | 312 | 0 | 1.08 / 504.2 |
| jeremyreeder.Bully 1 | weak | 94.3% ± 1.2 | 98.6% ± 1.0 | 92.8% ± 1.1 | 552 / 560 | 81.5% ± 0.7 | 9.2% ± 3.9 | 234 | 0 | 0.72 / 12.5 |
| fowl3628800.SitAndGo 1.0.0 | weak | 99.1% ± 0.2 | 100.0% ± 0.0 | 98.1% ± 0.3 | 560 / 560 | 31.4% ± 1.1 | 2.0% ± 0.6 | 237 | 0 | 0.94 / 341.3 |
| ntw.Sighup 1.5 | weak | 91.5% ± 0.9 | 99.5% ± 0.6 | 83.7% ± 1.5 | 557 / 560 | 28.2% ± 1.9 | 6.6% ± 0.6 | 229 | 0 | 0.88 / 17.9 |
| yk.JahMicro 1.0 | weak | 91.8% ± 0.8 | 94.5% ± 1.5 | 88.9% ± 0.8 | 529 / 560 | 20.9% ± 0.8 | 7.8% ± 0.6 | 241 | 0 | 0.99 / 1441.4 |
| ola.Puffin 1.0 | weak | 96.5% ± 0.6 | 99.8% ± 0.4 | 94.1% ± 0.8 | 559 / 560 | 49.1% ± 1.8 | 10.2% ± 1.9 | 228 | 0 | 0.97 / 20.3 |
| gwah.GBotMarkIV 1.0 | weak | 99.1% ± 0.4 | 99.8% ± 0.4 | 98.5% ± 0.6 | 559 / 560 | 74.9% ± 1.0 | 3.1% ± 2.2 | 234 | 0 | 0.76 / 48.1 |
| jgap.JGAP7247_2 1.0 | weak | 96.2% ± 0.5 | 100.0% ± 0.0 | 92.4% ± 1.0 | 560 / 560 | 38.7% ± 0.9 | 3.8% ± 1.1 | 224 | 0 | 0.93 / 16.1 |
| RobotMarco.MarcoV 0.1 | weak | 99.8% ± 0.2 | 100.0% ± 0.0 | 99.6% ± 0.3 | 560 / 560 | 42.2% ± 1.4 | 1.2% ± 0.9 | 244 | 0 | 0.83 / 1380.1 |
| japs.Serenity 1.0 | weak | 99.7% ± 0.2 | 100.0% ± 0.0 | 100.0% ± 0.0 | 560 / 560 | 30.4% ± 0.7 | 0.0% ± 0.0 | 282 | 0 | 0.85 / 1213.7 |
| sample.Target 1.0 | weak | 100.0% ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | 560 / 560 | 50.7% ± 0.9 | 0.0% ± 0.0 | 186 | 0 | 0.65 / 22.1 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 16 | 10 | 1788 | 0 | 0.69 | 1 | 1 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 16 | 13 | 298 | 0 | 0.37 | 2 | 2 | 0 |
| cw.megas.Silhouette 1.1 | 16 | 14 | 0 | 0 | 0.28 | 2 | 2 | 0 |
| kc.micro.Needle 0.101 | 16 | 11 | 298 | 0 | 0.26 | 4 | 4 | 0 |
| nat.Hikari dev0001 | 16 | 15 | 0 | 0 | 0.30 | 1 | 1 | 0 |
| bvh.fnr.Fenrir 0.36l | 16 | 15 | 298 | 0 | 0.43 | 0 | 0 | 0 |
| pa3k.Viper 5.03 | 16 | 12 | 596 | 0 | 0.29 | 2 | 2 | 0 |
| apv.NanoLauLectrik 1.0 | 16 | 14 | 596 | 0 | 0.34 | 0 | 0 | 0 |
| kinsen.nano.Quarrelet 1.0 | 16 | 13 | 298 | 0 | 0.32 | 2 | 2 | 0 |
| exauge.GateKeeper 1.1.121g | 16 | 15 | 298 | 0 | 0.32 | 0 | 0 | 0 |
| robar.nano.MosquitoPM 1.0 | 16 | 14 | 596 | 0 | 0.34 | 0 | 0 | 0 |
| nz.jdc.nano.AralR 1.1 | 16 | 16 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| eat.HumblePieLite 1.0 | 16 | 10 | 1477 | 0 | 0.34 | 1 | 1 | 0 |
| ne.Chimera 1.2 | 16 | 12 | 1192 | 0 | 0.19 | 0 | 0 | 16 |
| robar.nano.Scytodes 0.3 | 16 | 12 | 1173 | 0 | 0.35 | 0 | 0 | 0 |
| gh.nano.Grofvuil 0.2 | 16 | 13 | 894 | 0 | 0.34 | 0 | 0 | 0 |
| sadoner.killer 0.2 | 16 | 14 | 596 | 0 | 0.30 | 0 | 0 | 0 |
| exauge.Leopard 1.1.019 | 16 | 12 | 780 | 0 | 0.32 | 0 | 0 | 0 |
| rapture.Rapture 2.13 | 16 | 16 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| pez.nano.Icarus 0.3 | 16 | 15 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| repositorio.NanoStep 1.0 | 16 | 14 | 389 | 0 | 0.34 | 0 | 0 | 0 |
| dggp.haiku.gpBot_0 1.1 | 16 | 6 | 3850 | 0 | 0.56 | 1 | 1 | 0 |
| jeremyreeder.Bully 1 | 16 | 7 | 1825 | 0 | 0.42 | 0 | 0 | 0 |
| fowl3628800.SitAndGo 1.0.0 | 16 | 9 | 2086 | 0 | 0.42 | 1 | 0 | 0 |
| ntw.Sighup 1.5 | 16 | 11 | 1490 | 0 | 0.41 | 0 | 0 | 0 |
| yk.JahMicro 1.0 | 16 | 9 | 2086 | 0 | 0.43 | 3 | 3 | 0 |
| ola.Puffin 1.0 | 16 | 12 | 1102 | 0 | 0.41 | 0 | 0 | 0 |
| gwah.GBotMarkIV 1.0 | 16 | 12 | 1055 | 0 | 0.42 | 0 | 0 | 0 |
| jgap.JGAP7247_2 1.0 | 16 | 5 | 3043 | 0 | 0.40 | 0 | 0 | 0 |
| RobotMarco.MarcoV 0.1 | 16 | 4 | 3909 | 0 | 0.44 | 1 | 1 | 0 |
| japs.Serenity 1.0 | 16 | 9 | 2262 | 0 | 0.50 | 0 | 0 | 0 |
| sample.Target 1.0 | 16 | 14 | 596 | 0 | 0.33 | 0 | 0 | 0 |

378 of 512 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 31473 | 80 | 31332 | 31326 (99.5%) | 147 (0.5%) | 6 (0.0%) | 1772 | 479 | 260 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 28136 | 175 | 28115 | 28115 (99.9%) | 21 (0.1%) | 0 (0.0%) | 1478 | 277 | 101 |
| cw.megas.Silhouette 1.1 | 17962 | 28 | 17962 | 17960 (100.0%) | 2 (0.0%) | 2 (0.0%) | 633 | 260 | 72 |
| kc.micro.Needle 0.101 | 22230 | 18 | 22209 | 22206 (99.9%) | 24 (0.1%) | 3 (0.0%) | 1080 | 318 | 46 |
| nat.Hikari dev0001 | 18648 | 28 | 18655 | 18648 (100.0%) | 0 (0.0%) | 7 (0.0%) | 414 | 288 | 59 |
| bvh.fnr.Fenrir 0.36l | 18646 | 134 | 18619 | 18619 (99.9%) | 27 (0.1%) | 0 (0.0%) | 693 | 273 | 83 |
| pa3k.Viper 5.03 | 18202 | 31 | 18173 | 18167 (99.8%) | 35 (0.2%) | 6 (0.0%) | 1088 | 242 | 58 |
| apv.NanoLauLectrik 1.0 | 12671 | 28 | 12657 | 12619 (99.6%) | 52 (0.4%) | 38 (0.3%) | 1139 | 229 | 54 |
| kinsen.nano.Quarrelet 1.0 | 13026 | 32 | 13161 | 12983 (99.7%) | 43 (0.3%) | 178 (1.4%) | 1694 | 272 | 73 |
| exauge.GateKeeper 1.1.121g | 15421 | 10 | 15479 | 15373 (99.7%) | 48 (0.3%) | 106 (0.7%) | 2123 | 310 | 66 |
| robar.nano.MosquitoPM 1.0 | 12833 | 27 | 12835 | 12772 (99.5%) | 61 (0.5%) | 63 (0.5%) | 1498 | 286 | 63 |
| nz.jdc.nano.AralR 1.1 | 14570 | 42 | 14654 | 14532 (99.7%) | 38 (0.3%) | 122 (0.8%) | 927 | 299 | 38 |
| eat.HumblePieLite 1.0 | 7052 | 51 | 6961 | 6961 (98.7%) | 91 (1.3%) | 0 (0.0%) | 49 | 153 | 110 |
| ne.Chimera 1.2 | 485 | 1 | 410 | 409 (84.3%) | 76 (15.7%) | 1 (0.2%) | 3 | 10 | 35 |
| robar.nano.Scytodes 0.3 | 5144 | 32 | 5113 | 5067 (98.5%) | 77 (1.5%) | 46 (0.9%) | 126 | 175 | 46 |
| gh.nano.Grofvuil 0.2 | 7236 | 48 | 7190 | 7180 (99.2%) | 56 (0.8%) | 10 (0.1%) | 233 | 207 | 47 |
| sadoner.killer 0.2 | 11962 | 44 | 11923 | 11923 (99.7%) | 39 (0.3%) | 0 (0.0%) | 146 | 227 | 43 |
| exauge.Leopard 1.1.019 | 4333 | 28 | 4287 | 4282 (98.8%) | 51 (1.2%) | 5 (0.1%) | 614 | 457 | 54 |
| rapture.Rapture 2.13 | 16477 | 47 | 16479 | 16473 (100.0%) | 4 (0.0%) | 6 (0.0%) | 296 | 224 | 43 |
| pez.nano.Icarus 0.3 | 14414 | 35 | 14407 | 14367 (99.7%) | 47 (0.3%) | 40 (0.3%) | 1280 | 246 | 41 |
| repositorio.NanoStep 1.0 | 10707 | 58 | 10659 | 10656 (99.5%) | 51 (0.5%) | 3 (0.0%) | 296 | 247 | 463 |
| dggp.haiku.gpBot_0 1.1 | 8249 | 41 | 8037 | 8033 (97.4%) | 216 (2.6%) | 4 (0.0%) | 1064 | 206 | 79 |
| jeremyreeder.Bully 1 | 3359 | 13 | 3275 | 3275 (97.5%) | 84 (2.5%) | 0 (0.0%) | 534 | 176 | 51 |
| fowl3628800.SitAndGo 1.0.0 | 10692 | 53 | 10527 | 10347 (96.8%) | 345 (3.2%) | 180 (1.7%) | 2436 | 239 | 53 |
| ntw.Sighup 1.5 | 8841 | 61 | 8766 | 8721 (98.6%) | 120 (1.4%) | 45 (0.5%) | 2456 | 311 | 60 |
| yk.JahMicro 1.0 | 12755 | 24 | 12741 | 12657 (99.2%) | 98 (0.8%) | 84 (0.7%) | 652 | 231 | 73 |
| ola.Puffin 1.0 | 7193 | 45 | 7110 | 7103 (98.7%) | 90 (1.3%) | 7 (0.1%) | 105 | 268 | 276 |
| gwah.GBotMarkIV 1.0 | 3839 | 29 | 3771 | 3767 (98.1%) | 72 (1.9%) | 4 (0.1%) | 105 | 115 | 193 |
| jgap.JGAP7247_2 1.0 | 4916 | 33 | 5002 | 4747 (96.6%) | 169 (3.4%) | 255 (5.1%) | 2680 | 249 | 59 |
| RobotMarco.MarcoV 0.1 | 1661 | 6 | 1622 | 1622 (97.7%) | 39 (2.3%) | 0 (0.0%) | 7 | 39 | 52 |
| japs.Serenity 1.0 | 0 | 0 | 54 | - | - | 54 (100.0%) | 904 | 0 | 71 |
| sample.Target 1.0 | 0 | 0 | 0 | - | - | - | 230 | 0 | 47 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ags.Midboss 1q.fast | 32235 | 3006 (9.3%) | 27582 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 30742 | 2738 (8.9%) | 25512 |
| cw.megas.Silhouette 1.1 | 19471 | 1620 (8.3%) | 13739 |
| kc.micro.Needle 0.101 | 25264 | 2168 (8.6%) | 20539 |
| nat.Hikari dev0001 | 18775 | 2005 (10.7%) | 16054 |
| bvh.fnr.Fenrir 0.36l | 21749 | 1455 (6.7%) | 8361 |
| pa3k.Viper 5.03 | 22199 | 1574 (7.1%) | 8761 |
| apv.NanoLauLectrik 1.0 | 14975 | 1045 (7.0%) | 5319 |
| kinsen.nano.Quarrelet 1.0 | 15491 | 912 (5.9%) | 4685 |
| exauge.GateKeeper 1.1.121g | 19928 | 1044 (5.2%) | 5821 |
| robar.nano.MosquitoPM 1.0 | 13809 | 923 (6.7%) | 3996 |
| nz.jdc.nano.AralR 1.1 | 12888 | 1046 (8.1%) | 7548 |
| eat.HumblePieLite 1.0 | 7078 | 343 (4.8%) | 155 |
| ne.Chimera 1.2 | 545 | 42 (7.7%) | 0 |
| robar.nano.Scytodes 0.3 | 5494 | 395 (7.2%) | 727 |
| gh.nano.Grofvuil 0.2 | 6837 | 540 (7.9%) | 1214 |
| sadoner.killer 0.2 | 11952 | 868 (7.3%) | 5284 |
| exauge.Leopard 1.1.019 | 4257 | 92 (2.2%) | 0 |
| rapture.Rapture 2.13 | 14693 | 993 (6.8%) | 7116 |
| pez.nano.Icarus 0.3 | 14262 | 1095 (7.7%) | 7896 |
| repositorio.NanoStep 1.0 | 9461 | 612 (6.5%) | 2669 |
| dggp.haiku.gpBot_0 1.1 | 9470 | 518 (5.5%) | 434 |
| jeremyreeder.Bully 1 | 3568 | 13 (0.4%) | 0 |
| fowl3628800.SitAndGo 1.0.0 | 9339 | 567 (6.1%) | 2402 |
| ntw.Sighup 1.5 | 9572 | 432 (4.5%) | 0 |
| yk.JahMicro 1.0 | 17520 | 1009 (5.8%) | 6180 |
| ola.Puffin 1.0 | 6933 | 540 (7.8%) | 2290 |
| gwah.GBotMarkIV 1.0 | 3926 | 123 (3.1%) | 13 |
| jgap.JGAP7247_2 1.0 | 6656 | 286 (4.3%) | 398 |
| RobotMarco.MarcoV 0.1 | 8800 | 84 (1.0%) | 0 |
| japs.Serenity 1.0 | 17848 | 0 (0.0%) | 0 |
| sample.Target 1.0 | 11037 | 0 (0.0%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 650 | 409 | 622 | 768 | 43.6 / 29.8 | 2226 | 9065 | 1819 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 650 | 468 | 650 | 727 | 29.4 / 33.2 | 588 | 13095 | 2744 |
| cw.megas.Silhouette 1.1 | 650 | 401 | 597 | 509 | 43.3 / 28.0 | 3609 | 7813 | 5028 |
| kc.micro.Needle 0.101 | 650 | 426 | 528 | 625 | 41.3 / 24.4 | 1408 | 6453 | 2 |
| nat.Hikari dev0001 | 650 | 411 | 545 | 496 | 48.7 / 21.1 | 4525 | 8427 | 5121 |
| bvh.fnr.Fenrir 0.36l | 650 | 472 | 595 | 550 | 45.8 / 25.4 | 2802 | 8189 | 95 |
| pa3k.Viper 5.03 | 650 | 435 | 469 | 570 | 52.7 / 21.2 | 5547 | 8398 | 30 |
| apv.NanoLauLectrik 1.0 | 650 | 460 | 489 | 396 | 39.4 / 21.0 | 2942 | 11211 | 6768 |
| kinsen.nano.Quarrelet 1.0 | 650 | 491 | 550 | 406 | 36.8 / 23.4 | 2462 | 11149 | 8157 |
| exauge.GateKeeper 1.1.121g | 650 | 512 | 575 | 503 | 39.5 / 25.9 | 2338 | 7667 | 3633 |
| robar.nano.MosquitoPM 1.0 | 650 | 458 | 453 | 378 | 48.3 / 20.7 | 5369 | 9730 | 5482 |
| nz.jdc.nano.AralR 1.1 | 650 | 332 | 413 | 380 | 69.2 / 15.0 | 8472 | 8805 | 2471 |
| eat.HumblePieLite 1.0 | 650 | 492 | 416 | 247 | 71.8 / 13.9 | 5232 | 7382 | 387 |
| ne.Chimera 1.2 | 650 | 374 | 650 | 15 | 1.8 / 1.0 | 2 | 360 | 0 |
| robar.nano.Scytodes 0.3 | 650 | 397 | 400 | 173 | 76.6 / 8.6 | 3737 | 7595 | 1751 |
| gh.nano.Grofvuil 0.2 | 650 | 354 | 400 | 211 | 75.6 / 2.7 | 4671 | 5155 | 33 |
| sadoner.killer 0.2 | 650 | 291 | 492 | 346 | 59.2 / 21.5 | 6536 | 10100 | 20 |
| exauge.Leopard 1.1.019 | 650 | 204 | 494 | 140 | 100.6 / 34.6 | 3583 | 5144 | 37 |
| rapture.Rapture 2.13 | 650 | 404 | 416 | 417 | 73.2 / 4.0 | 9090 | 8606 | 2228 |
| pez.nano.Icarus 0.3 | 650 | 353 | 400 | 393 | 47.4 / 3.2 | 3904 | 11355 | 3873 |
| repositorio.NanoStep 1.0 | 650 | 451 | 400 | 286 | 72.1 / 4.9 | 6961 | 6477 | 400 |
| dggp.haiku.gpBot_0 1.1 | 650 | 429 | 400 | 280 | 56.6 / 11.0 | 6252 | 8272 | 4245 |
| jeremyreeder.Bully 1 | 650 | 212 | 400 | 120 | 83.4 / 6.6 | 2888 | 6035 | 134 |
| fowl3628800.SitAndGo 1.0.0 | 650 | 463 | 400 | 283 | 75.9 / 1.4 | 7203 | 3935 | 640 |
| ntw.Sighup 1.5 | 650 | 377 | 400 | 282 | 59.2 / 11.6 | 6171 | 8060 | 2084 |
| yk.JahMicro 1.0 | 650 | 451 | 400 | 499 | 77.8 / 9.8 | 10973 | 2971 | 170 |
| ola.Puffin 1.0 | 650 | 353 | 400 | 215 | 91.0 / 5.7 | 5138 | 4274 | 451 |
| gwah.GBotMarkIV 1.0 | 650 | 216 | 400 | 132 | 82.0 / 1.3 | 2999 | 4750 | 427 |
| jgap.JGAP7247_2 1.0 | 650 | 438 | 400 | 204 | 66.1 / 5.5 | 4547 | 5160 | 2767 |
| RobotMarco.MarcoV 0.1 | 650 | 418 | 400 | 261 | 91.3 / 0.3 | 5015 | 1252 | 178 |
| japs.Serenity 1.0 | 650 | 519 | 650 | 479 | 97.0 / 0.0 | 3607 | 16 | 428 |
| sample.Target 1.0 | 650 | 499 | 650 | 297 | 98.9 / 0.0 | 0 | 0 | 188 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 9.0% | 387 | 7483 | 3 | 55.8 | 2995 / 3006 (100%) | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 7.6% | 206 | 869 | 3 | 49.9 | 2729 / 2738 (100%) | 0 | 0 |
| cw.megas.Silhouette 1.1 | 7.5% | 154 | 4550 | 3 | 31.9 | 1620 / 1620 (100%) | 0 | 0 |
| kc.micro.Needle 0.101 | 6.5% | 145 | 4034 | 3 | 39.2 | 2167 / 2168 (100%) | 0 | 0 |
| nat.Hikari dev0001 | 6.5% | 169 | 5480 | 3 | 33.2 | 2002 / 2005 (100%) | 0 | 0 |
| bvh.fnr.Fenrir 0.36l | 7.4% | 238 | 6265 | 3 | 33.2 | 1451 / 1455 (100%) | 0 | 0 |
| pa3k.Viper 5.03 | 7.0% | 165 | 2006 | 3 | 32.2 | 1569 / 1574 (100%) | 0 | 0 |
| apv.NanoLauLectrik 1.0 | 5.3% | 190 | 106 | 3 | 22.6 | 1040 / 1045 (100%) | 0 | 0 |
| kinsen.nano.Quarrelet 1.0 | 5.7% | 178 | 156 | 3 | 23.4 | 905 / 912 (99%) | 0 | 0 |
| exauge.GateKeeper 1.1.121g | 6.9% | 180 | 148 | 3 | 27.6 | 1039 / 1044 (100%) | 0 | 0 |
| robar.nano.MosquitoPM 1.0 | 6.6% | 189 | 354 | 3 | 22.9 | 916 / 923 (99%) | 0 | 0 |
| nz.jdc.nano.AralR 1.1 | 8.8% | 179 | 87 | 3 | 26.1 | 1045 / 1046 (100%) | 0 | 0 |
| eat.HumblePieLite 1.0 | 6.7% | 191 | 110 | 3 | 10.7 | 334 / 343 (97%) | 0 | 0 |
| ne.Chimera 1.2 | 0.6% | 104 | 26 | 3 | 0.7 | 37 / 42 (88%) | 0 | 0 |
| robar.nano.Scytodes 0.3 | 5.4% | 195 | 83 | 3 | 9.1 | 390 / 395 (99%) | 0 | 0 |
| gh.nano.Grofvuil 0.2 | 1.8% | 188 | 74 | 3 | 12.8 | 535 / 540 (99%) | 0 | 0 |
| sadoner.killer 0.2 | 8.6% | 170 | 84 | 3 | 21.3 | 867 / 868 (100%) | 0 | 0 |
| exauge.Leopard 1.1.019 | 40.6% | 178 | 41 | 3 | 7.6 | 91 / 92 (99%) | 0 | 0 |
| rapture.Rapture 2.13 | 3.2% | 179 | 76 | 3 | 29.4 | 993 / 993 (100%) | 0 | 0 |
| pez.nano.Icarus 0.3 | 1.5% | 172 | 83 | 3 | 25.7 | 1091 / 1095 (100%) | 0 | 0 |
| repositorio.NanoStep 1.0 | 2.9% | 192 | 77 | 3 | 19.0 | 609 / 612 (100%) | 0 | 0 |
| dggp.haiku.gpBot_0 1.1 | 6.3% | 312 | 80 | 3 | 14.3 | 503 / 518 (97%) | 0 | 0 |
| jeremyreeder.Bully 1 | 9.2% | 234 | 45 | 3 | 5.8 | 13 / 13 (100%) | 0 | 0 |
| fowl3628800.SitAndGo 1.0.0 | 2.0% | 237 | 1497 | 3 | 18.8 | 555 / 567 (98%) | 0 | 0 |
| ntw.Sighup 1.5 | 6.6% | 229 | 78 | 3 | 15.6 | 427 / 432 (99%) | 0 | 0 |
| yk.JahMicro 1.0 | 7.8% | 241 | 317 | 3 | 22.4 | 1005 / 1009 (100%) | 0 | 0 |
| ola.Puffin 1.0 | 10.2% | 228 | 248 | 3 | 12.7 | 538 / 540 (100%) | 0 | 0 |
| gwah.GBotMarkIV 1.0 | 3.1% | 234 | 51 | 3 | 6.7 | 116 / 123 (94%) | 0 | 0 |
| jgap.JGAP7247_2 1.0 | 3.8% | 224 | 71 | 3 | 8.9 | 276 / 286 (97%) | 0 | 0 |
| RobotMarco.MarcoV 0.1 | 1.2% | 244 | 51 | 3 | 2.9 | 83 / 84 (99%) | 0 | 0 |
| japs.Serenity 1.0 | 0.0% | 282 | 239 | 3 | 0.1 | - | 0 | 0 |
| sample.Target 1.0 | 0.0% | 186 | 81 | 3 | 0.0 | - | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cw.megas.Silhouette 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kc.micro.Needle 0.101 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.Hikari dev0001 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bvh.fnr.Fenrir 0.36l | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pa3k.Viper 5.03 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apv.NanoLauLectrik 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kinsen.nano.Quarrelet 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| exauge.GateKeeper 1.1.121g | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| robar.nano.MosquitoPM 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nz.jdc.nano.AralR 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| eat.HumblePieLite 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ne.Chimera 1.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| robar.nano.Scytodes 0.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| gh.nano.Grofvuil 0.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sadoner.killer 0.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| exauge.Leopard 1.1.019 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rapture.Rapture 2.13 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pez.nano.Icarus 0.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| repositorio.NanoStep 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dggp.haiku.gpBot_0 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jeremyreeder.Bully 1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| fowl3628800.SitAndGo 1.0.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ntw.Sighup 1.5 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| yk.JahMicro 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ola.Puffin 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| gwah.GBotMarkIV 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jgap.JGAP7247_2 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| RobotMarco.MarcoV 0.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| japs.Serenity 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sample.Target 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## First rounds against last rounds

Per battle, the first 5 rounds against the last 10, then the paired difference (last minus first) over battles with its 95% interval. Win rate is rounds won over rounds with an R record; damage share is bullet damage dealt over dealt plus taken. Positive means the robot does better late in the battle.

| Opponent | Build | Battles | Win rate, first 5 | Win rate, last 10 | Late minus early (pp) | Damage share, first 5 | Damage share, last 10 | Late minus early (pp) |
|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 99.7% ± 0.5 | 99.9% ± 0.1 | +0.2 ± 0.5 |
| RobotMarco.MarcoV 0.1 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 98.8% ± 1.0 | 99.3% ± 0.5 | +0.5 ± 1.3 |
| ags.Midboss 1q.fast | hadur2.Hadur 3.9 | 16 | 82.5% ± 9.4 | 86.0% ± 6.4 | +3.5 ± 10.7 | 52.9% ± 3.7 | 61.2% ± 3.9 | +8.3 ± 4.6 |
| ags.Midboss 1q.fast | hadur2.Hadur 3.8.5 | 16 | 73.8% ± 11.5 | 86.8% ± 4.6 | +13.1 ± 10.5 | 52.2% ± 5.2 | 60.6% ± 3.6 | +8.4 ± 5.5 |
| apv.NanoLauLectrik 1.0 | hadur2.Hadur 3.9 | 16 | 95.0% ± 6.2 | 96.3% ± 3.3 | +1.3 ± 7.8 | 62.7% ± 6.4 | 64.0% ± 4.5 | +1.3 ± 8.8 |
| apv.NanoLauLectrik 1.0 | hadur2.Hadur 3.8.5 | 16 | 96.3% ± 4.3 | 98.1% ± 2.1 | +1.9 ± 5.2 | 61.9% ± 5.8 | 65.9% ± 4.1 | +4.0 ± 7.5 |
| bvh.fnr.Fenrir 0.36l | hadur2.Hadur 3.9 | 16 | 85.0% ± 8.3 | 92.5% ± 4.6 | +7.5 ± 10.6 | 56.3% ± 4.9 | 63.8% ± 2.9 | +7.5 ± 5.7 |
| bvh.fnr.Fenrir 0.36l | hadur2.Hadur 3.8.5 | 16 | 83.8% ± 11.8 | 94.4% ± 3.9 | +10.6 ± 10.9 | 58.9% ± 5.2 | 68.1% ± 2.6 | +9.2 ± 6.6 |
| cw.megas.Silhouette 1.1 | hadur2.Hadur 3.9 | 16 | 81.3% ± 8.2 | 85.8% ± 7.5 | +4.6 ± 9.4 | 56.8% ± 3.6 | 60.1% ± 2.8 | +3.3 ± 4.3 |
| cw.megas.Silhouette 1.1 | hadur2.Hadur 3.8.5 | 16 | 82.5% ± 6.6 | 87.4% ± 6.9 | +4.9 ± 10.1 | 54.7% ± 4.5 | 60.2% ± 2.6 | +5.5 ± 5.2 |
| dggp.haiku.gpBot_0 1.1 | hadur2.Hadur 3.9 | 16 | 93.8% ± 5.1 | 100.0% ± 0.0 | +6.2 ± 5.1 | 73.6% ± 7.7 | 87.7% ± 3.5 | +14.1 ± 8.5 |
| dggp.haiku.gpBot_0 1.1 | hadur2.Hadur 3.8.5 | 16 | 97.5% ± 3.6 | 99.4% ± 1.3 | +1.9 ± 4.0 | 76.9% ± 5.4 | 79.3% ± 4.5 | +2.5 ± 7.8 |
| eat.HumblePieLite 1.0 | hadur2.Hadur 3.9 | 16 | 98.8% ± 2.7 | 98.8% ± 2.7 | +0.0 ± 0.0 | 74.9% ± 4.4 | 81.7% ± 6.4 | +6.7 ± 5.9 |
| eat.HumblePieLite 1.0 | hadur2.Hadur 3.8.5 | 16 | 98.8% ± 2.7 | 98.6% ± 3.0 | -0.1 ± 4.1 | 78.6% ± 3.8 | 79.1% ± 10.1 | +0.5 ± 10.8 |
| exauge.GateKeeper 1.1.121g | hadur2.Hadur 3.9 | 16 | 95.0% ± 4.8 | 90.6% ± 5.3 | -4.4 ± 8.0 | 58.8% ± 4.3 | 60.1% ± 3.8 | +1.3 ± 6.0 |
| exauge.GateKeeper 1.1.121g | hadur2.Hadur 3.8.5 | 16 | 95.0% ± 4.8 | 93.1% ± 5.7 | -1.9 ± 7.8 | 57.3% ± 4.2 | 61.5% ± 4.5 | +4.1 ± 5.5 |
| exauge.Leopard 1.1.019 | hadur2.Hadur 3.9 | 16 | 96.3% ± 4.3 | 100.0% ± 0.0 | +3.7 ± 4.3 | 70.6% ± 3.0 | 72.0% ± 1.5 | +1.4 ± 2.7 |
| exauge.Leopard 1.1.019 | hadur2.Hadur 3.8.5 | 16 | 96.3% ± 4.3 | 100.0% ± 0.0 | +3.7 ± 4.3 | 70.6% ± 3.1 | 72.2% ± 1.5 | +1.6 ± 4.2 |
| fowl3628800.SitAndGo 1.0.0 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 92.2% ± 1.6 | 98.8% ± 0.3 | +6.7 ± 1.7 |
| fowl3628800.SitAndGo 1.0.0 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 93.1% ± 1.7 | 99.1% ± 0.4 | +6.0 ± 1.8 |
| gh.nano.Grofvuil 0.2 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 88.5% ± 2.4 | 98.2% ± 0.9 | +9.7 ± 2.6 |
| gh.nano.Grofvuil 0.2 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 89.4% ± 3.1 | 98.4% ± 0.9 | +9.0 ± 3.6 |
| gwah.GBotMarkIV 1.0 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 94.4% ± 2.6 | 98.2% ± 0.8 | +3.8 ± 2.3 |
| gwah.GBotMarkIV 1.0 | hadur2.Hadur 3.8.5 | 16 | 98.8% ± 2.7 | 100.0% ± 0.0 | +1.2 ± 2.7 | 93.8% ± 3.6 | 97.8% ± 0.8 | +4.0 ± 3.7 |
| japs.Serenity 1.0 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 |
| japs.Serenity 1.0 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 |
| jeremyreeder.Bully 1 | hadur2.Hadur 3.9 | 16 | 92.5% ± 5.3 | 100.0% ± 0.0 | +7.5 ± 5.3 | 77.3% ± 3.6 | 91.6% ± 2.1 | +14.3 ± 3.2 |
| jeremyreeder.Bully 1 | hadur2.Hadur 3.8.5 | 16 | 90.0% ± 5.5 | 100.0% ± 0.0 | +10.0 ± 5.5 | 78.8% ± 3.8 | 93.4% ± 2.0 | +14.6 ± 4.0 |
| jgap.JGAP7247_2 1.0 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 85.2% ± 5.1 | 94.9% ± 1.8 | +9.7 ± 5.4 |
| jgap.JGAP7247_2 1.0 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 82.3% ± 5.2 | 96.5% ± 1.3 | +14.1 ± 5.1 |
| kc.micro.Needle 0.101 | hadur2.Hadur 3.9 | 16 | 86.3% ± 6.4 | 94.4% ± 4.3 | +8.1 ± 7.8 | 63.6% ± 3.4 | 64.9% ± 4.3 | +1.3 ± 4.8 |
| kc.micro.Needle 0.101 | hadur2.Hadur 3.8.5 | 16 | 91.3% ± 6.7 | 91.0% ± 5.8 | -0.2 ± 10.5 | 65.4% ± 4.2 | 63.9% ± 5.0 | -1.5 ± 7.8 |
| kinsen.nano.Quarrelet 1.0 | hadur2.Hadur 3.9 | 16 | 85.0% ± 9.1 | 91.3% ± 6.4 | +6.3 ± 8.2 | 54.7% ± 7.1 | 60.1% ± 5.6 | +5.4 ± 6.2 |
| kinsen.nano.Quarrelet 1.0 | hadur2.Hadur 3.8.5 | 16 | 93.8% ± 6.4 | 95.0% ± 4.4 | +1.2 ± 7.5 | 53.0% ± 4.5 | 60.0% ± 3.2 | +7.0 ± 5.8 |
| nat.Hikari dev0001 | hadur2.Hadur 3.9 | 16 | 95.0% ± 6.2 | 96.9% ± 2.6 | +1.9 ± 6.2 | 62.4% ± 5.1 | 69.4% ± 3.3 | +7.0 ± 5.9 |
| nat.Hikari dev0001 | hadur2.Hadur 3.8.5 | 16 | 96.3% ± 4.3 | 97.5% ± 3.1 | +1.2 ± 1.8 | 63.0% ± 3.8 | 70.1% ± 3.3 | +7.2 ± 4.8 |
| ne.Chimera 1.2 | hadur2.Hadur 3.9 | 16 | 97.5% ± 3.6 | 100.0% ± 0.0 | +2.5 ± 3.6 | 96.6% ± 5.2 | - | n/a |
| ne.Chimera 1.2 | hadur2.Hadur 3.8.5 | 16 | 98.8% ± 2.7 | 100.0% ± 0.0 | +1.2 ± 2.7 | 94.6% ± 7.3 | - | n/a |
| ntw.Sighup 1.5 | hadur2.Hadur 3.9 | 16 | 96.3% ± 4.3 | 100.0% ± 0.0 | +3.7 ± 4.3 | 74.0% ± 4.5 | 82.7% ± 3.5 | +8.7 ± 5.1 |
| ntw.Sighup 1.5 | hadur2.Hadur 3.8.5 | 16 | 98.8% ± 2.7 | 99.4% ± 1.3 | +0.6 ± 3.1 | 78.6% ± 4.8 | 84.8% ± 2.9 | +6.2 ± 5.4 |
| nz.jdc.nano.AralR 1.1 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 99.4% ± 1.3 | -0.6 ± 1.3 | 80.7% ± 2.0 | 82.6% ± 2.0 | +1.9 ± 2.8 |
| nz.jdc.nano.AralR 1.1 | hadur2.Hadur 3.8.5 | 16 | 98.8% ± 2.7 | 98.8% ± 1.8 | +0.0 ± 3.4 | 80.7% ± 2.1 | 81.9% ± 2.0 | +1.2 ± 3.4 |
| ola.Puffin 1.0 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 92.3% ± 2.1 | 96.4% ± 2.2 | +4.1 ± 2.2 |
| ola.Puffin 1.0 | hadur2.Hadur 3.8.5 | 16 | 98.8% ± 2.7 | 100.0% ± 0.0 | +1.2 ± 2.7 | 92.8% ± 1.9 | 92.9% ± 1.3 | +0.2 ± 2.4 |
| pa3k.Viper 5.03 | hadur2.Hadur 3.9 | 16 | 90.0% ± 7.8 | 85.8% ± 6.5 | -4.2 ± 10.8 | 69.5% ± 4.4 | 68.1% ± 3.6 | -1.4 ± 6.0 |
| pa3k.Viper 5.03 | hadur2.Hadur 3.8.5 | 16 | 87.5% ± 10.2 | 90.2% ± 6.8 | +2.7 ± 13.9 | 68.3% ± 4.5 | 71.4% ± 4.1 | +3.1 ± 6.2 |
| pez.nano.Icarus 0.3 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 85.7% ± 3.1 | 96.4% ± 1.6 | +10.7 ± 3.4 |
| pez.nano.Icarus 0.3 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 83.1% ± 3.4 | 96.4% ± 1.1 | +13.2 ± 3.7 |
| rapture.Rapture 2.13 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 98.8% ± 1.8 | -1.2 ± 1.8 | 91.8% ± 1.7 | 94.8% ± 2.2 | +2.9 ± 2.1 |
| rapture.Rapture 2.13 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 98.1% ± 2.1 | -1.9 ± 2.1 | 92.1% ± 2.2 | 94.3% ± 2.2 | +2.1 ± 2.8 |
| repositorio.NanoStep 1.0 | hadur2.Hadur 3.9 | 16 | 96.3% ± 4.3 | 100.0% ± 0.0 | +3.7 ± 4.3 | 94.7% ± 4.6 | 96.5% ± 1.7 | +1.8 ± 4.9 |
| repositorio.NanoStep 1.0 | hadur2.Hadur 3.8.5 | 16 | 98.8% ± 2.7 | 100.0% ± 0.0 | +1.2 ± 2.7 | 94.4% ± 4.6 | 90.8% ± 3.4 | -3.5 ± 4.8 |
| robar.nano.MosquitoPM 1.0 | hadur2.Hadur 3.9 | 16 | 98.8% ± 2.7 | 98.1% ± 2.1 | -0.6 ± 3.6 | 67.0% ± 4.3 | 71.0% ± 2.5 | +4.0 ± 3.9 |
| robar.nano.MosquitoPM 1.0 | hadur2.Hadur 3.8.5 | 16 | 97.5% ± 3.6 | 93.1% ± 4.7 | -4.4 ± 6.1 | 67.5% ± 3.8 | 69.6% ± 3.6 | +2.0 ± 6.1 |
| robar.nano.Scytodes 0.3 | hadur2.Hadur 3.9 | 16 | 97.5% ± 3.6 | 100.0% ± 0.0 | +2.5 ± 3.6 | 83.9% ± 4.2 | 87.4% ± 1.9 | +3.5 ± 4.0 |
| robar.nano.Scytodes 0.3 | hadur2.Hadur 3.8.5 | 16 | 98.8% ± 2.7 | 100.0% ± 0.0 | +1.2 ± 2.7 | 80.1% ± 3.2 | 89.0% ± 1.7 | +8.8 ± 3.8 |
| sadoner.killer 0.2 | hadur2.Hadur 3.9 | 16 | 96.3% ± 4.3 | 95.0% ± 3.9 | -1.2 ± 6.1 | 72.0% ± 5.0 | 74.3% ± 2.9 | +2.4 ± 5.8 |
| sadoner.killer 0.2 | hadur2.Hadur 3.8.5 | 16 | 92.5% ± 6.6 | 93.8% ± 3.8 | +1.3 ± 6.4 | 69.7% ± 4.2 | 74.3% ± 3.7 | +4.6 ± 4.5 |
| sample.Target 1.0 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 |
| sample.Target 1.0 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | hadur2.Hadur 3.9 | 16 | 73.8% ± 8.5 | 82.2% ± 7.7 | +8.5 ± 13.1 | 45.9% ± 4.9 | 43.6% ± 3.0 | -2.3 ± 7.1 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | hadur2.Hadur 3.8.5 | 16 | 76.3% ± 12.4 | 77.6% ± 6.3 | +1.4 ± 13.7 | 46.3% ± 5.3 | 45.4% ± 3.9 | -0.8 ± 7.1 |
| yk.JahMicro 1.0 | hadur2.Hadur 3.9 | 16 | 97.5% ± 3.6 | 98.1% ± 2.1 | +0.6 ± 3.6 | 84.9% ± 2.2 | 91.2% ± 2.5 | +6.3 ± 2.8 |
| yk.JahMicro 1.0 | hadur2.Hadur 3.8.5 | 16 | 95.0% ± 4.8 | 95.6% ± 3.9 | +0.6 ± 6.6 | 87.1% ± 3.5 | 90.3% ± 1.6 | +3.1 ± 3.8 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.9 ± 1.0 | +0.6 ± 0.5 |
| ags.Midboss 1q.fast | +8.7 ± 13.5 | -0.8 ± 8.4 | +0.7 ± 4.2 | +0.6 ± 5.6 |
| apv.NanoLauLectrik 1.0 | -1.3 ± 8.2 | -1.9 ± 4.0 | +0.8 ± 8.9 | -1.9 ± 5.5 |
| bvh.fnr.Fenrir 0.36l | +1.3 ± 15.3 | -1.9 ± 5.9 | -2.6 ± 9.2 | -4.3 ± 4.5 |
| cw.megas.Silhouette 1.1 | -1.3 ± 10.6 | -1.5 ± 9.2 | +2.1 ± 3.8 | -0.0 ± 3.2 |
| dggp.haiku.gpBot_0 1.1 | -3.7 ± 7.0 | +0.6 ± 1.3 | -3.3 ± 9.5 | +8.3 ± 7.0 |
| eat.HumblePieLite 1.0 | +0.0 ± 3.9 | +0.1 ± 4.1 | -3.6 ± 4.2 | +2.6 ± 12.3 |
| exauge.GateKeeper 1.1.121g | +0.0 ± 7.8 | -2.6 ± 9.0 | +1.5 ± 6.9 | -1.4 ± 7.5 |
| exauge.Leopard 1.1.019 | +0.0 ± 5.5 | +0.0 ± 0.0 | +0.0 ± 3.5 | -0.2 ± 2.0 |
| fowl3628800.SitAndGo 1.0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.9 ± 1.9 | -0.2 ± 0.5 |
| gh.nano.Grofvuil 0.2 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.9 ± 3.7 | -0.2 ± 1.4 |
| gwah.GBotMarkIV 1.0 | +1.2 ± 2.7 | +0.0 ± 0.0 | +0.6 ± 3.3 | +0.3 ± 1.2 |
| japs.Serenity 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 |
| jeremyreeder.Bully 1 | +2.5 ± 3.6 | +0.0 ± 0.0 | -1.5 ± 3.1 | -1.8 ± 2.4 |
| jgap.JGAP7247_2 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | +2.9 ± 7.6 | -1.6 ± 2.5 |
| kc.micro.Needle 0.101 | -5.0 ± 9.9 | +3.3 ± 5.4 | -1.8 ± 5.3 | +0.9 ± 5.5 |
| kinsen.nano.Quarrelet 1.0 | -8.8 ± 11.7 | -3.8 ± 7.5 | +1.7 ± 9.4 | +0.1 ± 5.6 |
| nat.Hikari dev0001 | -1.3 ± 8.2 | -0.6 ± 4.1 | -0.6 ± 5.6 | -0.8 ± 4.2 |
| ne.Chimera 1.2 | -1.2 ± 4.7 | +0.0 ± 0.0 | +1.9 ± 9.6 | n/a |
| ntw.Sighup 1.5 | -2.5 ± 5.3 | +0.6 ± 1.3 | -4.6 ± 6.5 | -2.1 ± 5.0 |
| nz.jdc.nano.AralR 1.1 | +1.2 ± 2.7 | +0.6 ± 2.4 | -0.0 ± 3.1 | +0.7 ± 3.6 |
| ola.Puffin 1.0 | +1.2 ± 2.7 | +0.0 ± 0.0 | -0.4 ± 2.3 | +3.5 ± 2.8 |
| pa3k.Viper 5.03 | +2.5 ± 11.6 | -4.4 ± 11.3 | +1.1 ± 5.4 | -3.3 ± 5.8 |
| pez.nano.Icarus 0.3 | +0.0 ± 0.0 | +0.0 ± 0.0 | +2.5 ± 3.6 | +0.0 ± 2.3 |
| rapture.Rapture 2.13 | +0.0 ± 0.0 | +0.6 ± 3.1 | -0.3 ± 2.9 | +0.5 ± 3.0 |
| repositorio.NanoStep 1.0 | -2.5 ± 3.6 | +0.0 ± 0.0 | +0.4 ± 5.9 | +5.7 ± 4.0 |
| robar.nano.MosquitoPM 1.0 | +1.2 ± 2.7 | +5.0 ± 5.5 | -0.5 ± 6.0 | +1.4 ± 4.5 |
| robar.nano.Scytodes 0.3 | -1.2 ± 2.7 | +0.0 ± 0.0 | +3.8 ± 5.3 | -1.6 ± 2.9 |
| sadoner.killer 0.2 | +3.8 ± 5.8 | +1.2 ± 4.7 | +2.2 ± 5.9 | +0.0 ± 5.1 |
| sample.Target 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | -2.5 ± 16.9 | +4.6 ± 9.1 | -0.4 ± 7.9 | -1.8 ± 4.8 |
| yk.JahMicro 1.0 | +2.5 ± 6.6 | +2.6 ± 3.1 | -2.3 ± 4.5 | +0.9 ± 2.4 |
