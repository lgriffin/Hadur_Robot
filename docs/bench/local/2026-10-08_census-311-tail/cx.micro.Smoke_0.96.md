# cx.micro.Smoke 0.96 (rank233-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 76.0% | 91.4% | 58.6% | 32 / 35 | - | - | 13 | - | 1.17 / 958.8 | 80.3% | -4.3 |
| 2 | 78.9% | 94.3% | 61.9% | 33 / 35 | - | - | 8 | - | 1.22 / 78.0 | 73.7% | +5.2 |
| 3 | 75.5% | 91.4% | 58.6% | 32 / 35 | - | - | 12 | - | 1.24 / 1052.7 | 74.2% | +1.3 |
| 4 | 78.3% | 94.3% | 62.2% | 33 / 35 | - | - | 11 | - | 1.12 / 304.4 | 87.4% | -9.1 |

Mean score share 77.2% ± 2.7, baseline 78.9% ± 10.2, paired diff -1.7 ± 10.0.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 44 over 4 battles (11.0 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cx.micro.Smoke 0.96 | rank233-band4 | 77.2% ± 2.7 | 92.9% ± 2.6 | 60.3% ± 3.2 | 130 / 140 | - | - | 44 | - | 1.24 / 1052.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| cx.micro.Smoke 0.96 | 4 | 1038 | 12.0% | 82.5% | 0.0% | 5.4% | 609 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cx.micro.Smoke 0.96 | 4 | 4 | n/a | 0 | 0.31 | 0 | 0 | 0 |

4 of 4 battles trusted.
