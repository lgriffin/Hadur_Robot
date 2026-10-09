# pez.gloom.GloomyDark 0.9.2 (rank230-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 82.8% | 97.1% | 66.3% | 34 / 35 | - | - | 28 | - | 1.02 / 773.4 | 92.8% | -9.9 |
| 2 | 76.5% | 91.4% | 61.4% | 32 / 35 | - | - | 14 | - | 1.02 / 810.0 | 98.7% | -22.2 |
| 3 | 73.3% | 82.9% | 62.9% | 29 / 35 | - | - | 24 | - | 1.02 / 365.0 | 76.4% | -3.1 |
| 4 | 78.9% | 94.3% | 62.5% | 33 / 35 | - | - | 18 | - | 0.98 / 1060.5 | 90.4% | -11.5 |

Mean score share 77.9% ± 6.4, baseline 89.6% ± 15.1, paired diff -11.7 ± 12.6.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 84 over 4 battles (21.0 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pez.gloom.GloomyDark 0.9.2 | rank230-band4 | 77.9% ± 6.4 | 91.4% ± 9.8 | 63.3% ± 3.4 | 128 / 140 | - | - | 84 | - | 1.02 / 1060.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| pez.gloom.GloomyDark 0.9.2 | 4 | 1008 | 14.9% | 78.6% | 0.0% | 6.4% | 774 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pez.gloom.GloomyDark 0.9.2 | 4 | 4 | n/a | 0 | 0.60 | 0 | 0 | 0 |

4 of 4 battles trusted.
