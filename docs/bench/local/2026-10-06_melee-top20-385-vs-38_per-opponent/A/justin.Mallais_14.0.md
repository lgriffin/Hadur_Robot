# justin.Mallais 14.0 in melee (A): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | justin.Mallais 14.0 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11214 | 11677 | 49.0% | 98 | 0 | 0 | 46.7% | +2.2 |
| 2 | 5 | 10672 | 10943 | 49.4% | 94 | 1 | 1 | 47.7% | +1.7 |
| 3 | 3 | 11855 | 10333 | 53.4% | 93 | 1 | 0 | 45.7% | +7.8 |
| 4 | 6 | 10012 | 8419 | 54.3% | 5 | 0 | 0 | 52.7% | +1.7 |
| 5 | 4 | 11607 | 11097 | 51.1% | 106 | 0 | 0 | 52.7% | -1.6 |
| 6 | 3 | 12383 | 11471 | 51.9% | 89 | 0 | 0 | 47.6% | +4.3 |
| 7 | 3 | 11162 | 10685 | 51.1% | 97 | 0 | 0 | 51.0% | +0.1 |
| 8 | 7 | 10147 | 10242 | 49.8% | 94 | 0 | 0 | 54.5% | -4.7 |
| 9 | 3 | 11760 | 10365 | 53.2% | 91 | 1 | 0 | 50.7% | +2.5 |
| 10 | 9 | 9269 | 9590 | 49.1% | 90 | 0 | 0 | 52.5% | -3.3 |

Battles used against justin.Mallais 14.0: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 51.2% ± 1.4, baseline 50.2% ± 2.2, paired diff +1.1 ± 2.6.

Skipped turns: 857 over 10 battles (85.7 per battle, most in one battle 106). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1075 over 10 battles (107.5 per battle, most in one battle 298).

