# kc.mini.Mirage 0.2 in melee (D): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | kc.mini.Mirage 0.2 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 4 | 12225 | 11472 | 51.6% | 118 | 0 | 0 | 46.0% | +5.6 |
| 2 | 4 | 12258 | 13793 | 47.1% | 103 | 1 | 1 | 48.2% | -1.1 |
| 3 | 5 | 10926 | 14600 | 42.8% | 116 | 2 | 1 | 46.5% | -3.7 |
| 4 | 6 | 10311 | 15095 | 40.6% | 110 | 1 | 0 | 46.1% | -5.5 |
| 5 | 3 | 11930 | 11882 | 50.1% | 16 | 1 | 0 | 50.1% | -0.0 |
| 6 | 4 | 12299 | 13335 | 48.0% | 109 | 2 | 1 | 47.3% | +0.7 |
| 7 | 4 | 11761 | 12425 | 48.6% | 4 | 0 | 0 | 45.5% | +3.1 |
| 8 | 5 | 11071 | 12958 | 46.1% | 10 | 0 | 0 | 44.5% | +1.6 |
| 9 | 5 | 11347 | 12334 | 47.9% | 110 | 0 | 0 | 50.6% | -2.7 |
| 10 | 5 | 11410 | 13528 | 45.8% | 104 | 0 | 0 | 51.8% | -6.0 |

Mean pairwise share 46.8% ± 2.3, baseline 47.7% ± 1.7, paired diff -0.8 ± 2.7.

Skipped turns: 800 over 10 battles (80.0 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 959 over 10 battles (95.9 per battle, most in one battle 411).

