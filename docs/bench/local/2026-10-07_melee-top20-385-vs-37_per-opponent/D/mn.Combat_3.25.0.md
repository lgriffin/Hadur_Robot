# mn.Combat 3.25.0 in melee (D): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | mn.Combat 3.25.0 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11468 | 11205 | 50.6% | 7 | 0 | 0 | 53.1% | -2.5 |
| 2 | 6 | 11056 | 13749 | 44.6% | 104 | 2 | 0 | 48.9% | -4.3 |
| 3 | 4 | 11409 | 11212 | 50.4% | 102 | 0 | 0 | 46.5% | +3.9 |
| 4 | 6 | 10954 | 11054 | 49.8% | 103 | 0 | 0 | 50.3% | -0.5 |
| 5 | 4 | 11936 | 10791 | 52.5% | 107 | 1 | 0 | 51.1% | +1.4 |
| 6 | 4 | 12468 | 10004 | 55.5% | 111 | 0 | 0 | 46.4% | +9.1 |
| 7 | 4 | 11238 | 12144 | 48.1% | 12 | 1 | 0 | 50.3% | -2.2 |
| 8 | 6 | 10885 | 10813 | 50.2% | 115 | 1 | 0 | 47.5% | +2.6 |
| 9 | 3 | 12856 | 11178 | 53.5% | 110 | 0 | 0 | 50.7% | +2.7 |
| 10 | 5 | 11848 | 12014 | 49.7% | 98 | 1 | 1 | 48.8% | +0.8 |

Battles used against mn.Combat 3.25.0: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 50.5% ± 2.1, baseline 49.4% ± 1.5, paired diff +1.1 ± 2.7.

Skipped turns: 869 over 10 battles (86.9 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1370 over 10 battles (137.0 per battle, most in one battle 474).

