# stelo.PastFuture 2.3.2 in melee (B): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | stelo.PastFuture 2.3.2 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10769 | 7965 | 57.5% | 104 | 1 | 0 | 57.6% | -0.1 |
| 2 | 5 | 11108 | 7756 | 58.9% | 110 | 0 | 0 | 52.3% | +6.6 |
| 3 | 6 | 11044 | 8938 | 55.3% | 95 | 2 | 2 | 62.6% | -7.3 |
| 4 | 6 | 11296 | 7384 | 60.5% | 104 | 0 | 0 | 55.2% | +5.3 |
| 5 | 6 | 10858 | 6832 | 61.4% | 102 | 0 | 0 | 56.6% | +4.8 |
| 6 | 6 | 11620 | 8399 | 58.0% | 88 | 2 | 1 | 51.9% | +6.2 |
| 7 | 6 | 11176 | 7615 | 59.5% | 5 | 0 | 0 | 56.6% | +2.9 |
| 8 | 6 | 10504 | 8026 | 56.7% | 77 | 0 | 0 | 58.4% | -1.7 |
| 9 | 5 | 10977 | 8245 | 57.1% | 102 | 0 | 0 | 59.0% | -1.9 |
| 10 | 6 | 11638 | 7644 | 60.4% | 72 | 0 | 0 | 54.5% | +5.9 |

Battles used against stelo.PastFuture 2.3.2: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 58.5% ± 1.4, baseline 56.5% ± 2.3, paired diff +2.1 ± 3.3.

Skipped turns: 859 over 10 battles (85.9 per battle, most in one battle 110). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 864 over 10 battles (86.4 per battle, most in one battle 236).

