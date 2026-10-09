# ak.Fermat 2.0 (rank218-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 84.8% | 100.0% | 68.7% | 35 / 35 | - | - | 13 | - | 1.23 / 945.9 | 81.8% | +2.9 |
| 2 | 82.4% | 91.4% | 72.6% | 32 / 35 | - | - | 1 | - | 1.22 / 600.0 | 76.8% | +5.6 |
| 3 | 86.8% | 100.0% | 71.9% | 35 / 35 | - | - | 4 | - | 1.16 / 811.9 | 74.5% | +12.3 |
| 4 | 83.1% | 94.3% | 70.6% | 33 / 35 | - | - | 3 | - | 1.19 / 1242.9 | 82.1% | +0.9 |

Mean score share 84.3% ± 3.1, baseline 78.8% ± 6.0, paired diff +5.4 ± 7.9.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 21 over 4 battles (5.3 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ak.Fermat 2.0 | rank218-band4 | 84.3% ± 3.1 | 96.4% ± 6.8 | 70.9% ± 2.7 | 135 / 140 | - | - | 21 | - | 1.23 / 1242.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ak.Fermat 2.0 | 4 | 727 | 8.6% | 87.8% | 0.0% | 3.6% | 647 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ak.Fermat 2.0 | 4 | 4 | n/a | 0 | 0.15 | 0 | 0 | 0 |

4 of 4 battles trusted.
