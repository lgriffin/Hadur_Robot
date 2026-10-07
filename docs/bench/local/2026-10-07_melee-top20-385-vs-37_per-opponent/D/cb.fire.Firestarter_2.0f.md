# cb.fire.Firestarter 2.0f in melee (D): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | cb.fire.Firestarter 2.0f score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11468 | 13145 | 46.6% | 7 | 1 | 0 | 50.6% | -4.0 |
| 2 | 6 | 11056 | 12639 | 46.7% | 104 | 0 | 0 | 46.0% | +0.7 |
| 3 | 4 | 11409 | 14713 | 43.7% | 102 | 1 | 0 | 43.2% | +0.5 |
| 4 | 6 | 10954 | 12599 | 46.5% | 103 | 0 | 0 | 48.1% | -1.6 |
| 5 | 4 | 11936 | 13083 | 47.7% | 107 | 0 | 0 | 46.0% | +1.7 |
| 6 | 4 | 12468 | 14476 | 46.3% | 111 | 1 | 1 | 38.9% | +7.4 |
| 7 | 4 | 11238 | 15888 | 41.4% | 12 | 1 | 0 | 46.7% | -5.3 |
| 8 | 6 | 10885 | 15155 | 41.8% | 115 | 1 | 1 | 42.1% | -0.3 |
| 9 | 3 | 12856 | 15568 | 45.2% | 110 | 3 | 1 | 46.0% | -0.8 |
| 10 | 5 | 11848 | 14434 | 45.1% | 98 | 3 | 0 | 43.5% | +1.6 |

Battles used against cb.fire.Firestarter 2.0f: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 45.1% ± 1.5, baseline 45.1% ± 2.4, paired diff -0.0 ± 2.5.

Skipped turns: 869 over 10 battles (86.9 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1370 over 10 battles (137.0 per battle, most in one battle 474).

