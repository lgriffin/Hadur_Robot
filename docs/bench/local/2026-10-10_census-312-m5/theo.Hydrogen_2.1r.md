# theo.Hydrogen 2.1r (rank189-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 76.4% | 88.6% | 62.3% | 31 / 35 | - | - | 23 | - | 1.06 / 5750.0 | 73.7% | +2.7 |
| 2 | 80.7% | 94.3% | 65.0% | 33 / 35 | - | - | 15 | - | 1.04 / 4750.5 | 83.0% | -2.3 |
| 3 | 77.7% | 91.4% | 60.8% | 32 / 35 | - | - | 21 | - | 1.02 / 5832.9 | 78.0% | -0.3 |
| 4 | 80.0% | 94.3% | 62.2% | 33 / 35 | - | - | 11 | - | 1.58 / 1383.7 | 75.9% | +4.1 |

Mean score share 78.7% ± 3.2, baseline 77.6% ± 6.4, paired diff +1.0 ± 4.6.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 70 over 4 battles (17.5 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| theo.Hydrogen 2.1r | rank189-band3 | 78.7% ± 3.2 | 92.1% ± 4.4 | 62.6% ± 2.8 | 129 / 140 | - | - | 70 | - | 1.58 / 5832.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| theo.Hydrogen 2.1r | 4 | 921 | 14.9% | 79.2% | 0.0% | 5.9% | 767 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| theo.Hydrogen 2.1r | 4 | 4 | n/a | 0 | 0.50 | 0 | 0 | 0 |

4 of 4 battles trusted.
