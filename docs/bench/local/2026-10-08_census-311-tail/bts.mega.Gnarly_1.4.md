# bts.mega.Gnarly 1.4 (rank428-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 85.1% | 100.0% | 73.7% | 35 / 35 | - | - | 4 | - | 1.06 / 33.1 | 83.9% | +1.2 |
| 2 | 83.0% | 97.1% | 72.5% | 34 / 35 | - | - | 8 | - | 1.07 / 24.8 | 84.9% | -1.9 |
| 3 | 83.7% | 100.0% | 71.7% | 35 / 35 | - | - | 9 | - | 0.99 / 26.9 | 84.0% | -0.3 |
| 4 | 85.6% | 100.0% | 74.6% | 35 / 35 | - | - | 5 | - | 0.95 / 25.1 | 85.2% | +0.4 |

Mean score share 84.4% ± 1.9, baseline 84.5% ± 1.1, paired diff -0.1 ± 2.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 26 over 4 battles (6.5 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| bts.mega.Gnarly 1.4 | rank428-band5 | 84.4% ± 1.9 | 99.3% ± 2.3 | 73.1% ± 2.1 | 139 / 140 | - | - | 26 | - | 1.07 / 33.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| bts.mega.Gnarly 1.4 | 4 | 946 | 1.3% | 97.9% | 0.0% | 0.7% | 517 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| bts.mega.Gnarly 1.4 | 4 | 4 | n/a | 0 | 0.19 | 0 | 0 | 0 |

4 of 4 battles trusted.
