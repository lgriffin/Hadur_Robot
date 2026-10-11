# Bench: hadur2.Hadur 3.9 (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 2861 over 256 battles (11.2 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| gh.micro.GrubbmThree 1.01 | weak | 64.6% ± 1.5 | 91.0% ± 2.1 | 57.8% ± 1.2 | 255 / 280 | 75.5% ± 2.0 | 60.3% ± 2.7 | 84 | 0 | 0.64 / 10.8 |
| cf.OldMan.OldManXP 0.1 | weak | 82.8% ± 10.5 | 95.0% ± 6.2 | 71.4% ± 14.4 | 266 / 280 | 22.9% ± 3.9 | 6.7% ± 0.8 | 113 | 0 | 0.85 / 13.1 |
| mz.NanoDeath 2.56 | weak | 67.4% ± 2.7 | 91.8% ± 2.7 | 60.2% ± 1.1 | 257 / 280 | 74.1% ± 3.7 | 49.7% ± 2.8 | 82 | 0 | 0.55 / 9.7 |
| sul.Bicephal 1.2 | weak | 67.2% ± 1.3 | 92.4% ± 2.9 | 60.9% ± 1.6 | 259 / 280 | 75.7% ± 3.0 | 52.6% ± 2.7 | 78 | 0 | 0.54 / 9.4 |
| kc.micro.rammer.MaxRisk 0.6 | weak | 67.5% ± 2.7 | 91.4% ± 3.6 | 59.9% ± 1.4 | 256 / 280 | 72.4% ± 2.7 | 53.8% ± 6.1 | 81 | 0 | 0.55 / 9.2 |
| mn.nano.perceptual.Impact 1.3.0 | weak | 65.5% ± 3.0 | 92.9% ± 3.8 | 58.0% ± 1.0 | 260 / 280 | 74.9% ± 2.7 | 63.7% ± 2.7 | 78 | 0 | 0.57 / 10.1 |
| test.Podgy 4.0 | weak | 86.7% ± 2.5 | 98.2% ± 1.8 | 74.2% ± 3.7 | 275 / 280 | 18.1% ± 1.5 | 5.0% ± 0.4 | 111 | 0 | 0.86 / 16.3 |
| non.mega.NaN 0.1 | weak | 88.8% ± 6.6 | 97.5% ± 5.0 | 81.4% ± 8.1 | 273 / 280 | 34.2% ± 3.3 | 8.4% ± 4.9 | 83 | 0 | 0.66 / 17.0 |
| demetrix.nano.Neutrino 0.27 | weak | 81.9% ± 4.1 | 95.4% ± 2.8 | 67.2% ± 5.7 | 267 / 280 | 13.5% ± 1.4 | 5.5% ± 0.8 | 91 | 0 | 0.87 / 17.2 |
| whind.Wisdom 0.5.1 | weak | 80.1% ± 2.3 | 94.3% ± 2.2 | 65.1% ± 3.1 | 264 / 280 | 16.1% ± 1.5 | 5.5% ± 0.5 | 72 | 0 | 0.88 / 144.9 |
| as.xbots 1.0 | weak | 73.9% ± 4.5 | 95.0% ± 2.1 | 66.4% ± 3.3 | 266 / 280 | 55.2% ± 6.7 | 34.2% ± 8.9 | 88 | 0 | 0.60 / 9.7 |
| ers.nano.sunderer.Sunderer 1.23a | weak | 72.7% ± 2.5 | 97.1% ± 2.6 | 62.9% ± 1.9 | 272 / 280 | 67.3% ± 2.6 | 46.5% ± 3.1 | 92 | 0 | 0.58 / 9.7 |
| robar.nano.Breeze 0.3 | weak | 87.5% ± 2.1 | 97.5% ± 2.4 | 76.8% ± 2.5 | 273 / 280 | 16.8% ± 1.3 | 5.5% ± 0.7 | 80 | 0 | 0.92 / 17.2 |
| dmh.robocode.robot.PinkPanther 1.1 | weak | 65.3% ± 4.7 | 86.1% ± 4.3 | 41.9% ± 5.2 | 241 / 280 | 10.6% ± 0.6 | 6.2% ± 0.6 | 103 | 0 | 1.10 / 20.1 |
| sm.Devil 7.3 | weak | 80.6% ± 3.0 | 90.7% ± 4.6 | 70.7% ± 2.5 | 254 / 280 | 14.5% ± 0.5 | 8.0% ± 0.3 | 146 | 0 | 1.40 / 16.0 |
| seed.Anastasia 1.0 | weak | 93.0% ± 2.3 | 99.3% ± 1.1 | 86.9% ± 3.4 | 278 / 280 | 16.7% ± 0.8 | 5.1% ± 1.3 | 79 | 0 | 3.23 / 19.0 |
| janm.Jammy 1.0 | weak | 83.8% ± 3.1 | 96.4% ± 2.8 | 70.0% ± 4.1 | 270 / 280 | 16.6% ± 1.1 | 4.9% ± 0.6 | 78 | 0 | 0.78 / 16.7 |
| dcs.PM.Eater_of_Worlds_PM 1.2 | weak | 76.6% ± 2.8 | 91.8% ± 3.2 | 61.1% ± 3.0 | 257 / 280 | 13.4% ± 0.5 | 6.5% ± 0.5 | 85 | 0 | 0.94 / 17.8 |
| apv.MicroAspid 1.8 | weak | 70.2% ± 4.6 | 87.9% ± 4.2 | 49.9% ± 5.0 | 246 / 280 | 11.1% ± 0.4 | 5.6% ± 0.6 | 80 | 0 | 0.90 / 42.8 |
| mladjo.Grrrrr 0.9 | weak | 69.4% ± 3.3 | 84.3% ± 4.2 | 55.1% ± 2.2 | 236 / 280 | 12.7% ± 0.5 | 7.4% ± 0.6 | 92 | 0 | 0.96 / 82.9 |
| md.November 1.0 | weak | 86.2% ± 4.4 | 95.7% ± 3.8 | 75.7% ± 4.7 | 268 / 280 | 15.7% ± 0.8 | 6.0% ± 3.6 | 99 | 0 | 0.89 / 18.0 |
| ph.mini.Archer 0.6.6 | weak | 68.0% ± 5.6 | 81.7% ± 6.8 | 54.6% ± 4.2 | 229 / 280 | 12.0% ± 0.5 | 7.4% ± 0.6 | 103 | 0 | 1.01 / 68.8 |
| cb.mega.RandomBot 1.0 | weak | 70.2% ± 3.3 | 82.9% ± 3.8 | 58.7% ± 2.6 | 232 / 280 | 14.5% ± 0.7 | 8.1% ± 0.7 | 82 | 0 | 1.00 / 17.2 |
| dmp.micro.Aurora 1.41 | weak | 84.2% ± 3.4 | 96.1% ± 4.4 | 71.9% ± 2.7 | 269 / 280 | 18.7% ± 0.6 | 5.6% ± 0.8 | 76 | 0 | 0.82 / 20.0 |
| doka.Test 1.0 | weak | 86.4% ± 3.2 | 96.4% ± 2.8 | 76.9% ± 3.9 | 270 / 280 | 20.2% ± 0.7 | 6.6% ± 1.1 | 84 | 0 | 0.84 / 19.6 |
| davidalves.net.DuelistNano 1.0 | weak | 82.0% ± 7.4 | 93.9% ± 4.5 | 68.5% ± 9.5 | 263 / 280 | 14.7% ± 1.0 | 4.5% ± 1.5 | 88 | 0 | 0.94 / 38.0 |
| arthord.NanoSatanMelee Beta | weak | 86.6% ± 3.3 | 98.2% ± 1.8 | 73.7% ± 4.9 | 275 / 280 | 17.3% ± 3.0 | 5.9% ± 1.5 | 90 | 0 | 0.91 / 46.5 |
| DTF.Kludgy 1.2b | weak | 76.1% ± 2.8 | 82.5% ± 4.9 | 69.7% ± 2.2 | 231 / 280 | 16.3% ± 0.6 | 9.4% ± 0.4 | 127 | 0 | 1.04 / 15.9 |
| cx.Princess 1.0 | weak | 95.0% ± 5.4 | 98.2% ± 3.4 | 64.9% ± 13.0 | 275 / 280 | 1.2% ± 0.6 | 0.7% ± 0.4 | 43 | 0 | 0.74 / 15.5 |
| slugzilla.RandomPattern 1.0 | weak | 75.5% ± 3.4 | 93.2% ± 3.6 | 56.2% ± 3.6 | 261 / 280 | 11.5% ± 0.2 | 6.2% ± 0.7 | 85 | 0 | 1.01 / 21.7 |
| stelo.MatchupAGF 1.1 | weak | 71.6% ± 2.7 | 83.2% ± 3.7 | 60.6% ± 2.1 | 233 / 280 | 14.3% ± 0.8 | 8.5% ± 0.4 | 113 | 0 | 1.61 / 51.3 |
| stelo.MatchupMini 1.1 | weak | 70.9% ± 3.3 | 85.4% ± 3.9 | 56.8% ± 2.7 | 239 / 280 | 13.2% ± 0.7 | 7.3% ± 0.5 | 75 | 0 | 1.48 / 23.8 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| gh.micro.GrubbmThree 1.01 | 8 | 5 | 151 | 0 | 0.30 | 3 | 2 | 0 |
| cf.OldMan.OldManXP 0.1 | 8 | 7 | 0 | 0 | 0.40 | 1 | 1 | 0 |
| mz.NanoDeath 2.56 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| sul.Bicephal 1.2 | 8 | 4 | 894 | 0 | 0.28 | 1 | 1 | 0 |
| kc.micro.rammer.MaxRisk 0.6 | 8 | 4 | 289 | 0 | 0.29 | 2 | 2 | 0 |
| mn.nano.perceptual.Impact 1.3.0 | 8 | 7 | 0 | 0 | 0.28 | 1 | 1 | 0 |
| test.Podgy 4.0 | 8 | 4 | 1192 | 0 | 0.40 | 0 | 0 | 0 |
| non.mega.NaN 0.1 | 8 | 6 | 275 | 0 | 0.30 | 1 | 1 | 0 |
| demetrix.nano.Neutrino 0.27 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| whind.Wisdom 0.5.1 | 8 | 4 | 0 | 0 | 0.26 | 4 | 4 | 0 |
| as.xbots 1.0 | 8 | 5 | 785 | 0 | 0.31 | 0 | 0 | 0 |
| ers.nano.sunderer.Sunderer 1.23a | 8 | 6 | 596 | 0 | 0.33 | 0 | 0 | 0 |
| robar.nano.Breeze 0.3 | 8 | 6 | 298 | 0 | 0.29 | 1 | 1 | 0 |
| dmh.robocode.robot.PinkPanther 1.1 | 8 | 7 | 0 | 0 | 0.37 | 1 | 1 | 0 |
| sm.Devil 7.3 | 8 | 7 | 298 | 0 | 0.52 | 0 | 0 | 0 |
| seed.Anastasia 1.0 | 8 | 8 | 0 | 0 | 0.28 | 0 | 0 | 0 |
| janm.Jammy 1.0 | 8 | 7 | 0 | 0 | 0.28 | 1 | 1 | 0 |
| dcs.PM.Eater_of_Worlds_PM 1.2 | 8 | 6 | 298 | 0 | 0.30 | 1 | 1 | 0 |
| apv.MicroAspid 1.8 | 8 | 6 | 0 | 0 | 0.29 | 2 | 2 | 0 |
| mladjo.Grrrrr 0.9 | 8 | 6 | 0 | 0 | 0.33 | 2 | 2 | 0 |
| md.November 1.0 | 8 | 4 | 1192 | 0 | 0.35 | 0 | 0 | 0 |
| ph.mini.Archer 0.6.6 | 8 | 7 | 298 | 0 | 0.37 | 0 | 0 | 0 |
| cb.mega.RandomBot 1.0 | 8 | 6 | 298 | 0 | 0.29 | 1 | 1 | 0 |
| dmp.micro.Aurora 1.41 | 8 | 7 | 0 | 0 | 0.27 | 1 | 1 | 0 |
| doka.Test 1.0 | 8 | 6 | 298 | 0 | 0.30 | 1 | 1 | 0 |
| davidalves.net.DuelistNano 1.0 | 8 | 6 | 298 | 0 | 0.31 | 1 | 1 | 0 |
| arthord.NanoSatanMelee Beta | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| DTF.Kludgy 1.2b | 8 | 7 | 298 | 0 | 0.45 | 1 | 1 | 0 |
| cx.Princess 1.0 | 8 | 7 | 298 | 0 | 0.15 | 0 | 0 | 8 |
| slugzilla.RandomPattern 1.0 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| stelo.MatchupAGF 1.1 | 8 | 5 | 298 | 0 | 0.40 | 3 | 3 | 0 |
| stelo.MatchupMini 1.1 | 8 | 6 | 0 | 0 | 0.27 | 2 | 2 | 0 |

