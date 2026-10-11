# lucasslf.HariSeldon 0.2.1 (rank173-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 80.4% | 97.1% | 62.0% | 34 / 35 | - | - | 15 | - | 1.47 / 2446.6 | 95.3% | -14.9 |
| 2 | 77.7% | 94.3% | 61.0% | 33 / 35 | - | - | 10 | - | 1.49 / 1242.8 | 93.9% | -16.2 |
| 3 | 86.6% | 100.0% | 70.9% | 35 / 35 | - | - | 10 | - | 1.47 / 1364.8 | 98.8% | -12.2 |
| 4 | 79.7% | 91.4% | 67.2% | 32 / 35 | - | - | 3 | - | 1.33 / 36.6 | 97.4% | -17.7 |

Mean score share 81.1% ± 6.1, baseline 96.4% ± 3.5, paired diff -15.3 ± 3.7.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 38 over 4 battles (9.5 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| lucasslf.HariSeldon 0.2.1 | rank173-band3 | 81.1% ± 6.1 | 95.7% ± 5.9 | 65.3% ± 7.4 | 134 / 140 | - | - | 38 | - | 1.49 / 2446.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| lucasslf.HariSeldon 0.2.1 | 4 | 875 | 8.6% | 88.1% | 0.0% | 3.4% | 905 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| lucasslf.HariSeldon 0.2.1 | 4 | 4 | n/a | 0 | 0.27 | 0 | 0 | 0 |

4 of 4 battles trusted.
