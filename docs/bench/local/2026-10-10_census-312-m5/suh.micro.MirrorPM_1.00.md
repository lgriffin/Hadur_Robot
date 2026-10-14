# suh.micro.MirrorPM 1.00 (rank393-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 68.5% | 74.3% | 62.5% | 26 / 35 | - | - | 28 | - | 1.12 / 2920.5 | 99.9% | -31.4 |
| 2 | 71.5% | 77.1% | 65.6% | 27 / 35 | - | - | 45 | - | 1.18 / 2956.2 | 97.0% | -25.6 |
| 3 | 71.7% | 77.1% | 66.1% | 27 / 35 | - | - | 47 | - | 1.29 / 3627.8 | 93.7% | -22.1 |
| 4 | 71.4% | 80.0% | 63.1% | 28 / 35 | - | - | 26 | - | 1.14 / 3023.5 | 97.8% | -26.3 |

Mean score share 70.8% ± 2.4, baseline 97.1% ± 4.1, paired diff -26.3 ± 6.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 146 over 4 battles (36.5 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| suh.micro.MirrorPM 1.00 | rank393-band4 | 70.8% ± 2.4 | 77.1% ± 3.7 | 64.3% ± 2.9 | 108 / 140 | - | - | 146 | - | 1.29 / 3627.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| suh.micro.MirrorPM 1.00 | 4 | 1429 | 28.0% | 60.6% | 0.2% | 11.2% | 1178 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| suh.micro.MirrorPM 1.00 | 4 | 4 | n/a | 0 | 1.04 | 0 | 0 | 0 |

4 of 4 battles trusted.
