# catcat20.Lambda 0.017 (rank49-band2) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 62.7% | 74.3% | 52.1% | 26 / 35 | - | - | 19 | - | 1.46 / 1462.0 | 63.3% | -0.6 |
| 2 | 67.4% | 80.0% | 55.1% | 28 / 35 | - | - | 9 | - | 1.35 / 1071.4 | 69.5% | -2.1 |
| 3 | 73.5% | 88.6% | 58.9% | 31 / 35 | - | - | 10 | - | 1.34 / 577.5 | 63.1% | +10.4 |
| 4 | 72.4% | 85.7% | 58.7% | 30 / 35 | - | - | 12 | - | 1.43 / 1251.1 | 69.8% | +2.6 |

Mean score share 69.0% ± 7.9, baseline 66.4% ± 5.9, paired diff +2.6 ± 8.9.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 50 over 4 battles (12.5 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| catcat20.Lambda 0.017 | rank49-band2 | 69.0% ± 7.9 | 82.1% ± 10.1 | 56.2% ± 5.2 | 115 / 140 | - | - | 50 | - | 1.46 / 1462.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| catcat20.Lambda 0.017 | 4 | 1497 | 20.9% | 70.4% | 0.0% | 8.7% | 946 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| catcat20.Lambda 0.017 | 4 | 4 | n/a | 0 | 0.36 | 0 | 0 | 0 |

4 of 4 battles trusted.
