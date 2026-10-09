# cx.Lacrimas 1.36 (rank118-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 72.5% | 85.7% | 58.5% | 30 / 35 | - | - | 11 | - | 1.03 / 40.4 | 69.9% | +2.7 |
| 2 | 75.5% | 91.4% | 56.6% | 32 / 35 | - | - | 13 | - | 1.00 / 237.0 | 67.7% | +7.8 |
| 3 | 70.4% | 80.0% | 59.3% | 28 / 35 | - | - | 19 | - | 1.03 / 38.5 | 68.2% | +2.2 |
| 4 | 81.0% | 94.3% | 65.8% | 33 / 35 | - | - | 12 | - | 0.97 / 63.8 | 62.2% | +18.8 |

Mean score share 74.9% ± 7.3, baseline 67.0% ± 5.3, paired diff +7.9 ± 12.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 55 over 4 battles (13.8 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cx.Lacrimas 1.36 | rank118-band3 | 74.9% ± 7.3 | 87.9% ± 10.1 | 60.1% ± 6.4 | 123 / 140 | - | - | 55 | - | 1.03 / 237.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| cx.Lacrimas 1.36 | 4 | 1101 | 19.3% | 72.8% | 0.0% | 7.9% | 738 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cx.Lacrimas 1.36 | 4 | 4 | n/a | 0 | 0.39 | 0 | 0 | 0 |

4 of 4 battles trusted.
