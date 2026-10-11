# lj.Dapps 0.2 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 88.9% | 100.0% | 76.2% | 35 / 35 | - | - | 15 | - | 0.92 / 33.4 | 83.5% | +5.4 |
| 2 | 89.7% | 97.1% | 80.9% | 34 / 35 | - | - | 12 | - | 0.94 / 33.8 | 80.6% | +9.1 |
| 3 | 85.3% | 97.1% | 73.8% | 34 / 35 | - | - | 10 | - | 0.95 / 33.1 | 75.6% | +9.7 |
| 4 | 89.7% | 100.0% | 78.9% | 35 / 35 | - | - | 25 | - | 0.99 / 30.3 | 79.7% | +10.0 |
| 5 | 82.9% | 94.3% | 71.1% | 33 / 35 | - | - | 32 | - | 1.03 / 32.7 | 83.4% | -0.5 |
| 6 | 85.3% | 97.1% | 73.2% | 34 / 35 | - | - | 23 | - | 0.96 / 29.0 | 80.7% | +4.7 |
| 7 | 88.0% | 100.0% | 75.9% | 35 / 35 | - | - | 14 | - | 0.99 / 28.0 | 81.8% | +6.2 |
| 8 | 86.1% | 97.1% | 74.1% | 34 / 35 | - | - | 23 | - | 1.02 / 26.3 | 79.1% | +6.9 |

Mean score share 87.0% ± 2.1, baseline 80.6% ± 2.1, paired diff +6.4 ± 2.9.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 154 over 8 battles (19.3 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| lj.Dapps 0.2 | mid | 87.0% ± 2.1 | 97.9% ± 1.7 | 75.5% ± 2.7 | 274 / 280 | - | - | 154 | - | 1.03 / 33.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| lj.Dapps 0.2 | 8 | 622 | 6.0% | 91.4% | 0.0% | 2.5% | 734 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| lj.Dapps 0.2 | 8 | 8 | n/a | 0 | 0.55 | 0 | 0 | 0 |

8 of 8 battles trusted.
