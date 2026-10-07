# cx.mini.Cigaret 1.31 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 78.4% | 91.4% | 61.0% | 32 / 35 | - | - | 47 | - | 2.02 / 35.4 | 69.6% | +8.8 |
| 2 | 76.6% | 85.7% | 63.8% | 30 / 35 | - | - | 11 | - | 1.92 / 71.2 | 70.5% | +6.1 |
| 3 | 77.8% | 85.7% | 67.6% | 30 / 35 | - | - | 22 | - | 1.98 / 38.9 | 60.9% | +16.9 |
| 4 | 75.5% | 88.6% | 55.7% | 31 / 35 | - | - | 50 | - | 1.98 / 37.8 | 76.5% | -0.9 |
| 5 | 78.7% | 88.6% | 62.0% | 31 / 35 | - | - | 17 | - | 2.00 / 41.8 | 77.3% | +1.4 |
| 6 | 69.5% | 80.0% | 55.8% | 28 / 35 | - | - | 34 | - | 1.95 / 33.3 | 78.1% | -8.6 |
| 7 | 72.5% | 82.9% | 58.5% | 29 / 35 | - | - | 59 | - | 1.96 / 36.9 | 80.6% | -8.1 |
| 8 | 77.1% | 88.6% | 62.8% | 31 / 35 | - | - | 13 | - | 2.00 / 33.7 | 69.3% | +7.8 |

Mean score share 75.8% ± 2.7, baseline 72.9% ± 5.4, paired diff +2.9 ± 7.3.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 253 over 8 battles (31.6 per battle, most in one battle 59). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cx.mini.Cigaret 1.31 | mid | 75.8% ± 2.7 | 86.4% ± 3.1 | 60.9% ± 3.4 | 242 / 280 | - | - | 253 | - | 2.02 / 71.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| cx.mini.Cigaret 1.31 | 8 | 952 | 24.9% | 64.9% | 0.4% | 9.8% | 691 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cx.mini.Cigaret 1.31 | 8 | 8 | n/a | 0 | 0.90 | 0 | 0 | 0 |

8 of 8 battles trusted.
