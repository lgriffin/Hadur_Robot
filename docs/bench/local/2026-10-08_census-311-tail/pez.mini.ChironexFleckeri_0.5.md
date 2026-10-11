# pez.mini.ChironexFleckeri 0.5 (rank259-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 82.7% | 91.4% | 74.0% | 32 / 35 | - | - | 7 | - | 1.01 / 26.2 | 84.2% | -1.6 |
| 2 | 75.5% | 88.6% | 63.7% | 31 / 35 | - | - | 7 | - | 0.98 / 30.0 | 81.9% | -6.4 |
| 3 | 84.4% | 97.1% | 71.5% | 34 / 35 | - | - | 10 | - | 1.04 / 34.0 | 83.2% | +1.2 |
| 4 | 82.8% | 97.1% | 68.5% | 34 / 35 | - | - | 21 | - | 0.89 / 1216.7 | 86.4% | -3.6 |

Mean score share 81.4% ± 6.3, baseline 83.9% ± 3.0, paired diff -2.6 ± 5.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 45 over 4 battles (11.3 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pez.mini.ChironexFleckeri 0.5 | rank259-band4 | 81.4% ± 6.3 | 93.6% ± 6.8 | 69.4% ± 7.0 | 131 / 140 | - | - | 45 | - | 1.04 / 1216.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| pez.mini.ChironexFleckeri 0.5 | 4 | 921 | 12.2% | 82.9% | 0.0% | 4.9% | 654 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pez.mini.ChironexFleckeri 0.5 | 4 | 4 | n/a | 0 | 0.32 | 0 | 0 | 0 |

4 of 4 battles trusted.
