# whind.Constitution 0.7.1 (rank511-band5) vs voidious.Diamond 1.8.22

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 83.9% | 94.3% | 72.1% | 33 / 35 | - | - | 0 | - | 0.74 / 1272.4 |
| 2 | 82.9% | 94.3% | 70.3% | 33 / 35 | - | - | 0 | - | 0.72 / 900.1 |
| 3 | 87.4% | 100.0% | 73.8% | 35 / 35 | - | - | 0 | - | 0.71 / 1316.3 |
| 4 | 83.8% | 97.1% | 70.0% | 34 / 35 | - | - | 1 | - | 0.71 / 106.0 |

Mean score share 84.5% ± 3.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| whind.Constitution 0.7.1 | rank511-band5 | 84.5% ± 3.2 | 96.4% ± 4.4 | 71.5% ± 2.8 | 135 / 140 | - | - | 1 | - | 0.74 / 1316.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| whind.Constitution 0.7.1 | 4 | 712 | 8.8% | 87.2% | 0.0% | 4.0% | 667 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| whind.Constitution 0.7.1 | 4 | 4 | n/a | 0 | 0.01 | 0 | 0 | 0 |

4 of 4 battles trusted.
