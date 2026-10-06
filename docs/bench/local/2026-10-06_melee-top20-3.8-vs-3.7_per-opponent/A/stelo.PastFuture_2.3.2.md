# stelo.PastFuture 2.3.2 in melee (A): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | stelo.PastFuture 2.3.2 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 7 | 10554 | 6363 | 62.4% | 6 | 0 | 0 | 60.5% | +1.9 |
| 2 | 4 | 10860 | 6997 | 60.8% | 114 | 0 | 0 | 73.2% | -12.4 |
| 3 | 3 | 11010 | 7252 | 60.3% | 10 | 0 | 0 | 56.4% | +3.9 |
| 4 | 3 | 11527 | 7777 | 59.7% | 122 | 2 | 0 | 54.9% | +4.8 |
| 5 | 4 | 11438 | 7642 | 59.9% | 12 | 0 | 0 | 68.1% | -8.1 |
| 6 | 5 | 10723 | 7030 | 60.4% | 9 | 0 | 0 | 60.8% | -0.4 |
| 7 | 3 | 11526 | 5125 | 69.2% | 118 | 0 | 0 | 55.7% | +13.5 |
| 8 | 8 | 9266 | 6707 | 58.0% | 99 | 0 | 0 | 62.5% | -4.5 |
| 9 | 5 | 11431 | 7719 | 59.7% | 128 | 0 | 0 | 63.9% | -4.2 |
| 10 | 6 | 11048 | 7415 | 59.8% | 120 | 0 | 0 | 64.5% | -4.7 |

Mean pairwise share 61.0% ± 2.2, baseline 62.0% ± 4.1, paired diff -1.0 ± 5.3.

Skipped turns: 738 over 10 battles (73.8 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 2390 over 10 battles (239.0 per battle, most in one battle 811).

