# justin.Mallais 14.0 in melee (C): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | justin.Mallais 14.0 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 10432 | 9788 | 51.6% | 6 | 0 | 0 | 55.8% | -4.3 |
| 2 | 6 | 9567 | 8813 | 52.1% | 129 | 0 | 0 | 48.3% | +3.7 |
| 3 | 5 | 10753 | 9749 | 52.4% | 11 | 0 | 0 | 54.5% | -2.1 |
| 4 | 7 | 5194 | 5138 | 50.3% | 3 | 0 | 0 | 54.7% | -4.4 |
| 5 | 7 | 184 | 319 | 36.6% | 0 | 0 | 0 | 54.2% | -17.6 |
| 6 | 6 | 9433 | 9324 | 50.3% | 10 | 0 | 0 | 53.8% | -3.5 |
| 7 | 7 | 10409 | 10586 | 49.6% | 6 | 0 | 0 | 55.1% | -5.6 |
| 8 | 7 | 10072 | 13388 | 42.9% | 114 | 0 | 0 | 55.4% | -12.5 |
| 9 | 8 | 5313 | 5452 | 49.4% | 8 | 0 | 0 | 54.4% | -5.0 |
| 10 | 6 | 10065 | 11301 | 47.1% | 126 | 0 | 0 | 54.7% | -7.6 |

Mean pairwise share 48.2% ± 3.5, baseline 54.1% ± 1.5, paired diff -5.9 ± 4.1.

Skipped turns: 413 over 10 battles (41.3 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1628 over 10 battles (162.8 per battle, most in one battle 414).

