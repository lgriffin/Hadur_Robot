# nz.A7Ibwenape A7Ibwen1.0 (rank1197-band6) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 99.3% | 100.0% | 98.6% | 35 / 35 | - | - | 1 | - | 0.82 / 642.9 | 97.2% | +2.0 |
| 2 | 97.5% | 97.1% | 97.2% | 34 / 35 | - | - | 383 | - | 0.91 / 1097.1 | 99.0% | -1.5 |
| 3 | 99.2% | 100.0% | 98.5% | 35 / 35 | - | - | 2 | - | 0.79 / 835.2 | 98.1% | +1.1 |
| 4 | 96.8% | 94.3% | 97.9% | 33 / 35 | - | - | 382 | - | 0.89 / 897.1 | 99.1% | -2.3 |

Mean score share 98.2% ± 2.0, baseline 98.4% ± 1.4, paired diff -0.2 ± 3.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 768 over 4 battles (192.0 per battle, most in one battle 383). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| nz.A7Ibwenape A7Ibwen1.0 | rank1197-band6 | 98.2% ± 2.0 | 97.9% ± 4.4 | 98.1% ± 1.0 | 137 / 140 | - | - | 768 | - | 0.91 / 1097.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| nz.A7Ibwenape A7Ibwen1.0 | 4 | 105 | 35.8% | 56.8% | 0.2% | 7.2% | 463 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| nz.A7Ibwenape A7Ibwen1.0 | 4 | 2 | n/a | 2 | 5.49 | 0 | 0 | 0 |

2 of 4 battles trusted.
