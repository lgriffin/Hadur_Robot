# wompi.Wallaby 5.1 in melee (A): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | wompi.Wallaby 5.1 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 7 | 10554 | 7795 | 57.5% | 6 | 0 | 0 | 51.3% | +6.2 |
| 2 | 4 | 10860 | 7500 | 59.2% | 114 | 0 | 0 | 54.7% | +4.4 |
| 3 | 3 | 11010 | 8831 | 55.5% | 10 | 0 | 0 | 54.3% | +1.2 |
| 4 | 3 | 11527 | 8374 | 57.9% | 122 | 1 | 0 | 58.3% | -0.3 |
| 5 | 4 | 11438 | 7599 | 60.1% | 12 | 0 | 0 | 58.5% | +1.6 |
| 6 | 5 | 10723 | 8145 | 56.8% | 9 | 0 | 0 | 56.0% | +0.9 |
| 7 | 3 | 11526 | 9030 | 56.1% | 118 | 0 | 0 | 57.6% | -1.6 |
| 8 | 8 | 9266 | 8391 | 52.5% | 99 | 0 | 0 | 52.2% | +0.3 |
| 9 | 5 | 11431 | 7158 | 61.5% | 128 | 1 | 0 | 58.5% | +3.0 |
| 10 | 6 | 11048 | 8482 | 56.6% | 120 | 0 | 0 | 57.3% | -0.8 |

Mean pairwise share 57.4% ± 1.8, baseline 55.9% ± 1.9, paired diff +1.5 ± 1.7.

Skipped turns: 738 over 10 battles (73.8 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 2390 over 10 battles (239.0 per battle, most in one battle 811).

