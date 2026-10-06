# ags.Glacier 0.2.11 in melee (C): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | ags.Glacier 0.2.11 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 10432 | 9676 | 51.9% | 6 | 0 | 0 | 48.2% | +3.7 |
| 2 | 6 | 9567 | 11774 | 44.8% | 129 | 1 | 1 | 44.3% | +0.6 |
| 3 | 5 | 10753 | 12431 | 46.4% | 11 | 1 | 1 | 50.1% | -3.8 |
| 4 | 7 | 5194 | 5699 | 47.7% | 3 | 0 | 0 | 44.1% | +3.6 |
| 5 | 7 | 184 | 162 | 53.2% | 0 | 0 | 0 | 45.9% | +7.3 |
| 6 | 6 | 9433 | 12232 | 43.5% | 10 | 0 | 0 | 49.7% | -6.1 |
| 7 | 7 | 10409 | 10569 | 49.6% | 6 | 0 | 0 | 49.5% | +0.1 |
| 8 | 7 | 10072 | 12300 | 45.0% | 114 | 1 | 1 | 45.6% | -0.6 |
| 9 | 8 | 5313 | 6920 | 43.4% | 8 | 0 | 0 | 47.0% | -3.6 |
| 10 | 6 | 10065 | 11195 | 47.3% | 126 | 0 | 0 | 48.3% | -1.0 |

Mean pairwise share 47.3% ± 2.4, baseline 47.3% ± 1.6, paired diff +0.0 ± 2.9.

Skipped turns: 413 over 10 battles (41.3 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1628 over 10 battles (162.8 per battle, most in one battle 414).

