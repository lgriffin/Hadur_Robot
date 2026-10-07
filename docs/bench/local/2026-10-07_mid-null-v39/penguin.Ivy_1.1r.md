# penguin.Ivy 1.1r (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 86.1% | 94.3% | 77.7% | 33 / 35 | - | - | 151 | - | 1.37 / 44.3 | 88.2% | -2.1 |
| 2 | 88.9% | 94.3% | 82.8% | 33 / 35 | - | - | 132 | - | 1.34 / 38.2 | 83.1% | +5.8 |
| 3 | 88.7% | 94.3% | 82.5% | 33 / 35 | - | - | 233 | - | 1.46 / 35.9 | 81.0% | +7.7 |
| 4 | 91.3% | 97.1% | 84.6% | 34 / 35 | - | - | 162 | - | 1.37 / 29.6 | 91.2% | +0.1 |
| 5 | 87.9% | 91.4% | 83.5% | 32 / 35 | - | - | 186 | - | 1.44 / 37.5 | 89.6% | -1.7 |
| 6 | 91.6% | 97.1% | 85.4% | 34 / 35 | - | - | 151 | - | 1.38 / 34.9 | 90.2% | +1.4 |
| 7 | 90.2% | 97.1% | 82.5% | 34 / 35 | - | - | 163 | - | 1.39 / 36.2 | 84.6% | +5.7 |
| 8 | 87.5% | 91.4% | 82.7% | 32 / 35 | - | - | 273 | - | 1.49 / 34.9 | 90.9% | -3.5 |

Mean score share 89.0% ± 1.6, baseline 87.4% ± 3.3, paired diff +1.7 ± 3.5.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 1451 over 8 battles (181.4 per battle, most in one battle 273). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| penguin.Ivy 1.1r | mid | 89.0% ± 1.6 | 94.6% ± 2.0 | 82.7% ± 1.9 | 265 / 280 | - | - | 1451 | - | 1.49 / 44.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| penguin.Ivy 1.1r | 8 | 533 | 17.6% | 76.3% | 0.0% | 6.1% | 932 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| penguin.Ivy 1.1r | 8 | 0 | n/a | 0 | 5.18 | 0 | 0 | 0 |

0 of 8 battles trusted.
