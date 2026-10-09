# synapse.Geomancy 15 (rank110-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 75.0% | 91.4% | 60.2% | 32 / 35 | - | - | 33 | - | 1.03 / 1332.8 | 77.1% | -2.1 |
| 2 | 67.5% | 80.0% | 55.9% | 28 / 35 | - | - | 42 | - | 1.07 / 4190.0 | 76.6% | -9.1 |
| 3 | 67.0% | 77.1% | 57.5% | 27 / 35 | - | - | 36 | - | 1.08 / 940.4 | 71.4% | -4.4 |
| 4 | 64.2% | 74.3% | 54.9% | 26 / 35 | - | - | 39 | - | 1.08 / 2966.1 | 77.2% | -13.1 |

Mean score share 68.4% ± 7.4, baseline 75.6% ± 4.5, paired diff -7.2 ± 7.8.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 150 over 4 battles (37.5 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| synapse.Geomancy 15 | rank110-band3 | 68.4% ± 7.4 | 80.7% ± 12.0 | 57.1% ± 3.7 | 113 / 140 | - | - | 150 | - | 1.08 / 4190.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| synapse.Geomancy 15 | 4 | 1584 | 21.3% | 69.8% | 0.0% | 8.9% | 872 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| synapse.Geomancy 15 | 4 | 4 | n/a | 0 | 1.07 | 0 | 0 | 0 |

4 of 4 battles trusted.
