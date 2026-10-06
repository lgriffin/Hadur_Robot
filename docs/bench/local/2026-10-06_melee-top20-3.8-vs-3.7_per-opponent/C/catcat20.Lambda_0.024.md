# catcat20.Lambda 0.024 in melee (C): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | catcat20.Lambda 0.024 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 10432 | 6309 | 62.3% | 6 | 0 | 0 | 60.0% | +2.3 |
| 2 | 6 | 9567 | 8231 | 53.8% | 129 | 0 | 0 | 55.3% | -1.6 |
| 3 | 5 | 10753 | 9554 | 53.0% | 11 | 0 | 0 | 58.2% | -5.2 |
| 4 | 7 | 5194 | 4954 | 51.2% | 3 | 0 | 0 | 57.9% | -6.7 |
| 5 | 7 | 184 | 468 | 28.2% | 0 | 0 | 0 | 57.2% | -29.0 |
| 6 | 6 | 9433 | 7025 | 57.3% | 10 | 0 | 0 | 55.6% | +1.7 |
| 7 | 7 | 10409 | 8524 | 55.0% | 6 | 0 | 0 | 54.7% | +0.3 |
| 8 | 7 | 10072 | 7803 | 56.3% | 114 | 0 | 0 | 62.7% | -6.4 |
| 9 | 8 | 5313 | 5981 | 47.0% | 8 | 0 | 0 | 53.3% | -6.3 |
| 10 | 6 | 10065 | 9002 | 52.8% | 126 | 1 | 0 | 60.2% | -7.4 |

Mean pairwise share 51.7% ± 6.6, baseline 57.5% ± 2.1, paired diff -5.8 ± 6.4.

Skipped turns: 413 over 10 battles (41.3 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1628 over 10 battles (162.8 per battle, most in one battle 414).

