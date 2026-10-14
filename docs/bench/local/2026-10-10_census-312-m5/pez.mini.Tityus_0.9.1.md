# pez.mini.Tityus 0.9.1 (rank144-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 82.6% | 97.1% | 67.0% | 34 / 35 | - | - | 3 | - | 0.96 / 1174.6 | 69.3% | +13.2 |
| 2 | 74.0% | 88.6% | 57.9% | 31 / 35 | - | - | 19 | - | 1.03 / 458.0 | 76.7% | -2.6 |
| 3 | 71.3% | 85.7% | 57.0% | 30 / 35 | - | - | 20 | - | 1.02 / 1452.4 | 79.4% | -8.0 |
| 4 | 81.2% | 97.1% | 61.7% | 34 / 35 | - | - | 21 | - | 1.01 / 468.4 | 74.4% | +6.8 |

Mean score share 77.3% ± 8.7, baseline 74.9% ± 6.8, paired diff +2.4 ± 15.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 63 over 4 battles (15.8 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pez.mini.Tityus 0.9.1 | rank144-band3 | 77.3% ± 8.7 | 92.1% ± 9.4 | 60.9% ± 7.3 | 129 / 140 | - | - | 63 | - | 1.03 / 1452.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| pez.mini.Tityus 0.9.1 | 4 | 1027 | 13.4% | 81.0% | 0.0% | 5.6% | 753 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pez.mini.Tityus 0.9.1 | 4 | 4 | n/a | 0 | 0.45 | 0 | 0 | 0 |

4 of 4 battles trusted.
