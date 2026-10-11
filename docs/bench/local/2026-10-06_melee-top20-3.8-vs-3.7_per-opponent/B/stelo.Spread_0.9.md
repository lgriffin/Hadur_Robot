# stelo.Spread 0.9 in melee (B): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | stelo.Spread 0.9 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10956 | 9190 | 54.4% | 124 | 0 | 0 | 58.7% | -4.3 |
| 2 | 5 | 10429 | 8780 | 54.3% | 107 | 0 | 0 | 55.1% | -0.9 |
| 3 | 5 | 11522 | 9930 | 53.7% | 12 | 1 | 0 | 62.0% | -8.2 |
| 4 | 6 | 10331 | 8762 | 54.1% | 100 | 1 | 0 | 58.0% | -3.9 |
| 5 | 5 | 11443 | 7955 | 59.0% | 11 | 0 | 0 | 61.7% | -2.7 |
| 6 | 6 | 11196 | 8583 | 56.6% | 104 | 0 | 0 | 55.5% | +1.1 |
| 7 | 6 | 11200 | 5986 | 65.2% | 100 | 0 | 0 | 56.5% | +8.7 |
| 8 | 6 | 11184 | 7106 | 61.1% | 98 | 0 | 0 | 55.0% | +6.1 |
| 9 | 6 | 9127 | 8875 | 50.7% | 105 | 0 | 0 | 55.5% | -4.8 |
| 10 | 5 | 12094 | 9769 | 55.3% | 98 | 0 | 0 | 56.1% | -0.8 |

Mean pairwise share 56.4% ± 3.0, baseline 57.4% ± 1.9, paired diff -1.0 ± 3.7.

Skipped turns: 859 over 10 battles (85.9 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1304 over 10 battles (130.4 per battle, most in one battle 567).

