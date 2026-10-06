# kc.micro.Figment 1.0 in melee (D): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | kc.micro.Figment 1.0 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 4 | 12225 | 5684 | 68.3% | 118 | 0 | 0 | 58.5% | +9.8 |
| 2 | 4 | 12258 | 5499 | 69.0% | 103 | 0 | 0 | 60.9% | +8.2 |
| 3 | 5 | 10926 | 6923 | 61.2% | 116 | 1 | 0 | 66.3% | -5.1 |
| 4 | 6 | 10311 | 7665 | 57.4% | 110 | 0 | 0 | 60.5% | -3.2 |
| 5 | 3 | 11930 | 7725 | 60.7% | 16 | 1 | 0 | 70.1% | -9.4 |
| 6 | 4 | 12299 | 6751 | 64.6% | 109 | 1 | 1 | 56.2% | +8.4 |
| 7 | 4 | 11761 | 5649 | 67.6% | 4 | 0 | 0 | 65.2% | +2.3 |
| 8 | 5 | 11071 | 5734 | 65.9% | 10 | 0 | 0 | 61.8% | +4.0 |
| 9 | 5 | 11347 | 7504 | 60.2% | 110 | 1 | 0 | 66.7% | -6.5 |
| 10 | 5 | 11410 | 4909 | 69.9% | 104 | 0 | 0 | 65.9% | +4.0 |

Mean pairwise share 64.5% ± 3.1, baseline 63.2% ± 3.1, paired diff +1.2 ± 4.9.

Skipped turns: 800 over 10 battles (80.0 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 959 over 10 battles (95.9 per battle, most in one battle 411).

