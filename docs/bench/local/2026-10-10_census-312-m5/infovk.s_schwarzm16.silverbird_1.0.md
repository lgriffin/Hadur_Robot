# infovk.s_schwarzm16.silverbird 1.0 (rank226-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 87.7% | 100.0% | 73.9% | 35 / 35 | - | - | 15 | - | 1.15 / 924.5 | 85.2% | +2.5 |
| 2 | 74.6% | 82.9% | 65.7% | 29 / 35 | - | - | 13 | - | 1.05 / 677.6 | 80.9% | -6.2 |
| 3 | 75.7% | 88.6% | 62.6% | 31 / 35 | - | - | 21 | - | 1.11 / 731.5 | 86.5% | -10.8 |
| 4 | 88.8% | 100.0% | 76.3% | 35 / 35 | - | - | 15 | - | 1.07 / 673.6 | 83.5% | +5.3 |

Mean score share 81.7% ± 12.0, baseline 84.0% ± 3.9, paired diff -2.3 ± 11.9.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 64 over 4 battles (16.0 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| infovk.s_schwarzm16.silverbird 1.0 | rank226-band4 | 81.7% ± 12.0 | 92.9% ± 13.6 | 69.6% ± 10.4 | 130 / 140 | - | - | 64 | - | 1.15 / 924.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| infovk.s_schwarzm16.silverbird 1.0 | 4 | 845 | 14.8% | 79.2% | 0.0% | 6.0% | 905 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| infovk.s_schwarzm16.silverbird 1.0 | 4 | 4 | n/a | 0 | 0.46 | 0 | 0 | 0 |

4 of 4 battles trusted.
