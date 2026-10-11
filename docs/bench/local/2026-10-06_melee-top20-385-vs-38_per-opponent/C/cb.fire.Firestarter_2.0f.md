# cb.fire.Firestarter 2.0f in melee (C): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | cb.fire.Firestarter 2.0f score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11164 | 13063 | 46.1% | 93 | 4 | 1 | 37.7% | +8.4 |
| 2 | 5 | 10932 | 14158 | 43.6% | 12 | 2 | 0 | 46.7% | -3.1 |
| 3 | 6 | 11708 | 13204 | 47.0% | 92 | 2 | 0 | 48.5% | -1.5 |
| 4 | 4 | 12744 | 13123 | 49.3% | 92 | 4 | 2 | 47.3% | +2.0 |
| 5 | 7 | 9089 | 14241 | 39.0% | 5 | 0 | 0 | 40.6% | -1.6 |
| 6 | 5 | 6979 | 9226 | 43.1% | 96 | 2 | 0 | 44.2% | -1.1 |
| 7 | 2 | 7783 | 10389 | 42.8% | 94 | 1 | 0 | 40.6% | +2.3 |
| 8 | 6 | 11354 | 12314 | 48.0% | 94 | 0 | 0 | 48.3% | -0.4 |
| 9 | 4 | 11358 | 14196 | 44.4% | 97 | 2 | 0 | 42.8% | +1.7 |
| 10 | 7 | 7622 | 10832 | 41.3% | 6 | 1 | 0 | 44.8% | -3.5 |

Battles used against cb.fire.Firestarter 2.0f: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 44.4% ± 2.3, baseline 44.1% ± 2.6, paired diff +0.3 ± 2.5.

Skipped turns: 681 over 10 battles (68.1 per battle, most in one battle 97). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 487 over 10 battles (48.7 per battle, most in one battle 298).

