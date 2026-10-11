# eem.zapper v6.03 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 79.9% | 97.1% | 59.4% | 34 / 35 | - | - | 18 | - | 1.43 / 31.2 | 74.1% | +5.8 |
| 2 | 80.1% | 94.3% | 63.0% | 33 / 35 | - | - | 18 | - | 1.54 / 26.5 | 66.5% | +13.5 |
| 3 | 80.3% | 97.1% | 60.4% | 34 / 35 | - | - | 14 | - | 1.73 / 27.0 | 72.0% | +8.2 |
| 4 | 75.0% | 94.3% | 54.9% | 33 / 35 | - | - | 25 | - | 1.53 / 39.9 | 68.2% | +6.9 |
| 5 | 81.9% | 100.0% | 60.9% | 35 / 35 | - | - | 10 | - | 1.57 / 34.9 | 66.0% | +15.9 |
| 6 | 78.7% | 94.3% | 60.9% | 33 / 35 | - | - | 17 | - | 1.49 / 26.0 | 69.7% | +8.9 |
| 7 | 88.7% | 100.0% | 74.3% | 35 / 35 | - | - | 24 | - | 1.71 / 26.1 | 67.8% | +20.9 |
| 8 | 77.7% | 91.4% | 61.8% | 32 / 35 | - | - | 15 | - | 1.43 / 59.8 | 79.3% | -1.6 |

Mean score share 80.3% ± 3.3, baseline 70.5% ± 3.8, paired diff +9.8 ± 5.7.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 141 over 8 battles (17.6 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| eem.zapper v6.03 | mid | 80.3% ± 3.3 | 96.1% ± 2.5 | 62.0% ± 4.6 | 269 / 280 | - | - | 141 | - | 1.73 / 59.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| eem.zapper v6.03 | 8 | 860 | 8.0% | 88.6% | 0.0% | 3.4% | 1029 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| eem.zapper v6.03 | 8 | 8 | n/a | 0 | 0.50 | 0 | 0 | 0 |

8 of 8 battles trusted.
