# brainfade.Fallen 0.63 (rank164-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 68.2% | 85.7% | 52.7% | 30 / 35 | - | - | 21 | - | 1.06 / 533.3 | 94.7% | -26.5 |
| 2 | 74.9% | 91.4% | 59.1% | 32 / 35 | - | - | 26 | - | 1.09 / 195.5 | 91.9% | -17.0 |
| 3 | 67.8% | 82.9% | 53.7% | 29 / 35 | - | - | 33 | - | 1.11 / 221.4 | 89.1% | -21.3 |
| 4 | 68.9% | 82.9% | 55.7% | 29 / 35 | - | - | 21 | - | 1.08 / 43.3 | 82.6% | -13.7 |

Mean score share 70.0% ± 5.3, baseline 89.6% ± 8.2, paired diff -19.6 ± 8.8.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 101 over 4 battles (25.3 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| brainfade.Fallen 0.63 | rank164-band3 | 70.0% ± 5.3 | 85.7% ± 6.4 | 55.3% ± 4.5 | 120 / 140 | - | - | 101 | - | 1.11 / 533.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| brainfade.Fallen 0.63 | 4 | 1486 | 16.8% | 75.7% | 0.0% | 7.4% | 761 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| brainfade.Fallen 0.63 | 4 | 4 | n/a | 0 | 0.72 | 0 | 0 | 0 |

4 of 4 battles trusted.
