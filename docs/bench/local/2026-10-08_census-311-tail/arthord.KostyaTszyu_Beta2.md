# arthord.KostyaTszyu Beta2 (rank304-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 85.7% | 100.0% | 68.5% | 35 / 35 | - | - | 16 | - | 1.01 / 37.6 | 91.0% | -5.2 |
| 2 | 86.1% | 100.0% | 68.3% | 35 / 35 | - | - | 11 | - | 0.97 / 321.5 | 72.2% | +13.9 |
| 3 | 83.6% | 97.1% | 66.5% | 34 / 35 | - | - | 26 | - | 1.01 / 134.4 | 87.2% | -3.6 |
| 4 | 86.0% | 97.1% | 71.1% | 34 / 35 | - | - | 13 | - | 0.98 / 292.9 | 81.8% | +4.3 |

Mean score share 85.4% ± 1.9, baseline 83.0% ± 13.0, paired diff +2.3 ± 13.9.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 66 over 4 battles (16.5 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| arthord.KostyaTszyu Beta2 | rank304-band4 | 85.4% ± 1.9 | 98.6% ± 2.6 | 68.6% ± 3.0 | 138 / 140 | - | - | 66 | - | 1.01 / 321.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| arthord.KostyaTszyu Beta2 | 4 | 615 | 4.1% | 94.1% | 0.0% | 1.8% | 671 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| arthord.KostyaTszyu Beta2 | 4 | 4 | n/a | 0 | 0.47 | 0 | 0 | 0 |

4 of 4 battles trusted.
