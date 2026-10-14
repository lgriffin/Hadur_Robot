# cjm.chalk.Chalk 2.6.Be (rank45-band2) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 60.5% | 68.6% | 52.8% | 24 / 35 | - | - | 11 | - | 0.98 / 1892.4 | 59.5% | +1.1 |
| 2 | 68.2% | 80.0% | 55.8% | 28 / 35 | - | - | 19 | - | 1.12 / 1295.9 | 60.2% | +7.9 |
| 3 | 58.7% | 71.4% | 47.0% | 25 / 35 | - | - | 29 | - | 1.14 / 3094.6 | 64.8% | -6.0 |
| 4 | 65.5% | 77.1% | 53.7% | 27 / 35 | - | - | 30 | - | 1.15 / 1139.5 | 56.1% | +9.3 |

Mean score share 63.2% ± 6.9, baseline 60.2% ± 5.6, paired diff +3.1 ± 11.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 89 over 4 battles (22.3 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cjm.chalk.Chalk 2.6.Be | rank45-band2 | 63.2% ± 6.9 | 74.3% ± 8.3 | 52.3% ± 6.0 | 104 / 140 | - | - | 89 | - | 1.15 / 3094.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| cjm.chalk.Chalk 2.6.Be | 4 | 1728 | 26.0% | 63.2% | 0.0% | 10.7% | 940 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cjm.chalk.Chalk 2.6.Be | 4 | 4 | n/a | 0 | 0.64 | 0 | 0 | 0 |

4 of 4 battles trusted.
