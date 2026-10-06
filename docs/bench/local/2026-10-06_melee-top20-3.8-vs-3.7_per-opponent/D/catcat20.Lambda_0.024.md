# catcat20.Lambda 0.024 in melee (D): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | catcat20.Lambda 0.024 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 4 | 12225 | 8724 | 58.4% | 118 | 0 | 0 | 52.9% | +5.5 |
| 2 | 4 | 12258 | 9064 | 57.5% | 103 | 1 | 0 | 58.1% | -0.6 |
| 3 | 5 | 10926 | 10171 | 51.8% | 116 | 0 | 0 | 62.3% | -10.5 |
| 4 | 6 | 10311 | 8951 | 53.5% | 110 | 0 | 0 | 56.0% | -2.5 |
| 5 | 3 | 11930 | 9044 | 56.9% | 16 | 1 | 0 | 62.2% | -5.3 |
| 6 | 4 | 12299 | 9296 | 57.0% | 109 | 1 | 0 | 59.0% | -2.0 |
| 7 | 4 | 11761 | 9027 | 56.6% | 4 | 0 | 0 | 56.6% | -0.0 |
| 8 | 5 | 11071 | 9647 | 53.4% | 10 | 0 | 0 | 52.9% | +0.5 |
| 9 | 5 | 11347 | 10515 | 51.9% | 110 | 1 | 1 | 55.2% | -3.3 |
| 10 | 5 | 11410 | 9775 | 53.9% | 104 | 0 | 0 | 58.8% | -5.0 |

Mean pairwise share 55.1% ± 1.7, baseline 57.4% ± 2.4, paired diff -2.3 ± 3.0.

Skipped turns: 800 over 10 battles (80.0 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 959 over 10 battles (95.9 per battle, most in one battle 411).

