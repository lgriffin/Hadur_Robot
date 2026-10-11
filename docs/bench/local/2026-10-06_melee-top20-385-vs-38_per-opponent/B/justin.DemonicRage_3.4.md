# justin.DemonicRage 3.4 in melee (B): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | justin.DemonicRage 3.4 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10654 | 14851 | 41.8% | 85 | 0 | 0 | 47.8% | -6.0 |
| 2 | 6 | 11117 | 13645 | 44.9% | 7 | 0 | 0 | 48.6% | -3.7 |
| 3 | 6 | 10969 | 14187 | 43.6% | 100 | 0 | 0 | 47.8% | -4.2 |
| 4 | 5 | 11181 | 15623 | 41.7% | 11 | 2 | 0 | 41.9% | -0.2 |
| 5 | 6 | 9696 | 14673 | 39.8% | 3 | 1 | 0 | 42.8% | -3.0 |
| 6 | 6 | 11491 | 14239 | 44.7% | 121 | 1 | 0 | 40.6% | +4.0 |
| 7 | 6 | 10898 | 14384 | 43.1% | 7 | 2 | 0 | 36.9% | +6.2 |
| 8 | 7 | 8913 | 15157 | 37.0% | 5 | 1 | 0 | 43.9% | -6.9 |
| 9 | 6 | 10193 | 14072 | 42.0% | 91 | 0 | 0 | 40.3% | +1.7 |
| 10 | 6 | 12149 | 13636 | 47.1% | 96 | 3 | 0 | 44.8% | +2.3 |

Battles used against justin.DemonicRage 3.4: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 42.6% ± 2.0, baseline 43.5% ± 2.7, paired diff -1.0 ± 3.2.

Skipped turns: 526 over 10 battles (52.6 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1467 over 10 battles (146.7 per battle, most in one battle 298).

