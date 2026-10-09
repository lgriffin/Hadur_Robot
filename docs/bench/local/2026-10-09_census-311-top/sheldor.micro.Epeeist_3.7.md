# sheldor.micro.Epeeist 3.7 (rank100-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 72.9% | 88.6% | 57.8% | 31 / 35 | - | - | 46 | - | 1.13 / 528.7 | 75.8% | -2.9 |
| 2 | 68.6% | 82.9% | 54.7% | 29 / 35 | - | - | 45 | - | 1.10 / 44.5 | 77.5% | -8.9 |
| 3 | 65.2% | 77.1% | 54.5% | 27 / 35 | - | - | 54 | - | 1.19 / 418.8 | 70.4% | -5.3 |
| 4 | 78.6% | 94.3% | 61.7% | 33 / 35 | - | - | 34 | - | 1.08 / 1136.2 | 77.1% | +1.5 |

Mean score share 71.3% ± 9.2, baseline 75.2% ± 5.2, paired diff -3.9 ± 6.9.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 179 over 4 battles (44.8 per battle, most in one battle 54). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sheldor.micro.Epeeist 3.7 | rank100-band3 | 71.3% ± 9.2 | 85.7% ± 11.7 | 57.2% ± 5.4 | 120 / 140 | - | - | 179 | - | 1.19 / 1136.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| sheldor.micro.Epeeist 3.7 | 4 | 1381 | 18.1% | 74.3% | 0.0% | 7.6% | 976 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sheldor.micro.Epeeist 3.7 | 4 | 4 | n/a | 0 | 1.28 | 0 | 0 | 0 |

4 of 4 battles trusted.
