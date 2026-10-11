# jk.melee.Neuromancer 7.12 in melee (B): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | jk.melee.Neuromancer 7.12 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10956 | 16721 | 39.6% | 124 | 2 | 0 | 38.6% | +1.0 |
| 2 | 5 | 10429 | 17526 | 37.3% | 107 | 2 | 0 | 38.7% | -1.3 |
| 3 | 5 | 11522 | 16126 | 41.7% | 12 | 5 | 0 | 40.0% | +1.7 |
| 4 | 6 | 10331 | 16464 | 38.6% | 100 | 2 | 1 | 42.5% | -3.9 |
| 5 | 5 | 11443 | 14625 | 43.9% | 11 | 0 | 0 | 43.8% | +0.1 |
| 6 | 6 | 11196 | 16853 | 39.9% | 104 | 2 | 0 | 41.7% | -1.8 |
| 7 | 6 | 11200 | 17608 | 38.9% | 100 | 6 | 1 | 42.6% | -3.7 |
| 8 | 6 | 11184 | 15788 | 41.5% | 98 | 2 | 0 | 40.4% | +1.0 |
| 9 | 6 | 9127 | 16578 | 35.5% | 105 | 1 | 0 | 37.8% | -2.3 |
| 10 | 5 | 12094 | 14457 | 45.6% | 98 | 0 | 0 | 44.8% | +0.7 |

Mean pairwise share 40.2% ± 2.2, baseline 41.1% ± 1.7, paired diff -0.8 ± 1.5.

Skipped turns: 859 over 10 battles (85.9 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1304 over 10 battles (130.4 per battle, most in one battle 567).

