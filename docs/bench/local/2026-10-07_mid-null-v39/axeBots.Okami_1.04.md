# axeBots.Okami 1.04 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 80.8% | 94.3% | 66.1% | 33 / 35 | - | - | 524 | - | 1.87 / 11.9 | 78.4% | +2.4 |
| 2 | 84.1% | 100.0% | 66.7% | 35 / 35 | - | - | 195 | - | 1.60 / 9.6 | 77.0% | +7.1 |
| 3 | 85.4% | 97.1% | 72.4% | 34 / 35 | - | - | 378 | - | 1.76 / 7.3 | 78.7% | +6.7 |
| 4 | 78.2% | 88.6% | 67.0% | 31 / 35 | - | - | 302 | - | 1.72 / 11.8 | 71.8% | +6.4 |
| 5 | 73.1% | 82.9% | 62.8% | 29 / 35 | - | - | 366 | - | 1.74 / 6.7 | 72.0% | +1.0 |
| 6 | 81.4% | 94.3% | 68.3% | 33 / 35 | - | - | 271 | - | 1.63 / 10.8 | 71.4% | +10.0 |
| 7 | 83.2% | 97.1% | 68.6% | 34 / 35 | - | - | 316 | - | 1.68 / 14.9 | 74.7% | +8.5 |
| 8 | 80.6% | 91.4% | 69.6% | 32 / 35 | - | - | 269 | - | 1.66 / 11.6 | 74.7% | +5.9 |

Mean score share 80.8% ± 3.2, baseline 74.8% ± 2.5, paired diff +6.0 ± 2.5.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 2621 over 8 battles (327.6 per battle, most in one battle 524). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| axeBots.Okami 1.04 | mid | 80.8% ± 3.2 | 93.2% ± 4.6 | 67.7% ± 2.3 | 261 / 280 | - | - | 2621 | - | 1.87 / 14.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| axeBots.Okami 1.04 | 8 | 895 | 13.3% | 81.5% | 0.0% | 5.3% | 1058 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| axeBots.Okami 1.04 | 8 | 0 | n/a | 0 | 9.36 | 0 | 0 | 0 |

0 of 8 battles trusted.
