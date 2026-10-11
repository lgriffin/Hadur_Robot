# wcsv.Stampede2.Stampede2 1.1.0 (rank119-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 76.2% | 91.4% | 60.9% | 32 / 35 | - | - | 15 | - | 0.95 / 1079.6 | 70.3% | +5.9 |
| 2 | 76.4% | 94.3% | 57.3% | 33 / 35 | - | - | 33 | - | 1.05 / 770.3 | 78.6% | -2.2 |
| 3 | 74.1% | 85.7% | 62.0% | 30 / 35 | - | - | 28 | - | 1.03 / 657.2 | 77.5% | -3.4 |
| 4 | 79.1% | 94.3% | 61.9% | 33 / 35 | - | - | 15 | - | 1.05 / 820.1 | 76.4% | +2.7 |

Mean score share 76.5% ± 3.3, baseline 75.7% ± 5.9, paired diff +0.8 ± 6.9.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 91 over 4 battles (22.8 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| wcsv.Stampede2.Stampede2 1.1.0 | rank119-band3 | 76.5% ± 3.3 | 91.4% ± 6.4 | 60.5% ± 3.6 | 128 / 140 | - | - | 91 | - | 1.05 / 1079.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| wcsv.Stampede2.Stampede2 1.1.0 | 4 | 1077 | 13.9% | 80.1% | 0.0% | 6.0% | 781 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| wcsv.Stampede2.Stampede2 1.1.0 | 4 | 4 | n/a | 0 | 0.65 | 0 | 0 | 0 |

4 of 4 battles trusted.
