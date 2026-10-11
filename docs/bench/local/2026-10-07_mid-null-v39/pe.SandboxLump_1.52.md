# pe.SandboxLump 1.52 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 90.9% | 100.0% | 80.8% | 35 / 35 | - | - | 15 | - | 0.91 / 38.6 | 79.5% | +11.4 |
| 2 | 86.4% | 97.1% | 75.7% | 34 / 35 | - | - | 11 | - | 0.97 / 27.8 | 80.5% | +5.9 |
| 3 | 85.0% | 97.1% | 73.3% | 34 / 35 | - | - | 10 | - | 0.96 / 57.8 | 80.8% | +4.2 |
| 4 | 88.3% | 100.0% | 76.7% | 35 / 35 | - | - | 10 | - | 0.95 / 29.8 | 84.5% | +3.8 |
| 5 | 88.0% | 100.0% | 75.8% | 35 / 35 | - | - | 15 | - | 0.98 / 27.9 | 70.7% | +17.3 |
| 6 | 85.4% | 97.1% | 74.0% | 34 / 35 | - | - | 3 | - | 0.88 / 28.9 | 77.9% | +7.5 |
| 7 | 88.7% | 97.1% | 79.9% | 34 / 35 | - | - | 13 | - | 0.97 / 33.8 | 86.5% | +2.1 |
| 8 | 90.5% | 100.0% | 80.3% | 35 / 35 | - | - | 5 | - | 0.91 / 36.3 | 87.3% | +3.2 |

Mean score share 87.9% ± 1.8, baseline 81.0% ± 4.5, paired diff +6.9 ± 4.3.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 82 over 8 battles (10.3 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pe.SandboxLump 1.52 | mid | 87.9% ± 1.8 | 98.6% ± 1.3 | 77.1% ± 2.5 | 276 / 280 | - | - | 82 | - | 0.98 / 57.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| pe.SandboxLump 1.52 | 8 | 598 | 4.2% | 94.0% | 0.0% | 1.9% | 507 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pe.SandboxLump 1.52 | 8 | 8 | n/a | 0 | 0.29 | 0 | 0 | 0 |

8 of 8 battles trusted.
