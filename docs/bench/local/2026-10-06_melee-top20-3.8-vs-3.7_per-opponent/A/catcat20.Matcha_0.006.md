# catcat20.Matcha 0.006 in melee (A): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | catcat20.Matcha 0.006 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 4 | 10336 | 9596 | 51.9% | 97 | 0 | 0 | 58.2% | -6.4 |
| 2 | 5 | 10257 | 9121 | 52.9% | 9 | 0 | 0 | 51.8% | +1.1 |
| 3 | 4 | 10985 | 10116 | 52.1% | 111 | 1 | 0 | 54.1% | -2.0 |
| 4 | 3 | 11979 | 9462 | 55.9% | 106 | 0 | 0 | 53.5% | +2.3 |
| 5 | 8 | 9647 | 11078 | 46.5% | 6 | 0 | 0 | 61.6% | -15.1 |
| 6 | 3 | 11801 | 9123 | 56.4% | 96 | 0 | 0 | 56.1% | +0.3 |
| 7 | 4 | 11578 | 11067 | 51.1% | 9 | 2 | 0 | 56.2% | -5.1 |
| 8 | 5 | 11440 | 9995 | 53.4% | 94 | 0 | 0 | 52.2% | +1.2 |
| 9 | 7 | 9621 | 11753 | 45.0% | 13 | 1 | 0 | 60.4% | -15.4 |
| 10 | 3 | 12700 | 8908 | 58.8% | 96 | 1 | 0 | 48.1% | +10.7 |

Mean pairwise share 52.4% ± 3.0, baseline 55.2% ± 3.0, paired diff -2.8 ± 5.7.

Skipped turns: 637 over 10 battles (63.7 per battle, most in one battle 111). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 2116 over 10 battles (211.6 per battle, most in one battle 405).

