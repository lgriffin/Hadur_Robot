# theo.real.Ahab 1.0 (mid-shield) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 91.2% | 100.0% | 54.2% | 35 / 35 | - | - | 6 | - | 0.98 / 46.5 | 64.3% | +26.9 |
| 2 | 86.4% | 94.3% | 56.0% | 33 / 35 | - | - | 5 | - | 1.05 / 55.0 | 62.0% | +24.4 |
| 3 | 89.9% | 97.1% | 57.1% | 34 / 35 | - | - | 7 | - | 0.99 / 36.0 | 69.2% | +20.8 |
| 4 | 87.7% | 97.1% | 60.1% | 34 / 35 | - | - | 8 | - | 1.10 / 49.6 | 68.3% | +19.5 |
| 5 | 89.8% | 97.1% | 58.5% | 34 / 35 | - | - | 8 | - | 0.99 / 42.6 | 69.1% | +20.7 |
| 6 | 88.6% | 100.0% | 63.5% | 35 / 35 | - | - | 20 | - | 1.13 / 50.8 | 69.5% | +19.1 |
| 7 | 92.3% | 100.0% | 54.1% | 35 / 35 | - | - | 8 | - | 0.99 / 62.5 | 62.3% | +30.0 |
| 8 | 83.3% | 91.4% | 62.2% | 32 / 35 | - | - | 4 | - | 1.14 / 55.6 | 65.4% | +17.9 |

Mean score share 88.6% ± 2.4, baseline 66.3% ± 2.6, paired diff +22.4 ± 3.6.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 66 over 8 battles (8.3 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| theo.real.Ahab 1.0 | mid-shield | 88.6% ± 2.4 | 97.1% ± 2.6 | 58.2% ± 2.9 | 272 / 280 | - | - | 66 | - | 1.14 / 62.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| theo.real.Ahab 1.0 | 8 | 322 | 15.5% | 79.8% | 0.0% | 4.7% | 1314 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| theo.real.Ahab 1.0 | 8 | 8 | n/a | 0 | 0.24 | 0 | 0 | 0 |

8 of 8 battles trusted.
