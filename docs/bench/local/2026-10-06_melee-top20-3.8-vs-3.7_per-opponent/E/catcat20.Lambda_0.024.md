# catcat20.Lambda 0.024 in melee (E): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | catcat20.Lambda 0.024 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 590 | 762 | 43.6% | 0 | 0 | 0 | 55.9% | -12.3 |
| 2 | 5 | 10280 | 11869 | 46.4% | 113 | 1 | 0 | 55.8% | -9.3 |
| 3 | 8 | 9280 | 6540 | 58.7% | 87 | 0 | 0 | 52.4% | +6.3 |
| 4 | 7 | 10169 | 8508 | 54.4% | 92 | 0 | 0 | 60.0% | -5.6 |
| 5 | 7 | 9056 | 8480 | 51.6% | 6 | 0 | 0 | 55.9% | -4.2 |
| 6 | 4 | 12174 | 10722 | 53.2% | 99 | 1 | 0 | 49.4% | +3.7 |
| 7 | 3 | 11313 | 7746 | 59.4% | 106 | 0 | 0 | 61.3% | -2.0 |
| 8 | 6 | 9832 | 7422 | 57.0% | 6 | 0 | 0 | 50.3% | +6.7 |
| 9 | 6 | 10022 | 8822 | 53.2% | 101 | 0 | 0 | 62.2% | -9.0 |
| 10 | 7 | 7644 | 6300 | 54.8% | 103 | 0 | 0 | 55.6% | -0.8 |

Mean pairwise share 53.2% ± 3.6, baseline 55.9% ± 3.1, paired diff -2.7 ± 4.8.

Skipped turns: 713 over 10 battles (71.3 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 324 over 10 battles (32.4 per battle, most in one battle 175).

