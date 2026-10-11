# catcat20.atom.Atom 0.51 (rank117-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 79.2% | 88.6% | 69.5% | 31 / 35 | - | - | 31 | - | 1.65 / 1207.3 | 79.9% | -0.6 |
| 2 | 69.8% | 71.4% | 67.0% | 25 / 35 | - | - | 96 | - | 1.94 / 2547.1 | 75.1% | -5.3 |
| 3 | 72.8% | 80.0% | 65.3% | 28 / 35 | - | - | 18 | - | 1.63 / 817.4 | 80.5% | -7.7 |
| 4 | 75.5% | 82.9% | 67.9% | 29 / 35 | - | - | 45 | - | 1.82 / 2766.0 | 79.4% | -3.9 |

Mean score share 74.4% ± 6.4, baseline 78.7% ± 3.9, paired diff -4.4 ± 4.7.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 190 over 4 battles (47.5 per battle, most in one battle 96). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| catcat20.atom.Atom 0.51 | rank117-band3 | 74.4% ± 6.4 | 80.7% ± 11.4 | 67.4% ± 2.8 | 113 / 140 | - | - | 190 | - | 1.94 / 2766.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| catcat20.atom.Atom 0.51 | 4 | 1267 | 26.6% | 63.6% | 0.0% | 9.7% | 1240 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| catcat20.atom.Atom 0.51 | 4 | 3 | n/a | 0 | 1.36 | 0 | 0 | 0 |

3 of 4 battles trusted.
