# xander.cat.XanderCat 12.9 (rank9-band1) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 61.3% | 65.7% | 56.4% | 23 / 35 | - | - | 96 | - | 1.28 / 437.8 | 56.1% | +5.2 |
| 2 | 52.3% | 51.4% | 52.8% | 18 / 35 | - | - | 108 | - | 1.36 / 839.8 | 58.7% | -6.4 |
| 3 | 65.2% | 71.4% | 58.7% | 25 / 35 | - | - | 82 | - | 1.31 / 829.6 | 50.4% | +14.8 |
| 4 | 55.0% | 57.1% | 52.1% | 20 / 35 | - | - | 198 | - | 1.35 / 568.3 | 52.9% | +2.1 |

Mean score share 58.5% ± 9.3, baseline 54.5% ± 5.8, paired diff +3.9 ± 13.9.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 484 over 4 battles (121.0 per battle, most in one battle 198). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | rank9-band1 | 58.5% ± 9.3 | 61.4% ± 14.1 | 55.0% ± 4.9 | 86 / 140 | - | - | 484 | - | 1.36 / 839.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | 4 | 2034 | 33.2% | 55.0% | 0.0% | 11.9% | 1349 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | 4 | 0 | n/a | 0 | 3.46 | 0 | 0 | 0 |

0 of 4 battles trusted.
