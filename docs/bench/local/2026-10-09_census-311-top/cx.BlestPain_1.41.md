# cx.BlestPain 1.41 (rank129-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 75.2% | 88.6% | 60.8% | 31 / 35 | - | - | 8 | - | 1.00 / 1618.6 | 71.2% | +3.9 |
| 2 | 70.5% | 82.9% | 58.5% | 29 / 35 | - | - | 19 | - | 1.01 / 1745.9 | 78.7% | -8.2 |
| 3 | 71.5% | 85.7% | 56.2% | 30 / 35 | - | - | 13 | - | 0.98 / 1699.6 | 76.1% | -4.6 |
| 4 | 82.8% | 94.3% | 66.7% | 33 / 35 | - | - | 11 | - | 1.02 / 1449.5 | 82.6% | +0.1 |

Mean score share 75.0% ± 8.9, baseline 77.2% ± 7.6, paired diff -2.2 ± 8.5.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 51 over 4 battles (12.8 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cx.BlestPain 1.41 | rank129-band3 | 75.0% ± 8.9 | 87.9% ± 7.8 | 60.5% ± 7.2 | 123 / 140 | - | - | 51 | - | 1.02 / 1745.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| cx.BlestPain 1.41 | 4 | 1113 | 19.1% | 72.4% | 0.0% | 8.5% | 712 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cx.BlestPain 1.41 | 4 | 4 | n/a | 0 | 0.36 | 0 | 0 | 0 |

4 of 4 battles trusted.
