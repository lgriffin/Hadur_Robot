# dsekercioglu.mega.WhiteFang 2.8.1 (rank16-band2) vs aaa.r.ScalarR 0.005h.053-noshield

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 70.7% | 80.0% | 61.0% | 28 / 35 | - | - | 15 | - | 0.94 / 516.8 |
| 2 | 68.5% | 82.9% | 55.5% | 29 / 35 | - | - | 15 | - | 0.95 / 51.5 |
| 3 | 69.3% | 85.7% | 53.7% | 30 / 35 | - | - | 12 | - | 1.01 / 1283.2 |
| 4 | 68.8% | 82.9% | 54.2% | 29 / 35 | - | - | 21 | - | 1.03 / 1143.5 |

Mean score share 69.3% ± 1.5.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 63 over 4 battles (15.8 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.WhiteFang 2.8.1 | rank16-band2 | 69.3% ± 1.5 | 82.9% ± 3.7 | 56.1% ± 5.3 | 116 / 140 | - | - | 63 | - | 1.03 / 1283.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.WhiteFang 2.8.1 | 4 | 1460 | 20.6% | 70.9% | 0.0% | 8.5% | 1184 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.WhiteFang 2.8.1 | 4 | 4 | n/a | 0 | 0.45 | 0 | 0 | 0 |

4 of 4 battles trusted.
