# wompi.Wallaby 5.1 in melee (B): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | wompi.Wallaby 5.1 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10654 | 9653 | 52.5% | 85 | 0 | 0 | 54.5% | -2.0 |
| 2 | 6 | 11117 | 9782 | 53.2% | 7 | 0 | 0 | 56.4% | -3.2 |
| 3 | 6 | 10969 | 8455 | 56.5% | 100 | 0 | 0 | 60.9% | -4.4 |
| 4 | 5 | 11181 | 10293 | 52.1% | 11 | 1 | 0 | 50.3% | +1.8 |
| 5 | 6 | 9696 | 7344 | 56.9% | 3 | 0 | 0 | 47.9% | +9.0 |
| 6 | 6 | 11491 | 8766 | 56.7% | 121 | 2 | 2 | 55.0% | +1.8 |
| 7 | 6 | 10898 | 7947 | 57.8% | 7 | 0 | 0 | 54.3% | +3.6 |
| 8 | 7 | 8913 | 8016 | 52.6% | 5 | 0 | 0 | 54.3% | -1.6 |
| 9 | 6 | 10193 | 8666 | 54.0% | 91 | 0 | 0 | 55.5% | -1.5 |
| 10 | 6 | 12149 | 8921 | 57.7% | 96 | 0 | 0 | 52.3% | +5.4 |

Battles used against wompi.Wallaby 5.1: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 55.0% ± 1.7, baseline 54.1% ± 2.5, paired diff +0.9 ± 3.0.

Skipped turns: 526 over 10 battles (52.6 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1467 over 10 battles (146.7 per battle, most in one battle 298).

