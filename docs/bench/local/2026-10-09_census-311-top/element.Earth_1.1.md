# element.Earth 1.1 (rank168-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 81.3% | 88.6% | 73.9% | 31 / 35 | - | - | 16 | - | 1.03 / 46.1 | 80.6% | +0.7 |
| 2 | 81.7% | 88.6% | 74.3% | 31 / 35 | - | - | 19 | - | 1.04 / 121.8 | 77.0% | +4.8 |
| 3 | 77.8% | 88.6% | 67.7% | 31 / 35 | - | - | 24 | - | 1.06 / 112.9 | 70.8% | +7.0 |
| 4 | 82.8% | 97.1% | 68.5% | 34 / 35 | - | - | 26 | - | 1.07 / 122.1 | 69.2% | +13.5 |

Mean score share 80.9% ± 3.4, baseline 74.4% ± 8.4, paired diff +6.5 ± 8.5.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 85 over 4 battles (21.3 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| element.Earth 1.1 | rank168-band3 | 80.9% ± 3.4 | 90.7% ± 6.8 | 71.1% ± 5.5 | 127 / 140 | - | - | 85 | - | 1.07 / 122.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| element.Earth 1.1 | 4 | 956 | 17.0% | 76.3% | 0.0% | 6.7% | 663 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| element.Earth 1.1 | 4 | 4 | n/a | 0 | 0.61 | 0 | 0 | 0 |

4 of 4 battles trusted.
