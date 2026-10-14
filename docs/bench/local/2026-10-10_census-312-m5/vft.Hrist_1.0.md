# vft.Hrist 1.0 (rank969-band6) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 94.3% | 97.1% | 90.3% | 34 / 35 | - | - | 92 | - | 1.29 / 376.0 | 84.8% | +9.5 |
| 2 | 94.2% | 100.0% | 87.6% | 35 / 35 | - | - | 3 | - | 0.86 / 2876.7 | 89.6% | +4.6 |
| 3 | 94.1% | 100.0% | 87.3% | 35 / 35 | - | - | 29 | - | 1.32 / 864.6 | 96.1% | -2.1 |
| 4 | 94.4% | 100.0% | 88.4% | 35 / 35 | - | - | 4 | - | 0.79 / 3164.5 | 94.5% | -0.1 |

Mean score share 94.2% ± 0.2, baseline 91.3% ± 8.1, paired diff +3.0 ± 8.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 128 over 4 battles (32.0 per battle, most in one battle 92). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| vft.Hrist 1.0 | rank969-band6 | 94.2% ± 0.2 | 99.3% ± 2.3 | 88.4% ± 2.2 | 139 / 140 | - | - | 128 | - | 1.32 / 3164.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| vft.Hrist 1.0 | 4 | 269 | 4.7% | 94.2% | 0.2% | 0.9% | 574 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| vft.Hrist 1.0 | 4 | 3 | n/a | 1 | 0.91 | 0 | 0 | 0 |

3 of 4 battles trusted.
