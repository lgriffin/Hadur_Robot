# jam.RaikoMX 0.32 (rank57-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 65.7% | 80.0% | 51.4% | 28 / 35 | - | - | 31 | - | 1.08 / 365.4 | 72.7% | -7.0 |
| 2 | 70.7% | 82.9% | 57.6% | 29 / 35 | - | - | 24 | - | 1.09 / 393.0 | 73.6% | -2.8 |
| 3 | 68.6% | 85.7% | 50.9% | 30 / 35 | - | - | 21 | - | 1.04 / 899.6 | 64.8% | +3.8 |
| 4 | 69.5% | 88.6% | 49.1% | 31 / 35 | - | - | 24 | - | 1.10 / 318.3 | 68.4% | +1.1 |

Mean score share 68.6% ± 3.4, baseline 69.9% ± 6.5, paired diff -1.3 ± 7.5.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 100 over 4 battles (25.0 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jam.RaikoMX 0.32 | rank57-band3 | 68.6% ± 3.4 | 84.3% ± 5.9 | 52.3% ± 5.9 | 118 / 140 | - | - | 100 | - | 1.10 / 899.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| jam.RaikoMX 0.32 | 4 | 1408 | 19.5% | 72.1% | 0.0% | 8.4% | 821 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jam.RaikoMX 0.32 | 4 | 4 | n/a | 0 | 0.71 | 0 | 0 | 0 |

4 of 4 battles trusted.
