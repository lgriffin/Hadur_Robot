# suh.mega.WaveSurferPG 1.06 (mid-shield) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 88.6% | 100.0% | 77.1% | 35 / 35 | - | - | 827 | - | 1.57 / 36.3 | 74.1% | +14.5 |
| 2 | 89.4% | 100.0% | 79.1% | 35 / 35 | - | - | 1036 | - | 1.61 / 36.3 | 74.7% | +14.8 |
| 3 | 85.7% | 100.0% | 71.7% | 35 / 35 | - | - | 875 | - | 1.57 / 39.3 | 76.9% | +8.7 |
| 4 | 85.0% | 94.3% | 75.3% | 33 / 35 | - | - | 818 | - | 1.52 / 39.0 | 85.1% | -0.1 |
| 5 | 86.3% | 97.1% | 75.4% | 34 / 35 | - | - | 808 | - | 1.53 / 35.0 | 76.5% | +9.9 |
| 6 | 88.6% | 100.0% | 77.2% | 35 / 35 | - | - | 742 | - | 1.52 / 38.7 | 82.1% | +6.5 |
| 7 | 87.0% | 97.1% | 76.7% | 34 / 35 | - | - | 1038 | - | 1.61 / 314.7 | 71.5% | +15.5 |
| 8 | 90.8% | 100.0% | 81.5% | 35 / 35 | - | - | 960 | - | 1.58 / 38.3 | 75.3% | +15.5 |

Mean score share 87.7% ± 1.7, baseline 77.0% ± 3.7, paired diff +10.6 ± 4.7.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 7104 over 8 battles (888.0 per battle, most in one battle 1038). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| suh.mega.WaveSurferPG 1.06 | mid-shield | 87.7% ± 1.7 | 98.6% ± 1.8 | 76.8% ± 2.4 | 276 / 280 | - | - | 7104 | - | 1.61 / 314.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| suh.mega.WaveSurferPG 1.06 | 8 | 615 | 4.1% | 94.3% | 0.0% | 1.6% | 1985 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| suh.mega.WaveSurferPG 1.06 | 8 | 0 | n/a | 0 | 25.37 | 0 | 0 | 0 |

0 of 8 battles trusted.
