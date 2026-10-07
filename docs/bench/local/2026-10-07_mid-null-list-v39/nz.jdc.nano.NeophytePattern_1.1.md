# nz.jdc.nano.NeophytePattern 1.1 (mid-shield) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 99.1% | 100.0% | 57.4% | 35 / 35 | - | - | 0 | - | 0.15 / 7.7 | 84.6% | +14.5 |
| 2 | 97.7% | 100.0% | 55.2% | 35 / 35 | - | - | 0 | - | 0.16 / 9.2 | 79.0% | +18.6 |
| 3 | 98.1% | 100.0% | 39.1% | 35 / 35 | - | - | 0 | - | 0.13 / 7.4 | 83.4% | +14.6 |
| 4 | 97.6% | 100.0% | 37.3% | 35 / 35 | - | - | 0 | - | 0.17 / 10.1 | 86.7% | +11.0 |
| 5 | 98.4% | 100.0% | 52.6% | 35 / 35 | - | - | 0 | - | 0.16 / 7.2 | 83.7% | +14.6 |
| 6 | 99.1% | 100.0% | 57.4% | 35 / 35 | - | - | 0 | - | 0.16 / 7.1 | 82.7% | +16.4 |
| 7 | 97.4% | 100.0% | 31.8% | 35 / 35 | - | - | 0 | - | 0.16 / 8.4 | 80.9% | +16.4 |
| 8 | 98.5% | 100.0% | 45.8% | 35 / 35 | - | - | 0 | - | 0.16 / 7.8 | 83.4% | +15.1 |

Mean score share 98.2% ± 0.5, baseline 83.1% ± 1.9, paired diff +15.2 ± 1.8.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| nz.jdc.nano.NeophytePattern 1.1 | mid-shield | 98.2% ± 0.5 | 100.0% ± 0.0 | 47.1% ± 8.4 | 280 / 280 | - | - | 0 | - | 0.17 / 10.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| nz.jdc.nano.NeophytePattern 1.1 | 8 | 39 | 0.0% | 100.0% | 0.0% | 0.0% | 847 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| nz.jdc.nano.NeophytePattern 1.1 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |

8 of 8 battles trusted.
