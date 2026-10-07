# stelo.PastFuture 2.3.2 in melee (A): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | stelo.PastFuture 2.3.2 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 3 | 11452 | 8273 | 58.1% | 11 | 1 | 0 | 56.5% | +1.6 |
| 2 | 3 | 12113 | 9607 | 55.8% | 96 | 1 | 0 | 67.2% | -11.4 |
| 3 | 5 | 11000 | 6753 | 62.0% | 8 | 1 | 0 | 58.1% | +3.9 |
| 4 | 6 | 10207 | 8038 | 55.9% | 88 | 0 | 0 | 67.8% | -11.8 |
| 5 | 8 | 9593 | 6531 | 59.5% | 100 | 0 | 0 | 56.3% | +3.2 |
| 6 | 8 | 9275 | 6747 | 57.9% | 86 | 0 | 0 | 60.6% | -2.7 |
| 7 | 3 | 11710 | 8144 | 59.0% | 96 | 0 | 0 | 60.8% | -1.9 |
| 8 | 4 | 11471 | 8390 | 57.8% | 94 | 0 | 0 | 62.7% | -5.0 |
| 9 | 5 | 10694 | 6432 | 62.4% | 92 | 0 | 0 | 65.3% | -2.8 |
| 10 | 4 | 11425 | 6477 | 63.8% | 94 | 0 | 0 | 69.2% | -5.4 |

Battles used against stelo.PastFuture 2.3.2: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 59.2% ± 2.0, baseline 62.4% ± 3.4, paired diff -3.2 ± 3.9.

Skipped turns: 765 over 10 battles (76.5 per battle, most in one battle 100). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 388 over 10 battles (38.8 per battle, most in one battle 298).

