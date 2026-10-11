# stelo.MatchupAGF 1.1 (rank212-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 60.2% | 62.9% | 57.9% | 22 / 35 | - | - | 32 | - | 1.36 / 1095.1 | 70.6% | -10.5 |
| 2 | 69.6% | 80.0% | 60.1% | 28 / 35 | - | - | 72 | - | 1.46 / 1180.2 | 72.7% | -3.1 |
| 3 | 56.8% | 57.1% | 56.3% | 20 / 35 | - | - | 42 | - | 1.40 / 1024.1 | 73.3% | -16.5 |
| 4 | 62.9% | 67.6% | 58.4% | 24 / 35 | - | - | 29 | - | 1.36 / 1082.4 | 69.6% | -6.7 |

Mean score share 62.4% ± 8.7, baseline 71.6% ± 2.7, paired diff -9.2 ± 9.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 175 over 4 battles (43.8 per battle, most in one battle 72). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| stelo.MatchupAGF 1.1 | rank212-band4 | 62.4% ± 8.7 | 66.9% ± 15.5 | 58.2% ± 2.5 | 94 / 140 | - | - | 175 | - | 1.46 / 1180.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| stelo.MatchupAGF 1.1 | 4 | 1979 | 29.1% | 59.3% | 0.0% | 11.6% | 1151 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| stelo.MatchupAGF 1.1 | 4 | 3 | n/a | 0 | 1.25 | 0 | 0 | 0 |

3 of 4 battles trusted.
