# eem.EvBotNG v12.8 (rank74-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 59.7% | 60.0% | 58.9% | 21 / 35 | - | - | 24 | - | 2.58 / 3110.3 | 57.7% | +2.1 |
| 2 | 59.6% | 60.0% | 58.0% | 21 / 35 | - | - | 25 | - | 2.38 / 2642.4 | 61.9% | -2.3 |
| 3 | 50.7% | 48.6% | 52.2% | 17 / 35 | - | - | 32 | - | 2.34 / 2950.4 | 75.0% | -24.4 |
| 4 | 68.9% | 74.3% | 62.8% | 26 / 35 | - | - | 12 | - | 2.15 / 2842.5 | 68.3% | +0.6 |

Mean score share 59.7% ± 11.8, baseline 65.7% ± 12.1, paired diff -6.0 ± 19.7.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 93 over 4 battles (23.3 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| eem.EvBotNG v12.8 | rank74-band3 | 59.7% ± 11.8 | 60.7% ± 16.8 | 58.0% ± 7.0 | 85 / 140 | - | - | 93 | - | 2.58 / 3110.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| eem.EvBotNG v12.8 | 4 | 2013 | 34.1% | 52.8% | 0.0% | 13.1% | 1198 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| eem.EvBotNG v12.8 | 4 | 4 | n/a | 0 | 0.66 | 0 | 0 | 0 |

4 of 4 battles trusted.
