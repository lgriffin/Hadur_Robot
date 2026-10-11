# stelo.PastFuture 2.3.2 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 80.5% | 94.3% | 64.4% | 33 / 35 | - | - | 19 | - | 1.28 / 42.0 | 61.7% | +18.8 |
| 2 | 76.8% | 91.4% | 61.0% | 32 / 35 | - | - | 14 | - | 1.22 / 39.5 | 59.8% | +17.0 |
| 3 | 76.9% | 88.6% | 63.1% | 31 / 35 | - | - | 25 | - | 1.26 / 122.0 | 64.1% | +12.8 |
| 4 | 82.0% | 97.1% | 64.4% | 34 / 35 | - | - | 15 | - | 1.25 / 42.6 | 55.8% | +26.2 |
| 5 | 79.8% | 97.1% | 60.7% | 34 / 35 | - | - | 17 | - | 1.23 / 40.8 | 67.6% | +12.1 |
| 6 | 78.7% | 94.3% | 61.5% | 33 / 35 | - | - | 11 | - | 1.22 / 38.5 | 60.9% | +17.8 |
| 7 | 70.0% | 85.7% | 53.8% | 30 / 35 | - | - | 32 | - | 1.28 / 36.5 | 67.1% | +2.9 |
| 8 | 82.3% | 97.1% | 65.4% | 34 / 35 | - | - | 18 | - | 1.26 / 39.3 | 68.0% | +14.4 |

Mean score share 78.4% ± 3.3, baseline 63.1% ± 3.6, paired diff +15.2 ± 5.6.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 151 over 8 battles (18.9 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| stelo.PastFuture 2.3.2 | mid | 78.4% ± 3.3 | 93.2% ± 3.6 | 61.8% ± 3.1 | 261 / 280 | - | - | 151 | - | 1.28 / 122.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| stelo.PastFuture 2.3.2 | 8 | 966 | 12.3% | 82.6% | 0.0% | 5.1% | 744 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| stelo.PastFuture 2.3.2 | 8 | 8 | n/a | 0 | 0.54 | 0 | 0 | 0 |

8 of 8 battles trusted.
