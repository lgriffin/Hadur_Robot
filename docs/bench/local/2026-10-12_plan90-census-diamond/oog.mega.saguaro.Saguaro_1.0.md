# oog.mega.saguaro.Saguaro 1.0 (rank4-band1) vs voidious.Diamond 1.8.22

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 75.7% | 94.3% | 52.1% | 33 / 35 | - | - | 0 | - | 2.18 / 885.4 |
| 2 | 61.4% | 74.3% | 48.5% | 26 / 35 | - | - | 1 | - | 2.21 / 1088.0 |
| 3 | 70.4% | 88.6% | 48.7% | 31 / 35 | - | - | 0 | - | 2.24 / 1224.9 |
| 4 | 65.5% | 82.9% | 48.0% | 29 / 35 | - | - | 4 | - | 2.27 / 719.0 |

Mean score share 68.3% ± 9.8.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 5 over 4 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | rank4-band1 | 68.3% ± 9.8 | 85.0% ± 13.6 | 49.3% ± 3.0 | 119 / 140 | - | - | 5 | - | 2.27 / 1224.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | 4 | 1363 | 19.3% | 72.0% | 0.0% | 8.8% | 758 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | 4 | 4 | n/a | 0 | 0.04 | 0 | 0 | 0 |

4 of 4 battles trusted.
