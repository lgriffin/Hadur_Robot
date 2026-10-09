# pac.ABC 2.1 (rank1127-band6) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 99.6% | 100.0% | 99.2% | 35 / 35 | - | - | 0 | - | 0.64 / 37.1 | 99.3% | +0.3 |
| 2 | 98.8% | 100.0% | 97.8% | 35 / 35 | - | - | 1 | - | 0.73 / 23.0 | 99.3% | -0.5 |
| 3 | 98.3% | 100.0% | 97.1% | 35 / 35 | - | - | 0 | - | 0.65 / 4359.7 | 99.6% | -1.2 |
| 4 | 99.7% | 100.0% | 99.5% | 35 / 35 | - | - | 4 | - | 0.79 / 244.8 | 99.7% | -0.0 |

Mean score share 99.1% ± 1.0, baseline 99.5% ± 0.3, paired diff -0.4 ± 1.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 5 over 4 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pac.ABC 2.1 | rank1127-band6 | 99.1% ± 1.0 | 100.0% ± 0.0 | 98.4% ± 1.8 | 140 / 140 | - | - | 5 | - | 0.79 / 4359.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| pac.ABC 2.1 | 4 | 56 | 0.0% | 98.6% | 1.4% | 0.0% | 479 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pac.ABC 2.1 | 4 | 4 | n/a | 0 | 0.04 | 0 | 0 | 0 |

4 of 4 battles trusted.
