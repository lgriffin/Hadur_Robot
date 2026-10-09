# pa3k.Manta 1.20 (rank734-band6) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 87.5% | 100.0% | 74.3% | 35 / 35 | - | - | 3 | - | 1.06 / 4047.6 | 92.5% | -5.0 |
| 2 | 89.2% | 100.0% | 77.6% | 35 / 35 | - | - | 4 | - | 1.03 / 1336.6 | 91.3% | -2.1 |
| 3 | 86.7% | 100.0% | 73.6% | 35 / 35 | - | - | 0 | - | 0.91 / 3752.8 | 95.0% | -8.2 |
| 4 | 90.0% | 100.0% | 78.5% | 35 / 35 | - | - | 5 | - | 1.13 / 181.0 | 94.1% | -4.1 |

Mean score share 88.3% ± 2.4, baseline 93.2% ± 2.6, paired diff -4.9 ± 4.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 12 over 4 battles (3.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pa3k.Manta 1.20 | rank734-band6 | 88.3% ± 2.4 | 100.0% ± 0.0 | 76.0% ± 3.8 | 140 / 140 | - | - | 12 | - | 1.13 / 4047.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| pa3k.Manta 1.20 | 4 | 559 | 0.0% | 100.0% | 0.0% | 0.0% | 595 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pa3k.Manta 1.20 | 4 | 4 | n/a | 0 | 0.09 | 0 | 0 | 0 |

4 of 4 battles trusted.
