# PkKillers.PkAssassin 1.0 (rank521-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 87.1% | 97.1% | 77.5% | 34 / 35 | - | - | 5 | - | 0.93 / 606.1 | 84.6% | +2.5 |
| 2 | 91.4% | 100.0% | 82.3% | 35 / 35 | - | - | 3 | - | 0.88 / 1156.6 | 86.7% | +4.7 |
| 3 | 92.1% | 100.0% | 83.8% | 35 / 35 | - | - | 4 | - | 0.86 / 1099.5 | 91.6% | +0.4 |
| 4 | 92.8% | 100.0% | 84.9% | 35 / 35 | - | - | 3 | - | 0.85 / 2149.3 | 85.4% | +7.4 |

Mean score share 90.8% ± 4.1, baseline 87.1% ± 5.1, paired diff +3.8 ± 4.8.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 15 over 4 battles (3.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| PkKillers.PkAssassin 1.0 | rank521-band5 | 90.8% ± 4.1 | 99.3% ± 2.3 | 82.1% ± 5.2 | 139 / 140 | - | - | 15 | - | 0.93 / 2149.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| PkKillers.PkAssassin 1.0 | 4 | 450 | 2.8% | 95.6% | 0.0% | 1.7% | 567 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| PkKillers.PkAssassin 1.0 | 4 | 4 | n/a | 0 | 0.11 | 0 | 0 | 0 |

4 of 4 battles trusted.
