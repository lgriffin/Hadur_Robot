# kawigi.sbf.FloodHT 0.9.2 (rank138-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 73.2% | 88.6% | 56.3% | 31 / 35 | - | - | 24 | - | 1.19 / 557.2 | 69.8% | +3.4 |
| 2 | 80.2% | 94.3% | 64.2% | 33 / 35 | - | - | 17 | - | 1.05 / 1482.2 | 74.3% | +5.9 |
| 3 | 74.8% | 94.3% | 53.0% | 33 / 35 | - | - | 18 | - | 1.12 / 1960.2 | 67.5% | +7.3 |
| 4 | 72.5% | 91.4% | 52.9% | 32 / 35 | - | - | 14 | - | 1.13 / 1199.5 | 73.4% | -0.9 |

Mean score share 75.1% ± 5.5, baseline 71.2% ± 5.1, paired diff +3.9 ± 5.7.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 73 over 4 battles (18.3 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | rank138-band3 | 75.1% ± 5.5 | 92.1% ± 4.4 | 56.6% ± 8.4 | 129 / 140 | - | - | 73 | - | 1.19 / 1960.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 4 | 1105 | 12.4% | 82.1% | 0.0% | 5.4% | 811 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 4 | 4 | n/a | 0 | 0.52 | 0 | 0 | 0 |

4 of 4 battles trusted.
