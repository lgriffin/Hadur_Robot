# serenity.nonSense 1.39 (rank442-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 91.1% | 100.0% | 81.2% | 35 / 35 | - | - | 9 | - | 0.98 / 865.0 | 78.7% | +12.3 |
| 2 | 88.8% | 100.0% | 77.2% | 35 / 35 | - | - | 17 | - | 1.03 / 1245.2 | 85.3% | +3.4 |
| 3 | 87.8% | 100.0% | 76.1% | 35 / 35 | - | - | 14 | - | 0.99 / 876.9 | 85.4% | +2.4 |
| 4 | 89.4% | 100.0% | 78.4% | 35 / 35 | - | - | 8 | - | 1.00 / 1113.2 | 86.7% | +2.7 |

Mean score share 89.3% ± 2.2, baseline 84.1% ± 5.7, paired diff +5.2 ± 7.6.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 48 over 4 battles (12.0 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| serenity.nonSense 1.39 | rank442-band5 | 89.3% ± 2.2 | 100.0% ± 0.0 | 78.2% ± 3.5 | 140 / 140 | - | - | 48 | - | 1.03 / 1245.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| serenity.nonSense 1.39 | 4 | 521 | 0.0% | 100.0% | 0.0% | 0.0% | 637 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| serenity.nonSense 1.39 | 4 | 4 | n/a | 0 | 0.34 | 0 | 0 | 0 |

4 of 4 battles trusted.
