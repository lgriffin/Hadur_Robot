# ara.Shera 0.88 (rank290-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 80.8% | 94.3% | 66.7% | 33 / 35 | - | - | 15 | - | 1.02 / 327.3 | 78.0% | +2.9 |
| 2 | 73.9% | 88.6% | 61.0% | 31 / 35 | - | - | 14 | - | 1.02 / 295.0 | 69.0% | +4.8 |
| 3 | 76.0% | 91.4% | 62.2% | 32 / 35 | - | - | 14 | - | 1.04 / 585.0 | 77.3% | -1.3 |
| 4 | 73.0% | 88.6% | 59.3% | 31 / 35 | - | - | 15 | - | 1.01 / 833.8 | 79.2% | -6.2 |

Mean score share 75.9% ± 5.6, baseline 75.9% ± 7.4, paired diff +0.1 ± 7.8.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 58 over 4 battles (14.5 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ara.Shera 0.88 | rank290-band4 | 75.9% ± 5.6 | 90.7% ± 4.4 | 62.3% ± 5.1 | 127 / 140 | - | - | 58 | - | 1.04 / 833.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ara.Shera 0.88 | 4 | 1197 | 13.6% | 79.3% | 0.1% | 7.1% | 601 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ara.Shera 0.88 | 4 | 4 | n/a | 0 | 0.41 | 0 | 0 | 0 |

4 of 4 battles trusted.
