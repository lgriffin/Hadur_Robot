# rh.Intra 2.1DomoKN (rank70-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 60.3% | 72.7% | 48.8% | 26 / 35 | - | - | 37 | - | 1.61 / 1166.9 | 76.2% | -15.9 |
| 2 | 64.5% | 77.1% | 53.0% | 27 / 35 | - | - | 31 | - | 1.65 / 1232.9 | 80.9% | -16.4 |
| 3 | 58.7% | 68.6% | 50.2% | 24 / 35 | - | - | 44 | - | 1.63 / 1093.0 | 75.6% | -16.9 |
| 4 | 66.8% | 80.0% | 54.1% | 28 / 35 | - | - | 27 | - | 1.50 / 497.0 | 73.5% | -6.8 |

Mean score share 62.6% ± 5.9, baseline 76.6% ± 5.0, paired diff -14.0 ± 7.7.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 139 over 4 battles (34.8 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| rh.Intra 2.1DomoKN | rank70-band3 | 62.6% ± 5.9 | 74.6% ± 8.0 | 51.5% ± 4.0 | 105 / 140 | - | - | 139 | - | 1.65 / 1232.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| rh.Intra 2.1DomoKN | 4 | 1825 | 24.0% | 65.9% | 0.0% | 10.1% | 1044 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| rh.Intra 2.1DomoKN | 4 | 4 | n/a | 0 | 0.99 | 0 | 0 | 0 |

4 of 4 battles trusted.
