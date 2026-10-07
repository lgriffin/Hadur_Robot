# dz.GalbaMini 0.121 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 81.0% | 97.1% | 63.7% | 34 / 35 | - | - | 17 | - | 0.97 / 35.6 | 68.1% | +12.9 |
| 2 | 76.8% | 91.4% | 61.3% | 32 / 35 | - | - | 28 | - | 1.00 / 30.2 | 67.8% | +8.9 |
| 3 | 82.5% | 97.1% | 66.8% | 34 / 35 | - | - | 17 | - | 0.97 / 26.7 | 73.4% | +9.1 |
| 4 | 73.7% | 88.6% | 59.3% | 31 / 35 | - | - | 58 | - | 1.12 / 27.1 | 79.3% | -5.6 |
| 5 | 81.7% | 97.1% | 64.1% | 34 / 35 | - | - | 20 | - | 0.97 / 32.8 | 67.6% | +14.0 |
| 6 | 79.6% | 91.4% | 67.0% | 32 / 35 | - | - | 11 | - | 0.96 / 33.8 | 78.4% | +1.1 |
| 7 | 82.3% | 97.1% | 66.1% | 34 / 35 | - | - | 28 | - | 1.03 / 31.6 | 65.9% | +16.4 |
| 8 | 79.9% | 94.3% | 63.1% | 33 / 35 | - | - | 27 | - | 0.97 / 34.3 | 66.0% | +13.9 |

Mean score share 79.7% ± 2.5, baseline 70.8% ± 4.6, paired diff +8.9 ± 6.3.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 206 over 8 battles (25.8 per battle, most in one battle 58). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dz.GalbaMini 0.121 | mid | 79.7% ± 2.5 | 94.3% ± 2.9 | 63.9% ± 2.3 | 264 / 280 | - | - | 206 | - | 1.12 / 35.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| dz.GalbaMini 0.121 | 8 | 935 | 10.7% | 85.1% | 0.0% | 4.2% | 742 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dz.GalbaMini 0.121 | 8 | 8 | n/a | 0 | 0.74 | 0 | 0 | 0 |

8 of 8 battles trusted.
