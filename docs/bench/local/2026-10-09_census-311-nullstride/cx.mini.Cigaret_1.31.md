# cx.mini.Cigaret 1.31 (rank182-band3) vs jd.Nullstride 2.3.3

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 71.2% | 82.9% | 56.0% | 29 / 35 | - | - | 23 | - | 1.89 / 266.1 |
| 2 | 76.5% | 88.6% | 61.0% | 31 / 35 | - | - | 14 | - | 1.91 / 747.5 |
| 3 | 77.6% | 91.4% | 59.9% | 32 / 35 | - | - | 39 | - | 1.95 / 901.2 |
| 4 | 76.0% | 85.7% | 62.0% | 30 / 35 | - | - | 34 | - | 1.99 / 2840.6 |

Mean score share 75.3% ± 4.5.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 110 over 4 battles (27.5 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cx.mini.Cigaret 1.31 | rank182-band3 | 75.3% ± 4.5 | 87.1% ± 5.9 | 59.7% ± 4.1 | 122 / 140 | - | - | 110 | - | 1.99 / 2840.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| cx.mini.Cigaret 1.31 | 4 | 997 | 22.6% | 68.3% | 0.5% | 8.7% | 689 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cx.mini.Cigaret 1.31 | 4 | 4 | n/a | 0 | 0.79 | 0 | 0 | 0 |

4 of 4 battles trusted.
