# ags.Glacier 0.2.11 in melee (C): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | ags.Glacier 0.2.11 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 4 | 11610 | 10157 | 53.3% | 90 | 0 | 0 | 51.7% | +1.6 |
| 2 | 4 | 11547 | 10857 | 51.5% | 93 | 0 | 0 | 45.4% | +6.1 |
| 3 | 3 | 11524 | 11348 | 50.4% | 97 | 0 | 0 | 46.8% | +3.6 |
| 4 | 3 | 12745 | 11491 | 52.6% | 103 | 2 | 1 | 58.4% | -5.8 |
| 5 | 6 | 10273 | 9965 | 50.8% | 97 | 0 | 0 | 46.3% | +4.5 |
| 6 | 7 | 10589 | 12954 | 45.0% | 9 | 0 | 0 | 44.4% | +0.6 |
| 7 | 6 | 9901 | 13464 | 42.4% | 7 | 0 | 0 | 51.7% | -9.3 |
| 8 | 5 | 11049 | 12946 | 46.0% | 90 | 0 | 0 | 50.3% | -4.2 |
| 9 | 5 | 11754 | 11015 | 51.6% | 97 | 0 | 0 | 56.9% | -5.3 |
| 10 | 5 | 10682 | 11653 | 47.8% | 91 | 0 | 0 | 47.1% | +0.7 |

Battles used against ags.Glacier 0.2.11: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 49.1% ± 2.6, baseline 49.9% ± 3.4, paired diff -0.8 ± 3.7.

Skipped turns: 774 over 10 battles (77.4 per battle, most in one battle 103). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1457 over 10 battles (145.7 per battle, most in one battle 516).

