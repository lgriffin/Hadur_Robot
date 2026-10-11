# jk.melee.Neuromancer 7.12 in melee (E): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | jk.melee.Neuromancer 7.12 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 590 | 612 | 49.1% | 0 | 0 | 0 | 50.3% | -1.2 |
| 2 | 5 | 10280 | 12626 | 44.9% | 113 | 0 | 0 | 51.2% | -6.3 |
| 3 | 8 | 9280 | 13060 | 41.5% | 87 | 0 | 0 | 46.3% | -4.8 |
| 4 | 7 | 10169 | 15126 | 40.2% | 92 | 2 | 1 | 46.6% | -6.4 |
| 5 | 7 | 9056 | 12275 | 42.5% | 6 | 0 | 0 | 41.0% | +1.4 |
| 6 | 4 | 12174 | 12634 | 49.1% | 99 | 3 | 0 | 40.7% | +8.4 |
| 7 | 3 | 11313 | 12026 | 48.5% | 106 | 2 | 0 | 46.7% | +1.8 |
| 8 | 6 | 9832 | 12350 | 44.3% | 6 | 1 | 0 | 49.8% | -5.5 |
| 9 | 6 | 10022 | 13786 | 42.1% | 101 | 0 | 0 | 43.6% | -1.5 |
| 10 | 7 | 7644 | 9986 | 43.4% | 103 | 0 | 0 | 46.4% | -3.0 |

Mean pairwise share 44.5% ± 2.3, baseline 46.3% ± 2.6, paired diff -1.7 ± 3.3.

Skipped turns: 713 over 10 battles (71.3 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 324 over 10 battles (32.4 per battle, most in one battle 175).

