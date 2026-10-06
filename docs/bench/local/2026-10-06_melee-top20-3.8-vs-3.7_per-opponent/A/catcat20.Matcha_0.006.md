# catcat20.Matcha 0.006 in melee (A): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | catcat20.Matcha 0.006 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 7 | 10554 | 12150 | 46.5% | 6 | 2 | 0 | 47.6% | -1.1 |
| 2 | 4 | 10860 | 10674 | 50.4% | 114 | 2 | 2 | 48.9% | +1.5 |
| 3 | 3 | 11010 | 10808 | 50.5% | 10 | 0 | 0 | 48.2% | +2.2 |
| 4 | 3 | 11527 | 9642 | 54.5% | 122 | 1 | 0 | 52.8% | +1.7 |
| 5 | 4 | 11438 | 10777 | 51.5% | 12 | 0 | 0 | 50.6% | +0.8 |
| 6 | 5 | 10723 | 9946 | 51.9% | 9 | 1 | 1 | 53.1% | -1.2 |
| 7 | 3 | 11526 | 9349 | 55.2% | 118 | 0 | 0 | 45.2% | +10.1 |
| 8 | 8 | 9266 | 9594 | 49.1% | 99 | 0 | 0 | 52.1% | -2.9 |
| 9 | 5 | 11431 | 9267 | 55.2% | 128 | 1 | 0 | 49.8% | +5.5 |
| 10 | 6 | 11048 | 11204 | 49.6% | 120 | 0 | 0 | 57.5% | -7.9 |

Mean pairwise share 51.4% ± 2.0, baseline 50.6% ± 2.5, paired diff +0.9 ± 3.4.

Skipped turns: 738 over 10 battles (73.8 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 2390 over 10 battles (239.0 per battle, most in one battle 811).

