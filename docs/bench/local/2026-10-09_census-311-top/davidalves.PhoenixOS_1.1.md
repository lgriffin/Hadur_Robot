# davidalves.PhoenixOS 1.1 (rank59-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 68.9% | 80.0% | 57.8% | 28 / 35 | - | - | 39 | - | 1.10 / 198.2 | 65.2% | +3.7 |
| 2 | 58.8% | 65.7% | 52.2% | 23 / 35 | - | - | 65 | - | 1.02 / 1178.1 | 69.8% | -11.0 |
| 3 | 61.4% | 71.4% | 52.0% | 25 / 35 | - | - | 23 | - | 1.04 / 1109.4 | 66.7% | -5.3 |
| 4 | 57.9% | 65.7% | 50.7% | 23 / 35 | - | - | 33 | - | 0.98 / 999.0 | 66.7% | -8.8 |

Mean score share 61.7% ± 8.0, baseline 67.1% ± 3.1, paired diff -5.4 ± 10.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 160 over 4 battles (40.0 per battle, most in one battle 65). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| davidalves.PhoenixOS 1.1 | rank59-band3 | 61.7% ± 8.0 | 70.7% ± 10.7 | 53.2% ± 5.0 | 99 / 140 | - | - | 160 | - | 1.10 / 1178.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| davidalves.PhoenixOS 1.1 | 4 | 1881 | 27.2% | 61.4% | 0.0% | 11.3% | 944 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| davidalves.PhoenixOS 1.1 | 4 | 4 | n/a | 1 | 1.14 | 0 | 0 | 0 |

4 of 4 battles trusted.
