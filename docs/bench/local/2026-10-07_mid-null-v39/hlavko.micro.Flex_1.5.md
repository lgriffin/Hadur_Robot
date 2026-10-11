# hlavko.micro.Flex 1.5 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 88.3% | 94.3% | 81.3% | 33 / 35 | - | - | 4 | - | 0.88 / 25.7 | 81.8% | +6.5 |
| 2 | 85.0% | 97.1% | 72.9% | 34 / 35 | - | - | 11 | - | 0.88 / 32.6 | 88.6% | -3.6 |
| 3 | 86.7% | 97.1% | 75.2% | 34 / 35 | - | - | 8 | - | 0.91 / 35.5 | 80.4% | +6.3 |
| 4 | 88.3% | 97.1% | 78.8% | 34 / 35 | - | - | 5 | - | 0.88 / 27.6 | 80.0% | +8.3 |
| 5 | 91.2% | 100.0% | 81.5% | 35 / 35 | - | - | 4 | - | 0.86 / 35.5 | 85.2% | +6.0 |
| 6 | 85.9% | 97.1% | 73.7% | 34 / 35 | - | - | 9 | - | 0.97 / 36.0 | 78.5% | +7.4 |
| 7 | 90.9% | 100.0% | 80.5% | 35 / 35 | - | - | 5 | - | 0.85 / 36.6 | 80.4% | +10.5 |
| 8 | 84.8% | 94.3% | 74.6% | 33 / 35 | - | - | 9 | - | 0.92 / 32.2 | 74.4% | +10.3 |

Mean score share 87.6% ± 2.1, baseline 81.2% ± 3.6, paired diff +6.5 ± 3.7.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 55 over 8 battles (6.9 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| hlavko.micro.Flex 1.5 | mid | 87.6% ± 2.1 | 97.1% ± 1.8 | 77.3% ± 3.0 | 272 / 280 | - | - | 55 | - | 0.97 / 36.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| hlavko.micro.Flex 1.5 | 8 | 580 | 8.6% | 87.5% | 0.1% | 3.8% | 525 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| hlavko.micro.Flex 1.5 | 8 | 8 | n/a | 0 | 0.20 | 0 | 0 | 0 |

8 of 8 battles trusted.
