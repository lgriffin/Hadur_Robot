# kc.micro.Figment 1.0 in melee (D): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | kc.micro.Figment 1.0 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11468 | 6456 | 64.0% | 7 | 0 | 0 | 63.3% | +0.7 |
| 2 | 6 | 11056 | 6769 | 62.0% | 104 | 0 | 0 | 57.8% | +4.3 |
| 3 | 4 | 11409 | 5461 | 67.6% | 102 | 0 | 0 | 59.2% | +8.4 |
| 4 | 6 | 10954 | 7759 | 58.5% | 103 | 1 | 1 | 61.6% | -3.1 |
| 5 | 4 | 11936 | 7012 | 63.0% | 107 | 0 | 0 | 68.4% | -5.4 |
| 6 | 4 | 12468 | 5884 | 67.9% | 111 | 0 | 0 | 65.7% | +2.2 |
| 7 | 4 | 11238 | 8063 | 58.2% | 12 | 0 | 0 | 63.5% | -5.3 |
| 8 | 6 | 10885 | 4203 | 72.1% | 115 | 0 | 0 | 69.5% | +2.6 |
| 9 | 3 | 12856 | 6402 | 66.8% | 110 | 0 | 0 | 63.9% | +2.9 |
| 10 | 5 | 11848 | 7308 | 61.9% | 98 | 0 | 0 | 61.9% | -0.1 |

Battles used against kc.micro.Figment 1.0: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 64.2% ± 3.2, baseline 63.5% ± 2.6, paired diff +0.7 ± 3.1.

Skipped turns: 869 over 10 battles (86.9 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1370 over 10 battles (137.0 per battle, most in one battle 474).

