# wompi.Wallaby 5.1 in melee (C): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | wompi.Wallaby 5.1 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11164 | 10599 | 51.3% | 93 | 1 | 1 | 32.7% | +18.6 |
| 2 | 5 | 10932 | 8324 | 56.8% | 12 | 2 | 1 | 60.5% | -3.7 |
| 3 | 6 | 11708 | 7606 | 60.6% | 92 | 0 | 0 | 55.2% | +5.4 |
| 4 | 4 | 12744 | 10094 | 55.8% | 92 | 1 | 0 | 52.4% | +3.4 |
| 5 | 7 | 9089 | 10277 | 46.9% | 5 | 0 | 0 | 50.7% | -3.7 |
| 6 | 5 | 6979 | 4144 | 62.7% | 96 | 0 | 0 | 58.8% | +3.9 |
| 7 | 2 | 7783 | 7136 | 52.2% | 94 | 1 | 1 | 54.1% | -1.9 |
| 8 | 6 | 11354 | 10387 | 52.2% | 94 | 0 | 0 | 47.6% | +4.7 |
| 9 | 4 | 11358 | 10342 | 52.3% | 97 | 1 | 0 | 51.7% | +0.6 |
| 10 | 7 | 7622 | 7051 | 51.9% | 6 | 0 | 0 | 55.7% | -3.8 |

Battles used against wompi.Wallaby 5.1: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 54.3% ± 3.4, baseline 51.9% ± 5.5, paired diff +2.4 ± 4.9.

Skipped turns: 681 over 10 battles (68.1 per battle, most in one battle 97). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 487 over 10 battles (48.7 per battle, most in one battle 298).

