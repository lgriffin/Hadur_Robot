# robar.micro.Kirbyi 1.0 (rank341-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 77.5% | 91.4% | 66.0% | 32 / 35 | - | - | 11 | - | 1.01 / 828.3 | 81.0% | -3.5 |
| 2 | 67.9% | 80.0% | 58.2% | 28 / 35 | - | - | 7 | - | 1.00 / 104.6 | 88.0% | -20.1 |
| 3 | 76.5% | 91.4% | 64.2% | 32 / 35 | - | - | 7 | - | 1.00 / 1131.4 | 87.6% | -11.2 |
| 4 | 69.9% | 82.9% | 59.1% | 29 / 35 | - | - | 14 | - | 1.02 / 34.0 | 91.2% | -21.3 |

Mean score share 72.9% ± 7.6, baseline 86.9% ± 6.8, paired diff -14.0 ± 13.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 39 over 4 battles (9.8 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| robar.micro.Kirbyi 1.0 | rank341-band4 | 72.9% ± 7.6 | 86.4% ± 9.4 | 61.9% ± 6.1 | 121 / 140 | - | - | 39 | - | 1.02 / 1131.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| robar.micro.Kirbyi 1.0 | 4 | 1474 | 16.1% | 76.2% | 0.0% | 7.7% | 587 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| robar.micro.Kirbyi 1.0 | 4 | 4 | n/a | 0 | 0.28 | 0 | 0 | 0 |

4 of 4 battles trusted.
