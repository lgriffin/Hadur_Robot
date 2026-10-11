# kc.micro.Figment 1.0 in melee (C): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | kc.micro.Figment 1.0 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 10432 | 7301 | 58.8% | 6 | 0 | 0 | 55.7% | +3.1 |
| 2 | 6 | 9567 | 7283 | 56.8% | 129 | 0 | 0 | 56.3% | +0.5 |
| 3 | 5 | 10753 | 8154 | 56.9% | 11 | 0 | 0 | 66.2% | -9.3 |
| 4 | 7 | 5194 | 2245 | 69.8% | 3 | 0 | 0 | 61.6% | +8.2 |
| 5 | 7 | 184 | 81 | 69.4% | 0 | 0 | 0 | 60.8% | +8.6 |
| 6 | 6 | 9433 | 8405 | 52.9% | 10 | 1 | 0 | 55.5% | -2.7 |
| 7 | 7 | 10409 | 7194 | 59.1% | 6 | 0 | 0 | 66.0% | -6.9 |
| 8 | 7 | 10072 | 7076 | 58.7% | 114 | 1 | 0 | 63.1% | -4.4 |
| 9 | 8 | 5313 | 4294 | 55.3% | 8 | 0 | 0 | 61.1% | -5.8 |
| 10 | 6 | 10065 | 9095 | 52.5% | 126 | 0 | 0 | 66.4% | -13.9 |

Mean pairwise share 59.0% ± 4.3, baseline 61.3% ± 3.1, paired diff -2.2 ± 5.3.

Skipped turns: 413 over 10 battles (41.3 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1628 over 10 battles (162.8 per battle, most in one battle 414).

