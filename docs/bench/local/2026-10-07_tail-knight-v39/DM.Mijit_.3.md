# DM.Mijit .3 (weak) vs rsalesc.mega.Knight 0.6.28

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 90.3% | 100.0% | 79.2% | 35 / 35 | - | - | 1 | - | 0.91 / 15.9 | 90.6% | -0.3 |
| 2 | 90.1% | 100.0% | 78.7% | 35 / 35 | - | - | 4 | - | 0.97 / 15.5 | 85.5% | +4.6 |
| 3 | 89.1% | 100.0% | 77.4% | 35 / 35 | - | - | 0 | - | 0.95 / 15.2 | 91.7% | -2.6 |
| 4 | 89.6% | 100.0% | 78.7% | 35 / 35 | - | - | 2 | - | 0.97 / 15.2 | 90.9% | -1.4 |
| 5 | 87.9% | 100.0% | 75.0% | 35 / 35 | - | - | 5 | - | 1.01 / 17.2 | 85.6% | +2.3 |
| 6 | 90.2% | 100.0% | 79.8% | 35 / 35 | - | - | 3 | - | 1.00 / 17.1 | 91.5% | -1.3 |
| 7 | 92.5% | 100.0% | 83.0% | 35 / 35 | - | - | 3 | - | 0.92 / 15.0 | 90.3% | +2.2 |
| 8 | 89.8% | 100.0% | 77.8% | 35 / 35 | - | - | 0 | - | 0.99 / 14.9 | 91.2% | -1.5 |

Mean score share 89.9% ± 1.1, baseline 89.7% ± 2.2, paired diff +0.3 ± 2.1.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 18 over 8 battles (2.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| DM.Mijit .3 | weak | 89.9% ± 1.1 | 100.0% ± 0.0 | 78.7% ± 1.9 | 280 / 280 | - | - | 18 | - | 1.01 / 17.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| DM.Mijit .3 | 8 | 469 | 0.0% | 100.0% | 0.0% | 0.0% | 536 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| DM.Mijit .3 | 8 | 8 | n/a | 0 | 0.06 | 0 | 0 | 0 |

8 of 8 battles trusted.
