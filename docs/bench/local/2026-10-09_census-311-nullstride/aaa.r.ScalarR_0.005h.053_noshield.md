# aaa.r.ScalarR 0.005h.053-noshield (rank5-band1) vs jd.Nullstride 2.3.3

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 32.4% | 23.5% | 43.9% | 9 / 35 | - | - | 1273 | - | 2.55 / 5038.1 |
| 2 | 44.5% | 42.9% | 46.7% | 15 / 35 | - | - | 1612 | - | 2.68 / 4400.9 |
| 3 | 36.3% | 31.4% | 43.0% | 11 / 35 | - | - | 1369 | - | 2.63 / 4351.8 |
| 4 | 34.7% | 28.6% | 42.6% | 10 / 35 | - | - | 1429 | - | 2.62 / 4408.6 |

Mean score share 37.0% ± 8.4.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 5683 over 4 battles (1420.8 per battle, most in one battle 1612). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | rank5-band1 | 37.0% ± 8.4 | 31.6% ± 13.0 | 44.1% ± 2.9 | 45 / 140 | - | - | 5683 | - | 2.68 / 5038.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | 4 | 2556 | 46.5% | 38.6% | 0.1% | 14.9% | 5203 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | 4 | 0 | n/a | 0 | 40.59 | 0 | 0 | 0 |

0 of 4 battles trusted.
