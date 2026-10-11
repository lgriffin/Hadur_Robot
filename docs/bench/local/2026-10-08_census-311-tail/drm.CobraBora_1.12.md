# drm.CobraBora 1.12 (rank324-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 78.3% | 94.3% | 63.3% | 33 / 35 | - | - | 27 | - | 1.25 / 146.9 | 75.8% | +2.5 |
| 2 | 72.9% | 85.7% | 61.2% | 30 / 35 | - | - | 18 | - | 1.31 / 170.8 | 72.6% | +0.3 |
| 3 | 77.2% | 94.3% | 61.0% | 33 / 35 | - | - | 44 | - | 1.37 / 2991.8 | 73.7% | +3.6 |
| 4 | 71.1% | 82.9% | 60.3% | 29 / 35 | - | - | 28 | - | 1.33 / 28.3 | 76.3% | -5.2 |

Mean score share 74.9% ± 5.5, baseline 74.6% ± 2.7, paired diff +0.3 ± 6.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 117 over 4 battles (29.3 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| drm.CobraBora 1.12 | rank324-band4 | 74.9% ± 5.5 | 89.3% ± 9.4 | 61.5% ± 2.1 | 125 / 140 | - | - | 117 | - | 1.37 / 2991.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| drm.CobraBora 1.12 | 4 | 1261 | 14.9% | 78.4% | 0.0% | 6.8% | 680 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| drm.CobraBora 1.12 | 4 | 4 | n/a | 0 | 0.84 | 0 | 0 | 0 |

4 of 4 battles trusted.
