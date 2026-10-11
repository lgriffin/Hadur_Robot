# jekl.Jekyl .70 (rank215-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 82.9% | 97.1% | 68.0% | 34 / 35 | - | - | 27 | - | 0.92 / 637.0 | 90.6% | -7.7 |
| 2 | 87.4% | 100.0% | 73.3% | 35 / 35 | - | - | 21 | - | 0.98 / 2116.3 | 95.3% | -7.9 |
| 3 | 82.1% | 97.1% | 66.2% | 34 / 35 | - | - | 15 | - | 0.94 / 1148.6 | 85.8% | -3.7 |
| 4 | 82.2% | 94.3% | 68.5% | 33 / 35 | - | - | 19 | - | 1.00 / 1464.7 | 93.1% | -10.8 |

Mean score share 83.7% ± 4.0, baseline 91.2% ± 6.5, paired diff -7.5 ± 4.6.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 82 over 4 battles (20.5 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jekl.Jekyl .70 | rank215-band4 | 83.7% ± 4.0 | 97.1% ± 3.7 | 69.0% ± 4.8 | 136 / 140 | - | - | 82 | - | 1.00 / 2116.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| jekl.Jekyl .70 | 4 | 754 | 6.6% | 90.7% | 0.0% | 2.6% | 717 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jekl.Jekyl .70 | 4 | 4 | n/a | 0 | 0.59 | 0 | 0 | 0 |

4 of 4 battles trusted.
