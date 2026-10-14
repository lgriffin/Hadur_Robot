# damij.mega.Boque aaah (rank60-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 59.7% | 68.6% | 51.1% | 24 / 35 | - | - | 82 | - | 1.40 / 643.2 | 72.4% | -12.7 |
| 2 | 60.8% | 68.6% | 53.6% | 24 / 35 | - | - | 44 | - | 1.35 / 1026.3 | 73.4% | -12.7 |
| 3 | 58.6% | 65.7% | 52.1% | 23 / 35 | - | - | 42 | - | 1.31 / 641.1 | 73.8% | -15.2 |
| 4 | 69.2% | 80.0% | 58.9% | 28 / 35 | - | - | 36 | - | 1.32 / 1101.0 | 66.6% | +2.6 |

Mean score share 62.1% ± 7.7, baseline 71.5% ± 5.4, paired diff -9.5 ± 13.0.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 204 over 4 battles (51.0 per battle, most in one battle 82). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| damij.mega.Boque aaah | rank60-band3 | 62.1% ± 7.7 | 70.7% ± 10.1 | 53.9% ± 5.5 | 99 / 140 | - | - | 204 | - | 1.40 / 1101.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| damij.mega.Boque aaah | 4 | 1873 | 27.4% | 61.5% | 0.0% | 11.1% | 1079 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| damij.mega.Boque aaah | 4 | 3 | n/a | 0 | 1.46 | 0 | 0 | 0 |

3 of 4 battles trusted.
