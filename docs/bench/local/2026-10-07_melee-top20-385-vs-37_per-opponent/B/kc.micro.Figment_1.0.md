# kc.micro.Figment 1.0 in melee (B): hadur2.Hadur 3.8.5

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Hadur place | Hadur score | kc.micro.Figment 1.0 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 6 | 10769 | 7077 | 60.3% | 104 | 0 | 0 | 61.5% | -1.2 |
| 2 | 5 | 11108 | 6522 | 63.0% | 110 | 1 | 1 | 54.7% | +8.3 |
| 3 | 6 | 11044 | 7462 | 59.7% | 95 | 0 | 0 | 60.9% | -1.2 |
| 4 | 6 | 11296 | 8105 | 58.2% | 104 | 0 | 0 | 56.6% | +1.6 |
| 5 | 6 | 10858 | 6751 | 61.7% | 102 | 0 | 0 | 57.1% | +4.6 |
| 6 | 6 | 11620 | 7849 | 59.7% | 88 | 0 | 0 | 54.0% | +5.7 |
| 7 | 6 | 11176 | 7652 | 59.4% | 5 | 1 | 0 | 49.7% | +9.7 |
| 8 | 6 | 10504 | 6284 | 62.6% | 77 | 0 | 0 | 57.0% | +5.6 |
| 9 | 5 | 10977 | 7053 | 60.9% | 102 | 0 | 0 | 63.1% | -2.2 |
| 10 | 6 | 11638 | 6186 | 65.3% | 72 | 0 | 0 | 63.2% | +2.1 |

Battles used against kc.micro.Figment 1.0: candidate 10 of 10, baseline 10 of 10, 10 paired seeds.

Mean pairwise share 61.1% ± 1.5, baseline 57.8% ± 3.1, paired diff +3.3 ± 2.9.

Skipped turns: 859 over 10 battles (85.9 per battle, most in one battle 110). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 864 over 10 battles (86.4 per battle, most in one battle 236).

