# oog.micro.Claudius 1.11 (rank147-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 71.9% | 82.9% | 61.2% | 29 / 35 | - | - | 15 | - | 1.04 / 1623.8 | 71.0% | +0.9 |
| 2 | 82.7% | 97.1% | 68.1% | 34 / 35 | - | - | 14 | - | 1.10 / 2404.2 | 73.8% | +8.8 |
| 3 | 75.2% | 85.7% | 64.9% | 30 / 35 | - | - | 19 | - | 1.18 / 38.1 | 70.0% | +5.3 |
| 4 | 67.9% | 80.0% | 56.6% | 28 / 35 | - | - | 23 | - | 1.17 / 2182.6 | 73.4% | -5.4 |

Mean score share 74.4% ± 10.0, baseline 72.0% ± 3.0, paired diff +2.4 ± 9.8.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 71 over 4 battles (17.8 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| oog.micro.Claudius 1.11 | rank147-band3 | 74.4% ± 10.0 | 86.4% ± 12.0 | 62.7% ± 7.9 | 121 / 140 | - | - | 71 | - | 1.18 / 2404.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| oog.micro.Claudius 1.11 | 4 | 1254 | 18.9% | 73.3% | 0.0% | 7.8% | 829 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| oog.micro.Claudius 1.11 | 4 | 4 | n/a | 0 | 0.51 | 0 | 0 | 0 |

4 of 4 battles trusted.
