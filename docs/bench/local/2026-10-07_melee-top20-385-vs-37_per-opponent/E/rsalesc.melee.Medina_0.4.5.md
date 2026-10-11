# rsalesc.melee.Medina 0.4.5 in melee (E): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | rsalesc.melee.Medina 0.4.5 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10876 | 6474 | 62.7% | 113 | 1 | 0 | 62.8% | -0.1 |
| 2 | 3 | 6210 | 3864 | 61.6% | 99 | 1 | 1 | 62.6% | -0.9 |
| 3 | 7 | 10364 | 8193 | 55.8% | 103 | 0 | 0 | 51.5% | +4.3 |
| 4 | 5 | 6599 | 4293 | 60.6% | 94 | 0 | 0 | 58.9% | +1.6 |
| 5 | 5 | 9889 | 6468 | 60.5% | 91 | 0 | 0 | 64.3% | -3.8 |
| 6 | 5 | 11147 | 6168 | 64.4% | 99 | 0 | 0 | 62.5% | +1.8 |
| 7 | 6 | 10234 | 7763 | 56.9% | 101 | 0 | 0 | 51.0% | +5.8 |
| 8 | 9 | 2256 | 2320 | 49.3% | 1 | 0 | 0 | 48.4% | +0.9 |
| 9 | 6 | 10752 | 6037 | 64.0% | 94 | 0 | 0 | 60.6% | +3.4 |
| 10 | 6 | 10843 | 8798 | 55.2% | 118 | 2 | 0 | 50.3% | +5.0 |

Battles used against rsalesc.melee.Medina 0.4.5: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 59.1% ± 3.4, baseline 57.3% ± 4.5, paired diff +1.8 ± 2.1.

Skipped turns: 913 over 10 battles (91.3 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 883 over 10 battles (88.3 per battle, most in one battle 298).

