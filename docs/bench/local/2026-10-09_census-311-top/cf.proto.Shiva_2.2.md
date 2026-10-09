# cf.proto.Shiva 2.2 (rank75-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 67.6% | 80.0% | 56.3% | 28 / 35 | - | - | 17 | - | 1.08 / 41.5 | 93.3% | -25.7 |
| 2 | 71.4% | 85.7% | 57.2% | 30 / 35 | - | - | 9 | - | 0.98 / 973.6 | 92.8% | -21.5 |
| 3 | 64.7% | 80.0% | 50.3% | 28 / 35 | - | - | 18 | - | 1.03 / 1059.9 | 83.9% | -19.2 |
| 4 | 74.1% | 91.2% | 56.3% | 32 / 35 | - | - | 9 | - | 0.99 / 277.5 | 85.9% | -11.7 |

Mean score share 69.5% ± 6.6, baseline 89.0% ± 7.6, paired diff -19.5 ± 9.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 53 over 4 battles (13.3 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cf.proto.Shiva 2.2 | rank75-band3 | 69.5% ± 6.6 | 84.2% ± 8.5 | 55.0% ± 5.1 | 118 / 140 | - | - | 53 | - | 1.08 / 1059.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| cf.proto.Shiva 2.2 | 4 | 1450 | 19.0% | 73.0% | 0.0% | 8.0% | 792 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cf.proto.Shiva 2.2 | 4 | 4 | n/a | 0 | 0.38 | 0 | 0 | 0 |

4 of 4 battles trusted.
