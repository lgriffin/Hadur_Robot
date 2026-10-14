# kid.Gladiator .7.2 (rank111-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 77.7% | 88.2% | 67.5% | 31 / 35 | - | - | 25 | - | 1.07 / 1592.2 | 99.4% | -21.7 |
| 2 | 80.0% | 88.6% | 71.2% | 31 / 35 | - | - | 54 | - | 1.12 / 1374.9 | 95.0% | -15.0 |
| 3 | 71.2% | 79.4% | 63.4% | 28 / 35 | - | - | 24 | - | 1.09 / 877.4 | 98.1% | -26.8 |
| 4 | 82.2% | 91.4% | 72.7% | 32 / 35 | - | - | 34 | - | 1.11 / 1280.5 | 92.7% | -10.4 |

Mean score share 77.8% ± 7.6, baseline 96.3% ± 4.9, paired diff -18.5 ± 11.5.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 137 over 4 battles (34.3 per battle, most in one battle 54). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kid.Gladiator .7.2 | rank111-band3 | 77.8% ± 7.6 | 86.9% ± 8.3 | 68.7% ± 6.6 | 122 / 140 | - | - | 137 | - | 1.12 / 1592.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| kid.Gladiator .7.2 | 4 | 1117 | 20.1% | 72.2% | 0.0% | 7.7% | 1183 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kid.Gladiator .7.2 | 4 | 4 | n/a | 0 | 0.98 | 0 | 0 | 0 |

4 of 4 battles trusted.
