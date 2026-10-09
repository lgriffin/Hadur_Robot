# sgp.SleepingGoat 1.1 (rank835-band6) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 94.8% | 100.0% | 88.8% | 35 / 35 | - | - | 1 | - | 0.76 / 1201.8 | 86.7% | +8.1 |
| 2 | 91.6% | 97.1% | 85.9% | 34 / 35 | - | - | 1 | - | 0.75 / 1094.2 | 89.4% | +2.2 |
| 3 | 91.9% | 100.0% | 83.8% | 35 / 35 | - | - | 5 | - | 0.76 / 898.5 | 93.8% | -1.9 |
| 4 | 91.7% | 100.0% | 83.0% | 35 / 35 | - | - | 3 | - | 0.87 / 1252.3 | 91.7% | +0.0 |

Mean score share 92.5% ± 2.4, baseline 90.4% ± 4.8, paired diff +2.1 ± 6.9.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 10 over 4 battles (2.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sgp.SleepingGoat 1.1 | rank835-band6 | 92.5% ± 2.4 | 99.3% ± 2.3 | 85.4% ± 4.1 | 139 / 140 | - | - | 10 | - | 0.87 / 1252.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| sgp.SleepingGoat 1.1 | 4 | 362 | 3.5% | 94.1% | 0.6% | 1.8% | 472 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sgp.SleepingGoat 1.1 | 4 | 4 | n/a | 0 | 0.07 | 0 | 0 | 0 |

4 of 4 battles trusted.
