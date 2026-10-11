# ntc.Lasers.Lasers 0.9 (rank699-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 91.1% | 100.0% | 83.6% | 35 / 35 | - | - | 5 | - | 0.84 / 2252.5 | 91.1% | +0.1 |
| 2 | 91.0% | 100.0% | 83.0% | 35 / 35 | - | - | 9 | - | 0.90 / 3041.6 | 90.7% | +0.3 |
| 3 | 91.4% | 100.0% | 83.9% | 35 / 35 | - | - | 12 | - | 0.91 / 26.2 | 92.0% | -0.6 |
| 4 | 91.5% | 100.0% | 84.1% | 35 / 35 | - | - | 5 | - | 0.83 / 3397.0 | 91.5% | -0.0 |

Mean score share 91.3% ± 0.4, baseline 91.3% ± 0.9, paired diff -0.1 ± 0.6.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 31 over 4 battles (7.8 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ntc.Lasers.Lasers 0.9 | rank699-band5 | 91.3% ± 0.4 | 100.0% ± 0.0 | 83.7% ± 0.7 | 140 / 140 | - | - | 31 | - | 0.91 / 3397.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ntc.Lasers.Lasers 0.9 | 4 | 489 | 0.0% | 99.9% | 0.1% | 0.0% | 390 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ntc.Lasers.Lasers 0.9 | 4 | 4 | n/a | 0 | 0.22 | 0 | 0 | 0 |

4 of 4 battles trusted.
