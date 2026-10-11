# dft.Cyanide 1.90 (rank55-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 59.7% | 74.3% | 45.2% | 26 / 35 | - | - | 15 | - | 1.05 / 603.2 | 95.4% | -35.8 |
| 2 | 57.4% | 71.4% | 44.4% | 25 / 35 | - | - | 24 | - | 1.01 / 1005.3 | 92.3% | -34.9 |
| 3 | 66.1% | 80.0% | 52.2% | 28 / 35 | - | - | 7 | - | 0.88 / 440.7 | 90.4% | -24.3 |
| 4 | 71.4% | 88.6% | 53.5% | 31 / 35 | - | - | 23 | - | 1.07 / 198.2 | 92.0% | -20.5 |

Mean score share 63.6% ± 10.1, baseline 92.5% ± 3.4, paired diff -28.9 ± 12.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 69 over 4 battles (17.3 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dft.Cyanide 1.90 | rank55-band3 | 63.6% ± 10.1 | 78.6% ± 12.0 | 48.9% ± 7.5 | 110 / 140 | - | - | 69 | - | 1.07 / 1005.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| dft.Cyanide 1.90 | 4 | 1677 | 22.4% | 68.2% | 0.0% | 9.5% | 841 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dft.Cyanide 1.90 | 4 | 4 | n/a | 0 | 0.49 | 0 | 0 | 0 |

4 of 4 battles trusted.
