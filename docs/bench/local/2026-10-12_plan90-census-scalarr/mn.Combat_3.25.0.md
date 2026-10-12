# mn.Combat 3.25.0 (rank38-band2) vs aaa.r.ScalarR 0.005h.053-noshield

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 76.4% | 94.3% | 55.5% | 33 / 35 | - | - | 18 | - | 1.74 / 1239.7 |
| 2 | 72.7% | 85.7% | 59.0% | 30 / 35 | - | - | 8 | - | 1.61 / 898.8 |
| 3 | 69.9% | 82.9% | 55.9% | 29 / 35 | - | - | 7 | - | 1.77 / 1249.7 |
| 4 | 72.6% | 91.4% | 52.2% | 32 / 35 | - | - | 10 | - | 1.80 / 1036.4 |

Mean score share 72.9% ± 4.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 43 over 4 battles (10.8 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| mn.Combat 3.25.0 | rank38-band2 | 72.9% ± 4.3 | 88.6% ± 8.3 | 55.7% ± 4.4 | 124 / 140 | - | - | 43 | - | 1.80 / 1249.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| mn.Combat 3.25.0 | 4 | 1211 | 16.5% | 76.9% | 0.0% | 6.6% | 1498 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| mn.Combat 3.25.0 | 4 | 4 | n/a | 0 | 0.31 | 0 | 0 | 0 |

4 of 4 battles trusted.
