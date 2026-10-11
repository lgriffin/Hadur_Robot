# kms.Golden 0.10 (mid-shield) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 82.0% | 97.1% | 58.6% | 34 / 35 | - | - | 7 | - | 0.81 / 47.9 | 63.9% | +18.1 |
| 2 | 87.7% | 97.1% | 53.3% | 34 / 35 | - | - | 6 | - | 0.46 / 33.9 | 74.0% | +13.7 |
| 3 | 82.8% | 97.1% | 63.4% | 34 / 35 | - | - | 6 | - | 0.83 / 23.2 | 78.1% | +4.7 |
| 4 | 88.3% | 100.0% | 65.5% | 35 / 35 | - | - | 11 | - | 0.76 / 60.9 | 64.9% | +23.4 |
| 5 | 100.0% | 100.0% | 50.0% | 35 / 35 | - | - | 0 | - | 0.14 / 8.2 | 69.7% | +30.3 |
| 6 | 99.6% | 100.0% | 11.1% | 35 / 35 | - | - | 0 | - | 0.14 / 7.9 | 70.7% | +28.9 |
| 7 | 91.9% | 97.1% | 1.9% | 34 / 35 | - | - | 0 | - | 0.14 / 7.3 | 69.2% | +22.6 |
| 8 | 81.5% | 94.3% | 63.7% | 33 / 35 | - | - | 13 | - | 0.84 / 24.5 | 74.8% | +6.7 |

Mean score share 89.2% ± 6.2, baseline 70.7% ± 4.1, paired diff +18.6 ± 8.0.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 43 over 8 battles (5.4 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kms.Golden 0.10 | mid-shield | 89.2% ± 6.2 | 97.9% ± 1.7 | 45.9% ± 20.9 | 274 / 280 | - | - | 43 | - | 0.84 / 60.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| kms.Golden 0.10 | 8 | 374 | 10.0% | 82.9% | 2.1% | 4.9% | 754 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kms.Golden 0.10 | 8 | 8 | n/a | 0 | 0.15 | 0 | 0 | 0 |

8 of 8 battles trusted.
