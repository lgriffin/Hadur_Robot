# positive.Portia 1.26e in melee (D): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | positive.Portia 1.26e score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 3 | 12139 | 10970 | 52.5% | 114 | 1 | 0 | 49.3% | +3.3 |
| 2 | 5 | 11040 | 9486 | 53.8% | 103 | 0 | 0 | 57.3% | -3.5 |
| 3 | 6 | 11176 | 11537 | 49.2% | 103 | 0 | 0 | 56.2% | -7.0 |
| 4 | 5 | 11569 | 11911 | 49.3% | 99 | 2 | 1 | 53.7% | -4.4 |
| 5 | 3 | 12478 | 11843 | 51.3% | 93 | 2 | 0 | 48.8% | +2.5 |
| 6 | 7 | 10019 | 10858 | 48.0% | 91 | 0 | 0 | 50.3% | -2.3 |
| 7 | 3 | 12190 | 11568 | 51.3% | 115 | 1 | 0 | 48.0% | +3.3 |
| 8 | 4 | 11153 | 13820 | 44.7% | 102 | 0 | 0 | 51.4% | -6.7 |
| 9 | 7 | 10591 | 11817 | 47.3% | 9 | 1 | 0 | 50.4% | -3.2 |
| 10 | 2 | 12720 | 11980 | 51.5% | 91 | 1 | 1 | 47.6% | +3.9 |

Battles used against positive.Portia 1.26e: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 49.9% ± 2.0, baseline 51.3% ± 2.4, paired diff -1.4 ± 3.1.

Skipped turns: 920 over 10 battles (92.0 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1554 over 10 battles (155.4 per battle, most in one battle 298).

