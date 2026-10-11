# kc.micro.Figment 1.0 in melee (C): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | kc.micro.Figment 1.0 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11164 | 7001 | 61.5% | 93 | 0 | 0 | 43.1% | +18.4 |
| 2 | 5 | 10932 | 7208 | 60.3% | 12 | 0 | 0 | 68.9% | -8.6 |
| 3 | 6 | 11708 | 5660 | 67.4% | 92 | 1 | 1 | 58.4% | +9.1 |
| 4 | 4 | 12744 | 6175 | 67.4% | 92 | 0 | 0 | 56.1% | +11.3 |
| 5 | 7 | 9089 | 7554 | 54.6% | 5 | 0 | 0 | 64.9% | -10.3 |
| 6 | 5 | 6979 | 4032 | 63.4% | 96 | 0 | 0 | 65.9% | -2.5 |
| 7 | 2 | 7783 | 3912 | 66.5% | 94 | 0 | 0 | 54.7% | +11.9 |
| 8 | 6 | 11354 | 7003 | 61.9% | 94 | 0 | 0 | 58.7% | +3.1 |
| 9 | 4 | 11358 | 6553 | 63.4% | 97 | 0 | 0 | 63.6% | -0.1 |
| 10 | 7 | 7622 | 6064 | 55.7% | 6 | 0 | 0 | 60.0% | -4.3 |

Battles used against kc.micro.Figment 1.0: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 62.2% ± 3.2, baseline 59.4% ± 5.2, paired diff +2.8 ± 6.8.

Skipped turns: 681 over 10 battles (68.1 per battle, most in one battle 97). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 487 over 10 battles (48.7 per battle, most in one battle 298).

