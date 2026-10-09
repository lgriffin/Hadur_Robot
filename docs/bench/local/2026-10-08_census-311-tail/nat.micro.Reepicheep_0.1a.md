# nat.micro.Reepicheep 0.1a (rank514-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 81.9% | 94.3% | 69.5% | 33 / 35 | - | - | 11 | - | 0.78 / 1347.7 | 87.1% | -5.3 |
| 2 | 87.9% | 100.0% | 74.4% | 35 / 35 | - | - | 4 | - | 0.77 / 559.9 | 88.8% | -0.9 |
| 3 | 87.0% | 97.1% | 75.4% | 34 / 35 | - | - | 4 | - | 0.78 / 789.6 | 87.7% | -0.7 |
| 4 | 86.3% | 100.0% | 72.6% | 35 / 35 | - | - | 10 | - | 0.89 / 1039.9 | 85.0% | +1.4 |

Mean score share 85.8% ± 4.3, baseline 87.1% ± 2.5, paired diff -1.4 ± 4.4.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 29 over 4 battles (7.3 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| nat.micro.Reepicheep 0.1a | rank514-band5 | 85.8% ± 4.3 | 97.9% ± 4.4 | 73.0% ± 4.1 | 137 / 140 | - | - | 29 | - | 0.89 / 1347.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| nat.micro.Reepicheep 0.1a | 4 | 673 | 5.6% | 91.9% | 0.1% | 2.5% | 519 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| nat.micro.Reepicheep 0.1a | 4 | 4 | n/a | 0 | 0.21 | 0 | 0 | 0 |

4 of 4 battles trusted.
