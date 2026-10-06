# voidious.Diamond 1.8.28 in melee (E): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | voidious.Diamond 1.8.28 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 590 | 654 | 47.4% | 0 | 0 | 0 | 54.0% | -6.6 |
| 2 | 5 | 10280 | 13293 | 43.6% | 113 | 1 | 0 | 42.8% | +0.8 |
| 3 | 8 | 9280 | 10450 | 47.0% | 87 | 0 | 0 | 48.2% | -1.2 |
| 4 | 7 | 10169 | 10574 | 49.0% | 92 | 0 | 0 | 46.6% | +2.4 |
| 5 | 7 | 9056 | 13062 | 40.9% | 6 | 0 | 0 | 48.4% | -7.4 |
| 6 | 4 | 12174 | 9842 | 55.3% | 99 | 1 | 0 | 47.3% | +8.0 |
| 7 | 3 | 11313 | 10606 | 51.6% | 106 | 0 | 0 | 50.8% | +0.8 |
| 8 | 6 | 9832 | 11423 | 46.3% | 6 | 0 | 0 | 44.6% | +1.7 |
| 9 | 6 | 10022 | 12650 | 44.2% | 101 | 1 | 0 | 47.6% | -3.4 |
| 10 | 7 | 7644 | 9217 | 45.3% | 103 | 0 | 0 | 56.0% | -10.6 |

Mean pairwise share 47.1% ± 3.0, baseline 48.6% ± 2.9, paired diff -1.6 ± 3.9.

Skipped turns: 713 over 10 battles (71.3 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 324 over 10 battles (32.4 per battle, most in one battle 175).

