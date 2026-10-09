# kurios.DOSexe .9a (rank759-band6) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 88.2% | 100.0% | 81.3% | 35 / 35 | - | - | 0 | - | 0.50 / 36.3 | 87.2% | +1.0 |
| 2 | 83.9% | 100.0% | 76.6% | 35 / 35 | - | - | 0 | - | 0.52 / 170.8 | 91.6% | -7.7 |
| 3 | 84.3% | 100.0% | 76.4% | 35 / 35 | - | - | 2 | - | 0.61 / 452.4 | 85.8% | -1.5 |
| 4 | 86.7% | 100.0% | 79.3% | 35 / 35 | - | - | 1 | - | 0.58 / 68.6 | 91.3% | -4.6 |

Mean score share 85.8% ± 3.2, baseline 89.0% ± 4.7, paired diff -3.2 ± 6.0.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 3 over 4 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kurios.DOSexe .9a | rank759-band6 | 85.8% ± 3.2 | 100.0% ± 0.0 | 78.4% ± 3.7 | 140 / 140 | - | - | 3 | - | 0.61 / 452.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| kurios.DOSexe .9a | 4 | 978 | 0.0% | 88.7% | 11.3% | 0.0% | 300 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kurios.DOSexe .9a | 4 | 4 | n/a | 0 | 0.02 | 0 | 0 | 0 |

4 of 4 battles trusted.
