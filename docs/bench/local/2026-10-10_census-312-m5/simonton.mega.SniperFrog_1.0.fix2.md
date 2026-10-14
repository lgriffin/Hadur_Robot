# simonton.mega.SniperFrog 1.0.fix2 (rank72-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 72.1% | 85.7% | 59.5% | 30 / 35 | - | - | 7 | - | 1.09 / 1508.8 | 94.7% | -22.6 |
| 2 | 74.6% | 91.4% | 59.7% | 32 / 35 | - | - | 8 | - | 1.00 / 2579.7 | 93.9% | -19.2 |
| 3 | 64.1% | 77.1% | 52.8% | 27 / 35 | - | - | 14 | - | 1.14 / 3046.8 | 94.1% | -30.1 |
| 4 | 69.9% | 82.9% | 58.0% | 29 / 35 | - | - | 13 | - | 0.98 / 2547.8 | 93.7% | -23.8 |

Mean score share 70.2% ± 7.2, baseline 94.1% ± 0.7, paired diff -23.9 ± 7.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 42 over 4 battles (10.5 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| simonton.mega.SniperFrog 1.0.fix2 | rank72-band3 | 70.2% ± 7.2 | 84.3% ± 9.5 | 57.5% ± 5.1 | 118 / 140 | - | - | 42 | - | 1.14 / 3046.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| simonton.mega.SniperFrog 1.0.fix2 | 4 | 1508 | 18.2% | 73.7% | 0.0% | 8.0% | 776 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| simonton.mega.SniperFrog 1.0.fix2 | 4 | 4 | n/a | 0 | 0.30 | 0 | 0 | 0 |

4 of 4 battles trusted.
