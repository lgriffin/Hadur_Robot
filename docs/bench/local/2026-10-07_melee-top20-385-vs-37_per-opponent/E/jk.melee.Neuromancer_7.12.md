# jk.melee.Neuromancer 7.12 in melee (E): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | jk.melee.Neuromancer 7.12 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10876 | 14192 | 43.4% | 113 | 1 | 1 | 50.3% | -6.9 |
| 2 | 3 | 6210 | 8860 | 41.2% | 99 | 2 | 2 | 47.6% | -6.4 |
| 3 | 7 | 10364 | 14693 | 41.4% | 103 | 2 | 1 | 40.4% | +0.9 |
| 4 | 5 | 6599 | 9983 | 39.8% | 94 | 2 | 1 | 46.6% | -6.8 |
| 5 | 5 | 9889 | 14894 | 39.9% | 91 | 1 | 1 | 43.9% | -4.0 |
| 6 | 5 | 11147 | 13054 | 46.1% | 99 | 1 | 0 | 44.6% | +1.4 |
| 7 | 6 | 10234 | 12926 | 44.2% | 101 | 1 | 0 | 40.0% | +4.2 |
| 8 | 9 | 2256 | 3426 | 39.7% | 1 | 0 | 0 | 45.0% | -5.3 |
| 9 | 6 | 10752 | 13320 | 44.7% | 94 | 1 | 1 | 53.4% | -8.7 |
| 10 | 6 | 10843 | 13837 | 43.9% | 118 | 1 | 1 | 42.4% | +1.6 |

Battles used against jk.melee.Neuromancer 7.12: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 42.4% ± 1.6, baseline 45.4% ± 3.0, paired diff -3.0 ± 3.3.

Skipped turns: 913 over 10 battles (91.3 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 883 over 10 battles (88.3 per battle, most in one battle 298).

