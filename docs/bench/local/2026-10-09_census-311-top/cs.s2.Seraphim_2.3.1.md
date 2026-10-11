# cs.s2.Seraphim 2.3.1 (rank39-band2) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 59.7% | 74.3% | 45.9% | 26 / 35 | - | - | 17 | - | 1.11 / 275.3 | 69.4% | -9.8 |
| 2 | 64.8% | 80.0% | 51.2% | 28 / 35 | - | - | 9 | - | 1.09 / 1001.7 | 65.0% | -0.1 |
| 3 | 70.4% | 88.6% | 51.6% | 31 / 35 | - | - | 13 | - | 1.09 / 96.6 | 70.1% | +0.4 |
| 4 | 73.5% | 88.6% | 58.0% | 31 / 35 | - | - | 14 | - | 1.08 / 862.2 | 60.2% | +13.3 |

Mean score share 67.1% ± 9.7, baseline 66.2% ± 7.3, paired diff +0.9 ± 15.0.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 53 over 4 battles (13.3 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cs.s2.Seraphim 2.3.1 | rank39-band2 | 67.1% ± 9.7 | 82.9% ± 11.1 | 51.7% ± 7.9 | 116 / 140 | - | - | 53 | - | 1.11 / 1001.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| cs.s2.Seraphim 2.3.1 | 4 | 1552 | 19.3% | 72.4% | 0.0% | 8.3% | 836 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cs.s2.Seraphim 2.3.1 | 4 | 4 | n/a | 0 | 0.38 | 0 | 0 | 0 |

4 of 4 battles trusted.
