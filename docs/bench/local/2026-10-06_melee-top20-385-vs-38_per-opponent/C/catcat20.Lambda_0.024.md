# catcat20.Lambda 0.024 in melee (C): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | catcat20.Lambda 0.024 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11164 | 8457 | 56.9% | 93 | 0 | 0 | 44.6% | +12.3 |
| 2 | 5 | 10932 | 8811 | 55.4% | 12 | 0 | 0 | 55.3% | +0.1 |
| 3 | 6 | 11708 | 9396 | 55.5% | 92 | 1 | 1 | 59.0% | -3.5 |
| 4 | 4 | 12744 | 6539 | 66.1% | 92 | 0 | 0 | 59.1% | +7.0 |
| 5 | 7 | 9089 | 8158 | 52.7% | 5 | 0 | 0 | 56.2% | -3.5 |
| 6 | 5 | 6979 | 5626 | 55.4% | 96 | 0 | 0 | 61.1% | -5.7 |
| 7 | 2 | 7783 | 5559 | 58.3% | 94 | 1 | 0 | 55.2% | +3.1 |
| 8 | 6 | 11354 | 9279 | 55.0% | 94 | 0 | 0 | 53.7% | +1.3 |
| 9 | 4 | 11358 | 7603 | 59.9% | 97 | 1 | 1 | 54.3% | +5.6 |
| 10 | 7 | 7622 | 5571 | 57.8% | 6 | 0 | 0 | 56.2% | +1.6 |

Battles used against catcat20.Lambda 0.024: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 57.3% ± 2.6, baseline 55.5% ± 3.2, paired diff +1.8 ± 3.9.

Skipped turns: 681 over 10 battles (68.1 per battle, most in one battle 97). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 487 over 10 battles (48.7 per battle, most in one battle 298).

