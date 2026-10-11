# dz.Caedo 1.4 (mid-shield) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 95.6% | 100.0% | 12.6% | 35 / 35 | - | - | 0 | - | 0.21 / 8.2 | 92.2% | +3.5 |
| 2 | 96.9% | 100.0% | 1.5% | 35 / 35 | - | - | 0 | - | 0.20 / 7.5 | 84.6% | +12.3 |
| 3 | 97.7% | 100.0% | 15.5% | 35 / 35 | - | - | 0 | - | 0.20 / 7.9 | 87.0% | +10.7 |
| 4 | 96.6% | 100.0% | 5.2% | 35 / 35 | - | - | 0 | - | 0.21 / 8.4 | 87.8% | +8.9 |
| 5 | 96.9% | 100.0% | 15.0% | 35 / 35 | - | - | 0 | - | 0.18 / 7.3 | 83.1% | +13.7 |
| 6 | 98.4% | 100.0% | 25.5% | 35 / 35 | - | - | 0 | - | 0.23 / 9.6 | 82.0% | +16.4 |
| 7 | 95.5% | 97.1% | 28.6% | 34 / 35 | - | - | 0 | - | 0.20 / 9.0 | 83.8% | +11.7 |
| 8 | 96.5% | 100.0% | 18.8% | 35 / 35 | - | - | 0 | - | 0.28 / 9.2 | 81.6% | +14.9 |

Mean score share 96.8% ± 0.8, baseline 85.3% ± 3.0, paired diff +11.5 ± 3.4.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dz.Caedo 1.4 | mid-shield | 96.8% ± 0.8 | 99.6% ± 0.8 | 15.3% ± 7.7 | 279 / 280 | - | - | 0 | - | 0.28 / 9.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| dz.Caedo 1.4 | 8 | 70 | 8.9% | 88.3% | 0.2% | 2.7% | 939 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dz.Caedo 1.4 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |

8 of 8 battles trusted.
