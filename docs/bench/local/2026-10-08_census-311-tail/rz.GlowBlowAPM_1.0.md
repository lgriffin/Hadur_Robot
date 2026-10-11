# rz.GlowBlowAPM 1.0 (rank229-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 80.6% | 97.1% | 63.1% | 34 / 35 | - | - | 5 | - | 1.33 / 961.8 | 77.8% | +2.8 |
| 2 | 81.0% | 94.3% | 67.2% | 33 / 35 | - | - | 4 | - | 1.32 / 1094.0 | 77.4% | +3.5 |
| 3 | 81.7% | 94.3% | 68.4% | 33 / 35 | - | - | 5 | - | 1.21 / 637.8 | 83.0% | -1.3 |
| 4 | 84.5% | 100.0% | 67.8% | 35 / 35 | - | - | 4 | - | 1.35 / 1359.6 | 75.9% | +8.6 |

Mean score share 81.9% ± 2.8, baseline 78.5% ± 4.9, paired diff +3.4 ± 6.5.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 18 over 4 battles (4.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| rz.GlowBlowAPM 1.0 | rank229-band4 | 81.9% ± 2.8 | 96.4% ± 4.4 | 66.6% ± 3.8 | 135 / 140 | - | - | 18 | - | 1.35 / 1359.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| rz.GlowBlowAPM 1.0 | 4 | 839 | 7.5% | 88.9% | 0.0% | 3.6% | 569 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| rz.GlowBlowAPM 1.0 | 4 | 4 | n/a | 0 | 0.13 | 0 | 0 | 0 |

4 of 4 battles trusted.
