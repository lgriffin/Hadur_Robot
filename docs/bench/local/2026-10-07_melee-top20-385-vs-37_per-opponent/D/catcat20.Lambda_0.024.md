# catcat20.Lambda 0.024 in melee (D): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | catcat20.Lambda 0.024 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11468 | 9010 | 56.0% | 7 | 0 | 0 | 56.4% | -0.4 |
| 2 | 6 | 11056 | 8969 | 55.2% | 104 | 1 | 0 | 53.3% | +1.9 |
| 3 | 4 | 11409 | 10053 | 53.2% | 102 | 0 | 0 | 55.3% | -2.1 |
| 4 | 6 | 10954 | 8749 | 55.6% | 103 | 2 | 2 | 57.1% | -1.5 |
| 5 | 4 | 11936 | 8704 | 57.8% | 107 | 0 | 0 | 56.8% | +1.0 |
| 6 | 4 | 12468 | 7985 | 61.0% | 111 | 2 | 1 | 54.0% | +6.9 |
| 7 | 4 | 11238 | 9340 | 54.6% | 12 | 1 | 1 | 55.2% | -0.6 |
| 8 | 6 | 10885 | 8259 | 56.9% | 115 | 0 | 0 | 58.9% | -2.0 |
| 9 | 3 | 12856 | 7773 | 62.3% | 110 | 0 | 0 | 59.7% | +2.6 |
| 10 | 5 | 11848 | 8807 | 57.4% | 98 | 0 | 0 | 53.7% | +3.6 |

Battles used against catcat20.Lambda 0.024: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 57.0% ± 2.0, baseline 56.0% ± 1.5, paired diff +1.0 ± 2.1.

Skipped turns: 869 over 10 battles (86.9 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1370 over 10 battles (137.0 per battle, most in one battle 474).

