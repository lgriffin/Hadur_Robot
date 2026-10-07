# kc.mini.Mirage 0.2 in melee (B): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | kc.mini.Mirage 0.2 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10654 | 11651 | 47.8% | 85 | 0 | 0 | 43.4% | +4.3 |
| 2 | 6 | 11117 | 13703 | 44.8% | 7 | 0 | 0 | 44.6% | +0.2 |
| 3 | 6 | 10969 | 12579 | 46.6% | 100 | 0 | 0 | 48.2% | -1.6 |
| 4 | 5 | 11181 | 10691 | 51.1% | 11 | 0 | 0 | 42.0% | +9.2 |
| 5 | 6 | 9696 | 14855 | 39.5% | 3 | 1 | 0 | 45.2% | -5.7 |
| 6 | 6 | 11491 | 13343 | 46.3% | 121 | 0 | 0 | 50.8% | -4.5 |
| 7 | 6 | 10898 | 12683 | 46.2% | 7 | 1 | 0 | 41.6% | +4.6 |
| 8 | 7 | 8913 | 13698 | 39.4% | 5 | 0 | 0 | 42.5% | -3.1 |
| 9 | 6 | 10193 | 13472 | 43.1% | 91 | 1 | 0 | 48.8% | -5.7 |
| 10 | 6 | 12149 | 12731 | 48.8% | 96 | 1 | 0 | 46.9% | +2.0 |

Battles used against kc.mini.Mirage 0.2: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 45.4% ± 2.7, baseline 45.4% ± 2.2, paired diff -0.0 ± 3.6.

Skipped turns: 526 over 10 battles (52.6 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1467 over 10 battles (146.7 per battle, most in one battle 298).

