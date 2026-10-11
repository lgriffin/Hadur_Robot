# simonton.micro.WeeklongObsession 3.4.1 (rank136-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 66.2% | 71.4% | 61.3% | 25 / 35 | - | - | 20 | - | 1.12 / 763.0 | 74.0% | -7.8 |
| 2 | 64.6% | 71.4% | 58.3% | 25 / 35 | - | - | 21 | - | 1.11 / 378.9 | 74.4% | -9.8 |
| 3 | 67.5% | 77.1% | 58.8% | 27 / 35 | - | - | 9 | - | 1.09 / 857.4 | 75.1% | -7.7 |
| 4 | 68.9% | 77.1% | 61.8% | 27 / 35 | - | - | 19 | - | 1.08 / 369.3 | 65.7% | +3.2 |

Mean score share 66.8% ± 2.9, baseline 72.3% ± 7.0, paired diff -5.5 ± 9.4.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 69 over 4 battles (17.3 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| simonton.micro.WeeklongObsession 3.4.1 | rank136-band3 | 66.8% ± 2.9 | 74.3% ± 5.2 | 60.0% ± 2.8 | 104 / 140 | - | - | 69 | - | 1.12 / 857.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| simonton.micro.WeeklongObsession 3.4.1 | 4 | 1730 | 26.0% | 63.1% | 0.0% | 10.9% | 854 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| simonton.micro.WeeklongObsession 3.4.1 | 4 | 4 | n/a | 0 | 0.49 | 0 | 0 | 0 |

4 of 4 battles trusted.
