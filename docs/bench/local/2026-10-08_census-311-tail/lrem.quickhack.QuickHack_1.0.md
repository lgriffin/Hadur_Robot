# lrem.quickhack.QuickHack 1.0 (rank519-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 88.5% | 100.0% | 78.9% | 35 / 35 | - | - | 4 | - | 0.77 / 1294.7 | 88.7% | -0.2 |
| 2 | 89.6% | 97.1% | 82.1% | 34 / 35 | - | - | 290 | - | 0.93 / 620.3 | 90.1% | -0.5 |
| 3 | 91.1% | 100.0% | 82.8% | 35 / 35 | - | - | 6 | - | 0.93 / 480.6 | 89.2% | +1.9 |
| 4 | 87.7% | 94.3% | 81.5% | 33 / 35 | - | - | 7 | - | 0.87 / 2070.1 | 86.8% | +0.9 |

Mean score share 89.2% ± 2.3, baseline 88.7% ± 2.2, paired diff +0.5 ± 1.7.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 307 over 4 battles (76.8 per battle, most in one battle 290). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| lrem.quickhack.QuickHack 1.0 | rank519-band5 | 89.2% ± 2.3 | 97.9% ± 4.4 | 81.3% ± 2.7 | 137 / 140 | - | - | 307 | - | 0.93 / 2070.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| lrem.quickhack.QuickHack 1.0 | 4 | 585 | 6.4% | 91.5% | 0.0% | 2.1% | 550 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| lrem.quickhack.QuickHack 1.0 | 4 | 3 | n/a | 1 | 2.19 | 0 | 0 | 0 |

3 of 4 battles trusted.
