# wompi.Wallaby 5.1 in melee (A): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | wompi.Wallaby 5.1 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 3 | 11452 | 9229 | 55.4% | 11 | 1 | 0 | 54.0% | +1.4 |
| 2 | 3 | 12113 | 6693 | 64.4% | 96 | 0 | 0 | 54.1% | +10.3 |
| 3 | 5 | 11000 | 8001 | 57.9% | 8 | 1 | 0 | 56.8% | +1.1 |
| 4 | 6 | 10207 | 9070 | 52.9% | 88 | 0 | 0 | 52.8% | +0.1 |
| 5 | 8 | 9593 | 6903 | 58.2% | 100 | 0 | 0 | 58.9% | -0.8 |
| 6 | 8 | 9275 | 7020 | 56.9% | 86 | 0 | 0 | 54.8% | +2.1 |
| 7 | 3 | 11710 | 8080 | 59.2% | 96 | 1 | 1 | 60.9% | -1.7 |
| 8 | 4 | 11471 | 8262 | 58.1% | 94 | 0 | 0 | 53.5% | +4.6 |
| 9 | 5 | 10694 | 8521 | 55.7% | 92 | 1 | 1 | 58.9% | -3.2 |
| 10 | 4 | 11425 | 8671 | 56.9% | 94 | 0 | 0 | 64.4% | -7.6 |

Battles used against wompi.Wallaby 5.1: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 57.6% ± 2.1, baseline 56.9% ± 2.7, paired diff +0.6 ± 3.4.

Skipped turns: 765 over 10 battles (76.5 per battle, most in one battle 100). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 388 over 10 battles (38.8 per battle, most in one battle 298).

