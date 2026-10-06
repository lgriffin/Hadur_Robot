# justin.DemonicRage 3.4 in melee (E): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | justin.DemonicRage 3.4 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 590 | 728 | 44.8% | 0 | 0 | 0 | 42.2% | +2.5 |
| 2 | 5 | 10280 | 9916 | 50.9% | 113 | 0 | 0 | 39.4% | +11.5 |
| 3 | 8 | 9280 | 12538 | 42.5% | 87 | 1 | 0 | 48.9% | -6.4 |
| 4 | 7 | 10169 | 12231 | 45.4% | 92 | 0 | 0 | 44.2% | +1.2 |
| 5 | 7 | 9056 | 12166 | 42.7% | 6 | 0 | 0 | 44.0% | -1.3 |
| 6 | 4 | 12174 | 12971 | 48.4% | 99 | 2 | 1 | 44.4% | +4.0 |
| 7 | 3 | 11313 | 10190 | 52.6% | 106 | 1 | 0 | 46.7% | +5.9 |
| 8 | 6 | 9832 | 13087 | 42.9% | 6 | 1 | 0 | 49.6% | -6.7 |
| 9 | 6 | 10022 | 10220 | 49.5% | 101 | 0 | 0 | 47.4% | +2.1 |
| 10 | 7 | 7644 | 9099 | 45.7% | 103 | 0 | 0 | 47.9% | -2.2 |

Mean pairwise share 46.5% ± 2.6, baseline 45.5% ± 2.3, paired diff +1.1 ± 4.0.

Skipped turns: 713 over 10 battles (71.3 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 324 over 10 battles (32.4 per battle, most in one battle 175).

