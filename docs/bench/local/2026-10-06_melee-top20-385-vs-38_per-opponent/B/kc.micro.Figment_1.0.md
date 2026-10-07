# kc.micro.Figment 1.0 in melee (B): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | kc.micro.Figment 1.0 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10654 | 7882 | 57.5% | 85 | 0 | 0 | 56.0% | +1.5 |
| 2 | 6 | 11117 | 6103 | 64.6% | 7 | 0 | 0 | 55.1% | +9.5 |
| 3 | 6 | 10969 | 6828 | 61.6% | 100 | 1 | 0 | 61.8% | -0.1 |
| 4 | 5 | 11181 | 7916 | 58.5% | 11 | 1 | 0 | 63.6% | -5.0 |
| 5 | 6 | 9696 | 8855 | 52.3% | 3 | 0 | 0 | 53.4% | -1.1 |
| 6 | 6 | 11491 | 7184 | 61.5% | 121 | 0 | 0 | 55.1% | +6.5 |
| 7 | 6 | 10898 | 8670 | 55.7% | 7 | 0 | 0 | 54.6% | +1.1 |
| 8 | 7 | 8913 | 8750 | 50.5% | 5 | 0 | 0 | 60.6% | -10.1 |
| 9 | 6 | 10193 | 7282 | 58.3% | 91 | 0 | 0 | 59.4% | -1.1 |
| 10 | 6 | 12149 | 6444 | 65.3% | 96 | 0 | 0 | 66.1% | -0.8 |

Battles used against kc.micro.Figment 1.0: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 58.6% ± 3.5, baseline 58.6% ± 3.1, paired diff +0.0 ± 3.9.

Skipped turns: 526 over 10 battles (52.6 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1467 over 10 battles (146.7 per battle, most in one battle 298).

