# positive.Portia 1.26e in melee (D): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | positive.Portia 1.26e score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 4 | 12225 | 11460 | 51.6% | 118 | 1 | 1 | 50.8% | +0.8 |
| 2 | 4 | 12258 | 11717 | 51.1% | 103 | 0 | 0 | 55.0% | -3.9 |
| 3 | 5 | 10926 | 11042 | 49.7% | 116 | 0 | 0 | 56.1% | -6.4 |
| 4 | 6 | 10311 | 9691 | 51.5% | 110 | 0 | 0 | 51.1% | +0.4 |
| 5 | 3 | 11930 | 15090 | 44.2% | 16 | 3 | 0 | 54.8% | -10.6 |
| 6 | 4 | 12299 | 12907 | 48.8% | 109 | 1 | 0 | 47.6% | +1.1 |
| 7 | 4 | 11761 | 10493 | 52.8% | 4 | 0 | 0 | 48.7% | +4.1 |
| 8 | 5 | 11071 | 12474 | 47.0% | 10 | 0 | 0 | 48.1% | -1.1 |
| 9 | 5 | 11347 | 10747 | 51.4% | 110 | 0 | 0 | 57.4% | -6.0 |
| 10 | 5 | 11410 | 11300 | 50.2% | 104 | 2 | 0 | 48.3% | +1.9 |

Mean pairwise share 49.8% ± 1.9, baseline 51.8% ± 2.6, paired diff -2.0 ± 3.3.

Skipped turns: 800 over 10 battles (80.0 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 959 over 10 battles (95.9 per battle, most in one battle 411).

