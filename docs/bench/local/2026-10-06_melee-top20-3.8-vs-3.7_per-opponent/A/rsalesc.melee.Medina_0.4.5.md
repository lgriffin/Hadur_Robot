# rsalesc.melee.Medina 0.4.5 in melee (A): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | rsalesc.melee.Medina 0.4.5 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 7 | 10554 | 12129 | 46.5% | 6 | 0 | 0 | 46.8% | -0.2 |
| 2 | 4 | 10860 | 10181 | 51.6% | 114 | 0 | 0 | 50.2% | +1.4 |
| 3 | 3 | 11010 | 7967 | 58.0% | 10 | 0 | 0 | 52.8% | +5.3 |
| 4 | 3 | 11527 | 7528 | 60.5% | 122 | 0 | 0 | 49.4% | +11.1 |
| 5 | 4 | 11438 | 8667 | 56.9% | 12 | 1 | 0 | 58.2% | -1.3 |
| 6 | 5 | 10723 | 9825 | 52.2% | 9 | 2 | 1 | 48.5% | +3.7 |
| 7 | 3 | 11526 | 11125 | 50.9% | 118 | 1 | 0 | 57.2% | -6.4 |
| 8 | 8 | 9266 | 10517 | 46.8% | 99 | 0 | 0 | 56.6% | -9.8 |
| 9 | 5 | 11431 | 7368 | 60.8% | 128 | 1 | 1 | 50.9% | +9.9 |
| 10 | 6 | 11048 | 7770 | 58.7% | 120 | 0 | 0 | 54.5% | +4.2 |

Mean pairwise share 54.3% ± 3.8, baseline 52.5% ± 2.8, paired diff +1.8 ± 4.7.

Skipped turns: 738 over 10 battles (73.8 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 2390 over 10 battles (239.0 per battle, most in one battle 811).

