# dragonbyte.Neutrino 4 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 99.9% | 100.0% | 99.7% | 35 / 35 | - | - | 708 | - | 1.47 / 48.3 | 83.6% | +16.2 |
| 2 | 99.9% | 100.0% | 99.9% | 35 / 35 | - | - | 1123 | - | 1.61 / 47.1 | 86.2% | +13.7 |
| 3 | 98.9% | 97.1% | 99.9% | 34 / 35 | - | - | 1054 | - | 1.60 / 41.1 | 76.5% | +22.4 |
| 4 | 99.9% | 100.0% | 99.9% | 35 / 35 | - | - | 841 | - | 1.52 / 56.3 | 83.7% | +16.3 |
| 5 | 98.9% | 97.1% | 100.0% | 34 / 35 | - | - | 598 | - | 1.48 / 52.8 | 89.6% | +9.3 |
| 6 | 98.9% | 97.1% | 99.9% | 34 / 35 | - | - | 988 | - | 1.56 / 50.5 | 79.5% | +19.4 |
| 7 | 97.8% | 94.3% | 99.9% | 33 / 35 | - | - | 640 | - | 1.44 / 38.0 | 83.2% | +14.6 |
| 8 | 100.0% | 100.0% | 99.9% | 35 / 35 | - | - | 571 | - | 1.46 / 40.9 | 78.3% | +21.7 |

Mean score share 99.3% ± 0.6, baseline 82.6% ± 3.6, paired diff +16.7 ± 3.6.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 6523 over 8 battles (815.4 per battle, most in one battle 1123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dragonbyte.Neutrino 4 | mid | 99.3% ± 0.6 | 98.2% ± 1.8 | 99.9% ± 0.1 | 275 / 280 | - | - | 6523 | - | 1.61 / 56.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| dragonbyte.Neutrino 4 | 8 | 41 | 76.0% | 8.5% | 0.3% | 15.2% | 2847 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dragonbyte.Neutrino 4 | 8 | 0 | n/a | 0 | 23.30 | 0 | 0 | 0 |

0 of 8 battles trusted.
