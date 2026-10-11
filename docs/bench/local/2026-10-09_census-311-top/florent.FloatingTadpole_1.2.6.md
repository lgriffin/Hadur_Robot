# florent.FloatingTadpole 1.2.6 (rank127-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 84.5% | 97.1% | 70.9% | 34 / 35 | - | - | 14 | - | 1.05 / 727.6 | 79.1% | +5.3 |
| 2 | 80.6% | 94.3% | 66.3% | 33 / 35 | - | - | 17 | - | 1.02 / 970.0 | 79.1% | +1.6 |
| 3 | 81.9% | 97.1% | 66.5% | 34 / 35 | - | - | 8 | - | 1.06 / 1397.0 | 79.1% | +2.8 |
| 4 | 83.1% | 97.1% | 68.4% | 34 / 35 | - | - | 13 | - | 1.06 / 1496.1 | 79.6% | +3.5 |

Mean score share 82.5% ± 2.6, baseline 79.2% ± 0.4, paired diff +3.3 ± 2.5.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 52 over 4 battles (13.0 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| florent.FloatingTadpole 1.2.6 | rank127-band3 | 82.5% ± 2.6 | 96.4% ± 2.3 | 68.0% ± 3.4 | 135 / 140 | - | - | 52 | - | 1.06 / 1496.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| florent.FloatingTadpole 1.2.6 | 4 | 828 | 7.5% | 89.5% | 0.0% | 3.0% | 726 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| florent.FloatingTadpole 1.2.6 | 4 | 4 | n/a | 0 | 0.37 | 0 | 0 | 0 |

4 of 4 battles trusted.
