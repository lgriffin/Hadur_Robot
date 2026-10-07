# ags.Glacier 0.2.11 in melee (C): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | ags.Glacier 0.2.11 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11164 | 11821 | 48.6% | 93 | 2 | 1 | 30.2% | +18.4 |
| 2 | 5 | 10932 | 12418 | 46.8% | 12 | 0 | 0 | 54.9% | -8.1 |
| 3 | 6 | 11708 | 12057 | 49.3% | 92 | 0 | 0 | 46.3% | +2.9 |
| 4 | 4 | 12744 | 11698 | 52.1% | 92 | 0 | 0 | 48.9% | +3.3 |
| 5 | 7 | 9089 | 12149 | 42.8% | 5 | 0 | 0 | 44.3% | -1.5 |
| 6 | 5 | 6979 | 7361 | 48.7% | 96 | 0 | 0 | 49.8% | -1.1 |
| 7 | 2 | 7783 | 7286 | 51.6% | 94 | 0 | 0 | 44.6% | +7.0 |
| 8 | 6 | 11354 | 11789 | 49.1% | 94 | 2 | 2 | 53.8% | -4.7 |
| 9 | 4 | 11358 | 12538 | 47.5% | 97 | 1 | 0 | 48.1% | -0.6 |
| 10 | 7 | 7622 | 9450 | 44.6% | 6 | 0 | 0 | 47.8% | -3.2 |

Battles used against ags.Glacier 0.2.11: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 48.1% ± 2.0, baseline 46.9% ± 4.9, paired diff +1.2 ± 5.3.

Skipped turns: 681 over 10 battles (68.1 per battle, most in one battle 97). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 487 over 10 battles (48.7 per battle, most in one battle 298).

