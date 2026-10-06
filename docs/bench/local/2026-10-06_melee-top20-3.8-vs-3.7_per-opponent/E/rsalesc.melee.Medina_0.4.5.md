# rsalesc.melee.Medina 0.4.5 in melee (E): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | rsalesc.melee.Medina 0.4.5 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 590 | 570 | 50.9% | 0 | 0 | 0 | 58.5% | -7.6 |
| 2 | 5 | 10280 | 7540 | 57.7% | 113 | 0 | 0 | 57.8% | -0.1 |
| 3 | 8 | 9280 | 9311 | 49.9% | 87 | 0 | 0 | 53.7% | -3.7 |
| 4 | 7 | 10169 | 7555 | 57.4% | 92 | 1 | 0 | 51.3% | +6.0 |
| 5 | 7 | 9056 | 7076 | 56.1% | 6 | 0 | 0 | 55.7% | +0.4 |
| 6 | 4 | 12174 | 7821 | 60.9% | 99 | 0 | 0 | 54.7% | +6.2 |
| 7 | 3 | 11313 | 10650 | 51.5% | 106 | 0 | 0 | 59.1% | -7.6 |
| 8 | 6 | 9832 | 8643 | 53.2% | 6 | 0 | 0 | 59.4% | -6.2 |
| 9 | 6 | 10022 | 8428 | 54.3% | 101 | 0 | 0 | 54.8% | -0.5 |
| 10 | 7 | 7644 | 7278 | 51.2% | 103 | 1 | 0 | 58.8% | -7.5 |

Mean pairwise share 54.3% ± 2.6, baseline 56.4% ± 2.0, paired diff -2.1 ± 3.8.

Skipped turns: 713 over 10 battles (71.3 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 324 over 10 battles (32.4 per battle, most in one battle 175).

