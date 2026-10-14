# EFD.AdvancedEFD 0.4.5a (rank94-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 61.1% | 68.6% | 55.8% | 24 / 35 | - | - | 23 | - | 1.04 / 585.7 | 66.4% | -5.3 |
| 2 | 64.2% | 74.3% | 56.7% | 26 / 35 | - | - | 21 | - | 1.12 / 47.7 | 69.7% | -5.6 |
| 3 | 65.7% | 77.1% | 57.1% | 27 / 35 | - | - | 10 | - | 1.03 / 697.8 | 68.3% | -2.6 |
| 4 | 60.8% | 65.7% | 56.7% | 23 / 35 | - | - | 22 | - | 1.13 / 49.3 | 63.9% | -3.2 |

Mean score share 62.9% ± 3.8, baseline 67.1% ± 4.0, paired diff -4.2 ± 2.4.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 76 over 4 battles (19.0 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| EFD.AdvancedEFD 0.4.5a | rank94-band3 | 62.9% ± 3.8 | 71.4% ± 8.3 | 56.6% ± 0.8 | 100 / 140 | - | - | 76 | - | 1.13 / 697.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| EFD.AdvancedEFD 0.4.5a | 4 | 2144 | 23.3% | 65.8% | 0.0% | 10.9% | 854 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| EFD.AdvancedEFD 0.4.5a | 4 | 4 | n/a | 0 | 0.54 | 0 | 0 | 0 |

4 of 4 battles trusted.
