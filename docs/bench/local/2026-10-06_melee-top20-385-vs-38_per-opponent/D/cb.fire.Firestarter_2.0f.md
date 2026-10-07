# cb.fire.Firestarter 2.0f in melee (D): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | cb.fire.Firestarter 2.0f score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 3 | 12139 | 12855 | 48.6% | 114 | 1 | 0 | 41.7% | +6.8 |
| 2 | 5 | 11040 | 12489 | 46.9% | 103 | 0 | 0 | 49.8% | -2.9 |
| 3 | 6 | 11176 | 12225 | 47.8% | 103 | 1 | 1 | 48.2% | -0.4 |
| 4 | 5 | 11569 | 13196 | 46.7% | 99 | 0 | 0 | 43.0% | +3.7 |
| 5 | 3 | 12478 | 13402 | 48.2% | 93 | 3 | 1 | 49.2% | -1.0 |
| 6 | 7 | 10019 | 15448 | 39.3% | 91 | 0 | 0 | 48.0% | -8.7 |
| 7 | 3 | 12190 | 13765 | 47.0% | 115 | 0 | 0 | 46.8% | +0.2 |
| 8 | 4 | 11153 | 14611 | 43.3% | 102 | 2 | 0 | 50.2% | -6.9 |
| 9 | 7 | 10591 | 11973 | 46.9% | 9 | 2 | 0 | 47.1% | -0.2 |
| 10 | 2 | 12720 | 12454 | 50.5% | 91 | 3 | 0 | 49.7% | +0.9 |

Battles used against cb.fire.Firestarter 2.0f: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 46.5% ± 2.2, baseline 47.4% ± 2.1, paired diff -0.8 ± 3.3.

Skipped turns: 920 over 10 battles (92.0 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1554 over 10 battles (155.4 per battle, most in one battle 298).

