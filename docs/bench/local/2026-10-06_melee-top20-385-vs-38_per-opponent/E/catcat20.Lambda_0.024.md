# catcat20.Lambda 0.024 in melee (E): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | catcat20.Lambda 0.024 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11536 | 9319 | 55.3% | 104 | 1 | 1 | 57.8% | -2.5 |
| 2 | 8 | 9692 | 9035 | 51.8% | 4 | 0 | 0 | 56.3% | -4.5 |
| 3 | 5 | 10664 | 9660 | 52.5% | 96 | 1 | 1 | 58.9% | -6.4 |
| 4 | 7 | 9625 | 8182 | 54.1% | 95 | 1 | 0 | 52.3% | +1.8 |
| 5 | 6 | 4944 | 4319 | 53.4% | 5 | 0 | 0 | 55.1% | -1.7 |
| 6 | 9 | 3850 | 4425 | 46.5% | 2 | 0 | 0 | 54.8% | -8.2 |
| 7 | 5 | 10668 | 8124 | 56.8% | 6 | 0 | 0 | 49.4% | +7.4 |
| 8 | 4 | 11605 | 6993 | 62.4% | 99 | 0 | 0 | 56.7% | +5.7 |
| 9 | 6 | 10936 | 8259 | 57.0% | 89 | 1 | 0 | 45.8% | +11.2 |
| 10 | 2 | 2288 | 2060 | 52.6% | 4 | 1 | 0 | 50.9% | +1.7 |

Battles used against catcat20.Lambda 0.024: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 54.2% ± 3.0, baseline 53.8% ± 3.0, paired diff +0.4 ± 4.5.

Skipped turns: 504 over 10 battles (50.4 per battle, most in one battle 104). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 383 over 10 battles (38.3 per battle, most in one battle 143).

