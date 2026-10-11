# Krabb.sliNk.Garm 0.9u (rank36-band2) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 65.3% | 80.0% | 50.7% | 28 / 35 | - | - | 25 | - | 1.14 / 690.6 | 64.9% | +0.4 |
| 2 | 63.4% | 74.3% | 52.3% | 26 / 35 | - | - | 41 | - | 1.16 / 1012.0 | 64.6% | -1.2 |
| 3 | 60.0% | 71.4% | 49.5% | 25 / 35 | - | - | 39 | - | 1.11 / 278.7 | 67.7% | -7.7 |
| 4 | 74.7% | 88.6% | 58.9% | 31 / 35 | - | - | 23 | - | 1.16 / 696.7 | 65.2% | +9.5 |

Mean score share 65.9% ± 10.0, baseline 65.6% ± 2.3, paired diff +0.3 ± 11.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 128 over 4 battles (32.0 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| Krabb.sliNk.Garm 0.9u | rank36-band2 | 65.9% ± 10.0 | 78.6% ± 12.0 | 52.9% ± 6.7 | 110 / 140 | - | - | 128 | - | 1.16 / 1012.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| Krabb.sliNk.Garm 0.9u | 4 | 1581 | 23.7% | 66.6% | 0.0% | 9.7% | 914 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| Krabb.sliNk.Garm 0.9u | 4 | 4 | n/a | 0 | 0.91 | 0 | 0 | 0 |

4 of 4 battles trusted.
