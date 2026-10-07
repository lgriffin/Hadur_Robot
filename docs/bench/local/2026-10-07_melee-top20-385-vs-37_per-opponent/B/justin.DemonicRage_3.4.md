# justin.DemonicRage 3.4 in melee (B): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | justin.DemonicRage 3.4 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10769 | 14468 | 42.7% | 104 | 0 | 0 | 45.6% | -3.0 |
| 2 | 5 | 11108 | 14204 | 43.9% | 110 | 0 | 0 | 42.8% | +1.1 |
| 3 | 6 | 11044 | 12968 | 46.0% | 95 | 0 | 0 | 43.0% | +3.0 |
| 4 | 6 | 11296 | 12920 | 46.6% | 104 | 1 | 0 | 46.9% | -0.2 |
| 5 | 6 | 10858 | 12856 | 45.8% | 102 | 0 | 0 | 40.0% | +5.8 |
| 6 | 6 | 11620 | 13938 | 45.5% | 88 | 3 | 2 | 41.3% | +4.1 |
| 7 | 6 | 11176 | 14349 | 43.8% | 5 | 2 | 0 | 37.1% | +6.7 |
| 8 | 6 | 10504 | 10617 | 49.7% | 77 | 2 | 1 | 41.1% | +8.6 |
| 9 | 5 | 10977 | 15123 | 42.1% | 102 | 2 | 0 | 42.5% | -0.5 |
| 10 | 6 | 11638 | 12512 | 48.2% | 72 | 0 | 0 | 49.6% | -1.4 |

Battles used against justin.DemonicRage 3.4: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 45.4% ± 1.7, baseline 43.0% ± 2.6, paired diff +2.4 ± 2.7.

Skipped turns: 859 over 10 battles (85.9 per battle, most in one battle 110). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 864 over 10 battles (86.4 per battle, most in one battle 236).

