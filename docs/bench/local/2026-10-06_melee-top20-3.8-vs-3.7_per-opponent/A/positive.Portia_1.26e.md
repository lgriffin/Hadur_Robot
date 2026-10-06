# positive.Portia 1.26e in melee (A): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | positive.Portia 1.26e score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 7 | 10554 | 10134 | 51.0% | 6 | 0 | 0 | 44.4% | +6.6 |
| 2 | 4 | 10860 | 9142 | 54.3% | 114 | 0 | 0 | 51.0% | +3.3 |
| 3 | 3 | 11010 | 9647 | 53.3% | 10 | 2 | 0 | 47.9% | +5.4 |
| 4 | 3 | 11527 | 10354 | 52.7% | 122 | 0 | 0 | 45.6% | +7.0 |
| 5 | 4 | 11438 | 10684 | 51.7% | 12 | 0 | 0 | 47.9% | +3.8 |
| 6 | 5 | 10723 | 10462 | 50.6% | 9 | 0 | 0 | 51.9% | -1.3 |
| 7 | 3 | 11526 | 9245 | 55.5% | 118 | 0 | 0 | 49.0% | +6.5 |
| 8 | 8 | 9266 | 11438 | 44.8% | 99 | 0 | 0 | 49.6% | -4.8 |
| 9 | 5 | 11431 | 12209 | 48.4% | 128 | 0 | 0 | 54.1% | -5.8 |
| 10 | 6 | 11048 | 8477 | 56.6% | 120 | 0 | 0 | 51.4% | +5.2 |

Mean pairwise share 51.9% ± 2.5, baseline 49.3% ± 2.1, paired diff +2.6 ± 3.4.

Skipped turns: 738 over 10 battles (73.8 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 2390 over 10 battles (239.0 per battle, most in one battle 811).

