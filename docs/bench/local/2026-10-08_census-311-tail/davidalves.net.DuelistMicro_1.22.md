# davidalves.net.DuelistMicro 1.22 (rank273-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 75.8% | 88.6% | 62.4% | 31 / 35 | - | - | 10 | - | 0.94 / 57.1 | 83.4% | -7.6 |
| 2 | 80.4% | 94.3% | 66.8% | 33 / 35 | - | - | 14 | - | 0.99 / 943.3 | 79.3% | +1.1 |
| 3 | 80.0% | 94.3% | 63.5% | 33 / 35 | - | - | 11 | - | 0.94 / 118.6 | 85.4% | -5.5 |
| 4 | 83.2% | 97.1% | 67.6% | 34 / 35 | - | - | 4 | - | 0.93 / 892.9 | 82.8% | +0.5 |

Mean score share 79.9% ± 4.9, baseline 82.7% ± 4.0, paired diff -2.9 ± 6.9.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 39 over 4 battles (9.8 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| davidalves.net.DuelistMicro 1.22 | rank273-band4 | 79.9% ± 4.9 | 93.6% ± 5.7 | 65.1% ± 4.1 | 131 / 140 | - | - | 39 | - | 0.99 / 943.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| davidalves.net.DuelistMicro 1.22 | 4 | 927 | 12.1% | 82.4% | 0.0% | 5.5% | 656 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| davidalves.net.DuelistMicro 1.22 | 4 | 4 | n/a | 0 | 0.28 | 0 | 0 | 0 |

4 of 4 battles trusted.
