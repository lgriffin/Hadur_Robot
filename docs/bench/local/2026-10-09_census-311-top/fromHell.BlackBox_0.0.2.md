# fromHell.BlackBox 0.0.2 (rank27-band2) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 69.9% | 82.9% | 57.9% | 29 / 35 | - | - | 24 | - | 1.08 / 400.6 | 66.7% | +3.2 |
| 2 | 71.8% | 82.9% | 61.4% | 29 / 35 | - | - | 22 | - | 1.11 / 367.1 | 64.1% | +7.7 |
| 3 | 70.0% | 82.9% | 58.5% | 29 / 35 | - | - | 19 | - | 1.10 / 433.0 | 60.8% | +9.2 |
| 4 | 59.2% | 68.6% | 51.5% | 24 / 35 | - | - | 17 | - | 1.02 / 1265.7 | 68.2% | -9.0 |

Mean score share 67.7% ± 9.1, baseline 64.9% ± 5.1, paired diff +2.8 ± 13.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 82 over 4 battles (20.5 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| fromHell.BlackBox 0.0.2 | rank27-band2 | 67.7% ± 9.1 | 79.3% ± 11.4 | 57.3% ± 6.6 | 111 / 140 | - | - | 82 | - | 1.11 / 1265.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| fromHell.BlackBox 0.0.2 | 4 | 1629 | 22.3% | 68.1% | 0.0% | 9.6% | 880 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| fromHell.BlackBox 0.0.2 | 4 | 4 | n/a | 0 | 0.59 | 0 | 0 | 0 |

4 of 4 battles trusted.
