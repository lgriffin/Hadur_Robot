# whind.StrengthBee 0.6.4 (rank135-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 68.0% | 85.7% | 52.0% | 30 / 35 | - | - | 1 | - | 0.97 / 953.6 | 75.5% | -7.5 |
| 2 | 77.5% | 91.4% | 63.2% | 32 / 35 | - | - | 17 | - | 1.22 / 1335.2 | 67.1% | +10.4 |
| 3 | 66.3% | 80.0% | 53.2% | 28 / 35 | - | - | 10 | - | 1.20 / 193.7 | 73.5% | -7.2 |
| 4 | 68.3% | 82.9% | 54.7% | 29 / 35 | - | - | 10 | - | 1.21 / 59.4 | 79.0% | -10.7 |

Mean score share 70.0% ± 8.0, baseline 73.8% ± 7.9, paired diff -3.8 ± 15.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 38 over 4 battles (9.5 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| whind.StrengthBee 0.6.4 | rank135-band3 | 70.0% ± 8.0 | 85.0% ± 7.8 | 55.8% ± 8.0 | 119 / 140 | - | - | 38 | - | 1.22 / 1335.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| whind.StrengthBee 0.6.4 | 4 | 1431 | 18.3% | 73.3% | 0.0% | 8.4% | 765 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| whind.StrengthBee 0.6.4 | 4 | 4 | n/a | 0 | 0.27 | 0 | 0 | 0 |

4 of 4 battles trusted.
