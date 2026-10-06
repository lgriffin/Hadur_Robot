# wompi.Wallaby 5.1 in melee (A): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | wompi.Wallaby 5.1 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 4 | 10336 | 8581 | 54.6% | 97 | 0 | 0 | 60.6% | -5.9 |
| 2 | 5 | 10257 | 8407 | 55.0% | 9 | 0 | 0 | 57.4% | -2.5 |
| 3 | 4 | 10985 | 10828 | 50.4% | 111 | 1 | 0 | 55.0% | -4.6 |
| 4 | 3 | 11979 | 7305 | 62.1% | 106 | 1 | 1 | 59.5% | +2.6 |
| 5 | 8 | 9647 | 9105 | 51.4% | 6 | 1 | 0 | 57.2% | -5.8 |
| 6 | 3 | 11801 | 9726 | 54.8% | 96 | 0 | 0 | 59.5% | -4.6 |
| 7 | 4 | 11578 | 8509 | 57.6% | 9 | 0 | 0 | 53.4% | +4.3 |
| 8 | 5 | 11440 | 8582 | 57.1% | 94 | 0 | 0 | 50.8% | +6.4 |
| 9 | 7 | 9621 | 8718 | 52.5% | 13 | 1 | 0 | 58.7% | -6.2 |
| 10 | 3 | 12700 | 10405 | 55.0% | 96 | 0 | 0 | 55.5% | -0.5 |

Mean pairwise share 55.1% ± 2.4, baseline 56.7% ± 2.2, paired diff -1.7 ± 3.3.

Skipped turns: 637 over 10 battles (63.7 per battle, most in one battle 111). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 2116 over 10 battles (211.6 per battle, most in one battle 405).

