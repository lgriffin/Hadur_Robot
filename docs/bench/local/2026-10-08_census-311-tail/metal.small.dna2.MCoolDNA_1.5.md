# metal.small.dna2.MCoolDNA 1.5 (rank210-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 76.5% | 91.4% | 62.9% | 32 / 35 | - | - | 10 | - | 1.01 / 754.3 | 89.6% | -13.2 |
| 2 | 81.9% | 100.0% | 63.5% | 35 / 35 | - | - | 15 | - | 1.02 / 478.0 | 90.4% | -8.5 |
| 3 | 78.2% | 94.3% | 63.9% | 33 / 35 | - | - | 14 | - | 1.02 / 907.7 | 88.7% | -10.5 |
| 4 | 76.1% | 91.4% | 62.0% | 32 / 35 | - | - | 10 | - | 0.98 / 568.8 | 95.3% | -19.2 |

Mean score share 78.2% ± 4.2, baseline 91.0% ± 4.7, paired diff -12.8 ± 7.4.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 49 over 4 battles (12.3 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| metal.small.dna2.MCoolDNA 1.5 | rank210-band4 | 78.2% ± 4.2 | 94.3% ± 6.4 | 63.1% ± 1.3 | 132 / 140 | - | - | 49 | - | 1.02 / 907.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| metal.small.dna2.MCoolDNA 1.5 | 4 | 1101 | 9.1% | 86.8% | 0.0% | 4.2% | 688 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| metal.small.dna2.MCoolDNA 1.5 | 4 | 4 | n/a | 0 | 0.35 | 0 | 0 | 0 |

4 of 4 battles trusted.
