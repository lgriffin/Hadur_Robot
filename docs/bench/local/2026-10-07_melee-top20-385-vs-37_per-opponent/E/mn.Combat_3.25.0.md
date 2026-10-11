# mn.Combat 3.25.0 in melee (E): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | mn.Combat 3.25.0 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10876 | 11261 | 49.1% | 113 | 0 | 0 | 50.6% | -1.5 |
| 2 | 3 | 6210 | 5097 | 54.9% | 99 | 0 | 0 | 46.7% | +8.2 |
| 3 | 7 | 10364 | 10620 | 49.4% | 103 | 1 | 0 | 48.0% | +1.3 |
| 4 | 5 | 6599 | 6499 | 50.4% | 94 | 1 | 1 | 46.3% | +4.1 |
| 5 | 5 | 9889 | 10812 | 47.8% | 91 | 0 | 0 | 53.1% | -5.3 |
| 6 | 5 | 11147 | 10211 | 52.2% | 99 | 1 | 0 | 40.3% | +11.9 |
| 7 | 6 | 10234 | 9684 | 51.4% | 101 | 1 | 0 | 48.1% | +3.3 |
| 8 | 9 | 2256 | 1799 | 55.6% | 1 | 0 | 0 | 52.6% | +3.1 |
| 9 | 6 | 10752 | 12852 | 45.6% | 94 | 0 | 0 | 51.5% | -5.9 |
| 10 | 6 | 10843 | 12966 | 45.5% | 118 | 0 | 0 | 42.8% | +2.8 |

Battles used against mn.Combat 3.25.0: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 50.2% ± 2.5, baseline 48.0% ± 3.0, paired diff +2.2 ± 3.9.

Skipped turns: 913 over 10 battles (91.3 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 883 over 10 battles (88.3 per battle, most in one battle 298).

