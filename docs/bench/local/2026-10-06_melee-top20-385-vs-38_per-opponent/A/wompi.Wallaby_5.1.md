# wompi.Wallaby 5.1 in melee (A): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | wompi.Wallaby 5.1 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11214 | 7462 | 60.0% | 98 | 0 | 0 | 59.2% | +0.8 |
| 2 | 5 | 10672 | 7859 | 57.6% | 94 | 0 | 0 | 53.7% | +3.9 |
| 3 | 3 | 11855 | 6732 | 63.8% | 93 | 0 | 0 | 52.8% | +11.0 |
| 4 | 6 | 10012 | 7924 | 55.8% | 5 | 0 | 0 | 56.3% | -0.4 |
| 5 | 4 | 11607 | 7659 | 60.2% | 106 | 2 | 1 | 55.2% | +5.0 |
| 6 | 3 | 12383 | 9112 | 57.6% | 89 | 0 | 0 | 53.6% | +4.0 |
| 7 | 3 | 11162 | 9276 | 54.6% | 97 | 1 | 1 | 64.0% | -9.4 |
| 8 | 7 | 10147 | 8627 | 54.0% | 94 | 0 | 0 | 57.6% | -3.5 |
| 9 | 3 | 11760 | 8565 | 57.9% | 91 | 1 | 0 | 62.1% | -4.3 |
| 10 | 9 | 9269 | 9305 | 49.9% | 90 | 0 | 0 | 49.5% | +0.5 |

Battles used against wompi.Wallaby 5.1: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 57.2% ± 2.8, baseline 56.4% ± 3.2, paired diff +0.8 ± 4.1.

Skipped turns: 857 over 10 battles (85.7 per battle, most in one battle 106). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1075 over 10 battles (107.5 per battle, most in one battle 298).

