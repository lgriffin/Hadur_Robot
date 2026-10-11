# catcat20.helios.Helios 1.5 (rank150-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 83.5% | 94.3% | 73.0% | 33 / 35 | - | - | 9 | - | 1.33 / 1566.5 | 74.3% | +9.2 |
| 2 | 80.0% | 91.4% | 69.5% | 32 / 35 | - | - | 11 | - | 1.35 / 942.0 | 83.8% | -3.8 |
| 3 | 80.8% | 91.4% | 70.7% | 32 / 35 | - | - | 10 | - | 1.34 / 2035.9 | 76.9% | +4.0 |
| 4 | 77.6% | 88.6% | 67.0% | 31 / 35 | - | - | 15 | - | 1.32 / 753.7 | 77.4% | +0.2 |

Mean score share 80.5% ± 3.9, baseline 78.1% ± 6.4, paired diff +2.4 ± 8.8.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 45 over 4 battles (11.3 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| catcat20.helios.Helios 1.5 | rank150-band3 | 80.5% ± 3.9 | 91.4% ± 3.7 | 70.1% ± 4.0 | 128 / 140 | - | - | 45 | - | 1.35 / 2035.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| catcat20.helios.Helios 1.5 | 4 | 1003 | 15.0% | 79.0% | 0.0% | 6.1% | 810 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| catcat20.helios.Helios 1.5 | 4 | 4 | n/a | 0 | 0.32 | 0 | 0 | 0 |

4 of 4 battles trusted.
