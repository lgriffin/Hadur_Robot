# oog.mega.saguaro.Saguaro 1.0 (rank4-band1) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 49.1% | 60.0% | 40.0% | 21 / 35 | - | - | 4 | - | 2.19 / 957.7 | 63.4% | -14.2 |
| 2 | 58.2% | 74.3% | 42.7% | 26 / 35 | - | - | 10 | - | 2.30 / 907.3 | 74.5% | -16.3 |
| 3 | 59.7% | 71.4% | 49.2% | 25 / 35 | - | - | 5 | - | 2.26 / 892.5 | 65.4% | -5.7 |
| 4 | 60.3% | 71.4% | 49.0% | 25 / 35 | - | - | 6 | - | 2.22 / 281.5 | 74.6% | -14.2 |

Mean score share 56.8% ± 8.3, baseline 69.5% ± 9.4, paired diff -12.6 ± 7.5.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 25 over 4 battles (6.3 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | rank4-band1 | 56.8% ± 8.3 | 69.3% ± 10.1 | 45.2% ± 7.3 | 97 / 140 | - | - | 25 | - | 2.30 / 957.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | 4 | 1994 | 27.0% | 60.8% | 0.0% | 12.2% | 750 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | 4 | 4 | n/a | 0 | 0.18 | 0 | 0 | 0 |

4 of 4 battles trusted.
