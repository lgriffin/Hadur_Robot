# rz.Aleph 0.34 in melee (B): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | rz.Aleph 0.34 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10769 | 11358 | 48.7% | 104 | 1 | 1 | 48.0% | +0.7 |
| 2 | 5 | 11108 | 10504 | 51.4% | 110 | 1 | 0 | 48.3% | +3.1 |
| 3 | 6 | 11044 | 13409 | 45.2% | 95 | 1 | 0 | 48.5% | -3.3 |
| 4 | 6 | 11296 | 14435 | 43.9% | 104 | 1 | 1 | 40.7% | +3.2 |
| 5 | 6 | 10858 | 12335 | 46.8% | 102 | 0 | 0 | 42.2% | +4.6 |
| 6 | 6 | 11620 | 12926 | 47.3% | 88 | 0 | 0 | 44.7% | +2.7 |
| 7 | 6 | 11176 | 13254 | 45.7% | 5 | 0 | 0 | 45.3% | +0.4 |
| 8 | 6 | 10504 | 11769 | 47.2% | 77 | 0 | 0 | 45.7% | +1.5 |
| 9 | 5 | 10977 | 10984 | 50.0% | 102 | 0 | 0 | 45.3% | +4.7 |
| 10 | 6 | 11638 | 12803 | 47.6% | 72 | 0 | 0 | 46.8% | +0.8 |

Battles used against rz.Aleph 0.34: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 47.4% ± 1.6, baseline 45.5% ± 1.8, paired diff +1.8 ± 1.7.

Skipped turns: 859 over 10 battles (85.9 per battle, most in one battle 110). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 864 over 10 battles (86.4 per battle, most in one battle 236).

