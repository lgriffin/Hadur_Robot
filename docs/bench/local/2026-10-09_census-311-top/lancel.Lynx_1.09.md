# lancel.Lynx 1.09 (rank93-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 65.8% | 80.0% | 54.0% | 28 / 35 | - | - | 13 | - | 1.09 / 1473.5 | 62.2% | +3.7 |
| 2 | 68.3% | 82.9% | 54.9% | 29 / 35 | - | - | 14 | - | 1.11 / 459.3 | 74.7% | -6.4 |
| 3 | 50.5% | 60.0% | 43.3% | 21 / 35 | - | - | 17 | - | 1.08 / 1468.7 | 71.9% | -21.4 |
| 4 | 63.2% | 74.3% | 53.1% | 26 / 35 | - | - | 17 | - | 1.11 / 333.2 | 67.8% | -4.5 |

Mean score share 62.0% ± 12.6, baseline 69.1% ± 8.7, paired diff -7.2 ± 16.6.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 61 over 4 battles (15.3 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| lancel.Lynx 1.09 | rank93-band3 | 62.0% ± 12.6 | 74.3% ± 16.2 | 51.3% ± 8.6 | 104 / 140 | - | - | 61 | - | 1.11 / 1473.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| lancel.Lynx 1.09 | 4 | 1932 | 23.3% | 66.4% | 0.0% | 10.3% | 752 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| lancel.Lynx 1.09 | 4 | 4 | n/a | 0 | 0.44 | 0 | 0 | 0 |

4 of 4 battles trusted.
