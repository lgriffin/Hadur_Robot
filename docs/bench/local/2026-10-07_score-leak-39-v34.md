# Bench: hadur2.Hadur 3.9 (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 2688 over 256 battles (10.5 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sheldor.nano.SabreuseNano 1.1 | weak | 69.6% ± 2.9 | 95.7% ± 2.9 | 60.4% ± 1.3 | 268 / 280 | 72.1% ± 2.2 | 55.9% ± 6.7 | 99 | 0 | 0.62 / 11.8 |
| demetrix.nano.SledgeHammer 0.22 | weak | 68.5% ± 1.1 | 95.7% ± 2.2 | 59.3% ± 0.8 | 268 / 280 | 74.7% ± 2.4 | 55.7% ± 5.2 | 89 | 0 | 0.58 / 9.8 |
| slugzilla.ButtHead 2.0 | weak | 68.5% ± 2.5 | 96.1% ± 3.1 | 59.9% ± 0.9 | 269 / 280 | 72.7% ± 3.1 | 55.2% ± 1.3 | 89 | 0 | 0.62 / 10.1 |
| sheldor.nano.Sabreur 1.1.2 | weak | 68.6% ± 4.3 | 93.9% ± 5.5 | 61.3% ± 1.3 | 263 / 280 | 71.7% ± 3.0 | 50.7% ± 1.9 | 85 | 0 | 0.59 / 9.9 |
| maribo.FollowFire 1.11 | weak | 69.7% ± 3.4 | 95.0% ± 3.6 | 61.0% ± 1.6 | 266 / 280 | 69.5% ± 2.0 | 48.2% ± 4.0 | 79 | 0 | 0.61 / 10.9 |
| jk.nano.Machete 2.0 | weak | 72.5% ± 2.1 | 97.5% ± 2.7 | 62.7% ± 1.1 | 273 / 280 | 71.1% ± 2.1 | 48.6% ± 6.3 | 98 | 0 | 0.60 / 9.3 |
| suzushin7.nano.Galaxy03 1.01 | weak | 72.4% ± 2.0 | 97.8% ± 2.1 | 63.8% ± 2.2 | 274 / 280 | 82.3% ± 2.2 | 48.4% ± 5.8 | 86 | 0 | 0.64 / 10.6 |
| suh.nano.RammingC 1.00 | weak | 73.8% ± 2.0 | 98.6% ± 1.8 | 63.3% ± 1.4 | 276 / 280 | 83.9% ± 1.6 | 56.7% ± 7.1 | 84 | 0 | 0.54 / 11.5 |
| jab.micro.Sanguijuela 0.8 | weak | 70.2% ± 1.2 | 96.8% ± 2.0 | 60.6% ± 0.4 | 271 / 280 | 75.7% ± 2.3 | 54.2% ± 4.3 | 82 | 0 | 0.54 / 9.7 |
| wompi.Kowari 1.6 | weak | 74.2% ± 1.2 | 99.3% ± 1.7 | 64.8% ± 1.0 | 278 / 280 | 71.2% ± 1.7 | 57.7% ± 1.9 | 97 | 0 | 0.72 / 88.8 |
| step.nanoPri 1.0 | weak | 74.3% ± 2.1 | 98.6% ± 1.8 | 64.7% ± 1.6 | 276 / 280 | 80.8% ± 1.5 | 46.2% ± 3.4 | 93 | 0 | 0.55 / 10.0 |
| oog.nano.Caligula 1.15 | weak | 73.6% ± 2.9 | 94.6% ± 4.1 | 65.4% ± 1.3 | 265 / 280 | 58.1% ± 5.6 | 37.9% ± 2.8 | 82 | 0 | 0.59 / 10.9 |
| benhorner.PureAggression 0.2.6 | weak | 75.6% ± 1.1 | 97.5% ± 2.0 | 66.3% ± 1.2 | 273 / 280 | 78.4% ± 1.0 | 59.3% ± 6.5 | 86 | 0 | 0.58 / 11.4 |
| radnor.RamRod 1.0 | weak | 79.2% ± 2.5 | 98.9% ± 1.8 | 70.0% ± 2.3 | 277 / 280 | 68.8% ± 2.8 | 30.2% ± 3.6 | 86 | 0 | 0.60 / 9.2 |
| bvh.mini.Mjolnir 0.3 | weak | 78.5% ± 1.9 | 97.9% ± 1.7 | 69.0% ± 2.0 | 274 / 280 | 62.3% ± 2.2 | 31.8% ± 3.3 | 97 | 0 | 0.73 / 13.6 |
| asm.Statistas 0.1 | weak | 79.6% ± 3.7 | 96.1% ± 3.4 | 60.9% ± 4.0 | 269 / 280 | 13.2% ± 1.0 | 5.2% ± 0.4 | 95 | 0 | 0.93 / 17.0 |
| pez.frankie.Frankie 0.9.6.1 | weak | 99.1% ± 1.1 | 100.0% ± 0.0 | 77.6% ± 24.7 | 280 / 280 | 0.8% ± 0.4 | 0.2% ± 0.3 | 46 | 0 | 0.50 / 40.6 |
| stelo.Lifestealer 1.0 | weak | 80.9% ± 1.9 | 98.9% ± 1.2 | 71.0% ± 2.0 | 277 / 280 | 61.7% ± 4.0 | 27.6% ± 3.3 | 80 | 0 | 0.57 / 12.0 |
| blir.nano.Bruce R1.0.0 | weak | 79.2% ± 1.1 | 99.3% ± 1.1 | 67.9% ± 1.5 | 278 / 280 | 79.2% ± 2.3 | 37.7% ± 3.7 | 80 | 0 | 0.53 / 30.6 |
| myl.nano.Kakuru 1.20 | weak | 79.3% ± 2.4 | 95.7% ± 1.8 | 62.0% ± 2.9 | 268 / 280 | 16.0% ± 1.6 | 7.6% ± 2.1 | 88 | 0 | 0.89 / 17.3 |
| EH.Fusion 0.32 | weak | 80.7% ± 2.2 | 98.2% ± 2.2 | 72.1% ± 2.6 | 275 / 280 | 62.4% ± 3.0 | 23.4% ± 2.7 | 83 | 0 | 0.62 / 10.1 |
| mahrgell.mahrram 1.3 | weak | 78.5% ± 1.9 | 98.6% ± 1.8 | 70.2% ± 2.0 | 276 / 280 | 71.3% ± 1.2 | 37.5% ± 3.0 | 85 | 0 | 0.54 / 9.0 |
| stelo.MirrorMicro 1.1 | weak | 92.5% ± 0.6 | 100.0% ± 0.0 | 85.9% ± 1.0 | 280 / 280 | 35.6% ± 1.3 | 6.4% ± 0.7 | 86 | 0 | 0.71 / 9.1 |
| stelo.PianistNano 1.3 | weak | 82.6% ± 4.4 | 96.8% ± 3.7 | 66.6% ± 5.2 | 271 / 280 | 15.3% ± 0.8 | 5.1% ± 0.6 | 76 | 0 | 0.81 / 16.8 |
| supersample.SuperRamFire 1.0 | weak | 82.8% ± 3.3 | 96.1% ± 3.1 | 75.6% ± 3.8 | 269 / 280 | 51.1% ± 6.5 | 15.8% ± 3.5 | 79 | 0 | 0.71 / 9.8 |
| mladjo.AIR 0.7 | weak | 83.4% ± 2.3 | 96.8% ± 2.4 | 69.6% ± 2.7 | 271 / 280 | 16.0% ± 1.3 | 6.1% ± 0.7 | 90 | 0 | 0.85 / 18.0 |
| bayen.UbaRamLT 1.0 | weak | 80.4% ± 2.6 | 98.2% ± 1.2 | 72.4% ± 3.1 | 275 / 280 | 66.8% ± 1.4 | 33.5% ± 4.5 | 76 | 0 | 0.51 / 8.9 |
| apv.LauLectrik 1.2 | weak | 99.7% ± 0.3 | 100.0% ± 0.0 | 83.5% ± 21.5 | 280 / 280 | 0.3% ± 0.1 | 0.0% ± 0.0 | 46 | 0 | 0.58 / 16.5 |
| dz.OthoMicro 0.12 | weak | 78.3% ± 4.5 | 92.1% ± 4.4 | 63.5% ± 4.2 | 258 / 280 | 14.5% ± 1.4 | 6.9% ± 3.4 | 83 | 0 | 0.94 / 34.2 |
| bwbaugh.nano.Tirunculus 0.0.0a | weak | 83.6% ± 1.1 | 99.3% ± 1.1 | 76.0% ± 1.3 | 278 / 280 | 83.1% ± 1.1 | 78.1% ± 3.9 | 84 | 0 | 0.46 / 8.8 |
| kawigi.sbf.FloodSonnet 0.9 | weak | 80.9% ± 4.4 | 94.6% ± 4.1 | 65.4% ± 4.7 | 265 / 280 | 13.2% ± 0.7 | 5.0% ± 0.6 | 90 | 0 | 0.89 / 17.9 |
| exauge.Leopard 1.1.019 | weak | 81.5% ± 2.6 | 98.9% ± 1.8 | 72.6% ± 2.5 | 277 / 280 | 80.6% ± 1.1 | 45.9% ± 11.0 | 89 | 0 | 0.53 / 125.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| sheldor.nano.SabreuseNano 1.1 | 8 | 2936 | 2.6% | 83.9% | 11.6% | 1.9% | 321 |
| demetrix.nano.SledgeHammer 0.22 | 8 | 3113 | 2.4% | 83.9% | 11.8% | 1.9% | 310 |
| slugzilla.ButtHead 2.0 | 8 | 3083 | 2.2% | 79.3% | 16.9% | 1.6% | 314 |
| sheldor.nano.Sabreur 1.1.2 | 8 | 2951 | 3.6% | 73.8% | 20.0% | 2.6% | 313 |
| maribo.FollowFire 1.11 | 8 | 2887 | 3.0% | 81.8% | 12.8% | 2.4% | 315 |
| jk.nano.Machete 2.0 | 8 | 2505 | 1.7% | 86.1% | 10.8% | 1.3% | 317 |
| suzushin7.nano.Galaxy03 1.01 | 8 | 2486 | 1.5% | 79.9% | 17.1% | 1.5% | 285 |
| suh.nano.RammingC 1.00 | 8 | 2441 | 1.0% | 92.2% | 6.2% | 0.6% | 294 |
| jab.micro.Sanguijuela 0.8 | 8 | 2858 | 2.0% | 87.1% | 9.6% | 1.4% | 304 |
| wompi.Kowari 1.6 | 8 | 2411 | 0.5% | 89.3% | 9.8% | 0.4% | 333 |
| step.nanoPri 1.0 | 8 | 2270 | 1.1% | 85.8% | 12.2% | 0.9% | 288 |
| oog.nano.Caligula 1.15 | 8 | 2197 | 4.3% | 79.1% | 13.5% | 3.2% | 345 |
| benhorner.PureAggression 0.2.6 | 8 | 2171 | 2.0% | 89.2% | 7.4% | 1.4% | 302 |
| radnor.RamRod 1.0 | 8 | 1622 | 1.2% | 87.5% | 10.5% | 0.9% | 301 |
| bvh.mini.Mjolnir 0.3 | 8 | 1652 | 2.3% | 87.9% | 8.5% | 1.4% | 346 |
| asm.Statistas 0.1 | 8 | 896 | 7.7% | 88.9% | 0.0% | 3.4% | 637 |
| pez.frankie.Frankie 0.9.6.1 | 8 | 20 | 0.0% | 100.0% | 0.0% | 0.0% | 162 |
| stelo.Lifestealer 1.0 | 8 | 1422 | 1.3% | 91.9% | 5.8% | 0.9% | 316 |
| blir.nano.Bruce R1.0.0 | 8 | 1706 | 0.7% | 97.6% | 0.9% | 0.7% | 290 |
| myl.nano.Kakuru 1.20 | 8 | 967 | 7.8% | 88.6% | 0.0% | 3.7% | 535 |
| EH.Fusion 0.32 | 8 | 1397 | 2.2% | 84.3% | 11.8% | 1.7% | 309 |
| mahrgell.mahrram 1.3 | 8 | 1758 | 1.4% | 85.7% | 11.8% | 1.1% | 305 |
| stelo.MirrorMicro 1.1 | 8 | 416 | 0.0% | 100.0% | 0.0% | 0.0% | 371 |
| stelo.PianistNano 1.3 | 8 | 773 | 7.3% | 89.2% | 0.0% | 3.5% | 547 |
| supersample.SuperRamFire 1.0 | 8 | 1116 | 6.2% | 78.3% | 12.4% | 3.2% | 338 |
| mladjo.AIR 0.7 | 8 | 801 | 7.0% | 90.1% | 0.1% | 2.7% | 641 |
| bayen.UbaRamLT 1.0 | 8 | 1536 | 2.0% | 85.4% | 10.9% | 1.7% | 310 |
| apv.LauLectrik 1.2 | 8 | 6 | 0.0% | 100.0% | 0.0% | 0.0% | 163 |
| dz.OthoMicro 0.12 | 8 | 995 | 13.8% | 79.8% | 0.0% | 6.4% | 601 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 1328 | 0.9% | 91.2% | 7.2% | 0.6% | 296 |
| kawigi.sbf.FloodSonnet 0.9 | 8 | 847 | 11.1% | 83.7% | 0.0% | 5.3% | 645 |
| exauge.Leopard 1.1.019 | 8 | 1467 | 1.3% | 92.0% | 5.8% | 0.9% | 291 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sheldor.nano.SabreuseNano 1.1 | 8 | 3 | 1401 | 0 | 0.35 | 1 | 1 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 8 | 7 | 172 | 0 | 0.32 | 1 | 0 | 0 |
| slugzilla.ButtHead 2.0 | 8 | 7 | 298 | 0 | 0.32 | 0 | 0 | 0 |
| sheldor.nano.Sabreur 1.1.2 | 8 | 7 | 298 | 0 | 0.30 | 0 | 0 | 0 |
| maribo.FollowFire 1.11 | 8 | 8 | 0 | 0 | 0.28 | 0 | 0 | 0 |
| jk.nano.Machete 2.0 | 8 | 4 | 1215 | 0 | 0.35 | 0 | 0 | 0 |
| suzushin7.nano.Galaxy03 1.01 | 8 | 6 | 317 | 0 | 0.31 | 0 | 0 | 0 |
| suh.nano.RammingC 1.00 | 8 | 6 | 277 | 0 | 0.30 | 0 | 0 | 0 |
| jab.micro.Sanguijuela 0.8 | 8 | 7 | 82 | 0 | 0.29 | 0 | 0 | 0 |
| wompi.Kowari 1.6 | 8 | 7 | 298 | 0 | 0.35 | 0 | 0 | 0 |
| step.nanoPri 1.0 | 8 | 7 | 94 | 0 | 0.33 | 0 | 0 | 0 |
| oog.nano.Caligula 1.15 | 8 | 6 | 298 | 0 | 0.29 | 1 | 1 | 0 |
| benhorner.PureAggression 0.2.6 | 8 | 7 | 121 | 0 | 0.31 | 0 | 0 | 0 |
| radnor.RamRod 1.0 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| bvh.mini.Mjolnir 0.3 | 8 | 5 | 842 | 0 | 0.35 | 0 | 0 | 0 |
| asm.Statistas 0.1 | 8 | 7 | 298 | 0 | 0.34 | 0 | 0 | 0 |
| pez.frankie.Frankie 0.9.6.1 | 8 | 6 | 596 | 0 | 0.16 | 0 | 0 | 8 |
| stelo.Lifestealer 1.0 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| blir.nano.Bruce R1.0.0 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| myl.nano.Kakuru 1.20 | 8 | 7 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| EH.Fusion 0.32 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| mahrgell.mahrram 1.3 | 8 | 7 | 180 | 0 | 0.30 | 0 | 0 | 0 |
| stelo.MirrorMicro 1.1 | 8 | 7 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| stelo.PianistNano 1.3 | 8 | 6 | 298 | 0 | 0.27 | 1 | 1 | 0 |
| supersample.SuperRamFire 1.0 | 8 | 8 | 0 | 0 | 0.28 | 0 | 0 | 0 |
| mladjo.AIR 0.7 | 8 | 6 | 298 | 0 | 0.32 | 1 | 1 | 0 |
| bayen.UbaRamLT 1.0 | 8 | 7 | 131 | 0 | 0.27 | 0 | 0 | 0 |
| apv.LauLectrik 1.2 | 8 | 8 | 0 | 0 | 0.16 | 0 | 0 | 8 |
| dz.OthoMicro 0.12 | 8 | 5 | 581 | 0 | 0.30 | 2 | 2 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 6 | 194 | 0 | 0.30 | 0 | 0 | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8 | 7 | 298 | 0 | 0.32 | 0 | 0 | 0 |
| exauge.Leopard 1.1.019 | 8 | 6 | 382 | 0 | 0.32 | 0 | 0 | 0 |

