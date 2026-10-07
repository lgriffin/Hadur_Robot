# ers.nano.lig.LigMA 1.9 (weak) vs rsalesc.mega.Knight 0.6.28

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 91.3% | 100.0% | 82.3% | 35 / 35 | - | - | 0 | - | 1.01 / 15.5 | 88.1% | +3.1 |
| 2 | 84.4% | 94.3% | 75.1% | 33 / 35 | - | - | 0 | - | 1.00 / 16.8 | 81.1% | +3.3 |
| 3 | 82.9% | 97.1% | 70.6% | 34 / 35 | - | - | 4 | - | 1.06 / 18.4 | 86.7% | -3.9 |
| 4 | 83.1% | 97.1% | 70.7% | 34 / 35 | - | - | 1 | - | 0.99 / 18.7 | 84.9% | -1.8 |
| 5 | 87.5% | 100.0% | 76.1% | 35 / 35 | - | - | 3 | - | 1.01 / 18.8 | 88.2% | -0.7 |
| 6 | 88.4% | 100.0% | 77.6% | 35 / 35 | - | - | 2 | - | 1.00 / 16.9 | 88.1% | +0.3 |
| 7 | 85.2% | 97.1% | 74.4% | 34 / 35 | - | - | 4 | - | 1.03 / 17.5 | 90.0% | -4.8 |
| 8 | 83.2% | 97.1% | 71.0% | 34 / 35 | - | - | 2 | - | 0.99 / 16.9 | 87.1% | -3.9 |

Mean score share 85.7% ± 2.5, baseline 86.8% ± 2.3, paired diff -1.0 ± 2.6.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 16 over 8 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | weak | 85.7% ± 2.5 | 97.9% ± 1.7 | 74.7% ± 3.4 | 274 / 280 | - | - | 16 | - | 1.06 / 18.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 8 | 753 | 5.0% | 92.7% | 0.0% | 2.3% | 552 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 8 | 8 | n/a | 0 | 0.06 | 0 | 0 | 0 |

8 of 8 battles trusted.
