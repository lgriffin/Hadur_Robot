# ags.Glacier 0.2.11 in melee (A): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | ags.Glacier 0.2.11 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11214 | 12095 | 48.1% | 98 | 0 | 0 | 44.4% | +3.7 |
| 2 | 5 | 10672 | 9609 | 52.6% | 94 | 0 | 0 | 55.5% | -2.9 |
| 3 | 3 | 11855 | 9791 | 54.8% | 93 | 0 | 0 | 48.2% | +6.6 |
| 4 | 6 | 10012 | 12598 | 44.3% | 5 | 0 | 0 | 46.6% | -2.4 |
| 5 | 4 | 11607 | 10112 | 53.4% | 106 | 1 | 0 | 48.4% | +5.0 |
| 6 | 3 | 12383 | 10523 | 54.1% | 89 | 0 | 0 | 46.2% | +7.8 |
| 7 | 3 | 11162 | 10404 | 51.8% | 97 | 1 | 0 | 54.5% | -2.7 |
| 8 | 7 | 10147 | 11595 | 46.7% | 94 | 0 | 0 | 55.1% | -8.4 |
| 9 | 3 | 11760 | 11554 | 50.4% | 91 | 0 | 0 | 44.1% | +6.4 |
| 10 | 9 | 9269 | 10889 | 46.0% | 90 | 0 | 0 | 49.8% | -3.8 |

Battles used against ags.Glacier 0.2.11: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 50.2% ± 2.7, baseline 49.3% ± 3.1, paired diff +0.9 ± 4.0.

Skipped turns: 857 over 10 battles (85.7 per battle, most in one battle 106). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1075 over 10 battles (107.5 per battle, most in one battle 298).

