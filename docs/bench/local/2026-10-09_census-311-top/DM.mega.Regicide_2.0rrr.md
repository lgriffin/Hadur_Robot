# DM.mega.Regicide 2.0rrr (rank71-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 78.5% | 94.3% | 59.7% | 33 / 35 | - | - | 26 | - | 1.32 / 1108.9 | 69.8% | +8.7 |
| 2 | 72.9% | 85.7% | 58.9% | 30 / 35 | - | - | 35 | - | 1.34 / 456.1 | 59.2% | +13.7 |
| 3 | 74.3% | 88.6% | 57.2% | 31 / 35 | - | - | 34 | - | 1.37 / 900.5 | 62.0% | +12.3 |
| 4 | 75.6% | 94.3% | 54.2% | 33 / 35 | - | - | 33 | - | 1.32 / 474.0 | 69.7% | +5.9 |

Mean score share 75.3% ± 3.8, baseline 65.2% ± 8.6, paired diff +10.2 ± 5.6.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 128 over 4 battles (32.0 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| DM.mega.Regicide 2.0rrr | rank71-band3 | 75.3% ± 3.8 | 90.7% ± 6.8 | 57.5% ± 3.9 | 127 / 140 | - | - | 128 | - | 1.37 / 1108.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| DM.mega.Regicide 2.0rrr | 4 | 1074 | 15.1% | 79.2% | 0.0% | 5.7% | 1101 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| DM.mega.Regicide 2.0rrr | 4 | 4 | n/a | 0 | 0.91 | 0 | 0 | 0 |

4 of 4 battles trusted.
