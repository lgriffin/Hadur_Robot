# simonton.mega.SniperFrog 1.0.fix2 (rank72-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 64.8% | 80.0% | 51.1% | 28 / 35 | - | - | 13 | - | 1.06 / 655.6 | 95.3% | -30.5 |
| 2 | 63.2% | 74.3% | 54.0% | 26 / 35 | - | - | 13 | - | 1.18 / 295.6 | 91.1% | -27.9 |
| 3 | 70.4% | 82.9% | 59.3% | 29 / 35 | - | - | 7 | - | 1.00 / 1014.2 | 95.0% | -24.7 |
| 4 | 72.7% | 88.6% | 58.5% | 31 / 35 | - | - | 20 | - | 1.17 / 1130.2 | 95.8% | -23.1 |

Mean score share 67.8% ± 7.2, baseline 94.3% ± 3.4, paired diff -26.5 ± 5.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 53 over 4 battles (13.3 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| simonton.mega.SniperFrog 1.0.fix2 | rank72-band3 | 67.8% ± 7.2 | 81.4% ± 9.5 | 55.7% ± 6.1 | 114 / 140 | - | - | 53 | - | 1.18 / 1130.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| simonton.mega.SniperFrog 1.0.fix2 | 4 | 1639 | 19.8% | 71.3% | 0.0% | 8.8% | 779 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| simonton.mega.SniperFrog 1.0.fix2 | 4 | 4 | n/a | 0 | 0.38 | 0 | 0 | 0 |

4 of 4 battles trusted.
