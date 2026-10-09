# dummy.mini.Parakeet 2.40 (rank407-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 80.2% | 91.4% | 69.8% | 32 / 35 | - | - | 22 | - | 0.93 / 1628.2 | 80.0% | +0.2 |
| 2 | 81.9% | 91.4% | 71.6% | 32 / 35 | - | - | 35 | - | 0.93 / 1055.4 | 82.4% | -0.5 |
| 3 | 77.0% | 88.6% | 65.0% | 31 / 35 | - | - | 32 | - | 0.95 / 1611.0 | 78.8% | -1.8 |
| 4 | 82.1% | 91.4% | 72.2% | 32 / 35 | - | - | 40 | - | 0.98 / 1663.2 | 82.1% | +0.0 |

Mean score share 80.3% ± 3.8, baseline 80.8% ± 2.8, paired diff -0.5 ± 1.4.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 129 over 4 battles (32.3 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dummy.mini.Parakeet 2.40 | rank407-band5 | 80.3% ± 3.8 | 90.7% ± 2.3 | 69.7% ± 5.2 | 127 / 140 | - | - | 129 | - | 0.98 / 1663.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| dummy.mini.Parakeet 2.40 | 4 | 966 | 16.8% | 77.0% | 0.0% | 6.1% | 873 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dummy.mini.Parakeet 2.40 | 4 | 4 | n/a | 0 | 0.92 | 0 | 0 | 0 |

4 of 4 battles trusted.
