# ejbots.AngryGrandpappy 1.2 (rank916-band6) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 97.6% | 100.0% | 95.2% | 35 / 35 | - | - | 3 | - | 0.83 / 1536.1 | 96.4% | +1.3 |
| 2 | 91.9% | 97.1% | 87.0% | 34 / 35 | - | - | 351 | - | 4.31 / 2728.7 | 94.9% | -2.9 |
| 3 | 96.8% | 100.0% | 93.5% | 35 / 35 | - | - | 100 | - | 3.03 / 3701.5 | 90.4% | +6.4 |
| 4 | 94.4% | 100.0% | 88.9% | 35 / 35 | - | - | 393 | - | 4.30 / 2796.9 | 98.1% | -3.7 |

Mean score share 95.2% ± 4.1, baseline 94.9% ± 5.2, paired diff +0.3 ± 7.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 847 over 4 battles (211.8 per battle, most in one battle 393). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ejbots.AngryGrandpappy 1.2 | rank916-band6 | 95.2% ± 4.1 | 99.3% ± 2.3 | 91.2% ± 6.1 | 139 / 140 | - | - | 847 | - | 4.31 / 3701.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ejbots.AngryGrandpappy 1.2 | 4 | 246 | 5.1% | 91.3% | 0.6% | 3.0% | 371 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ejbots.AngryGrandpappy 1.2 | 4 | 1 | n/a | 0 | 6.05 | 0 | 0 | 0 |

1 of 4 battles trusted.
