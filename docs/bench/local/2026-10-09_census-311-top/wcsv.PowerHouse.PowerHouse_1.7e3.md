# wcsv.PowerHouse.PowerHouse 1.7e3 (rank46-band2) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 60.8% | 71.4% | 51.0% | 25 / 35 | - | - | 4 | - | 0.82 / 1002.4 | 65.5% | -4.8 |
| 2 | 65.2% | 82.9% | 49.1% | 29 / 35 | - | - | 29 | - | 1.08 / 1361.7 | 60.9% | +4.3 |
| 3 | 51.3% | 60.0% | 43.9% | 21 / 35 | - | - | 22 | - | 1.06 / 42.7 | 64.2% | -13.0 |
| 4 | 61.1% | 74.3% | 49.5% | 26 / 35 | - | - | 36 | - | 1.09 / 85.1 | 67.2% | -6.1 |

Mean score share 59.6% ± 9.4, baseline 64.5% ± 4.2, paired diff -4.9 ± 11.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 91 over 4 battles (22.8 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | rank46-band2 | 59.6% ± 9.4 | 72.1% ± 15.0 | 48.4% ± 5.0 | 101 / 140 | - | - | 91 | - | 1.09 / 1361.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 4 | 1966 | 24.8% | 64.6% | 0.0% | 10.6% | 836 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 4 | 4 | n/a | 0 | 0.65 | 0 | 0 | 0 |

4 of 4 battles trusted.
