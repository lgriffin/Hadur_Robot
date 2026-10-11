# abc.Shadow 3.84i in melee (C): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | abc.Shadow 3.84i score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 4 | 11610 | 12885 | 47.4% | 90 | 3 | 2 | 64.3% | -16.9 |
| 2 | 4 | 11547 | 12240 | 48.5% | 93 | 1 | 0 | 45.4% | +3.1 |
| 3 | 3 | 11524 | 10998 | 51.2% | 97 | 0 | 0 | 46.0% | +5.2 |
| 4 | 3 | 12745 | 12435 | 50.6% | 103 | 1 | 0 | 49.2% | +1.5 |
| 5 | 6 | 10273 | 10370 | 49.8% | 97 | 1 | 0 | 45.9% | +3.9 |
| 6 | 7 | 10589 | 13112 | 44.7% | 9 | 2 | 0 | 41.0% | +3.7 |
| 7 | 6 | 9901 | 14040 | 41.4% | 7 | 1 | 0 | 50.0% | -8.6 |
| 8 | 5 | 11049 | 13669 | 44.7% | 90 | 0 | 0 | 48.1% | -3.4 |
| 9 | 5 | 11754 | 14022 | 45.6% | 97 | 4 | 3 | 45.9% | -0.3 |
| 10 | 5 | 10682 | 12320 | 46.4% | 91 | 1 | 1 | 41.4% | +5.0 |

Battles used against abc.Shadow 3.84i: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 47.0% ± 2.2, baseline 47.7% ± 4.7, paired diff -0.7 ± 5.1.

Skipped turns: 774 over 10 battles (77.4 per battle, most in one battle 103). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1457 over 10 battles (145.7 per battle, most in one battle 516).

