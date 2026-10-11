# pkbots.BoyTDSurfer 1.0 (rank143-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 76.2% | 91.4% | 63.2% | 32 / 35 | - | - | 14 | - | 1.04 / 547.1 | 78.9% | -2.6 |
| 2 | 78.8% | 94.3% | 65.5% | 33 / 35 | - | - | 21 | - | 1.02 / 38.7 | 85.8% | -7.0 |
| 3 | 81.7% | 100.0% | 65.2% | 35 / 35 | - | - | 29 | - | 1.06 / 384.2 | 85.7% | -4.0 |
| 4 | 77.2% | 91.4% | 65.0% | 32 / 35 | - | - | 18 | - | 1.04 / 37.6 | 82.9% | -5.7 |

Mean score share 78.5% ± 3.8, baseline 83.3% ± 5.2, paired diff -4.8 ± 3.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 82 over 4 battles (20.5 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pkbots.BoyTDSurfer 1.0 | rank143-band3 | 78.5% ± 3.8 | 94.3% ± 6.4 | 64.7% ± 1.6 | 132 / 140 | - | - | 82 | - | 1.06 / 547.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| pkbots.BoyTDSurfer 1.0 | 4 | 1141 | 8.8% | 87.1% | 0.0% | 4.1% | 730 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pkbots.BoyTDSurfer 1.0 | 4 | 4 | n/a | 0 | 0.59 | 0 | 0 | 0 |

4 of 4 battles trusted.
