# kc.mini.Mirage 0.2 in melee (B): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | kc.mini.Mirage 0.2 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10769 | 13644 | 44.1% | 104 | 0 | 0 | 44.2% | -0.1 |
| 2 | 5 | 11108 | 15442 | 41.8% | 110 | 3 | 0 | 42.2% | -0.4 |
| 3 | 6 | 11044 | 12734 | 46.4% | 95 | 0 | 0 | 46.8% | -0.4 |
| 4 | 6 | 11296 | 11499 | 49.6% | 104 | 0 | 0 | 41.0% | +8.6 |
| 5 | 6 | 10858 | 11101 | 49.4% | 102 | 2 | 1 | 45.7% | +3.8 |
| 6 | 6 | 11620 | 11688 | 49.9% | 88 | 2 | 2 | 40.0% | +9.8 |
| 7 | 6 | 11176 | 12365 | 47.5% | 5 | 0 | 0 | 46.3% | +1.1 |
| 8 | 6 | 10504 | 12906 | 44.9% | 77 | 0 | 0 | 43.8% | +1.1 |
| 9 | 5 | 10977 | 10272 | 51.7% | 102 | 0 | 0 | 46.5% | +5.1 |
| 10 | 6 | 11638 | 13582 | 46.1% | 72 | 0 | 0 | 49.6% | -3.4 |

Battles used against kc.mini.Mirage 0.2: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 47.1% ± 2.2, baseline 44.6% ± 2.1, paired diff +2.5 ± 3.0.

Skipped turns: 859 over 10 battles (85.9 per battle, most in one battle 110). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 864 over 10 battles (86.4 per battle, most in one battle 236).

