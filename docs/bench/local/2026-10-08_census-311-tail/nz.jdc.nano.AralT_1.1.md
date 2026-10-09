# nz.jdc.nano.AralT 1.1 (rank463-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 92.3% | 100.0% | 84.5% | 35 / 35 | - | - | 4 | - | 0.83 / 1158.1 | 85.3% | +7.0 |
| 2 | 90.3% | 100.0% | 80.9% | 35 / 35 | - | - | 2 | - | 0.84 / 428.3 | 91.1% | -0.8 |
| 3 | 87.1% | 97.1% | 77.5% | 34 / 35 | - | - | 2 | - | 0.86 / 862.1 | 90.8% | -3.7 |
| 4 | 88.5% | 100.0% | 77.9% | 35 / 35 | - | - | 4 | - | 0.83 / 389.9 | 90.5% | -2.1 |

Mean score share 89.5% ± 3.6, baseline 89.4% ± 4.3, paired diff +0.1 ± 7.6.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 12 over 4 battles (3.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| nz.jdc.nano.AralT 1.1 | rank463-band5 | 89.5% ± 3.6 | 99.3% ± 2.3 | 80.2% ± 5.2 | 139 / 140 | - | - | 12 | - | 0.86 / 1158.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| nz.jdc.nano.AralT 1.1 | 4 | 538 | 2.3% | 96.6% | 0.0% | 1.1% | 458 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| nz.jdc.nano.AralT 1.1 | 4 | 4 | n/a | 0 | 0.09 | 0 | 0 | 0 |

4 of 4 battles trusted.
