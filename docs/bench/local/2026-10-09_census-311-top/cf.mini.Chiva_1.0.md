# cf.mini.Chiva 1.0 (rank198-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 84.4% | 97.1% | 71.7% | 34 / 35 | - | - | 8 | - | 0.92 / 43.2 | 84.2% | +0.2 |
| 2 | 85.6% | 100.0% | 71.0% | 35 / 35 | - | - | 10 | - | 0.88 / 1093.1 | 85.3% | +0.3 |
| 3 | 84.3% | 97.1% | 71.7% | 34 / 35 | - | - | 17 | - | 0.93 / 2673.9 | 82.1% | +2.2 |
| 4 | 85.9% | 100.0% | 71.5% | 35 / 35 | - | - | 19 | - | 0.90 / 971.7 | 86.4% | -0.4 |

Mean score share 85.1% ± 1.3, baseline 84.5% ± 2.9, paired diff +0.6 ± 1.8.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 54 over 4 battles (13.5 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cf.mini.Chiva 1.0 | rank198-band3 | 85.1% ± 1.3 | 98.6% ± 2.6 | 71.5% ± 0.5 | 138 / 140 | - | - | 54 | - | 0.93 / 2673.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| cf.mini.Chiva 1.0 | 4 | 735 | 3.4% | 95.2% | 0.1% | 1.3% | 650 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cf.mini.Chiva 1.0 | 4 | 4 | n/a | 0 | 0.39 | 0 | 0 | 0 |

4 of 4 battles trusted.
