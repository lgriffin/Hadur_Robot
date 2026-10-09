# logiblocs.Fire 1.0 (rank1198-band6) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 98.2% | 97.1% | 98.7% | 34 / 35 | - | - | 382 | - | 0.87 / 983.3 | 98.0% | +0.2 |
| 2 | 97.3% | 100.0% | 94.6% | 35 / 35 | - | - | 2 | - | 0.75 / 748.3 | 97.1% | +0.2 |
| 3 | 97.2% | 97.1% | 96.8% | 34 / 35 | - | - | 380 | - | 0.89 / 944.1 | 98.8% | -1.6 |
| 4 | 99.1% | 100.0% | 98.1% | 35 / 35 | - | - | 2 | - | 0.77 / 751.4 | 97.4% | +1.7 |

Mean score share 97.9% ± 1.4, baseline 97.8% ± 1.2, paired diff +0.1 ± 2.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 766 over 4 battles (191.5 per battle, most in one battle 382). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| logiblocs.Fire 1.0 | rank1198-band6 | 97.9% ± 1.4 | 98.6% ± 2.6 | 97.1% ± 2.9 | 138 / 140 | - | - | 766 | - | 0.89 / 983.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| logiblocs.Fire 1.0 | 4 | 106 | 23.6% | 71.7% | 0.0% | 4.7% | 335 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| logiblocs.Fire 1.0 | 4 | 2 | n/a | 2 | 5.47 | 0 | 0 | 0 |

2 of 4 battles trusted.
