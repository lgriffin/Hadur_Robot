# sgp.SleepingGoat 1.1 (rank835-band6) vs aaa.r.ScalarR 0.005h.053-noshield

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 96.7% | 100.0% | 92.6% | 35 / 35 | - | - | 19 | - | 0.76 / 2085.8 |
| 2 | 95.6% | 100.0% | 90.4% | 35 / 35 | - | - | 8 | - | 0.78 / 1834.4 |
| 3 | 96.9% | 100.0% | 93.3% | 35 / 35 | - | - | 41 | - | 0.78 / 1817.0 |
| 4 | 95.4% | 100.0% | 89.9% | 35 / 35 | - | - | 55 | - | 0.80 / 2037.8 |

Mean score share 96.1% ± 1.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 123 over 4 battles (30.8 per battle, most in one battle 55). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sgp.SleepingGoat 1.1 | rank835-band6 | 96.1% ± 1.2 | 100.0% ± 0.0 | 91.6% ± 2.6 | 140 / 140 | - | - | 123 | - | 0.80 / 2085.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| sgp.SleepingGoat 1.1 | 4 | 174 | 0.0% | 99.4% | 0.6% | 0.0% | 497 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sgp.SleepingGoat 1.1 | 4 | 4 | n/a | 1 | 0.88 | 0 | 0 | 0 |

4 of 4 battles trusted.
