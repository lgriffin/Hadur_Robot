# dsekercioglu.mega.WhiteFang 2.8.1 (rank16-band2) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 64.6% | 74.3% | 55.1% | 26 / 35 | - | - | 42 | - | 1.16 / 686.2 | 75.0% | -10.5 |
| 2 | 53.8% | 58.8% | 49.5% | 21 / 35 | - | - | 32 | - | 1.11 / 853.3 | 71.0% | -17.2 |
| 3 | 52.5% | 60.0% | 45.8% | 21 / 35 | - | - | 34 | - | 1.20 / 1056.5 | 74.4% | -21.9 |
| 4 | 58.5% | 65.7% | 51.6% | 23 / 35 | - | - | 45 | - | 1.17 / 403.0 | 66.6% | -8.0 |

Mean score share 57.3% ± 8.7, baseline 71.8% ± 6.2, paired diff -14.4 ± 10.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 153 over 4 battles (38.3 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.WhiteFang 2.8.1 | rank16-band2 | 57.3% ± 8.7 | 64.7% ± 11.2 | 50.5% ± 6.2 | 91 / 140 | - | - | 153 | - | 1.20 / 1056.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.WhiteFang 2.8.1 | 4 | 2063 | 29.7% | 58.0% | 0.0% | 12.3% | 1094 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.WhiteFang 2.8.1 | 4 | 4 | n/a | 0 | 1.09 | 0 | 0 | 0 |

4 of 4 battles trusted.
