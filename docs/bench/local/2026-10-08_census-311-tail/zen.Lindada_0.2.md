# zen.Lindada 0.2 (rank401-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 79.7% | 94.3% | 64.4% | 33 / 35 | - | - | 3 | - | 0.83 / 150.1 | 95.0% | -15.2 |
| 2 | 82.9% | 97.1% | 67.6% | 34 / 35 | - | - | 13 | - | 0.87 / 130.3 | 94.0% | -11.1 |
| 3 | 79.7% | 94.3% | 64.6% | 33 / 35 | - | - | 6 | - | 0.82 / 121.9 | 92.6% | -12.9 |
| 4 | 79.3% | 91.4% | 66.4% | 32 / 35 | - | - | 14 | - | 1.00 / 327.6 | 93.7% | -14.3 |

Mean score share 80.4% ± 2.6, baseline 93.8% ± 1.5, paired diff -13.4 ± 2.9.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 36 over 4 battles (9.0 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| zen.Lindada 0.2 | rank401-band5 | 80.4% ± 2.6 | 94.3% ± 3.7 | 65.8% ± 2.4 | 132 / 140 | - | - | 36 | - | 1.00 / 327.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| zen.Lindada 0.2 | 4 | 902 | 11.1% | 83.5% | 0.1% | 5.4% | 628 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| zen.Lindada 0.2 | 4 | 4 | n/a | 0 | 0.26 | 0 | 0 | 0 |

4 of 4 battles trusted.
