# theo.simple.Lucid 1.0 (rank175-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 77.8% | 91.4% | 63.4% | 32 / 35 | - | - | 22 | - | 1.08 / 810.7 | 70.7% | +7.1 |
| 2 | 59.3% | 68.6% | 51.4% | 24 / 35 | - | - | 31 | - | 1.11 / 110.2 | 63.9% | -4.6 |
| 3 | 65.9% | 80.0% | 52.6% | 28 / 35 | - | - | 26 | - | 1.09 / 814.6 | 69.8% | -3.8 |
| 4 | 72.0% | 88.6% | 55.9% | 31 / 35 | - | - | 12 | - | 1.04 / 148.1 | 72.9% | -0.9 |

Mean score share 68.8% ± 12.7, baseline 69.3% ± 6.1, paired diff -0.6 ± 8.6.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 91 over 4 battles (22.8 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| theo.simple.Lucid 1.0 | rank175-band3 | 68.8% ± 12.7 | 82.1% ± 16.3 | 55.8% ± 8.6 | 115 / 140 | - | - | 91 | - | 1.11 / 814.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| theo.simple.Lucid 1.0 | 4 | 1517 | 20.6% | 70.6% | 0.0% | 8.8% | 820 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| theo.simple.Lucid 1.0 | 4 | 4 | n/a | 0 | 0.65 | 0 | 0 | 0 |

4 of 4 battles trusted.
