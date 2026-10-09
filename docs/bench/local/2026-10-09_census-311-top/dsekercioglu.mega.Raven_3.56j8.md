# dsekercioglu.mega.Raven 3.56j8 (rank8-band1) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 55.2% | 60.0% | 50.6% | 21 / 35 | - | - | 17 | - | 1.10 / 1059.5 | 54.0% | +1.2 |
| 2 | 53.9% | 62.9% | 46.9% | 22 / 35 | - | - | 19 | - | 1.12 / 874.0 | 53.5% | +0.4 |
| 3 | 47.8% | 54.3% | 42.8% | 19 / 35 | - | - | 17 | - | 1.07 / 667.0 | 63.1% | -15.4 |
| 4 | 50.1% | 57.1% | 43.7% | 20 / 35 | - | - | 19 | - | 1.17 / 1076.2 | 56.9% | -6.8 |

Mean score share 51.7% ± 5.4, baseline 56.9% ± 7.1, paired diff -5.1 ± 12.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 72 over 4 battles (18.0 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | rank8-band1 | 51.7% ± 5.4 | 58.6% ± 5.9 | 46.0% ± 5.6 | 82 / 140 | - | - | 72 | - | 1.17 / 1076.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | 4 | 2328 | 31.1% | 55.9% | 0.0% | 12.9% | 1087 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | 4 | 4 | n/a | 0 | 0.51 | 0 | 0 | 0 |

4 of 4 battles trusted.
