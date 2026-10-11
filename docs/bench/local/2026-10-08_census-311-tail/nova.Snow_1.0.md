# nova.Snow 1.0 (rank480-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 75.8% | 85.7% | 67.6% | 30 / 35 | - | - | 7 | - | 0.93 / 1011.5 | 74.7% | +1.2 |
| 2 | 77.9% | 91.4% | 66.5% | 32 / 35 | - | - | 98 | - | 0.85 / 1295.6 | 80.8% | -3.0 |
| 3 | 75.2% | 85.7% | 66.4% | 30 / 35 | - | - | 4 | - | 0.87 / 868.3 | 72.7% | +2.5 |
| 4 | 79.2% | 94.3% | 67.1% | 33 / 35 | - | - | 7 | - | 0.81 / 1600.3 | 79.4% | -0.2 |

Mean score share 77.0% ± 2.9, baseline 76.9% ± 6.1, paired diff +0.1 ± 3.7.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 116 over 4 battles (29.0 per battle, most in one battle 98). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| nova.Snow 1.0 | rank480-band5 | 77.0% ± 2.9 | 89.3% ± 6.8 | 66.9% ± 0.9 | 125 / 140 | - | - | 116 | - | 0.93 / 1600.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| nova.Snow 1.0 | 4 | 1313 | 14.3% | 80.0% | 0.0% | 5.7% | 672 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| nova.Snow 1.0 | 4 | 3 | n/a | 1 | 0.83 | 0 | 0 | 0 |

3 of 4 battles trusted.
