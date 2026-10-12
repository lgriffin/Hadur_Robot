# lxx.Tomcat 3.68 (rank10-band1) vs voidious.Diamond 1.8.22

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 69.2% | 85.7% | 53.2% | 30 / 35 | - | - | 12 | - | 1.96 / 736.8 |
| 2 | 61.6% | 79.4% | 45.8% | 28 / 35 | - | - | 14 | - | 1.97 / 816.7 |
| 3 | 65.4% | 77.1% | 54.0% | 27 / 35 | - | - | 24 | - | 1.98 / 716.6 |
| 4 | 63.0% | 73.5% | 52.2% | 26 / 35 | - | - | 35 | - | 2.04 / 766.3 |

Mean score share 64.8% ± 5.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 85 over 4 battles (21.3 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | rank10-band1 | 64.8% ± 5.3 | 78.9% ± 8.1 | 51.3% ± 5.9 | 111 / 140 | - | - | 85 | - | 2.04 / 816.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | 4 | 1616 | 22.4% | 68.1% | 0.1% | 9.3% | 1894 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | 4 | 4 | n/a | 0 | 0.61 | 0 | 0 | 0 |

4 of 4 battles trusted.
