# dft.Immortal 1.40 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 83.0% | 97.1% | 65.4% | 34 / 35 | - | - | 14 | - | 1.08 / 36.8 | 70.5% | +12.5 |
| 2 | 82.3% | 97.1% | 64.1% | 34 / 35 | - | - | 8 | - | 0.98 / 30.9 | 70.2% | +12.1 |
| 3 | 88.3% | 100.0% | 72.2% | 35 / 35 | - | - | 9 | - | 0.94 / 34.7 | 76.1% | +12.2 |
| 4 | 82.6% | 97.1% | 64.8% | 34 / 35 | - | - | 13 | - | 1.05 / 38.9 | 76.2% | +6.4 |
| 5 | 82.5% | 97.1% | 64.7% | 34 / 35 | - | - | 8 | - | 1.06 / 35.0 | 74.8% | +7.8 |
| 6 | 81.2% | 97.1% | 61.1% | 34 / 35 | - | - | 8 | - | 0.97 / 38.4 | 72.3% | +8.8 |
| 7 | 81.5% | 97.1% | 62.9% | 34 / 35 | - | - | 13 | - | 1.06 / 38.0 | 70.8% | +10.7 |
| 8 | 82.4% | 97.1% | 64.5% | 34 / 35 | - | - | 15 | - | 1.07 / 37.1 | 70.1% | +12.3 |

Mean score share 83.0% ± 1.9, baseline 72.6% ± 2.2, paired diff +10.4 ± 2.0.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 88 over 8 battles (11.0 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dft.Immortal 1.40 | mid | 83.0% ± 1.9 | 97.5% ± 0.8 | 65.0% ± 2.7 | 273 / 280 | - | - | 88 | - | 1.08 / 38.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| dft.Immortal 1.40 | 8 | 723 | 6.1% | 91.3% | 0.1% | 2.6% | 797 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dft.Immortal 1.40 | 8 | 8 | n/a | 0 | 0.31 | 0 | 0 | 0 |

8 of 8 battles trusted.
