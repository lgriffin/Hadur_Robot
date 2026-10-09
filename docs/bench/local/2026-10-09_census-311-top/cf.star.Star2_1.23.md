# cf.star.Star2 1.23 (rank154-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 77.5% | 94.3% | 60.4% | 33 / 35 | - | - | 12 | - | 0.99 / 1647.6 | 79.3% | -1.8 |
| 2 | 74.1% | 94.3% | 52.8% | 33 / 35 | - | - | 28 | - | 1.02 / 48.2 | 76.4% | -2.3 |
| 3 | 76.8% | 94.3% | 58.3% | 33 / 35 | - | - | 24 | - | 0.96 / 1496.3 | 77.3% | -0.5 |
| 4 | 76.2% | 94.3% | 55.2% | 33 / 35 | - | - | 25 | - | 1.01 / 50.8 | 77.2% | -1.0 |

Mean score share 76.1% ± 2.3, baseline 77.6% ± 2.0, paired diff -1.4 ± 1.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 89 over 4 battles (22.3 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cf.star.Star2 1.23 | rank154-band3 | 76.1% ± 2.3 | 94.3% ± 0.0 | 56.7% ± 5.3 | 132 / 140 | - | - | 89 | - | 1.02 / 1647.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| cf.star.Star2 1.23 | 4 | 1081 | 9.3% | 86.8% | 0.0% | 3.9% | 786 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cf.star.Star2 1.23 | 4 | 4 | n/a | 0 | 0.64 | 0 | 0 | 0 |

4 of 4 battles trusted.
