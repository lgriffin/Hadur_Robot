# wompi.Numbat 2.1 in melee (C): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | wompi.Numbat 2.1 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11164 | 10937 | 50.5% | 93 | 1 | 0 | 41.5% | +9.0 |
| 2 | 5 | 10932 | 10669 | 50.6% | 12 | 2 | 1 | 56.0% | -5.4 |
| 3 | 6 | 11708 | 10501 | 52.7% | 92 | 0 | 0 | 51.7% | +1.0 |
| 4 | 4 | 12744 | 12246 | 51.0% | 92 | 1 | 1 | 54.4% | -3.4 |
| 5 | 7 | 9089 | 12805 | 41.5% | 5 | 0 | 0 | 49.9% | -8.4 |
| 6 | 5 | 6979 | 7908 | 46.9% | 96 | 2 | 1 | 51.7% | -4.9 |
| 7 | 2 | 7783 | 6325 | 55.2% | 94 | 0 | 0 | 49.5% | +5.7 |
| 8 | 6 | 11354 | 11416 | 49.9% | 94 | 0 | 0 | 57.1% | -7.2 |
| 9 | 4 | 11358 | 10131 | 52.9% | 97 | 0 | 0 | 52.9% | -0.1 |
| 10 | 7 | 7622 | 8990 | 45.9% | 6 | 1 | 0 | 53.7% | -7.8 |

Battles used against wompi.Numbat 2.1: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 49.7% ± 2.8, baseline 51.8% ± 3.1, paired diff -2.1 ± 4.2.

Skipped turns: 681 over 10 battles (68.1 per battle, most in one battle 97). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 487 over 10 battles (48.7 per battle, most in one battle 298).

