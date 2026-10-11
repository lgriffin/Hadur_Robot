# stelo.Spread 0.9 in melee (D): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | stelo.Spread 0.9 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 4 | 12225 | 6296 | 66.0% | 118 | 0 | 0 | 55.9% | +10.1 |
| 2 | 4 | 12258 | 7569 | 61.8% | 103 | 0 | 0 | 60.9% | +0.9 |
| 3 | 5 | 10926 | 8725 | 55.6% | 116 | 0 | 0 | 58.0% | -2.4 |
| 4 | 6 | 10311 | 7560 | 57.7% | 110 | 1 | 0 | 56.1% | +1.6 |
| 5 | 3 | 11930 | 8425 | 58.6% | 16 | 0 | 0 | 62.0% | -3.4 |
| 6 | 4 | 12299 | 6995 | 63.7% | 109 | 1 | 0 | 49.8% | +14.0 |
| 7 | 4 | 11761 | 8798 | 57.2% | 4 | 0 | 0 | 63.8% | -6.6 |
| 8 | 5 | 11071 | 8184 | 57.5% | 10 | 1 | 0 | 56.3% | +1.2 |
| 9 | 5 | 11347 | 7179 | 61.2% | 110 | 0 | 0 | 63.1% | -1.8 |
| 10 | 5 | 11410 | 8654 | 56.9% | 104 | 1 | 0 | 61.8% | -5.0 |

Mean pairwise share 59.6% ± 2.4, baseline 58.8% ± 3.1, paired diff +0.9 ± 4.7.

Skipped turns: 800 over 10 battles (80.0 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 959 over 10 battles (95.9 per battle, most in one battle 411).

