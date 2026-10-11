# darkcanuck.Gaff 1.50 (rank79-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 63.0% | 71.4% | 56.4% | 25 / 35 | - | - | 6 | - | 1.43 / 1088.8 | 70.4% | -7.3 |
| 2 | 73.5% | 88.6% | 60.9% | 31 / 35 | - | - | 5 | - | 1.46 / 1502.0 | 77.1% | -3.6 |
| 3 | 68.3% | 80.0% | 58.4% | 28 / 35 | - | - | 1 | - | 1.37 / 950.2 | 69.8% | -1.5 |
| 4 | 73.4% | 88.6% | 60.2% | 31 / 35 | - | - | 6 | - | 1.46 / 927.9 | 67.5% | +5.9 |

Mean score share 69.6% ± 7.9, baseline 71.2% ± 6.5, paired diff -1.7 ± 8.8.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 18 over 4 battles (4.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| darkcanuck.Gaff 1.50 | rank79-band3 | 69.6% ± 7.9 | 82.1% ± 13.1 | 59.0% ± 3.2 | 115 / 140 | - | - | 18 | - | 1.46 / 1502.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| darkcanuck.Gaff 1.50 | 4 | 1618 | 19.3% | 72.0% | 0.0% | 8.7% | 720 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| darkcanuck.Gaff 1.50 | 4 | 4 | n/a | 0 | 0.13 | 0 | 0 | 0 |

4 of 4 battles trusted.
