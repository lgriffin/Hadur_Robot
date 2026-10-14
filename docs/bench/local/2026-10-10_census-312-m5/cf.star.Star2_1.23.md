# cf.star.Star2 1.23 (rank154-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 69.0% | 82.9% | 54.5% | 29 / 35 | - | - | 27 | - | 1.08 / 1377.2 | 32.0% | +37.0 |
| 2 | 70.4% | 85.7% | 54.1% | 30 / 35 | - | - | 30 | - | 0.99 / 3762.9 | 84.2% | -13.8 |
| 3 | 74.0% | 91.4% | 57.2% | 32 / 35 | - | - | 21 | - | 1.03 / 1263.6 | 79.6% | -5.6 |
| 4 | 70.7% | 85.7% | 56.4% | 30 / 35 | - | - | 22 | - | 0.98 / 451.1 | 72.5% | -1.9 |

Mean score share 71.0% ± 3.4, baseline 67.1% ± 38.0, paired diff +3.9 ± 36.0.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 100 over 4 battles (25.0 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cf.star.Star2 1.23 | rank154-band3 | 71.0% ± 3.4 | 86.4% ± 5.7 | 55.6% ± 2.4 | 121 / 140 | - | - | 100 | - | 1.08 / 3762.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| cf.star.Star2 1.23 | 4 | 1344 | 17.7% | 74.6% | 0.0% | 7.7% | 777 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cf.star.Star2 1.23 | 4 | 4 | n/a | 0 | 0.71 | 0 | 0 | 0 |

4 of 4 battles trusted.
