# ags.polished.PolishedRuby 1 (rank181-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 69.1% | 80.0% | 57.9% | 28 / 35 | - | - | 22 | - | 1.13 / 779.6 | 93.7% | -24.5 |
| 2 | 76.8% | 94.3% | 58.4% | 33 / 35 | - | - | 26 | - | 1.24 / 3362.7 | 93.2% | -16.5 |
| 3 | 69.8% | 82.9% | 56.3% | 29 / 35 | - | - | 35 | - | 1.15 / 707.1 | 92.5% | -22.7 |
| 4 | 75.7% | 88.6% | 62.3% | 31 / 35 | - | - | 22 | - | 1.23 / 3380.5 | 93.6% | -17.9 |

Mean score share 72.8% ± 6.3, baseline 93.2% ± 0.9, paired diff -20.4 ± 6.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 105 over 4 battles (26.3 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.polished.PolishedRuby 1 | rank181-band3 | 72.8% ± 6.3 | 86.4% ± 10.1 | 58.7% ± 4.1 | 121 / 140 | - | - | 105 | - | 1.24 / 3380.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ags.polished.PolishedRuby 1 | 4 | 1263 | 18.8% | 73.8% | 0.1% | 7.3% | 1023 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ags.polished.PolishedRuby 1 | 4 | 4 | n/a | 0 | 0.75 | 0 | 0 | 0 |

4 of 4 battles trusted.
