# jk.melee.Neuromancer 7.12 in melee (A): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | jk.melee.Neuromancer 7.12 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 7 | 10554 | 12791 | 45.2% | 6 | 0 | 0 | 36.4% | +8.9 |
| 2 | 4 | 10860 | 14079 | 43.5% | 114 | 3 | 0 | 42.7% | +0.8 |
| 3 | 3 | 11010 | 17575 | 38.5% | 10 | 3 | 0 | 36.0% | +2.5 |
| 4 | 3 | 11527 | 17072 | 40.3% | 122 | 2 | 1 | 40.0% | +0.3 |
| 5 | 4 | 11438 | 13809 | 45.3% | 12 | 1 | 0 | 40.4% | +4.9 |
| 6 | 5 | 10723 | 13656 | 44.0% | 9 | 1 | 0 | 42.4% | +1.6 |
| 7 | 3 | 11526 | 15800 | 42.2% | 118 | 1 | 0 | 36.2% | +6.0 |
| 8 | 8 | 9266 | 13902 | 40.0% | 99 | 0 | 0 | 39.1% | +0.9 |
| 9 | 5 | 11431 | 15287 | 42.8% | 128 | 0 | 0 | 44.9% | -2.1 |
| 10 | 6 | 11048 | 15470 | 41.7% | 120 | 1 | 0 | 43.3% | -1.6 |

Mean pairwise share 42.3% ± 1.6, baseline 40.1% ± 2.3, paired diff +2.2 ± 2.5.

Skipped turns: 738 over 10 battles (73.8 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 2390 over 10 battles (239.0 per battle, most in one battle 811).

