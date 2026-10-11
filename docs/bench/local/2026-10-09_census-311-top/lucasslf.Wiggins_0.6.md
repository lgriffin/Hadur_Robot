# lucasslf.Wiggins 0.6 (rank99-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 76.1% | 94.3% | 56.8% | 33 / 35 | - | - | 29 | - | 1.16 / 1025.2 | 95.1% | -19.1 |
| 2 | 77.8% | 91.4% | 63.2% | 32 / 35 | - | - | 36 | - | 1.16 / 1579.6 | 95.1% | -17.3 |
| 3 | 66.7% | 77.1% | 56.1% | 27 / 35 | - | - | 27 | - | 1.11 / 1132.8 | 93.9% | -27.2 |
| 4 | 80.5% | 97.1% | 63.3% | 34 / 35 | - | - | 21 | - | 1.12 / 437.5 | 95.4% | -15.0 |

Mean score share 75.3% ± 9.6, baseline 94.9% ± 1.1, paired diff -19.6 ± 8.5.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 113 over 4 battles (28.3 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| lucasslf.Wiggins 0.6 | rank99-band3 | 75.3% ± 9.6 | 90.0% ± 14.1 | 59.8% ± 6.3 | 126 / 140 | - | - | 113 | - | 1.16 / 1579.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| lucasslf.Wiggins 0.6 | 4 | 1147 | 15.3% | 78.3% | 0.0% | 6.5% | 954 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| lucasslf.Wiggins 0.6 | 4 | 4 | n/a | 0 | 0.81 | 0 | 0 | 0 |

4 of 4 battles trusted.
