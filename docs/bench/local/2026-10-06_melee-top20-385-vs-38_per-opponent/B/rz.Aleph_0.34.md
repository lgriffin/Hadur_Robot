# rz.Aleph 0.34 in melee (B): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | rz.Aleph 0.34 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10654 | 12407 | 46.2% | 85 | 0 | 0 | 47.7% | -1.5 |
| 2 | 6 | 11117 | 13258 | 45.6% | 7 | 1 | 0 | 47.2% | -1.6 |
| 3 | 6 | 10969 | 10973 | 50.0% | 100 | 0 | 0 | 49.1% | +0.9 |
| 4 | 5 | 11181 | 12839 | 46.5% | 11 | 0 | 0 | 48.6% | -2.1 |
| 5 | 6 | 9696 | 12330 | 44.0% | 3 | 0 | 0 | 41.0% | +3.0 |
| 6 | 6 | 11491 | 12834 | 47.2% | 121 | 0 | 0 | 43.9% | +3.4 |
| 7 | 6 | 10898 | 12444 | 46.7% | 7 | 0 | 0 | 42.7% | +4.0 |
| 8 | 7 | 8913 | 10704 | 45.4% | 5 | 0 | 0 | 44.5% | +0.9 |
| 9 | 6 | 10193 | 12944 | 44.1% | 91 | 0 | 0 | 45.0% | -1.0 |
| 10 | 6 | 12149 | 12626 | 49.0% | 96 | 1 | 1 | 45.9% | +3.2 |

Battles used against rz.Aleph 0.34: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 46.5% ± 1.4, baseline 45.6% ± 1.9, paired diff +0.9 ± 1.7.

Skipped turns: 526 over 10 battles (52.6 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1467 over 10 battles (146.7 per battle, most in one battle 298).

