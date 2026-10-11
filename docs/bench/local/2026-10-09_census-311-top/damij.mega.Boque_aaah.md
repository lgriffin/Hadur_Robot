# damij.mega.Boque aaah (rank60-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 64.5% | 74.3% | 55.5% | 26 / 35 | - | - | 22 | - | 1.27 / 1241.5 | 65.2% | -0.7 |
| 2 | 59.8% | 68.6% | 51.5% | 24 / 35 | - | - | 32 | - | 1.24 / 1033.6 | 70.3% | -10.5 |
| 3 | 62.7% | 68.6% | 56.7% | 24 / 35 | - | - | 17 | - | 1.23 / 1140.1 | 70.2% | -7.5 |
| 4 | 70.5% | 82.9% | 59.0% | 29 / 35 | - | - | 45 | - | 1.25 / 995.7 | 58.9% | +11.6 |

Mean score share 64.4% ± 7.2, baseline 66.2% ± 8.5, paired diff -1.8 ± 15.6.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 116 over 4 battles (29.0 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| damij.mega.Boque aaah | rank60-band3 | 64.4% ± 7.2 | 73.6% ± 10.7 | 55.7% ± 5.0 | 103 / 140 | - | - | 116 | - | 1.27 / 1241.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| damij.mega.Boque aaah | 4 | 1775 | 26.1% | 63.4% | 0.0% | 10.6% | 1007 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| damij.mega.Boque aaah | 4 | 4 | n/a | 0 | 0.83 | 0 | 0 | 0 |

4 of 4 battles trusted.
