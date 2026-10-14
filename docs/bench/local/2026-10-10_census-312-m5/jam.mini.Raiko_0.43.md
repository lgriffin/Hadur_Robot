# jam.mini.Raiko 0.43 (rank124-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 69.0% | 82.9% | 55.4% | 29 / 35 | - | - | 16 | - | 0.92 / 4480.0 | 89.2% | -20.2 |
| 2 | 69.8% | 85.7% | 54.2% | 30 / 35 | - | - | 24 | - | 0.95 / 1809.8 | 87.6% | -17.8 |
| 3 | 71.9% | 88.6% | 55.9% | 31 / 35 | - | - | 20 | - | 0.94 / 4295.6 | 88.4% | -16.4 |
| 4 | 69.6% | 82.9% | 55.2% | 29 / 35 | - | - | 16 | - | 1.04 / 2653.2 | 94.1% | -24.5 |

Mean score share 70.1% ± 2.0, baseline 89.8% ± 4.6, paired diff -19.7 ± 5.6.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 76 over 4 battles (19.0 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | rank124-band3 | 70.1% ± 2.0 | 85.0% ± 4.4 | 55.1% ± 1.2 | 119 / 140 | - | - | 76 | - | 1.04 / 4480.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | 4 | 1394 | 18.8% | 73.2% | 0.0% | 8.0% | 790 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | 4 | 4 | n/a | 0 | 0.54 | 0 | 0 | 0 |

4 of 4 battles trusted.
