# az.Ololobot 0.2.4 (rank554-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 88.9% | 91.4% | 85.7% | 32 / 35 | - | - | 19 | - | 1.12 / 960.2 | 84.3% | +4.6 |
| 2 | 91.1% | 97.1% | 85.8% | 34 / 35 | - | - | 27 | - | 1.06 / 937.6 | 90.3% | +0.8 |
| 3 | 91.9% | 100.0% | 85.0% | 35 / 35 | - | - | 33 | - | 1.06 / 949.9 | 86.0% | +5.9 |
| 4 | 89.2% | 94.3% | 84.3% | 33 / 35 | - | - | 27 | - | 1.10 / 981.5 | 91.3% | -2.1 |

Mean score share 90.3% ± 2.3, baseline 88.0% ± 5.3, paired diff +2.3 ± 5.8.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 106 over 4 battles (26.5 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| az.Ololobot 0.2.4 | rank554-band5 | 90.3% ± 2.3 | 95.7% ± 5.9 | 85.2% ± 1.1 | 134 / 140 | - | - | 106 | - | 1.12 / 981.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| az.Ololobot 0.2.4 | 4 | 545 | 13.8% | 81.6% | 0.4% | 4.3% | 1009 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| az.Ololobot 0.2.4 | 4 | 4 | n/a | 0 | 0.76 | 0 | 0 | 0 |

4 of 4 battles trusted.
