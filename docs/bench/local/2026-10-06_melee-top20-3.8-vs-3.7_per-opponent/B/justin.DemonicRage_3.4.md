# justin.DemonicRage 3.4 in melee (B): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | justin.DemonicRage 3.4 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10956 | 12740 | 46.2% | 124 | 2 | 1 | 45.3% | +0.9 |
| 2 | 5 | 10429 | 10200 | 50.6% | 107 | 2 | 1 | 38.8% | +11.7 |
| 3 | 5 | 11522 | 12408 | 48.1% | 12 | 1 | 0 | 45.1% | +3.0 |
| 4 | 6 | 10331 | 14502 | 41.6% | 100 | 1 | 0 | 48.2% | -6.5 |
| 5 | 5 | 11443 | 16636 | 40.8% | 11 | 3 | 0 | 47.3% | -6.5 |
| 6 | 6 | 11196 | 14745 | 43.2% | 104 | 3 | 0 | 51.5% | -8.3 |
| 7 | 6 | 11200 | 14045 | 44.4% | 100 | 2 | 0 | 46.0% | -1.7 |
| 8 | 6 | 11184 | 15596 | 41.8% | 98 | 1 | 1 | 45.0% | -3.2 |
| 9 | 6 | 9127 | 14825 | 38.1% | 105 | 1 | 0 | 40.3% | -2.2 |
| 10 | 5 | 12094 | 13291 | 47.6% | 98 | 1 | 0 | 45.8% | +1.9 |

Mean pairwise share 44.2% ± 2.8, baseline 45.3% ± 2.6, paired diff -1.1 ± 4.2.

Skipped turns: 859 over 10 battles (85.9 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1304 over 10 battles (130.4 per battle, most in one battle 567).

