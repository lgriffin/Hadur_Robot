# mn.Combat 3.25.0 in melee (D): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | mn.Combat 3.25.0 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 4 | 12225 | 12546 | 49.4% | 118 | 4 | 2 | 48.1% | +1.2 |
| 2 | 4 | 12258 | 10568 | 53.7% | 103 | 1 | 1 | 49.1% | +4.6 |
| 3 | 5 | 10926 | 8340 | 56.7% | 116 | 0 | 0 | 48.4% | +8.3 |
| 4 | 6 | 10311 | 10671 | 49.1% | 110 | 0 | 0 | 51.9% | -2.8 |
| 5 | 3 | 11930 | 11426 | 51.1% | 16 | 1 | 0 | 49.3% | +1.8 |
| 6 | 4 | 12299 | 10540 | 53.9% | 109 | 0 | 0 | 46.7% | +7.2 |
| 7 | 4 | 11761 | 10162 | 53.6% | 4 | 0 | 0 | 50.4% | +3.3 |
| 8 | 5 | 11071 | 10647 | 51.0% | 10 | 2 | 1 | 47.9% | +3.0 |
| 9 | 5 | 11347 | 12117 | 48.4% | 110 | 0 | 0 | 51.2% | -2.9 |
| 10 | 5 | 11410 | 11646 | 49.5% | 104 | 0 | 0 | 52.3% | -2.8 |

Mean pairwise share 51.6% ± 1.9, baseline 49.5% ± 1.3, paired diff +2.1 ± 2.9.

Skipped turns: 800 over 10 battles (80.0 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 959 over 10 battles (95.9 per battle, most in one battle 411).

