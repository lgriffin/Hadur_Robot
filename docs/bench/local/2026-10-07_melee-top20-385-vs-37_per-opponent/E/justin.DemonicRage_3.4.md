# justin.DemonicRage 3.4 in melee (E): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | justin.DemonicRage 3.4 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10876 | 12041 | 47.5% | 113 | 0 | 0 | 54.1% | -6.7 |
| 2 | 3 | 6210 | 4200 | 59.7% | 99 | 0 | 0 | 46.5% | +13.1 |
| 3 | 7 | 10364 | 10891 | 48.8% | 103 | 0 | 0 | 42.3% | +6.4 |
| 4 | 5 | 6599 | 7782 | 45.9% | 94 | 0 | 0 | 49.9% | -4.0 |
| 5 | 5 | 9889 | 13507 | 42.3% | 91 | 0 | 0 | 48.0% | -5.7 |
| 6 | 5 | 11147 | 12136 | 47.9% | 99 | 1 | 1 | 49.5% | -1.6 |
| 7 | 6 | 10234 | 11743 | 46.6% | 101 | 0 | 0 | 45.1% | +1.4 |
| 8 | 9 | 2256 | 2837 | 44.3% | 1 | 0 | 0 | 40.8% | +3.5 |
| 9 | 6 | 10752 | 12540 | 46.2% | 94 | 0 | 0 | 51.1% | -4.9 |
| 10 | 6 | 10843 | 11320 | 48.9% | 118 | 1 | 0 | 46.6% | +2.4 |

Battles used against justin.DemonicRage 3.4: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 47.8% ± 3.3, baseline 47.4% ± 2.9, paired diff +0.4 ± 4.5.

Skipped turns: 913 over 10 battles (91.3 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 883 over 10 battles (88.3 per battle, most in one battle 298).

