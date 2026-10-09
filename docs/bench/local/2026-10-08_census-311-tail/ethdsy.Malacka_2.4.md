# ethdsy.Malacka 2.4 (rank649-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 94.0% | 100.0% | 88.8% | 35 / 35 | - | - | 1 | - | 0.74 / 114.8 | 92.4% | +1.6 |
| 2 | 91.3% | 100.0% | 84.3% | 35 / 35 | - | - | 3 | - | 0.69 / 207.7 | 89.8% | +1.4 |
| 3 | 93.0% | 100.0% | 87.4% | 35 / 35 | - | - | 0 | - | 0.76 / 79.6 | 92.5% | +0.5 |
| 4 | 95.9% | 100.0% | 92.4% | 35 / 35 | - | - | 2 | - | 0.73 / 354.1 | 90.9% | +5.0 |

Mean score share 93.6% ± 3.1, baseline 91.4% ± 2.1, paired diff +2.1 ± 3.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 6 over 4 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ethdsy.Malacka 2.4 | rank649-band5 | 93.6% ± 3.1 | 100.0% ± 0.0 | 88.2% ± 5.3 | 140 / 140 | - | - | 6 | - | 0.76 / 354.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ethdsy.Malacka 2.4 | 4 | 369 | 0.0% | 98.4% | 1.6% | 0.0% | 384 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ethdsy.Malacka 2.4 | 4 | 4 | n/a | 0 | 0.04 | 0 | 0 | 0 |

4 of 4 battles trusted.
