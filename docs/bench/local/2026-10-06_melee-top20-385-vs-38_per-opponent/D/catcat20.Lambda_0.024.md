# catcat20.Lambda 0.024 in melee (D): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | catcat20.Lambda 0.024 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 3 | 12139 | 10579 | 53.4% | 114 | 1 | 0 | 55.0% | -1.6 |
| 2 | 5 | 11040 | 9606 | 53.5% | 103 | 2 | 0 | 56.5% | -3.0 |
| 3 | 6 | 11176 | 10068 | 52.6% | 103 | 1 | 0 | 61.9% | -9.2 |
| 4 | 5 | 11569 | 8879 | 56.6% | 99 | 0 | 0 | 50.5% | +6.1 |
| 5 | 3 | 12478 | 9419 | 57.0% | 93 | 2 | 0 | 56.8% | +0.2 |
| 6 | 7 | 10019 | 11416 | 46.7% | 91 | 0 | 0 | 64.2% | -17.4 |
| 7 | 3 | 12190 | 8496 | 58.9% | 115 | 0 | 0 | 56.4% | +2.5 |
| 8 | 4 | 11153 | 8510 | 56.7% | 102 | 0 | 0 | 61.1% | -4.4 |
| 9 | 7 | 10591 | 8685 | 54.9% | 9 | 0 | 0 | 62.0% | -7.1 |
| 10 | 2 | 12720 | 9273 | 57.8% | 91 | 0 | 0 | 57.6% | +0.2 |

Battles used against catcat20.Lambda 0.024: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 54.8% ± 2.5, baseline 58.2% ± 2.9, paired diff -3.4 ± 4.8.

Skipped turns: 920 over 10 battles (92.0 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1554 over 10 battles (155.4 per battle, most in one battle 298).