212 of 256 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| sheldor.nano.SabreuseNano 1.1 | 2746 | 10 | 2651 | 2648 (96.4%) | 98 (3.6%) | 3 (0.1%) | 1945 | 250 | 22 |
| demetrix.nano.SledgeHammer 0.22 | 2474 | 11 | 2464 | 2463 (99.6%) | 11 (0.4%) | 1 (0.0%) | 2086 | 250 | 19 |
| slugzilla.ButtHead 2.0 | 2599 | 13 | 2582 | 2578 (99.2%) | 21 (0.8%) | 4 (0.2%) | 2933 | 329 | 25 |
| sheldor.nano.Sabreur 1.1.2 | 2592 | 18 | 2574 | 2571 (99.2%) | 21 (0.8%) | 3 (0.1%) | 3321 | 357 | 25 |
| maribo.FollowFire 1.11 | 2591 | 6 | 2592 | 2591 (100.0%) | 0 (0.0%) | 1 (0.0%) | 2075 | 259 | 14 |
| jk.nano.Machete 2.0 | 2634 | 16 | 2550 | 2549 (96.8%) | 85 (3.2%) | 1 (0.0%) | 1593 | 224 | 24 |
| suzushin7.nano.Galaxy03 1.01 | 1993 | 24 | 1973 | 1973 (99.0%) | 20 (1.0%) | 0 (0.0%) | 2498 | 279 | 24 |
| suh.nano.RammingC 1.00 | 2199 | 7 | 2185 | 2181 (99.2%) | 18 (0.8%) | 4 (0.2%) | 852 | 190 | 28 |
| jab.micro.Sanguijuela 0.8 | 2278 | 12 | 2273 | 2272 (99.7%) | 6 (0.3%) | 1 (0.0%) | 1532 | 194 | 19 |
| wompi.Kowari 1.6 | 3230 | 14 | 3224 | 3205 (99.2%) | 25 (0.8%) | 19 (0.6%) | 1333 | 273 | 24 |
| step.nanoPri 1.0 | 2042 | 23 | 2037 | 2035 (99.7%) | 7 (0.3%) | 2 (0.1%) | 1654 | 219 | 21 |
| oog.nano.Caligula 1.15 | 3311 | 28 | 3296 | 3291 (99.4%) | 20 (0.6%) | 5 (0.2%) | 1816 | 299 | 16 |
| benhorner.PureAggression 0.2.6 | 2498 | 58 | 2488 | 2488 (99.6%) | 10 (0.4%) | 0 (0.0%) | 921 | 223 | 23 |
| radnor.RamRod 1.0 | 2243 | 8 | 2244 | 2243 (100.0%) | 0 (0.0%) | 1 (0.0%) | 1012 | 138 | 17 |
| bvh.mini.Mjolnir 0.3 | 3100 | 6 | 3049 | 3045 (98.2%) | 55 (1.8%) | 4 (0.1%) | 856 | 166 | 29 |
| asm.Statistas 0.1 | 7119 | 21 | 7103 | 7096 (99.7%) | 23 (0.3%) | 7 (0.1%) | 239 | 97 | 27 |
| pez.frankie.Frankie 0.9.6.1 | 198 | 1 | 160 | 160 (80.8%) | 38 (19.2%) | 0 (0.0%) | 13 | 3 | 9 |
| stelo.Lifestealer 1.0 | 2347 | 23 | 2351 | 2347 (100.0%) | 0 (0.0%) | 4 (0.2%) | 1037 | 159 | 18 |
| blir.nano.Bruce R1.0.0 | 2087 | 19 | 2088 | 2086 (100.0%) | 1 (0.0%) | 2 (0.1%) | 1037 | 185 | 22 |
| myl.nano.Kakuru 1.20 | 6102 | 22 | 6075 | 6067 (99.4%) | 35 (0.6%) | 8 (0.1%) | 832 | 135 | 252 |
| EH.Fusion 0.32 | 2395 | 18 | 2394 | 2393 (99.9%) | 2 (0.1%) | 1 (0.0%) | 1228 | 170 | 15 |
| mahrgell.mahrram 1.3 | 2545 | 30 | 2536 | 2534 (99.6%) | 11 (0.4%) | 2 (0.1%) | 1177 | 236 | 20 |
| stelo.MirrorMicro 1.1 | 3563 | 30 | 3542 | 3540 (99.4%) | 23 (0.6%) | 2 (0.1%) | 21 | 90 | 26 |
| stelo.PianistNano 1.3 | 6377 | 19 | 6374 | 6353 (99.6%) | 24 (0.4%) | 21 (0.3%) | 631 | 104 | 25 |
| supersample.SuperRamFire 1.0 | 2872 | 19 | 2882 | 2870 (99.9%) | 2 (0.1%) | 12 (0.4%) | 1016 | 163 | 22 |
| mladjo.AIR 0.7 | 9270 | 15 | 9250 | 9249 (99.8%) | 21 (0.2%) | 1 (0.0%) | 197 | 113 | 29 |
| bayen.UbaRamLT 1.0 | 1674 | 18 | 1671 | 1668 (99.6%) | 6 (0.4%) | 3 (0.2%) | 1149 | 146 | 23 |
| apv.LauLectrik 1.2 | 208 | 1 | 208 | 208 (100.0%) | 0 (0.0%) | 0 (0.0%) | 1 | 3 | 12 |
| dz.OthoMicro 0.12 | 7620 | 37 | 7589 | 7581 (99.5%) | 39 (0.5%) | 8 (0.1%) | 344 | 114 | 24 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1477 | 19 | 1466 | 1465 (99.2%) | 12 (0.8%) | 1 (0.1%) | 550 | 109 | 19 |
| kawigi.sbf.FloodSonnet 0.9 | 7880 | 56 | 7863 | 7861 (99.8%) | 19 (0.2%) | 2 (0.0%) | 223 | 85 | 35 |
| exauge.Leopard 1.1.019 | 2193 | 17 | 2168 | 2168 (98.9%) | 25 (1.1%) | 0 (0.0%) | 546 | 223 | 25 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| sheldor.nano.SabreuseNano 1.1 | 2714 | 198 (7.3%) | 748 |
| demetrix.nano.SledgeHammer 0.22 | 2487 | 85 (3.4%) | 0 |
| slugzilla.ButtHead 2.0 | 2587 | 162 (6.3%) | 1409 |
| sheldor.nano.Sabreur 1.1.2 | 2581 | 169 (6.5%) | 1014 |
| maribo.FollowFire 1.11 | 2587 | 185 (7.2%) | 424 |
| jk.nano.Machete 2.0 | 2644 | 203 (7.7%) | 906 |
| suzushin7.nano.Galaxy03 1.01 | 2063 | 31 (1.5%) | 0 |
| suh.nano.RammingC 1.00 | 2224 | 30 (1.3%) | 0 |
| jab.micro.Sanguijuela 0.8 | 2404 | 150 (6.2%) | 345 |
| wompi.Kowari 1.6 | 2972 | 159 (5.3%) | 1059 |
| step.nanoPri 1.0 | 2116 | 19 (0.9%) | 0 |
| oog.nano.Caligula 1.15 | 3128 | 413 (13.2%) | 2448 |
| benhorner.PureAggression 0.2.6 | 2356 | 72 (3.1%) | 121 |
| radnor.RamRod 1.0 | 2302 | 41 (1.8%) | 0 |
| bvh.mini.Mjolnir 0.3 | 3256 | 114 (3.5%) | 405 |
| asm.Statistas 0.1 | 9729 | 510 (5.2%) | 5090 |
| pez.frankie.Frankie 0.9.6.1 | 225 | 10 (4.4%) | 0 |
| stelo.Lifestealer 1.0 | 2562 | 82 (3.2%) | 0 |
| blir.nano.Bruce R1.0.0 | 2142 | 49 (2.3%) | 0 |
| myl.nano.Kakuru 1.20 | 7207 | 386 (5.4%) | 1100 |
| EH.Fusion 0.32 | 2482 | 58 (2.3%) | 0 |
| mahrgell.mahrram 1.3 | 2404 | 179 (7.4%) | 456 |
| stelo.MirrorMicro 1.1 | 3576 | 202 (5.6%) | 0 |
| stelo.PianistNano 1.3 | 7451 | 376 (5.0%) | 339 |
| supersample.SuperRamFire 1.0 | 2993 | 210 (7.0%) | 1221 |
| mladjo.AIR 0.7 | 9298 | 745 (8.0%) | 5340 |
| bayen.UbaRamLT 1.0 | 2472 | 189 (7.6%) | 0 |
| apv.LauLectrik 1.2 | 241 | 9 (3.7%) | 0 |
| dz.OthoMicro 0.12 | 8669 | 547 (6.3%) | 2399 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2275 | 50 (2.2%) | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 9789 | 572 (5.8%) | 2541 |
| exauge.Leopard 1.1.019 | 2147 | 41 (1.9%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| sheldor.nano.SabreuseNano 1.1 | 650 | 159 | 650 | 171 | 107.4 / 70.4 | 2122 | 2056 | 146 |
| demetrix.nano.SledgeHammer 0.22 | 650 | 152 | 650 | 160 | 108.3 / 74.6 | 2191 | 2005 | 64 |
| slugzilla.ButtHead 2.0 | 650 | 150 | 650 | 164 | 104.3 / 69.8 | 2061 | 1770 | 146 |
| sheldor.nano.Sabreur 1.1.2 | 650 | 154 | 650 | 163 | 98.6 / 62.2 | 1872 | 1841 | 246 |
| maribo.FollowFire 1.11 | 650 | 161 | 650 | 165 | 105.6 / 67.5 | 2312 | 1864 | 156 |
| jk.nano.Machete 2.0 | 650 | 162 | 619 | 167 | 103.7 / 61.7 | 2124 | 2058 | 136 |
| suzushin7.nano.Galaxy03 1.01 | 650 | 181 | 613 | 135 | 98.9 / 56.7 | 1764 | 3299 | 128 |
| suh.nano.RammingC 1.00 | 650 | 186 | 650 | 144 | 110.9 / 64.3 | 1942 | 2531 | 89 |
| jab.micro.Sanguijuela 0.8 | 650 | 139 | 650 | 154 | 109.2 / 71.1 | 2174 | 3079 | 56 |
| wompi.Kowari 1.6 | 650 | 183 | 650 | 183 | 112.8 / 61.5 | 2134 | 2388 | 227 |
| step.nanoPri 1.0 | 650 | 190 | 616 | 138 | 101.2 / 55.6 | 1830 | 3517 | 85 |
| oog.nano.Caligula 1.15 | 650 | 190 | 650 | 196 | 93.8 / 49.6 | 2345 | 2217 | 280 |
| benhorner.PureAggression 0.2.6 | 650 | 157 | 650 | 152 | 108.8 / 55.3 | 2084 | 2924 | 93 |
| radnor.RamRod 1.0 | 650 | 183 | 497 | 151 | 94.1 / 40.6 | 2079 | 3219 | 11 |
| bvh.mini.Mjolnir 0.3 | 650 | 249 | 528 | 196 | 91.8 / 41.5 | 2134 | 1531 | 18 |
| asm.Statistas 0.1 | 650 | 481 | 559 | 487 | 35.5 / 22.8 | 497 | 5893 | 2 |
| pez.frankie.Frankie 0.9.6.1 | 650 | 350 | 631 | 12 | 1.5 / 0.6 | 3 | 164 | 115 |
| stelo.Lifestealer 1.0 | 650 | 221 | 550 | 166 | 91.0 / 37.4 | 2193 | 2745 | 80 |
| blir.nano.Bruce R1.0.0 | 650 | 193 | 581 | 140 | 100.7 / 47.6 | 1867 | 3776 | 118 |
| myl.nano.Kakuru 1.20 | 650 | 448 | 469 | 385 | 39.7 / 24.5 | 1557 | 5370 | 3944 |
| EH.Fusion 0.32 | 650 | 291 | 463 | 159 | 86.1 / 33.7 | 1925 | 3516 | 193 |
| mahrgell.mahrram 1.3 | 650 | 182 | 606 | 155 | 100.8 / 43.0 | 2073 | 2317 | 50 |
| stelo.MirrorMicro 1.1 | 650 | 500 | 400 | 221 | 72.0 / 11.9 | 2707 | 2393 | 0 |
| stelo.PianistNano 1.3 | 650 | 485 | 478 | 395 | 39.0 / 19.7 | 1253 | 5338 | 4094 |
| supersample.SuperRamFire 1.0 | 650 | 254 | 400 | 188 | 76.3 / 25.0 | 2202 | 3143 | 782 |
| mladjo.AIR 0.7 | 650 | 440 | 463 | 491 | 47.0 / 20.6 | 1774 | 3534 | 2552 |
| bayen.UbaRamLT 1.0 | 650 | 190 | 650 | 160 | 97.3 / 37.5 | 2128 | 2355 | 117 |
| apv.LauLectrik 1.2 | 650 | 388 | 650 | 13 | 0.9 / 0.2 | 0 | 280 | 0 |
| dz.OthoMicro 0.12 | 650 | 469 | 572 | 451 | 39.3 / 22.7 | 1397 | 6429 | 462 |
| bwbaugh.nano.Tirunculus 0.0.0a | 650 | 191 | 650 | 146 | 109.3 / 34.6 | 1902 | 2127 | 192 |
| kawigi.sbf.FloodSonnet 0.9 | 650 | 465 | 625 | 495 | 38.1 / 20.3 | 500 | 7297 | 839 |
| exauge.Leopard 1.1.019 | 650 | 198 | 591 | 141 | 101.7 / 38.6 | 1800 | 2664 | 15 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| sheldor.nano.SabreuseNano 1.1 | 55.9% | 99 | 23 | 3 | 9.2 | 189 / 198 (95%) | 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 55.7% | 89 | 21 | 3 | 8.6 | 85 / 85 (100%) | 0 | 0 |
| slugzilla.ButtHead 2.0 | 55.2% | 89 | 24 | 3 | 8.8 | 161 / 162 (99%) | 0 | 0 |
| sheldor.nano.Sabreur 1.1.2 | 50.7% | 85 | 21 | 3 | 8.7 | 168 / 169 (99%) | 0 | 0 |
| maribo.FollowFire 1.11 | 48.2% | 79 | 22 | 3 | 8.8 | 185 / 185 (100%) | 0 | 0 |
| jk.nano.Machete 2.0 | 48.6% | 98 | 32 | 3 | 8.9 | 200 / 203 (99%) | 0 | 0 |
| suzushin7.nano.Galaxy03 1.01 | 48.4% | 86 | 25 | 3 | 6.8 | 31 / 31 (100%) | 0 | 0 |
| suh.nano.RammingC 1.00 | 56.7% | 84 | 25 | 3 | 7.7 | 30 / 30 (100%) | 0 | 0 |
| jab.micro.Sanguijuela 0.8 | 54.2% | 82 | 21 | 3 | 8.0 | 150 / 150 (100%) | 0 | 0 |
| wompi.Kowari 1.6 | 57.7% | 97 | 23 | 3 | 11.0 | 157 / 159 (99%) | 0 | 0 |
| step.nanoPri 1.0 | 46.2% | 93 | 24 | 3 | 7.0 | 19 / 19 (100%) | 0 | 0 |
| oog.nano.Caligula 1.15 | 37.9% | 82 | 28 | 3 | 11.4 | 411 / 413 (100%) | 0 | 0 |
| benhorner.PureAggression 0.2.6 | 59.3% | 86 | 17 | 3 | 8.4 | 72 / 72 (100%) | 0 | 0 |
| radnor.RamRod 1.0 | 30.2% | 86 | 21 | 3 | 7.9 | 41 / 41 (100%) | 0 | 0 |
| bvh.mini.Mjolnir 0.3 | 31.8% | 97 | 34 | 3 | 10.8 | 112 / 114 (98%) | 0 | 0 |
| asm.Statistas 0.1 | 5.2% | 95 | 413 | 3 | 25.4 | 510 / 510 (100%) | 0 | 0 |
| pez.frankie.Frankie 0.9.6.1 | 0.2% | 46 | 10 | 3 | 0.6 | 10 / 10 (100%) | 0 | 0 |
| stelo.Lifestealer 1.0 | 27.6% | 80 | 24 | 3 | 8.1 | 82 / 82 (100%) | 0 | 0 |
| blir.nano.Bruce R1.0.0 | 37.7% | 80 | 28 | 3 | 7.2 | 48 / 49 (98%) | 0 | 0 |
| myl.nano.Kakuru 1.20 | 7.6% | 88 | 50 | 3 | 21.7 | 385 / 386 (100%) | 0 | 0 |
| EH.Fusion 0.32 | 23.4% | 83 | 28 | 3 | 8.4 | 58 / 58 (100%) | 0 | 0 |
| mahrgell.mahrram 1.3 | 37.5% | 85 | 20 | 3 | 8.8 | 178 / 179 (99%) | 0 | 0 |
| stelo.MirrorMicro 1.1 | 6.4% | 86 | 38 | 3 | 12.7 | 198 / 202 (98%) | 0 | 0 |
| stelo.PianistNano 1.3 | 5.1% | 76 | 47 | 3 | 22.4 | 375 / 376 (100%) | 0 | 0 |
| supersample.SuperRamFire 1.0 | 15.8% | 79 | 37 | 2 | 10.2 | 210 / 210 (100%) | 0 | 0 |
| mladjo.AIR 0.7 | 6.1% | 90 | 50 | 3 | 32.6 | 744 / 745 (100%) | 0 | 0 |
| bayen.UbaRamLT 1.0 | 33.5% | 76 | 22 | 3 | 5.7 | 189 / 189 (100%) | 0 | 0 |
| apv.LauLectrik 1.2 | 0.0% | 46 | 10 | 3 | 0.7 | 9 / 9 (100%) | 0 | 0 |
| dz.OthoMicro 0.12 | 6.9% | 83 | 58 | 3 | 26.9 | 541 / 547 (99%) | 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 78.1% | 84 | 19 | 3 | 4.9 | 50 / 50 (100%) | 0 | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 5.0% | 90 | 74 | 3 | 28.0 | 567 / 572 (99%) | 0 | 0 |
| exauge.Leopard 1.1.019 | 45.9% | 89 | 20 | 3 | 7.7 | 41 / 41 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| sheldor.nano.SabreuseNano 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| slugzilla.ButtHead 2.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sheldor.nano.Sabreur 1.1.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| maribo.FollowFire 1.11 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jk.nano.Machete 2.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| suzushin7.nano.Galaxy03 1.01 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| suh.nano.RammingC 1.00 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jab.micro.Sanguijuela 0.8 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wompi.Kowari 1.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| step.nanoPri 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| oog.nano.Caligula 1.15 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| benhorner.PureAggression 0.2.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| radnor.RamRod 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bvh.mini.Mjolnir 0.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| asm.Statistas 0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pez.frankie.Frankie 0.9.6.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.Lifestealer 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| blir.nano.Bruce R1.0.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| myl.nano.Kakuru 1.20 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| EH.Fusion 0.32 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mahrgell.mahrram 1.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.MirrorMicro 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.PianistNano 1.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| supersample.SuperRamFire 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mladjo.AIR 0.7 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bayen.UbaRamLT 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apv.LauLectrik 1.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dz.OthoMicro 0.12 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| exauge.Leopard 1.1.019 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| sheldor.nano.SabreuseNano 1.1 | sheldor.nano.SabreuseNano | 1 | 35 | 332 | 60.1% | 12.3% ± 3.7 | 46.3% | 12.1% / 10.8% | 6.3% | 0 / 0 | T?/M? | 66% |
| demetrix.nano.SledgeHammer 0.22 | demetrix.nano.SledgeHammer | 1 | 35 | 338 | 65.5% | 13.0% ± 3.8 | 49.5% | 9.2% / 7.8% | 4.5% | 0 / 0 | T?/M? | 65% |
| slugzilla.ButtHead 2.0 | slugzilla.ButtHead | 1 | 35 | 304 | 50.6% | 4.7% ± 2.9 | 39.8% | 11.1% / 10.8% | 25.8% | 0 / 0 | T2/M? | 71% |
| sheldor.nano.Sabreur 1.1.2 | sheldor.nano.Sabreur | 1 | 35 | 316 | 47.7% | 5.1% ± 2.9 | 38.8% | 12.3% / 12.8% | 24.1% | 0 / 0 | T2/M? | 70% |
| maribo.FollowFire 1.11 | maribo.FollowFire | 1 | 35 | 302 | 56.1% | 5.6% ± 3.0 | 41.4% | 9.6% / 8.8% | 27.7% | 0 / 0 | T?/M? | 66% |
| jk.nano.Machete 2.0 | jk.nano.Machete | 1 | 35 | 292 | 54.0% | 12.3% ± 3.7 | 45.2% | 11.5% / 9.7% | 4.3% | 0 / 0 | T?/M? | 66% |
| suzushin7.nano.Galaxy03 1.01 | suzushin7.nano.Galaxy03 | 1 | 35 | 326 | 58.9% | 19.3% ± 4.9 | 48.6% | 17.1% / 17.6% | 5.0% | 0 / 0 | T?/M? | 70% |
| suh.nano.RammingC 1.00 | suh.nano.RammingC | 1 | 35 | 302 | 62.2% | 20.5% ± 4.8 | 48.1% | 15.8% / 15.2% | 3.0% | 0 / 0 | T?/M? | 70% |
| jab.micro.Sanguijuela 0.8 | jab.micro.Sanguijuela | 1 | 35 | 316 | 58.6% | 10.1% ± 3.7 | 45.5% | 10.8% / 10.1% | 3.1% | 0 / 0 | T?/M? | 68% |
| wompi.Kowari 1.6 | wompi.Kowari | 1 | 35 | 280 | 56.0% | 7.6% ± 2.6 | 44.9% | 20.0% / 19.6% | 3.7% | 0 / 0 | T3/M? | 72% |
| step.nanoPri 1.0 | step.nanoPri | 1 | 35 | 280 | 60.6% | 18.5% ± 4.6 | 48.4% | 16.4% / 17.4% | 3.5% | 0 / 0 | T?/M? | 69% |
| oog.nano.Caligula 1.15 | oog.nano.Caligula | 1 | 35 | 302 | 33.3% | 9.6% ± 3.1 | 36.0% | 16.5% / 16.2% | 8.3% | 0 / 0 | T?/M? | 75% |
| benhorner.PureAggression 0.2.6 | benhorner.PureAggression | 1 | 35 | 332 | 65.0% | 6.8% ± 2.9 | 47.2% | 10.0% / 8.5% | 3.5% | 0 / 0 | T2/M? | 73% |
| radnor.RamRod 1.0 | radnor.RamRod | 1 | 35 | 284 | 39.2% | 5.9% ± 3.1 | 40.1% | 12.4% / 11.7% | 12.7% | 0 / 0 | T?/M? | 75% |
| bvh.mini.Mjolnir 0.3 | bvh.mini.Mjolnir | 1 | 35 | 296 | 30.9% | 11.4% ± 3.3 | 35.4% | 25.5% / 21.8% | 9.1% | 0 / 0 | T?/M? | 78% |
| asm.Statistas 0.1 | asm.Statistas | 1 | 35 | 284 | 4.9% | 6.4% ± 1.7 | 11.8% | 28.0% / 26.1% | 5.6% | 0 / 0 | T2/M0 | 83% |
| pez.frankie.Frankie 0.9.6.1 | pez.frankie.Frankie | 1 | 35 | 316 | 0.0% | 0.0% ± 11.5 | 25.0% | 34.6% / 33.2% | 2.9% | 0 / 0 | T?/M? | 100% |
| stelo.Lifestealer 1.0 | stelo.Lifestealer | 1 | 35 | 300 | 34.8% | 11.7% ± 3.8 | 37.1% | 17.0% / 15.4% | 9.4% | 0 / 0 | T?/M? | 77% |
| blir.nano.Bruce R1.0.0 | blir.nano.Bruce | 1 | 35 | 298 | 46.7% | 15.3% ± 4.4 | 49.7% | 15.6% / 15.8% | 4.3% | 0 / 0 | T?/M? | 74% |
| myl.nano.Kakuru 1.20 | myl.nano.Kakuru | 1 | 35 | 294 | 6.0% | 6.5% ± 1.8 | 12.6% | 26.7% / 25.3% | 23.0% | 0 / 0 | T2/M0 | 78% |
| EH.Fusion 0.32 | EH.Fusion | 1 | 35 | 270 | 30.1% | 13.4% ± 3.9 | 38.7% | 32.7% / 34.0% | 5.4% | 0 / 0 | T?/M? | 78% |
| mahrgell.mahrram 1.3 | mahrgell.mahrram | 1 | 35 | 296 | 39.4% | 7.8% ± 3.2 | 42.3% | 13.8% / 11.4% | 5.0% | 0 / 0 | T?/M? | 78% |
| stelo.MirrorMicro 1.1 | stelo.MirrorMicro | 1 | 35 | 300 | 9.6% | 10.9% ± 3.0 | 25.3% | 34.6% / 27.5% | 1.4% | 0 / 0 | T?/M? | 89% |
| stelo.PianistNano 1.3 | stelo.PianistNano | 1 | 35 | 300 | 4.5% | 5.4% ± 1.8 | 14.6% | 31.9% / 27.6% | 24.5% | 0 / 0 | T2/M? | 88% |
| supersample.SuperRamFire 1.0 | supersample.SuperRamFire | 1 | 35 | 328 | 15.4% | 4.3% ± 2.4 | 34.0% | 20.6% / 17.0% | 7.0% | 0 / 0 | T1/M? | 86% |
| mladjo.AIR 0.7 | mladjo.AIR | 1 | 35 | 272 | 7.2% | 5.6% ± 1.4 | 14.7% | 23.3% / 20.3% | 5.3% | 0 / 0 | T2/M1 | 81% |
| bayen.UbaRamLT 1.0 | bayen.UbaRamLT | 1 | 35 | 288 | 46.1% | 7.5% ± 4.0 | 41.5% | 16.1% / 15.1% | 6.3% | 0 / 0 | T?/M? | 79% |
| apv.LauLectrik 1.2 | apv.LauLectrik | 1 | 35 | 288 | 0.0% | 0.0% ± 11.1 | 16.7% | 25.7% / 27.1% | 15.4% | 0 / 0 | T?/M? | 100% |
| dz.OthoMicro 0.12 | dz.OthoMicro | 1 | 35 | 282 | 6.9% | 6.5% ± 1.8 | 14.5% | 28.6% / 27.4% | 36.6% | 0 / 0 | T2/M? | 83% |
| bwbaugh.nano.Tirunculus 0.0.0a | bwbaugh.nano.Tirunculus | 1 | 35 | 330 | 89.7% | 8.5% ± 4.4 | 48.3% | 17.1% / 16.4% | 8.0% | 0 / 0 | T?/M? | 82% |
| kawigi.sbf.FloodSonnet 0.9 | kawigi.sbf.FloodSonnet | 1 | 35 | 320 | 5.4% | 6.3% ± 1.6 | 12.0% | 24.8% / 22.6% | 3.7% | 0 / 0 | T2/M1 | 82% |
| exauge.Leopard 1.1.019 | exauge.Leopard | 1 | 35 | 296 | 45.2% | 11.1% ± 3.9 | 45.4% | 17.7% / 17.1% | 4.2% | 0 / 0 | T?/M? | 80% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.9 vs hadur2.Hadur 3.4

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| sheldor.nano.SabreuseNano 1.1 | 69.6% ± 2.9 | 59.8% ± 1.7 | +9.8 ± 2.7 |
| demetrix.nano.SledgeHammer 0.22 | 68.5% ± 1.1 | 63.7% ± 1.9 | +4.9 ± 2.2 |
| slugzilla.ButtHead 2.0 | 68.5% ± 2.5 | 62.4% ± 1.3 | +6.1 ± 2.7 |
| sheldor.nano.Sabreur 1.1.2 | 68.6% ± 4.3 | 63.2% ± 2.3 | +5.4 ± 4.5 |
| maribo.FollowFire 1.11 | 69.7% ± 3.4 | 64.6% ± 1.7 | +5.2 ± 3.8 |
| jk.nano.Machete 2.0 | 72.5% ± 2.1 | 64.5% ± 2.3 | +8.0 ± 3.8 |
| suzushin7.nano.Galaxy03 1.01 | 72.4% ± 2.0 | 71.8% ± 1.0 | +0.6 ± 2.6 |
| suh.nano.RammingC 1.00 | 73.8% ± 2.0 | 70.8% ± 1.2 | +2.9 ± 1.7 |
| jab.micro.Sanguijuela 0.8 | 70.2% ± 1.2 | 63.3% ± 2.7 | +6.9 ± 3.2 |
| wompi.Kowari 1.6 | 74.2% ± 1.2 | 65.0% ± 1.8 | +9.2 ± 2.5 |
| step.nanoPri 1.0 | 74.3% ± 2.1 | 72.0% ± 1.5 | +2.3 ± 2.1 |
| oog.nano.Caligula 1.15 | 73.6% ± 2.9 | 67.3% ± 3.0 | +6.4 ± 3.4 |
| benhorner.PureAggression 0.2.6 | 75.6% ± 1.1 | 63.0% ± 1.9 | +12.6 ± 2.0 |
| radnor.RamRod 1.0 | 79.2% ± 2.5 | 68.0% ± 2.2 | +11.2 ± 3.2 |
| bvh.mini.Mjolnir 0.3 | 78.5% ± 1.9 | 72.0% ± 1.4 | +6.5 ± 2.1 |
| asm.Statistas 0.1 | 79.6% ± 3.7 | 78.7% ± 2.7 | +1.0 ± 3.9 |
| pez.frankie.Frankie 0.9.6.1 | 99.1% ± 1.1 | 99.1% ± 1.8 | +0.0 ± 2.2 |
| stelo.Lifestealer 1.0 | 80.9% ± 1.9 | 79.0% ± 1.8 | +1.9 ± 1.1 |
| blir.nano.Bruce R1.0.0 | 79.2% ± 1.1 | 75.8% ± 0.9 | +3.4 ± 1.3 |
| myl.nano.Kakuru 1.20 | 79.3% ± 2.4 | 80.3% ± 2.5 | -1.0 ± 2.2 |
| EH.Fusion 0.32 | 80.7% ± 2.2 | 80.0% ± 3.1 | +0.6 ± 2.6 |
| mahrgell.mahrram 1.3 | 78.5% ± 1.9 | 64.1% ± 2.6 | +14.4 ± 2.6 |
| stelo.MirrorMicro 1.1 | 92.5% ± 0.6 | 65.7% ± 3.6 | +26.8 ± 3.9 |
| stelo.PianistNano 1.3 | 82.6% ± 4.4 | 81.7% ± 1.8 | +0.9 ± 5.5 |
| supersample.SuperRamFire 1.0 | 82.8% ± 3.3 | 85.5% ± 1.3 | -2.7 ± 3.7 |
| mladjo.AIR 0.7 | 83.4% ± 2.3 | 82.2% ± 1.7 | +1.2 ± 3.6 |
| bayen.UbaRamLT 1.0 | 80.4% ± 2.6 | 69.5% ± 1.3 | +10.9 ± 2.6 |
| apv.LauLectrik 1.2 | 99.7% ± 0.3 | 98.4% ± 2.2 | +1.3 ± 2.3 |
| dz.OthoMicro 0.12 | 78.3% ± 4.5 | 79.7% ± 4.0 | -1.4 ± 6.1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 83.6% ± 1.1 | 69.6% ± 1.6 | +14.0 ± 1.8 |
| kawigi.sbf.FloodSonnet 0.9 | 80.9% ± 4.4 | 79.2% ± 3.3 | +1.7 ± 5.9 |
| exauge.Leopard 1.1.019 | 81.5% ± 2.6 | 69.6% ± 1.3 | +11.9 ± 2.9 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| sheldor.nano.SabreuseNano 1.1 | +9.8 ± 2.7 | +11.1 ± 4.6 | +11.1 ± 4.7 | +2.6 ± 1.9 |
| demetrix.nano.SledgeHammer 0.22 | +4.9 ± 2.2 | +4.4 ± 4.1 | +4.3 ± 4.0 | -0.2 ± 1.6 |
| slugzilla.ButtHead 2.0 | +6.1 ± 2.7 | +7.9 ± 4.4 | +7.9 ± 4.4 | +0.6 ± 0.7 |
| sheldor.nano.Sabreur 1.1.2 | +5.4 ± 4.5 | +4.7 ± 5.7 | +4.6 ± 5.6 | +0.7 ± 1.9 |
| maribo.FollowFire 1.11 | +5.2 ± 3.8 | +1.1 ± 5.0 | +1.1 ± 4.9 | +0.4 ± 1.7 |
| jk.nano.Machete 2.0 | +8.0 ± 3.8 | +5.4 ± 6.3 | +5.4 ± 6.3 | +3.0 ± 2.0 |
| suzushin7.nano.Galaxy03 1.01 | +0.6 ± 2.6 | +1.1 ± 2.2 | +1.1 ± 2.2 | -2.9 ± 2.4 |
| suh.nano.RammingC 1.00 | +2.9 ± 1.7 | +0.0 ± 1.8 | +0.0 ± 1.8 | -2.0 ± 1.3 |
| jab.micro.Sanguijuela 0.8 | +6.9 ± 3.2 | +6.0 ± 5.1 | +5.7 ± 4.9 | +0.8 ± 1.7 |
| wompi.Kowari 1.6 | +9.2 ± 2.5 | +5.7 ± 2.9 | +5.7 ± 2.9 | +2.1 ± 2.1 |
| step.nanoPri 1.0 | +2.3 ± 2.1 | +0.4 ± 3.0 | +0.4 ± 3.0 | -2.1 ± 1.9 |
| oog.nano.Caligula 1.15 | +6.4 ± 3.4 | +0.7 ± 5.1 | +0.7 ± 5.1 | +1.9 ± 2.3 |
| benhorner.PureAggression 0.2.6 | +12.6 ± 2.0 | +9.3 ± 4.0 | +9.3 ± 4.0 | +7.5 ± 1.7 |
| radnor.RamRod 1.0 | +11.2 ± 3.2 | +4.0 ± 4.5 | +3.9 ± 4.4 | +6.4 ± 2.4 |
| bvh.mini.Mjolnir 0.3 | +6.5 ± 2.1 | +0.7 ± 3.1 | +0.7 ± 3.1 | +2.7 ± 2.4 |
| asm.Statistas 0.1 | +1.0 ± 3.9 | +0.7 ± 3.6 | +0.7 ± 3.6 | +0.3 ± 4.8 |
| pez.frankie.Frankie 0.9.6.1 | +0.0 ± 2.2 | +0.4 ± 0.8 | +0.4 ± 0.8 | -7.6 ± 37.4 |
| stelo.Lifestealer 1.0 | +1.9 ± 1.1 | +0.4 ± 1.5 | +0.4 ± 1.5 | +1.1 ± 1.5 |
| blir.nano.Bruce R1.0.0 | +3.4 ± 1.3 | +5.7 ± 3.2 | +5.7 ± 3.1 | +4.7 ± 1.3 |
| myl.nano.Kakuru 1.20 | -1.0 ± 2.2 | +1.1 ± 2.8 | +1.1 ± 2.8 | -2.1 ± 2.9 |
| EH.Fusion 0.32 | +0.6 ± 2.6 | +0.4 ± 2.4 | +0.4 ± 2.4 | -2.8 ± 2.8 |
| mahrgell.mahrram 1.3 | +14.4 ± 2.6 | +8.6 ± 3.6 | +8.6 ± 3.6 | +8.2 ± 2.6 |
| stelo.MirrorMicro 1.1 | +26.8 ± 3.9 | +24.4 ± 5.0 | +24.3 ± 4.9 | +31.1 ± 2.8 |
| stelo.PianistNano 1.3 | +0.9 ± 5.5 | +1.1 ± 5.6 | +1.1 ± 5.6 | +0.6 ± 6.9 |
| supersample.SuperRamFire 1.0 | -2.7 ± 3.7 | -1.8 ± 3.4 | -1.8 ± 3.4 | -4.4 ± 4.3 |
| mladjo.AIR 0.7 | +1.2 ± 3.6 | +1.4 ± 3.1 | +1.4 ± 3.1 | +1.3 ± 3.8 |
| bayen.UbaRamLT 1.0 | +10.9 ± 2.6 | +1.1 ± 1.2 | +1.1 ± 1.2 | +7.7 ± 3.6 |
| apv.LauLectrik 1.2 | +1.3 ± 2.3 | +0.4 ± 0.8 | +0.4 ± 0.8 | +12.0 ± 27.6 |
| dz.OthoMicro 0.12 | -1.4 ± 6.1 | -0.7 ± 6.4 | -0.7 ± 6.4 | -2.4 ± 5.7 |
| bwbaugh.nano.Tirunculus 0.0.0a | +14.0 ± 1.8 | +0.7 ± 2.1 | +0.7 ± 2.1 | +9.4 ± 1.2 |
| kawigi.sbf.FloodSonnet 0.9 | +1.7 ± 5.9 | +1.8 ± 6.5 | +1.8 ± 6.5 | +0.9 ± 5.5 |
| exauge.Leopard 1.1.019 | +11.9 ± 2.9 | +3.9 ± 2.5 | +3.9 ± 2.5 | +7.5 ± 2.9 |
| All pairs | +5.7 ± 0.9 | +3.5 ± 0.8 | +3.5 ± 0.8 | +2.7 ± 1.5 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or, for a Hadur build, a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| sheldor.nano.SabreuseNano 1.1 | 8 | 0 | +9.8 ± 2.7 | n/a |
| demetrix.nano.SledgeHammer 0.22 | 8 | 5 | +4.9 ± 2.2 | +4.3 ± 3.5 |
| slugzilla.ButtHead 2.0 | 8 | 6 | +6.1 ± 2.7 | +6.7 ± 3.6 |
| sheldor.nano.Sabreur 1.1.2 | 8 | 4 | +5.4 ± 4.5 | +2.6 ± 5.9 |
| maribo.FollowFire 1.11 | 8 | 6 | +5.2 ± 3.8 | +4.3 ± 5.3 |
| jk.nano.Machete 2.0 | 8 | 2 | +8.0 ± 3.8 | +4.7 ± 50.4 |
| suzushin7.nano.Galaxy03 1.01 | 8 | 6 | +0.6 ± 2.6 | +1.1 ± 3.7 |
| suh.nano.RammingC 1.00 | 8 | 5 | +2.9 ± 1.7 | +3.9 ± 2.1 |
| jab.micro.Sanguijuela 0.8 | 8 | 6 | +6.9 ± 3.2 | +8.7 ± 2.2 |
| wompi.Kowari 1.6 | 8 | 7 | +9.2 ± 2.5 | +9.2 ± 3.0 |
| step.nanoPri 1.0 | 8 | 6 | +2.3 ± 2.1 | +3.1 ± 2.4 |
| oog.nano.Caligula 1.15 | 8 | 6 | +6.4 ± 3.4 | +6.1 ± 4.9 |
| benhorner.PureAggression 0.2.6 | 8 | 7 | +12.6 ± 2.0 | +12.4 ± 2.3 |
| radnor.RamRod 1.0 | 8 | 5 | +11.2 ± 3.2 | +11.3 ± 2.9 |
| bvh.mini.Mjolnir 0.3 | 8 | 4 | +6.5 ± 2.1 | +7.3 ± 3.8 |
| asm.Statistas 0.1 | 8 | 5 | +1.0 ± 3.9 | +1.1 ± 7.5 |
| pez.frankie.Frankie 0.9.6.1 | 8 | 5 | +0.0 ± 2.2 | +0.1 ± 0.4 |
| stelo.Lifestealer 1.0 | 8 | 7 | +1.9 ± 1.1 | +2.1 ± 1.1 |
| blir.nano.Bruce R1.0.0 | 8 | 7 | +3.4 ± 1.3 | +3.2 ± 1.4 |
| myl.nano.Kakuru 1.20 | 8 | 6 | -1.0 ± 2.2 | -0.9 ± 3.1 |
| EH.Fusion 0.32 | 8 | 8 | +0.6 ± 2.6 | +0.6 ± 2.6 |
| mahrgell.mahrram 1.3 | 8 | 6 | +14.4 ± 2.6 | +13.5 ± 3.1 |
| stelo.MirrorMicro 1.1 | 8 | 4 | +26.8 ± 3.9 | +26.5 ± 9.4 |
| stelo.PianistNano 1.3 | 8 | 6 | +0.9 ± 5.5 | +3.7 ± 4.9 |
| supersample.SuperRamFire 1.0 | 8 | 7 | -2.7 ± 3.7 | -2.5 ± 4.4 |
| mladjo.AIR 0.7 | 8 | 5 | +1.2 ± 3.6 | +0.7 ± 4.6 |
| bayen.UbaRamLT 1.0 | 8 | 5 | +10.9 ± 2.6 | +11.2 ± 3.5 |
| apv.LauLectrik 1.2 | 8 | 6 | +1.3 ± 2.3 | -0.0 ± 0.5 |
| dz.OthoMicro 0.12 | 8 | 4 | -1.4 ± 6.1 | -1.3 ± 17.0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 6 | +14.0 ± 1.8 | +14.6 ± 2.3 |
| kawigi.sbf.FloodSonnet 0.9 | 8 | 6 | +1.7 ± 5.9 | +1.0 ± 8.6 |
| exauge.Leopard 1.1.019 | 8 | 6 | +11.9 ± 2.9 | +13.7 ± 1.6 |
| All pairs | 256 | 174 | +5.7 ± 0.9 | +5.4 ± 1.0 |

# Bench: hadur2.Hadur 3.9 baseline (hadur2.Hadur 3.4) (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 2832 over 256 battles (11.1 per battle, most in one battle 50). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sheldor.nano.SabreuseNano 1.1 | weak | 59.8% ± 1.7 | 84.6% ± 3.4 | 57.8% ± 1.5 | 237 / 280 | 76.9% ± 2.9 | 62.2% ± 5.4 | 87 | 0 | 0.64 / 133.6 |
| demetrix.nano.SledgeHammer 0.22 | weak | 63.7% ± 1.9 | 91.3% ± 3.2 | 59.4% ± 1.3 | 256 / 280 | 79.6% ± 1.8 | 53.6% ± 2.8 | 84 | 0 | 0.56 / 78.1 |
| slugzilla.ButtHead 2.0 | weak | 62.4% ± 1.3 | 88.2% ± 3.0 | 59.4% ± 0.3 | 247 / 280 | 79.4% ± 2.6 | 60.9% ± 5.6 | 78 | 0 | 0.56 / 11.9 |
| sheldor.nano.Sabreur 1.1.2 | weak | 63.2% ± 2.3 | 89.2% ± 4.3 | 60.6% ± 1.3 | 250 / 280 | 77.9% ± 1.3 | 60.6% ± 8.9 | 83 | 0 | 0.58 / 11.1 |
| maribo.FollowFire 1.11 | weak | 64.6% ± 1.7 | 93.9% ± 3.0 | 60.6% ± 1.6 | 263 / 280 | 74.7% ± 1.7 | 50.5% ± 5.5 | 79 | 0 | 0.55 / 13.1 |
| jk.nano.Machete 2.0 | weak | 64.5% ± 2.3 | 92.1% ± 5.1 | 59.8% ± 1.5 | 258 / 280 | 79.5% ± 2.7 | 59.4% ± 8.3 | 89 | 0 | 0.56 / 12.7 |
| suzushin7.nano.Galaxy03 1.01 | weak | 71.8% ± 1.0 | 96.8% ± 1.6 | 66.7% ± 1.1 | 271 / 280 | 83.9% ± 0.8 | 43.7% ± 2.8 | 99 | 0 | 0.52 / 12.1 |
| suh.nano.RammingC 1.00 | weak | 70.8% ± 1.2 | 98.6% ± 1.3 | 65.4% ± 1.4 | 276 / 280 | 88.8% ± 1.5 | 49.7% ± 4.7 | 81 | 0 | 0.52 / 73.4 |
| jab.micro.Sanguijuela 0.8 | weak | 63.3% ± 2.7 | 90.8% ± 4.9 | 59.8% ± 1.6 | 255 / 280 | 80.3% ± 1.6 | 57.2% ± 2.8 | 78 | 0 | 0.53 / 12.8 |
| wompi.Kowari 1.6 | weak | 65.0% ± 1.8 | 93.6% ± 2.8 | 62.7% ± 1.6 | 262 / 280 | 76.0% ± 3.2 | 54.1% ± 4.2 | 90 | 0 | 0.58 / 33.1 |
| step.nanoPri 1.0 | weak | 72.0% ± 1.5 | 98.2% ± 2.6 | 66.8% ± 0.9 | 275 / 280 | 84.4% ± 1.7 | 44.8% ± 4.3 | 83 | 0 | 0.52 / 11.5 |
| oog.nano.Caligula 1.15 | weak | 67.3% ± 3.0 | 93.9% ± 4.3 | 63.5% ± 2.1 | 263 / 280 | 74.3% ± 2.0 | 48.2% ± 4.2 | 82 | 0 | 0.56 / 15.0 |
| benhorner.PureAggression 0.2.6 | weak | 63.0% ± 1.9 | 88.2% ± 4.7 | 58.8% ± 1.3 | 247 / 280 | 83.9% ± 1.1 | 65.3% ± 7.5 | 91 | 0 | 0.55 / 9.9 |
| radnor.RamRod 1.0 | weak | 68.0% ± 2.2 | 94.9% ± 3.1 | 63.6% ± 2.1 | 266 / 280 | 79.9% ± 2.6 | 48.0% ± 7.2 | 79 | 0 | 0.52 / 11.8 |
| bvh.mini.Mjolnir 0.3 | weak | 72.0% ± 1.4 | 97.1% ± 2.9 | 66.2% ± 1.1 | 272 / 280 | 67.9% ± 2.1 | 40.0% ± 5.3 | 94 | 0 | 0.71 / 15.5 |
| asm.Statistas 0.1 | weak | 78.7% ± 2.7 | 95.4% ± 3.1 | 60.6% ± 2.6 | 267 / 280 | 13.8% ± 1.0 | 8.3% ± 4.1 | 100 | 0 | 0.89 / 13.9 |
| pez.frankie.Frankie 0.9.6.1 | weak | 99.1% ± 1.8 | 99.6% ± 0.8 | 85.2% ± 27.7 | 279 / 280 | 0.8% ± 0.4 | 1.8% ± 4.2 | 44 | 0 | 0.55 / 164.7 |
| stelo.Lifestealer 1.0 | weak | 79.0% ± 1.8 | 98.6% ± 1.8 | 69.9% ± 1.9 | 276 / 280 | 73.8% ± 2.2 | 40.1% ± 6.4 | 79 | 0 | 0.55 / 11.2 |
| blir.nano.Bruce R1.0.0 | weak | 75.8% ± 0.9 | 93.5% ± 2.8 | 63.3% ± 1.0 | 262 / 280 | 84.1% ± 0.8 | 49.0% ± 4.7 | 76 | 0 | 0.52 / 45.4 |
| myl.nano.Kakuru 1.20 | weak | 80.3% ± 2.5 | 94.6% ± 3.2 | 64.1% ± 3.5 | 265 / 280 | 16.3% ± 2.2 | 7.5% ± 3.5 | 89 | 0 | 0.85 / 14.6 |
| EH.Fusion 0.32 | weak | 80.0% ± 3.1 | 97.9% ± 2.5 | 74.9% ± 2.5 | 274 / 280 | 68.1% ± 2.2 | 22.9% ± 3.6 | 65 | 0 | 0.55 / 11.4 |
| mahrgell.mahrram 1.3 | weak | 64.1% ± 2.6 | 90.0% ± 3.8 | 62.0% ± 2.0 | 252 / 280 | 75.9% ± 2.0 | 49.5% ± 2.9 | 68 | 0 | 0.52 / 13.0 |
| stelo.MirrorMicro 1.1 | weak | 65.7% ± 3.6 | 75.6% ± 5.0 | 54.7% ± 2.2 | 212 / 280 | 11.2% ± 0.3 | 6.8% ± 1.4 | 357 | 0 | 1.01 / 19.0 |
| stelo.PianistNano 1.3 | weak | 81.7% ± 1.8 | 95.7% ± 2.9 | 65.9% ± 2.8 | 268 / 280 | 16.0% ± 0.8 | 5.2% ± 0.4 | 84 | 0 | 0.84 / 11.9 |
| supersample.SuperRamFire 1.0 | weak | 85.5% ± 1.3 | 97.9% ± 1.1 | 80.0% ± 0.8 | 274 / 280 | 60.8% ± 2.1 | 15.9% ± 1.4 | 77 | 0 | 0.58 / 13.3 |
| mladjo.AIR 0.7 | weak | 82.2% ± 1.7 | 95.4% ± 2.2 | 68.3% ± 2.2 | 267 / 280 | 15.3% ± 0.9 | 7.9% ± 5.0 | 86 | 0 | 0.87 / 13.2 |
| bayen.UbaRamLT 1.0 | weak | 69.5% ± 1.3 | 97.1% ± 1.3 | 64.7% ± 1.2 | 272 / 280 | 73.8% ± 2.2 | 60.1% ± 3.3 | 62 | 0 | 0.44 / 11.3 |
| apv.LauLectrik 1.2 | weak | 98.4% ± 2.2 | 99.6% ± 0.8 | 71.5% ± 27.7 | 279 / 280 | 0.6% ± 0.3 | 3.6% ± 5.5 | 47 | 0 | 0.56 / 14.8 |
| dz.OthoMicro 0.12 | weak | 79.7% ± 4.0 | 92.9% ± 4.8 | 65.9% ± 3.5 | 260 / 280 | 15.8% ± 1.1 | 5.3% ± 0.6 | 83 | 0 | 0.87 / 14.0 |
| bwbaugh.nano.Tirunculus 0.0.0a | weak | 69.6% ± 1.6 | 98.6% ± 1.3 | 66.6% ± 1.4 | 276 / 280 | 89.3% ± 1.0 | 84.0% ± 3.1 | 71 | 0 | 0.42 / 13.0 |
| kawigi.sbf.FloodSonnet 0.9 | weak | 79.2% ± 3.3 | 92.9% ± 3.8 | 64.5% ± 2.8 | 260 / 280 | 14.1% ± 1.1 | 6.9% ± 3.0 | 96 | 0 | 0.89 / 15.0 |
| exauge.Leopard 1.1.019 | weak | 69.6% ± 1.3 | 95.0% ± 1.7 | 65.1% ± 1.1 | 266 / 280 | 85.1% ± 1.2 | 50.7% ± 2.6 | 71 | 0 | 0.53 / 160.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| sheldor.nano.SabreuseNano 1.1 | 8 | 4018 | 6.7% | 50.7% | 37.9% | 4.7% | 286 |
| demetrix.nano.SledgeHammer 0.22 | 8 | 3577 | 4.2% | 52.9% | 39.6% | 3.3% | 269 |
| slugzilla.ButtHead 2.0 | 8 | 3685 | 5.6% | 51.8% | 38.7% | 3.9% | 278 |
| sheldor.nano.Sabreur 1.1.2 | 8 | 3526 | 5.3% | 52.4% | 38.6% | 3.7% | 285 |
| maribo.FollowFire 1.11 | 8 | 3438 | 3.1% | 53.7% | 40.9% | 2.3% | 280 |
| jk.nano.Machete 2.0 | 8 | 3460 | 4.0% | 55.5% | 37.8% | 2.8% | 284 |
| suzushin7.nano.Galaxy03 1.01 | 8 | 2456 | 2.3% | 59.0% | 37.1% | 1.6% | 265 |
| suh.nano.RammingC 1.00 | 8 | 2652 | 0.9% | 57.4% | 40.8% | 0.8% | 263 |
| jab.micro.Sanguijuela 0.8 | 8 | 3573 | 4.4% | 52.5% | 39.7% | 3.4% | 266 |
| wompi.Kowari 1.6 | 8 | 3370 | 3.3% | 52.5% | 41.7% | 2.4% | 289 |
| step.nanoPri 1.0 | 8 | 2427 | 1.3% | 59.2% | 38.0% | 1.5% | 266 |
| oog.nano.Caligula 1.15 | 8 | 2993 | 3.6% | 55.5% | 38.3% | 2.6% | 288 |
| benhorner.PureAggression 0.2.6 | 8 | 3766 | 5.5% | 54.1% | 36.3% | 4.1% | 267 |
| radnor.RamRod 1.0 | 8 | 2910 | 3.0% | 56.5% | 37.7% | 2.8% | 270 |
| bvh.mini.Mjolnir 0.3 | 8 | 2351 | 2.1% | 62.4% | 33.6% | 1.9% | 327 |
| asm.Statistas 0.1 | 8 | 967 | 8.4% | 88.1% | 0.0% | 3.5% | 645 |
| pez.frankie.Frankie 0.9.6.1 | 8 | 20 | 31.1% | 54.7% | 0.0% | 14.3% | 160 |
| stelo.Lifestealer 1.0 | 8 | 1712 | 1.5% | 78.3% | 19.3% | 0.9% | 286 |
| blir.nano.Bruce R1.0.0 | 8 | 2204 | 5.1% | 89.7% | 2.0% | 3.2% | 279 |
| myl.nano.Kakuru 1.20 | 8 | 884 | 10.6% | 84.3% | 0.1% | 5.0% | 532 |
| EH.Fusion 0.32 | 8 | 1441 | 2.6% | 65.9% | 29.7% | 1.9% | 290 |
| mahrgell.mahrram 1.3 | 8 | 3452 | 5.1% | 49.8% | 41.5% | 3.6% | 273 |
| stelo.MirrorMicro 1.1 | 8 | 1509 | 28.2% | 61.3% | 0.0% | 10.6% | 1575 |
| stelo.PianistNano 1.3 | 8 | 816 | 9.2% | 86.5% | 0.0% | 4.4% | 543 |
| supersample.SuperRamFire 1.0 | 8 | 940 | 4.0% | 73.5% | 19.8% | 2.7% | 308 |
| mladjo.AIR 0.7 | 8 | 834 | 9.7% | 86.3% | 0.0% | 4.0% | 664 |
| bayen.UbaRamLT 1.0 | 8 | 2821 | 1.8% | 56.4% | 40.4% | 1.5% | 281 |
| apv.LauLectrik 1.2 | 8 | 35 | 17.9% | 72.1% | 0.0% | 10.0% | 163 |
| dz.OthoMicro 0.12 | 8 | 943 | 13.3% | 80.4% | 0.0% | 6.3% | 580 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 2894 | 0.9% | 53.2% | 45.0% | 0.9% | 267 |
| kawigi.sbf.FloodSonnet 0.9 | 8 | 957 | 13.1% | 80.9% | 0.1% | 6.0% | 634 |
| exauge.Leopard 1.1.019 | 8 | 2823 | 3.1% | 56.5% | 38.2% | 2.3% | 270 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sheldor.nano.SabreuseNano 1.1 | 8 | 2 | 3166 | 0 | 0.31 | 1 | 1 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 8 | 6 | 252 | 0 | 0.30 | 0 | 0 | 0 |
| slugzilla.ButtHead 2.0 | 8 | 6 | 1112 | 0 | 0.28 | 0 | 0 | 0 |
| sheldor.nano.Sabreur 1.1.2 | 8 | 4 | 1419 | 0 | 0.30 | 1 | 1 | 0 |
| maribo.FollowFire 1.11 | 8 | 6 | 142 | 0 | 0.28 | 1 | 0 | 0 |
| jk.nano.Machete 2.0 | 8 | 3 | 2521 | 0 | 0.32 | 1 | 1 | 0 |
| suzushin7.nano.Galaxy03 1.01 | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| suh.nano.RammingC 1.00 | 8 | 7 | 169 | 0 | 0.29 | 0 | 0 | 0 |
| jab.micro.Sanguijuela 0.8 | 8 | 7 | 127 | 0 | 0.28 | 0 | 0 | 0 |
| wompi.Kowari 1.6 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| step.nanoPri 1.0 | 8 | 7 | 176 | 0 | 0.30 | 0 | 0 | 0 |
| oog.nano.Caligula 1.15 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| benhorner.PureAggression 0.2.6 | 8 | 7 | 121 | 0 | 0.33 | 0 | 0 | 0 |
| radnor.RamRod 1.0 | 8 | 5 | 315 | 0 | 0.28 | 1 | 1 | 0 |
| bvh.mini.Mjolnir 0.3 | 8 | 7 | 640 | 0 | 0.34 | 0 | 0 | 0 |
| asm.Statistas 0.1 | 8 | 6 | 882 | 0 | 0.36 | 0 | 0 | 0 |
| pez.frankie.Frankie 0.9.6.1 | 8 | 7 | 498 | 0 | 0.16 | 0 | 0 | 8 |
| stelo.Lifestealer 1.0 | 8 | 7 | 392 | 0 | 0.28 | 0 | 0 | 0 |
| blir.nano.Bruce R1.0.0 | 8 | 7 | 165 | 0 | 0.27 | 0 | 0 | 0 |
| myl.nano.Kakuru 1.20 | 8 | 7 | 551 | 0 | 0.32 | 0 | 0 | 0 |
| EH.Fusion 0.32 | 8 | 8 | 0 | 0 | 0.23 | 0 | 0 | 0 |
| mahrgell.mahrram 1.3 | 8 | 7 | 0 | 0 | 0.24 | 1 | 1 | 0 |
| stelo.MirrorMicro 1.1 | 8 | 4 | 1359 | 0 | 1.28 | 3 | 3 | 0 |
| stelo.PianistNano 1.3 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| supersample.SuperRamFire 1.0 | 8 | 7 | 123 | 0 | 0.28 | 0 | 0 | 0 |
| mladjo.AIR 0.7 | 8 | 7 | 690 | 0 | 0.31 | 0 | 0 | 0 |
| bayen.UbaRamLT 1.0 | 8 | 6 | 82 | 0 | 0.22 | 1 | 1 | 0 |
| apv.LauLectrik 1.2 | 8 | 6 | 982 | 0 | 0.17 | 0 | 0 | 8 |
| dz.OthoMicro 0.12 | 8 | 7 | 0 | 0 | 0.30 | 1 | 1 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 7 | 54 | 0 | 0.25 | 0 | 0 | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8 | 7 | 412 | 0 | 0.34 | 0 | 0 | 0 |
| exauge.Leopard 1.1.019 | 8 | 8 | 0 | 0 | 0.25 | 0 | 0 | 0 |

207 of 256 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| sheldor.nano.SabreuseNano 1.1 | 2097 | 21 | 1875 | 1872 (89.3%) | 225 (10.7%) | 3 (0.2%) | 8535 | 660 | 21 |
| demetrix.nano.SledgeHammer 0.22 | 1717 | 35 | 1702 | 1702 (99.1%) | 15 (0.9%) | 0 (0.0%) | 8103 | 647 | 20 |
| slugzilla.ButtHead 2.0 | 1946 | 30 | 1867 | 1863 (95.7%) | 83 (4.3%) | 4 (0.2%) | 8045 | 652 | 23 |
| sheldor.nano.Sabreur 1.1.2 | 2065 | 14 | 1969 | 1965 (95.2%) | 100 (4.8%) | 4 (0.2%) | 7628 | 630 | 25 |
| maribo.FollowFire 1.11 | 1891 | 22 | 1885 | 1882 (99.5%) | 9 (0.5%) | 3 (0.2%) | 7863 | 617 | 17 |
| jk.nano.Machete 2.0 | 2005 | 42 | 1833 | 1827 (91.1%) | 178 (8.9%) | 6 (0.3%) | 7431 | 683 | 21 |
| suzushin7.nano.Galaxy03 1.01 | 1584 | 50 | 1589 | 1584 (100.0%) | 0 (0.0%) | 5 (0.3%) | 5359 | 457 | 20 |
| suh.nano.RammingC 1.00 | 1567 | 58 | 1561 | 1557 (99.4%) | 10 (0.6%) | 4 (0.3%) | 6279 | 529 | 18 |
| jab.micro.Sanguijuela 0.8 | 1592 | 31 | 1588 | 1584 (99.5%) | 8 (0.5%) | 4 (0.3%) | 8224 | 668 | 18 |
| wompi.Kowari 1.6 | 2232 | 30 | 2261 | 2232 (100.0%) | 0 (0.0%) | 29 (1.3%) | 7883 | 627 | 18 |
| step.nanoPri 1.0 | 1601 | 41 | 1595 | 1590 (99.3%) | 11 (0.7%) | 5 (0.3%) | 5399 | 459 | 22 |
| oog.nano.Caligula 1.15 | 2134 | 36 | 2138 | 2134 (100.0%) | 0 (0.0%) | 4 (0.2%) | 6469 | 536 | 18 |
| benhorner.PureAggression 0.2.6 | 1742 | 59 | 1717 | 1712 (98.3%) | 30 (1.7%) | 5 (0.3%) | 7800 | 614 | 27 |
| radnor.RamRod 1.0 | 1677 | 15 | 1662 | 1658 (98.9%) | 19 (1.1%) | 4 (0.2%) | 6299 | 536 | 20 |
| bvh.mini.Mjolnir 0.3 | 2726 | 11 | 2685 | 2684 (98.5%) | 42 (1.5%) | 1 (0.0%) | 4451 | 408 | 25 |
| asm.Statistas 0.1 | 7038 | 25 | 7000 | 6983 (99.2%) | 55 (0.8%) | 17 (0.2%) | 253 | 103 | 39 |
| pez.frankie.Frankie 0.9.6.1 | 160 | 2 | 127 | 127 (79.4%) | 33 (20.6%) | 0 (0.0%) | 5 | 4 | 15 |
| stelo.Lifestealer 1.0 | 1799 | 38 | 1779 | 1777 (98.8%) | 22 (1.2%) | 2 (0.1%) | 4050 | 330 | 21 |
| blir.nano.Bruce R1.0.0 | 1877 | 32 | 1868 | 1867 (99.5%) | 10 (0.5%) | 1 (0.1%) | 4659 | 500 | 24 |
| myl.nano.Kakuru 1.20 | 6089 | 16 | 6060 | 6051 (99.4%) | 38 (0.6%) | 9 (0.1%) | 967 | 130 | 20 |
| EH.Fusion 0.32 | 2079 | 13 | 2082 | 2079 (100.0%) | 0 (0.0%) | 3 (0.1%) | 2680 | 264 | 14 |
| mahrgell.mahrram 1.3 | 1870 | 22 | 1878 | 1870 (100.0%) | 0 (0.0%) | 8 (0.4%) | 7977 | 641 | 20 |
| stelo.MirrorMicro 1.1 | 32012 | 23 | 32032 | 31883 (99.6%) | 129 (0.4%) | 149 (0.5%) | 2668 | 241 | 541 |
| stelo.PianistNano 1.3 | 6304 | 16 | 6312 | 6301 (100.0%) | 3 (0.0%) | 11 (0.2%) | 670 | 125 | 27 |
| supersample.SuperRamFire 1.0 | 2379 | 12 | 2384 | 2370 (99.6%) | 9 (0.4%) | 14 (0.6%) | 1216 | 174 | 17 |
| mladjo.AIR 0.7 | 9689 | 17 | 9638 | 9638 (99.5%) | 51 (0.5%) | 0 (0.0%) | 217 | 109 | 23 |
| bayen.UbaRamLT 1.0 | 1288 | 58 | 1286 | 1283 (99.6%) | 5 (0.4%) | 3 (0.2%) | 7477 | 587 | 20 |
| apv.LauLectrik 1.2 | 209 | 1 | 148 | 148 (70.8%) | 61 (29.2%) | 0 (0.0%) | 0 | 2 | 13 |
| dz.OthoMicro 0.12 | 7209 | 45 | 7213 | 7209 (100.0%) | 0 (0.0%) | 4 (0.1%) | 312 | 97 | 20 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1012 | 30 | 1012 | 1009 (99.7%) | 3 (0.3%) | 3 (0.3%) | 7272 | 569 | 15 |
| kawigi.sbf.FloodSonnet 0.9 | 7623 | 49 | 7595 | 7593 (99.6%) | 30 (0.4%) | 2 (0.0%) | 243 | 101 | 85 |
| exauge.Leopard 1.1.019 | 1746 | 3 | 1747 | 1746 (100.0%) | 0 (0.0%) | 1 (0.1%) | 6120 | 517 | 21 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| sheldor.nano.SabreuseNano 1.1 | 2106 | 56 (2.7%) | 911 |
| demetrix.nano.SledgeHammer 0.22 | 1765 | 18 (1.0%) | 0 |
| slugzilla.ButtHead 2.0 | 1936 | 46 (2.4%) | 482 |
| sheldor.nano.Sabreur 1.1.2 | 2084 | 75 (3.6%) | 960 |
| maribo.FollowFire 1.11 | 1958 | 38 (1.9%) | 0 |
| jk.nano.Machete 2.0 | 2042 | 33 (1.6%) | 0 |
| suzushin7.nano.Galaxy03 1.01 | 1725 | 16 (0.9%) | 0 |
| suh.nano.RammingC 1.00 | 1661 | 3 (0.2%) | 0 |
| jab.micro.Sanguijuela 0.8 | 1721 | 26 (1.5%) | 0 |
| wompi.Kowari 1.6 | 2159 | 70 (3.2%) | 540 |
| step.nanoPri 1.0 | 1730 | 11 (0.6%) | 0 |
| oog.nano.Caligula 1.15 | 2142 | 115 (5.4%) | 1551 |
| benhorner.PureAggression 0.2.6 | 1726 | 16 (0.9%) | 0 |
| radnor.RamRod 1.0 | 1790 | 20 (1.1%) | 0 |
| bvh.mini.Mjolnir 0.3 | 2886 | 71 (2.5%) | 305 |
| asm.Statistas 0.1 | 9827 | 483 (4.9%) | 2423 |
| pez.frankie.Frankie 0.9.6.1 | 175 | 8 (4.6%) | 0 |
| stelo.Lifestealer 1.0 | 2109 | 26 (1.2%) | 0 |
| blir.nano.Bruce R1.0.0 | 1972 | 15 (0.8%) | 0 |
| myl.nano.Kakuru 1.20 | 7215 | 399 (5.5%) | 1690 |
| EH.Fusion 0.32 | 2179 | 23 (1.1%) | 0 |
| mahrgell.mahrram 1.3 | 1839 | 59 (3.2%) | 0 |
| stelo.MirrorMicro 1.1 | 32342 | 2659 (8.2%) | 30233 |
| stelo.PianistNano 1.3 | 7449 | 375 (5.0%) | 879 |
| supersample.SuperRamFire 1.0 | 2476 | 165 (6.7%) | 0 |
| mladjo.AIR 0.7 | 9888 | 755 (7.6%) | 4846 |
| bayen.UbaRamLT 1.0 | 2015 | 12 (0.6%) | 0 |
| apv.LauLectrik 1.2 | 243 | 11 (4.5%) | 0 |
| dz.OthoMicro 0.12 | 8243 | 542 (6.6%) | 4313 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1741 | 4 (0.2%) | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 9485 | 551 (5.8%) | 2226 |
| exauge.Leopard 1.1.019 | 1796 | 26 (1.4%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| sheldor.nano.SabreuseNano 1.1 | 650 | 158 | 650 | 136 | 79.6 / 58.2 | 1405 | 654 | 106 |
| demetrix.nano.SledgeHammer 0.22 | 650 | 146 | 650 | 119 | 79.1 / 54.1 | 1457 | 768 | 84 |
| slugzilla.ButtHead 2.0 | 650 | 143 | 650 | 128 | 79.7 / 54.6 | 1395 | 624 | 142 |
| sheldor.nano.Sabreur 1.1.2 | 650 | 151 | 650 | 135 | 81.0 / 52.8 | 1387 | 868 | 185 |
| maribo.FollowFire 1.11 | 650 | 166 | 650 | 130 | 81.1 / 52.8 | 1557 | 637 | 145 |
| jk.nano.Machete 2.0 | 650 | 150 | 650 | 134 | 81.5 / 54.9 | 1453 | 825 | 123 |
| suzushin7.nano.Galaxy03 1.01 | 650 | 168 | 641 | 115 | 82.9 / 41.4 | 1367 | 1927 | 63 |
| suh.nano.RammingC 1.00 | 650 | 157 | 634 | 113 | 82.1 / 43.5 | 1310 | 1325 | 90 |
| jab.micro.Sanguijuela 0.8 | 650 | 135 | 650 | 116 | 79.5 / 53.6 | 1426 | 1190 | 88 |
| wompi.Kowari 1.6 | 650 | 161 | 625 | 139 | 84.7 / 50.6 | 1503 | 919 | 123 |
| step.nanoPri 1.0 | 650 | 166 | 628 | 116 | 82.5 / 41.1 | 1357 | 2125 | 74 |
| oog.nano.Caligula 1.15 | 650 | 161 | 588 | 138 | 82.4 / 47.5 | 1500 | 1177 | 221 |
| benhorner.PureAggression 0.2.6 | 650 | 132 | 650 | 117 | 82.9 / 58.2 | 1473 | 528 | 79 |
| radnor.RamRod 1.0 | 650 | 154 | 641 | 120 | 81.8 / 47.0 | 1474 | 1677 | 76 |
| bvh.mini.Mjolnir 0.3 | 650 | 225 | 541 | 177 | 82.0 / 41.9 | 1889 | 977 | 116 |
| asm.Statistas 0.1 | 650 | 488 | 613 | 495 | 37.6 / 24.3 | 520 | 5714 | 38 |
| pez.frankie.Frankie 0.9.6.1 | 650 | 392 | 638 | 10 | 1.4 / 0.3 | 2 | 185 | 19 |
| stelo.Lifestealer 1.0 | 650 | 163 | 525 | 136 | 88.8 / 38.3 | 1641 | 1535 | 42 |
| blir.nano.Bruce R1.0.0 | 650 | 152 | 650 | 129 | 97.2 / 56.5 | 1631 | 2580 | 23 |
| myl.nano.Kakuru 1.20 | 650 | 470 | 522 | 382 | 38.2 / 21.3 | 1378 | 5570 | 3593 |
| EH.Fusion 0.32 | 650 | 259 | 400 | 140 | 80.2 / 27.1 | 1583 | 2706 | 180 |
| mahrgell.mahrram 1.3 | 650 | 159 | 650 | 123 | 80.0 / 49.1 | 1505 | 642 | 95 |
| stelo.MirrorMicro 1.1 | 650 | 643 | 584 | 1416 | 31.9 / 26.4 | 723 | 2803 | 272 |
| stelo.PianistNano 1.3 | 650 | 483 | 491 | 393 | 39.1 / 20.2 | 1487 | 5801 | 3908 |
| supersample.SuperRamFire 1.0 | 650 | 227 | 400 | 158 | 78.9 / 19.7 | 1706 | 2834 | 322 |
| mladjo.AIR 0.7 | 650 | 463 | 466 | 514 | 44.1 / 20.5 | 1426 | 4097 | 3299 |
| bayen.UbaRamLT 1.0 | 650 | 180 | 650 | 131 | 83.3 / 45.4 | 1504 | 1112 | 83 |
| apv.LauLectrik 1.2 | 650 | 352 | 644 | 13 | 1.1 / 0.7 | 0 | 242 | 0 |
| dz.OthoMicro 0.12 | 650 | 456 | 506 | 430 | 41.9 / 21.7 | 1329 | 6781 | 464 |
| bwbaugh.nano.Tirunculus 0.0.0a | 650 | 178 | 650 | 117 | 87.6 / 44.0 | 1410 | 936 | 150 |
| kawigi.sbf.FloodSonnet 0.9 | 650 | 450 | 603 | 484 | 40.2 / 22.1 | 753 | 6148 | 658 |
| exauge.Leopard 1.1.019 | 650 | 170 | 650 | 120 | 85.1 / 45.5 | 1408 | 681 | 102 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| sheldor.nano.SabreuseNano 1.1 | 62.2% | 87 | 28 | 3 | 5.7 | 43 / 56 (77%) | 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 53.6% | 84 | 67 | 3 | 5.6 | 18 / 18 (100%) | 0 | 0 |
| slugzilla.ButtHead 2.0 | 60.9% | 78 | 49 | 3 | 5.9 | 45 / 46 (98%) | 0 | 0 |
| sheldor.nano.Sabreur 1.1.2 | 60.6% | 83 | 70 | 3 | 6.2 | 70 / 75 (93%) | 0 | 0 |
| maribo.FollowFire 1.11 | 50.5% | 79 | 144 | 3 | 5.8 | 38 / 38 (100%) | 0 | 0 |
| jk.nano.Machete 2.0 | 59.4% | 89 | 43 | 3 | 5.8 | 24 / 33 (73%) | 0 | 0 |
| suzushin7.nano.Galaxy03 1.01 | 43.7% | 99 | 26 | 3 | 4.9 | 16 / 16 (100%) | 0 | 0 |
| suh.nano.RammingC 1.00 | 49.7% | 81 | 28 | 3 | 5.0 | 3 / 3 (100%) | 0 | 0 |
| jab.micro.Sanguijuela 0.8 | 57.2% | 78 | 41 | 3 | 5.0 | 25 / 26 (96%) | 0 | 0 |
| wompi.Kowari 1.6 | 54.1% | 90 | 76 | 3 | 6.4 | 70 / 70 (100%) | 0 | 0 |
| step.nanoPri 1.0 | 44.8% | 83 | 86 | 3 | 5.0 | 11 / 11 (100%) | 0 | 0 |
| oog.nano.Caligula 1.15 | 48.2% | 82 | 40 | 3 | 6.7 | 115 / 115 (100%) | 0 | 0 |
| benhorner.PureAggression 0.2.6 | 65.3% | 91 | 85 | 3 | 5.1 | 16 / 16 (100%) | 0 | 0 |
| radnor.RamRod 1.0 | 48.0% | 79 | 38 | 3 | 5.2 | 20 / 20 (100%) | 0 | 0 |
| bvh.mini.Mjolnir 0.3 | 40.0% | 94 | 70 | 3 | 9.4 | 69 / 71 (97%) | 0 | 0 |
| asm.Statistas 0.1 | 8.3% | 100 | 645 | 3 | 25.0 | 481 / 483 (100%) | 0 | 0 |
| pez.frankie.Frankie 0.9.6.1 | 1.8% | 44 | 15 | 3 | 0.5 | 8 / 8 (100%) | 0 | 0 |
| stelo.Lifestealer 1.0 | 40.1% | 79 | 71 | 3 | 5.1 | 25 / 26 (96%) | 0 | 0 |
| blir.nano.Bruce R1.0.0 | 49.0% | 76 | 78 | 3 | 6.0 | 15 / 15 (100%) | 0 | 0 |
| myl.nano.Kakuru 1.20 | 7.5% | 89 | 1192 | 3 | 21.6 | 397 / 399 (99%) | 0 | 0 |
| EH.Fusion 0.32 | 22.9% | 65 | 86 | 2 | 7.1 | 23 / 23 (100%) | 0 | 0 |
| mahrgell.mahrram 1.3 | 49.5% | 68 | 31 | 3 | 5.2 | 59 / 59 (100%) | 0 | 0 |
| stelo.MirrorMicro 1.1 | 6.8% | 357 | 12685 | 3 | 111.8 | 2630 / 2659 (99%) | 0 | 0 |
| stelo.PianistNano 1.3 | 5.2% | 84 | 674 | 3 | 22.5 | 375 / 375 (100%) | 0 | 0 |
| supersample.SuperRamFire 1.0 | 15.9% | 77 | 77 | 3 | 8.4 | 164 / 165 (99%) | 0 | 0 |
| mladjo.AIR 0.7 | 7.9% | 86 | 2491 | 3 | 34.1 | 754 / 755 (100%) | 0 | 0 |
| bayen.UbaRamLT 1.0 | 60.1% | 62 | 41 | 3 | 3.2 | 12 / 12 (100%) | 0 | 0 |
| apv.LauLectrik 1.2 | 3.6% | 47 | 13 | 3 | 0.5 | 8 / 11 (73%) | 0 | 0 |
| dz.OthoMicro 0.12 | 5.3% | 83 | 1652 | 3 | 25.7 | 541 / 542 (100%) | 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 84.0% | 71 | 19 | 3 | 2.2 | 4 / 4 (100%) | 0 | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 6.9% | 96 | 1678 | 3 | 27.1 | 548 / 551 (99%) | 0 | 0 |
| exauge.Leopard 1.1.019 | 50.7% | 71 | 93 | 3 | 5.5 | 26 / 26 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| sheldor.nano.SabreuseNano 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| slugzilla.ButtHead 2.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sheldor.nano.Sabreur 1.1.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| maribo.FollowFire 1.11 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jk.nano.Machete 2.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| suzushin7.nano.Galaxy03 1.01 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| suh.nano.RammingC 1.00 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jab.micro.Sanguijuela 0.8 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wompi.Kowari 1.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| step.nanoPri 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| oog.nano.Caligula 1.15 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| benhorner.PureAggression 0.2.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| radnor.RamRod 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bvh.mini.Mjolnir 0.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| asm.Statistas 0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pez.frankie.Frankie 0.9.6.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.Lifestealer 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| blir.nano.Bruce R1.0.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| myl.nano.Kakuru 1.20 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| EH.Fusion 0.32 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mahrgell.mahrram 1.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.MirrorMicro 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.PianistNano 1.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| supersample.SuperRamFire 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mladjo.AIR 0.7 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bayen.UbaRamLT 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apv.LauLectrik 1.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dz.OthoMicro 0.12 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| exauge.Leopard 1.1.019 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## First rounds against last rounds

Per battle, the first 5 rounds against the last 10, then the paired difference (last minus first) over battles with its 95% interval. Win rate is rounds won over rounds with an R record; damage share is bullet damage dealt over dealt plus taken. Positive means the robot does better late in the battle.

| Opponent | Build | Battles | Win rate, first 5 | Win rate, last 10 | Late minus early (pp) | Damage share, first 5 | Damage share, last 10 | Late minus early (pp) |
|---|---|---|---|---|---|---|---|---|
| EH.Fusion 0.32 | hadur2.Hadur 3.9 | 8 | 92.5% ± 12.4 | 98.8% ± 3.0 | +6.3 ± 13.4 | 57.7% ± 2.2 | 70.6% ± 5.6 | +13.0 ± 5.7 |
| EH.Fusion 0.32 | hadur2.Hadur 3.4 | 8 | 87.5% ± 12.4 | 100.0% ± 0.0 | +12.5 ± 12.4 | 60.6% ± 5.3 | 77.8% ± 4.0 | +17.2 ± 7.3 |
| apv.LauLectrik 1.2 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 100.0% ± 0.0 | - | n/a |
| apv.LauLectrik 1.2 | hadur2.Hadur 3.4 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 100.0% ± 0.0 | - | n/a |
| asm.Statistas 0.1 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 96.2% ± 4.3 | +3.7 ± 9.9 | 57.2% ± 9.5 | 60.1% ± 4.7 | +2.9 ± 9.7 |
| asm.Statistas 0.1 | hadur2.Hadur 3.4 | 8 | 90.0% ± 12.6 | 97.5% ± 3.9 | +7.5 ± 13.2 | 53.5% ± 5.4 | 61.1% ± 4.0 | +7.6 ± 6.8 |
| bayen.UbaRamLT 1.0 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 100.0% ± 0.0 | +10.0 ± 12.6 | 65.4% ± 6.2 | 71.5% ± 4.9 | +6.1 ± 7.8 |
| bayen.UbaRamLT 1.0 | hadur2.Hadur 3.4 | 8 | 92.5% ± 12.4 | 96.1% ± 4.5 | +3.6 ± 13.5 | 60.0% ± 2.2 | 65.5% ± 2.8 | +5.4 ± 3.6 |
| benhorner.PureAggression 0.2.6 | hadur2.Hadur 3.9 | 8 | 85.0% ± 14.8 | 100.0% ± 0.0 | +15.0 ± 14.8 | 61.5% ± 2.5 | 63.5% ± 2.8 | +2.0 ± 3.0 |
| benhorner.PureAggression 0.2.6 | hadur2.Hadur 3.4 | 8 | 77.5% ± 18.8 | 85.0% ± 11.8 | +7.5 ± 26.0 | 56.3% ± 3.8 | 58.7% ± 3.2 | +2.4 ± 5.4 |
| blir.nano.Bruce R1.0.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 62.0% ± 1.9 | 66.3% ± 1.9 | +4.3 ± 2.6 |
| blir.nano.Bruce R1.0.0 | hadur2.Hadur 3.4 | 8 | 87.5% ± 12.4 | 91.3% ± 7.0 | +3.8 ± 16.1 | 59.4% ± 4.8 | 62.4% ± 3.4 | +2.9 ± 7.2 |
| bvh.mini.Mjolnir 0.3 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 97.5% ± 3.9 | +2.5 ± 9.7 | 64.5% ± 6.7 | 63.0% ± 3.1 | -1.5 ± 5.3 |
| bvh.mini.Mjolnir 0.3 | hadur2.Hadur 3.4 | 8 | 97.5% ± 5.9 | 95.0% ± 8.9 | -2.5 ± 9.7 | 68.2% ± 4.8 | 65.2% ± 4.6 | -3.0 ± 8.3 |
| bwbaugh.nano.Tirunculus 0.0.0a | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 68.0% ± 4.3 | 74.8% ± 2.5 | +6.8 ± 3.8 |
| bwbaugh.nano.Tirunculus 0.0.0a | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 64.4% ± 4.2 | 67.2% ± 2.5 | +2.8 ± 5.1 |
| demetrix.nano.SledgeHammer 0.22 | hadur2.Hadur 3.9 | 8 | 89.4% ± 9.6 | 97.5% ± 5.9 | +8.1 ± 13.0 | 57.3% ± 2.9 | 56.7% ± 2.3 | -0.5 ± 4.2 |
| demetrix.nano.SledgeHammer 0.22 | hadur2.Hadur 3.4 | 8 | 72.5% ± 12.4 | 92.5% ± 8.7 | +20.0 ± 10.9 | 54.8% ± 2.9 | 61.1% ± 3.0 | +6.3 ± 4.1 |
| dz.OthoMicro 0.12 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 93.8% ± 6.2 | -1.2 ± 8.3 | 60.5% ± 9.3 | 64.3% ± 6.2 | +3.8 ± 11.8 |
| dz.OthoMicro 0.12 | hadur2.Hadur 3.4 | 8 | 90.0% ± 8.9 | 93.5% ± 8.1 | +3.5 ± 11.0 | 63.4% ± 7.5 | 62.8% ± 6.9 | -0.6 ± 6.6 |
| exauge.Leopard 1.1.019 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 65.4% ± 5.8 | 70.1% ± 2.9 | +4.7 ± 4.2 |
| exauge.Leopard 1.1.019 | hadur2.Hadur 3.4 | 8 | 92.5% ± 8.7 | 97.5% ± 3.9 | +5.0 ± 10.9 | 63.8% ± 3.3 | 66.3% ± 1.8 | +2.5 ± 4.3 |
| jab.micro.Sanguijuela 0.8 | hadur2.Hadur 3.9 | 8 | 90.0% ± 8.9 | 100.0% ± 0.0 | +10.0 ± 8.9 | 56.1% ± 4.0 | 57.4% ± 1.8 | +1.2 ± 4.6 |
| jab.micro.Sanguijuela 0.8 | hadur2.Hadur 3.4 | 8 | 85.0% ± 11.8 | 86.3% ± 4.3 | +1.3 ± 11.3 | 55.7% ± 1.1 | 60.2% ± 2.3 | +4.6 ± 1.7 |
| jk.nano.Machete 2.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 59.5% ± 1.4 | 60.0% ± 1.5 | +0.5 ± 2.0 |
| jk.nano.Machete 2.0 | hadur2.Hadur 3.4 | 8 | 85.0% ± 17.3 | 92.5% ± 5.9 | +7.5 ± 15.3 | 58.1% ± 4.8 | 60.7% ± 2.7 | +2.6 ± 4.4 |
| kawigi.sbf.FloodSonnet 0.9 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 96.3% ± 4.3 | +1.2 ± 8.3 | 61.9% ± 8.7 | 65.7% ± 6.1 | +3.8 ± 9.0 |
| kawigi.sbf.FloodSonnet 0.9 | hadur2.Hadur 3.4 | 8 | 92.5% ± 8.7 | 93.8% ± 6.2 | +1.2 ± 13.7 | 62.5% ± 7.0 | 66.8% ± 5.2 | +4.3 ± 10.5 |
| mahrgell.mahrram 1.3 | hadur2.Hadur 3.9 | 8 | 92.5% ± 12.4 | 97.5% ± 3.9 | +5.0 ± 10.9 | 60.4% ± 2.6 | 69.4% ± 3.0 | +9.0 ± 3.0 |
| mahrgell.mahrram 1.3 | hadur2.Hadur 3.4 | 8 | 80.0% ± 17.9 | 87.2% ± 11.8 | +7.2 ± 24.2 | 57.6% ± 3.2 | 61.9% ± 3.8 | +4.2 ± 4.0 |
| maribo.FollowFire 1.11 | hadur2.Hadur 3.9 | 8 | 85.0% ± 14.8 | 97.5% ± 3.9 | +12.5 ± 13.2 | 56.8% ± 3.8 | 61.3% ± 2.8 | +4.4 ± 3.8 |
| maribo.FollowFire 1.11 | hadur2.Hadur 3.4 | 8 | 90.0% ± 8.9 | 96.3% ± 4.3 | +6.2 ± 8.9 | 56.4% ± 3.1 | 63.1% ± 2.9 | +6.6 ± 4.1 |
| mladjo.AIR 0.7 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 98.6% ± 3.3 | +3.6 ± 9.0 | 66.7% ± 4.9 | 69.6% ± 7.0 | +2.9 ± 8.2 |
| mladjo.AIR 0.7 | hadur2.Hadur 3.4 | 8 | 92.5% ± 8.7 | 97.5% ± 3.9 | +5.0 ± 8.9 | 63.6% ± 8.8 | 69.5% ± 6.0 | +5.9 ± 12.6 |
| myl.nano.Kakuru 1.20 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 97.5% ± 5.9 | +2.5 ± 10.7 | 63.6% ± 8.3 | 63.0% ± 5.7 | -0.6 ± 8.5 |
| myl.nano.Kakuru 1.20 | hadur2.Hadur 3.4 | 8 | 90.0% ± 12.6 | 95.0% ± 6.3 | +5.0 ± 15.5 | 63.0% ± 10.2 | 62.4% ± 5.2 | -0.6 ± 11.0 |
| oog.nano.Caligula 1.15 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 94.9% ± 4.6 | -0.1 ± 9.1 | 78.0% ± 6.2 | 62.9% ± 3.9 | -15.1 ± 8.2 |
| oog.nano.Caligula 1.15 | hadur2.Hadur 3.4 | 8 | 97.5% ± 5.9 | 91.3% ± 9.4 | -6.3 ± 6.2 | 77.8% ± 3.9 | 61.1% ± 3.1 | -16.6 ± 4.8 |
| pez.frankie.Frankie 0.9.6.1 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 100.0% ± 0.0 | - | n/a |
| pez.frankie.Frankie 0.9.6.1 | hadur2.Hadur 3.4 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 100.0% ± 0.0 | - | n/a |
| radnor.RamRod 1.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 68.7% ± 4.5 | 62.2% ± 1.7 | -6.5 ± 4.4 |
| radnor.RamRod 1.0 | hadur2.Hadur 3.4 | 8 | 87.5% ± 8.7 | 88.8% ± 7.0 | +1.2 ± 8.3 | 65.3% ± 4.1 | 63.4% ± 4.3 | -1.9 ± 4.6 |
| sheldor.nano.Sabreur 1.1.2 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 95.0% ± 6.3 | -2.5 ± 9.7 | 77.1% ± 2.4 | 58.1% ± 1.6 | -19.0 ± 3.4 |
| sheldor.nano.Sabreur 1.1.2 | hadur2.Hadur 3.4 | 8 | 92.5% ± 8.7 | 87.4% ± 7.4 | -5.1 ± 11.0 | 76.8% ± 5.3 | 58.9% ± 1.5 | -17.9 ± 5.0 |
| sheldor.nano.SabreuseNano 1.1 | hadur2.Hadur 3.9 | 8 | 90.0% ± 8.9 | 97.5% ± 3.9 | +7.5 ± 11.6 | 63.3% ± 4.2 | 57.3% ± 1.4 | -6.0 ± 4.5 |
| sheldor.nano.SabreuseNano 1.1 | hadur2.Hadur 3.4 | 8 | 85.0% ± 11.8 | 86.1% ± 7.6 | +1.1 ± 15.8 | 60.2% ± 4.4 | 57.8% ± 2.0 | -2.4 ± 5.2 |
| slugzilla.ButtHead 2.0 | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 98.8% ± 3.0 | +11.2 ± 12.2 | 64.3% ± 3.6 | 57.2% ± 1.6 | -7.1 ± 4.2 |
| slugzilla.ButtHead 2.0 | hadur2.Hadur 3.4 | 8 | 92.5% ± 8.7 | 86.3% ± 4.3 | -6.2 ± 7.7 | 64.3% ± 3.1 | 58.7% ± 1.8 | -5.7 ± 3.2 |
| stelo.Lifestealer 1.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 62.6% ± 3.1 | 69.6% ± 3.8 | +7.0 ± 3.7 |
| stelo.Lifestealer 1.0 | hadur2.Hadur 3.4 | 8 | 92.5% ± 8.7 | 100.0% ± 0.0 | +7.5 ± 8.7 | 65.7% ± 5.7 | 71.2% ± 4.2 | +5.5 ± 5.6 |
| stelo.MirrorMicro 1.1 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 83.7% ± 4.7 | 83.7% ± 5.0 | +0.0 ± 8.7 |
| stelo.MirrorMicro 1.1 | hadur2.Hadur 3.4 | 8 | 75.0% ± 11.8 | 82.9% ± 8.0 | +7.9 ± 6.6 | 51.0% ± 4.6 | 57.4% ± 3.7 | +6.4 ± 3.0 |
| stelo.PianistNano 1.3 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 97.4% ± 4.1 | +2.4 ± 3.7 | 51.5% ± 5.8 | 71.0% ± 9.3 | +19.5 ± 9.1 |
| stelo.PianistNano 1.3 | hadur2.Hadur 3.4 | 8 | 97.5% ± 5.9 | 93.8% ± 6.2 | -3.7 ± 7.7 | 58.5% ± 7.8 | 62.4% ± 5.4 | +3.9 ± 7.6 |
| step.nanoPri 1.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 96.3% ± 4.3 | +1.2 ± 8.3 | 61.2% ± 2.3 | 59.1% ± 2.0 | -2.1 ± 2.9 |
| step.nanoPri 1.0 | hadur2.Hadur 3.4 | 8 | 92.5% ± 8.7 | 98.8% ± 3.0 | +6.2 ± 7.7 | 62.7% ± 1.8 | 65.3% ± 1.9 | +2.6 ± 3.0 |
| suh.nano.RammingC 1.00 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 98.8% ± 3.0 | +8.8 ± 12.2 | 59.0% ± 2.3 | 58.7% ± 2.3 | -0.4 ± 2.7 |
| suh.nano.RammingC 1.00 | hadur2.Hadur 3.4 | 8 | 90.0% ± 12.6 | 95.0% ± 4.5 | +5.0 ± 16.1 | 60.9% ± 3.6 | 65.8% ± 3.3 | +4.9 ± 3.9 |
| supersample.SuperRamFire 1.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 70.5% ± 4.1 | 75.1% ± 4.4 | +4.6 ± 5.8 |
| supersample.SuperRamFire 1.0 | hadur2.Hadur 3.4 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 70.2% ± 4.9 | 86.4% ± 2.9 | +16.3 ± 7.0 |
| suzushin7.nano.Galaxy03 1.01 | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 98.8% ± 3.0 | +11.2 ± 13.7 | 58.1% ± 4.5 | 60.9% ± 3.1 | +2.8 ± 4.0 |
| suzushin7.nano.Galaxy03 1.01 | hadur2.Hadur 3.4 | 8 | 92.5% ± 12.4 | 96.3% ± 6.2 | +3.8 ± 15.4 | 63.9% ± 4.6 | 65.4% ± 2.6 | +1.4 ± 3.7 |
| wompi.Kowari 1.6 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 84.3% ± 2.1 | 60.8% ± 1.3 | -23.6 ± 2.2 |
| wompi.Kowari 1.6 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 97.5% ± 3.9 | -2.5 ± 3.9 | 84.3% ± 2.7 | 61.0% ± 1.6 | -23.3 ± 3.5 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| EH.Fusion 0.32 | +5.0 ± 7.7 | -1.2 ± 3.0 | -2.9 ± 6.3 | -7.2 ± 4.4 |
| apv.LauLectrik 1.2 | +2.5 ± 5.9 | +0.0 ± 0.0 | +0.0 ± 0.0 | n/a |
| asm.Statistas 0.1 | +2.5 ± 5.9 | -1.2 ± 7.0 | +3.7 ± 10.8 | -1.1 ± 4.3 |
| bayen.UbaRamLT 1.0 | -2.5 ± 5.9 | +3.9 ± 4.5 | +5.4 ± 6.6 | +6.1 ± 5.6 |
| benhorner.PureAggression 0.2.6 | +7.5 ± 17.7 | +15.0 ± 11.8 | +5.2 ± 4.4 | +4.8 ± 5.3 |
| blir.nano.Bruce R1.0.0 | +12.5 ± 12.4 | +8.7 ± 7.0 | +2.6 ± 5.6 | +3.9 ± 3.0 |
| bvh.mini.Mjolnir 0.3 | -2.5 ± 10.7 | +2.5 ± 9.7 | -3.7 ± 9.5 | -2.2 ± 4.8 |
| bwbaugh.nano.Tirunculus 0.0.0a | -5.0 ± 7.7 | +0.0 ± 0.0 | +3.6 ± 4.5 | +7.6 ± 1.8 |
| demetrix.nano.SledgeHammer 0.22 | +16.9 ± 10.7 | +5.0 ± 11.8 | +2.5 ± 2.1 | -4.3 ± 4.1 |
| dz.OthoMicro 0.12 | +5.0 ± 7.7 | +0.3 ± 10.2 | -2.9 ± 13.3 | +1.5 ± 10.8 |
| exauge.Leopard 1.1.019 | +2.5 ± 10.7 | +2.5 ± 3.9 | +1.6 ± 8.0 | +3.7 ± 3.6 |
| jab.micro.Sanguijuela 0.8 | +5.0 ± 17.3 | +13.7 ± 4.3 | +0.5 ± 4.3 | -2.9 ± 3.1 |
| jk.nano.Machete 2.0 | +10.0 ± 21.9 | +7.5 ± 5.9 | +1.3 ± 5.0 | -0.7 ± 2.2 |
| kawigi.sbf.FloodSonnet 0.9 | +2.5 ± 10.7 | +2.5 ± 7.4 | -0.6 ± 8.0 | -1.1 ± 7.4 |
| mahrgell.mahrram 1.3 | +12.5 ± 15.3 | +10.3 ± 13.6 | +2.8 ± 4.7 | +7.5 ± 5.5 |
| maribo.FollowFire 1.11 | -5.0 ± 17.3 | +1.2 ± 5.4 | +0.4 ± 3.7 | -1.8 ± 5.2 |
| mladjo.AIR 0.7 | +2.5 ± 10.7 | +1.1 ± 5.6 | +3.1 ± 12.4 | +0.2 ± 11.0 |
| myl.nano.Kakuru 1.20 | +5.0 ± 11.8 | +2.5 ± 3.9 | +0.6 ± 11.8 | +0.6 ± 9.2 |
| oog.nano.Caligula 1.15 | -2.5 ± 10.7 | +3.6 ± 9.8 | +0.3 ± 5.8 | +1.8 ± 4.0 |
| pez.frankie.Frankie 0.9.6.1 | +2.5 ± 5.9 | +0.0 ± 0.0 | +0.0 ± 0.0 | n/a |
| radnor.RamRod 1.0 | +10.0 ± 8.9 | +10.0 ± 7.7 | +3.4 ± 5.1 | -1.2 ± 3.8 |
| sheldor.nano.Sabreur 1.1.2 | +5.0 ± 11.8 | +7.6 ± 7.3 | +0.3 ± 6.1 | -0.8 ± 2.3 |
| sheldor.nano.SabreuseNano 1.1 | +5.0 ± 14.8 | +11.4 ± 8.3 | +3.1 ± 5.4 | -0.5 ± 2.4 |
| slugzilla.ButtHead 2.0 | -5.0 ± 11.8 | +12.5 ± 3.9 | -0.1 ± 2.9 | -1.5 ± 3.2 |
| stelo.Lifestealer 1.0 | +5.0 ± 11.8 | -1.2 ± 3.0 | -3.1 ± 4.3 | -1.6 ± 4.0 |
| stelo.MirrorMicro 1.1 | +25.0 ± 11.8 | +17.1 ± 8.0 | +32.8 ± 5.7 | +26.3 ± 6.7 |
| stelo.PianistNano 1.3 | -2.5 ± 10.7 | +3.6 ± 6.1 | -7.0 ± 12.3 | +8.7 ± 7.8 |
| step.nanoPri 1.0 | +2.5 ± 10.7 | -2.5 ± 5.9 | -1.5 ± 1.2 | -6.2 ± 2.9 |
| suh.nano.RammingC 1.00 | +0.0 ± 17.9 | +3.7 ± 4.3 | -1.9 ± 4.9 | -7.1 ± 3.3 |
| supersample.SuperRamFire 1.0 | +0.0 ± 8.9 | +0.0 ± 0.0 | +0.3 ± 6.5 | -11.4 ± 4.8 |
| suzushin7.nano.Galaxy03 1.01 | -5.0 ± 11.8 | +2.5 ± 7.4 | -5.8 ± 6.4 | -4.5 ± 3.9 |
| wompi.Kowari 1.6 | +0.0 ± 0.0 | +2.5 ± 3.9 | +0.1 ± 4.5 | -0.2 ± 1.5 |
