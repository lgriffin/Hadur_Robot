# cx.micro.Spark 0.6 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 81.7% | 91.4% | 63.7% | 32 / 35 | - | - | 30 | - | 0.81 / 49.5 | 81.0% | +0.7 |
| 2 | 88.1% | 97.1% | 41.3% | 34 / 35 | - | - | 10 | - | 0.44 / 11.6 | 79.2% | +8.8 |
| 3 | 93.0% | 97.1% | 0.0% | 34 / 35 | - | - | 0 | - | 0.33 / 9.8 | 80.6% | +12.5 |
| 4 | 95.6% | 100.0% | 14.0% | 35 / 35 | - | - | 0 | - | 0.33 / 11.9 | 80.8% | +14.8 |
| 5 | 84.1% | 94.3% | 48.0% | 33 / 35 | - | - | 13 | - | 0.56 / 68.0 | 81.1% | +3.1 |
| 6 | 93.5% | 97.1% | 13.5% | 34 / 35 | - | - | 0 | - | 0.31 / 11.7 | 80.6% | +12.9 |
| 7 | 88.9% | 94.3% | 11.9% | 33 / 35 | - | - | 0 | - | 0.32 / 8.5 | 75.1% | +13.9 |
| 8 | 91.0% | 97.1% | 8.6% | 34 / 35 | - | - | 0 | - | 0.34 / 11.8 | 79.8% | +11.2 |

Mean score share 89.5% ± 4.0, baseline 79.8% ± 1.7, paired diff +9.7 ± 4.3.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 53 over 8 battles (6.6 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cx.micro.Spark 0.6 | mid | 89.5% ± 4.0 | 96.1% ± 2.2 | 25.1% ± 19.0 | 269 / 280 | - | - | 53 | - | 0.81 / 68.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| cx.micro.Spark 0.6 | 8 | 276 | 24.9% | 67.0% | 0.0% | 8.1% | 1190 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cx.micro.Spark 0.6 | 8 | 8 | n/a | 0 | 0.19 | 0 | 0 | 0 |

8 of 8 battles trusted.
