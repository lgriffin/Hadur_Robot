# wompi.Wallaby 5.1 in melee (C): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | wompi.Wallaby 5.1 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 4 | 11610 | 9738 | 54.4% | 90 | 0 | 0 | 53.6% | +0.8 |
| 2 | 4 | 11547 | 9371 | 55.2% | 93 | 0 | 0 | 50.8% | +4.4 |
| 3 | 3 | 11524 | 7693 | 60.0% | 97 | 0 | 0 | 49.7% | +10.2 |
| 4 | 3 | 12745 | 10393 | 55.1% | 103 | 4 | 3 | 50.7% | +4.4 |
| 5 | 6 | 10273 | 8152 | 55.8% | 97 | 0 | 0 | 51.4% | +4.4 |
| 6 | 7 | 10589 | 9958 | 51.5% | 9 | 0 | 0 | 50.8% | +0.7 |
| 7 | 6 | 9901 | 8276 | 54.5% | 7 | 0 | 0 | 55.0% | -0.5 |
| 8 | 5 | 11049 | 9875 | 52.8% | 90 | 0 | 0 | 55.0% | -2.2 |
| 9 | 5 | 11754 | 10667 | 52.4% | 97 | 1 | 0 | 58.1% | -5.6 |
| 10 | 5 | 10682 | 8929 | 54.5% | 91 | 0 | 0 | 51.0% | +3.4 |

Battles used against wompi.Wallaby 5.1: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 54.6% ± 1.7, baseline 52.6% ± 1.9, paired diff +2.0 ± 3.1.

Skipped turns: 774 over 10 battles (77.4 per battle, most in one battle 103). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1457 over 10 battles (145.7 per battle, most in one battle 516).

