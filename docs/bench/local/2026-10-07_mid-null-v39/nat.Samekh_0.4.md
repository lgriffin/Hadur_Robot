# nat.Samekh 0.4 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 77.0% | 91.4% | 59.0% | 32 / 35 | - | - | 10 | - | 1.00 / 51.8 | 69.2% | +7.8 |
| 2 | 81.5% | 97.1% | 61.5% | 34 / 35 | - | - | 12 | - | 0.97 / 46.2 | 62.2% | +19.3 |
| 3 | 79.5% | 97.1% | 56.2% | 34 / 35 | - | - | 6 | - | 0.96 / 50.2 | 72.7% | +6.7 |
| 4 | 76.8% | 97.1% | 53.3% | 34 / 35 | - | - | 11 | - | 1.00 / 47.8 | 68.5% | +8.4 |
| 5 | 82.6% | 97.1% | 64.1% | 34 / 35 | - | - | 4 | - | 0.98 / 51.2 | 69.9% | +12.7 |
| 6 | 76.3% | 97.1% | 51.3% | 34 / 35 | - | - | 15 | - | 1.03 / 55.0 | 65.2% | +11.1 |
| 7 | 80.4% | 97.1% | 59.9% | 34 / 35 | - | - | 7 | - | 0.99 / 54.6 | 51.2% | +29.2 |
| 8 | 72.6% | 85.7% | 57.3% | 30 / 35 | - | - | 19 | - | 0.99 / 46.4 | 61.3% | +11.3 |

Mean score share 78.3% ± 2.7, baseline 65.0% ± 5.7, paired diff +13.3 ± 6.3.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 84 over 8 battles (10.5 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| nat.Samekh 0.4 | mid | 78.3% ± 2.7 | 95.0% ± 3.6 | 57.8% ± 3.5 | 266 / 280 | - | - | 84 | - | 1.03 / 55.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| nat.Samekh 0.4 | 8 | 911 | 9.6% | 86.5% | 0.0% | 3.9% | 856 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| nat.Samekh 0.4 | 8 | 8 | n/a | 0 | 0.30 | 0 | 0 | 0 |

8 of 8 battles trusted.
