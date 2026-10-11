# tw.Exterminator 1.0 (rank360-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 76.8% | 65.7% | 83.5% | 23 / 35 | - | - | 142 | - | 1.27 / 1436.4 | 83.5% | -6.7 |
| 2 | 89.3% | 88.6% | 88.5% | 31 / 35 | - | - | 120 | - | 1.26 / 2219.1 | 86.8% | +2.5 |
| 3 | 90.5% | 88.6% | 90.7% | 31 / 35 | - | - | 62 | - | 1.18 / 1412.3 | 94.4% | -3.9 |
| 4 | 82.7% | 74.3% | 87.2% | 26 / 35 | - | - | 74 | - | 1.19 / 2098.2 | 91.0% | -8.3 |

Mean score share 84.8% ± 10.1, baseline 88.9% ± 7.6, paired diff -4.1 ± 7.5.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 398 over 4 battles (99.5 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| tw.Exterminator 1.0 | rank360-band4 | 84.8% ± 10.1 | 79.3% ± 17.9 | 87.5% ± 4.8 | 111 / 140 | - | - | 398 | - | 1.27 / 2219.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| tw.Exterminator 1.0 | 4 | 825 | 44.0% | 43.8% | 0.0% | 12.2% | 1436 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| tw.Exterminator 1.0 | 4 | 1 | n/a | 0 | 2.84 | 0 | 0 | 0 |

1 of 4 battles trusted.
