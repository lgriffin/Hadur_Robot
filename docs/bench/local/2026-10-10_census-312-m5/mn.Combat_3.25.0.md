# mn.Combat 3.25.0 (rank38-band2) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 59.3% | 67.6% | 52.0% | 24 / 35 | - | - | 47 | - | 1.66 / 1570.9 | 60.2% | -0.8 |
| 2 | 69.0% | 81.8% | 57.6% | 29 / 35 | - | - | 41 | - | 1.63 / 1383.0 | 60.9% | +8.1 |
| 3 | 51.5% | 52.9% | 49.9% | 19 / 35 | - | - | 52 | - | 1.71 / 1647.2 | 45.7% | +5.9 |
| 4 | 57.5% | 61.8% | 53.6% | 22 / 35 | - | - | 21 | - | 1.60 / 854.1 | 52.6% | +4.9 |

Mean score share 59.4% ± 11.5, baseline 54.8% ± 11.4, paired diff +4.5 ± 6.0.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 161 over 4 battles (40.3 per battle, most in one battle 52). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| mn.Combat 3.25.0 | rank38-band2 | 59.4% ± 11.5 | 66.0% ± 19.3 | 53.3% ± 5.1 | 94 / 140 | - | - | 161 | - | 1.71 / 1647.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| mn.Combat 3.25.0 | 4 | 1997 | 28.8% | 59.6% | 0.0% | 11.6% | 1309 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| mn.Combat 3.25.0 | 4 | 4 | n/a | 0 | 1.15 | 0 | 0 | 0 |

4 of 4 battles trusted.
