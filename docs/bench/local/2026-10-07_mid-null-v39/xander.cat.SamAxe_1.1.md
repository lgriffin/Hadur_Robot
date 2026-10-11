# xander.cat.SamAxe 1.1 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 93.7% | 100.0% | 88.0% | 35 / 35 | - | - | 6 | - | 1.01 / 25.0 | 86.2% | +7.6 |
| 2 | 94.1% | 100.0% | 88.7% | 35 / 35 | - | - | 7 | - | 0.93 / 26.5 | 87.7% | +6.4 |
| 3 | 92.9% | 100.0% | 86.5% | 35 / 35 | - | - | 11 | - | 1.05 / 30.3 | 86.0% | +6.8 |
| 4 | 95.8% | 100.0% | 91.8% | 35 / 35 | - | - | 4 | - | 0.83 / 28.7 | 86.2% | +9.5 |
| 5 | 95.9% | 100.0% | 92.1% | 35 / 35 | - | - | 3 | - | 0.98 / 26.4 | 81.4% | +14.6 |
| 6 | 95.1% | 100.0% | 90.5% | 35 / 35 | - | - | 3 | - | 0.80 / 27.7 | 88.8% | +6.3 |
| 7 | 94.9% | 100.0% | 90.3% | 35 / 35 | - | - | 2 | - | 0.95 / 31.9 | 85.3% | +9.6 |
| 8 | 93.4% | 100.0% | 87.6% | 35 / 35 | - | - | 0 | - | 0.73 / 23.9 | 76.2% | +17.3 |

Mean score share 94.5% ± 0.9, baseline 84.7% ± 3.4, paired diff +9.8 ± 3.4.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 36 over 8 battles (4.5 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| xander.cat.SamAxe 1.1 | mid | 94.5% ± 0.9 | 100.0% ± 0.0 | 89.4% ± 1.7 | 280 / 280 | - | - | 36 | - | 1.05 / 31.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| xander.cat.SamAxe 1.1 | 8 | 301 | 0.0% | 100.0% | 0.0% | 0.0% | 438 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| xander.cat.SamAxe 1.1 | 8 | 8 | n/a | 0 | 0.13 | 0 | 0 | 0 |

8 of 8 battles trusted.
