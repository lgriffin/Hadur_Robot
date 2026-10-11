# ary.SMG 1.01 (mid-shield) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 94.5% | 100.0% | 90.0% | 35 / 35 | - | - | 5 | - | 0.85 / 16.7 | 70.7% | +23.8 |
| 2 | 95.5% | 100.0% | 91.8% | 35 / 35 | - | - | 1 | - | 0.72 / 16.3 | 64.2% | +31.4 |
| 3 | 91.3% | 100.0% | 84.9% | 35 / 35 | - | - | 6 | - | 0.84 / 17.0 | 70.2% | +21.1 |
| 4 | 94.4% | 100.0% | 89.8% | 35 / 35 | - | - | 4 | - | 0.70 / 17.9 | 71.6% | +22.7 |
| 5 | 93.1% | 100.0% | 87.7% | 35 / 35 | - | - | 5 | - | 0.74 / 19.9 | 68.4% | +24.6 |
| 6 | 94.8% | 100.0% | 90.7% | 35 / 35 | - | - | 4 | - | 0.79 / 24.1 | 70.6% | +24.3 |
| 7 | 92.8% | 100.0% | 87.2% | 35 / 35 | - | - | 4 | - | 0.82 / 22.3 | 74.5% | +18.3 |
| 8 | 91.4% | 100.0% | 85.0% | 35 / 35 | - | - | 4 | - | 0.81 / 19.1 | 67.9% | +23.4 |

Mean score share 93.5% ± 1.3, baseline 69.8% ± 2.5, paired diff +23.7 ± 3.1.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 33 over 8 battles (4.1 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ary.SMG 1.01 | mid-shield | 93.5% ± 1.3 | 100.0% ± 0.0 | 88.4% ± 2.2 | 280 / 280 | - | - | 33 | - | 0.85 / 24.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ary.SMG 1.01 | 8 | 402 | 0.0% | 99.8% | 0.2% | 0.0% | 332 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ary.SMG 1.01 | 8 | 8 | n/a | 0 | 0.12 | 0 | 0 | 0 |

8 of 8 battles trusted.
