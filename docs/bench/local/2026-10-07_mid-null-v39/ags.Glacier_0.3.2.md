# ags.Glacier 0.3.2 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 81.0% | 94.3% | 66.2% | 33 / 35 | - | - | 19 | - | 1.34 / 32.8 | 62.0% | +18.9 |
| 2 | 72.7% | 88.6% | 57.2% | 31 / 35 | - | - | 51 | - | 1.39 / 35.3 | 61.6% | +11.1 |
| 3 | 78.0% | 94.3% | 62.0% | 33 / 35 | - | - | 42 | - | 1.40 / 26.4 | 66.3% | +11.7 |
| 4 | 81.0% | 94.3% | 65.9% | 33 / 35 | - | - | 7 | - | 1.24 / 33.8 | 61.8% | +19.2 |
| 5 | 78.9% | 91.4% | 64.9% | 32 / 35 | - | - | 23 | - | 1.37 / 32.1 | 65.6% | +13.3 |
| 6 | 76.6% | 91.4% | 61.3% | 32 / 35 | - | - | 26 | - | 1.34 / 34.1 | 61.5% | +15.1 |
| 7 | 74.7% | 85.7% | 63.5% | 30 / 35 | - | - | 19 | - | 1.37 / 29.1 | 61.9% | +12.9 |
| 8 | 78.5% | 97.1% | 58.6% | 34 / 35 | - | - | 36 | - | 1.39 / 33.7 | 64.9% | +13.6 |

Mean score share 77.7% ± 2.4, baseline 63.2% ± 1.7, paired diff +14.5 ± 2.6.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 223 over 8 battles (27.9 per battle, most in one battle 51). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | mid | 77.7% ± 2.4 | 92.1% ± 3.1 | 62.5% ± 2.8 | 258 / 280 | - | - | 223 | - | 1.40 / 35.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 8 | 1041 | 13.2% | 81.4% | 0.0% | 5.3% | 874 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 8 | 8 | n/a | 0 | 0.80 | 0 | 0 | 0 |

8 of 8 battles trusted.
