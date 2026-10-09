# jk.precise.Wintermute 0.8 (rank28-band2) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 69.1% | 82.9% | 56.4% | 29 / 35 | - | - | 12 | - | 1.19 / 288.4 | 59.1% | +10.0 |
| 2 | 54.1% | 62.9% | 47.1% | 22 / 35 | - | - | 10 | - | 1.18 / 828.9 | 58.6% | -4.5 |
| 3 | 58.0% | 65.7% | 51.1% | 23 / 35 | - | - | 9 | - | 1.20 / 408.3 | 66.5% | -8.5 |
| 4 | 64.1% | 74.3% | 54.6% | 26 / 35 | - | - | 5 | - | 1.18 / 880.2 | 59.8% | +4.4 |

Mean score share 61.3% ± 10.5, baseline 61.0% ± 5.9, paired diff +0.3 ± 13.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 36 over 4 battles (9.0 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jk.precise.Wintermute 0.8 | rank28-band2 | 61.3% ± 10.5 | 71.4% ± 14.4 | 52.3% ± 6.5 | 100 / 140 | - | - | 36 | - | 1.20 / 880.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| jk.precise.Wintermute 0.8 | 4 | 1930 | 25.9% | 63.1% | 0.0% | 11.0% | 851 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jk.precise.Wintermute 0.8 | 4 | 4 | n/a | 0 | 0.26 | 0 | 0 | 0 |

4 of 4 battles trusted.
