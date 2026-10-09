# nz.jdc.micro.HedgehogGF 1.5 (rank114-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 78.8% | 91.4% | 65.0% | 32 / 35 | - | - | 11 | - | 0.90 / 1882.7 | 83.6% | -4.8 |
| 2 | 80.1% | 94.3% | 64.8% | 33 / 35 | - | - | 8 | - | 0.81 / 2029.6 | 77.9% | +2.2 |
| 3 | 73.7% | 85.7% | 60.9% | 30 / 35 | - | - | 24 | - | 1.00 / 2092.5 | 73.1% | +0.6 |
| 4 | 75.1% | 91.4% | 59.3% | 32 / 35 | - | - | 26 | - | 1.04 / 1261.1 | 76.7% | -1.6 |

Mean score share 76.9% ± 4.9, baseline 77.8% ± 7.0, paired diff -0.9 ± 4.8.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 69 over 4 battles (17.3 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| nz.jdc.micro.HedgehogGF 1.5 | rank114-band3 | 76.9% ± 4.9 | 90.7% ± 5.7 | 62.5% ± 4.6 | 127 / 140 | - | - | 69 | - | 1.04 / 2092.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| nz.jdc.micro.HedgehogGF 1.5 | 4 | 1080 | 15.1% | 79.0% | 0.0% | 6.0% | 774 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| nz.jdc.micro.HedgehogGF 1.5 | 4 | 4 | n/a | 0 | 0.49 | 0 | 0 | 0 |

4 of 4 battles trusted.
