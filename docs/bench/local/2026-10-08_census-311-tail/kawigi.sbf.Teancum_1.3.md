# kawigi.sbf.Teancum 1.3 (rank402-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 74.0% | 85.7% | 63.0% | 30 / 35 | - | - | 10 | - | 0.97 / 1941.6 | 77.3% | -3.3 |
| 2 | 69.9% | 80.0% | 61.9% | 28 / 35 | - | - | 6 | - | 0.98 / 1240.4 | 72.3% | -2.5 |
| 3 | 79.8% | 94.3% | 67.0% | 33 / 35 | - | - | 5 | - | 0.95 / 1377.7 | 79.2% | +0.7 |
| 4 | 81.6% | 94.3% | 68.8% | 33 / 35 | - | - | 15 | - | 1.05 / 1324.9 | 81.9% | -0.2 |

Mean score share 76.3% ± 8.6, baseline 77.7% ± 6.4, paired diff -1.3 ± 3.0.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 36 over 4 battles (9.0 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kawigi.sbf.Teancum 1.3 | rank402-band5 | 76.3% ± 8.6 | 88.6% ± 11.1 | 65.2% ± 5.2 | 124 / 140 | - | - | 36 | - | 1.05 / 1941.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| kawigi.sbf.Teancum 1.3 | 4 | 1220 | 16.4% | 75.9% | 0.0% | 7.7% | 631 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kawigi.sbf.Teancum 1.3 | 4 | 4 | n/a | 0 | 0.26 | 0 | 0 | 0 |

4 of 4 battles trusted.
