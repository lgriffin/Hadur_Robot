# pkdeken.Paladin 1.0 (rank567-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 92.9% | 100.0% | 85.1% | 35 / 35 | - | - | 0 | - | 0.87 / 190.0 | 90.1% | +2.8 |
| 2 | 93.4% | 100.0% | 86.0% | 35 / 35 | - | - | 3 | - | 0.92 / 114.7 | 92.6% | +0.8 |
| 3 | 93.7% | 100.0% | 86.4% | 35 / 35 | - | - | 8 | - | 0.89 / 457.3 | 92.0% | +1.7 |
| 4 | 92.6% | 100.0% | 84.4% | 35 / 35 | - | - | 5 | - | 0.92 / 143.4 | 93.3% | -0.7 |

Mean score share 93.2% ± 0.8, baseline 92.0% ± 2.2, paired diff +1.1 ± 2.4.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 16 over 4 battles (4.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pkdeken.Paladin 1.0 | rank567-band5 | 93.2% ± 0.8 | 100.0% ± 0.0 | 85.5% ± 1.4 | 140 / 140 | - | - | 16 | - | 0.92 / 457.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| pkdeken.Paladin 1.0 | 4 | 322 | 0.0% | 100.0% | 0.0% | 0.0% | 438 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pkdeken.Paladin 1.0 | 4 | 4 | n/a | 0 | 0.11 | 0 | 0 | 0 |

4 of 4 battles trusted.
