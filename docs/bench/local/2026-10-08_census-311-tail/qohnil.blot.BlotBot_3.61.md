# qohnil.blot.BlotBot 3.61 (rank349-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 78.4% | 91.4% | 68.7% | 32 / 35 | - | - | 5 | - | 1.06 / 749.1 | 79.6% | -1.2 |
| 2 | 77.3% | 94.3% | 65.5% | 33 / 35 | - | - | 9 | - | 1.04 / 33.9 | 86.4% | -9.1 |
| 3 | 76.3% | 88.6% | 67.5% | 31 / 35 | - | - | 3 | - | 0.98 / 215.8 | 83.6% | -7.2 |
| 4 | 82.0% | 97.1% | 70.0% | 34 / 35 | - | - | 7 | - | 1.02 / 33.5 | 85.7% | -3.6 |

Mean score share 78.5% ± 4.0, baseline 83.8% ± 4.9, paired diff -5.3 ± 5.7.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 24 over 4 battles (6.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| qohnil.blot.BlotBot 3.61 | rank349-band4 | 78.5% ± 4.0 | 92.9% ± 5.9 | 67.9% ± 3.0 | 130 / 140 | - | - | 24 | - | 1.06 / 749.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| qohnil.blot.BlotBot 3.61 | 4 | 1303 | 9.6% | 85.1% | 0.2% | 5.1% | 576 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| qohnil.blot.BlotBot 3.61 | 4 | 4 | n/a | 0 | 0.17 | 0 | 0 | 0 |

4 of 4 battles trusted.
