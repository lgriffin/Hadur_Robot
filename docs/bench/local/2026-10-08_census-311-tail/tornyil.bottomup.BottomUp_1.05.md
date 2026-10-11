# tornyil.bottomup.BottomUp 1.05 (rank392-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 84.6% | 100.0% | 70.2% | 35 / 35 | - | - | 25 | - | 1.02 / 649.4 | 74.9% | +9.7 |
| 2 | 83.1% | 97.1% | 68.3% | 34 / 35 | - | - | 18 | - | 1.06 / 42.4 | 74.4% | +8.7 |
| 3 | 82.3% | 94.3% | 71.0% | 33 / 35 | - | - | 21 | - | 1.00 / 761.9 | 77.8% | +4.5 |
| 4 | 75.1% | 88.6% | 61.8% | 31 / 35 | - | - | 37 | - | 1.07 / 46.5 | 78.2% | -3.1 |

Mean score share 81.3% ± 6.7, baseline 76.3% ± 3.1, paired diff +5.0 ± 9.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 101 over 4 battles (25.3 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| tornyil.bottomup.BottomUp 1.05 | rank392-band4 | 81.3% ± 6.7 | 95.0% ± 7.8 | 67.8% ± 6.7 | 133 / 140 | - | - | 101 | - | 1.07 / 761.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| tornyil.bottomup.BottomUp 1.05 | 4 | 919 | 9.5% | 86.4% | 0.0% | 4.0% | 725 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| tornyil.bottomup.BottomUp 1.05 | 4 | 4 | n/a | 0 | 0.72 | 0 | 0 | 0 |

4 of 4 battles trusted.
