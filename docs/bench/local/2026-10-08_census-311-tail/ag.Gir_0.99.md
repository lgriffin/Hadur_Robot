# ag.Gir 0.99 (rank1159-band6) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 99.8% | 100.0% | 99.7% | 35 / 35 | - | - | 3 | - | 3.03 / 358.1 | 99.7% | +0.2 |
| 2 | 99.1% | 100.0% | 98.2% | 35 / 35 | - | - | 5 | - | 2.50 / 316.7 | 99.7% | -0.7 |
| 3 | 99.8% | 100.0% | 99.5% | 35 / 35 | - | - | 4 | - | 3.09 / 59.8 | 100.0% | -0.2 |
| 4 | 99.9% | 100.0% | 99.9% | 35 / 35 | - | - | 8 | - | 1.57 / 48.9 | 99.8% | +0.1 |

Mean score share 99.6% ± 0.6, baseline 99.8% ± 0.2, paired diff -0.2 ± 0.6.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 20 over 4 battles (5.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ag.Gir 0.99 | rank1159-band6 | 99.6% ± 0.6 | 100.0% ± 0.0 | 99.3% ± 1.2 | 140 / 140 | - | - | 20 | - | 3.09 / 358.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ag.Gir 0.99 | 4 | 19 | 0.0% | 100.0% | 0.0% | 0.0% | 596 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ag.Gir 0.99 | 4 | 4 | n/a | 0 | 0.14 | 0 | 0 | 0 |

4 of 4 battles trusted.
