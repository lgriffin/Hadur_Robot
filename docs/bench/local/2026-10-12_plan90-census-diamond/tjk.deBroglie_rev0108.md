# tjk.deBroglie rev0108 (rank52-band3) vs voidious.Diamond 1.8.22

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 58.1% | 68.6% | 49.1% | 24 / 35 | - | - | 1 | - | 1.94 / 1130.4 |
| 2 | 70.9% | 91.4% | 50.5% | 32 / 35 | - | - | 2 | - | 1.91 / 1114.2 |
| 3 | 63.4% | 80.0% | 48.1% | 28 / 35 | - | - | 2 | - | 1.84 / 17.2 |
| 4 | 57.9% | 74.3% | 43.5% | 26 / 35 | - | - | 4 | - | 1.86 / 25.3 |

Mean score share 62.6% ± 9.7.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 9 over 4 battles (2.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| tjk.deBroglie rev0108 | rank52-band3 | 62.6% ± 9.7 | 78.6% ± 15.5 | 47.8% ± 4.9 | 110 / 140 | - | - | 9 | - | 1.94 / 1130.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| tjk.deBroglie rev0108 | 4 | 1799 | 20.8% | 69.6% | 0.0% | 9.5% | 854 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| tjk.deBroglie rev0108 | 4 | 4 | n/a | 0 | 0.06 | 0 | 0 | 0 |

4 of 4 battles trusted.
