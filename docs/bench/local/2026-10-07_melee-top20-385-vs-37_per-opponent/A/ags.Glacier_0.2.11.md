# ags.Glacier 0.2.11 in melee (A): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | ags.Glacier 0.2.11 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 3 | 11452 | 10403 | 52.4% | 11 | 0 | 0 | 44.2% | +8.2 |
| 2 | 3 | 12113 | 10067 | 54.6% | 96 | 2 | 2 | 50.3% | +4.4 |
| 3 | 5 | 11000 | 12028 | 47.8% | 8 | 0 | 0 | 52.1% | -4.3 |
| 4 | 6 | 10207 | 10298 | 49.8% | 88 | 0 | 0 | 54.7% | -4.9 |
| 5 | 8 | 9593 | 10758 | 47.1% | 100 | 1 | 0 | 46.1% | +1.0 |
| 6 | 8 | 9275 | 11228 | 45.2% | 86 | 1 | 0 | 47.2% | -2.0 |
| 7 | 3 | 11710 | 9892 | 54.2% | 96 | 0 | 0 | 55.5% | -1.2 |
| 8 | 4 | 11471 | 11703 | 49.5% | 94 | 0 | 0 | 46.2% | +3.3 |
| 9 | 5 | 10694 | 12376 | 46.4% | 92 | 2 | 1 | 50.4% | -4.0 |
| 10 | 4 | 11425 | 11328 | 50.2% | 94 | 2 | 1 | 52.4% | -2.2 |

Battles used against ags.Glacier 0.2.11: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 49.7% ± 2.3, baseline 49.9% ± 2.8, paired diff -0.2 ± 3.1.

Skipped turns: 765 over 10 battles (76.5 per battle, most in one battle 100). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 388 over 10 battles (38.8 per battle, most in one battle 298).

