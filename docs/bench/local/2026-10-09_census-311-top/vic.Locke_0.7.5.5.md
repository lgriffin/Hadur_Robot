# vic.Locke 0.7.5.5 (rank153-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 64.1% | 77.1% | 51.3% | 27 / 35 | - | - | 22 | - | 1.15 / 1520.8 | 72.6% | -8.5 |
| 2 | 65.5% | 80.0% | 52.3% | 28 / 35 | - | - | 12 | - | 1.11 / 42.2 | 60.1% | +5.4 |
| 3 | 64.5% | 77.1% | 52.4% | 27 / 35 | - | - | 8 | - | 1.13 / 1409.3 | 71.2% | -6.7 |
| 4 | 61.6% | 71.4% | 52.5% | 25 / 35 | - | - | 10 | - | 1.12 / 4673.9 | 84.9% | -23.3 |

Mean score share 63.9% ± 2.6, baseline 72.2% ± 16.1, paired diff -8.3 ± 18.7.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 52 over 4 battles (13.0 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| vic.Locke 0.7.5.5 | rank153-band3 | 63.9% ± 2.6 | 76.4% ± 5.7 | 52.1% ± 0.9 | 107 / 140 | - | - | 52 | - | 1.15 / 4673.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| vic.Locke 0.7.5.5 | 4 | 1764 | 23.4% | 67.6% | 0.0% | 9.0% | 797 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| vic.Locke 0.7.5.5 | 4 | 4 | n/a | 0 | 0.37 | 0 | 0 | 0 |

4 of 4 battles trusted.
