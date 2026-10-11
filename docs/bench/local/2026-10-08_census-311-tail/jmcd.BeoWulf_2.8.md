# jmcd.BeoWulf 2.8 (rank441-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 86.6% | 100.0% | 75.2% | 35 / 35 | - | - | 6 | - | 0.95 / 42.1 | 87.5% | -0.8 |
| 2 | 86.4% | 97.1% | 75.9% | 34 / 35 | - | - | 12 | - | 1.03 / 428.2 | 88.2% | -1.9 |
| 3 | 88.8% | 100.0% | 77.4% | 35 / 35 | - | - | 20 | - | 1.05 / 1103.2 | 79.8% | +9.0 |
| 4 | 87.9% | 100.0% | 76.4% | 35 / 35 | - | - | 22 | - | 1.04 / 400.6 | 85.1% | +2.8 |

Mean score share 87.4% ± 1.8, baseline 85.2% ± 6.0, paired diff +2.3 ± 7.8.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 60 over 4 battles (15.0 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jmcd.BeoWulf 2.8 | rank441-band5 | 87.4% ± 1.8 | 99.3% ± 2.3 | 76.2% ± 1.5 | 139 / 140 | - | - | 60 | - | 1.05 / 1103.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| jmcd.BeoWulf 2.8 | 4 | 650 | 1.9% | 97.1% | 0.1% | 0.9% | 671 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jmcd.BeoWulf 2.8 | 4 | 4 | n/a | 0 | 0.43 | 0 | 0 | 0 |

4 of 4 battles trusted.
