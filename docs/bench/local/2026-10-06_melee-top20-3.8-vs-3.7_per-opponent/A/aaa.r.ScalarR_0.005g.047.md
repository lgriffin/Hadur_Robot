# aaa.r.ScalarR 0.005g.047 in melee (A): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | aaa.r.ScalarR 0.005g.047 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 7 | 10554 | 16305 | 39.3% | 6 | 2 | 0 | 36.1% | +3.1 |
| 2 | 4 | 10860 | 18421 | 37.1% | 114 | 2 | 0 | 44.9% | -7.8 |
| 3 | 3 | 11010 | 17043 | 39.2% | 10 | 2 | 0 | 36.5% | +2.8 |
| 4 | 3 | 11527 | 16502 | 41.1% | 122 | 1 | 0 | 43.6% | -2.5 |
| 5 | 4 | 11438 | 16970 | 40.3% | 12 | 2 | 0 | 42.2% | -2.0 |
| 6 | 5 | 10723 | 17769 | 37.6% | 9 | 1 | 0 | 40.7% | -3.0 |
| 7 | 3 | 11526 | 17431 | 39.8% | 118 | 1 | 0 | 39.0% | +0.8 |
| 8 | 8 | 9266 | 17717 | 34.3% | 99 | 3 | 0 | 40.1% | -5.7 |
| 9 | 5 | 11431 | 16382 | 41.1% | 128 | 2 | 0 | 40.5% | +0.6 |
| 10 | 6 | 11048 | 16083 | 40.7% | 120 | 6 | 1 | 39.7% | +1.0 |

Mean pairwise share 39.1% ± 1.5, baseline 40.3% ± 2.0, paired diff -1.3 ± 2.6.

Skipped turns: 738 over 10 battles (73.8 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 2390 over 10 battles (239.0 per battle, most in one battle 811).

