# ds.Versatile RB1.0.1 (rank184-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 83.6% | 94.3% | 73.1% | 33 / 35 | - | - | 20 | - | 1.28 / 184.1 | 87.5% | -3.9 |
| 2 | 83.9% | 94.3% | 73.7% | 33 / 35 | - | - | 17 | - | 1.26 / 1664.8 | 86.6% | -2.7 |
| 3 | 86.3% | 97.1% | 75.6% | 34 / 35 | - | - | 24 | - | 1.28 / 289.0 | 84.6% | +1.6 |
| 4 | 87.5% | 100.0% | 75.3% | 35 / 35 | - | - | 19 | - | 1.29 / 1638.2 | 87.7% | -0.3 |

Mean score share 85.3% ± 3.0, baseline 86.6% ± 2.2, paired diff -1.3 ± 3.9.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 80 over 4 battles (20.0 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ds.Versatile RB1.0.1 | rank184-band3 | 85.3% ± 3.0 | 96.4% ± 4.4 | 74.4% ± 1.9 | 135 / 140 | - | - | 80 | - | 1.29 / 1664.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ds.Versatile RB1.0.1 | 4 | 740 | 8.4% | 88.1% | 0.0% | 3.5% | 844 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ds.Versatile RB1.0.1 | 4 | 4 | n/a | 0 | 0.57 | 0 | 0 | 0 |

4 of 4 battles trusted.
