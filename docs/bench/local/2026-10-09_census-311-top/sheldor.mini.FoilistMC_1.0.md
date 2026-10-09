# sheldor.mini.FoilistMC 1.0 (rank47-band2) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 80.6% | 91.4% | 69.6% | 32 / 35 | - | - | 29 | - | 1.24 / 1029.0 | 67.3% | +13.3 |
| 2 | 58.1% | 65.7% | 50.7% | 23 / 35 | - | - | 40 | - | 1.26 / 737.1 | 69.0% | -10.9 |
| 3 | 69.3% | 77.1% | 60.7% | 27 / 35 | - | - | 42 | - | 1.25 / 1273.5 | 73.6% | -4.3 |
| 4 | 69.2% | 74.3% | 63.6% | 26 / 35 | - | - | 42 | - | 1.23 / 762.0 | 78.1% | -8.9 |

Mean score share 69.3% ± 14.6, baseline 72.0% ± 7.7, paired diff -2.7 ± 17.5.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 153 over 4 battles (38.3 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sheldor.mini.FoilistMC 1.0 | rank47-band2 | 69.3% ± 14.6 | 77.1% ± 17.0 | 61.2% ± 12.6 | 108 / 140 | - | - | 153 | - | 1.26 / 1273.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| sheldor.mini.FoilistMC 1.0 | 4 | 1482 | 27.0% | 62.8% | 0.0% | 10.2% | 1163 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sheldor.mini.FoilistMC 1.0 | 4 | 4 | n/a | 0 | 1.09 | 0 | 0 | 0 |

4 of 4 battles trusted.
