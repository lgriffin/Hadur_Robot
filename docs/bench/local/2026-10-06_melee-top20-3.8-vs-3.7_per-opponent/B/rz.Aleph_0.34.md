# rz.Aleph 0.34 in melee (B): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | rz.Aleph 0.34 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10956 | 11828 | 48.1% | 124 | 0 | 0 | 46.5% | +1.6 |
| 2 | 5 | 10429 | 14403 | 42.0% | 107 | 0 | 0 | 43.6% | -1.6 |
| 3 | 5 | 11522 | 13327 | 46.4% | 12 | 0 | 0 | 47.2% | -0.8 |
| 4 | 6 | 10331 | 11307 | 47.7% | 100 | 0 | 0 | 48.0% | -0.3 |
| 5 | 5 | 11443 | 12917 | 47.0% | 11 | 1 | 1 | 46.1% | +0.9 |
| 6 | 6 | 11196 | 11514 | 49.3% | 104 | 1 | 0 | 48.9% | +0.4 |
| 7 | 6 | 11200 | 12129 | 48.0% | 100 | 0 | 0 | 50.4% | -2.4 |
| 8 | 6 | 11184 | 12130 | 48.0% | 98 | 0 | 0 | 49.9% | -1.9 |
| 9 | 6 | 9127 | 11410 | 44.4% | 105 | 1 | 1 | 42.7% | +1.7 |
| 10 | 5 | 12094 | 11954 | 50.3% | 98 | 0 | 0 | 51.9% | -1.7 |

Mean pairwise share 47.1% ± 1.7, baseline 47.5% ± 2.1, paired diff -0.4 ± 1.1.

Skipped turns: 859 over 10 battles (85.9 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1304 over 10 battles (130.4 per battle, most in one battle 567).

