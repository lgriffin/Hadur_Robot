# jk.melee.Neuromancer 7.12 in melee (A): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | jk.melee.Neuromancer 7.12 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11214 | 14164 | 44.2% | 98 | 0 | 0 | 40.8% | +3.4 |
| 2 | 5 | 10672 | 14281 | 42.8% | 94 | 0 | 0 | 38.3% | +4.4 |
| 3 | 3 | 11855 | 14330 | 45.3% | 93 | 1 | 0 | 38.9% | +6.4 |
| 4 | 6 | 10012 | 16912 | 37.2% | 5 | 0 | 0 | 42.2% | -5.0 |
| 5 | 4 | 11607 | 16555 | 41.2% | 106 | 1 | 0 | 41.4% | -0.2 |
| 6 | 3 | 12383 | 14598 | 45.9% | 89 | 3 | 2 | 42.1% | +3.8 |
| 7 | 3 | 11162 | 16855 | 39.8% | 97 | 1 | 0 | 46.3% | -6.4 |
| 8 | 7 | 10147 | 16491 | 38.1% | 94 | 2 | 1 | 45.2% | -7.1 |
| 9 | 3 | 11760 | 15397 | 43.3% | 91 | 4 | 0 | 42.5% | +0.8 |
| 10 | 9 | 9269 | 14480 | 39.0% | 90 | 1 | 1 | 43.1% | -4.1 |

Battles used against jk.melee.Neuromancer 7.12: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 41.7% ± 2.2, baseline 42.1% ± 1.8, paired diff -0.4 ± 3.5.

Skipped turns: 857 over 10 battles (85.7 per battle, most in one battle 106). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1075 over 10 battles (107.5 per battle, most in one battle 298).

