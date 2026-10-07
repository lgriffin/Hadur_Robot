# kc.mini.Mirage 0.2 in melee (D): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | kc.mini.Mirage 0.2 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11468 | 12575 | 47.7% | 7 | 1 | 0 | 45.2% | +2.5 |
| 2 | 6 | 11056 | 11078 | 50.0% | 104 | 1 | 1 | 47.8% | +2.2 |
| 3 | 4 | 11409 | 14882 | 43.4% | 102 | 2 | 0 | 49.2% | -5.8 |
| 4 | 6 | 10954 | 13977 | 43.9% | 103 | 1 | 0 | 45.2% | -1.3 |
| 5 | 4 | 11936 | 12698 | 48.5% | 107 | 1 | 1 | 45.8% | +2.7 |
| 6 | 4 | 12468 | 14710 | 45.9% | 111 | 1 | 1 | 47.1% | -1.2 |
| 7 | 4 | 11238 | 9953 | 53.0% | 12 | 1 | 0 | 47.2% | +5.9 |
| 8 | 6 | 10885 | 13164 | 45.3% | 115 | 1 | 0 | 50.0% | -4.7 |
| 9 | 3 | 12856 | 10920 | 54.1% | 110 | 0 | 0 | 43.4% | +10.7 |
| 10 | 5 | 11848 | 13852 | 46.1% | 98 | 3 | 1 | 49.1% | -3.0 |

Battles used against kc.mini.Mirage 0.2: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 47.8% ± 2.6, baseline 47.0% ± 1.5, paired diff +0.8 ± 3.6.

Skipped turns: 869 over 10 battles (86.9 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1370 over 10 battles (137.0 per battle, most in one battle 474).

