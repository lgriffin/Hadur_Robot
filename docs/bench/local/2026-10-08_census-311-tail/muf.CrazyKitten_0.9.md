# muf.CrazyKitten 0.9 (rank400-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 83.9% | 94.3% | 73.5% | 33 / 35 | - | - | 11 | - | 0.96 / 1166.6 | 87.4% | -3.5 |
| 2 | 81.6% | 94.3% | 68.7% | 33 / 35 | - | - | 10 | - | 0.93 / 1886.3 | 83.2% | -1.5 |
| 3 | 81.2% | 91.4% | 70.9% | 32 / 35 | - | - | 18 | - | 1.01 / 1034.4 | 87.5% | -6.3 |
| 4 | 84.1% | 94.3% | 74.4% | 33 / 35 | - | - | 16 | - | 0.93 / 1654.2 | 79.9% | +4.2 |

Mean score share 82.7% ± 2.4, baseline 84.5% ± 5.8, paired diff -1.8 ± 7.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 55 over 4 battles (13.8 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| muf.CrazyKitten 0.9 | rank400-band4 | 82.7% ± 2.4 | 93.6% ± 2.3 | 71.9% ± 4.1 | 131 / 140 | - | - | 55 | - | 1.01 / 1886.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| muf.CrazyKitten 0.9 | 4 | 850 | 13.2% | 81.0% | 0.1% | 5.7% | 627 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| muf.CrazyKitten 0.9 | 4 | 4 | n/a | 0 | 0.39 | 0 | 0 | 0 |

4 of 4 battles trusted.
