# KiraNL.Cataris 1.0 (rank439-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 76.5% | 91.4% | 62.6% | 32 / 35 | - | - | 27 | - | 1.04 / 35.8 | 77.8% | -1.3 |
| 2 | 73.7% | 88.6% | 61.1% | 31 / 35 | - | - | 5 | - | 0.97 / 49.2 | 76.4% | -2.6 |
| 3 | 80.6% | 97.1% | 65.3% | 34 / 35 | - | - | 8 | - | 1.02 / 40.3 | 87.2% | -6.6 |
| 4 | 80.5% | 97.1% | 64.7% | 34 / 35 | - | - | 12 | - | 0.97 / 122.9 | 80.9% | -0.4 |

Mean score share 77.8% ± 5.3, baseline 80.6% ± 7.6, paired diff -2.7 ± 4.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 52 over 4 battles (13.0 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| KiraNL.Cataris 1.0 | rank439-band5 | 77.8% ± 5.3 | 93.6% ± 6.8 | 63.4% ± 3.1 | 131 / 140 | - | - | 52 | - | 1.04 / 122.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| KiraNL.Cataris 1.0 | 4 | 1133 | 9.9% | 85.5% | 0.0% | 4.5% | 631 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| KiraNL.Cataris 1.0 | 4 | 4 | n/a | 0 | 0.37 | 0 | 0 | 0 |

4 of 4 battles trusted.
