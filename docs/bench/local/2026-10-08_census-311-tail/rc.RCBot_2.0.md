# rc.RCBot 2.0 (rank663-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 94.8% | 100.0% | 89.1% | 35 / 35 | - | - | 7 | - | 0.92 / 885.3 | 93.9% | +0.9 |
| 2 | 94.9% | 100.0% | 89.2% | 35 / 35 | - | - | 6 | - | 0.91 / 969.7 | 94.9% | -0.1 |
| 3 | 94.8% | 100.0% | 89.2% | 35 / 35 | - | - | 6 | - | 0.94 / 987.3 | 91.6% | +3.2 |
| 4 | 94.8% | 100.0% | 88.9% | 35 / 35 | - | - | 9 | - | 0.96 / 62.7 | 93.5% | +1.3 |

Mean score share 94.8% ± 0.1, baseline 93.5% ± 2.2, paired diff +1.3 ± 2.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 28 over 4 battles (7.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| rc.RCBot 2.0 | rank663-band5 | 94.8% ± 0.1 | 100.0% ± 0.0 | 89.1% ± 0.3 | 140 / 140 | - | - | 28 | - | 0.96 / 987.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| rc.RCBot 2.0 | 4 | 250 | 0.0% | 100.0% | 0.0% | 0.0% | 566 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| rc.RCBot 2.0 | 4 | 4 | n/a | 0 | 0.20 | 0 | 0 | 0 |

4 of 4 battles trusted.
