# ha2.T2b 0.2b (rank658-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 97.4% | 100.0% | 94.8% | 35 / 35 | - | - | 9 | - | 0.99 / 71.8 | 96.4% | +1.0 |
| 2 | 98.5% | 100.0% | 96.7% | 35 / 35 | - | - | 4 | - | 0.85 / 385.0 | 95.3% | +3.2 |
| 3 | 95.9% | 100.0% | 91.5% | 35 / 35 | - | - | 6 | - | 0.90 / 603.2 | 94.0% | +1.9 |
| 4 | 97.8% | 100.0% | 95.4% | 35 / 35 | - | - | 6 | - | 0.92 / 524.1 | 95.2% | +2.6 |

Mean score share 97.4% ± 1.7, baseline 95.2% ± 1.6, paired diff +2.2 ± 1.5.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 25 over 4 battles (6.3 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ha2.T2b 0.2b | rank658-band5 | 97.4% ± 1.7 | 100.0% ± 0.0 | 94.6% ± 3.5 | 140 / 140 | - | - | 25 | - | 0.99 / 603.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ha2.T2b 0.2b | 4 | 125 | 0.0% | 99.8% | 0.2% | 0.0% | 451 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ha2.T2b 0.2b | 4 | 4 | n/a | 0 | 0.18 | 0 | 0 | 0 |

4 of 4 battles trusted.
