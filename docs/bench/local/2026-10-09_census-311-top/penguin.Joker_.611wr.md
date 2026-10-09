# penguin.Joker .611wr (rank180-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 74.6% | 82.9% | 63.9% | 29 / 35 | - | - | 72 | - | 1.03 / 1584.2 | 78.1% | -3.5 |
| 2 | 68.1% | 75.8% | 59.9% | 27 / 35 | - | - | 160 | - | 1.16 / 1865.7 | 73.3% | -5.1 |
| 3 | 71.6% | 79.4% | 62.6% | 28 / 35 | - | - | 58 | - | 1.14 / 1161.2 | 77.7% | -6.1 |
| 4 | 83.9% | 94.3% | 71.0% | 33 / 35 | - | - | 25 | - | 1.00 / 1872.1 | 75.5% | +8.4 |

Mean score share 74.5% ± 10.7, baseline 76.1% ± 3.6, paired diff -1.6 ± 10.7.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 315 over 4 battles (78.8 per battle, most in one battle 160). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| penguin.Joker .611wr | rank180-band3 | 74.5% ± 10.7 | 83.1% ± 12.8 | 64.3% ± 7.5 | 117 / 140 | - | - | 315 | - | 1.16 / 1872.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| penguin.Joker .611wr | 4 | 1113 | 25.8% | 65.6% | 0.0% | 8.6% | 1173 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| penguin.Joker .611wr | 4 | 2 | n/a | 0 | 2.25 | 0 | 0 | 0 |

2 of 4 battles trusted.
