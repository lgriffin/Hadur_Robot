# kc.mega.BeepBoop 2.0 (rank1-band1) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 23.2% | 2.9% | 45.2% | 1 / 35 | - | - | 661 | - | 2.42 / 1582.8 | 30.7% | -7.5 |
| 2 | 22.8% | 2.9% | 45.3% | 1 / 35 | - | - | 633 | - | 2.36 / 1662.3 | 24.9% | -2.1 |
| 3 | 19.5% | 0.0% | 40.9% | 0 / 35 | - | - | 672 | - | 2.38 / 2025.3 | 30.6% | -11.1 |
| 4 | 16.1% | 0.0% | 34.7% | 0 / 35 | - | - | 636 | - | 2.36 / 1757.2 | 24.4% | -8.3 |

Mean score share 20.4% ± 5.3, baseline 27.6% ± 5.5, paired diff -7.2 ± 6.0.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 2602 over 4 battles (650.5 per battle, most in one battle 672). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rank1-band1 | 20.4% ± 5.3 | 1.4% ± 2.6 | 41.5% ± 8.0 | 2 / 140 | - | - | 2602 | - | 2.42 / 2025.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 4 | 3539 | 48.7% | 34.6% | 0.0% | 16.6% | 2422 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 4 | 0 | n/a | 0 | 18.59 | 0 | 0 | 0 |

0 of 4 battles trusted.
