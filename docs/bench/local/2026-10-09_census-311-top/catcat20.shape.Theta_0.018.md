# catcat20.shape.Theta 0.018 (rank80-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 77.1% | 91.4% | 63.9% | 32 / 35 | - | - | 13 | - | 1.44 / 879.1 | 60.9% | +16.2 |
| 2 | 69.4% | 80.0% | 59.9% | 28 / 35 | - | - | 18 | - | 1.39 / 953.8 | 60.2% | +9.2 |
| 3 | 67.7% | 79.4% | 58.0% | 28 / 35 | - | - | 24 | - | 1.39 / 1548.4 | 67.1% | +0.7 |
| 4 | 65.6% | 77.1% | 55.8% | 27 / 35 | - | - | 15 | - | 1.35 / 731.2 | 67.0% | -1.3 |

Mean score share 70.0% ± 8.0, baseline 63.8% ± 5.9, paired diff +6.2 ± 12.9.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 70 over 4 battles (17.5 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| catcat20.shape.Theta 0.018 | rank80-band3 | 70.0% ± 8.0 | 82.0% ± 10.2 | 59.4% ± 5.5 | 115 / 140 | - | - | 70 | - | 1.44 / 1548.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| catcat20.shape.Theta 0.018 | 4 | 1541 | 20.3% | 70.8% | 0.0% | 9.0% | 831 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| catcat20.shape.Theta 0.018 | 4 | 4 | n/a | 0 | 0.50 | 0 | 0 | 0 |

4 of 4 battles trusted.
