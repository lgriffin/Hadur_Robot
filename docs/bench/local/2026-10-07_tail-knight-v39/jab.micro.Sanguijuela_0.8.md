# jab.micro.Sanguijuela 0.8 (weak) vs rsalesc.mega.Knight 0.6.28

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 78.2% | 100.0% | 69.7% | 35 / 35 | - | - | 1 | - | 0.83 / 13.8 | 64.3% | +13.9 |
| 2 | 79.2% | 100.0% | 70.1% | 35 / 35 | - | - | 1 | - | 0.80 / 8.0 | 65.7% | +13.4 |
| 3 | 74.2% | 97.1% | 66.7% | 34 / 35 | - | - | 1 | - | 0.93 / 8.7 | 69.6% | +4.6 |
| 4 | 79.3% | 100.0% | 70.7% | 35 / 35 | - | - | 1 | - | 0.89 / 14.4 | 71.2% | +8.1 |
| 5 | 73.4% | 97.1% | 65.4% | 34 / 35 | - | - | 0 | - | 0.92 / 9.8 | 69.6% | +3.8 |
| 6 | 78.1% | 97.1% | 71.3% | 34 / 35 | - | - | 2 | - | 0.86 / 13.3 | 74.7% | +3.4 |
| 7 | 77.2% | 97.1% | 70.5% | 34 / 35 | - | - | 2 | - | 0.79 / 8.3 | 73.2% | +4.0 |
| 8 | 76.3% | 97.1% | 69.4% | 34 / 35 | - | - | 2 | - | 0.84 / 8.1 | 71.6% | +4.8 |

Mean score share 77.0% ± 1.9, baseline 70.0% ± 3.0, paired diff +7.0 ± 3.7.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 10 over 8 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jab.micro.Sanguijuela 0.8 | weak | 77.0% ± 1.9 | 98.2% ± 1.2 | 69.2% ± 1.7 | 275 / 280 | - | - | 10 | - | 0.93 / 14.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| jab.micro.Sanguijuela 0.8 | 8 | 1851 | 1.7% | 82.2% | 14.9% | 1.3% | 297 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jab.micro.Sanguijuela 0.8 | 8 | 8 | n/a | 0 | 0.04 | 0 | 0 | 0 |

8 of 8 battles trusted.
