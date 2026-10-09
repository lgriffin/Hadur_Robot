# pez.mini2.Pugilist 2.5.15 (rank73-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 74.4% | 82.9% | 64.9% | 29 / 35 | - | - | 51 | - | 1.21 / 908.4 | 65.5% | +8.9 |
| 2 | 68.5% | 71.4% | 64.5% | 25 / 35 | - | - | 90 | - | 1.24 / 913.2 | 67.2% | +1.3 |
| 3 | 64.1% | 65.7% | 61.6% | 23 / 35 | - | - | 111 | - | 1.29 / 971.8 | 63.9% | +0.2 |
| 4 | 59.1% | 57.1% | 60.3% | 20 / 35 | - | - | 156 | - | 1.29 / 901.4 | 61.0% | -1.8 |

Mean score share 66.5% ± 10.3, baseline 64.4% ± 4.2, paired diff +2.2 ± 7.5.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 408 over 4 battles (102.0 per battle, most in one battle 156). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pez.mini2.Pugilist 2.5.15 | rank73-band3 | 66.5% ± 10.3 | 69.3% ± 17.2 | 62.8% ± 3.6 | 97 / 140 | - | - | 408 | - | 1.29 / 971.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| pez.mini2.Pugilist 2.5.15 | 4 | 1561 | 34.4% | 54.2% | 0.0% | 11.4% | 1426 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pez.mini2.Pugilist 2.5.15 | 4 | 1 | n/a | 0 | 2.91 | 0 | 0 | 0 |

1 of 4 battles trusted.
