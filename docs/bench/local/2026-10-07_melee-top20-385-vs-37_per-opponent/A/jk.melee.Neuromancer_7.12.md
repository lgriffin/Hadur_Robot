# jk.melee.Neuromancer 7.12 in melee (A): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | jk.melee.Neuromancer 7.12 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 3 | 11452 | 14679 | 43.8% | 11 | 1 | 0 | 37.2% | +6.6 |
| 2 | 3 | 12113 | 14400 | 45.7% | 96 | 1 | 0 | 42.9% | +2.8 |
| 3 | 5 | 11000 | 12524 | 46.8% | 8 | 0 | 0 | 43.2% | +3.6 |
| 4 | 6 | 10207 | 15028 | 40.4% | 88 | 0 | 0 | 43.6% | -3.1 |
| 5 | 8 | 9593 | 15144 | 38.8% | 100 | 2 | 0 | 41.6% | -2.8 |
| 6 | 8 | 9275 | 15806 | 37.0% | 86 | 1 | 1 | 37.4% | -0.4 |
| 7 | 3 | 11710 | 14660 | 44.4% | 96 | 1 | 0 | 43.1% | +1.4 |
| 8 | 4 | 11471 | 15078 | 43.2% | 94 | 2 | 0 | 42.2% | +1.0 |
| 9 | 5 | 10694 | 15082 | 41.5% | 92 | 0 | 0 | 45.1% | -3.6 |
| 10 | 4 | 11425 | 14268 | 44.5% | 94 | 1 | 0 | 44.9% | -0.4 |

Battles used against jk.melee.Neuromancer 7.12: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 42.6% ± 2.2, baseline 42.1% ± 2.0, paired diff +0.5 ± 2.3.

Skipped turns: 765 over 10 battles (76.5 per battle, most in one battle 100). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 388 over 10 battles (38.8 per battle, most in one battle 298).

