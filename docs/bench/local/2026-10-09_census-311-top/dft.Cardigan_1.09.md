# dft.Cardigan 1.09 (rank51-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 61.7% | 71.4% | 52.8% | 25 / 35 | - | - | 25 | - | 1.15 / 1059.1 | 69.7% | -8.0 |
| 2 | 69.2% | 88.6% | 51.6% | 31 / 35 | - | - | 28 | - | 1.14 / 665.1 | 76.8% | -7.6 |
| 3 | 60.1% | 74.3% | 47.8% | 26 / 35 | - | - | 15 | - | 1.16 / 634.0 | 62.4% | -2.3 |
| 4 | 60.9% | 71.4% | 51.4% | 25 / 35 | - | - | 22 | - | 1.14 / 690.2 | 72.4% | -11.4 |

Mean score share 63.0% ± 6.7, baseline 70.3% ± 9.6, paired diff -7.3 ± 6.0.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 90 over 4 battles (22.5 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dft.Cardigan 1.09 | rank51-band3 | 63.0% ± 6.7 | 76.4% ± 13.1 | 50.9% ± 3.4 | 107 / 140 | - | - | 90 | - | 1.16 / 1059.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| dft.Cardigan 1.09 | 4 | 1866 | 22.1% | 68.1% | 0.0% | 9.8% | 902 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dft.Cardigan 1.09 | 4 | 4 | n/a | 0 | 0.64 | 0 | 0 | 0 |

4 of 4 battles trusted.
