# justin.Mallais 14.0 in melee (A): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | justin.Mallais 14.0 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 3 | 11452 | 10896 | 51.2% | 11 | 1 | 0 | 42.0% | +9.2 |
| 2 | 3 | 12113 | 10991 | 52.4% | 96 | 1 | 0 | 55.6% | -3.1 |
| 3 | 5 | 11000 | 11743 | 48.4% | 8 | 0 | 0 | 49.9% | -1.6 |
| 4 | 6 | 10207 | 10612 | 49.0% | 88 | 2 | 0 | 59.2% | -10.2 |
| 5 | 8 | 9593 | 11045 | 46.5% | 100 | 0 | 0 | 50.6% | -4.1 |
| 6 | 8 | 9275 | 12708 | 42.2% | 86 | 0 | 0 | 55.0% | -12.8 |
| 7 | 3 | 11710 | 10297 | 53.2% | 96 | 1 | 0 | 55.5% | -2.3 |
| 8 | 4 | 11471 | 10833 | 51.4% | 94 | 1 | 1 | 61.4% | -10.0 |
| 9 | 5 | 10694 | 9399 | 53.2% | 92 | 0 | 0 | 49.2% | +4.0 |
| 10 | 4 | 11425 | 11293 | 50.3% | 94 | 0 | 0 | 52.2% | -1.9 |

Battles used against justin.Mallais 14.0: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 49.8% ± 2.5, baseline 53.1% ± 4.0, paired diff -3.3 ± 4.8.

Skipped turns: 765 over 10 battles (76.5 per battle, most in one battle 100). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 388 over 10 battles (38.8 per battle, most in one battle 298).

