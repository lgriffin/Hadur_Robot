# catcat20.Matcha 0.006 in melee (A): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | catcat20.Matcha 0.006 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 3 | 11452 | 8734 | 56.7% | 11 | 0 | 0 | 50.2% | +6.5 |
| 2 | 3 | 12113 | 9784 | 55.3% | 96 | 1 | 0 | 54.1% | +1.3 |
| 3 | 5 | 11000 | 9104 | 54.7% | 8 | 1 | 0 | 51.0% | +3.7 |
| 4 | 6 | 10207 | 11014 | 48.1% | 88 | 1 | 1 | 55.6% | -7.5 |
| 5 | 8 | 9593 | 11009 | 46.6% | 100 | 1 | 0 | 55.3% | -8.7 |
| 6 | 8 | 9275 | 10339 | 47.3% | 86 | 0 | 0 | 53.6% | -6.3 |
| 7 | 3 | 11710 | 9266 | 55.8% | 96 | 1 | 0 | 46.3% | +9.6 |
| 8 | 4 | 11471 | 10828 | 51.4% | 94 | 1 | 0 | 56.6% | -5.2 |
| 9 | 5 | 10694 | 11461 | 48.3% | 92 | 1 | 1 | 56.0% | -7.7 |
| 10 | 4 | 11425 | 10129 | 53.0% | 94 | 0 | 0 | 58.1% | -5.1 |

Battles used against catcat20.Matcha 0.006: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 51.7% ± 2.8, baseline 53.7% ± 2.5, paired diff -2.0 ± 4.7.

Skipped turns: 765 over 10 battles (76.5 per battle, most in one battle 100). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 388 over 10 battles (38.8 per battle, most in one battle 298).

