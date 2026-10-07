# abc.Shadow 3.84i in melee (C): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | abc.Shadow 3.84i score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11164 | 12478 | 47.2% | 93 | 0 | 0 | 34.5% | +12.7 |
| 2 | 5 | 10932 | 12940 | 45.8% | 12 | 1 | 0 | 49.7% | -3.9 |
| 3 | 6 | 11708 | 13467 | 46.5% | 92 | 1 | 1 | 43.2% | +3.3 |
| 4 | 4 | 12744 | 13346 | 48.8% | 92 | 2 | 0 | 44.9% | +4.0 |
| 5 | 7 | 9089 | 10947 | 45.4% | 5 | 1 | 0 | 43.3% | +2.1 |
| 6 | 5 | 6979 | 7597 | 47.9% | 96 | 2 | 1 | 45.0% | +2.8 |
| 7 | 2 | 7783 | 6820 | 53.3% | 94 | 1 | 0 | 45.9% | +7.4 |
| 8 | 6 | 11354 | 12776 | 47.1% | 94 | 3 | 2 | 48.0% | -1.0 |
| 9 | 4 | 11358 | 11327 | 50.1% | 97 | 3 | 0 | 46.4% | +3.7 |
| 10 | 7 | 7622 | 8085 | 48.5% | 6 | 0 | 0 | 43.7% | +4.9 |

Battles used against abc.Shadow 3.84i: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 48.1% ± 1.7, baseline 44.5% ± 2.9, paired diff +3.6 ± 3.2.

Skipped turns: 681 over 10 battles (68.1 per battle, most in one battle 97). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 487 over 10 battles (48.7 per battle, most in one battle 298).

