# rsalesc.melee.Medina 0.4.5 in melee (A): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | rsalesc.melee.Medina 0.4.5 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11214 | 9400 | 54.4% | 98 | 1 | 1 | 55.4% | -1.0 |
| 2 | 5 | 10672 | 9793 | 52.1% | 94 | 1 | 1 | 49.1% | +3.0 |
| 3 | 3 | 11855 | 9419 | 55.7% | 93 | 0 | 0 | 55.9% | -0.2 |
| 4 | 6 | 10012 | 10347 | 49.2% | 5 | 0 | 0 | 56.2% | -7.0 |
| 5 | 4 | 11607 | 8991 | 56.4% | 106 | 1 | 0 | 55.7% | +0.7 |
| 6 | 3 | 12383 | 10052 | 55.2% | 89 | 2 | 2 | 54.4% | +0.8 |
| 7 | 3 | 11162 | 8850 | 55.8% | 97 | 1 | 0 | 52.9% | +2.9 |
| 8 | 7 | 10147 | 10302 | 49.6% | 94 | 1 | 0 | 50.4% | -0.7 |
| 9 | 3 | 11760 | 8536 | 57.9% | 91 | 0 | 0 | 58.3% | -0.3 |
| 10 | 9 | 9269 | 10290 | 47.4% | 90 | 1 | 0 | 53.0% | -5.6 |

Battles used against rsalesc.melee.Medina 0.4.5: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 53.4% ± 2.6, baseline 54.1% ± 2.0, paired diff -0.7 ± 2.3.

Skipped turns: 857 over 10 battles (85.7 per battle, most in one battle 106). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1075 over 10 battles (107.5 per battle, most in one battle 298).

