# pedersen.Hubris 2.4 (mid-shield) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 93.4% | 94.3% | 0.0% | 33 / 35 | - | - | 0 | - | 0.24 / 51.7 | 81.2% | +12.3 |
| 2 | 97.0% | 97.1% | 25.0% | 34 / 35 | - | - | 0 | - | 0.24 / 10.4 | 80.9% | +16.1 |
| 3 | 99.9% | 100.0% | 50.0% | 35 / 35 | - | - | 0 | - | 0.24 / 7.7 | 83.8% | +16.1 |
| 4 | 99.9% | 100.0% | 0.0% | 35 / 35 | - | - | 0 | - | 0.24 / 10.3 | 81.4% | +18.5 |
| 5 | 96.4% | 97.1% | 5.6% | 34 / 35 | - | - | 0 | - | 0.24 / 8.3 | 77.9% | +18.4 |
| 6 | 99.9% | 100.0% | 0.0% | 35 / 35 | - | - | 0 | - | 0.23 / 46.4 | 78.3% | +21.6 |
| 7 | 99.9% | 100.0% | 50.0% | 35 / 35 | - | - | 0 | - | 0.23 / 12.1 | 86.4% | +13.4 |
| 8 | 97.1% | 97.1% | 0.0% | 34 / 35 | - | - | 0 | - | 0.22 / 10.9 | 75.7% | +21.3 |

Mean score share 97.9% ± 2.0, baseline 80.7% ± 2.9, paired diff +17.2 ± 2.8.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pedersen.Hubris 2.4 | mid-shield | 97.9% ± 2.0 | 98.2% ± 1.8 | 16.3% ± 18.8 | 275 / 280 | - | - | 0 | - | 0.24 / 51.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| pedersen.Hubris 2.4 | 8 | 44 | 71.4% | 12.6% | 1.7% | 14.3% | 1564 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pedersen.Hubris 2.4 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |

8 of 8 battles trusted.
