# rz.Aleph 0.34 in melee (E): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | rz.Aleph 0.34 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 5 | 11536 | 10628 | 52.0% | 104 | 0 | 0 | 48.8% | +3.2 |
| 2 | 8 | 9692 | 10532 | 47.9% | 4 | 0 | 0 | 51.3% | -3.4 |
| 3 | 5 | 10664 | 10216 | 51.1% | 96 | 0 | 0 | 49.9% | +1.1 |
| 4 | 7 | 9625 | 10544 | 47.7% | 95 | 0 | 0 | 45.4% | +2.4 |
| 5 | 6 | 4944 | 5880 | 45.7% | 5 | 0 | 0 | 54.9% | -9.2 |
| 6 | 9 | 3850 | 3702 | 51.0% | 2 | 0 | 0 | 47.4% | +3.6 |
| 7 | 5 | 10668 | 10315 | 50.8% | 6 | 1 | 0 | 45.4% | +5.4 |
| 8 | 4 | 11605 | 11518 | 50.2% | 99 | 1 | 1 | 44.8% | +5.4 |
| 9 | 6 | 10936 | 8569 | 56.1% | 89 | 0 | 0 | 45.3% | +10.8 |
| 10 | 2 | 2288 | 2231 | 50.6% | 4 | 0 | 0 | 39.9% | +10.7 |

Battles used against rz.Aleph 0.34: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 50.3% ± 2.0, baseline 47.3% ± 3.0, paired diff +3.0 ± 4.3.

Skipped turns: 504 over 10 battles (50.4 per battle, most in one battle 104). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 383 over 10 battles (38.3 per battle, most in one battle 143).

