# justin.DemonicRage 3.4 in melee (E): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | justin.DemonicRage 3.4 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11536 | 11659 | 49.7% | 104 | 1 | 1 | 45.5% | +4.2 |
| 2 | 8 | 9692 | 10858 | 47.2% | 4 | 0 | 0 | 49.3% | -2.2 |
| 3 | 5 | 10664 | 12389 | 46.3% | 96 | 2 | 1 | 45.5% | +0.8 |
| 4 | 7 | 9625 | 12213 | 44.1% | 95 | 0 | 0 | 48.4% | -4.3 |
| 5 | 6 | 4944 | 3737 | 57.0% | 5 | 0 | 0 | 48.0% | +8.9 |
| 6 | 9 | 3850 | 6761 | 36.3% | 2 | 0 | 0 | 46.2% | -9.9 |
| 7 | 5 | 10668 | 13825 | 43.6% | 6 | 1 | 0 | 46.3% | -2.7 |
| 8 | 4 | 11605 | 10165 | 53.3% | 99 | 1 | 0 | 43.6% | +9.7 |
| 9 | 6 | 10936 | 12247 | 47.2% | 89 | 0 | 0 | 42.0% | +5.1 |
| 10 | 2 | 2288 | 2143 | 51.6% | 4 | 0 | 0 | 38.6% | +13.0 |

Battles used against justin.DemonicRage 3.4: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 47.6% ± 4.1, baseline 45.3% ± 2.3, paired diff +2.3 ± 5.1.

Skipped turns: 504 over 10 battles (50.4 per battle, most in one battle 104). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 383 over 10 battles (38.3 per battle, most in one battle 143).

