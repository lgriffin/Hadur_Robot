# trab.Crusader 0.1.7 (mid-shield) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 85.1% | 97.0% | 64.1% | 34 / 35 | - | - | 9 | - | 1.20 / 24.6 | 75.3% | +9.9 |
| 2 | 79.1% | 94.3% | 53.1% | 33 / 35 | - | - | 13 | - | 1.15 / 29.0 | 63.1% | +16.0 |
| 3 | 77.6% | 91.2% | 57.2% | 32 / 35 | - | - | 17 | - | 1.13 / 31.7 | 74.8% | +2.8 |
| 4 | 80.3% | 88.6% | 66.8% | 31 / 35 | - | - | 10 | - | 1.10 / 29.5 | 67.3% | +12.9 |
| 5 | 79.9% | 94.1% | 56.7% | 33 / 35 | - | - | 11 | - | 1.20 / 27.1 | 66.1% | +13.9 |
| 6 | 77.0% | 91.4% | 52.7% | 32 / 35 | - | - | 5 | - | 0.96 / 26.7 | 72.6% | +4.4 |
| 7 | 81.5% | 94.3% | 61.2% | 33 / 35 | - | - | 11 | - | 1.10 / 22.7 | 59.1% | +22.4 |
| 8 | 78.4% | 88.6% | 62.1% | 31 / 35 | - | - | 12 | - | 0.87 / 22.8 | 72.5% | +5.9 |

Mean score share 79.9% ± 2.2, baseline 68.8% ± 4.9, paired diff +11.0 ± 5.5.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 88 over 8 battles (11.0 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| trab.Crusader 0.1.7 | mid-shield | 79.9% ± 2.2 | 92.4% ± 2.5 | 59.2% ± 4.3 | 259 / 280 | - | - | 88 | - | 1.20 / 31.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| trab.Crusader 0.1.7 | 8 | 721 | 18.2% | 74.7% | 0.0% | 7.0% | 1035 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| trab.Crusader 0.1.7 | 8 | 8 | n/a | 0 | 0.31 | 0 | 0 | 0 |

8 of 8 battles trusted.
