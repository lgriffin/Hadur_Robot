# sample.Crazy 1.0 (rank1187-band6) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 99.8% | 100.0% | 99.7% | 35 / 35 | - | - | 1 | - | 0.73 / 2155.8 | 99.5% | +0.3 |
| 2 | 99.8% | 100.0% | 99.6% | 35 / 35 | - | - | 2 | - | 0.76 / 149.4 | 98.8% | +1.0 |
| 3 | 96.5% | 94.3% | 97.7% | 33 / 35 | - | - | 699 | - | 1.12 / 406.8 | 98.8% | -2.3 |
| 4 | 99.3% | 100.0% | 98.6% | 35 / 35 | - | - | 2 | - | 0.74 / 282.6 | 99.2% | +0.1 |

Mean score share 98.8% ± 2.5, baseline 99.1% ± 0.5, paired diff -0.2 ± 2.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 704 over 4 battles (176.0 per battle, most in one battle 699). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sample.Crazy 1.0 | rank1187-band6 | 98.8% ± 2.5 | 98.6% ± 4.5 | 98.9% ± 1.5 | 138 / 140 | - | - | 704 | - | 1.12 / 2155.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| sample.Crazy 1.0 | 4 | 64 | 39.4% | 48.4% | 4.3% | 7.9% | 538 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sample.Crazy 1.0 | 4 | 3 | n/a | 1 | 5.03 | 0 | 0 | 0 |

3 of 4 battles trusted.
