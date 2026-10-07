# stelo.Spread 0.9 in melee (D): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | stelo.Spread 0.9 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11468 | 8507 | 57.4% | 7 | 0 | 0 | 57.4% | +0.0 |
| 2 | 6 | 11056 | 7848 | 58.5% | 104 | 1 | 1 | 54.6% | +3.9 |
| 3 | 4 | 11409 | 6953 | 62.1% | 102 | 0 | 0 | 53.7% | +8.4 |
| 4 | 6 | 10954 | 8341 | 56.8% | 103 | 0 | 0 | 53.0% | +3.8 |
| 5 | 4 | 11936 | 9356 | 56.1% | 107 | 1 | 0 | 53.9% | +2.2 |
| 6 | 4 | 12468 | 8117 | 60.6% | 111 | 1 | 1 | 56.0% | +4.6 |
| 7 | 4 | 11238 | 5738 | 66.2% | 12 | 0 | 0 | 54.4% | +11.8 |
| 8 | 6 | 10885 | 8910 | 55.0% | 115 | 0 | 0 | 58.6% | -3.6 |
| 9 | 3 | 12856 | 9092 | 58.6% | 110 | 0 | 0 | 57.3% | +1.3 |
| 10 | 5 | 11848 | 6562 | 64.4% | 98 | 0 | 0 | 53.9% | +10.4 |

Battles used against stelo.Spread 0.9: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 59.6% ± 2.6, baseline 55.3% ± 1.4, paired diff +4.3 ± 3.4.

Skipped turns: 869 over 10 battles (86.9 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1370 over 10 battles (137.0 per battle, most in one battle 474).

