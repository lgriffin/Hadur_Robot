# wompi.Numbat 2.1 in melee (C): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | wompi.Numbat 2.1 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 10432 | 11577 | 47.4% | 6 | 1 | 0 | 53.1% | -5.7 |
| 2 | 6 | 9567 | 10337 | 48.1% | 129 | 1 | 0 | 48.5% | -0.5 |
| 3 | 5 | 10753 | 9978 | 51.9% | 11 | 2 | 2 | 55.9% | -4.1 |
| 4 | 7 | 5194 | 5604 | 48.1% | 3 | 0 | 0 | 49.3% | -1.2 |
| 5 | 7 | 184 | 398 | 31.6% | 0 | 0 | 0 | 50.8% | -19.2 |
| 6 | 6 | 9433 | 10960 | 46.3% | 10 | 1 | 0 | 54.3% | -8.0 |
| 7 | 7 | 10409 | 11569 | 47.4% | 6 | 1 | 0 | 57.0% | -9.6 |
| 8 | 7 | 10072 | 10634 | 48.6% | 114 | 0 | 0 | 52.1% | -3.5 |
| 9 | 8 | 5313 | 5169 | 50.7% | 8 | 1 | 0 | 50.5% | +0.2 |
| 10 | 6 | 10065 | 9851 | 50.5% | 126 | 0 | 0 | 52.4% | -1.8 |

Mean pairwise share 47.1% ± 4.1, baseline 52.4% ± 2.0, paired diff -5.3 ± 4.2.

Skipped turns: 413 over 10 battles (41.3 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1628 over 10 battles (162.8 per battle, most in one battle 414).

