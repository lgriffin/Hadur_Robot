# stelo.Spread 0.9 in melee (D): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | stelo.Spread 0.9 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 3 | 12139 | 8909 | 57.7% | 114 | 0 | 0 | 52.9% | +4.7 |
| 2 | 5 | 11040 | 9431 | 53.9% | 103 | 0 | 0 | 59.8% | -5.9 |
| 3 | 6 | 11176 | 8055 | 58.1% | 103 | 1 | 0 | 60.6% | -2.5 |
| 4 | 5 | 11569 | 8790 | 56.8% | 99 | 1 | 1 | 56.0% | +0.9 |
| 5 | 3 | 12478 | 8514 | 59.4% | 93 | 0 | 0 | 58.9% | +0.5 |
| 6 | 7 | 10019 | 5517 | 64.5% | 91 | 0 | 0 | 56.7% | +7.8 |
| 7 | 3 | 12190 | 8852 | 57.9% | 115 | 0 | 0 | 54.8% | +3.1 |
| 8 | 4 | 11153 | 8752 | 56.0% | 102 | 1 | 1 | 54.7% | +1.3 |
| 9 | 7 | 10591 | 8862 | 54.4% | 9 | 0 | 0 | 60.2% | -5.7 |
| 10 | 2 | 12720 | 7541 | 62.8% | 91 | 0 | 0 | 61.7% | +1.1 |

Battles used against stelo.Spread 0.9: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 58.2% ± 2.4, baseline 57.6% ± 2.1, paired diff +0.5 ± 3.1.

Skipped turns: 920 over 10 battles (92.0 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1554 over 10 battles (155.4 per battle, most in one battle 298).

