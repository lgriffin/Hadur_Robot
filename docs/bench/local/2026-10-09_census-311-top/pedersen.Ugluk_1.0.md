# pedersen.Ugluk 1.0 (rank157-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 60.1% | 71.4% | 51.2% | 25 / 35 | - | - | 34 | - | 1.18 / 838.6 | 67.5% | -7.4 |
| 2 | 74.3% | 88.6% | 60.4% | 31 / 35 | - | - | 28 | - | 1.20 / 36.8 | 76.1% | -1.8 |
| 3 | 78.5% | 94.3% | 61.6% | 33 / 35 | - | - | 23 | - | 1.15 / 973.3 | 78.2% | +0.3 |
| 4 | 73.4% | 88.6% | 59.9% | 31 / 35 | - | - | 33 | - | 1.18 / 33.9 | 82.4% | -9.0 |

Mean score share 71.6% ± 12.6, baseline 76.1% ± 10.0, paired diff -4.5 ± 7.0.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 118 over 4 battles (29.5 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pedersen.Ugluk 1.0 | rank157-band3 | 71.6% ± 12.6 | 85.7% ± 15.7 | 58.3% ± 7.6 | 120 / 140 | - | - | 118 | - | 1.20 / 973.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| pedersen.Ugluk 1.0 | 4 | 1429 | 17.5% | 75.0% | 0.0% | 7.6% | 743 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pedersen.Ugluk 1.0 | 4 | 4 | n/a | 0 | 0.84 | 0 | 0 | 0 |

4 of 4 battles trusted.
