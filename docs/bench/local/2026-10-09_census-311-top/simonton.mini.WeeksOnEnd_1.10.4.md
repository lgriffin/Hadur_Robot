# simonton.mini.WeeksOnEnd 1.10.4 (rank64-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 60.8% | 71.4% | 50.6% | 25 / 35 | - | - | 21 | - | 1.27 / 789.6 | 85.6% | -24.8 |
| 2 | 65.7% | 77.1% | 54.4% | 27 / 35 | - | - | 26 | - | 1.30 / 761.8 | 89.9% | -24.1 |
| 3 | 72.7% | 85.7% | 60.0% | 30 / 35 | - | - | 17 | - | 1.27 / 1006.3 | 88.1% | -15.4 |
| 4 | 61.7% | 74.3% | 50.4% | 26 / 35 | - | - | 31 | - | 1.29 / 718.1 | 92.9% | -31.2 |

Mean score share 65.2% ± 8.7, baseline 89.1% ± 4.9, paired diff -23.9 ± 10.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 95 over 4 battles (23.8 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| simonton.mini.WeeksOnEnd 1.10.4 | rank64-band3 | 65.2% ± 8.7 | 77.1% ± 9.8 | 53.8% ± 7.2 | 108 / 140 | - | - | 95 | - | 1.30 / 1006.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| simonton.mini.WeeksOnEnd 1.10.4 | 4 | 1661 | 24.1% | 66.0% | 0.0% | 9.9% | 1048 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| simonton.mini.WeeksOnEnd 1.10.4 | 4 | 4 | n/a | 0 | 0.68 | 0 | 0 | 0 |

4 of 4 battles trusted.
