# bayen.nut.Squirrel 1.621 (mid-shield) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 94.6% | 100.0% | 89.9% | 35 / 35 | - | - | 7 | - | 0.76 / 24.5 | 76.7% | +17.9 |
| 2 | 96.2% | 100.0% | 92.9% | 35 / 35 | - | - | 5 | - | 0.83 / 17.2 | 75.8% | +20.4 |
| 3 | 96.0% | 100.0% | 92.5% | 35 / 35 | - | - | 3 | - | 0.76 / 23.9 | 84.4% | +11.5 |
| 4 | 94.4% | 100.0% | 89.6% | 35 / 35 | - | - | 3 | - | 0.70 / 16.8 | 93.9% | +0.5 |
| 5 | 95.1% | 100.0% | 90.9% | 35 / 35 | - | - | 1 | - | 0.71 / 23.0 | 82.2% | +12.9 |
| 6 | 92.4% | 100.0% | 86.3% | 35 / 35 | - | - | 3 | - | 0.80 / 24.6 | 93.9% | -1.6 |
| 7 | 96.9% | 100.0% | 94.1% | 35 / 35 | - | - | 1 | - | 0.69 / 17.8 | 82.1% | +14.8 |
| 8 | 95.9% | 100.0% | 92.4% | 35 / 35 | - | - | 8 | - | 0.69 / 26.7 | 77.6% | +18.4 |

Mean score share 95.2% ± 1.2, baseline 83.3% ± 6.0, paired diff +11.9 ± 6.9.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 31 over 8 battles (3.9 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| bayen.nut.Squirrel 1.621 | mid-shield | 95.2% ± 1.2 | 100.0% ± 0.0 | 91.1% ± 2.1 | 280 / 280 | - | - | 31 | - | 0.83 / 26.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| bayen.nut.Squirrel 1.621 | 8 | 280 | 0.0% | 99.8% | 0.2% | 0.0% | 315 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| bayen.nut.Squirrel 1.621 | 8 | 8 | n/a | 0 | 0.11 | 0 | 0 | 8 |

8 of 8 battles trusted.
