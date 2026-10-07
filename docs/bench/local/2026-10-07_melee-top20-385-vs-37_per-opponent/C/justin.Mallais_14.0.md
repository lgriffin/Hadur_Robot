# justin.Mallais 14.0 in melee (C): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | justin.Mallais 14.0 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 4 | 11610 | 9798 | 54.2% | 90 | 0 | 0 | 58.5% | -4.2 |
| 2 | 4 | 11547 | 11232 | 50.7% | 93 | 2 | 1 | 49.4% | +1.3 |
| 3 | 3 | 11524 | 10261 | 52.9% | 97 | 2 | 1 | 49.7% | +3.2 |
| 4 | 3 | 12745 | 8092 | 61.2% | 103 | 0 | 0 | 54.3% | +6.9 |
| 5 | 6 | 10273 | 11113 | 48.0% | 97 | 0 | 0 | 49.9% | -1.8 |
| 6 | 7 | 10589 | 10659 | 49.8% | 9 | 0 | 0 | 49.0% | +0.8 |
| 7 | 6 | 9901 | 10386 | 48.8% | 7 | 0 | 0 | 54.6% | -5.8 |
| 8 | 5 | 11049 | 9035 | 55.0% | 90 | 0 | 0 | 51.9% | +3.2 |
| 9 | 5 | 11754 | 9235 | 56.0% | 97 | 1 | 0 | 52.1% | +3.9 |
| 10 | 5 | 10682 | 10558 | 50.3% | 91 | 0 | 0 | 45.9% | +4.4 |

Battles used against justin.Mallais 14.0: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 52.7% ± 2.9, baseline 51.5% ± 2.5, paired diff +1.2 ± 2.9.

Skipped turns: 774 over 10 battles (77.4 per battle, most in one battle 103). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1457 over 10 battles (145.7 per battle, most in one battle 516).

