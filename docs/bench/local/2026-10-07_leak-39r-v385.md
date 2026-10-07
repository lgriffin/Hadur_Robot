# Bench: hadur2.Hadur 3.9 (cold)

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 5836 over 512 battles (11.4 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | mid | 69.7% ± 2.8 | 82.0% ± 3.4 | 58.4% ± 2.4 | 459 / 560 | 13.9% ± 0.5 | 8.9% ± 0.4 | 379 | 0 | 1.35 / 62.3 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | mid | 62.6% ± 3.7 | 77.1% ± 4.9 | 48.0% ± 2.5 | 432 / 560 | 10.8% ± 0.2 | 7.6% ± 0.4 | 176 | 0 | 1.04 / 17.3 |
| cw.megas.Silhouette 1.1 | mid | 72.0% ± 2.6 | 85.9% ± 3.6 | 59.1% ± 2.1 | 481 / 560 | 15.3% ± 0.6 | 7.8% ± 0.4 | 172 | 0 | 1.10 / 18.2 |
| kc.micro.Needle 0.101 | mid | 77.8% ± 2.2 | 92.0% ± 2.2 | 63.2% ± 2.1 | 515 / 560 | 14.0% ± 0.7 | 6.5% ± 0.5 | 159 | 0 | 1.17 / 17.7 |
| nat.Hikari dev0001 | lower | 82.7% ± 1.6 | 95.4% ± 1.9 | 69.8% ± 1.7 | 534 / 560 | 15.3% ± 0.4 | 6.2% ± 0.4 | 173 | 0 | 0.94 / 15.9 |
| bvh.fnr.Fenrir 0.36l | lower | 74.8% ± 2.4 | 88.9% ± 3.3 | 61.4% ± 2.0 | 498 / 560 | 14.6% ± 0.7 | 7.5% ± 0.4 | 234 | 0 | 1.06 / 19.5 |
| pa3k.Viper 5.03 | lower | 78.3% ± 2.1 | 87.1% ± 3.0 | 69.8% ± 1.4 | 488 / 560 | 16.8% ± 0.4 | 7.6% ± 0.6 | 171 | 0 | 1.03 / 20.7 |
| apv.NanoLauLectrik 1.0 | lower | 80.3% ± 2.1 | 94.6% ± 2.0 | 64.7% ± 2.3 | 530 / 560 | 15.6% ± 0.5 | 6.2% ± 1.3 | 163 | 0 | 1.00 / 17.0 |
| kinsen.nano.Quarrelet 1.0 | lower | 78.4% ± 2.3 | 93.8% ± 2.2 | 61.4% ± 2.4 | 525 / 560 | 14.8% ± 0.7 | 5.7% ± 0.4 | 183 | 0 | 0.94 / 21.7 |
| exauge.GateKeeper 1.1.121g | lower | 78.1% ± 1.8 | 93.6% ± 2.0 | 62.3% ± 1.8 | 524 / 560 | 14.6% ± 0.5 | 6.8% ± 0.4 | 173 | 0 | 0.95 / 18.4 |
| robar.nano.MosquitoPM 1.0 | lower | 83.9% ± 1.5 | 96.3% ± 2.1 | 71.4% ± 1.2 | 539 / 560 | 18.9% ± 0.7 | 6.3% ± 0.3 | 173 | 0 | 0.92 / 16.6 |
| nz.jdc.nano.AralR 1.1 | lower | 90.0% ± 0.9 | 99.1% ± 0.9 | 82.1% ± 1.1 | 555 / 560 | 21.6% ± 0.8 | 9.1% ± 0.6 | 191 | 0 | 0.83 / 14.9 |
| eat.HumblePieLite 1.0 | lower | 92.2% ± 0.9 | 99.8% ± 0.4 | 85.6% ± 1.5 | 559 / 560 | 36.5% ± 0.7 | 6.8% ± 0.8 | 183 | 0 | 0.74 / 111.3 |
| ne.Chimera 1.2 | lower | 97.7% ± 1.3 | 99.5% ± 0.6 | 65.0% ± 11.4 | 557 / 560 | 0.8% ± 0.3 | 0.4% ± 0.2 | 85 | 0 | 0.79 / 17.6 |
| robar.nano.Scytodes 0.3 | weak | 94.2% ± 0.7 | 100.0% ± 0.0 | 89.1% ± 1.3 | 560 / 560 | 50.1% ± 1.1 | 6.0% ± 0.8 | 193 | 0 | 0.78 / 14.7 |
| gh.nano.Grofvuil 0.2 | weak | 98.3% ± 0.3 | 100.0% ± 0.0 | 96.7% ± 0.6 | 560 / 560 | 40.6% ± 0.8 | 1.7% ± 0.3 | 175 | 0 | 0.66 / 11.8 |
| sadoner.killer 0.2 | weak | 85.7% ± 1.7 | 95.7% ± 2.0 | 76.7% ± 1.8 | 536 / 560 | 21.5% ± 0.7 | 7.5% ± 0.5 | 178 | 0 | 0.88 / 15.2 |
| exauge.Leopard 1.1.019 | weak | 82.6% ± 1.0 | 99.6% ± 0.5 | 73.8% ± 1.2 | 558 / 560 | 79.8% ± 0.7 | 39.6% ± 3.1 | 185 | 0 | 0.59 / 9.6 |
| rapture.Rapture 2.13 | weak | 97.8% ± 0.4 | 99.6% ± 0.5 | 95.9% ± 0.8 | 558 / 560 | 22.3% ± 1.0 | 2.5% ± 0.4 | 193 | 0 | 0.70 / 16.8 |
| pez.nano.Icarus 0.3 | weak | 97.2% ± 0.6 | 99.6% ± 0.5 | 93.9% ± 1.0 | 558 / 560 | 17.1% ± 0.6 | 1.3% ± 0.3 | 158 | 0 | 0.65 / 17.4 |
| repositorio.NanoStep 1.0 | weak | 97.8% ± 0.9 | 99.6% ± 0.5 | 96.2% ± 1.2 | 558 / 560 | 27.1% ± 0.9 | 1.8% ± 0.7 | 178 | 0 | 0.68 / 14.7 |
| dggp.haiku.gpBot_0 1.1 | weak | 94.9% ± 0.6 | 100.0% ± 0.0 | 89.5% ± 1.3 | 560 / 560 | 26.9% ± 1.3 | 3.0% ± 0.4 | 175 | 0 | 0.73 / 14.8 |
| jeremyreeder.Bully 1 | weak | 94.5% ± 1.6 | 99.3% ± 0.9 | 92.7% ± 1.6 | 556 / 560 | 81.8% ± 0.6 | 10.4% ± 4.4 | 178 | 0 | 0.53 / 10.7 |
| fowl3628800.SitAndGo 1.0.0 | weak | 99.2% ± 0.4 | 99.8% ± 0.4 | 98.5% ± 0.4 | 559 / 560 | 33.9% ± 2.0 | 1.6% ± 0.3 | 180 | 0 | 0.72 / 17.6 |
| ntw.Sighup 1.5 | weak | 91.1% ± 1.3 | 99.6% ± 0.5 | 83.4% ± 1.7 | 558 / 560 | 29.9% ± 1.6 | 7.7% ± 1.2 | 182 | 0 | 0.75 / 15.0 |
| yk.JahMicro 1.0 | weak | 93.2% ± 0.9 | 98.2% ± 1.2 | 88.7% ± 1.0 | 550 / 560 | 22.9% ± 1.2 | 7.0% ± 0.5 | 176 | 0 | 0.76 / 15.2 |
| ola.Puffin 1.0 | weak | 97.8% ± 0.6 | 99.8% ± 0.4 | 96.4% ± 0.8 | 559 / 560 | 52.7% ± 1.8 | 6.5% ± 1.3 | 188 | 0 | 0.69 / 12.9 |
| gwah.GBotMarkIV 1.0 | weak | 99.2% ± 0.4 | 99.8% ± 0.4 | 98.5% ± 0.5 | 559 / 560 | 75.2% ± 0.9 | 1.5% ± 1.0 | 173 | 0 | 0.56 / 9.5 |
| jgap.JGAP7247_2 1.0 | weak | 96.0% ± 0.7 | 100.0% ± 0.0 | 92.0% ± 1.2 | 560 / 560 | 38.9% ± 1.4 | 3.7% ± 1.0 | 185 | 0 | 0.71 / 15.1 |
| RobotMarco.MarcoV 0.1 | weak | 99.9% ± 0.1 | 100.0% ± 0.0 | 99.8% ± 0.2 | 560 / 560 | 40.7% ± 1.1 | 0.5% ± 0.7 | 180 | 0 | 0.59 / 10.4 |
| japs.Serenity 1.0 | weak | 98.8% ± 0.5 | 100.0% ± 0.0 | 100.0% ± 0.0 | 560 / 560 | 35.8% ± 2.3 | 0.0% ± 0.0 | 182 | 0 | 0.63 / 13.7 |
| sample.Target 1.0 | weak | 100.0% ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | 560 / 560 | 51.0% ± 0.8 | 0.0% ± 0.0 | 162 | 0 | 0.50 / 9.9 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 16 | 13 | 298 | 0 | 0.68 | 2 | 2 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 16 | 7 | 894 | 0 | 0.31 | 6 | 6 | 0 |
| cw.megas.Silhouette 1.1 | 16 | 13 | 0 | 0 | 0.31 | 3 | 3 | 0 |
| kc.micro.Needle 0.101 | 16 | 12 | 596 | 0 | 0.28 | 2 | 2 | 0 |
| nat.Hikari dev0001 | 16 | 14 | 298 | 0 | 0.31 | 1 | 1 | 0 |
| bvh.fnr.Fenrir 0.36l | 16 | 12 | 1192 | 0 | 0.42 | 0 | 0 | 0 |
| pa3k.Viper 5.03 | 16 | 12 | 298 | 0 | 0.31 | 3 | 3 | 0 |
| apv.NanoLauLectrik 1.0 | 16 | 12 | 1440 | 0 | 0.29 | 1 | 1 | 0 |
| kinsen.nano.Quarrelet 1.0 | 16 | 15 | 0 | 0 | 0.33 | 1 | 1 | 0 |
| exauge.GateKeeper 1.1.121g | 16 | 15 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| robar.nano.MosquitoPM 1.0 | 16 | 15 | 0 | 0 | 0.31 | 1 | 1 | 0 |
| nz.jdc.nano.AralR 1.1 | 16 | 14 | 596 | 0 | 0.34 | 0 | 0 | 0 |
| eat.HumblePieLite 1.0 | 16 | 14 | 596 | 0 | 0.33 | 0 | 0 | 0 |
| ne.Chimera 1.2 | 16 | 13 | 894 | 0 | 0.15 | 0 | 0 | 16 |
| robar.nano.Scytodes 0.3 | 16 | 15 | 298 | 0 | 0.34 | 0 | 0 | 0 |
| gh.nano.Grofvuil 0.2 | 16 | 13 | 894 | 0 | 0.31 | 0 | 0 | 0 |
| sadoner.killer 0.2 | 16 | 14 | 298 | 0 | 0.32 | 1 | 1 | 0 |
| exauge.Leopard 1.1.019 | 16 | 15 | 218 | 0 | 0.33 | 0 | 0 | 0 |
| rapture.Rapture 2.13 | 16 | 15 | 298 | 0 | 0.34 | 0 | 0 | 0 |
| pez.nano.Icarus 0.3 | 16 | 14 | 298 | 0 | 0.28 | 1 | 1 | 0 |
| repositorio.NanoStep 1.0 | 16 | 16 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| dggp.haiku.gpBot_0 1.1 | 16 | 14 | 596 | 0 | 0.31 | 0 | 0 | 0 |
| jeremyreeder.Bully 1 | 16 | 12 | 913 | 0 | 0.32 | 0 | 0 | 0 |
| fowl3628800.SitAndGo 1.0.0 | 16 | 14 | 894 | 0 | 0.32 | 0 | 0 | 0 |
| ntw.Sighup 1.5 | 16 | 14 | 567 | 0 | 0.33 | 0 | 0 | 0 |
| yk.JahMicro 1.0 | 16 | 14 | 596 | 0 | 0.31 | 0 | 0 | 0 |
| ola.Puffin 1.0 | 16 | 14 | 596 | 0 | 0.34 | 0 | 0 | 0 |
| gwah.GBotMarkIV 1.0 | 16 | 13 | 804 | 0 | 0.31 | 0 | 0 | 0 |
| jgap.JGAP7247_2 1.0 | 16 | 12 | 1133 | 0 | 0.33 | 0 | 0 | 0 |
| RobotMarco.MarcoV 0.1 | 16 | 12 | 1192 | 0 | 0.32 | 0 | 0 | 0 |
| japs.Serenity 1.0 | 16 | 14 | 596 | 0 | 0.33 | 0 | 0 | 0 |
| sample.Target 1.0 | 16 | 15 | 298 | 0 | 0.29 | 0 | 0 | 0 |

431 of 512 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 31734 | 93 | 31709 | 31707 (99.9%) | 27 (0.1%) | 2 (0.0%) | 1892 | 482 | 292 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 27498 | 151 | 27435 | 27434 (99.8%) | 64 (0.2%) | 1 (0.0%) | 1327 | 278 | 82 |
| cw.megas.Silhouette 1.1 | 18098 | 37 | 18098 | 18097 (100.0%) | 1 (0.0%) | 1 (0.0%) | 647 | 256 | 67 |
| kc.micro.Needle 0.101 | 22270 | 28 | 22228 | 22228 (99.8%) | 42 (0.2%) | 0 (0.0%) | 1088 | 329 | 41 |
| nat.Hikari dev0001 | 18967 | 30 | 18954 | 18946 (99.9%) | 21 (0.1%) | 8 (0.0%) | 437 | 290 | 59 |
| bvh.fnr.Fenrir 0.36l | 19449 | 200 | 19361 | 19353 (99.5%) | 96 (0.5%) | 8 (0.0%) | 821 | 284 | 127 |
| pa3k.Viper 5.03 | 18336 | 43 | 18321 | 18318 (99.9%) | 18 (0.1%) | 3 (0.0%) | 1291 | 255 | 63 |
| apv.NanoLauLectrik 1.0 | 12602 | 32 | 12536 | 12505 (99.2%) | 97 (0.8%) | 31 (0.2%) | 1178 | 236 | 65 |
| kinsen.nano.Quarrelet 1.0 | 13019 | 39 | 13153 | 13000 (99.9%) | 19 (0.1%) | 153 (1.2%) | 1522 | 245 | 65 |
| exauge.GateKeeper 1.1.121g | 14981 | 12 | 15085 | 14931 (99.7%) | 50 (0.3%) | 154 (1.0%) | 2063 | 312 | 51 |
| robar.nano.MosquitoPM 1.0 | 12573 | 43 | 12602 | 12538 (99.7%) | 35 (0.3%) | 64 (0.5%) | 1470 | 297 | 400 |
| nz.jdc.nano.AralR 1.1 | 14613 | 44 | 14681 | 14519 (99.4%) | 94 (0.6%) | 162 (1.1%) | 934 | 296 | 63 |
| eat.HumblePieLite 1.0 | 6177 | 41 | 6144 | 6143 (99.4%) | 34 (0.6%) | 1 (0.0%) | 22 | 168 | 51 |
| ne.Chimera 1.2 | 453 | 0 | 398 | 398 (87.9%) | 55 (12.1%) | 0 (0.0%) | 11 | 7 | 34 |
| robar.nano.Scytodes 0.3 | 5179 | 37 | 5204 | 5158 (99.6%) | 21 (0.4%) | 46 (0.9%) | 139 | 169 | 40 |
| gh.nano.Grofvuil 0.2 | 7450 | 32 | 7406 | 7396 (99.3%) | 54 (0.7%) | 10 (0.1%) | 225 | 208 | 39 |
| sadoner.killer 0.2 | 11517 | 37 | 11498 | 11496 (99.8%) | 21 (0.2%) | 2 (0.0%) | 109 | 179 | 55 |
| exauge.Leopard 1.1.019 | 4349 | 34 | 4335 | 4331 (99.6%) | 18 (0.4%) | 4 (0.1%) | 1069 | 455 | 45 |
| rapture.Rapture 2.13 | 15234 | 29 | 15198 | 15194 (99.7%) | 40 (0.3%) | 4 (0.0%) | 182 | 215 | 275 |
| pez.nano.Icarus 0.3 | 14454 | 24 | 14444 | 14413 (99.7%) | 41 (0.3%) | 31 (0.2%) | 1246 | 209 | 39 |
| repositorio.NanoStep 1.0 | 10657 | 57 | 10638 | 10632 (99.8%) | 25 (0.2%) | 6 (0.1%) | 364 | 206 | 468 |
| dggp.haiku.gpBot_0 1.1 | 7535 | 36 | 7502 | 7501 (99.5%) | 34 (0.5%) | 1 (0.0%) | 957 | 194 | 39 |
| jeremyreeder.Bully 1 | 3331 | 28 | 3289 | 3289 (98.7%) | 42 (1.3%) | 0 (0.0%) | 860 | 175 | 42 |
| fowl3628800.SitAndGo 1.0.0 | 10233 | 53 | 10174 | 10019 (97.9%) | 214 (2.1%) | 155 (1.5%) | 2412 | 248 | 41 |
| ntw.Sighup 1.5 | 8381 | 42 | 8357 | 8321 (99.3%) | 60 (0.7%) | 36 (0.4%) | 2593 | 292 | 45 |
| yk.JahMicro 1.0 | 11110 | 19 | 11111 | 11080 (99.7%) | 30 (0.3%) | 31 (0.3%) | 583 | 222 | 62 |
| ola.Puffin 1.0 | 6452 | 52 | 6409 | 6400 (99.2%) | 52 (0.8%) | 9 (0.1%) | 153 | 245 | 223 |
| gwah.GBotMarkIV 1.0 | 3817 | 14 | 3763 | 3762 (98.6%) | 55 (1.4%) | 1 (0.0%) | 106 | 121 | 179 |
| jgap.JGAP7247_2 1.0 | 4932 | 23 | 5110 | 4864 (98.6%) | 68 (1.4%) | 246 (4.8%) | 2672 | 275 | 53 |
| RobotMarco.MarcoV 0.1 | 1730 | 7 | 1718 | 1717 (99.2%) | 13 (0.8%) | 1 (0.1%) | 8 | 48 | 100 |
| japs.Serenity 1.0 | 0 | 0 | 55 | - | - | 55 (100.0%) | 1525 | 1 | 55 |
| sample.Target 1.0 | 0 | 0 | 0 | - | - | - | 224 | 0 | 33 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ags.Midboss 1q.fast | 32533 | 3040 (9.3%) | 29336 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 29627 | 2680 (9.0%) | 22535 |
| cw.megas.Silhouette 1.1 | 19706 | 1633 (8.3%) | 13821 |
| kc.micro.Needle 0.101 | 25605 | 2059 (8.0%) | 22006 |
| nat.Hikari dev0001 | 19198 | 1944 (10.1%) | 15205 |
| bvh.fnr.Fenrir 0.36l | 22962 | 1540 (6.7%) | 11336 |
| pa3k.Viper 5.03 | 22349 | 1416 (6.3%) | 7039 |
| apv.NanoLauLectrik 1.0 | 14844 | 1042 (7.0%) | 3946 |
| kinsen.nano.Quarrelet 1.0 | 15509 | 966 (6.2%) | 5664 |
| exauge.GateKeeper 1.1.121g | 19366 | 966 (5.0%) | 2969 |
| robar.nano.MosquitoPM 1.0 | 13417 | 855 (6.4%) | 3075 |
| nz.jdc.nano.AralR 1.1 | 12971 | 1115 (8.6%) | 8179 |
| eat.HumblePieLite 1.0 | 7103 | 347 (4.9%) | 0 |
| ne.Chimera 1.2 | 511 | 27 (5.3%) | 0 |
| robar.nano.Scytodes 0.3 | 5530 | 416 (7.5%) | 1013 |
| gh.nano.Grofvuil 0.2 | 6997 | 613 (8.8%) | 3327 |
| sadoner.killer 0.2 | 11352 | 806 (7.1%) | 2822 |
| exauge.Leopard 1.1.019 | 4238 | 86 (2.0%) | 0 |
| rapture.Rapture 2.13 | 13581 | 867 (6.4%) | 5114 |
| pez.nano.Icarus 0.3 | 14340 | 1035 (7.2%) | 5127 |
| repositorio.NanoStep 1.0 | 9448 | 607 (6.4%) | 1653 |
| dggp.haiku.gpBot_0 1.1 | 8516 | 424 (5.0%) | 0 |
| jeremyreeder.Bully 1 | 3525 | 14 (0.4%) | 0 |
| fowl3628800.SitAndGo 1.0.0 | 8948 | 473 (5.3%) | 1157 |
| ntw.Sighup 1.5 | 9009 | 425 (4.7%) | 84 |
| yk.JahMicro 1.0 | 15514 | 841 (5.4%) | 3518 |
| ola.Puffin 1.0 | 6329 | 495 (7.8%) | 914 |
| gwah.GBotMarkIV 1.0 | 3890 | 108 (2.8%) | 201 |
| jgap.JGAP7247_2 1.0 | 6612 | 297 (4.5%) | 0 |
| RobotMarco.MarcoV 0.1 | 8730 | 80 (0.9%) | 0 |
| japs.Serenity 1.0 | 15939 | 0 (0.0%) | 0 |
| sample.Target 1.0 | 10999 | 0 (0.0%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 650 | 409 | 633 | 774 | 42.6 / 30.4 | 2366 | 9113 | 1972 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 650 | 467 | 650 | 713 | 29.9 / 32.5 | 470 | 10238 | 2654 |
| cw.megas.Silhouette 1.1 | 650 | 401 | 617 | 514 | 43.1 / 29.9 | 3640 | 7051 | 5302 |
| kc.micro.Needle 0.101 | 650 | 423 | 477 | 631 | 41.4 / 24.3 | 1439 | 5936 | 0 |
| nat.Hikari dev0001 | 650 | 411 | 513 | 503 | 47.7 / 20.7 | 4134 | 8251 | 4892 |
| bvh.fnr.Fenrir 0.36l | 650 | 484 | 631 | 572 | 44.0 / 27.7 | 2212 | 8090 | 83 |
| pa3k.Viper 5.03 | 650 | 435 | 494 | 576 | 52.2 / 22.5 | 5837 | 8425 | 153 |
| apv.NanoLauLectrik 1.0 | 650 | 469 | 483 | 394 | 39.7 / 21.7 | 2989 | 11244 | 6835 |
| kinsen.nano.Quarrelet 1.0 | 650 | 496 | 588 | 407 | 36.5 / 23.1 | 2097 | 10980 | 7728 |
| exauge.GateKeeper 1.1.121g | 650 | 506 | 594 | 492 | 40.9 / 24.8 | 2229 | 7414 | 2338 |
| robar.nano.MosquitoPM 1.0 | 650 | 467 | 489 | 372 | 48.7 / 19.6 | 5240 | 9293 | 5714 |
| nz.jdc.nano.AralR 1.1 | 650 | 332 | 441 | 381 | 69.2 / 15.2 | 8327 | 8805 | 2310 |
| eat.HumblePieLite 1.0 | 650 | 487 | 400 | 220 | 74.3 / 12.6 | 5443 | 4341 | 0 |
| ne.Chimera 1.2 | 650 | 385 | 630 | 14 | 1.7 / 1.0 | 5 | 301 | 0 |
| robar.nano.Scytodes 0.3 | 650 | 398 | 400 | 174 | 77.0 / 9.5 | 3782 | 7626 | 2021 |
| gh.nano.Grofvuil 0.2 | 650 | 349 | 400 | 215 | 75.3 / 2.6 | 4652 | 6400 | 16 |
| sadoner.killer 0.2 | 650 | 291 | 433 | 334 | 61.1 / 18.7 | 6790 | 10470 | 50 |
| exauge.Leopard 1.1.019 | 650 | 207 | 548 | 139 | 100.7 / 35.9 | 3626 | 5308 | 12 |
| rapture.Rapture 2.13 | 650 | 392 | 400 | 390 | 73.4 / 3.2 | 8673 | 8015 | 2021 |
| pez.nano.Icarus 0.3 | 650 | 358 | 400 | 395 | 47.3 / 3.1 | 3695 | 10839 | 3667 |
| repositorio.NanoStep 1.0 | 650 | 432 | 400 | 285 | 70.3 / 2.8 | 6924 | 7012 | 647 |
| dggp.haiku.gpBot_0 1.1 | 650 | 403 | 400 | 256 | 58.7 / 6.9 | 5848 | 7834 | 3595 |
| jeremyreeder.Bully 1 | 650 | 205 | 400 | 118 | 83.8 / 6.6 | 2883 | 6011 | 165 |
| fowl3628800.SitAndGo 1.0.0 | 650 | 473 | 400 | 272 | 77.0 / 1.1 | 6924 | 3583 | 587 |
| ntw.Sighup 1.5 | 650 | 345 | 400 | 268 | 61.4 / 12.3 | 6054 | 7525 | 1770 |
| yk.JahMicro 1.0 | 650 | 388 | 400 | 441 | 77.8 / 9.9 | 9787 | 3292 | 99 |
| ola.Puffin 1.0 | 650 | 316 | 400 | 199 | 90.5 / 3.4 | 4592 | 3639 | 283 |
| gwah.GBotMarkIV 1.0 | 650 | 212 | 400 | 131 | 82.1 / 1.2 | 3019 | 4794 | 406 |
| jgap.JGAP7247_2 1.0 | 650 | 441 | 400 | 204 | 66.7 / 5.8 | 4593 | 5217 | 2696 |
| RobotMarco.MarcoV 0.1 | 650 | 413 | 400 | 260 | 90.8 / 0.1 | 5399 | 1477 | 120 |
| japs.Serenity 1.0 | 650 | 472 | 650 | 425 | 95.8 / 0.0 | 1597 | 30 | 358 |
| sample.Target 1.0 | 650 | 496 | 650 | 297 | 98.9 / 0.0 | 0 | 0 | 239 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 8.9% | 379 | 604 | 3 | 56.3 | 3032 / 3040 (100%) | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 7.6% | 176 | 9497 | 3 | 48.2 | 2672 / 2680 (100%) | 0 | 0 |
| cw.megas.Silhouette 1.1 | 7.8% | 172 | 4592 | 3 | 32.0 | 1633 / 1633 (100%) | 0 | 0 |
| kc.micro.Needle 0.101 | 6.5% | 159 | 1462 | 3 | 39.4 | 2058 / 2059 (100%) | 0 | 0 |
| nat.Hikari dev0001 | 6.2% | 173 | 1698 | 3 | 33.8 | 1942 / 1944 (100%) | 0 | 0 |
| bvh.fnr.Fenrir 0.36l | 7.5% | 234 | 732 | 3 | 34.6 | 1530 / 1540 (99%) | 0 | 0 |
| pa3k.Viper 5.03 | 7.6% | 171 | 1039 | 3 | 32.5 | 1415 / 1416 (100%) | 0 | 0 |
| apv.NanoLauLectrik 1.0 | 6.2% | 163 | 1323 | 3 | 22.3 | 1034 / 1042 (99%) | 0 | 0 |
| kinsen.nano.Quarrelet 1.0 | 5.7% | 183 | 1395 | 3 | 23.4 | 964 / 966 (100%) | 0 | 0 |
| exauge.GateKeeper 1.1.121g | 6.8% | 173 | 110 | 3 | 26.9 | 962 / 966 (100%) | 0 | 0 |
| robar.nano.MosquitoPM 1.0 | 6.3% | 173 | 151 | 3 | 22.4 | 855 / 855 (100%) | 0 | 0 |
| nz.jdc.nano.AralR 1.1 | 9.1% | 191 | 87 | 3 | 26.2 | 1111 / 1115 (100%) | 0 | 0 |
| eat.HumblePieLite 1.0 | 6.8% | 183 | 61 | 3 | 11.0 | 345 / 347 (99%) | 0 | 0 |
| ne.Chimera 1.2 | 0.4% | 85 | 25 | 3 | 0.7 | 26 / 27 (96%) | 0 | 0 |
| robar.nano.Scytodes 0.3 | 6.0% | 193 | 397 | 3 | 9.3 | 413 / 416 (99%) | 0 | 0 |
| gh.nano.Grofvuil 0.2 | 1.7% | 175 | 71 | 3 | 13.2 | 609 / 613 (99%) | 0 | 0 |
| sadoner.killer 0.2 | 7.5% | 178 | 81 | 3 | 20.4 | 805 / 806 (100%) | 0 | 0 |
| exauge.Leopard 1.1.019 | 39.6% | 185 | 48 | 3 | 7.7 | 85 / 86 (99%) | 0 | 0 |
| rapture.Rapture 2.13 | 2.5% | 193 | 441 | 3 | 27.1 | 864 / 867 (100%) | 0 | 0 |
| pez.nano.Icarus 0.3 | 1.3% | 158 | 117 | 3 | 25.8 | 1033 / 1035 (100%) | 0 | 0 |
| repositorio.NanoStep 1.0 | 1.8% | 178 | 1062 | 3 | 19.0 | 604 / 607 (100%) | 0 | 0 |
| dggp.haiku.gpBot_0 1.1 | 3.0% | 175 | 80 | 3 | 13.4 | 421 / 424 (99%) | 0 | 0 |
| jeremyreeder.Bully 1 | 10.4% | 178 | 51 | 3 | 5.8 | 14 / 14 (100%) | 0 | 0 |
| fowl3628800.SitAndGo 1.0.0 | 1.6% | 180 | 365 | 3 | 18.2 | 461 / 473 (97%) | 0 | 0 |
| ntw.Sighup 1.5 | 7.7% | 182 | 74 | 3 | 14.8 | 422 / 425 (99%) | 0 | 0 |
| yk.JahMicro 1.0 | 7.0% | 176 | 81 | 3 | 19.8 | 836 / 841 (99%) | 0 | 0 |
| ola.Puffin 1.0 | 6.5% | 188 | 454 | 3 | 11.4 | 495 / 495 (100%) | 0 | 0 |
| gwah.GBotMarkIV 1.0 | 1.5% | 173 | 53 | 3 | 6.7 | 105 / 108 (97%) | 0 | 0 |
| jgap.JGAP7247_2 1.0 | 3.7% | 185 | 82 | 3 | 9.1 | 290 / 297 (98%) | 0 | 0 |
| RobotMarco.MarcoV 0.1 | 0.5% | 180 | 54 | 3 | 3.1 | 80 / 80 (100%) | 0 | 0 |
| japs.Serenity 1.0 | 0.0% | 182 | 738 | 3 | 0.1 | - | 0 | 0 |
| sample.Target 1.0 | 0.0% | 162 | 40 | 3 | 0.0 | - | 0 | 0 |

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
| ags.Midboss 1q.fast | ags.Midboss | 1 | 35 | 284 | 10.5% | 7.9% ± 1.3 | 13.3% | 25.0% / 24.5% | 8.2% | 0 / 0 | T3/M0 | 60% |
| wcsv.PowerHouse.PowerHouse 1.7e3 | wcsv.PowerHouse.PowerHouse | 1 | 35 | 340 | 8.3% | 7.2% ± 1.3 | 10.3% | 22.4% / 23.1% | 10.6% | 0 / 0 | T3/M1 | 59% |
| cw.megas.Silhouette 1.1 | cw.megas.Silhouette | 1 | 35 | 308 | 9.4% | 7.6% ± 1.7 | 15.3% | 24.6% / 25.4% | 10.1% | 0 / 0 | T3/M1 | 72% |
| kc.micro.Needle 0.101 | kc.micro.Needle | 1 | 35 | 296 | 7.3% | 6.5% ± 1.4 | 11.4% | 24.9% / 22.1% | 4.7% | 0 / 0 | T2/M1 | 75% |
| nat.Hikari dev0001 | nat.Hikari | 1 | 35 | 280 | 8.1% | 6.9% ± 1.5 | 14.7% | 30.8% / 31.0% | 24.3% | 0 / 0 | T2/M0 | 76% |
| bvh.fnr.Fenrir 0.36l | bvh.fnr.Fenrir | 1 | 35 | 292 | 8.4% | 8.3% ± 1.6 | 12.7% | 27.7% / 23.7% | 2.8% | 0 / 0 | T3/M0 | 70% |
| pa3k.Viper 5.03 | pa3k.Viper | 1 | 35 | 274 | 7.6% | 6.6% ± 1.5 | 14.9% | 34.4% / 31.9% | 24.2% | 0 / 0 | T2/M0 | 79% |
| apv.NanoLauLectrik 1.0 | apv.NanoLauLectrik | 1 | 35 | 304 | 5.2% | 5.9% ± 1.8 | 14.6% | 33.0% / 31.1% | 10.5% | 0 / 0 | T2/M? | 84% |
| kinsen.nano.Quarrelet 1.0 | kinsen.nano.Quarrelet | 1 | 35 | 316 | 6.0% | 7.2% ± 1.9 | 13.6% | 32.9% / 28.7% | 7.1% | 0 / 0 | T3/M? | 81% |
| exauge.GateKeeper 1.1.121g | exauge.GateKeeper | 1 | 35 | 310 | 6.8% | 7.5% ± 1.8 | 13.4% | 30.1% / 26.3% | 25.8% | 0 / 0 | T3/M0 | 81% |
| robar.nano.MosquitoPM 1.0 | robar.nano.MosquitoPM | 1 | 35 | 316 | 6.7% | 6.9% ± 1.9 | 15.4% | 38.1% / 39.8% | 16.4% | 0 / 0 | T2/M? | 86% |
| nz.jdc.nano.AralR 1.1 | nz.jdc.nano.AralR | 1 | 35 | 300 | 11.9% | 6.8% ± 1.8 | 19.6% | 26.9% / 31.2% | 5.0% | 0 / 0 | T2/M? | 86% |
| eat.HumblePieLite 1.0 | eat.HumblePieLite | 1 | 35 | 300 | 8.9% | 10.8% ± 3.3 | 26.5% | 32.1% / 27.6% | 0.4% | 0 / 0 | T?/M? | 90% |
| ne.Chimera 1.2 | ne.Chimera | 1 | 35 | 272 | 16.7% | 20.9% ± 19.4 | 40.0% | 35.6% / 38.9% | 0.0% | 0 / 0 | T?/M? | 98% |
| robar.nano.Scytodes 0.3 | robar.nano.Scytodes | 1 | 35 | 308 | 9.8% | 11.2% ± 3.6 | 32.5% | 78.6% / 74.5% | 45.9% | 0 / 0 | T?/M? | 91% |
| gh.nano.Grofvuil 0.2 | gh.nano.Grofvuil | 1 | 35 | 296 | 2.5% | 1.9% ± 1.4 | 25.9% | 48.0% / 52.7% | 7.4% | 0 / 0 | T0/M? | 98% |
| sadoner.killer 0.2 | sadoner.killer | 1 | 35 | 288 | 10.1% | 6.8% ± 1.9 | 17.7% | 24.4% / 23.9% | 4.8% | 0 / 0 | T2/M? | 85% |
| exauge.Leopard 1.1.019 | exauge.Leopard | 1 | 35 | 296 | 45.8% | 11.5% ± 3.9 | 46.3% | 16.8% / 16.9% | 3.7% | 0 / 0 | T?/M? | 80% |
| rapture.Rapture 2.13 | rapture.Rapture | 1 | 35 | 294 | 3.5% | 2.4% ± 1.0 | 17.7% | 34.6% / 30.7% | 10.6% | 0 / 0 | T1/M? | 97% |
| pez.nano.Icarus 0.3 | pez.nano.Icarus | 1 | 35 | 292 | 1.6% | 0.9% ± 0.7 | 14.6% | 24.0% / 21.7% | 6.9% | 0 / 0 | T0/M1 | 97% |
| repositorio.NanoStep 1.0 | repositorio.NanoStep | 1 | 35 | 312 | 1.1% | 0.4% ± 0.7 | 20.2% | 45.1% / 42.8% | 1.1% | 0 / 0 | T0/M? | 97% |
| dggp.haiku.gpBot_0 1.1 | dggp.haiku.gpBot_0 | 1 | 35 | 304 | 4.2% | 2.5% ± 1.6 | 21.4% | 35.7% / 31.8% | 11.5% | 0 / 0 | T1/M? | 94% |
| jeremyreeder.Bully 1 | jeremyreeder.Bully | 1 | 35 | 300 | 8.1% | 3.0% ± 2.6 | 41.8% | 20.2% / 19.8% | 12.0% | 0 / 0 | T1/M? | 95% |
| fowl3628800.SitAndGo 1.0.0 | fowl3628800.SitAndGo | 1 | 35 | 316 | 2.0% | 1.4% ± 1.1 | 24.1% | 55.4% / 52.5% | 34.2% | 0 / 0 | T0/M? | 99% |
| ntw.Sighup 1.5 | ntw.Sighup | 1 | 35 | 272 | 7.4% | 4.1% ± 1.8 | 20.4% | 33.6% / 28.3% | 15.8% | 0 / 0 | T1/M? | 89% |
| yk.JahMicro 1.0 | yk.JahMicro | 1 | 35 | 276 | 5.8% | 3.5% ± 1.6 | 18.0% | 30.7% / 28.4% | 3.8% | 0 / 0 | T1/M? | 93% |
| ola.Puffin 1.0 | ola.Puffin | 1 | 35 | 272 | 17.0% | 10.6% ± 3.0 | 31.4% | 46.8% / 49.3% | 0.6% | 0 / 0 | T?/M? | 95% |
| gwah.GBotMarkIV 1.0 | gwah.GBotMarkIV | 1 | 35 | 292 | 4.8% | 0.3% ± 1.4 | 38.8% | 21.4% / 22.5% | 2.5% | 0 / 0 | T0/M? | 96% |
| jgap.JGAP7247_2 1.0 | jgap.JGAP7247_2 | 1 | 35 | 292 | 4.5% | 4.9% ± 2.7 | 27.0% | 73.5% / 76.7% | 22.9% | 0 / 0 | T2/M? | 96% |
| RobotMarco.MarcoV 0.1 | RobotMarco.MarcoV | 1 | 35 | 300 | 0.0% | 0.0% ± 2.6 | 27.9% | 63.1% / 58.9% | 66.0% | 0 / 0 | T0/M? | 100% |
| japs.Serenity 1.0 | japs.Serenity | 1 | 35 | 284 | 0.0% | 0.0% ± 33.5 | 26.2% | 48.1% / 43.2% | 1.7% | 0 / 0 | T?/M? | 100% |
| sample.Target 1.0 | sample.Target | 1 | 35 | 284 | - | - | 36.4% | 72.1% / 65.2% | 77.5% | 0 / 0 | T?/M? | 100% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.9 vs hadur2.Hadur 3.8.5

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| ags.Midboss 1q.fast | 69.7% ± 2.8 | 72.2% ± 2.6 | -2.5 ± 3.7 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 62.6% ± 3.7 | 63.5% ± 2.7 | -1.0 ± 3.8 |
| cw.megas.Silhouette 1.1 | 72.0% ± 2.6 | 72.9% ± 2.4 | -1.0 ± 3.9 |
| kc.micro.Needle 0.101 | 77.8% ± 2.2 | 76.5% ± 1.3 | +1.3 ± 2.9 |
| nat.Hikari dev0001 | 82.7% ± 1.6 | 82.8% ± 2.1 | -0.1 ± 2.2 |
| bvh.fnr.Fenrir 0.36l | 74.8% ± 2.4 | 76.9% ± 1.8 | -2.1 ± 3.3 |
| pa3k.Viper 5.03 | 78.3% ± 2.1 | 79.9% ± 2.1 | -1.6 ± 2.8 |
| apv.NanoLauLectrik 1.0 | 80.3% ± 2.1 | 82.3% ± 1.9 | -2.1 ± 3.2 |
| kinsen.nano.Quarrelet 1.0 | 78.4% ± 2.3 | 77.3% ± 2.5 | +1.1 ± 4.0 |
| exauge.GateKeeper 1.1.121g | 78.1% ± 1.8 | 78.7% ± 1.4 | -0.6 ± 1.9 |
| robar.nano.MosquitoPM 1.0 | 83.9% ± 1.5 | 84.2% ± 1.6 | -0.3 ± 1.8 |
| nz.jdc.nano.AralR 1.1 | 90.0% ± 0.9 | 90.5% ± 0.6 | -0.4 ± 1.1 |
| eat.HumblePieLite 1.0 | 92.2% ± 0.9 | 89.4% ± 5.6 | +2.7 ± 5.2 |
| ne.Chimera 1.2 | 97.7% ± 1.3 | 98.4% ± 0.5 | -0.6 ± 1.5 |
| robar.nano.Scytodes 0.3 | 94.2% ± 0.7 | 94.3% ± 0.6 | -0.1 ± 0.9 |
| gh.nano.Grofvuil 0.2 | 98.3% ± 0.3 | 98.4% ± 0.3 | -0.1 ± 0.3 |
| sadoner.killer 0.2 | 85.7% ± 1.7 | 85.9% ± 2.1 | -0.1 ± 2.8 |
| exauge.Leopard 1.1.019 | 82.6% ± 1.0 | 83.6% ± 0.9 | -1.0 ± 1.4 |
| rapture.Rapture 2.13 | 97.8% ± 0.4 | 96.6% ± 1.3 | +1.1 ± 1.5 |
| pez.nano.Icarus 0.3 | 97.2% ± 0.6 | 96.9% ± 0.6 | +0.3 ± 0.8 |
| repositorio.NanoStep 1.0 | 97.8% ± 0.9 | 96.0% ± 1.2 | +1.8 ± 1.5 |
| dggp.haiku.gpBot_0 1.1 | 94.9% ± 0.6 | 92.3% ± 2.0 | +2.6 ± 1.8 |
| jeremyreeder.Bully 1 | 94.5% ± 1.6 | 95.8% ± 0.5 | -1.3 ± 1.8 |
| fowl3628800.SitAndGo 1.0.0 | 99.2% ± 0.4 | 99.2% ± 0.2 | -0.0 ± 0.4 |
| ntw.Sighup 1.5 | 91.1% ± 1.3 | 89.8% ± 1.3 | +1.3 ± 2.1 |
| yk.JahMicro 1.0 | 93.2% ± 0.9 | 91.8% ± 1.4 | +1.4 ± 1.4 |
| ola.Puffin 1.0 | 97.8% ± 0.6 | 96.9% ± 0.6 | +0.9 ± 0.7 |
| gwah.GBotMarkIV 1.0 | 99.2% ± 0.4 | 99.1% ± 0.6 | +0.1 ± 0.5 |
| jgap.JGAP7247_2 1.0 | 96.0% ± 0.7 | 96.1% ± 0.4 | -0.0 ± 0.8 |
| RobotMarco.MarcoV 0.1 | 99.9% ± 0.1 | 99.5% ± 0.6 | +0.4 ± 0.6 |
| japs.Serenity 1.0 | 98.8% ± 0.5 | 99.6% ± 0.2 | -0.8 ± 0.5 |
| sample.Target 1.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| ags.Midboss 1q.fast | -2.5 ± 3.7 | -3.6 ± 4.9 | -3.6 ± 4.9 | -1.2 ± 2.9 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | -1.0 ± 3.8 | -2.1 ± 5.4 | -2.1 ± 5.4 | +0.3 ± 2.4 |
| cw.megas.Silhouette 1.1 | -1.0 ± 3.9 | -0.7 ± 5.7 | -0.7 ± 5.7 | -1.2 ± 2.6 |
| kc.micro.Needle 0.101 | +1.3 ± 2.9 | +1.3 ± 3.3 | +1.3 ± 3.3 | +1.2 ± 2.6 |
| nat.Hikari dev0001 | -0.1 ± 2.2 | -0.4 ± 2.8 | -0.4 ± 2.8 | +0.3 ± 2.3 |
| bvh.fnr.Fenrir 0.36l | -2.1 ± 3.3 | -2.0 ± 4.4 | -2.0 ± 4.4 | -2.1 ± 2.8 |
| pa3k.Viper 5.03 | -1.6 ± 2.8 | -2.3 ± 3.9 | -2.3 ± 3.9 | -0.8 ± 2.1 |
| apv.NanoLauLectrik 1.0 | -2.1 ± 3.2 | -1.6 ± 2.4 | -1.6 ± 2.4 | -2.2 ± 4.3 |
| kinsen.nano.Quarrelet 1.0 | +1.1 ± 4.0 | +1.6 ± 3.6 | +1.6 ± 3.6 | -0.1 ± 4.1 |
| exauge.GateKeeper 1.1.121g | -0.6 ± 1.9 | -0.9 ± 2.4 | -0.9 ± 2.4 | +0.0 ± 2.4 |
| robar.nano.MosquitoPM 1.0 | -0.3 ± 1.8 | -0.7 ± 2.5 | -0.7 ± 2.5 | +0.3 ± 1.9 |
| nz.jdc.nano.AralR 1.1 | -0.4 ± 1.1 | +0.0 ± 1.1 | +0.0 ± 1.1 | -0.7 ± 1.4 |
| eat.HumblePieLite 1.0 | +2.7 ± 5.2 | +1.6 ± 3.9 | +1.6 ± 3.9 | +3.5 ± 6.3 |
| ne.Chimera 1.2 | -0.6 ± 1.5 | -0.5 ± 0.6 | -0.5 ± 0.6 | +1.2 ± 15.5 |
| robar.nano.Scytodes 0.3 | -0.1 ± 0.9 | +0.5 ± 0.6 | +0.5 ± 0.6 | -0.6 ± 1.3 |
| gh.nano.Grofvuil 0.2 | -0.1 ± 0.3 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.2 ± 0.6 |
| sadoner.killer 0.2 | -0.1 ± 2.8 | +0.0 ± 2.6 | +0.0 ± 2.6 | -0.1 ± 3.2 |
| exauge.Leopard 1.1.019 | -1.0 ± 1.4 | -0.2 ± 0.4 | -0.2 ± 0.4 | -0.6 ± 1.8 |
| rapture.Rapture 2.13 | +1.1 ± 1.5 | +0.9 ± 1.7 | +0.9 ± 1.7 | +1.4 ± 1.8 |
| pez.nano.Icarus 0.3 | +0.3 ± 0.8 | +0.0 ± 0.8 | +0.0 ± 0.8 | +0.8 ± 1.1 |
| repositorio.NanoStep 1.0 | +1.8 ± 1.5 | -0.2 ± 0.4 | -0.2 ± 0.4 | +3.6 ± 2.6 |
| dggp.haiku.gpBot_0 1.1 | +2.6 ± 1.8 | +1.1 ± 1.1 | +1.1 ± 1.1 | +4.1 ± 2.7 |
| jeremyreeder.Bully 1 | -1.3 ± 1.8 | -0.5 ± 1.0 | -0.5 ± 1.0 | -0.7 ± 1.8 |
| fowl3628800.SitAndGo 1.0.0 | -0.0 ± 0.4 | -0.2 ± 0.4 | -0.2 ± 0.4 | +0.2 ± 0.4 |
| ntw.Sighup 1.5 | +1.3 ± 2.1 | +1.1 ± 1.5 | +1.1 ± 1.5 | +1.8 ± 2.6 |
| yk.JahMicro 1.0 | +1.4 ± 1.4 | +3.6 ± 2.6 | +3.6 ± 2.6 | +0.1 ± 1.4 |
| ola.Puffin 1.0 | +0.9 ± 0.7 | -0.2 ± 0.4 | -0.2 ± 0.4 | +1.8 ± 1.1 |
| gwah.GBotMarkIV 1.0 | +0.1 ± 0.5 | +0.2 ± 0.4 | +0.2 ± 0.4 | -0.1 ± 0.7 |
| jgap.JGAP7247_2 1.0 | -0.0 ± 0.8 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.0 ± 1.4 |
| RobotMarco.MarcoV 0.1 | +0.4 ± 0.6 | +0.2 ± 0.4 | +0.2 ± 0.4 | +0.6 ± 0.8 |
| japs.Serenity 1.0 | -0.8 ± 0.5 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 |
| sample.Target 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 |
| All pairs | -0.0 ± 0.4 | -0.1 ± 0.4 | -0.1 ± 0.4 | +0.3 ± 0.6 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| ags.Midboss 1q.fast | 16 | 10 | -2.5 ± 3.7 | -1.2 ± 4.8 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 16 | 5 | -1.0 ± 3.8 | -3.6 ± 12.3 |
| cw.megas.Silhouette 1.1 | 16 | 10 | -1.0 ± 3.9 | -2.4 ± 4.1 |
| kc.micro.Needle 0.101 | 16 | 11 | +1.3 ± 2.9 | +1.0 ± 4.0 |
| nat.Hikari dev0001 | 16 | 14 | -0.1 ± 2.2 | -0.1 ± 2.4 |
| bvh.fnr.Fenrir 0.36l | 16 | 11 | -2.1 ± 3.3 | -1.6 ± 4.8 |
| pa3k.Viper 5.03 | 16 | 10 | -1.6 ± 2.8 | -0.8 ± 4.1 |
| apv.NanoLauLectrik 1.0 | 16 | 12 | -2.1 ± 3.2 | -2.3 ± 3.4 |
| kinsen.nano.Quarrelet 1.0 | 16 | 14 | +1.1 ± 4.0 | +1.4 ± 4.6 |
| exauge.GateKeeper 1.1.121g | 16 | 12 | -0.6 ± 1.9 | -1.2 ± 2.4 |
| robar.nano.MosquitoPM 1.0 | 16 | 11 | -0.3 ± 1.8 | -0.8 ± 2.1 |
| nz.jdc.nano.AralR 1.1 | 16 | 12 | -0.4 ± 1.1 | -0.6 ± 1.4 |
| eat.HumblePieLite 1.0 | 16 | 12 | +2.7 ± 5.2 | +0.3 ± 1.3 |
| ne.Chimera 1.2 | 16 | 10 | -0.6 ± 1.5 | -0.2 ± 1.8 |
| robar.nano.Scytodes 0.3 | 16 | 11 | -0.1 ± 0.9 | -0.8 ± 0.8 |
| gh.nano.Grofvuil 0.2 | 16 | 10 | -0.1 ± 0.3 | -0.1 ± 0.5 |
| sadoner.killer 0.2 | 16 | 12 | -0.1 ± 2.8 | +0.2 ± 3.7 |
| exauge.Leopard 1.1.019 | 16 | 15 | -1.0 ± 1.4 | -0.6 ± 1.3 |
| rapture.Rapture 2.13 | 16 | 13 | +1.1 ± 1.5 | +1.0 ± 1.8 |
| pez.nano.Icarus 0.3 | 16 | 14 | +0.3 ± 0.8 | +0.4 ± 0.7 |
| repositorio.NanoStep 1.0 | 16 | 15 | +1.8 ± 1.5 | +1.5 ± 1.5 |
| dggp.haiku.gpBot_0 1.1 | 16 | 12 | +2.6 ± 1.8 | +1.6 ± 1.4 |
| jeremyreeder.Bully 1 | 16 | 11 | -1.3 ± 1.8 | -0.6 ± 1.5 |
| fowl3628800.SitAndGo 1.0.0 | 16 | 12 | -0.0 ± 0.4 | +0.1 ± 0.2 |
| ntw.Sighup 1.5 | 16 | 11 | +1.3 ± 2.1 | -0.2 ± 1.9 |
| yk.JahMicro 1.0 | 16 | 11 | +1.4 ± 1.4 | +0.6 ± 1.5 |
| ola.Puffin 1.0 | 16 | 14 | +0.9 ± 0.7 | +1.1 ± 0.6 |
| gwah.GBotMarkIV 1.0 | 16 | 13 | +0.1 ± 0.5 | +0.2 ± 0.5 |
| jgap.JGAP7247_2 1.0 | 16 | 7 | -0.0 ± 0.8 | +0.4 ± 1.3 |
| RobotMarco.MarcoV 0.1 | 16 | 11 | +0.4 ± 0.6 | +0.4 ± 0.8 |
| japs.Serenity 1.0 | 16 | 14 | -0.8 ± 0.5 | -0.7 ± 0.5 |
| sample.Target 1.0 | 16 | 15 | +0.0 ± 0.0 | +0.0 ± 0.0 |
| All pairs | 512 | 375 | -0.0 ± 0.4 | -0.1 ± 0.4 |

# Bench: hadur2.Hadur 3.9 baseline (hadur2.Hadur 3.8.5) (cold)

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 5842 over 512 battles (11.4 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | mid | 72.2% ± 2.6 | 85.5% ± 3.9 | 59.6% ± 1.7 | 479 / 560 | 13.6% ± 0.3 | 8.8% ± 0.3 | 386 | 0 | 1.40 / 44.9 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | mid | 63.5% ± 2.7 | 79.3% ± 3.6 | 47.6% ± 1.8 | 444 / 560 | 10.6% ± 0.3 | 7.6% ± 0.4 | 205 | 0 | 1.03 / 14.1 |
| cw.megas.Silhouette 1.1 | mid | 72.9% ± 2.4 | 86.6% ± 3.0 | 60.3% ± 2.1 | 485 / 560 | 15.1% ± 0.6 | 7.9% ± 0.5 | 171 | 0 | 1.02 / 18.5 |
| kc.micro.Needle 0.101 | mid | 76.5% ± 1.3 | 90.7% ± 1.6 | 61.9% ± 1.2 | 508 / 560 | 14.2% ± 0.5 | 6.7% ± 0.3 | 161 | 0 | 1.14 / 18.4 |
| nat.Hikari dev0001 | lower | 82.8% ± 2.1 | 95.7% ± 2.0 | 69.6% ± 2.2 | 536 / 560 | 15.3% ± 0.5 | 6.2% ± 0.4 | 166 | 0 | 0.95 / 16.2 |
| bvh.fnr.Fenrir 0.36l | lower | 76.9% ± 1.8 | 90.9% ± 3.0 | 63.4% ± 1.4 | 509 / 560 | 14.6% ± 0.5 | 7.1% ± 0.4 | 242 | 0 | 1.03 / 25.1 |
| pa3k.Viper 5.03 | lower | 79.9% ± 2.1 | 89.5% ± 2.8 | 70.7% ± 1.9 | 501 / 560 | 16.6% ± 0.5 | 7.5% ± 0.8 | 170 | 0 | 1.06 / 18.7 |
| apv.NanoLauLectrik 1.0 | lower | 82.3% ± 1.9 | 96.3% ± 1.3 | 66.9% ± 2.9 | 539 / 560 | 16.1% ± 0.7 | 5.2% ± 0.5 | 182 | 0 | 1.02 / 17.5 |
| kinsen.nano.Quarrelet 1.0 | lower | 77.3% ± 2.5 | 92.1% ± 2.8 | 61.5% ± 2.3 | 516 / 560 | 15.6% ± 0.6 | 6.0% ± 0.6 | 184 | 0 | 0.95 / 17.2 |
| exauge.GateKeeper 1.1.121g | lower | 78.7% ± 1.4 | 94.5% ± 1.6 | 62.3% ± 1.8 | 529 / 560 | 14.3% ± 0.5 | 6.7% ± 0.4 | 151 | 0 | 0.91 / 17.8 |
| robar.nano.MosquitoPM 1.0 | lower | 84.2% ± 1.6 | 97.0% ± 1.8 | 71.0% ± 1.9 | 543 / 560 | 18.2% ± 0.4 | 6.4% ± 0.8 | 184 | 0 | 0.93 / 17.8 |
| nz.jdc.nano.AralR 1.1 | lower | 90.5% ± 0.6 | 99.1% ± 0.7 | 82.8% ± 1.0 | 555 / 560 | 21.5% ± 0.4 | 8.6% ± 0.7 | 188 | 0 | 0.82 / 15.2 |
| eat.HumblePieLite 1.0 | lower | 89.4% ± 5.6 | 98.2% ± 3.8 | 82.1% ± 6.9 | 550 / 560 | 36.1% ± 2.9 | 7.5% ± 0.9 | 171 | 0 | 0.73 / 22.6 |
| ne.Chimera 1.2 | lower | 98.4% ± 0.5 | 100.0% ± 0.0 | 63.7% ± 9.0 | 560 / 560 | 0.6% ± 0.1 | 0.3% ± 0.1 | 106 | 0 | 0.79 / 17.7 |
| robar.nano.Scytodes 0.3 | weak | 94.3% ± 0.6 | 99.5% ± 0.6 | 89.7% ± 0.9 | 557 / 560 | 50.5% ± 0.8 | 6.2% ± 1.6 | 194 | 0 | 0.79 / 14.1 |
| gh.nano.Grofvuil 0.2 | weak | 98.4% ± 0.3 | 100.0% ± 0.0 | 96.9% ± 0.6 | 560 / 560 | 41.3% ± 0.8 | 1.7% ± 0.4 | 173 | 0 | 0.66 / 135.0 |
| sadoner.killer 0.2 | weak | 85.9% ± 2.1 | 95.7% ± 2.0 | 76.8% ± 2.3 | 536 / 560 | 20.9% ± 0.6 | 8.5% ± 2.1 | 172 | 0 | 0.77 / 14.5 |
| exauge.Leopard 1.1.019 | weak | 83.6% ± 0.9 | 99.8% ± 0.4 | 74.5% ± 1.0 | 559 / 560 | 79.8% ± 0.9 | 37.7% ± 2.3 | 167 | 0 | 0.60 / 13.9 |
| rapture.Rapture 2.13 | weak | 96.6% ± 1.3 | 98.8% ± 1.6 | 94.5% ± 1.4 | 553 / 560 | 21.7% ± 0.6 | 3.6% ± 1.2 | 176 | 0 | 0.94 / 18.8 |
| pez.nano.Icarus 0.3 | weak | 96.9% ± 0.6 | 99.6% ± 0.5 | 93.1% ± 1.1 | 558 / 560 | 16.7% ± 0.7 | 1.4% ± 0.3 | 176 | 0 | 0.64 / 20.1 |
| repositorio.NanoStep 1.0 | weak | 96.0% ± 1.2 | 99.8% ± 0.4 | 92.6% ± 2.2 | 559 / 560 | 27.6% ± 0.7 | 3.7% ± 1.1 | 175 | 0 | 0.70 / 14.0 |
| dggp.haiku.gpBot_0 1.1 | weak | 92.3% ± 2.0 | 98.9% ± 1.1 | 85.5% ± 3.2 | 554 / 560 | 25.0% ± 1.3 | 4.2% ± 1.0 | 174 | 0 | 0.77 / 16.0 |
| jeremyreeder.Bully 1 | weak | 95.8% ± 0.5 | 99.8% ± 0.4 | 93.4% ± 0.7 | 559 / 560 | 81.4% ± 0.6 | 6.8% ± 1.9 | 170 | 0 | 0.55 / 10.9 |
| fowl3628800.SitAndGo 1.0.0 | weak | 99.2% ± 0.2 | 100.0% ± 0.0 | 98.4% ± 0.3 | 560 / 560 | 33.2% ± 1.6 | 2.0% ± 0.9 | 184 | 0 | 0.74 / 12.7 |
| ntw.Sighup 1.5 | weak | 89.8% ± 1.3 | 98.6% ± 1.4 | 81.6% ± 1.4 | 552 / 560 | 27.5% ± 0.9 | 8.5% ± 2.6 | 184 | 0 | 0.79 / 15.9 |
| yk.JahMicro 1.0 | weak | 91.8% ± 1.4 | 94.6% ± 2.6 | 88.7% ± 1.2 | 530 / 560 | 19.6% ± 0.5 | 7.9% ± 0.7 | 177 | 0 | 0.78 / 17.7 |
| ola.Puffin 1.0 | weak | 96.9% ± 0.6 | 100.0% ± 0.0 | 94.6% ± 1.0 | 560 / 560 | 50.5% ± 2.0 | 8.8% ± 1.6 | 177 | 0 | 0.75 / 13.0 |
| gwah.GBotMarkIV 1.0 | weak | 99.1% ± 0.6 | 99.6% ± 0.5 | 98.6% ± 0.7 | 558 / 560 | 75.4% ± 1.1 | 1.0% ± 0.4 | 179 | 0 | 0.53 / 11.0 |
| jgap.JGAP7247_2 1.0 | weak | 96.1% ± 0.4 | 100.0% ± 0.0 | 92.1% ± 0.9 | 560 / 560 | 38.8% ± 1.1 | 4.0% ± 1.1 | 187 | 0 | 0.71 / 14.2 |
| RobotMarco.MarcoV 0.1 | weak | 99.5% ± 0.6 | 99.8% ± 0.4 | 99.2% ± 0.8 | 559 / 560 | 39.4% ± 2.0 | 1.5% ± 1.4 | 172 | 0 | 0.63 / 10.5 |
| japs.Serenity 1.0 | weak | 99.6% ± 0.2 | 100.0% ± 0.0 | 100.0% ± 0.0 | 560 / 560 | 31.7% ± 1.1 | 0.0% ± 0.0 | 181 | 0 | 0.66 / 14.0 |
| sample.Target 1.0 | weak | 100.0% ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | 560 / 560 | 50.5% ± 0.9 | 0.0% ± 0.0 | 157 | 0 | 0.50 / 10.1 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 16 | 11 | 517 | 0 | 0.69 | 3 | 3 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 16 | 13 | 298 | 0 | 0.37 | 2 | 2 | 0 |
| cw.megas.Silhouette 1.1 | 16 | 12 | 298 | 0 | 0.31 | 3 | 3 | 0 |
| kc.micro.Needle 0.101 | 16 | 14 | 0 | 0 | 0.29 | 2 | 2 | 0 |
| nat.Hikari dev0001 | 16 | 16 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| bvh.fnr.Fenrir 0.36l | 16 | 15 | 0 | 0 | 0.43 | 1 | 0 | 0 |
| pa3k.Viper 5.03 | 16 | 13 | 298 | 0 | 0.30 | 2 | 2 | 0 |
| apv.NanoLauLectrik 1.0 | 16 | 16 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| kinsen.nano.Quarrelet 1.0 | 16 | 15 | 298 | 0 | 0.33 | 0 | 0 | 0 |
| exauge.GateKeeper 1.1.121g | 16 | 13 | 298 | 0 | 0.27 | 2 | 2 | 0 |
| robar.nano.MosquitoPM 1.0 | 16 | 12 | 932 | 0 | 0.33 | 1 | 1 | 0 |
| nz.jdc.nano.AralR 1.1 | 16 | 14 | 596 | 0 | 0.34 | 0 | 0 | 0 |
| eat.HumblePieLite 1.0 | 16 | 14 | 298 | 0 | 0.31 | 1 | 1 | 0 |
| ne.Chimera 1.2 | 16 | 13 | 894 | 0 | 0.19 | 0 | 0 | 16 |
| robar.nano.Scytodes 0.3 | 16 | 11 | 1464 | 0 | 0.35 | 0 | 0 | 0 |
| gh.nano.Grofvuil 0.2 | 16 | 11 | 1490 | 0 | 0.31 | 0 | 0 | 0 |
| sadoner.killer 0.2 | 16 | 14 | 472 | 0 | 0.31 | 1 | 1 | 0 |
| exauge.Leopard 1.1.019 | 16 | 16 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| rapture.Rapture 2.13 | 16 | 14 | 298 | 0 | 0.31 | 1 | 0 | 0 |
| pez.nano.Icarus 0.3 | 16 | 16 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| repositorio.NanoStep 1.0 | 16 | 15 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| dggp.haiku.gpBot_0 1.1 | 16 | 13 | 894 | 0 | 0.31 | 0 | 0 | 0 |
| jeremyreeder.Bully 1 | 16 | 15 | 205 | 0 | 0.30 | 0 | 0 | 0 |
| fowl3628800.SitAndGo 1.0.0 | 16 | 13 | 894 | 0 | 0.33 | 0 | 0 | 0 |
| ntw.Sighup 1.5 | 16 | 13 | 890 | 0 | 0.33 | 0 | 0 | 0 |
| yk.JahMicro 1.0 | 16 | 12 | 894 | 0 | 0.32 | 1 | 1 | 0 |
| ola.Puffin 1.0 | 16 | 16 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| gwah.GBotMarkIV 1.0 | 16 | 15 | 252 | 0 | 0.32 | 0 | 0 | 0 |
| jgap.JGAP7247_2 1.0 | 16 | 10 | 1456 | 0 | 0.33 | 0 | 0 | 0 |
| RobotMarco.MarcoV 0.1 | 16 | 15 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| japs.Serenity 1.0 | 16 | 16 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| sample.Target 1.0 | 16 | 16 | 0 | 0 | 0.28 | 0 | 0 | 0 |

442 of 512 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 30906 | 101 | 30865 | 30864 (99.9%) | 42 (0.1%) | 1 (0.0%) | 1680 | 484 | 284 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 28222 | 191 | 28201 | 28201 (99.9%) | 21 (0.1%) | 0 (0.0%) | 1460 | 311 | 121 |
| cw.megas.Silhouette 1.1 | 17857 | 38 | 17838 | 17838 (99.9%) | 19 (0.1%) | 0 (0.0%) | 609 | 248 | 65 |
| kc.micro.Needle 0.101 | 22566 | 31 | 22575 | 22564 (100.0%) | 2 (0.0%) | 11 (0.0%) | 1189 | 322 | 47 |
| nat.Hikari dev0001 | 19068 | 36 | 19073 | 19064 (100.0%) | 4 (0.0%) | 9 (0.0%) | 493 | 296 | 55 |
| bvh.fnr.Fenrir 0.36l | 19022 | 140 | 19036 | 19020 (100.0%) | 2 (0.0%) | 16 (0.1%) | 738 | 260 | 141 |
| pa3k.Viper 5.03 | 18407 | 34 | 18395 | 18386 (99.9%) | 21 (0.1%) | 9 (0.0%) | 1261 | 258 | 48 |
| apv.NanoLauLectrik 1.0 | 12314 | 30 | 12345 | 12307 (99.9%) | 7 (0.1%) | 38 (0.3%) | 1156 | 242 | 65 |
| kinsen.nano.Quarrelet 1.0 | 12854 | 37 | 12982 | 12817 (99.7%) | 37 (0.3%) | 165 (1.3%) | 1659 | 272 | 53 |
| exauge.GateKeeper 1.1.121g | 15135 | 12 | 15197 | 15088 (99.7%) | 47 (0.3%) | 109 (0.7%) | 2009 | 298 | 53 |
| robar.nano.MosquitoPM 1.0 | 12883 | 35 | 12861 | 12810 (99.4%) | 73 (0.6%) | 51 (0.4%) | 1615 | 286 | 57 |
| nz.jdc.nano.AralR 1.1 | 14563 | 53 | 14593 | 14481 (99.4%) | 82 (0.6%) | 112 (0.8%) | 944 | 297 | 43 |
| eat.HumblePieLite 1.0 | 7069 | 56 | 7052 | 7052 (99.8%) | 17 (0.2%) | 0 (0.0%) | 26 | 173 | 50 |
| ne.Chimera 1.2 | 490 | 2 | 435 | 435 (88.8%) | 55 (11.2%) | 0 (0.0%) | 16 | 10 | 38 |
| robar.nano.Scytodes 0.3 | 5144 | 34 | 5092 | 5053 (98.2%) | 91 (1.8%) | 39 (0.8%) | 157 | 167 | 44 |
| gh.nano.Grofvuil 0.2 | 7326 | 44 | 7250 | 7232 (98.7%) | 94 (1.3%) | 18 (0.2%) | 205 | 212 | 37 |
| sadoner.killer 0.2 | 11859 | 39 | 11830 | 11829 (99.7%) | 30 (0.3%) | 1 (0.0%) | 142 | 200 | 48 |
| exauge.Leopard 1.1.019 | 4349 | 32 | 4352 | 4348 (100.0%) | 1 (0.0%) | 4 (0.1%) | 544 | 426 | 41 |
| rapture.Rapture 2.13 | 16594 | 46 | 16572 | 16571 (99.9%) | 23 (0.1%) | 1 (0.0%) | 301 | 252 | 43 |
| pez.nano.Icarus 0.3 | 14812 | 42 | 14818 | 14780 (99.8%) | 32 (0.2%) | 38 (0.3%) | 1322 | 238 | 37 |
| repositorio.NanoStep 1.0 | 10814 | 64 | 10773 | 10770 (99.6%) | 44 (0.4%) | 3 (0.0%) | 330 | 231 | 470 |
| dggp.haiku.gpBot_0 1.1 | 7992 | 31 | 7946 | 7941 (99.4%) | 51 (0.6%) | 5 (0.1%) | 1047 | 220 | 52 |
| jeremyreeder.Bully 1 | 3337 | 18 | 3327 | 3327 (99.7%) | 10 (0.3%) | 0 (0.0%) | 416 | 154 | 45 |
| fowl3628800.SitAndGo 1.0.0 | 10152 | 46 | 10088 | 9924 (97.8%) | 228 (2.2%) | 164 (1.6%) | 2434 | 259 | 48 |
| ntw.Sighup 1.5 | 9152 | 65 | 9100 | 9059 (99.0%) | 93 (1.0%) | 41 (0.5%) | 2247 | 287 | 47 |
| yk.JahMicro 1.0 | 13984 | 19 | 14011 | 13940 (99.7%) | 44 (0.3%) | 71 (0.5%) | 1021 | 238 | 57 |
| ola.Puffin 1.0 | 6962 | 39 | 6958 | 6952 (99.9%) | 10 (0.1%) | 6 (0.1%) | 115 | 264 | 214 |
| gwah.GBotMarkIV 1.0 | 3793 | 14 | 3763 | 3761 (99.2%) | 32 (0.8%) | 2 (0.1%) | 102 | 108 | 340 |
| jgap.JGAP7247_2 1.0 | 4905 | 26 | 5078 | 4823 (98.3%) | 82 (1.7%) | 255 (5.0%) | 2550 | 240 | 53 |
| RobotMarco.MarcoV 0.1 | 1832 | 10 | 1828 | 1827 (99.7%) | 5 (0.3%) | 1 (0.1%) | 3 | 50 | 83 |
| japs.Serenity 1.0 | 0 | 0 | 57 | - | - | 57 (100.0%) | 801 | 0 | 48 |
| sample.Target 1.0 | 0 | 0 | 0 | - | - | - | 221 | 0 | 34 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ags.Midboss 1q.fast | 31534 | 2900 (9.2%) | 26367 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 30929 | 2795 (9.0%) | 23671 |
| cw.megas.Silhouette 1.1 | 19253 | 1579 (8.2%) | 13533 |
| kc.micro.Needle 0.101 | 25922 | 2043 (7.9%) | 22934 |
| nat.Hikari dev0001 | 19393 | 2000 (10.3%) | 15749 |
| bvh.fnr.Fenrir 0.36l | 22651 | 1539 (6.8%) | 11102 |
| pa3k.Viper 5.03 | 22349 | 1514 (6.8%) | 10682 |
| apv.NanoLauLectrik 1.0 | 14460 | 1016 (7.0%) | 4661 |
| kinsen.nano.Quarrelet 1.0 | 15217 | 911 (6.0%) | 4130 |
| exauge.GateKeeper 1.1.121g | 19279 | 997 (5.2%) | 5875 |
| robar.nano.MosquitoPM 1.0 | 13896 | 873 (6.3%) | 6178 |
| nz.jdc.nano.AralR 1.1 | 12970 | 1099 (8.5%) | 7033 |
| eat.HumblePieLite 1.0 | 6869 | 302 (4.4%) | 163 |
| ne.Chimera 1.2 | 562 | 36 (6.4%) | 29 |
| robar.nano.Scytodes 0.3 | 5538 | 394 (7.1%) | 576 |
| gh.nano.Grofvuil 0.2 | 6872 | 611 (8.9%) | 1522 |
| sadoner.killer 0.2 | 11682 | 876 (7.5%) | 4413 |
| exauge.Leopard 1.1.019 | 4256 | 97 (2.3%) | 0 |
| rapture.Rapture 2.13 | 14712 | 971 (6.6%) | 8444 |
| pez.nano.Icarus 0.3 | 14724 | 1074 (7.3%) | 5661 |
| repositorio.NanoStep 1.0 | 9549 | 597 (6.3%) | 2247 |
| dggp.haiku.gpBot_0 1.1 | 9096 | 464 (5.1%) | 984 |
| jeremyreeder.Bully 1 | 3541 | 17 (0.5%) | 0 |
| fowl3628800.SitAndGo 1.0.0 | 8887 | 489 (5.5%) | 1658 |
| ntw.Sighup 1.5 | 9917 | 438 (4.4%) | 245 |
| yk.JahMicro 1.0 | 19791 | 1235 (6.2%) | 6905 |
| ola.Puffin 1.0 | 6715 | 540 (8.0%) | 2169 |
| gwah.GBotMarkIV 1.0 | 3837 | 87 (2.3%) | 0 |
| jgap.JGAP7247_2 1.0 | 6592 | 273 (4.1%) | 0 |
| RobotMarco.MarcoV 0.1 | 9042 | 96 (1.1%) | 0 |
| japs.Serenity 1.0 | 17303 | 0 (0.0%) | 0 |
| sample.Target 1.0 | 11078 | 0 (0.0%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 650 | 410 | 650 | 755 | 42.9 / 29.1 | 1950 | 9486 | 1659 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 650 | 466 | 650 | 730 | 29.8 / 32.8 | 596 | 16272 | 3583 |
| cw.megas.Silhouette 1.1 | 650 | 401 | 575 | 507 | 44.2 / 29.2 | 3842 | 7674 | 5084 |
| kc.micro.Needle 0.101 | 650 | 424 | 491 | 638 | 40.9 / 25.2 | 1654 | 5976 | 4 |
| nat.Hikari dev0001 | 650 | 414 | 614 | 506 | 47.3 / 20.8 | 4173 | 8045 | 5185 |
| bvh.fnr.Fenrir 0.36l | 650 | 484 | 625 | 566 | 44.5 / 25.6 | 2289 | 8839 | 104 |
| pa3k.Viper 5.03 | 650 | 441 | 491 | 576 | 52.6 / 21.9 | 5874 | 7802 | 50 |
| apv.NanoLauLectrik 1.0 | 650 | 457 | 469 | 385 | 40.6 / 20.2 | 3114 | 11733 | 6235 |
| kinsen.nano.Quarrelet 1.0 | 650 | 484 | 536 | 401 | 38.1 / 24.0 | 2920 | 11513 | 7903 |
| exauge.GateKeeper 1.1.121g | 650 | 514 | 614 | 491 | 40.1 / 24.3 | 2373 | 7269 | 2979 |
| robar.nano.MosquitoPM 1.0 | 650 | 464 | 441 | 379 | 47.0 / 19.2 | 4819 | 10018 | 5036 |
| nz.jdc.nano.AralR 1.1 | 650 | 332 | 431 | 380 | 69.0 / 14.4 | 8309 | 9127 | 2162 |
| eat.HumblePieLite 1.0 | 650 | 492 | 416 | 245 | 72.0 / 15.4 | 5086 | 6789 | 366 |
| ne.Chimera 1.2 | 650 | 385 | 650 | 15 | 1.6 / 1.0 | 5 | 195 | 0 |
| robar.nano.Scytodes 0.3 | 650 | 399 | 400 | 173 | 76.6 / 8.8 | 3695 | 7900 | 1846 |
| gh.nano.Grofvuil 0.2 | 650 | 351 | 400 | 213 | 75.3 / 2.4 | 4655 | 5718 | 19 |
| sadoner.killer 0.2 | 650 | 295 | 442 | 341 | 60.0 / 18.4 | 6658 | 10390 | 20 |
| exauge.Leopard 1.1.019 | 650 | 204 | 503 | 140 | 101.4 / 34.9 | 3653 | 5420 | 27 |
| rapture.Rapture 2.13 | 650 | 406 | 400 | 418 | 73.8 / 4.4 | 9220 | 7987 | 2152 |
| pez.nano.Icarus 0.3 | 650 | 360 | 400 | 403 | 46.0 / 3.4 | 3380 | 11262 | 3671 |
| repositorio.NanoStep 1.0 | 650 | 458 | 400 | 287 | 72.8 / 6.0 | 7066 | 6929 | 397 |
| dggp.haiku.gpBot_0 1.1 | 650 | 440 | 400 | 271 | 57.3 / 9.9 | 6196 | 7951 | 4260 |
| jeremyreeder.Bully 1 | 650 | 212 | 400 | 119 | 84.5 / 6.0 | 2944 | 6334 | 152 |
| fowl3628800.SitAndGo 1.0.0 | 650 | 466 | 400 | 271 | 76.9 / 1.3 | 6975 | 3688 | 570 |
| ntw.Sighup 1.5 | 650 | 380 | 416 | 291 | 59.5 / 13.5 | 6256 | 7639 | 2465 |
| yk.JahMicro 1.0 | 650 | 461 | 419 | 547 | 76.1 / 9.8 | 11368 | 2993 | 115 |
| ola.Puffin 1.0 | 650 | 345 | 400 | 210 | 91.2 / 5.2 | 5078 | 3755 | 430 |
| gwah.GBotMarkIV 1.0 | 650 | 211 | 400 | 130 | 82.0 / 1.2 | 3026 | 4915 | 449 |
| jgap.JGAP7247_2 1.0 | 650 | 433 | 400 | 203 | 66.8 / 5.8 | 4588 | 4943 | 2603 |
| RobotMarco.MarcoV 0.1 | 650 | 428 | 400 | 270 | 90.4 / 0.7 | 5714 | 1390 | 158 |
| japs.Serenity 1.0 | 650 | 517 | 650 | 464 | 97.2 / 0.0 | 2975 | 20 | 530 |
| sample.Target 1.0 | 650 | 503 | 650 | 298 | 99.0 / 0.0 | 0 | 0 | 112 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 8.8% | 386 | 271 | 3 | 54.7 | 2889 / 2900 (100%) | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 7.6% | 205 | 574 | 3 | 50.1 | 2783 / 2795 (100%) | 0 | 0 |
| cw.megas.Silhouette 1.1 | 7.9% | 171 | 468 | 3 | 31.5 | 1577 / 1579 (100%) | 0 | 0 |
| kc.micro.Needle 0.101 | 6.7% | 161 | 8012 | 3 | 40.1 | 2043 / 2043 (100%) | 0 | 0 |
| nat.Hikari dev0001 | 6.2% | 166 | 6801 | 3 | 34.0 | 1998 / 2000 (100%) | 0 | 0 |
| bvh.fnr.Fenrir 0.36l | 7.1% | 242 | 1480 | 3 | 33.9 | 1539 / 1539 (100%) | 0 | 0 |
| pa3k.Viper 5.03 | 7.5% | 170 | 192 | 3 | 32.7 | 1514 / 1514 (100%) | 0 | 0 |
| apv.NanoLauLectrik 1.0 | 5.2% | 182 | 103 | 3 | 22.0 | 1013 / 1016 (100%) | 0 | 0 |
| kinsen.nano.Quarrelet 1.0 | 6.0% | 184 | 1998 | 3 | 23.1 | 908 / 911 (100%) | 0 | 0 |
| exauge.GateKeeper 1.1.121g | 6.7% | 151 | 111 | 3 | 27.0 | 995 / 997 (100%) | 0 | 0 |
| robar.nano.MosquitoPM 1.0 | 6.4% | 184 | 108 | 3 | 22.9 | 868 / 873 (99%) | 0 | 0 |
| nz.jdc.nano.AralR 1.1 | 8.6% | 188 | 1216 | 3 | 26.1 | 1094 / 1099 (100%) | 0 | 0 |
| eat.HumblePieLite 1.0 | 7.5% | 171 | 65 | 3 | 10.7 | 301 / 302 (100%) | 0 | 0 |
| ne.Chimera 1.2 | 0.3% | 106 | 24 | 3 | 0.8 | 32 / 36 (89%) | 0 | 0 |
| robar.nano.Scytodes 0.3 | 6.2% | 194 | 477 | 3 | 9.1 | 389 / 394 (99%) | 0 | 0 |
| gh.nano.Grofvuil 0.2 | 1.7% | 173 | 506 | 3 | 12.9 | 604 / 611 (99%) | 0 | 0 |
| sadoner.killer 0.2 | 8.5% | 172 | 80 | 3 | 20.9 | 876 / 876 (100%) | 0 | 0 |
| exauge.Leopard 1.1.019 | 37.7% | 167 | 43 | 3 | 7.7 | 97 / 97 (100%) | 0 | 0 |
| rapture.Rapture 2.13 | 3.6% | 176 | 84 | 3 | 29.5 | 970 / 971 (100%) | 0 | 0 |
| pez.nano.Icarus 0.3 | 1.4% | 176 | 85 | 3 | 26.5 | 1071 / 1074 (100%) | 0 | 0 |
| repositorio.NanoStep 1.0 | 3.7% | 175 | 932 | 3 | 19.2 | 592 / 597 (99%) | 0 | 0 |
| dggp.haiku.gpBot_0 1.1 | 4.2% | 174 | 563 | 3 | 14.2 | 462 / 464 (100%) | 0 | 0 |
| jeremyreeder.Bully 1 | 6.8% | 170 | 38 | 3 | 5.9 | 17 / 17 (100%) | 0 | 0 |
| fowl3628800.SitAndGo 1.0.0 | 2.0% | 184 | 69 | 3 | 18.0 | 478 / 489 (98%) | 0 | 0 |
| ntw.Sighup 1.5 | 8.5% | 184 | 74 | 3 | 16.2 | 435 / 438 (99%) | 0 | 0 |
| yk.JahMicro 1.0 | 7.9% | 177 | 167 | 3 | 24.9 | 1234 / 1235 (100%) | 0 | 0 |
| ola.Puffin 1.0 | 8.8% | 177 | 51 | 3 | 12.4 | 540 / 540 (100%) | 0 | 0 |
| gwah.GBotMarkIV 1.0 | 1.0% | 179 | 102 | 3 | 6.7 | 86 / 87 (99%) | 0 | 0 |
| jgap.JGAP7247_2 1.0 | 4.0% | 187 | 136 | 3 | 9.1 | 269 / 273 (99%) | 0 | 0 |
| RobotMarco.MarcoV 0.1 | 1.5% | 172 | 64 | 3 | 3.3 | 96 / 96 (100%) | 0 | 0 |
| japs.Serenity 1.0 | 0.0% | 181 | 101 | 3 | 0.1 | - | 0 | 0 |
| sample.Target 1.0 | 0.0% | 157 | 47 | 3 | 0.0 | - | 0 | 0 |

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
| RobotMarco.MarcoV 0.1 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 99.8% ± 0.4 | 99.6% ± 0.4 | -0.2 ± 0.7 |
| RobotMarco.MarcoV 0.1 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 99.5% ± 0.6 | 98.3% ± 1.2 | -1.2 ± 1.4 |
| ags.Midboss 1q.fast | hadur2.Hadur 3.9 | 16 | 80.0% ± 7.8 | 85.4% ± 5.5 | +5.4 ± 9.0 | 54.8% ± 3.1 | 57.8% ± 4.1 | +3.0 ± 3.8 |
| ags.Midboss 1q.fast | hadur2.Hadur 3.8.5 | 16 | 77.5% ± 9.4 | 89.2% ± 7.7 | +11.7 ± 12.8 | 55.9% ± 4.6 | 61.5% ± 4.2 | +5.6 ± 6.5 |
| apv.NanoLauLectrik 1.0 | hadur2.Hadur 3.9 | 16 | 95.0% ± 4.8 | 95.6% ± 3.9 | +0.6 ± 7.1 | 57.5% ± 4.4 | 66.5% ± 4.6 | +9.0 ± 7.1 |
| apv.NanoLauLectrik 1.0 | hadur2.Hadur 3.8.5 | 16 | 96.3% ± 4.3 | 96.9% ± 2.6 | +0.6 ± 4.9 | 63.8% ± 6.5 | 68.3% ± 4.5 | +4.5 ± 7.4 |
| bvh.fnr.Fenrir 0.36l | hadur2.Hadur 3.9 | 16 | 86.3% ± 9.3 | 90.6% ± 6.3 | +4.4 ± 12.0 | 55.2% ± 5.0 | 63.3% ± 3.4 | +8.1 ± 5.0 |
| bvh.fnr.Fenrir 0.36l | hadur2.Hadur 3.8.5 | 16 | 92.5% ± 6.6 | 90.6% ± 4.9 | -1.9 ± 8.1 | 59.8% ± 4.4 | 62.9% ± 3.3 | +3.1 ± 6.0 |
| cw.megas.Silhouette 1.1 | hadur2.Hadur 3.9 | 16 | 82.5% ± 9.4 | 88.5% ± 3.4 | +6.0 ± 9.0 | 54.5% ± 4.5 | 61.1% ± 2.6 | +6.6 ± 5.0 |
| cw.megas.Silhouette 1.1 | hadur2.Hadur 3.8.5 | 16 | 82.5% ± 6.6 | 89.8% ± 2.8 | +7.3 ± 7.6 | 54.7% ± 3.1 | 61.0% ± 3.1 | +6.3 ± 5.2 |
| dggp.haiku.gpBot_0 1.1 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 79.1% ± 3.7 | 90.5% ± 2.8 | +11.4 ± 3.8 |
| dggp.haiku.gpBot_0 1.1 | hadur2.Hadur 3.8.5 | 16 | 97.5% ± 3.6 | 99.4% ± 1.3 | +1.9 ± 4.0 | 80.9% ± 4.8 | 82.9% ± 3.6 | +2.0 ± 5.0 |
| eat.HumblePieLite 1.0 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 99.4% ± 1.3 | -0.6 ± 1.3 | 79.0% ± 3.1 | 82.5% ± 2.9 | +3.5 ± 4.2 |
| eat.HumblePieLite 1.0 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 97.2% ± 5.9 | -2.8 ± 5.9 | 79.5% ± 3.9 | 78.9% ± 10.6 | -0.6 ± 10.5 |
| exauge.GateKeeper 1.1.121g | hadur2.Hadur 3.9 | 16 | 93.8% ± 5.1 | 94.4% ± 4.3 | +0.6 ± 6.6 | 59.7% ± 3.7 | 64.2% ± 4.1 | +4.5 ± 4.7 |
| exauge.GateKeeper 1.1.121g | hadur2.Hadur 3.8.5 | 16 | 96.3% ± 4.3 | 95.5% ± 4.1 | -0.8 ± 5.5 | 58.7% ± 5.5 | 64.5% ± 4.8 | +5.7 ± 6.7 |
| exauge.Leopard 1.1.019 | hadur2.Hadur 3.9 | 16 | 95.0% ± 4.8 | 100.0% ± 0.0 | +5.0 ± 4.8 | 68.1% ± 1.7 | 69.8% ± 1.9 | +1.7 ± 2.7 |
| exauge.Leopard 1.1.019 | hadur2.Hadur 3.8.5 | 16 | 98.8% ± 2.7 | 100.0% ± 0.0 | +1.2 ± 2.7 | 69.9% ± 2.9 | 71.1% ± 1.8 | +1.2 ± 2.9 |
| fowl3628800.SitAndGo 1.0.0 | hadur2.Hadur 3.9 | 16 | 98.8% ± 2.7 | 100.0% ± 0.0 | +1.2 ± 2.7 | 94.3% ± 2.2 | 99.1% ± 0.4 | +4.9 ± 2.1 |
| fowl3628800.SitAndGo 1.0.0 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 94.2% ± 1.6 | 98.7% ± 0.5 | +4.5 ± 1.5 |
| gh.nano.Grofvuil 0.2 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 89.8% ± 2.6 | 98.4% ± 0.9 | +8.6 ± 3.0 |
| gh.nano.Grofvuil 0.2 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 89.1% ± 1.4 | 98.2% ± 1.0 | +9.0 ± 1.7 |
| gwah.GBotMarkIV 1.0 | hadur2.Hadur 3.9 | 16 | 98.8% ± 2.7 | 100.0% ± 0.0 | +1.2 ± 2.7 | 94.9% ± 3.3 | 98.4% ± 0.8 | +3.5 ± 3.4 |
| gwah.GBotMarkIV 1.0 | hadur2.Hadur 3.8.5 | 16 | 97.5% ± 3.6 | 100.0% ± 0.0 | +2.5 ± 3.6 | 94.5% ± 4.0 | 98.9% ± 0.7 | +4.4 ± 3.9 |
| japs.Serenity 1.0 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 |
| japs.Serenity 1.0 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 |
| jeremyreeder.Bully 1 | hadur2.Hadur 3.9 | 16 | 97.5% ± 3.6 | 100.0% ± 0.0 | +2.5 ± 3.6 | 80.9% ± 4.8 | 92.5% ± 2.1 | +11.6 ± 4.9 |
| jeremyreeder.Bully 1 | hadur2.Hadur 3.8.5 | 16 | 98.8% ± 2.7 | 100.0% ± 0.0 | +1.2 ± 2.7 | 85.3% ± 3.3 | 90.5% ± 1.8 | +5.2 ± 3.3 |
| jgap.JGAP7247_2 1.0 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 85.9% ± 6.2 | 95.0% ± 2.2 | +9.1 ± 7.3 |
| jgap.JGAP7247_2 1.0 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 83.4% ± 4.9 | 96.4% ± 1.3 | +13.0 ± 5.0 |
| kc.micro.Needle 0.101 | hadur2.Hadur 3.9 | 16 | 95.0% ± 4.8 | 96.3% ± 3.3 | +1.2 ± 6.7 | 63.8% ± 4.2 | 65.0% ± 2.9 | +1.2 ± 6.2 |
| kc.micro.Needle 0.101 | hadur2.Hadur 3.8.5 | 16 | 88.8% ± 6.7 | 93.7% ± 3.3 | +4.9 ± 7.8 | 66.1% ± 3.4 | 64.1% ± 2.4 | -2.0 ± 4.5 |
| kinsen.nano.Quarrelet 1.0 | hadur2.Hadur 3.9 | 16 | 92.5% ± 6.6 | 95.6% ± 3.4 | +3.1 ± 7.2 | 55.2% ± 3.6 | 59.8% ± 4.5 | +4.6 ± 5.8 |
| kinsen.nano.Quarrelet 1.0 | hadur2.Hadur 3.8.5 | 16 | 92.5% ± 6.6 | 94.4% ± 4.3 | +1.9 ± 6.5 | 59.2% ± 5.6 | 62.0% ± 4.8 | +2.9 ± 7.0 |
| nat.Hikari dev0001 | hadur2.Hadur 3.9 | 16 | 91.3% ± 6.7 | 96.9% ± 3.2 | +5.6 ± 7.0 | 59.3% ± 3.6 | 72.3% ± 2.9 | +13.0 ± 4.6 |
| nat.Hikari dev0001 | hadur2.Hadur 3.8.5 | 16 | 93.8% ± 5.1 | 96.3% ± 3.3 | +2.5 ± 6.0 | 63.5% ± 2.7 | 72.7% ± 3.2 | +9.2 ± 3.6 |
| ne.Chimera 1.2 | hadur2.Hadur 3.9 | 16 | 96.3% ± 4.3 | 100.0% ± 0.0 | +3.7 ± 4.3 | 97.2% ± 4.1 | - | n/a |
| ne.Chimera 1.2 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 98.1% ± 4.0 | - | n/a |
| ntw.Sighup 1.5 | hadur2.Hadur 3.9 | 16 | 98.8% ± 2.7 | 99.4% ± 1.3 | +0.6 ± 3.1 | 77.1% ± 5.0 | 82.9% ± 4.0 | +5.8 ± 7.1 |
| ntw.Sighup 1.5 | hadur2.Hadur 3.8.5 | 16 | 98.8% ± 2.7 | 99.4% ± 1.3 | +0.6 ± 3.1 | 76.0% ± 4.4 | 80.8% ± 2.0 | +4.8 ± 4.8 |
| nz.jdc.nano.AralR 1.1 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 98.8% ± 1.8 | -1.2 ± 1.8 | 79.5% ± 2.7 | 81.1% ± 2.3 | +1.6 ± 2.8 |
| nz.jdc.nano.AralR 1.1 | hadur2.Hadur 3.8.5 | 16 | 97.5% ± 3.6 | 100.0% ± 0.0 | +2.5 ± 3.6 | 79.4% ± 2.6 | 83.2% ± 2.0 | +3.8 ± 3.2 |
| ola.Puffin 1.0 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 93.7% ± 2.2 | 97.8% ± 1.1 | +4.0 ± 2.1 |
| ola.Puffin 1.0 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 93.4% ± 2.6 | 91.9% ± 1.6 | -1.5 ± 3.0 |
| pa3k.Viper 5.03 | hadur2.Hadur 3.9 | 16 | 90.0% ± 6.7 | 85.4% ± 5.5 | -4.6 ± 7.6 | 65.4% ± 4.0 | 69.9% ± 2.3 | +4.6 ± 4.3 |
| pa3k.Viper 5.03 | hadur2.Hadur 3.8.5 | 16 | 93.8% ± 6.4 | 87.2% ± 6.4 | -6.6 ± 9.6 | 67.8% ± 4.0 | 69.6% ± 4.1 | +1.8 ± 6.5 |
| pez.nano.Icarus 0.3 | hadur2.Hadur 3.9 | 16 | 98.8% ± 2.7 | 100.0% ± 0.0 | +1.2 ± 2.7 | 83.5% ± 3.4 | 96.2% ± 2.2 | +12.7 ± 4.5 |
| pez.nano.Icarus 0.3 | hadur2.Hadur 3.8.5 | 16 | 97.5% ± 3.6 | 100.0% ± 0.0 | +2.5 ± 3.6 | 81.4% ± 3.5 | 95.6% ± 1.4 | +14.3 ± 3.6 |
| rapture.Rapture 2.13 | hadur2.Hadur 3.9 | 16 | 98.8% ± 2.7 | 99.4% ± 1.3 | +0.6 ± 3.1 | 91.3% ± 2.6 | 96.5% ± 0.9 | +5.2 ± 2.6 |
| rapture.Rapture 2.13 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 98.8% ± 1.8 | -1.2 ± 1.8 | 90.4% ± 2.3 | 94.0% ± 1.8 | +3.6 ± 2.8 |
| repositorio.NanoStep 1.0 | hadur2.Hadur 3.9 | 16 | 97.5% ± 3.6 | 99.4% ± 1.3 | +1.9 ± 4.0 | 96.5% ± 3.0 | 96.7% ± 1.8 | +0.2 ± 3.4 |
| repositorio.NanoStep 1.0 | hadur2.Hadur 3.8.5 | 16 | 98.8% ± 2.7 | 100.0% ± 0.0 | +1.2 ± 2.7 | 95.7% ± 3.2 | 90.7% ± 3.1 | -5.0 ± 3.7 |
| robar.nano.MosquitoPM 1.0 | hadur2.Hadur 3.9 | 16 | 95.0% ± 4.8 | 96.9% ± 3.8 | +1.9 ± 5.6 | 67.9% ± 4.5 | 71.6% ± 2.2 | +3.6 ± 5.1 |
| robar.nano.MosquitoPM 1.0 | hadur2.Hadur 3.8.5 | 16 | 96.2% ± 4.3 | 99.4% ± 1.3 | +3.1 ± 4.7 | 65.0% ± 4.4 | 71.7% ± 3.0 | +6.7 ± 6.5 |
| robar.nano.Scytodes 0.3 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 83.3% ± 3.5 | 86.3% ± 3.0 | +3.0 ± 5.2 |
| robar.nano.Scytodes 0.3 | hadur2.Hadur 3.8.5 | 16 | 96.3% ± 4.3 | 100.0% ± 0.0 | +3.7 ± 4.3 | 81.7% ± 4.3 | 88.6% ± 2.2 | +6.9 ± 4.6 |
| sadoner.killer 0.2 | hadur2.Hadur 3.9 | 16 | 93.8% ± 6.4 | 96.8% ± 2.6 | +3.1 ± 6.1 | 69.7% ± 5.5 | 75.7% ± 3.1 | +6.0 ± 7.3 |
| sadoner.killer 0.2 | hadur2.Hadur 3.8.5 | 16 | 93.8% ± 5.1 | 96.8% ± 3.3 | +3.1 ± 7.0 | 70.7% ± 4.1 | 77.5% ± 5.4 | +6.8 ± 7.7 |
| sample.Target 1.0 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 |
| sample.Target 1.0 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | hadur2.Hadur 3.9 | 16 | 75.0% ± 9.9 | 79.9% ± 8.2 | +4.9 ± 13.1 | 45.1% ± 3.3 | 47.6% ± 4.4 | +2.5 ± 4.7 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | hadur2.Hadur 3.8.5 | 16 | 80.0% ± 9.5 | 77.2% ± 4.1 | -2.8 ± 10.1 | 53.1% ± 5.4 | 43.6% ± 3.9 | -9.5 ± 6.9 |
| yk.JahMicro 1.0 | hadur2.Hadur 3.9 | 16 | 98.8% ± 2.7 | 97.5% ± 3.1 | -1.2 ± 4.3 | 85.7% ± 3.5 | 89.3% ± 1.7 | +3.6 ± 4.0 |
| yk.JahMicro 1.0 | hadur2.Hadur 3.8.5 | 16 | 100.0% ± 0.0 | 96.2% ± 3.3 | -3.8 ± 3.3 | 86.7% ± 3.1 | 89.5% ± 1.7 | +2.8 ± 3.2 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.2 ± 0.8 | +1.3 ± 1.3 |
| ags.Midboss 1q.fast | +2.5 ± 10.9 | -3.8 ± 10.5 | -1.1 ± 4.5 | -3.7 ± 5.8 |
| apv.NanoLauLectrik 1.0 | -1.2 ± 7.2 | -1.2 ± 4.7 | -6.3 ± 8.7 | -1.7 ± 7.5 |
| bvh.fnr.Fenrir 0.36l | -6.2 ± 10.8 | -0.0 ± 8.3 | -4.5 ± 7.5 | +0.4 ± 4.0 |
| cw.megas.Silhouette 1.1 | -0.0 ± 9.5 | -1.2 ± 5.5 | -0.2 ± 4.8 | +0.1 ± 4.0 |
| dggp.haiku.gpBot_0 1.1 | +2.5 ± 3.6 | +0.6 ± 1.3 | -1.8 ± 6.4 | +7.6 ± 4.5 |
| eat.HumblePieLite 1.0 | +0.0 ± 0.0 | +2.2 ± 6.2 | -0.5 ± 3.8 | +3.7 ± 10.9 |
| exauge.GateKeeper 1.1.121g | -2.5 ± 6.6 | -1.1 ± 7.1 | +1.0 ± 6.0 | -0.3 ± 6.2 |
| exauge.Leopard 1.1.019 | -3.7 ± 4.3 | +0.0 ± 0.0 | -1.8 ± 3.3 | -1.2 ± 2.7 |
| fowl3628800.SitAndGo 1.0.0 | -1.2 ± 2.7 | +0.0 ± 0.0 | +0.1 ± 2.7 | +0.4 ± 0.6 |
| gh.nano.Grofvuil 0.2 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.6 ± 2.5 | +0.2 ± 1.3 |
| gwah.GBotMarkIV 1.0 | +1.2 ± 2.7 | +0.0 ± 0.0 | +0.4 ± 3.9 | -0.5 ± 1.2 |
| japs.Serenity 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 |
| jeremyreeder.Bully 1 | -1.2 ± 4.7 | +0.0 ± 0.0 | -4.4 ± 6.6 | +1.9 ± 2.8 |
| jgap.JGAP7247_2 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | +2.6 ± 5.1 | -1.4 ± 2.5 |
| kc.micro.Needle 0.101 | +6.2 ± 9.3 | +2.6 ± 4.5 | -2.2 ± 5.7 | +0.9 ± 3.7 |
| kinsen.nano.Quarrelet 1.0 | +0.0 ± 8.7 | +1.2 ± 5.8 | -4.0 ± 6.7 | -2.3 ± 7.0 |
| nat.Hikari dev0001 | -2.5 ± 7.7 | +0.6 ± 5.3 | -4.2 ± 4.4 | -0.4 ± 4.1 |
| ne.Chimera 1.2 | -3.7 ± 4.3 | +0.0 ± 0.0 | -1.0 ± 6.0 | n/a |
| ntw.Sighup 1.5 | +0.0 ± 3.9 | +0.0 ± 1.9 | +1.1 ± 7.7 | +2.1 ± 3.6 |
| nz.jdc.nano.AralR 1.1 | +2.5 ± 3.6 | -1.2 ± 1.8 | +0.1 ± 2.9 | -2.0 ± 3.0 |
| ola.Puffin 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.3 ± 1.7 | +5.9 ± 2.3 |
| pa3k.Viper 5.03 | -3.7 ± 10.5 | -1.7 ± 7.2 | -2.4 ± 6.2 | +0.3 ± 4.5 |
| pez.nano.Icarus 0.3 | +1.2 ± 4.7 | +0.0 ± 0.0 | +2.2 ± 4.6 | +0.6 ± 2.6 |
| rapture.Rapture 2.13 | -1.2 ± 2.7 | +0.6 ± 2.4 | +0.8 ± 3.7 | +2.5 ± 2.3 |
| repositorio.NanoStep 1.0 | -1.2 ± 2.7 | -0.6 ± 1.3 | +0.8 ± 2.4 | +6.0 ± 4.2 |
| robar.nano.MosquitoPM 1.0 | -1.2 ± 7.2 | -2.5 ± 3.6 | +2.9 ± 4.9 | -0.2 ± 4.3 |
| robar.nano.Scytodes 0.3 | +3.7 ± 4.3 | +0.0 ± 0.0 | +1.6 ± 4.7 | -2.2 ± 3.9 |
| sadoner.killer 0.2 | -0.0 ± 6.7 | +0.0 ± 4.9 | -1.1 ± 6.5 | -1.8 ± 7.3 |
| sample.Target 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | -5.0 ± 11.3 | +2.7 ± 9.4 | -8.0 ± 5.4 | +4.1 ± 3.9 |
| yk.JahMicro 1.0 | -1.2 ± 2.7 | +1.3 ± 4.8 | -1.0 ± 4.9 | -0.2 ± 2.4 |
