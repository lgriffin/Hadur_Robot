# sam.ChipmunkDuelist 1.0 (rank661-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 95.0% | 100.0% | 89.7% | 35 / 35 | - | - | 0 | - | 0.86 / 441.0 | 93.6% | +1.3 |
| 2 | 94.1% | 100.0% | 88.0% | 35 / 35 | - | - | 2 | - | 0.78 / 735.9 | 93.5% | +0.6 |
| 3 | 93.1% | 100.0% | 86.1% | 35 / 35 | - | - | 6 | - | 0.85 / 221.0 | 93.1% | +0.1 |
| 4 | 93.9% | 100.0% | 87.6% | 35 / 35 | - | - | 2 | - | 0.87 / 634.8 | 92.2% | +1.8 |

Mean score share 94.0% ± 1.2, baseline 93.1% ± 1.1, paired diff +0.9 ± 1.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 10 over 4 battles (2.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sam.ChipmunkDuelist 1.0 | rank661-band5 | 94.0% ± 1.2 | 100.0% ± 0.0 | 87.8% ± 2.3 | 140 / 140 | - | - | 10 | - | 0.87 / 735.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| sam.ChipmunkDuelist 1.0 | 4 | 298 | 0.0% | 100.0% | 0.0% | 0.0% | 492 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sam.ChipmunkDuelist 1.0 | 4 | 4 | n/a | 0 | 0.07 | 0 | 0 | 0 |

4 of 4 battles trusted.
