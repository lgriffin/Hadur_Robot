# cb.Domogled 1.2 (rank23-band2) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 52.6% | 37.1% | 64.6% | 13 / 35 | - | - | 270 | - | 1.32 / 907.7 | 69.1% | -16.5 |
| 2 | 41.0% | 20.0% | 58.0% | 7 / 35 | - | - | 333 | - | 1.35 / 761.4 | 65.2% | -24.2 |
| 3 | 51.0% | 34.3% | 64.1% | 12 / 35 | - | - | 254 | - | 1.33 / 1003.2 | 61.8% | -10.8 |
| 4 | 50.1% | 34.3% | 62.7% | 12 / 35 | - | - | 282 | - | 1.36 / 807.3 | 56.8% | -6.7 |

Mean score share 48.7% ± 8.3, baseline 63.2% ± 8.3, paired diff -14.5 ± 12.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 1139 over 4 battles (284.8 per battle, most in one battle 333). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cb.Domogled 1.2 | rank23-band2 | 48.7% ± 8.3 | 31.4% ± 12.3 | 62.4% ± 4.8 | 44 / 140 | - | - | 1139 | - | 1.36 / 1003.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| cb.Domogled 1.2 | 4 | 2445 | 49.1% | 37.2% | 0.0% | 13.7% | 2080 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cb.Domogled 1.2 | 4 | 0 | n/a | 0 | 8.14 | 0 | 0 | 0 |

0 of 4 battles trusted.
