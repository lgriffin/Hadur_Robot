# vuen.Fractal 0.55 (rank653-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 78.9% | 91.4% | 66.4% | 32 / 35 | - | - | 13 | - | 0.95 / 1054.6 | 97.2% | -18.3 |
| 2 | 85.6% | 100.0% | 69.9% | 35 / 35 | - | - | 10 | - | 1.05 / 203.2 | 97.2% | -11.6 |
| 3 | 83.5% | 97.1% | 69.9% | 34 / 35 | - | - | 4 | - | 0.96 / 934.1 | 97.5% | -14.0 |
| 4 | 86.2% | 100.0% | 70.7% | 35 / 35 | - | - | 8 | - | 1.02 / 113.4 | 96.9% | -10.7 |

Mean score share 83.6% ± 5.3, baseline 97.2% ± 0.4, paired diff -13.7 ± 5.4.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 35 over 4 battles (8.8 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| vuen.Fractal 0.55 | rank653-band5 | 83.6% ± 5.3 | 97.1% ± 6.4 | 69.2% ± 3.1 | 136 / 140 | - | - | 35 | - | 1.05 / 1054.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| vuen.Fractal 0.55 | 4 | 777 | 6.4% | 90.5% | 0.0% | 3.0% | 582 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| vuen.Fractal 0.55 | 4 | 4 | n/a | 0 | 0.25 | 0 | 0 | 0 |

4 of 4 battles trusted.
