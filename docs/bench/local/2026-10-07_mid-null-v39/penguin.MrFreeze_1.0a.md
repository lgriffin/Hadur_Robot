# penguin.MrFreeze 1.0a (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 89.5% | 100.0% | 77.0% | 35 / 35 | - | - | 98 | - | 1.27 / 39.5 | 86.3% | +3.2 |
| 2 | 88.1% | 100.0% | 74.7% | 35 / 35 | - | - | 101 | - | 1.29 / 40.6 | 83.4% | +4.7 |
| 3 | 86.1% | 100.0% | 70.5% | 35 / 35 | - | - | 162 | - | 1.33 / 39.1 | 84.2% | +1.9 |
| 4 | 86.9% | 97.1% | 75.6% | 34 / 35 | - | - | 96 | - | 1.28 / 39.9 | 88.0% | -1.2 |
| 5 | 82.8% | 91.4% | 73.0% | 32 / 35 | - | - | 127 | - | 1.31 / 40.3 | 90.1% | -7.3 |
| 6 | 85.5% | 94.3% | 75.4% | 33 / 35 | - | - | 91 | - | 1.27 / 37.9 | 85.8% | -0.3 |
| 7 | 87.4% | 97.1% | 76.5% | 34 / 35 | - | - | 79 | - | 1.26 / 38.8 | 88.0% | -0.6 |
| 8 | 88.4% | 97.1% | 77.7% | 34 / 35 | - | - | 80 | - | 1.23 / 45.2 | 91.8% | -3.4 |

Mean score share 86.8% ± 1.7, baseline 87.2% ± 2.4, paired diff -0.4 ± 3.2.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 834 over 8 battles (104.3 per battle, most in one battle 162). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| penguin.MrFreeze 1.0a | mid | 86.8% ± 1.7 | 97.1% ± 2.6 | 75.0% ± 2.0 | 272 / 280 | - | - | 834 | - | 1.33 / 45.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| penguin.MrFreeze 1.0a | 8 | 596 | 8.4% | 88.1% | 0.0% | 3.5% | 954 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| penguin.MrFreeze 1.0a | 8 | 0 | n/a | 0 | 2.98 | 0 | 0 | 0 |

0 of 8 battles trusted.
