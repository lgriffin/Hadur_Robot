# stelo.Spread 0.9 in melee (B): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | stelo.Spread 0.9 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10654 | 7939 | 57.3% | 85 | 0 | 0 | 55.2% | +2.1 |
| 2 | 6 | 11117 | 6602 | 62.7% | 7 | 0 | 0 | 60.8% | +1.9 |
| 3 | 6 | 10969 | 8705 | 55.8% | 100 | 1 | 1 | 59.5% | -3.8 |
| 4 | 5 | 11181 | 8622 | 56.5% | 11 | 2 | 0 | 61.0% | -4.5 |
| 5 | 6 | 9696 | 8660 | 52.8% | 3 | 0 | 0 | 58.9% | -6.1 |
| 6 | 6 | 11491 | 8390 | 57.8% | 121 | 1 | 0 | 57.0% | +0.8 |
| 7 | 6 | 10898 | 8640 | 55.8% | 7 | 0 | 0 | 56.0% | -0.2 |
| 8 | 7 | 8913 | 8561 | 51.0% | 5 | 0 | 0 | 50.5% | +0.5 |
| 9 | 6 | 10193 | 7389 | 58.0% | 91 | 0 | 0 | 55.5% | +2.5 |
| 10 | 6 | 12149 | 8178 | 59.8% | 96 | 0 | 0 | 53.7% | +6.1 |

Battles used against stelo.Spread 0.9: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 56.7% ± 2.4, baseline 56.8% ± 2.4, paired diff -0.1 ± 2.7.

Skipped turns: 526 over 10 battles (52.6 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1467 over 10 battles (146.7 per battle, most in one battle 298).

