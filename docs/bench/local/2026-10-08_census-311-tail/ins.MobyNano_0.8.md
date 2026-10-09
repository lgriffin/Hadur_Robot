# ins.MobyNano 0.8 (rank497-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 81.8% | 97.1% | 65.4% | 34 / 35 | - | - | 8 | - | 0.95 / 869.9 | 84.7% | -2.9 |
| 2 | 85.0% | 100.0% | 69.8% | 35 / 35 | - | - | 4 | - | 0.95 / 710.2 | 87.5% | -2.5 |
| 3 | 86.3% | 100.0% | 71.2% | 35 / 35 | - | - | 2 | - | 0.89 / 874.7 | 81.7% | +4.6 |
| 4 | 85.3% | 100.0% | 69.8% | 35 / 35 | - | - | 14 | - | 0.93 / 519.0 | 83.4% | +1.9 |

Mean score share 84.6% ± 3.1, baseline 84.3% ± 3.9, paired diff +0.3 ± 5.7.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 28 over 4 battles (7.0 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ins.MobyNano 0.8 | rank497-band5 | 84.6% ± 3.1 | 99.3% ± 2.3 | 69.1% ± 4.0 | 139 / 140 | - | - | 28 | - | 0.95 / 874.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ins.MobyNano 0.8 | 4 | 723 | 1.7% | 97.5% | 0.0% | 0.8% | 522 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ins.MobyNano 0.8 | 4 | 4 | n/a | 0 | 0.20 | 0 | 0 | 0 |

4 of 4 battles trusted.
