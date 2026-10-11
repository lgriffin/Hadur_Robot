# rz.Aleph 0.34 in melee (E): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | rz.Aleph 0.34 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 590 | 296 | 66.6% | 0 | 0 | 0 | 48.7% | +17.9 |
| 2 | 5 | 10280 | 9880 | 51.0% | 113 | 1 | 0 | 42.2% | +8.8 |
| 3 | 8 | 9280 | 11800 | 44.0% | 87 | 0 | 0 | 51.8% | -7.8 |
| 4 | 7 | 10169 | 11424 | 47.1% | 92 | 1 | 0 | 47.9% | -0.8 |
| 5 | 7 | 9056 | 11490 | 44.1% | 6 | 2 | 0 | 47.9% | -3.8 |
| 6 | 4 | 12174 | 8965 | 57.6% | 99 | 0 | 0 | 55.1% | +2.5 |
| 7 | 3 | 11313 | 8041 | 58.5% | 106 | 0 | 0 | 52.3% | +6.2 |
| 8 | 6 | 9832 | 10765 | 47.7% | 6 | 0 | 0 | 48.4% | -0.7 |
| 9 | 6 | 10022 | 10995 | 47.7% | 101 | 0 | 0 | 53.3% | -5.6 |
| 10 | 7 | 7644 | 8864 | 46.3% | 103 | 0 | 0 | 58.7% | -12.4 |

Mean pairwise share 51.1% ± 5.3, baseline 50.6% ± 3.3, paired diff +0.4 ± 6.3.

Skipped turns: 713 over 10 battles (71.3 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 324 over 10 battles (32.4 per battle, most in one battle 175).

