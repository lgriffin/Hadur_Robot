# suh.micro.WallPM 1.00 (weak) vs rsalesc.mega.Knight 0.6.28

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 81.8% | 97.1% | 68.8% | 34 / 35 | - | - | 3 | - | 1.11 / 20.7 | 80.2% | +1.6 |
| 2 | 83.6% | 97.1% | 72.1% | 34 / 35 | - | - | 5 | - | 1.08 / 19.3 | 76.1% | +7.5 |
| 3 | 85.8% | 100.0% | 73.4% | 35 / 35 | - | - | 2 | - | 1.06 / 64.5 | 78.7% | +7.1 |
| 4 | 83.6% | 97.1% | 72.0% | 34 / 35 | - | - | 6 | - | 1.10 / 20.3 | 75.4% | +8.1 |
| 5 | 84.4% | 97.1% | 73.4% | 34 / 35 | - | - | 3 | - | 1.07 / 18.6 | 87.2% | -2.8 |
| 6 | 85.1% | 97.1% | 74.3% | 34 / 35 | - | - | 4 | - | 1.10 / 20.5 | 85.0% | +0.1 |
| 7 | 80.2% | 94.3% | 68.4% | 33 / 35 | - | - | 5 | - | 1.09 / 21.2 | 86.7% | -6.5 |
| 8 | 82.7% | 94.3% | 72.4% | 33 / 35 | - | - | 6 | - | 1.09 / 20.4 | 81.2% | +1.5 |

Mean score share 83.4% ± 1.5, baseline 81.3% ± 3.8, paired diff +2.1 ± 4.4.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 34 over 8 battles (4.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| suh.micro.WallPM 1.00 | weak | 83.4% ± 1.5 | 96.8% ± 1.5 | 71.8% ± 1.8 | 271 / 280 | - | - | 34 | - | 1.11 / 64.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| suh.micro.WallPM 1.00 | 8 | 899 | 6.3% | 90.4% | 0.1% | 3.3% | 756 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| suh.micro.WallPM 1.00 | 8 | 8 | n/a | 0 | 0.12 | 0 | 0 | 0 |

8 of 8 battles trusted.
