# jbot.Rabbit2 1.1 (rank306-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 80.0% | 97.1% | 65.4% | 34 / 35 | - | - | 17 | - | 1.08 / 268.7 | 78.6% | +1.4 |
| 2 | 81.1% | 94.3% | 69.8% | 33 / 35 | - | - | 2 | - | 1.01 / 773.2 | 84.2% | -3.1 |
| 3 | 82.5% | 97.1% | 70.4% | 34 / 35 | - | - | 1 | - | 1.01 / 167.5 | 74.3% | +8.2 |
| 4 | 74.6% | 88.6% | 63.0% | 31 / 35 | - | - | 10 | - | 1.01 / 954.9 | 76.4% | -1.8 |

Mean score share 79.5% ± 5.4, baseline 78.4% ± 6.8, paired diff +1.2 ± 8.0.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 30 over 4 battles (7.5 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jbot.Rabbit2 1.1 | rank306-band4 | 79.5% ± 5.4 | 94.3% ± 6.4 | 67.2% ± 5.6 | 132 / 140 | - | - | 30 | - | 1.08 / 954.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| jbot.Rabbit2 1.1 | 4 | 1121 | 8.9% | 87.0% | 0.0% | 4.1% | 599 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jbot.Rabbit2 1.1 | 4 | 4 | n/a | 0 | 0.21 | 0 | 0 | 0 |

4 of 4 battles trusted.
