# kcn.unnamed.Unnamed 1.21 (rank209-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 79.6% | 94.3% | 61.6% | 33 / 35 | - | - | 16 | - | 1.03 / 3545.7 | 92.4% | -12.8 |
| 2 | 83.4% | 97.1% | 67.2% | 34 / 35 | - | - | 17 | - | 0.95 / 3679.2 | 92.2% | -8.8 |
| 3 | 83.0% | 100.0% | 63.0% | 35 / 35 | - | - | 20 | - | 1.03 / 3473.4 | 93.3% | -10.3 |
| 4 | 85.0% | 100.0% | 66.6% | 35 / 35 | - | - | 11 | - | 0.91 / 3683.6 | 87.7% | -2.7 |

Mean score share 82.7% ± 3.6, baseline 91.4% ± 4.0, paired diff -8.7 ± 6.9.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 64 over 4 battles (16.0 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kcn.unnamed.Unnamed 1.21 | rank209-band4 | 82.7% ± 3.6 | 97.9% ± 4.4 | 64.6% ± 4.3 | 137 / 140 | - | - | 64 | - | 1.03 / 3683.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| kcn.unnamed.Unnamed 1.21 | 4 | 747 | 5.0% | 92.7% | 0.0% | 2.3% | 753 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kcn.unnamed.Unnamed 1.21 | 4 | 4 | n/a | 0 | 0.46 | 0 | 0 | 0 |

4 of 4 battles trusted.
