# wompi.Numbat 2.1 in melee (E): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | wompi.Numbat 2.1 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10876 | 7727 | 58.5% | 113 | 0 | 0 | 57.8% | +0.6 |
| 2 | 3 | 6210 | 4799 | 56.4% | 99 | 0 | 0 | 55.8% | +0.6 |
| 3 | 7 | 10364 | 8322 | 55.5% | 103 | 0 | 0 | 45.5% | +10.0 |
| 4 | 5 | 6599 | 5892 | 52.8% | 94 | 0 | 0 | 51.4% | +1.5 |
| 5 | 5 | 9889 | 9748 | 50.4% | 91 | 0 | 0 | 56.6% | -6.2 |
| 6 | 5 | 11147 | 8654 | 56.3% | 99 | 0 | 0 | 52.0% | +4.3 |
| 7 | 6 | 10234 | 8673 | 54.1% | 101 | 0 | 0 | 53.0% | +1.2 |
| 8 | 9 | 2256 | 2760 | 45.0% | 1 | 0 | 0 | 53.9% | -8.9 |
| 9 | 6 | 10752 | 10135 | 51.5% | 94 | 1 | 0 | 56.4% | -4.9 |
| 10 | 6 | 10843 | 8101 | 57.2% | 118 | 0 | 0 | 51.8% | +5.4 |

Battles used against wompi.Numbat 2.1: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 53.8% ± 2.9, baseline 53.4% ± 2.6, paired diff +0.4 ± 4.1.

Skipped turns: 913 over 10 battles (91.3 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 883 over 10 battles (88.3 per battle, most in one battle 298).

