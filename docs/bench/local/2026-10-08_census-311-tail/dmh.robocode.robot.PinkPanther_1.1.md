# dmh.robocode.robot.PinkPanther 1.1 (rank385-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 74.1% | 91.4% | 54.9% | 32 / 35 | - | - | 21 | - | 1.10 / 610.7 | 68.1% | +6.0 |
| 2 | 73.9% | 88.6% | 55.9% | 31 / 35 | - | - | 12 | - | 1.05 / 1781.1 | 71.2% | +2.7 |
| 3 | 71.6% | 94.3% | 47.8% | 33 / 35 | - | - | 13 | - | 1.07 / 304.1 | 62.2% | +9.4 |
| 4 | 61.7% | 77.1% | 47.0% | 27 / 35 | - | - | 9 | - | 1.03 / 1659.1 | 54.3% | +7.4 |

Mean score share 70.3% ± 9.3, baseline 64.0% ± 11.8, paired diff +6.4 ± 4.5.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 55 over 4 battles (13.8 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | rank385-band4 | 70.3% ± 9.3 | 87.9% ± 12.0 | 51.4% ± 7.4 | 123 / 140 | - | - | 55 | - | 1.10 / 1781.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | 4 | 1309 | 16.2% | 76.0% | 0.1% | 7.6% | 682 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | 4 | 4 | n/a | 0 | 0.39 | 0 | 0 | 0 |

4 of 4 battles trusted.
