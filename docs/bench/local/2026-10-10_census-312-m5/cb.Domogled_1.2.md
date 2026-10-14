# cb.Domogled 1.2 (rank23-band2) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 49.8% | 37.1% | 60.8% | 13 / 35 | - | - | 309 | - | 1.35 / 499.4 | 61.7% | -11.9 |
| 2 | 48.7% | 28.6% | 65.2% | 10 / 35 | - | - | 323 | - | 1.31 / 1075.2 | 64.5% | -15.8 |
| 3 | 60.0% | 48.6% | 69.1% | 17 / 35 | - | - | 298 | - | 1.33 / 563.2 | 63.4% | -3.3 |
| 4 | 52.7% | 37.1% | 65.7% | 13 / 35 | - | - | 378 | - | 1.38 / 2131.7 | 61.9% | -9.1 |

Mean score share 52.8% ± 8.1, baseline 62.9% ± 2.1, paired diff -10.0 ± 8.4.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 1308 over 4 battles (327.0 per battle, most in one battle 378). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cb.Domogled 1.2 | rank23-band2 | 52.8% ± 8.1 | 37.9% ± 13.1 | 65.2% ± 5.4 | 53 / 140 | - | - | 1308 | - | 1.38 / 2131.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| cb.Domogled 1.2 | 4 | 2239 | 48.6% | 36.9% | 0.0% | 14.6% | 2018 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cb.Domogled 1.2 | 4 | 0 | n/a | 0 | 9.34 | 0 | 0 | 0 |

0 of 4 battles trusted.
