# stelo.PastFuture 2.3.2 in melee (B): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | stelo.PastFuture 2.3.2 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10956 | 7936 | 58.0% | 124 | 0 | 0 | 63.0% | -5.0 |
| 2 | 5 | 10429 | 8566 | 54.9% | 107 | 0 | 0 | 54.1% | +0.9 |
| 3 | 5 | 11522 | 8236 | 58.3% | 12 | 1 | 0 | 55.1% | +3.2 |
| 4 | 6 | 10331 | 7062 | 59.4% | 100 | 0 | 0 | 55.3% | +4.1 |
| 5 | 5 | 11443 | 7366 | 60.8% | 11 | 0 | 0 | 57.8% | +3.0 |
| 6 | 6 | 11196 | 8569 | 56.6% | 104 | 0 | 0 | 60.3% | -3.6 |
| 7 | 6 | 11200 | 6756 | 62.4% | 100 | 0 | 0 | 61.0% | +1.4 |
| 8 | 6 | 11184 | 6049 | 64.9% | 98 | 0 | 0 | 60.2% | +4.7 |
| 9 | 6 | 9127 | 7632 | 54.5% | 105 | 0 | 0 | 55.1% | -0.6 |
| 10 | 5 | 12094 | 8199 | 59.6% | 98 | 0 | 0 | 64.9% | -5.3 |

Mean pairwise share 58.9% ± 2.3, baseline 58.7% ± 2.7, paired diff +0.3 ± 2.7.

Skipped turns: 859 over 10 battles (85.9 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1304 over 10 battles (130.4 per battle, most in one battle 567).

