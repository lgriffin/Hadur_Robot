# cbot.cbot.CBot 0.8 (rank496-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 85.0% | 97.1% | 71.6% | 34 / 35 | - | - | 8 | - | 1.01 / 1515.5 | 83.1% | +1.9 |
| 2 | 84.6% | 97.1% | 71.1% | 34 / 35 | - | - | 5 | - | 0.90 / 1192.2 | 81.2% | +3.4 |
| 3 | 83.7% | 97.1% | 70.2% | 34 / 35 | - | - | 11 | - | 0.97 / 1423.3 | 79.1% | +4.6 |
| 4 | 85.9% | 97.1% | 73.7% | 34 / 35 | - | - | 21 | - | 1.03 / 629.1 | 88.6% | -2.8 |

Mean score share 84.8% ± 1.5, baseline 83.0% ± 6.5, paired diff +1.8 ± 5.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 45 over 4 battles (11.3 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cbot.cbot.CBot 0.8 | rank496-band5 | 84.8% ± 1.5 | 97.1% ± 0.0 | 71.6% ± 2.4 | 136 / 140 | - | - | 45 | - | 1.03 / 1515.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| cbot.cbot.CBot 0.8 | 4 | 719 | 7.0% | 89.7% | 0.1% | 3.2% | 537 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cbot.cbot.CBot 0.8 | 4 | 4 | n/a | 0 | 0.32 | 0 | 0 | 0 |

4 of 4 battles trusted.
