# lrem.magic.TormentedAngel Antiquitie (rank456-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 82.8% | 97.1% | 68.0% | 34 / 35 | - | - | 18 | - | 0.97 / 1166.3 | 83.1% | -0.3 |
| 2 | 86.2% | 100.0% | 71.5% | 35 / 35 | - | - | 22 | - | 0.99 / 436.0 | 81.6% | +4.6 |
| 3 | 90.3% | 100.0% | 79.7% | 35 / 35 | - | - | 18 | - | 0.99 / 630.5 | 82.9% | +7.4 |
| 4 | 88.2% | 100.0% | 75.1% | 35 / 35 | - | - | 3 | - | 0.96 / 705.2 | 87.4% | +0.9 |

Mean score share 86.9% ± 5.1, baseline 83.8% ± 4.0, paired diff +3.1 ± 5.6.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 61 over 4 battles (15.3 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| lrem.magic.TormentedAngel Antiquitie | rank456-band5 | 86.9% ± 5.1 | 99.3% ± 2.3 | 73.5% ± 8.0 | 139 / 140 | - | - | 61 | - | 0.99 / 1166.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| lrem.magic.TormentedAngel Antiquitie | 4 | 615 | 2.0% | 97.0% | 0.0% | 0.9% | 626 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| lrem.magic.TormentedAngel Antiquitie | 4 | 4 | n/a | 0 | 0.44 | 0 | 0 | 0 |

4 of 4 battles trusted.
