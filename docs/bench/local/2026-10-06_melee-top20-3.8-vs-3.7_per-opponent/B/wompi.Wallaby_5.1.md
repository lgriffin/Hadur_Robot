# wompi.Wallaby 5.1 in melee (B): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | wompi.Wallaby 5.1 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10956 | 9533 | 53.5% | 124 | 1 | 0 | 54.4% | -0.9 |
| 2 | 5 | 10429 | 8186 | 56.0% | 107 | 0 | 0 | 52.8% | +3.2 |
| 3 | 5 | 11522 | 8593 | 57.3% | 12 | 1 | 1 | 56.1% | +1.2 |
| 4 | 6 | 10331 | 9972 | 50.9% | 100 | 1 | 1 | 55.2% | -4.3 |
| 5 | 5 | 11443 | 9864 | 53.7% | 11 | 0 | 0 | 51.2% | +2.5 |
| 6 | 6 | 11196 | 7540 | 59.8% | 104 | 0 | 0 | 57.8% | +2.0 |
| 7 | 6 | 11200 | 10000 | 52.8% | 100 | 0 | 0 | 58.5% | -5.7 |
| 8 | 6 | 11184 | 9410 | 54.3% | 98 | 1 | 0 | 55.0% | -0.7 |
| 9 | 6 | 9127 | 8878 | 50.7% | 105 | 0 | 0 | 49.7% | +1.0 |
| 10 | 5 | 12094 | 8616 | 58.4% | 98 | 0 | 0 | 59.4% | -1.0 |

Mean pairwise share 54.7% ± 2.2, baseline 55.0% ± 2.2, paired diff -0.3 ± 2.1.

Skipped turns: 859 over 10 battles (85.9 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1304 over 10 battles (130.4 per battle, most in one battle 567).

