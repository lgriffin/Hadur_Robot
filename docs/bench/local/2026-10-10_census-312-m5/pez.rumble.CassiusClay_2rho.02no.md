# pez.rumble.CassiusClay 2rho.02no (rank35-band2) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 58.8% | 62.9% | 54.7% | 22 / 35 | - | - | 42 | - | 1.24 / 1249.3 | 72.3% | -13.5 |
| 2 | 57.1% | 60.0% | 53.8% | 21 / 35 | - | - | 47 | - | 1.19 / 1789.5 | 64.0% | -6.8 |
| 3 | 62.2% | 68.6% | 55.5% | 24 / 35 | - | - | 55 | - | 1.23 / 1332.6 | 63.9% | -1.7 |
| 4 | 50.6% | 51.4% | 50.1% | 18 / 35 | - | - | 81 | - | 1.28 / 347.4 | 51.2% | -0.6 |

Mean score share 57.2% ± 7.8, baseline 62.8% ± 13.8, paired diff -5.7 ± 9.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 225 over 4 battles (56.3 per battle, most in one battle 81). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pez.rumble.CassiusClay 2rho.02no | rank35-band2 | 57.2% ± 7.8 | 60.7% ± 11.4 | 53.6% ± 3.8 | 85 / 140 | - | - | 225 | - | 1.28 / 1789.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| pez.rumble.CassiusClay 2rho.02no | 4 | 2070 | 33.2% | 54.5% | 0.0% | 12.2% | 1268 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pez.rumble.CassiusClay 2rho.02no | 4 | 3 | n/a | 0 | 1.61 | 0 | 0 | 0 |

3 of 4 battles trusted.
