# abc.Shadow 3.84i in melee (B): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | abc.Shadow 3.84i score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10654 | 10786 | 49.7% | 85 | 1 | 0 | 46.9% | +2.8 |
| 2 | 6 | 11117 | 12440 | 47.2% | 7 | 1 | 0 | 51.8% | -4.6 |
| 3 | 6 | 10969 | 15152 | 42.0% | 100 | 2 | 0 | 48.2% | -6.2 |
| 4 | 5 | 11181 | 12947 | 46.3% | 11 | 1 | 0 | 46.7% | -0.4 |
| 5 | 6 | 9696 | 11490 | 45.8% | 3 | 0 | 0 | 45.0% | +0.8 |
| 6 | 6 | 11491 | 11923 | 49.1% | 121 | 0 | 0 | 45.2% | +3.9 |
| 7 | 6 | 10898 | 11232 | 49.2% | 7 | 0 | 0 | 43.4% | +5.8 |
| 8 | 7 | 8913 | 13137 | 40.4% | 5 | 1 | 0 | 45.1% | -4.7 |
| 9 | 6 | 10193 | 13529 | 43.0% | 91 | 1 | 1 | 51.9% | -8.9 |
| 10 | 6 | 12149 | 13007 | 48.3% | 96 | 2 | 2 | 47.8% | +0.5 |

Battles used against abc.Shadow 3.84i: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 46.1% ± 2.3, baseline 47.2% ± 2.0, paired diff -1.1 ± 3.4.

Skipped turns: 526 over 10 battles (52.6 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1467 over 10 battles (146.7 per battle, most in one battle 298).

