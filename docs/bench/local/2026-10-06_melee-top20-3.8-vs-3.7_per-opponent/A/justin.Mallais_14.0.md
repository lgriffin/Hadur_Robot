# justin.Mallais 14.0 in melee (A): hadur2.Hadur 3.8

35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 5. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Hadur place | Hadur score | justin.Mallais 14.0 score | Pairwise share | Skipped turns | Rounds as a duel with it | Hadur won those | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 4 | 10336 | 9976 | 50.9% | 97 | 0 | 0 | 51.1% | -0.2 |
| 2 | 5 | 10257 | 9425 | 52.1% | 9 | 1 | 0 | 54.6% | -2.5 |
| 3 | 4 | 10985 | 9147 | 54.6% | 111 | 1 | 0 | 53.9% | +0.6 |
| 4 | 3 | 11979 | 10759 | 52.7% | 106 | 1 | 0 | 52.7% | -0.0 |
| 5 | 8 | 9647 | 10305 | 48.4% | 6 | 0 | 0 | 55.3% | -7.0 |
| 6 | 3 | 11801 | 10338 | 53.3% | 96 | 0 | 0 | 53.7% | -0.4 |
| 7 | 4 | 11578 | 8463 | 57.8% | 9 | 0 | 0 | 53.0% | +4.8 |
| 8 | 5 | 11440 | 12457 | 47.9% | 94 | 0 | 0 | 47.7% | +0.2 |
| 9 | 7 | 9621 | 13487 | 41.6% | 13 | 1 | 0 | 50.3% | -8.7 |
| 10 | 3 | 12700 | 8874 | 58.9% | 96 | 0 | 0 | 50.2% | +8.7 |

Mean pairwise share 51.8% ± 3.6, baseline 52.2% ± 1.7, paired diff -0.4 ± 3.6.

Skipped turns: 637 over 10 battles (63.7 per battle, most in one battle 111). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 2116 over 10 battles (211.6 per battle, most in one battle 405).

