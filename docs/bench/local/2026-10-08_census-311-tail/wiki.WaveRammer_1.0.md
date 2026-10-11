# wiki.WaveRammer 1.0 (rank387-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 77.2% | 94.3% | 67.4% | 33 / 35 | - | - | 3 | - | 0.82 / 170.3 | 75.5% | +1.6 |
| 2 | 81.4% | 100.0% | 70.5% | 35 / 35 | - | - | 0 | - | 0.76 / 2377.9 | 71.5% | +9.9 |
| 3 | 76.4% | 94.3% | 66.2% | 33 / 35 | - | - | 4 | - | 0.81 / 1893.1 | 72.1% | +4.2 |
| 4 | 78.9% | 97.1% | 68.9% | 34 / 35 | - | - | 4 | - | 0.82 / 905.8 | 77.4% | +1.5 |

Mean score share 78.5% ± 3.6, baseline 74.1% ± 4.4, paired diff +4.3 ± 6.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 11 over 4 battles (2.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| wiki.WaveRammer 1.0 | rank387-band4 | 78.5% ± 3.6 | 96.4% ± 4.4 | 68.3% ± 3.0 | 135 / 140 | - | - | 11 | - | 0.82 / 2377.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| wiki.WaveRammer 1.0 | 4 | 1522 | 4.1% | 89.9% | 3.4% | 2.5% | 419 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| wiki.WaveRammer 1.0 | 4 | 4 | n/a | 0 | 0.08 | 0 | 0 | 0 |

4 of 4 battles trusted.
