# jcs.Megatron 1.2 (rank98-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 80.5% | 94.3% | 66.4% | 33 / 35 | - | - | 18 | - | 1.29 / 963.2 | 78.0% | +2.5 |
| 2 | 69.9% | 82.9% | 57.4% | 29 / 35 | - | - | 18 | - | 1.34 / 322.1 | 77.2% | -7.3 |
| 3 | 68.2% | 82.9% | 54.2% | 29 / 35 | - | - | 18 | - | 1.32 / 127.5 | 78.2% | -10.0 |
| 4 | 68.5% | 82.9% | 54.3% | 29 / 35 | - | - | 32 | - | 1.33 / 1231.2 | 75.8% | -7.3 |

Mean score share 71.8% ± 9.4, baseline 77.3% ± 1.7, paired diff -5.5 ± 8.8.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 86 over 4 battles (21.5 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jcs.Megatron 1.2 | rank98-band3 | 71.8% ± 9.4 | 85.7% ± 9.1 | 58.1% ± 9.1 | 120 / 140 | - | - | 86 | - | 1.34 / 1231.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| jcs.Megatron 1.2 | 4 | 1368 | 18.3% | 74.4% | 0.0% | 7.3% | 1015 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jcs.Megatron 1.2 | 4 | 4 | n/a | 0 | 0.61 | 0 | 0 | 0 |

4 of 4 battles trusted.
