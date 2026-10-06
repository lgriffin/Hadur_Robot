# jk.melee.Neuromancer 7.12 in melee (A): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | jk.melee.Neuromancer 7.12 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 4 | 10336 | 14820 | 41.1% | 97 | 0 | 0 | 42.1% | -1.0 |
| 2 | 5 | 10257 | 17616 | 36.8% | 9 | 1 | 0 | 46.0% | -9.2 |
| 3 | 4 | 10985 | 18038 | 37.8% | 111 | 3 | 0 | 41.9% | -4.1 |
| 4 | 3 | 11979 | 16917 | 41.5% | 106 | 2 | 0 | 46.1% | -4.6 |
| 5 | 8 | 9647 | 13735 | 41.3% | 6 | 0 | 0 | 45.2% | -4.0 |
| 6 | 3 | 11801 | 17348 | 40.5% | 96 | 1 | 0 | 44.1% | -3.6 |
| 7 | 4 | 11578 | 13425 | 46.3% | 9 | 2 | 0 | 42.1% | +4.2 |
| 8 | 5 | 11440 | 14675 | 43.8% | 94 | 2 | 1 | 39.5% | +4.3 |
| 9 | 7 | 9621 | 13402 | 41.8% | 13 | 4 | 0 | 46.5% | -4.8 |
| 10 | 3 | 12700 | 15314 | 45.3% | 96 | 1 | 1 | 43.2% | +2.1 |

Mean pairwise share 41.6% ± 2.1, baseline 43.7% ± 1.7, paired diff -2.1 ± 3.1.

Skipped turns: 637 over 10 battles (63.7 per battle, most in one battle 111). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 2116 over 10 battles (211.6 per battle, most in one battle 405).

