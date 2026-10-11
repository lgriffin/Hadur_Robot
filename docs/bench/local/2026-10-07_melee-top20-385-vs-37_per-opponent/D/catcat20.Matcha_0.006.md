# catcat20.Matcha 0.006 in melee (D): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | catcat20.Matcha 0.006 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11468 | 12062 | 48.7% | 7 | 1 | 0 | 53.3% | -4.6 |
| 2 | 6 | 11056 | 9459 | 53.9% | 104 | 0 | 0 | 49.4% | +4.4 |
| 3 | 4 | 11409 | 11303 | 50.2% | 102 | 1 | 0 | 51.8% | -1.5 |
| 4 | 6 | 10954 | 10041 | 52.2% | 103 | 0 | 0 | 53.2% | -1.1 |
| 5 | 4 | 11936 | 10917 | 52.2% | 107 | 0 | 0 | 54.1% | -1.9 |
| 6 | 4 | 12468 | 9865 | 55.8% | 111 | 0 | 0 | 50.7% | +5.1 |
| 7 | 4 | 11238 | 9741 | 53.6% | 12 | 1 | 0 | 49.2% | +4.4 |
| 8 | 6 | 10885 | 11327 | 49.0% | 115 | 0 | 0 | 58.5% | -9.4 |
| 9 | 3 | 12856 | 10635 | 54.7% | 110 | 4 | 2 | 57.8% | -3.1 |
| 10 | 5 | 11848 | 10967 | 51.9% | 98 | 0 | 0 | 47.4% | +4.5 |

Battles used against catcat20.Matcha 0.006: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 52.2% ± 1.7, baseline 52.5% ± 2.6, paired diff -0.3 ± 3.5.

Skipped turns: 869 over 10 battles (86.9 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1370 over 10 battles (137.0 per battle, most in one battle 474).

