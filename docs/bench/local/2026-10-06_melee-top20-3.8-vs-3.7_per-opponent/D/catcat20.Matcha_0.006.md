# catcat20.Matcha 0.006 in melee (D): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | catcat20.Matcha 0.006 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 4 | 12225 | 11867 | 50.7% | 118 | 1 | 1 | 53.3% | -2.5 |
| 2 | 4 | 12258 | 11236 | 52.2% | 103 | 0 | 0 | 52.6% | -0.4 |
| 3 | 5 | 10926 | 9910 | 52.4% | 116 | 0 | 0 | 47.9% | +4.6 |
| 4 | 6 | 10311 | 10975 | 48.4% | 110 | 0 | 0 | 56.8% | -8.4 |
| 5 | 3 | 11930 | 9125 | 56.7% | 16 | 0 | 0 | 56.5% | +0.1 |
| 6 | 4 | 12299 | 11011 | 52.8% | 109 | 2 | 0 | 48.1% | +4.7 |
| 7 | 4 | 11761 | 10812 | 52.1% | 4 | 0 | 0 | 50.9% | +1.2 |
| 8 | 5 | 11071 | 9817 | 53.0% | 10 | 1 | 1 | 55.2% | -2.2 |
| 9 | 5 | 11347 | 10188 | 52.7% | 110 | 0 | 0 | 56.3% | -3.6 |
| 10 | 5 | 11410 | 8933 | 56.1% | 104 | 0 | 0 | 51.2% | +4.9 |

Mean pairwise share 52.7% ± 1.7, baseline 52.9% ± 2.4, paired diff -0.2 ± 3.0.

Skipped turns: 800 over 10 battles (80.0 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 959 over 10 battles (95.9 per battle, most in one battle 411).

