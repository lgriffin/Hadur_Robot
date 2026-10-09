# lechu.Ala 0.0.4 (rank516-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 80.1% | 94.3% | 68.3% | 33 / 35 | - | - | 7 | - | 1.29 / 1024.7 | 79.2% | +0.9 |
| 2 | 77.6% | 85.7% | 70.3% | 30 / 35 | - | - | 15 | - | 1.40 / 1396.7 | 83.2% | -5.6 |
| 3 | 78.0% | 88.6% | 69.0% | 31 / 35 | - | - | 24 | - | 1.53 / 840.8 | 84.2% | -6.2 |
| 4 | 81.8% | 91.4% | 73.1% | 32 / 35 | - | - | 13 | - | 1.40 / 1591.2 | 86.3% | -4.6 |

Mean score share 79.4% ± 3.1, baseline 83.2% ± 4.7, paired diff -3.9 ± 5.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 59 over 4 battles (14.8 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| lechu.Ala 0.0.4 | rank516-band5 | 79.4% ± 3.1 | 90.0% ± 5.9 | 70.2% ± 3.4 | 126 / 140 | - | - | 59 | - | 1.53 / 1591.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| lechu.Ala 0.0.4 | 4 | 1160 | 15.1% | 79.0% | 0.0% | 5.8% | 819 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| lechu.Ala 0.0.4 | 4 | 4 | n/a | 0 | 0.42 | 0 | 0 | 0 |

4 of 4 battles trusted.
