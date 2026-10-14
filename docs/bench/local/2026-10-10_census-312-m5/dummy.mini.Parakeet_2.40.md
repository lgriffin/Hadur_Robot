# dummy.mini.Parakeet 2.40 (rank407-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 77.0% | 88.6% | 66.3% | 31 / 35 | - | - | 26 | - | 0.99 / 565.2 | 78.1% | -1.1 |
| 2 | 73.5% | 85.7% | 62.3% | 30 / 35 | - | - | 46 | - | 1.04 / 5526.7 | 77.2% | -3.7 |
| 3 | 85.3% | 97.1% | 73.0% | 34 / 35 | - | - | 13 | - | 0.91 / 250.5 | 74.7% | +10.6 |
| 4 | 81.6% | 91.4% | 71.3% | 32 / 35 | - | - | 35 | - | 1.01 / 5769.8 | 72.5% | +9.0 |

Mean score share 79.3% ± 8.2, baseline 75.6% ± 4.0, paired diff +3.7 ± 11.4.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 120 over 4 battles (30.0 per battle, most in one battle 46). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dummy.mini.Parakeet 2.40 | rank407-band5 | 79.3% ± 8.2 | 90.7% ± 7.8 | 68.2% ± 7.7 | 127 / 140 | - | - | 120 | - | 1.04 / 5769.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| dummy.mini.Parakeet 2.40 | 4 | 1033 | 15.7% | 77.8% | 0.0% | 6.5% | 878 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dummy.mini.Parakeet 2.40 | 4 | 4 | n/a | 0 | 0.86 | 0 | 0 | 0 |

4 of 4 battles trusted.
