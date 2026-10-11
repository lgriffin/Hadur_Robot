# alpha.RainingFire 1.0 (rank192-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 75.4% | 85.7% | 66.2% | 30 / 35 | - | - | 11 | - | 1.19 / 513.5 | 70.3% | +5.1 |
| 2 | 79.4% | 94.3% | 65.7% | 33 / 35 | - | - | 19 | - | 1.23 / 775.6 | 79.0% | +0.4 |
| 3 | 78.3% | 94.1% | 64.6% | 33 / 35 | - | - | 12 | - | 1.21 / 790.8 | 78.4% | -0.1 |
| 4 | 79.3% | 91.4% | 67.2% | 32 / 35 | - | - | 227 | - | 1.22 / 42.8 | 71.3% | +8.0 |

Mean score share 78.1% ± 3.0, baseline 74.7% ± 7.3, paired diff +3.4 ± 6.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 269 over 4 battles (67.3 per battle, most in one battle 227). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| alpha.RainingFire 1.0 | rank192-band3 | 78.1% ± 3.0 | 91.4% ± 6.4 | 65.9% ± 1.8 | 128 / 140 | - | - | 269 | - | 1.23 / 790.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| alpha.RainingFire 1.0 | 4 | 1130 | 13.3% | 81.2% | 0.0% | 5.5% | 715 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| alpha.RainingFire 1.0 | 4 | 3 | n/a | 1 | 1.92 | 0 | 0 | 0 |

3 of 4 battles trusted.
