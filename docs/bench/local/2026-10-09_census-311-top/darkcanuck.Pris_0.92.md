# darkcanuck.Pris 0.92 (rank26-band2) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 67.5% | 80.0% | 55.9% | 28 / 35 | - | - | 8 | - | 1.51 / 706.9 | 58.8% | +8.7 |
| 2 | 73.5% | 88.6% | 60.4% | 31 / 35 | - | - | 4 | - | 1.65 / 1207.5 | 72.9% | +0.6 |
| 3 | 63.7% | 77.1% | 52.8% | 27 / 35 | - | - | 3 | - | 1.59 / 651.9 | 63.4% | +0.3 |
| 4 | 66.0% | 77.1% | 55.8% | 27 / 35 | - | - | 3 | - | 1.53 / 664.3 | 57.9% | +8.1 |

Mean score share 67.7% ± 6.7, baseline 63.3% ± 10.9, paired diff +4.4 ± 7.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 18 over 4 battles (4.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| darkcanuck.Pris 0.92 | rank26-band2 | 67.7% ± 6.7 | 80.7% ± 8.6 | 56.2% ± 5.0 | 113 / 140 | - | - | 18 | - | 1.65 / 1207.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| darkcanuck.Pris 0.92 | 4 | 1651 | 20.4% | 70.7% | 0.0% | 8.9% | 772 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| darkcanuck.Pris 0.92 | 4 | 4 | n/a | 0 | 0.13 | 0 | 0 | 0 |

4 of 4 battles trusted.
