# cx.mini.Cigaret 1.31 (rank182-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 62.2% | 71.4% | 53.6% | 25 / 35 | - | - | 9 | - | 1.81 / 1308.2 | 73.4% | -11.2 |
| 2 | 71.2% | 85.7% | 56.9% | 30 / 35 | - | - | 13 | - | 1.92 / 1438.9 | 68.3% | +2.9 |
| 3 | 78.4% | 97.1% | 59.8% | 34 / 35 | - | - | 5 | - | 1.83 / 1353.3 | 78.4% | +0.0 |
| 4 | 61.8% | 74.3% | 51.2% | 26 / 35 | - | - | 19 | - | 1.90 / 1617.4 | 77.0% | -15.1 |

Mean score share 68.4% ± 12.6, baseline 74.3% ± 7.1, paired diff -5.9 ± 13.8.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 46 over 4 battles (11.5 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cx.mini.Cigaret 1.31 | rank182-band3 | 68.4% ± 12.6 | 82.1% ± 18.7 | 55.4% ± 6.0 | 115 / 140 | - | - | 46 | - | 1.92 / 1617.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| cx.mini.Cigaret 1.31 | 4 | 1511 | 20.7% | 69.5% | 0.1% | 9.7% | 666 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cx.mini.Cigaret 1.31 | 4 | 4 | n/a | 0 | 0.33 | 0 | 0 | 0 |

4 of 4 battles trusted.
