# mdouet.BotKicker 2.0 (rank848-band6) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 94.7% | 100.0% | 88.9% | 35 / 35 | - | - | 11 | - | 0.87 / 17.7 | 93.2% | +1.4 |
| 2 | 91.5% | 97.1% | 85.4% | 34 / 35 | - | - | 7 | - | 0.89 / 249.6 | 92.4% | -0.9 |
| 3 | 95.6% | 100.0% | 90.6% | 35 / 35 | - | - | 6 | - | 0.90 / 606.6 | 94.4% | +1.3 |
| 4 | 94.7% | 100.0% | 89.2% | 35 / 35 | - | - | 4 | - | 0.86 / 279.8 | 95.3% | -0.6 |

Mean score share 94.1% ± 2.8, baseline 93.8% ± 2.0, paired diff +0.3 ± 1.9.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 28 over 4 battles (7.0 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| mdouet.BotKicker 2.0 | rank848-band6 | 94.1% ± 2.8 | 99.3% ± 2.3 | 88.5% ± 3.5 | 139 / 140 | - | - | 28 | - | 0.90 / 606.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| mdouet.BotKicker 2.0 | 4 | 283 | 4.4% | 93.6% | 0.1% | 1.9% | 502 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| mdouet.BotKicker 2.0 | 4 | 4 | n/a | 0 | 0.20 | 0 | 0 | 0 |

4 of 4 battles trusted.
