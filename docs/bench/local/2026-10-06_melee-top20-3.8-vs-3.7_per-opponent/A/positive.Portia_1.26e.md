# positive.Portia 1.26e in melee (A): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | positive.Portia 1.26e score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 4 | 10336 | 10173 | 50.4% | 97 | 0 | 0 | 56.4% | -6.0 |
| 2 | 5 | 10257 | 12203 | 45.7% | 9 | 1 | 0 | 51.0% | -5.3 |
| 3 | 4 | 10985 | 9296 | 54.2% | 111 | 1 | 1 | 53.7% | +0.5 |
| 4 | 3 | 11979 | 11035 | 52.1% | 106 | 0 | 0 | 52.5% | -0.5 |
| 5 | 8 | 9647 | 11650 | 45.3% | 6 | 0 | 0 | 60.3% | -15.0 |
| 6 | 3 | 11801 | 10814 | 52.2% | 96 | 0 | 0 | 54.9% | -2.7 |
| 7 | 4 | 11578 | 8007 | 59.1% | 9 | 0 | 0 | 52.3% | +6.8 |
| 8 | 5 | 11440 | 8932 | 56.2% | 94 | 0 | 0 | 49.5% | +6.6 |
| 9 | 7 | 9621 | 9971 | 49.1% | 13 | 0 | 0 | 51.1% | -1.9 |
| 10 | 3 | 12700 | 9351 | 57.6% | 96 | 1 | 1 | 46.3% | +11.3 |

Mean pairwise share 52.2% ± 3.4, baseline 52.8% ± 2.8, paired diff -0.6 ± 5.4.

Skipped turns: 637 over 10 battles (63.7 per battle, most in one battle 111). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 2116 over 10 battles (211.6 per battle, most in one battle 405).

