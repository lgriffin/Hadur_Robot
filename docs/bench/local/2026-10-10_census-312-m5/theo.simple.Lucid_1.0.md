# theo.simple.Lucid 1.0 (rank175-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 71.5% | 88.6% | 55.0% | 31 / 35 | - | - | 26 | - | 1.11 / 3459.0 | 82.7% | -11.2 |
| 2 | 71.7% | 85.7% | 58.2% | 30 / 35 | - | - | 20 | - | 1.05 / 46.7 | 76.2% | -4.5 |
| 3 | 66.6% | 80.0% | 54.1% | 28 / 35 | - | - | 26 | - | 1.07 / 3330.0 | 70.0% | -3.4 |
| 4 | 72.0% | 82.9% | 60.7% | 29 / 35 | - | - | 9 | - | 0.95 / 117.9 | 76.1% | -4.1 |

Mean score share 70.5% ± 4.1, baseline 76.2% ± 8.3, paired diff -5.8 ± 5.7.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 81 over 4 battles (20.3 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| theo.simple.Lucid 1.0 | rank175-band3 | 70.5% ± 4.1 | 84.3% ± 5.9 | 57.0% ± 4.8 | 118 / 140 | - | - | 81 | - | 1.11 / 3459.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| theo.simple.Lucid 1.0 | 4 | 1435 | 19.2% | 72.8% | 0.0% | 8.1% | 808 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| theo.simple.Lucid 1.0 | 4 | 4 | n/a | 0 | 0.58 | 0 | 0 | 0 |

4 of 4 battles trusted.
