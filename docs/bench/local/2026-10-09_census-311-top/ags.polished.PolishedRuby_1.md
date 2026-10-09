# ags.polished.PolishedRuby 1 (rank181-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 67.7% | 77.1% | 57.9% | 27 / 35 | - | - | 26 | - | 1.32 / 1126.7 | 91.3% | -23.6 |
| 2 | 77.2% | 91.4% | 60.9% | 32 / 35 | - | - | 19 | - | 1.26 / 1199.4 | 88.5% | -11.3 |
| 3 | 69.8% | 82.9% | 56.7% | 29 / 35 | - | - | 29 | - | 1.32 / 1039.1 | 92.4% | -22.7 |
| 4 | 75.1% | 88.6% | 60.5% | 31 / 35 | - | - | 34 | - | 1.26 / 1781.7 | 11.7% | +63.4 |

Mean score share 72.4% ± 7.0, baseline 71.0% ± 63.0, paired diff +1.5 ± 66.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 108 over 4 battles (27.0 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.polished.PolishedRuby 1 | rank181-band3 | 72.4% ± 7.0 | 85.0% ± 10.1 | 59.0% ± 3.2 | 119 / 140 | - | - | 108 | - | 1.32 / 1781.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ags.polished.PolishedRuby 1 | 4 | 1264 | 20.8% | 71.1% | 0.0% | 8.1% | 1011 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ags.polished.PolishedRuby 1 | 4 | 4 | n/a | 0 | 0.77 | 0 | 0 | 0 |

4 of 4 battles trusted.
