# abc.Shadow 3.84i in melee (B): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | abc.Shadow 3.84i score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10769 | 12746 | 45.8% | 104 | 0 | 0 | 48.7% | -2.9 |
| 2 | 5 | 11108 | 11279 | 49.6% | 110 | 0 | 0 | 42.8% | +6.8 |
| 3 | 6 | 11044 | 13258 | 45.4% | 95 | 0 | 0 | 47.5% | -2.1 |
| 4 | 6 | 11296 | 12200 | 48.1% | 104 | 1 | 0 | 42.5% | +5.6 |
| 5 | 6 | 10858 | 14576 | 42.7% | 102 | 0 | 0 | 45.3% | -2.7 |
| 6 | 6 | 11620 | 11642 | 50.0% | 88 | 0 | 0 | 50.2% | -0.3 |
| 7 | 6 | 11176 | 11560 | 49.2% | 5 | 0 | 0 | 41.3% | +7.9 |
| 8 | 6 | 10504 | 14070 | 42.7% | 77 | 2 | 1 | 48.0% | -5.3 |
| 9 | 5 | 10977 | 13248 | 45.3% | 102 | 1 | 0 | 44.4% | +0.9 |
| 10 | 6 | 11638 | 14540 | 44.5% | 72 | 3 | 3 | 44.3% | +0.2 |

Battles used against abc.Shadow 3.84i: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 46.3% ± 1.9, baseline 45.5% ± 2.1, paired diff +0.8 ± 3.2.

Skipped turns: 859 over 10 battles (85.9 per battle, most in one battle 110). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 864 over 10 battles (86.4 per battle, most in one battle 236).

