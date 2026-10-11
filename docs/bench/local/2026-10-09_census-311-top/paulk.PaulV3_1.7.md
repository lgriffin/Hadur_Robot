# paulk.PaulV3 1.7 (rank170-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 71.3% | 85.7% | 57.9% | 30 / 35 | - | - | 36 | - | 1.16 / 45.7 | 77.8% | -6.5 |
| 2 | 75.5% | 88.6% | 62.9% | 31 / 35 | - | - | 14 | - | 1.07 / 654.5 | 62.6% | +12.9 |
| 3 | 83.6% | 97.1% | 70.5% | 34 / 35 | - | - | 29 | - | 1.11 / 42.2 | 75.3% | +8.3 |
| 4 | 73.0% | 85.7% | 62.0% | 30 / 35 | - | - | 19 | - | 1.08 / 540.5 | 74.3% | -1.3 |

Mean score share 75.8% ± 8.7, baseline 72.5% ± 10.8, paired diff +3.3 ± 14.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 98 over 4 battles (24.5 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| paulk.PaulV3 1.7 | rank170-band3 | 75.8% ± 8.7 | 89.3% ± 8.6 | 63.3% ± 8.4 | 125 / 140 | - | - | 98 | - | 1.16 / 654.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| paulk.PaulV3 1.7 | 4 | 1223 | 15.3% | 77.9% | 0.0% | 6.8% | 753 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| paulk.PaulV3 1.7 | 4 | 4 | n/a | 0 | 0.70 | 0 | 0 | 0 |

4 of 4 battles trusted.
