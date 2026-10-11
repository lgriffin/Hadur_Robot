# kawigi.mini.Fhqwhgads 1.1 (mid-shield) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 100.0% | 100.0% | 100.0% | 35 / 35 | - | - | 0 | - | 0.13 / 6.2 | 77.6% | +22.4 |
| 2 | 99.9% | 100.0% | 93.1% | 35 / 35 | - | - | 0 | - | 0.15 / 7.6 | 78.7% | +21.2 |
| 3 | 99.2% | 100.0% | 40.7% | 35 / 35 | - | - | 0 | - | 0.16 / 8.6 | 87.4% | +11.9 |
| 4 | 91.6% | 97.1% | 45.3% | 34 / 35 | - | - | 0 | - | 0.15 / 107.2 | 79.6% | +12.1 |
| 5 | 99.2% | 100.0% | 40.7% | 35 / 35 | - | - | 0 | - | 0.17 / 8.4 | 78.9% | +20.3 |
| 6 | 98.5% | 100.0% | 55.6% | 35 / 35 | - | - | 0 | - | 0.15 / 7.0 | 82.9% | +15.6 |
| 7 | 98.5% | 100.0% | 67.0% | 35 / 35 | - | - | 0 | - | 0.17 / 7.0 | 86.8% | +11.6 |
| 8 | 97.9% | 100.0% | 65.0% | 35 / 35 | - | - | 0 | - | 0.16 / 7.8 | 80.8% | +17.1 |

Mean score share 98.1% ± 2.3, baseline 81.6% ± 3.1, paired diff +16.5 ± 3.7.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kawigi.mini.Fhqwhgads 1.1 | mid-shield | 98.1% ± 2.3 | 99.6% ± 0.8 | 63.4% ± 19.1 | 279 / 280 | - | - | 0 | - | 0.17 / 107.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| kawigi.mini.Fhqwhgads 1.1 | 8 | 43 | 14.5% | 72.7% | 3.5% | 9.3% | 857 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kawigi.mini.Fhqwhgads 1.1 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |

8 of 8 battles trusted.
