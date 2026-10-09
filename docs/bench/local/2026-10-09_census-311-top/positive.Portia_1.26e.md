# positive.Portia 1.26e (rank63-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 68.3% | 85.7% | 52.3% | 30 / 35 | - | - | 204 | - | 1.03 / 1570.7 | 75.7% | -7.4 |
| 2 | 60.0% | 68.6% | 51.9% | 24 / 35 | - | - | 23 | - | 1.05 / 897.3 | 72.2% | -12.3 |
| 3 | 60.4% | 71.4% | 49.9% | 25 / 35 | - | - | 209 | - | 1.08 / 1419.3 | 78.1% | -17.6 |
| 4 | 66.0% | 77.1% | 55.6% | 27 / 35 | - | - | 33 | - | 1.11 / 689.2 | 78.0% | -11.9 |

Mean score share 63.7% ± 6.6, baseline 76.0% ± 4.3, paired diff -12.3 ± 6.7.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 469 over 4 battles (117.3 per battle, most in one battle 209). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| positive.Portia 1.26e | rank63-band3 | 63.7% ± 6.6 | 75.7% ± 12.0 | 52.4% ± 3.7 | 106 / 140 | - | - | 469 | - | 1.11 / 1570.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| positive.Portia 1.26e | 4 | 1765 | 24.1% | 66.3% | 0.0% | 9.6% | 956 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| positive.Portia 1.26e | 4 | 2 | n/a | 2 | 3.35 | 0 | 0 | 0 |

2 of 4 battles trusted.
