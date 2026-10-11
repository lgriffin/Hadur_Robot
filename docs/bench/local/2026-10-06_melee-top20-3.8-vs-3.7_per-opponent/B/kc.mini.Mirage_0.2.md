# kc.mini.Mirage 0.2 in melee (B): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | kc.mini.Mirage 0.2 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10956 | 14358 | 43.3% | 124 | 1 | 0 | 41.6% | +1.6 |
| 2 | 5 | 10429 | 14612 | 41.6% | 107 | 1 | 0 | 44.3% | -2.7 |
| 3 | 5 | 11522 | 11057 | 51.0% | 12 | 0 | 0 | 47.5% | +3.6 |
| 4 | 6 | 10331 | 12370 | 45.5% | 100 | 1 | 0 | 46.3% | -0.8 |
| 5 | 5 | 11443 | 12114 | 48.6% | 11 | 1 | 0 | 47.8% | +0.8 |
| 6 | 6 | 11196 | 11278 | 49.8% | 104 | 1 | 1 | 49.0% | +0.8 |
| 7 | 6 | 11200 | 13558 | 45.2% | 100 | 0 | 0 | 45.4% | -0.1 |
| 8 | 6 | 11184 | 12449 | 47.3% | 98 | 0 | 0 | 44.4% | +2.9 |
| 9 | 6 | 9127 | 13003 | 41.2% | 105 | 0 | 0 | 41.0% | +0.3 |
| 10 | 5 | 12094 | 13474 | 47.3% | 98 | 3 | 2 | 51.1% | -3.8 |

Mean pairwise share 46.1% ± 2.4, baseline 45.8% ± 2.3, paired diff +0.3 ± 1.6.

Skipped turns: 859 over 10 battles (85.9 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1304 over 10 battles (130.4 per battle, most in one battle 567).

