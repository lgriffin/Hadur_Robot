# mn.Combat 3.25.0 in melee (D): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | mn.Combat 3.25.0 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 3 | 12139 | 11437 | 51.5% | 114 | 1 | 0 | 46.7% | +4.8 |
| 2 | 5 | 11040 | 11848 | 48.2% | 103 | 0 | 0 | 50.7% | -2.5 |
| 3 | 6 | 11176 | 11226 | 49.9% | 103 | 1 | 0 | 57.2% | -7.3 |
| 4 | 5 | 11569 | 9714 | 54.4% | 99 | 2 | 0 | 47.9% | +6.4 |
| 5 | 3 | 12478 | 10549 | 54.2% | 93 | 1 | 0 | 49.1% | +5.1 |
| 6 | 7 | 10019 | 9755 | 50.7% | 91 | 0 | 0 | 49.0% | +1.7 |
| 7 | 3 | 12190 | 10635 | 53.4% | 115 | 1 | 0 | 50.8% | +2.6 |
| 8 | 4 | 11153 | 10416 | 51.7% | 102 | 0 | 0 | 48.2% | +3.5 |
| 9 | 7 | 10591 | 11497 | 47.9% | 9 | 1 | 0 | 53.1% | -5.2 |
| 10 | 2 | 12720 | 11731 | 52.0% | 91 | 1 | 0 | 49.8% | +2.2 |

Battles used against mn.Combat 3.25.0: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 51.4% ± 1.6, baseline 50.3% ± 2.2, paired diff +1.1 ± 3.3.

Skipped turns: 920 over 10 battles (92.0 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1554 over 10 battles (155.4 per battle, most in one battle 298).

