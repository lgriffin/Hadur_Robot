# kid.Toa .0.5 (mid-shield) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 98.7% | 100.0% | 0.0% | 35 / 35 | - | - | 0 | - | 0.59 / 45.2 | 85.5% | +13.2 |
| 2 | 93.0% | 97.1% | 0.0% | 34 / 35 | - | - | 0 | - | 0.71 / 44.1 | 84.0% | +9.0 |
| 3 | 85.3% | 91.4% | 0.0% | 32 / 35 | - | - | 0 | - | 0.79 / 44.0 | 85.7% | -0.5 |
| 4 | 92.8% | 97.1% | 0.0% | 34 / 35 | - | - | 0 | - | 0.62 / 54.7 | 81.2% | +11.6 |
| 5 | 86.9% | 94.3% | 31.5% | 33 / 35 | - | - | 5 | - | 0.76 / 57.6 | 85.3% | +1.6 |
| 6 | 92.6% | 97.1% | 0.0% | 34 / 35 | - | - | 0 | - | 0.70 / 47.8 | 84.1% | +8.4 |
| 7 | 98.4% | 100.0% | 0.0% | 35 / 35 | - | - | 0 | - | 0.61 / 50.3 | 85.5% | +13.0 |
| 8 | 94.8% | 97.1% | 0.0% | 34 / 35 | - | - | 0 | - | 0.61 / 138.0 | 85.8% | +9.0 |

Mean score share 92.8% ± 4.0, baseline 84.6% ± 1.3, paired diff +8.2 ± 4.2.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 5 over 8 battles (0.6 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kid.Toa .0.5 | mid-shield | 92.8% ± 4.0 | 96.8% ± 2.4 | 3.9% ± 9.3 | 271 / 280 | - | - | 5 | - | 0.79 / 138.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| kid.Toa .0.5 | 8 | 162 | 34.8% | 55.6% | 0.0% | 9.6% | 1407 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kid.Toa .0.5 | 8 | 8 | n/a | 0 | 0.02 | 0 | 0 | 0 |

8 of 8 battles trusted.
