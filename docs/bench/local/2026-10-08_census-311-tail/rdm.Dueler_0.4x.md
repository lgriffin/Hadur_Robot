# rdm.Dueler 0.4x (rank344-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 86.6% | 100.0% | 72.6% | 35 / 35 | - | - | 4 | - | 1.00 / 391.5 | 88.4% | -1.8 |
| 2 | 83.6% | 91.4% | 74.9% | 32 / 35 | - | - | 8 | - | 1.06 / 999.7 | 83.0% | +0.6 |
| 3 | 85.8% | 100.0% | 70.7% | 35 / 35 | - | - | 7 | - | 1.04 / 531.7 | 92.0% | -6.2 |
| 4 | 91.7% | 97.1% | 84.8% | 34 / 35 | - | - | 10 | - | 1.03 / 888.6 | 86.9% | +4.8 |

Mean score share 86.9% ± 5.4, baseline 87.6% ± 5.9, paired diff -0.7 ± 7.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 29 over 4 battles (7.3 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| rdm.Dueler 0.4x | rank344-band4 | 86.9% ± 5.4 | 97.1% ± 6.4 | 75.8% ± 10.0 | 136 / 140 | - | - | 29 | - | 1.06 / 999.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| rdm.Dueler 0.4x | 4 | 604 | 8.3% | 87.7% | 0.2% | 3.8% | 552 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| rdm.Dueler 0.4x | 4 | 4 | n/a | 0 | 0.21 | 0 | 0 | 0 |

4 of 4 battles trusted.
