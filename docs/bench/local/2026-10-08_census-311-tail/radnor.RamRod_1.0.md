# radnor.RamRod 1.0 (rank576-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 74.4% | 100.0% | 64.5% | 35 / 35 | - | - | 0 | - | 0.69 / 323.0 | 80.4% | -6.1 |
| 2 | 73.9% | 100.0% | 64.9% | 35 / 35 | - | - | 2 | - | 0.66 / 953.7 | 76.0% | -2.1 |
| 3 | 71.1% | 100.0% | 61.4% | 35 / 35 | - | - | 2 | - | 0.67 / 235.4 | 76.3% | -5.2 |
| 4 | 76.8% | 100.0% | 68.1% | 35 / 35 | - | - | 3 | - | 0.64 / 988.6 | 75.5% | +1.2 |

Mean score share 74.0% ± 3.7, baseline 77.1% ± 3.6, paired diff -3.0 ± 5.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 7 over 4 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| radnor.RamRod 1.0 | rank576-band5 | 74.0% ± 3.7 | 100.0% ± 0.0 | 64.7% ± 4.3 | 140 / 140 | - | - | 7 | - | 0.69 / 988.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| radnor.RamRod 1.0 | 4 | 2290 | 0.0% | 86.1% | 13.9% | 0.0% | 299 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| radnor.RamRod 1.0 | 4 | 4 | n/a | 0 | 0.05 | 0 | 0 | 0 |

4 of 4 battles trusted.
