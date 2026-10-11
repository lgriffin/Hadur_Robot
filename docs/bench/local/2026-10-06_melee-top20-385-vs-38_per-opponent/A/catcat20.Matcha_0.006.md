# catcat20.Matcha 0.006 in melee (A): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | catcat20.Matcha 0.006 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11214 | 10226 | 52.3% | 98 | 0 | 0 | 47.9% | +4.4 |
| 2 | 5 | 10672 | 10416 | 50.6% | 94 | 0 | 0 | 50.4% | +0.2 |
| 3 | 3 | 11855 | 9839 | 54.6% | 93 | 1 | 0 | 50.9% | +3.7 |
| 4 | 6 | 10012 | 7622 | 56.8% | 5 | 0 | 0 | 55.6% | +1.2 |
| 5 | 4 | 11607 | 8512 | 57.7% | 106 | 0 | 0 | 50.0% | +7.7 |
| 6 | 3 | 12383 | 8892 | 58.2% | 89 | 0 | 0 | 52.0% | +6.2 |
| 7 | 3 | 11162 | 9391 | 54.3% | 97 | 1 | 1 | 58.3% | -4.0 |
| 8 | 7 | 10147 | 9019 | 52.9% | 94 | 0 | 0 | 51.2% | +1.7 |
| 9 | 3 | 11760 | 9450 | 55.4% | 91 | 1 | 0 | 54.7% | +0.8 |
| 10 | 9 | 9269 | 10872 | 46.0% | 90 | 1 | 0 | 53.5% | -7.5 |

Battles used against catcat20.Matcha 0.006: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 53.9% ± 2.6, baseline 52.5% ± 2.2, paired diff +1.4 ± 3.3.

Skipped turns: 857 over 10 battles (85.7 per battle, most in one battle 106). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1075 over 10 battles (107.5 per battle, most in one battle 298).

