# reaper.Reaper 1.1 (rank292-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 83.2% | 97.1% | 71.2% | 34 / 35 | - | - | 23 | - | 1.05 / 1662.7 | 84.0% | -0.8 |
| 2 | 78.1% | 88.6% | 69.2% | 31 / 35 | - | - | 19 | - | 1.11 / 1106.5 | 98.0% | -20.0 |
| 3 | 86.3% | 100.0% | 74.8% | 35 / 35 | - | - | 5 | - | 0.97 / 99.0 | 91.8% | -5.5 |
| 4 | 86.7% | 97.1% | 77.5% | 34 / 35 | - | - | 14 | - | 1.10 / 128.3 | 93.7% | -6.9 |

Mean score share 83.6% ± 6.4, baseline 91.9% ± 9.3, paired diff -8.3 ± 13.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 61 over 4 battles (15.3 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| reaper.Reaper 1.1 | rank292-band4 | 83.6% ± 6.4 | 95.7% ± 7.9 | 73.2% ± 5.9 | 134 / 140 | - | - | 61 | - | 1.11 / 1662.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| reaper.Reaper 1.1 | 4 | 906 | 8.3% | 88.1% | 0.0% | 3.6% | 752 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| reaper.Reaper 1.1 | 4 | 4 | n/a | 0 | 0.44 | 0 | 0 | 0 |

4 of 4 battles trusted.
