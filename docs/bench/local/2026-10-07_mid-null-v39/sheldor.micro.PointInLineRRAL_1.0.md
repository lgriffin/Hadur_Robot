# sheldor.micro.PointInLineRRAL 1.0 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 90.6% | 100.0% | 77.2% | 35 / 35 | - | - | 16 | - | 0.95 / 40.7 | 85.8% | +4.8 |
| 2 | 93.6% | 100.0% | 84.4% | 35 / 35 | - | - | 22 | - | 1.03 / 37.5 | 83.4% | +10.3 |
| 3 | 91.1% | 100.0% | 78.3% | 35 / 35 | - | - | 15 | - | 0.91 / 41.8 | 83.9% | +7.2 |
| 4 | 93.5% | 100.0% | 84.6% | 35 / 35 | - | - | 32 | - | 1.03 / 41.5 | 90.7% | +2.8 |
| 5 | 89.2% | 100.0% | 74.1% | 35 / 35 | - | - | 23 | - | 0.95 / 42.4 | 83.1% | +6.0 |
| 6 | 89.7% | 97.1% | 79.4% | 34 / 35 | - | - | 18 | - | 0.89 / 38.3 | 84.3% | +5.4 |
| 7 | 90.3% | 100.0% | 76.5% | 35 / 35 | - | - | 16 | - | 0.91 / 34.5 | 90.2% | +0.1 |
| 8 | 91.6% | 100.0% | 80.3% | 35 / 35 | - | - | 47 | - | 1.06 / 43.2 | 85.6% | +6.0 |

Mean score share 91.2% ± 1.4, baseline 85.9% ± 2.5, paired diff +5.3 ± 2.5.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 189 over 8 battles (23.6 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sheldor.micro.PointInLineRRAL 1.0 | mid | 91.2% ± 1.4 | 99.6% ± 0.8 | 79.3% ± 3.1 | 279 / 280 | - | - | 189 | - | 1.06 / 43.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 359 | 1.7% | 97.7% | 0.0% | 0.6% | 917 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 8 | n/a | 0 | 0.68 | 0 | 0 | 0 |

8 of 8 battles trusted.
