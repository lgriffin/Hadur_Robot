# aaa.r.ScalarR 0.005h.053-noshield (rank5-band1) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 28.6% | 14.3% | 43.6% | 5 / 35 | - | - | 364 | - | 2.06 / 974.9 | 29.7% | -1.1 |
| 2 | 44.0% | 31.4% | 55.4% | 11 / 35 | - | - | 245 | - | 1.91 / 889.3 | 33.1% | +10.9 |
| 3 | 32.3% | 17.1% | 47.3% | 6 / 35 | - | - | 367 | - | 2.02 / 1065.7 | 25.3% | +7.0 |
| 4 | 27.8% | 11.4% | 44.7% | 4 / 35 | - | - | 433 | - | 2.09 / 1001.5 | 29.8% | -2.0 |

Mean score share 33.2% ± 11.9, baseline 29.5% ± 5.1, paired diff +3.7 ± 10.0.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 1409 over 4 battles (352.3 per battle, most in one battle 433). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | rank5-band1 | 33.2% ± 11.9 | 18.6% ± 14.1 | 47.8% ± 8.5 | 26 / 140 | - | - | 1409 | - | 2.09 / 1065.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | 4 | 3108 | 45.9% | 38.1% | 0.0% | 16.0% | 2029 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | 4 | 0 | n/a | 0 | 10.06 | 0 | 0 | 0 |

0 of 4 battles trusted.
