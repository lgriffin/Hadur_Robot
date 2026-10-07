# stelo.PastFuture 2.3.2 in melee (A): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | stelo.PastFuture 2.3.2 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11214 | 8050 | 58.2% | 98 | 0 | 0 | 60.6% | -2.4 |
| 2 | 5 | 10672 | 8056 | 57.0% | 94 | 0 | 0 | 58.5% | -1.5 |
| 3 | 3 | 11855 | 8323 | 58.8% | 93 | 1 | 1 | 59.6% | -0.9 |
| 4 | 6 | 10012 | 7946 | 55.8% | 5 | 0 | 0 | 63.4% | -7.6 |
| 5 | 4 | 11607 | 6373 | 64.6% | 106 | 0 | 0 | 57.7% | +6.8 |
| 6 | 3 | 12383 | 6449 | 65.8% | 89 | 0 | 0 | 60.9% | +4.9 |
| 7 | 3 | 11162 | 7737 | 59.1% | 97 | 0 | 0 | 59.1% | -0.0 |
| 8 | 7 | 10147 | 7879 | 56.3% | 94 | 0 | 0 | 68.5% | -12.2 |
| 9 | 3 | 11760 | 6069 | 66.0% | 91 | 0 | 0 | 69.1% | -3.1 |
| 10 | 9 | 9269 | 8196 | 53.1% | 90 | 0 | 0 | 65.4% | -12.4 |

Battles used against stelo.PastFuture 2.3.2: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 59.4% ± 3.2, baseline 62.3% ± 2.9, paired diff -2.8 ± 4.6.

Skipped turns: 857 over 10 battles (85.7 per battle, most in one battle 106). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1075 over 10 battles (107.5 per battle, most in one battle 298).

