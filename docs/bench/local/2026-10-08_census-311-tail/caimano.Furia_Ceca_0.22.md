# caimano.Furia_Ceca 0.22 (rank772-band6) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 98.8% | 100.0% | 96.8% | 35 / 35 | - | - | 3 | - | 0.84 / 851.0 | 95.0% | +3.7 |
| 2 | 98.4% | 100.0% | 95.9% | 35 / 35 | - | - | 6 | - | 0.90 / 865.0 | 99.1% | -0.7 |
| 3 | 98.4% | 100.0% | 95.9% | 35 / 35 | - | - | 6 | - | 0.87 / 566.2 | 95.9% | +2.5 |
| 4 | 97.6% | 100.0% | 94.1% | 35 / 35 | - | - | 6 | - | 0.92 / 626.9 | 93.3% | +4.3 |

Mean score share 98.3% ± 0.8, baseline 95.8% ± 3.9, paired diff +2.4 ± 3.6.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 21 over 4 battles (5.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| caimano.Furia_Ceca 0.22 | rank772-band6 | 98.3% ± 0.8 | 100.0% ± 0.0 | 95.7% ± 1.7 | 140 / 140 | - | - | 21 | - | 0.92 / 865.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| caimano.Furia_Ceca 0.22 | 4 | 69 | 0.0% | 100.0% | 0.0% | 0.0% | 497 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| caimano.Furia_Ceca 0.22 | 4 | 4 | n/a | 0 | 0.15 | 0 | 0 | 0 |

4 of 4 battles trusted.
