# wiki.mini.Sedan 1.0 (rank194-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 82.3% | 94.3% | 67.1% | 33 / 35 | - | - | 11 | - | 0.97 / 133.1 | 93.8% | -11.6 |
| 2 | 78.7% | 94.3% | 60.3% | 33 / 35 | - | - | 8 | - | 0.99 / 1612.4 | 95.2% | -16.5 |
| 3 | 82.4% | 97.1% | 65.0% | 34 / 35 | - | - | 12 | - | 0.92 / 885.4 | 85.8% | -3.4 |
| 4 | 79.6% | 94.3% | 62.1% | 33 / 35 | - | - | 7 | - | 0.88 / 1169.8 | 90.4% | -10.9 |

Mean score share 80.8% ± 3.0, baseline 91.3% ± 6.7, paired diff -10.6 ± 8.6.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 38 over 4 battles (9.5 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| wiki.mini.Sedan 1.0 | rank194-band3 | 80.8% ± 3.0 | 95.0% ± 2.3 | 63.6% ± 4.8 | 133 / 140 | - | - | 38 | - | 0.99 / 1612.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| wiki.mini.Sedan 1.0 | 4 | 823 | 10.6% | 84.7% | 0.0% | 4.6% | 644 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| wiki.mini.Sedan 1.0 | 4 | 4 | n/a | 0 | 0.27 | 0 | 0 | 0 |

4 of 4 battles trusted.
