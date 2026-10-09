# bvh.mini.Freya 0.55 (rank338-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 84.3% | 100.0% | 67.4% | 35 / 35 | - | - | 12 | - | 0.97 / 724.6 | 88.9% | -4.6 |
| 2 | 86.6% | 97.1% | 73.4% | 34 / 35 | - | - | 17 | - | 0.96 / 577.5 | 97.2% | -10.6 |
| 3 | 81.0% | 91.4% | 68.9% | 32 / 35 | - | - | 13 | - | 0.99 / 954.3 | 97.1% | -16.1 |
| 4 | 88.1% | 100.0% | 74.0% | 35 / 35 | - | - | 4 | - | 0.88 / 163.9 | 94.4% | -6.3 |

Mean score share 85.0% ± 5.0, baseline 94.4% ± 6.2, paired diff -9.4 ± 8.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 46 over 4 battles (11.5 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| bvh.mini.Freya 0.55 | rank338-band4 | 85.0% ± 5.0 | 97.1% ± 6.4 | 70.9% ± 5.2 | 136 / 140 | - | - | 46 | - | 0.99 / 954.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| bvh.mini.Freya 0.55 | 4 | 666 | 7.5% | 89.0% | 0.0% | 3.5% | 613 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| bvh.mini.Freya 0.55 | 4 | 4 | n/a | 0 | 0.33 | 0 | 0 | 0 |

4 of 4 battles trusted.
