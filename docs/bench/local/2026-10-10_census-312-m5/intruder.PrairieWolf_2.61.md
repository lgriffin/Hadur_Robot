# intruder.PrairieWolf 2.61 (rank270-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 76.5% | 85.7% | 67.5% | 30 / 35 | - | - | 23 | - | 0.94 / 1866.4 | 86.1% | -9.6 |
| 2 | 82.1% | 94.3% | 70.7% | 33 / 35 | - | - | 11 | - | 0.92 / 2188.5 | 63.0% | +19.1 |
| 3 | 77.0% | 88.6% | 66.3% | 31 / 35 | - | - | 45 | - | 0.90 / 4149.8 | 84.8% | -7.8 |
| 4 | 80.4% | 91.4% | 70.0% | 32 / 35 | - | - | 25 | - | 1.02 / 3157.6 | 80.4% | +0.0 |

Mean score share 79.0% ± 4.3, baseline 78.6% ± 17.0, paired diff +0.4 ± 20.9.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 104 over 4 battles (26.0 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| intruder.PrairieWolf 2.61 | rank270-band4 | 79.0% ± 4.3 | 90.0% ± 5.9 | 68.6% ± 3.3 | 126 / 140 | - | - | 104 | - | 1.02 / 4149.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| intruder.PrairieWolf 2.61 | 4 | 1082 | 16.2% | 77.4% | 0.0% | 6.4% | 861 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| intruder.PrairieWolf 2.61 | 4 | 4 | n/a | 0 | 0.74 | 0 | 0 | 0 |

4 of 4 battles trusted.
