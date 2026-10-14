# Noran.BitchingElk 0.054 (rank964-band6) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 93.9% | 94.3% | 92.7% | 33 / 35 | - | - | 247 | - | 1.18 / 6352.9 | 88.4% | +5.5 |
| 2 | 89.4% | 85.7% | 91.0% | 30 / 35 | - | - | 202 | - | 1.18 / 7806.2 | 88.4% | +1.0 |
| 3 | 94.5% | 94.3% | 93.8% | 33 / 35 | - | - | 102 | - | 1.09 / 6386.1 | 90.8% | +3.6 |
| 4 | 97.8% | 100.0% | 95.9% | 35 / 35 | - | - | 160 | - | 1.19 / 8050.7 | 87.2% | +10.6 |

Mean score share 93.9% ± 5.5, baseline 88.7% ± 2.4, paired diff +5.2 ± 6.4.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 711 over 4 battles (177.8 per battle, most in one battle 247). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| Noran.BitchingElk 0.054 | rank964-band6 | 93.9% ± 5.5 | 93.6% ± 9.4 | 93.3% ± 3.3 | 131 / 140 | - | - | 711 | - | 1.19 / 8050.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| Noran.BitchingElk 0.054 | 4 | 340 | 33.1% | 57.7% | 0.1% | 9.1% | 1316 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| Noran.BitchingElk 0.054 | 4 | 0 | n/a | 0 | 5.08 | 0 | 0 | 0 |

0 of 4 battles trusted.
