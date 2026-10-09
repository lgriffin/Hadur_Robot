# kinsen.nano.Charp 1.0 (rank422-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 78.7% | 94.3% | 61.6% | 33 / 35 | - | - | 8 | - | 1.02 / 644.4 | 75.6% | +3.2 |
| 2 | 79.2% | 97.1% | 60.2% | 34 / 35 | - | - | 6 | - | 1.00 / 48.0 | 75.5% | +3.7 |
| 3 | 79.8% | 94.3% | 61.3% | 33 / 35 | - | - | 2 | - | 0.99 / 714.6 | 79.7% | +0.0 |
| 4 | 84.8% | 100.0% | 64.9% | 35 / 35 | - | - | 6 | - | 0.97 / 69.0 | 72.7% | +12.1 |

Mean score share 80.6% ± 4.5, baseline 75.8% ± 4.6, paired diff +4.8 ± 8.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 22 over 4 battles (5.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Charp 1.0 | rank422-band5 | 80.6% ± 4.5 | 96.4% ± 4.4 | 62.0% ± 3.2 | 135 / 140 | - | - | 22 | - | 1.02 / 714.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| kinsen.nano.Charp 1.0 | 4 | 839 | 7.4% | 89.0% | 0.1% | 3.5% | 548 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Charp 1.0 | 4 | 4 | n/a | 0 | 0.16 | 0 | 0 | 0 |

4 of 4 battles trusted.
