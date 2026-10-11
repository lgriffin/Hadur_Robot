# justin.Mallais 14.0 in melee (C): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | justin.Mallais 14.0 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11164 | 9617 | 53.7% | 93 | 0 | 0 | 41.0% | +12.7 |
| 2 | 5 | 10932 | 10557 | 50.9% | 12 | 1 | 0 | 57.1% | -6.2 |
| 3 | 6 | 11708 | 12300 | 48.8% | 92 | 0 | 0 | 54.3% | -5.5 |
| 4 | 4 | 12744 | 11078 | 53.5% | 92 | 0 | 0 | 47.8% | +5.7 |
| 5 | 7 | 9089 | 8948 | 50.4% | 5 | 0 | 0 | 47.4% | +3.0 |
| 6 | 5 | 6979 | 6325 | 52.5% | 96 | 1 | 0 | 61.4% | -8.9 |
| 7 | 2 | 7783 | 7290 | 51.6% | 94 | 2 | 1 | 47.5% | +4.2 |
| 8 | 6 | 11354 | 8624 | 56.8% | 94 | 0 | 0 | 61.1% | -4.3 |
| 9 | 4 | 11358 | 10158 | 52.8% | 97 | 0 | 0 | 52.1% | +0.7 |
| 10 | 7 | 7622 | 7815 | 49.4% | 6 | 0 | 0 | 52.9% | -3.5 |

Battles used against justin.Mallais 14.0: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 52.0% ± 1.7, baseline 52.3% ± 4.7, paired diff -0.2 ± 4.8.

Skipped turns: 681 over 10 battles (68.1 per battle, most in one battle 97). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 487 over 10 battles (48.7 per battle, most in one battle 298).

