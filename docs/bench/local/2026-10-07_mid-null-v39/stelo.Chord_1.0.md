# stelo.Chord 1.0 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 96.9% | 100.0% | 94.1% | 35 / 35 | - | - | 3 | - | 0.79 / 19.1 | 86.0% | +10.8 |
| 2 | 97.2% | 100.0% | 94.8% | 35 / 35 | - | - | 4 | - | 0.79 / 16.5 | 73.9% | +23.3 |
| 3 | 93.7% | 100.0% | 87.3% | 35 / 35 | - | - | 7 | - | 0.98 / 33.2 | 77.7% | +15.9 |
| 4 | 96.6% | 100.0% | 93.6% | 35 / 35 | - | - | 2 | - | 0.72 / 20.1 | 78.9% | +17.7 |
| 5 | 96.8% | 100.0% | 94.0% | 35 / 35 | - | - | 3 | - | 0.76 / 19.4 | 84.3% | +12.4 |
| 6 | 96.2% | 100.0% | 92.9% | 35 / 35 | - | - | 2 | - | 0.76 / 17.2 | 70.2% | +26.0 |
| 7 | 97.2% | 100.0% | 94.8% | 35 / 35 | - | - | 1 | - | 0.72 / 20.1 | 85.3% | +11.9 |
| 8 | 96.5% | 100.0% | 93.4% | 35 / 35 | - | - | 3 | - | 0.75 / 20.0 | 83.0% | +13.5 |

Mean score share 96.4% ± 1.0, baseline 79.9% ± 4.8, paired diff +16.5 ± 4.7.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 25 over 8 battles (3.1 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| stelo.Chord 1.0 | mid | 96.4% ± 1.0 | 100.0% ± 0.0 | 93.1% ± 2.0 | 280 / 280 | - | - | 25 | - | 0.98 / 33.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| stelo.Chord 1.0 | 8 | 205 | 0.0% | 100.0% | 0.0% | 0.0% | 343 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| stelo.Chord 1.0 | 8 | 8 | n/a | 0 | 0.09 | 0 | 0 | 0 |

8 of 8 battles trusted.
