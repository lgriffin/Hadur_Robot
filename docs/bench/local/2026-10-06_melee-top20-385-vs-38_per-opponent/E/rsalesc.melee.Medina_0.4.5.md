# rsalesc.melee.Medina 0.4.5 in melee (E): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | rsalesc.melee.Medina 0.4.5 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11536 | 9700 | 54.3% | 104 | 0 | 0 | 59.3% | -5.0 |
| 2 | 8 | 9692 | 8562 | 53.1% | 4 | 1 | 0 | 56.9% | -3.8 |
| 3 | 5 | 10664 | 8714 | 55.0% | 96 | 0 | 0 | 57.3% | -2.3 |
| 4 | 7 | 9625 | 7513 | 56.2% | 95 | 0 | 0 | 49.5% | +6.6 |
| 5 | 6 | 4944 | 2936 | 62.7% | 5 | 0 | 0 | 60.3% | +2.4 |
| 6 | 9 | 3850 | 4295 | 47.3% | 2 | 0 | 0 | 46.6% | +0.7 |
| 7 | 5 | 10668 | 8858 | 54.6% | 6 | 1 | 0 | 51.9% | +2.7 |
| 8 | 4 | 11605 | 9202 | 55.8% | 99 | 0 | 0 | 58.4% | -2.6 |
| 9 | 6 | 10936 | 8338 | 56.7% | 89 | 0 | 0 | 52.9% | +3.8 |
| 10 | 2 | 2288 | 1357 | 62.8% | 4 | 1 | 0 | 51.5% | +11.2 |

Battles used against rsalesc.melee.Medina 0.4.5: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 55.9% ± 3.2, baseline 54.5% ± 3.3, paired diff +1.4 ± 3.6.

Skipped turns: 504 over 10 battles (50.4 per battle, most in one battle 104). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 383 over 10 battles (38.3 per battle, most in one battle 143).

