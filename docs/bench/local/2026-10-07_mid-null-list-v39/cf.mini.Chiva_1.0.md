# cf.mini.Chiva 1.0 (mid-shield) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 91.9% | 100.0% | 82.4% | 35 / 35 | - | - | 12 | - | 0.92 / 27.4 | 82.3% | +9.6 |
| 2 | 90.3% | 100.0% | 78.9% | 35 / 35 | - | - | 22 | - | 1.01 / 162.6 | 80.5% | +9.8 |
| 3 | 90.9% | 100.0% | 80.5% | 35 / 35 | - | - | 9 | - | 0.93 / 36.4 | 83.9% | +7.0 |
| 4 | 89.8% | 97.1% | 81.2% | 34 / 35 | - | - | 5 | - | 0.89 / 174.0 | 80.8% | +9.0 |
| 5 | 86.3% | 97.1% | 74.8% | 34 / 35 | - | - | 12 | - | 0.95 / 30.3 | 82.9% | +3.3 |
| 6 | 91.6% | 100.0% | 82.0% | 35 / 35 | - | - | 4 | - | 0.89 / 25.7 | 79.4% | +12.3 |
| 7 | 90.1% | 97.1% | 81.8% | 34 / 35 | - | - | 18 | - | 0.95 / 28.6 | 73.3% | +16.9 |
| 8 | 93.3% | 100.0% | 85.0% | 35 / 35 | - | - | 3 | - | 0.90 / 34.9 | 86.2% | +7.0 |

Mean score share 90.5% ± 1.7, baseline 81.2% ± 3.2, paired diff +9.4 ± 3.3.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 85 over 8 battles (10.6 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cf.mini.Chiva 1.0 | mid-shield | 90.5% ± 1.7 | 98.9% ± 1.2 | 80.8% ± 2.5 | 277 / 280 | - | - | 85 | - | 1.01 / 174.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| cf.mini.Chiva 1.0 | 8 | 437 | 4.3% | 94.1% | 0.3% | 1.3% | 615 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cf.mini.Chiva 1.0 | 8 | 8 | n/a | 0 | 0.30 | 0 | 0 | 0 |

8 of 8 battles trusted.
