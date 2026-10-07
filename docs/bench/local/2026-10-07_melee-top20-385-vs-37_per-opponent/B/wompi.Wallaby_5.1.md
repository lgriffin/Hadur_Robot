# wompi.Wallaby 5.1 in melee (B): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | wompi.Wallaby 5.1 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10769 | 10186 | 51.4% | 104 | 0 | 0 | 56.6% | -5.2 |
| 2 | 5 | 11108 | 9513 | 53.9% | 110 | 1 | 0 | 53.9% | +0.0 |
| 3 | 6 | 11044 | 8698 | 55.9% | 95 | 1 | 0 | 51.7% | +4.2 |
| 4 | 6 | 11296 | 10013 | 53.0% | 104 | 1 | 0 | 48.5% | +4.5 |
| 5 | 6 | 10858 | 10765 | 50.2% | 102 | 0 | 0 | 52.4% | -2.2 |
| 6 | 6 | 11620 | 9259 | 55.7% | 88 | 0 | 0 | 52.4% | +3.2 |
| 7 | 6 | 11176 | 8600 | 56.5% | 5 | 0 | 0 | 52.2% | +4.3 |
| 8 | 6 | 10504 | 9698 | 52.0% | 77 | 0 | 0 | 53.1% | -1.1 |
| 9 | 5 | 10977 | 8374 | 56.7% | 102 | 0 | 0 | 52.0% | +4.7 |
| 10 | 6 | 11638 | 9680 | 54.6% | 72 | 0 | 0 | 56.8% | -2.2 |

Battles used against wompi.Wallaby 5.1: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 54.0% ± 1.6, baseline 53.0% ± 1.7, paired diff +1.0 ± 2.6.

Skipped turns: 859 over 10 battles (85.9 per battle, most in one battle 110). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 864 over 10 battles (86.4 per battle, most in one battle 236).

