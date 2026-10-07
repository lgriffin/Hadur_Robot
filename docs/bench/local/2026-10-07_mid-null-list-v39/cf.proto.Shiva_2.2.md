# cf.proto.Shiva 2.2 (mid-shield) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 92.4% | 97.1% | 0.0% | 34 / 35 | - | - | 0 | - | 0.16 / 8.6 | 62.9% | +29.5 |
| 2 | 81.4% | 94.1% | 69.2% | 33 / 35 | - | - | 12 | - | 0.87 / 35.7 | 63.2% | +18.2 |
| 3 | 90.5% | 100.0% | 78.6% | 35 / 35 | - | - | 15 | - | 0.57 / 47.6 | 71.9% | +18.6 |
| 4 | 92.4% | 100.0% | 76.1% | 35 / 35 | - | - | 7 | - | 0.38 / 32.7 | 59.6% | +32.8 |
| 5 | 91.6% | 97.1% | 8.8% | 34 / 35 | - | - | 0 | - | 0.17 / 7.7 | 65.8% | +25.8 |
| 6 | 92.1% | 97.1% | 6.7% | 34 / 35 | - | - | 0 | - | 0.15 / 7.0 | 70.5% | +21.6 |
| 7 | 83.1% | 94.3% | 70.4% | 33 / 35 | - | - | 19 | - | 0.90 / 37.0 | 67.0% | +16.1 |
| 8 | 93.0% | 100.0% | 20.2% | 35 / 35 | - | - | 0 | - | 0.17 / 8.8 | 71.8% | +21.2 |

Mean score share 89.5% ± 3.8, baseline 66.6% ± 3.8, paired diff +23.0 ± 4.9.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 53 over 8 battles (6.6 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cf.proto.Shiva 2.2 | mid-shield | 89.5% ± 3.8 | 97.5% ± 2.0 | 41.2% ± 29.4 | 273 / 280 | - | - | 53 | - | 0.90 / 47.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| cf.proto.Shiva 2.2 | 8 | 366 | 12.0% | 79.9% | 3.6% | 4.5% | 1094 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cf.proto.Shiva 2.2 | 8 | 8 | n/a | 0 | 0.19 | 0 | 0 | 0 |

8 of 8 battles trusted.
