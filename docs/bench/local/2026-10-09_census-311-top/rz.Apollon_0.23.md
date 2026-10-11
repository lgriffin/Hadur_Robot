# rz.Apollon 0.23 (rank103-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 86.2% | 100.0% | 69.8% | 35 / 35 | - | - | 18 | - | 0.99 / 1323.5 | 76.7% | +9.4 |
| 2 | 79.3% | 97.1% | 59.1% | 34 / 35 | - | - | 14 | - | 1.06 / 55.6 | 65.4% | +13.8 |
| 3 | 82.4% | 94.3% | 68.0% | 33 / 35 | - | - | 15 | - | 0.89 / 316.4 | 78.8% | +3.6 |
| 4 | 83.7% | 100.0% | 65.4% | 35 / 35 | - | - | 12 | - | 1.01 / 218.8 | 77.8% | +5.9 |

Mean score share 82.9% ± 4.5, baseline 74.7% ± 9.9, paired diff +8.2 ± 7.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 59 over 4 battles (14.8 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| rz.Apollon 0.23 | rank103-band3 | 82.9% ± 4.5 | 97.9% ± 4.4 | 65.6% ± 7.4 | 137 / 140 | - | - | 59 | - | 1.06 / 1323.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| rz.Apollon 0.23 | 4 | 760 | 4.9% | 93.1% | 0.1% | 1.8% | 750 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| rz.Apollon 0.23 | 4 | 4 | n/a | 0 | 0.42 | 0 | 0 | 0 |

4 of 4 battles trusted.
