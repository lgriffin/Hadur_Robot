# mn.Combat 3.25.0 in melee (E): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | mn.Combat 3.25.0 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11536 | 10782 | 51.7% | 104 | 0 | 0 | 44.9% | +6.8 |
| 2 | 8 | 9692 | 11004 | 46.8% | 4 | 0 | 0 | 53.8% | -7.0 |
| 3 | 5 | 10664 | 9319 | 53.4% | 96 | 1 | 0 | 47.3% | +6.1 |
| 4 | 7 | 9625 | 10538 | 47.7% | 95 | 0 | 0 | 46.3% | +1.4 |
| 5 | 6 | 4944 | 5311 | 48.2% | 5 | 0 | 0 | 51.1% | -2.9 |
| 6 | 9 | 3850 | 4592 | 45.6% | 2 | 0 | 0 | 45.6% | -0.0 |
| 7 | 5 | 10668 | 9489 | 52.9% | 6 | 0 | 0 | 45.5% | +7.4 |
| 8 | 4 | 11605 | 12145 | 48.9% | 99 | 0 | 0 | 50.3% | -1.4 |
| 9 | 6 | 10936 | 9258 | 54.2% | 89 | 0 | 0 | 44.8% | +9.3 |
| 10 | 2 | 2288 | 2197 | 51.0% | 4 | 0 | 0 | 45.4% | +5.6 |

Battles used against mn.Combat 3.25.0: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 50.0% ± 2.1, baseline 47.5% ± 2.2, paired diff +2.5 ± 3.8.

Skipped turns: 504 over 10 battles (50.4 per battle, most in one battle 104). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 383 over 10 battles (38.3 per battle, most in one battle 143).

