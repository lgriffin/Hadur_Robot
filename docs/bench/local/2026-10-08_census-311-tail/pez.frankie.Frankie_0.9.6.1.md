# pez.frankie.Frankie 0.9.6.1 (rank287-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 72.4% | 85.7% | 57.8% | 30 / 35 | - | - | 11 | - | 1.00 / 807.2 | 87.0% | -14.6 |
| 2 | 76.9% | 88.6% | 63.7% | 31 / 35 | - | - | 5 | - | 0.96 / 1659.1 | 78.4% | -1.5 |
| 3 | 84.2% | 97.1% | 68.1% | 34 / 35 | - | - | 12 | - | 0.98 / 1444.4 | 77.1% | +7.1 |
| 4 | 68.0% | 80.0% | 56.5% | 28 / 35 | - | - | 10 | - | 1.03 / 490.2 | 79.4% | -11.3 |

Mean score share 75.4% ± 10.9, baseline 80.5% ± 7.1, paired diff -5.1 ± 15.7.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 38 over 4 battles (9.5 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pez.frankie.Frankie 0.9.6.1 | rank287-band4 | 75.4% ± 10.9 | 87.9% ± 11.4 | 61.5% ± 8.6 | 123 / 140 | - | - | 38 | - | 1.03 / 1659.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| pez.frankie.Frankie 0.9.6.1 | 4 | 1116 | 19.0% | 72.8% | 0.0% | 8.2% | 681 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pez.frankie.Frankie 0.9.6.1 | 4 | 4 | n/a | 0 | 0.27 | 0 | 0 | 0 |

4 of 4 battles trusted.
