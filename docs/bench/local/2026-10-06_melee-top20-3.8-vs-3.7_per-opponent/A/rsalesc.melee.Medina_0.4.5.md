# rsalesc.melee.Medina 0.4.5 in melee (A): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | rsalesc.melee.Medina 0.4.5 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 4 | 10336 | 9877 | 51.1% | 97 | 0 | 0 | 60.3% | -9.2 |
| 2 | 5 | 10257 | 7634 | 57.3% | 9 | 1 | 0 | 51.8% | +5.6 |
| 3 | 4 | 10985 | 8707 | 55.8% | 111 | 0 | 0 | 60.7% | -4.9 |
| 4 | 3 | 11979 | 9787 | 55.0% | 106 | 0 | 0 | 57.2% | -2.1 |
| 5 | 8 | 9647 | 10165 | 48.7% | 6 | 0 | 0 | 53.2% | -4.5 |
| 6 | 3 | 11801 | 7067 | 62.5% | 96 | 0 | 0 | 51.8% | +10.8 |
| 7 | 4 | 11578 | 9147 | 55.9% | 9 | 1 | 1 | 58.1% | -2.2 |
| 8 | 5 | 11440 | 11535 | 49.8% | 94 | 1 | 0 | 54.5% | -4.7 |
| 9 | 7 | 9621 | 9373 | 50.7% | 13 | 0 | 0 | 53.5% | -2.9 |
| 10 | 3 | 12700 | 9581 | 57.0% | 96 | 0 | 0 | 45.3% | +11.7 |

Mean pairwise share 54.4% ± 3.1, baseline 54.6% ± 3.3, paired diff -0.2 ± 5.1.

Skipped turns: 637 over 10 battles (63.7 per battle, most in one battle 111). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 2116 over 10 battles (211.6 per battle, most in one battle 405).

