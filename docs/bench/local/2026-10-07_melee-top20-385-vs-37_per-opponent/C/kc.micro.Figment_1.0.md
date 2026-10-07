# kc.micro.Figment 1.0 in melee (C): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | kc.micro.Figment 1.0 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 4 | 11610 | 6994 | 62.4% | 90 | 0 | 0 | 61.6% | +0.8 |
| 2 | 4 | 11547 | 6931 | 62.5% | 93 | 0 | 0 | 65.3% | -2.8 |
| 3 | 3 | 11524 | 8623 | 57.2% | 97 | 0 | 0 | 58.6% | -1.4 |
| 4 | 3 | 12745 | 6821 | 65.1% | 103 | 1 | 1 | 65.4% | -0.3 |
| 5 | 6 | 10273 | 5648 | 64.5% | 97 | 0 | 0 | 62.9% | +1.7 |
| 6 | 7 | 10589 | 8196 | 56.4% | 9 | 0 | 0 | 57.2% | -0.8 |
| 7 | 6 | 9901 | 5684 | 63.5% | 7 | 0 | 0 | 59.4% | +4.1 |
| 8 | 5 | 11049 | 6864 | 61.7% | 90 | 1 | 1 | 64.5% | -2.9 |
| 9 | 5 | 11754 | 5985 | 66.3% | 97 | 0 | 0 | 65.2% | +1.0 |
| 10 | 5 | 10682 | 8198 | 56.6% | 91 | 0 | 0 | 51.8% | +4.8 |

Battles used against kc.micro.Figment 1.0: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 61.6% ± 2.6, baseline 61.2% ± 3.2, paired diff +0.4 ± 1.9.

Skipped turns: 774 over 10 battles (77.4 per battle, most in one battle 103). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1457 over 10 battles (145.7 per battle, most in one battle 516).

