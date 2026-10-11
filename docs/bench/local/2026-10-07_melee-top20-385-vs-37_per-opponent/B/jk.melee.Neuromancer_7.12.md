# jk.melee.Neuromancer 7.12 in melee (B): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | jk.melee.Neuromancer 7.12 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10769 | 14754 | 42.2% | 104 | 1 | 0 | 40.1% | +2.1 |
| 2 | 5 | 11108 | 14155 | 44.0% | 110 | 1 | 0 | 37.1% | +6.9 |
| 3 | 6 | 11044 | 14703 | 42.9% | 95 | 2 | 0 | 37.5% | +5.3 |
| 4 | 6 | 11296 | 15493 | 42.2% | 104 | 1 | 1 | 40.4% | +1.7 |
| 5 | 6 | 10858 | 16402 | 39.8% | 102 | 1 | 1 | 38.4% | +1.4 |
| 6 | 6 | 11620 | 16070 | 42.0% | 88 | 1 | 0 | 37.6% | +4.3 |
| 7 | 6 | 11176 | 15875 | 41.3% | 5 | 4 | 0 | 38.6% | +2.7 |
| 8 | 6 | 10504 | 16892 | 38.3% | 77 | 0 | 0 | 38.4% | -0.0 |
| 9 | 5 | 10977 | 17606 | 38.4% | 102 | 4 | 1 | 41.4% | -3.0 |
| 10 | 6 | 11638 | 13095 | 47.1% | 72 | 1 | 0 | 43.0% | +4.1 |

Battles used against jk.melee.Neuromancer 7.12: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 41.8% ± 1.9, baseline 39.3% ± 1.4, paired diff +2.6 ± 2.0.

Skipped turns: 859 over 10 battles (85.9 per battle, most in one battle 110). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 864 over 10 battles (86.4 per battle, most in one battle 236).

