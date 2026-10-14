# DM.mega.Regicide 2.0rrr (rank71-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 74.4% | 85.7% | 62.8% | 30 / 35 | - | - | 22 | - | 1.31 / 1687.5 | 70.7% | +3.7 |
| 2 | 73.9% | 85.7% | 59.9% | 30 / 35 | - | - | 37 | - | 1.24 / 2445.5 | 73.5% | +0.4 |
| 3 | 71.9% | 88.6% | 53.5% | 31 / 35 | - | - | 47 | - | 1.34 / 2367.5 | 75.9% | -4.0 |
| 4 | 73.9% | 88.6% | 57.4% | 31 / 35 | - | - | 48 | - | 1.30 / 2153.7 | 65.7% | +8.1 |

Mean score share 73.5% ± 1.8, baseline 71.5% ± 6.9, paired diff +2.1 ± 8.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 154 over 4 battles (38.5 per battle, most in one battle 48). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| DM.mega.Regicide 2.0rrr | rank71-band3 | 73.5% ± 1.8 | 87.1% ± 2.6 | 58.4% ± 6.2 | 122 / 140 | - | - | 154 | - | 1.34 / 2445.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| DM.mega.Regicide 2.0rrr | 4 | 1175 | 19.1% | 73.2% | 0.0% | 7.6% | 1087 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| DM.mega.Regicide 2.0rrr | 4 | 4 | n/a | 0 | 1.10 | 0 | 0 | 0 |

4 of 4 battles trusted.
