# voidious.micro.Jen 1.11 (rank199-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 81.6% | 94.3% | 68.5% | 33 / 35 | - | - | 15 | - | 0.99 / 337.2 | 75.9% | +5.6 |
| 2 | 78.0% | 91.4% | 65.3% | 32 / 35 | - | - | 10 | - | 0.91 / 32.3 | 75.0% | +2.9 |
| 3 | 81.7% | 94.3% | 69.6% | 33 / 35 | - | - | 20 | - | 0.98 / 343.8 | 70.6% | +11.1 |
| 4 | 85.3% | 94.3% | 75.3% | 33 / 35 | - | - | 3 | - | 0.88 / 41.2 | 76.5% | +8.8 |

Mean score share 81.6% ± 4.8, baseline 74.5% ± 4.2, paired diff +7.1 ± 5.7.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 48 over 4 battles (12.0 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| voidious.micro.Jen 1.11 | rank199-band3 | 81.6% ± 4.8 | 93.6% ± 2.3 | 69.7% ± 6.7 | 131 / 140 | - | - | 48 | - | 0.99 / 343.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| voidious.micro.Jen 1.11 | 4 | 903 | 12.5% | 82.6% | 0.0% | 4.9% | 618 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| voidious.micro.Jen 1.11 | 4 | 4 | n/a | 0 | 0.34 | 0 | 0 | 0 |

4 of 4 battles trusted.
