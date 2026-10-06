# stelo.PastFuture 2.3.2 in melee (A): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | stelo.PastFuture 2.3.2 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 4 | 10336 | 7200 | 58.9% | 97 | 0 | 0 | 60.8% | -1.8 |
| 2 | 5 | 10257 | 9253 | 52.6% | 9 | 0 | 0 | 60.3% | -7.8 |
| 3 | 4 | 10985 | 6869 | 61.5% | 111 | 0 | 0 | 66.2% | -4.7 |
| 4 | 3 | 11979 | 6498 | 64.8% | 106 | 1 | 1 | 63.1% | +1.7 |
| 5 | 8 | 9647 | 6761 | 58.8% | 6 | 1 | 0 | 61.2% | -2.4 |
| 6 | 3 | 11801 | 6170 | 65.7% | 96 | 0 | 0 | 63.2% | +2.4 |
| 7 | 4 | 11578 | 10310 | 52.9% | 9 | 1 | 0 | 63.3% | -10.4 |
| 8 | 5 | 11440 | 6932 | 62.3% | 94 | 0 | 0 | 64.4% | -2.1 |
| 9 | 7 | 9621 | 5540 | 63.5% | 13 | 0 | 0 | 67.8% | -4.4 |
| 10 | 3 | 12700 | 7682 | 62.3% | 96 | 0 | 0 | 65.1% | -2.8 |

Mean pairwise share 60.3% ± 3.3, baseline 63.6% ± 1.7, paired diff -3.2 ± 2.8.

Skipped turns: 637 over 10 battles (63.7 per battle, most in one battle 111). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 2116 over 10 battles (211.6 per battle, most in one battle 405).

