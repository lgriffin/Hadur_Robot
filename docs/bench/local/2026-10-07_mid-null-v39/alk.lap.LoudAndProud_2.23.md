# alk.lap.LoudAndProud 2.23 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 88.2% | 100.0% | 73.0% | 35 / 35 | - | - | 13 | - | 1.28 / 30.9 | 84.9% | +3.3 |
| 2 | 84.3% | 100.0% | 66.1% | 35 / 35 | - | - | 19 | - | 1.25 / 30.8 | 80.4% | +3.9 |
| 3 | 92.8% | 100.0% | 83.9% | 35 / 35 | - | - | 10 | - | 1.28 / 30.7 | 77.9% | +14.9 |
| 4 | 84.3% | 97.1% | 67.4% | 34 / 35 | - | - | 17 | - | 1.24 / 30.7 | 80.4% | +4.0 |
| 5 | 88.9% | 100.0% | 73.6% | 35 / 35 | - | - | 14 | - | 1.21 / 30.3 | 83.6% | +5.3 |
| 6 | 86.1% | 97.1% | 72.2% | 34 / 35 | - | - | 7 | - | 1.16 / 30.1 | 77.2% | +8.9 |
| 7 | 87.5% | 100.0% | 70.5% | 35 / 35 | - | - | 13 | - | 1.18 / 32.9 | 81.2% | +6.3 |
| 8 | 90.9% | 100.0% | 78.3% | 35 / 35 | - | - | 9 | - | 1.15 / 33.0 | 76.0% | +14.9 |

Mean score share 87.9% ± 2.5, baseline 80.2% ± 2.6, paired diff +7.7 ± 4.0.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 102 over 8 battles (12.8 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| alk.lap.LoudAndProud 2.23 | mid | 87.9% ± 2.5 | 99.3% ± 1.1 | 73.1% ± 4.8 | 278 / 280 | - | - | 102 | - | 1.28 / 33.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| alk.lap.LoudAndProud 2.23 | 8 | 512 | 2.4% | 96.4% | 0.0% | 1.1% | 575 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| alk.lap.LoudAndProud 2.23 | 8 | 8 | n/a | 0 | 0.36 | 0 | 0 | 0 |

8 of 8 battles trusted.
