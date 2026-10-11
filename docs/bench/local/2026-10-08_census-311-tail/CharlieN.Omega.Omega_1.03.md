# CharlieN.Omega.Omega 1.03 (rank459-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 88.5% | 100.0% | 75.3% | 35 / 35 | - | - | 16 | - | 1.01 / 1282.9 | 83.3% | +5.2 |
| 2 | 88.0% | 97.1% | 77.7% | 34 / 35 | - | - | 8 | - | 0.96 / 2200.6 | 84.0% | +4.0 |
| 3 | 92.1% | 100.0% | 82.9% | 35 / 35 | - | - | 7 | - | 0.92 / 329.3 | 82.3% | +9.8 |
| 4 | 89.4% | 100.0% | 77.3% | 35 / 35 | - | - | 7 | - | 0.93 / 2077.2 | 85.4% | +4.0 |

Mean score share 89.5% ± 2.9, baseline 83.8% ± 2.1, paired diff +5.8 ± 4.4.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 38 over 4 battles (9.5 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | rank459-band5 | 89.5% ± 2.9 | 99.3% ± 2.3 | 78.3% ± 5.2 | 139 / 140 | - | - | 38 | - | 1.01 / 2200.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | 4 | 478 | 2.6% | 96.2% | 0.0% | 1.2% | 593 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | 4 | 4 | n/a | 0 | 0.27 | 0 | 0 | 0 |

4 of 4 battles trusted.
