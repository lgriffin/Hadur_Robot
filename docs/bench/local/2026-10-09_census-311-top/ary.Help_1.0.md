# ary.Help 1.0 (rank69-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 78.2% | 97.1% | 58.4% | 34 / 35 | - | - | 35 | - | 1.05 / 915.4 | 79.3% | -1.1 |
| 2 | 68.3% | 82.9% | 54.5% | 29 / 35 | - | - | 38 | - | 1.11 / 127.2 | 78.0% | -9.7 |
| 3 | 74.5% | 85.7% | 62.9% | 30 / 35 | - | - | 15 | - | 0.97 / 1217.8 | 86.0% | -11.5 |
| 4 | 81.8% | 94.3% | 68.0% | 33 / 35 | - | - | 14 | - | 0.94 / 1016.0 | 79.2% | +2.5 |

Mean score share 75.7% ± 9.1, baseline 80.6% ± 5.8, paired diff -4.9 ± 10.7.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 102 over 4 battles (25.5 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ary.Help 1.0 | rank69-band3 | 75.7% ± 9.1 | 90.0% ± 10.8 | 61.0% ± 9.3 | 126 / 140 | - | - | 102 | - | 1.11 / 1217.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ary.Help 1.0 | 4 | 1144 | 15.3% | 78.3% | 0.0% | 6.4% | 904 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ary.Help 1.0 | 4 | 4 | n/a | 0 | 0.73 | 0 | 0 | 0 |

4 of 4 battles trusted.
