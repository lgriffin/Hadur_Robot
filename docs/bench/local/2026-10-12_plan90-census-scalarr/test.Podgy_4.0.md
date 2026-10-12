# test.Podgy 4.0 (rank1022-band6) vs aaa.r.ScalarR 0.005h.053-noshield

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 93.3% | 100.0% | 83.9% | 35 / 35 | - | - | 20 | - | 0.75 / 47.6 |
| 2 | 93.9% | 100.0% | 86.4% | 35 / 35 | - | - | 7 | - | 0.69 / 3268.2 |
| 3 | 90.5% | 100.0% | 78.8% | 35 / 35 | - | - | 21 | - | 0.71 / 3060.9 |
| 4 | 92.6% | 100.0% | 83.4% | 35 / 35 | - | - | 58 | - | 0.75 / 3168.1 |

Mean score share 92.6% ± 2.4.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 106 over 4 battles (26.5 per battle, most in one battle 58). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| test.Podgy 4.0 | rank1022-band6 | 92.6% ± 2.4 | 100.0% ± 0.0 | 83.1% ± 5.1 | 140 / 140 | - | - | 106 | - | 0.75 / 3268.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| test.Podgy 4.0 | 4 | 320 | 0.0% | 100.0% | 0.0% | 0.0% | 531 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| test.Podgy 4.0 | 4 | 4 | n/a | 1 | 0.76 | 0 | 0 | 0 |

4 of 4 battles trusted.
