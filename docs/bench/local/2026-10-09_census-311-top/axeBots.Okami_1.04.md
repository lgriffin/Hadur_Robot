# axeBots.Okami 1.04 (rank104-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 64.4% | 74.3% | 55.6% | 26 / 35 | - | - | 52 | - | 1.34 / 1670.2 | 69.9% | -5.5 |
| 2 | 60.2% | 65.7% | 55.6% | 23 / 35 | - | - | 71 | - | 1.38 / 3108.3 | 72.8% | -12.6 |
| 3 | 63.4% | 74.3% | 54.2% | 26 / 35 | - | - | 84 | - | 1.41 / 1041.3 | 69.1% | -5.7 |
| 4 | 55.0% | 60.0% | 51.1% | 21 / 35 | - | - | 57 | - | 1.37 / 3154.3 | 73.4% | -18.5 |

Mean score share 60.7% ± 6.8, baseline 71.3% ± 3.4, paired diff -10.6 ± 9.9.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 264 over 4 battles (66.0 per battle, most in one battle 84). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| axeBots.Okami 1.04 | rank104-band3 | 60.7% ± 6.8 | 68.6% ± 11.1 | 54.1% ± 3.3 | 96 / 140 | - | - | 264 | - | 1.41 / 3154.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| axeBots.Okami 1.04 | 4 | 2050 | 26.8% | 61.5% | 0.0% | 11.7% | 969 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| axeBots.Okami 1.04 | 4 | 2 | n/a | 0 | 1.89 | 0 | 0 | 0 |

2 of 4 battles trusted.
