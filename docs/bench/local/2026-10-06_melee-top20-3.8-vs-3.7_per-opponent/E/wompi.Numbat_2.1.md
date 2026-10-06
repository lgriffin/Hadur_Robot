# wompi.Numbat 2.1 in melee (E): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | wompi.Numbat 2.1 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 590 | 555 | 51.5% | 0 | 0 | 0 | 49.9% | +1.6 |
| 2 | 5 | 10280 | 9582 | 51.8% | 113 | 2 | 1 | 48.2% | +3.5 |
| 3 | 8 | 9280 | 8801 | 51.3% | 87 | 0 | 0 | 51.1% | +0.3 |
| 4 | 7 | 10169 | 8406 | 54.7% | 92 | 0 | 0 | 52.3% | +2.4 |
| 5 | 7 | 9056 | 8712 | 51.0% | 6 | 0 | 0 | 53.6% | -2.6 |
| 6 | 4 | 12174 | 8898 | 57.8% | 99 | 0 | 0 | 50.6% | +7.2 |
| 7 | 3 | 11313 | 8838 | 56.1% | 106 | 1 | 1 | 52.3% | +3.9 |
| 8 | 6 | 9832 | 9488 | 50.9% | 6 | 0 | 0 | 55.3% | -4.4 |
| 9 | 6 | 10022 | 8643 | 53.7% | 101 | 1 | 1 | 53.2% | +0.5 |
| 10 | 7 | 7644 | 7076 | 51.9% | 103 | 1 | 1 | 54.8% | -2.9 |

Mean pairwise share 53.1% ± 1.7, baseline 52.1% ± 1.6, paired diff +0.9 ± 2.5.

Skipped turns: 713 over 10 battles (71.3 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 324 over 10 battles (32.4 per battle, most in one battle 175).

