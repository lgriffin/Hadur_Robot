# jk.melee.Neuromancer 7.12 in melee (E): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | jk.melee.Neuromancer 7.12 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11536 | 11777 | 49.5% | 104 | 1 | 0 | 40.1% | +9.3 |
| 2 | 8 | 9692 | 12282 | 44.1% | 4 | 0 | 0 | 48.4% | -4.3 |
| 3 | 5 | 10664 | 12516 | 46.0% | 96 | 0 | 0 | 45.3% | +0.7 |
| 4 | 7 | 9625 | 12935 | 42.7% | 95 | 2 | 0 | 42.9% | -0.2 |
| 5 | 6 | 4944 | 5235 | 48.6% | 5 | 1 | 0 | 50.4% | -1.9 |
| 6 | 9 | 3850 | 5987 | 39.1% | 2 | 0 | 0 | 43.7% | -4.6 |
| 7 | 5 | 10668 | 12338 | 46.4% | 6 | 0 | 0 | 40.0% | +6.3 |
| 8 | 4 | 11605 | 11072 | 51.2% | 99 | 1 | 0 | 45.5% | +5.7 |
| 9 | 6 | 10936 | 13355 | 45.0% | 89 | 2 | 1 | 42.7% | +2.4 |
| 10 | 2 | 2288 | 1420 | 61.7% | 4 | 0 | 0 | 39.5% | +22.2 |

Battles used against jk.melee.Neuromancer 7.12: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 47.4% ± 4.4, baseline 43.9% ± 2.6, paired diff +3.6 ± 5.7.

Skipped turns: 504 over 10 battles (50.4 per battle, most in one battle 104). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 383 over 10 battles (38.3 per battle, most in one battle 143).

