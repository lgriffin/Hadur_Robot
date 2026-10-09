# josago.Jorgito 0.16 (rank640-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 92.9% | 100.0% | 86.5% | 35 / 35 | - | - | 5 | - | 0.96 / 830.3 | 85.7% | +7.2 |
| 2 | 90.4% | 97.1% | 84.3% | 34 / 35 | - | - | 17 | - | 0.96 / 246.1 | 86.6% | +3.8 |
| 3 | 88.7% | 97.1% | 81.8% | 34 / 35 | - | - | 20 | - | 0.92 / 3203.2 | 88.4% | +0.3 |
| 4 | 90.8% | 100.0% | 83.3% | 35 / 35 | - | - | 19 | - | 1.01 / 235.2 | 91.2% | -0.5 |

Mean score share 90.7% ± 2.7, baseline 88.0% ± 3.9, paired diff +2.7 ± 5.6.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 61 over 4 battles (15.3 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| josago.Jorgito 0.16 | rank640-band5 | 90.7% ± 2.7 | 98.6% ± 2.6 | 84.0% ± 3.2 | 138 / 140 | - | - | 61 | - | 1.01 / 3203.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| josago.Jorgito 0.16 | 4 | 527 | 4.7% | 92.6% | 0.5% | 2.1% | 637 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| josago.Jorgito 0.16 | 4 | 4 | n/a | 0 | 0.44 | 0 | 0 | 0 |

4 of 4 battles trusted.
