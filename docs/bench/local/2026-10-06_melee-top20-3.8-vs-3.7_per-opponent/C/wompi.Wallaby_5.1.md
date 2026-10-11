# wompi.Wallaby 5.1 in melee (C): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | wompi.Wallaby 5.1 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 10432 | 8861 | 54.1% | 6 | 0 | 0 | 53.1% | +1.0 |
| 2 | 6 | 9567 | 9417 | 50.4% | 129 | 0 | 0 | 50.1% | +0.3 |
| 3 | 5 | 10753 | 9035 | 54.3% | 11 | 2 | 1 | 56.3% | -2.0 |
| 4 | 7 | 5194 | 5281 | 49.6% | 3 | 0 | 0 | 58.5% | -8.9 |
| 5 | 7 | 184 | 649 | 22.1% | 0 | 0 | 0 | 55.7% | -33.7 |
| 6 | 6 | 9433 | 9272 | 50.4% | 10 | 0 | 0 | 54.6% | -4.2 |
| 7 | 7 | 10409 | 8560 | 54.9% | 6 | 0 | 0 | 50.2% | +4.7 |
| 8 | 7 | 10072 | 8628 | 53.9% | 114 | 0 | 0 | 55.3% | -1.4 |
| 9 | 8 | 5313 | 6024 | 46.9% | 8 | 1 | 0 | 52.7% | -5.8 |
| 10 | 6 | 10065 | 8312 | 54.8% | 126 | 0 | 0 | 57.2% | -2.5 |

Mean pairwise share 49.1% ± 7.1, baseline 54.4% ± 2.0, paired diff -5.2 ± 7.6.

Skipped turns: 413 over 10 battles (41.3 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1628 over 10 battles (162.8 per battle, most in one battle 414).

