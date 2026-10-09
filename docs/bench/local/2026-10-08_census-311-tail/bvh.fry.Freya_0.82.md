# bvh.fry.Freya 0.82 (rank234-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 85.6% | 100.0% | 70.0% | 35 / 35 | - | - | 18 | - | 1.12 / 467.6 | 78.5% | +7.2 |
| 2 | 84.2% | 97.1% | 70.8% | 34 / 35 | - | - | 10 | - | 1.08 / 213.7 | 78.0% | +6.3 |
| 3 | 81.6% | 94.3% | 68.2% | 33 / 35 | - | - | 11 | - | 1.07 / 541.3 | 86.8% | -5.2 |
| 4 | 86.5% | 100.0% | 72.3% | 35 / 35 | - | - | 10 | - | 1.03 / 635.3 | 72.0% | +14.5 |

Mean score share 84.5% ± 3.4, baseline 78.8% ± 9.7, paired diff +5.7 ± 12.9.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 49 over 4 battles (12.3 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| bvh.fry.Freya 0.82 | rank234-band4 | 84.5% ± 3.4 | 97.9% ± 4.4 | 70.3% ± 2.7 | 137 / 140 | - | - | 49 | - | 1.12 / 635.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| bvh.fry.Freya 0.82 | 4 | 738 | 5.1% | 92.9% | 0.0% | 2.0% | 682 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| bvh.fry.Freya 0.82 | 4 | 4 | n/a | 0 | 0.35 | 0 | 0 | 0 |

4 of 4 battles trusted.
