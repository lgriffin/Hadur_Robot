# theo.avenge.Pequod 1.0 (mid-shield) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 96.1% | 100.0% | 0.0% | 35 / 35 | - | - | 0 | - | 0.55 / 14.5 | 63.4% | +32.7 |
| 2 | 83.6% | 94.3% | 55.5% | 33 / 35 | - | - | 4 | - | 0.75 / 64.2 | 68.1% | +15.5 |
| 3 | 94.2% | 97.1% | 0.0% | 34 / 35 | - | - | 0 | - | 0.55 / 14.2 | 73.3% | +20.8 |
| 4 | 93.2% | 97.1% | 0.0% | 34 / 35 | - | - | 0 | - | 0.54 / 14.1 | 66.2% | +27.0 |
| 5 | 85.9% | 94.3% | 63.5% | 33 / 35 | - | - | 11 | - | 0.81 / 38.7 | 71.8% | +14.1 |
| 6 | 93.1% | 97.1% | 0.0% | 34 / 35 | - | - | 0 | - | 0.55 / 15.2 | 68.8% | +24.3 |
| 7 | 88.5% | 94.3% | 0.0% | 33 / 35 | - | - | 0 | - | 0.55 / 14.1 | 62.5% | +25.9 |
| 8 | 95.7% | 100.0% | 0.0% | 35 / 35 | - | - | 0 | - | 0.49 / 14.8 | 77.5% | +18.2 |

Mean score share 91.3% ± 3.9, baseline 69.0% ± 4.2, paired diff +22.3 ± 5.3.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 15 over 8 battles (1.9 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| theo.avenge.Pequod 1.0 | mid-shield | 91.3% ± 3.9 | 96.8% ± 2.0 | 14.9% ± 23.1 | 271 / 280 | - | - | 15 | - | 0.81 / 64.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| theo.avenge.Pequod 1.0 | 8 | 218 | 25.8% | 60.4% | 4.9% | 8.8% | 1279 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| theo.avenge.Pequod 1.0 | 8 | 8 | n/a | 0 | 0.05 | 0 | 0 | 0 |

8 of 8 battles trusted.
