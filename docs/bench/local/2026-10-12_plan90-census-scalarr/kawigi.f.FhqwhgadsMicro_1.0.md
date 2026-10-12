# kawigi.f.FhqwhgadsMicro 1.0 (rank291-band4) vs aaa.r.ScalarR 0.005h.053-noshield

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 85.0% | 97.1% | 72.2% | 34 / 35 | - | - | 20 | - | 0.79 / 1694.1 |
| 2 | 83.4% | 94.3% | 72.3% | 33 / 35 | - | - | 11 | - | 0.80 / 1741.0 |
| 3 | 86.1% | 100.0% | 70.9% | 35 / 35 | - | - | 67 | - | 0.79 / 1687.5 |
| 4 | 83.3% | 97.1% | 68.4% | 34 / 35 | - | - | 11 | - | 0.81 / 765.7 |

Mean score share 84.4% ± 2.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 109 over 4 battles (27.3 per battle, most in one battle 67). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kawigi.f.FhqwhgadsMicro 1.0 | rank291-band4 | 84.4% ± 2.2 | 97.1% ± 3.7 | 70.9% ± 2.8 | 136 / 140 | - | - | 109 | - | 0.81 / 1741.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| kawigi.f.FhqwhgadsMicro 1.0 | 4 | 729 | 6.9% | 89.7% | 0.0% | 3.5% | 555 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kawigi.f.FhqwhgadsMicro 1.0 | 4 | 4 | n/a | 1 | 0.78 | 0 | 0 | 0 |

4 of 4 battles trusted.
