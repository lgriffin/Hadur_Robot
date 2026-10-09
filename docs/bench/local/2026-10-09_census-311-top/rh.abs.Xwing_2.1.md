# rh.abs.Xwing 2.1 (rank137-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 76.8% | 88.6% | 64.6% | 31 / 35 | - | - | 9 | - | 0.94 / 1018.4 | 73.1% | +3.7 |
| 2 | 75.3% | 91.4% | 59.4% | 32 / 35 | - | - | 8 | - | 0.97 / 354.4 | 74.7% | +0.5 |
| 3 | 75.5% | 91.4% | 59.7% | 32 / 35 | - | - | 17 | - | 1.02 / 1397.5 | 73.2% | +2.3 |
| 4 | 79.5% | 94.3% | 65.2% | 33 / 35 | - | - | 13 | - | 0.98 / 103.0 | 74.2% | +5.3 |

Mean score share 76.8% ± 3.1, baseline 73.8% ± 1.3, paired diff +3.0 ± 3.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 47 over 4 battles (11.8 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| rh.abs.Xwing 2.1 | rank137-band3 | 76.8% ± 3.1 | 91.4% ± 3.7 | 62.2% ± 5.0 | 128 / 140 | - | - | 47 | - | 1.02 / 1397.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| rh.abs.Xwing 2.1 | 4 | 1126 | 13.3% | 81.0% | 0.0% | 5.7% | 766 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| rh.abs.Xwing 2.1 | 4 | 4 | n/a | 0 | 0.34 | 0 | 0 | 0 |

4 of 4 battles trusted.
