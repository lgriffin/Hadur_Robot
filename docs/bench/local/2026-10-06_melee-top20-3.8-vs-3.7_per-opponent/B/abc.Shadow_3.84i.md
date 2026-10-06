# abc.Shadow 3.84i in melee (B): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | abc.Shadow 3.84i score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10956 | 11472 | 48.8% | 124 | 0 | 0 | 44.3% | +4.6 |
| 2 | 5 | 10429 | 12811 | 44.9% | 107 | 0 | 0 | 47.8% | -2.9 |
| 3 | 5 | 11522 | 11855 | 49.3% | 12 | 1 | 0 | 48.8% | +0.5 |
| 4 | 6 | 10331 | 11373 | 47.6% | 100 | 0 | 0 | 42.6% | +5.0 |
| 5 | 5 | 11443 | 10943 | 51.1% | 11 | 1 | 1 | 50.1% | +1.1 |
| 6 | 6 | 11196 | 13187 | 45.9% | 104 | 0 | 0 | 50.4% | -4.5 |
| 7 | 6 | 11200 | 11765 | 48.8% | 100 | 0 | 0 | 48.4% | +0.3 |
| 8 | 6 | 11184 | 13980 | 44.4% | 98 | 1 | 0 | 46.6% | -2.2 |
| 9 | 6 | 9127 | 13486 | 40.4% | 105 | 0 | 0 | 43.9% | -3.6 |
| 10 | 5 | 12094 | 12953 | 48.3% | 98 | 1 | 0 | 52.7% | -4.4 |

Mean pairwise share 47.0% ± 2.2, baseline 47.6% ± 2.3, paired diff -0.6 ± 2.5.

Skipped turns: 859 over 10 battles (85.9 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1304 over 10 battles (130.4 per battle, most in one battle 567).

