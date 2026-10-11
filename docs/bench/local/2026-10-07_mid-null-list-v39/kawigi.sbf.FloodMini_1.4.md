# kawigi.sbf.FloodMini 1.4 (mid-shield) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 100.0% | 100.0% | 50.0% | 35 / 35 | - | - | 0 | - | 0.15 / 6.3 | 78.5% | +21.5 |
| 2 | 89.3% | 97.1% | 30.4% | 34 / 35 | - | - | 0 | - | 0.17 / 100.9 | 78.8% | +10.5 |
| 3 | 99.1% | 100.0% | 41.9% | 35 / 35 | - | - | 0 | - | 0.17 / 7.1 | 76.3% | +22.8 |
| 4 | 99.9% | 100.0% | 100.0% | 35 / 35 | - | - | 0 | - | 0.17 / 7.8 | 83.0% | +16.9 |
| 5 | 96.0% | 100.0% | 28.6% | 35 / 35 | - | - | 0 | - | 0.16 / 7.9 | 83.8% | +12.3 |
| 6 | 99.0% | 100.0% | 40.7% | 35 / 35 | - | - | 0 | - | 0.16 / 7.8 | 74.4% | +24.7 |
| 7 | 100.0% | 100.0% | 50.0% | 35 / 35 | - | - | 0 | - | 0.16 / 7.9 | 88.5% | +11.4 |
| 8 | 98.5% | 100.0% | 27.3% | 35 / 35 | - | - | 0 | - | 0.17 / 8.2 | 85.7% | +12.8 |

Mean score share 97.7% ± 3.0, baseline 81.1% ± 4.1, paired diff +16.6 ± 4.7.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kawigi.sbf.FloodMini 1.4 | mid-shield | 97.7% ± 3.0 | 99.6% ± 0.8 | 46.1% ± 19.7 | 279 / 280 | - | - | 0 | - | 0.17 / 100.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| kawigi.sbf.FloodMini 1.4 | 8 | 52 | 12.1% | 62.5% | 14.5% | 10.9% | 867 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kawigi.sbf.FloodMini 1.4 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |

8 of 8 battles trusted.
