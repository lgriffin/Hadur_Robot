# jk.mini.CunobelinDC 1.2 (rank41-band2) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 74.3% | 91.4% | 58.0% | 32 / 35 | - | - | 26 | - | 1.17 / 132.0 | 69.1% | +5.2 |
| 2 | 70.3% | 85.7% | 55.2% | 30 / 35 | - | - | 33 | - | 1.14 / 957.6 | 71.9% | -1.6 |
| 3 | 66.8% | 85.7% | 50.3% | 30 / 35 | - | - | 32 | - | 1.18 / 206.3 | 62.7% | +4.1 |
| 4 | 72.8% | 85.7% | 59.5% | 30 / 35 | - | - | 16 | - | 1.14 / 757.4 | 67.4% | +5.4 |

Mean score share 71.1% ± 5.2, baseline 67.8% ± 6.1, paired diff +3.3 ± 5.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 107 over 4 battles (26.8 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jk.mini.CunobelinDC 1.2 | rank41-band2 | 71.1% ± 5.2 | 87.1% ± 4.5 | 55.8% ± 6.5 | 122 / 140 | - | - | 107 | - | 1.18 / 957.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| jk.mini.CunobelinDC 1.2 | 4 | 1406 | 16.0% | 77.1% | 0.0% | 6.9% | 951 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jk.mini.CunobelinDC 1.2 | 4 | 4 | n/a | 0 | 0.76 | 0 | 0 | 0 |

4 of 4 battles trusted.
