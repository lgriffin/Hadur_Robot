# cb.fire.Firestarter 2.0f in melee (D): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | cb.fire.Firestarter 2.0f score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 4 | 12225 | 13926 | 46.7% | 118 | 3 | 0 | 46.5% | +0.2 |
| 2 | 4 | 12258 | 12339 | 49.8% | 103 | 0 | 0 | 50.1% | -0.3 |
| 3 | 5 | 10926 | 13086 | 45.5% | 116 | 1 | 0 | 45.7% | -0.2 |
| 4 | 6 | 10311 | 14093 | 42.3% | 110 | 1 | 0 | 49.3% | -7.1 |
| 5 | 3 | 11930 | 11119 | 51.8% | 16 | 2 | 0 | 50.3% | +1.5 |
| 6 | 4 | 12299 | 12089 | 50.4% | 109 | 1 | 0 | 44.1% | +6.4 |
| 7 | 4 | 11761 | 14190 | 45.3% | 4 | 4 | 0 | 49.1% | -3.8 |
| 8 | 5 | 11071 | 15586 | 41.5% | 10 | 2 | 1 | 40.1% | +1.5 |
| 9 | 5 | 11347 | 11463 | 49.7% | 110 | 1 | 0 | 42.0% | +7.8 |
| 10 | 5 | 11410 | 14494 | 44.0% | 104 | 2 | 1 | 49.9% | -5.8 |

Mean pairwise share 46.7% ± 2.6, baseline 46.7% ± 2.6, paired diff +0.0 ± 3.4.

Skipped turns: 800 over 10 battles (80.0 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 959 over 10 battles (95.9 per battle, most in one battle 411).

