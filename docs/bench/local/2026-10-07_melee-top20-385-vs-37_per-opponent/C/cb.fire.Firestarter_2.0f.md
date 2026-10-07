# cb.fire.Firestarter 2.0f in melee (C): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | cb.fire.Firestarter 2.0f score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 4 | 11610 | 16617 | 41.1% | 90 | 0 | 0 | 50.4% | -9.3 |
| 2 | 4 | 11547 | 15086 | 43.4% | 93 | 2 | 0 | 42.0% | +1.3 |
| 3 | 3 | 11524 | 15495 | 42.7% | 97 | 3 | 0 | 46.7% | -4.0 |
| 4 | 3 | 12745 | 13044 | 49.4% | 103 | 2 | 1 | 46.2% | +3.2 |
| 5 | 6 | 10273 | 13081 | 44.0% | 97 | 2 | 0 | 49.8% | -5.8 |
| 6 | 7 | 10589 | 14138 | 42.8% | 9 | 2 | 0 | 42.9% | -0.0 |
| 7 | 6 | 9901 | 16073 | 38.1% | 7 | 3 | 0 | 45.9% | -7.8 |
| 8 | 5 | 11049 | 13905 | 44.3% | 90 | 2 | 0 | 38.4% | +5.9 |
| 9 | 5 | 11754 | 13500 | 46.5% | 97 | 1 | 0 | 53.3% | -6.8 |
| 10 | 5 | 10682 | 13489 | 44.2% | 91 | 1 | 0 | 35.8% | +8.4 |

Battles used against cb.fire.Firestarter 2.0f: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 43.7% ± 2.1, baseline 45.1% ± 3.9, paired diff -1.5 ± 4.4.

Skipped turns: 774 over 10 battles (77.4 per battle, most in one battle 103). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1457 over 10 battles (145.7 per battle, most in one battle 516).

