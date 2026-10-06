# ags.Glacier 0.2.11 in melee (A): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | ags.Glacier 0.2.11 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 7 | 10554 | 11058 | 48.8% | 6 | 0 | 0 | 46.8% | +2.0 |
| 2 | 4 | 10860 | 13478 | 44.6% | 114 | 0 | 0 | 48.9% | -4.3 |
| 3 | 3 | 11010 | 10588 | 51.0% | 10 | 0 | 0 | 48.2% | +2.8 |
| 4 | 3 | 11527 | 11139 | 50.9% | 122 | 1 | 0 | 51.0% | -0.1 |
| 5 | 4 | 11438 | 12880 | 47.0% | 12 | 0 | 0 | 47.4% | -0.3 |
| 6 | 5 | 10723 | 12181 | 46.8% | 9 | 0 | 0 | 45.7% | +1.1 |
| 7 | 3 | 11526 | 11226 | 50.7% | 118 | 1 | 1 | 44.2% | +6.5 |
| 8 | 8 | 9266 | 11191 | 45.3% | 99 | 0 | 0 | 46.6% | -1.3 |
| 9 | 5 | 11431 | 12341 | 48.1% | 128 | 0 | 0 | 54.5% | -6.4 |
| 10 | 6 | 11048 | 11938 | 48.1% | 120 | 0 | 0 | 50.7% | -2.6 |

Mean pairwise share 48.1% ± 1.6, baseline 48.4% ± 2.1, paired diff -0.3 ± 2.6.

Skipped turns: 738 over 10 battles (73.8 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 2390 over 10 battles (239.0 per battle, most in one battle 811).

