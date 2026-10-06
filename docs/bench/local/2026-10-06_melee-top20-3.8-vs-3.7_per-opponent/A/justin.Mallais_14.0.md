# justin.Mallais 14.0 in melee (A): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | justin.Mallais 14.0 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 7 | 10554 | 10595 | 49.9% | 6 | 0 | 0 | 45.9% | +4.1 |
| 2 | 4 | 10860 | 8961 | 54.8% | 114 | 0 | 0 | 53.1% | +1.7 |
| 3 | 3 | 11010 | 8939 | 55.2% | 10 | 1 | 0 | 47.8% | +7.4 |
| 4 | 3 | 11527 | 10273 | 52.9% | 122 | 0 | 0 | 51.3% | +1.6 |
| 5 | 4 | 11438 | 9771 | 53.9% | 12 | 0 | 0 | 52.4% | +1.5 |
| 6 | 5 | 10723 | 11004 | 49.4% | 9 | 1 | 0 | 48.4% | +0.9 |
| 7 | 3 | 11526 | 10447 | 52.5% | 118 | 0 | 0 | 50.2% | +2.3 |
| 8 | 8 | 9266 | 11293 | 45.1% | 99 | 1 | 1 | 47.1% | -2.0 |
| 9 | 5 | 11431 | 10344 | 52.5% | 128 | 2 | 1 | 55.4% | -2.9 |
| 10 | 6 | 11048 | 12013 | 47.9% | 120 | 1 | 0 | 48.3% | -0.4 |

Mean pairwise share 51.4% ± 2.3, baseline 50.0% ± 2.2, paired diff +1.4 ± 2.1.

Skipped turns: 738 over 10 battles (73.8 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 2390 over 10 battles (239.0 per battle, most in one battle 811).

