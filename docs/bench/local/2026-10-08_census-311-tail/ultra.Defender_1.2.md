# ultra.Defender 1.2 (rank472-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 85.5% | 97.1% | 75.1% | 34 / 35 | - | - | 1 | - | 1.41 / 936.7 | 90.2% | -4.6 |
| 2 | 91.8% | 100.0% | 83.8% | 35 / 35 | - | - | 5 | - | 1.38 / 1501.8 | 83.2% | +8.6 |
| 3 | 86.1% | 97.1% | 75.8% | 34 / 35 | - | - | 1 | - | 1.44 / 1074.9 | 87.2% | -1.1 |
| 4 | 85.1% | 94.3% | 76.6% | 33 / 35 | - | - | 3 | - | 1.34 / 1198.3 | 85.0% | +0.2 |

Mean score share 87.1% ± 5.0, baseline 86.4% ± 4.8, paired diff +0.7 ± 8.9.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 10 over 4 battles (2.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ultra.Defender 1.2 | rank472-band5 | 87.1% ± 5.0 | 97.1% ± 3.7 | 77.8% ± 6.4 | 136 / 140 | - | - | 10 | - | 1.44 / 1501.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ultra.Defender 1.2 | 4 | 675 | 7.4% | 89.1% | 0.0% | 3.4% | 687 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ultra.Defender 1.2 | 4 | 4 | n/a | 0 | 0.07 | 0 | 0 | 0 |

4 of 4 battles trusted.
