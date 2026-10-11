# deo.CloudBot 1.3 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 95.2% | 100.0% | 91.2% | 35 / 35 | - | - | 4 | - | 0.77 / 20.8 | 74.7% | +20.5 |
| 2 | 96.7% | 100.0% | 93.8% | 35 / 35 | - | - | 3 | - | 0.80 / 28.4 | 86.4% | +10.3 |
| 3 | 97.6% | 100.0% | 95.4% | 35 / 35 | - | - | 2 | - | 0.70 / 16.3 | 76.6% | +20.9 |
| 4 | 96.3% | 100.0% | 93.0% | 35 / 35 | - | - | 2 | - | 0.74 / 16.6 | 78.1% | +18.2 |
| 5 | 95.3% | 100.0% | 91.3% | 35 / 35 | - | - | 3 | - | 0.74 / 18.4 | 84.6% | +10.7 |
| 6 | 94.4% | 100.0% | 89.8% | 35 / 35 | - | - | 3 | - | 0.78 / 16.7 | 80.4% | +14.0 |
| 7 | 95.7% | 100.0% | 91.9% | 35 / 35 | - | - | 5 | - | 0.80 / 20.2 | 79.8% | +15.9 |
| 8 | 95.6% | 100.0% | 91.8% | 35 / 35 | - | - | 5 | - | 0.75 / 20.8 | 84.6% | +11.0 |

Mean score share 95.8% ± 0.8, baseline 80.6% ± 3.5, paired diff +15.2 ± 3.7.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 27 over 8 battles (3.4 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| deo.CloudBot 1.3 | mid | 95.8% ± 0.8 | 100.0% ± 0.0 | 92.3% ± 1.4 | 280 / 280 | - | - | 27 | - | 0.80 / 28.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| deo.CloudBot 1.3 | 8 | 246 | 0.0% | 99.9% | 0.1% | 0.0% | 327 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| deo.CloudBot 1.3 | 8 | 8 | n/a | 0 | 0.10 | 0 | 0 | 0 |

8 of 8 battles trusted.