198 of 256 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| gh.micro.GrubbmThree 1.01 | 2136 | 32 | 2131 | 2127 (99.6%) | 9 (0.4%) | 4 (0.2%) | 4341 | 400 | 17 |
| cf.OldMan.OldManXP 0.1 | 5341 | 18 | 5350 | 5338 (99.9%) | 3 (0.1%) | 12 (0.2%) | 151 | 85 | 54 |
| mz.NanoDeath 2.56 | 2180 | 12 | 2180 | 2180 (100.0%) | 0 (0.0%) | 0 (0.0%) | 3380 | 328 | 18 |
| sul.Bicephal 1.2 | 2010 | 30 | 1957 | 1957 (97.4%) | 53 (2.6%) | 0 (0.0%) | 4655 | 410 | 26 |
| kc.micro.rammer.MaxRisk 0.6 | 2480 | 18 | 2465 | 2463 (99.3%) | 17 (0.7%) | 2 (0.1%) | 2877 | 324 | 22 |
| mn.nano.perceptual.Impact 1.3.0 | 2573 | 12 | 2574 | 2572 (100.0%) | 1 (0.0%) | 2 (0.1%) | 3595 | 349 | 22 |
| test.Podgy 4.0 | 5389 | 12 | 5385 | 5313 (98.6%) | 76 (1.4%) | 72 (1.3%) | 649 | 94 | 77 |
| non.mega.NaN 0.1 | 4289 | 12 | 4312 | 4272 (99.6%) | 17 (0.4%) | 40 (0.9%) | 16 | 86 | 25 |
| demetrix.nano.Neutrino 0.27 | 9803 | 17 | 9803 | 9801 (100.0%) | 2 (0.0%) | 2 (0.0%) | 236 | 128 | 27 |
| whind.Wisdom 0.5.1 | 6423 | 11 | 6421 | 6420 (100.0%) | 3 (0.0%) | 1 (0.0%) | 235 | 100 | 67 |
| as.xbots 1.0 | 2915 | 24 | 2866 | 2865 (98.3%) | 50 (1.7%) | 1 (0.0%) | 2430 | 269 | 17 |
| ers.nano.sunderer.Sunderer 1.23a | 3001 | 9 | 2960 | 2959 (98.6%) | 42 (1.4%) | 1 (0.0%) | 1269 | 207 | 17 |
| robar.nano.Breeze 0.3 | 8986 | 41 | 9438 | 8911 (99.2%) | 75 (0.8%) | 527 (5.6%) | 542 | 174 | 24 |
| dmh.robocode.robot.PinkPanther 1.1 | 11345 | 339 | 11341 | 11319 (99.8%) | 26 (0.2%) | 22 (0.2%) | 637 | 98 | 42 |
| sm.Devil 7.3 | 18486 | 77 | 18465 | 18461 (99.9%) | 25 (0.1%) | 4 (0.0%) | 1328 | 249 | 102 |
| seed.Anastasia 1.0 | 8156 | 13 | 8179 | 8148 (99.9%) | 8 (0.1%) | 31 (0.4%) | 913 | 117 | 20 |
| janm.Jammy 1.0 | 6108 | 23 | 6109 | 6104 (99.9%) | 4 (0.1%) | 5 (0.1%) | 267 | 109 | 30 |
| dcs.PM.Eater_of_Worlds_PM 1.2 | 9863 | 18 | 9849 | 9844 (99.8%) | 19 (0.2%) | 5 (0.1%) | 359 | 137 | 31 |
| apv.MicroAspid 1.8 | 9590 | 8 | 9686 | 9589 (100.0%) | 1 (0.0%) | 97 (1.0%) | 763 | 106 | 43 |
| mladjo.Grrrrr 0.9 | 12041 | 18 | 12041 | 12041 (100.0%) | 0 (0.0%) | 0 (0.0%) | 450 | 138 | 35 |
| md.November 1.0 | 6783 | 28 | 6720 | 6714 (99.0%) | 69 (1.0%) | 6 (0.1%) | 255 | 83 | 30 |
| ph.mini.Archer 0.6.6 | 13182 | 68 | 13161 | 13159 (99.8%) | 23 (0.2%) | 2 (0.0%) | 514 | 150 | 47 |
| cb.mega.RandomBot 1.0 | 11212 | 478 | 11173 | 11173 (99.7%) | 39 (0.3%) | 0 (0.0%) | 486 | 167 | 32 |
| dmp.micro.Aurora 1.41 | 5850 | 23 | 5848 | 5845 (99.9%) | 5 (0.1%) | 3 (0.1%) | 456 | 114 | 24 |
| doka.Test 1.0 | 7086 | 16 | 7065 | 7062 (99.7%) | 24 (0.3%) | 3 (0.0%) | 315 | 123 | 23 |
| davidalves.net.DuelistNano 1.0 | 6540 | 20 | 6526 | 6525 (99.8%) | 15 (0.2%) | 1 (0.0%) | 202 | 84 | 25 |
| arthord.NanoSatanMelee Beta | 5989 | 10 | 5989 | 5989 (100.0%) | 0 (0.0%) | 0 (0.0%) | 254 | 89 | 24 |
| DTF.Kludgy 1.2b | 12489 | 14 | 12474 | 12465 (99.8%) | 24 (0.2%) | 9 (0.1%) | 897 | 178 | 66 |
| cx.Princess 1.0 | 611 | 1 | 594 | 594 (97.2%) | 17 (2.8%) | 0 (0.0%) | 52 | 8 | 12 |
| slugzilla.RandomPattern 1.0 | 11423 | 11 | 11424 | 11423 (100.0%) | 0 (0.0%) | 1 (0.0%) | 379 | 128 | 28 |
| stelo.MatchupAGF 1.1 | 17248 | 15 | 17235 | 17227 (99.9%) | 21 (0.1%) | 8 (0.0%) | 1170 | 201 | 80 |
| stelo.MatchupMini 1.1 | 11645 | 16 | 11645 | 11643 (100.0%) | 2 (0.0%) | 2 (0.0%) | 444 | 150 | 46 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| gh.micro.GrubbmThree 1.01 | 2253 | 70 (3.1%) | 0 |
| cf.OldMan.OldManXP 0.1 | 5141 | 294 (5.7%) | 544 |
| mz.NanoDeath 2.56 | 2224 | 58 (2.6%) | 0 |
| sul.Bicephal 1.2 | 2212 | 58 (2.6%) | 229 |
| kc.micro.rammer.MaxRisk 0.6 | 2406 | 214 (8.9%) | 920 |
| mn.nano.perceptual.Impact 1.3.0 | 2513 | 119 (4.7%) | 257 |
| test.Podgy 4.0 | 7237 | 373 (5.2%) | 385 |
| non.mega.NaN 0.1 | 3444 | 182 (5.3%) | 67 |
| demetrix.nano.Neutrino 0.27 | 10129 | 823 (8.1%) | 8157 |
| whind.Wisdom 0.5.1 | 7465 | 380 (5.1%) | 0 |
| as.xbots 1.0 | 2886 | 234 (8.1%) | 1414 |
| ers.nano.sunderer.Sunderer 1.23a | 2975 | 223 (7.5%) | 936 |
| robar.nano.Breeze 0.3 | 8709 | 677 (7.8%) | 5128 |
| dmh.robocode.robot.PinkPanther 1.1 | 12376 | 891 (7.2%) | 7662 |
| sm.Devil 7.3 | 18679 | 1399 (7.5%) | 15047 |
| seed.Anastasia 1.0 | 12534 | 409 (3.3%) | 1056 |
| janm.Jammy 1.0 | 6914 | 340 (4.9%) | 199 |
| dcs.PM.Eater_of_Worlds_PM 1.2 | 11322 | 622 (5.5%) | 3485 |
| apv.MicroAspid 1.8 | 13933 | 745 (5.3%) | 4078 |
| mladjo.Grrrrr 0.9 | 12725 | 1204 (9.5%) | 9659 |
| md.November 1.0 | 8962 | 429 (4.8%) | 1592 |
| ph.mini.Archer 0.6.6 | 13853 | 1167 (8.4%) | 9786 |
| cb.mega.RandomBot 1.0 | 11877 | 1065 (9.0%) | 9869 |
| dmp.micro.Aurora 1.41 | 6306 | 470 (7.5%) | 2292 |
| doka.Test 1.0 | 7341 | 379 (5.2%) | 898 |
| davidalves.net.DuelistNano 1.0 | 8493 | 414 (4.9%) | 2416 |
| arthord.NanoSatanMelee Beta | 7780 | 333 (4.3%) | 413 |
| DTF.Kludgy 1.2b | 12954 | 932 (7.2%) | 8722 |
| cx.Princess 1.0 | 811 | 73 (9.0%) | 94 |
| slugzilla.RandomPattern 1.0 | 12324 | 1105 (9.0%) | 8532 |
| stelo.MatchupAGF 1.1 | 17324 | 1545 (8.9%) | 15209 |
| stelo.MatchupMini 1.1 | 12261 | 973 (7.9%) | 7202 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| gh.micro.GrubbmThree 1.01 | 650 | 154 | 650 | 148 | 100.3 / 73.5 | 1984 | 1344 | 20 |
| cf.OldMan.OldManXP 0.1 | 650 | 512 | 431 | 351 | 54.8 / 21.0 | 2955 | 4486 | 353 |
| mz.NanoDeath 2.56 | 650 | 157 | 650 | 145 | 98.1 / 65.0 | 1989 | 2285 | 102 |
| sul.Bicephal 1.2 | 650 | 157 | 650 | 143 | 91.7 / 59.7 | 1777 | 1910 | 195 |
| kc.micro.rammer.MaxRisk 0.6 | 650 | 149 | 650 | 157 | 101.8 / 67.9 | 2148 | 1898 | 111 |
| mn.nano.perceptual.Impact 1.3.0 | 650 | 149 | 650 | 161 | 107.7 / 78.0 | 2199 | 1595 | 138 |
| test.Podgy 4.0 | 650 | 467 | 434 | 390 | 47.1 / 16.3 | 2011 | 4826 | 772 |
| non.mega.NaN 0.1 | 650 | 492 | 431 | 259 | 69.1 / 15.6 | 2605 | 6561 | 8 |
| demetrix.nano.Neutrino 0.27 | 650 | 436 | 575 | 520 | 41.3 / 20.2 | 905 | 4475 | 2833 |
| whind.Wisdom 0.5.1 | 650 | 466 | 466 | 401 | 41.4 / 22.2 | 1512 | 5196 | 3157 |
| as.xbots 1.0 | 650 | 191 | 616 | 182 | 87.6 / 44.7 | 2411 | 1997 | 154 |
| ers.nano.sunderer.Sunderer 1.23a | 650 | 169 | 650 | 183 | 103.6 / 61.4 | 2102 | 2346 | 184 |
| robar.nano.Breeze 0.3 | 650 | 455 | 400 | 463 | 50.5 / 15.3 | 1854 | 5868 | 1048 |
| dmh.robocode.robot.PinkPanther 1.1 | 650 | 601 | 613 | 637 | 22.6 / 31.3 | 131 | 14931 | 2559 |
| sm.Devil 7.3 | 650 | 535 | 538 | 875 | 51.4 / 21.3 | 1820 | 3941 | 1665 |
| seed.Anastasia 1.0 | 650 | 429 | 400 | 638 | 62.4 / 9.5 | 2569 | 2671 | 312 |
| janm.Jammy 1.0 | 650 | 528 | 400 | 384 | 43.2 / 18.5 | 1982 | 5103 | 3139 |
| dcs.PM.Eater_of_Worlds_PM 1.2 | 650 | 506 | 634 | 567 | 39.9 / 25.4 | 913 | 4740 | 4172 |
| apv.MicroAspid 1.8 | 650 | 549 | 650 | 661 | 27.4 / 27.8 | 98 | 7811 | 13 |
| mladjo.Grrrrr 0.9 | 650 | 469 | 628 | 631 | 37.1 / 30.4 | 610 | 2802 | 4002 |
| md.November 1.0 | 650 | 451 | 400 | 467 | 45.5 / 14.8 | 1259 | 6458 | 243 |
| ph.mini.Archer 0.6.6 | 650 | 508 | 650 | 668 | 36.0 / 30.0 | 479 | 2532 | 1120 |
| cb.mega.RandomBot 1.0 | 650 | 402 | 594 | 592 | 43.0 / 30.4 | 1058 | 3833 | 95 |
| dmp.micro.Aurora 1.41 | 650 | 371 | 416 | 352 | 48.1 / 18.9 | 2307 | 6375 | 166 |
| doka.Test 1.0 | 650 | 444 | 400 | 409 | 58.7 / 17.7 | 3827 | 3672 | 1629 |
| davidalves.net.DuelistNano 1.0 | 650 | 465 | 472 | 446 | 39.1 / 18.9 | 1276 | 5224 | 3414 |
| arthord.NanoSatanMelee Beta | 650 | 484 | 438 | 414 | 44.7 / 16.0 | 1744 | 4808 | 3331 |
| DTF.Kludgy 1.2b | 650 | 458 | 531 | 661 | 54.4 / 23.6 | 3643 | 2868 | 6 |
| cx.Princess 1.0 | 650 | 415 | 650 | 42 | 3.3 / 2.3 | 92 | 262 | 16 |
| slugzilla.RandomPattern 1.0 | 650 | 532 | 650 | 608 | 33.9 / 26.6 | 341 | 2726 | 5123 |
| stelo.MatchupAGF 1.1 | 650 | 427 | 622 | 822 | 44.3 / 28.7 | 1661 | 5583 | 233 |
| stelo.MatchupMini 1.1 | 650 | 486 | 650 | 611 | 38.6 / 29.4 | 884 | 2498 | 3493 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| gh.micro.GrubbmThree 1.01 | 60.3% | 84 | 23 | 3 | 7.0 | 70 / 70 (100%) | 0 | 0 |
| cf.OldMan.OldManXP 0.1 | 6.7% | 113 | 214 | 3 | 16.6 | 292 / 294 (99%) | 0 | 0 |
| mz.NanoDeath 2.56 | 49.7% | 82 | 30 | 3 | 7.5 | 58 / 58 (100%) | 0 | 0 |
| sul.Bicephal 1.2 | 52.6% | 78 | 22 | 3 | 6.4 | 54 / 58 (93%) | 0 | 0 |
| kc.micro.rammer.MaxRisk 0.6 | 53.8% | 81 | 23 | 3 | 8.2 | 214 / 214 (100%) | 0 | 0 |
| mn.nano.perceptual.Impact 1.3.0 | 63.7% | 78 | 21 | 3 | 8.5 | 119 / 119 (100%) | 0 | 0 |
| test.Podgy 4.0 | 5.0% | 111 | 63 | 3 | 19.2 | 371 / 373 (99%) | 0 | 0 |
| non.mega.NaN 0.1 | 8.4% | 83 | 30 | 3 | 11.9 | 182 / 182 (100%) | 0 | 0 |
| demetrix.nano.Neutrino 0.27 | 5.5% | 91 | 54 | 3 | 35.0 | 823 / 823 (100%) | 0 | 0 |
| whind.Wisdom 0.5.1 | 5.5% | 72 | 63 | 3 | 22.6 | 380 / 380 (100%) | 0 | 0 |
| as.xbots 1.0 | 34.2% | 88 | 28 | 3 | 9.8 | 232 / 234 (99%) | 0 | 0 |
| ers.nano.sunderer.Sunderer 1.23a | 46.5% | 92 | 25 | 3 | 10.4 | 222 / 223 (100%) | 0 | 0 |
| robar.nano.Breeze 0.3 | 5.5% | 80 | 229 | 3 | 33.6 | 672 / 677 (99%) | 0 | 0 |
| dmh.robocode.robot.PinkPanther 1.1 | 6.2% | 103 | 6750 | 3 | 36.4 | 887 / 891 (100%) | 0 | 0 |
| sm.Devil 7.3 | 8.0% | 146 | 929 | 3 | 65.8 | 1391 / 1399 (99%) | 0 | 0 |
| seed.Anastasia 1.0 | 5.1% | 79 | 30 | 3 | 29.2 | 407 / 409 (100%) | 0 | 0 |
| janm.Jammy 1.0 | 4.9% | 78 | 77 | 3 | 21.4 | 340 / 340 (100%) | 0 | 0 |
| dcs.PM.Eater_of_Worlds_PM 1.2 | 6.5% | 85 | 59 | 3 | 34.9 | 619 / 622 (100%) | 0 | 0 |
| apv.MicroAspid 1.8 | 5.6% | 80 | 5123 | 3 | 34.1 | 744 / 745 (100%) | 0 | 0 |
| mladjo.Grrrrr 0.9 | 7.4% | 92 | 1193 | 3 | 42.3 | 1204 / 1204 (100%) | 0 | 0 |
| md.November 1.0 | 6.0% | 99 | 50 | 3 | 23.9 | 427 / 429 (100%) | 0 | 0 |
| ph.mini.Archer 0.6.6 | 7.4% | 103 | 1370 | 3 | 46.8 | 1158 / 1167 (99%) | 0 | 0 |
| cb.mega.RandomBot 1.0 | 8.1% | 82 | 132 | 3 | 39.7 | 1063 / 1065 (100%) | 0 | 0 |
| dmp.micro.Aurora 1.41 | 5.6% | 76 | 911 | 3 | 20.8 | 469 / 470 (100%) | 0 | 0 |
| doka.Test 1.0 | 6.6% | 84 | 49 | 3 | 25.1 | 377 / 379 (99%) | 0 | 0 |
| davidalves.net.DuelistNano 1.0 | 4.5% | 88 | 51 | 3 | 23.1 | 413 / 414 (100%) | 0 | 0 |
| arthord.NanoSatanMelee Beta | 5.9% | 90 | 211 | 3 | 21.3 | 333 / 333 (100%) | 0 | 0 |
| DTF.Kludgy 1.2b | 9.4% | 127 | 6836 | 3 | 44.3 | 928 / 932 (100%) | 0 | 0 |
| cx.Princess 1.0 | 0.7% | 43 | 23 | 3 | 2.1 | 70 / 73 (96%) | 0 | 0 |
| slugzilla.RandomPattern 1.0 | 6.2% | 85 | 961 | 3 | 40.8 | 1105 / 1105 (100%) | 0 | 0 |
| stelo.MatchupAGF 1.1 | 8.5% | 113 | 453 | 3 | 60.0 | 1544 / 1545 (100%) | 0 | 0 |
| stelo.MatchupMini 1.1 | 7.3% | 75 | 72 | 3 | 41.1 | 973 / 973 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| gh.micro.GrubbmThree 1.01 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cf.OldMan.OldManXP 0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mz.NanoDeath 2.56 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sul.Bicephal 1.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kc.micro.rammer.MaxRisk 0.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mn.nano.perceptual.Impact 1.3.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| test.Podgy 4.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| non.mega.NaN 0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| demetrix.nano.Neutrino 0.27 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| whind.Wisdom 0.5.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| as.xbots 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ers.nano.sunderer.Sunderer 1.23a | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| robar.nano.Breeze 0.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dmh.robocode.robot.PinkPanther 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sm.Devil 7.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| seed.Anastasia 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| janm.Jammy 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dcs.PM.Eater_of_Worlds_PM 1.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apv.MicroAspid 1.8 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mladjo.Grrrrr 0.9 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| md.November 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ph.mini.Archer 0.6.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cb.mega.RandomBot 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dmp.micro.Aurora 1.41 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| doka.Test 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.net.DuelistNano 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| arthord.NanoSatanMelee Beta | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| DTF.Kludgy 1.2b | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cx.Princess 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| slugzilla.RandomPattern 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.MatchupAGF 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.MatchupMini 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| gh.micro.GrubbmThree 1.01 | gh.micro.GrubbmThree | 1 | 35 | 314 | 71.8% | 18.1% ± 4.5 | 51.0% | 11.1% / 9.7% | 5.2% | 0 / 0 | T?/M? | 63% |
| cf.OldMan.OldManXP 0.1 | cf.OldMan.OldManXP | 1 | 35 | 304 | 7.4% | 10.0% ± 2.6 | 18.8% | 29.3% / 27.0% | 5.5% | 0 / 0 | T3/M? | 87% |
| mz.NanoDeath 2.56 | mz.NanoDeath | 1 | 35 | 282 | 53.9% | 11.9% ± 3.8 | 46.0% | 13.4% / 12.3% | 5.2% | 0 / 0 | T?/M? | 69% |
| sul.Bicephal 1.2 | sul.Bicephal | 1 | 35 | 280 | 59.7% | 5.3% ± 3.3 | 41.9% | 11.3% / 9.4% | 26.7% | 0 / 0 | T?/M? | 69% |
| kc.micro.rammer.MaxRisk 0.6 | kc.micro.rammer.MaxRisk | 1 | 35 | 324 | 56.5% | 11.2% ± 3.8 | 46.3% | 12.7% / 11.2% | 7.0% | 0 / 0 | T?/M? | 66% |
| mn.nano.perceptual.Impact 1.3.0 | mn.nano.perceptual.Impact | 1 | 35 | 336 | 70.6% | 7.9% ± 3.3 | 44.2% | 7.5% / 7.8% | 19.1% | 0 / 0 | T?/M? | 63% |
| test.Podgy 4.0 | test.Podgy | 1 | 35 | 272 | 6.2% | 7.2% ± 2.2 | 16.2% | 34.2% / 34.5% | 23.0% | 0 / 0 | T3/M? | 87% |
| non.mega.NaN 0.1 | non.mega.NaN | 1 | 35 | 280 | 7.7% | 9.6% ± 2.9 | 25.4% | 32.3% / 28.9% | 4.7% | 0 / 0 | T3/M? | 91% |
| demetrix.nano.Neutrino 0.27 | demetrix.nano.Neutrino | 1 | 35 | 322 | 6.1% | 5.5% ± 1.3 | 11.5% | 25.4% / 22.5% | 6.5% | 0 / 0 | T2/M0 | 79% |
| whind.Wisdom 0.5.1 | whind.Wisdom | 1 | 35 | 284 | 5.6% | 6.9% ± 1.8 | 13.4% | 31.6% / 27.4% | 16.8% | 0 / 0 | T2/M0 | 79% |
| as.xbots 1.0 | as.xbots | 1 | 35 | 264 | 43.2% | 4.3% ± 2.6 | 38.3% | 12.9% / 13.2% | 27.2% | 0 / 0 | T1/M? | 71% |
| ers.nano.sunderer.Sunderer 1.23a | ers.nano.sunderer.Sunderer | 1 | 35 | 340 | 52.7% | 11.5% ± 3.4 | 44.7% | 12.4% / 12.5% | 4.5% | 0 / 0 | T?/M? | 67% |
| robar.nano.Breeze 0.3 | robar.nano.Breeze | 1 | 35 | 300 | 7.6% | 6.7% ± 1.5 | 14.4% | 32.6% / 28.2% | 3.9% | 0 / 0 | T2/M0 | 85% |
| dmh.robocode.robot.PinkPanther 1.1 | dmh.robocode.robot.PinkPanther | 1 | 35 | 352 | 6.8% | 8.8% ± 1.5 | 10.1% | 27.6% / 23.5% | 5.6% | 0 / 0 | T3/M0 | 60% |
| sm.Devil 7.3 | sm.Devil | 1 | 35 | 264 | 8.8% | 7.8% ± 1.1 | 13.9% | 30.2% / 25.4% | 4.7% | 0 / 0 | T3/M0 | 81% |
| seed.Anastasia 1.0 | seed.Anastasia | 1 | 35 | 288 | 5.3% | 3.3% ± 1.2 | 14.6% | 24.2% / 24.8% | 12.9% | 0 / 0 | T1/M1 | 93% |
| janm.Jammy 1.0 | janm.Jammy | 1 | 35 | 272 | 5.5% | 7.1% ± 1.9 | 14.8% | 30.2% / 28.0% | 7.9% | 0 / 0 | T3/M? | 85% |
| dcs.PM.Eater_of_Worlds_PM 1.2 | dcs.PM.Eater_of_Worlds_PM | 1 | 35 | 332 | 7.4% | 7.7% ± 1.5 | 11.7% | 24.3% / 21.8% | 16.7% | 0 / 0 | T3/M1 | 73% |
| apv.MicroAspid 1.8 | apv.MicroAspid | 1 | 35 | 288 | 7.5% | 8.6% ± 1.7 | 10.5% | 23.6% / 22.4% | 3.9% | 0 / 0 | T3/M1 | 71% |
| mladjo.Grrrrr 0.9 | mladjo.Grrrrr | 1 | 35 | 284 | 7.7% | 7.4% ± 1.4 | 12.0% | 25.3% / 22.2% | 5.9% | 0 / 0 | T3/M0 | 74% |
| md.November 1.0 | md.November | 1 | 35 | 276 | 4.7% | 4.6% ± 1.6 | 13.9% | 29.5% / 26.9% | 10.7% | 0 / 0 | T2/M0 | 88% |
| ph.mini.Archer 0.6.6 | ph.mini.Archer | 1 | 35 | 292 | 7.7% | 7.2% ± 1.3 | 10.6% | 23.5% / 22.1% | 5.0% | 0 / 0 | T3/M1 | 75% |
| cb.mega.RandomBot 1.0 | cb.mega.RandomBot | 1 | 35 | 300 | 9.1% | 7.7% ± 1.5 | 13.4% | 24.7% / 21.7% | 3.9% | 0 / 0 | T3/M1 | 72% |
| dmp.micro.Aurora 1.41 | dmp.micro.Aurora | 1 | 35 | 298 | 7.6% | 6.8% ± 1.9 | 15.5% | 28.5% / 24.1% | 20.0% | 0 / 0 | T2/M? | 77% |
| doka.Test 1.0 | doka.Test | 1 | 35 | 268 | 8.2% | 7.2% ± 1.7 | 17.2% | 37.1% / 37.6% | 27.8% | 0 / 0 | T3/M? | 81% |
| davidalves.net.DuelistNano 1.0 | davidalves.net.DuelistNano | 1 | 35 | 336 | 3.0% | 3.0% ± 1.3 | 13.2% | 28.7% / 25.8% | 22.6% | 0 / 0 | T1/M0 | 89% |
| arthord.NanoSatanMelee Beta | arthord.NanoSatanMelee | 1 | 35 | 322 | 6.8% | 5.9% ± 1.8 | 15.2% | 30.4% / 27.2% | 15.0% | 0 / 0 | T2/M? | 82% |
| DTF.Kludgy 1.2b | DTF.Kludgy | 1 | 35 | 274 | 10.2% | 8.4% ± 1.3 | 14.7% | 26.5% / 28.6% | 0.9% | 0 / 0 | T3/M0 | 70% |
| cx.Princess 1.0 | cx.Princess | 1 | 35 | 276 | 8.9% | 7.1% ± 9.2 | 18.5% | 29.4% / 30.9% | 14.9% | 0 / 0 | T?/M? | 99% |
| slugzilla.RandomPattern 1.0 | slugzilla.RandomPattern | 1 | 35 | 324 | 6.9% | 7.5% ± 1.5 | 11.0% | 26.1% / 20.6% | 5.5% | 0 / 0 | T3/M0 | 75% |
| stelo.MatchupAGF 1.1 | stelo.MatchupAGF | 1 | 35 | 296 | 10.3% | 7.9% ± 1.1 | 13.0% | 24.0% / 23.5% | 6.3% | 0 / 0 | T3/M1 | 67% |
| stelo.MatchupMini 1.1 | stelo.MatchupMini | 1 | 35 | 300 | 8.7% | 8.0% ± 1.5 | 12.8% | 24.4% / 22.3% | 6.1% | 0 / 0 | T3/M1 | 71% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.9 vs hadur2.Hadur 3.4

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| gh.micro.GrubbmThree 1.01 | 64.6% ± 1.5 | 63.8% ± 1.6 | +0.8 ± 1.8 |
| cf.OldMan.OldManXP 0.1 | 82.8% ± 10.5 | 70.3% ± 3.9 | +12.4 ± 10.3 |
| mz.NanoDeath 2.56 | 67.4% ± 2.7 | 65.5% ± 1.4 | +1.9 ± 2.9 |
| sul.Bicephal 1.2 | 67.2% ± 1.3 | 66.3% ± 1.8 | +0.9 ± 1.8 |
| kc.micro.rammer.MaxRisk 0.6 | 67.5% ± 2.7 | 60.7% ± 1.8 | +6.8 ± 3.4 |
| mn.nano.perceptual.Impact 1.3.0 | 65.5% ± 3.0 | 62.4% ± 1.1 | +3.1 ± 3.8 |
| test.Podgy 4.0 | 86.7% ± 2.5 | 84.5% ± 1.6 | +2.2 ± 2.5 |
| non.mega.NaN 0.1 | 88.8% ± 6.6 | 72.6% ± 4.8 | +16.2 ± 6.8 |
| demetrix.nano.Neutrino 0.27 | 81.9% ± 4.1 | 81.4% ± 2.9 | +0.5 ± 3.2 |
| whind.Wisdom 0.5.1 | 80.1% ± 2.3 | 79.3% ± 2.0 | +0.8 ± 2.5 |
| as.xbots 1.0 | 73.9% ± 4.5 | 70.1% ± 1.9 | +3.8 ± 6.0 |
| ers.nano.sunderer.Sunderer 1.23a | 72.7% ± 2.5 | 64.5% ± 1.5 | +8.2 ± 3.6 |
| robar.nano.Breeze 0.3 | 87.5% ± 2.1 | 87.1% ± 2.5 | +0.3 ± 3.7 |
| dmh.robocode.robot.PinkPanther 1.1 | 65.3% ± 4.7 | 70.0% ± 3.9 | -4.7 ± 6.9 |
| sm.Devil 7.3 | 80.6% ± 3.0 | 81.4% ± 2.5 | -0.8 ± 2.7 |
| seed.Anastasia 1.0 | 93.0% ± 2.3 | 91.3% ± 2.5 | +1.8 ± 4.0 |
| janm.Jammy 1.0 | 83.8% ± 3.1 | 85.4% ± 1.6 | -1.6 ± 3.3 |
| dcs.PM.Eater_of_Worlds_PM 1.2 | 76.6% ± 2.8 | 78.1% ± 5.0 | -1.4 ± 5.3 |
| apv.MicroAspid 1.8 | 70.2% ± 4.6 | 73.0% ± 2.8 | -2.9 ± 5.3 |
| mladjo.Grrrrr 0.9 | 69.4% ± 3.3 | 69.3% ± 2.0 | +0.1 ± 4.2 |
| md.November 1.0 | 86.2% ± 4.4 | 84.4% ± 3.9 | +1.9 ± 6.2 |
| ph.mini.Archer 0.6.6 | 68.0% ± 5.6 | 69.8% ± 5.0 | -1.9 ± 8.4 |
| cb.mega.RandomBot 1.0 | 70.2% ± 3.3 | 68.7% ± 4.5 | +1.5 ± 3.9 |
| dmp.micro.Aurora 1.41 | 84.2% ± 3.4 | 84.0% ± 2.6 | +0.1 ± 5.2 |
| doka.Test 1.0 | 86.4% ± 3.2 | 84.4% ± 3.7 | +2.0 ± 5.3 |
| davidalves.net.DuelistNano 1.0 | 82.0% ± 7.4 | 87.1% ± 3.7 | -5.2 ± 8.0 |
| arthord.NanoSatanMelee Beta | 86.6% ± 3.3 | 86.7% ± 4.4 | -0.1 ± 3.4 |
| DTF.Kludgy 1.2b | 76.1% ± 2.8 | 74.9% ± 4.3 | +1.3 ± 5.0 |
| cx.Princess 1.0 | 95.0% ± 5.4 | 95.3% ± 3.7 | -0.3 ± 7.5 |
| slugzilla.RandomPattern 1.0 | 75.5% ± 3.4 | 72.7% ± 1.5 | +2.8 ± 4.1 |
| stelo.MatchupAGF 1.1 | 71.6% ± 2.7 | 69.4% ± 3.2 | +2.1 ± 5.1 |
| stelo.MatchupMini 1.1 | 70.9% ± 3.3 | 69.3% ± 4.2 | +1.6 ± 5.3 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| gh.micro.GrubbmThree 1.01 | +0.8 ± 1.8 | -2.4 ± 3.4 | -2.5 ± 3.2 | -1.1 ± 0.8 |
| cf.OldMan.OldManXP 0.1 | +12.4 ± 10.3 | +7.9 ± 6.5 | +7.9 ± 6.5 | +21.7 ± 14.7 |
| mz.NanoDeath 2.56 | +1.9 ± 2.9 | -1.4 ± 4.6 | -1.4 ± 4.6 | -0.4 ± 0.9 |
| sul.Bicephal 1.2 | +0.9 ± 1.8 | -3.2 ± 4.2 | -3.2 ± 4.1 | -0.2 ± 2.5 |
| kc.micro.rammer.MaxRisk 0.6 | +6.8 ± 3.4 | +2.7 ± 4.7 | +2.5 ± 4.5 | +2.4 ± 1.7 |
| mn.nano.perceptual.Impact 1.3.0 | +3.1 ± 3.8 | +0.2 ± 4.5 | +0.0 ± 4.4 | -0.8 ± 1.0 |
| test.Podgy 4.0 | +2.2 ± 2.5 | +2.5 ± 2.4 | +2.5 ± 2.4 | +1.9 ± 3.7 |
| non.mega.NaN 0.1 | +16.2 ± 6.8 | +7.5 ± 6.0 | +7.5 ± 6.0 | +29.2 ± 7.8 |
| demetrix.nano.Neutrino 0.27 | +0.5 ± 3.2 | -1.4 ± 2.9 | -1.4 ± 2.9 | +2.6 ± 5.0 |
| whind.Wisdom 0.5.1 | +0.8 ± 2.5 | -1.1 ± 3.4 | -1.1 ± 3.4 | +2.8 ± 3.4 |
| as.xbots 1.0 | +3.8 ± 6.0 | +1.1 ± 3.1 | +1.1 ± 3.1 | +0.9 ± 4.8 |
| ers.nano.sunderer.Sunderer 1.23a | +8.2 ± 3.6 | +5.9 ± 4.3 | +5.7 ± 4.2 | +2.4 ± 2.7 |
| robar.nano.Breeze 0.3 | +0.3 ± 3.7 | +0.0 ± 4.4 | +0.0 ± 4.4 | +0.6 ± 3.8 |
| dmh.robocode.robot.PinkPanther 1.1 | -4.7 ± 6.9 | -2.5 ± 6.3 | -2.5 ± 6.3 | -6.6 ± 7.5 |
| sm.Devil 7.3 | -0.8 ± 2.7 | -1.4 ± 4.2 | -1.4 ± 4.2 | -0.4 ± 3.8 |
| seed.Anastasia 1.0 | +1.8 ± 4.0 | +2.9 ± 3.6 | +2.9 ± 3.6 | +1.0 ± 4.5 |
| janm.Jammy 1.0 | -1.6 ± 3.3 | -3.2 ± 2.7 | -3.2 ± 2.7 | +5.6 ± 5.9 |
| dcs.PM.Eater_of_Worlds_PM 1.2 | -1.4 ± 5.3 | -1.1 ± 6.9 | -1.1 ± 6.9 | -1.4 ± 4.0 |
| apv.MicroAspid 1.8 | -2.9 ± 5.3 | -1.8 ± 4.4 | -1.8 ± 4.4 | -4.2 ± 7.3 |
| mladjo.Grrrrr 0.9 | +0.1 ± 4.2 | +0.7 ± 5.4 | +0.7 ± 5.4 | -0.1 ± 3.5 |
| md.November 1.0 | +1.9 ± 6.2 | -0.4 ± 4.3 | -0.4 ± 4.3 | +3.5 ± 7.7 |
| ph.mini.Archer 0.6.6 | -1.9 ± 8.4 | -4.4 ± 10.1 | -4.3 ± 10.1 | +1.0 ± 6.4 |
| cb.mega.RandomBot 1.0 | +1.5 ± 3.9 | +1.8 ± 4.9 | +1.8 ± 4.9 | +1.0 ± 2.9 |
| dmp.micro.Aurora 1.41 | +0.1 ± 5.2 | -0.7 ± 6.2 | -0.7 ± 6.2 | +1.2 ± 4.2 |
| doka.Test 1.0 | +2.0 ± 5.3 | +2.1 ± 5.8 | +2.1 ± 5.8 | +2.1 ± 5.8 |
| davidalves.net.DuelistNano 1.0 | -5.2 ± 8.0 | -3.6 ± 6.1 | -3.6 ± 6.1 | -5.4 ± 8.8 |
| arthord.NanoSatanMelee Beta | -0.1 ± 3.4 | -0.4 ± 1.5 | -0.4 ± 1.5 | -0.2 ± 5.3 |
| DTF.Kludgy 1.2b | +1.3 ± 5.0 | +1.8 ± 8.5 | +1.8 ± 8.5 | +0.8 ± 3.1 |
| cx.Princess 1.0 | -0.3 ± 7.5 | -0.4 ± 4.3 | -0.4 ± 4.3 | -0.6 ± 19.7 |
| slugzilla.RandomPattern 1.0 | +2.8 ± 4.1 | +2.8 ± 5.6 | +2.9 ± 5.6 | +1.6 ± 4.5 |
| stelo.MatchupAGF 1.1 | +2.1 ± 5.1 | +4.6 ± 8.2 | +4.6 ± 8.2 | -0.2 ± 2.8 |
| stelo.MatchupMini 1.1 | +1.6 ± 5.3 | +2.1 ± 7.6 | +2.1 ± 7.6 | +0.6 ± 3.4 |
| All pairs | +1.7 ± 0.9 | +0.5 ± 0.8 | +0.5 ± 0.8 | +1.9 ± 1.2 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| gh.micro.GrubbmThree 1.01 | 8 | 5 | +0.8 ± 1.8 | -0.3 ± 2.1 |
| cf.OldMan.OldManXP 0.1 | 8 | 7 | +12.4 ± 10.3 | +16.4 ± 5.2 |
| mz.NanoDeath 2.56 | 8 | 7 | +1.9 ± 2.9 | +1.8 ± 3.4 |
| sul.Bicephal 1.2 | 8 | 4 | +0.9 ± 1.8 | +2.4 ± 1.3 |
| kc.micro.rammer.MaxRisk 0.6 | 8 | 2 | +6.8 ± 3.4 | +5.8 ± 27.7 |
| mn.nano.perceptual.Impact 1.3.0 | 8 | 6 | +3.1 ± 3.8 | +3.4 ± 4.4 |
| test.Podgy 4.0 | 8 | 4 | +2.2 ± 2.5 | +1.4 ± 4.9 |
| non.mega.NaN 0.1 | 8 | 6 | +16.2 ± 6.8 | +18.7 ± 6.5 |
| demetrix.nano.Neutrino 0.27 | 8 | 7 | +0.5 ± 3.2 | +1.0 ± 3.6 |
| whind.Wisdom 0.5.1 | 8 | 2 | +0.8 ± 2.5 | +1.6 ± 18.9 |
| as.xbots 1.0 | 8 | 4 | +3.8 ± 6.0 | +5.7 ± 12.7 |
| ers.nano.sunderer.Sunderer 1.23a | 8 | 5 | +8.2 ± 3.6 | +7.2 ± 6.1 |
| robar.nano.Breeze 0.3 | 8 | 6 | +0.3 ± 3.7 | +0.6 ± 5.4 |
| dmh.robocode.robot.PinkPanther 1.1 | 8 | 7 | -4.7 ± 6.9 | -2.6 ± 5.7 |
| sm.Devil 7.3 | 8 | 7 | -0.8 ± 2.7 | -1.9 ± 1.3 |
| seed.Anastasia 1.0 | 8 | 7 | +1.8 ± 4.0 | +1.3 ± 4.5 |
| janm.Jammy 1.0 | 8 | 7 | -1.6 ± 3.3 | -1.3 ± 3.8 |
| dcs.PM.Eater_of_Worlds_PM 1.2 | 8 | 6 | -1.4 ± 5.3 | +0.4 ± 6.6 |
| apv.MicroAspid 1.8 | 8 | 5 | -2.9 ± 5.3 | -3.4 ± 9.9 |
| mladjo.Grrrrr 0.9 | 8 | 6 | +0.1 ± 4.2 | +0.6 ± 5.7 |
| md.November 1.0 | 8 | 4 | +1.9 ± 6.2 | +4.2 ± 3.9 |
| ph.mini.Archer 0.6.6 | 8 | 6 | -1.9 ± 8.4 | -3.8 ± 9.2 |
| cb.mega.RandomBot 1.0 | 8 | 5 | +1.5 ± 3.9 | -0.8 ± 4.8 |
| dmp.micro.Aurora 1.41 | 8 | 5 | +0.1 ± 5.2 | +0.2 ± 4.1 |
| doka.Test 1.0 | 8 | 6 | +2.0 ± 5.3 | +2.8 ± 7.5 |
| davidalves.net.DuelistNano 1.0 | 8 | 6 | -5.2 ± 8.0 | -1.8 ± 8.2 |
| arthord.NanoSatanMelee Beta | 8 | 8 | -0.1 ± 3.4 | -0.1 ± 3.4 |
| DTF.Kludgy 1.2b | 8 | 4 | +1.3 ± 5.0 | -1.6 ± 9.0 |
| cx.Princess 1.0 | 8 | 6 | -0.3 ± 7.5 | +0.5 ± 4.8 |
| slugzilla.RandomPattern 1.0 | 8 | 7 | +2.8 ± 4.1 | +3.4 ± 4.5 |
| stelo.MatchupAGF 1.1 | 8 | 4 | +2.1 ± 5.1 | +3.8 ± 8.1 |
| stelo.MatchupMini 1.1 | 8 | 3 | +1.6 ± 5.3 | +4.7 ± 21.3 |
| All pairs | 256 | 174 | +1.7 ± 0.9 | +2.1 ± 1.0 |

