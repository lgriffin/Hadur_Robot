# stelo.PastFuture 2.3.2 in melee (B): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | stelo.PastFuture 2.3.2 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10654 | 8722 | 55.0% | 85 | 0 | 0 | 60.2% | -5.2 |
| 2 | 6 | 11117 | 7093 | 61.0% | 7 | 0 | 0 | 56.9% | +4.2 |
| 3 | 6 | 10969 | 7640 | 58.9% | 100 | 0 | 0 | 57.5% | +1.5 |
| 4 | 5 | 11181 | 6383 | 63.7% | 11 | 0 | 0 | 63.2% | +0.5 |
| 5 | 6 | 9696 | 7580 | 56.1% | 3 | 0 | 0 | 52.8% | +3.3 |
| 6 | 6 | 11491 | 8769 | 56.7% | 121 | 1 | 0 | 58.4% | -1.7 |
| 7 | 6 | 10898 | 7285 | 59.9% | 7 | 1 | 1 | 59.9% | -0.0 |
| 8 | 7 | 8913 | 9585 | 48.2% | 5 | 0 | 0 | 56.4% | -8.2 |
| 9 | 6 | 10193 | 8411 | 54.8% | 91 | 0 | 0 | 62.3% | -7.5 |
| 10 | 6 | 12149 | 6900 | 63.8% | 96 | 0 | 0 | 60.0% | +3.8 |

Battles used against stelo.PastFuture 2.3.2: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 57.8% ± 3.4, baseline 58.8% ± 2.2, paired diff -0.9 ± 3.3.

Skipped turns: 526 over 10 battles (52.6 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1467 over 10 battles (146.7 per battle, most in one battle 298).

