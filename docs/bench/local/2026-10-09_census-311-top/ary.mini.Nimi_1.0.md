# ary.mini.Nimi 1.0 (rank132-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 70.1% | 85.7% | 55.3% | 30 / 35 | - | - | 42 | - | 1.08 / 1623.2 | 92.0% | -21.9 |
| 2 | 73.4% | 82.9% | 64.2% | 29 / 35 | - | - | 32 | - | 1.05 / 1017.6 | 89.7% | -16.3 |
| 3 | 65.4% | 77.1% | 54.6% | 27 / 35 | - | - | 47 | - | 1.07 / 1766.0 | 94.1% | -28.7 |
| 4 | 73.5% | 85.7% | 61.3% | 30 / 35 | - | - | 25 | - | 1.10 / 108.4 | 95.3% | -21.8 |

Mean score share 70.6% ± 6.0, baseline 92.8% ± 3.9, paired diff -22.2 ± 8.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 146 over 4 battles (36.5 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ary.mini.Nimi 1.0 | rank132-band3 | 70.6% ± 6.0 | 82.9% ± 6.4 | 58.8% ± 7.5 | 116 / 140 | - | - | 146 | - | 1.10 / 1766.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ary.mini.Nimi 1.0 | 4 | 1432 | 20.9% | 70.0% | 0.0% | 9.1% | 845 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ary.mini.Nimi 1.0 | 4 | 4 | n/a | 0 | 1.04 | 0 | 0 | 0 |

4 of 4 battles trusted.
