# eem.EvBotNG v12.8 (rank74-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 63.7% | 69.7% | 57.9% | 25 / 35 | - | - | 37 | - | 2.58 / 1241.8 | 53.7% | +10.1 |
| 2 | 66.0% | 71.4% | 60.9% | 25 / 35 | - | - | 22 | - | 2.43 / 1064.6 | 64.4% | +1.7 |
| 3 | 64.3% | 71.4% | 56.9% | 25 / 35 | - | - | 23 | - | 2.68 / 1133.1 | 68.1% | -3.9 |
| 4 | 48.0% | 48.6% | 47.6% | 17 / 35 | - | - | 30 | - | 2.46 / 1020.2 | 69.4% | -21.4 |

Mean score share 60.5% ± 13.4, baseline 63.9% ± 11.4, paired diff -3.4 ± 21.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 112 over 4 battles (28.0 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| eem.EvBotNG v12.8 | rank74-band3 | 60.5% ± 13.4 | 65.3% ± 17.8 | 55.8% ± 9.1 | 92 / 140 | - | - | 112 | - | 2.68 / 1241.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| eem.EvBotNG v12.8 | 4 | 1994 | 30.1% | 57.6% | 0.0% | 12.3% | 1209 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| eem.EvBotNG v12.8 | 4 | 4 | n/a | 0 | 0.80 | 0 | 0 | 0 |

4 of 4 battles trusted.
