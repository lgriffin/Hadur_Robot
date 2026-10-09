# florent.small.LittleAngel 1.8 (rank128-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 76.4% | 91.4% | 59.7% | 32 / 35 | - | - | 14 | - | 1.02 / 812.1 | 77.9% | -1.4 |
| 2 | 80.3% | 94.3% | 64.3% | 33 / 35 | - | - | 18 | - | 1.06 / 1699.0 | 87.7% | -7.4 |
| 3 | 69.5% | 85.7% | 52.5% | 30 / 35 | - | - | 20 | - | 1.07 / 1191.8 | 81.4% | -11.9 |
| 4 | 74.0% | 88.6% | 58.0% | 31 / 35 | - | - | 16 | - | 1.01 / 1300.5 | 83.5% | -9.6 |

Mean score share 75.0% ± 7.2, baseline 82.6% ± 6.6, paired diff -7.6 ± 7.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 68 over 4 battles (17.0 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| florent.small.LittleAngel 1.8 | rank128-band3 | 75.0% ± 7.2 | 90.0% ± 5.9 | 58.6% ± 7.7 | 126 / 140 | - | - | 68 | - | 1.07 / 1699.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| florent.small.LittleAngel 1.8 | 4 | 1133 | 15.4% | 78.4% | 0.0% | 6.1% | 845 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| florent.small.LittleAngel 1.8 | 4 | 4 | n/a | 0 | 0.49 | 0 | 0 | 0 |

4 of 4 battles trusted.
