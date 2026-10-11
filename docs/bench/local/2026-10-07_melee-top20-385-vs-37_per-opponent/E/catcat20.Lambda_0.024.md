# catcat20.Lambda 0.024 in melee (E): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | catcat20.Lambda 0.024 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10876 | 8615 | 55.8% | 113 | 0 | 0 | 66.2% | -10.4 |
| 2 | 3 | 6210 | 3690 | 62.7% | 99 | 0 | 0 | 54.3% | +8.5 |
| 3 | 7 | 10364 | 8992 | 53.5% | 103 | 0 | 0 | 57.6% | -4.0 |
| 4 | 5 | 6599 | 6206 | 51.5% | 94 | 0 | 0 | 57.4% | -5.8 |
| 5 | 5 | 9889 | 8711 | 53.2% | 91 | 0 | 0 | 55.7% | -2.6 |
| 6 | 5 | 11147 | 9920 | 52.9% | 99 | 0 | 0 | 54.9% | -1.9 |
| 7 | 6 | 10234 | 9365 | 52.2% | 101 | 2 | 1 | 48.4% | +3.8 |
| 8 | 9 | 2256 | 2812 | 44.5% | 1 | 0 | 0 | 53.6% | -9.1 |
| 9 | 6 | 10752 | 7646 | 58.4% | 94 | 0 | 0 | 58.4% | +0.0 |
| 10 | 6 | 10843 | 8393 | 56.4% | 118 | 0 | 0 | 51.3% | +5.1 |

Battles used against catcat20.Lambda 0.024: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 54.1% ± 3.4, baseline 55.8% ± 3.4, paired diff -1.7 ± 4.4.

Skipped turns: 913 over 10 battles (91.3 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 883 over 10 battles (88.3 per battle, most in one battle 298).

