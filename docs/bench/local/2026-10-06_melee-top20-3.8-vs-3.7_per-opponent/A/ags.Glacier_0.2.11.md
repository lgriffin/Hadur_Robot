# ags.Glacier 0.2.11 in melee (A): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | ags.Glacier 0.2.11 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 4 | 10336 | 11388 | 47.6% | 97 | 2 | 1 | 54.2% | -6.6 |
| 2 | 5 | 10257 | 10325 | 49.8% | 9 | 0 | 0 | 48.4% | +1.4 |
| 3 | 4 | 10985 | 11393 | 49.1% | 111 | 1 | 1 | 54.8% | -5.7 |
| 4 | 3 | 11979 | 11802 | 50.4% | 106 | 0 | 0 | 52.0% | -1.6 |
| 5 | 8 | 9647 | 11332 | 46.0% | 6 | 1 | 0 | 53.6% | -7.6 |
| 6 | 3 | 11801 | 10847 | 52.1% | 96 | 0 | 0 | 51.7% | +0.4 |
| 7 | 4 | 11578 | 12752 | 47.6% | 9 | 0 | 0 | 51.1% | -3.5 |
| 8 | 5 | 11440 | 10937 | 51.1% | 94 | 1 | 0 | 51.6% | -0.5 |
| 9 | 7 | 9621 | 12208 | 44.1% | 13 | 1 | 0 | 45.1% | -1.0 |
| 10 | 3 | 12700 | 11238 | 53.1% | 96 | 0 | 0 | 45.5% | +7.5 |

Mean pairwise share 49.1% ± 2.0, baseline 50.8% ± 2.4, paired diff -1.7 ± 3.2.

Skipped turns: 637 over 10 battles (63.7 per battle, most in one battle 111). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 2116 over 10 battles (211.6 per battle, most in one battle 405).

