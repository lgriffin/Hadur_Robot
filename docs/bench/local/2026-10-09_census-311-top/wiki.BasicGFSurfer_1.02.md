# wiki.BasicGFSurfer 1.02 (rank161-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 82.8% | 97.1% | 67.7% | 34 / 35 | - | - | 27 | - | 1.02 / 38.8 | 73.2% | +9.6 |
| 2 | 85.2% | 100.0% | 69.3% | 35 / 35 | - | - | 9 | - | 0.97 / 46.3 | 78.5% | +6.7 |
| 3 | 83.3% | 97.1% | 68.3% | 34 / 35 | - | - | 15 | - | 1.01 / 40.6 | 82.3% | +0.9 |
| 4 | 82.6% | 97.1% | 67.9% | 34 / 35 | - | - | 6 | - | 0.98 / 341.0 | 77.6% | +5.1 |

Mean score share 83.5% ± 1.9, baseline 77.9% ± 6.0, paired diff +5.6 ± 5.8.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 57 over 4 battles (14.3 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| wiki.BasicGFSurfer 1.02 | rank161-band3 | 83.5% ± 1.9 | 97.9% ± 2.3 | 68.3% ± 1.1 | 137 / 140 | - | - | 57 | - | 1.02 / 341.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| wiki.BasicGFSurfer 1.02 | 4 | 778 | 4.8% | 93.2% | 0.0% | 2.0% | 687 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| wiki.BasicGFSurfer 1.02 | 4 | 4 | n/a | 0 | 0.41 | 0 | 0 | 0 |

4 of 4 battles trusted.
