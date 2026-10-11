# unarmedlad.nano.VirginSteele 2.2 (rank541-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 90.1% | 100.0% | 79.5% | 35 / 35 | - | - | 14 | - | 0.97 / 354.6 | 87.1% | +3.0 |
| 2 | 85.7% | 97.1% | 74.0% | 34 / 35 | - | - | 10 | - | 1.00 / 1112.4 | 81.4% | +4.2 |
| 3 | 87.7% | 100.0% | 74.8% | 35 / 35 | - | - | 11 | - | 0.98 / 882.9 | 88.7% | -1.0 |
| 4 | 88.1% | 97.1% | 78.9% | 34 / 35 | - | - | 5 | - | 0.95 / 1213.9 | 89.0% | -0.9 |

Mean score share 87.9% ± 2.9, baseline 86.6% ± 5.6, paired diff +1.3 ± 4.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 40 over 4 battles (10.0 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| unarmedlad.nano.VirginSteele 2.2 | rank541-band5 | 87.9% ± 2.9 | 98.6% ± 2.6 | 76.8% ± 4.5 | 138 / 140 | - | - | 40 | - | 1.00 / 1213.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| unarmedlad.nano.VirginSteele 2.2 | 4 | 587 | 4.3% | 93.9% | 0.0% | 1.8% | 583 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| unarmedlad.nano.VirginSteele 2.2 | 4 | 4 | n/a | 0 | 0.29 | 0 | 0 | 0 |

4 of 4 battles trusted.
