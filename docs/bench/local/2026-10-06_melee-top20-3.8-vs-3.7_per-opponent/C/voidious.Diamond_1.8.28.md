# voidious.Diamond 1.8.28 in melee (C): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | voidious.Diamond 1.8.28 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 10432 | 15195 | 40.7% | 6 | 2 | 0 | 44.1% | -3.4 |
| 2 | 6 | 9567 | 15465 | 38.2% | 129 | 1 | 0 | 42.9% | -4.6 |
| 3 | 5 | 10753 | 13487 | 44.4% | 11 | 0 | 0 | 45.4% | -1.0 |
| 4 | 7 | 5194 | 7196 | 41.9% | 3 | 0 | 0 | 43.2% | -1.3 |
| 5 | 7 | 184 | 80 | 69.7% | 0 | 0 | 0 | 46.3% | +23.4 |
| 6 | 6 | 9433 | 16213 | 36.8% | 10 | 1 | 0 | 39.1% | -2.3 |
| 7 | 7 | 10409 | 18260 | 36.3% | 6 | 0 | 0 | 42.2% | -5.9 |
| 8 | 7 | 10072 | 15991 | 38.6% | 114 | 1 | 0 | 43.5% | -4.9 |
| 9 | 8 | 5313 | 7424 | 41.7% | 8 | 0 | 0 | 46.0% | -4.3 |
| 10 | 6 | 10065 | 15225 | 39.8% | 126 | 1 | 1 | 46.3% | -6.5 |

Mean pairwise share 42.8% ± 7.0, baseline 43.9% ± 1.6, paired diff -1.1 ± 6.3.

Skipped turns: 413 over 10 battles (41.3 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1628 over 10 battles (162.8 per battle, most in one battle 414).

