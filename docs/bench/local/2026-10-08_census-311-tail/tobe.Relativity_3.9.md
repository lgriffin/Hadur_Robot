# tobe.Relativity 3.9 (rank577-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 90.3% | 100.0% | 78.8% | 35 / 35 | - | - | 3 | - | 0.89 / 1335.0 | 87.4% | +2.9 |
| 2 | 90.3% | 100.0% | 79.0% | 35 / 35 | - | - | 5 | - | 0.91 / 1957.3 | 87.0% | +3.3 |
| 3 | 92.1% | 100.0% | 82.8% | 35 / 35 | - | - | 5 | - | 0.86 / 1896.6 | 93.9% | -1.8 |
| 4 | 93.1% | 100.0% | 84.7% | 35 / 35 | - | - | 5 | - | 0.93 / 1248.8 | 89.1% | +4.0 |

Mean score share 91.4% ± 2.2, baseline 89.4% ± 5.1, paired diff +2.1 ± 4.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 18 over 4 battles (4.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| tobe.Relativity 3.9 | rank577-band5 | 91.4% ± 2.2 | 100.0% ± 0.0 | 81.3% ± 4.6 | 140 / 140 | - | - | 18 | - | 0.93 / 1957.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| tobe.Relativity 3.9 | 4 | 384 | 0.0% | 99.9% | 0.1% | 0.0% | 529 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| tobe.Relativity 3.9 | 4 | 4 | n/a | 0 | 0.13 | 0 | 0 | 0 |

4 of 4 battles trusted.
