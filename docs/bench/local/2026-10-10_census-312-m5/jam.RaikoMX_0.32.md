# jam.RaikoMX 0.32 (rank57-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 69.1% | 82.9% | 54.1% | 29 / 35 | - | - | 27 | - | 1.02 / 1628.5 | 77.6% | -8.5 |
| 2 | 66.7% | 80.0% | 53.6% | 28 / 35 | - | - | 25 | - | 1.08 / 590.8 | 65.6% | +1.1 |
| 3 | 67.0% | 80.0% | 53.8% | 28 / 35 | - | - | 34 | - | 1.06 / 198.3 | 60.7% | +6.3 |
| 4 | 69.9% | 85.7% | 51.7% | 30 / 35 | - | - | 13 | - | 0.99 / 548.1 | 72.2% | -2.3 |

Mean score share 68.2% ± 2.5, baseline 69.0% ± 11.8, paired diff -0.9 ± 9.9.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 99 over 4 battles (24.8 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jam.RaikoMX 0.32 | rank57-band3 | 68.2% ± 2.5 | 82.1% ± 4.4 | 53.3% ± 1.8 | 115 / 140 | - | - | 99 | - | 1.08 / 1628.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| jam.RaikoMX 0.32 | 4 | 1426 | 21.9% | 68.8% | 0.0% | 9.3% | 815 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jam.RaikoMX 0.32 | 4 | 4 | n/a | 0 | 0.71 | 0 | 0 | 0 |

4 of 4 battles trusted.
