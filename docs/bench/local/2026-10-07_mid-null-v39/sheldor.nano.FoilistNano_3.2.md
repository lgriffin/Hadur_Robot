# sheldor.nano.FoilistNano 3.2 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 90.6% | 100.0% | 79.8% | 35 / 35 | - | - | 3 | - | 0.89 / 30.9 | 82.1% | +8.5 |
| 2 | 93.1% | 100.0% | 84.7% | 35 / 35 | - | - | 6 | - | 0.88 / 24.6 | 73.4% | +19.6 |
| 3 | 94.5% | 100.0% | 88.1% | 35 / 35 | - | - | 0 | - | 0.82 / 25.8 | 71.8% | +22.7 |
| 4 | 90.2% | 100.0% | 79.5% | 35 / 35 | - | - | 4 | - | 0.86 / 23.6 | 69.7% | +20.6 |
| 5 | 92.0% | 100.0% | 83.0% | 35 / 35 | - | - | 3 | - | 0.87 / 20.0 | 70.9% | +21.1 |
| 6 | 92.7% | 100.0% | 84.5% | 35 / 35 | - | - | 5 | - | 0.85 / 21.9 | 76.5% | +16.1 |
| 7 | 92.6% | 100.0% | 84.5% | 35 / 35 | - | - | 6 | - | 0.84 / 24.7 | 70.9% | +21.7 |
| 8 | 91.7% | 100.0% | 82.3% | 35 / 35 | - | - | 3 | - | 0.84 / 64.0 | 76.3% | +15.4 |

Mean score share 92.2% ± 1.1, baseline 74.0% ± 3.5, paired diff +18.2 ± 3.9.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 30 over 8 battles (3.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sheldor.nano.FoilistNano 3.2 | mid | 92.2% ± 1.1 | 100.0% ± 0.0 | 83.3% ± 2.3 | 280 / 280 | - | - | 30 | - | 0.89 / 64.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| sheldor.nano.FoilistNano 3.2 | 8 | 367 | 0.0% | 100.0% | 0.0% | 0.0% | 538 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sheldor.nano.FoilistNano 3.2 | 8 | 8 | n/a | 0 | 0.11 | 0 | 0 | 0 |

8 of 8 battles trusted.
