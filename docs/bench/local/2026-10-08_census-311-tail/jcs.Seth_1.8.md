# jcs.Seth 1.8 (rank927-band6) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 98.0% | 100.0% | 96.2% | 35 / 35 | - | - | 48 | - | 1.03 / 1384.8 | 98.3% | -0.3 |
| 2 | 95.4% | 94.3% | 95.3% | 33 / 35 | - | - | 209 | - | 1.01 / 810.4 | 98.9% | -3.5 |
| 3 | 98.3% | 100.0% | 96.7% | 35 / 35 | - | - | 37 | - | 0.96 / 1431.0 | 96.5% | +1.9 |
| 4 | 94.1% | 94.3% | 93.5% | 33 / 35 | - | - | 58 | - | 1.04 / 887.1 | 97.5% | -3.5 |

Mean score share 96.5% ± 3.3, baseline 97.8% ± 1.7, paired diff -1.4 ± 4.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 352 over 4 battles (88.0 per battle, most in one battle 209). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jcs.Seth 1.8 | rank927-band6 | 96.5% ± 3.3 | 97.1% ± 5.2 | 95.5% ± 2.2 | 136 / 140 | - | - | 352 | - | 1.04 / 1431.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| jcs.Seth 1.8 | 4 | 193 | 26.0% | 66.1% | 0.0% | 7.9% | 905 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jcs.Seth 1.8 | 4 | 3 | n/a | 1 | 2.51 | 0 | 0 | 0 |

3 of 4 battles trusted.
