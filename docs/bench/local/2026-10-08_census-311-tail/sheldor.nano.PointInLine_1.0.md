# sheldor.nano.PointInLine 1.0 (rank603-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 79.7% | 94.3% | 62.5% | 33 / 35 | - | - | 11 | - | 0.93 / 169.0 | 85.1% | -5.4 |
| 2 | 79.6% | 94.3% | 60.9% | 33 / 35 | - | - | 4 | - | 0.96 / 1273.3 | 83.1% | -3.6 |
| 3 | 84.4% | 97.1% | 66.1% | 34 / 35 | - | - | 3 | - | 0.84 / 3853.5 | 76.0% | +8.5 |
| 4 | 77.0% | 91.4% | 59.0% | 32 / 35 | - | - | 3 | - | 0.83 / 119.9 | 82.1% | -5.1 |

Mean score share 80.2% ± 4.9, baseline 81.6% ± 6.3, paired diff -1.4 ± 10.5.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 21 over 4 battles (5.3 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sheldor.nano.PointInLine 1.0 | rank603-band5 | 80.2% ± 4.9 | 94.3% ± 3.7 | 62.1% ± 4.8 | 132 / 140 | - | - | 21 | - | 0.96 / 3853.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| sheldor.nano.PointInLine 1.0 | 4 | 817 | 12.2% | 82.5% | 0.0% | 5.3% | 566 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sheldor.nano.PointInLine 1.0 | 4 | 4 | n/a | 0 | 0.15 | 0 | 0 | 0 |

4 of 4 battles trusted.
