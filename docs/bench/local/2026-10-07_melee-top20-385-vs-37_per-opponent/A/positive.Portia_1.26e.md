# positive.Portia 1.26e in melee (A): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | positive.Portia 1.26e score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 3 | 11452 | 9601 | 54.4% | 11 | 0 | 0 | 43.2% | +11.2 |
| 2 | 3 | 12113 | 10685 | 53.1% | 96 | 0 | 0 | 53.7% | -0.6 |
| 3 | 5 | 11000 | 10905 | 50.2% | 8 | 0 | 0 | 52.1% | -1.9 |
| 4 | 6 | 10207 | 9424 | 52.0% | 88 | 0 | 0 | 55.0% | -3.0 |
| 5 | 8 | 9593 | 10037 | 48.9% | 100 | 0 | 0 | 51.9% | -3.0 |
| 6 | 8 | 9275 | 10827 | 46.1% | 86 | 0 | 0 | 50.2% | -4.0 |
| 7 | 3 | 11710 | 8977 | 56.6% | 96 | 0 | 0 | 53.7% | +2.9 |
| 8 | 4 | 11471 | 10709 | 51.7% | 94 | 0 | 0 | 48.4% | +3.3 |
| 9 | 5 | 10694 | 9074 | 54.1% | 92 | 0 | 0 | 50.5% | +3.6 |
| 10 | 4 | 11425 | 12933 | 46.9% | 94 | 2 | 0 | 53.6% | -6.7 |

Battles used against positive.Portia 1.26e: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 51.4% ± 2.4, baseline 51.2% ± 2.5, paired diff +0.2 ± 3.7.

Skipped turns: 765 over 10 battles (76.5 per battle, most in one battle 100). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 388 over 10 battles (38.8 per battle, most in one battle 298).

