# catcat20.Lambda 0.024 in melee (C): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | catcat20.Lambda 0.024 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 4 | 11610 | 7460 | 60.9% | 90 | 1 | 1 | 44.2% | +16.6 |
| 2 | 4 | 11547 | 8493 | 57.6% | 93 | 0 | 0 | 53.0% | +4.6 |
| 3 | 3 | 11524 | 8994 | 56.2% | 97 | 1 | 0 | 48.0% | +8.2 |
| 4 | 3 | 12745 | 9539 | 57.2% | 103 | 1 | 0 | 60.4% | -3.2 |
| 5 | 6 | 10273 | 8031 | 56.1% | 97 | 0 | 0 | 56.2% | -0.1 |
| 6 | 7 | 10589 | 6756 | 61.0% | 9 | 1 | 0 | 61.2% | -0.1 |
| 7 | 6 | 9901 | 9272 | 51.6% | 7 | 1 | 0 | 65.8% | -14.2 |
| 8 | 5 | 11049 | 8134 | 57.6% | 90 | 0 | 0 | 58.7% | -1.1 |
| 9 | 5 | 11754 | 7172 | 62.1% | 97 | 0 | 0 | 60.1% | +2.0 |
| 10 | 5 | 10682 | 8668 | 55.2% | 91 | 0 | 0 | 47.4% | +7.9 |

Battles used against catcat20.Lambda 0.024: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 57.6% ± 2.2, baseline 55.5% ± 5.1, paired diff +2.1 ± 5.9.

Skipped turns: 774 over 10 battles (77.4 per battle, most in one battle 103). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1457 over 10 battles (145.7 per battle, most in one battle 516).

