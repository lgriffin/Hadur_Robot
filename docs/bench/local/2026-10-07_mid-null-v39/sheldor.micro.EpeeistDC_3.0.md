# sheldor.micro.EpeeistDC 3.0 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 85.6% | 100.0% | 67.2% | 35 / 35 | - | - | 18 | - | 1.10 / 37.9 | 73.4% | +12.2 |
| 2 | 80.9% | 94.3% | 64.7% | 33 / 35 | - | - | 38 | - | 1.28 / 34.8 | 74.4% | +6.5 |
| 3 | 79.4% | 94.3% | 60.7% | 33 / 35 | - | - | 26 | - | 1.14 / 36.2 | 70.1% | +9.2 |
| 4 | 77.5% | 91.4% | 62.0% | 32 / 35 | - | - | 72 | - | 1.37 / 36.9 | 68.6% | +8.9 |
| 5 | 78.4% | 94.3% | 60.2% | 33 / 35 | - | - | 24 | - | 1.19 / 38.3 | 64.3% | +14.1 |
| 6 | 83.4% | 94.3% | 69.9% | 33 / 35 | - | - | 31 | - | 1.28 / 29.7 | 75.5% | +8.0 |
| 7 | 83.9% | 100.0% | 63.2% | 35 / 35 | - | - | 28 | - | 1.24 / 37.2 | 70.0% | +13.9 |
| 8 | 82.9% | 97.1% | 65.9% | 34 / 35 | - | - | 34 | - | 1.27 / 30.2 | 76.9% | +6.0 |

Mean score share 81.5% ± 2.4, baseline 71.6% ± 3.5, paired diff +9.9 ± 2.6.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 271 over 8 battles (33.9 per battle, most in one battle 72). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sheldor.micro.EpeeistDC 3.0 | mid | 81.5% ± 2.4 | 95.7% ± 2.6 | 64.2% ± 2.8 | 268 / 280 | - | - | 271 | - | 1.37 / 38.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| sheldor.micro.EpeeistDC 3.0 | 8 | 796 | 9.4% | 87.1% | 0.0% | 3.5% | 930 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sheldor.micro.EpeeistDC 3.0 | 8 | 7 | n/a | 0 | 0.97 | 0 | 0 | 0 |

7 of 8 battles trusted.
