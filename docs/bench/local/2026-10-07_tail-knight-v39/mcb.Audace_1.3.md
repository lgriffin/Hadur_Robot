# mcb.Audace 1.3 (weak) vs rsalesc.mega.Knight 0.6.28

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 100.0% | 100.0% | 100.0% | 35 / 35 | - | - | 0 | - | 1.06 / 12.6 | 95.2% | +4.7 |
| 2 | 98.4% | 100.0% | 96.9% | 35 / 35 | - | - | 0 | - | 1.14 / 11.6 | 96.0% | +2.5 |
| 3 | 95.8% | 100.0% | 91.8% | 35 / 35 | - | - | 3 | - | 1.08 / 15.7 | 91.3% | +4.5 |
| 4 | 94.7% | 100.0% | 89.8% | 35 / 35 | - | - | 1 | - | 1.26 / 15.8 | 94.5% | +0.2 |
| 5 | 93.2% | 100.0% | 87.1% | 35 / 35 | - | - | 1 | - | 1.15 / 153.7 | 96.0% | -2.8 |
| 6 | 92.9% | 100.0% | 86.6% | 35 / 35 | - | - | 2 | - | 1.14 / 12.5 | 93.8% | -0.9 |
| 7 | 91.4% | 97.1% | 86.3% | 34 / 35 | - | - | 1 | - | 1.21 / 15.9 | 94.6% | -3.2 |
| 8 | 97.3% | 100.0% | 94.6% | 35 / 35 | - | - | 0 | - | 1.11 / 13.4 | 87.4% | +9.9 |

Mean score share 95.5% ± 2.5, baseline 93.6% ± 2.5, paired diff +1.9 ± 3.7.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 8 over 8 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| mcb.Audace 1.3 | weak | 95.5% ± 2.5 | 99.6% ± 0.8 | 91.6% ± 4.3 | 279 / 280 | - | - | 8 | - | 1.26 / 153.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| mcb.Audace 1.3 | 8 | 247 | 2.5% | 96.0% | 0.1% | 1.4% | 342 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| mcb.Audace 1.3 | 8 | 8 | n/a | 0 | 0.03 | 0 | 0 | 0 |

8 of 8 battles trusted.
