# dmh.robocode.robot.GreenDragon 1.0 (weak) vs rsalesc.mega.Knight 0.6.28

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 91.7% | 100.0% | 81.2% | 35 / 35 | - | - | 6 | - | 1.01 / 16.2 | 94.2% | -2.6 |
| 2 | 90.5% | 100.0% | 79.9% | 35 / 35 | - | - | 6 | - | 1.05 / 15.7 | 88.3% | +2.2 |
| 3 | 94.6% | 100.0% | 87.9% | 35 / 35 | - | - | 0 | - | 0.97 / 15.2 | 87.8% | +6.8 |
| 4 | 91.5% | 100.0% | 81.7% | 35 / 35 | - | - | 4 | - | 1.02 / 16.0 | 88.6% | +2.9 |
| 5 | 92.7% | 100.0% | 84.1% | 35 / 35 | - | - | 3 | - | 1.06 / 14.4 | 88.5% | +4.2 |
| 6 | 92.5% | 100.0% | 83.3% | 35 / 35 | - | - | 0 | - | 1.00 / 17.2 | 90.7% | +1.8 |
| 7 | 92.8% | 100.0% | 84.2% | 35 / 35 | - | - | 1 | - | 1.00 / 18.3 | 90.2% | +2.6 |
| 8 | 93.5% | 100.0% | 85.9% | 35 / 35 | - | - | 2 | - | 1.01 / 14.7 | 92.2% | +1.3 |

Mean score share 92.5% ± 1.1, baseline 90.1% ± 1.9, paired diff +2.4 ± 2.2.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 22 over 8 battles (2.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.GreenDragon 1.0 | weak | 92.5% ± 1.1 | 100.0% ± 0.0 | 83.5% ± 2.2 | 280 / 280 | - | - | 22 | - | 1.06 / 18.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.GreenDragon 1.0 | 8 | 338 | 0.0% | 100.0% | 0.0% | 0.0% | 546 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.GreenDragon 1.0 | 8 | 8 | n/a | 0 | 0.08 | 0 | 0 | 0 |

8 of 8 battles trusted.
