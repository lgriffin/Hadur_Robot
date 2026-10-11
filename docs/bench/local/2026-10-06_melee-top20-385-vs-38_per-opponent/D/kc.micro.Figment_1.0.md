# kc.micro.Figment 1.0 in melee (D): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | kc.micro.Figment 1.0 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 3 | 12139 | 7511 | 61.8% | 114 | 0 | 0 | 61.8% | -0.1 |
| 2 | 5 | 11040 | 6395 | 63.3% | 103 | 1 | 0 | 70.9% | -7.6 |
| 3 | 6 | 11176 | 6972 | 61.6% | 103 | 0 | 0 | 72.1% | -10.6 |
| 4 | 5 | 11569 | 6363 | 64.5% | 99 | 0 | 0 | 57.0% | +7.5 |
| 5 | 3 | 12478 | 6467 | 65.9% | 93 | 0 | 0 | 60.7% | +5.2 |
| 6 | 7 | 10019 | 7579 | 56.9% | 91 | 0 | 0 | 68.9% | -11.9 |
| 7 | 3 | 12190 | 4936 | 71.2% | 115 | 0 | 0 | 59.0% | +12.2 |
| 8 | 4 | 11153 | 5787 | 65.8% | 102 | 0 | 0 | 65.7% | +0.1 |
| 9 | 7 | 10591 | 6650 | 61.4% | 9 | 0 | 0 | 66.7% | -5.3 |
| 10 | 2 | 12720 | 7770 | 62.1% | 91 | 0 | 0 | 68.5% | -6.4 |

Battles used against kc.micro.Figment 1.0: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 63.5% ± 2.7, baseline 65.1% ± 3.7, paired diff -1.7 ± 5.8.

Skipped turns: 920 over 10 battles (92.0 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1554 over 10 battles (155.4 per battle, most in one battle 298).

