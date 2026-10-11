# emp.Yngwie 1.11 (rank378-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 79.0% | 91.4% | 67.6% | 32 / 35 | - | - | 14 | - | 0.97 / 1095.3 | 76.2% | +2.9 |
| 2 | 79.4% | 91.4% | 69.3% | 32 / 35 | - | - | 11 | - | 0.99 / 164.0 | 83.6% | -4.1 |
| 3 | 79.4% | 88.6% | 71.1% | 31 / 35 | - | - | 23 | - | 0.82 / 1329.3 | 88.3% | -8.9 |
| 4 | 79.1% | 91.4% | 68.7% | 32 / 35 | - | - | 24 | - | 0.92 / 1878.3 | 72.6% | +6.4 |

Mean score share 79.2% ± 0.4, baseline 80.2% ± 11.3, paired diff -0.9 ± 11.0.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 72 over 4 battles (18.0 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| emp.Yngwie 1.11 | rank378-band4 | 79.2% ± 0.4 | 90.7% ± 2.3 | 69.2% ± 2.3 | 127 / 140 | - | - | 72 | - | 0.99 / 1878.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| emp.Yngwie 1.11 | 4 | 1127 | 14.4% | 79.4% | 0.1% | 6.1% | 784 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| emp.Yngwie 1.11 | 4 | 4 | n/a | 0 | 0.51 | 0 | 0 | 0 |

4 of 4 battles trusted.
