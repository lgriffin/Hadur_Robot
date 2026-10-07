# catcat20.Matcha 0.006 in melee (D): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | catcat20.Matcha 0.006 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 3 | 12139 | 10447 | 53.7% | 114 | 3 | 1 | 51.3% | +2.5 |
| 2 | 5 | 11040 | 10511 | 51.2% | 103 | 1 | 1 | 52.6% | -1.4 |
| 3 | 6 | 11176 | 9600 | 53.8% | 103 | 0 | 0 | 53.7% | +0.1 |
| 4 | 5 | 11569 | 10914 | 51.5% | 99 | 0 | 0 | 52.1% | -0.6 |
| 5 | 3 | 12478 | 9834 | 55.9% | 93 | 1 | 0 | 51.2% | +4.7 |
| 6 | 7 | 10019 | 10910 | 47.9% | 91 | 0 | 0 | 49.3% | -1.4 |
| 7 | 3 | 12190 | 11653 | 51.1% | 115 | 1 | 0 | 58.0% | -6.9 |
| 8 | 4 | 11153 | 10306 | 52.0% | 102 | 1 | 1 | 52.3% | -0.3 |
| 9 | 7 | 10591 | 10979 | 49.1% | 9 | 0 | 0 | 54.0% | -4.9 |
| 10 | 2 | 12720 | 9181 | 58.1% | 91 | 0 | 0 | 57.2% | +0.9 |

Battles used against catcat20.Matcha 0.006: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 52.4% ± 2.2, baseline 53.2% ± 1.9, paired diff -0.7 ± 2.4.

Skipped turns: 920 over 10 battles (92.0 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1554 over 10 battles (155.4 per battle, most in one battle 298).