# Bench: hadur2.Hadur 3.9 baseline (hadur2.Hadur 3.4) (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 3013 over 256 battles (11.8 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| gh.micro.GrubbmThree 1.01 | weak | 63.8% ± 1.6 | 93.4% ± 3.6 | 59.0% ± 0.9 | 262 / 280 | 80.6% ± 1.7 | 60.7% ± 1.1 | 78 | 0 | 0.57 / 10.5 |
| cf.OldMan.OldManXP 0.1 | weak | 70.3% ± 3.9 | 87.1% ± 4.4 | 49.7% ± 3.5 | 244 / 280 | 9.0% ± 0.8 | 6.6% ± 4.2 | 184 | 0 | 0.99 / 13.8 |
| mz.NanoDeath 2.56 | weak | 65.5% ± 1.4 | 93.2% ± 3.1 | 60.7% ± 0.9 | 261 / 280 | 80.5% ± 1.9 | 52.8% ± 3.0 | 74 | 0 | 0.50 / 10.2 |
| sul.Bicephal 1.2 | weak | 66.3% ± 1.8 | 95.7% ± 3.7 | 61.1% ± 1.3 | 268 / 280 | 78.5% ± 2.0 | 55.1% ± 3.9 | 75 | 0 | 0.50 / 9.8 |
| kc.micro.rammer.MaxRisk 0.6 | weak | 60.7% ± 1.8 | 88.7% ± 3.4 | 57.5% ± 0.9 | 249 / 280 | 77.1% ± 2.0 | 56.7% ± 2.2 | 66 | 0 | 0.52 / 10.5 |
| mn.nano.perceptual.Impact 1.3.0 | weak | 62.4% ± 1.1 | 92.7% ± 2.6 | 58.8% ± 0.5 | 260 / 280 | 81.8% ± 2.2 | 62.4% ± 1.5 | 70 | 0 | 0.52 / 10.2 |
| test.Podgy 4.0 | weak | 84.5% ± 1.6 | 95.7% ± 1.8 | 72.3% ± 2.2 | 268 / 280 | 17.6% ± 1.7 | 6.1% ± 2.6 | 100 | 0 | 0.86 / 13.0 |
| non.mega.NaN 0.1 | weak | 72.6% ± 4.8 | 90.0% ± 5.1 | 52.1% ± 4.3 | 252 / 280 | 8.9% ± 0.7 | 7.5% ± 4.1 | 166 | 0 | 1.04 / 15.6 |
| demetrix.nano.Neutrino 0.27 | weak | 81.4% ± 2.9 | 96.8% ± 2.7 | 64.5% ± 2.7 | 271 / 280 | 13.3% ± 0.8 | 5.8% ± 0.9 | 84 | 0 | 0.88 / 13.6 |
| whind.Wisdom 0.5.1 | weak | 79.3% ± 2.0 | 95.4% ± 2.2 | 62.3% ± 2.8 | 267 / 280 | 15.4% ± 1.0 | 9.9% ± 4.9 | 95 | 0 | 0.87 / 94.9 |
| as.xbots 1.0 | weak | 70.1% ± 1.9 | 93.9% ± 1.5 | 65.5% ± 2.2 | 263 / 280 | 65.2% ± 2.3 | 36.7% ± 4.0 | 70 | 0 | 0.52 / 9.6 |
| ers.nano.sunderer.Sunderer 1.23a | weak | 64.5% ± 1.5 | 91.3% ± 3.5 | 60.5% ± 1.2 | 256 / 280 | 76.7% ± 1.4 | 57.3% ± 5.2 | 83 | 0 | 0.53 / 9.7 |
| robar.nano.Breeze 0.3 | weak | 87.1% ± 2.5 | 97.5% ± 2.7 | 76.1% ± 2.6 | 273 / 280 | 17.0% ± 1.2 | 7.5% ± 4.8 | 99 | 0 | 0.92 / 26.5 |
| dmh.robocode.robot.PinkPanther 1.1 | weak | 70.0% ± 3.9 | 88.6% ± 3.8 | 48.5% ± 4.4 | 248 / 280 | 9.2% ± 0.4 | 5.2% ± 0.6 | 103 | 0 | 1.03 / 14.2 |
| sm.Devil 7.3 | weak | 81.4% ± 2.5 | 92.1% ± 3.1 | 71.1% ± 3.0 | 258 / 280 | 14.8% ± 0.8 | 7.8% ± 0.5 | 154 | 0 | 1.36 / 17.9 |
| seed.Anastasia 1.0 | weak | 91.3% ± 2.5 | 96.4% ± 3.3 | 85.9% ± 2.4 | 270 / 280 | 16.5% ± 0.8 | 7.5% ± 5.3 | 78 | 0 | 3.26 / 17.2 |
| janm.Jammy 1.0 | weak | 85.4% ± 1.6 | 99.6% ± 0.8 | 64.4% ± 3.7 | 279 / 280 | 10.6% ± 0.9 | 3.7% ± 0.5 | 90 | 0 | 0.86 / 14.5 |
| dcs.PM.Eater_of_Worlds_PM 1.2 | weak | 78.1% ± 5.0 | 92.9% ± 7.4 | 62.5% ± 3.2 | 260 / 280 | 13.0% ± 0.5 | 6.2% ± 0.5 | 93 | 0 | 0.93 / 15.2 |
| apv.MicroAspid 1.8 | weak | 73.0% ± 2.8 | 89.6% ± 2.5 | 54.1% ± 3.5 | 251 / 280 | 10.6% ± 0.4 | 5.5% ± 0.8 | 90 | 0 | 0.89 / 108.2 |
| mladjo.Grrrrr 0.9 | weak | 69.3% ± 2.0 | 83.6% ± 2.5 | 55.1% ± 2.2 | 234 / 280 | 13.1% ± 1.3 | 7.3% ± 0.4 | 103 | 0 | 0.94 / 66.4 |
| md.November 1.0 | weak | 84.4% ± 3.9 | 96.1% ± 2.8 | 72.2% ± 5.0 | 269 / 280 | 16.5% ± 2.0 | 6.2% ± 2.7 | 105 | 0 | 0.95 / 14.2 |
| ph.mini.Archer 0.6.6 | weak | 69.8% ± 5.0 | 86.1% ± 5.3 | 53.6% ± 4.9 | 241 / 280 | 11.4% ± 0.5 | 7.2% ± 0.5 | 103 | 0 | 0.98 / 53.9 |
| cb.mega.RandomBot 1.0 | weak | 68.7% ± 4.5 | 81.1% ± 5.8 | 57.7% ± 3.2 | 227 / 280 | 14.4% ± 0.4 | 8.5% ± 0.9 | 87 | 0 | 0.97 / 14.2 |
| dmp.micro.Aurora 1.41 | weak | 84.0% ± 2.6 | 96.8% ± 3.0 | 70.7% ± 2.8 | 271 / 280 | 18.1% ± 0.8 | 8.5% ± 4.8 | 78 | 0 | 0.76 / 12.0 |
| doka.Test 1.0 | weak | 84.4% ± 3.7 | 94.3% ± 4.4 | 74.8% ± 3.8 | 264 / 280 | 19.3% ± 1.0 | 6.2% ± 0.6 | 82 | 0 | 0.88 / 12.8 |
| davidalves.net.DuelistNano 1.0 | weak | 87.1% ± 3.7 | 97.5% ± 2.7 | 73.9% ± 5.5 | 273 / 280 | 13.8% ± 0.8 | 3.4% ± 0.9 | 87 | 0 | 0.75 / 14.1 |
| arthord.NanoSatanMelee Beta | weak | 86.7% ± 4.4 | 98.6% ± 1.8 | 73.8% ± 6.9 | 276 / 280 | 18.1% ± 2.4 | 5.8% ± 1.9 | 97 | 0 | 0.89 / 12.6 |
| DTF.Kludgy 1.2b | weak | 74.9% ± 4.3 | 80.7% ± 7.0 | 69.0% ± 2.6 | 226 / 280 | 16.4% ± 1.0 | 15.3% ± 10.1 | 118 | 0 | 1.04 / 17.5 |
| cx.Princess 1.0 | weak | 95.3% ± 3.7 | 98.6% ± 1.8 | 65.5% ± 9.9 | 276 / 280 | 1.2% ± 0.4 | 2.0% ± 3.5 | 43 | 0 | 0.73 / 16.1 |
| slugzilla.RandomPattern 1.0 | weak | 72.7% ± 1.5 | 90.4% ± 2.8 | 54.7% ± 2.7 | 253 / 280 | 12.2% ± 1.0 | 6.9% ± 0.4 | 80 | 0 | 1.02 / 29.5 |
| stelo.MatchupAGF 1.1 | weak | 69.4% ± 3.2 | 78.6% ± 5.3 | 60.8% ± 1.6 | 220 / 280 | 14.3% ± 0.5 | 14.2% ± 13.6 | 115 | 0 | 1.60 / 44.8 |
| stelo.MatchupMini 1.1 | weak | 69.3% ± 4.2 | 83.2% ± 6.2 | 56.2% ± 2.4 | 233 / 280 | 13.2% ± 0.7 | 7.7% ± 0.5 | 63 | 0 | 1.49 / 22.2 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| gh.micro.GrubbmThree 1.01 | 8 | 7 | 0 | 0 | 0.28 | 1 | 1 | 0 |
| cf.OldMan.OldManXP 0.1 | 8 | 7 | 639 | 0 | 0.66 | 0 | 0 | 0 |
| mz.NanoDeath 2.56 | 8 | 7 | 0 | 0 | 0.26 | 1 | 1 | 0 |
| sul.Bicephal 1.2 | 8 | 7 | 523 | 0 | 0.27 | 0 | 0 | 0 |
| kc.micro.rammer.MaxRisk 0.6 | 8 | 5 | 0 | 0 | 0.24 | 3 | 2 | 0 |
| mn.nano.perceptual.Impact 1.3.0 | 8 | 6 | 0 | 0 | 0.25 | 2 | 2 | 0 |
| test.Podgy 4.0 | 8 | 6 | 532 | 0 | 0.36 | 1 | 1 | 0 |
| non.mega.NaN 0.1 | 8 | 7 | 277 | 0 | 0.59 | 0 | 0 | 0 |
| demetrix.nano.Neutrino 0.27 | 8 | 7 | 0 | 0 | 0.30 | 1 | 0 | 0 |
| whind.Wisdom 0.5.1 | 8 | 4 | 1939 | 0 | 0.34 | 0 | 0 | 0 |
| as.xbots 1.0 | 8 | 7 | 0 | 0 | 0.25 | 1 | 1 | 0 |
| ers.nano.sunderer.Sunderer 1.23a | 8 | 5 | 1163 | 0 | 0.30 | 1 | 1 | 0 |
| robar.nano.Breeze 0.3 | 8 | 6 | 1270 | 0 | 0.35 | 0 | 0 | 0 |
| dmh.robocode.robot.PinkPanther 1.1 | 8 | 8 | 0 | 0 | 0.37 | 0 | 0 | 0 |
| sm.Devil 7.3 | 8 | 8 | 0 | 0 | 0.55 | 0 | 0 | 0 |
| seed.Anastasia 1.0 | 8 | 7 | 751 | 0 | 0.28 | 0 | 0 | 0 |
| janm.Jammy 1.0 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| dcs.PM.Eater_of_Worlds_PM 1.2 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| apv.MicroAspid 1.8 | 8 | 7 | 0 | 0 | 0.32 | 1 | 1 | 0 |
| mladjo.Grrrrr 0.9 | 8 | 7 | 0 | 0 | 0.37 | 1 | 1 | 0 |
| md.November 1.0 | 8 | 7 | 628 | 0 | 0.38 | 0 | 0 | 0 |
| ph.mini.Archer 0.6.6 | 8 | 7 | 0 | 0 | 0.37 | 1 | 1 | 0 |
| cb.mega.RandomBot 1.0 | 8 | 7 | 0 | 0 | 0.31 | 1 | 1 | 0 |
| dmp.micro.Aurora 1.41 | 8 | 6 | 964 | 0 | 0.28 | 0 | 0 | 0 |
| doka.Test 1.0 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| davidalves.net.DuelistNano 1.0 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| arthord.NanoSatanMelee Beta | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| DTF.Kludgy 1.2b | 8 | 5 | 1849 | 0 | 0.42 | 1 | 1 | 0 |
| cx.Princess 1.0 | 8 | 7 | 613 | 0 | 0.15 | 0 | 0 | 8 |
| slugzilla.RandomPattern 1.0 | 8 | 7 | 0 | 0 | 0.29 | 1 | 1 | 0 |
| stelo.MatchupAGF 1.1 | 8 | 6 | 776 | 0 | 0.41 | 1 | 1 | 0 |
| stelo.MatchupMini 1.1 | 8 | 5 | 0 | 0 | 0.23 | 3 | 3 | 0 |

