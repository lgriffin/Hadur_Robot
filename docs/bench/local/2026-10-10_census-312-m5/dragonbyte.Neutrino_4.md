# dragonbyte.Neutrino 4 (rank383-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 85.4% | 62.9% | 99.2% | 22 / 35 | - | - | 157 | - | 1.19 / 3536.3 | 74.0% | +11.4 |
| 2 | 80.2% | 51.4% | 99.1% | 18 / 35 | - | - | 184 | - | 1.16 / 4182.7 | 78.0% | +2.2 |
| 3 | 81.7% | 54.3% | 99.0% | 19 / 35 | - | - | 191 | - | 1.17 / 3339.0 | 83.0% | -1.3 |
| 4 | 79.9% | 51.4% | 98.6% | 18 / 35 | - | - | 149 | - | 1.12 / 4086.0 | 84.0% | -4.1 |

Mean score share 81.8% ± 4.0, baseline 79.7% ± 7.4, paired diff +2.1 ± 10.7.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 681 over 4 battles (170.3 per battle, most in one battle 191). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dragonbyte.Neutrino 4 | rank383-band4 | 81.8% ± 4.0 | 55.0% ± 8.6 | 99.0% ± 0.4 | 77 / 140 | - | - | 681 | - | 1.19 / 4182.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| dragonbyte.Neutrino 4 | 4 | 975 | 80.7% | 3.1% | 0.0% | 16.1% | 2058 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dragonbyte.Neutrino 4 | 4 | 0 | n/a | 0 | 4.86 | 0 | 0 | 0 |

0 of 4 battles trusted.
