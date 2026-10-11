# rampancy.Durandal 2.2d (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 95.0% | 100.0% | 90.8% | 35 / 35 | - | - | 2 | - | 0.72 / 19.6 | 74.9% | +20.1 |
| 2 | 95.3% | 100.0% | 91.2% | 35 / 35 | - | - | 3 | - | 0.75 / 38.8 | 74.6% | +20.7 |
| 3 | 91.1% | 100.0% | 82.9% | 35 / 35 | - | - | 2 | - | 0.91 / 22.3 | 76.0% | +15.0 |
| 4 | 94.7% | 100.0% | 90.3% | 35 / 35 | - | - | 1 | - | 0.75 / 17.3 | 81.9% | +12.8 |
| 5 | 89.1% | 97.1% | 82.2% | 34 / 35 | - | - | 6 | - | 0.98 / 21.5 | 80.1% | +9.0 |
| 6 | 86.7% | 97.1% | 76.8% | 34 / 35 | - | - | 9 | - | 0.94 / 20.8 | 77.3% | +9.3 |
| 7 | 95.9% | 100.0% | 92.1% | 35 / 35 | - | - | 0 | - | 0.86 / 18.6 | 78.7% | +17.2 |
| 8 | 91.8% | 97.1% | 86.7% | 34 / 35 | - | - | 4 | - | 0.90 / 21.0 | 75.9% | +15.8 |

Mean score share 92.4% ± 2.8, baseline 77.4% ± 2.2, paired diff +15.0 ± 3.7.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 27 over 8 battles (3.4 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| rampancy.Durandal 2.2d | mid | 92.4% ± 2.8 | 98.9% ± 1.2 | 86.6% ± 4.6 | 277 / 280 | - | - | 27 | - | 0.98 / 38.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| rampancy.Durandal 2.2d | 8 | 421 | 4.5% | 93.7% | 0.0% | 1.8% | 399 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| rampancy.Durandal 2.2d | 8 | 8 | n/a | 0 | 0.10 | 0 | 0 | 0 |

8 of 8 battles trusted.
