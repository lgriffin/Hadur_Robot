# ers.nano.lig.LigMA 1.9 (rank419-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 88.4% | 100.0% | 77.1% | 35 / 35 | - | - | 6 | - | 0.80 / 4430.5 | 77.7% | +10.7 |
| 2 | 86.5% | 100.0% | 74.3% | 35 / 35 | - | - | 3 | - | 0.86 / 1109.0 | 90.7% | -4.2 |
| 3 | 85.4% | 100.0% | 72.5% | 35 / 35 | - | - | 4 | - | 0.85 / 820.4 | 86.6% | -1.2 |
| 4 | 86.6% | 94.3% | 78.7% | 33 / 35 | - | - | 4 | - | 0.87 / 1242.8 | 87.4% | -0.8 |

Mean score share 86.7% ± 1.9, baseline 85.6% ± 8.8, paired diff +1.1 ± 10.4.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 17 over 4 battles (4.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | rank419-band5 | 86.7% ± 1.9 | 98.6% ± 4.5 | 75.6% ± 4.4 | 138 / 140 | - | - | 17 | - | 0.87 / 4430.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 4 | 690 | 3.6% | 94.7% | 0.1% | 1.6% | 535 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 4 | 4 | n/a | 0 | 0.12 | 0 | 0 | 0 |

4 of 4 battles trusted.
