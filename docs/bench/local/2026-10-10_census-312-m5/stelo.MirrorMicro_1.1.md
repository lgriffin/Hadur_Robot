# stelo.MirrorMicro 1.1 (rank605-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 79.6% | 94.3% | 63.8% | 33 / 35 | - | - | 42 | - | 0.94 / 1240.1 | 90.4% | -10.8 |
| 2 | 79.5% | 94.3% | 63.6% | 33 / 35 | - | - | 44 | - | 0.99 / 2386.3 | 91.5% | -12.0 |
| 3 | 83.4% | 100.0% | 65.6% | 35 / 35 | - | - | 26 | - | 0.95 / 4058.2 | 92.8% | -9.4 |
| 4 | 81.8% | 97.1% | 64.2% | 34 / 35 | - | - | 5 | - | 0.69 / 340.5 | 39.8% | +42.0 |

Mean score share 81.1% ± 2.9, baseline 78.6% ± 41.2, paired diff +2.5 ± 41.9.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 117 over 4 battles (29.3 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| stelo.MirrorMicro 1.1 | rank605-band5 | 81.1% ± 2.9 | 96.4% ± 4.4 | 64.3% ± 1.5 | 135 / 140 | - | - | 117 | - | 0.99 / 4058.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| stelo.MirrorMicro 1.1 | 4 | 862 | 7.2% | 90.2% | 0.1% | 2.4% | 1029 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| stelo.MirrorMicro 1.1 | 4 | 4 | n/a | 0 | 0.84 | 0 | 0 | 0 |

4 of 4 battles trusted.