215 of 256 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| gh.micro.GrubbmThree 1.01 | 1599 | 63 | 1610 | 1599 (100.0%) | 0 (0.0%) | 11 (0.7%) | 8427 | 675 | 20 |
| cf.OldMan.OldManXP 0.1 | 8682 | 8 | 8643 | 8633 (99.4%) | 49 (0.6%) | 10 (0.1%) | 334 | 82 | 129 |
| mz.NanoDeath 2.56 | 1602 | 24 | 1602 | 1601 (99.9%) | 1 (0.1%) | 1 (0.1%) | 7680 | 605 | 16 |
| sul.Bicephal 1.2 | 1632 | 48 | 1605 | 1600 (98.0%) | 32 (2.0%) | 5 (0.3%) | 7843 | 601 | 22 |
| kc.micro.rammer.MaxRisk 0.6 | 1822 | 41 | 1831 | 1822 (100.0%) | 0 (0.0%) | 9 (0.5%) | 8838 | 680 | 21 |
| mn.nano.perceptual.Impact 1.3.0 | 1690 | 36 | 1697 | 1690 (100.0%) | 0 (0.0%) | 7 (0.4%) | 9012 | 699 | 18 |
| test.Podgy 4.0 | 5433 | 9 | 5464 | 5391 (99.2%) | 42 (0.8%) | 73 (1.3%) | 752 | 95 | 36 |
| non.mega.NaN 0.1 | 12352 | 27 | 12339 | 12334 (99.9%) | 18 (0.1%) | 5 (0.0%) | 396 | 123 | 110 |
| demetrix.nano.Neutrino 0.27 | 10209 | 11 | 10211 | 10208 (100.0%) | 1 (0.0%) | 3 (0.0%) | 252 | 121 | 26 |
| whind.Wisdom 0.5.1 | 6726 | 13 | 6610 | 6609 (98.3%) | 117 (1.7%) | 1 (0.0%) | 262 | 103 | 29 |
| as.xbots 1.0 | 2284 | 24 | 2288 | 2283 (100.0%) | 1 (0.0%) | 5 (0.2%) | 4967 | 413 | 20 |
| ers.nano.sunderer.Sunderer 1.23a | 2164 | 22 | 2082 | 2082 (96.2%) | 82 (3.8%) | 0 (0.0%) | 7304 | 593 | 21 |
| robar.nano.Breeze 0.3 | 9475 | 37 | 9825 | 9342 (98.6%) | 133 (1.4%) | 483 (4.9%) | 572 | 173 | 28 |
| dmh.robocode.robot.PinkPanther 1.1 | 10156 | 304 | 10140 | 10139 (99.8%) | 17 (0.2%) | 1 (0.0%) | 333 | 86 | 39 |
| sm.Devil 7.3 | 19020 | 53 | 19024 | 19019 (100.0%) | 1 (0.0%) | 5 (0.0%) | 1309 | 201 | 86 |
| seed.Anastasia 1.0 | 8877 | 14 | 8866 | 8810 (99.2%) | 67 (0.8%) | 56 (0.6%) | 907 | 117 | 20 |
| janm.Jammy 1.0 | 7380 | 11 | 7381 | 7374 (99.9%) | 6 (0.1%) | 7 (0.1%) | 383 | 98 | 39 |
| dcs.PM.Eater_of_Worlds_PM 1.2 | 9700 | 13 | 9703 | 9699 (100.0%) | 1 (0.0%) | 4 (0.0%) | 290 | 111 | 42 |
| apv.MicroAspid 1.8 | 9091 | 7 | 9119 | 9091 (100.0%) | 0 (0.0%) | 28 (0.3%) | 443 | 111 | 33 |
| mladjo.Grrrrr 0.9 | 11959 | 19 | 11959 | 11959 (100.0%) | 0 (0.0%) | 0 (0.0%) | 514 | 130 | 42 |
| md.November 1.0 | 7011 | 11 | 6980 | 6970 (99.4%) | 41 (0.6%) | 10 (0.1%) | 404 | 92 | 53 |
| ph.mini.Archer 0.6.6 | 13848 | 73 | 13848 | 13848 (100.0%) | 0 (0.0%) | 0 (0.0%) | 563 | 125 | 38 |
| cb.mega.RandomBot 1.0 | 11223 | 505 | 11186 | 11186 (99.7%) | 37 (0.3%) | 0 (0.0%) | 438 | 177 | 28 |
| dmp.micro.Aurora 1.41 | 6063 | 24 | 6007 | 5998 (98.9%) | 65 (1.1%) | 9 (0.1%) | 471 | 112 | 17 |
| doka.Test 1.0 | 7543 | 10 | 7543 | 7540 (100.0%) | 3 (0.0%) | 3 (0.0%) | 346 | 136 | 26 |
| davidalves.net.DuelistNano 1.0 | 6491 | 11 | 6492 | 6490 (100.0%) | 1 (0.0%) | 2 (0.0%) | 124 | 79 | 55 |
| arthord.NanoSatanMelee Beta | 5883 | 14 | 5883 | 5883 (100.0%) | 0 (0.0%) | 0 (0.0%) | 249 | 86 | 35 |
| DTF.Kludgy 1.2b | 12478 | 23 | 12348 | 12339 (98.9%) | 139 (1.1%) | 9 (0.1%) | 960 | 173 | 110 |
| cx.Princess 1.0 | 596 | 1 | 560 | 560 (94.0%) | 36 (6.0%) | 0 (0.0%) | 22 | 12 | 13 |
| slugzilla.RandomPattern 1.0 | 11297 | 18 | 11297 | 11296 (100.0%) | 1 (0.0%) | 1 (0.0%) | 424 | 130 | 33 |
| stelo.MatchupAGF 1.1 | 17713 | 19 | 17690 | 17651 (99.6%) | 62 (0.4%) | 39 (0.2%) | 1247 | 235 | 73 |
| stelo.MatchupMini 1.1 | 11593 | 20 | 11593 | 11593 (100.0%) | 0 (0.0%) | 0 (0.0%) | 396 | 141 | 22 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| gh.micro.GrubbmThree 1.01 | 1734 | 18 (1.0%) | 0 |
| cf.OldMan.OldManXP 0.1 | 11079 | 686 (6.2%) | 5153 |
| mz.NanoDeath 2.56 | 1699 | 12 (0.7%) | 0 |
| sul.Bicephal 1.2 | 1830 | 15 (0.8%) | 0 |
| kc.micro.rammer.MaxRisk 0.6 | 1817 | 35 (1.9%) | 0 |
| mn.nano.perceptual.Impact 1.3.0 | 1691 | 13 (0.8%) | 0 |
| test.Podgy 4.0 | 7251 | 365 (5.0%) | 0 |
| non.mega.NaN 0.1 | 14001 | 1010 (7.2%) | 10653 |
| demetrix.nano.Neutrino 0.27 | 10638 | 803 (7.5%) | 5606 |
| whind.Wisdom 0.5.1 | 8000 | 432 (5.4%) | 151 |
| as.xbots 1.0 | 2325 | 120 (5.2%) | 56 |
| ers.nano.sunderer.Sunderer 1.23a | 2161 | 63 (2.9%) | 234 |
| robar.nano.Breeze 0.3 | 9263 | 680 (7.3%) | 4678 |
| dmh.robocode.robot.PinkPanther 1.1 | 12039 | 851 (7.1%) | 10120 |
| sm.Devil 7.3 | 19117 | 1400 (7.3%) | 14465 |
| seed.Anastasia 1.0 | 13683 | 537 (3.9%) | 3574 |
| janm.Jammy 1.0 | 8996 | 512 (5.7%) | 1071 |
| dcs.PM.Eater_of_Worlds_PM 1.2 | 11160 | 670 (6.0%) | 3193 |
| apv.MicroAspid 1.8 | 12533 | 716 (5.7%) | 8164 |
| mladjo.Grrrrr 0.9 | 12686 | 1131 (8.9%) | 9974 |
| md.November 1.0 | 9362 | 464 (5.0%) | 1663 |
| ph.mini.Archer 0.6.6 | 14604 | 1231 (8.4%) | 12086 |
| cb.mega.RandomBot 1.0 | 11715 | 996 (8.5%) | 9193 |
| dmp.micro.Aurora 1.41 | 6657 | 542 (8.1%) | 3237 |
| doka.Test 1.0 | 7990 | 428 (5.4%) | 3755 |
| davidalves.net.DuelistNano 1.0 | 8436 | 448 (5.3%) | 1384 |
| arthord.NanoSatanMelee Beta | 7570 | 330 (4.4%) | 976 |
| DTF.Kludgy 1.2b | 13156 | 939 (7.1%) | 9146 |
| cx.Princess 1.0 | 781 | 62 (7.9%) | 0 |
| slugzilla.RandomPattern 1.0 | 12092 | 1027 (8.5%) | 8217 |
| stelo.MatchupAGF 1.1 | 17876 | 1580 (8.8%) | 15736 |
| stelo.MatchupMini 1.1 | 12091 | 934 (7.7%) | 8260 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| gh.micro.GrubbmThree 1.01 | 650 | 140 | 650 | 118 | 80.5 / 56.0 | 1458 | 762 | 76 |
| cf.OldMan.OldManXP 0.1 | 650 | 626 | 650 | 547 | 24.9 / 25.2 | 44 | 5558 | 1384 |
| mz.NanoDeath 2.56 | 650 | 143 | 650 | 115 | 78.7 / 51.1 | 1395 | 1418 | 81 |
| sul.Bicephal 1.2 | 650 | 154 | 650 | 121 | 77.7 / 49.6 | 1370 | 1379 | 102 |
| kc.micro.rammer.MaxRisk 0.6 | 650 | 139 | 650 | 124 | 80.9 / 59.8 | 1514 | 630 | 99 |
| mn.nano.perceptual.Impact 1.3.0 | 650 | 136 | 650 | 116 | 80.4 / 56.3 | 1447 | 413 | 101 |
| test.Podgy 4.0 | 650 | 468 | 422 | 391 | 45.7 / 17.5 | 1924 | 4752 | 692 |
| non.mega.NaN 0.1 | 650 | 634 | 650 | 670 | 28.0 / 25.7 | 65 | 5538 | 223 |
| demetrix.nano.Neutrino 0.27 | 650 | 443 | 606 | 541 | 39.7 / 22.0 | 618 | 4404 | 3634 |
| whind.Wisdom 0.5.1 | 650 | 482 | 547 | 419 | 39.2 / 23.7 | 1149 | 5530 | 3672 |
| as.xbots 1.0 | 650 | 168 | 609 | 150 | 82.9 / 43.9 | 1713 | 1553 | 160 |
| ers.nano.sunderer.Sunderer 1.23a | 650 | 154 | 650 | 139 | 79.6 / 52.0 | 1416 | 1037 | 127 |
| robar.nano.Breeze 0.3 | 650 | 449 | 431 | 486 | 50.6 / 15.9 | 1987 | 5841 | 1306 |
| dmh.robocode.robot.PinkPanther 1.1 | 650 | 613 | 650 | 580 | 25.7 / 27.7 | 68 | 6014 | 1300 |
| sm.Devil 7.3 | 650 | 543 | 588 | 891 | 52.6 / 21.4 | 1780 | 3735 | 1003 |
| seed.Anastasia 1.0 | 650 | 427 | 400 | 691 | 62.6 / 10.3 | 2457 | 2662 | 445 |
| janm.Jammy 1.0 | 650 | 598 | 578 | 461 | 28.5 / 15.8 | 152 | 6764 | 5298 |
| dcs.PM.Eater_of_Worlds_PM 1.2 | 650 | 502 | 616 | 560 | 40.0 / 24.0 | 546 | 4163 | 3912 |
| apv.MicroAspid 1.8 | 650 | 543 | 650 | 607 | 30.2 / 25.8 | 159 | 6187 | 4 |
| mladjo.Grrrrr 0.9 | 650 | 475 | 650 | 627 | 36.4 / 29.6 | 636 | 3012 | 3472 |
| md.November 1.0 | 650 | 476 | 450 | 484 | 47.3 / 18.5 | 1877 | 5719 | 245 |
| ph.mini.Archer 0.6.6 | 650 | 513 | 650 | 700 | 34.7 / 30.0 | 243 | 1711 | 1522 |
| cb.mega.RandomBot 1.0 | 650 | 406 | 641 | 590 | 43.8 / 32.3 | 1085 | 3900 | 34 |
| dmp.micro.Aurora 1.41 | 650 | 376 | 403 | 366 | 45.8 / 19.1 | 2161 | 6296 | 307 |
| doka.Test 1.0 | 650 | 447 | 413 | 434 | 55.6 / 18.7 | 3701 | 3330 | 1741 |
| davidalves.net.DuelistNano 1.0 | 650 | 456 | 425 | 442 | 38.1 / 13.7 | 878 | 6110 | 3350 |
| arthord.NanoSatanMelee Beta | 650 | 477 | 466 | 405 | 46.1 / 16.4 | 1701 | 5407 | 2817 |
| DTF.Kludgy 1.2b | 650 | 458 | 550 | 667 | 52.8 / 23.7 | 3218 | 2717 | 199 |
| cx.Princess 1.0 | 650 | 393 | 650 | 41 | 3.5 / 2.2 | 60 | 206 | 19 |
| slugzilla.RandomPattern 1.0 | 650 | 533 | 650 | 599 | 35.0 / 29.0 | 486 | 3051 | 4297 |
| stelo.MatchupAGF 1.1 | 650 | 420 | 631 | 842 | 44.5 / 28.7 | 1613 | 6111 | 213 |
| stelo.MatchupMini 1.1 | 650 | 483 | 644 | 605 | 39.4 / 30.7 | 757 | 2643 | 3648 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| gh.micro.GrubbmThree 1.01 | 60.7% | 78 | 31 | 3 | 5.0 | 18 / 18 (100%) | 0 | 0 |
| cf.OldMan.OldManXP 0.1 | 6.6% | 184 | 499 | 3 | 30.6 | 681 / 686 (99%) | 0 | 0 |
| mz.NanoDeath 2.56 | 52.8% | 74 | 30 | 2 | 5.1 | 12 / 12 (100%) | 0 | 0 |
| sul.Bicephal 1.2 | 55.1% | 75 | 24 | 3 | 4.8 | 14 / 15 (93%) | 0 | 0 |
| kc.micro.rammer.MaxRisk 0.6 | 56.7% | 66 | 119 | 3 | 5.6 | 35 / 35 (100%) | 0 | 0 |
| mn.nano.perceptual.Impact 1.3.0 | 62.4% | 70 | 55 | 3 | 5.0 | 13 / 13 (100%) | 0 | 0 |
| test.Podgy 4.0 | 6.1% | 100 | 911 | 3 | 19.4 | 364 / 365 (100%) | 0 | 0 |
| non.mega.NaN 0.1 | 7.5% | 166 | 6005 | 3 | 43.9 | 1007 / 1010 (100%) | 0 | 0 |
| demetrix.nano.Neutrino 0.27 | 5.8% | 84 | 64 | 3 | 36.3 | 803 / 803 (100%) | 0 | 0 |
| whind.Wisdom 0.5.1 | 9.9% | 95 | 1338 | 3 | 23.6 | 427 / 432 (99%) | 0 | 0 |
| as.xbots 1.0 | 36.7% | 70 | 140 | 3 | 7.5 | 120 / 120 (100%) | 0 | 0 |
| ers.nano.sunderer.Sunderer 1.23a | 57.3% | 83 | 26 | 3 | 6.6 | 60 / 63 (95%) | 0 | 0 |
| robar.nano.Breeze 0.3 | 7.5% | 99 | 218 | 3 | 35.0 | 668 / 680 (98%) | 0 | 0 |
| dmh.robocode.robot.PinkPanther 1.1 | 5.2% | 103 | 7331 | 3 | 36.2 | 849 / 851 (100%) | 0 | 0 |
| sm.Devil 7.3 | 7.8% | 154 | 3708 | 3 | 67.7 | 1396 / 1400 (100%) | 0 | 0 |
| seed.Anastasia 1.0 | 7.5% | 78 | 360 | 3 | 31.4 | 532 / 537 (99%) | 0 | 0 |
| janm.Jammy 1.0 | 3.7% | 90 | 1300 | 3 | 26.4 | 511 / 512 (100%) | 0 | 0 |
| dcs.PM.Eater_of_Worlds_PM 1.2 | 6.2% | 93 | 588 | 3 | 34.6 | 670 / 670 (100%) | 0 | 0 |
| apv.MicroAspid 1.8 | 5.5% | 90 | 1572 | 3 | 32.3 | 716 / 716 (100%) | 0 | 0 |
| mladjo.Grrrrr 0.9 | 7.3% | 103 | 1974 | 3 | 42.2 | 1131 / 1131 (100%) | 0 | 0 |
| md.November 1.0 | 6.2% | 105 | 280 | 3 | 24.9 | 462 / 464 (100%) | 0 | 0 |
| ph.mini.Archer 0.6.6 | 7.2% | 103 | 5716 | 3 | 49.1 | 1227 / 1231 (100%) | 0 | 0 |
| cb.mega.RandomBot 1.0 | 8.5% | 87 | 3548 | 2 | 39.7 | 996 / 996 (100%) | 0 | 0 |
| dmp.micro.Aurora 1.41 | 8.5% | 78 | 156 | 3 | 21.5 | 538 / 542 (99%) | 0 | 0 |
| doka.Test 1.0 | 6.2% | 82 | 804 | 3 | 26.9 | 428 / 428 (100%) | 0 | 0 |
| davidalves.net.DuelistNano 1.0 | 3.4% | 87 | 186 | 3 | 23.2 | 448 / 448 (100%) | 0 | 0 |
| arthord.NanoSatanMelee Beta | 5.8% | 97 | 1039 | 3 | 21.0 | 330 / 330 (100%) | 0 | 0 |
| DTF.Kludgy 1.2b | 15.3% | 118 | 3816 | 3 | 43.9 | 931 / 939 (99%) | 0 | 0 |
| cx.Princess 1.0 | 2.0% | 43 | 24 | 3 | 2.0 | 60 / 62 (97%) | 0 | 0 |
| slugzilla.RandomPattern 1.0 | 6.9% | 80 | 2949 | 3 | 40.1 | 1027 / 1027 (100%) | 0 | 0 |
| stelo.MatchupAGF 1.1 | 14.2% | 115 | 10874 | 3 | 62.5 | 1574 / 1580 (100%) | 0 | 0 |
| stelo.MatchupMini 1.1 | 7.7% | 63 | 4162 | 2 | 40.5 | 934 / 934 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| gh.micro.GrubbmThree 1.01 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cf.OldMan.OldManXP 0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mz.NanoDeath 2.56 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sul.Bicephal 1.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kc.micro.rammer.MaxRisk 0.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mn.nano.perceptual.Impact 1.3.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| test.Podgy 4.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| non.mega.NaN 0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| demetrix.nano.Neutrino 0.27 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| whind.Wisdom 0.5.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| as.xbots 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ers.nano.sunderer.Sunderer 1.23a | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| robar.nano.Breeze 0.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dmh.robocode.robot.PinkPanther 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sm.Devil 7.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| seed.Anastasia 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| janm.Jammy 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dcs.PM.Eater_of_Worlds_PM 1.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apv.MicroAspid 1.8 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mladjo.Grrrrr 0.9 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| md.November 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ph.mini.Archer 0.6.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cb.mega.RandomBot 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dmp.micro.Aurora 1.41 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| doka.Test 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.net.DuelistNano 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| arthord.NanoSatanMelee Beta | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| DTF.Kludgy 1.2b | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cx.Princess 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| slugzilla.RandomPattern 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.MatchupAGF 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.MatchupMini 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## First rounds against last rounds

