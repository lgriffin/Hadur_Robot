# wompi.Numbat 2.1 in melee (E): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | wompi.Numbat 2.1 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11536 | 7381 | 61.0% | 104 | 1 | 1 | 52.3% | +8.7 |
| 2 | 8 | 9692 | 10514 | 48.0% | 4 | 1 | 0 | 56.5% | -8.5 |
| 3 | 5 | 10664 | 9195 | 53.7% | 96 | 0 | 0 | 49.0% | +4.7 |
| 4 | 7 | 9625 | 9491 | 50.4% | 95 | 1 | 1 | 45.2% | +5.1 |
| 5 | 6 | 4944 | 4862 | 50.4% | 5 | 1 | 0 | 55.2% | -4.7 |
| 6 | 9 | 3850 | 4366 | 46.9% | 2 | 0 | 0 | 52.7% | -5.8 |
| 7 | 5 | 10668 | 9349 | 53.3% | 6 | 0 | 0 | 54.7% | -1.4 |
| 8 | 4 | 11605 | 9447 | 55.1% | 99 | 0 | 0 | 50.0% | +5.1 |
| 9 | 6 | 10936 | 11812 | 48.1% | 89 | 0 | 0 | 47.5% | +0.5 |
| 10 | 2 | 2288 | 1076 | 68.0% | 4 | 0 | 0 | 44.7% | +23.3 |

Battles used against wompi.Numbat 2.1: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 53.5% ± 4.7, baseline 50.8% ± 3.0, paired diff +2.7 ± 6.5.

Skipped turns: 504 over 10 battles (50.4 per battle, most in one battle 104). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 383 over 10 battles (38.3 per battle, most in one battle 143).

