# drm.Magazine 0.39 (rank365-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 81.4% | 94.3% | 67.1% | 33 / 35 | - | - | 8 | - | 1.25 / 701.0 | 68.3% | +13.1 |
| 2 | 71.5% | 85.7% | 56.6% | 30 / 35 | - | - | 4 | - | 1.26 / 165.6 | 81.2% | -9.7 |
| 3 | 78.3% | 97.1% | 60.1% | 34 / 35 | - | - | 5 | - | 1.17 / 525.6 | 85.5% | -7.2 |
| 4 | 74.2% | 88.6% | 60.4% | 31 / 35 | - | - | 8 | - | 1.20 / 221.5 | 81.7% | -7.4 |

Mean score share 76.4% ± 7.0, baseline 79.2% ± 12.0, paired diff -2.8 ± 17.0.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 25 over 4 battles (6.3 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| drm.Magazine 0.39 | rank365-band4 | 76.4% ± 7.0 | 91.4% ± 8.3 | 61.0% ± 7.0 | 128 / 140 | - | - | 25 | - | 1.26 / 701.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| drm.Magazine 0.39 | 4 | 1103 | 13.6% | 80.0% | 0.0% | 6.3% | 598 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| drm.Magazine 0.39 | 4 | 4 | n/a | 0 | 0.18 | 0 | 0 | 0 |

4 of 4 battles trusted.
