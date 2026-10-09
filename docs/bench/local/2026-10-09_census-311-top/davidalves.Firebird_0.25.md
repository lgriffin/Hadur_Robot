# davidalves.Firebird 0.25 (rank30-band2) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 67.7% | 80.0% | 56.6% | 28 / 35 | - | - | 11 | - | 1.24 / 776.8 | 64.2% | +3.6 |
| 2 | 67.7% | 82.9% | 52.3% | 29 / 35 | - | - | 12 | - | 1.23 / 678.2 | 65.1% | +2.5 |
| 3 | 61.5% | 71.4% | 52.1% | 25 / 35 | - | - | 13 | - | 1.21 / 796.8 | 63.1% | -1.6 |
| 4 | 63.8% | 77.1% | 52.4% | 27 / 35 | - | - | 10 | - | 1.23 / 484.1 | 55.5% | +8.3 |

Mean score share 65.2% ± 4.9, baseline 62.0% ± 7.0, paired diff +3.2 ± 6.5.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 46 over 4 battles (11.5 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| davidalves.Firebird 0.25 | rank30-band2 | 65.2% ± 4.9 | 77.9% ± 7.8 | 53.3% ± 3.4 | 109 / 140 | - | - | 46 | - | 1.24 / 796.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| davidalves.Firebird 0.25 | 4 | 1687 | 23.0% | 67.3% | 0.0% | 9.7% | 861 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| davidalves.Firebird 0.25 | 4 | 4 | n/a | 0 | 0.33 | 0 | 0 | 0 |

4 of 4 battles trusted.
