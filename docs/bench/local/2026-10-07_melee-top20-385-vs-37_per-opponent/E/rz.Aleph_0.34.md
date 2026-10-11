# rz.Aleph 0.34 in melee (E): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | rz.Aleph 0.34 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10876 | 10440 | 51.0% | 113 | 0 | 0 | 57.9% | -6.8 |
| 2 | 3 | 6210 | 3778 | 62.2% | 99 | 0 | 0 | 49.4% | +12.7 |
| 3 | 7 | 10364 | 10610 | 49.4% | 103 | 1 | 1 | 46.6% | +2.8 |
| 4 | 5 | 6599 | 6343 | 51.0% | 94 | 0 | 0 | 50.9% | +0.1 |
| 5 | 5 | 9889 | 9207 | 51.8% | 91 | 0 | 0 | 49.5% | +2.3 |
| 6 | 5 | 11147 | 11171 | 49.9% | 99 | 1 | 1 | 54.8% | -4.9 |
| 7 | 6 | 10234 | 10489 | 49.4% | 101 | 0 | 0 | 45.4% | +4.0 |
| 8 | 9 | 2256 | 2613 | 46.3% | 1 | 0 | 0 | 50.7% | -4.4 |
| 9 | 6 | 10752 | 9331 | 53.5% | 94 | 1 | 0 | 54.1% | -0.6 |
| 10 | 6 | 10843 | 8456 | 56.2% | 118 | 1 | 1 | 47.9% | +8.2 |

Battles used against rz.Aleph 0.34: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 52.1% ± 3.2, baseline 50.7% ± 2.8, paired diff +1.3 ± 4.3.

Skipped turns: 913 over 10 battles (91.3 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 883 over 10 battles (88.3 per battle, most in one battle 298).

