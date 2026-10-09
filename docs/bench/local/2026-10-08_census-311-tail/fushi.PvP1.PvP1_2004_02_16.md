# fushi.PvP1.PvP1 2004-02-16 (rank507-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 87.3% | 91.4% | 82.8% | 32 / 35 | - | - | 18 | - | 1.05 / 1188.2 | 84.2% | +3.1 |
| 2 | 88.7% | 94.3% | 83.4% | 33 / 35 | - | - | 53 | - | 1.07 / 1114.0 | 81.3% | +7.4 |
| 3 | 89.0% | 94.3% | 83.7% | 33 / 35 | - | - | 82 | - | 1.15 / 1103.5 | 87.8% | +1.2 |
| 4 | 88.1% | 94.3% | 82.1% | 33 / 35 | - | - | 54 | - | 1.09 / 1111.6 | 84.5% | +3.6 |

Mean score share 88.3% ± 1.2, baseline 84.4% ± 4.2, paired diff +3.8 ± 4.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 207 over 4 battles (51.8 per battle, most in one battle 82). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| fushi.PvP1.PvP1 2004-02-16 | rank507-band5 | 88.3% ± 1.2 | 93.6% ± 2.3 | 83.0% ± 1.1 | 131 / 140 | - | - | 207 | - | 1.15 / 1188.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| fushi.PvP1.PvP1 2004-02-16 | 4 | 647 | 17.4% | 77.0% | 0.0% | 5.6% | 1064 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| fushi.PvP1.PvP1 2004-02-16 | 4 | 3 | n/a | 0 | 1.48 | 0 | 0 | 0 |

3 of 4 battles trusted.
