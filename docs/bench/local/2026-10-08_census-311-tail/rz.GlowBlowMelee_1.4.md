# rz.GlowBlowMelee 1.4 (rank262-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 74.2% | 85.7% | 62.6% | 30 / 35 | - | - | 11 | - | 0.99 / 402.7 | 84.9% | -10.7 |
| 2 | 82.4% | 97.1% | 67.2% | 34 / 35 | - | - | 6 | - | 1.01 / 842.0 | 77.9% | +4.5 |
| 3 | 78.4% | 91.4% | 64.4% | 32 / 35 | - | - | 7 | - | 0.92 / 245.5 | 75.5% | +2.9 |
| 4 | 81.6% | 97.1% | 64.4% | 34 / 35 | - | - | 22 | - | 1.13 / 825.7 | 84.5% | -2.9 |

Mean score share 79.2% ± 5.9, baseline 80.7% ± 7.5, paired diff -1.5 ± 11.0.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 46 over 4 battles (11.5 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| rz.GlowBlowMelee 1.4 | rank262-band4 | 79.2% ± 5.9 | 92.9% ± 8.7 | 64.6% ± 3.0 | 130 / 140 | - | - | 46 | - | 1.13 / 842.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 4 | 971 | 12.9% | 81.5% | 0.0% | 5.6% | 704 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 4 | 4 | n/a | 0 | 0.33 | 0 | 0 | 0 |

4 of 4 battles trusted.
