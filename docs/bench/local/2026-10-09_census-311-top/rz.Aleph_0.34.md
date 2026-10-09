# rz.Aleph 0.34 (rank82-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 60.3% | 74.3% | 47.3% | 26 / 35 | - | - | 24 | - | 1.06 / 911.1 | 86.9% | -26.5 |
| 2 | 68.0% | 82.9% | 52.1% | 29 / 35 | - | - | 11 | - | 0.98 / 1011.3 | 91.5% | -23.5 |
| 3 | 69.1% | 85.7% | 52.1% | 30 / 35 | - | - | 19 | - | 1.04 / 1261.6 | 81.1% | -12.0 |
| 4 | 67.7% | 82.9% | 52.8% | 29 / 35 | - | - | 30 | - | 1.07 / 1064.1 | 77.6% | -9.9 |

Mean score share 66.3% ± 6.4, baseline 84.3% ± 9.8, paired diff -18.0 ± 13.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 84 over 4 battles (21.0 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| rz.Aleph 0.34 | rank82-band3 | 66.3% ± 6.4 | 81.4% ± 7.9 | 51.1% ± 4.1 | 114 / 140 | - | - | 84 | - | 1.07 / 1261.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| rz.Aleph 0.34 | 4 | 1566 | 20.8% | 70.2% | 0.0% | 9.1% | 814 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| rz.Aleph 0.34 | 4 | 4 | n/a | 0 | 0.60 | 0 | 0 | 0 |

4 of 4 battles trusted.
