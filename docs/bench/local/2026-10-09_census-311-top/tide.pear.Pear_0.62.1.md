# tide.pear.Pear 0.62.1 (rank58-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 65.3% | 80.0% | 50.8% | 28 / 35 | - | - | 19 | - | 1.05 / 890.8 | 84.5% | -19.2 |
| 2 | 58.6% | 71.4% | 47.1% | 25 / 35 | - | - | 20 | - | 1.11 / 473.4 | 85.2% | -26.6 |
| 3 | 59.9% | 71.4% | 48.9% | 25 / 35 | - | - | 3 | - | 0.76 / 1013.5 | 85.5% | -25.6 |
| 4 | 61.5% | 74.3% | 49.8% | 26 / 35 | - | - | 14 | - | 1.05 / 979.0 | 81.5% | -20.0 |

Mean score share 61.3% ± 4.6, baseline 84.2% ± 2.9, paired diff -22.8 ± 6.0.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 56 over 4 battles (14.0 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| tide.pear.Pear 0.62.1 | rank58-band3 | 61.3% ± 4.6 | 74.3% ± 6.4 | 49.2% ± 2.5 | 104 / 140 | - | - | 56 | - | 1.11 / 1013.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| tide.pear.Pear 0.62.1 | 4 | 1868 | 24.1% | 65.6% | 0.0% | 10.3% | 838 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| tide.pear.Pear 0.62.1 | 4 | 4 | n/a | 0 | 0.40 | 0 | 0 | 0 |

4 of 4 battles trusted.
