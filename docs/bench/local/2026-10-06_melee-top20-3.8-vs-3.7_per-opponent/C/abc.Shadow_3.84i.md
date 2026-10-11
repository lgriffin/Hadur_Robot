# abc.Shadow 3.84i in melee (C): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | abc.Shadow 3.84i score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 10432 | 12672 | 45.2% | 6 | 1 | 0 | 46.4% | -1.2 |
| 2 | 6 | 9567 | 15053 | 38.9% | 129 | 1 | 0 | 50.3% | -11.4 |
| 3 | 5 | 10753 | 13539 | 44.3% | 11 | 1 | 1 | 51.4% | -7.2 |
| 4 | 7 | 5194 | 6223 | 45.5% | 3 | 0 | 0 | 43.4% | +2.1 |
| 5 | 7 | 184 | 457 | 28.7% | 0 | 0 | 0 | 43.3% | -14.6 |
| 6 | 6 | 9433 | 13855 | 40.5% | 10 | 3 | 1 | 46.2% | -5.7 |
| 7 | 7 | 10409 | 12209 | 46.0% | 6 | 0 | 0 | 43.0% | +3.0 |
| 8 | 7 | 10072 | 13609 | 42.5% | 114 | 1 | 0 | 45.9% | -3.4 |
| 9 | 8 | 5313 | 8401 | 38.7% | 8 | 0 | 0 | 51.2% | -12.4 |
| 10 | 6 | 10065 | 11664 | 46.3% | 126 | 1 | 1 | 49.2% | -2.9 |

Mean pairwise share 41.7% ± 3.8, baseline 47.0% ± 2.4, paired diff -5.4 ± 4.3.

Skipped turns: 413 over 10 battles (41.3 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1628 over 10 battles (162.8 per battle, most in one battle 414).

