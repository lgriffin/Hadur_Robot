# mn.Combat 3.25.0 in melee (E): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | mn.Combat 3.25.0 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 590 | 553 | 51.6% | 0 | 0 | 0 | 44.0% | +7.6 |
| 2 | 5 | 10280 | 9845 | 51.1% | 113 | 0 | 0 | 48.1% | +3.0 |
| 3 | 8 | 9280 | 11690 | 44.3% | 87 | 1 | 1 | 49.8% | -5.5 |
| 4 | 7 | 10169 | 10683 | 48.8% | 92 | 0 | 0 | 52.6% | -3.8 |
| 5 | 7 | 9056 | 10433 | 46.5% | 6 | 0 | 0 | 44.8% | +1.6 |
| 6 | 4 | 12174 | 10208 | 54.4% | 99 | 0 | 0 | 45.4% | +9.0 |
| 7 | 3 | 11313 | 9799 | 53.6% | 106 | 1 | 0 | 49.9% | +3.7 |
| 8 | 6 | 9832 | 9478 | 50.9% | 6 | 0 | 0 | 49.8% | +1.1 |
| 9 | 6 | 10022 | 9670 | 50.9% | 101 | 0 | 0 | 49.9% | +1.0 |
| 10 | 7 | 7644 | 9544 | 44.5% | 103 | 0 | 0 | 49.8% | -5.4 |

Mean pairwise share 49.6% ± 2.5, baseline 48.4% ± 2.0, paired diff +1.2 ± 3.6.

Skipped turns: 713 over 10 battles (71.3 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 324 over 10 battles (32.4 per battle, most in one battle 175).

