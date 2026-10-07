# kc.mini.Mirage 0.2 in melee (D): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | kc.mini.Mirage 0.2 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 3 | 12139 | 11095 | 52.2% | 114 | 1 | 1 | 42.8% | +9.5 |
| 2 | 5 | 11040 | 12920 | 46.1% | 103 | 1 | 0 | 52.2% | -6.2 |
| 3 | 6 | 11176 | 12242 | 47.7% | 103 | 1 | 0 | 49.4% | -1.7 |
| 4 | 5 | 11569 | 13292 | 46.5% | 99 | 0 | 0 | 47.2% | -0.7 |
| 5 | 3 | 12478 | 12183 | 50.6% | 93 | 0 | 0 | 48.9% | +1.7 |
| 6 | 7 | 10019 | 12987 | 43.5% | 91 | 2 | 1 | 51.8% | -8.2 |
| 7 | 3 | 12190 | 11786 | 50.8% | 115 | 1 | 1 | 42.9% | +7.9 |
| 8 | 4 | 11153 | 10522 | 51.5% | 102 | 0 | 0 | 52.5% | -1.1 |
| 9 | 7 | 10591 | 13410 | 44.1% | 9 | 1 | 0 | 51.4% | -7.2 |
| 10 | 2 | 12720 | 11586 | 52.3% | 91 | 0 | 0 | 49.4% | +3.0 |

Battles used against kc.mini.Mirage 0.2: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 48.5% ± 2.4, baseline 48.9% ± 2.6, paired diff -0.3 ± 4.3.

Skipped turns: 920 over 10 battles (92.0 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 1554 over 10 battles (155.4 per battle, most in one battle 298).