Per battle, the first 5 rounds against the last 10, then the paired difference (last minus first) over battles with its 95% interval. Win rate is rounds won over rounds with an R record; damage share is bullet damage dealt over dealt plus taken. Positive means the robot does better late in the battle.

| Opponent | Build | Battles | Win rate, first 5 | Win rate, last 10 | Late minus early (pp) | Damage share, first 5 | Damage share, last 10 | Late minus early (pp) |
|---|---|---|---|---|---|---|---|---|
| DTF.Kludgy 1.2b | hadur2.Hadur 3.9 | 8 | 82.5% ± 16.6 | 82.4% ± 17.7 | -0.1 ± 27.6 | 66.9% ± 6.3 | 70.5% ± 6.4 | +3.7 ± 11.4 |
| DTF.Kludgy 1.2b | hadur2.Hadur 3.4 | 8 | 72.5% ± 17.7 | 79.7% ± 15.5 | +7.2 ± 25.1 | 63.0% ± 7.7 | 67.9% ± 5.2 | +4.8 ± 9.8 |
| apv.MicroAspid 1.8 | hadur2.Hadur 3.9 | 8 | 92.5% ± 12.4 | 89.7% ± 9.2 | -2.8 ± 18.0 | 53.1% ± 6.5 | 49.0% ± 7.4 | -4.0 ± 12.3 |
| apv.MicroAspid 1.8 | hadur2.Hadur 3.4 | 8 | 90.0% ± 8.9 | 91.3% ± 7.0 | +1.2 ± 15.1 | 54.2% ± 11.8 | 53.5% ± 7.1 | -0.6 ± 14.8 |
| arthord.NanoSatanMelee Beta | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 66.5% ± 6.4 | 76.0% ± 7.0 | +9.6 ± 10.3 |
| arthord.NanoSatanMelee Beta | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 64.9% ± 9.5 | 71.8% ± 8.0 | +6.9 ± 13.5 |
| as.xbots 1.0 | hadur2.Hadur 3.9 | 8 | 85.0% ± 11.8 | 95.0% ± 4.5 | +10.0 ± 14.1 | 57.1% ± 3.4 | 67.7% ± 7.0 | +10.6 ± 6.2 |
| as.xbots 1.0 | hadur2.Hadur 3.4 | 8 | 90.0% ± 8.9 | 95.0% ± 4.5 | +5.0 ± 11.8 | 60.0% ± 4.1 | 65.7% ± 2.9 | +5.7 ± 4.0 |
| cb.mega.RandomBot 1.0 | hadur2.Hadur 3.9 | 8 | 75.0% ± 17.3 | 85.0% ± 10.9 | +10.0 ± 22.3 | 50.7% ± 7.3 | 59.3% ± 6.1 | +8.6 ± 11.1 |
| cb.mega.RandomBot 1.0 | hadur2.Hadur 3.4 | 8 | 85.0% ± 14.8 | 85.8% ± 10.5 | +0.8 ± 19.7 | 56.7% ± 3.2 | 60.6% ± 6.6 | +3.8 ± 7.6 |
| cf.OldMan.OldManXP 0.1 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 94.6% ± 9.9 | -0.4 ± 14.2 | 69.9% ± 5.6 | 68.9% ± 19.7 | -1.0 ± 21.4 |
| cf.OldMan.OldManXP 0.1 | hadur2.Hadur 3.4 | 8 | 87.5% ± 8.7 | 88.8% ± 5.4 | +1.2 ± 9.4 | 53.5% ± 6.4 | 47.6% ± 6.3 | -5.9 ± 8.4 |
| cx.Princess 1.0 | hadur2.Hadur 3.9 | 8 | 90.0% ± 17.9 | 100.0% ± 0.0 | +10.0 ± 17.9 | 74.4% ± 9.5 | - | n/a |
| cx.Princess 1.0 | hadur2.Hadur 3.4 | 8 | 90.0% ± 12.6 | 100.0% ± 0.0 | +10.0 ± 12.6 | 74.7% ± 12.7 | - | n/a |
| davidalves.net.DuelistNano 1.0 | hadur2.Hadur 3.9 | 8 | 92.5% ± 12.4 | 94.9% ± 4.6 | +2.4 ± 12.6 | 59.5% ± 10.8 | 70.6% ± 7.5 | +11.1 ± 10.0 |
| davidalves.net.DuelistNano 1.0 | hadur2.Hadur 3.4 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 64.2% ± 4.2 | 77.9% ± 7.2 | +13.7 ± 8.8 |
| dcs.PM.Eater_of_Worlds_PM 1.2 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 93.6% ± 7.7 | +3.6 ± 17.9 | 59.6% ± 9.8 | 61.2% ± 8.0 | +1.5 ± 16.3 |
| dcs.PM.Eater_of_Worlds_PM 1.2 | hadur2.Hadur 3.4 | 8 | 95.0% ± 7.7 | 88.8% ± 11.3 | -6.3 ± 10.9 | 59.5% ± 9.5 | 60.8% ± 4.6 | +1.3 ± 6.8 |
| demetrix.nano.Neutrino 0.27 | hadur2.Hadur 3.9 | 8 | 85.0% ± 11.8 | 98.8% ± 3.0 | +13.7 ± 9.9 | 56.5% ± 8.7 | 67.4% ± 5.0 | +10.8 ± 5.1 |
| demetrix.nano.Neutrino 0.27 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 93.8% ± 6.2 | -6.2 ± 6.2 | 64.3% ± 7.8 | 60.8% ± 5.4 | -3.5 ± 11.2 |
| dmh.robocode.robot.PinkPanther 1.1 | hadur2.Hadur 3.9 | 8 | 87.5% ± 15.3 | 80.8% ± 7.6 | -6.7 ± 19.9 | 48.3% ± 14.9 | 34.6% ± 7.3 | -13.7 ± 18.7 |
| dmh.robocode.robot.PinkPanther 1.1 | hadur2.Hadur 3.4 | 8 | 95.0% ± 7.7 | 92.5% ± 5.9 | -2.5 ± 10.7 | 52.4% ± 8.5 | 49.0% ± 8.5 | -3.4 ± 8.2 |
| dmp.micro.Aurora 1.41 | hadur2.Hadur 3.9 | 8 | 87.5% ± 17.7 | 97.5% ± 5.9 | +10.0 ± 17.9 | 60.0% ± 4.1 | 73.1% ± 4.6 | +13.1 ± 6.8 |
| dmp.micro.Aurora 1.41 | hadur2.Hadur 3.4 | 8 | 87.5% ± 12.4 | 98.8% ± 3.0 | +11.2 ± 12.2 | 56.8% ± 9.2 | 74.0% ± 6.1 | +17.3 ± 12.3 |
| doka.Test 1.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 98.8% ± 3.0 | +3.7 ± 8.9 | 73.2% ± 7.8 | 77.6% ± 4.7 | +4.5 ± 7.8 |
| doka.Test 1.0 | hadur2.Hadur 3.4 | 8 | 87.5% ± 17.7 | 97.5% ± 3.9 | +10.0 ± 19.5 | 70.1% ± 8.5 | 74.2% ± 1.9 | +4.2 ± 9.8 |
| ers.nano.sunderer.Sunderer 1.23a | hadur2.Hadur 3.9 | 8 | 90.0% ± 8.9 | 100.0% ± 0.0 | +10.0 ± 8.9 | 70.6% ± 4.3 | 58.8% ± 1.2 | -11.8 ± 4.5 |
| ers.nano.sunderer.Sunderer 1.23a | hadur2.Hadur 3.4 | 8 | 95.0% ± 7.7 | 91.3% ± 7.0 | -3.7 ± 9.9 | 72.3% ± 5.2 | 59.4% ± 2.9 | -13.0 ± 5.8 |
| gh.micro.GrubbmThree 1.01 | hadur2.Hadur 3.9 | 8 | 85.0% ± 11.8 | 89.7% ± 6.3 | +4.7 ± 14.6 | 53.2% ± 2.1 | 57.1% ± 3.1 | +3.8 ± 3.2 |
| gh.micro.GrubbmThree 1.01 | hadur2.Hadur 3.4 | 8 | 82.5% ± 14.0 | 96.0% ± 6.8 | +13.5 ± 16.3 | 55.3% ± 1.9 | 58.5% ± 2.3 | +3.2 ± 3.2 |
| janm.Jammy 1.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 96.1% ± 4.5 | +1.1 ± 10.5 | 60.4% ± 5.6 | 67.9% ± 12.8 | +7.5 ± 14.3 |
| janm.Jammy 1.0 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 56.5% ± 7.3 | 61.3% ± 7.5 | +4.8 ± 8.0 |
| kc.micro.rammer.MaxRisk 0.6 | hadur2.Hadur 3.9 | 8 | 72.5% ± 15.3 | 96.3% ± 6.2 | +23.8 ± 17.8 | 53.8% ± 3.0 | 59.2% ± 1.6 | +5.4 ± 3.6 |
| kc.micro.rammer.MaxRisk 0.6 | hadur2.Hadur 3.4 | 8 | 74.4% ± 17.2 | 88.8% ± 9.4 | +14.4 ± 21.8 | 54.8% ± 1.7 | 57.7% ± 1.4 | +2.9 ± 2.4 |
| md.November 1.0 | hadur2.Hadur 3.9 | 8 | 85.0% ± 11.8 | 96.3% ± 6.2 | +11.2 ± 13.7 | 65.5% ± 8.2 | 79.0% ± 7.4 | +13.4 ± 10.8 |
| md.November 1.0 | hadur2.Hadur 3.4 | 8 | 92.5% ± 8.7 | 95.0% ± 4.5 | +2.5 ± 10.7 | 65.8% ± 10.2 | 68.9% ± 7.8 | +3.1 ± 10.8 |
| mladjo.Grrrrr 0.9 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 83.2% ± 11.3 | -6.8 ± 16.2 | 59.1% ± 6.5 | 55.0% ± 6.3 | -4.1 ± 9.4 |
| mladjo.Grrrrr 0.9 | hadur2.Hadur 3.4 | 8 | 92.5% ± 12.4 | 92.5% ± 8.7 | +0.0 ± 14.1 | 59.8% ± 5.2 | 56.8% ± 4.4 | -3.0 ± 6.8 |
| mn.nano.perceptual.Impact 1.3.0 | hadur2.Hadur 3.9 | 8 | 90.0% ± 8.9 | 93.8% ± 7.7 | +3.7 ± 10.9 | 55.3% ± 2.5 | 57.0% ± 2.3 | +1.7 ± 3.4 |
| mn.nano.perceptual.Impact 1.3.0 | hadur2.Hadur 3.4 | 8 | 92.5% ± 8.7 | 96.1% ± 6.3 | +3.6 ± 12.7 | 56.3% ± 2.7 | 60.7% ± 1.6 | +4.4 ± 3.4 |
| mz.NanoDeath 2.56 | hadur2.Hadur 3.9 | 8 | 82.5% ± 16.6 | 92.5% ± 7.4 | +10.0 ± 18.4 | 55.7% ± 2.0 | 58.9% ± 3.5 | +3.2 ± 4.1 |
| mz.NanoDeath 2.56 | hadur2.Hadur 3.4 | 8 | 90.0% ± 8.9 | 92.5% ± 7.4 | +2.5 ± 11.6 | 59.0% ± 3.0 | 61.1% ± 1.6 | +2.1 ± 2.1 |
| non.mega.NaN 0.1 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 94.4% ± 13.1 | -3.1 ± 15.2 | 78.1% ± 7.1 | 71.9% ± 21.8 | -6.2 ± 23.2 |
| non.mega.NaN 0.1 | hadur2.Hadur 3.4 | 8 | 90.0% ± 12.6 | 88.8% ± 11.3 | -1.2 ± 17.6 | 53.4% ± 7.6 | 53.1% ± 7.0 | -0.4 ± 10.6 |
| ph.mini.Archer 0.6.6 | hadur2.Hadur 3.9 | 8 | 85.0% ± 14.8 | 85.0% ± 12.6 | +0.0 ± 18.4 | 55.6% ± 9.7 | 56.0% ± 8.5 | +0.3 ± 14.1 |
| ph.mini.Archer 0.6.6 | hadur2.Hadur 3.4 | 8 | 87.5% ± 12.4 | 87.2% ± 6.2 | -0.3 ± 14.5 | 51.5% ± 6.3 | 53.5% ± 6.4 | +2.0 ± 4.0 |
| robar.nano.Breeze 0.3 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 72.3% ± 5.7 | 78.7% ± 4.2 | +6.4 ± 7.6 |
| robar.nano.Breeze 0.3 | hadur2.Hadur 3.4 | 8 | 90.0% ± 12.6 | 98.8% ± 3.0 | +8.8 ± 13.7 | 63.0% ± 7.2 | 79.8% ± 4.0 | +16.8 ± 9.0 |
| seed.Anastasia 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 84.7% ± 7.1 | 88.1% ± 3.9 | +3.4 ± 7.1 |
| seed.Anastasia 1.0 | hadur2.Hadur 3.4 | 8 | 95.0% ± 7.7 | 97.5% ± 5.9 | +2.5 ± 10.7 | 80.1% ± 8.4 | 85.5% ± 3.4 | +5.4 ± 9.6 |
| slugzilla.RandomPattern 1.0 | hadur2.Hadur 3.9 | 8 | 85.0% ± 11.8 | 92.5% ± 5.9 | +7.5 ± 14.0 | 51.5% ± 8.0 | 57.9% ± 5.6 | +6.4 ± 5.2 |
| slugzilla.RandomPattern 1.0 | hadur2.Hadur 3.4 | 8 | 90.0% ± 12.6 | 92.5% ± 5.9 | +2.5 ± 15.3 | 52.0% ± 5.4 | 54.1% ± 4.8 | +2.2 ± 6.9 |
| sm.Devil 7.3 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 88.8% ± 10.4 | -8.8 ± 8.3 | 74.0% ± 5.6 | 68.5% ± 4.9 | -5.5 ± 7.7 |
| sm.Devil 7.3 | hadur2.Hadur 3.4 | 8 | 95.0% ± 7.7 | 92.5% ± 5.9 | -2.5 ± 10.7 | 69.1% ± 5.3 | 70.7% ± 4.6 | +1.6 ± 5.9 |
| stelo.MatchupAGF 1.1 | hadur2.Hadur 3.9 | 8 | 67.5% ± 17.7 | 93.6% ± 6.3 | +26.1 ± 21.9 | 55.3% ± 6.7 | 61.0% ± 4.1 | +5.7 ± 8.5 |
| stelo.MatchupAGF 1.1 | hadur2.Hadur 3.4 | 8 | 75.0% ± 19.5 | 81.1% ± 8.2 | +6.1 ± 20.0 | 57.8% ± 6.1 | 61.3% ± 5.4 | +3.4 ± 8.2 |
| stelo.MatchupMini 1.1 | hadur2.Hadur 3.9 | 8 | 82.5% ± 14.0 | 86.0% ± 11.0 | +3.5 ± 20.7 | 52.1% ± 8.4 | 54.4% ± 5.4 | +2.3 ± 9.1 |
| stelo.MatchupMini 1.1 | hadur2.Hadur 3.4 | 8 | 85.0% ± 11.8 | 78.1% ± 14.5 | -6.9 ± 23.4 | 54.6% ± 7.8 | 54.1% ± 5.3 | -0.5 ± 7.2 |
| sul.Bicephal 1.2 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 91.3% ± 8.3 | -3.8 ± 12.6 | 57.2% ± 2.5 | 60.1% ± 2.7 | +2.9 ± 3.1 |
| sul.Bicephal 1.2 | hadur2.Hadur 3.4 | 8 | 97.5% ± 5.9 | 95.0% ± 6.3 | -2.5 ± 9.7 | 60.1% ± 4.6 | 60.5% ± 1.5 | +0.4 ± 5.8 |
| test.Podgy 4.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 63.6% ± 5.7 | 76.1% ± 3.3 | +12.4 ± 7.3 |
| test.Podgy 4.0 | hadur2.Hadur 3.4 | 8 | 95.0% ± 7.7 | 96.1% ± 4.5 | +1.1 ± 8.4 | 65.5% ± 11.5 | 70.2% ± 4.8 | +4.7 ± 15.3 |
| whind.Wisdom 0.5.1 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 92.2% ± 6.4 | -5.3 ± 8.2 | 61.5% ± 11.6 | 58.7% ± 5.1 | -2.9 ± 14.4 |
| whind.Wisdom 0.5.1 | hadur2.Hadur 3.4 | 8 | 82.5% ± 14.0 | 96.3% ± 6.2 | +13.8 ± 14.8 | 49.8% ± 6.5 | 59.6% ± 4.6 | +9.8 ± 7.0 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| DTF.Kludgy 1.2b | +10.0 ± 20.0 | +2.6 ± 24.2 | +3.8 ± 7.8 | +2.7 ± 7.3 |
| apv.MicroAspid 1.8 | +2.5 ± 14.0 | -1.5 ± 10.4 | -1.1 ± 13.0 | -4.5 ± 8.3 |
| arthord.NanoSatanMelee Beta | -2.5 ± 5.9 | +1.2 ± 3.0 | +1.6 ± 14.3 | +4.2 ± 9.5 |
| as.xbots 1.0 | -5.0 ± 11.8 | +0.0 ± 4.5 | -2.9 ± 5.1 | +2.0 ± 8.0 |
| cb.mega.RandomBot 1.0 | -10.0 ± 23.6 | -0.8 ± 13.6 | -6.0 ± 7.3 | -1.3 ± 8.6 |
| cf.OldMan.OldManXP 0.1 | +7.5 ± 12.4 | +5.8 ± 9.5 | +16.4 ± 8.4 | +21.3 ± 21.2 |
| cx.Princess 1.0 | +0.0 ± 25.3 | +0.0 ± 0.0 | -0.3 ± 16.3 | n/a |
| davidalves.net.DuelistNano 1.0 | -5.0 ± 14.8 | -3.9 ± 4.5 | -4.7 ± 9.2 | -7.3 ± 7.2 |
| dcs.PM.Eater_of_Worlds_PM 1.2 | -5.0 ± 17.3 | +4.9 ± 8.0 | +0.1 ± 11.6 | +0.3 ± 8.3 |
| demetrix.nano.Neutrino 0.27 | -15.0 ± 11.8 | +5.0 ± 6.3 | -7.8 ± 10.9 | +6.6 ± 7.8 |
| dmh.robocode.robot.PinkPanther 1.1 | -7.5 ± 15.3 | -11.7 ± 11.0 | -4.1 ± 14.1 | -14.4 ± 12.0 |
| dmp.micro.Aurora 1.41 | +0.0 ± 25.3 | -1.2 ± 7.0 | +3.3 ± 12.1 | -0.9 ± 9.6 |
| doka.Test 1.0 | +7.5 ± 21.8 | +1.2 ± 5.4 | +3.1 ± 11.3 | +3.4 ± 5.5 |
| ers.nano.sunderer.Sunderer 1.23a | -5.0 ± 7.7 | +8.7 ± 7.0 | -1.8 ± 5.7 | -0.6 ± 3.4 |
| gh.micro.GrubbmThree 1.01 | +2.5 ± 16.6 | -6.3 ± 10.2 | -2.1 ± 2.9 | -1.4 ± 3.1 |
| janm.Jammy 1.0 | -5.0 ± 7.7 | -3.9 ± 4.5 | +4.0 ± 9.9 | +6.6 ± 13.8 |
| kc.micro.rammer.MaxRisk 0.6 | -1.9 ± 21.4 | +7.5 ± 14.0 | -1.0 ± 3.8 | +1.5 ± 1.6 |
| md.November 1.0 | -7.5 ± 12.4 | +1.2 ± 8.3 | -0.3 ± 13.7 | +10.1 ± 14.6 |
| mladjo.Grrrrr 0.9 | -2.5 ± 16.6 | -9.3 ± 16.2 | -0.7 ± 8.5 | -1.8 ± 9.0 |
| mn.nano.perceptual.Impact 1.3.0 | -2.5 ± 10.7 | -2.4 ± 11.7 | -1.0 ± 2.8 | -3.6 ± 3.1 |
| mz.NanoDeath 2.56 | -7.5 ± 21.8 | +0.0 ± 10.9 | -3.2 ± 3.1 | -2.2 ± 4.0 |
| non.mega.NaN 0.1 | +7.5 ± 12.4 | +5.7 ± 17.7 | +24.6 ± 8.4 | +18.8 ± 24.7 |
| ph.mini.Archer 0.6.6 | -2.5 ± 22.7 | -2.2 ± 11.7 | +4.2 ± 11.6 | +2.5 ± 9.0 |
| robar.nano.Breeze 0.3 | +7.5 ± 15.3 | +0.0 ± 4.5 | +9.3 ± 11.7 | -1.1 ± 6.7 |
| seed.Anastasia 1.0 | +5.0 ± 7.7 | +2.5 ± 5.9 | +4.6 ± 10.7 | +2.7 ± 6.1 |
| slugzilla.RandomPattern 1.0 | -5.0 ± 14.8 | +0.0 ± 6.3 | -0.5 ± 8.3 | +3.7 ± 6.6 |
| sm.Devil 7.3 | +2.5 ± 5.9 | -3.8 ± 9.9 | +4.9 ± 10.3 | -2.2 ± 5.1 |
| stelo.MatchupAGF 1.1 | -7.5 ± 21.8 | +12.5 ± 10.7 | -2.6 ± 10.5 | -0.3 ± 8.9 |
| stelo.MatchupMini 1.1 | -2.5 ± 20.8 | +7.9 ± 21.1 | -2.5 ± 11.2 | +0.3 ± 8.1 |
| sul.Bicephal 1.2 | -2.5 ± 5.9 | -3.8 ± 11.8 | -2.9 ± 4.7 | -0.5 ± 3.6 |
| test.Podgy 4.0 | +0.0 ± 12.6 | +3.9 ± 4.5 | -1.9 ± 14.7 | +5.9 ± 6.5 |
| whind.Wisdom 0.5.1 | +15.0 ± 11.8 | -4.0 ± 9.3 | +11.7 ± 14.4 | -0.9 ± 7.3 |
