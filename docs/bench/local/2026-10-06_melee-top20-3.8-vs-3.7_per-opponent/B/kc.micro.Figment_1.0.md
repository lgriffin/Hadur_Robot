# kc.micro.Figment 1.0 in melee (B): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | kc.micro.Figment 1.0 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10956 | 6766 | 61.8% | 124 | 0 | 0 | 56.4% | +5.5 |
| 2 | 5 | 10429 | 6054 | 63.3% | 107 | 0 | 0 | 57.0% | +6.3 |
| 3 | 5 | 11522 | 8131 | 58.6% | 12 | 0 | 0 | 66.6% | -8.0 |
| 4 | 6 | 10331 | 9468 | 52.2% | 100 | 0 | 0 | 61.3% | -9.1 |
| 5 | 5 | 11443 | 7395 | 60.7% | 11 | 0 | 0 | 60.5% | +0.3 |
| 6 | 6 | 11196 | 7889 | 58.7% | 104 | 0 | 0 | 68.7% | -10.0 |
| 7 | 6 | 11200 | 7937 | 58.5% | 100 | 0 | 0 | 59.2% | -0.7 |
| 8 | 6 | 11184 | 7195 | 60.9% | 98 | 0 | 0 | 59.7% | +1.1 |
| 9 | 6 | 9127 | 7539 | 54.8% | 105 | 0 | 0 | 56.9% | -2.1 |
| 10 | 5 | 12094 | 6400 | 65.4% | 98 | 0 | 0 | 58.9% | +6.5 |

Mean pairwise share 59.5% ± 2.8, baseline 60.5% ± 2.9, paired diff -1.0 ± 4.5.

Skipped turns: 859 over 10 battles (85.9 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1304 over 10 battles (130.4 per battle, most in one battle 567).

