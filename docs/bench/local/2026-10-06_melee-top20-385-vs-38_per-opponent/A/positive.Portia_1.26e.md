# positive.Portia 1.26e in melee (A): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | positive.Portia 1.26e score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11214 | 9689 | 53.6% | 98 | 1 | 0 | 46.5% | +7.2 |
| 2 | 5 | 10672 | 13216 | 44.7% | 94 | 2 | 1 | 46.7% | -2.0 |
| 3 | 3 | 11855 | 11778 | 50.2% | 93 | 0 | 0 | 50.8% | -0.6 |
| 4 | 6 | 10012 | 11157 | 47.3% | 5 | 1 | 0 | 49.6% | -2.3 |
| 5 | 4 | 11607 | 13686 | 45.9% | 106 | 1 | 1 | 52.2% | -6.3 |
| 6 | 3 | 12383 | 9640 | 56.2% | 89 | 1 | 0 | 46.4% | +9.8 |
| 7 | 3 | 11162 | 9406 | 54.3% | 97 | 0 | 0 | 58.7% | -4.4 |
| 8 | 7 | 10147 | 10875 | 48.3% | 94 | 0 | 0 | 50.7% | -2.5 |
| 9 | 3 | 11760 | 10423 | 53.0% | 91 | 1 | 1 | 52.4% | +0.6 |
| 10 | 9 | 9269 | 11163 | 45.4% | 90 | 0 | 0 | 54.2% | -8.8 |

Battles used against positive.Portia 1.26e: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 49.9% ± 3.0, baseline 50.8% ± 2.8, paired diff -0.9 ± 4.1.

Skipped turns: 857 over 10 battles (85.7 per battle, most in one battle 106). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1075 over 10 battles (107.5 per battle, most in one battle 298).

