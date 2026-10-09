# voidious.Diamond 1.8.22 (rank6-band1) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 35.7% | 20.0% | 49.9% | 7 / 35 | - | - | 144 | - | 1.89 / 1153.1 | 36.4% | -0.6 |
| 2 | 36.4% | 23.5% | 48.0% | 9 / 35 | - | - | 136 | - | 1.82 / 856.6 | 46.5% | -10.1 |
| 3 | 38.0% | 25.7% | 49.9% | 9 / 35 | - | - | 186 | - | 1.91 / 1125.2 | 45.9% | -7.9 |
| 4 | 41.1% | 31.4% | 50.1% | 11 / 35 | - | - | 214 | - | 1.93 / 973.0 | 52.5% | -11.3 |

Mean score share 37.8% ± 3.9, baseline 45.3% ± 10.6, paired diff -7.5 ± 7.6.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 680 over 4 battles (170.0 per battle, most in one battle 214). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| voidious.Diamond 1.8.22 | rank6-band1 | 37.8% ± 3.9 | 25.2% ± 7.6 | 49.5% ± 1.6 | 36 / 140 | - | - | 680 | - | 1.93 / 1153.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| voidious.Diamond 1.8.22 | 4 | 2959 | 43.9% | 40.7% | 0.0% | 15.4% | 1814 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| voidious.Diamond 1.8.22 | 4 | 0 | n/a | 0 | 4.86 | 0 | 0 | 0 |

0 of 4 battles trusted.
