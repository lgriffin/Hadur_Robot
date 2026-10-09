# robar.nano.MosquitoPM 1.0 (rank440-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 85.4% | 97.1% | 72.8% | 34 / 35 | - | - | 8 | - | 0.96 / 66.4 | 81.7% | +3.7 |
| 2 | 85.1% | 97.1% | 72.0% | 34 / 35 | - | - | 6 | - | 0.97 / 1077.8 | 80.3% | +4.8 |
| 3 | 86.9% | 100.0% | 72.9% | 35 / 35 | - | - | 4 | - | 0.96 / 820.1 | 79.7% | +7.3 |
| 4 | 83.4% | 97.1% | 68.7% | 34 / 35 | - | - | 8 | - | 0.90 / 997.6 | 86.4% | -3.0 |

Mean score share 85.2% ± 2.3, baseline 82.0% ± 4.8, paired diff +3.2 ± 7.0.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 26 over 4 battles (6.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | rank440-band5 | 85.2% ± 2.3 | 97.9% ± 2.3 | 71.6% ± 3.1 | 137 / 140 | - | - | 26 | - | 0.97 / 1077.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 4 | 691 | 5.4% | 91.9% | 0.0% | 2.7% | 537 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 4 | 4 | n/a | 0 | 0.19 | 0 | 0 | 0 |

4 of 4 battles trusted.
