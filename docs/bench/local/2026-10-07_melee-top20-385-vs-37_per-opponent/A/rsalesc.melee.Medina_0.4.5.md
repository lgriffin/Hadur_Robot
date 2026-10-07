# rsalesc.melee.Medina 0.4.5 in melee (A): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | rsalesc.melee.Medina 0.4.5 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 3 | 11452 | 9717 | 54.1% | 11 | 2 | 1 | 49.4% | +4.7 |
| 2 | 3 | 12113 | 9525 | 56.0% | 96 | 1 | 0 | 54.8% | +1.1 |
| 3 | 5 | 11000 | 10951 | 50.1% | 8 | 1 | 0 | 57.7% | -7.6 |
| 4 | 6 | 10207 | 8613 | 54.2% | 88 | 0 | 0 | 57.4% | -3.2 |
| 5 | 8 | 9593 | 11614 | 45.2% | 100 | 0 | 0 | 57.1% | -11.8 |
| 6 | 8 | 9275 | 11298 | 45.1% | 86 | 0 | 0 | 50.2% | -5.2 |
| 7 | 3 | 11710 | 11636 | 50.2% | 96 | 1 | 0 | 49.8% | +0.4 |
| 8 | 4 | 11471 | 7183 | 61.5% | 94 | 1 | 0 | 57.7% | +3.8 |
| 9 | 5 | 10694 | 10150 | 51.3% | 92 | 2 | 0 | 54.0% | -2.7 |
| 10 | 4 | 11425 | 8837 | 56.4% | 94 | 0 | 0 | 55.8% | +0.6 |

Battles used against rsalesc.melee.Medina 0.4.5: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 52.4% ± 3.6, baseline 54.4% ± 2.4, paired diff -2.0 ± 3.7.

Skipped turns: 765 over 10 battles (76.5 per battle, most in one battle 100). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 388 over 10 battles (38.8 per battle, most in one battle 298).

