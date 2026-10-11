# positive.Portia 1.26e in melee (D): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | positive.Portia 1.26e score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11468 | 9905 | 53.7% | 7 | 0 | 0 | 49.0% | +4.7 |
| 2 | 6 | 11056 | 11534 | 48.9% | 104 | 1 | 1 | 48.9% | +0.0 |
| 3 | 4 | 11409 | 11244 | 50.4% | 102 | 0 | 0 | 51.1% | -0.7 |
| 4 | 6 | 10954 | 11186 | 49.5% | 103 | 1 | 0 | 46.5% | +2.9 |
| 5 | 4 | 11936 | 9196 | 56.5% | 107 | 0 | 0 | 44.5% | +12.0 |
| 6 | 4 | 12468 | 11454 | 52.1% | 111 | 0 | 0 | 45.9% | +6.2 |
| 7 | 4 | 11238 | 10681 | 51.3% | 12 | 0 | 0 | 49.2% | +2.1 |
| 8 | 6 | 10885 | 11671 | 48.3% | 115 | 1 | 1 | 45.7% | +2.6 |
| 9 | 3 | 12856 | 11038 | 53.8% | 110 | 0 | 0 | 54.1% | -0.3 |
| 10 | 5 | 11848 | 10533 | 52.9% | 98 | 0 | 0 | 48.1% | +4.9 |

Battles used against positive.Portia 1.26e: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 51.7% ± 1.8, baseline 48.3% ± 2.0, paired diff +3.4 ± 2.7.

Skipped turns: 869 over 10 battles (86.9 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1370 over 10 battles (137.0 per battle, most in one battle 474).

