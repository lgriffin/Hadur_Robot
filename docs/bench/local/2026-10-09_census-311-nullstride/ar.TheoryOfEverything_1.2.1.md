# ar.TheoryOfEverything 1.2.1 (rank570-band5) vs jd.Nullstride 2.3.3

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 95.4% | 100.0% | 88.9% | 35 / 35 | - | - | 11 | - | 0.78 / 299.2 |
| 2 | 95.0% | 100.0% | 88.0% | 35 / 35 | - | - | 7 | - | 0.78 / 356.8 |
| 3 | 94.0% | 97.1% | 89.4% | 34 / 35 | - | - | 4 | - | 0.78 / 295.7 |
| 4 | 94.3% | 100.0% | 86.8% | 35 / 35 | - | - | 5 | - | 0.73 / 152.0 |

Mean score share 94.7% ± 1.0.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 27 over 4 battles (6.8 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ar.TheoryOfEverything 1.2.1 | rank570-band5 | 94.7% ± 1.0 | 99.3% ± 2.3 | 88.3% ± 1.8 | 139 / 140 | - | - | 27 | - | 0.78 / 356.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ar.TheoryOfEverything 1.2.1 | 4 | 220 | 5.7% | 92.3% | 0.0% | 2.0% | 509 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ar.TheoryOfEverything 1.2.1 | 4 | 4 | n/a | 0 | 0.19 | 0 | 0 | 0 |

4 of 4 battles trusted.
