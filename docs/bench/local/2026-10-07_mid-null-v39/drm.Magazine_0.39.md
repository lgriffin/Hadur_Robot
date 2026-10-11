# drm.Magazine 0.39 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 82.1% | 91.4% | 70.8% | 32 / 35 | - | - | 10 | - | 1.27 / 40.1 | 85.1% | -3.0 |
| 2 | 84.1% | 97.1% | 69.1% | 34 / 35 | - | - | 16 | - | 1.27 / 28.0 | 83.1% | +1.1 |
| 3 | 81.4% | 91.4% | 69.3% | 32 / 35 | - | - | 15 | - | 1.23 / 32.5 | 81.2% | +0.2 |
| 4 | 86.9% | 97.1% | 74.9% | 34 / 35 | - | - | 15 | - | 1.18 / 34.5 | 76.2% | +10.8 |
| 5 | 85.0% | 94.3% | 73.2% | 33 / 35 | - | - | 11 | - | 1.23 / 35.4 | 80.9% | +4.1 |
| 6 | 87.5% | 100.0% | 72.6% | 35 / 35 | - | - | 17 | - | 1.19 / 35.7 | 72.4% | +15.1 |
| 7 | 86.9% | 97.1% | 73.2% | 34 / 35 | - | - | 20 | - | 1.26 / 36.9 | 76.3% | +10.6 |
| 8 | 82.9% | 94.3% | 69.8% | 33 / 35 | - | - | 15 | - | 1.26 / 39.6 | 77.9% | +5.0 |

Mean score share 84.6% ± 2.0, baseline 79.1% ± 3.5, paired diff +5.5 ± 5.2.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 119 over 8 battles (14.9 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| drm.Magazine 0.39 | mid | 84.6% ± 2.0 | 95.4% ± 2.5 | 71.6% ± 1.8 | 267 / 280 | - | - | 119 | - | 1.27 / 40.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| drm.Magazine 0.39 | 8 | 665 | 12.2% | 82.4% | 0.0% | 5.4% | 576 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| drm.Magazine 0.39 | 8 | 8 | n/a | 0 | 0.43 | 0 | 0 | 0 |

8 of 8 battles trusted.
