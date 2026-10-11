# pc.Wavelet 1.5 (rank13-band2) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 44.3% | 37.1% | 50.7% | 13 / 35 | - | - | 89 | - | 1.81 / 515.9 | 51.9% | -7.6 |
| 2 | 38.0% | 25.7% | 49.2% | 9 / 35 | - | - | 123 | - | 1.91 / 887.5 | 43.3% | -5.3 |
| 3 | 42.2% | 28.6% | 52.7% | 10 / 35 | - | - | 113 | - | 1.88 / 498.3 | 44.0% | -1.8 |
| 4 | 38.3% | 22.9% | 52.0% | 8 / 35 | - | - | 143 | - | 1.92 / 1085.4 | 47.7% | -9.4 |

Mean score share 40.7% ± 4.9, baseline 46.7% ± 6.3, paired diff -6.0 ± 5.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 468 over 4 battles (117.0 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pc.Wavelet 1.5 | rank13-band2 | 40.7% ± 4.9 | 28.6% ± 9.8 | 51.2% ± 2.4 | 40 / 140 | - | - | 468 | - | 1.92 / 1085.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| pc.Wavelet 1.5 | 4 | 3001 | 41.6% | 42.7% | 0.0% | 15.6% | 1711 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pc.Wavelet 1.5 | 4 | 0 | n/a | 0 | 3.34 | 0 | 0 | 0 |

0 of 4 battles trusted.
