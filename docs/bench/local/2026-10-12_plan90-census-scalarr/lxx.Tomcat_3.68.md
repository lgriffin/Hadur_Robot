# lxx.Tomcat 3.68 (rank10-band1) vs aaa.r.ScalarR 0.005h.053-noshield

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 69.0% | 85.7% | 54.3% | 30 / 35 | - | - | 6 | - | 2.20 / 816.1 |
| 2 | 68.1% | 82.9% | 53.8% | 29 / 35 | - | - | 7 | - | 2.21 / 238.0 |
| 3 | 74.1% | 97.1% | 52.2% | 34 / 35 | - | - | 9 | - | 2.24 / 502.7 |
| 4 | 69.8% | 85.7% | 54.5% | 30 / 35 | - | - | 11 | - | 2.14 / 508.6 |

Mean score share 70.3% ± 4.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 33 over 4 battles (8.3 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | rank10-band1 | 70.3% ± 4.2 | 87.9% ± 10.1 | 53.7% ± 1.7 | 123 / 140 | - | - | 33 | - | 2.24 / 816.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | 4 | 1432 | 14.8% | 78.7% | 0.1% | 6.4% | 2011 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | 4 | 4 | n/a | 0 | 0.24 | 0 | 0 | 0 |

4 of 4 battles trusted.
