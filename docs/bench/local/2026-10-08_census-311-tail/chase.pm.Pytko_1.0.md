# chase.pm.Pytko 1.0 (rank224-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 63.8% | 77.1% | 51.5% | 27 / 35 | - | - | 14 | - | 1.11 / 1433.7 | 73.9% | -10.0 |
| 2 | 64.5% | 82.9% | 48.2% | 29 / 35 | - | - | 18 | - | 1.07 / 1235.0 | 75.7% | -11.2 |
| 3 | 72.0% | 88.6% | 56.4% | 31 / 35 | - | - | 16 | - | 1.13 / 1525.8 | 64.4% | +7.7 |
| 4 | 68.9% | 85.7% | 54.2% | 30 / 35 | - | - | 12 | - | 1.03 / 1336.4 | 74.0% | -5.0 |

Mean score share 67.3% ± 6.2, baseline 72.0% ± 8.2, paired diff -4.7 ± 13.8.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 60 over 4 battles (15.0 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| chase.pm.Pytko 1.0 | rank224-band4 | 67.3% ± 6.2 | 83.6% ± 7.8 | 52.6% ± 5.7 | 117 / 140 | - | - | 60 | - | 1.13 / 1525.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| chase.pm.Pytko 1.0 | 4 | 1613 | 17.8% | 74.2% | 0.0% | 7.9% | 785 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| chase.pm.Pytko 1.0 | 4 | 4 | n/a | 0 | 0.43 | 0 | 0 | 0 |

4 of 4 battles trusted.
