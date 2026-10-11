# dans.Cinnamon 1.2 (rank930-band6) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 96.3% | 100.0% | 92.2% | 35 / 35 | - | - | 0 | - | 0.86 / 665.1 | 92.1% | +4.2 |
| 2 | 95.2% | 100.0% | 90.1% | 35 / 35 | - | - | 2 | - | 0.85 / 622.8 | 91.9% | +3.3 |
| 3 | 92.6% | 100.0% | 85.4% | 35 / 35 | - | - | 4 | - | 0.83 / 686.5 | 91.5% | +1.1 |
| 4 | 90.9% | 100.0% | 82.1% | 35 / 35 | - | - | 1 | - | 0.85 / 922.6 | 95.3% | -4.3 |

Mean score share 93.8% ± 3.9, baseline 92.7% ± 2.8, paired diff +1.1 ± 6.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 7 over 4 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dans.Cinnamon 1.2 | rank930-band6 | 93.8% ± 3.9 | 100.0% ± 0.0 | 87.5% ± 7.2 | 140 / 140 | - | - | 7 | - | 0.86 / 922.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| dans.Cinnamon 1.2 | 4 | 312 | 0.0% | 98.9% | 1.1% | 0.0% | 426 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dans.Cinnamon 1.2 | 4 | 4 | n/a | 0 | 0.05 | 0 | 0 | 0 |

4 of 4 battles trusted.
