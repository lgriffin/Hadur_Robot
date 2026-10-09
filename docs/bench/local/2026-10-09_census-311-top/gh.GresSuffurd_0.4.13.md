# gh.GresSuffurd 0.4.13 (rank14-band2) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 52.1% | 62.9% | 42.9% | 22 / 35 | - | - | 41 | - | 1.11 / 957.8 | 57.6% | -5.5 |
| 2 | 57.3% | 65.7% | 49.8% | 23 / 35 | - | - | 49 | - | 1.11 / 613.9 | 59.9% | -2.7 |
| 3 | 70.3% | 85.7% | 55.2% | 30 / 35 | - | - | 34 | - | 1.11 / 179.4 | 63.7% | +6.6 |
| 4 | 58.5% | 71.4% | 46.5% | 25 / 35 | - | - | 42 | - | 1.09 / 977.0 | 63.5% | -5.0 |

Mean score share 59.5% ± 12.3, baseline 61.2% ± 4.7, paired diff -1.6 ± 9.0.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 166 over 4 battles (41.5 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| gh.GresSuffurd 0.4.13 | rank14-band2 | 59.5% ± 12.3 | 71.4% ± 16.2 | 48.6% ± 8.3 | 100 / 140 | - | - | 166 | - | 1.11 / 977.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| gh.GresSuffurd 0.4.13 | 4 | 1945 | 25.7% | 63.3% | 0.0% | 11.0% | 1057 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| gh.GresSuffurd 0.4.13 | 4 | 4 | n/a | 0 | 1.19 | 0 | 0 | 0 |

4 of 4 battles trusted.
