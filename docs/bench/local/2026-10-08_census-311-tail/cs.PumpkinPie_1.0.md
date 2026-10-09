# cs.PumpkinPie 1.0 (rank375-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 75.3% | 91.4% | 58.6% | 32 / 35 | - | - | 3 | - | 1.53 / 910.6 | 73.6% | +1.7 |
| 2 | 63.8% | 74.3% | 54.1% | 26 / 35 | - | - | 8 | - | 1.47 / 2326.0 | 71.2% | -7.4 |
| 3 | 86.1% | 100.0% | 70.1% | 35 / 35 | - | - | 4 | - | 1.44 / 753.8 | 82.0% | +4.1 |
| 4 | 78.7% | 94.3% | 61.4% | 33 / 35 | - | - | 9 | - | 1.55 / 1971.1 | 72.1% | +6.6 |

Mean score share 76.0% ± 14.8, baseline 74.7% ± 7.8, paired diff +1.2 ± 9.7.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 24 over 4 battles (6.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cs.PumpkinPie 1.0 | rank375-band4 | 76.0% ± 14.8 | 90.0% ± 17.6 | 61.1% ± 10.7 | 126 / 140 | - | - | 24 | - | 1.55 / 2326.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| cs.PumpkinPie 1.0 | 4 | 1118 | 15.6% | 77.8% | 0.0% | 6.5% | 839 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cs.PumpkinPie 1.0 | 4 | 4 | n/a | 0 | 0.17 | 0 | 0 | 0 |

4 of 4 battles trusted.
