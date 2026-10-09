# simonton.beta.LifelongObsession 0.5.1 (rank68-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 68.9% | 85.7% | 51.9% | 30 / 35 | - | - | 45 | - | 1.19 / 1009.2 | 90.8% | -21.9 |
| 2 | 54.9% | 62.9% | 46.7% | 22 / 35 | - | - | 20 | - | 1.09 / 1193.3 | 94.2% | -39.2 |
| 3 | 54.1% | 62.9% | 46.4% | 22 / 35 | - | - | 39 | - | 1.15 / 1221.9 | 92.7% | -38.6 |
| 4 | 62.8% | 71.4% | 54.2% | 25 / 35 | - | - | 18 | - | 1.05 / 763.7 | 87.0% | -24.2 |

Mean score share 60.2% ± 11.2, baseline 91.2% ± 4.9, paired diff -31.0 ± 14.7.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 122 over 4 battles (30.5 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| simonton.beta.LifelongObsession 0.5.1 | rank68-band3 | 60.2% ± 11.2 | 70.7% ± 17.2 | 49.8% ± 6.1 | 99 / 140 | - | - | 122 | - | 1.19 / 1221.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| simonton.beta.LifelongObsession 0.5.1 | 4 | 1854 | 27.6% | 61.2% | 0.0% | 11.1% | 1151 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| simonton.beta.LifelongObsession 0.5.1 | 4 | 4 | n/a | 0 | 0.87 | 0 | 0 | 0 |

4 of 4 battles trusted.
