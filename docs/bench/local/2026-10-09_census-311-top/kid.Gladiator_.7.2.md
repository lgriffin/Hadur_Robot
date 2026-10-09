# kid.Gladiator .7.2 (rank111-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 85.9% | 97.1% | 75.3% | 34 / 35 | - | - | 28 | - | 1.09 / 1342.3 | 89.2% | -3.3 |
| 2 | 79.8% | 88.6% | 70.5% | 31 / 35 | - | - | 54 | - | 1.12 / 2767.3 | 99.2% | -19.5 |
| 3 | 70.3% | 76.5% | 63.7% | 27 / 35 | - | - | 54 | - | 1.11 / 4393.3 | 98.4% | -28.1 |
| 4 | 74.4% | 82.9% | 66.6% | 29 / 35 | - | - | 50 | - | 1.14 / 2893.2 | 97.4% | -23.0 |

Mean score share 77.6% ± 10.8, baseline 96.0% ± 7.4, paired diff -18.4 ± 17.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 186 over 4 battles (46.5 per battle, most in one battle 54). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kid.Gladiator .7.2 | rank111-band3 | 77.6% ± 10.8 | 86.2% ± 13.9 | 69.0% ± 8.0 | 121 / 140 | - | - | 186 | - | 1.14 / 4393.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| kid.Gladiator .7.2 | 4 | 1123 | 21.2% | 70.7% | 0.0% | 8.1% | 1160 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kid.Gladiator .7.2 | 4 | 4 | n/a | 0 | 1.33 | 0 | 0 | 0 |

4 of 4 battles trusted.
