# wompi.Numbat 2.1 in melee (C): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | wompi.Numbat 2.1 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 4 | 11610 | 10253 | 53.1% | 90 | 2 | 1 | 45.6% | +7.5 |
| 2 | 4 | 11547 | 9709 | 54.3% | 93 | 0 | 0 | 47.7% | +6.6 |
| 3 | 3 | 11524 | 10827 | 51.6% | 97 | 1 | 0 | 47.3% | +4.2 |
| 4 | 3 | 12745 | 11408 | 52.8% | 103 | 0 | 0 | 54.2% | -1.4 |
| 5 | 6 | 10273 | 11087 | 48.1% | 97 | 1 | 1 | 50.6% | -2.5 |
| 6 | 7 | 10589 | 11513 | 47.9% | 9 | 1 | 0 | 46.2% | +1.7 |
| 7 | 6 | 9901 | 9760 | 50.4% | 7 | 0 | 0 | 48.4% | +2.0 |
| 8 | 5 | 11049 | 10044 | 52.4% | 90 | 1 | 0 | 51.1% | +1.2 |
| 9 | 5 | 11754 | 12065 | 49.3% | 97 | 2 | 1 | 55.2% | -5.9 |
| 10 | 5 | 10682 | 10421 | 50.6% | 91 | 1 | 0 | 43.8% | +6.8 |

Battles used against wompi.Numbat 2.1: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 51.0% ± 1.5, baseline 49.0% ± 2.7, paired diff +2.0 ± 3.1.

Skipped turns: 774 over 10 battles (77.4 per battle, most in one battle 103). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1457 over 10 battles (145.7 per battle, most in one battle 516).

