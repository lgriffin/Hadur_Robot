# ad.Quest 0.10 (rank167-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 81.8% | 94.3% | 67.6% | 33 / 35 | - | - | 27 | - | 1.09 / 115.6 | 84.7% | -2.9 |
| 2 | 83.0% | 97.1% | 66.3% | 34 / 35 | - | - | 30 | - | 1.07 / 348.8 | 79.5% | +3.5 |
| 3 | 78.5% | 94.3% | 62.5% | 33 / 35 | - | - | 20 | - | 1.10 / 69.0 | 88.6% | -10.1 |
| 4 | 80.8% | 94.3% | 66.1% | 33 / 35 | - | - | 20 | - | 1.07 / 283.8 | 86.1% | -5.4 |

Mean score share 81.0% ± 3.1, baseline 84.7% ± 6.1, paired diff -3.7 ± 9.0.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 97 over 4 battles (24.3 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ad.Quest 0.10 | rank167-band3 | 81.0% ± 3.1 | 95.0% ± 2.3 | 65.6% ± 3.5 | 133 / 140 | - | - | 97 | - | 1.10 / 348.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ad.Quest 0.10 | 4 | 866 | 10.1% | 85.6% | 0.0% | 4.3% | 693 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ad.Quest 0.10 | 4 | 4 | n/a | 0 | 0.69 | 0 | 0 | 0 |

4 of 4 battles trusted.
