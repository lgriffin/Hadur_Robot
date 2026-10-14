# catcat20.shape.Theta 0.018 (rank80-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 81.3% | 97.1% | 66.0% | 34 / 35 | - | - | 17 | - | 1.35 / 2843.3 | 65.0% | +16.2 |
| 2 | 67.6% | 79.4% | 57.7% | 28 / 35 | - | - | 24 | - | 1.41 / 2900.4 | 65.5% | +2.1 |
| 3 | 61.5% | 68.6% | 55.2% | 24 / 35 | - | - | 26 | - | 1.36 / 2036.9 | 75.6% | -14.0 |
| 4 | 70.3% | 80.0% | 61.3% | 28 / 35 | - | - | 14 | - | 1.31 / 2941.6 | 71.3% | -1.1 |

Mean score share 70.2% ± 13.1, baseline 69.4% ± 8.0, paired diff +0.8 ± 19.8.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 81 over 4 battles (20.3 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| catcat20.shape.Theta 0.018 | rank80-band3 | 70.2% ± 13.1 | 81.3% ± 18.8 | 60.1% ± 7.5 | 114 / 140 | - | - | 81 | - | 1.41 / 2941.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| catcat20.shape.Theta 0.018 | 4 | 1522 | 21.4% | 69.4% | 0.0% | 9.2% | 834 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| catcat20.shape.Theta 0.018 | 4 | 4 | n/a | 0 | 0.58 | 0 | 0 | 0 |

4 of 4 battles trusted.
