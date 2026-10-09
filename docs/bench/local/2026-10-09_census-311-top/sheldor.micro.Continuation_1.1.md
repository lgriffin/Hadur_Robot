# sheldor.micro.Continuation 1.1 (rank96-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 55.1% | 60.0% | 51.0% | 21 / 35 | - | - | 36 | - | 1.17 / 1779.2 | 63.2% | -8.1 |
| 2 | 64.8% | 74.3% | 56.2% | 26 / 35 | - | - | 40 | - | 1.13 / 414.5 | 68.8% | -4.0 |
| 3 | 65.8% | 77.1% | 54.8% | 27 / 35 | - | - | 45 | - | 1.17 / 51.3 | 75.4% | -9.6 |
| 4 | 68.3% | 80.0% | 57.0% | 28 / 35 | - | - | 22 | - | 1.09 / 284.9 | 62.3% | +6.0 |

Mean score share 63.5% ± 9.2, baseline 67.4% ± 9.6, paired diff -3.9 ± 11.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 143 over 4 battles (35.8 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sheldor.micro.Continuation 1.1 | rank96-band3 | 63.5% ± 9.2 | 72.9% ± 14.1 | 54.7% ± 4.2 | 102 / 140 | - | - | 143 | - | 1.17 / 1779.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| sheldor.micro.Continuation 1.1 | 4 | 1790 | 26.5% | 62.4% | 0.0% | 11.1% | 956 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sheldor.micro.Continuation 1.1 | 4 | 4 | n/a | 0 | 1.02 | 0 | 0 | 0 |

4 of 4 battles trusted.
