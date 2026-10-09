# jab.DiamondStealer 5 (rank522-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 88.0% | 97.1% | 79.7% | 34 / 35 | - | - | 113 | - | 0.92 / 931.2 | 82.4% | +5.6 |
| 2 | 86.7% | 100.0% | 76.2% | 35 / 35 | - | - | 1 | - | 0.93 / 1379.7 | 84.1% | +2.6 |
| 3 | 82.1% | 97.1% | 70.2% | 34 / 35 | - | - | 4 | - | 0.98 / 55.0 | 86.1% | -4.0 |
| 4 | 86.8% | 100.0% | 76.0% | 35 / 35 | - | - | 1 | - | 0.93 / 950.6 | 84.8% | +2.0 |

Mean score share 85.9% ± 4.1, baseline 84.4% ± 2.4, paired diff +1.5 ± 6.4.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 119 over 4 battles (29.8 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jab.DiamondStealer 5 | rank522-band5 | 85.9% ± 4.1 | 98.6% ± 2.6 | 75.5% ± 6.2 | 138 / 140 | - | - | 119 | - | 0.98 / 1379.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| jab.DiamondStealer 5 | 4 | 809 | 3.1% | 95.8% | 0.0% | 1.1% | 406 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jab.DiamondStealer 5 | 4 | 3 | n/a | 1 | 0.85 | 0 | 0 | 0 |

3 of 4 battles trusted.
