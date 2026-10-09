# de.erdega.robocode.Polyphemos 0.4 (rank571-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 85.8% | 100.0% | 72.3% | 35 / 35 | - | - | 4 | - | 0.91 / 1296.1 | 80.1% | +5.7 |
| 2 | 85.7% | 97.1% | 74.7% | 34 / 35 | - | - | 2 | - | 0.90 / 1327.5 | 88.1% | -2.4 |
| 3 | 86.5% | 100.0% | 73.0% | 35 / 35 | - | - | 5 | - | 0.86 / 1069.4 | 91.9% | -5.4 |
| 4 | 86.7% | 100.0% | 73.8% | 35 / 35 | - | - | 6 | - | 0.90 / 1595.1 | 88.8% | -2.1 |

Mean score share 86.2% ± 0.8, baseline 87.2% ± 8.0, paired diff -1.1 ± 7.5.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 17 over 4 battles (4.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| de.erdega.robocode.Polyphemos 0.4 | rank571-band5 | 86.2% ± 0.8 | 99.3% ± 2.3 | 73.5% ± 1.6 | 139 / 140 | - | - | 17 | - | 0.91 / 1595.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| de.erdega.robocode.Polyphemos 0.4 | 4 | 693 | 1.8% | 97.3% | 0.1% | 0.9% | 492 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| de.erdega.robocode.Polyphemos 0.4 | 4 | 4 | n/a | 0 | 0.12 | 0 | 0 | 0 |

4 of 4 battles trusted.
