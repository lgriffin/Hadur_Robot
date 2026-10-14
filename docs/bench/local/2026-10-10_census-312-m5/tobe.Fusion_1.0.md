# tobe.Fusion 1.0 (rank534-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 82.6% | 88.6% | 76.5% | 31 / 35 | - | - | 24 | - | 0.96 / 267.6 | 74.8% | +7.7 |
| 2 | 77.9% | 88.6% | 68.8% | 31 / 35 | - | - | 11 | - | 0.96 / 179.6 | 79.4% | -1.5 |
| 3 | 86.1% | 97.1% | 75.3% | 34 / 35 | - | - | 24 | - | 0.94 / 9304.9 | 83.3% | +2.9 |
| 4 | 84.4% | 97.1% | 72.4% | 34 / 35 | - | - | 22 | - | 0.99 / 1398.0 | 86.3% | -1.9 |

Mean score share 82.8% ± 5.7, baseline 80.9% ± 7.9, paired diff +1.8 ± 7.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 81 over 4 battles (20.3 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| tobe.Fusion 1.0 | rank534-band5 | 82.8% ± 5.7 | 92.9% ± 7.9 | 73.3% ± 5.4 | 130 / 140 | - | - | 81 | - | 0.99 / 9304.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| tobe.Fusion 1.0 | 4 | 884 | 14.1% | 79.3% | 0.1% | 6.4% | 736 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| tobe.Fusion 1.0 | 4 | 4 | n/a | 0 | 0.58 | 0 | 0 | 0 |

4 of 4 battles trusted.
