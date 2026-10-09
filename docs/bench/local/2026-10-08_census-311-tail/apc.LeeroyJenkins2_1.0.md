# apc.LeeroyJenkins2 1.0 (rank512-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 84.5% | 97.1% | 72.7% | 34 / 35 | - | - | 32 | - | 0.99 / 906.9 | 82.9% | +1.6 |
| 2 | 84.8% | 97.1% | 73.6% | 34 / 35 | - | - | 5 | - | 0.87 / 1181.9 | 82.8% | +2.0 |
| 3 | 87.8% | 100.0% | 76.6% | 35 / 35 | - | - | 11 | - | 1.02 / 1287.0 | 84.5% | +3.3 |
| 4 | 81.8% | 94.3% | 71.2% | 33 / 35 | - | - | 10 | - | 0.87 / 1312.5 | 82.6% | -0.8 |

Mean score share 84.7% ± 3.9, baseline 83.2% ± 1.3, paired diff +1.5 ± 2.7.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 58 over 4 battles (14.5 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| apc.LeeroyJenkins2 1.0 | rank512-band5 | 84.7% ± 3.9 | 97.1% ± 3.7 | 73.5% ± 3.7 | 136 / 140 | - | - | 58 | - | 1.02 / 1312.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| apc.LeeroyJenkins2 1.0 | 4 | 816 | 6.1% | 91.1% | 0.0% | 2.7% | 645 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| apc.LeeroyJenkins2 1.0 | 4 | 4 | n/a | 0 | 0.41 | 0 | 0 | 0 |

4 of 4 battles trusted.
