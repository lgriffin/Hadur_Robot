# jk.melee.Neuromancer 7.12 in melee (B): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | jk.melee.Neuromancer 7.12 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10654 | 16844 | 38.7% | 85 | 2 | 1 | 39.9% | -1.2 |
| 2 | 6 | 11117 | 17216 | 39.2% | 7 | 1 | 0 | 37.8% | +1.4 |
| 3 | 6 | 10969 | 15607 | 41.3% | 100 | 1 | 0 | 42.7% | -1.4 |
| 4 | 5 | 11181 | 15279 | 42.3% | 11 | 1 | 0 | 38.5% | +3.8 |
| 5 | 6 | 9696 | 15371 | 38.7% | 3 | 0 | 0 | 35.7% | +2.9 |
| 6 | 6 | 11491 | 14832 | 43.7% | 121 | 1 | 0 | 38.9% | +4.7 |
| 7 | 6 | 10898 | 16998 | 39.1% | 7 | 2 | 0 | 37.1% | +2.0 |
| 8 | 7 | 8913 | 14228 | 38.5% | 5 | 0 | 0 | 36.4% | +2.1 |
| 9 | 6 | 10193 | 15212 | 40.1% | 91 | 1 | 0 | 39.4% | +0.8 |
| 10 | 6 | 12149 | 16351 | 42.6% | 96 | 3 | 0 | 38.5% | +4.2 |

Battles used against jk.melee.Neuromancer 7.12: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 40.4% ± 1.4, baseline 38.5% ± 1.4, paired diff +1.9 ± 1.5.

Skipped turns: 526 over 10 battles (52.6 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1467 over 10 battles (146.7 per battle, most in one battle 298).

