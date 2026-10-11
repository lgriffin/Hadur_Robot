# stelo.Spread 0.9 in melee (B): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | stelo.Spread 0.9 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10769 | 8059 | 57.2% | 104 | 0 | 0 | 59.7% | -2.5 |
| 2 | 5 | 11108 | 10160 | 52.2% | 110 | 1 | 0 | 58.9% | -6.7 |
| 3 | 6 | 11044 | 8430 | 56.7% | 95 | 0 | 0 | 59.6% | -2.9 |
| 4 | 6 | 11296 | 7415 | 60.4% | 104 | 1 | 0 | 58.4% | +2.0 |
| 5 | 6 | 10858 | 8432 | 56.3% | 102 | 1 | 0 | 52.0% | +4.3 |
| 6 | 6 | 11620 | 8127 | 58.8% | 88 | 0 | 0 | 58.9% | -0.0 |
| 7 | 6 | 11176 | 9090 | 55.1% | 5 | 0 | 0 | 49.6% | +5.5 |
| 8 | 6 | 10504 | 10293 | 50.5% | 77 | 0 | 0 | 57.9% | -7.4 |
| 9 | 5 | 10977 | 9151 | 54.5% | 102 | 0 | 0 | 61.4% | -6.9 |
| 10 | 6 | 11638 | 9511 | 55.0% | 72 | 0 | 0 | 56.1% | -1.1 |

Battles used against stelo.Spread 0.9: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 55.7% ± 2.1, baseline 57.3% ± 2.7, paired diff -1.6 ± 3.3.

Skipped turns: 859 over 10 battles (85.9 per battle, most in one battle 110). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 864 over 10 battles (86.4 per battle, most in one battle 236).

