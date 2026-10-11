# ph.micro.Pikeman 0.4.5 (mid-shield) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 100.0% | 100.0% | 50.0% | 35 / 35 | - | - | 0 | - | 0.17 / 8.8 | 78.5% | +21.5 |
| 2 | 100.0% | 100.0% | 50.0% | 35 / 35 | - | - | 0 | - | 0.16 / 7.9 | 76.6% | +23.4 |
| 3 | 99.1% | 100.0% | 5.0% | 35 / 35 | - | - | 0 | - | 0.17 / 8.4 | 76.8% | +22.3 |
| 4 | 100.0% | 100.0% | 50.0% | 35 / 35 | - | - | 0 | - | 0.16 / 8.0 | 70.5% | +29.5 |
| 5 | 91.8% | 97.1% | 3.8% | 34 / 35 | - | - | 0 | - | 0.16 / 7.2 | 68.6% | +23.2 |
| 6 | 98.2% | 100.0% | 38.7% | 35 / 35 | - | - | 0 | - | 0.11 / 6.9 | 75.9% | +22.3 |
| 7 | 100.0% | 100.0% | 50.0% | 35 / 35 | - | - | 0 | - | 0.15 / 7.1 | 79.3% | +20.7 |
| 8 | 100.0% | 100.0% | 50.0% | 35 / 35 | - | - | 0 | - | 0.15 / 7.5 | 66.2% | +33.8 |

Mean score share 98.6% ± 2.4, baseline 74.1% ± 4.1, paired diff +24.6 ± 3.8.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ph.micro.Pikeman 0.4.5 | mid-shield | 98.6% ± 2.4 | 99.6% ± 0.8 | 37.2% ± 17.2 | 279 / 280 | - | - | 0 | - | 0.17 / 8.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ph.micro.Pikeman 0.4.5 | 8 | 30 | 20.9% | 66.5% | 0.0% | 12.6% | 946 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ph.micro.Pikeman 0.4.5 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |

8 of 8 battles trusted.
