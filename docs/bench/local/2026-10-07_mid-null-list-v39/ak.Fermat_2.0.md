# ak.Fermat 2.0 (mid-shield) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 100.0% | 100.0% | 50.0% | 35 / 35 | - | - | 0 | - | 0.54 / 11.4 | 79.5% | +20.5 |
| 2 | 100.0% | 100.0% | 50.0% | 35 / 35 | - | - | 0 | - | 0.50 / 11.1 | 79.0% | +21.0 |
| 3 | 84.3% | 94.3% | 66.8% | 33 / 35 | - | - | 9 | - | 0.95 / 43.9 | 81.9% | +2.3 |
| 4 | 99.4% | 100.0% | 0.0% | 35 / 35 | - | - | 0 | - | 0.48 / 11.2 | 83.2% | +16.2 |
| 5 | 98.7% | 100.0% | 0.0% | 35 / 35 | - | - | 0 | - | 0.49 / 11.0 | 77.7% | +20.9 |
| 6 | 100.0% | 100.0% | 50.0% | 35 / 35 | - | - | 0 | - | 0.48 / 11.5 | 86.4% | +13.6 |
| 7 | 100.0% | 100.0% | 50.0% | 35 / 35 | - | - | 0 | - | 0.49 / 11.1 | 81.4% | +18.6 |
| 8 | 100.0% | 100.0% | 50.0% | 35 / 35 | - | - | 0 | - | 0.46 / 33.4 | 86.4% | +13.6 |

Mean score share 97.8% ± 4.6, baseline 81.9% ± 2.7, paired diff +15.8 ± 5.2.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 9 over 8 battles (1.1 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ak.Fermat 2.0 | mid-shield | 97.8% ± 4.6 | 99.3% ± 1.7 | 39.6% ± 21.0 | 278 / 280 | - | - | 9 | - | 0.95 / 43.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ak.Fermat 2.0 | 8 | 73 | 17.1% | 73.7% | 0.0% | 9.2% | 1032 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ak.Fermat 2.0 | 8 | 8 | n/a | 0 | 0.03 | 0 | 0 | 0 |

8 of 8 battles trusted.
