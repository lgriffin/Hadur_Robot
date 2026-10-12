# wcsv.Engineer.Engineer 0.5.4 (rank56-band3) vs voidious.Diamond 1.8.22

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 67.5% | 82.9% | 53.0% | 29 / 35 | - | - | 2 | - | 0.85 / 1082.2 |
| 2 | 72.3% | 91.4% | 52.8% | 32 / 35 | - | - | 0 | - | 0.82 / 1139.0 |
| 3 | 73.1% | 88.6% | 58.1% | 31 / 35 | - | - | 3 | - | 0.86 / 1211.9 |
| 4 | 70.1% | 85.7% | 54.9% | 30 / 35 | - | - | 4 | - | 0.87 / 1121.3 |

Mean score share 70.8% ± 4.0.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 9 over 4 battles (2.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | rank56-band3 | 70.8% ± 4.0 | 87.1% ± 5.9 | 54.7% ± 3.9 | 122 / 140 | - | - | 9 | - | 0.87 / 1211.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | 4 | 1386 | 16.2% | 76.4% | 0.0% | 7.3% | 805 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | 4 | 4 | n/a | 0 | 0.06 | 0 | 0 | 0 |

4 of 4 battles trusted.
