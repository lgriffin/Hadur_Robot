# slugzilla.Basilisk 3.9 (rank89-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 70.0% | 85.7% | 54.0% | 30 / 35 | - | - | 8 | - | 0.65 / 1659.5 | 73.4% | -3.4 |
| 2 | 73.8% | 91.4% | 54.4% | 32 / 35 | - | - | 37 | - | 0.99 / 1493.5 | 69.6% | +4.2 |
| 3 | 64.8% | 80.0% | 49.8% | 28 / 35 | - | - | 28 | - | 1.01 / 1545.6 | 72.8% | -8.0 |
| 4 | 71.6% | 85.7% | 57.1% | 30 / 35 | - | - | 17 | - | 1.03 / 219.1 | 62.6% | +9.0 |

Mean score share 70.0% ± 6.1, baseline 69.6% ± 7.9, paired diff +0.4 ± 12.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 90 over 4 battles (22.5 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| slugzilla.Basilisk 3.9 | rank89-band3 | 70.0% ± 6.1 | 85.7% ± 7.4 | 53.8% ± 4.7 | 120 / 140 | - | - | 90 | - | 1.03 / 1659.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| slugzilla.Basilisk 3.9 | 4 | 1383 | 18.1% | 74.1% | 0.0% | 7.8% | 857 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| slugzilla.Basilisk 3.9 | 4 | 4 | n/a | 0 | 0.64 | 0 | 0 | 0 |

4 of 4 battles trusted.
