# tcf.Repat3 2 (rank366-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 87.8% | 100.0% | 76.8% | 35 / 35 | - | - | 12 | - | 0.96 / 3280.0 | 83.9% | +3.9 |
| 2 | 85.5% | 100.0% | 73.2% | 35 / 35 | - | - | 4 | - | 0.96 / 700.7 | 88.3% | -2.8 |
| 3 | 86.6% | 97.1% | 76.9% | 34 / 35 | - | - | 12 | - | 0.96 / 302.1 | 82.1% | +4.5 |
| 4 | 88.0% | 97.1% | 79.3% | 34 / 35 | - | - | 4 | - | 0.98 / 565.8 | 89.1% | -1.1 |

Mean score share 87.0% ± 1.9, baseline 85.9% ± 5.3, paired diff +1.1 ± 5.8.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 32 over 4 battles (8.0 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| tcf.Repat3 2 | rank366-band4 | 87.0% ± 1.9 | 98.6% ± 2.6 | 76.6% ± 4.0 | 138 / 140 | - | - | 32 | - | 0.98 / 3280.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| tcf.Repat3 2 | 4 | 694 | 3.6% | 94.7% | 0.0% | 1.7% | 553 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| tcf.Repat3 2 | 4 | 4 | n/a | 0 | 0.23 | 0 | 0 | 0 |

4 of 4 battles trusted.
