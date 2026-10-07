# jmcd.BeoWulf 2.8 (weak) vs rsalesc.mega.Knight 0.6.28

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 81.7% | 94.3% | 70.7% | 33 / 35 | - | - | 1 | - | 0.95 / 18.5 | 82.8% | -1.0 |
| 2 | 89.3% | 100.0% | 79.4% | 35 / 35 | - | - | 1 | - | 0.98 / 18.1 | 87.6% | +1.6 |
| 3 | 87.2% | 100.0% | 75.2% | 35 / 35 | - | - | 4 | - | 0.97 / 18.9 | 89.6% | -2.4 |
| 4 | 83.3% | 97.1% | 70.8% | 34 / 35 | - | - | 2 | - | 0.93 / 18.5 | 86.8% | -3.6 |
| 5 | 87.8% | 100.0% | 76.4% | 35 / 35 | - | - | 1 | - | 0.93 / 18.2 | 78.5% | +9.4 |
| 6 | 82.5% | 97.1% | 70.1% | 34 / 35 | - | - | 2 | - | 0.94 / 19.5 | 88.2% | -5.7 |
| 7 | 86.0% | 100.0% | 74.2% | 35 / 35 | - | - | 3 | - | 0.98 / 19.6 | 78.9% | +7.2 |
| 8 | 80.7% | 94.3% | 68.2% | 33 / 35 | - | - | 4 | - | 1.01 / 19.5 | 81.5% | -0.7 |

Mean score share 84.8% ± 2.6, baseline 84.2% ± 3.7, paired diff +0.6 ± 4.4.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 18 over 8 battles (2.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jmcd.BeoWulf 2.8 | weak | 84.8% ± 2.6 | 97.9% ± 2.1 | 73.1% ± 3.1 | 274 / 280 | - | - | 18 | - | 1.01 / 19.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| jmcd.BeoWulf 2.8 | 8 | 801 | 4.7% | 93.0% | 0.0% | 2.3% | 663 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jmcd.BeoWulf 2.8 | 8 | 8 | n/a | 0 | 0.06 | 0 | 0 | 0 |

8 of 8 battles trusted.
