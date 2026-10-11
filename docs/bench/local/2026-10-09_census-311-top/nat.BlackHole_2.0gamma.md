# nat.BlackHole 2.0gamma (rank125-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 79.0% | 97.1% | 59.5% | 34 / 35 | - | - | 15 | - | 1.09 / 493.9 | 75.7% | +3.4 |
| 2 | 72.3% | 85.7% | 58.4% | 30 / 35 | - | - | 9 | - | 1.10 / 954.3 | 72.9% | -0.6 |
| 3 | 69.0% | 85.7% | 51.4% | 30 / 35 | - | - | 16 | - | 1.08 / 1420.5 | 66.2% | +2.8 |
| 4 | 63.3% | 80.0% | 46.8% | 28 / 35 | - | - | 16 | - | 1.08 / 1368.7 | 74.0% | -10.7 |

Mean score share 70.9% ± 10.4, baseline 72.2% ± 6.6, paired diff -1.3 ± 10.4.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 56 over 4 battles (14.0 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| nat.BlackHole 2.0gamma | rank125-band3 | 70.9% ± 10.4 | 87.1% ± 11.4 | 54.0% ± 9.6 | 122 / 140 | - | - | 56 | - | 1.10 / 1420.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| nat.BlackHole 2.0gamma | 4 | 1322 | 17.0% | 75.6% | 0.0% | 7.4% | 824 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| nat.BlackHole 2.0gamma | 4 | 4 | n/a | 0 | 0.40 | 0 | 0 | 0 |

4 of 4 battles trusted.
