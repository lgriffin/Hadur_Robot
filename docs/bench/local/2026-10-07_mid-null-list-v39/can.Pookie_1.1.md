# can.Pookie 1.1 (mid-shield) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 85.3% | 94.3% | 74.7% | 33 / 35 | - | - | 4 | - | 0.93 / 30.1 | 79.4% | +5.9 |
| 2 | 89.0% | 97.1% | 79.2% | 34 / 35 | - | - | 7 | - | 0.99 / 34.8 | 81.3% | +7.7 |
| 3 | 90.3% | 97.1% | 82.5% | 34 / 35 | - | - | 10 | - | 0.95 / 34.9 | 83.8% | +6.4 |
| 4 | 87.1% | 97.1% | 75.7% | 34 / 35 | - | - | 6 | - | 0.93 / 35.0 | 83.8% | +3.3 |
| 5 | 87.9% | 97.1% | 77.0% | 34 / 35 | - | - | 8 | - | 0.98 / 29.1 | 82.5% | +5.4 |
| 6 | 92.8% | 100.0% | 83.5% | 35 / 35 | - | - | 9 | - | 1.00 / 27.8 | 80.0% | +12.7 |
| 7 | 90.3% | 100.0% | 79.1% | 35 / 35 | - | - | 6 | - | 0.99 / 27.4 | 81.5% | +8.7 |
| 8 | 87.2% | 100.0% | 74.3% | 35 / 35 | - | - | 11 | - | 1.00 / 26.9 | 86.7% | +0.5 |

Mean score share 88.7% ± 2.0, baseline 82.4% ± 2.0, paired diff +6.3 ± 3.0.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 61 over 8 battles (7.6 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| can.Pookie 1.1 | mid-shield | 88.7% ± 2.0 | 97.9% ± 1.7 | 78.3% ± 2.9 | 274 / 280 | - | - | 61 | - | 1.00 / 35.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| can.Pookie 1.1 | 8 | 517 | 7.3% | 90.1% | 0.0% | 2.6% | 554 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| can.Pookie 1.1 | 8 | 8 | n/a | 0 | 0.22 | 0 | 0 | 0 |

8 of 8 battles trusted.
