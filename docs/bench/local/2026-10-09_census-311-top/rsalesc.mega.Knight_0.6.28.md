# rsalesc.mega.Knight 0.6.28 (rank11-band2) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 46.0% | 34.3% | 56.5% | 12 / 35 | - | - | 322 | - | 2.08 / 1211.2 | 51.6% | -5.6 |
| 2 | 53.7% | 42.9% | 62.4% | 15 / 35 | - | - | 287 | - | 1.95 / 929.1 | 50.9% | +2.9 |
| 3 | 47.4% | 34.3% | 57.8% | 12 / 35 | - | - | 294 | - | 1.99 / 1380.4 | 64.1% | -16.7 |
| 4 | 41.7% | 25.7% | 55.2% | 9 / 35 | - | - | 326 | - | 1.97 / 947.9 | 57.9% | -16.2 |

Mean score share 47.2% ± 7.9, baseline 56.1% ± 9.9, paired diff -8.9 ± 14.9.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 1229 over 4 battles (307.3 per battle, most in one battle 326). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | rank11-band2 | 47.2% ± 7.9 | 34.3% ± 11.1 | 58.0% ± 5.0 | 48 / 140 | - | - | 1229 | - | 2.08 / 1380.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | 4 | 2565 | 44.8% | 40.1% | 0.0% | 15.1% | 2074 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | 4 | 0 | n/a | 0 | 8.78 | 0 | 0 | 0 |

0 of 4 battles trusted.
