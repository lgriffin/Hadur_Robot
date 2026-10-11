# supersample.SuperCorners 1.0 (weak) vs rsalesc.mega.Knight 0.6.28

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 90.5% | 100.0% | 83.3% | 35 / 35 | - | - | 1 | - | 0.98 / 14.4 | 91.6% | -1.1 |
| 2 | 92.2% | 100.0% | 86.0% | 35 / 35 | - | - | 3 | - | 1.00 / 13.6 | 88.7% | +3.5 |
| 3 | 92.1% | 100.0% | 85.8% | 35 / 35 | - | - | 2 | - | 0.91 / 14.9 | 92.7% | -0.6 |
| 4 | 92.1% | 100.0% | 85.6% | 35 / 35 | - | - | 3 | - | 0.96 / 15.5 | 89.5% | +2.6 |
| 5 | 94.1% | 100.0% | 88.8% | 35 / 35 | - | - | 1 | - | 0.99 / 15.1 | 89.0% | +5.1 |
| 6 | 95.0% | 100.0% | 90.5% | 35 / 35 | - | - | 1 | - | 1.00 / 14.9 | 89.8% | +5.2 |
| 7 | 89.0% | 100.0% | 81.2% | 35 / 35 | - | - | 3 | - | 1.04 / 16.5 | 86.4% | +2.7 |
| 8 | 94.1% | 100.0% | 88.7% | 35 / 35 | - | - | 1 | - | 0.96 / 14.7 | 92.2% | +1.9 |

Mean score share 92.4% ± 1.7, baseline 90.0% ± 1.8, paired diff +2.4 ± 2.0.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 15 over 8 battles (1.9 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| supersample.SuperCorners 1.0 | weak | 92.4% ± 1.7 | 100.0% ± 0.0 | 86.2% ± 2.6 | 280 / 280 | - | - | 15 | - | 1.04 / 16.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| supersample.SuperCorners 1.0 | 8 | 433 | 0.0% | 96.9% | 3.1% | 0.0% | 395 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| supersample.SuperCorners 1.0 | 8 | 8 | n/a | 0 | 0.05 | 0 | 0 | 0 |

8 of 8 battles trusted.
