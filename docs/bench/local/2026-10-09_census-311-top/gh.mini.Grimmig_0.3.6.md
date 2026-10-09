# gh.mini.Grimmig 0.3.6 (rank179-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 91.3% | 100.0% | 82.2% | 35 / 35 | - | - | 15 | - | 1.01 / 35.7 | 88.4% | +2.9 |
| 2 | 91.2% | 100.0% | 82.1% | 35 / 35 | - | - | 6 | - | 1.00 / 34.6 | 86.4% | +4.8 |
| 3 | 89.0% | 97.1% | 80.1% | 34 / 35 | - | - | 12 | - | 0.99 / 35.3 | 88.1% | +0.9 |
| 4 | 90.2% | 100.0% | 79.9% | 35 / 35 | - | - | 6 | - | 1.00 / 34.1 | 87.6% | +2.5 |

Mean score share 90.4% ± 1.7, baseline 87.6% ± 1.4, paired diff +2.8 ± 2.6.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 39 over 4 battles (9.8 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| gh.mini.Grimmig 0.3.6 | rank179-band3 | 90.4% ± 1.7 | 99.3% ± 2.3 | 81.1% ± 2.0 | 139 / 140 | - | - | 39 | - | 1.01 / 35.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| gh.mini.Grimmig 0.3.6 | 4 | 466 | 2.7% | 96.4% | 0.0% | 0.9% | 608 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| gh.mini.Grimmig 0.3.6 | 4 | 4 | n/a | 0 | 0.28 | 0 | 0 | 0 |

4 of 4 battles trusted.
