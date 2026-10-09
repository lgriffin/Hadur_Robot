# sheldor.nano.Feint 1.2.1 (rank377-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 78.6% | 97.1% | 60.8% | 34 / 35 | - | - | 5 | - | 0.94 / 4320.9 | 78.7% | -0.1 |
| 2 | 81.4% | 97.1% | 65.0% | 34 / 35 | - | - | 3 | - | 0.89 / 941.8 | 82.0% | -0.6 |
| 3 | 69.9% | 82.9% | 57.2% | 29 / 35 | - | - | 5 | - | 0.99 / 1184.8 | 76.9% | -7.0 |
| 4 | 77.6% | 91.4% | 64.3% | 32 / 35 | - | - | 1 | - | 0.85 / 860.0 | 73.1% | +4.5 |

Mean score share 76.8% ± 7.8, baseline 77.7% ± 5.9, paired diff -0.8 ± 7.5.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 14 over 4 battles (3.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sheldor.nano.Feint 1.2.1 | rank377-band4 | 76.8% ± 7.8 | 92.1% ± 10.7 | 61.8% ± 5.7 | 129 / 140 | - | - | 14 | - | 0.99 / 4320.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| sheldor.nano.Feint 1.2.1 | 4 | 1124 | 12.2% | 82.5% | 0.0% | 5.2% | 620 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sheldor.nano.Feint 1.2.1 | 4 | 4 | n/a | 0 | 0.10 | 0 | 0 | 0 |

4 of 4 battles trusted.
