# ab.DengerousRoBatra 1.3 (rank155-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 85.3% | 94.3% | 75.2% | 33 / 35 | - | - | 6 | - | 0.75 / 701.5 | 83.2% | +2.1 |
| 2 | 87.1% | 97.1% | 76.9% | 34 / 35 | - | - | 6 | - | 0.84 / 213.5 | 78.5% | +8.6 |
| 3 | 84.3% | 97.1% | 71.6% | 34 / 35 | - | - | 11 | - | 0.91 / 1269.9 | 76.4% | +7.9 |
| 4 | 81.4% | 91.4% | 71.8% | 32 / 35 | - | - | 4 | - | 0.84 / 59.7 | 71.9% | +9.4 |

Mean score share 84.5% ± 3.8, baseline 77.5% ± 7.4, paired diff +7.0 ± 5.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 27 over 4 battles (6.8 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ab.DengerousRoBatra 1.3 | rank155-band3 | 84.5% ± 3.8 | 95.0% ± 4.4 | 73.9% ± 4.2 | 133 / 140 | - | - | 27 | - | 0.91 / 1269.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ab.DengerousRoBatra 1.3 | 4 | 764 | 11.4% | 83.8% | 0.0% | 4.7% | 610 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ab.DengerousRoBatra 1.3 | 4 | 4 | n/a | 0 | 0.19 | 0 | 0 | 0 |

4 of 4 battles trusted.
